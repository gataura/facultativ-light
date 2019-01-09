package com.hfad.facultativ.api.model

class GitHubRepo (private var name: String) {


    fun getName():String{
        return name
    }
}
/*
package com.hfad.facultativ

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Build
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.preference.Preference
import android.preference.PreferenceManager
import android.support.annotation.RequiresApi
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Toast
import com.hfad.facultativ.Constants
import com.hfad.facultativ.GitAdapter.GitAdapter
import com.hfad.facultativ.api.model.GitHubRepo
import com.hfad.facultativ.api.service.GitHubClient
//import com.hfad.fac.adapter.GitAdapter
//import com.hfad.fac.api.model.GitHubRepo
//import com.hfad.fac.api.service.GitHubClient
import com.hfad.facultativ.myPrefs
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

@Suppress("OverridingDeprecatedMember", "DEPRECATION")
class MainScreenActivity : AppCompatActivity() {

var userToken: myPrefs? = null
private lateinit var myToken:String
private var sp: myPrefs? = null
private val client = mGithubClient().build()
lateinit var repos: ArrayList<GitHubRepo>
private lateinit var gitResyclerView: RecyclerView

@SuppressLint("SetJavaScriptEnabled")
override fun onCreate(savedInstanceState: Bundle?) {
super.onCreate(savedInstanceState)
setContentView(R.layout.activity_main_screen)


initRecyclerView()

sp = myPrefs(this)

myToken = sp?.getToken().toString()

getRepos(myToken).enqueue(object: Callback<List<GitHubRepo>>{
override fun onResponse(call: Call<List<GitHubRepo>>?, response: Response<List<GitHubRepo>>) {
repos.addAll(response.body())

gitResyclerView.adapter = GitAdapter(repos)
}

override fun onFailure(call: Call<List<GitHubRepo>>?, t: Throwable?) {
Toast.makeText(this@MainScreenActivity, "error bae", Toast.LENGTH_SHORT).show()
}

})

//setInitialData()

var item = repos.get(index = 2)
var message = item.getName()
}

companion object {
fun start(context: Context) {
val intent = Intent(context, MainScreenActivity::class.java)
context.startActivity(intent)
}
}

private fun getRepos(token: String) = client.reposForToken(token)

class mGithubClient {

private val builder = Retrofit
.Builder()
.baseUrl(Constants.githubApiUrl)
.addConverterFactory(GsonConverterFactory.create())

private val retrofit: Retrofit by lazy {
builder.build()
}

private val client: GitHubClient by lazy {
retrofit.create(GitHubClient::class.java)
}

fun build() = client
}

private fun initRecyclerView() {
gitResyclerView = find(R.id.git_recycler_view)
gitResyclerView.layoutManager = LinearLayoutManager(this)
}

private fun setInitialData() {
repos.add(GitHubRepo("1"))
repos.add(GitHubRepo("2"))
repos.add(GitHubRepo("3"))
repos.add(GitHubRepo("4"))
}

}
*/