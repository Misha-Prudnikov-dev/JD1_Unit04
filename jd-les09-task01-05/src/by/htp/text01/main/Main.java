package by.htp.text01.main;

/*1. Создать объект класса Текст, используя классы Предложение, Слово.
* Методы: дополнить текст, вывести на
* консоль текст, заголовок текста. 
 */
public class Main {

	public static void main(String[] args) {

		TextLogic textLog = new TextLogic();

		Text text = new Text("Rick");

		Sentence sentence1 = new Sentence();
		Sentence sentence2 = new Sentence();
		Sentence sentence3 = new Sentence();

		sentence1.add(new Word("Привет "));
		sentence1.add(new Word("меня "));
		sentence1.add(new Word("зовут "));
		sentence1.add(new Word("Рик! "));

		sentence2.add(new Word("Я "));
		sentence2.add(new Word("живу "));
		sentence2.add(new Word("в городе "));
		sentence2.add(new Word("F1. "));

		sentence3.add(new Word("Я "));
		sentence3.add(new Word("учусь "));
		sentence3.add(new Word("писать "));
		sentence3.add(new Word("ДНК "));
		sentence3.add(new Word("код. "));

		text.add(sentence1);
		text.add(sentence2);
		text.add(sentence3);

		Sentence sentence4 = new Sentence();

		sentence4.add(new Word("Это "));
		sentence4.add(new Word("очеь "));
		sentence4.add(new Word("интересно. "));

		printHeadline(text);

		print(text);

		text = textLog.completeText(sentence4, text);

		print(text);

	}

	public static void printHeadline(Text text) {

		System.out.println("                               " + text.getHeadline());

	}

	public static void print(Text text) {

		for (Sentence s : text.getText()) {
			for (Word w : s.getSentence()) {
				System.out.print(w.getWord());
			}
		}
	}

}
