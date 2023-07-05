package com.example.demo

import jakarta.persistence.*
import java.sql.Timestamp

@Entity
@Table(name = "weather")
data class Weather (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int? = null,
    var location_id: Int? = null,
    var name: String? = null,
    var temperature: Int? = null,
    var humidity: Int? = null,
    var date_time: Timestamp? = null
)