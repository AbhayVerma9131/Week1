public class Substr{
	public static String substr(String s,int st,int en){
		String sub="";
		for (int i=st;i<en;i++){
			sub+=s.charAt(i);
			}
		return sub;
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

	public static void main(String[] args){
	java.util.Scanner sc=new java.util.Scanner(System.in);
	System.out.print("Enter the string:");
	String s=sc.next();
	System.out.print("Enter Starting Index:");
	int st=sc.nextInt();
	System.out.print("Enter End Index:");
	int end=sc.nextInt();
	String s1=substr(s,st,end);
	String s2=s.substring(st,end);
	System.out.println("Substring using fxn :"+s1);
	System.out.println("Substing using method:"+s2);
	System.out.println("String comparison result:"+compare(s1,s2));
	


}

	

}