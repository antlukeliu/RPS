
public class Robot extends Player{
//Always selects rock
	
	public Robot(String name, Roshambo value){
		super(name, value);
		
	}
	
	public String getName() {
		return name;
	}

	public void setName() {
		name = "Android3000";
	}
	
	public Roshambo getValue() {
		return value;
	}

	public void setValue() {
		value = Roshambo.ROCK;
	}
	
	public Roshambo generateRoshambo(){
		return Roshambo.ROCK;
	}
}
