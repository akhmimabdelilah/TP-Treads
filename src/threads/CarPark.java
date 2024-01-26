package threads;

public class CarPark implements Runnable {
	private int capacity;

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	
	public CarPark() {
		super();
	}

	public CarPark(int capacity) {
		super();
		this.capacity = capacity;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
}
