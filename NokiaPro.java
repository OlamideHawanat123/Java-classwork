import java.util.Scanner;
public class NokiaPro{
	public static void main(String...a){

	
	display();

	}


	public static void display(){
	Scanner input = new Scanner(System.in);
	String display = """
	Choose from this list of options:
	1) Phonebook
	2) Messages
	3) Chat
	4) Call register
	5) Tones
	6) Settings
	7) Call divert
	8) Games
	9) Calculator
	10) Reminders
	11) Clock
	12) Profiles
	13) SIM services
	14) Exit 
	""" ;
	System.out.println(display);
	String userInput = input.nextLine();
		switch(userInput){
		case "1": phonebook();
		}
	}

	public static void phonebook(){
	String phonebook = """
	1) Search
	2) Service Nos
	3) Add name
	4) Erase
	5) Edit
	6) Assign tone
	7) Send b'card 
	8) Options
	9) Speed dials
	10) Voice tags
	""";
	System.out.println(phonebook);

	}
	public static void options(){
	String options = """
	1) Type of view
	2) Memory status """;
	display();
	}
}