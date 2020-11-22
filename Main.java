import java.util.Scanner;
public class Main{
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		Place bed = new Place("кровать");
		LilBoy boy = new LilBoy("Малыш", 5, Sex.MALE);
		Carlson carlson = new Carlson("Карлсон", 65, Sex.MALE);
		MissBock missbock = new MissBock("Фрекен Бок", 17, Sex.FEMALE);
		SecondaryPerson bosse = new SecondaryPerson("Боссе", 10, Sex.MALE);
		SecondaryPerson betan = new SecondaryPerson("Бетан", 11, Sex.FEMALE);
		
		Infection coronavirus = new Infection("коронавирус",1);
		
		try {
			coronavirus.infect(bosse, 21);
			coronavirus.infect(betan, 21);
		} catch (InfectionIsTooWeakException exception) {
			System.out.println(exception.getMessage());
		}
		

		
		Ghost ghost = new Ghost();
		ghost.come(15);
		
		carlson.say("Скарлатина -- дело житейское и беспокоиться здесь ровным счетом не о чем. Да и к тому же очень удачно, что болезнь отправила Боссе и Бетан в больницу именно в тот день, когда в доме появится привидение.");
		missbock.walkAround();
		boy.listen(missbock);
		boy.say("Надо срочно действовать");
		carlson.lie();
		carlson.hide(carlson, bed);
		System.out.println("Какого размера полотенце?");
		int size = in.nextInt();
		Towel towel = new Towel();
		if (size==2) {
			towel.setSize(Size.BIG);
		} else {
			towel.setSize(Size.SMALL);
		}
		
		Towel.StoragePlace chest = new Towel.StoragePlace("Комод", 4);
		try {
			boy.walk(chest);
			boy.takeTowel(towel);
			boy.walk(bed);
			boy.sit();
			boy.hide(carlson, bed);
		} catch (TowelIsNotBigEnoughException exception) {
			System.out.println(exception.getMessage());
			boy.flinch();
			boy.distract(50, missbock);
			boy.hide(carlson, new Place("Шкаф") {
				public boolean addHuman(Human human) {
					if (this.getFreePlace() < 2) {
						
						this.getHumans()[this.getFreePlace()] = human;
						if (!(this.getHumans()[0].equals(human))) {
							updateFreePlace();
						}
						System.out.println(human.getName() + " залез в " + this.getName());
						return true;
						
					} else {
						
						System.out.println("Место " + this.getName() + " уже заполнено");
						return false;
						
					}
				}
			});
		}
		
		missbock.stay();
		boy.listen(missbock);
		boy.say("Фрекен бок ушла, ура");
		carlson.propeller1.start();
		
		in.close();
	}

}