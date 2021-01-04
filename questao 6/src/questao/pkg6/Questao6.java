package questao.pkg6;

import java.util.Scanner;

public class Questao6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a;
        int b;
        int m = 0;
        int n = 0;
        System.out.println("Digite o valor de A: ");
        a = s.nextInt();
        System.out.println("Digite o valor de B: ");
        b = s.nextInt ();
        m = a = b;
        n = b = a;
        System.out.println("Este é o valor de A com valor de B: " + m);
        System.out.println("Este é o valor de B com valor de A: " + n);
    }
    
}
