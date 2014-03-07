public class Snake extends Animal {

	private String poisonous;

	public Snake(String latinName, String poisonous) {
		super(latinName);
		this.poisonous = poisonous;
	}

	public String getPoisonous() {
		return poisonous;
	}

	public String getInfo() {
		return "The snakes name " + super.get_latinName() + " and "
				+ getPoisonous() + " poisonous";
	}

	public void set_poisonous(String poisonous) {
		this.poisonous = poisonous;

	}

}
