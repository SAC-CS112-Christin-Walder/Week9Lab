import java.util.Arrays;

public class Lab1 {

	public static void main(String[] args) {
		
		int[] aryNums;
		aryNums = new int[6];
		double avg = 0;
		
		aryNums[0] = 123;
		aryNums [1] = 456;
		aryNums [2] = 479;
		aryNums [3] = 135;
		aryNums [4] = 246;
		aryNums [5] = 135;
		
		Arrays.sort(aryNums);
		
		int i;
		
		for (i=0; i<aryNums.length; i++) {
			System.out.println("Number: " + aryNums[i]); }
			
		avg = ((aryNums[0]+aryNums[1]+aryNums[2]+aryNums[3]+aryNums[4]+aryNums[5])/i);
		
		System.out.printf("Average: %.2f", avg);
			
	}
}
