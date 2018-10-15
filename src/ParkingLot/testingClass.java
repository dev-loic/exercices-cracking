package ParkingLot;

import ParkingLot.Parking.PlaceOutOfRangeException;

public class testingClass {

	public static void main(String[] args) {
		Parking myParking = new Parking();
		Vehicule voiture1 = new Voiture("AA534BB");
		Vehicule moto1 = new Moto("CC765EE");
		Vehicule camion1 = new Camion("RR768LL");
		
		try {
			myParking.parkAVehicule(voiture1, 'B', -1);
		} catch (PlaceOutOfRangeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			myParking.parkAVehicule(moto1, 'A', 1);
		} catch (PlaceOutOfRangeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			myParking.parkAVehicule(camion1,'A', 15);
		} catch (PlaceOutOfRangeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		int i = 1/0;
		System.out.println(i);
		
	}

}
