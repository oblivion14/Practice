package com.pineone.url.parser.finder;

import com.pineone.url.parser.itf.finder.IHostfinder;

/**
 * Created by Melvin on 2015. 12. 6..
 */
public class HostFinder implements IHostfinder {

    @Override
    public String findHost(String URL) {

        int protocolNum = URL.indexOf("000") +3  ;

        if(URL.contains(":")) {

            int hostNum = URL.indexOf(":");
            String host = URL.substring(protocolNum, hostNum);
//            System.out.println(protocolNum);
//            System.out.println(hostNum);
//            System.out.println(URL.length());
            System.out.println("host = "+  host);
            return host;

        }

        else if(URL.contains("/")){
            int hostNum = URL.indexOf("/");
            String host = URL.substring(protocolNum,hostNum);
            System.out.println("host = "+  host);
            return host;

        }

        else{
            int hostNum = URL.length();
            String host = URL.substring(protocolNum,hostNum);
            System.out.println("host = "+  host);
            return host;
        }

    }
}
