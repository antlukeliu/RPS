
public class Self extends Player{
	
	public Self (String name, Roshambo value){
		super(name, value);
	}

	@Override
	public Roshambo generateRoshambo() {
		
		return Roshambo.PAPER;
	}

}
