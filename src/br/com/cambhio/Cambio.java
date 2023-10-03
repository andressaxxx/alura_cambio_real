package br.com.cambhio;

import java.text.DecimalFormat;

public class Cambio {
	
	private static double realParaDolar = 5.07;
	private static double realParaEuro = 5.32;
	private static double realParaLibra = 6.14;
	private static double realParaPesoArgentino = 0.0144;
	private static double realParaPesoChileno = 0.0056;
	
	private static double dolarParaReais = 1 / realParaDolar;
	private static double EuroParaReais = 1 / realParaEuro;
	private static double LibrarParaReais = 1 / realParaLibra;
	private static double PesoArgentinoParaReais = 1 / realParaPesoArgentino;
	private static double PesoChilenoParaReais = 1 / realParaPesoChileno;
	
	
	public static String reaisParaDolar (double valorEmReais){
		return cambio(valorEmReais, realParaDolar);
	}

    public static String reaisParaEuro(double valorEmReais){
    	return cambio(valorEmReais, realParaEuro);
    }

    public static String reaisParaLibra(double valorEmReais){
    	return cambio(valorEmReais, realParaLibra);
    }

    public static String reaisParaPesoArgentino(double valorEmReais){
    	return cambio(valorEmReais, realParaPesoArgentino);
    }

    public static String reaisParaPesoChilenos(double valorEmReais){
    	return cambio(valorEmReais, realParaPesoChileno);
    }
    
	public static String dollarsParaReais(double valorEmReais) {
		return cambio(valorEmReais, dolarParaReais);
	}
	
	public static String eurosParaReais(double valorEmReais) {
		return cambio(valorEmReais, EuroParaReais);
	}
	
	public static String librasParaReais(double valorEmReais) {
		return cambio(valorEmReais, LibrarParaReais);
	}
	
	public static String pesosArgentinosParaReais(double valorEmReais) {
		return cambio(valorEmReais, PesoArgentinoParaReais);
	}
    
	public static String pesosChilenosParaReais(double valorEmReais) {
		return cambio(valorEmReais, PesoChilenoParaReais);
	}

	
	private static String cambio (double valorEmReais, double taxaDeConversao){
		double valorConvertido = (valorEmReais / taxaDeConversao);
		return truncar(valorConvertido);
	}

	private static String truncar (double valor) {
		DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");
		return decimalFormat.format(valor);
	}
	
	
}

