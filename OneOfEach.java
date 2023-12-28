
public class OneOfEach {
	public static void main (String[] args) {
		
		boolean girl = true;
		boolean boy = true;
		int i = 0;

		while (boy  || girl) {
			int child = (int)(Math.random() * 2);
			i++;
			if (child == 0){
				girl = false;
				System.out.print("g");
			}
			else{
				boy = false;
				System.out.print("b");
			}
			System.out.print(" ");
		}
		System.out.println();
		System.out.println("You made it... and you now have " + i + " children.");
	}
}
