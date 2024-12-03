package lp2;

import java.util.Scanner;

public class Main {

	public void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Questão 1
		/*
		System.out.println("Quantas horas foram trabalhadas?");
		int horasT = sc.nextInt();
		System.out.println(horasT * 20);
		*/
		
		//Questão 2
		/*
		System.out.println("Insira o preço da gasolina");
		int precoGas = sc.nextInt();
		System.out.println("Insira a distância");
		int distancia= sc.nextInt();
		int litroGas = distancia/12;
		System.out.println("Precisa de "+litroGas+" litros de gasolina");
		System.out.println("Isso vai sair por "+litroGas*precoGas+" reais");
		*/
		
		//Questão 3
		/*
		System.out.println("Insira a idade do usuário");
		int idade = sc.nextInt();
		if(idade >= 18) {
			System.out.println("Pode ter habilitação");
		}else {
			System.out.println("Não pode ter habilitação");
		}
		*/
		
		//Questão 4
		/*
		System.out.println("Insira a temperatura");
		int idade = sc.nextInt();
		if(idade >= 38) {
			System.out.println("Está com febre");
		}else {
			System.out.println("Temperatura normal");
		}
		*/
		
		//Questão 5
		/*
		System.out.println("Insira as notas");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		if(n1==n2) {
			System.out.println("Numeros iguais");
		}else {
			if(n1>n2) {
				System.out.println(n1+" maior que"+n2);
			}else {
				System.out.println(n2+" maior que"+n1);
			}
		}
		*/
		
		//Questão 6
		/*
		System.out.println("Insira as notas");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int trabalho = sc.nextInt();
		int media = (n1+n2+trabalho)/3;
		if(media>=7) {
			System.out.println("Aprovado");
		}else {
			System.out.println("Reprovado");
		}
		*/
		
		//Questão 7
		/*
		System.out.println("Insira seu peso e altura");
		int peso = sc.nextInt();
		int h = sc.nextInt();
		int imc = peso/h*2;
		if(imc>30) {
			System.out.println("Usuário está obeso");
		}else {
			System.out.println("Usuário não está obeso");
		}
		*/
		
		//Questão 8
		/*
		System.out.println("Insira o raio");
		int r = sc.nextInt();
		System.out.println("A area = "+r*r);
		*/
		
		//Questão 9
		/*
		int hValor = sc.nextInt();
		int hTrabalho = sc.nextInt();
		int inss = sc.nextInt();
		int sBruto = hValor * hTrabalho;
		int sLiquido = sBruto - (sBruto * inss)/100;
		System.out.println("O salário liquido é "+sLiquido);
		*/
		
		//Questão 10
		/*
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		if(n1+n2 > 10) {
			System.out.println("O resultado é maior que 10");
		}else {
			System.out.println("O resultado é menor que 10");
		}
		*/
		
		//Questão 11
		/*
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int s = n1+n2;
		if(s >= 10) {
			System.out.println(s+5);
		}else {
			System.out.println(s-5);
		}
		*/
	}
}
