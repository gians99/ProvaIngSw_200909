package mat.unical.it.ProvaIngSw_200909;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.joda.time.DateTime;
import org.junit.*;

public class MyListUtilTest {

	MyListUtil sorted;
	
	@Before
	public void init() {
		sorted = new MyListUtil();
	}
	
	@BeforeClass
	public static void startTime() {
		DateTime dateTime = new DateTime();
		System.out.println("Inizio test" + dateTime.toDate());
	}
	
	@Test
	public void sortCrescenteWork() {
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(5);
		numbers.add(3);
		numbers.add(6);
		numbers.add(8);
		numbers.add(2);
		numbers.add(1);

		assertEquals(Arrays.asList(1,2,3,5,6,8), sorted.sort(numbers, 0));

	}
	
	@Test
	public void sortDecrescenteWork() {
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(5);
		numbers.add(3);
		numbers.add(6);
		numbers.add(8);
		numbers.add(2);
		numbers.add(1);
		assertEquals(Arrays.asList(8,6,5,3,2,1), sorted.sort(numbers, 1));
	}
	
	@AfterClass
	public static void endTime() {
		DateTime dateTime = new DateTime();
		System.out.println("Fine test" + dateTime.toDate());
	}
	
}
