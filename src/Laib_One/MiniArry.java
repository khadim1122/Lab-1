package Laib_One;
import java.util.Scanner;

public class MiniArry {

    public int[] a;

    public MiniArry(int a) {

        this.a = new int[a];

    }
    public int Max(){
    
    int mx=a[0];
    for (int i=1; i<a.length; i++)
    if(mx<a[i])
        mx=a[i];
    return mx;
    }

    public static void main(String[] args) {
      /*
        Scanner.scan=new Scanner();
      int[] ar;
      ar=new int[10];
              for (int c = 0;  c < ar.length; c++) {
              
              
              }
*/
        MiniArry x = new MiniArry(25);
        for (int c = 0;  c < x.a.length; c++) {
            x.a[c] = c;
            System.out.println(x.a[c]);
            
            System.out.println(x.Max());
        }

    }

}
