import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ManagerTest {

	@Test
	void testComputeBonus() {
		Manager m1 = new Manager(10000);
		//System.out.print(m1.getSalary());
		assertEquals(10000.0,m1.getSalary());
		m1.setBonusCompute(new DoubleBonus());
		m1.CalculateBonus();
		assertEquals(10000.0,m1.getbonus());
		
	}

}