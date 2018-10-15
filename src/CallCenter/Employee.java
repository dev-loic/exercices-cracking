package CallCenter;

public abstract class Employee {
	
	// Donnees membres
	protected String _Name;
	protected Rank _Rank;
	private Call _CurrentCall;
	
	public Employee()
	{
		
	}
	
	// Name of the employee
	
	public String getName()
	{
		return _Name;
	}
	
	// Call employee is currently handling (null if free)
	public boolean isFree()
	{
		return _CurrentCall==null?true:false;
	}
	public void setCurrentCall(Call iCall)
	{
		_CurrentCall=iCall;
	}
	
	// Can be null
	public Call getCurrentCall()
	{
		return _CurrentCall;
	}
	
	// Rank of the employee
	// Not every employee can handle every call => see Call.minimalRank
	public enum Rank
	{
		respondent,
		manager,
		director
	};
	
}
