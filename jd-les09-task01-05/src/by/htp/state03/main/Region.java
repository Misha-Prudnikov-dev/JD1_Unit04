package by.htp.state03.main;

import java.util.ArrayList;
import java.util.List;

public class Region {

	private List<Area> areas;
	private String name;
	private int square;
	private int population;

	public Region() {
		name = "Brestskaya";
		square = 32787;
		population = 1380391;
		areas = new ArrayList<Area>();
	}

	public Region(String name, int square, int population) {

		this.name = name;
		this.square = square;
		this.population = population;
		areas = new ArrayList<Area>();

	}

	public void add(Area newArea) {
		areas.add(newArea);
	}

	public List<Area> getAreas() {
		return areas;
	}

	public void setAreas(List<Area> areas) {
		this.areas = areas;
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
		result = prime * result + ((areas == null) ? 0 : areas.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Region other = (Region) obj;
		if (areas == null) {
			if (other.areas != null)
				return false;
		} else if (!areas.equals(other.areas))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (population != other.population)
			return false;
		if (square != other.square)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Region [ name = " + name + ", population = " + population + ", square = " + square + "areas = " + areas
				+ " ]";
	}

}
