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



// NOTES:

//  ! is evaluated first
// && is evaluated second
// || is evaluated third
