class LilBoy extends Human implements Listenable, Hideable {
		
		public LilBoy() {
			super();
		}
		
		public LilBoy(String name, int age, Sex sex) {
			super(name, age, sex);
		}
		
		public void flinch() { System.out.println(this.getName() + " вздрогнул");}
		
		public void listen(Human human) {
			
			if (human.getStatus() == Status.WALKING && human.getName() == "Фрекен Бок") {
				this.flinch();
			} else {
				System.out.println(this.getName() + " не услышал ничего страшного");
			}
			
		}
		
		public void hide(Human human, Place place) {
			
			if (place.addHuman(human)) {
				System.out.println(this.getName() + " спрятал " + human.getName() + " в месте " + place.getName());
			}
			
		}
		
		public void takeTowel(Towel towel) throws TowelIsNotBigEnoughException {
			System.out.println(this.getName() + " взял полотенце " + towel.getStringSize() + " размера " + towel.getColor() + " цвета");
			if (towel.getSize() == Size.BIG) {
				this.say("Полотенце достаточно большое, чтобы спрятать кого-нибудь");
			} else {
				throw new TowelIsNotBigEnoughException("Полотенце недостаточно большое, чтобы кого-то спрятать");
			}
			
		}
		
		public void distract(int noiseLevel, Human human) {
			
			class NoisyStuff{
				private String name;
				private int noiseLevel;
				
				public NoisyStuff(int noiseLevel, String name) {
					this.noiseLevel = noiseLevel;
					this.name = name;
				}
				
				public String getName() { return this.name; }
				
				public int getNoiseLevel() { return this.noiseLevel; }
				
				public int makeNoises() {
					
					System.out.println(this.getName() + " издает шум уровня " + this.getNoiseLevel());
					return getNoiseLevel();
					
				}
				
			}
			
			NoisyStuff clack = new NoisyStuff(noiseLevel, "Погремушка");
			
			System.out.println(this.getName() + " кинул " + clack.getName());
			
			if (clack.makeNoises()>30) {
				System.out.println("Шум привлек внимание " + human.getName());
			} else {
				System.out.println("Шум слишком тихий");
			}
			
		}
		
	}