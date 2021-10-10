package co.fx;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
	 * Generate the Random Number in java 
	 * Random class 
	 * Math.random()
	 * ThreadLocalRandom using this case we generate the random*/
public class GenerateRandomNumber {

	public static void main(String[] args) {
		//using Rndom class
		Random random = new Random();
		for(int i=1;i<10;i++) {
		System.out.println("Random int "+random.nextInt());
		System.out.println("Random Double "+random.nextDouble());
		System.out.println("Random Float "+random.nextFloat());
		}
		
		//using Math.random()
		for(int i=1;i<10;i++) {
//			System.out.println(Math.random());
		}
		//using ThreadLocalRandom
		for(int i=1;i<5;i++) {
			System.out.println(ThreadLocalRandom.current().nextInt());
			System.out.println(ThreadLocalRandom.current().nextFloat());
			System.out.println(ThreadLocalRandom.current().nextDouble());
			System.out.println(ThreadLocalRandom.current().nextBoolean());
		}
		
		System.out.println(random.nextInt(30));
		System.out.println(ThreadLocalRandom.current().nextInt(0,20));
	}

}
