import algorithmen.Algorithmen;

class main{
    
    public static void main(String []args){

        //int n =  Integer.parseInt(args[0]);
        int n = 10 ; 
        int[] arr=new int[n];
        for( int i = 0 ; i<n ; i++ ){
            arr[i] = (int) (Math.random()*10);
        }
        boolean check = Algorithmen.isSorted(arr);
        if ( check == false ){
            Algorithmen.sort(arr);
        }
        int b = Algorithmen.binarySearch(arr, 4);
        if(b != -1 ){
            System.out.println("the Value exist in Array");
        }
        else{
            System.out.println("The Value does not exist ");
        }
    }
}
