
public class InOrder {
	public static void main (String[] args) {
		
		int lastNum = 0;
		int maxNum = 0;
		
		 while (lastNum >= maxNum){
		 	lastNum = (int)(Math.random() * 10);
		 	if (lastNum >= maxNum){
		 		maxNum = lastNum;
		 		System.out.print(lastNum + " ");
		 	}	
		 	}
		 }

	}
