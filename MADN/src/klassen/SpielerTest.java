package klassen;

import static org.junit.Assert.*;

import org.junit.Test;

public class SpielerTest {

	private eFarben farbe;
	

	@Test
	public void testFigurHinzufuegen() {
		
		int anzahlFiguren=0;
		int maxAnzahl =4;
		eFarben farbe;
	 Spielfigur[] spielfigur = new Spielfigur[maxAnzahl];
		
		if(anzahlFiguren < maxAnzahl){
			for(int i = 0; i<maxAnzahl;i++) {
				spielfigur[i] = new Spielfigur(this.farbe);
				
			}
			anzahlFiguren++;
		}
	
		assertTrue(spielfigur.length>0 );
	

}}
