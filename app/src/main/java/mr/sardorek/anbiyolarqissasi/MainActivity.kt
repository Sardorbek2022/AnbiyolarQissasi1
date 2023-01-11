package mr.sardorek.anbiyolarqissasi

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.drawerlayout.widget.DrawerLayout
import androidx.recyclerview.widget.LinearLayoutManager
import mr.sardorek.anbiyolarqissasi.databinding.ActivityMainBinding
import mr.sardorek.anbiyolarqissasi.recyclerview.Adapter


class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.drawer.setDrawerLockMode(DrawerLayout.LOCK_MODE_LOCKED_CLOSED)

        binding.openMenu.setOnClickListener {
            if (binding.drawer.isOpen) {
                binding.menu.animate().alpha(0.0f).duration = 650
                binding.openMenu.animate().rotation(0f).duration = 600
                binding.drawer.closeDrawers()
                binding.drawer.setDrawerLockMode(DrawerLayout.LOCK_MODE_LOCKED_CLOSED)
            } else {
                binding.drawer.setDrawerLockMode(DrawerLayout.LOCK_MODE_UNLOCKED)
                binding.menu.alpha = 0.0f
                binding.menu.animate().alpha(1.0f).duration = 650
                binding.drawer.openDrawer(binding.menu)
                binding.openMenu.animate().rotation(180f).duration = 600
            }
        }

        binding.drawer.addDrawerListener(object : DrawerLayout.DrawerListener {
            override fun onDrawerSlide(drawerView: View, slideOffset: Float) {

            }

            override fun onDrawerOpened(drawerView: View) {
                binding.myLogo.alpha = 0.0f
                binding.myLogo.animate().alpha(1.0f).duration = 1250
            }

            override fun onDrawerClosed(drawerView: View) {
                binding.menu.animate().alpha(0.0f).duration = 650
                binding.openMenu.animate().rotation(0f).duration = 600
                binding.drawer.setDrawerLockMode(DrawerLayout.LOCK_MODE_LOCKED_CLOSED)
                binding.myLogo.alpha = 0.0f
            }

            override fun onDrawerStateChanged(newState: Int) {

            }

        })

        var book1 = true
        var book2 = false
        var book3 = false
        var book4 = false
        var book5 = false

        binding.bnv.selectedItemId = R.id.book1

        binding.bnv.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.book1 -> {
                    if (!book1) {
                        binding.mainRecyclerView.adapter = Adapter(this, 40,1)
                        binding.mainRecyclerView.alpha = 0.0f
                        binding.mainRecyclerView.animate().alpha(1.0f).duration = 750
                    }
                    book1 = true
                    book2 = false
                    book3 = false
                    book4 = false
                    book5 = false
                }
                R.id.book2 -> {
                    if (!book2) {
                        binding.mainRecyclerView.adapter = Adapter(this, 47,2)
                        binding.mainRecyclerView.alpha = 0.0f
                        binding.mainRecyclerView.animate().alpha(1.0f).duration = 750
                    }
                    book1 = false
                    book2 = true
                    book3 = false
                    book4 = false
                    book5 = false
                }
                R.id.book3 -> {
                    if (!book3) {
                        binding.mainRecyclerView.adapter = Adapter(this, 47,3)
                        binding.mainRecyclerView.alpha = 0.0f
                        binding.mainRecyclerView.animate().alpha(1.0f).duration = 750
                    }
                    book1 = false
                    book2 = false
                    book3 = true
                    book4 = false
                    book5 = false
                }
                R.id.book4 -> {
                    if (!book4) {
                        binding.mainRecyclerView.adapter = Adapter(this, 43,4)
                        binding.mainRecyclerView.alpha = 0.0f
                        binding.mainRecyclerView.animate().alpha(1.0f).duration = 750
                    }
                    book1 = false
                    book2 = false
                    book3 = false
                    book4 = true
                    book5 = false
                }
                R.id.book5 -> {
                    if (!book5) {
                        binding.mainRecyclerView.adapter = Adapter(this, 43,5)
                        binding.mainRecyclerView.alpha = 0.0f
                        binding.mainRecyclerView.animate().alpha(1.0f).duration = 750
                    }
                    book1 = false
                    book2 = false
                    book3 = false
                    book4 = false
                    book5 = true
                }
            }
            true
        }
        binding.mainRecyclerView.adapter = Adapter(this, 40,1)
        binding.mainRecyclerView.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        binding.menu.setNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.contact -> {
                    startActivity(Intent(this,ContactActivity::class.java))
                }
                R.id.share -> {
                    val shareApp = Intent()
                    shareApp.action = Intent.ACTION_SEND
                    shareApp.type = "text/plain"
                    shareApp.putExtra(Intent.EXTRA_SUBJECT,"https://play.google.com/store/apps/details?id=uz.mufassal.muallimsoniy&hl=ru&gl=US")
                    startActivity(Intent.createChooser(shareApp,"Share App"))
                }
                R.id.otherApps -> {
                    startActivity(
                        Intent(
                            Intent.ACTION_VIEW,
                            Uri.parse("https://play.google.com/store/apps/dev?id=7750226984108554341&hl=ru&gl=US")
                        )
                    )
                }

            }
            true
        }

    }

    override fun onBackPressed() {
        if (binding.drawer.isOpen) {
            binding.drawer.closeDrawers()
        } else {
            finishAffinity()
        }
    }
}