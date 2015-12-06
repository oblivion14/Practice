package com.pineone.url.parser.finder;

import com.pineone.url.parser.itf.finder.IPorotocolFinder;

/**
 * Created by Melvin on 2015. 12. 6..
 */
public class ProtocolFinder implements IPorotocolFinder {

//    URLRegister urlRegister = new URLRegister();
//    String URL = urlRegister.putURL();

    @Override
    public String validation(String URL) {

        if(URL.contains("http"))
        {
            String afterProtocol = findExcludeProtocol(URL);
            return afterProtocol;
        }

        else{
            String modifyURL = "http://" + URL;
            String afterProtocol = findExcludeProtocol(modifyURL);
            return afterProtocol;
        }

    }

    @Override
    public String findExcludeProtocol(String url) {
        int protocolNum = url.indexOf("://");

        String protocol = url.substring(0, protocolNum);

        findProtocol(protocol);

        String excludeProtocol = url.replaceFirst("://", "000");

//        System.out.println("excludeProtocol = " + excludeProtocol);

        return excludeProtocol;

    }

    @Override
    public String findProtocol(String protocol) {
        System.out.println("protocol = " + protocol);
        return protocol;
    }


}
