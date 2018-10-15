package CallCenter;

public class Manager extends Employee {

	static int NB_CREATED_MANAGERS = 0;

	public Manager() {
		NB_CREATED_MANAGERS++;
		this._Name = "Manager"+NB_CREATED_MANAGERS;
		this._Rank = Rank.manager;
	}

}
