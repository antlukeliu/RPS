
public class Animal extends Player{

	public Animal(String name, Roshambo value){
		super(name, value);
		
	}

	public String getName() {
		return name;
	}

	public void setName() {
		name = "Robot";
	}
	
	public Roshambo getValue() {
		return value;
	}

	public void setValue() {
		value = Roshambo.ROCK;
	}
	
	@Override
	public Roshambo generateRoshambo() {
		return Roshambo.SCISSORS;
	}
	
}
