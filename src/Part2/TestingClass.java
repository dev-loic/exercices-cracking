package Part2;

public class TestingClass {

	public static void main(String[] args) {
		SimplyLinkedList mySimplyLinkedList = new SimplyLinkedList();
		mySimplyLinkedList.insertAtTail(1);
		mySimplyLinkedList.insertAtTail(3);
		mySimplyLinkedList.insertAtTail(5);
		
		System.out.print(mySimplyLinkedList);
		
		System.out.println("\nDelete de 3 ==> Should work     : " + mySimplyLinkedList.delete(3));
		System.out.println("Delete de 4 ==> Should not work : " + mySimplyLinkedList.delete(4));
		
		System.out.print(mySimplyLinkedList);

	}

}
