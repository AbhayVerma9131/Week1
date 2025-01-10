import java.util.Scanner;
public class numcompare{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n[]=new int [5];
System.out.println("Enter the numbers:");
for (int i=0;i<5;i++) n[i]=sc.nextInt();


for (int i=0;i<5;i++){
if (n[i]>0){
System.out.print("Number "+n[i]+" is positive");
if (n[i]%2==0) System.out.println(" Also the number is EVEN");
else System.out.println(" But the number is ODD");
}
else if (n[i]==0) System.out.println("The number is 0");
else System.out.println("The number is negative");
}
if (n[0]>n[4]) System.out.println(n[0]+" is > "+n[4]);
else if (n[0]==n[4]) System.out.println(n[0]+" is = "+n[4]);
else System.out.println(n[0]+" is < "+n[4]);

}
}