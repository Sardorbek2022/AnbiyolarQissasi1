package mr.sardorek.anbiyolarqissasi

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import mr.sardorek.anbiyolarqissasi.databinding.ActivitySplashBinding


@SuppressLint("CustomSplashScreen")
class SplashActivity : AppCompatActivity() {
    lateinit var binding: ActivitySplashBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.splashTv.alpha = 0.0f

        binding.splashTv.animate().alpha(1.0f).setDuration(1200).withEndAction {
            Handler(mainLooper).postDelayed({
                startActivity(Intent(this,MainActivity::class.java))
                finish()
            },1200)
        }

    }
}