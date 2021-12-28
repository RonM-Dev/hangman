import org.junit.jupiter.api.*;

@DisplayName("HangmanTest Junit5")
public class HangmanTest{


    @BeforeAll
    static void beforeAll() {
        System.out.println("Before all test methods");
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("Before each test method");
    }

    @AfterEach
    void afterEach() {
        System.out.println("After each test method");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("After all test methods");
    }

    @Test
    @DisplayName("Sample test")
    void sampleTest() {
        System.out.println("First test method");
    }


}
