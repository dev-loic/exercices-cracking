package ParkingLot;

public class Place {
	
	// Donnees membres
	// On définit un char pour une question d'espace mémoire
	// Si on veut créer un parking de plusieurs étage ou avec plus de 26 allées ('A'->'Z'), on fera évoluer notre objet
	private char _Allee;
	private int _NumPlace;
	private Vehicule.VehiculeType _MaxAuthorizedType;
	private Vehicule _CurrentVehicule;
	
	// Constructor
	public Place(char iAllee, int iNumPlace)
	{
		 this(iAllee, iNumPlace, Vehicule.VehiculeType.voiture);
	}
	public Place(char iAllee, int iNumPlace, Vehicule.VehiculeType iVehiculeType)
	{
		_Allee=iAllee;
		_NumPlace=iNumPlace;
		_MaxAuthorizedType = iVehiculeType;
		_CurrentVehicule=null;
	}
	
	// Actions
	protected void setAllee(char iAllee) { _Allee=iAllee; }
	protected void setNumPlace(int iNumPlace) { _NumPlace=iNumPlace; }
	public char getAllee() { return _Allee; }
	public int getNumPlace() { return _NumPlace; }
	
	public boolean setVehicule(Vehicule iVehicule)
	{
		boolean isVehiculeParked = true;
		
		// on check que la place est libre
		if(null!=getCurrentVehicule())
		{
			System.out.println("La place ("+_Allee+_NumPlace+") n'est pas libre.");
			isVehiculeParked=false;
		}
		// on check que le type du vehicule est OK
		if(_MaxAuthorizedType.ordinal()<iVehicule._Type.ordinal())
		{
			System.out.println("La place ("+_Allee+_NumPlace+") ne peut pas accueillir de " + iVehicule.getType());
			isVehiculeParked=false;	
		}				
		else
		{
			System.out.println("Le/La "+ iVehicule.getType() + " immatriculé(e) "+iVehicule.getImmatriculation()+" est maintenant garé sur la place ("+_Allee+_NumPlace+").");
			_CurrentVehicule = iVehicule;
		}
		
		return isVehiculeParked;
	}
	
	public Vehicule getCurrentVehicule()
	{
		return _CurrentVehicule;
	}

}
