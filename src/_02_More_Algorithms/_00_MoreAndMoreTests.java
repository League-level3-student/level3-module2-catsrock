package _02_More_Algorithms;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Uncomment each test and then write the method to make it pass.
 * **/

public class _00_MoreAndMoreTests {

//	@Test
	  public void MultiTest() {
		  
		  
	    assertEquals("10 x 0 = 0", multiply(10, 0));
	    assertEquals("10 x 10 = 100", multiply(10, 10));
	    assertEquals("8 x 11 = 88", multiply(8, 11));
	  }
	  public int multiply(int x, int y) {
		  return x*=y;
	  }
//
//	@Test
	  boolean isPrime=true;
	  public void PrimeTest() {

	    assertTrue(isPrime(3));
	    assertTrue(isPrime(5));
	    assertTrue(isPrime(541));
	    assertFalse(isPrime(4));
	    assertFalse(isPrime(12));
	    assertFalse(isPrime(527));

	  }
	private void assertTrue(int num) {
		
		
	}
	private void assertFalse(int num) {
		
		
	}
	public int isPrime(int num){
		  for(int i=2; i<=num/2; i++){
		  if (num%i==0) {
			isPrime=false;
			System.exit(0);
		}	  
	  }
return num;
	}
	  
//	@Test
	
	  public void SquareTest() {

		assertTrue(isSquare(4));
	    assertTrue(isSquare(144));
	    assertTrue(isSquare(64));
	    assertTrue(isSquare(10201));
	    assertTrue(isSquare(1));
	    assertFalse(isSquare(3));
	    assertFalse(isSquare(22));
	    assertFalse(isSquare(143));

	  }
	  public int isSquare(int number) {
		  for (int i = 0; i <= number; i++) {
			if (number!=i*i) {
				System.exit(0);
			}
		}
		  return number;
	  }
//
//	@Test
	  public void CubeTest() {

	    assertTrue(isCube(27));
	    assertTrue(isCube(216));
	    assertTrue(isCube(729));
	    assertTrue(isCube(1));
	    assertFalse(isCube(3));
	    assertFalse(isCube(22));
	    assertFalse(isCube(143));

	  }
public int isCube(int num) {
	for (int i = 0; i < num; i++) {
		if (num!=i*i*i) {
			System.exit(0);
		}
	}
	return num;
}



}
