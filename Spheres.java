package question1;
import java.lang.Math;
import java.util.Scanner;
//金融学院 金融工程 15011552 朱啸天
public class Spheres implements Solidfigure {
	double radius;										//声明参数
	@Override
	public void start() {								//重写start类，提示输入半径
		// TODO Auto-generated method stub			
		System.out.println("请输入半径");					
		Scanner input = new Scanner(System.in);
		double r=0 ;
		r = input.nextDouble();			
		this.radius = r;  								
	}

	@Override
	public void getSurfaceArea() {
		double surfaceArea=4*Math.PI*radius*radius;		//重写类，运用公式计算球体的面积 并输出
		System.out.println("球体的表面积为"+surfaceArea);

	}

	@Override
	public void getVolume() {
		double volume=3/4.0*Math.PI*radius*radius*radius;//重写类，运用公式就算球体体积 并输出
		System.out.println("球体的体积为"+volume);

	}

}
