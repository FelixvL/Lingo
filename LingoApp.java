
import java.util.Scanner;

class LingoApp{
	public static void main(String[] args){
		System.out.println("Lingo");
		Poging poging1 = new Poging();

		System.out.println("Het woord is: " + poging1.woord);
		Scanner sc = new Scanner(System.in);
		String invoer = sc.next();
		System.out.println(invoer);
		System.out.println(poging1.woord.charAt(0));
		if(poging1.woord.charAt(0) == invoer.charAt(0)){
			System.out.println("goed");
		}else{
			System.out.println("fout");
		}
		for(int x = 0 ; x < poging1.woord.length() ; x++){
			if(invoer.charAt(0) == poging1.woord.charAt(x)){
				System.out.println("zit erin");
			}
		} 

	}

}

class Poging{
	String woord = "pizza";
}