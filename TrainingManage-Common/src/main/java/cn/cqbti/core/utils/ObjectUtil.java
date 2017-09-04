package cn.cqbti.core.utils;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @Author: clement
 * @Description:
 * @Date: Create in 15:59 2017/8/29
 */
public class ObjectUtil {

    /**
     * 对象转bytes
     * @param obj
     * @return
     * @throws Exception
     */
    public static byte[] object2Bytes(Object obj) throws Exception {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(obj);
        byte[] bytes = byteArrayOutputStream.toByteArray();
        byteArrayOutputStream.close();
        objectOutputStream.close();
        return bytes;
    }

    /**
     * bytes转对象
     * @param bytes
     * @return
     * @throws Exception
     */
    public static Object bytes2Object(byte[] bytes) throws Exception {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
        ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
        return objectInputStream.readObject();
    }
}
