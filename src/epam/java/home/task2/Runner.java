package epam.java.home.task2;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long timeAddToHashMap = Sets.addToHashMap();
		System.out.println("Time spent for filling Hash Map:\n" + timeAddToHashMap);
		long timeAddToTreeMap = Sets.addToTreeMap();
		System.out.println("Time spent for filling Tree Map:\n" + timeAddToTreeMap);
		System.out.println("------------------------");

		long timeFindInHashMap = Sets.findInHashMap();
		System.out.println("Time spent for findind random element in Hash Map:\n" + timeFindInHashMap);
		long timeFindInTreeMap = Sets.findInTreeMap();
		System.out.println("Time spent for findind random element in Tree Map:\n" + timeFindInTreeMap);
		System.out.println("------------------------");

		long timeRemoveFromHashMap = Sets.removeFromHashMap();
		System.out.println("Time spent for removing random element from Hash Map:\n" + timeRemoveFromHashMap);
		long timeRemoveFromTreeMap = Sets.removeFromTreeMap();
		System.out.println("Time spent for removing random element from Tree Map:\n" + timeRemoveFromTreeMap);
	}

}
