package com.yisom.restful.dictionaryapi.naver;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.reflect.FieldUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.*;

import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

/**
 * com.yisom.restful.dictionaryapi.naver
 *
 * @author : idasom
 * @data : 2024/01/11
 */
@Slf4j
@ExtendWith(MockitoExtension.class)
class NaverDictionaryTest {
    @InjectMocks
    NaverDictionary naverDictionary;

    @BeforeEach
    void setup() throws IllegalAccessException {
        FieldUtils.writeField(naverDictionary, "clientId", "naver_client_id", true);
        FieldUtils.writeField(naverDictionary, "clientSecret", "naver_client_secret", true);
    }


    @Test
    void dictionary() throws Exception {
        String apiURL = "https://openapi.naver.com/v1/papago/n2mt";
        String text = URLEncoder.encode("아이폰", "UTF-8");
        String result = "{\"message\":{\"@type\":\"response\",\"@service\":\"naverservice.nmt.proxy\",\"@version\":\"1.0.0\",\"result\":{\"srcLangType\":\"ko\",\"tarLangType\":\"en\",\"translatedText\":\"IPhone\",\"engineType\":\"PRETRANS\"}}}";

        // when
        Map<String, String> requestHeaders = new HashMap<>();
        requestHeaders.put("X-Naver-Client-Id", "client_id");
        requestHeaders.put("X-Naver-Client-Secret", "secret");
//        when(naverDictionary.post(apiURL, requestHeaders, text)).thenReturn(result);

        //verify

    }
}