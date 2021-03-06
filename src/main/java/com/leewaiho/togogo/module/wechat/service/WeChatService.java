package com.leewaiho.togogo.module.wechat.service;

import com.leewaiho.togogo.module.sys.model.user.TSUser;
import com.leewaiho.togogo.module.wechat.dto.RegisterObject;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.transaction.annotation.Transactional;

/**
 * Author leewaiho
 * Email 791783391@qq.com
 * Date 2017/9/27
 * Project togogo-shixun
 */
public interface WeChatService {
    
    OAuth2AccessToken loginWeChat(String code);
    
    String getOpenId(String code);
    
    @Transactional
    TSUser registerOnWeChat(RegisterObject object);

}
