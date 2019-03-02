package com.coolweather.android.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

public class HttpUtil {
    public static void sendOkHttpRequest(String address, okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        // Create request for remote resource.
        Request request = new Request.Builder().url(address).build();

        client.newCall(request).enqueue(callback);






    }
}
