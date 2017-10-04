package za.co.riggaroo.constraintlayoutdemo

import android.content.Intent
import android.os.Bundle
import android.support.constraint.ConstraintLayout
import android.support.constraint.Placeholder
import android.support.transition.TransitionManager
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {

    private lateinit var mainAction: Placeholder
    private lateinit var constraintLayout: ConstraintLayout
    private lateinit var save: ImageButton
    private lateinit var delete: ImageButton
    private lateinit var cancel: ImageButton
    private lateinit var edit: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val toolbar = findViewById<View>(R.id.toolbar) as Toolbar
        setSupportActionBar(toolbar)

        mainAction = findViewById<View>(R.id.template_action) as Placeholder
        constraintLayout = findViewById<View>(R.id.root) as ConstraintLayout

        save = findViewById<View>(R.id.save) as ImageButton
        delete = findViewById<View>(R.id.delete) as ImageButton
        cancel = findViewById<View>(R.id.cancel) as ImageButton
        edit = findViewById<View>(R.id.edit) as ImageButton

        save.setOnClickListener { view ->
            TransitionManager.beginDelayedTransition(constraintLayout)
            mainAction.setContentId(view.id)
        }

        cancel.setOnClickListener { view ->
            TransitionManager.beginDelayedTransition(constraintLayout)
            mainAction.setContentId(view.id)
        }
        edit.setOnClickListener { view ->
            TransitionManager.beginDelayedTransition(constraintLayout)
            mainAction.setContentId(view.id)
        }
        delete.setOnClickListener { view ->
            TransitionManager.beginDelayedTransition(constraintLayout)
            mainAction.setContentId(view.id)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        val id = item.itemId


        if (id == R.id.action_constraintSet) {
            val intent = Intent(this@MainActivity, ConSetActivity::class.java)
            startActivity(intent)
            return true
        }

        return super.onOptionsItemSelected(item)
    }
}
