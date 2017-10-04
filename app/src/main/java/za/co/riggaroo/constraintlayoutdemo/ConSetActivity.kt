package za.co.riggaroo.constraintlayoutdemo

import android.os.Bundle
import android.support.constraint.ConstraintSet
import android.support.design.widget.FloatingActionButton
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.view.View

class ConSetActivity : AppCompatActivity() {
    private var firstSet = ConstraintSet()
    private var second = ConstraintSet()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_con_set)
        val toolbar = findViewById<View>(R.id.toolbar) as Toolbar
        setSupportActionBar(toolbar)

        second.clone(this, R.layout.second_view)
        firstSet.clone(this, R.layout.content_main)


        val fab = findViewById<View>(R.id.fab) as FloatingActionButton
        fab.setOnClickListener {
            //TransitionManager.beginDelayedTransition(first_view);
            //second.applyTo(first_view)
        }
        assert(supportActionBar != null)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
    }
}
