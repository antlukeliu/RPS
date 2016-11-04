import java.util.Random;

public class Animal extends Player{

	public Animal(String name, Roshambo value){
		super(name, value);
	}

	public String getName() {
		return name;
	}

	public void setName() {
		name = "Winnie the Pooh";
	}
	
	public Roshambo getValue() {
		return value;
	}

	public void setValue() {
		value = generateRoshambo();
	}
	
	@Override
	public Roshambo generateRoshambo() {
		Random rd = new Random();
		int i = rd.nextInt(3) +1;
		if(i == 1){
			return Roshambo.PAPER;
		}else if (i==2){
			return Roshambo.SCISSORS;
		}else return Roshambo.ROCK; 
	}
	
}
