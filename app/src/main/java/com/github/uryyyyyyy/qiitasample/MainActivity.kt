package com.github.uryyyyyyy.qiitasample;

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ListView
import com.github.uryyyyyyy.qiitasample.model.Article
import com.github.uryyyyyyy.qiitasample.model.User

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listAdapter = ArticleListAdapter(applicationContext)
        listAdapter.articles = listOf(dummyArticle("Kotlin入門", "たろう"),
                dummyArticle("Java入門", "じろうまる"))
        val listView: ListView = findViewById(R.id.list_view) as ListView
        listView.adapter = listAdapter
        listView.setOnItemClickListener { adapterView, view, position, id ->
            val article = listAdapter.articles[position]
            println(article)
            ArticleActivity.intent(this, article).let { startActivity(it) }
        }
    }

    private fun dummyArticle(title: String, userName: String): Article {
        return Article(
                id = "",
                title = title,
                url = "https://kotlinlang.org/",
                user = User(id = "", name = userName, profileImageUrl = ""))
    }
}
