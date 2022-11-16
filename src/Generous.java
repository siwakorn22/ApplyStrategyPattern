public class Generous implements BonusCalculator {

	@Override
	public double computeBonus(double wage) {
		// TODO Auto-generated method stub
		return wage *3/100;
	}

}