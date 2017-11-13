package kr.ac.knu.pattern.singleton;

import kr.ac.knu.grammer.Student;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by rokim on 2017. 5. 26..
 */
@Slf4j
public class OldSingletonTest {
    @Test
    public void test() {
        OldSingleton oldSingleton = OldSingleton.getInstance();
        log.info("{}", oldSingleton);
        log.info("{}", new Object());
    }

    @Test
    public void test2() {
        OldSingleton oldSingleton = OldSingleton.getInstance();
        log.info("{}", oldSingleton);
        log.info("{}", new Object());
    }
}