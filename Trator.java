package main;

public class Trator extends Carro{
    private String tipo;
    private float tamanho;

    public Trator(String marca, String cor, int ano, String tipo, int tamanho){
        super(marca, cor, ano);
        this.tipo = tipo;
        this.tamanho = tamanho;
    }
    public String buzinar(){
        return ("bum buum")
    }
}