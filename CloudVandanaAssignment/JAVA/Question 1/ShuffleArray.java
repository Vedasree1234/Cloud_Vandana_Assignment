package pack1;

import java.util.Random;

public class ShuffleArray {
	public static void main(String[] args) {
		Random rmd = new Random();
		int a[] = { 1, 2, 3, 4, 5, 6, 7 };
		boolean b = false;
		for (int i = a.length - 1; i >= 0; i--) {
			int j = rmd.nextInt(i + 1);
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
			b = true;
		}
		for (int i = 0; i < a.length; i++) {
			if (b = true) {
				System.out.print(a[i] + " ");
				System.out.println("arrays shuffled");
			}
		}

	}
}
