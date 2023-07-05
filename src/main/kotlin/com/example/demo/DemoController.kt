package com.example.demo

import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping


@Controller
class DemoController {
    @Autowired
    private var weatherService: WeatherService? = null
    private val logger = LoggerFactory.getLogger(DemoController::class.java)

    @RequestMapping("/hello")
    private fun hello(model: Model): String {
        model.addAttribute("hello", "Hello World!")
        val weatherDataList = weatherService?.findAllWeatherData()
        model.addAttribute("weatherDataList", weatherDataList)
        return "hello"
    }
}
