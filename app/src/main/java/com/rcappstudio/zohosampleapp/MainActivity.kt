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

        val builder = ZCatalystSDKConfigs
            .Builder(ZCatalystSDKConfigs.AccountType.DEVELOPMENT,
            "https://api.catalyst.zoho.in",
                "50010559428.LRPGCNI814C4I8MIX9377LYL2A2FET",
                "05ed33e316f6c736075550fb7eefd948349ffb0c34",
                "rcappstudio",
                "ZOHOCATALYST.tables.rows.ALL,ZOHOCATALYST.queue.data.READ,ZOHOCATALYST.cache.READ,ZOHOCATALYST.queue.data.CREATE,ZOHOCATALYST.queue.READ,ZOHOCATALYST.cache.CREATE,ZOHOCATALYST.tables.columns.READ,ZOHOCATALYST.files.READ,ZOHOCATALYST.files.CREATE,ZOHOCATALYST.files.DELETE,ZOHOCATALYST.projects.users.READ,ZOHOCATALYST.projects.users.CREATE,ZOHOCATALYST.cache.DELETE,ZOHOCATALYST.folders.ALL,ZOHOCATALYST.zcql.CREATE,ZOHOCATALYST.graphql.READ,ZOHOCATALYST.email.CREATE,ZOHOCATALYST.segments.READ,ZOHOCATALYST.cron.ALL,ZOHOCATALYST.search.READ,ZOHOCATALYST.functions.execute,ZOHOCATALYST.functions.READ,ZOHOCATALYST.mlkit.READ,ZOHOCATALYST.folders.ALL,ZOHOCATALYST.notifications.web,ZOHOCATALYST.notifications.mobile,ZOHOCATALYST.functions.CREATE,ZOHOCATALYST.zia.automl.model.ALL,ZOHOCATALYST.zia.automl.model.predict,ZOHOCATALYST.zia.automl.dataset.CREATE,ZOHOCATALYST.zia.automl.dataset.READ,ZOHOCATALYST.zia.automl.dataset.UPDATE,ZOHOCATALYST.zia.timeseries.ALL,ZOHOCATALYST.zia.timeseries.analysis.READ,ZOHOCATALYST.zia.barcodescanning.READ,ZOHOCATALYST.circuits.execute,ZOHOCATALYST.circuits.execution.READ,ZOHOCATALYST.circuits.execution.DELETE,ZOHOCATALYST.projects.users.DELETE,ZOHOCATALYST.tables.permissions.READ,ZOHOCATALYST.webapp.READ,ZOHOCATALYST.circuits.READ,ZOHOCATALYST.email.READ,ZOHOCATALYST.apigateway.apis.READ"
            ,1719000000007001,
                50010559428
            ).build()

       val catalyst = ZCatalystApp.init(applicationContext, builder)
//       val catalyst = ZCatalystApp.init(applicationContext, ZCatalystSDKConfigs.AccountType.DEVELOPMENT)

        val user = catalyst.newUser( "Hari", "rhariscollections@gmail.com" )

/*        catalyst.signUp(user , { success->
            Log.d("TAG", "onCrea    te: success!!")
        } ,
            { exception->
                Log.d("TAG", "onCreate: ${exception.getErrorMsg()}!!")
        })

        val dataStore:ZCatalystDataStore = ZCatalystApp.getInstance().getDataStoreInstance()*/

        catalyst.getDataStoreInstance().getTable(1719000000008003, //Replace this with your Table ID
            {
                    table -> Log.d("TAG", "onCreate: Get Table Success")
                println("The name of the table is: ${table.tableName}")
            },
            {
                    exception ->
                println("Get table by its ID failed! $exception")
            })


    }
}