package lamdaExpression;

public class Example1 {

	public Example1() {
		// TODO Auto-generated constructor stub
		int width=10;
		
		Drawable  d2=()->{
			System.out.println(" implementing "+width);
		};
		d2.draw();
	}
}


@FunctionalInterface
interface Drawable{
	public void draw();
	
}
