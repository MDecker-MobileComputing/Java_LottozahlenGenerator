package de.mide.lottozahlen;

import de.mide.lottozahlen.engine.LottoException;
import de.mide.lottozahlen.engine.LottozahlenGenerator;


/**
 * Programm, um einen Tipp für italienisches Zahlenlotto "6 aus 90" zu erzeugen.
 */
public class LottoItalien {

	public static void main( String[] args ) throws LottoException {

		System.out.println();
		
		LottozahlenGenerator generator = new LottozahlenGenerator( 6, 90 );
		
		for ( int i = 1; i <= 5; i++ ) {
		
			String tippString = generator.erzeugeTippAlsString();
			System.out.println( "Tipp " + i + ": " + tippString + "\n" );
		}
				
		System.out.println();
	}	
}
