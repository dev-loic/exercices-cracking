package Part2;

public class Ex22 {
	
	// Remove duplicates
	public static void main(String[] args) {
		SimplyLinkedList list1 = new SimplyLinkedList();
		list1.insertAtTail(1);
		list1.insertAtTail(2);
		list1.insertAtTail(1);
		list1.insertAtTail(1);
		list1.insertAtTail(1);
		list1.insertAtTail(1);
		list1.insertAtTail(1);
		list1.insertAtTail(3);
		list1.insertAtTail(1);
		list1.insertAtTail(1);
		list1.insertAtTail(1);
		list1.insertAtTail(1);
		list1.insertAtTail(3);
		list1.insertAtTail(2);
		System.out.println(list1);
		
		removeDupsWithoutCache(list1);
		System.out.println(list1);
		
	}
	
	static SimplyLinkedList subList(SimplyLinkedList iListToTruncate, int iFrom)
	{
		
		if(iListToTruncate.size>=iFrom)
		{
			
		}
	}

}
