import java.util.Scanner;
public class DoubleOpt{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
double a=sc.nextInt();
double b=sc.nextInt();
double c=sc.nextInt();
double p=a+b*c;
double q=a*b+c;
double r=c+a/b;
double s=a%b+c;
System.out.println("The result of Int Operations are "+p+","+q+","+r+", and "+s);

}

}