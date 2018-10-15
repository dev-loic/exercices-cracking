package CallCenter;

public class testingClass {

	public static void main(String[] args) {
		CallsHandler myCallHandler = new CallsHandler(1,1);

		myCallHandler.initListEmployees();
		
		
		Call call1 = new Call();
		myCallHandler.HandleCall(call1);
		
		Call call2 = new Call();
		myCallHandler.HandleCall(call2);
		
		Call call3 = new Call();
		myCallHandler.HandleCall(call3);
		
		System.out.println();
	}

}
