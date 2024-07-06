package uz.murodov.scratch.ui

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.animation.AnimationUtils
import androidx.appcompat.app.AppCompatActivity
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import uz.murodov.scratch.R
import uz.murodov.scratch.databinding.ActivitySplashBinding

@SuppressLint("CustomSplashScreen")
class SplashActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySplashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initViews()

    }

    private fun initViews() {
        val animForImg = AnimationUtils.loadAnimation(this, R.anim.splash_img_anim)
        binding.imageView.startAnimation(animForImg)

        val animForText = AnimationUtils.loadAnimation(this, R.anim.splash_text_anim)
        binding.textView.startAnimation(animForText)

        CoroutineScope(Dispatchers.Main).launch {
            startMainActivity()
        }
    }

    private suspend fun startMainActivity() {
        delay(2600)
        startActivity(Intent(this, MainActivity::class.java))
        finish()
    }
}