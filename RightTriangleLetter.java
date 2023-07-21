public class RightTriangleLetter
{
public static void main(String args[])
{
String s="computer";
int row=s.length();
for(int i=1;i<=row;i=i+1)
{
for(int j=0;j<i;j=j+1)
{
System.out.print(s.charAt(j));
} 
System.out.println();
}
}
}

