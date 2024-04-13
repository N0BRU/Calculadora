package a3;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a operação:\n" 
                        + "1 Adição dois valores inteiro\n"
                        + "2 Subtração\n"
                        + "3 Multiplicação\n"
                        + "4 Divisão\n"
                        + "5 Exponenciação\n"
                        + "6 Fatorial\n"
                        + "7 Adição tres valores\n"
                        + "8 Adição dois valores texto");
        int tipo = teclado.nextInt();
        System.out.println("Digite o valo 1:");
        int valor1 = teclado.nextInt();
        int valor2 = 0;
        int valor3 = 0;
        if (tipo != 6) {
            System.out.println("Digite o valor 2");
            valor2 = teclado.nextInt();
        }
        if (tipo == 7) {
                System.out.println("Digite o valor 3");
                valor3 = teclado.nextInt();
        }
        teclado.close();
        Operacao operacao = new Operacao();

        switch (tipo) {
            
            case 1: System.out.println("Adição de dois valores inteiro = "+ operacao.soma(valor1, valor2)); 
                    break;
            case 2: operacao.setMinuendo(valor1);
                    operacao.setSubtraendo(valor2);
                    System.out.println("Subtração = "+operacao.subtração()); 
                    break;
            case 3: operacao.setNroGenerico1(valor1);
                    operacao.setNroGenerico2(valor2);
                    System.out.println("Multiplicação = "+(valor1*valor2));
                    break;
            case 4: operacao.setNroGenerico1(valor1);
                    operacao.setNroGenerico2(valor2);
                    System.out.println("Divisão = "+(valor1/valor2));
                    break;
            case 5: operacao.setNroGenerico1(valor1);
                    operacao.setNroGenerico2(valor2);
                    double Exponenciação = Math.pow(valor1,valor2);
                    System.out.println("Exponenciação = "+ Exponenciação);
                    break;
            case 6: operacao.setFatorial(valor1);
                    System.out.println("Fatorial = "+ operacao.getFatorial());
                    break;
            case 7: System.out.println("Adição 3 valores = "+operacao.soma(valor1, valor2, valor3));
                    break;            
            case 8: System.out.println("operação 2 valores textos = "+operacao.soma(Integer.toString(valor1), Integer.toString(valor2)));
                    break; 
            default: System.out.println("Operação Inválida!");
        }

    }
}
