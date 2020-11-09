	class Carlson extends Human implements Hideable{
		
		public Carlson() {
			super();
		}
		
		public Carlson(String name, int age, Sex sex) {
			super(name, age, sex);
		}
		
		public void hide(Human human, Place place) {
			
			if (human.equals(this) && place.addHuman(human)) {
				System.out.println(this.getName() + " спрятался в " + place.getName());
			}
		    else if (place.addHuman(human)) {
				System.out.println(this.getName() + " спрятал " + human.getName() + " в месте " + place.getName());
			}
			
			
		}
		
		@Override
		public String getStringStatus() {
			Status stat = this.getStatus();
			if (stat == Status.WALKING) { return "перекатывается"; }
			else if (stat == Status.STAYING) { return "стоит"; }
			else if (stat == Status.SITTING) { return "сидит"; }
			else { return "плюхнулся на пол"; }
			
		}
		
	}