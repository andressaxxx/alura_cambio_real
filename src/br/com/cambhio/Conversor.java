package br.com.cambhio;

import javax.swing.*;

public class Conversor {
	
	String[] escolhaDoCambio = {
			"Real para Dólar",
			"Dólar para Real",
			"Real para Euro",
			"Euro para Real",
			"Real para Libra",
			"Libra para Real",
			"Real para Peso Argentino",
			"Peso Argentino para Real",
			"Real para Peso Chileno",
			"Peso Chileno para Real"
	};

	private String escolhaDaMoeda() {
		
		return (String) JOptionPane.showInputDialog(null, "Escolha o tipo de conversão que deseja fazer?", "Cambio", JOptionPane.PLAIN_MESSAGE, null, escolhaDoCambio, escolhaDoCambio[0]);
		
	}
	
	private double valorParaConversao() {
		
		return Double.valueOf(JOptionPane.showInputDialog(null, "Informe o valor que deseja fazer a conversão:", "Cambio", JOptionPane.QUESTION_MESSAGE)).doubleValue();
		
	}
	
	private void resultadoDaConversao(double valorParaCambio, String resultadoDoCambio,String moedaOriginal, String moedaDoCambio) {
		JOptionPane.showMessageDialog(null, "" + valorParaCambio + " " + moedaOriginal
											+ " convertiodos equivalem a "
											+ resultadoDoCambio + " " + moedaDoCambio + ".", "Cambio", JOptionPane.INFORMATION_MESSAGE);
	}
	
	public void fazerConversao() {
		
		String escolhaDoCambio = escolhaDaMoeda();
		double valorParaCambio = valorParaConversao();
		String resultadoDoCambio = null;
		
		switch(escolhaDoCambio) {
			case "Real para Dólar":
				resultadoDoCambio = Cambio.reaisParaDolar(valorParaCambio);
				resultadoDaConversao(valorParaCambio, resultadoDoCambio,"Reais", "Dolares");
				break;
			case "Dólar para Real":
				resultadoDoCambio = Cambio.dollarsParaReais(valorParaCambio);
				resultadoDaConversao(valorParaCambio, resultadoDoCambio, "Dolares", "Reais");
				break;
			case "Real para Euro":
				resultadoDoCambio = Cambio.reaisParaEuro(valorParaCambio);
				resultadoDaConversao(valorParaCambio, resultadoDoCambio, "Reais", "Euros");
				break;
			case "Euro para Real":
				resultadoDoCambio = Cambio.eurosParaReais(valorParaCambio);
				resultadoDaConversao(valorParaCambio, resultadoDoCambio, "Euros", "Reais");
				break;
			case "Real para Libra":
				resultadoDoCambio = Cambio.reaisParaLibra(valorParaCambio);
				resultadoDaConversao(valorParaCambio, resultadoDoCambio, "Reais", "Libras Esterlinas");
				break;
			case "Libra para Real":
				resultadoDoCambio = Cambio.librasParaReais(valorParaCambio);
				resultadoDaConversao(valorParaCambio, resultadoDoCambio, "Libras Esterlinas", "Reais");
				break;
			case "Real para Peso Argentino":
				resultadoDoCambio = Cambio.reaisParaPesoArgentino(valorParaCambio);
				resultadoDaConversao(valorParaCambio, resultadoDoCambio, "Reais", "Peso Argentino");
				break;
			case "Peso Argentino para Real":
				resultadoDoCambio = Cambio.pesosArgentinosParaReais(valorParaCambio);
				resultadoDaConversao(valorParaCambio, resultadoDoCambio, "Peso Argentino", "Reais");
				break;
			case "Real para Peso Chileno":
				resultadoDoCambio = Cambio.reaisParaPesoChilenos(valorParaCambio);
				resultadoDaConversao(valorParaCambio, resultadoDoCambio, "Reais", "Peso Chileno");
				break;
			case "Peso Chileno para Real":
				resultadoDoCambio = Cambio.pesosChilenosParaReais(valorParaCambio);
				resultadoDaConversao(valorParaCambio, resultadoDoCambio, "Peso Chileno", "Reais");
		}
		
		
	}
	
//	JOptionPane.showMessageDialog(null, "Você tem $ " + moedaLibra + " Reais");
		
}
