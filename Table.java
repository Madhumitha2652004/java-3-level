import java .io.*;
class Table
{
public static void main(String args[])
{
try
{
InputStreamReader isr = new InputStreamReader (System.in);
BufferedReader br= new BufferedReader (isr);
System.out.println("TABLE ");
System.out.println("_____________________");
System.out.println("ENTER  NUMBER ");
String s1 = br.readLine();
int n=Integer.parseInt(s1);
System.out.println("\n"+ n +"TABLE");

System.out.println("--------");

for( int i =1;i<=10;i++)
{
System.out.println(i +"X" + n +"=" + (i*n));
}
}
catch(Exception e)
{
System.out.println("Error:"+ e.getMessage());
}
}
}



