package main;

public class Main {
	
	public static void main(String[] args) {
	
		Carro carro1 = new Carro("fusca", "verde", 1980);
		System.out.println("A marca do carro é: " + carro1.getMarca());
		System.out.println("O carro vai buzinar: " + carro1.buzinar());
	    System.out.println("----------------------------");
		
		Trator carro2 = new Trator("John Deere", "amarelo", 2026, "agrícola", "grande");
		System.out.println("A marca do trator é: " + carro2.getMarca());
		System.out.println("O trator vai buzinar: " + carro2.buzinar());
	}
}
