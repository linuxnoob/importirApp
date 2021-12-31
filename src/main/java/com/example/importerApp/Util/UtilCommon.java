package com.example.importerApp.Util;

import net.minidev.json.JSONObject;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.*;

public class UtilCommon {

    public static String listToString(List<String> list) {
        String str = "";
        if (null != list && list.size() > 0) {
            for (String string : list) {
                str += "'" + string + "',";
            }
        }
        if (str.length() > 0) {
            str = str.substring(0, str.length() - 1);
        }
        return str;
    }

    //getMd5ofDocument
    public static String getMd5OfDoc(byte[] bytes) throws NoSuchAlgorithmException {
        MessageDigest md5 = MessageDigest.getInstance("MD5");
        md5.update(bytes);
        // md5.digest() hash
        BigInteger bi = new BigInteger(1, md5.digest());
        String value = bi.toString(16);
        return value;
    }

    public static long compareDays(Date d1, Date d2) {
        return (d2.getTime() - d1.getTime()) / (1000 * 3600 * 24);
    }

    public static String converTimestamptoDate(Timestamp timestamp) {
        Timestamp timestampConversion = new Timestamp(timestamp.getTime());
        Date date = new Date(timestampConversion.getTime());
        System.out.println("date = " +date);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/YYYY");
        String result = dateFormat.format(date);
        return result;
    }

    public static Map<String, String> getStringMap(JSONObject jsonObject) {
        Map<String, String> map = new HashMap<>();
        Iterator<String> keysI = jsonObject.keySet().iterator();
        while (keysI.hasNext()) {
            String key = keysI.next();
            String value = jsonObject.getAsString(key);
            map.put(key, value);
        }

        return map;
    }


}
