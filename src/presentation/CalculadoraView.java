package presentation;

import service.CalculadoraService;

public class CalculadoraView {

	public static void main(String[] args) {
		CalculadoraService calc=new CalculadoraService();
		System.out.println(calc.sumar(2, 8));
		System.out.println(calc.multiplicar(5, 6));

	}

}
