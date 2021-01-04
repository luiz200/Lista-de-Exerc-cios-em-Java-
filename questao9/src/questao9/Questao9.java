package questao9;

import java.util.Scanner;

public class Questao9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        float peso;
        float altura;
        float r;
        float imc;
        System.out.println("Digite o seu peso: ");
        peso = s.nextFloat();
        r = peso*peso;
        System.out.println("Digite a sua altura: ");
        altura = s.nextFloat();
        imc = r/altura;
        if( imc < 18.5){
            System.out.println("Você está abaixo do peso!");
        }
        else if(imc >= 18.5 || imc <= 30){
            System.out.println("Você está no peso ideal!");
        }
        else if(imc > 30){
            System.out.println("Você está acima do peso");
        }
    }
    
}
