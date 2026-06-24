import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {

    ArrayList<String> carrinhoDecompras = new ArrayList<>();

    carrinhoDecompras.add("Feijão");
    carrinhoDecompras.add("Mandioca");

    carrinhoDecompras.add("Chocolate");

    carrinhoDecompras.remove(0);

        System.out.println("Tamanho do carrinho de compras atual: "+ carrinhoDecompras.size());

        System.out.println("\n Primeiro item do carrinho: "+ carrinhoDecompras.get(0));

    }
}
