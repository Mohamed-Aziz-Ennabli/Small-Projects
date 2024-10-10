import matrix.Matrix;
class main {
    public static void main(String[] args) {
        int[][] A = {   {1,2},
                        {3,4},
                        {5,6}
                    }; 
        int[][] B = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int[][] C = {{1,2,3,4},{5,6,7,8}}; 
        int[][] A_trans = Matrix.transpose(A);
        Matrix.print(A_trans);
        System.out.println();
        int[][] abmult = Matrix.mult(A, B);
        Matrix.print(abmult);
        System.out.println();
        int[][] bbadd= Matrix.add(B, B);
        Matrix.print(bbadd);
        System.out.println();
        int[][] acmult= Matrix.mult(A, C);
        Matrix.print(acmult);

    }
}