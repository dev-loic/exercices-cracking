package CallCenter;
import java.util.ArrayList;

import CallCenter.Employee.Rank;

public class CallsHandler {
	
	int NB_RESPONDENTS;
	int NB_MANAGERS;
	
	public CallsHandler(int nbRespondents, int nbManagers)
	{
		this.NB_RESPONDENTS = nbRespondents;
		this.NB_MANAGERS = nbManagers;
	}
	
	// listEmployees[0] = respondents
	// listEmployees[1] = managers
	// listEmployees[2] = director
	ArrayList<ArrayList<Employee>> listEmployees;
	
	// Initialize listEmployees
	public void initListEmployees()
	{
		listEmployees = new ArrayList<ArrayList<Employee>>();
		ArrayList<Employee> respondents = new ArrayList<Employee>();
		listEmployees.add(respondents);
		ArrayList<Employee> managers = new ArrayList<Employee>();
		listEmployees.add(managers);
		ArrayList<Employee> directors = new ArrayList<Employee>();
		listEmployees.add(directors);
		// Respondents
		for(int i=0;i<NB_RESPONDENTS;i++)
		{
			Employee curEmployee = new Respondent();
			listEmployees.get(0).add(curEmployee);
		}
		
		// Managers
		for(int i=0;i<NB_MANAGERS;i++)
		{
			Employee curEmployee = new Manager();
			listEmployees.get(1).add(curEmployee);
		}
		
		// Director
		Employee director = new Director();
		listEmployees.get(2).add(director);
	}
	
	public void HandleCall(Call iCall)
	{
		//Call curCall = new Call();
		Employee employeeAvailable = dispatchCall(iCall);
		if(null!=employeeAvailable)
		{
			iCall.setHandler(employeeAvailable);
			employeeAvailable.setCurrentCall(iCall);
			
			// Display some informations
			System.out.println("Call from " + iCall.getCaller().name + " is handled by " + employeeAvailable._Name);
		}
		else
		{
			System.out.println("On queue le call !");
			// TO DO
		}
	}
	
	private Employee dispatchCall(Call iCall)
	{
		int nbRanks = listEmployees.size();
		Employee outputEmployee = null;

		// on recherche parmi les employees
		for(int i=0;i<nbRanks;i++)
		{
			int nbEmployees = listEmployees.get(i).size();
			Employee curEmployee = null;
			boolean foundEmployee = false;
			for(int j=0;j<nbEmployees;j++)
			{
				curEmployee = listEmployees.get(i).get(j);
				
				if(curEmployee.isFree())
				{
					outputEmployee=curEmployee;
					foundEmployee=true;
				}
				if(foundEmployee) break;
			}
			if(foundEmployee) break;
		}
		return outputEmployee;
	}
	
	ArrayList<ArrayList<Call>> listCalls;
	
}
