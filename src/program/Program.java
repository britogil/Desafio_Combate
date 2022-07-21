package program;

import java.util.Scanner;

import entities.Champion;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);


		System.out.println("Digite os dados do primeiro Campeão: ");
		System.out.print("Nome: ");
		String name = sc.nextLine();
		System.out.print("Vida Inicial: ");
		int life = sc.nextInt();
		System.out.print("Ataque: ");
		int attack = sc.nextInt();
		System.out.print("Armardura: ");
		int armor = sc.nextInt();
		System.out.println();
		Champion c1 = new Champion(name, life, attack, armor);
		sc.nextLine();
		System.out.println("Digite os dados do segundo Campeão: ");
		System.out.print("Nome: ");
		name = sc.nextLine();
		System.out.print("Vida Inicial: ");
		life = sc.nextInt();
		System.out.print("Ataque: ");
		attack = sc.nextInt();
		System.out.print("Armardura: ");
		armor = sc.nextInt();
		Champion c2 = new Champion(name, life, attack, armor);


		System.out.println();
		System.out.print("Quantos turnos voce deseja executar: ");
		int n = sc.nextInt();



		for(int i = 1; i <= n; i++) {	

			c1.takeDamage(c2);
			c2.takeDamage(c1);

			System.out.println();
			System.out.println(" Resultado do turno " + i + ":" );
			System.out.println(c1.status());
			System.out.println(c2.status());
			System.out.println();

			if(c1.getLife() == 0 || c2.getLife() == 0) {
				n = i;
			}
		}

		System.out.println();
		System.out.println("  FIM DO COMBATE");	


		sc.close();

	}

}
