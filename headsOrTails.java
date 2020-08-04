package HoT;

import java.util.Random;
import java.util.Scanner;

public class headsOrTails {
	public static void main(String[] args){

		int h=0, t=0;

		Random random = new Random();
		Scanner s = new Scanner(System.in);

		System.out.println("Who are you?");
		System.out.print("> ");
		String name = s.next();
		System.out.println("Hello, "+name+"!");
		System.out.println("Tossing a coin...");

		for(int i=1;i<=3;i++) {
			int rnd = random.nextInt(2);
			System.out.print("Round "+i+": ");
			if(rnd == 0) {
				System.out.println("Heads");
				h++;
			}
			else {
				System.out.println("Tails");
				t++;
			}
		}
		System.out.println("Heads: "+h+", Tails: "+t);

		if(h>t)System.out.println(name+" won");
		else System.out.println(name+" lost");
	}
}