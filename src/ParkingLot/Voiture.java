package ParkingLot;

public class Voiture extends Vehicule {

	public Voiture(String iImat) {
		super(iImat);
		_Type=VehiculeType.voiture;
	}
	
	public String getType() {return "Voiture";}

}
