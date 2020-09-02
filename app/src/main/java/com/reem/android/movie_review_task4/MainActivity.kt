package com.reem.android.movie_review_task4

import android.graphics.Bitmap
import android.os.AsyncTask
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.movie_item.*
import kotlinx.android.synthetic.main.screen_two.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        setContentView(R.layout.screen_one)




    }


}







//
//            .getWeatherByCity(cityName, apiKey)
//            .enqueue(object : Callback<WeatherResponse> {
//                override fun onResponse(
//                    call: Call<WeatherResponse>, response: Response<WeatherResponse>
//                ) {
//                    refresh_btn.isEnabled = true
//                    weather_loading.visibility = View.GONE
//
//                    if (response.isSuccessful) {
//                        val weatherResponse = response.body()
//                        bindWeatherData(weatherResponse!!)
//                    } else if (response.code() in 400..404) {
//                        Toast.makeText(
//                            this@MainActivity,
//                            "City you are looking for is not found", Toast.LENGTH_LONG
//                        ).show()
//                    }
//                }

//            })
//    }
//}