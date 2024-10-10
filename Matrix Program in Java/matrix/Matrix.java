package matrix;

public class Matrix {
    public static int[][] transpose(int[][] matrix){
        //Hier ist die transpose-Methode implementiert 
        int[][] transarray = new int[matrix[0].length][matrix.length]; 
        for(int i=0 ; i< matrix.length ; i++){
            for(int j =0 ; j < matrix[0].length; j++ ){
                transarray[j][i]= matrix[i][j] ; 
            }
        }
        return transarray;
    }
    public static int[][] add(int[][] A, int[][] B){

        int[][] leer = new int[0][0];
        int[][] addarray = new int[A.length][B[0].length];
        if(A.length == B.length && A[0].length == B[0].length){
          for(int i=0 ; i< A.length ; i++){
            for(int j =0 ; j < B[0].length; j++ ){
                addarray[i][j]= A[i][j] + B[i][j] ; 
            }
          }
          return addarray;  
        }
        else{
            System.out.println("DiE Dimension passt nicht zusammen.");
            return leer;
        } 
        
    }
    public static int[][] mult(int[][] A, int[][] B){
        int[][] leer = new int[0][0];
        int[][] multarray = new int[A.length][B[0].length];
        if(A[0].length == B.length){
          for(int i=0 ; i< A.length ; i++){
            for(int j =0 ; j < B[0].length; j++ ){
                for(int k = 0; k < A[0].length; k++){
                    multarray[i][j] += A[i][k] * B[k][j] ; 
                }
            }
          }  
          return multarray;
        } else{
            System.out.println("DiE Dimension passt nicht zusammen.");
            return leer ;
    }
    }
    
    public static void print(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}