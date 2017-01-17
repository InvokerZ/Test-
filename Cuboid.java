package question1;
//金融学院 金融工程 15011552 朱啸天
import java.util.Scanner;

public class Cuboid implements Solidfigure {
double length,width,height;									//声明长度 宽度 高度
	@Override
	public void start() {
		Scanner input=new Scanner(System.in);				//重写start类 提示输入相关参数
		double l=0,w=0,h=0;
		System.out.println("请依次输入长度，宽度，高度");
		l=input.nextDouble();
		w=input.nextDouble();
		h=input.nextDouble();
		this.length=l;
		this.width=w;
		this.height=h;

	}

	@Override
	public void getSurfaceArea() {
		double surfaceArea=2*(length*width+length*height+height*width);
		System.out.println("长方体的表面积为"+surfaceArea); //重写类 运用公式计算长方体的表面积

	}

	@Override
	public void getVolume() {
		double volume=length*height*width;
		System.out.println("长方体的体积是"+volume);		//重写类 运用公式计算长方体的体积
	}

}
