package dev.tuils.test;

import javax.management.RuntimeErrorException;

import dev.utils.StringUtils;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;



/**
 * Unit test for simple App.
 */
public class StringUtilsTests extends TestCase {
	public static void main(String[] args) {
		
		

		CharSequence obj1 = "chiens";
		CharSequence obj2 = "chine";
		int result = StringUtils.levenshteinDistance(obj1, obj2);
		if (result != 2) {
			throw new RuntimeException("La distance doit être de 2");
		}

		CharSequence obj3 = "avion";
		CharSequence obj4 = "aviron";
		int result2 = StringUtils.levenshteinDistance(obj3, obj4);
		if (result2 != 1) {
			throw new RuntimeException("La distance doit être de 1");
		}

		CharSequence obj5 = "porte";
		CharSequence obj6 = "portail";
		int result3 = StringUtils.levenshteinDistance(obj5, obj6);
		if (result3 != 3) {
			throw new RuntimeException("La distance doit être de 3");
		}

	}

}