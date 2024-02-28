package feb27;

public class Vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="the rain in the spain";  //Given string
System.out.println("The String is: "+str);
int Vcount=0,ccount=0;   //variable to count the vowels and constant
	str=str.toLowerCase();   //Convert the string to lowercase
	for(int i=0;i<str.length();i++) {
		if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u')
		Vcount++;  //Increment each time vowel encounters
		else if(str.charAt(i) >= 'a' && str.charAt(i)<='z')
			ccount++;  //Increment each time consonants encounters
		
		
	}
	//Print the total number of vowels 
	System.out.println("The total number of vowels is:"+Vcount);
	//Print the total number of consonants
	System.out.println("The total number of consonants is:"+ccount);
	
	
	}

}
