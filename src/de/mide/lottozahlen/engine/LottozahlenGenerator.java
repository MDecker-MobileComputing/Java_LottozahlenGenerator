package de.mide.lottozahlen.engine;

import java.util.Arrays;


/**
 * Klasse zum Erzeugen von Lottozahlen.
 */
public class LottozahlenGenerator {

	
    /** Anzahl Zahlen für den zu erzeugenden Tipp, z.B. "6" für deutsches Zahlenlotto "6 aus 49". */
    private int _anzahlLottoZahlen;

    /** Höchste Zahl im Lottosystem, z.B. "49" für deutsches Zahlenlotto "6 aus 49". */
    private int _maxLottoZahl;
	
    
    /**
     * Konstruktor, erzeugt Lottozahlengenerator für bestimmtes Lottosystem, z.B. "6 aus 49" (Deutschland)
     * oder "6 aus 90" (Italien, SuperEnalotto).
     *
     * @param anzahlLottoZahlen  Anzahl der Zahlen im Tipp, z.B. "6" bei deutschem Zahlenlotto "6 aus 49";
     *                           muss mindestens 1 sein
     *
     * @param maxLottoZahl       Höchste Lottozahl, z.B. "49" bei deutschem Zahlenlotto "6 aus 49";
     *                           muss mindestens 6 sein
     *
     * @throws LottoException    Ungültige Werte für {@code anzahlLottoZahlen} oder {@code maxLottoZahl}
     */
	public LottozahlenGenerator( int anzahlLottoZahlen, 
			                     int maxLottoZahl ) throws LottoException { 
										
        if ( anzahlLottoZahlen < 1 ) {

            throw new LottoException( 
            		"anzahlLottoZahlen=" + anzahlLottoZahlen + " ist zu klein" );
        }
        if ( maxLottoZahl < 6 ) {

            throw new LottoException( 
            		"maxLottoZahl=" + maxLottoZahl + " ist zu klein" );
        }

        if ( maxLottoZahl <= anzahlLottoZahlen ) {

           throw new LottoException( 
        		   "MaxLottoZahl=" + maxLottoZahl + " <= anzahlLottoZahlen=" + anzahlLottoZahlen );
        }
        
        _anzahlLottoZahlen = anzahlLottoZahlen;
        _maxLottoZahl      = maxLottoZahl;
	}
	
	
    /**
     * Zahlentipp für Lotto erzeugen unt als int-Array zurückgeben.
     *
     * @return Array mit Lotto-Tipp (die Zahlen, die man auf dem Lottoschein ankreuzen soll)
     */
    public int[] erzeugeTipp() {
    	
    	LottoZahl[] alleLottozahlenArray = new LottoZahl[ _maxLottoZahl ];
        for ( int i = 0; i < alleLottozahlenArray.length; i++ ) {

            alleLottozahlenArray[i] = new LottoZahl( i + 1 );
        }    	 
         
        // "durchmischen": Lottozahlen in Array nach Zufallszahl sortieren
        Arrays.sort( alleLottozahlenArray );
                    	        
        int[] ergebnisArray = new int[ _anzahlLottoZahlen ];
        for ( int i = 0; i < _anzahlLottoZahlen; i++ ) {

            ergebnisArray[i] = alleLottozahlenArray[i].getLottozahl();
        }
        
        Arrays.sort( ergebnisArray );
        
    		return ergebnisArray;
    }
    
    
    /**
     * Zahlentipp für Lotto erzeugen unt als String zurückgegeben.
     *
     * @return String mit Lotto-Tipp (die Zahlen, die man auf dem 
     *         Lottoschein ankreuzen soll); die einzelnen Zahlen
     *         sind mit Tabs separiert
     */
    public String erzeugeTippAlsString() {
    	
	    	int[] tippArray = erzeugeTipp();
	    	
	    	StringBuffer sb = new StringBuffer();
	    	for ( int zahl : tippArray ) {
	    		
	    		sb.append( zahl );
	    		sb.append( '\t'  ); // Tabulator
	    	}
	    	
	    	return sb.toString();
    }
}
