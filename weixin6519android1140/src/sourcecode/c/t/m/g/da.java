package c.t.m.g;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import com.tencent.map.geolocation.internal.TencentLogImpl;
import com.tencent.tencentmap.lbssdk.service.e;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.LinkedBlockingQueue;

public final class da
{
  final LinkedBlockingQueue<a> a;
  final cj b;
  long c;
  long d;
  long e;
  long f;
  volatile boolean g;
  boolean h;
  
  da(cj paramcj)
  {
    this.b = paramcj;
    this.a = new LinkedBlockingQueue(3);
  }
  
  private static String a(byte[] paramArrayOfByte, int paramInt)
  {
    if ((!TencentLogImpl.isDebugEnabled()) && (paramArrayOfByte != null)) {}
    try
    {
      if (e.o(paramArrayOfByte, 1) < 0) {
        return cs.a(paramInt, 0);
      }
      paramArrayOfByte = cs.a(paramInt, 1);
      return paramArrayOfByte;
    }
    catch (UnsatisfiedLinkError paramArrayOfByte) {}
    return null;
  }
  
  public final void a(String paramString, dh paramdh, int paramInt)
  {
    try
    {
      byte[] arrayOfByte = b.a.b(paramString.getBytes("GBK"));
      paramdh = new a(1, arrayOfByte, a(arrayOfByte, paramInt), paramdh);
      paramdh.b = paramString;
      a(paramdh);
      return;
    }
    catch (Throwable paramString) {}
  }
  
  final boolean a(a parama)
  {
    SystemClock.elapsedRealtime();
    if (parama.f != null) {}
    for (boolean bool = this.a.offer(parama);; bool = false)
    {
      String str;
      if (!bool)
      {
        this.a.clear();
        this.a.offer(parama);
        str = "Location";
        if (parama.e != 2) {
          break label75;
        }
        str = "List";
      }
      for (;;)
      {
        new StringBuilder("post").append(str).append("Request: failed to add request,because the queue has full,so we delete the first");
        return bool;
        label75:
        if (parama.e == 3) {
          str = "Wifis";
        } else if (parama.e == 4) {
          str = "EventTrack";
        }
      }
    }
  }
  
  final void b(a parama)
  {
    parama.h -= 1;
    Iterator localIterator = this.a.iterator();
    do
    {
      if (!localIterator.hasNext()) {
        break;
      }
    } while (((a)localIterator.next()).e != parama.e);
    for (int i = 1;; i = 0)
    {
      if ((parama.h > 0) && (i == 0))
      {
        new StringBuilder("retryIfNeed: times=").append(parama.h);
        this.a.offer(parama);
      }
      return;
    }
  }
  
  static final class a
  {
    public static final a d = new a();
    final Object a;
    public String b;
    public long c;
    public final int e;
    public final byte[] f;
    public final String g;
    public int h = 1;
    
    private a()
    {
      this.e = 0;
      this.f = null;
      this.g = null;
      this.a = null;
    }
    
    a(int paramInt, byte[] paramArrayOfByte, String paramString, Object paramObject)
    {
      this.e = paramInt;
      this.f = paramArrayOfByte;
      this.g = paramString;
      this.a = paramObject;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\c\t\m\g\da.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */