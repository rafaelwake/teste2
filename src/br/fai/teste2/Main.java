package br.fai.teste2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main app = new Main();
		app.start();
	}
	Scanner scanner = new Scanner(System.in);
	
	private void start () {
		usandoWhile();
		usandoDoWhile();
		usandoFor();
		
		
	}
	
	private void usandoWhile() {
		System.out.println("usando while");
		System.out.print("Digite a idade: ");
		int i = 0;
		int idade = scanner.nextInt();
		
		while(i<30) {
			System.out.println("idade somando ate 30= "+ idade);
			idade++;
			i++;
		}
	}
	
	private void usandoDoWhile() {
		System.out.println("usando DO while");
		int i = 10;
			
		while(i>0) {
			System.out.println("conter= "+ i);
			i--;
		}
	}
	
	private void usandoFor() {
		System.out.println("usando For");
		int i = 0;
			
		while(i<5) {
			System.out.println("conter= "+ i);
			i++;
		}
	}

}
