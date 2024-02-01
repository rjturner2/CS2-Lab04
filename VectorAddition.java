import java.util.Random;

public class VectorAddition {
	public static void main(String[] args) {
		final int COLUMN_WIDTH = 5;
		final int ROW_WIDTH = 8;
		int[][] vectorA = new int[ROW_WIDTH][COLUMN_WIDTH];
		int[][] vectorB = new int[ROW_WIDTH][COLUMN_WIDTH];
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

	public static void randomInitialization() {

	}
}