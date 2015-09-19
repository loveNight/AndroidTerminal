package net.king.androidterminal.util;

import java.net.InetAddress;

import android.content.Context;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;

public class WifiUtils {
    
    private static WifiUtils wifiUtils;
    private Context context;
    
    private WifiUtils(Context context) {
        this.context = context;
    }
    
    public static WifiUtils getInstance(Context context){
        if (wifiUtils == null) {
            wifiUtils = new WifiUtils(context);
        } 
        return wifiUtils;
    }
    
    /**
     * 获取手机IP地址
     * 必须连上wifi
     */
    public String getIpAddress() {
        int result = 0;
        WifiManager wifiManager =(WifiManager) context.getSystemService(Context.WIFI_SERVICE);
        WifiInfo wifiInfo = wifiManager.getConnectionInfo();
        result = wifiInfo.getIpAddress();
        return intToIp(result);
    }
    
    private String intToIp(int i) { 
        return (i & 0xFF ) + "." + 
        ((i >> 8 ) & 0xFF) + "." + 
        ((i >> 16 ) & 0xFF) + "." + 
        ( i >> 24 & 0xFF) ; 
    } 
}


