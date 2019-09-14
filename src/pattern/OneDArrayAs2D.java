package pattern;

public class OneDArrayAs2D {
	
	private static final String nullCharachter =".";
	
	//sample converted one dimentional pattern (pattern1)
	//private static final char[] pattern1dSample = { 'F', '.', 'F','.','.','.','.','.','.', 'X', '.','.','.','.','.','.','F', '.', 'F'};

	public static void main(String[] args) {
		int result = -1;
		
		int width = SamplePatternAndMatrices.matrix1[0].length;
		StringBuffer pattern1d = Convert2DPatternTo1dPattern( SamplePatternAndMatrices.cross, SamplePatternAndMatrices.matrix1[0].length - SamplePatternAndMatrices.cross[0].length, nullCharachter);
		StringBuffer matrix1d = convert2DTo1DArray(SamplePatternAndMatrices.matrix1);		
		result = new KMP_String_Matching().KMPSearch(pattern1d.toString(), matrix1d.toString(), nullCharachter);
		if(result!= -1) {
			int x = result / width;
			int y = result % width;
			System.out.println("There is a cross pattern in martix 1: ("+ x +","+ y+")");
		}
		else
			System.out.println("There is no match");
		
		//---------------------------------------------------------------------------------------------------
		result = -1;
		width = SamplePatternAndMatrices.matrix2[0].length;
		pattern1d = Convert2DPatternTo1dPattern( SamplePatternAndMatrices.arrow, SamplePatternAndMatrices.matrix2[0].length - SamplePatternAndMatrices.arrow[0].length, nullCharachter);
		matrix1d = convert2DTo1DArray(SamplePatternAndMatrices.matrix2);
		result = new KMP_String_Matching().KMPSearch(pattern1d.toString(), matrix1d.toString(), nullCharachter);
		if(result!= -1) {
			int x = result / width;
			int y = result % width;
			System.out.println("There is a arrow pattern in matrix 2: ("+ x +","+ y+")");
		}
		else
			System.out.println("There is no match in");
		//---------------------------------------------------------------------------------------------------
		result = -1;
		width = SamplePatternAndMatrices.matrix3[0].length;
		pattern1d = Convert2DPatternTo1dPattern( SamplePatternAndMatrices.arrow, SamplePatternAndMatrices.matrix3[0].length - SamplePatternAndMatrices.arrow[0].length, nullCharachter);
		matrix1d = convert2DTo1DArray(SamplePatternAndMatrices.matrix3);
		result = new KMP_String_Matching().KMPSearch(pattern1d.toString(), matrix1d.toString(), nullCharachter);
		if(result!= -1) {
			int x = result / width;
			int y = result % width;
			System.out.println("There is a arrow pattern in matrix 3: "+ x +","+ y);
		}
		else
			System.out.println("There is no match in matrix 3");
		
		//---------------------------------------------------------------------------------------------------
		result = -1;
		width = SamplePatternAndMatrices.matrix4[0].length;
		pattern1d = Convert2DPatternTo1dPattern( SamplePatternAndMatrices.bend, SamplePatternAndMatrices.matrix4[0].length - SamplePatternAndMatrices.arrow[0].length, nullCharachter);
		matrix1d = convert2DTo1DArray(SamplePatternAndMatrices.matrix4);
		result = new KMP_String_Matching().KMPSearch(pattern1d.toString(), matrix1d.toString(), nullCharachter);
		if(result!= -1) {
			int x = result / width;
			int y = result % width;
			System.out.println("There is a bend pattern in matrix 4: ("+ x +","+ y+")");
		}
		else
			System.out.println("There is no match in matrix 4");
	}
	
	// convert 2d to 1d array
	private static StringBuffer convert2DTo1DArray(char[][] matrix) {
		StringBuffer flattenMatrix= new StringBuffer();
	    for (int i = 0; i < matrix.length; i++) {
	        for (int j = 0; j < matrix[i].length; j++) { 
	            flattenMatrix.append(matrix[i][j]);
	        }
	    } 
        return flattenMatrix;
	}
	
	public static StringBuffer Convert2DPatternTo1dPattern(char[][] pattern, int count, String nullCharachter)
	{
		StringBuffer flattenPattern= new StringBuffer();
	    for (int i = 0; i < pattern.length; i++) {
	        for (int j = 0; j < pattern[i].length; j++) { 
	            flattenPattern.append(pattern[i][j]);
	            if(j== pattern[i].length-1 && i!=pattern.length-1)
	            	flattenPattern.append(new String(new char[count]).replace("\0", nullCharachter)); 
	        }
	    }
        return flattenPattern;
	}
}
