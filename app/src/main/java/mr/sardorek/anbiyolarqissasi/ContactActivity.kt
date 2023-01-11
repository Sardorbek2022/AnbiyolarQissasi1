package mr.sardorek.anbiyolarqissasi

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import mr.sardorek.anbiyolarqissasi.databinding.ActivityContactBinding

class ContactActivity : AppCompatActivity() {
    lateinit var binding : ActivityContactBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityContactBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.telegram.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://t.me/mufassal_uz")))
        }

        binding.instagram.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/invites/contact/?i=6qx45yjwdkay&utm_content=mwsi61q")))
        }

        binding.facebook.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/mufassal.uz/")))
        }

        binding.youtube.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/channel/UCY9JafzweJxmK_st610Mf2Q")))
        }

        binding.toolbar.setNavigationOnClickListener {
            super.onBackPressed()
        }

    }

    override fun onBackPressed() {
        super.onBackPressed()
    }

}