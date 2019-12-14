package priv.self.lib.api;

import com.alibaba.fastjson.JSON;

import java.util.List;
import java.util.Map;

public class ApiRequest {

    /**
     * 把JSON字符串转换成MAP,并判断是否存在参数
     * @param content JSON字符串
     * @param requests 必需参数
     * @return params 字符串
     * @throws Exception 异常
     */
    static public Map getJsonParams(String content, List<String> requests) throws Exception {
        Map params = (Map)JSON.parse(content);
        for(String key:requests){
            if(!params.containsKey(key))
                throw new Exception("缺少参数:" + key);
        }
        return params;
    }

}
