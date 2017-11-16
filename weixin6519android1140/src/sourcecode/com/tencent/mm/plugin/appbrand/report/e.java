package com.tencent.mm.plugin.appbrand.report;

import android.os.Looper;
import android.os.Message;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.d.d;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class e
  extends d
{
  public long iyn;
  public long iyo;
  private final c iyp;
  public final b iyq;
  public final a iyr;
  public boolean pg;
  
  public e(String paramString)
  {
    super("MicroMsg.StayingRecorder[" + paramString + "]", Looper.getMainLooper());
    GMTrace.i(18353737433088L, 136746);
    this.iyp = new c();
    this.iyq = new b();
    this.iyr = new a();
    this.pg = false;
    b(this.iyq);
    b(this.iyr);
    b(this.iyp);
    c(this.iyp);
    start();
    GMTrace.o(18353737433088L, 136746);
  }
  
  private void ib(int paramInt)
  {
    GMTrace.i(18354140086272L, 136749);
    if (bRe() == null)
    {
      An(paramInt);
      GMTrace.o(18354140086272L, 136749);
      return;
    }
    Ao(paramInt);
    GMTrace.o(18354140086272L, 136749);
  }
  
  public final void aab()
  {
    GMTrace.i(18353871650816L, 136747);
    w.d(this.mName, "toForeground");
    ib(2);
    GMTrace.o(18353871650816L, 136747);
  }
  
  public final void aac()
  {
    GMTrace.i(18354005868544L, 136748);
    w.d(this.mName, "toBackground");
    ib(1);
    GMTrace.o(18354005868544L, 136748);
  }
  
  public final void start()
  {
    GMTrace.i(18354274304000L, 136750);
    if (this.pg)
    {
      GMTrace.o(18354274304000L, 136750);
      return;
    }
    super.start();
    GMTrace.o(18354274304000L, 136750);
  }
  
  private final class a
    extends c
  {
    private long iys;
    
    public a()
    {
      GMTrace.i(18351992602624L, 136733);
      GMTrace.o(18351992602624L, 136733);
    }
    
    public final void enter()
    {
      GMTrace.i(18352395255808L, 136736);
      super.enter();
      this.iys = bg.Pv();
      GMTrace.o(18352395255808L, 136736);
    }
    
    public final void exit()
    {
      GMTrace.i(18352529473536L, 136737);
      super.exit();
      e.this.iyn = (bg.Pv() - this.iys);
      GMTrace.o(18352529473536L, 136737);
    }
    
    public final boolean f(Message paramMessage)
    {
      GMTrace.i(18352261038080L, 136735);
      if (2 == paramMessage.what)
      {
        e.this.b(e.this.iyq);
        GMTrace.o(18352261038080L, 136735);
        return true;
      }
      boolean bool = super.f(paramMessage);
      GMTrace.o(18352261038080L, 136735);
      return bool;
    }
    
    public final String getName()
    {
      GMTrace.i(18352126820352L, 136734);
      String str = e.this.mName + "|Background";
      GMTrace.o(18352126820352L, 136734);
      return str;
    }
  }
  
  private final class b
    extends c
  {
    private long iyu;
    
    public b()
    {
      GMTrace.i(18354408521728L, 136751);
      GMTrace.o(18354408521728L, 136751);
    }
    
    public final void enter()
    {
      GMTrace.i(18354811174912L, 136754);
      super.enter();
      this.iyu = bg.Pv();
      GMTrace.o(18354811174912L, 136754);
    }
    
    public final void exit()
    {
      GMTrace.i(18354945392640L, 136755);
      super.exit();
      e.this.iyo = (bg.Pv() - this.iyu);
      GMTrace.o(18354945392640L, 136755);
    }
    
    public final boolean f(Message paramMessage)
    {
      GMTrace.i(18354676957184L, 136753);
      if (1 == paramMessage.what)
      {
        e.this.b(e.this.iyr);
        GMTrace.o(18354676957184L, 136753);
        return true;
      }
      boolean bool = super.f(paramMessage);
      GMTrace.o(18354676957184L, 136753);
      return bool;
    }
    
    public final String getName()
    {
      GMTrace.i(18354542739456L, 136752);
      String str = e.this.mName + "|Foreground";
      GMTrace.o(18354542739456L, 136752);
      return str;
    }
  }
  
  private final class c
    extends c
  {
    public c()
    {
      GMTrace.i(18352932126720L, 136740);
      GMTrace.o(18352932126720L, 136740);
    }
    
    public final boolean f(Message paramMessage)
    {
      GMTrace.i(18353200562176L, 136742);
      if (2 == paramMessage.what)
      {
        e.this.b(e.this.iyq);
        GMTrace.o(18353200562176L, 136742);
        return true;
      }
      if (1 == paramMessage.what)
      {
        e.this.b(e.this.iyr);
        GMTrace.o(18353200562176L, 136742);
        return true;
      }
      boolean bool = super.f(paramMessage);
      GMTrace.o(18353200562176L, 136742);
      return bool;
    }
    
    public final String getName()
    {
      GMTrace.i(18353066344448L, 136741);
      String str = e.this.mName + "|Init";
      GMTrace.o(18353066344448L, 136741);
      return str;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\report\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */