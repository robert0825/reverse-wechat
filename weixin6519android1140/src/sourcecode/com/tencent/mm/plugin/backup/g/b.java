package com.tencent.mm.plugin.backup.g;

import android.os.Looper;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.pluginsdk.model.app.an;
import com.tencent.mm.pluginsdk.model.app.h;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.ak.a;
import com.tencent.mm.y.ak.b;
import java.util.Iterator;
import java.util.LinkedList;

public final class b
{
  ae handler;
  public LinkedList<a> jcr;
  
  public b()
  {
    GMTrace.i(14856023441408L, 110686);
    this.jcr = new LinkedList();
    this.handler = new ae(Looper.getMainLooper());
    GMTrace.o(14856023441408L, 110686);
  }
  
  public final boolean c(final int paramInt, final Object paramObject)
  {
    GMTrace.i(14856157659136L, 110687);
    this.handler.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(14852399562752L, 110659);
        b.this.jcr.add(new b.a(b.this, paramInt, paramObject));
        GMTrace.o(14852399562752L, 110659);
      }
    });
    GMTrace.o(14856157659136L, 110687);
    return true;
  }
  
  public final class a
  {
    public Object obj;
    public int type;
    
    public a(int paramInt, Object paramObject)
    {
      GMTrace.i(14851594256384L, 110653);
      this.type = paramInt;
      this.obj = paramObject;
      GMTrace.o(14851594256384L, 110653);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\backup\g\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */