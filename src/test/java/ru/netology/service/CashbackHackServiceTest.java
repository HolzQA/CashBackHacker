package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void testRemainFrom0() {
        CashbackHackService service = new CashbackHackService();

        int expected = 1000;
        assertEquals(service.remain(0), expected);
    }

    @Test
    public void testRemainFromMinus() {
        CashbackHackService service = new CashbackHackService();

        int expected = 1200;
        assertEquals(service.remain(-200), expected);
    }

    @Test
    public void testRemainFrom1000() {
        CashbackHackService service = new CashbackHackService();

        int expected = 0;
        assertEquals(service.remain(1_000), expected);
    }

    @Test
    public void testRemain() {
        CashbackHackService service = new CashbackHackService();

        int expected = 530;
        assertEquals(service.remain(470), expected);
    }
}