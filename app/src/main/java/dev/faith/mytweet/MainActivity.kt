package dev.faith.mytweet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import dev.faith.mytweet.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        displayTwitter()


    }

    fun displayTwitter() {
        var twitter = Twitter("Mitchell", "@mit", "I love coding","Any fool can write code that a computer can understand. Good programmers write code that humans can understand.")
        var twitter1 = Twitter("Gumato", "@gume_robba", "I love travelling","i joofg")
        var twitter2 = Twitter("Cheko Ala", "@cheko_sharon", "I love watching","Experience is the name everyone gives to their mistakes.")
        var twitter3 = Twitter("Dennis Muia", "@den_mato", "I love reading"," In order to be irreplaceable, one must always be differen")
        var twitter4 = Twitter("Benja Kioko", "@ben_mei", "I love helping","Knowledge is power,always keep tyring ,and work smart.”")
        var twitter5 = Twitter("Ivy Kiosh", "@ivyh_ilf", "I love laughing","“Sometimes it pays to stay in bed on Monday, rather than spending the rest of the week debugging Monday’s code.")
        var twitter6 = Twitter("Jane Nyamb", "@jani_irum", "I love dancing","“Ruby is rubbish! PHP is phpantastic!")
        var twitter7 = Twitter("GumatoBaby", "@ila_ujfg", "I am hardworking","“Optimism is an occupational hazard of programming: feedback is the treatment")
        var twitter8 = Twitter("Kelvin Kevo", "@kel_jktd", "I like partying","When to use iterative development? You should use iterative development only on projects that you want to succeed.")
        var twitter9 = Twitter("Jane okot", "@jmff_jkg", "I love Python","“Before software can be reusable it first has to be usable.”")
        var twitter10 = Twitter("Mark Mwendwa", "@mrk_gfei", "I love travelling","“Experience is the name everyone gives to their mistakes.”")
        var twitter11 = Twitter("Joanna caro", "@jnaa_mjgvc", "I love doing makeup","“Sometimes it pays to stay in bed on Monday, rather than spending the rest of the week debugging Monday’s code.”")
        var twitter12 = Twitter("Christine Wawira", "@chri_mhfd", "I love eating","Perfection is achieved not when there is nothing more to add, but rather when there is nothing more to take away.” ")
        var twitter13 = Twitter("Nancy Wambui", "@nanj_wacf", "I love cooking","Make it work, make it right, make it fast.” ")


        var twitterList = listOf(
            twitter,
            twitter2,
            twitter3,
            twitter4,
            twitter5,
            twitter6,
            twitter7,
            twitter8,
            twitter9,
            twitter10,
            twitter11,
            twitter12,
            twitter13
        )
        var twitterAdapter = TweetrvAdapter(twitterList)
        binding.rvtweet.layoutManager =LinearLayoutManager(this)
        binding.rvtweet.adapter = twitterAdapter
    }
}