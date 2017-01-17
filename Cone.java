package question1;
import java.lang.Math;
import java.util.Scanner;
//金融学院 金融工程 15011552 朱啸天
public class Cone implements Solidfigure {
	double radius,height,bevelEdge;							//声明参数
	@Override
	public void start() {
		System.out.println("请分别输入半径和高");				//重写start类，提示输入半径和高
		Scanner input = new Scanner(System.in);
		double r = 0, h = 0;
		r = input.nextDouble();
		h = input.nextDouble();
		
		this.radius=r;
		this.height=h;
	}

	

	@Override
	public void getSurfaceArea() {
		double surfaceArea=Math.PI*radius*radius+Math.PI*radius*Math.sqrt(radius*radius+height*height);
		System.out.println("圆锥表面积为"+surfaceArea);		//重写类，运用公式计算圆锥的面积 并输出
	}

	@Override
	public void getVolume() {
		double volume =  Math.PI * radius * radius * height*1/3.0;
		System.out.println("圆锥体积为" + volume);				//重写类，运用公式就算圆锥体积 并输出

	}

}
