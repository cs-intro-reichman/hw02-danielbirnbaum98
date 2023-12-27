
public class Reverse {
	public static void main (String[] args){
		
		String s = args[0];
		String reversed_s = "";
		for (int i = s.length() - 1; i >= 0; i = i - 1){
			char charecter = s.charAt(i);
			reversed_s = reversed_s + charecter;
		}
		System.out.println(reversed_s);

		int l = (s.length() - 1)/2;
		char m = s.charAt(l);
		System.out.println("The middle character is " + m);








	}
}
