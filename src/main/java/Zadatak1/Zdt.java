
package Zadatak1;

import java.util.*;
import java.lang.*;
import java.io.*;

public class Zdt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);
        int n;
       System.out.println("Unesite n.");
       n = unos.nextInt();
       Figurica f = new Figurica();
       f.radi(n);
    }
    
}
