package com.github.uryyyyyyy.qiitasample

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import com.github.uryyyyyyy.qiitasample.model.Article
import com.github.uryyyyyyy.qiitasample.view.ArticleView

class ArticleListAdapter(private val context: Context) : BaseAdapter() {

    var articles: List<Article> = emptyList()
    override fun getCount(): Int = articles.size

    override fun getItem(position: Int): Any? = articles[position]
    override fun getItemId(position: Int): Long = 0
    override fun getView(position: Int,
                         convertView: View?,
                         parent: ViewGroup?): View =
            ((convertView as? ArticleView) ?: ArticleView(context)).apply {
                setArticle(articles[position])
            }
}