public abstract class Animal {

	private String _latinName;

	public Animal(String latinName) {
		// set_LatinName(_latinName );
		this._latinName = latinName;
	}

	public String get_latinName() {
		return _latinName;
	}

	public void set_LatinName(String latinName) {
		this._latinName = latinName;

	}

	public abstract String getInfo();

}
