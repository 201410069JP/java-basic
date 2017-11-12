package kr.ac.knu.pattern.ovserver.weather;

import lombok.extern.slf4j.Slf4j;

/**
 * Created by rokim on 2017. 5. 28..
 */
@Slf4j
public class Radio implements WeatherObserver {
    @Override
    public void receive(WeatherData weatherData) {
        log.info("======================");
        log.info("라디오 채널로 방송합니다.");
        log.info("{}", weatherData);
        log.info("======================");
    }

}
