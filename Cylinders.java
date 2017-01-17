package question1;
import java.lang.Math;
import java.util.Scanner;
//金融学院 金融工程 15011552 朱啸天
public class Cylinders implements Solidfigure {
	double radius,height;  								//声明参数
	@Override
	public void start() {
		System.out.println("请分别输入半径和高");
		Scanner input = new Scanner(System.in);
		double r = 0, h = 0;							//重写start类，提示输入半径和高
		r = input.nextDouble();
		h = input.nextDouble();
		this.radius = r;
		this.height = h;

	}

	@Override
	public void getSurfaceArea() {
		double surfaceArea=2*Math.PI*radius*radius+2*Math.PI*radius*height;
		System.out.println("圆柱表面积为"+surfaceArea);//重写类，运用公式计算圆柱的表面积
	}

	@Override
	public void getVolume() {
		double volume = Math.PI * radius * radius * height;
		System.out.println("圆柱体积为" + volume);		//重写类，运用公式计算圆柱的体积

	}

}
