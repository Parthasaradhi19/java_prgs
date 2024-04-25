import java.util.*;
class switch{
public static void main(String p[]){
int a=10,b=19;
Scanner sc =new scanner(System.in);
System.out.println("***ARITHETIC OPERATIONS***");
System.out.println("1.Add");
System.out.println("2.Sub");
System.out.println("3.Mul");
System.out.println("4.Div");
System.out.println("enter your choise");
int ch=sc.nextInt();
Switch(ch){

case 1->System.out.println("Addition resultis"+(a+b));
case 2->System.out.println("Subtraction resultis"+(a-b));
case 3->System.out.println("Muiltiplication resultis"+(a*b));
case 4->System.out.println("Division resultis"+(a/b));
default->System.out.println("give proper option");
}
sc.close();
}
}