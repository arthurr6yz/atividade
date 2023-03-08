package teste;

public class At1v7 {

	public static void main(String[] args) {
		
		int[] numeros = new int[100];
		
		for(int i = 0 ; i <= numeros.length - 1 ; i++) {
			numeros[i] = (int) (Math.random() * 101);
			System.out.println(numeros[i]);
		 }
			int maior = numeros[0];
			int menor = numeros[0];
		
			for(int i = 0 ; i <= numeros.length - 2 ; i++) {
				if(maior <= numeros[i]) {
					maior = numeros[i];
				}
				
				if(menor >= numeros[i]) {
					menor = numeros[i];
				}
			}
			
			System.out.println("o numero foi " + maior);
			System.out.println(" o numero foi " + menor);
	}
}