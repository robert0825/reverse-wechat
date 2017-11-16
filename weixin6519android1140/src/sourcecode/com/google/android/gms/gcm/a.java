package com.google.android.gms.gcm;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import com.google.android.gms.iid.d;
import com.google.android.gms.iid.e;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public final class a
{
  private static final AtomicInteger anB = new AtomicInteger(1);
  public static int anv = 5000000;
  public static int anw = 6500000;
  public static int anx = 7000000;
  static a any;
  Map<String, Handler> anA = Collections.synchronizedMap(new HashMap());
  public final BlockingQueue<Intent> anC = new LinkedBlockingQueue();
  final Messenger anD = new Messenger(new Handler(Looper.getMainLooper())
  {
    public final void handleMessage(Message paramAnonymousMessage)
    {
      Object localObject;
      if (paramAnonymousMessage != null) {
        localObject = paramAnonymousMessage.obj;
      }
      Intent localIntent = (Intent)paramAnonymousMessage.obj;
      if ("com.google.android.c2dm.intent.REGISTRATION".equals(localIntent.getAction())) {
        a.this.anC.add(localIntent);
      }
      for (;;)
      {
        return;
        a locala = a.this;
        localObject = localIntent.getStringExtra("In-Reply-To");
        paramAnonymousMessage = (Message)localObject;
        if (localObject == null)
        {
          paramAnonymousMessage = (Message)localObject;
          if (localIntent.hasExtra("error")) {
            paramAnonymousMessage = localIntent.getStringExtra("google.message_id");
          }
        }
        if (paramAnonymousMessage != null)
        {
          paramAnonymousMessage = (Handler)locala.anA.remove(paramAnonymousMessage);
          if (paramAnonymousMessage != null)
          {
            localObject = Message.obtain();
            ((Message)localObject).obj = localIntent;
          }
        }
        for (boolean bool = paramAnonymousMessage.sendMessage((Message)localObject); !bool; bool = false)
        {
          localIntent.setPackage(a.this.context.getPackageName());
          a.this.context.sendBroadcast(localIntent);
          return;
        }
      }
    }
  });
  private PendingIntent anz;
  public Context context;
  
  public static a E(Context paramContext)
  {
    try
    {
      if (any == null)
      {
        a locala = new a();
        any = locala;
        locala.context = paramContext.getApplicationContext();
      }
      paramContext = any;
      return paramContext;
    }
    finally {}
  }
  
  public static int F(Context paramContext)
  {
    PackageManager localPackageManager = paramContext.getPackageManager();
    try
    {
      int i = localPackageManager.getPackageInfo(d.J(paramContext), 0).versionCode;
      return i;
    }
    catch (PackageManager.NameNotFoundException paramContext) {}
    return -1;
  }
  
  public static String c(Intent paramIntent)
  {
    if (!"com.google.android.c2dm.intent.RECEIVE".equals(paramIntent.getAction())) {
      paramIntent = null;
    }
    String str;
    do
    {
      return paramIntent;
      str = paramIntent.getStringExtra("message_type");
      paramIntent = str;
    } while (str != null);
    return "gcm";
  }
  
  private void d(Intent paramIntent)
  {
    try
    {
      if (this.anz == null)
      {
        Intent localIntent = new Intent();
        localIntent.setPackage("com.google.example.invalidpackage");
        this.anz = PendingIntent.getBroadcast(this.context, 0, localIntent, 0);
      }
      paramIntent.putExtra("app", this.anz);
      return;
    }
    finally {}
  }
  
  @Deprecated
  private Intent i(Bundle paramBundle)
  {
    if (Looper.getMainLooper() == Looper.myLooper()) {
      throw new IOException("MAIN_THREAD");
    }
    if (F(this.context) < 0) {
      throw new IOException("Google Play Services missing");
    }
    Intent localIntent = new Intent("com.google.android.c2dm.intent.REGISTER");
    localIntent.setPackage(d.J(this.context));
    d(localIntent);
    localIntent.putExtra("google.message_id", "google.rpc" + String.valueOf(anB.getAndIncrement()));
    localIntent.putExtras(paramBundle);
    localIntent.putExtra("google.messenger", this.anD);
    this.context.startService(localIntent);
    try
    {
      paramBundle = (Intent)this.anC.poll(30000L, TimeUnit.MILLISECONDS);
      return paramBundle;
    }
    catch (InterruptedException paramBundle)
    {
      throw new IOException(paramBundle.getMessage());
    }
  }
  
  public final void a(String paramString1, String paramString2, Bundle paramBundle)
  {
    if (paramString1 == null) {
      throw new IllegalArgumentException("Missing 'to'");
    }
    Object localObject1 = new Intent("com.google.android.gcm.intent.SEND");
    if (paramBundle != null) {
      ((Intent)localObject1).putExtras(paramBundle);
    }
    d((Intent)localObject1);
    ((Intent)localObject1).setPackage(d.J(this.context));
    ((Intent)localObject1).putExtra("google.to", paramString1);
    ((Intent)localObject1).putExtra("google.message_id", paramString2);
    ((Intent)localObject1).putExtra("google.ttl", Long.toString(0L));
    ((Intent)localObject1).putExtra("google.delay", Integer.toString(-1));
    if (d.J(this.context).contains(".gsf"))
    {
      localObject1 = new Bundle();
      Iterator localIterator = paramBundle.keySet().iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        Object localObject2 = paramBundle.get(str);
        if ((localObject2 instanceof String)) {
          ((Bundle)localObject1).putString("gcm." + str, (String)localObject2);
        }
      }
      ((Bundle)localObject1).putString("google.to", paramString1);
      ((Bundle)localObject1).putString("google.message_id", paramString2);
      com.google.android.gms.iid.a.H(this.context).b("GCM", "upstream", (Bundle)localObject1);
      return;
    }
    this.context.sendOrderedBroadcast((Intent)localObject1, "com.google.android.gtalkservice.permission.GTALK_SERVICE");
  }
  
  @Deprecated
  public final String b(String... paramVarArgs)
  {
    int j = 0;
    Object localObject;
    Bundle localBundle;
    com.google.android.gms.iid.a locala;
    try
    {
      localObject = paramVarArgs[0];
      localBundle = new Bundle();
      if (!d.J(this.context).contains(".gsf")) {
        break label216;
      }
      localBundle.putString("legacy.sender", (String)localObject);
      locala = com.google.android.gms.iid.a.H(this.context);
      if (Looper.getMainLooper() == Looper.myLooper()) {
        throw new IOException("MAIN_THREAD");
      }
    }
    finally {}
    int i = 1;
    String str;
    if (com.google.android.gms.iid.a.ld())
    {
      str = null;
      paramVarArgs = str;
      if (str == null)
      {
        if (localBundle.getString("ttl") != null) {
          i = 0;
        }
        if (!"jwt".equals(localBundle.getString("type"))) {
          break label301;
        }
        i = j;
      }
    }
    label216:
    label301:
    for (;;)
    {
      str = locala.b((String)localObject, "GCM", localBundle);
      paramVarArgs = str;
      if (str != null)
      {
        paramVarArgs = str;
        if (i != 0)
        {
          com.google.android.gms.iid.a.anP.a(locala.anS, (String)localObject, "GCM", str, com.google.android.gms.iid.a.anU);
          paramVarArgs = str;
        }
      }
      do
      {
        return paramVarArgs;
        str = com.google.android.gms.iid.a.anP.c(locala.anS, (String)localObject, "GCM");
        break;
        localBundle.putString("sender", (String)localObject);
        localObject = i(localBundle);
        if (localObject == null) {
          throw new IOException("SERVICE_NOT_AVAILABLE");
        }
        str = ((Intent)localObject).getStringExtra("registration_id");
        paramVarArgs = str;
      } while (str != null);
      paramVarArgs = ((Intent)localObject).getStringExtra("error");
      if (paramVarArgs != null) {
        throw new IOException(paramVarArgs);
      }
      throw new IOException("SERVICE_NOT_AVAILABLE");
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\google\android\gms\gcm\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */