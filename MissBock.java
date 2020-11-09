	class MissBock extends Human{
		
		public MissBock() {
			super();
		}
		
		public MissBock(String name, int age, Sex sex) {
			super(name, age, sex);
		}
		
		public void walkAround() {
			this.setStatus(Status.WALKING);
		}
		
	}