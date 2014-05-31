package example;

import static org.junit.Assert.*;

import org.junit.Test;


public class ShapeTest {
	
	@Test
	public void isVailShape()
	{
		assertTrue(new Shape(new double[]{4,5,6,7}).isValidShape());
		assertTrue(new Shape(new double[]{5,4,6,7}).isValidShape());
		assertTrue(new Shape(new double[]{7,5,6,4}).isValidShape());
		assertTrue(new Shape(new double[]{6,5,4,7}).isValidShape());
		assertTrue(new Shape(new double[]{1,5,6,2,5}).isValidShape());
		assertTrue(new Shape(new double[]{10,32,13,12,15,23}).isValidShape());
		assertTrue(new Shape(new double[]{3,3,3}).isValidShape());
		
		assertFalse(new Shape(new double[]{}).isValidShape());
		assertFalse(new Shape(new double[]{8}).isValidShape());
		assertFalse(new Shape(new double[]{8,8}).isValidShape());
		assertFalse(new Shape(new double[]{1,2,9}).isValidShape());
		assertFalse(new Shape(new double[]{0,5,6,7}).isValidShape());
		assertFalse(new Shape(new double[]{5,0,6,7}).isValidShape());
		assertFalse(new Shape(new double[]{5,6,0,7}).isValidShape());
		assertFalse(new Shape(new double[]{5,6,7,0}).isValidShape());
		assertFalse(new Shape(new double[]{5,6,7,-8}).isValidShape());
		assertFalse(new Shape(new double[]{100,6,7,8}).isValidShape());
		assertFalse(new Shape(new double[]{100,-6,0,8}).isValidShape());
	}
	
	@Test
	public void hasNEqualSides()
	{
		assertTrue(new Shape(new double[]{6,6,6}).hasNEqualSides(3));
		assertTrue(new Shape(new double[]{6,6,6,6}).hasNEqualSides(4));
		assertTrue(new Shape(new double[]{6,6,6,6,6,6,6,6,6,6}).hasNEqualSides(10));
		assertTrue(new Shape(new double[]{2.5,2.5,2.5,2.5,2.5,2.5}).hasNEqualSides(6));
		
		assertFalse(new Shape(new double[]{6,6}).hasNEqualSides(3));
		assertFalse(new Shape(new double[]{6,6,6,6}).hasNEqualSides(3));
		assertFalse(new Shape(new double[]{6,6,6,6}).hasNEqualSides(6));
		assertFalse(new Shape(new double[]{6,6,6,7}).hasNEqualSides(3));
		assertFalse(new Shape(new double[]{6,6,6,7}).hasNEqualSides(4));
		assertFalse(new Shape(new double[]{0,0,0,0}).hasNEqualSides(4));
		assertFalse(new Shape(new double[]{-8,-8,-8,-8}).hasNEqualSides(4));
		
		
	}

}
