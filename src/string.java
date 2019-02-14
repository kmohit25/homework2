
public class string {
public static void main (String[]args) {
		
		// Created two strings
		String str1="My name is mohit,";
		String  str2="I am 22 years old.";
		
		//printing both strings 
		System.out.println(str1+" "+str2);
		
		//String Length
		System.out.print("\nThe length of string 1 and string 2 is: ");
		System.out.print( str1.length() + str2.length());
		
		System.out.println("\n");
		
		//Strings= upperCase
		System.out.println(str1.toUpperCase()+" "+ str2.toUpperCase());
		
		//String lowerCase
		System.out.println(str1.toLowerCase()+" "+ str2.toLowerCase());
		
		
		//concat
		
		System.out.println(str1.concat(str2));
		
		//strings Equals
		System.out.println("\nIs string 1 equal to string 2?");
		
		System.out.println(str1+ "\n"+str2);
		System.out.println(str1.equals(str2));
		
		
		//String indexOf
		System.out.println("\n"+ str1.indexOf("mohit"));
		System.out.println("\n");
		
		//1st type to make an Array of Strings
	String str3[]= {"I", "went","to", "Farmingdale State College"};
	System.out.println(str3[0]+" "+ str3[1]+" "+str3[2]+" "+ str3[3]);
	
		//2nd way to make an array of String
	
	String str4[]= new String[4];
			
	str4[0]= "I";
	str4[1]= "graduated";
	str4[2]= "in";
	str4[3]= "2018";
	System.out.println(str4[0]+" "+str4[1]+" "+str4[2]+" "+str4[3]);
	
	System.out.println("\n");
	
	
	
	//String compareTo
	String str5="I like to play cricket";
	String str6="I like to play basketball";
	
	System.out.println(str5);
	System.out.println(str6);
	
	if (str5.compareTo(str6)>0) System.out.println("String 5 comes after String 6");
	if (str5.compareTo(str6)<0) System.out.println("String 6 comes before String 6 ");
	
	
	//String charAt
	String str7 ="I like Indian Cusine";
	System.out.println("\n");
	System.out.println(str7.charAt(0));
	
	
	//String replace Char
	String str8= "I have an Iphone Y";
	System.out.println("\n");
	System.out.println(str8);
	System.out.println(str8.replace('Y', 'X'));
	
	
	//String replace Sequence
	String str9="I want to Miami";
	
	System.out.println("\n");
	System.out.println(str9);
	System.out.println(str9.replace("want","went"));
	
	
	//String trim 
	String str10=" 		I love to watch movies";
	System.out.println("\n");
	System.out.println(str10);
	System.out.println(str10.trim());
	
	//String startsWith
	
	String str11="I am learning Java";
	System.out.println("\n");
	if(str11.startsWith("I"))System.out.println(str11);
	
	
	
	//String equalsIgnoreCase
	String str12="jAvA iS InTrEsTiNg";
	String str13="Java is intresting";
	System.out.println("\n");
	System.out.println(str12);
	System.out.println(str13);
	if(str12.equalsIgnoreCase(str13)) System.out.println("string12 and string 13 are equal");
	
	
	//String Empty
	String str14="";
	
	System.out.println("\n");
	if(str14.isEmpty()) System.out.println("String 14 is empty");
	
	//String lastIndex
	String str15="Fuzzy Wuzzy was a bear. Fuzzy Wuzzy had no hair. Fuzzy Wuzzy wasn’t fuzzy";
	System.out.println("\n");
	System.out.println(str15);
	
	System.out.println(str15.lastIndexOf("Wuzzy"));
	
	//String contains
	String str16= "Roses are red";
	
	boolean YesorNo=str16.contains("red");
	System.out.println("\n");
	System.out.println(YesorNo);
	
	
	//String endsWith
	
	String str17="DNA full form is  Deoxyribonucleic Acid ";
	System.out.println("\n");
	if (str17.endsWith("Acid"));
	System.out.println("the spelling of Deoxyribonucleic Acid is correct");
			
		//String codePointAt	
	System.out.println(str17.codePointAt(3));
	
	//String Split
	
	String str18 = "Roses are red,-violets are blue.-If you were a pokemon,-I would choose you";
	String parts[]= str18.split("-");
	System.out.println("\n");
	for(int i = 0; i < parts.length; i++) {
	System.out.println( parts[i]);
	}
	
	//String startsWith
	System.out.println("\n");
	String str19="Sachin";  
	 System.out.println(str19.startsWith("S"));//true  
	 //String endsWith
	 System.out.println(str19.endsWith("N"));//true  
	
}
}
