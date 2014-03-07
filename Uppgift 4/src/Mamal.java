public abstract class Mamal extends Animal {

	private int _nursingTime;

	public Mamal(String latinName, int nursingTime) {
		super(latinName);
		this._nursingTime = nursingTime;
	}

	public int get_nursingTime() {
		return _nursingTime;
	}

	public void set_nursingTime(int nursingTime) {
		this._nursingTime = nursingTime;

	}

	public abstract String getInfo();

}
