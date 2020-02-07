package by.htp.text01.main;

/*1. Создать объект класса Текст, используя классы Предложение, Слово.
* Методы: дополнить текст, вывести на
* консоль текст, заголовок текста. 
 */

import java.util.List;

import java.util.ArrayList;

public class Text {

	private String headline;
	private List<Sentence> text;

	public Text(String headline) {

		this.headline = headline;

		text = new ArrayList<Sentence>();
	}

	public void add(Sentence newSentence) {

		text.add(newSentence);

	}

	public String getHeadline() {
		return headline;
	}

	public void setHeadline(String headline) {
		this.headline = headline;
	}

	public List<Sentence> getText() {
		return text;
	}

	public void setText(List<Sentence> text) {
		this.text = text;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((text == null) ? 0 : text.hashCode());
		result = prime * result + ((headline == null) ? 0 : headline.hashCode());

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
		Text other = (Text) obj;

		if (text == null) {
			if (other.text != null)
				return false;
		} else if (!text.equals(other.text))
			return false;
		if (headline == null) {
			if (other.headline != null)
				return false;
		} else if (!headline.equals(other.headline))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Text [ text = " + text + ", headline =  " + headline + " ]";
	}
}
