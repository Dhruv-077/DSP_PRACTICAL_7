package com.firstapp.dsp_practical_7

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.WindowCompat
import com.firstapp.dsp_practical_7.databinding.ActivityAlarmOnBinding
import com.firstapp.dsp_practical_7.databinding.ActivityMainBinding

class AlarmOnActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAlarmOnBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        WindowCompat.setDecorFitsSystemWindows(window, false)
        super.onCreate(savedInstanceState)
        binding = ActivityAlarmOnBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var mp = MediaPlayer.create(applicationContext,R.raw.alarm)
        mp.start()

        binding.stopBtn.setOnClickListener {
            mp.stop()
            finish()
        }
    }
}