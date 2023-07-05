package com.example.demo

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional
class WeatherService {
    @Autowired
    var weatherRepository: WeatherRepository? = null

    /**
     * レコードを全件取得する。
     * @return
     */
    fun findAllWeatherData(): List<Weather?> {
        return weatherRepository!!.findAll()
    }
}