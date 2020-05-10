package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

@SpringBootTest
class DemoApplicationTests {
    
    @Test
    void contextLoads() {
    }
    @Test
    void testSum(){
        assertThat(Arifmetic.sum(10, 3), equalTo(13));
    }
}
