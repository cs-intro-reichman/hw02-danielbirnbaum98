
public class OneOfEachStats1 {
	public static void main (String[] args) {
		int T = Integer.parseInt(args[0]);
		//Creating variables for the total boys + girls
		double total = 0;
		double avg = 0.0;
		int how_many_with_2 = 0;
		int how_many_with_3 = 0;
		int how_many_with_4_and_more = 0;

		//Cerating a loop that runs T times
		for (int i = 0; i < T; i++){
			boolean girl = true;
			boolean boy = true;
			
			//Creating a loop that runs untill we have one of each
			int numOfChildrenInSpecificFamily = 0;
			while (boy  || girl) {
				int child = (int)(Math.random() * 2);
				if (child == 0){
					girl = false;
				}
				else{
					boy = false;
				}
				total++;
				numOfChildrenInSpecificFamily++;
			}

			switch(numOfChildrenInSpecificFamily){
				case 2: 
					how_many_with_2++;
					break;
				case 3: 
					how_many_with_3++;
					break;
				default:
					how_many_with_4_and_more++;
					break;
			}

		}	
		avg = total / T;
		System.out.println("Average: " + avg + " children to get at least one of each gender.");
		System.out.println("Number of families with 2 children: " + how_many_with_2);
		System.out.println("Number of families with 3 children: " + how_many_with_3);
		System.out.println("Number of families with 4 or more children: " + how_many_with_4_and_more);
		int max_family_type = 2;		
		if((how_many_with_2 >= how_many_with_3) && (how_many_with_2 >= how_many_with_4_and_more)) {
			max_family_type = 2;
		}
		else {
			if(how_many_with_3 >= how_many_with_4_and_more){
				max_family_type = 3;
			}
			else {
				max_family_type = 4;
			}
			
		}


		
		if (max_family_type == 2 || max_family_type == 3) {
			System.out.println("The most common number of children is " + max_family_type + ".");
		}
		else {
			System.out.println("The most common number of children is 4 or more.");
		}
		}
	}
		
		
		
	



	


