import java.util.Scanner;
public class FooCorporation{
  public static void main(String[] args){
	Scanner sc =new Scanner(System.in);
	employees em = new employees(sc.next(),sc.nextDouble(),sc.nextInt());
	try{
	System.out.println(em.getpay());

}	
catch(toolow e){
System.out.println("too low money");
}
catch(toohigh e){
System.out.println("too much work");
}
sc.close();
return ;
} 
}
class employees {
	String name;
	double base;
	int workhours;
public employees(String name,double base,int workhours){
	this.name=name;
	this.base=base;
	this.workhours=workhours;
	
}
public double getpay() throws toohigh,toolow{
	if(this.base<8.00)throw new toolow(this.base);
	if(this.workhours>60)throw new toohigh(this.workhours);
	return workhours>40?(40*base+(workhours-40)*1.5*base):base*workhours;
}
}	

class toohigh extends Exception{
	int time;
	public toohigh(int time){
	super("too much work!!!");
	this.time=time;
}
}
class toolow extends Exception{
	double base;
public toolow(double base){
	super("need more base!!!");
this.base=base;
}
}
