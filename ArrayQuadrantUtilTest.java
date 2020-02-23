package test.com.ge.exercise2.test;

import org.junit.Assume;
import org.junit.Test;

import com.ge.exercise2.ArrayQuadrantUtil;

import static org.junit.Assert.assertArrayEquals;
public class ArrayQuadrantUtilTest {
	@Test
    public void getQuadrantValuesTest() {
        char[][] data = {
                {'a', 'b', 'c', 'd'},
                {'e', 'f', 'g', 'h'},
                {'i', 'j', 'k', 'l'},
                {'m', 'n', 'o', 'p'}
        };
        
  /**
   * Test to check created Quadrant is matching with true data or not
   */
        ArrayQuadrantUtil util = new ArrayQuadrantUtil(data);
        Assume.assumeNotNull(util.getQuadrantValues(1, 1));

        char[] expectedResult = {'k', 'l', 'o', 'p'};
        assertArrayEquals(expectedResult, util.getQuadrantValues(1, 1));
        
        /**
         * Test to check true Row data is matcing or not
         */
        Assume.assumeNotNull(util.printRow(0));
        char [] row_expectedResult= {'a','b','c','d'};
        assertArrayEquals(row_expectedResult, util.printRow(0));
        
        /**
         * Test to check true Column data is matching or not
         */
        
        Assume.assumeNotNull(util.printColumn(3));
        char [] column_expectedResult= {'d','h','l','p'};
        assertArrayEquals(column_expectedResult, util.printColumn(3));
    }
	
}
