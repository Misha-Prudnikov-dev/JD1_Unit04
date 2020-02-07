package by.htp.car02.main;
/*2. Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы: ехать, заправляться,
менять колесо, вывести на консоль марку автомобиля. */

public class Car {

	private String brand;
	private String color;
	private int maxSpeed;
	private boolean tank;
	private Wheel[] wheel;
	private Engine engine;

	public Car() {
		brand = "BMW";
		color = "Red";
		maxSpeed = 150;
		tank = false;
		wheel = new Wheel[4];
		engine = new Engine();
	}

	public Car(String brand, String color, int maxSpeed, boolean tank, Wheel[] wheel, Engine engine) {
		this.brand = brand;
		this.color = color;
		this.maxSpeed = maxSpeed;
		this.tank = tank;
		this.wheel = wheel;
		this.engine = engine;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public Wheel[] getWheel() {
		return wheel;
	}

	public void setWheel(Wheel[] wheel) {
		this.wheel = wheel;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public boolean getTank() {
		return tank;
	}

	public void setTank(boolean tank) {
		this.tank = tank;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((brand == null) ? 0 : brand.hashCode());
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + ((engine == null) ? 0 : engine.hashCode());
		result = prime * result + maxSpeed;
		result = prime * result + (tank ? 1231 : 1237);
		result = prime * result + ((wheel == null) ? 0 : wheel.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (brand == null) {
			if (other.brand != null)
				return false;
		} else if (!brand.equals(other.brand))
			return false;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (engine == null) {
			if (other.engine != null)
				return false;
		} else if (!engine.equals(other.engine))
			return false;
		if (maxSpeed != other.maxSpeed)
			return false;
		if (tank != other.tank)
			return false;
		if (!wheel.equals(other.wheel))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", color=" + color + ", maxSpeed=" + maxSpeed + ", tank=" + tank + ", wheel="
				+ wheel + ", engine=" + engine + "]";
	}

}
