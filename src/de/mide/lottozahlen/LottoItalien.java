package de.mide.lottozahlen;

import de.mide.lottozahlen.engine.LottoException;
import de.mide.lottozahlen.engine.LottozahlenGenerator;

public class LottoItalien {

	public static void main( String[] args ) throws LottoException {

		LottozahlenGenerator generator = new LottozahlenGenerator( 6, 90 );
		
		String tippString = generator.erzeugeTippAlsString();
		
		System.out.println( "\n" + tippString + "\n" );		
	}	
	
}
