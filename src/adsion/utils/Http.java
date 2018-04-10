package adsion.utils;

import adsion.bean.All;
import adsion.bean.UserInfo;
import com.google.gson.Gson;

import org.apache.http.*;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

import java.nio.charset.Charset;
import java.util.UUID;


import java.io.IOException;

public class Http {
    public static All jsonPost(String strURL, UserInfo users) {
        boolean isSuccess = false;
        HttpPost post = null;
        try {
            Gson gson = new Gson();
            String jsonStr = gson.toJson(users, UserInfo.class);
            System.out.println(jsonStr);
            Object obj = new Object();
            HttpClient httpClient = new DefaultHttpClient();
            post = new HttpPost(strURL);
            post.setHeader("Content-type", "application/json; charset=utf-8");
            post.setHeader("Connection", "Close");
            StringEntity entity = new StringEntity(jsonStr, Charset.forName("UTF-8"));
            entity.setContentEncoding("UTF-8");
            post.setEntity(entity);

            HttpResponse response = httpClient.execute(post);
            int statusCode = response.getStatusLine().getStatusCode();
            StatusLine status = response.getStatusLine();
            int state = status.getStatusCode();
            if (state == HttpStatus.SC_OK) {
                HttpEntity responseEntity = response.getEntity();
                String jsonString = EntityUtils.toString(responseEntity);
                All all = gson.fromJson(jsonString,All.class);
                return all;
            }
            else{
                System.out.println("请求返回:"+state+"("+strURL+")");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null; // 自定义错误信息
    }
}
