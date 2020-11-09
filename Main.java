public class Main{
	public static void main(String[] args) {

		Place bed = new Place("кровать");
		LilBoy boy = new LilBoy("Малыш", 5, Sex.MALE);
		Carlson carlson = new Carlson("Карлсон", 65, Sex.MALE);
		MissBock missbock = new MissBock("Фрекен Бок", 17, Sex.FEMALE);
		SecondaryPerson bosse = new SecondaryPerson("Боссе", 10, Sex.MALE);
		SecondaryPerson betan = new SecondaryPerson("Бетан", 11, Sex.FEMALE);
		
		Infection coronavirus = new Infection("коронавирус");
		coronavirus.infect(bosse,15);
		coronavirus.infect(betan, 15);
		Towel towel = new Towel("красного", Size.BIG);
		
		Ghost ghost = new Ghost();
		ghost.come(15);
		
		carlson.say("Скарлатина -- дело житейское и беспокоиться здесь ровным счетом не о чем. Да и к тому же очень удачно, что болезнь отправила Боссе и Бетан в больницу именно в тот день, когда в доме появится привидение.");
		missbock.walkAround();
		boy.listen(missbock);
		boy.say("Надо срочно действовать");
		carlson.lie();
		carlson.hide(carlson, bed);
		boy.takeTowel(towel);
		boy.walk(bed);
		boy.sit();
		boy.hide(carlson, bed);
	}

}