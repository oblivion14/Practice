package com.pineone.url.parser.finder;

import com.pineone.url.parser.itf.finder.IPortFinder;

/**
 * Created by Melvin on 2015. 12. 6..
 */
public class PortFinder implements IPortFinder{

    @Override
    public String findPort(String URL) {

        int hostNum = URL.indexOf(":") +1  ;

        if(URL.contains(":")) {

            if(URL.contains("/"))
            {
                int portNum = URL.indexOf("/");
                String port = URL.substring(hostNum, portNum);
                System.out.println("port = "+  port);
                return port;
            }
            int portNum = URL.length();
            String port = URL.substring(hostNum, portNum);
            System.out.println("port = "+  port);
            return port;
        }

        else {
            String portNum = "80";
            System.out.println("port =" + portNum);
            return portNum;
        }


//        else if(URL.contains("/")){
//            int hostNum = URL.indexOf("/");
//            String host = URL.substring(protocolNum,hostNum);
//            System.out.println("host = "+  host);
//            return host;
//
//        }
//
//        else{
//            int hostNum = URL.indexOf(URL);
//            String host = URL.substring(protocolNum,hostNum);
//            System.out.println("host = "+  host);
//            return host;
//        }
    }

}


