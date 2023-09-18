package com.example.dockertest;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class DockerTestApplicationTests {

    @Test
    void contextLoads() {
        assertEquals(1, 1);
    }

}
