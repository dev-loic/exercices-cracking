package CallCenter;

import CallCenter.Employee.Rank;

public class Call {
	
	// Donnees membres
	private Caller _Caller;
	private Employee _CurrentHandler;
	private Rank _MinRankEmployee;
	
	// Constructors
	public Call(Rank iRank)
	{
		_Caller = new Caller();
		_MinRankEmployee=iRank; 
	}
	
	public Call()
	{
		this(Rank.respondent);
	}
	
	// Caller : person who call
	static private int countCallers = 0;
	public class Caller {		
		String name;
		public Caller() 
		{
			countCallers++;
			name = "Caller"+countCallers;
		}
	}	
	public Caller getCaller()
	{
		return _Caller;
	}
	
	// Handler
	public Employee getCurrentHandler()
	{
		return _CurrentHandler;
	}
	
	// Who takes this call in charge
	public void setHandler(Employee iHandler)
	{
		// we suppose handler has the right rank as it should be adressed in the CallsHandler the right way.
		_CurrentHandler=iHandler;
	}
	
	

	
}
