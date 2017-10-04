package za.co.riggaroo.constraintlayoutdemo

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_choices.*

class ChoicesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_choices)

        button_movie.setOnClickListener { startActivity(Intent(this, MovieActivity::class.java)) }
        button_cupcake.setOnClickListener { startActivity(Intent(this, CupcakeActivity::class.java)) }
        b_tic_tac_toe.setOnClickListener { startActivity(Intent(this, OptionsActivity::class.java)) }
        b_placeholder.setOnClickListener { startActivity(Intent(this, MainActivity::class.java)) }
    }
}