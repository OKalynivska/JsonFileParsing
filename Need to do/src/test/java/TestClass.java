import com.softserve.edu.BookDto;
import com.softserve.edu.SiteDto;
import org.junit.Assert;
import org.junit.Test;
import org.testng.annotations.BeforeTest;
import java.util.*;


public class TestClass {
   SiteDto inputData;


    @BeforeTest
    public void beforeTest() {
        SiteDto inputData = new SiteDto();
        inputData.booksDto = new ArrayList<BookDto>();
    }

    @Test
    public void testPositive() {
        List<BookDto> expectedData = new ArrayList<BookDto>();
        expectedData.add(new BookDto("Test1", "Pascal"));
        Assert.assertEquals("Expected book was found",expectedData, inputData.booksDto);
    }

    @Test
    public void testNegative() {
        List<BookDto> expectedData = new ArrayList<BookDto>();
        expectedData.add(new BookDto("Test4", "SomeBook"));
        Assert.assertEquals("Expected book was not found",expectedData, inputData.booksDto);
    }



}
