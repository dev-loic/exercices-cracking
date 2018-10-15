package CallCenter;

public class Respondent extends Employee {

	static int NB_CREATED_RESPONDENTS = 0;
	// Respondent

	public Respondent() {
		NB_CREATED_RESPONDENTS++;
		this._Name = "Respondent"+NB_CREATED_RESPONDENTS;
		this._Rank = Rank.respondent;
	}

}
