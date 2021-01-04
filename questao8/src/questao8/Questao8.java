package questao8;

import java.util.Scanner;

public class Questao8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int lado1;
        int lado2;
        int lado3;
        int soma1;
        int soma2;
        int soma3;
        int p;
        System.out.println("Digite o lado1: ");
        lado1 = s.nextInt();
        System.out.println("Digite o lado2: ");
        lado2 = s.nextInt();
        System.out.println("Digite o lado3: ");
        lado3 = s.nextInt();
        soma1 = lado2+lado3;
        soma2 = lado1+lado3;
        soma3 = lado1+lado2;
        if(lado1<soma1 || lado2<soma2 || lado3<soma3){
            System.out.println("Você tem um isóceles");
        }
        else if(lado1 == lado2  ){
            if(lado2 == lado3){
            System.out.println("Você tem um equilatero");
            }
        }
        else if(lado1 != lado2){
            if(lado2 != lado3){
                System.out.println("Você tem um escaleno");
            }
            
        }
    }
    
}
