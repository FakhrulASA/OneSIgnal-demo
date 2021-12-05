package com.fakhrulasa.onesignal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.onesignal.OSInAppMessageAction
import com.onesignal.OSNotificationOpenedResult
import com.onesignal.OneSignal
import org.json.JSONObject
import android.content.Intent
import android.widget.Toast


class MainActivity : AppCompatActivity(),OneSignal.OSGetTagsHandler, OneSignal.OSInAppMessageClickHandler {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    override fun inAppMessageClicked(result: OSInAppMessageAction?) {
        Toast.makeText(this,result!!.clickName.toString(),Toast.LENGTH_SHORT).show()

    }


    override fun tagsAvailable(tags: JSONObject?) {
        TODO("Not yet implemented")
    }
}