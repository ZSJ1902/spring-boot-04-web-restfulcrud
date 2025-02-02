package com.zsg.springboot.component;

import org.springframework.boot.autoconfigure.web.servlet.WebMvcProperties;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.LocaleResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

public class MyLocaleReolver implements LocaleResolver {
    @Override
    public Locale resolveLocale(HttpServletRequest request) {
       String l=request.getParameter("l");
       Locale locale = Locale.getDefault();
       if(!StringUtils.isEmpty(l)){
           String [] split=l.split("_");
           locale=new Locale(split[0],split[1]);
       }
        return locale;
    }

    @Override
    public void setLocale(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Locale locale) {

    }
}
