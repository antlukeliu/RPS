import java.util.Scanner;

public class RoshamboApp {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to Rock Paper Scissors: ");
		RPSValidator val = new RPSValidator();
		boolean cont = true;
		System.out.print("Enter your name: ");
		String name = scan.nextLine();
		
		char choosingOpp = val.PlayerVal();
		Player opponent = getOpponent(choosingOpp);
		
		int playCount = 0;
		int oppCount = 0;
		int drawCount = 0;
		do{
		
		char rps = val.RPSVal();
		Roshambo value = getPlayerValue(rps); 
		Player player = new Self(name, value);
		
		opponent.setName();
		opponent.setValue();
		Roshambo ch1 = player.getValue();
		Roshambo ch2 = opponent.getValue();
		
		System.out.println("\nPlayer choice: "+ch1);
		System.out.println(opponent.getName() +" choice: "+ch2);
			
		if((ch1==Roshambo.PAPER && ch2==Roshambo.ROCK) 
				||(ch1==Roshambo.ROCK && ch2==Roshambo.SCISSORS)
				||(ch1==Roshambo.SCISSORS && ch2==Roshambo.PAPER)){
				System.out.println(player.getName() + " wins!");
				playCount++;
			}
		else if(ch1==ch2){
			System.out.println("Draw");
			drawCount++;
		}else{
			System.out.println(opponent.getName() + " wins");
			oppCount++;
		}
		System.out.printf("\n%s has %d wins - %d ties - %d loses", 
				player.getName(), playCount, drawCount, oppCount);
		char resp = val.YesOrNo();
		cont = val.loopingAgain(resp);
		}while(cont);
		val.exitting(cont);
		scan.close();

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
			opponent = new Robot(null, null);
		} else{
			opponent = new Animal(null, null);
		}
		return opponent;
	}
}

