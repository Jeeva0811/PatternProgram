public class ReverseTriangle
{
public static void main(String args[])
{
int a=5;
for(int i=a;i>=1;i--)
{
for(int j=i;j<=a;j++)
{
System.out.print(" ");
}
for(int j=1;j<=i;j++)
{
System.out.print(" *");
}
System.out.println();
}
}
}
