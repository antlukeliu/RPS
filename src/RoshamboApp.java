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
		
		char opponent = val.PlayerVal();
				
		String opp;
		if (opponent == 'r'){
			opp = "Robot";
		} else{
			opp = "Animal";
		}
		
		char rps = val.RPSVal();
		Roshambo value = Player.generateRoshambo(rps); 

		compare(value, value);
		char resp = val.YesOrNo();
		cont = val.loopingAgain(resp);
		}while(cont);
		val.exitting(cont);

	}
	//Player2 "Robot" choice2 = "Rock"
	//Replace String value with enum value later
	public static void compare(Roshambo choice1, Roshambo choice2){
		
		//combination of paper and rock
		//paper wins so we would say player 1 wins
		//if choices are paper and rock will be true
		
		if((choice1.equals("paper") && choice2.equals("rock")) 
				||(choice1.equals("rock") && choice1.equals("scissors"))
				||(choice1.equals("scissors") && choice2.equals("paper"))){
				System.out.println("You wins");}
		else if(choice1.equals(choice2)){
			System.out.println("Draw");
		}else{
			System.out.println("Your opponent wins");
		}	
		}
	}
