package main;

public class Trator extends Carro{
	private String tipo; 
	private String tamanho;
	
	public Trator(String marca, String cor, int ano, String tipo, String tamanho) {
		super(marca, cor, ano);
		this.tipo = tipo;
		this.tamanho = tamanho;
	}
	
		public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

		@Override
	    public String buzinar() {
	        return ("Bum Buumm!");
	}
}
