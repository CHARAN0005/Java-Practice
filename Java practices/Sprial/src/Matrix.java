public class Matrix {
    public static void main(String[] args) {

        int a[][]={{1,2,3},{4,5,6},{7,8,9}};
        int n=3,m=3;
        int cs=0,ce=n;
        int rs=0,re=m;
        for(int i=0;i<ce;i++)
        {
            System.out.print("->"+a[cs][i]);
        }
        rs++;
        for(int j=rs;j<re;j++)
        {
            System.out.print("->"+a[j][ce-1]);

        }
        for(int h=ce-2;h>-1;h--)
        {
            System.out.print("->"+a[re-1][h]);
        }
        re=re-2;
        for(int i=0;i<ce-1;i++)
        {
            System.out.print("->"+a[rs][i]);
        }


    }
}
