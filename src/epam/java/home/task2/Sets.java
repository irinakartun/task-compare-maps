package epam.java.home.task2;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;

public class Sets {

	static Random randomGenerator = new Random();
	static int index = randomGenerator.nextInt(6999);

	private static void fillMap(Map fillingMap) {
		for (int i = 1; i <= 7000; i++) {
			fillingMap.put(randomGenerator.nextInt(), randomGenerator.nextFloat());
		}
	}

	public static long addToHashMap() {
		HashMap<Integer, Float> myHashMap = new HashMap<Integer, Float>();
		long startTime = System.nanoTime();
		fillMap(myHashMap);
		long endTime = System.nanoTime();
		long totalTime = endTime - startTime;
		return totalTime;
	}

	public static long addToTreeMap() {
		TreeMap<Integer, Float> myTreeMap = new TreeMap<Integer, Float>();
		long startTime = System.nanoTime();
		fillMap(myTreeMap);
		long endTime = System.nanoTime();
		long totalTime = endTime - startTime;
		return totalTime;
	}

	public static long findInHashMap() {
		HashMap<Integer, Float> myHashMap = new HashMap<Integer, Float>();
		fillMap(myHashMap);
		long startTime = System.nanoTime();
		myHashMap.get(index);
		long endTime = System.nanoTime();
		long totalTime = endTime - startTime;
		return totalTime;
	}

	public static long findInTreeMap() {
		TreeMap<Integer, Float> myTreeMap = new TreeMap<Integer, Float>();
		fillMap(myTreeMap);
		long startTime = System.nanoTime();
		myTreeMap.get(index);
		long endTime = System.nanoTime();
		long totalTime = endTime - startTime;
		return totalTime;
	}

	public static long removeFromHashMap() {
		HashMap<Integer, Float> myHashMap = new HashMap<Integer, Float>();
		fillMap(myHashMap);
		long startTime = System.nanoTime();
		myHashMap.remove(index);
		long endTime = System.nanoTime();
		long totalTime = endTime - startTime;
		return totalTime;
	}

	public static long removeFromTreeMap() {
		TreeMap<Integer, Float> myTreeMap = new TreeMap<Integer, Float>();
		fillMap(myTreeMap);
		long startTime = System.nanoTime();
		myTreeMap.remove(index);
		long endTime = System.nanoTime();
		long totalTime = endTime - startTime;
		return totalTime;
	}

}
