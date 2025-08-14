public class LongestDrySpell {
	public static void main(String[] args) {
		int max = 0;
		int count = 0;
		System.out.print("Rainfall: ");
		double rainfall = In.nextDouble();
		while (rainfall != -1) {
			if (rainfall == 0) {
				count++;
			}
			else {
				if (count > max)
					max = count;
				count = 0;
			}
			System.out.print("Rainfall: ");
			rainfall = In.nextDouble();
		}

		// One last check, in case the last day is 0
		// and it is a part of the longest dry spell
		if (count > max)
			max = count;
		System.out.println("Longest dry spell = " + max);
	}
}