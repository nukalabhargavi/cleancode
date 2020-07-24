package construction;

import static org.junit.Assert.*;
import org.junit.*;
public class HouseConstructionMaterialTest {

	HouseConstructionMaterial materialsRequired;
	@Before
	public void objectCreation()
	{
		materialsRequired=new HouseConstructionMaterial();
	}
	@Test
	public void test() throws Exception {
		assertEquals("1098000.0INR",materialsRequired.calculateHouseConstructionCost("standard",915.00,"not automated"));
	}
	@Test
	public void test1() throws Exception {
		assertEquals("3075000.0INR",materialsRequired.calculateHouseConstructionCost("above standard",2050.00,"not automated"));
	}
	@Test
	public void test2() throws Exception {
		assertEquals("1620000.0INR",materialsRequired.calculateHouseConstructionCost("high standard",900.00,"not automated"));
	}
	@Test
	public void test3() throws Exception {
		assertEquals("3750000.0INR",materialsRequired.calculateHouseConstructionCost("high standard",1500.00,"fully automated"));
	}
}