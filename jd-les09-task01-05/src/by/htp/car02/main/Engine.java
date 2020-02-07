package by.htp.car02.main;

public class Engine {

	private String typeEngine;
	private int power;

	public Engine() {

		typeEngine = "diesel";
		power = 40;
	}

	public Engine(String typeEngine, int power) {
		this.typeEngine = typeEngine;
		this.power = power;
	}

	public String getTypeEngine() {
		return typeEngine;

	}

	public void setTypeEngine(String typeEngine) {
		this.typeEngine = typeEngine;

	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((typeEngine == null) ? 0 : typeEngine.hashCode());
		result = prime * result + power;
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

		Engine other = (Engine) obj;
		if (power != other.power)
			return false;

		if (typeEngine == null) {
			if (other.typeEngine != null)
				return false;
		} else if (!typeEngine.equals(other.typeEngine))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Engine [ typeEngine = " + typeEngine + " power = " + power + " ]";
	}

}
