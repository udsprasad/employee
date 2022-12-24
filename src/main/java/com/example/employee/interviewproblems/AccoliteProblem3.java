package com.example.employee.interviewproblems;

// 6  3  1
// 9  7  8
// 11 10  9
// 14 13 12
// question find the min in the row and same min number should be max in that column.
// print such elements
public class AccoliteProblem3 {
    public static void main(String[] args){
        int[][] a ={{4,2,3,1},{5,6,7,8},{9,10,11,12},{16,14,15,13}};

        for(int i=0;i<a.length;i++){
            int min =a[i][0];
            for(int j=0;j<a[0].length;j++){
                if(min>a[i][j]){
                    min=a[i][j];
                }
            }
            int max = min;
            if(i<a.length-1) {
                for (int j = 0; j < a.length; j++) {
                    if (max < a[j][i]) {
                        max = a[j][i];

                    }
                }
            }
            if(min==max){
                System.out.println(min);
                break;
            }
        }
    }
}
