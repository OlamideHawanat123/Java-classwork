public class HighestNumberIndex {
	public static void main(String[] args) {
		int[] num = {3, 2, 5, 100000};
		int[] num2 = {6, 9, 8};
		int[] combined = new int[num.length + num2.length];
        
	for (int count = 0; count < num.length; count++) {
		combined[count] = num[count];
	}
		for (int count2 = 0; count2 < num2.length; count2++) {
			combined[num.length + count2] = num2[count2];
		}
	
		int n = combined.length;
	for (int count3 = 0; count3 < n - 1; count3++) {
		for (int count4 = 0; count4 < n - 1 - count3; count4++) {
			if (combined[count4] < combined[count4 + 1]) {
				int temp = combined[count4];
				combined[count4] = combined[count4 + 1];
				combined[count4 + 1] = temp;
			}
		}
	}

	for (int count5 = 0; count5 < combined.length; count5++) {
		System.out.print(combined[count5] + " ");
	}
	
	}
}