package Moderate;

public class SmallestDifference {

	public static void main(String[] args) {
		int [] tabA = {1,3,15,11,2} ;
		int [] tabB = {23,127,235,19,8};
		
		// 1 - On trie chacun des tableaux
		int sizeA = tabA.length;
		for(int i=0;i<sizeA;i++)
			System.out.print(tabA[i]+ " | ");
		for(int i=0;i<sizeA;i++)
		{
			for(int j=sizeA-2;j>=i;j--)
			{
				if(tabA[j]>tabA[j+1])
				{
					// Swap
					tabA[j+1] = tabA[j] + tabA[j+1];
					tabA[j] = tabA[j+1] - tabA[j];
					tabA[j+1] = tabA[j+1] - tabA[j];
				}
			}
		}
		System.out.println();
		for(int i=0;i<sizeA;i++)
			System.out.print(tabA[i]+ " | ");
		
		int sizeB = tabB.length;
		System.out.println();
		for(int i=0;i<sizeB;i++)
			System.out.print(tabB[i]+ " | ");
		for(int i=0;i<sizeB;i++)
		{
			for(int j=sizeB-2;j>=i;j--)
			{
				if(tabB[j]>tabB[j+1])
				{
					// Swap
					tabB[j+1] = tabB[j] + tabB[j+1];
					tabB[j] = tabB[j+1] - tabB[j];
					tabB[j+1] = tabB[j+1] - tabB[j];
				}
			}
		}
		System.out.println();
		for(int i=0;i<sizeB;i++)
			System.out.print(tabB[i]+ " | ");

		
		// 2- Assemblage
		int iterA = 0, iterB = 0;
		int minDiff = Integer.MAX_VALUE, lastA = Integer.MAX_VALUE, lastB = Integer.MIN_VALUE, selectedA = 0, selectedB = 0;
		while(iterA!=sizeA && iterB!=sizeB)
		{
			// iterA et iterB se balace sur leur tableau respectifs
			if(tabA[iterA]<=tabB[iterB])
			{
				lastA=tabA[iterA];
				iterA++;
			}
			else 
			{
				lastB = tabB[iterB];
				iterB++;
			}
			int curDiff = Math.abs(lastA-lastB);
			// Si on a trouvé une différence plus petite, on stocke les infos dont on a besoin
			if(curDiff<minDiff)
			{
				selectedA = lastA;
				selectedB = lastB;
				minDiff=curDiff;
			}
		}
		
		System.out.println("("+selectedA+","+selectedB+")");
	}

}
