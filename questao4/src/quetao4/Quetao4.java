package quetao4;

import java.util.Scanner;

public class Quetao4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        float num;
        float num1;
        float num2;
        System.out.println("Digite um numero: ");
        num = s.nextFloat();
        num1 = num - 1;
        System.out.println("Este é o antercessor do seu numero: " + num1);
        num2 = num + 1;
        System.out.println("Este é o sucessor so seu numero: " + num2);
    }
    
}
