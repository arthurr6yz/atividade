package teste;

public class At1v4 {

	public static void main(String[] args) {
		
		int[] numeros = new int[100];
		
		for(int i = 0 ; i <= numeros.length - 1 ; i++) {
			boolean ehprimo = true; 
			numeros[i] = (int) (Math.random() * 100);
			
			for(int j = 2 ; j < numeros[i] ; j++) {
				if(numeros[i] % j == 0) {
					ehprimo = false;
					break;
				}
			}
			
			if(ehprimo) { 
			 System.out.println(numeros[i]);
			}
		}
	}

}
