public class Right_Triangle_Letter
{
public static void main(String args[])
{

String s="Computer";
int a=s.length();
for(int i=0;i<a;i++)
{
for(int j=0;j<a;j++)
{
System.out.print("");
}
for(int j=0;j<i;j++)
{
System.out.print(s.charAt(j));
}
System.out.println();
}
}
}
