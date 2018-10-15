package ParkingLot;

public class Moto extends Vehicule {

	public Moto(String iImat) {
		super(iImat);
		_Type=VehiculeType.moto;
	}

	public String getType() {return "Moto";}
	
}
