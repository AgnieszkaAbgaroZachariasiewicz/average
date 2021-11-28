import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		System.out.println("Podaj imie:");
		String name = scanner.next();

		System.out.println("Podaj nazwisko:");
		String surname = scanner.next();

		System.out.println("Podaj telefon:");
		String tel = scanner.next();

		System.out.println("Podaj miasto:");
		String city = scanner.next();

		String firstLine = "* " + name + " " + surname + " ";
		String lastLine = "* tel. " + tel + " adres: " + city + " ";
		int frameLength = lastLine.length() > firstLine.length() ? lastLine.length() + 1 : firstLine.length() + 1;

		StringBuilder frame = new StringBuilder();
		for (int i = 0; i < frameLength; i++) {
			frame.append("*");
		}

		String rigthFrame = "*";
		int fnumber;
		int snumber;

		if (lastLine.length() > firstLine.length()) {
			fnumber = lastLine.length() - firstLine.length();
			snumber = 0;
		}  else if (firstLine.length() > lastLine.length()) {
			snumber = firstLine.length() - lastLine.length();
			fnumber = 0;
		} else {
			fnumber = 0;
			snumber = 0;
		}

		StringBuilder xf = new StringBuilder();
		for (int i = 0; i < fnumber; i++) {
			xf.append(" ");
		}

		StringBuilder xs = new StringBuilder();
		for (int i = 0; i < snumber; i++) {
			xs.append(" ");
		}

		System.out.println(frame);
		System.out.println(firstLine + xf + rigthFrame);
		System.out.println(lastLine + xs + rigthFrame);
		System.out.println(frame);
	}
}
