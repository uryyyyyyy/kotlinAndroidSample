package com.github.uryyyyyyy.qiitasample;

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.github.uryyyyyyy.qiitasample.model.Article
import com.github.uryyyyyyy.qiitasample.model.User
import com.github.uryyyyyyy.qiitasample.view.ArticleView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val articleView = ArticleView(applicationContext)

        articleView.setArticle(Article(
                id = "123",
                title = "Kotlin入門",
                url = "http://www.example・com/articles/123",
                user = User(id = "456", name = "たろう", profileImageUrl = "")))

        setContentView(articleView)
    }
}
