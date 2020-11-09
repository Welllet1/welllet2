
public class Towel {
	private String color;
	private Size size;
	
	public Towel() {
		this.color = "синее";
		this.size = Size.SMALL;
		System.out.println("Создано " + this.color + " полотенце");
	}
	
	public Towel(String color,Size size) {
		this.color = color;
		this.size = size;
		System.out.println("Создано полотенце " + this.color + " цвета");
	}

	public String getColor() { return this.color; }
	
	public Size getSize() { return this.size; }
	
	public String getStringSize() {
		if (this.getSize() == Size.BIG) {
			return "большого";
		} else if (this.getSize() == Size.MEDIUM) {
			return "среднего";
		} else {
			return "маленького";
		}
	}
}
