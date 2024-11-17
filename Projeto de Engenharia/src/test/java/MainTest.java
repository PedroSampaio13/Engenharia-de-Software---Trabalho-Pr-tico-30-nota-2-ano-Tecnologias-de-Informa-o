import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    public class MainTest {

        @Test
        public void test1() {
            assertEquals("1", Main.obterResultado(1));
        }

        @Test
        public void test2() {
            assertEquals("2", Main.obterResultado(2));
        }

        @Test
        public void test4() {
            assertEquals("4", Main.obterResultado(4));
        }

        @Test
        public void test8() {
            assertEquals("8", Main.obterResultado(8));
        }

        @Test
        public void testDivisibilidadePor3() {
            assertEquals("Pim", Main.obterResultado(9));
        }

        @Test
        public void testDivisibilidadePor5() {
            assertEquals("Pam", Main.obterResultado(10));
        }

        @Test
        public void testDivisibilidadePor7() {
            assertEquals("Pum", Main.obterResultado(14));
        }


        @Test
        public void testPresencaDeDigitosComDigito3() {
            assertEquals("Pim", Main.obterResultado(13));
        }

        @Test
        public void testPresencaDeDigitosComDigito5() {
            assertEquals("Pam", Main.obterResultado(52));
        }

        @Test
        public void testPresencaDeDigitosComDigito7() {
            assertEquals("Pum", Main.obterResultado(17));
        }

        @Test
        public void test3() {
            assertEquals("PimPim", Main.obterResultado(3));

        }

        @Test
        public void test5() {
            assertEquals("PamPam", Main.obterResultado(5));
        }

        @Test
        public void test6() {
            assertEquals("Pim", Main.obterResultado(6));
        }

        @Test
        public void test7() {
            assertEquals("PumPum", Main.obterResultado(7));
        }

        @Test
        public void test9() {
            assertEquals("Pim", Main.obterResultado(9));
        }

        @Test
        public void test10() {
            assertEquals("Pam", Main.obterResultado(10));
        }

        @Test
        public void test15() {
            assertEquals("PimPamPam", Main.obterResultado(15));
        }

        @Test
        public void test21() {
            assertEquals("PimPum", Main.obterResultado(21));
        }

        @Test
        public void test33() {
            assertEquals("PimPimPim", Main.obterResultado(33));
        }

        @Test
        public void test51() {
            assertEquals("PimPam", Main.obterResultado(51));
        }

        @Test
        public void test53() {
            assertEquals("PamPim", Main.obterResultado(53));
        }

        @Test
        public void testPimPamPum() {
            assertEquals("PimPamPum", Main.obterResultado(210));
        }

        @Test
        public void testNumeroGrandeComMultiplosDigitosRelevantes() {
            assertEquals("PimPumPimPamPum", Main.obterResultado(357));
        }
    }


