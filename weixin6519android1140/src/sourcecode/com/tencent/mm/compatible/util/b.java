package com.tencent.mm.compatible.util;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.a.a;
import com.tencent.mm.compatible.a.a.a;

public final class b
{
  public b fRP;
  private final String fRQ;
  public Context mContext;
  
  public b(Context paramContext)
  {
    GMTrace.i(13788052979712L, 102729);
    this.mContext = null;
    this.fRP = null;
    this.fRQ = "audio_lock";
    this.mContext = paramContext;
    a.a(8, new a.a()
    {
      public final void run()
      {
        GMTrace.i(13787247673344L, 102723);
        b.this.fRP = new c(b.this.mContext);
        GMTrace.o(13787247673344L, 102723);
      }
    });
    GMTrace.o(13788052979712L, 102729);
  }
  
  public final void a(a parama)
  {
    GMTrace.i(17561450184704L, 130843);
    if (this.fRP != null) {
      this.fRP.a(parama);
    }
    GMTrace.o(17561450184704L, 130843);
  }
  
  public final boolean requestFocus()
  {
    GMTrace.i(13788187197440L, 102730);
    try
    {
      if (this.fRP == null)
      {
        GMTrace.o(13788187197440L, 102730);
        return false;
      }
      boolean bool = this.fRP.requestFocus();
      GMTrace.o(13788187197440L, 102730);
      return bool;
    }
    finally {}
  }
  
  public final boolean tx()
  {
    GMTrace.i(13788321415168L, 102731);
    try
    {
      if (this.fRP == null)
      {
        GMTrace.o(13788321415168L, 102731);
        return false;
      }
      boolean bool = this.fRP.tx();
      GMTrace.o(13788321415168L, 102731);
      return bool;
    }
    finally {}
  }
  
  public static abstract interface a
  {
    public abstract void dd(int paramInt);
  }
  
  public static abstract interface b
  {
    public abstract void a(b.a parama);
    
    public abstract boolean requestFocus();
    
    public abstract boolean tx();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\compatible\util\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */