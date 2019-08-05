package com.wwh.fistec;

import android.app.Application;

import com.joanzapata.iconify.fonts.FontAwesomeModule;
import com.wwh.latte_core.app.Latte;


public class ExampleApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Latte.init(this)
                .withIcon(new FontAwesomeModule())/*字体代码库*/
                .withApiHost("http:127.0.0.1")/*配置api地址*/
                .configure();
    }
}
