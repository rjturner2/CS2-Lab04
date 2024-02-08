import java.util.Arrays;

public class MagicSquare {
	public static void main(String[] args) {
		final int[][] potentialMagicSquare = {
			{2, 7, 6},
			{9, 5, 1},
			{4, 3, 8}
		};

		int[] verticalSums = checkVerticalSum(potentialMagicSquare);
		int[] horizontalSums = checkHorizontalSum(potentialMagicSquare);
		int[] diagonalSums = checkDiagonalSum(potentialMagicSquare);

		for (int i = 0; i < potentialMagicSquare.length; i++) {
			System.out.println(Arrays.toString(potentialMagicSquare[i]));
		}

		if (checkMagicSquare(verticalSums, horizontalSums, diagonalSums)) {
			System.out.println("Is a Magic Square! All sides and diagonals euqal " + verticalSums[0]);
		} else {
			System.out.println("Is not a Magic Square.");
		}
	}


	public static int[] checkVerticalSum(int[][] a) {
		int[] sumArray = new int[a[0].length];

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				sumArray[i] += a[j][i];	
			}
		}

		return sumArray;
	}

	public static int[] checkHorizontalSum(int[][] a) {
		int[] sumArray = new int[a.length];

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				sumArray[i] += a[i][j];
			}
		}

		return sumArray;
	}

	public static int[] checkDiagonalSum(int[][] a) {
		int[] diagonalSums = new int[2];

		for (int j = 0; j < a.length; j++) {
			diagonalSums[0] += a[j][j];
			diagonalSums[1] += a[a.length - 1 - j][a[j].length - 1 - j];
		}

		return diagonalSums;
	}

	public static Boolean checkMagicSquare(int[] a, int[] b, int[] c) {
		if (checkArrayEquality(a) && checkArrayEquality(b) && checkArrayEquality(c)){
			return true;
		}
		return false;
	}

	public static Boolean checkArrayEquality(int[] a) {
		int startingValue = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i] != startingValue) return false;
		}
		return true;
	}
}