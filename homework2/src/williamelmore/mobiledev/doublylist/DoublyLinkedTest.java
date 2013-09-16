package williamelmore.mobiledev.doublylist;

import org.junit.Assert;
import org.junit.Test;

public class DoublyLinkedTest {

	@Test
	public void test() {
		MyNodeList list = new MyNodeList();
		list.add("wes");
		list.add("justin");
		list.add("kim");
		list.add("tyler");
		list.add("leanne");
		Assert.assertEquals("leanne tyler kim justin wes " , list.print());
	}

}
