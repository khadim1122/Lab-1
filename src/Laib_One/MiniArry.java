package Laib_One;

import java.util.Scanner;

public class MiniArry {

    public int[] a;

    public MiniArry(int a) {

        this.a = new int[a];

    }
    public int Max(int[] r){
    
    int mx=a[0];
    for (int i=1; i<r.length; i++)
    if(mx<r[i])
        mx=r[i];
    return mx;
    }

    public static void main(String[] args) {
      
        Scanner scan=new Scanner(System.in);
      int[] ar;
      ar=new int[10];
      System.out.println("enter the arry alements");
              for (int c = 0;  c < ar.length; c++) {
              ar[c]=scan.nextInt();
              
              }

        MiniArry x = new MiniArry(2);
        for (int c = 0;  c < x.a.length; c++) {
            x.a[c] = c;
            System.out.println(x.a[c]);
            
        }
        System.out.println(x.Max(ar));

    }

}
