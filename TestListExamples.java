import static org.junit.Assert.*;
import org.junit.*;
import java.util.Arrays;
import java.util.List;

class IsMoon implements StringChecker {
  public boolean checkString(String s) {
    return s.equalsIgnoreCase("moon");
  }
}

public class TestListExamples {
  @Test(timeout = 500)
  public void testMergeRightEnd() {
    List<String> left = Arrays.asList("a", "b", "c");
    List<String> right = Arrays.asList("a", "d");
    List<String> merged = ListExamples.merge(left, right);
    List<String> expected = Arrays.asList("a", "a", "b", "c", "d");
    assertEquals(expected, merged);
  }
  
  @Test
  public void testFilter() {
    List<String> checking = Arrays.asList("Moon", "no", "moon", "Yes", "MOON", "Coffee");
    IsMoon moon1= new IsMoon();
    List<String> filtered = ListExamples.filter(checking, moon1);
    List<String> expected = Arrays.asList("Moon", "moon", "MOON");
    assertEquals(expected, filtered);
  }
  
  

}

