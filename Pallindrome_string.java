public class Pallindrome_string {

    public static boolean ispallindrome(String str){
        String newstr=str.toLowerCase();
        int str_length=str.length();
        for(int i=0;i<str_length/2;i++){
          if( newstr.charAt(i) == newstr.charAt(str_length-1-i))
              return true;

        }
        return  false;
    }
    public static void main(String[] args){
        System.out.println(ispallindrome("level"));
    }
}
