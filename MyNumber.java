import java.io.*;
import java.lang.*;
public class MyNumber 
{
 private int x;
 public MyNumber()
{
  x=0;
 }
 public MyNumber(int y)
{
  x=y;
 }
 public boolean isNegative()
{
  if(x<0)
   return true;
  else return false;
 }
 public boolean isPositive()
{
  if(x>0)
   return true;
  else return false;
 }
 public boolean isZero()
{
  if(x==0)
   return true;
  else return false;
 }
 public boolean isOdd()
{
  if(x%2!=0)
   return true;
  else return false;
 }
 public boolean isEven()
{
  if(x%2==0)
   return true;
  else return false;
 }

 
 public static void main(String [] args)
 {
  boolean bool1;
  MyNumber m=new MyNumber(8);
System.out.println(m.x);
  bool1=m.isNegative();
   System.out.println(bool1);
  bool1=m.isPositive();
   System.out.println(bool1);
  bool1=m.isEven();
   System.out.println(bool1);
  bool1=m.isOdd();
   System.out.println(bool1);
  bool1=m.isZero();
   System.out.println(bool1);
 }
}



