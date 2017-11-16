package com.google.android.gms.iid;

import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.gcm.GcmReceiver;
import java.io.IOException;

public class InstanceIDListenerService
  extends Service
{
  static String ACTION = "action";
  private static String anX = "google.com/iid";
  private static String anY = "CMD";
  private static String ant = "gcm.googleapis.com/refresh";
  MessengerCompat anV = new MessengerCompat(new Handler(Looper.getMainLooper())
  {
    public final void handleMessage(Message paramAnonymousMessage)
    {
      InstanceIDListenerService.a(InstanceIDListenerService.this, paramAnonymousMessage, MessengerCompat.c(paramAnonymousMessage));
    }
  });
  BroadcastReceiver anW = new BroadcastReceiver()
  {
    public final void onReceive(Context paramAnonymousContext, Intent paramAnonymousIntent)
    {
      if (Log.isLoggable("InstanceID", 3))
      {
        paramAnonymousIntent.getStringExtra("registration_id");
        new StringBuilder("Received GSF callback using dynamic receiver: ").append(paramAnonymousIntent.getExtras());
      }
      InstanceIDListenerService.this.e(paramAnonymousIntent);
      InstanceIDListenerService.this.stop();
    }
  };
  int anZ;
  int aoa;
  
  static void I(Context paramContext)
  {
    Intent localIntent = new Intent("com.google.android.gms.iid.InstanceID");
    localIntent.setPackage(paramContext.getPackageName());
    localIntent.putExtra(anY, "SYNC");
    paramContext.startService(localIntent);
  }
  
  static void a(Context paramContext, e parame)
  {
    parame.lg();
    parame = new Intent("com.google.android.gms.iid.InstanceID");
    parame.putExtra(anY, "RST");
    parame.setPackage(paramContext.getPackageName());
    paramContext.startService(parame);
  }
  
  public final void e(Intent paramIntent)
  {
    String str = paramIntent.getStringExtra("subtype");
    Object localObject1;
    Object localObject2;
    if (str == null)
    {
      localObject1 = a.H(this);
      localObject2 = paramIntent.getStringExtra(anY);
      if ((paramIntent.getStringExtra("error") == null) && (paramIntent.getStringExtra("registration_id") == null)) {
        break label84;
      }
      if (Log.isLoggable("InstanceID", 3)) {}
      a.lc().h(paramIntent);
    }
    label84:
    label271:
    do
    {
      do
      {
        return;
        localObject1 = new Bundle();
        ((Bundle)localObject1).putString("subtype", str);
        localObject1 = a.a(this, (Bundle)localObject1);
        break;
        if (Log.isLoggable("InstanceID", 3)) {
          new StringBuilder("Service command ").append(str).append(" ").append((String)localObject2).append(" ").append(paramIntent.getExtras());
        }
        if (paramIntent.getStringExtra("unregistered") != null)
        {
          localObject2 = a.lb();
          if (str == null) {}
          for (localObject1 = "";; localObject1 = str)
          {
            ((e)localObject2).an((String)localObject1);
            a.lc().h(paramIntent);
            return;
          }
        }
        if (ant.equals(paramIntent.getStringExtra("from")))
        {
          a.lb().an(str);
          return;
        }
        if ("RST".equals(localObject2))
        {
          ((a)localObject1).anT = 0L;
          paramIntent = a.anP;
          str = ((a)localObject1).anS;
          paramIntent.am(str + "|");
          ((a)localObject1).anR = null;
          return;
        }
        if (!"RST_FULL".equals(localObject2)) {
          break label271;
        }
      } while (a.lb().isEmpty());
      a.lb().lg();
      return;
      if ("SYNC".equals(localObject2))
      {
        a.lb().an(str);
        return;
      }
    } while (!"PING".equals(localObject2));
    try
    {
      com.google.android.gms.gcm.a.E(this).a(anX, d.lf(), paramIntent.getExtras());
      return;
    }
    catch (IOException paramIntent) {}
  }
  
  public IBinder onBind(Intent paramIntent)
  {
    if ((paramIntent != null) && ("com.google.android.gms.iid.InstanceID".equals(paramIntent.getAction()))) {
      return this.anV.getBinder();
    }
    return null;
  }
  
  public void onCreate()
  {
    IntentFilter localIntentFilter = new IntentFilter("com.google.android.c2dm.intent.REGISTRATION");
    localIntentFilter.addCategory(getPackageName());
    registerReceiver(this.anW, localIntentFilter, "com.google.android.c2dm.permission.RECEIVE", null);
  }
  
  public void onDestroy()
  {
    unregisterReceiver(this.anW);
  }
  
  public int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2)
  {
    try
    {
      this.anZ += 1;
      if (paramInt2 > this.aoa) {
        this.aoa = paramInt2;
      }
      if (paramIntent == null)
      {
        stop();
        return 2;
      }
    }
    finally {}
    try
    {
      if ("com.google.android.gms.iid.InstanceID".equals(paramIntent.getAction()))
      {
        if (Build.VERSION.SDK_INT <= 18)
        {
          Intent localIntent = (Intent)paramIntent.getParcelableExtra("GSF");
          if (localIntent != null)
          {
            startService(localIntent);
            return 1;
          }
        }
        e(paramIntent);
      }
      stop();
      if (paramIntent.getStringExtra("from") != null) {
        GcmReceiver.b(paramIntent);
      }
      return 2;
    }
    finally
    {
      stop();
    }
  }
  
  final void stop()
  {
    try
    {
      this.anZ -= 1;
      if (this.anZ == 0) {
        stopSelf(this.aoa);
      }
      if (Log.isLoggable("InstanceID", 3)) {
        new StringBuilder("Stop ").append(this.anZ).append(" ").append(this.aoa);
      }
      return;
    }
    finally {}
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\google\android\gms\iid\InstanceIDListenerService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */