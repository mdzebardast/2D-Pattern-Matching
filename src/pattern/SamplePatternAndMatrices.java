package pattern;

public class SamplePatternAndMatrices {
	public static final char[][] matrix1 = {
			{'.','.','.','.','.','.','.','.','.','.','.','.','.','.','.'},
			{'.','.','F','.','F','.','.','.','.','.','.','.','.','.','.'},
			{'.','.','.','X','.','.','.','.','.','.','.','.','.','.','.'},
			{'.','.','F','.','F','.','.','.','.','.','.','.','.','.','.'}
		};
	
	public static char[][] matrix2 = {
			{'.','.','.','.','.','.','.'},
			{'.','.','.','.','.','.','.'},
			{'.','.','.','.','.','.','.'},
			{'.','S','.','W','.','.','.'},
			{'.','S','W','.','.','.','.'},
			{'.','S','S','S','.','.','.'},
			{'.','.','.','.','.','.','.'},
		};

	public static char[][] matrix3 = {
			{'.','.','.','.','.','.','.'},
			{'.','.','.','.','.','W','.'},
			{'.','.','.','.','W','.','.'},
			{'.','S','.','W','.','.','.'},
			{'.','S','W','.','.','.','.'},
			{'.','S','S','S','.','.','.'},
			{'.','.','.','.','.','.','.'},
		};
	
	public static char[][] matrix4 = {
			{'.','.','.','.','.','.','.'},
			{'.','.','.','.','.','.','.'},
			{'.','.','.','.','F','.','.'},
			{'.','.','.','.','F','.','.'},
			{'.','.','.','.','X','X','X'},
			{'.','.','.','.','.','.','.'},
			{'.','.','.','.','.','.','.'},
		};
	
	public static char[][] cross = {
			{ 'F', '.', 'F' },
			{ '.', 'X', '.' },
			{ 'F', '.', 'F' },
		};
	public static char[][] bend = {
			{ 'F', '.', '.' },
			{ 'F', '.', '.' },
			{ 'X', 'X', 'X' },
		};
	public static char[][] arrow = {
			{ 'S', '.', 'W' },
			{ 'S', 'W', '.' },
			{ 'S', 'S', 'S' },
		};
}