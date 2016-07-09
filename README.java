# sw
package k;
public class b {
public static void main(String []args)
{
int a=13,num,b=12;
System.out.printf("before swap a=%d b=%d",a,b);
a = a ^ b;
b = a ^ b;
a = a ^ b;
System.out.printf("\nafter swap a=%d b=%d",a,b);
}
}
