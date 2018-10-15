package Part1;

public class Ex17 {

	
	public static void main(String[] args) {
		
		int [][] test1 = {{1,0},{1,1}};
		printImage(test1);
		System.out.println();
		//printImage(rotateMatrix(test1));
		
		System.out.println();
		
		int [][] test2 = {{1,1,1},{0,1,1},{0,1,1}};
		printImage(test2);
		System.out.println();
		//printImage(rotateMatrix(test2));
		
		int [][] test3 = {{1,0,1,0},{0,1,0,0},{0,0,1,0},{1,0,0,1}};
		printImage(test3);
		System.out.println();
		printImage(rotateMatrix(test3));
		
	}
	
	// let's assume the image is in black and white (only containing 1 and 0)
	static int [][] rotateMatrix(int [][] iImage)
	{
		// GOAL : rotate the image by 90 degrees
		// Solution : use a recursive algorithm
		int nbLines = iImage.length;
		int nbCols = 0;
		
		if(nbLines>0) 
		{
			nbCols=iImage[0].length;
		}
		
		
		// Image is NxN so nbCols==nbLines
		if(nbLines==1 || nbLines==0)
		{
			return iImage;
		}
		else
		{
			int [] [] outputImage = new int [nbLines][nbCols];
			
			for(int i=0;i<nbCols;i++)
			{
				// 1st row ==> last column 
				outputImage[i][nbCols-1]=iImage[0][i];
				// last row ==> first col
				outputImage[i][0] = iImage[nbLines-1][i];
			}
			
			// Then we switch row and column for remaining exterior values
			// let's go through the first row and switch with elements in the first column
			// same for last line and last column
			for(int i=1;i<nbCols-1;i++)
			{
				// First line / First column
				outputImage[0][i]=iImage[i][0];
				// Last line / Last Column
				outputImage[nbLines-1][i]=iImage[i][nbLines-1];
			}
			
			// inside matrix is computed recursively
			int [] [] insideImage = new int[nbLines-2][nbCols-2];
			for (int i=1;i<nbLines-1;i++)
			{
				for (int j=1;j<nbLines-1;j++)
				{
					insideImage[i-1][j-1]=iImage[i][j];
				}
			}
			insideImage = rotateMatrix(insideImage);
			
			for (int i=1;i<nbLines-1;i++)
			{
				for (int j=1;j<nbLines-1;j++)
				{
					outputImage[i][j]=insideImage[i-1][j-1];
				}
			}	
			
			
			return outputImage;
		}
	}
	
	static void printImage(int [][] iImage)
	{
		int nbLines = iImage.length, nbCols = iImage[0].length;
		for (int i=0;i<nbLines;i++)
		{
			for (int j=0;j<nbLines;j++)
			{
				System.out.print(iImage[i][j]+" ");
			}
			System.out.println();
		}	
	}
	
}
