package za.co.riggaroo.constraintlayoutdemo

import android.os.Bundle
import android.support.v4.content.ContextCompat
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.playground.*
import java.util.*
import kotlin.collections.ArrayList

/**
 * @author Rebeca franks
 * @since 2017/09/30.
 */
class OptionsActivity : AppCompatActivity(), View.OnClickListener {
    private var count=0
    private val buttons:IntArray= intArrayOf(R.id.b1,R.id.b2,R.id.b3,R.id.b4,R.id.b5,R.id.b6,R.id.b7,R.id.b8,R.id.b9)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.playground)
        setListeners()
        initialize()
    }

    private fun initialize(){
        val numbers:ArrayList<String> = ArrayList()
        (1..8).mapTo(numbers) { it.toString() }
        numbers.add("")
        Collections.shuffle(numbers)

        for(i in 0..8) {
            findViewById<Button>(buttons[i]).text = numbers[i]
        }

        for(i in 0..8) {
            if(numbers[i]=="") {
                findViewById<Button>(buttons[i]).visibility = View.INVISIBLE
            } else {
                findViewById<Button>(buttons[i]).visibility = View.VISIBLE
            }
        }
    }

    private fun setListeners() {
        b1.setOnClickListener(this)
        b2.setOnClickListener(this)
        b3.setOnClickListener(this)
        b4.setOnClickListener(this)
        b5.setOnClickListener(this)
        b6.setOnClickListener(this)
        b7.setOnClickListener(this)
        b8.setOnClickListener(this)
        b9.setOnClickListener(this)
        b_reset.setOnClickListener(this)
        b_submit.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        when(view?.id) {
            R.id.b1 -> {
                count++
                when {
                    b2.text.toString().equals("",ignoreCase = true) -> {
                        b2.text=b1.text
                        b2.visibility=View.VISIBLE
                        b1.text=""
                        b1.visibility=View.INVISIBLE
                    }
                    b4.text.toString().equals("",ignoreCase = true) -> {
                        b4.text=b1.text
                        b4.visibility=View.VISIBLE
                        b1.text=""
                        b1.visibility=View.INVISIBLE
                    }
                    else -> {

                    }
                }
            }

            R.id.b2 -> {
                count++
                when {
                    b1.text.toString().equals("",ignoreCase = true) -> {
                        b1.text=b2.text
                        b1.visibility=View.VISIBLE
                        b2.text=""
                        b2.visibility=View.INVISIBLE
                    }
                    b3.text.toString().equals("",ignoreCase = true) -> {
                        b3.text=b2.text
                        b3.visibility=View.VISIBLE
                        b2.text=""
                        b2.visibility=View.INVISIBLE
                    }
                    b5.text.toString().equals("",ignoreCase = true) -> {
                        b5.text=b2.text
                        b5.visibility=View.VISIBLE
                        b2.text=""
                        b2.visibility=View.INVISIBLE
                    }
                    else -> {

                    }
                }
            }

            R.id.b3 -> {
                count++
                when {
                    b2.text.toString().equals("",ignoreCase = true) -> {
                        b2.text=b3.text
                        b2.visibility=View.VISIBLE
                        b3.text=""
                        b3.visibility=View.INVISIBLE
                    }
                    b6.text.toString().equals("",ignoreCase = true) -> {
                        b6.text=b3.text
                        b6.visibility=View.VISIBLE
                        b3.text=""
                        b3.visibility=View.INVISIBLE
                    }
                    else -> {

                    }
                }
            }

            R.id.b4 -> {
                count++
                when {
                    b1.text.toString().equals("",ignoreCase = true) -> {
                        b1.text=b4.text
                        b1.visibility=View.VISIBLE
                        b4.text=""
                        b4.visibility=View.INVISIBLE
                    }
                    b5.text.toString().equals("",ignoreCase = true) -> {
                        b5.text=b4.text
                        b5.visibility=View.VISIBLE
                        b4.text=""
                        b4.visibility=View.INVISIBLE
                    }
                    b7.text.toString().equals("",ignoreCase = true) -> {
                        b7.text=b4.text
                        b7.visibility=View.VISIBLE
                        b4.text=""
                        b4.visibility=View.INVISIBLE
                    }
                    else -> {

                    }
                }
            }

            R.id.b5 -> {
                count++
                when {
                    b2.text.toString().equals("",ignoreCase = true) -> {
                        b2.text=b5.text
                        b2.visibility=View.VISIBLE
                        b5.text=""
                        b5.visibility=View.INVISIBLE
                    }
                    b4.text.toString().equals("",ignoreCase = true) -> {
                        b4.text=b5.text
                        b4.visibility=View.VISIBLE
                        b5.text=""
                        b5.visibility=View.INVISIBLE
                    }
                    b6.text.toString().equals("",ignoreCase = true) -> {
                        b6.text=b5.text
                        b6.visibility=View.VISIBLE
                        b5.text=""
                        b5.visibility=View.INVISIBLE
                    }
                    b8.text.toString().equals("",ignoreCase = true) -> {
                        b8.text=b5.text
                        b8.visibility=View.VISIBLE
                        b5.text=""
                        b5.visibility=View.INVISIBLE
                    }
                    else -> {

                    }
                }
            }

            R.id.b6 -> {
                count++
                when {
                    b3.text.toString().equals("",ignoreCase = true) -> {
                        b3.text=b6.text
                        b3.visibility=View.VISIBLE
                        b6.text=""
                        b6.visibility=View.INVISIBLE
                    }
                    b5.text.toString().equals("",ignoreCase = true) -> {
                        b5.text=b6.text
                        b5.visibility=View.VISIBLE
                        b6.text=""
                        b6.visibility=View.INVISIBLE
                    }
                    b9.text.toString().equals("",ignoreCase = true) -> {
                        b9.text=b6.text
                        b9.visibility=View.VISIBLE
                        b6.text=""
                        b6.visibility=View.INVISIBLE
                    }
                    else -> {

                    }
                }
            }

            R.id.b7 -> {
                count++
                when {
                    b4.text.toString().equals("",ignoreCase = true) -> {
                        b4.text=b7.text
                        b4.visibility=View.VISIBLE
                        b7.text=""
                        b7.visibility=View.INVISIBLE
                    }
                    b8.text.toString().equals("",ignoreCase = true) -> {
                        b8.text=b7.text
                        b8.visibility=View.VISIBLE
                        b7.text=""
                        b7.visibility=View.INVISIBLE
                    }
                    else -> {

                    }
                }
            }

            R.id.b8 -> {
                count++
                when {
                    b5.text.toString().equals("",ignoreCase = true) -> {
                        b5.text=b8.text
                        b5.visibility=View.VISIBLE
                        b8.text=""
                        b8.visibility=View.INVISIBLE
                    }
                    b7.text.toString().equals("",ignoreCase = true) -> {
                        b7.text=b8.text
                        b7.visibility=View.VISIBLE
                        b8.text=""
                        b8.visibility=View.INVISIBLE
                    }
                    b9.text.toString().equals("",ignoreCase = true) -> {
                        b9.text=b8.text
                        b9.visibility=View.VISIBLE
                        b8.text=""
                        b8.visibility=View.INVISIBLE
                    }
                    else -> {

                    }
                }
            }

            R.id.b9 -> {
                count++
                when {
                    b6.text.toString().equals("",ignoreCase = true) -> {
                        b6.text=b9.text
                        b6.visibility=View.VISIBLE
                        b9.text=""
                        b9.visibility=View.INVISIBLE
                    }
                    b8.text.toString().equals("",ignoreCase = true) -> {
                        b8.text=b9.text
                        b8.visibility=View.VISIBLE
                        b9.text=""
                        b9.visibility=View.INVISIBLE
                    }
                    else -> {

                    }
                }
            }

            R.id.b_reset -> {
                initialize()
                count=0
                tv_status.setTextColor(ContextCompat.getColor(this, R.color.colorBlack))
            }

            R.id.b_submit -> {
                if (success()) {
                    if (count > 100) {
                        Toast.makeText(this, "Poor Performance!", Toast.LENGTH_SHORT).show()
                    } else {
                        tv_status.text = "You completed in $count moves Well done"
                        tv_status.setTextColor(ContextCompat.getColor(this, R.color.colorGreen))
                        return
                    }
                } else {
                    Toast.makeText(this, "Try try", Toast.LENGTH_SHORT).show()
                }
            }
        }
        tv_status.text="Moves : $count"
    }

    private fun success() : Boolean {
        return b1.text=="1" && b2.text=="2" && b3.text=="3" && b4.text=="4" && b5.text=="5" && b6.text=="6" && b7.text=="7" && b8.text=="8"
    }
}