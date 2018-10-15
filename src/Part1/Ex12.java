package Part1;

public class Ex12 {
	
	public static void main(String[] args) {
		
		String test1a = "abc";
		String test1b = "bac";
		System.out.println("TEST1 : expected=true > computed="+arePermutations(test1a,test1b));
		
		String test2a = "aaabccc";
		String test2b = "cbaacac";
		System.out.println("TEST2 : expected=true > computed="+arePermutations(test2a,test2b));
		
		String test3a = "aaabccc";
		String test3b = "cbdacac";
		System.out.println("TEST2 : expected=false > computed="+arePermutations(test3a,test3b));
		
		String test4a = "";
		String test4b = "";
		System.out.println("TEST2 : expected=true > computed="+arePermutations(test4a,test4b));	
	}
	
	
	// Let's assume that iChaine1 and iChaine2 only contain 'a' to 'z' characters
	static boolean arePermutations(String iChaine1, String iChaine2)
	{
		boolean output = false;
		int [] refereeTab = new int [26];
		
		int size1 = iChaine1.length();
		int size2 = iChaine2.length();
		int sum = 0;
		
		if(size1==size2)
		{
			for (int i=0;i<size1;i++)
			{
				int curIndex1 = (int)(iChaine1.charAt(i)-'a');
				refereeTab[curIndex1]++;
				int curIndex2 = (int)(iChaine2.charAt(i)-'a');
				refereeTab[curIndex2]--;
			}
			
			for (int i=0;i<size1;i++)
				sum+=Math.abs(refereeTab[i]);
			
			if(0==sum) output = true;
		}
		
		
		return output;
	}

}
