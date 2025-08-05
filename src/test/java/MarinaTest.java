import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import service.MarinaService;


public class MarinaTest {
    MarinaService marinaService = new MarinaService();
    @Test
    void marinaTest(){
        String formulInputTest1 = "(a&b | ~c) -> d<->e";
        String expectedOutput1 = "(a,true) (b,true) (d,true) (e,true)";
        String output1 = marinaService.marina(formulInputTest1);

        String formulInputTest2 = "a & ~(a)";
        String expectedOutput2 = "(,false)";
        String output2 = marinaService.marina(formulInputTest2);

        Assertions.assertEquals(expectedOutput1,output1);
        Assertions.assertEquals(expectedOutput2,output2);

    }
}
