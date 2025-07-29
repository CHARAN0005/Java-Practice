public class Array {
    public static void main(String[] args) {

        int a[]={13,46,24,52,20,9};
        int n=a.length;
//        int mi=a[0];

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(a[j]>a[i])
                {
                    int t=a[j];
                    a[j]=a[i];
                    a[i]=t;
                }

            }

        }
        for(int num:a)
        {
            System.out.print(num+" ");
        }





    }


}
