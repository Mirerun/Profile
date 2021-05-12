package app.murauchi.mirerun.profile

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
            profileImage.setImageResource(R.drawable.randy_image)
            //ラベルをTextViewに反映する
            profileLabelText.text = "名前"
            //コメントをTextViewに反映する
            profileCommentText.text = "Androidメンターのランディだよ"
        }

        //スポーツボタンが押された時に
        button2.setOnClickListener {
            //画像をImageViewに反映させる
            profileImage.setImageResource(R.drawable.baseball_image)
            //ラベルをTextViewに反映する
            profileLabelText.text = "スポーツ"
            //コメントをTextViewに反映する
            profileCommentText.text = "野球観戦が好きで、スタジアムに通っている"
        }

        //食べ物ボタンが押された時に
        button3.setOnClickListener {
            //画像をImageViewに反映させる
            profileImage.setImageResource(R.drawable.donut_image)
            //ラベルをTextViewに反映する
            profileLabelText.text = "好きな食べ物"
            //コメントをTextViewに反映する
            profileCommentText.text = "キャンディーやドーナツが大好き"
        }

        //趣味ボタンが押された時に
        button4.setOnClickListener {
            //画像をImageViewに反映させる
            profileImage.setImageResource(R.drawable.gadget_image)
            //ラベルをTextViewに反映する
            profileLabelText.text = "趣味"
            //コメントをTextViewに反映する
            profileCommentText.text = "ガジェットを集めて動かすこと"
        }

    }
}