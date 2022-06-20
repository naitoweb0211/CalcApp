package jp.techacademy.yuki.naito.calcapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent
import android.util.Log
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button1.setOnClickListener(this)
        button2.setOnClickListener(this)
        button3.setOnClickListener(this)
        button4.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v?.id == R.id.button1) {
            //数値に変換
            try {
                var x = editText1.text.toString().toDouble()
                var y = editText2.text.toString().toDouble()
                Log.d("値1", "値1: ${x.toString()}")
                Log.d("値2", "値2: ${y.toString()}")
                var answer = x + y
                val intent = Intent(this, Answer::class.java)
                intent.putExtra("ANSWER", answer)
                startActivity(intent)
            } catch (e: Exception) {
                Snackbar.make(findViewById(R.id.button1), "両方の値を入力して下さい。", Snackbar.LENGTH_SHORT).show()
            }

        }else if(v?.id == R.id.button2){
            //数値に変換
            try {
                var x = editText1.text.toString().toDouble()
                var y = editText2.text.toString().toDouble()
                Log.d("値1", "値1: ${x.toString()}")
                Log.d("値2", "値2: ${y.toString()}")
                var answer = x - y
                val intent = Intent(this, Answer::class.java)
                intent.putExtra("ANSWER", answer)
                startActivity(intent)
            } catch (e: Exception) {
                Snackbar.make(findViewById(R.id.button2), "両方の値を入力して下さい。", Snackbar.LENGTH_SHORT).show()
            }
        }else if(v?.id == R.id.button3){
            //数値に変換
            try {
                var x = editText1.text.toString().toDouble()
                var y = editText2.text.toString().toDouble()
                Log.d("値1", "値1: ${x.toString()}")
                Log.d("値2", "値2: ${y.toString()}")
                var answer = x * y
                val intent = Intent(this, Answer::class.java)
                intent.putExtra("ANSWER", answer)
                startActivity(intent)
            } catch (e: Exception) {
                Snackbar.make(findViewById(R.id.button3), "両方の値を入力して下さい。", Snackbar.LENGTH_SHORT).show()
            }

        }else{
            //数値に変換
            try {
                var x = editText1.text.toString().toDouble()
                var y = editText2.text.toString().toDouble()
                Log.d("値1", "値1: ${x.toString()}")
                Log.d("値2", "値2: ${y.toString()}")
                var answer = x / y
                val intent = Intent(this, Answer::class.java)
                intent.putExtra("ANSWER", answer)
                startActivity(intent)
            } catch (e: Exception) {
                Snackbar.make(findViewById(R.id.button4), "両方の値を入力して下さい。", Snackbar.LENGTH_SHORT).show()
            }

        }
    }

    private fun showAlertDialog() {
        // AlertDialog.Builderクラスを使ってAlertDialogの準備をする
        val alertDialogBuilder = AlertDialog.Builder(this)
        alertDialogBuilder.setTitle("例外発生")
        alertDialogBuilder.setMessage("両方、数値を入力して下さい。")
        val alertDialog = alertDialogBuilder.create()
        alertDialog.show()
    }

    fun showSnackbar(view: View) {
        Snackbar.make(view, "両方、数値を入力して下さい。", Snackbar.LENGTH_SHORT)
            .setDuration(10000)
            .show()
    }
}