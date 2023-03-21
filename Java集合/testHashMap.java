import org.junit.jupiter.api.Test;

import java.util.HashMap;

public class testHashMap {
    /**
     *  添加元素
     */
    @Test
    public void testA(){
        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
        // 添加键值对
        hashMap.put(1, "0001");
        hashMap.put(2, "0002");
        hashMap.put(3, "0003");
        hashMap.put(4, "0004");
        System.out.println(hashMap);
    }

    /**
     *  访问、删除元素
     */
    @Test
    public void testB(){
        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
        // 添加键值对
        hashMap.put(1, "0001");
        hashMap.put(2, "0002");
        hashMap.put(3, "0003");
        hashMap.put(4, "0004");
        // 访问元素
        System.out.println(hashMap.get(2));
        // 删除元素
        hashMap.remove(3);
        System.out.println(hashMap);
        // 删除所有元素
        hashMap.clear();
        System.out.println(hashMap);
    }

    /**
     *  迭代输出
     */
    @Test
    public void testC(){
        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
        // 添加键值对
        hashMap.put(1, "0001");
        hashMap.put(2, "0002");
        hashMap.put(3, "0003");
        hashMap.put(4, "0004");
        // 迭代
        // 输出 key 和 value
        for (Integer i : hashMap.keySet()) {
            System.out.println("key: " + i + " value: " + hashMap.get(i));
        }
        // 返回所有 value 值
        for(String value: hashMap.values()) {
            // 输出每一个value
            System.out.print(value + ", ");
        }

    }
}
