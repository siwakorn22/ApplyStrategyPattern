public class Employee {
	protected double salary=0;
	protected double bonus=0;
	
	protected BonusCalculator bc;
	
	public double getSalary() {
		return salary;
	}
	public double getbonus() {
		return bonus;
	}
	public double CalculateBonus() {
		return bonus = bc.computeBonus(salary);
	}
	public void setBonusCompute(BonusCalculator b) {
		bc = b;
	}
	
	
	
}