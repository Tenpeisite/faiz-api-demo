package com.zhj;

import cn.hutool.json.JSONUtil;
import com.zhj.apiclientsdk.client.ApiClient;
import com.zhj.apiclientsdk.model.request.QuestionRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.io.*;
import java.util.Map;

/**
 * @author zhj
 * @version 1.0
 * @description
 * @date 2024/2/25 23:01
 */
@SpringBootTest
@Slf4j
public class Test {

    @Resource
    private ApiClient apiClient;

    @org.junit.jupiter.api.Test
    public void getBiZi() {
        String url = apiClient.getBiZi();
        log.info(url);
    }

    @org.junit.jupiter.api.Test
    public void getBiZi1() {
        ApiClient apiClient = new ApiClient("9cf68f70644224d789fd33370ed9b3a4", "e00e61925290e35ae71bb4c0475c7a4f");
        String url = apiClient.getBiZi();
        log.info(url);
    }

    @org.junit.jupiter.api.Test
    public void geDuJiTang() {
        String str = apiClient.getDuJiTang();
        log.info(str);
    }

    @org.junit.jupiter.api.Test
    public void geDuJiTang1() {
        ApiClient apiClient = new ApiClient("9cf68f70644224d789fd33370ed9b3a4", "e00e61925290e35ae71bb4c0475c7a4f");
        String str = apiClient.getDuJiTang();
        log.info(str);
    }

    @org.junit.jupiter.api.Test
    public void getIp() {
        String json1 = apiClient.getIpLocation();
        Map map1 = JSONUtil.toBean(json1, Map.class);
        log.info(map1.toString());
        String json2 = apiClient.getIpLocation("58.154.0.0");
        Map map2 = JSONUtil.toBean(json2, Map.class);
        log.info(map2.toString());
    }

    @org.junit.jupiter.api.Test
    public void getIp1() {
        ApiClient apiClient = new ApiClient("e59d77b733b5ff65e828df2db202b269", "69996d59f9bb7605d5867d90a93a686b");
        String json1 = apiClient.getIpLocation();
        Map map1 = JSONUtil.toBean(json1, Map.class);
        log.info(map1.toString());
        String json2 = apiClient.getIpLocation("58.154.0.0");
        Map map2 = JSONUtil.toBean(json2, Map.class);
        log.info(map2.toString());
    }

    @org.junit.jupiter.api.Test
    public void getLoveTalk() {
        String str = apiClient.getLoveTalk();
        log.info(str);
    }

    @org.junit.jupiter.api.Test
    public void getLoveTalk1() {
        ApiClient apiClient = new ApiClient("e59d77b733b5ff65e828df2db202b269", "69996d59f9bb7605d5867d90a93a686b");
        String str = apiClient.getLoveTalk();
        log.info(str);
    }

    @org.junit.jupiter.api.Test
    public void getHoroscope() {
        String json = apiClient.getHoroscope("aries", "today");
        Map map1 = JSONUtil.toBean(json, Map.class);
        log.info(map1.toString());
    }

    @org.junit.jupiter.api.Test
    public void getHoroscope1() {
        ApiClient apiClient = new ApiClient("e59d77b733b5ff65e828df2db202b269", "69996d59f9bb7605d5867d90a93a686b");
        String json = apiClient.getHoroscope("capricorn", "today");
        Map map1 = JSONUtil.toBean(json, Map.class);
        log.info(map1.toString());
    }

    @org.junit.jupiter.api.Test
    public void getWeather1() {
        String json = apiClient.getWeather();
        Map map1 = JSONUtil.toBean(json, Map.class);
        log.info(map1.toString());
    }

    @org.junit.jupiter.api.Test
    public void getLoveTalk2() {
        ApiClient apiClient = new ApiClient("e59d77b733b5ff65e828df2db202b269", "69996d59f9bb7605d5867d90a93a686b");
        String json = apiClient.getWeather("上海", "", "today");
        Map map1 = JSONUtil.toBean(json, Map.class);
        log.info(map1.toString());
    }

