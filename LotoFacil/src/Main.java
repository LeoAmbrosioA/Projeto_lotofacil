import java.util.Scanner;
import java.util.Random;
import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException {

        Scanner ler = new Scanner(System.in);
        Random aleatorio = new Random();
        int menu;

        do {
            System.out.println("\n");
            System.out.println("Menu LOTOFÁCIL: \n");
            System.out.println("1) Apostar de 0 a 100 \n");
            System.out.println("2) Apostar de A à Z \n");
            System.out.println("3) Apostar em par ou ímpar \n");
            System.out.println("0) Sair \n");
            System.out.println("\n");

            menu = ler.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("Jogando de 0 a 100");
                    int val;
                    int sorteador;
                    System.out.println("Informe um numero entre 0-100: \n");
                    val = ler.nextInt();
                    sorteador = aleatorio.nextInt(101);
                    if (val >= 0 && val <= 100) {
                        if (val == sorteador) {
                            System.out.println("Parabéns! Você ganhou R$ 1.000,00 reais. \n");
                        } else {
                            System.out.println("Que pena! O número sorteado foi:" + sorteador);
                        }
                    } else {
                        System.out.println("Número inválido!!");
                    }
                    break;
                case 2:
                    System.out.println("Jogando de A à Z");
                    System.out.println("Informe uma letra: \n");
                    char lerLetra = (char) System.in.read();
                    char letraMaiuscula = Character.toUpperCase(lerLetra);
                    char letraPremiada = 'L';
                    if (Character.isLetter(letraMaiuscula)) {
                        if (letraPremiada == letraMaiuscula) {
                            System.out.println("Parabéns! Você ganhou R$ 500,00 reais.");
                        } else {
                            System.out.println("Que pena! A letra sorteada foi: " + letraPremiada);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Apostando em par ou ímpar \n");
                    System.out.println("Digite um numero Inteiro: \n");
                    int numeroInteiro = ler.nextInt();
                    int resultado;
                    resultado = numeroInteiro % 2;
                    if(resultado == 0){
                        System.out.println("Parabéns! Você ganhou R$ 100,00 reais.");
                    }else {
                        System.out.println("Que pena! O número informado é ímpar e a premiação foi para números pares.");
                    }
                    break;
                case 0:
                    System.out.println("Saindo");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (menu != 0);

        ler.close();
    }
}
