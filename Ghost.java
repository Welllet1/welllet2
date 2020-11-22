
public class Ghost {
	private String name;
	
	public Ghost() {
		this.name = "Простое привидение";
		System.out.println("Создано простое привидение");
	}
	
	public String getName() {
		return this.name;
	}
	
	public Ghost(String name) {
		this.name = name;
		System.out.println("Создано привидение по имени " + name);
	}
	
	public void come(int day) {
		System.out.println(this.name + " хочет прийти в дом " + day + " числа");
	}
}
