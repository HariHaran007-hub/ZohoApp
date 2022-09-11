package com.rcappstudio.zohosampleapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.zoho.catalyst.datastore.ZCatalystDataStore
import com.zoho.catalyst.setup.ZCatalystApp
import com.zoho.catalyst.setup.ZCatalystSDKConfigs

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val catalyst= ZCatalystApp.init(applicationContext, ZCatalystSDKConfigs.AccountType.DEVELOPMENT)

        val dataStore:ZCatalystDataStore = catalyst.getDataStoreInstance()

    }
}