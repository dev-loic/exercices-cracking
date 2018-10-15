package ParkingLot;

public class Camion extends Vehicule {

	public Camion(String iImat) {
		super(iImat);
		_Type=VehiculeType.camion;
	}

	public String getType() {return "Camion";}
}
