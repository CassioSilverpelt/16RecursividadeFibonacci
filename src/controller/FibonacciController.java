package controller;

public class FibonacciController {
	public FibonacciController() {
		super();
	}
	
	public int sequenciaFib(int fin, int pri, int sec, int fib) {
		if (fin == 0) {return fib;}
		//Se reduz o valor máximo até alcançar zero, onde, nesse caso, a função terá alcançado a posição certa da sequência.
		else {
			fib = pri + sec;
			pri = sec;
			sec = fib;
			fin--;
			return sequenciaFib (fin, pri, sec, fib);
			//Se soma os valores iniciais e troca os valores das variáveis para a próxima iteração.
		}
	}
	
}
