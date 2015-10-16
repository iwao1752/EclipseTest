public class ArgTest {
	public static void main(String args[]){
		PrintName("abc");
		PrintName("def");
		PrintName("");
	}
	
	public static void PrintName(String name){
		System.out.println( "Hello!," + name );
	}
	
	public static void ArgCalc(int x, int y, int z){
		System.out.println("x = " + x + " / y = " + y + " / z = " + z );
		System.out.println("------------------");
		System.out.println(" add(x+y+z) result is... " + (x + y + z));
		System.out.println(" div(x-y-z) result is... " + (x - y - z));
	}

}
