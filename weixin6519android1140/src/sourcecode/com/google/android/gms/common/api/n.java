package com.google.android.gms.common.api;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

public final class n
  implements p
{
  private final o ahD;
  
  public n(o paramo)
  {
    this.ahD = paramo;
  }
  
  public final <A extends a.b, R extends g, T extends k.a<R, A>> T a(T paramT)
  {
    this.ahD.ain.add(paramT);
    return paramT;
  }
  
  public final void a(ConnectionResult paramConnectionResult, a<?> parama, int paramInt) {}
  
  public final <A extends a.b, T extends k.a<? extends g, A>> T b(T paramT)
  {
    throw new IllegalStateException("GoogleApiClient is not connected yet.");
  }
  
  public final void bU(int paramInt) {}
  
  public final void begin()
  {
    Iterator localIterator = this.ahD.ait.values().iterator();
    while (localIterator.hasNext()) {
      ((a.b)localIterator.next()).disconnect();
    }
    this.ahD.aiv = Collections.emptySet();
  }
  
  public final void connect()
  {
    o localo = this.ahD;
    localo.ahF.lock();
    try
    {
      localo.aiw = new m(localo, localo.ahU, localo.ahV, localo.ahc, localo.ahd, localo.ahF, localo.mContext);
      localo.aiw.begin();
      localo.ail.signalAll();
      return;
    }
    finally
    {
      localo.ahF.unlock();
    }
  }
  
  public final void disconnect()
  {
    Iterator localIterator = this.ahD.ain.iterator();
    while (localIterator.hasNext()) {
      ((o.e)localIterator.next()).cancel();
    }
    this.ahD.ain.clear();
    this.ahD.aiu.clear();
    this.ahD.kg();
  }
  
  public final void g(Bundle paramBundle) {}
  
  public final String getName()
  {
    return "DISCONNECTED";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\google\android\gms\common\api\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */