package com.pineone.url.parser.finder;

import com.pineone.url.parser.itf.finder.ISubProjectFinder;

/**
 * Created by Melvin on 2015. 12. 6..
 */
public class SubProjectFinder implements ISubProjectFinder {

    @Override
    public String findSubProject(String URL) {

        int portNum = URL.indexOf("/") + 1;

        if (URL.contains("/")) {

            int subProjectNum = URL.length();
            String subProject = URL.substring(portNum, subProjectNum);
//            System.out.println(protocolNum);
//            System.out.println(hostNum);
//            System.out.println(URL.length());
            System.out.println("subproject = " + subProject);
            return subProject;

        }

        else return "";
    }
}



