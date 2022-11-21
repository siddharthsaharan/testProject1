package jUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddString {

	@Test
	public void test() {
		jUnitTestPackage.jUnitFunctions j = new jUnitTestPackage.jUnitFunctions();
		j.AddStrings("Hello ", "World");
		}
}