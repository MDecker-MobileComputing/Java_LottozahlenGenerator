package de.mide.lottozahlen.engine;


/**
 * Ein Objekt dieser Klasse enthält eine Lottozahl sowie
 * eine Zufallszahl. Die Zufallszahl wird benötigt, um
 * die Lottozahlen zu sortieren. 
 */
@SuppressWarnings("rawtypes")
public class LottoZahl implements Comparable {

	/** Eine gültige Lottozahl, z.B. Zahl aus 1..49 für deutsches Zahlenlotto. */
	private int _lottozahl;
	
	/** Zufallszahl, nach der für das Durchmischen sortiert wird. */
	private double _zufallszahl;
	
	
	/**
	 * Konstruktor um Lottozahl zu übergeben, es wird auch
	 * eine Zufallszahl bestimmt.
	 * 
	 * @param lottozahl Lottozahl, z.B. eine Zahl aus 1..49
	 *                  für deutsches Zahlenlotto "6 aus 49"
	 */
	public LottoZahl( int lottozahl ) {
		
		_lottozahl   = lottozahl;
		_zufallszahl = Math.random();
	}
	
	
	/**
	 * Getter für die von diesem Objekt gespeicherte Lottozahl.
	 * 
	 * @return Lottozahl, z.B. Zahl von 1..49 für deutsches Zahlenlotto.
	 */
	public int getLottozahl() { return _lottozahl; }

	
	/**
	 * Einzige Methode aus Interface {@code Comparable}.
	 * 
	 * @return {@code 1}, wenn die im aufrufenden Objekt enthaltene Zufallszahl
	 *         kleiner als die Zufallszahl in {@code anderesObjekt} ist, ansonsten
	 *         {@code -1}
	 */
	@Override
	public int compareTo( Object anderesObjekt ) {

		LottoZahl andereLottoZahl = (LottoZahl) anderesObjekt;
		double andereZufallszahl  = andereLottoZahl._zufallszahl; 
		
		if ( _zufallszahl < andereZufallszahl ) {
			
			return 1;
			
		} else {
			
			return -1;
		}
	}	
}
