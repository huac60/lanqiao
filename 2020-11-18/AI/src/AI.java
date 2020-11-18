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
	����������
	�﷨���������� �������ƣ���ʶ����;
	*/
	int x,y,flag;
	Image downImg,leftImg,rightImg,upImg,currentImg,turnrImg1,turnrImg2,turnlImg1,turnlImg2,turnupImg1,turnupImg2,turndImg1,turndImg2;
	public MainCanvas(){
		try
		{
			/*
			��������ֵ
			�﷨����������=value;
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
		g.drawImage(currentImg,x,y,0);//120��X���ꡢ100��Y����
	}
	public void keyPressed(int keyCode)
	{
		int action=getGameAction(keyCode);
		/*
		action��ֵ��UP��DOWN��LEFT��RIGHT
		*/
		    if(action==LEFT)
			{
			/*
			ʵ��ת�����
			*/
			/*
			���������¸�ֵ����
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