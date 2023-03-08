package teste;

public class At1v3 {

	public static void main(String[] args) {
		
		int[] numeros = new int[100];
		
		for(int i = 0 ; i <= numeros.length - 1 ; i++) {
			numeros[i] = (int) (Math.random() * 100);
		}
			System.out.println(numeros[0]);
  }
}