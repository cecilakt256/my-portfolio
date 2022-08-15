package com.google.sps.data;

public final class Greeting{

    private String greeting1;
    private String greeting2;
    private String greeting3;

    public Greeting(String greeting1, String greeting2, String greeting3){
        this.greeting1 = greeting1;
        this.greeting2 = greeting2;
        this.greeting3 = greeting3;
    }

    public String getGreeting1(){
        return greeting1;
    }

    public String getGreeting2(){
        return greeting2;
    }

    public String getGreeting3(){
        return greeting3;
    }

}