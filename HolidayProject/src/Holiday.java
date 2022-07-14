
public class Holiday {

	private String background;
	private int x;
	private int y;
	private int dx;
	private int dx2;
	private int dy;
	private int dy2;
	private String tree;
	private int x4;
	private int y4;
	private String snowflake;
	private int x5;
	private int y5;
	private String reindeer; 
	private int x6;
	private int y6;
	private String present;
	private int x8;
	private int y8;
	private boolean reverse;
	private boolean reversey;
	private boolean reverse2;
	private boolean reversey2;
	private boolean reverse3;
	private boolean reversey3;
	private String  snowflake2;
	private int x7;
	private int y7;
	private String snowflake3;
	private int x9;
	private int y9;
	
 
	
	public Holiday(){
		background="background.jpg";
		x=200;
		y=300;
		dx=0;
		dx2=0;
		dy=0;
		dy2=0;
		tree="christmastree.png";
		x4=20;
		y4=50;
		snowflake= "snowflake.png";
		x5= 200;
		y5=200;
		reindeer= "smallreindeer.png";
		x6= 500;
		y6= 300;
		present= "present.png";
		x8= 500;
		y8= 300;
		reverse= false;
		reversey= false;
		reverse2= false;
		reversey2= false;
		reverse3= false;
		reversey3= false;
		snowflake2= "snowflake copy.png";
		x7=400;
		y7=300;
		snowflake3= "snowflake.png";
		x9=500;
		y9=100;
		
			
		
	}
	public String getBackground() {
		return background;
	}
	public String getSnowflake() {
		return snowflake;
	}
	public String getSnowflake2() {
		return snowflake2;
	}
	public String getSnowflake3() {
		return snowflake3;
	}
	public String getTree() {
		return tree;
	}
	public String getReindeer() {
		return reindeer;
	}
	public String getPresent() {
		return present;
	}
	public int getX() {
		return x;
	}
public int getY() {
	return y;
}
public int getX4() {
	return x4;
}
public int getY4() {
	return y4;
}
public int getX5() {
	return x5;
}
public int getY5() {
	return y5;
}
public int getX6() {
	return x6;
}
public int getY6() {
	return y6;
}
public int getX7() {
	return x7;
}
public int getY7() {
	return y7;
}
public int getX8() {
	return x8;
}
public int getY8() {
	return y8;
}
public int getX9() {
	return x9;
}
public int getY9() {
	return y9;
}

//reindeer
public void move() {
	x6+=dx;
	x6-=dx2;
	y6-=dy;
	y6+=dy2;
	//snowflake
	System.out.println("x5="+x5);
	if (x5>650 || x5<-50) {
		reverse=!reverse;
	}

	if (reverse)
	{
		x5--;
	}
	else
	{
		x5++;
	}
	System.out.println ("y5="+y5);
	if (y5>440 || y5<-10) {
		reversey=!reversey;
	}
	if (reversey) {
		y5--;
	}
	else {
		y5++;
	}
	//snowflake2 begins
	System.out.println("x7="+x7);
	if (x7>650 || x7<-50) {
		reverse2=!reverse2;
	}

	if (reverse2)
	{
		x7--;
	}
	else
	{
		x7++;
	}
	System.out.println ("y7="+y7);
	if (y7>440 || y7<-10) {
		reversey2=!reversey2;
	}
	if (reversey2) {
		y7--;
	}
	else {
		y7++;
	}
	//snowflake3 begins
	System.out.println("x9="+x9);
	if (x9>650 || x9<-50) {
		reverse3=!reverse3;
	}

	if (reverse3)
	{
		x9--;
	}
	else
	{
		x9++;
	}
	System.out.println ("y9="+y9);
	if (y9>440 || y9<-10) {
		reversey3=!reversey3;
	}
	if (reversey3) {
		y9--;
	}
	else {
		y9++;
	}
}
public void setDx(int dxFromGame) {
	dx= dxFromGame;
}
public void setDx2(int dx2FromGame) {
	dx2=dx2FromGame;
}
public void setDy(int dyFromGame) {
	dy=dyFromGame;
}
public void setDy2(int dy2FromGame) {
	dy2=dy2FromGame;
}


	
	
}
