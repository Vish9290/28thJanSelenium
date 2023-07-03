package StringFunctions;

public class DStingMethods
{
	
	public static void main(String[] args) 
	{
	      String str = 	"Vishal";
	      String str1 = "bande";
	      String st2= "VELOCITY";
	      String Str4= "Vishal";
	      String str5 = "visHal";
	      
	      String str7 = "my name Vishal Bande";
	      String str6 = "";
	      
	      String str8[]  = str7.split(" ");
	      
	      System.out.println(str.charAt(2));
	      
	      System.out.println(str1.toUpperCase());
	      
	      System.out.println(st2.toLowerCase());
	      
	      System.out.println(str.equals(Str4));
	      
	      System.out.println(str.equalsIgnoreCase(str5));
	      
	      
	      System.out.println(str.isEmpty());
	      System.out.println(str6.isEmpty());
	      
	      System.out.println(str.length());
	      
	      System.out.println(str.concat(str1));
	      
	      System.out.println(str7.replace("Vishal", "Prajakta"));
	      
	      
	      System.out.println(str7.endsWith("Bande"));
	      System.out.println(str7.endsWith("Bae"));
	      
	      System.out.println(str7.startsWith("my"));
	      System.out.println(str7.startsWith("Neha"));
	      
	      System.out.println(str7.lastIndexOf("a"));
	      System.out.println(str7.indexOf("a"));
	      
	      System.out.println(str.substring(2));
	      System.out.println(str.substring(2,5));
	     // System.out.println(str7.d);
	 


	      for(int i = 0; i <= str8.length-1; i++)
	      {
	    	  System.out.print(str8[i]);
	      }
	}

}
