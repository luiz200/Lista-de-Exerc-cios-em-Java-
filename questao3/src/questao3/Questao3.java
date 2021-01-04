package questao3;

import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int idade;
        int mes;
        int dia;
        int r;
        int p;
        int idf;
        int l;
        System.out.println("Digite a sua idade: ");
        idade = s.nextInt();
        System.out.println("Digite a quantos meses faz que vc completo ano: ");
        mes = s.nextInt();
        r = (mes*30);
        if(mes>=2){
            l = r-3;
            System.out.println("Digite quantos dias tem: ");
            dia = s.nextInt();
            p = l+dia;
            idf = ((idade*p)+360) + l;
            System.out.println("Esta será sua idade em dias: " + idf);
        }
        else if(mes == 1){
            System.out.println("Digite quantos dias tem: ");
            dia = s.nextInt();
            idf = (idade*r)+360+dia;
            System.out.println("Esta será sua idade em dias: " + idf);
        }        
    }
    
}
