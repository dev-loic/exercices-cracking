package Part2;

public class Ex23 {

	public static void main(String[] args) {
		SimplyLinkedList list1 = new SimplyLinkedList();
		list1.insertAtTail(1);
		list1.insertAtTail(2);
		list1.insertAtTail(3);
		list1.insertAtTail(4);
		list1.insertAtTail(5);
		
	}
	
	// Delete a node in the middle of the list 
	// INPUT : Node to delete
	static boolean killTheManInTheMiddle(SimplyLinkedListNode iNodeToDelete)
	{
		
		boolean output = false;
		
		// as its not the head or the tail, testing null pointers is not necessary but better tout de même
		if(null==iNodeToDelete || null==iNodeToDelete.next)
			output = false;
		else
		{
			iNodeToDelete.data = iNodeToDelete.next.data;
			iNodeToDelete.next = iNodeToDelete.next.next;
		}

		return output;		
	}
	
}
