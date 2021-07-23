package demo;

import com.alibaba.fastjson.JSONObject;

import java.util.Set;

public class TestDemo {
    public static void main(String[] args) {
        String str = "{\"bussDatas\":\"111\"}\n";
        JSONObject jsonObject = JSONObject.parseObject(str);
        // 获取JSON第一层所有的key
        Set<String> keys = jsonObject.keySet();
        // 获取第一层每个key对应的值 的类型
        for (String key : keys) {
            System.out.println(String.format("%s(key)：%s(值类型)", key, jsonObject.get(key).getClass().getSimpleName()));
        }
    }
}
