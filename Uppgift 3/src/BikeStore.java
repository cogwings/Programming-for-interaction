import java.util.ArrayList;


public class BikeStore {

	
	ArrayList<Bike> bikes = new ArrayList<Bike>();
	
	
	
	public String getAllBikes(){
	String s = "";
	for(int i = 0; i <bikes.size(); i++){
		Bike bikeboing = bikes.get(i);
	s = s+ "f�rgen p� cyckeln �r: " + bikeboing.getColor() + "\t storleken p� d�cket �r:" + bikeboing.getSize() +"\t Priset p� cyckeln �r: "+ bikeboing.setPrice()+"\n";
	}
	return s;
	
	
		
		
	}
	
	public void addBike( String col, int si, int pri){
	
	bikes.add(new Bike(col, si,pri));	
		
		
		
	}
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

