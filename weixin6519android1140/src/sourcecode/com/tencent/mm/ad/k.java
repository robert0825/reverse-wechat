package com.tencent.mm.ad;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.w;
import junit.framework.Assert;

public abstract class k
{
  public int aCN;
  public com.tencent.mm.network.e gtW;
  public long gtX;
  public int gtY;
  public boolean gtZ;
  private q gua;
  e gub;
  public boolean guc;
  public com.tencent.mm.network.q gud;
  int priority;
  
  public k()
  {
    GMTrace.i(13417746268160L, 99970);
    this.priority = 0;
    this.gtX = com.tencent.mm.sdk.platformtools.bg.Pw();
    this.gtY = -1;
    this.aCN = -99;
    this.gtZ = false;
    GMTrace.o(13417746268160L, 99970);
  }
  
  public boolean DE()
  {
    GMTrace.i(13418148921344L, 99973);
    GMTrace.o(13418148921344L, 99973);
    return false;
  }
  
  public boolean DF()
  {
    GMTrace.i(13418417356800L, 99975);
    if (this.aCN <= 0)
    {
      GMTrace.o(13418417356800L, 99975);
      return true;
    }
    GMTrace.o(13418417356800L, 99975);
    return false;
  }
  
  public boolean DG()
  {
    GMTrace.i(13418551574528L, 99976);
    GMTrace.o(13418551574528L, 99976);
    return false;
  }
  
  public boolean DH()
  {
    GMTrace.i(13419088445440L, 99980);
    if (vB() == 1)
    {
      GMTrace.o(13419088445440L, 99980);
      return true;
    }
    GMTrace.o(13419088445440L, 99980);
    return false;
  }
  
  public final int DI()
  {
    GMTrace.i(13419491098624L, 99983);
    if (this.gud == null)
    {
      GMTrace.o(13419491098624L, 99983);
      return 0;
    }
    int i = this.gud.hashCode();
    GMTrace.o(13419491098624L, 99983);
    return i;
  }
  
  public abstract int a(com.tencent.mm.network.e parame, e parame1);
  
