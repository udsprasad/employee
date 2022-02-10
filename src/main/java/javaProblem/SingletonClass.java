package javaProblem;

public class SingletonClass {
    //Static member: It gets memory only once because of static, it contains the instance of the Singleton class.
    //Private constructor: It will prevent to instantiate the Singleton class from outside the class.
    //Static factory method: This provides the global point of access to the Singleton object and returns the instance to the caller.

    static SingletonClass singletonClass= null;

    private SingletonClass(){

    }

    static SingletonClass getInstance(){
        if(singletonClass==null){
            return new SingletonClass();
        }
        return singletonClass;
    }

}
