package by.htp.state03.main;

import java.util.ArrayList;
import java.util.List;

public class State {

	private City capital;
	private List<Region> regions;
	private String name;
	private int square;
	private int population;

	public State() {
		name = "Belarus";
		square = 207595;
		population = 9475174;
		capital = new City("Minsk", 1992685, 348);
		regions = new ArrayList<Region>();
	}

	public State(String name, City capital, int square, int population) {

		this.name = name;
		this.square = square;
		this.population = population;
		this.capital = capital;
		regions = new ArrayList<Region>();

	}

	public void add(Region newRegion) {
		regions.add(newRegion);
	}

	public City getCapital() {
		return capital;
	}

	public void setCapital(City capital) {
		this.capital = capital;
	}

	public List<Region> getRegions() {
		return regions;
	}

	public void setRegions(List<Region> regions) {
		this.regions = regions;
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
		result = prime * result + ((capital == null) ? 0 : capital.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + population;
		result = prime * result + ((regions == null) ? 0 : regions.hashCode());
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
		State other = (State) obj;
		if (capital == null) {
			if (other.capital != null)
				return false;
		} else if (!capital.equals(other.capital))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (population != other.population)
			return false;
		if (regions == null) {
			if (other.regions != null)
				return false;
		} else if (!regions.equals(other.regions))
			return false;
		if (square != other.square)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "State [capital=" + capital + ", regions=" + regions + ", name=" + name + ", square=" + square
				+ ", population=" + population + "]";
	}

}
