public class NumberTriangle
{
public static void main(String args[])
{
int a=5;
for(int i=1;i<=a;i++)
{
for(int j=i;j<=a;j++)
{
System.out.print("");
}
for(int j=1;j<=i;j++)
{
System.out.print(" "+i);
}
System.out.println();
}
}
}
