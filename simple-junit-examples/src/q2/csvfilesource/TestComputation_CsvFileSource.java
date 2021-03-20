package q2.csvfilesource;

import org.junit.Assert;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class TestComputation_CsvFileSource {

   // TODO: Write your answer to complete this test case
   @ParameterizedTest
   @CsvFileSource(resources = "")
   public void testGetDiscount() throws Exception {

	  Computation com = new Computation();
      int in1 = 100, in2 = 1, result = 20; 
      Assert.assertEquals(result, null);

   }
}
