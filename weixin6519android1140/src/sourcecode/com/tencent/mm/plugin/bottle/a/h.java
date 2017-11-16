package com.tencent.mm.plugin.bottle.a;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.plugin.bottle.a;
import com.tencent.mm.pluginsdk.l;
import com.tencent.mm.protocal.c.att;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.at;
import java.util.Map;
import junit.framework.Assert;

public final class h
{
  public static abstract interface a
  {
    public abstract void bK(int paramInt1, int paramInt2);
  }
  
  public static final class b
    implements com.tencent.mm.ad.e
  {
    public String iconUrl;
    public int joR;
    public String joW;
    private h.a jpb;
    public String jpc;
    public final f jpd;
    
    public b()
    {
      GMTrace.i(7596320751616L, 56597);
      this.jpb = null;
      this.joR = 55535;
      this.jpc = "";
      this.iconUrl = "";
      this.jpd = new f();
      GMTrace.o(7596320751616L, 56597);
    }
    
    public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
    {
      GMTrace.i(7596589187072L, 56599);
      w.d("MicroMsg.PickBottle", "type:" + paramk.getType() + " errType:" + paramInt1 + " errCode:" + paramInt2);
      if (paramk.getType() == 155)
      {
        paramk = (f)paramk;
        if (!paramk.joZ)
        {
          if (this.jpb != null) {
            this.jpb.bK(paramInt1, paramInt2);
          }
          this.jpb = null;
          at.wS().b(155, this);
          at.wS().b(156, this);
          GMTrace.o(7596589187072L, 56599);
          return;
        }
        at.wS().b(155, this);
        a.hnI.pr();
        if (paramk.ahw().uHz == null)
        {
          paramString = "";
          this.joW = paramString;
          this.joR = paramk.ahw().lQc;
          if (paramk.ahw().urj != null) {
            break label299;
          }
          paramString = "";
          label192:
          paramString = bh.q(paramString, "branduser");
          if (paramString == null) {
            break label325;
          }
          this.jpc = ((String)paramString.get(".branduser.$username"));
          this.iconUrl = ((String)paramString.get(".branduser.$iconurl"));
          if (this.jpc == null) {
            break label325;
          }
          this.joR = 19990;
          if (this.jpb != null)
          {
            if ((paramInt1 == 0) && (paramInt2 == 0)) {
              break label311;
            }
            this.jpb.bK(paramInt1, paramInt2);
          }
        }
        for (;;)
        {
          this.jpb = null;
          GMTrace.o(7596589187072L, 56599);
          return;
          paramString = paramk.ahw().uHz;
          break;
          label299:
          paramString = paramk.ahw().urj;
          break label192;
          label311:
          this.jpb.bK(paramInt1, paramInt2);
        }
        label325:
        paramString = new e(this.joW, this.joR);
        at.wS().a(paramString, 0);
        GMTrace.o(7596589187072L, 56599);
        return;
      }
      if (paramk.getType() == 156)
      {
        at.wS().b(156, this);
        if (this.jpb != null)
        {
          if ((paramInt1 == 0) && (paramInt2 == 0)) {
            break label420;
          }
          this.jpb.bK(paramInt1, paramInt2);
        }
        for (;;)
        {
          this.jpb = null;
          GMTrace.o(7596589187072L, 56599);
          return;
          label420:
          this.jpb.bK(paramInt1, paramInt2);
        }
      }
      GMTrace.o(7596589187072L, 56599);
    }
    
    public final boolean a(h.a parama)
    {
      GMTrace.i(7596454969344L, 56598);
      w.d("MicroMsg.PickBottle", "bottle pick:" + c.ahs() + " throw:" + c.ahr());
      if (this.jpb == null) {}
      for (boolean bool = true;; bool = false)
      {
        Assert.assertTrue("renew this class", bool);
        Assert.assertTrue("must call back onFin", true);
        if (c.ahs() > 0) {
          break;
        }
        parama.bK(1, 16);
        GMTrace.o(7596454969344L, 56598);
        return false;
      }
      at.wS().a(155, this);
      at.wS().a(156, this);
      this.jpb = parama;
      bool = at.wS().a(this.jpd, 0);
      GMTrace.o(7596454969344L, 56598);
      return bool;
    }
  }
  
  public static final class c
    implements com.tencent.mm.ad.e
  {
    private h.a jpb;
    private int jpe;
    
    public c(String paramString, h.a parama)
    {
      GMTrace.i(7594710138880L, 56585);
      this.jpb = null;
      this.jpe = 0;
      if (!bg.nm(paramString))
      {
        bool = true;
        Assert.assertTrue("emtpy input text", bool);
        if (parama == null) {
          break label102;
        }
      }
      label102:
      for (boolean bool = true;; bool = false)
      {
        Assert.assertTrue("must call back onFin", bool);
        if (c.ahr() <= 0) {
          break label107;
        }
        at.wS().a(154, this);
        this.jpb = parama;
        paramString = new g(paramString);
        at.wS().a(paramString, 0);
        GMTrace.o(7594710138880L, 56585);
        return;
        bool = false;
        break;
      }
      label107:
      if (parama != null) {
        parama.bK(1, 16);
      }
      GMTrace.o(7594710138880L, 56585);
    }
    
    public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
    {
      GMTrace.i(7594844356608L, 56586);
      if (paramk.getType() != 154)
      {
        GMTrace.o(7594844356608L, 56586);
        return;
      }
      if (this.jpb != null)
      {
        this.jpe = ((g)paramk).ahx();
        this.jpb.bK(paramInt1, paramInt2);
      }
      this.jpb = null;
      at.wS().b(154, this);
      GMTrace.o(7594844356608L, 56586);
    }
  }
  
  public static final class d
    extends com.tencent.mm.e.b.h
    implements com.tencent.mm.ad.e
  {
    public h.a jpb;
    private int jpe;
    
    public d(Context paramContext, h.a parama)
    {
      super(false);
      GMTrace.i(7594307485696L, 56582);
      this.jpb = null;
      this.jpe = 0;
      if (parama != null) {
        bool = true;
      }
      Assert.assertTrue("must call back onFin", bool);
      at.wS().a(154, this);
      this.jpb = parama;
      GMTrace.o(7594307485696L, 56582);
    }
    
    public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
    {
      GMTrace.i(7594575921152L, 56584);
      if (paramk.getType() != 154)
      {
        GMTrace.o(7594575921152L, 56584);
        return;
      }
      if (this.jpb != null)
      {
        this.jpe = ((g)paramk).ahx();
        this.jpb.bK(paramInt1, paramInt2);
      }
      this.jpb = null;
      at.wS().b(154, this);
      GMTrace.o(7594575921152L, 56584);
    }
    
    public final boolean qt()
    {
      GMTrace.i(7594441703424L, 56583);
      Object localObject = super.getFileName();
      boolean bool = super.qt();
      super.reset();
      if (!bool)
      {
        at.wS().b(154, this);
        this.jpb = null;
        GMTrace.o(7594441703424L, 56583);
        return false;
      }
      if (c.ahr() > 0)
      {
        localObject = new g((String)localObject, this.eyI);
        at.wS().a((k)localObject, 0);
        GMTrace.o(7594441703424L, 56583);
        return true;
      }
      at.wS().b(154, this);
      if (this.jpb != null) {
        this.jpb.bK(1, 16);
      }
      GMTrace.o(7594441703424L, 56583);
      return false;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\bottle\a\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */