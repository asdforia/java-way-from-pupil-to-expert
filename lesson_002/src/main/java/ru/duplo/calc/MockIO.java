package ru.duplo.calc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MockIO implements IO {
    private static Logger LOG = LoggerFactory.getLogger(MockIO.class);
    private int index = 0;
    private final String[] answers;
    public final StringBuilder out = new StringBuilder();

    public MockIO(String[] answers) {
        this.answers = answers;
    }


    @Override
    public String read() {
        return this.answers[index++];
    }

    @Override
    public void println(Object value) {
        this.out.append(value).append("\n");
    }

    public String getOut() {
        return this.out.toString();
    }
}
