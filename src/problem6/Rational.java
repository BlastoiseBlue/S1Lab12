/**
 * @author Emmet Stanevich
 * @param add Adds two fractions
 * @return Rational1+Rational2
 * @param subtract Subtracts one fraction from another
 * @return Rational1-Rational2
 * @param multiply Multiplies two fractions together
 * @return Rational1*Rational2
 * @param divide Divides one fraction into another
 * @return Rational1/Rational2
 */
package problem6;

public class Rational {
	private int x = 0;
	private int y = 1;

	public String add(Rational r) {
		if (y != r.y) {
			int numerator = x * r.y + y * r.x;
			int denominator = y * r.y;
			return (numerator + "/" + denominator);
		} else {
			int numerator = x + r.x;
			int denominator = y;
			return (numerator + "/" + denominator);
		}
	}

	public String subtract(Rational r) {
		if (y != r.y) {
			int numerator = x * r.y + y * r.x;
			int denominator = y * r.y;
			return (numerator + "/" + denominator);
		} else {
			int numerator = x * r.x;
			int denominator = y;
			return (numerator + "/" + denominator);
		}
	}

	public String multiply(Rational r) {
		int numerator = x * r.x;
		int denominator = y * r.y;
		return (numerator + "/" + denominator);
	}

	public String divide(Rational r) {
		int numerator = x * r.y;
		int denominator = y * r.x;
		return (numerator + "/" + denominator);
	}

	public static String add(Rational r1, Rational r2) {
		if (r1.y != r2.y) {
			int numerator = r1.x * r2.y + r2.x * r1.y;
			int denominator = r1.y * r2.y;
			return (numerator + "/" + denominator);
		} else {
			int numerator = r1.x + r2.x;
			int denominator = r1.y;
			return (numerator + "/" + denominator);
		}
	}

	public static String subtract(Rational r1, Rational r2) {
		if (r1.y != r2.y) {
			int numerator = r1.x * r2.y - r2.x * r2.y;
			int denominator = r1.y * r2.y;
			return (numerator + "/" + denominator);
		} else {
			int numerator = r1.x - r2.x;
			int denominator = r1.y;
			return (numerator + "/" + denominator);
		}
	}

	public static String multiply(Rational r1, Rational r2) {
		int numerator = r1.x * r2.x;
		int denominator = r1.y * r2.y;
		return (numerator + "/" + denominator);
	}

	public static String divide(Rational r1, Rational r2) {
		int numerator = r1.x * r2.y;
		int denominator = r1.y * r2.x;
		return (numerator + "/" + denominator);
	}

	public Rational(int x1, int y1) {
		x = x1;
		y = y1;
	}

	public Rational(int x1) {
		x = x1;
		y = 1;
	}

	public Rational() {
		x = 0;
		y = 1;
	}
}
