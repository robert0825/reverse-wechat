package com.google.android.gms.common.api;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.w;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public final class l
  implements p
{
  private final o ahD;
  
  public l(o paramo)
  {
    this.ahD = paramo;
  }
  
  private <A extends a.b> void a(o.e<A> parame)
  {
    this.ahD.b(parame);
    Object localObject = this.ahD;
    a.c localc = parame.jG();
    localObject = (a.b)((o)localObject).ait.get(localc);
    w.j(localObject, "Appropriate Api was not requested.");
    if ((!((a.b)localObject).isConnected()) && (this.ahD.aiu.containsKey(parame.jG())))
    {
      parame.c(new Status(17));
      return;
    }
    parame.a((a.b)localObject);
  }
  
  public final <A extends a.b, R extends g, T extends k.a<R, A>> T a(T paramT)
  {
    return b(paramT);
  }
  
  public final void a(ConnectionResult paramConnectionResult, a<?> parama, int paramInt) {}
  
  public final <A extends a.b, T extends k.a<? extends g, A>> T b(T paramT)
  {
    try
    {
      a(paramT);
      return paramT;
    }
    catch (DeadObjectException localDeadObjectException)
    {
      this.ahD.a(new o.b(this)
      {
        public final void jX()
        {
          l.this.bU(1);
        }
      });
    }
    return paramT;
  }
  
  public final void bU(int paramInt)
  {
    if (paramInt == 1)
    {
      localObject = this.ahD;
      if (!((o)localObject).aio)
      {
        ((o)localObject).aio = true;
        if (((o)localObject).ais == null)
        {
          ((o)localObject).ais = new o.c((o)localObject);
          IntentFilter localIntentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
          localIntentFilter.addDataScheme("package");
          ((o)localObject).mContext.getApplicationContext().registerReceiver(((o)localObject).ais, localIntentFilter);
        }
        ((o)localObject).air.sendMessageDelayed(((o)localObject).air.obtainMessage(1), ((o)localObject).aip);
        ((o)localObject).air.sendMessageDelayed(((o)localObject).air.obtainMessage(2), ((o)localObject).aiq);
      }
    }
    Object localObject = this.ahD.aiz.iterator();
    while (((Iterator)localObject).hasNext()) {
      ((o.e)((Iterator)localObject).next()).a(new Status(8, "The connection to Google Play services was lost"));
    }
    this.ahD.f(null);
    this.ahD.aim.cb(paramInt);
    this.ahD.aim.kA();
    if (paramInt == 2) {
      this.ahD.connect();
    }
  }
  
  public final void begin()
  {
    while (!this.ahD.ain.isEmpty()) {
      try
      {
        a((o.e)this.ahD.ain.remove());
      }
      catch (DeadObjectException localDeadObjectException) {}
    }
  }
  
  public final void connect() {}
  
  public final void disconnect()
  {
    this.ahD.aiu.clear();
    this.ahD.kg();
    this.ahD.f(null);
    this.ahD.aim.kA();
  }
  
  public final void g(Bundle paramBundle) {}
  
  public final String getName()
  {
    return "CONNECTED";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\google\android\gms\common\api\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */