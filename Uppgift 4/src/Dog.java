public class Dog extends Mamal {

	private String loyal;

	public Dog(String latinName, int nursingTime, String loyal) {
		super(latinName, nursingTime);
		this.loyal = loyal;

	}

	public String getLoyal() {
		return loyal;
	}

	public void set_loyal(String loyal) {
		this.loyal = loyal;

	}

	public String getInfo() {

		return "The dogs name is " + super.get_latinName() + " and "
				+ "nurses for " + get_nursingTime() + " weeks. " + "It also "
				+ getLoyal() + " loyal.";
	}

}
