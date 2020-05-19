package id.co.playgroundmotionlayout

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import id.co.playgroundmotionlayout.card.CardActivity
import id.co.playgroundmotionlayout.fab.FabActivity
import id.co.playgroundmotionlayout.swipe.SwipeActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_fab.setOnClickListener {
            startActivity(Intent(this, FabActivity::class.java))
        }

        btn_swipe.setOnClickListener {
            startActivity(Intent(this, SwipeActivity::class.java))
        }

        btn_card.setOnClickListener {
            startActivity(Intent(this, CardActivity::class.java))
        }
    }
}