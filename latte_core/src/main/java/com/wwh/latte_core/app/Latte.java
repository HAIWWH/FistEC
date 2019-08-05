package com.wwh.latte_core.app;

import android.content.Context;

import java.util.WeakHashMap;

final public class Latte {

    public static Configurator init(Context context){
        getConfigurations().put(ConfigType.APPLICATION_CONTEXT.name(),context.getApplicationContext());
        return Configurator.getInsrance();
    }

    private static WeakHashMap<String,Object> getConfigurations(){
        return Configurator.getInsrance().getLatteConfigs();
    }
}
