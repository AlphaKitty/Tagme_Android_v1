package com.example.myapplication1.async;

import android.os.Build;

import androidx.annotation.RequiresApi;

import com.alibaba.fastjson.JSONArray;
import com.example.myapplication1.dto.TagmeResponse;
import com.example.myapplication1.http.HttpService;
import com.example.myapplication1.pojo.Blog;

import java.util.List;

import okhttp3.Response;

public class AsyncTask extends android.os.AsyncTask<Void, Void, List<Blog>> {

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    protected List<Blog> doInBackground(Void... voids) {
        try {
            Response response = HttpService.getResponse();
            TagmeResponse tagmeResponse = HttpService.getData(response, TagmeResponse.class);
            if (tagmeResponse.isOk()) {
                return JSONArray.parseArray(tagmeResponse.getData().toString(), Blog.class);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return null;
    }
}
