// 1. Decisions
public class Conditionals {
	public static void main(String[] args) {


		if (1 < 4 && 0 > 5) {

			System.out.println("You ordered a cup of hot, mint tea.");

		} else if (21 <= 19 || 17 >= 28) {

			System.out.println("You ordered freshly squeezed orange juice!");

		} else if ( !(true == true) ) {

			System.out.println("You ordered hot cocoa!");

		} else {

			System.out.println("You ordered a cup of Java!");

		}

		char answerChoice = 'C';

		switch (answerChoice) {

			case 'A': System.out.println("You answered: " + answerChoice + ". Please try again.");
								break;

			case 'B': System.out.println("You answered: " + answerChoice + ". Please try again.");
								break;

			case 'C': System.out.println("You answered: " + answerChoice + ". That is correct!");
								break;

			case 'D': System.out.println("You answered: " + answerChoice + ". Please try again.");
								break;

			default:
				System.out.println("Please select a valid answer choice.");

		}
  }
}
// 2. Boolean OPS &&
public class And {
	public static void main(String[] args) {

		System.out.println(1 < 2 && 20 < 22);

	}
}
// 3. Boolean OPS ||
public class Or {
	public static void main(String[] args) {

		System.out.println(4 > 2 && 7 < 6);

	}
}
// 4. Boolean OPS !(NOT)
public class Not {
	public static void main(String[] args) {

		System.out.println(!false);
		System.out.println( !(5>=1) );

	}
}
// 5. Boolean OPS Precedence
public class Precedence {
	public static void main(String[] args) {

		boolean riddle = !( 1 < 8 || (5 > 2 && 3 < 5));
		System.out.println(riddle);

	}
}


// NOTES:

//  ! is evaluated first
// && is evaluated second
// || is evaluated third

// 6. IF Statement
public class If {
	public static void main(String[] args) {

		if (4 < 5) {

			System.out.println("Access granted.");

		}

	}
}
// 7. IF-ELSE Statement
public class IfElse {
	public static void main(String[] args) {

		if (8 < 10 && 8 > 10) {

			System.out.println("Try again...");

		} else {

			System.out.println("Success!");

		}

	}
}
// 8. IF-ELSEIF-ELSE Statement
public class IfElseIf {
	public static void main(String[] args) {

		int round = 3;

		if (round > 12) {

			System.out.println("The match is over!");

		} else if (round > 0) {

			System.out.println("The match is underway!");

		}	else {

			System.out.println("The boxing match hasn't started yet.");

		}
	}
}
// 9. TERNARY Condition
public class Ternary {
	public static void main(String[] args) {

		int fuelLevel = 3;

		char canDrive = (fuelLevel > 0) ? 'Y': 'N';
		System.out.println(canDrive);

	}
}
// 10. SWITCH Statement
public class Switch {
	public static void main(String[] args) {

		char penaltyKick = 'R';

		switch (penaltyKick) {

			case 'L': System.out.println("Messi shoots to the left and scores!");
								break;
			case 'R': System.out.println("Messi shoots to the right and misses the goal!");
								break;
			case 'C': System.out.println("Messi shoots down the center, but the keeper blocks it!");
								break;
			default:
				System.out.println("Messi is in position...");

		}

	}
}
// 11. 
