package com.yeying.exercise.qinghua.newchapter6.Exercise1;

public class InstrumentTest {
    public static void testPlay(Instrument i){
        i.play();
    }
    public static void main(String [] args){
        Instrument instrument = new Instrument();
        Instrument piano = new Piano();
        Instrument violin = new Violin();
        InstrumentTest.testPlay(instrument);
        InstrumentTest.testPlay(piano);
        InstrumentTest.testPlay(violin);
    }
}
