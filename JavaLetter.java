public class JavaLetter
{
public static void main(String args[])
{
String a="java";
for(int i=1;i<=a.length();i=i+1)
{
for(int j=0;j<i;j=j+1)
{
System.out.print(a.charAt(j));
}
System.out.println();
}
for(int i=a.length()-1;i>=0;i=i-1)
{
for(int j=0;j<i;j=j+1)
{
System.out.print(a.charAt(j));
}
System.out.println();
}
}
}
