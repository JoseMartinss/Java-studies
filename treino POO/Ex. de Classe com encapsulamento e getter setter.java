public class Carro {

    //usamos o private para encapsular os atributos para que nao possam ser alterados fora da classe carro
    private String cor, marca;
    private int ano;

    //fazendo os getters e setters para poder acessar os atributos privados fora da classe carro (por conta do encapsulamento)
    public String getCor(){ //getter(pra poder ver o valor)
        return.this.cor; 
    }

    public String setCor(String novaCor){ //setter(pra poder mudar o valor)
        this.cor = novaCor;
        return.this.cor;
    }

    public String getMarca(){
        return.this.marca;
    }

    public String setMarca(String novaMarca){
        this.marca = novaMarca;
    }

    public int getAno(){
        return.this.ano;
    }

    public int setAno(int novoAno){
        this.ano = novoAno;
    }
    


}
