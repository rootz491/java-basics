import java.util.*;

class stringArraySortAccToTelephoneDictionary {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.printf("enter no. names: ");
		int n = scanner.nextInt();
		scanner.nextLine();	//	consumes '\n' character
		String[] list = new String[n];

		for(int i=0; i<list.length; i++) {
			System.out.println("enter "+(i+1)+" name: ");
			list[i] = scanner.nextLine();
		}

		//	print the list
		System.out.println("\n\noriginal list:");
		for(int i=0; i<list.length; i++) {
			System.out.println(list[i]);
		}

		//	check the initial of each name and compare it with ascii.
		for(int i=1; i<list.length; i++) {
			int current = i;
			int j = i-1;
			//	compare with previous strings untill previous[0]'s ASCII is less than current[0]'s ASCII
			while(j>=0) {
				int flag=0;
				//	comparing if initials are equal
				while((int)list[current].charAt(flag)==(int)list[j].charAt(flag)) {
					flag++;
					if(flag == list[current].length() || flag==list[j].length()) {
						flag=99;
						break;
					}
				}
				if(flag==99)	continue;	//	if both string are same then move on
				if((int)list[current].charAt(flag)<(int)list[j].charAt(flag)) {
					//	swap b/w strings
					list[current] += list[j];
			        list[j] = list[current].substring(0, list[current].length() - list[j].length());  
			        list[current] = list[current].substring(list[j].length());
			        current = j;
			    }
			    else 	break;
		        j--;
			}
		}

		//	print sorted list
		System.out.println("\n\nFinal list:");
		for(int i=0; i<n; i++) {
			System.out.println(list[i]);
		}
	}
}

/*
OUTPUT
======
% javac stringArraySortAccToTelephoneDictionary.java
% java stringArraySortAccToTelephoneDictionary
enter no. names: 5
enter 1 name: 
karan
enter 2 name: 
udit
enter 3 name: 
gaurav
enter 4 name: 
saurav
enter 5 name: 
nik


original list:
karan
udit
gaurav
saurav
nik


Final list:
gaurav
karan
nik
saurav
udit
*/
