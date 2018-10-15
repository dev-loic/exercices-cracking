package Part2;

public class Ex22 {
	
	// Remove duplicates
	public static void main(String[] args) {
		SimplyLinkedList list1 = new SimplyLinkedList();
		list1.insertAtTail(1);
		list1.insertAtTail(2);
		list1.insertAtTail(3);
		list1.insertAtTail(4);
		list1.insertAtTail(5);
		System.out.println(list1);
		//System.out.println(subList(list1,2));
		//System.out.println(subList(list1,2).size);
		fromLastElem(list1.head,6);
		
	}
	
	// Return the kth to last element
	// If we know the size then it s easy (have to find the (length-k)th element. 
	// Lets assume we dont know the size ==> a recursive implementation seems the best one
	

	
	static int fromLastElem(SimplyLinkedListNode iHead, int k)
	{
		if(iHead==null)
			return 0;
		
		int counter = 1 + fromLastElem(iHead.next,k);
		if(counter==k)
		{
			System.out.println(iHead.data);
		}
		return counter;
	}
	
	// Return elements from kth to last
	static SimplyLinkedList subList(SimplyLinkedList iListToTruncate, int iFrom)
	{
		SimplyLinkedList sublistToOutput = new SimplyLinkedList();
		SimplyLinkedListNode curNode = iListToTruncate.head;
		
		if(iListToTruncate.size>=iFrom)
		{
			int counterPosition = 0;		
			while(counterPosition!=iFrom)
			{
				curNode = curNode.next;
				counterPosition++;
			}
		}
		sublistToOutput.head = curNode;
		sublistToOutput.size = iListToTruncate.size-iFrom;
		
		return sublistToOutput;
	}
	
}
