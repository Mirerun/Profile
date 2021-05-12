package app.murauchi.mirerun.profile

import android.content.res.ColorStateList
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.isVisible
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //ボタン１(名前)がタップされた時に
        button1.setOnClickListener {
            //画像をImageViewに反映させる
            profileImage.setImageResource(R.drawable.mirei)
            //ラベルをTextViewに反映する
            profileLabelText.text = "NAME"
            //コメントをTextViewに反映する
            profileCommentText.text = "村内美澪　むらうちみれい"

            //押されたボタンの色を変える
            button1.backgroundTintList = ColorStateList.valueOf(Color.rgb(0,180,220))
            //他のボタンの色をグレーにする
            button2.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150,150))
            button3.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150,150))
            button4.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150,150))
        }

        //スポーツボタンが押された時に
        button2.setOnClickListener {
            //画像をImageViewに反映させる
            profileImage.setImageResource(R.drawable.twenty_age)
            //ラベルをTextViewに反映する
            profileLabelText.text = "AGE"
            //コメントをTextViewに反映する
            profileCommentText.text = "ピチピチの２０歳♡"

            //押されたボタンの色を変える
            button2.backgroundTintList = ColorStateList.valueOf(Color.rgb(0,100,220))
            //他のボタンの色をグレーにする
            button1.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150,150))
            button3.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150,150))
            button4.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150,150))
        }

        //食べ物ボタンが押された時に
        button3.setOnClickListener {
            //画像をImageViewに反映させる
            profileImage.setImageResource(R.drawable.chocolate)
            //ラベルをTextViewに反映する
            profileLabelText.text = "FOOD"
            //コメントをTextViewに反映する
            profileCommentText.text = "愛すべきはチョコレート！甘いものはどんな選択肢があろうとチョコ味を選ぶ徹底ぶり。"

            //押されたボタンの色を変える
            button3.backgroundTintList = ColorStateList.valueOf(Color.rgb(220,0,100))
            //他のボタンの色をグレーにする
            button1.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150,150))
            button2.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150,150))
            button4.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150,150))
        }

        //趣味ボタンが押された時に
        button4.setOnClickListener {
            //画像をImageViewに反映させる
            profileImage.setImageResource(R.drawable.sax)
            //ラベルをTextViewに反映する
            profileLabelText.text = "HOBBY"
            //コメントをTextViewに反映する
            profileCommentText.text = "アルトサックスを小学校４年生から約１５年続けてます。今はジャズ研サークルで時々吹いています！"

            //押されたボタンの色を変える
            button4.backgroundTintList = ColorStateList.valueOf(Color.rgb(220,100,0))
            //他のボタンの色をグレーにする
            button1.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150,150))
            button3.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150,150))
            button2.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150,150))
        }

    }
}