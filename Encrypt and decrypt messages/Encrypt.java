public class Encrypt{
    public static int nextInt(int a,int b,int m,int x ){ // Zufall generator
        return (a*x+b)% m;
    }
    public static void printCharArray(char[] letters){
        String s="";
        for(int i=0;i<letters.length;i++){
            s+=letters[i];

        }
    System.out.println(s);
    }
    
    
    public static int[]encrypt(char[] letters,int[]keys){
        int[] enc= new int[letters.length];
        for(int i=0;i<letters.length;i++){
            
            if(i==0){
            enc[i]=((int) letters[i])^keys[i];    // encrypt mit dem ersten zahl
            }else{
                enc[i]=((int) letters[i])^keys[i]^enc[i-1]; // encrypt mit den anderen zahlen

            }

        
        }
    return enc ;   
    }
    public static char[]decrypt(int[] letters,int[]keys){
        char[] dec= new char[letters.length];
        for(int i=0;i<letters.length;i++){
            if(i==0){
                dec[i]=(char) (letters[i]^keys[i]);  // decrypt mit den ersten zahl
            }else{
                dec[i]= (char)(letters[i]^keys[i]^letters[i-1]);  // decrypt mit den anderen zahlen 

            }
        }
    return dec;
    }
    public static void main(String args[]){
        int x=3;
        int a=7;
        int m=256;
        int b=28;
        char[] letters={'H','A','L','L','O'};
        int[] keys=new int[letters.length];
        keys[0]=x;
        for(int i=1;i<letters.length;i++){
            keys[i]=nextInt(a, b, m, keys[i-1]);// liste mit zufall gewählte Zahlen 

        }
        int[] lettersenc= new int[letters.length];
        lettersenc=encrypt(letters, keys); //Verschlüsselung 
        /*for(int i=0;i<letters.length;i++){
            System.out.println(lettersenc[i]);
        }*/
        letters=decrypt(lettersenc, keys);// Entschlüsselung
        printCharArray(letters);

    }

}