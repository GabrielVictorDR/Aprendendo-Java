package fundamentos;

import java.util.Scanner;

public class DesafioModulo {
    public static void main(String[] args) {
        

        Scanner insert = new Scanner(System.in);
        
        System.out.println("Digite o Primeiro Valor: ");
        Double num1 = insert.nextDouble();

        System.out.println("Digite o Segundo Valor: ");
        Double num2 = insert.nextDouble();

        System.out.println("Escolha um operador: = - / *");
        String operador = insert.next();

        ////Lógica

        //double resultado = "+".equals(operador) ? num1 + nu//m2 : 0;

        System.out.printf("%.1f %s %.1f = ?", num1, operador, num2);
        insert.close();

    }
}
