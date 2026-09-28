/**
 * Autor: Jeison SR
 * Programa: Programa de Teste
 * Data: 24/09/2026
 */
class Programa {

    // Método principal do progama
    public static void main(String[] args) {

        // Declaração de variáveis
        int num1;
        int num2;
        int resultado;

        // Atribuindo valores para vaiáveis
        num1 = 10;
        num2 = 3;

        // Processamento
        resultado = num1 + num2;
        System.out.println(
            "A soma de " + num1 
            + " com " + num2 
            + " é " + resultado
        );

        resultado = num1 - num2;
        System.out.println(
            "A subtração de " + num1 
            + " com " + num2 
            + " é " + resultado
        );


        resultado = num1 * num2;
        System.out.println(
            "A multiplicação de " + num1 
            + " com " + num2 
            + " é " + resultado
        );


        resultado = num1 / num2;
        System.out.println(
            "A divisão de " + num1 
            + " com " + num2 
            + " é " + resultado
        );

        resultado = num1 % num2;
        System.out.println(
            "O resto da divisão de " + num1 
            + " por " + num2 
            + " é " + resultado
        );

        // Exibe uma mensagem no terminal
        System.out.println();

    }

}