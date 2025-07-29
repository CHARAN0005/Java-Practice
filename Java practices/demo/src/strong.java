public class strong {
    public static void main(String[] args) {
        int n=145;
        checkstrong(n);
    }
    static void checkstrong(int n)
    {
        int t=n;
        int s=0;
        while(t!=0) {
            int k = t % 10;
            s = s + fact(k);
            System.out.println(fact(k));
            t /= 10;
        }
        if(n==s)
        {
            System.out.println("Strong number");
        }
        else{
            System.out.println("Not Strong number");
        }

    }
    static int fact(int n)
    {
//        int f=1;
//        for(int i=1;i<=l;i++)
//        {
//            f=f*i;
//        }

        if(n==1 || n==0) return 1;
        else fact(n)*fact(n-1);



        return f;
    }

}

