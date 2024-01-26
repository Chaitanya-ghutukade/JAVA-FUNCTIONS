public class Bintodec {

    public static int Binary_to_decimal(int bin_num){
        int pow=0;
        int dec=0;
        while(bin_num>0) {
            int lastdigit = bin_num % 10;
            dec = dec + (lastdigit * (int) Math.pow(2, pow));
            pow++;
            bin_num = bin_num / 10;

        }
        return dec;
    }

    public static void main(String[] args){
       System.out.println( Binary_to_decimal(1000));
    }


}
