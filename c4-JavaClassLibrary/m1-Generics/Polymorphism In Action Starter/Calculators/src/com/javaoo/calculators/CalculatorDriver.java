package com.javaoo.calculators;

public class CalculatorDriver {

	public static void main(String[] args) {
		BasicCalculator bc = new BasicCalculator();
		ScientificCalculator sc = new ScientificCalculator();
		TrigonometricCalculator tc = new TrigonometricCalculator();
		
		double a = 2, b = 4;
		System.out.printf("%f + %f = %f%n", a, b, bc.add(a, b));
		System.out.printf("%f - %f = %f%n", a, b, bc.subtract(a, b));
		System.out.printf("%f * %f = %f%n", a, b, bc.multiply(a, b));
		System.out.printf("%f / %f = %f%n", a, b, bc.divide(a, b));
		
		a = 7;
		double y = sc.exp(a);
		double x = sc.log(y);				
		System.out.printf("exp(%f) ~= %f.  Log(%f) ~= %f %n", a, y, y, a);

		System.out.printf("sine(90\u00B0) = %f%n", tc.sine(Math.toRadians(90)));
		System.out.printf("cosine(0\u00B0) = %f%n", tc.cosine(Math.toRadians(0)));
		System.out.printf("tangent(45\u00B0) = %f%n", tc.tangent(Math.toRadians(45)));

		// The arcX(X(n)) should be N (within IEEE floating point error).  Display in degrees
		System.out.printf("arcsine(sine(90\u00B0)) ~= %f%n", Math.toDegrees(tc.arcsine(tc.sine(Math.toRadians(90)))));
		System.out.printf("arccosine(cosine(0\u00B0)) ~= %f%n", Math.toDegrees(tc.arccosine(tc.cosine(Math.toRadians(0)))));
		System.out.printf("arctangent(tangent(45\u00B0)) ~= %f%n", Math.toDegrees(tc.arctangent(tc.tangent(Math.toRadians(45)))));
	}
}