  public int a(com.tencent.mm.network.e parame, final com.tencent.mm.network.q paramq, final com.tencent.mm.network.k paramk)
  {
    GMTrace.i(13419222663168L, 99981);
    c(parame);
    this.gud = paramq;
    paramk = com.tencent.mm.y.bg.a(paramk);
    if (this.aCN == -99)
    {
      this.aCN = vB();
      w.i("MicroMsg.NetSceneBase", "initilized security limit count to " + this.aCN);
    }
    if (vB() > 1) {
      switch (2.guh[(a(paramq) - 1)])
      {
      default: 
        Assert.assertTrue("invalid security verification status", false);
      }
    }
    while (DF())
    {
      w.e("MicroMsg.NetSceneBase", "dispatch failed, scene limited for security, current limit=" + vB());
      a(a.guj);
      this.gtY = -1;
      i = this.gtY;
      GMTrace.o(13419222663168L, 99981);
      return i;
      Assert.assertTrue("scene security verification not passed, type=" + paramq.getType() + ", uri=" + paramq.getUri() + ", CHECK NOW", false);
      continue;
      w.e("MicroMsg.NetSceneBase", "scene security verification not passed, type=" + paramq.getType() + ", uri=" + paramq.getUri());
      this.aCN -= 1;
      a(a.gui);
      this.gtY = -1;
      i = this.gtY;
      GMTrace.o(13419222663168L, 99981);
      return i;
    }
    this.aCN -= 1;
    s locals = new s(paramq);
    if ((this.gua != null) && (!DG())) {
      this.gua.cancel();
    }
    this.gua = new q(paramq, paramk, this, this.gub, parame);
    this.gtY = parame.a(locals, this.gua);
    w.i("MicroMsg.NetSceneBase", "dispatcher send, %s", new Object[] { Integer.valueOf(this.gtY) });
    if (this.gtY < 0)
    {
      w.i("MicroMsg.NetSceneBase", "dispatcher send, %s, ThreadID:%s, getType:%s", new Object[] { Integer.valueOf(this.gtY), Long.valueOf(Thread.currentThread().getId()), Integer.valueOf(paramq.getType()) });
      new ae().post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(13420564840448L, 99991);
          w.i("MicroMsg.NetSceneBase", "dispatcher send, %s, ThreadID:%s, getType:%s", new Object[] { Integer.valueOf(k.this.gtY), Long.valueOf(Thread.currentThread().getId()), Integer.valueOf(paramq.getType()) });
          paramk.a(-1, 3, -1, "send to network failed", paramq, null);
          w.i("MicroMsg.NetSceneBase", "dispatcher send, %s, ThreadID:%s, getType:%s", new Object[] { Integer.valueOf(k.this.gtY), Long.valueOf(Thread.currentThread().getId()), Integer.valueOf(paramq.getType()) });
          GMTrace.o(13420564840448L, 99991);
        }
      });
      GMTrace.o(13419222663168L, 99981);
      return 99999999;
    }
    parame = this.gua;
    parame.handler.postDelayed(parame.guP, 330000L);
    int i = this.gtY;
    GMTrace.o(13419222663168L, 99981);
    return i;
  }
  
  public int a(com.tencent.mm.network.q paramq)
  {
    GMTrace.i(13418014703616L, 99972);
    int i = b.gul;
    GMTrace.o(13418014703616L, 99972);
    return i;
  }
  
  public void a(a parama)
  {
    GMTrace.i(13417880485888L, 99971);
    GMTrace.o(13417880485888L, 99971);
  }
  
  public boolean a(k paramk)
  {
    GMTrace.i(13419759534080L, 99985);
    GMTrace.o(13419759534080L, 99985);
    return false;
  }
  
  public boolean b(k paramk)
  {
    GMTrace.i(13419893751808L, 99986);
    GMTrace.o(13419893751808L, 99986);
    return false;
  }
  
  public final void c(com.tencent.mm.network.e parame)
  {
    GMTrace.i(13418954227712L, 99979);
    this.gtX = com.tencent.mm.sdk.platformtools.bg.Pw();
    this.gtW = parame;
    GMTrace.o(13418954227712L, 99979);
  }
  
  public void cancel()
  {
    GMTrace.i(13419625316352L, 99984);
    w.i("MicroMsg.NetSceneBase", "cancel: %d, hash:%d, type:%d", new Object[] { Integer.valueOf(this.gtY), Integer.valueOf(hashCode()), Integer.valueOf(getType()) });
    this.gtZ = true;
    if (this.gua != null) {
      this.gua.cancel();
    }
    if ((this.gtY != -1) && (this.gtW != null))
    {
      int i = this.gtY;
      this.gtY = -1;
      this.gtW.cancel(i);
    }
    GMTrace.o(13419625316352L, 99984);
  }
  
  public String getInfo()
  {
    GMTrace.i(13420027969536L, 99987);
    GMTrace.o(13420027969536L, 99987);
    return "";
  }
  
  public abstract int getType();
  
  public int vB()
  {
    GMTrace.i(13418283139072L, 99974);
    GMTrace.o(13418283139072L, 99974);
    return 1;
  }
  
  protected static enum a
  {
    static
    {
      GMTrace.i(13390365851648L, 99766);
      gui = new a("EStatusCheckFailed", 0);
      guj = new a("EReachMaxLimit", 1);
      guk = new a[] { gui, guj };
      GMTrace.o(13390365851648L, 99766);
    }
    
    private a()
    {
      GMTrace.i(13390231633920L, 99765);
      GMTrace.o(13390231633920L, 99765);
    }
  }
  
  protected static enum b
  {
    static
    {
      GMTrace.i(13425665114112L, 100029);
      gul = 1;
      gum = 2;
      gun = 3;
      guo = new int[] { gul, gum, gun };
      GMTrace.o(13425665114112L, 100029);
    }
    
    public static int[] DJ()
    {
      GMTrace.i(13425530896384L, 100028);
      int[] arrayOfInt = (int[])guo.clone();
      GMTrace.o(13425530896384L, 100028);
      return arrayOfInt;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ad\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */