package com.reckercode;

public class MobilePhone implements ITelephone{
    private int myNumber;
    private boolean isRinging;
    private boolean powerOn = false;

    @Override
    public void powerOn() {
        if(powerOn){
            System.out.println("Power is already on");
            powerOn = false;
        }
        powerOn = true;
        System.out.println("Turning on the mobile phone.");
    }

    public MobilePhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void dial(int phoneNumber) {
        if(powerOn){
            System.out.println("Now ringing "+phoneNumber+" on mobile phone.");
        }
        System.out.println("Turn on the mobile phone before");
    }

    @Override
    public void answer() {
        if(isRinging){
            System.out.println("Answer the mobile phone");
            isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if(powerOn){
            if(phoneNumber==myNumber){
                isRinging = true;
                System.out.println("Calling "+ phoneNumber);
            }else{
                isRinging = false;
            }
        }
        return false;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
