package questao7;

import java.util.Scanner;

public class Questao7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        float preco;
        float litro;
        float km;
        float volume;
        System.out.println("Digite quanto km você percorreu: ");
        km = s.nextFloat();
        System.out.println("Digite o volume de combutível gasto (litro): ");
        volume = s.nextFloat();
        System.out.println("Digite o preço do combutível por litro: ");
        litro = s.nextFloat();
        preco = (volume*litro)/km;
        System.out.println("O preço medio do quilometro rodado(R$/km): " + preco);
        
    }
    
}
