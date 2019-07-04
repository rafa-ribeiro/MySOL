package com.mysol.app.schedulinginvestors;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static java.util.Arrays.asList;

public class SchedulingInvestorsTest {

    private void executeSchedulingMeetings(List<Integer> s, List<Integer> e, int expectedMeetings) {
        int meetings = new SchedulingInvestors().scheduleMaxMeetings(s, e);
        Assert.assertEquals("Erro ao validar quantidade de reuniões marcadas", expectedMeetings, meetings);
    }

    @Test
    public void cenario1() {
        List<Integer> s = asList(1, 2, 3, 3);
        List<Integer> e = asList(2, 2, 3, 3);
        this.executeSchedulingMeetings(s, e, 3);
    }

    @Test
    public void cenario2() {
        List<Integer> s = asList(1, 1, 1, 1, 1, 1, 1, 1, 1);
        List<Integer> e = asList(9, 9, 9, 9, 9, 9, 9, 9, 9);
        this.executeSchedulingMeetings(s, e, 9);
    }

    @Test
    public void cenario3() {
        List<Integer> s = asList(1, 1, 1, 1, 1, 1);
        List<Integer> e = asList(3, 3, 3, 3, 3, 3);
        this.executeSchedulingMeetings(s, e, 3);
    }

    @Test
    public void cenario4() {
        List<Integer> s = asList(1, 2, 3, 4, 5, 6);
        List<Integer> e = asList(2, 3, 4, 5, 6, 7);
        this.executeSchedulingMeetings(s, e, 6);
    }

    @Test
    public void cenario5() {
        List<Integer> s = asList(1, 2, 3, 4, 5, 6);
        List<Integer> e = asList(1, 2, 3, 4, 5, 6);
        this.executeSchedulingMeetings(s, e, 6);
    }

    @Test
    public void cenario6() {
        List<Integer> s = asList(1, 1, 1, 1, 1, 1);
        List<Integer> e = asList(1, 2, 3, 4, 5, 6);
        this.executeSchedulingMeetings(s, e, 6);
    }

    @Test
    public void cenario7() {
        List<Integer> s = asList(1, 1, 3, 3, 3, 3);
        List<Integer> e = asList(1, 2, 3, 4, 4, 5);
        this.executeSchedulingMeetings(s, e, 5);
    }

    @Test
    public void cenario8() {
        List<Integer> s = asList(1, 1, 3, 3, 3, 3);
        List<Integer> e = asList(1, 2, 3, 4, 4, 4);
        this.executeSchedulingMeetings(s, e, 4);
    }

    @Test
    public void cenario9() {
        List<Integer> s = asList(1, 1, 3, 3, 1, 2);
        List<Integer> e = asList(1, 2, 3, 4, 4, 4);
        this.executeSchedulingMeetings(s, e, 4);
    }

    @Test
    public void cenario10() {
        List<Integer> s = asList(1, 1, 1, 1, 1, 1);
        List<Integer> e = asList(1, 1, 1, 1, 1, 1);
        this.executeSchedulingMeetings(s, e, 1);
    }

    @Test
    public void cenario11() {
        List<Integer> s = asList(5, 5, 5, 5);
        List<Integer> e = asList(5, 5, 5, 5);
        this.executeSchedulingMeetings(s, e, 1);
    }
}
