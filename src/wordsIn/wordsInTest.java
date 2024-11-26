package wordsIn;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class wordsInTest {

    @Test
    public void lineCountTest() {
        //Testar antal lines

        //Skapar ett nytt objekt som hämtar från wordsIn
        wordsIn testar = new wordsIn();

        //Sätter faktiska värdet
        int actual = testar.lineCount();

        //Värdet vi förväntar oss att få
        int expected = 1;
        assertEquals(expected, actual);
    }



    @Test
    public void hejWordTest(){
        //Testar om användaren skrivit hej

        //Skapar ett nytt objekt som hämtar från wordsIn
        wordsIn testarHej = new wordsIn();

        //Värdet som vi får
        //Hämtar ordet som användare skrivit in (user input är i detta fallet simulerat av testfallet)
        String actual = testarHej.wordCount("hej");

        //Värdet vi förväntar oss att få
        String expected = "hej";
        assertEquals(expected, actual);


    }


    //detta testfallet testar metoden charcount
    @Test
    public void charCountTest() {
        //Skapar ett nytt objekt som hämtar från wordsIn
        wordsIn charTest = new wordsIn();
        //testfallet matar in input (iomed programmet e beroende på user input så simulerar vi det med .setText
        charTest.setText("hej");
        //Här hämtar vi det inmatade värdet och retunerar det
        int actual= charTest.charCount();

        //Värdet vi förväntar oss att få
        int expected = 3;
        assertEquals(expected, actual);
    }


}
