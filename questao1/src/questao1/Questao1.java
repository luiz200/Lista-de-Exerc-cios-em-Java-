package questao1;

import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        float Vf;
        int n;
        float i;
        float Vi;
        float  r;
        
        System.out.println("Digite o valor inicial: ");
        Vi = s.nextFloat();
        System.out.println("Digite o periodo em meses que você deseja que ocorra o juros: ");
        n = s.nextInt();
        System.out.println("Digite a taxa de juros: ");
        i = s.nextFloat();
        r = ((Vi*i)/100);
        Vf = (float) (((1 + r)*n) * Vi);
        System.out.println("Este sera o seu valor final: " + Vf);
        
        
    }
    
}
