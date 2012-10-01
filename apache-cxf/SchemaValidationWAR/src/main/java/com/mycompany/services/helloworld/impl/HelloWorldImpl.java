/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.services.helloworld.impl;

import org.apache.hello_world_soap_http.Greeter;
import org.apache.hello_world_soap_http.PingMeFault;

/**
 *
 * @author pseudoarchitect
 */
public class HelloWorldImpl implements Greeter {

  public void pingMe() throws PingMeFault {
    System.out.println("***** pingMe() *****");
  }

  public String sayHi() {
    return "Hello";
  }

  public void greetMeOneWay(String requestType) {
    System.out.println("***** greetMeOneWay() *****");
  }

  public String greetMe(String requestType) {
    return "Hello, " + requestType;
  }
}