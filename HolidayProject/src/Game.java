
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage; 
import java.awt.event.*; 


public class Game  extends JPanel implements Runnable, KeyListener{

	
	private BufferedImage back; 
	private ImageIcon background;
	private ImageIcon tree;
	private ImageIcon snowflake;
	private ImageIcon snowflake2;
	private ImageIcon snowflake3;
	private ImageIcon reindeer;
	private ImageIcon present;
	private int key; 
	private int width;
	private int height;
	private Color mynewcolor;
	private Holiday star;
	
	
	
	public Game() {
		back=null; 
		Player p=new Player();
	    p.playmusic("jinglebell.wav");
//Player p = new Player();
//p.play();
		new Thread(this).start();	
		this.addKeyListener(this);
		key =-1; 
		width= 59;
		height= 100;
		mynewcolor= new Color(197,149,240);
		star=new Holiday();
		background= new ImageIcon(star.getBackground());
		tree= new ImageIcon(star.getTree());
		snowflake= new ImageIcon(star.getSnowflake());
		snowflake2= new ImageIcon(star.getSnowflake2());
		snowflake3= new ImageIcon(star.getSnowflake3());
		reindeer= new ImageIcon(star.getReindeer());
		present= new ImageIcon (star.getPresent());
	}

	
	
	public void run()
	   {
	   	try
	   	{
	   		while(true)
	   		{
	   		   Thread.currentThread().sleep(5);
	            repaint();
	         }
	      }
	   		catch(Exception e)
	      {
	      }
	  	}
	

	
	
	
	public void paint(Graphics g){
		
		Graphics2D twoDgraph = (Graphics2D) g; 
		if( back ==null)
			back=(BufferedImage)( (createImage(getWidth(), getHeight()))); 
		

		Graphics g2d = back.createGraphics();
	
		g2d.clearRect(0,0,getSize().width, getSize().height);
		g2d.drawImage(background.getImage(), 0, 0, getWidth(), getHeight(),this);

		
		g2d.setFont(new Font("Comic Sans MS", Font.BOLD, 50));
		Color Newcolor= new Color (250,25,90);
		g2d.setColor(Newcolor);
		g2d.drawString("Merry Christmas!", 200, 50);
		g2d.setFont(new Font("Comic Sans MS",Font.BOLD,20));
		g2d.drawString("key"+ key, 5, 25);
		g2d.setColor(mynewcolor);
		//g2d.fillRect(200, 200, width, height);
		//g2d.fillRect(star.getX(), star.getY(), 50, 50);
	star.move();
	
	g2d.drawImage(present.getImage(),star.getX8(),star.getY8(), 200,150, this);
	g2d.drawImage(tree.getImage(),star.getX4(),star.getY4(), 400,500, this);
	g2d.drawImage(reindeer.getImage(),star.getX6(),star.getY6(), 200,150, this);
	g2d.drawImage(snowflake.getImage(),star.getX5(),star.getY5(), 200,150, this);
	g2d.drawImage(snowflake2.getImage(),star.getX7(),star.getY7(), 200,150, this);
	g2d.drawImage(snowflake3.getImage(),star.getX9(),star.getY9(), 200,150, this);
	
	

		twoDgraph.drawImage(back, null, 0, 0);

	}





	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}





	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
		key= e.getKeyCode();
		System.out.println(key);
		
	
		
			if (key==76) {
				star.setDx(2);
				
			}
			if (key==74) {
				star.setDx2(2);
			}
			if(key==73) {
				star.setDy(2);
				
			}
			if(key==75) {
				star.setDy2(2);
				
			}
	}



	@Override
	public void keyReleased(KeyEvent e) {
	
		if (e.getKeyCode()==76) {
			star.setDx(0);
		}
		if (e.getKeyCode()==74) {
			star.setDx2(0);
		}
		if (e.getKeyCode()==73) {
			star.setDy(0);
		}
		if (e.getKeyCode()==75) {
			star.setDy2(0);
		}
	}
	
	
	

	
}

