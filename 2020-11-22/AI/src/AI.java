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
	Image currentImg;
	Image heroImg[][]=new Image[4][3];
	/*Image heroLeftImg[]=new Image[3];
	Image heroRightImg[]=new Image[3];
	Image heroUpImg[]=new Image[3];
	Image herodownImg[]=new Image[3];*/
	//Image downImg,leftImg,rightImg,upImg,currentImg,turnrImg1,turnrImg2,turnlImg1,turnlImg2,turnupImg1,turnupImg2,turndImg1,turndImg2;
	public MainCanvas(){
		try
		{
			/*
			给变量赋值
			语法：变量名称=value;
			*/
			for (int i=0;i<heroImg.length;i++)//0:left,1:right,2:up,3:down
			{
				for(int j=0;j<heroImg[i].length;j++)
				{
					heroImg[i][j]=Image.createImage("/sayo"+i+j+".png");
				}
			}
			//下
			/*for (int i=0;i<herodownImg.length;i++ )
            {
				herodownImg[i]=Image.createImage("/sayo"+i+"0.png");
            }
			/*downImg=Image.createImage("/sayo10.png");
            turndImg1=Image.createImage("/sayo00.png");
			turndImg2=Image.createImage("/sayo20.png");

            for (int i=0;i<heroLeftImg.length;i++ )
            {
				heroLeftImg[i]=Image.createImage("/sayo"+i+"2.png");
            }
            //左
			/*leftImg=Image.createImage("/sayo12.png");
			turnlImg1=Image.createImage("/sayo02.png");
			turnlImg2=Image.createImage("/sayo22.png");
			

			//右
			 for (int i=0;i<heroRightImg.length;i++ )
            {
				heroRightImg[i]=Image.createImage("/sayo"+i+"6.png");
            }
			/*rightImg=Image.createImage("/sayo16.png");
			turnrImg1=Image.createImage("/sayo06.png");
			turnrImg2=Image.createImage("/sayo26.png");
			
			//上
			 for (int i=0;i<heroUpImg.length;i++ )
            {
				heroUpImg[i]=Image.createImage("/sayo"+i+"4.png");
            }
			/*upImg=Image.createImage("/sayo24.png");
			turnupImg1=Image.createImage("/sayo04.png");
			turnupImg2=Image.createImage("/sayo14.png");*/
			
			currentImg=heroImg[3][0];
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
			currentImg=heroImg[0][0];
			x=x-1;
		    if (flag==1)
				{
					currentImg=heroImg[0][1];
					flag++;
				}
				else if (flag==2)
				{
                    currentImg=heroImg[0][2];
					flag=1;
				}
			
			}
			if(action==RIGHT)
			{
			currentImg=heroImg[1][0];
			x=x+1;
			    if (flag==1)
				{
					currentImg=heroImg[1][1];
					flag++;
				}
				else if (flag==2)
				{
                    currentImg=heroImg[1][2];
					flag=1;
				}
			}

		    if(action==UP)
			{
			currentImg=heroImg[2][0];
			y=y-1;
			  if (flag==1)
				{
					currentImg=heroImg[2][1];
					flag++;
				}
				else if (flag==2)
				{
                    currentImg=heroImg[2][2];
					flag=1;
				}
			}
			
			if(action==DOWN)
			{
			currentImg=heroImg[3][0];
			y=y+1;
			  if (flag==1)
				{
					currentImg=heroImg[3][1];
					flag++;
				}
				else if (flag==2)
				{
                    currentImg=heroImg[3][2];
					flag=1;
				}
			
			}
			repaint();
	}
}