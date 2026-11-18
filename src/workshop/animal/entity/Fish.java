package workshop.animal.entity;

public class Fish extends Animal implements Pet {
	private String name;
	
	public Fish() {
		super(0);
	}
	
	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String name) {
		
    }

	@Override
	public void play() {
		// TODO Auto-generated metho

	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub

	}

}