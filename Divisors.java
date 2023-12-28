
public class Divisors {
	public static void main (String[] args) {
		
		int given_num = Integer.parseInt(args[0]);
		int i = 1;
		
		while (i <= given_num) {
			if (given_num % i == 0){
				System.out.println(i);
				}
			i ++;
		}
	}
}
