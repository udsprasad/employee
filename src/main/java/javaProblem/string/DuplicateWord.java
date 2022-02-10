package javaProblem.string;

public class DuplicateWord {
    public static void main(String[] args){
        String string = "Big black bug bit a big black dog on his big black nose";
        string = string.toLowerCase();
        String[] array = string.split(" ");
        for(int i=0;i< array.length;i++){
            for(int j=i+1;j< array.length;j++){
                if(array[i].equals(array[j]) && !array[j].equals("0")){
                    System.out.println(array[i]);
                    //Set words[j] to 0 to avoid printing visited word
                    array[j] = "0";
                    break;
                }
            }
        }
    }
}
