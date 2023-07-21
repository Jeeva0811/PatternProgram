public class Number_triangle
{
public static void main(String args[])
{
int a=4;
int x=0;
for(int i=1;i<=a;i++)
{
for(int j=i;j<=a;j++)
{
System.out.print(" ");
}
for(int j=1;j<=i;j++)
{
x=x+1;
System.out.print(" "+x);
}
System.out.println();
}
}
}

