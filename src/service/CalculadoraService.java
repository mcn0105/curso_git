package service;

import util.Utilidades;

public class CalculadoraService {
	public int sumar(int a, int b) {
		return a+b;
	}
	public int restar(int a, int b) {
		return Utilidades.mayor(a,  b)-Utilidades.menor(a, b);
	}
	public int multiplicar(int a, int b) {
		return a*b;
	}
	public int dividir(int a, int b) {
		return Utilidades.mayor(a,  b)/Utilidades.menor(a, b);
	}
	public int potencia(int a, int b) {
		return (int)Math.pow(a,  b);
	}
	public int sumatorio(int[] nums) {
		int suma=0;
		for(int n:nums) {
			suma+=n;
		}
		return suma;
	}
	public int factorial(int n) {
		return n*2;
	}
}
