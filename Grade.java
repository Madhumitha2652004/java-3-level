import java .io.*;
class Grade
{
public static void main(String args[])
{
try
{
InputStreamReader isr = new InputStreamReader (System.in);
BufferedReader br= new BufferedReader (isr);
System.out.println("TAKSHASHILA university ");
System.out.println("_____________________");
System.out.println("ENTER THE ENROLL NUMBER ");
String s1 = br.readLine();
int a = Integer.parseInt(s1);
System.out.println("enter the name:");
String s2 = br.readLine();
System.out.println("enter the java mark:");
String s3 = br.readLine();
int b = Integer.parseInt(s3);
System.out.println("enter the cn mark:");
String s4 = br.readLine();
int c = Integer.parseInt(s4);
System.out.println("enter the se mark:");
String s5 = br.readLine();
int d = Integer.parseInt(s5);
System.out.println("result");
int e = b+  c + d;
System.out.println("total:"+e);
int f = e/3;
System.out.println("average:"+f);
if(b>=40&&c>=40&&d>=40)
{
System.out.println("RESULT:PASS");
}
else
{
System.out.println("RESULT:FAIL");
}
if (e>=250)
{
System.out.println("GRADE:1ST CLASS");
}
else if (e>=200)
{
System.out.println("GRADE:2ND CLASS");
}
else if (e>=150)
{
System.out.println("GRADE:3RDCLASS");
}
else
{
System.out.println("GRADE:FAIL");

}
}
catch (Exception e)
{
System.out.println("Error:"+ e.getMessage());
}
}
}



