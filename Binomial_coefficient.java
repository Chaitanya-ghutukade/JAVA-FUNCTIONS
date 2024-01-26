public class Binomial_coefficient {
    public static int factorial(int num){
        int fact=1;
        for(int i=1;i<=num;i++){
            fact=fact*i;
        }
        return fact;
    }

    public static int binomial_coeff(int n, int r){
        int n_fact=factorial(n);
        int r_fact=factorial(r);
        int nr_fact=factorial(n-r);

        int Bin_coeff= n_fact /(r_fact * nr_fact);
        return Bin_coeff;
    }

    public static void main(String[] args){
        System.out.println(binomial_coeff(5,2));
    }
}
