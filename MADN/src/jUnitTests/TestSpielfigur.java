package jUnitTests;

import static org.junit.Assert.*;
import klassen.Farben;
import klassen.Spieler;
import klassen.Spielfigur;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestSpielfigur {

	
    @BeforeClass
	 public static void create() {
	      // Test-Objekt erschaffen mit den Testwerten (Farbe: Rot)
	    Spielfigur s1 = new Spielfigur(Farben.ROT);
	      System.out.println("Start!");
	   }
	
   @Before
    public void vor() {
	 System.out.println("vor Test");
	   }
	
	
	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
