package com.company;

public class Main {

    public static void main(String[] args) {
	System.out.print(12+20);
        int x=10;
        x=15;
        int y=20;
        x=12;
        System.out.print(x+y);
        System.out.println();
        //int c=32-x;
      //  c=2*y;
        //double d=25.5;
       // d=15.5+d;
       // System.out.print(d=15.5+d);
       // String f="Hello";
       // f="x+d*y";
      //  f="Hello"+" Class";
        //System.out.print("Hello"+" Class");
        int a=256+3180;
        System.out.print("Sum of 256 and 3180:"+" "+a);
        System.out.println();
        double e=180.0/31.0;
        System.out.print("180/31 is"+" "+e);
        System.out.println();
        double f=10.0;
        int g=20;
        double j;
        j=f/g;
        System.out.print("f/g is"+" "+j);
        System.out.println();
        String h="Some \nstring";
        System.out.print(h);
        System.out.println();
        String i="Adidas"+
                "Nike"+"Cool";
        System.out.print(i);
        System.out.println();
        boolean t=true;
        boolean b=false;
        t=5==5;
        t=0==10;
        b=5>10;
        b=10<=10;
        b=10!=12;
        b=!true;
        System.out.print(t);
        System.out.println();
        System.out.print(b);
        System.out.println();
        t="abc"=="abc";
        b=true==false;
        System.out.print(t);
        System.out.println();
        System.out.print(b);
        System.out.println();
        //"abc".equals()
        int[] h1={10,0,0,21,-5,38};
        System.out.print(h1);
        System.out.println();
        int i2= h1[4];
        int l=6; l=l++;
        System.out.print(i2);
        System.out.println();
        int e1=h1[0];
        int e2=h1[1];
        int e3=h1[2];
        int e4=h1[3];
        int e5=h1[4];
        int e6=h1[5];
        System.out.println(""+e1+""+e2+""+e3+""+e4+""+e5+""+e6);
        System.out.println();
        System.out.println(args[0]);
        System.out.println();
        String[] s2={"a","b","c"};
        String[] s3={"a","d","c"};
        System.out.println(s2[0]+"-"+s3[0]+","+s2[1]+"-"+s3[1]+","+s2[2]+"-"+s3[2]);
        System.out.println();
        int s=10;
        if (s<15){
            System.out.println("Условие вып");
        }else {System.out.println("Условие noвып");
            System.out.println("End");

    }}
}
