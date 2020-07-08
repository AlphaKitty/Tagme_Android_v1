package com.example.myapplication1.http;

import android.os.Build;

import androidx.annotation.RequiresApi;

import com.alibaba.fastjson.JSON;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class HttpService {
    public static Response getResponse() {
        Response response = null;
        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        Request request = new Request.Builder()
                .url("http://192.168.199.224:9092/blog/get")
                .method("GET", null)
                .build();
        try {
            response = client.newCall(request).execute();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return response;
    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    public static <T> T getData(Response response, Class<T> clazz) {
        if (response.isSuccessful()) {

            String resultStr = null;

            try {
                resultStr = new String(response.body().bytes(), StandardCharsets.UTF_8);
            } catch (IOException e) {
                e.printStackTrace();
            }

            return JSON.parseObject(resultStr, clazz);
        }
        return null;
    }
}
