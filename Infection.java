public class Infection {
	private String name;
	
	public Infection(String name) {
		this.name = name;
		System.out.println("Создана болезнь " + this.name);
	}
	
	public void infect(Human human, int day) {
		human.setHealth(Health.SICK);
		System.out.println(human.getName() + " отправится в больницу " + day + " числа");

	}
}
