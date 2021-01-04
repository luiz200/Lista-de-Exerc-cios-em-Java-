package questao2;

import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x1;
        int x2;
        int y1 = 0;
        int y2 = 0;
        int D;
        System.out.println("Digite o valor de X1: ");
        x1 = s.nextInt();
        System.out.println("Digite o valor de X2: ");
        x2 = s.nextInt();
        /* Encontrar a formula para as raizes */
        D = (int) (Math.sqrt((x2 - x1)*(x2 - x1)) + ((y2 - y1)*(y2 - y1)));
        System.out.println("Este é a distância entre os dois pontos: " + D);
    }
    
}

