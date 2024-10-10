package algorithmen;

public class Algorithmen{  
    /* 
     * Überprüft, ob ein Array aufsteigend sortiert ist.
     */
    public static boolean isSorted(int[] arr){
        boolean check = true ; 
        for(int i = 0 ; i<arr.length-1; i++ ){
            if(arr[i]> arr[i+1]){
                check = false;
            }
        }
        return check;
    }
    
    
    /* 
     * Diese Funktion sortiert ein gegebenes Array und nutzt Seiteneffekte aus.
     */
    public static void sort(int[] arr){
        for( int i = arr.length-1 ; i>0; i--){
            for(int j = 0 ; i < i-1 ; j++ ){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j]; 
                    arr[j]= arr[j+1];
                    arr[j+1]= temp;
                }
            }
        }
    
    }
    
    
    /* 
     * Diese Funktion überprüft mittels binärer Suche, ob das Array arr den Wert val enthält.
     * Darf nur sortierte Arrays erhalten.
     * Gibt nur zurück, ob val in arr enthalten ist.
     */
    public static int binarySearch(int[] arr, int val){
        int a = 0 ; 
        int b = arr.length-1 ;  
        while (a != b){
             
            int m = (a+b)/2;
            if( val <= arr[m]){
                b= m ; 
            }
            else{
                a = m+1;
            }

        } 
        if (arr[a]== val){
            return b ; 
        }
        else{
            return -1 ; 
        }
    }
}