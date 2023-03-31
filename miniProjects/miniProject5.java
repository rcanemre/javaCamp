package miniProjects;

public class miniProject5 {

	public static void main(String[] args) {
		// Find the number
		int[] numbers = { 1, 2, 5, 7, 9, 0 };
		int wanted = 5;
		boolean isFind = false;
		
		for (int number : numbers) {
			if (wanted == number) {
				isFind = true;
				break;
			}
		}

		if(isFind) {
			System.out.println("Found the number!");
		}else {
			System.out.println("Not found the number!");
		}
	}

}
