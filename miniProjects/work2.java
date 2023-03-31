package intro;

public class work2 {

	public static void main(String[] args) {
		
		double[] myList = {1.2, 3.5, 2.7, 7.2, 5.1};
		
		double total = 0;
		double max = myList[0];
		
		for (double number:myList) {
			
			if (max < number) {
				max = number;
			}
			
			total = total + number;
			System.out.println(number);
		}
		
		System.out.println("Toplam : " + total);
		
		System.out.println("En Büyük : " + max);

	}

}
