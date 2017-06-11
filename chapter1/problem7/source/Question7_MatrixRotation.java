package chapter1.problem7.source;

public class Question7_MatrixRotation {
	
	public static void main(String[] args)
	{
		Question7_MatrixRotation caller = new Question7_MatrixRotation();
		int[][]mat = {{1,2,3},{4,5,6},{7,8,9}};
		for (int i = 0 ; i < 3 ; i++)
		{
			for (int j = 0 ; j < 3 ; j++)
			{
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
		caller.MatrixRotation(mat);
		
	}
	
	public void MatrixRotation(int[][]matrix)
	{
		System.out.println("After rotaion : ");
		int len = matrix.length;
		for (int layer = 0 ; layer < len/2 ; layer++)
		{
			int first = layer;
			int last = len - 1 - layer;
			for (int i = first ; i < last ; i++)
			{
				int offset = i - first;
				int top = matrix[first][i];
				matrix[first][i] = matrix[last - offset ][first];
				matrix[last - offset ][first] = matrix[last ][last - offset];
				matrix[last ][last - offset ] = matrix[i][last];
				matrix[i][last] = top; 
						
			}
			
		}
		
		for (int i = 0 ; i < 3 ; i++)
		{
			for (int j = 0 ; j < 3 ; j++)
			{
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

}
