
public class Perfect {
	public static void main (String[] args) {
		int n = Integer.parseInt(args[0]);
		int sum = 0;
		String perfect = n + " is a perfect number since " + n + " = ";
		String notPerfect = n + " is not a perfect number";
		
		for(int i = 1; i < n; i++){
			if (n % i == 0){
				perfect = perfect + i + " + ";
				sum = sum + i;
			}
		}

		if(sum == n){
				System.out.println(perfect.substring(0, perfect.length() - 2));
			}

		else{
			System.out.println(notPerfect);	

		}

	}

	
}
