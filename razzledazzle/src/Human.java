
public class Human {

	
	
	private Dog dog;
	
	private String name;
	
	public Human(String name){

	this.name = name;
	
	}
	public String getName(){
		return name;
	}
	
	public void buyDog(Dog viff){
		this.dog = viff;
	}
	
	
	public String getInfo(){
		String info = "oookkokok";
		info = ""+this.name + "äger en hund som heter" + dog.getName();
		return info;
	}
}
