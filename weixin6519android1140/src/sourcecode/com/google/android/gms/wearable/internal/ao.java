package com.google.android.gms.wearable.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.c.c;
import com.google.android.gms.common.api.c.e;
import com.google.android.gms.common.api.k.b;
import com.google.android.gms.common.b;
import com.google.android.gms.common.internal.h;
import com.google.android.gms.wearable.a.a;
import com.google.android.gms.wearable.b.a;
import com.google.android.gms.wearable.k.a;
import com.google.android.gms.wearable.n.b;
import com.google.android.gms.wearable.n.c;
import com.google.android.gms.wearable.q.a;
import com.google.android.gms.wearable.r.a;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public final class ao
  extends com.google.android.gms.common.internal.k<x>
{
  final ExecutorService aBT = Executors.newCachedThreadPool();
  private final y<r.a> aBU = new y();
  private final y<q.a> aBV = new y();
  private final y<b.a> aBW = new y();
  private final y<com.google.android.gms.wearable.c.b> aBX = new y();
  private final y<k.a> aBY = new y();
  private final y<n.b> aBZ = new y();
  private final y<n.c> aCa = new y();
  private final Map<String, y<a.a>> aCb = new HashMap();
  
  public ao(Context paramContext, Looper paramLooper, com.google.android.gms.common.api.c.b paramb, c.c paramc, h paramh)
  {
    super(paramContext, paramLooper, 14, paramh, paramb, paramc);
  }
  
  protected final void a(int paramInt1, IBinder paramIBinder, Bundle paramBundle, int paramInt2)
  {
    if ((!Log.isLoggable("WearableClient", 2)) || (paramInt1 == 0))
    {
      this.aBU.u(paramIBinder);
      this.aBV.u(paramIBinder);
      this.aBX.u(paramIBinder);
      this.aBY.u(paramIBinder);
      this.aBZ.u(paramIBinder);
      this.aCa.u(paramIBinder);
      synchronized (this.aCb)
      {
        Iterator localIterator = this.aCb.values().iterator();
        if (localIterator.hasNext()) {
          ((y)localIterator.next()).u(paramIBinder);
        }
      }
    }
    super.a(paramInt1, paramIBinder, paramBundle, paramInt2);
  }
  
  public final void a(c.e parame)
  {
    int i = 7887000;
    if (!jJ()) {
      try
      {
        Object localObject = this.mContext.getPackageManager().getApplicationInfo("com.google.android.wearable.app.cn", 128).metaData;
        if (localObject != null) {
          i = ((Bundle)localObject).getInt("com.google.android.wearable.api.version", 7887000);
        }
        if (i < b.agC)
        {
          new StringBuilder("Android Wear out of date. Requires API version ").append(b.agC).append(" but found ").append(i);
          Context localContext1 = this.mContext;
          Context localContext2 = this.mContext;
          localObject = new Intent("com.google.android.wearable.app.cn.UPDATE_ANDROID_WEAR").setPackage("com.google.android.wearable.app.cn");
          if (localContext2.getPackageManager().resolveActivity((Intent)localObject, 65536) != null) {}
          for (;;)
          {
            a(parame, new ConnectionResult(6, PendingIntent.getActivity(localContext1, 0, (Intent)localObject, 0)));
            return;
            localObject = new Intent("android.intent.action.VIEW", Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.wearable.app.cn").build());
          }
        }
        super.a(parame);
      }
      catch (PackageManager.NameNotFoundException localNameNotFoundException)
      {
        a(parame, new ConnectionResult(16, null));
        return;
      }
    }
  }
  
  public final void disconnect()
  {
    this.aBU.a(this);
    this.aBV.a(this);
    this.aBX.a(this);
    this.aBY.a(this);
    this.aBZ.a(this);
    this.aCa.a(this);
    synchronized (this.aCb)
    {
      Iterator localIterator = this.aCb.values().iterator();
      if (localIterator.hasNext()) {
        ((y)localIterator.next()).a(this);
      }
    }
    super.disconnect();
  }
  
  public final boolean jJ()
  {
    return !com.google.android.gms.common.k.la().a(this.mContext.getPackageManager(), "com.google.android.wearable.app.cn");
  }
  
  protected final String jK()
  {
    return "com.google.android.gms.wearable.BIND";
  }
  
  protected final String jL()
  {
    return "com.google.android.gms.wearable.internal.IWearableService";
  }
  
  protected final String kr()
  {
    if (com.google.android.gms.common.k.la().a(this.mContext.getPackageManager(), "com.google.android.wearable.app.cn")) {
      return "com.google.android.wearable.app.cn";
    }
    return "com.google.android.gms";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\google\android\gms\wearable\internal\ao.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */