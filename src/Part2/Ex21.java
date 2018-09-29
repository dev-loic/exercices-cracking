package Part2;

public class Ex21 {
	
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
	
	static void removeDupsWithoutCache(SimplyLinkedList iList)
	{
		SimplyLinkedListNode currentNode = iList.head;
		
		while(currentNode!=null)
		{
			SimplyLinkedListNode runner = currentNode;
			while(runner.next!=null)
			{
				if(runner.next.data==currentNode.data)
				{
					iList.deleteNode(runner);
				}
				else
				{
					runner = runner.next;
				}
			}	
			currentNode=currentNode.next;
		}
	}

	
}
