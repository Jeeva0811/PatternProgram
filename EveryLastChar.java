public class EveryLastChar
{
public static void main(String args[])
{
String a="United States Of America";
String x[]=a.split(" ");
for(int i=0;i<a.length();i=i+1)
{
System.out.println(x[i].length()-1);
}
}
}
