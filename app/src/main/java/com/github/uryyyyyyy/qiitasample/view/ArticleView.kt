package com.github.uryyyyyyy.qiitasample.view

import android.content.Context
import android.graphics.Color
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.FrameLayout
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.github.uryyyyyyy.qiitasample.R
import com.github.uryyyyyyy.qiitasample.model.Article

class ArticleView : FrameLayout {

    constructor(context: Context?) : super(context)

    constructor(context: Context?, attributes: AttributeSet?) : super(context, attributes)

    constructor(context: Context?, attributes: AttributeSet?, defStyleAttribute: Int) : super(context, attributes, defStyleAttribute)

    constructor(context: Context?, attributes: AttributeSet?, defStyleAttribute: Int, defStyleRes: Int) : super(context, attributes, defStyleAttribute, defStyleRes)

    val profileImageView: ImageView by lazy {
        findViewById(R.id.profile_image_view) as ImageView
    }
    val titleTextView: TextView by lazy {
        findViewById(R.id.title_text_view) as TextView
    }
    val userNameTextView: TextView by lazy {
        findViewById(R.id.user_name_text_view) as TextView
    }

    init {
        LayoutInflater.from(context).inflate(R.layout.view_article, this)
    }

    fun setArticle(article: Article) {
        titleTextView.text = article.title
        userNameTextView.text = article.user.name
        //TODOプロフィール画像をセットする
        profileImageView.setBackgroundColor(Color.RED)
        Glide.with(context).load(article.user.profileImageUrl).into(profileImageView)
    }

}

