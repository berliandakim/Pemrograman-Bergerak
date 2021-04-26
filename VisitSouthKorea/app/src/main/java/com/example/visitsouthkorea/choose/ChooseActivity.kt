package com.example.visitsouthkorea.choose

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.visitsouthkorea.R
import com.example.visitsouthkorea.entity.DataKorea
import com.example.visitsouthkorea.entity.Korea

class ChooseActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_KOREA = "extra_korea"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_choose)

        val dataKorea = intent.getParcelableExtra<Korea>(EXTRA_KOREA)


        val chooseFragment = ChooseFragment()

        val bundle = Bundle()

            bundle.putParcelable(ChooseFragment.EXTRA_DATA, dataKorea)

            chooseFragment.arguments = bundle

            supportFragmentManager.beginTransaction()
                    .add(R.id.fragment_choose, chooseFragment, ChooseFragment::class.java.simpleName)
                    .commit()




    }
}