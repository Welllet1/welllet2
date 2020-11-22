public class Infection {
	private String name;
	private int strength;
	public Infection(String name, int str) {
		this.name = name;
		this.strength = str;
		System.out.println("Создана болезнь " + this.name + " с силой " + this.strength);
	}
	
	public void infect(Human human, int day) throws InfectionIsTooWeakException{
		if (this.strength>20) {
			human.setHealth(Health.SICK);
			System.out.println(human.getName() + " отправится в больницу " + day + " числа");
		} else {
			throw new InfectionIsTooWeakException("Болезнь слишком слаба, чтобы кого-то заразить");
		}
	}
	
}
