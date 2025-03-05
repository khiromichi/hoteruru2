package com.example.samuraitravel22;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Samuraitravel22ApplicationTests {
	
	int keisan() {
        return 2 * 3;
    }

    @Test
    void testKeisan() {
        assertEquals(5, keisan(), "計算結果が期待値と一致しません");
    }
}
