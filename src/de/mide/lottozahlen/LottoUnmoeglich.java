package de.mide.lottozahlen;

import de.mide.lottozahlen.engine.LottoException;
import de.mide.lottozahlen.engine.LottozahlenGenerator;


/**
 * Programm für Test von Fehlerfall: aus den Zahlen von 1 bis 6 sollen 49 
 * eindeutige Zahlen ausgewählt werden
 */
public class LottoUnmoeglich {
	
	public static void main( String[] args ) throws LottoException {

		System.out.println();
		
		LottozahlenGenerator generator = new LottozahlenGenerator( 49, 6 );
		
		for ( int i = 1; i <= 5; i++ ) {
		
			String tippString = generator.erzeugeTippAlsString();
			System.out.println( "Tipp " + i + ": " + tippString + "\n" );
		}
				
		System.out.println();
	}	
}