package de.mide.lottozahlen.engine;


/**
 * Eigene Exception-Klasse für ungültige Konfigurationen
 * des Lottozahlengenerators.
 */
@SuppressWarnings("serial")
public class LottoException extends Exception {

	/**
	 * Konstruktor zum erzeugen einer Fehlermeldung
	 * 
	 * @param fehlermeldung Text der Fehlermeldung
	 */
	public LottoException( String fehlermeldung ) {
		
		super( fehlermeldung );
	}
}
