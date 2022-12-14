package week1;

public class DefaultConstructor {
	private  String colour;
	private  String Size;
	private  int Number;

	DefaultConstructor() {

	}
	DefaultConstructor(int Number) {
		this.Number = Number;
	}
	DefaultConstructor(String colour) {
		this.colour = colour;
	}

	DefaultConstructor( int Number,String Size) {
		this.Size = Size;
		this.Number = Number;
	}

	DefaultConstructor(String colour, String Size, int Number) {
		this.colour = colour;
		this.Size = Size;
		this.Number = Number;
	}

	public static void main(String[] args) {

		DefaultConstructor B = new DefaultConstructor("Green","M",23);
		System.out.println(B.colour);
		System.out.println(B.Number);
		System.out.println(B.Size);
	}

}
