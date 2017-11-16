package com.tencent.mm.plugin.talkroom.model;

import android.os.Looper;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.pluginsdk.p.o;
import com.tencent.mm.sdk.platformtools.ae;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class i
{
  public List<p.o> fIz;
  ae handler;
  
  public i()
  {
    GMTrace.i(5150068441088L, 38371);
    this.fIz = new LinkedList();
    this.handler = new ae(Looper.getMainLooper());
    GMTrace.o(5150068441088L, 38371);
  }
  
  public final void Bt(final String paramString)
  {
    GMTrace.i(5150605312000L, 38375);
    paramString = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(5146041909248L, 38341);
        synchronized (i.this.fIz)
        {
          Iterator localIterator = i.this.fIz.iterator();
          if (localIterator.hasNext()) {
            ((p.o)localIterator.next()).Bt(paramString);
          }
        }
        GMTrace.o(5146041909248L, 38341);
      }
    };
    if (Looper.myLooper() == Looper.getMainLooper())
    {
      paramString.run();
      GMTrace.o(5150605312000L, 38375);
      return;
    }
    this.handler.post(paramString);
    GMTrace.o(5150605312000L, 38375);
  }
  
  public final void H(final String paramString, final int paramInt1, final int paramInt2)
  {
    GMTrace.i(5150336876544L, 38373);
    paramString = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(5156779327488L, 38421);
        synchronized (i.this.fIz)
        {
          Iterator localIterator = i.this.fIz.iterator();
          if (localIterator.hasNext()) {
            ((p.o)localIterator.next()).H(paramString, paramInt1, paramInt2);
          }
        }
        GMTrace.o(5156779327488L, 38421);
      }
    };
    if (Looper.myLooper() == Looper.getMainLooper())
    {
      paramString.run();
      GMTrace.o(5150336876544L, 38373);
      return;
    }
    this.handler.post(paramString);
    GMTrace.o(5150336876544L, 38373);
  }
  
  public final void aKX()
  {
    GMTrace.i(5150202658816L, 38372);
    Runnable local1 = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(5149128916992L, 38364);
        synchronized (i.this.fIz)
        {
          Iterator localIterator = i.this.fIz.iterator();
          if (localIterator.hasNext()) {
            ((p.o)localIterator.next()).aKX();
          }
        }
        GMTrace.o(5149128916992L, 38364);
      }
    };
    if (Looper.myLooper() == Looper.getMainLooper())
    {
      local1.run();
      GMTrace.o(5150202658816L, 38372);
      return;
    }
    this.handler.post(local1);
    GMTrace.o(5150202658816L, 38372);
  }
  
  public final void l(final int paramInt1, final int paramInt2, final String paramString)
  {
    GMTrace.i(5150739529728L, 38376);
    paramString = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(5157316198400L, 38425);
        synchronized (i.this.fIz)
        {
          Iterator localIterator = i.this.fIz.iterator();
          if (localIterator.hasNext()) {
            ((p.o)localIterator.next()).l(paramInt1, paramInt2, paramString);
          }
        }
        GMTrace.o(5157316198400L, 38425);
      }
    };
    if (Looper.myLooper() == Looper.getMainLooper())
    {
      paramString.run();
      GMTrace.o(5150739529728L, 38376);
      return;
    }
    this.handler.post(paramString);
    GMTrace.o(5150739529728L, 38376);
  }
  
  public final void pJ(final int paramInt)
  {
    GMTrace.i(5150471094272L, 38374);
    Runnable local7 = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(5152752795648L, 38391);
        synchronized (i.this.fIz)
        {
          Iterator localIterator = i.this.fIz.iterator();
          if (localIterator.hasNext()) {
            ((p.o)localIterator.next()).pJ(paramInt);
          }
        }
        GMTrace.o(5152752795648L, 38391);
      }
    };
    if (Looper.myLooper() == Looper.getMainLooper())
    {
      local7.run();
      GMTrace.o(5150471094272L, 38374);
      return;
    }
    this.handler.post(local7);
    GMTrace.o(5150471094272L, 38374);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\talkroom\model\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */