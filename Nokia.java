import java.util.Scanner;
public class Nokia{
	public static void main(String...a){

		Scanner input = new Scanner(System.in);

		System.out.println("Choose from this list of options:");
String display = """
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
int phonebook = input.nextInt();

	switch(phonebook){
	case 1: System.out.println
("""
1) Search
2) Service Nos
3) Add name
4) Erase
5) Edit
6) Assign tone
7) Send b'card 
8) Optionscls
9) Speed dials
10) Voice tags
""");
int options = input.nextInt();
switch(options){
	case 8: System. out.println
("""
1) Type of view
2) Memory status
""");
	break;
}
}
	
	

int messages = input.nextInt();

	switch(messages){
	case 2: System.out.println
("""
1) Write messages
2) Inbox
3) Outbox
4) Picture messages
5) Templates
6) Smileys
7) Message Settings
8) Info Service
9) Voice mailbox number
10) Service command editor
""");

int messageSettings = input.nextInt();

	switch(messageSettings){
	case 7: System.out.println
("""
1) Set
2) Common
""");

int set = input.nextInt();

switch(set){
case 1: System.out.println
("""
1) Message centre number
2) Message sent as
3) Message validity
""");
	break;



}
}
}


	}



}









 





















