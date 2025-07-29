public class Sample {
    public static void main(String[] args) {


        int n=5;

        fact1(n);


    }
    static int fact1(int n)
    {

        if(n==1 || n==0) return 1;
        else{
            return fact1(n)*fact1(n-1);
        }

    }

}
