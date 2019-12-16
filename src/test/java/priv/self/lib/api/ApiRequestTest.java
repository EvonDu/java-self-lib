package priv.self.lib.api;

import org.junit.Test;

import java.util.Arrays;
import java.util.Map;

public class ApiRequestTest {

    @Test
    public void getJsonParamsTest() throws Exception {
        String content = "{\"name\":\"test\"}";
        Map params = ApiRequest.getJsonParams(content, Arrays.asList("name"));
        System.out.println(params.get("name"));
    }

}
