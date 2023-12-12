package com.ua.lesson23.proxy;

import com.ua.lesson23.proxy.interviewer.Interviewer;
import com.ua.lesson23.proxy.interviewer.ProxySeniorInterviewer;

public class ProxyMain {
    public static void main(String[] args) {
        Interviewer interviewer = new ProxySeniorInterviewer(false);
        interviewer.doInterview();
    }
}
