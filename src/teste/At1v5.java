package teste;

public class At1v5 {

	public static void main(String[] args) {
		
		int[] numeros = new int[100];
		
		for(int i = 0 ; i <= numeros.length - 1 ; i++) {
			numeros[i] = (int) (Math.random() * 101);
		}
		
		for(int i = 0 ; i <= numeros.length - 1 ; i++) {
			if(numeros[i] % 2 != 0) {
				System.out.println(numeros[i]);
			}
		}
	}

}
