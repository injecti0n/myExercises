package beginner; 

import java.text.ParseException; 
import java.text.SimpleDateFormat; 
import java.util.Date; 
import java.util.Scanner; 

public class timeDuration { 

public static void main(String[] args) throws ParseException { 


/*
# inject0r
# Time Duration Calculator: Time between two dates/times  
# Exercises for beginners
*/

String startWork = "02:42:00"; 
String stopWork = "20:12:00"; 



Scanner input = new Scanner(System.in); 
System.out.println("How many days: "); 
int Days = input.nextInt(); 
System.out.println("Earn per hour? : "); 
double benjaminPerHour = input.nextDouble(); 

SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss"); 
Date date1 = format.parse(startWork); 
Date date2 = format.parse(stopWork); 
long difference = date2.getTime() - date1.getTime(); 
int hours = (int) ((difference / (1000*60*60)) % 24); 
double benjamin = (hours * benjaminPerHour); 

System.out.println(hours + " hours working per day" 
+ "And you are earn: " + benjamin + " EUR" + 
""); 

switch(Days) { 
case 5: 
System.out.println(benjamin*20); 
break; 
case 6: 
System.out.println(benjamin*24); 
break; 
case 7: 
System.out.println(benjamin*28); 
break; 
default: 
System.out.println("Enter correct info!"); 
} 




} 

} 