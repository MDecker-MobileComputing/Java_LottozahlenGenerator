package de.mide.lottozahlen;

import de.mide.lottozahlen.engine.LottoException;
import de.mide.lottozahlen.engine.LottozahlenGenerator;

/**
 * Programm, um einen Tipp für deutsches Zahlenlotto "6 aus 49" zu erzeugen.
 */
public class LottoDeutsch {
	
	public static void main( String[] args ) throws LottoException {

		LottozahlenGenerator generator = new LottozahlenGenerator( 6, 49 );
		
		String tippString = generator.erzeugeTippAlsString();
		
		System.out.println( "\n" + tippString + "\n" );		
	}
	
}