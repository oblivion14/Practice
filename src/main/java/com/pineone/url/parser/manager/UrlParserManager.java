package com.pineone.url.parser.manager;

import com.pineone.url.parser.finder.HostFinder;
import com.pineone.url.parser.finder.PortFinder;
import com.pineone.url.parser.finder.ProtocolFinder;
import com.pineone.url.parser.finder.SubProjectFinder;
import com.pineone.url.parser.itf.manager.IManager;

/**
 * Created by Melvin on 2015. 12. 6..
 */
public class UrlParserManager implements IManager{

//    URLRegister urlRegister = new URLRegister();

    ProtocolFinder protocolFinder = new ProtocolFinder();

    HostFinder hostFinder = new HostFinder();

    PortFinder portFinder = new PortFinder();

    SubProjectFinder subProjectFinder = new SubProjectFinder();


    @Override
    public void executeURLParser(String host) {

//        String URL = urlRegister.putURL();

        String afterProtocol = protocolFinder.validation(host);

        hostFinder.findHost(afterProtocol);

        portFinder.findPort(afterProtocol);

        subProjectFinder.findSubProject(afterProtocol);
    }
}
