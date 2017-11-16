package com.tencent.mm.plugin.shake.b;

import android.os.Message;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.shake.c.a.e;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.ae.a;
import java.util.List;

public final class l
{
  protected static long oMt;
  protected static int oMu;
  public int oMv;
  public b oMw;
  
  static
  {
    GMTrace.i(6516002258944L, 48548);
    oMt = 16000L;
    oMu = 54158;
    GMTrace.o(6516002258944L, 48548);
  }
  
  public l()
  {
    GMTrace.i(6515868041216L, 48547);
    GMTrace.o(6515868041216L, 48547);
  }
  
  public static abstract interface a
  {
    public abstract void a(int paramInt, e parame, long paramLong);
    
    public abstract void d(List<d> paramList, long paramLong);
  }
  
  public static abstract class b
  {
    private ae oMA;
    public l.a oMx;
    protected boolean oMy;
    protected long oMz;
    
    public b(l.a parama)
    {
      GMTrace.i(6506070147072L, 48474);
      this.oMy = false;
      this.oMz = l.oMt;
      this.oMA = new ae(new ae.a()
      {
        public final boolean handleMessage(Message paramAnonymousMessage)
        {
          GMTrace.i(6516539129856L, 48552);
          if ((paramAnonymousMessage.what == l.oMu) && (!l.b.this.oMy) && (l.b.this.oMx != null)) {
            l.b.this.oMx.d(null, 5L);
          }
          GMTrace.o(6516539129856L, 48552);
          return false;
        }
      });
      this.oMx = parama;
      GMTrace.o(6506070147072L, 48474);
    }
    
    public void beX()
    {
      GMTrace.i(6506875453440L, 48480);
      reset();
      this.oMx = null;
      GMTrace.o(6506875453440L, 48480);
    }
    
    public abstract void init();
    
    public abstract void pause();
    
    public abstract void reset();
    
    public abstract void resume();
    
    public abstract void start();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\shake\b\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */