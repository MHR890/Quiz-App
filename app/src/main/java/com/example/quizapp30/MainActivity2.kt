package com.example.quizapp30

import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main2.*
import kotlinx.android.synthetic.main.activity_main2.button
import org.w3c.dom.Text

class MainActivity2 : AppCompatActivity() {
    private var mCurrentPosition:Int = 1
    private  var MQuestionlist:ArrayList<Question_Data>? = null
    private var mSelectedOptionPosition:Int = 0
    var slopn:Int = 0
    var score:Int = 0
    var Musername:String? = null

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        Musername = intent.getStringExtra(Constants.username)

        MQuestionlist = Constants.get_question()

        set_question()
        op1.setOnClickListener{
            selected_option_style(op1, 1)
        }
        op2.setOnClickListener{
            selected_option_style(op2, 2)
        }
        op3.setOnClickListener{
            selected_option_style(op3, 3)
        }
        op4.setOnClickListener{
            selected_option_style(op4,4)
        }
        button.setOnClickListener{
            button()
        }
    }

    fun button(){
        if(slopn != 0){
            var qrn = MQuestionlist!![mCurrentPosition-1]
            if(slopn != qrn.correct_answer){
              setColor(slopn, R.drawable.wron_option)
            }else{
                score++
            }

            setColor(qrn.correct_answer, R.drawable.right_option)

            if(mCurrentPosition == MQuestionlist!!.size){
                button.text = "FINISH"
            }
            else{
                button.text = "GO TO NEXT"
                slopn = 0

            }


        }
        else{
            button.text = "SUBMIT"
            mCurrentPosition++
           if(mCurrentPosition <  MQuestionlist!!.size){
               set_question()
            }
            else{
                var obje = ""

               var intent  = Intent(this, result::class.java)
               intent.putExtra("score", score.toString())
               intent.putExtra(Constants.username, Musername )
               


               startActivity(intent)
            }
        }

    }


    fun set_question(){
        var question = MQuestionlist!![mCurrentPosition-1]

        txv.text = question.Question
        op1.text = question.option_one
        op2.text = question.option_two
        op3.text = question.option_three
        op4.text = question.option_four
        option_style()

    }
    fun option_style(){
        var options = ArrayList<TextView>()
        options.add(op1)
        options.add(op2)
        options.add(op3)
        options.add(op4)

        for (op in options){
            op.background = ContextCompat.getDrawable(this, R.drawable.my_own_option)
            op.typeface = Typeface.DEFAULT
            op.setTextColor(Color.parseColor("#F8F2F2"))
            op.background = ContextCompat.getDrawable(this, R.drawable.my_own_option)
            op.typeface = Typeface.DEFAULT
            op.setTextColor(Color.parseColor("#F8F2F2"))
        }
    }

    fun selected_option_style(view:TextView, optnum:Int){
        option_style()
        slopn = optnum
        view.background = ContextCompat.getDrawable(this, R.drawable.selected_option_style)
        view.typeface  = Typeface.DEFAULT_BOLD
        view.setTextColor(Color.parseColor("#99CBF3"))
    }

    fun setColor(a:Int, b:Int){
        when(a){
            1 ->{
                op1.background = ContextCompat.getDrawable(this, b)
            }
            2 ->{
                op2.background = ContextCompat.getDrawable(this, b)
            }
            3 ->{
                op3.background = ContextCompat.getDrawable(this, b)
            }
            4 ->{
                op4.background = ContextCompat.getDrawable(this, b)
            }
        }


    }
}
