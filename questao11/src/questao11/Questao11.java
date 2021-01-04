package questao11;

import java.util.Scanner;

public class Questao11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int ano;
        System.out.println("Digite um ano para saber se é bissexto");
        ano = s.nextInt();
        if(ano % 400 == 0){
            System.out.println(ano + "é bissexto. ");
        }
        else if((ano % 4 == 0) && (ano % 100 != 0)){
            System.out.println(ano + "é bissexto. ");
        }
        else{
            System.out.println(ano + "não é bissexto. ");
        }
    }
    
}
