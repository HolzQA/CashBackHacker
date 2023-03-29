package ru.netology.service;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class CashbackHackServiceTest extends TestCase {
    @Test
    public void testRemainFrom0() {
        CashbackHackService service = new CashbackHackService();

        int expected = 1000;
        assertEquals(expected, service.remain(0));
    }

    @Test
    public void testRemainFromMinus() {
        CashbackHackService service = new CashbackHackService();

        int expected = 1200;
        assertEquals(expected, service.remain(-200));
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