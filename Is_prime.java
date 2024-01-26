
public class Is_prime {
    //only for number > 2
    public static  boolean check_prime(int n){
        if(n == 2)
            return true;
        for(int i=2;i<Math.sqrt(n);i++)   /* 12 = 1*12, 2*6, 3*4 = 4*3 ,6*2, 12*1
                                           all operations are repeated to avoid this we use sqrt(n)
                                                instead of using direct n   */
        {

            if(n % 2 == 0){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args){
        System.out.println(check_prime(13));
    }
}
