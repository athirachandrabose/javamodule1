package String;

public class TestStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  byte bytes[]= {65,66,67,68,69}; 
		  String str4=new String(bytes);
		  System.out.println(str4.length());//5
		   System.out.println(str4);//ABCDE
		  str4="Welcome to UST global";
		   bytes=str4.getBytes();
		    for(byte b:bytes) {
		  System.out.println(" "+b); }
//87 101 108 99 111 109 101 32 116 111 32 85 83 84 32 103 108 111 98 97 1083
		 
			
			  char chars[]= {'U','S','T',' ','G'};
			 String  str5=new String(chars);
			  System.out.println(str5);//UST G
			  str5.getChars(0,chars.length-1, chars, 0);
			  for(char c:chars) 
			  { System.out.println(" "+c); }
			 
	// U S T   G3		
			  String str=new String("she sells sea.shells in sea. shore"); String
			  words[]=str.split("[.]");
			  
			  System.out.print(words.length);
			  
			  for(String word:words) 
			  { System.out.println(word); }
			 
		 
		/*int s=0,c=0;
		c=str.length();
		for(int i=0;i<c;i++) {
		if(str.charAt(i)==s) {
			          s++;
			          
		}}
		System.out.println(s);*/
		  str=new String("cartoon");
		 System.out.println(str.startsWith("car"));
		 System.out.println(str.endsWith("toon"));
		int apos=str.indexOf('a');
		int tpos=str.indexOf('t');
				String string=str.substring(apos, tpos+1);
				System.out.println(string);
				string=str.substring(tpos);
		System.out.println(string);
		string=new String("madamdam");
		int dpos=string.lastIndexOf('d');
		 String strings=string.substring(dpos,string.length());
		System.out.println(strings);
		String email= new String("Athira.Chandrabose@ust.com");
		int dopos=email.lastIndexOf('.');
		String stri=email.substring(dopos+1, email.length());
		System.out.println(stri);
		/*
		 * String str1=new String("welcome"); String str2=new String("welcome"); boolean
		 * result=str1.equals(str2); System.out.println(result);//RETURNS TRUE
		 */
		/*
		 * String str1=new String("welcome"); String str2=new String("WELCOME"); boolean
		 * result=str1.equals(str2); System.out.println(result);//RETURN FALSE
		 */
		/*
		 * String str1=new String("welcome"); String str2=new String("WELCOME"); boolean
		 * result=str1.equalsIgnoreCase(str2); System.out.println(result);
		 *///RETURN TRUE
		String str1=new String("welcome");
		String str2=new String("welcome");
		/*
		 * boolean result=str1.equalsIgnoreCase(str2); System.out.println(result);
		 */
		int val=str2.compareTo(str1);//-32 when different string
		System.out.println(val);
// 0 when strings are same
		
		String str3=new String("diEhard");
		System.out.println(str3.toUpperCase());//string will be converted to uppercase DIEHARD
		System.out.println(str3);//original form will print,string objects are immutable their values cannot changed  diEhard
		System.out.println(str3.toLowerCase());//diehard
		System.out.println(str3);
//diEhard
		String str6= new String("16-11-477/6/A/3 Hyderabad 50036");
		    int digcount=0;
		    int alphcount=0;
		    int  spacecount=0;
		    int speccount=0;
		    int upcount=0;
		    int locount=0;
		   for(int i=0;i<str6.length();i++) {
			int ch=str6.charAt(i);
		if(Character.isDigit(ch)) {
				digcount++;
			}	
		else if(Character.isUpperCase(ch)) {
			upcount++;
		}
		else if(Character.isLowerCase(ch)) {
			locount++;
		}
//	  else if(Character.isLetter(ch))
//		{ alphcount++; }
			 
		else if(Character.isWhitespace(ch)) {
			spacecount++;
		}
		
		else 
			speccount++;
	
	}
		   alphcount=upcount+locount;
		    System.out.println("number of digits:"+digcount);//14
		    System.out.println("number of uppercase:"+upcount);//2
		    System.out.println("number of lowercase:"+locount);//8
		    System.out.println("number of alphabets:"+alphcount);//10
		    System.out.println("number of spaces:"+spacecount);//2
		    System.out.println("number of special characters:"+speccount);//5
		    
}
}