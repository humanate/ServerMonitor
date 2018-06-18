package log;

import client.HeartBeatsClient;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class TestLog {
    private static final Logger logger = LoggerFactory.getLogger(HeartBeatsClient.class);

    @Test
    public void LogTest(){
        logger.info("xxxxx");
        logger.error("qwe");
        logger.debug("qweq");
    }
}
