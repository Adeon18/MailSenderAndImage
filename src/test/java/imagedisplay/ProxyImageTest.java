package imagedisplay;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProxyImageTest {

    ProxyImage img;

    @Test
    void display() {
        img = new ProxyImage("cat.png");

        assertNull(img.getRealImage());
        img.display();
        assertNotNull(img.getRealImage());

    }
}