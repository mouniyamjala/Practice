package Demo;
import java.util.*;

public class ArrayDemo {
    public static void main(String args[])
    {
        int[][] a={{1,2,3},{2,3,4}};
        int[][] b={{2,3,4},{1,2,3},{1,1,1}};

        int[][] c= new int[2][3];
        System.out.println(a.length);
        System.out.println(a[0].length);
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<b[0].length;j++)
            {
                c[i][j]=0;
                for(int k=0;k<a[0].length;k++)
                {
                    c[i][j] +=a[i][k]*b[k][j];
                }
            }
        }

        System.out.println("HI");


        //printing matrice
        for(int i =0;i<c.length;i++)
        {
            for(int j=0;j<c[0].length;j++)
            {
                System.out.print(" "+c[i][j]+" ");
            }
            System.out.println();

        }
    }

}
