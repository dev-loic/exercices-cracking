package ParkingLot;

public abstract class Vehicule {
	
	// Donnees membres
	private String _Immatriculation;
	protected VehiculeType _Type;
	
	// VehiculeType
	protected enum VehiculeType
	{
		moto,
		voiture,
		camion
	}

	// Constructors
	public Vehicule (String iImat)
	{
		_Immatriculation=iImat;
	}
	
	// Actions
	public String getImmatriculation() { return _Immatriculation; }
	
	public abstract String getType();
	
	
}
