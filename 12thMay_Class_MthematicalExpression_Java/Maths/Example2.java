package Maths;

import java.util.*;
public class Example2 
{
public static void main(String[] args) 
{
double value = 24.48;
double fractional_part = value % 1;
double integral_part = value - fractional_part;  
System.out.print("\nOriginal value: "+value);
System.out.print("\nIntegral part: "+integral_part);
System.out.print("\nFractional part: "+fractional_part);
System.out.println();  
}
}