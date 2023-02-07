package com.example.weather_app

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherService {
    // the interface responsible for the GET api call to openweather
    @GET("weather")
    fun getWeather(
        @Query("q") cityName: String,
        @Query("APPID") API_KEY: String,
        @Query("units") units: String
    ): Call<Weather>
}
