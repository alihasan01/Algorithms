package chapter1.problem8.source;

public class Question8_ZeroMatrix {

	public static void main(String[] args)
	{
		int[][]matrix = {{1,0,4 ,5},{4,5,6,7},{8,9,0,8}};
		Question8_ZeroMatrix caller = new Question8_ZeroMatrix();
		int [][]result =  caller.zeroMatrix(matrix);
		for (int i = 0 ; i < result.length ; i++)
		{
			for (int j = 0 ; j < result[0].length ; j++)
			{
				System.out.print(result[i][j]);
			}
			System.out.println();
		}
	}
	public int[][] zeroMatrix(int [][]matrix )
	{
		boolean []rows = new boolean[matrix.length];
		boolean []cols = new boolean[matrix[0].length];
		System.out.println(matrix.length + " " + matrix[0].length);
		for (int i = 0 ; i < matrix.length ; i++ )
		{
			for (int j = 0 ; j < matrix[0].length ; j++)
			{
				if (matrix[i][j] == 0)
				{
					rows[i] = true;
					cols[j] = true;
				}
			}
		}
		for (int i = 0 ; i < rows.length  ; i++)
		{
			if (rows[i])
				rowNull(matrix , i);
		}
		for (int i = 0 ; i < cols.length  ; i++)
		{
			if (cols[i])
				colNull(matrix , i);
		}
		return matrix;
	}
	public int[][] rowNull(int [][]matrix , int row)
	{
		for (int j = 0 ; j < matrix[0].length ; j++)
		{
			matrix[row][j] = 0;
		}
		return matrix;
	}
	public int[][] colNull(int [][]matrix , int col)
	{
		for (int j = 0 ; j < matrix.length ; j++)
		{
			matrix[j][col] = 0;
		}
		return matrix;
	}

}
