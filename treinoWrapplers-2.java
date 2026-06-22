public class Main {
    public static <string> void main(String[] args) {

        System.out.println("\t== Exercício para aprender melhor o que são Wrapplers e como usar ==");

        Integer numero = 10;
        String numeroEmtexto = numero.toString(numero);

        System.out.println("Resultado: "+ numeroEmtexto);

        //provando que virou um texto

        System.out.println("\t-- Convertido em texto o codigo nao vai fazer a soma 10+5 = 15 e sim \n" +
                "\tjuntar o caractere 10 com o caractere 5 --");

        System.out.println("Provando conversão: "+ (numeroEmtexto+5));

    }
    }
