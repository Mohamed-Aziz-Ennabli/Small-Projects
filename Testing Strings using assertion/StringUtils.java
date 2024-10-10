import java.util.Arrays;

final class StringUtils {
    public static boolean isPalindrome(String text){
        String pal = ""; 
        for(int i = text.length() ; i>0 ; --i){
            pal += text.charAt(i);
        }
        if( pal.equals(text)){
            return true;
        }else {
            return false; 
        }
    }
    public static void sort(char[] text){
        for(int i = 0 ; i< text.length-1 ;++i){
            for(int j = 0 ; j<i ; j++){
                if(text[j]>text[j+1]){
                    char temp = text[j];
                    text[j]= text[j+1]; 
                    text[j+1] = temp;
                }
            }
        }

    }
    // Methode zum Überprüfung 
    public static boolean check(String str){
        if(str == null){
            return false ; 
        }
        for(int i = 0 ; i < str.length() ; i++){
            int asciistr = str.charAt(i);
            if(str.charAt(i) == (' ')  || ( asciistr<=  90 && asciistr >= 65)){
                return false; 
            }
        }
        return true ;
    }
    public static boolean areAnagrams(String str1 , String str2){
        if( check(str2) == false || check(str1)== false){
            return false; 
        }
        
        // die Längen muss gleich ; 
        if(str1.length() != str2.length()){
            return false ; 
        }
        // Wandeln der Strings in CharArray Um 
        char[] char1 = new char[str1.length()];
        char[] char2 = new char[str1.length()];
        for(int i=0 ; i<str1.length(); i++){
            char1[i] = str1.charAt(i); 
            char2[i] = str2.charAt(i); 
        }
        sort(char2);
        sort(char1);
        return Arrays.equals(char1,char2); 

    }
    public static boolean hasPrefix(String text, String prefix){
        if(text.length()< prefix.length()){
            return false ; 
        }
        boolean check = true; 
        for(int i = 0 ; i < prefix.length() ; ++i){
            if(prefix.charAt(i) != text.charAt(i))
            {
                check = false ;  
            }

        }
        return check;
    }
    public static boolean hasSuffix(String text, String suffix){
        if(text.length()< suffix.length()){
            return false ; 
        }
        boolean check = true; 
        for(int i = suffix.length()-1 ; i > 0 ; --i){
            if(prefix.charAt(i) != text.charAt(i))
            {
                check = false ;  
            }

        }
        return check;
    }
}