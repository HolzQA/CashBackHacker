package ru.netology.service;


import org.junit.Test;
import static org.junit.Assert.*;


public class CashbackHackServiceTest {

    @Test
    public void testRemainFrom0() {
        CashbackHackService service = new CashbackHackService();

        int expected = 1000;
        assertEquals(expected, service.remain(0));
    }

    @Test
    public void testRemainFrom1000() {
        CashbackHackService service = new CashbackHackService();

        int expected = 0;
        assertEquals(expected, service.remain(1_000));
    }

    @Test
    public void testRemain() {
        CashbackHackService service = new CashbackHackService();

        int expected = 530;
        assertEquals(expected, service.remain(470));
    }
}