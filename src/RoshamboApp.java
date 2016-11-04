import java.util.Scanner;

public class RoshamboApp {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to Rock Paper Scissors: ");
		RPSValidator val = new RPSValidator();
		boolean cont = true;
		System.out.print("Enter your name: ");
		String name = scan.nextLine();
		
		do{
		
		char choosingOpp = val.PlayerVal();
		char rps = val.RPSVal();
		Roshambo value = getPlayerValue(rps); 
		
		Player player = new Self(name, value);
		Player opponent = getOpponent(choosingOpp);
		String opp;
		
		
		opponent.setValue();
		
		System.out.println("Player choice: "+player.getValue());
		System.out.println( " choice: "+opponent.getValue());
		compare(player.getName(), opponent.getName(), player.getValue(), opponent.getValue());
		char resp = val.YesOrNo();
		cont = val.loopingAgain(resp);
		}while(cont);
		val.exitting(cont);

	}
	//Player2 "Robot" choice2 = "Rock"
	//Replace String value with enum value later
	public static void compare(String Player1, String Player2, Roshambo choice1, Roshambo choice2){
		
		//combination of paper and rock
		//paper wins so we would say player 1 wins
		//if choices are paper and rock will be true
		
		if((choice1==Roshambo.PAPER && choice2==Roshambo.ROCK) 
				||(choice1==Roshambo.ROCK && choice2==Roshambo.SCISSORS)
				||(choice1==Roshambo.SCISSORS && choice2==Roshambo.PAPER)){
				System.out.println(Player1 + " wins");}
		else if(choice1==choice2){
			System.out.println("Draw");
		}else{
			System.out.println(Player2 + " wins");
		}	
		}
	
	public static Roshambo getPlayerValue(char rps){
		if (rps == 'r'){
			return Roshambo.ROCK;
		}else if (rps == 's'){
			return Roshambo.SCISSORS;
		}else{
			return Roshambo.PAPER;
		}
	}
	
	public static Player getOpponent(char choosingOpp){
		Player opponent;
		if (choosingOpp == 'r'){
			opponent = new Robot("Robot", Roshambo.PAPER);
		} else{
			opponent = new Animal("Animal", Roshambo.PAPER);
		}
		return opponent;
	}
}

