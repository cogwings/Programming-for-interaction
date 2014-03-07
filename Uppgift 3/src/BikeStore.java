import java.util.ArrayList;


public class BikeStore {

	
	ArrayList<Bike> bikes = new ArrayList<Bike>();
	
	
	
	public String getAllBikes(){
	String s = "";
	for(int i = 0; i <bikes.size(); i++){
		Bike bikeboing = bikes.get(i);
	s = s+ "färgen på cyckeln är: " + bikeboing.getColor() + "\t storleken på däcket är:" + bikeboing.getSize() +"\t Priset på cyckeln är: "+ bikeboing.setPrice()+"\n";
	}
	return s;
	
	
		
		
	}
	
	public void addBike( String col, int si, int pri){
	
	bikes.add(new Bike(col, si,pri));	
		
		
		
	}
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

