package com.example.gads_lp1dd_eu_bw_2

import android.annotation.SuppressLint
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.os.Build
import android.widget.RemoteViews
import androidx.core.app.NotificationCompat
import com.google.firebase.messaging.FirebaseMessaging
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage


const val channelName = "Notification Channel"
const val channelID = "com.example.gads_lp1dd_eu_bw_2"


class MyFirebaseMessagingService: FirebaseMessagingService() {

    // 3 main things need to be carried out, they are

    // 1. generate the notification

    // 2. attach custom layout for the notification

    // 3. show the notification

    override fun onMessageReceived(remoteMessage: RemoteMessage) {

        if (remoteMessage.notification != null) {

            generateNotification(remoteMessage.notification!!.title!!, remoteMessage.notification!!.body!!)
        }
    }

    private fun getRemoteView(title: String, message: String): RemoteViews? {

        val remoteView = RemoteViews("com.example.gads_lp1dd_eu_bw_2", R.layout.notification)

        remoteView.setTextViewText(R.id.titleText, title)
        remoteView.setTextViewText(R.id.messageText, message)
        remoteView.setImageViewResource(R.id.app_logo, R.drawable.imggg)

        return remoteView

    }


    @SuppressLint("UnspecifiedImmutableFlag")
    fun generateNotification(title: String, message: String) {

        // this intent specifies where the activity should go.
        // It also puts the specified activity on top
        val intent = Intent(this, SecondActivity::class.java)

        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)

        val pendingIntent = PendingIntent.getActivity(this, 0, intent, PendingIntent.FLAG_ONE_SHOT)


        // declaring channel id and channel name

        var builder: NotificationCompat.Builder = NotificationCompat.Builder(applicationContext, channelID)
            .setSmallIcon(R.drawable.imggg)
            .setAutoCancel(true)
            .setVibrate(longArrayOf(1000,1000,1000,1000))
            .setOnlyAlertOnce(true)
            .setContentIntent(pendingIntent)

        builder = builder.setContent(getRemoteView(title, message))

        val notificationManager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {

            val notificationChannel = NotificationChannel(channelID, channelName, NotificationManager.IMPORTANCE_HIGH)

            notificationManager.createNotificationChannel(notificationChannel)
        }

        notificationManager.notify(0, builder.build())


    }


}