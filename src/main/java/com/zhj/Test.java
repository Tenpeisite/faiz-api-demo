package com.zhj;

import cn.hutool.json.JSONUtil;
import com.zhj.apiclientsdk.client.ApiClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
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
        ApiClient apiClient = new ApiClient("e59d77b733b5ff65e828df2db202b269", "69996d59f9bb7605d5867d90a93a686b");
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
        ApiClient apiClient = new ApiClient("e59d77b733b5ff65e828df2db202b269", "69996d59f9bb7605d5867d90a93a686b");
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

}
