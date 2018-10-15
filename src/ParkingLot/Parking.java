package ParkingLot;

import java.util.ArrayList;

public class Parking {
	
	
	// Donnees membres
	private int _NB_LANES;
	private int _NB_PLACES_PER_LANE;
	private ArrayList<ArrayList<Place>> _ListPlaces; 
	
	// Constructor
	//public Parking(int iNbLanes, int iNbPlacesPerLane)
	public Parking()
	{
		_NB_LANES=10; // 'A' -> 'J'
		_NB_PLACES_PER_LANE=20;
		initPlaces();
	}
	
	// Init places
	private void initPlaces()
	{
		_ListPlaces = new ArrayList<ArrayList<Place>>();
		
		
		Place curPlace = null;
		for(int i=0;i<_NB_LANES;i++)
		{
			ArrayList<Place> curList = new ArrayList<Place>();
			_ListPlaces.add(curList);
			char curLane = (char)('A'+i);
			for(int j=0;j<_NB_PLACES_PER_LANE;j++)
			{
				// Considering alors the first place of a rank is a place for moto
				if(0==j)
				{
					curPlace = new Place(curLane,j,Vehicule.VehiculeType.moto);
				}
				else
				{
					curPlace = new Place(curLane,j);
				}
				_ListPlaces.get(i).add(curPlace);
			}
		}
	}
	
	// Actions
	public boolean parkAVehicule(Vehicule iVehicule, char iLane, int iNumPlace)
	throws PlaceOutOfRangeException
	{
		int laneIdentifier=(int)(iLane-'A');
		
		if(iNumPlace<0 || iNumPlace>_NB_PLACES_PER_LANE)
		{
			throw new PlaceOutOfRangeException(iNumPlace);
		}
		else {
			return _ListPlaces.get(laneIdentifier).get(iNumPlace).setVehicule(iVehicule);
		}		
	}
	
	class PlaceOutOfRangeException extends Exception
	{
		/**
		 * 
		 */
		private static final long serialVersionUID = 7167554374013588221L;

		PlaceOutOfRangeException(int iNumPlace)
		{
			System.out.println("La place "+ iNumPlace + " n'existe pas !");
		}
	}

}
