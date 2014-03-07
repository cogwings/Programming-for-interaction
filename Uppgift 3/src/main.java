import java.util.ArrayList;


public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Bike> bList = new ArrayList<Bike>();
		Bike bike1 = new Bike("Green", 30,1000);

		Bike bike2 = new Bike("blue", 20,500);

		Bike bike3 = new Bike("blue", 34,1000);

		Bike bike4 = new Bike("red", 26,2000);

		Bike bike5 = new Bike("black", 34,3560);

		Bike bike6 = new Bike("yellow", 18,2000);

		Bike bike7 = new Bike("pink", 26,1000);

		Bike bike8 = new Bike("white", 26,2000);

		Bike bike9 = new Bike("brown", 24,1500);

		Bike bike10 = new Bike("grey", 28,1000);

		bList.add(bike1);
		bList.add(bike2);
		bList.add(bike3);
		bList.add(bike4);
		bList.add(bike5);
		bList.add(bike6);
		bList.add(bike7);
		bList.add(bike8);
		bList.add(bike9);
		bList.add(bike10);

		for(int i = 0; i<bList.size(); i++){
			System.out.println(bList.get(i).getSize() + "\t " + bList.get(i).getColor() + " \t "+bList.get(i).setPrice());
		}
		///Bikestore
		BikeStore myBikeStore = new BikeStore();
		
		String s = myBikeStore.getAllBikes();
		System.out.println("all bikes");
		System.out.println(s);
		
		

	}

}