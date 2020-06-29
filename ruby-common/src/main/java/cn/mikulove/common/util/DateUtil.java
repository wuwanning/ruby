package cn.mikulove.common.util;

import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

/**
 * @Name:DateUtil
 * @Description:
 * @Author: Neil
 * @Date: 2020-06-29 13:58
 **/
public class DateUtil {

    public static String getInstantNow(){
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").withZone(ZoneId.systemDefault());
        return dateFormat.format(Instant.now());
    }
}
