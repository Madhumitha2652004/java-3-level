import java .io.*;
class Sum
{
public static void main(String args[])
{
try
{
InputStreamReader isr = new InputStreamReader (System.in);
BufferedReader br= new BufferedReader (isr);
System.out.println("SUM OF N -NUMBER ");
System.out.println("_____________________");
System.out.println("STARTING RANGE ");
String s1 = br.readLine();
int a = Integer.parseInt(s1);
System.out.println("ENDING RANGE ");
String s2 = br.readLine();
int b = Integer.parseInt(s2);
System.out.println("calculate sum");
System.out.println("print the series &sum:");
for(int i=a;i<=b;i++)
{
if (i%3==0||i%5==0)
{
System.out.println(i);
}}}
catch (Exception e)
{
System.out.println("Error:"+ e.getMessage());
}
}
}





