package by.htp.state03.main;

public class Area {

	private City city;
	private String name;
	private int square;
	private int population;

	public Area() {
		name = "Brestskiy";
		square = 1544;
		population = 42400;
		city = new City();
	}

	public Area(City city, String name, int square, int population) {

		this.city = city;
		this.name = name;
		this.square = square;
		this.population = population;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	public int getSquare() {
		return square;
	}

	public void setSquare(int square) {
		this.square = square;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + population;
		result = prime * result + square;
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

		Area other = (Area) obj;

		if (population != other.population)
			return false;
		if (square != other.square)
			return false;

		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Area [ name = " + name + ", population = " + population + ", square = " + square + "city = " + city
				+ " ]";
	}

}
