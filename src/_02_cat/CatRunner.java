package _02_cat;

public class CatRunner {
	public static void main(String[] args) {
		Cat catty=new Cat("catty");
		catty.meow();
		catty.printName();
		for(int i=0;i<9;i++) {
			catty.kill();
		}
	}
}
