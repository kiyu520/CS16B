import java.util.Scanner;
class GravityCalculator { 

public static void main(String[] arguments) {
 Scanner sc = new Scanner(System.in);
 double gravity = -9.81;

 double initialVelocity = sc.nextDouble();

 double fallingTime = 10.0;

 double initialPosition = sc.nextDouble();

 double finalPosition = 0.0;

  System.out.println("The object's position after " + fallingTime +" seconds is " + 0.5*gravity*fallingTime*fallingTime+initialVelocity*fallingTime+initialPosition + " m.");
 }

 }
