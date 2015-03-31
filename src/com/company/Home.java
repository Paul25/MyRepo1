package com.company;

/**
 * Created by XPS on 31.03.2015.
 */
public class Home {
    public static void main(String[] args) {
        String t = "Hello Class";
        System.out.println(t);
        System.out.println();
        String ts = ", and Student!";
        System.out.println(t + ts);
        System.out.println();
        String[] u = {"a", "b", "Under key one but three", "d", "e", "Under key five",};
        System.out.println(u[5]);
        System.out.println();
        System.out.println(u[3 - 1]);
        System.out.println();
        //int x=8;
        for (int x = 8; x < 11; x++) {
            System.out.println(x);
        }
        String[] s = {"How", "are", "you"};

        for (int i = 0; i < 3; i++) {
            System.out.println(s[i]);
        }
        System.out.println();
        int b=25;
        int[] m = {10, 20, 25, 30};
        int j = 0;
        while (j < 4) {
            if (m[j] == b) {
                break;
            }
            System.out.println(m[j]);
            j++;
            System.out.println();
            int d=10;
            int[] n = {10, 20, 25, 30};
            int k = 0;
            while (k < 4) {
                if (n[k] == d) {
                    k++;
                    continue;
                }
                System.out.println(n[k]);
                k++;








            }


        }


    }
}

