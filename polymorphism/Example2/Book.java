package PracticePrograms.coreJava.polymorphism.Example2;

 class item {
	protected double price=5;
		public double getPrice() {
			return price;
		}
}
		
	public class Book extends item{
			double price=15;
		
		public double getPrice() {
			double a =10;
			return price+=3;
		}
		public static void main(String[] args) {
			item item =new Book();
			Book book =(Book) item;
			System.out.print(item.price);
			System.out.print(",");
			System.out.print(item.getPrice());
			System.out.print(",");
			System.out.print(book.price);
			System.out.print(",");
			System.out.print(book.getPrice());
			System.out.print(",");
		}
}
