package view;

import javax.swing.JOptionPane;

import controller.FibonacciController;

public class FibonacciPrincipal {
	public static void main(String[] args) {
		FibonacciController fibCon = new FibonacciController();
		int num = -1;
		while (num < 0 || num > 20) {
			num = Integer.parseInt(JOptionPane.showInputDialog("Insira a numição da sequência Fibonacci (até 20): "));
			if (num < 0 || num > 20) {
				JOptionPane.showMessageDialog(null, "Número inválido. Tente novamente.");
			}
		}
		
		System.out.println("A posição " + num + " da sequência Fibonacci é: " + fibCon.sequenciaFib(num, 1, 0, 0));
		
	}
}