    @org.junit.jupiter.api.Test
    public void doChat1() {
        QuestionRequest questionRequest = new QuestionRequest("1+1等于几？");
        String answer = apiClient.doChat(questionRequest);
        System.out.println(answer);
    }

    @org.junit.jupiter.api.Test
    public void doChat2() {
        ApiClient apiClient = new ApiClient("1e4cd3ef6a8d2538044a027c07508488", "af5a11324adf26ae19d79a88b8e6cd08");
        QuestionRequest questionRequest = new QuestionRequest("(1+1)*4等于几？");
        String answer = apiClient.doChat(questionRequest);
        System.out.println(answer);
    }

    @org.junit.jupiter.api.Test
    public void testDraw1() {
        QuestionRequest questionRequest = new QuestionRequest("画一个可爱的小猫");
        String url = apiClient.doDraw(questionRequest);
        System.out.println(url);
    }

    @org.junit.jupiter.api.Test
    public void testDraw2() {
        ApiClient apiClient = new ApiClient("1e4cd3ef6a8d2538044a027c07508488", "af5a11324adf26ae19d79a88b8e6cd08");
        QuestionRequest questionRequest = new QuestionRequest("可爱的小狗");
        String url = apiClient.doDraw(questionRequest);
        System.out.println(url);
    }

    @org.junit.jupiter.api.Test
    public void textRecognition1() throws IOException {
        String IMAGE_PATH = "src/main/resources/OIP.jpg";
        InputStream in = new FileInputStream(IMAGE_PATH);
        byte[] data = inputStream2ByteArray(in);
        in.close();
        String res = apiClient.textRecognition(data);
        System.out.println(res);
    }

    @org.junit.jupiter.api.Test
    public void textRecognition2() throws IOException {
        ApiClient apiClient = new ApiClient("1e4cd3ef6a8d2538044a027c07508488", "af5a11324adf26ae19d79a88b8e6cd08");
        String IMAGE_PATH = "src/main/resources/OIP.jpg";
        InputStream in = new FileInputStream(IMAGE_PATH);
        byte[] data = inputStream2ByteArray(in);
        in.close();
        String res = apiClient.textRecognition(data);
        System.out.println(res);
    }

    @org.junit.jupiter.api.Test
    public void idCardRecognition1() throws IOException {
        String IMAGE_PATH = "src/main/resources/card_back.jpg";
        InputStream in = new FileInputStream(IMAGE_PATH);
        byte[] data = inputStream2ByteArray(in);
        in.close();
        String res = apiClient.idCardRecognition(data);
        System.out.println(res);
    }

    @org.junit.jupiter.api.Test
    public void idCardRecognition2() throws IOException {
        ApiClient apiClient = new ApiClient("1e4cd3ef6a8d2538044a027c07508488", "af5a11324adf26ae19d79a88b8e6cd08");
        String IMAGE_PATH = "src/main/resources/card_back.jpg";
        InputStream in = new FileInputStream(IMAGE_PATH);
        byte[] data = inputStream2ByteArray(in);
        in.close();
        String res = apiClient.idCardRecognition(data);
        System.out.println(res);
    }

    @org.junit.jupiter.api.Test
    public void imageRecognition1() {
        String imageUrl = "https://sfile.chatglm.cn/testpath/275ae5b6-5390-51ca-a81a-60332d1a7cac_0.png";
        String result = apiClient.imageRecognition(imageUrl);
        System.out.println(result);
    }

    @org.junit.jupiter.api.Test
    public void imageRecognition2() {
        ApiClient apiClient = new ApiClient("1e4cd3ef6a8d2538044a027c07508488", "af5a11324adf26ae19d79a88b8e6cd08");
        String imageUrl = "https://sfile.chatglm.cn/testpath/275ae5b6-5390-51ca-a81a-60332d1a7cac_0.png";
        String result = apiClient.imageRecognition(imageUrl);
        System.out.println(result);
    }

    private static byte[] inputStream2ByteArray(InputStream in) throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        byte[] buffer = new byte[1024 * 4];
        int n = 0;
        while ((n = in.read(buffer)) != -1) {
            out.write(buffer, 0, n);
        }
        return out.toByteArray();
    }

}
