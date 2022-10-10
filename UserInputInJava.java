import java.util.Scanner; //learn this line
public class UserInputInJava {

	public static void main(String[] args) {
		
     Scanner scanner = new Scanner(System.in); //Learn this line
     
     System.out.println("What is your name ?");
     String name = scanner.nextLine(); //Learn this nextLine() method
     
     System.out.println("How old are you ?");
     int age = scanner.nextInt();
     
     scanner.nextLine(); //important
     /*When we use nextLine method the \n which represents "new line"
      *added in the end of line when we press enter
      *
      *When we type our name and press the enter key to submit
      *the nextLine method will read an entire line of text
      *and stops when it reaches the end i.e., " \n " after we call
      *nextLine method our scanner becomes "empty" however when we use 
      *another method like nextInt and type the numeric value and press
      *enter the \n dosen't disappear like in nextLine method and it still
      *going to be within our scanner and we were to use our scanner again
      *and call a different method like nextLine it will think that we're 
      *already at the end coz there's \n left within our scanner.
      *We can fix this by by calling nextLine method "scanner.nextLine();"
      *to clear the scanner so we can use methods again.
      */
     
     System.out.println("What is your favourite Food");
     String food = scanner.nextLine();
     
     System.out.println("Hello "+name);
     System.out.println("You are "+age+" years old");
     System.out.println("You like "+food);
	}

}
