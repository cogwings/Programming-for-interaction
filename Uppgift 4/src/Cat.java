public class Cat extends Mamal {

	private String lands;

	public Cat(String latinName, int nursingTime, String lands) {
		super(latinName, nursingTime);
		this.lands = lands;
	}

	public String get_lands() {
		return lands;
	}

	public void set_lands(String lands) {
		this.lands = lands;

	}

	@Override
	public String getInfo() {

		return "The cats name is " + super.get_latinName() + " and nurses "
				+ get_nursingTime() + " weeks." + " It also " + get_lands();
	}

}
