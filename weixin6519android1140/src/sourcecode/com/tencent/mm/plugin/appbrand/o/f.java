package com.tencent.mm.plugin.appbrand.o;

import android.os.Looper;
import android.os.Message;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.report.c;
import com.tencent.mm.sdk.d.d;
import java.util.LinkedList;
import java.util.Queue;

public abstract class f<Task>
  extends d
{
  public final f<Task>.b iGw;
  private final f<Task>.a iGx;
  public final String iGy;
  public final Queue<Task> iGz;
  
  public f(String paramString, Looper paramLooper)
  {
    super(paramString, paramLooper);
    GMTrace.i(18185159966720L, 135490);
    this.iGw = new b();
    this.iGx = new a();
    this.iGz = new LinkedList();
    this.iGy = paramString;
    b(this.iGw);
    b(this.iGx);
    c(this.iGw);
    start();
    GMTrace.o(18185159966720L, 135490);
  }
  
  public abstract boolean Wf();
  
  public abstract void aN(Task paramTask);
  
  protected final void abB()
  {
    GMTrace.i(18185562619904L, 135493);
    super.abB();
    synchronized (this.iGz)
    {
      this.iGz.clear();
      GMTrace.o(18185562619904L, 135493);
      return;
    }
  }
  
  public final void abC()
  {
    GMTrace.i(18185696837632L, 135494);
    synchronized (this.iGz)
    {
      Object localObject1 = this.iGz.poll();
      if (localObject1 != null)
      {
        b(this.iGx);
        aN(localObject1);
      }
      GMTrace.o(18185696837632L, 135494);
      return;
    }
  }
  
  private final class a
    extends c
  {
    public a()
    {
      GMTrace.i(18184757313536L, 135487);
      GMTrace.o(18184757313536L, 135487);
    }
    
    public final boolean f(Message paramMessage)
    {
      GMTrace.i(18184891531264L, 135488);
      if (2 == paramMessage.what)
      {
        f.this.b(f.this.iGw);
        GMTrace.o(18184891531264L, 135488);
        return true;
      }
      boolean bool = super.f(paramMessage);
      GMTrace.o(18184891531264L, 135488);
      return bool;
    }
    
    public final String getName()
    {
      GMTrace.i(18185025748992L, 135489);
      String str = f.this.iGy + "|StateExecuting";
      GMTrace.o(18185025748992L, 135489);
      return str;
    }
  }
  
  private final class b
    extends c
  {
    public b()
    {
      GMTrace.i(18183683571712L, 135479);
      GMTrace.o(18183683571712L, 135479);
    }
    
    public final void enter()
    {
      GMTrace.i(18183817789440L, 135480);
      super.enter();
      f.this.abC();
      GMTrace.o(18183817789440L, 135480);
    }
    
    public final boolean f(Message paramMessage)
    {
      GMTrace.i(18183952007168L, 135481);
      if ((1 == paramMessage.what) || (2 == paramMessage.what))
      {
        f.this.abC();
        GMTrace.o(18183952007168L, 135481);
        return true;
      }
      boolean bool = super.f(paramMessage);
      GMTrace.o(18183952007168L, 135481);
      return bool;
    }
    
    public final String getName()
    {
      GMTrace.i(18184086224896L, 135482);
      String str = f.this.iGy + "|StateIdle";
      GMTrace.o(18184086224896L, 135482);
      return str;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\o\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */