
public abstract class Player {
	String name;
	Roshambo value;//Roshambo whatever they pick
	
	public Player(String name, Roshambo value){
		this.name = name;
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Roshambo getValue() {
		return value;
	}

	public void setValue(Roshambo value) {
		this.value = value;
	}
	
	public static Roshambo generateRoshambo(char rps){
		if(rps == 'r'){
			return Roshambo.ROCK;
		}else if(rps == 's'){
			return Roshambo.SCISSORS;
		}else{
			return Roshambo.PAPER;
		}
	}
}

