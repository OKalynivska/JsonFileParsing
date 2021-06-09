import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.softserve.edu.Websites;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import static org.junit.Assert.assertEquals;


public class TestClass {

    ObjectMapper objectMapper = new ObjectMapper();

    @Test
    public void objectIsPresentTest() throws IOException {
        URL url = this.getClass().getResource("/jsonTask.json");
        File file = new File(url.getFile());
        Websites websites = objectMapper.readValue(file, Websites.class);
        assertEquals(websites.getWebsites().get(1).containsKey("rozetka"), true);

    }

    @Test(expected = JsonProcessingException.class)
    public void objectIsNotPresentTest() throws IOException {
        URL url = this.getClass().getResource("/jsonTaskWrong.json");
        File file = new File(url.getFile());
        Websites websites = objectMapper.readValue(file, Websites.class);


    }
}
