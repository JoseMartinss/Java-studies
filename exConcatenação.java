import java.util.Scanner;


public class Main {
    public static <string> void main(String[] args) {

        String nome;
        Byte idade;
        String acao;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual é o seu nome?");
         nome = entrada.nextLine();

        System.out.println("Qual é a sua idade?");
         idade = entrada.nextByte();

        System.out.println("O que você está estudando agora?");
         acao = entrada.next();

        System.out.println("\n \t Informações adquiridas: \n");
        System.out.println("Seu Nome é: "+ nome + "\nSua idade é: "+ idade + "\n" +
                "Atualmente está estudando: "+ acao);


        }
    }
