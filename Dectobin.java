public class Dectobin {

    public static int Decimal_to_binary(int num){
        int pow=0;
        int binary_num=0;

        while(num >0){
            int reminder= num % 2;
            binary_num=binary_num +(reminder * (int)Math.pow(10,pow));
            pow++;
            num= num /2;
        }
        return binary_num;
    }

    public static void main(String[] args){

        System.out.println(Decimal_to_binary(8));
    }
}
