import java.util.Random;
import java.util.Arrays;

public class VectorAddition {
	public static void main(String[] args) {
		final int COLUMN_WIDTH = 3;
		final int ROW_WIDTH = 4;

		int[][] vectorA = new int[ROW_WIDTH][COLUMN_WIDTH];
		int[][] vectorB = new int[ROW_WIDTH][COLUMN_WIDTH];

		randomInitialization(vectorA);
		randomInitialization(vectorB);

		int[][] vectorSum = addVectors(vectorA, vectorB);

		print2dMatrix(vectorA, "Vector A");
		print2dMatrix(vectorB, "Vector B");
		print2dMatrix(vectorSum, "Vector Sum");
	}

	public static int[][] addVectors(int[][] a, int[][] b) {
		int[][] matrixSummation = new int[a.length][a[0].length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				matrixSummation[i][j] = a[i][j] + b[i][j];
			}
		}
		return matrixSummation;
	}

	public static void randomInitialization(int[][] a) {
		Random random = new Random();
		final int MAXINT = 10;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = random.nextInt(MAXINT + 1);
			}
		}
	}

	public static void print2dMatrix(int[][] a, String header) {
		System.out.println("___" + header + "___");

		for (int i = 0; i < a.length; i++) {
			System.out.println(Arrays.toString(a[i]));
		}
	}
}