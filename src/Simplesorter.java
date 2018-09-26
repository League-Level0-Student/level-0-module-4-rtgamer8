import javax.swing.JOptionPane;

public class Simplesorter {
public static void main(String[] args) {

String one=JOptionPane.showInputDialog("What is your first number?");	
String two=JOptionPane.showInputDialog(" is your second number?");	
String three=JOptionPane.showInputDialog(" is you third number?");
int a =Integer.parseInt(one);
int b =Integer.parseInt(two);
int c =Integer.parseInt(three);
 if (a>b) {
	 int temp = a;
	 a=b;
	 b=temp;
	 
	 
	 
 }
   if (b>c) {
 int temp=b;
	   b=c;
	   c=temp;
	   
	   
	   
   }
 System.out.println(a + " "+ b+" "+c);























	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
