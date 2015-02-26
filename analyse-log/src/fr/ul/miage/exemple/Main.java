/**
 * Classe qui appelle l
 * La lecture du flux de carractère se fait sur l'entréee standard
 */
package fr.ul.miage.exemple;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import fr.ul.miage.exemple.generated.ParserCup;
import fr.ul.miage.exemple.generated.Yylex;

/**
 * @author Azim Roussanaly
 *
 */
public class Main {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		System.out.println("ta mere la cafetiere");
		File f = new File("./exemple.log");
		  FileInputStream fis = null;
		try {
			fis = new FileInputStream(f);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		  ParserCup parser = new ParserCup(new Yylex(fis));
		try {
			parser.parse();
		} catch (Exception e) {
			System.err.println("...Erreur de syntaxe ");
			System.exit(1);
			System.exit(1);
		}
	}
	
	

}
