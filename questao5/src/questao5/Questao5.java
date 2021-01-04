package questao5;

import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        float c;
        float f;
        float m = (float) 1.8;
        float r;
        System.out.println("Digite a temperatura em graus centígrados: ");
        c = s.nextFloat();
        f = m * c;
        r = f +32;
        System.out.println("Aqui está sua temperatura em Fahrenheit: " +r);
        
    }
    
}
