public abstract class Human {
	
		private String name;
		private int age;
		private Status status;
		private Sex sex;
		private Health health;
		public Human() {
			this.name = "Безымянный";
			this.age = 0;
			this.status = Status.STAYING;
			this.sex = Sex.MALE;
			System.out.println("Создан безымянный человек");
		}
		
		public Human(String name, int age, Sex sex) {
			this.name = name;
			this.age = age;
			this.status = Status.STAYING;
			this.sex = sex;
			if (this.sex == Sex.MALE) {
				System.out.println("Создан " + this.name);
			} else {
				System.out.println("Создана " + this.name);
			}
		}
		
		public String getName() { return this.name; }
		
		public int getAge() { return this.age; }
		
		public Status getStatus() { return this.status; }
		
		public String getStringStatus() {
			Status stat = this.getStatus();
			if (stat == Status.WALKING) { return "идет"; }
			else if (stat == Status.STAYING) { return "стоит"; }
			else if (stat == Status.SITTING) { return "сел"; }
			else { return "лежит"; }
			
		}
		
		public String getHealth() {
			if (this.sex == Sex.MALE) {
				if (this.health == Health.HEALTHY) { return "здоров";}
				else { return "болен";}
			} else {
				if (this.health == Health.HEALTHY) { return "здорова";}
				else { return "больна";}
			}
		}
		
		public Sex getSex() { return this.sex; }
		
		public boolean setStatus(Status status) {
			
			if (this.status == status) {
				System.out.println(this.getName() + " уже " + this.getStringStatus());
				return false;
			} else {
				this.status = status;
				System.out.println(this.getName() + " " + this.getStringStatus());
				return true;
			}
			
		}
		
		public boolean setHealth(Health health) {
			if (this.health == health) {
				System.out.println(this.getName() + " уже " + this.getHealth());
				return false;
			} else {
				this.health = health;
				System.out.println(this.getName() + " теперь " + this.getHealth());
				return true;
			}
		}
		
		public void say(String words) {
			if (words.length()==0) {
				System.out.println(this.getName() + " молчит...");
			} else {
				System.out.println(this.getName() + " говорит: '" + words + "'");
			}
		}
		
		public void walk(Place place) {
			if (this.setStatus(Status.WALKING)) {
				System.out.println(this.getName() + " идет к " + place.getName());
			}
		}
		
		public void stay() {
			this.setStatus(Status.STAYING);
		}
		
		public void sit() {
			this.setStatus(Status.SITTING);
		}
		
		public void lie() {
			this.setStatus(Status.LYING);
		}
		
		@Override
		public int hashCode() {
			int res = 0;
			for (int i = 0; i<this.getName().length(); i++) {
				res = (res + (int) this.getName().charAt(i)) % 1000000000;
			}
			res = (res + this.getAge()) % 1000000000;
			return res;
		}
		
		@Override
		public boolean equals(Object obj) {
			if (obj == this) {
				return true;
			}
			Human hum = (Human) obj;
			if (this.hashCode() != hum.hashCode()) {
				return false;
			}
			return (this.getName() == hum.getName() && this.getAge() == hum.getAge() && this.getSex() == hum.getSex());
		}
		
		@Override
		public String toString() {
			String res = "Имя: " + this.getName() + "; возраст: " + this.getAge() + "; пол: " + this.getSex();
			return res;
		}
	
	}