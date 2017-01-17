package question1;
//金融学院 金融工程 15011552 朱啸天
public class SolidfigureDemo {

	public static void main(String[] args) {
		Cylinders cylinders=new Cylinders();//构造圆柱体类 并调用相关方法
		cylinders.start();
		cylinders.getSurfaceArea();
		cylinders.getVolume();
		/*
		 * 测试数据
		 *1.输入r=1 h=2							2.输入r=2,h=3						3.输入r=3,h=5
		 *圆柱表面积为18.84955592153876			圆柱表面积为62.83185307179586			圆柱表面积为150.79644737231007
		 *圆柱体积为6.283185307179586				圆柱体积为37.69911184307752			圆柱体积为141.3716694115407
		 */
		
		Cone cone=new Cone();				//构造圆锥类 并调用相关方法
		cone.start();
		cone.getSurfaceArea();
		cone.getVolume();
		/*测试数据
		 * 1.输入r=1,h=2							2.输入r=3,h=6						3.r=5,h=3
		 * 圆锥表面积为10.16640738463052			圆锥表面积为91.49766646167468			圆锥表面积为170.13219452115223
		 * 圆锥体积为2.0943951023931953			圆锥体积为56.548667764616276			圆锥体积为78.53981633974483
		 */
		
		Spheres spheres=new Spheres();		//构造球体类 并调用相关方法
		spheres.start();
		spheres.getSurfaceArea();
		spheres.getVolume();
		/*测试数据
		 * 1.输入r=1								2.输入r=2							3.输入r=3
		 * 球体的表面积为12.566370614359172		球体的表面积为50.26548245743669		球体的表面积为113.09733552923255
		 * 球体的体积为2.356194490192345			球体的体积为18.84955592153876			球体的体积为63.61725123519331
		 */
		
		Cuboid cuboid=new Cuboid();			//构造长方体类 并调用相关方法
		cuboid.start();
		cuboid.getSurfaceArea();
		cuboid.getVolume();
		/*测试数据
		 * 1.输入长＝1，宽＝2，高＝3				2.输入长＝3，宽＝4 高＝5				3.输入长＝2，宽＝3，高＝4
		 * 长方体的表面积为22.0					长方体的表面积为94.0					长方体的表面积为52.0
		 * 长方体的体积是6.0					长方体的体积是60.0						长方体的体积是24.0
		 */
	}
/*
 * 
 */
}

