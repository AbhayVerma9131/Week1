public class vowel{
	public static void main(String[]args){
		java.util.Scanner sc=new java.util.Scanner(System.in);
		String st=sc.nextLine().toLowerCase();
		int v=0,c=0;
		char []s=st.toCharArray();
		for (int i=0;i<st.length();i++){
			if (s[i]=='a' || s[i]=='e' || s[i]=='i'|| s[i]=='o' || s[i]=='u'){
				v++;

			}
			else c++;

		
		}
		System.out.println("Vowel:"+v+"Consonenet:"+c);
		
		

}

}