public class Pallindrome_number {

    public static boolean ispallindrome(int num){
        int actual_num=num;
        int reversed_num=0;
        while(num>0) {
            int digit = num % 10;
            reversed_num = (reversed_num * 10) + digit;
            num = num / 10;
        }
        return actual_num==reversed_num;
    }

    public static void main(String[] args){
        System.out.println(ispallindrome(12121));
    }
}
