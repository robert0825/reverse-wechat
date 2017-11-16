package com.tencent.mm.app.plugin.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.e.b.h;
import com.tencent.mm.g.a.eq;
import com.tencent.mm.g.a.eu;
import com.tencent.mm.g.a.ex;
import com.tencent.mm.g.a.ez;
import com.tencent.mm.g.a.fa;
import com.tencent.mm.g.a.fb;
import com.tencent.mm.g.a.fc;
import com.tencent.mm.g.a.fg;
import com.tencent.mm.g.a.fh;
import com.tencent.mm.modelvoice.k;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.w;

public final class a
{
  public static final class a
    extends com.tencent.mm.sdk.b.c<eq>
  {
    a.i euI;
    a.e euJ;
    a.f euK;
    a.d euL;
    a.h euM;
    a.g euN;
    a.c euO;
    a.b euP;
    
    public a()
    {
      GMTrace.i(13013482471424L, 96958);
      this.vhf = eq.class.getName().hashCode();
      GMTrace.o(13013482471424L, 96958);
    }
  }
  
  public static final class b
    extends com.tencent.mm.sdk.b.c<eu>
  {
    public b()
    {
      GMTrace.i(13013750906880L, 96960);
      this.vhf = eu.class.getName().hashCode();
      GMTrace.o(13013750906880L, 96960);
    }
  }
  
  public static final class c
    extends com.tencent.mm.sdk.b.c<ex>
  {
    public c()
    {
      GMTrace.i(13014019342336L, 96962);
      this.vhf = ex.class.getName().hashCode();
      GMTrace.o(13014019342336L, 96962);
    }
  }
  
  public static final class d
    extends com.tencent.mm.sdk.b.c<ez>
  {
    com.tencent.mm.e.a.a euQ;
    String euR;
    
    public d()
    {
      GMTrace.i(13011737640960L, 96945);
      this.vhf = ez.class.getName().hashCode();
      GMTrace.o(13011737640960L, 96945);
    }
  }
  
  public static final class e
    extends com.tencent.mm.sdk.b.c<fa>
  {
    String euR;
    h euS;
    
    public e()
    {
      GMTrace.i(13012945600512L, 96954);
      this.euR = "";
      this.vhf = fa.class.getName().hashCode();
      GMTrace.o(13012945600512L, 96954);
    }
  }
  
  public static final class f
    extends com.tencent.mm.sdk.b.c<fc>
  {
    String euR;
    k euT;
    aj euU;
    boolean euV;
    boolean euW;
    boolean euX;
    fc euY;
    Runnable euZ;
    
    public f()
    {
      GMTrace.i(13012274511872L, 96949);
      this.euR = "";
      this.vhf = fc.class.getName().hashCode();
      GMTrace.o(13012274511872L, 96949);
    }
    
    public final void pL()
    {
      GMTrace.i(13012408729600L, 96950);
      if (this.euT != null)
      {
        this.euW = this.euT.qn();
        if (this.euZ != null)
        {
          if (this.euY != null)
          {
            this.euY.eHh.eHi = this.euT.exi.exW;
            this.euY = null;
          }
          if (this.euX) {
            this.euZ.run();
          }
          this.euZ = null;
        }
        this.euV = true;
      }
      GMTrace.o(13012408729600L, 96950);
    }
  }
  
  public static final class g
    extends com.tencent.mm.sdk.b.c<fg>
  {
    public g()
    {
      GMTrace.i(13013214035968L, 96956);
      this.vhf = fg.class.getName().hashCode();
      GMTrace.o(13013214035968L, 96956);
    }
  }
  
  public static final class h
    extends com.tencent.mm.sdk.b.c<fh>
  {
    public h()
    {
      GMTrace.i(13014287777792L, 96964);
      this.vhf = fh.class.getName().hashCode();
      GMTrace.o(13014287777792L, 96964);
    }
  }
  
  public static final class i
    extends com.tencent.mm.sdk.b.c<fb>
  {
    public i()
    {
      GMTrace.i(13012677165056L, 96952);
      this.vhf = fb.class.getName().hashCode();
      GMTrace.o(13012677165056L, 96952);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\app\plugin\b\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */