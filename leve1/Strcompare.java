public class Strcompare{
public static void main(String[]args){
	java.util.Scanner sc= new java.util.Scanner(System.in);
	System.out.print("Enter the string:");
	String s1=sc.next();
	String s2=sc.next();
	
	System.out.println("Comaprison result using loop: "+ compare(s1,s2));
	System.out.println("Comparison result using equal() method:"+s1.equals(s2));


	 

}
public static boolean compare(String s1,String s2){

	boolean r=true;
	check:
	for (int i=0; i<s1.length();i++){
		if (s1.charAt(i) != s2.charAt(i)){ 
		r=false;
		break check;
		}
	}
	return r;


}
}