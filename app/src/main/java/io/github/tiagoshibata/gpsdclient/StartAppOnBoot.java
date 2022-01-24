package io.github.tiagoshibata.gpsdclient;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class StartAppOnBoot extends BroadcastReceiver {
    if (Intent.ACTION_BOOT_COMPLETED.equals(intent.getAction())) {
        Intent i = new Intent(context, MainActivity.class);
        i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(i);
}

    @Override
    public void onReceive(Context context, Intent intent) {

    }
}