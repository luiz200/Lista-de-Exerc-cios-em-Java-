package questao10;

import java.util.Scanner;

public class Questao10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int ano;
        System.out.println("Digite quantos anos você trabalha como engenheiro: ");
        ano = s.nextInt();
        if(ano <= 4){
            System.out.println("Você é engenheiro junior.");
        }
        else if(ano > 4 && ano <= 6){
            System.out.println("Você é engenheiro pleno.");
        }
        else if(ano > 6 && ano <= 8){
            System.out.println("Você é engenheiro adjunto.");
        }
        else if(ano > 8 && ano <= 10){
            System.out.println("Você é engenheiro sênior");
        }
    }
    
}
