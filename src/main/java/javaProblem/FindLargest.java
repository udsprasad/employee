package javaProblem;

public class FindLargest {
    //Find Largest of Three Numbers
    //smallest number
    public static void main(String[] a){
        int i=1,j=55,k=20;
        System.out.println((i>j)?((i>k)?i:k):((j>k)?j:k));
        //smallest number
        System.out.println((i<j)?((i<k)?i:k):((j<k)?j:k));
    }
}
