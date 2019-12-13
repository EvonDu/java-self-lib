package priv.self.lib.base;

import org.junit.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HttpTest {
    @Test
    public void selectTest() throws IOException {
        Http http = new Http();
        http.addHeaders(new HashMap<String, String>(){{ put("Content-type", "application/json"); }});
        String result = http.post("http://localhost/project/jk/www/api/web/jky/test", "{\"asd\":\"1\"}");
        Integer code = http.getResponseCode();
        Map<String, List<String>> header = http.getResponseHeaders();
        System.out.println("HttpCode: " + code);
        System.out.println("ResponseHeaders: " + header);
        System.out.println("ResponseContent: " + result);
    }
}
