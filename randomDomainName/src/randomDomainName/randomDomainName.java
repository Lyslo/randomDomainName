package randomDomainName;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class randomDomainName {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		// Filereader || Reads from the selected wordlist into the lines array
		int fileLength = 10000;
		String[] lines = new String[fileLength];

		File file = new File("filename");
		Scanner scan = new Scanner(file);

		int lineNumber = 0;
		while (scan.hasNextLine()) {
			lines[lineNumber] = scan.nextLine();
			lineNumber++;

		}

		// Random Domain Generator || selects a random word from the wordlist and adds
		// ".com" to the end

		int min = 0;
		int max = fileLength;

		int randomInt = (int) (Math.random() * (max - min + 1) + min);
		String domain = lines[randomInt] + ".com";
		System.out.println(domain);

	}

}
