package HoT;

import java.util.Random;

public class headsOrTails {
	public static void main(String[] args){

		int h=0, t=0;

		Random random = new Random();

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
	}
}