import javax.microedition.lcdui.*;
import javax.microedition.midlet.*;
import java.io.*;

public class AI extends MIDlet
{
	Display display;
	MainCanvas mc;
	public AI(){
		display=Display.getDisplay(this);
		mc=new MainCanvas();
		display.setCurrent(mc);
	}
	public void startApp(){
	}
	public void destroyApp(boolean unc){
	}
	public void pauseApp(){
	}
}
class MainCanvas extends Canvas
{

	/*
	变量的声明
	语法：数据类型 变量名称（标识符）;
	*/
	int x,y,flag;
	Image downImg,leftImg,rightImg,upImg,currentImg,turnrImg1,turnrImg2,turnlImg1,turnlImg2,turnupImg1,turnupImg2,turndImg1,turndImg2;
	public MainCanvas(){
		try
		{
			/*
			给变量赋值
			语法：变量名称=value;
			*/
			
			downImg=Image.createImage("/sayo10.png");
			leftImg=Image.createImage("/sayo12.png");
			rightImg=Image.createImage("/sayo16.png");
			upImg=Image.createImage("/sayo24.png");
			turnrImg1=Image.createImage("/sayo06.png");
			turnrImg2=Image.createImage("/sayo26.png");
			turnlImg1=Image.createImage("/sayo02.png");
			turnlImg2=Image.createImage("/sayo22.png");
			turnupImg1=Image.createImage("/sayo04.png");
			turnupImg2=Image.createImage("/sayo24.png");
			turndImg1=Image.createImage("/sayo00.png");
			turndImg2=Image.createImage("/sayo20.png");
			currentImg=downImg;
			x=120;
			y=100;
			flag=1;
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
	public void paint(Graphics g)
	{
		g.setColor(0,0,0);
		g.fillRect(0,0,getWidth(),getHeight());
		g.drawImage(currentImg,x,y,0);//120：X坐标、100：Y坐标
	}
	public void keyPressed(int keyCode)
	{
		int action=getGameAction(keyCode);
		/*
		action的值：UP、DOWN、LEFT、RIGHT
		*/
		    if(action==LEFT)
			{
			/*
			实现转向代码
			*/
			/*
			给变量重新赋值即可
			*/
			currentImg=leftImg;
			x=x-1;
		    if (flag==1)
				{
					currentImg=turnlImg1;
					flag++;
				}
				else if (flag==2)
				{
                    currentImg=turnlImg2;
					flag=1;
				}
			
			}
			if(action==RIGHT)
			{
			currentImg=rightImg;
			x=x+1;
			    if (flag==1)
				{
					currentImg=turnrImg1;
					flag++;
				}
				else if (flag==2)
				{
                    currentImg=turnrImg2;
					flag=1;
				}
			}
		    if(action==UP)
			{
			currentImg=upImg;
			y=y-1;
			  if (flag==1)
				{
					currentImg=turnupImg1;
					flag++;
				}
				else if (flag==2)
				{
                    currentImg=turnupImg2;
					flag=1;
				}
			}
			
			if(action==DOWN)
			{
			currentImg=downImg;
			y=y+1;
			  if (flag==1)
				{
					currentImg=turndImg1;
					flag++;
				}
				else if (flag==2)
				{
                    currentImg=turndImg2;
					flag=1;
				}
			
			}
			repaint();
	}
}