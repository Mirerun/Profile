package app.murauchi.mirerun.profile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.isVisible
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //画像を見えないようにする
        profileImage.isVisible = false

        //テキストを見えないようにする
        profileCommentText.isVisible = false

        //ボタンがタップされた時に
        button1.setOnClickListener {
            //見えるようにする
            profileImage.isVisible = true
            profileCommentText.isVisible = true
            //aio
        }
    }
}