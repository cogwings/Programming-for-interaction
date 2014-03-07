
public class Bike {


	private String color;
	private int price;

	private int size;
	private static int nbrOfBikes;
	//wated ffs

	/** Shows a bike depending on the limitations */
	public Bike(String _color, int _size){
		this( _color,  _size, 0);
	}

	/** gets the differnt colors avairable and displays them by return*/
	public String getColor(){
		return color;
	}

	/**gets the size and returns the value */
	public int getSize(){
		return size;
	}

	/** creates a bike with limitations */
	public Bike(String _color, int _size, int _price){

		color = Constants.bikeCon(_color);
		
		/**Shows the size if it is between the limitations, otherwise it shows 0 */	
		if(_size > Constants.MIN_SIZE && _size < Constants.MAX_SIZE){
			size = _size;
		}else{
			_size = 0;
		}
		/**shows the price if it is between the limitations, otherwise it shows 0 */
		if(_price > Constants.MIN_PRICE && _price < Constants.MAX_PIRCE){
			price= _price;
		}else{
			_price= 0;
		}
		nbrOfBikes ++;
	}
	/** Returns and shows the price of the bike*/
	public int setPrice(){
		return price;
	}
	
	public static int getNbrOfBikes(){
		return nbrOfBikes;
	}
}



