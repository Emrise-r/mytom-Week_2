import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {

    @Test
    void triangleClassifier() {
        int side1 = 10;
        int side2 = 10;
        int side3 = 10;
        String guess = "Tam Giac Deu";

        String result = TriangleClassifier.Triangle(side1,side2,side3);
        assertEquals(guess, result);
    }
}