package Part2;

public class SimplyLinkedList {
	public SimplyLinkedListNode head;
	public int size;
	
	public SimplyLinkedList()
	{
		head = null;
		size = 0;
	}
	
	///// INSERT
	// Insert at tail
	void insertAtTail(int iData)
	{
		insertAtPosition(iData,size);
	}
	
	// Insert at a specified position
	void insertAtPosition(int iData, int iPosition)
	{
		SimplyLinkedListNode newSimplyLinkedListNode = new SimplyLinkedListNode(iData);
			
		if(null==head)
		{
			head = newSimplyLinkedListNode;
		}
		else
		{
			if(0==iPosition)
			{
				newSimplyLinkedListNode.next = head;
			}
			else
			{
				SimplyLinkedListNode curNode = head;
				int countPosition = 0;
				while(countPosition<iPosition-1)
				{
					curNode=curNode.next;
					countPosition++;
				}
				newSimplyLinkedListNode.next = curNode.next;
				curNode.next = newSimplyLinkedListNode;
			}
		}
		size++;
	}
	
	///// DELETE
	boolean delete(int iDataToDelete)
	{
		SimplyLinkedListNode curNode = head;
		SimplyLinkedListNode prevNode = null;
		boolean isDeleted = true;
		
		while(curNode.data!=iDataToDelete)
		{
			prevNode = curNode;
			curNode = curNode.next;
			if(curNode==null) 
			{
				isDeleted=false;
				break;
			}
		}
		
		if(isDeleted) deleteNode(prevNode);
		
		return isDeleted;
	}
	
	void deleteNode(SimplyLinkedListNode iNodePrevToDelete)
	{		
		SimplyLinkedListNode nodeToDelete = iNodePrevToDelete.next;
		
		// si on nous file un nodeToDelete null, rien à faire
		if(nodeToDelete!=null)
		{
			iNodePrevToDelete.next = nodeToDelete.next;
		}
		size--;
	}
	
	
	///// DISPLAY
	// Methode de display
	public String toString()
	{
		SimplyLinkedListNode curNode = head;
		String output;
		
		output = "\n(";
		do
		{
			output+=curNode.data + " , ";
			curNode=curNode.next;
		} while(curNode!=null);
		
		output+=")";
		
		return output;
	}

}


