
public class DamkaBoard {
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		int i = 0;
		while (i < n) { 
			int j = 0;
			while(j < n){
				if (i % 2 == 0){
				System.out.print("* ");
				}
				else{
				System.out.print(" *");
				}
				j++;
			}
			System.out.println();
			i++;
		}
	}
}
