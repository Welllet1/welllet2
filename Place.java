public class Place{
		
		private String name;
		private Human[] humans;
		private int freePlace;
		
		public Place() {
			this.name = "Безымянное место";
			this.humans = new Human[3];
			this.freePlace = 0;
			System.out.println("Создано " + this.name);
		}
		
		public Place(String name) {
			this.name = name;
			this.humans = new Human[3];
			this.freePlace = 0;
			System.out.println("Создано место " + name);
		}
		
		public String getName() { return this.name; }
		
		public Human[] getHumans() { return this.humans; }
		
		public boolean addHuman(Human human) {
			
			if (this.freePlace < 3) {
				
				this.humans[this.freePlace] = human;
				if (!(this.humans[0].equals(human) || this.humans[1].equals(human))) {
					this.freePlace+=1;
				}
				return true;
				
			} else {
				
				System.out.println("Место " + this.name + " уже заполнено");
				return false;
				
			}
			
		}
		
		@Override
		public int hashCode() {
			int res = 0;
			for (int i = 0; i<this.getName().length(); i++) {
				res = (res + (int) this.getName().charAt(i)) % 1000000000;
			}
			return res;
		}
		@Override
		public boolean equals(Object obj) {
			if (obj == this) {
				return true;
			}
			Place plc = (Place) obj;
			if (this.hashCode() != plc.hashCode()) {
				return false;
			}
			return (this.getName() == plc.getName());
		}
		
		@Override
		public String toString() {
			String res = "Название: " + this.getName();
			return res;
		}
		
	}
