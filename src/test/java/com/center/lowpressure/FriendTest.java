package com.center.lowpressure;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.center.common.Friend;
import org.junit.jupiter.api.Test;

class FriendTest {

    @Test
    void getNameReturnsNameGivenAtConstruction() {
        Friend friend = new Friend("John");
        assertEquals("John", friend.getName());
    }
}
