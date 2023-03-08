package teste;

import java.util.Scanner;

public class At1v1 {

	public static void main(String[] args) {
		
		int n1 = 0;
		int n2 = 0;
		int n3 = 0;
		int n4 = 0;
		int n5 = 0;
		
		Scanner ler = new Scanner(System.in);
		System.out.println("digite um numero de n1");
		n1 = ler.nextInt();
		System.out.println(n1);
		
		System.out.println("digite um numero de n2");
		n2 = ler.nextInt();
		System.out.println(n2);
		
		System.out.println("digite um numero de n3");
		n3 = ler.nextInt();
		System.out.println(n3);
		
		System.out.println("digite um numero de n4");
		n4 = ler.nextInt();
		System.out.println(n4);
		
		System.out.println("digite um numero de n5");
		n5 = ler.nextInt();
		System.out.println(n5);
		
		int media =(n1 + n2 + n3 + n4 + n5) / 5;
		
		System.out.println("o valor da media e " + media);
	}

}
