package ru.duplo.calc;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class InteractRunnerTest {
    @Test
    public void onePlusOneMustGetTwo() {
        MockIO mock = new MockIO(new String[] {"1", "+", "1", "n", "n"});
        new InteractRunner(
                new Calc(),
                mock
        ).start();
        assertThat(mock.getOut().split("\n")[3], is("1.0 + 1.0 = 2.0"));
    }

    @Test
    public void twoExpThreeMustGetEight() {
        MockIO mock = new MockIO(new String[]{"2", "^", "3", "n", "n"});
        new InteractRunner(
                new Calc(),
                mock
        ).start();
        assertThat(mock.getOut().split("\n")[3], is("2.0 ^ 3.0 = 8.0"));
    }

    @Test (expected = UnsupportedOperationException.class)
    public void wrongOperation() throws UnsupportedOperationException {
        MockIO mock = new MockIO(new String[]{"2", "@", "3", "n", "n"});
        new InteractRunner(
                new Calc(),
                mock
        ).start();
    }
}