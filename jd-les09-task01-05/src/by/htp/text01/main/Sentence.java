package by.htp.text01.main;

import java.util.List;
import java.util.ArrayList;

public class Sentence {

	private List<Word> sentence;

	public Sentence() {

		sentence = new ArrayList<Word>();
	}

	public void add(Word newWord) {

		sentence.add(newWord);

	}

	public List<Word> getSentence() {
		return sentence;
	}

	public void setSentence(List<Word> sentence) {
		this.sentence = sentence;

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((sentence == null) ? 0 : sentence.hashCode());
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
		Sentence other = (Sentence) obj;

		if (sentence == null) {
			if (other.sentence != null)
				return false;
		} else if (!sentence.equals(other.sentence)) {
			return false;
		}
		return true;

	}

	public String toString() {
		return "Sentence [ sentence = " + sentence + " ]";
	}
}
