package com.tencent.mm.plugin.appbrand.b;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfig;
import com.tencent.mm.plugin.appbrand.e;
import com.tencent.mm.plugin.appbrand.j;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bb;
import com.tencent.mm.sdk.platformtools.w;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public abstract class c
  extends h
{
  public final String TAG;
  public final ae hKT;
  public final d hKU;
  public final a hKV;
  public final e hKW;
  public final c hKX;
  public final b hKY;
  public final AtomicBoolean hKZ;
  private final AtomicBoolean hLa;
  private final AtomicReference<com.tencent.mm.sdk.d.c> hLb;
  private final AtomicReference<com.tencent.mm.sdk.d.c> hLc;
  public final e hzM;
  
  c(e parame)
  {
    super("MicroMsg.AppBrand.AppRunningStateMachine[" + parame.hyD + "]", Looper.getMainLooper());
    GMTrace.i(18872488951808L, 140611);
    this.hKT = new ae(Looper.getMainLooper());
    this.hKZ = new AtomicBoolean(false);
    this.hLa = new AtomicBoolean(false);
    this.hLb = new AtomicReference(null);
    this.hLc = new AtomicReference(null);
    this.TAG = this.mName;
    this.hzM = parame;
    Object localObject = new c(this);
    this.hKX = ((c)localObject);
    b((com.tencent.mm.sdk.d.c)localObject);
    localObject = new b(this);
    this.hKY = ((b)localObject);
    b((com.tencent.mm.sdk.d.c)localObject);
    parame = new a(this, parame);
    this.hKV = parame;
    b(parame);
    parame = new d(this);
    this.hKU = parame;
    b(parame);
    parame = new e();
    this.hKW = parame;
    b(parame);
    c(this.hKU);
    start();
    GMTrace.o(18872488951808L, 140611);
  }
  
  private a a(com.tencent.mm.sdk.d.a parama)
  {
    GMTrace.i(18873160040448L, 140616);
    if ((parama == this.hKV) || (parama == this.hKX) || (parama == this.hKY))
    {
      parama = a.hKK;
      GMTrace.o(18873160040448L, 140616);
      return parama;
    }
    if (parama == this.hKW)
    {
      parama = a.hKL;
      GMTrace.o(18873160040448L, 140616);
      return parama;
    }
    if (parama == this.hKU)
    {
      parama = a.hKJ;
      GMTrace.o(18873160040448L, 140616);
      return parama;
    }
    parama = a.hKJ;
    GMTrace.o(18873160040448L, 140616);
    return parama;
  }
  
  abstract void Tb();
  
  public final a Tc()
  {
    GMTrace.i(18872891604992L, 140614);
    if ((this.hLa.get()) && (!af.isMainThread()))
    {
      locala = (a)new bb() {}.b(this.hKT);
      GMTrace.o(18872891604992L, 140614);
      return locala;
    }
    a locala = Td();
    GMTrace.o(18872891604992L, 140614);
    return locala;
  }
  
  public final a Td()
  {
    GMTrace.i(18873025822720L, 140615);
    if (this.hKZ.get())
    {
      localObject = a.hKM;
      GMTrace.o(18873025822720L, 140615);
      return (a)localObject;
    }
    Object localObject = (com.tencent.mm.sdk.d.c)this.hLb.get();
    if (localObject != null)
    {
      localObject = a((com.tencent.mm.sdk.d.a)localObject);
      GMTrace.o(18873025822720L, 140615);
      return (a)localObject;
    }
    localObject = (com.tencent.mm.sdk.d.c)this.hLc.get();
    if (localObject != null)
    {
      localObject = a((com.tencent.mm.sdk.d.a)localObject);
      GMTrace.o(18873025822720L, 140615);
      return (a)localObject;
    }
    if (!af.isMainThread()) {}
    for (localObject = (com.tencent.mm.sdk.d.a)new bb() {}.b(this.hKT);; localObject = super.bRf())
    {
      localObject = a((com.tencent.mm.sdk.d.a)localObject);
      GMTrace.o(18873025822720L, 140615);
      return (a)localObject;
    }
  }
  
  final void a(g paramg)
  {
    GMTrace.i(18872757387264L, 140613);
    this.hLb.set(null);
    this.hLc.set(paramg);
    Message localMessage = bRe();
    if ((localMessage != null) && (localMessage.what == -2))
    {
      GMTrace.o(18872757387264L, 140613);
      return;
    }
    b(a(paramg));
    GMTrace.o(18872757387264L, 140613);
  }
  
  public final void a(com.tencent.mm.sdk.d.c paramc)
  {
    GMTrace.i(18873294258176L, 140617);
    this.hLa.set(false);
    this.hLb.set(paramc);
    this.hLc.set(null);
    super.b(paramc);
    GMTrace.o(18873294258176L, 140617);
  }
  
  public abstract void b(a parama);
  
  protected final boolean d(Message paramMessage)
  {
    GMTrace.i(18873562693632L, 140619);
    if (paramMessage.what != 1000)
    {
      GMTrace.o(18873562693632L, 140619);
      return true;
    }
    GMTrace.o(18873562693632L, 140619);
    return false;
  }
  
  protected final void e(Message paramMessage)
  {
    GMTrace.i(18873696911360L, 140620);
    super.e(paramMessage);
    this.hLa.set(false);
    GMTrace.o(18873696911360L, 140620);
  }
  
  public final void ib(int paramInt)
  {
    GMTrace.i(18873428475904L, 140618);
    this.hLa.set(true);
    if (bRe() == null)
    {
      super.An(paramInt);
      GMTrace.o(18873428475904L, 140618);
      return;
    }
    super.Ao(paramInt);
    GMTrace.o(18873428475904L, 140618);
  }
  
  public final void start()
  {
    GMTrace.i(18872623169536L, 140612);
    if (this.hKZ.get())
    {
      GMTrace.o(18872623169536L, 140612);
      return;
    }
    super.start();
    GMTrace.o(18872623169536L, 140612);
  }
  
  private final class a
    extends f
  {
    a(h paramh, e parame)
    {
      super(parame);
      GMTrace.i(18876783919104L, 140643);
      GMTrace.o(18876783919104L, 140643);
    }
    
    final void Te()
    {
      GMTrace.i(18877455007744L, 140648);
      if (c.this.bRf() == this)
      {
        c.this.a(c.this.hKX);
        c.this.ib(1000);
      }
      GMTrace.o(18877455007744L, 140648);
    }
    
    public final void enter()
    {
      GMTrace.i(18877186572288L, 140646);
      super.enter();
      GMTrace.o(18877186572288L, 140646);
    }
    
    public final void exit()
    {
      GMTrace.i(18877320790016L, 140647);
      super.exit();
      GMTrace.o(18877320790016L, 140647);
    }
    
    public final boolean f(Message paramMessage)
    {
      GMTrace.i(18877052354560L, 140645);
      switch (paramMessage.what)
      {
      default: 
        boolean bool = super.f(paramMessage);
        GMTrace.o(18877052354560L, 140645);
        return bool;
      case 3: 
        c.this.a(c.this.hKU);
        GMTrace.o(18877052354560L, 140645);
        return true;
      }
      id(16);
      GMTrace.o(18877052354560L, 140645);
      return true;
    }
    
    public final String getName()
    {
      GMTrace.i(18876918136832L, 140644);
      String str = c.this.mName + "|Background";
      GMTrace.o(18876918136832L, 140644);
      return str;
    }
  }
  
  private final class b
    extends g
  {
    b(h paramh)
    {
      super();
      GMTrace.i(18876381265920L, 140640);
      GMTrace.o(18876381265920L, 140640);
    }
    
    public final boolean f(Message paramMessage)
    {
      GMTrace.i(18876649701376L, 140642);
      switch (paramMessage.what)
      {
      default: 
        boolean bool = super.f(paramMessage);
        GMTrace.o(18876649701376L, 140642);
        return bool;
      }
      c.this.a(c.this.hKU);
      GMTrace.o(18876649701376L, 140642);
      return true;
    }
    
    public final String getName()
    {
      GMTrace.i(18876515483648L, 140641);
      String str = c.this.mName + "|BackgroundByScreenOff";
      GMTrace.o(18876515483648L, 140641);
      return str;
    }
  }
  
  private final class c
    extends g
  {
    c(h paramh)
    {
      super();
      GMTrace.i(18879736709120L, 140665);
      GMTrace.o(18879736709120L, 140665);
    }
    
    public final void enter()
    {
      GMTrace.i(18880139362304L, 140668);
      super.enter();
      c.this.vlJ.sendEmptyMessageDelayed(4, c.this.hzM.hyG.hRe * 1000L);
      GMTrace.o(18880139362304L, 140668);
    }
    
    public final void exit()
    {
      GMTrace.i(18880273580032L, 140669);
      super.exit();
      c.this.vlJ.removeMessages(4);
      GMTrace.o(18880273580032L, 140669);
    }
    
    public final boolean f(Message paramMessage)
    {
      GMTrace.i(18880005144576L, 140667);
      switch (paramMessage.what)
      {
      default: 
        boolean bool = super.f(paramMessage);
        GMTrace.o(18880005144576L, 140667);
        return bool;
      case 4: 
        c.this.a(c.this.hKW);
        GMTrace.o(18880005144576L, 140667);
        return true;
      case 10: 
        c.this.a(c.this.hKY);
        GMTrace.o(18880005144576L, 140667);
        return true;
      }
      c.this.a(c.this.hKU);
      GMTrace.o(18880005144576L, 140667);
      return true;
    }
    
    public final String getName()
    {
      GMTrace.i(18879870926848L, 140666);
      String str = c.this.mName + "|BackgroundTemporary";
      GMTrace.o(18879870926848L, 140666);
      return str;
    }
  }
  
  private final class d
    extends g
  {
    d(h paramh)
    {
      super();
      GMTrace.i(18873965346816L, 140622);
      GMTrace.o(18873965346816L, 140622);
    }
    
    public final void enter()
    {
      GMTrace.i(18874368000000L, 140625);
      super.enter();
      GMTrace.o(18874368000000L, 140625);
    }
    
    public final void exit()
    {
      GMTrace.i(18874502217728L, 140626);
      super.exit();
      GMTrace.o(18874502217728L, 140626);
    }
    
    public final boolean f(Message paramMessage)
    {
      GMTrace.i(18874233782272L, 140624);
      switch (paramMessage.what)
      {
      default: 
        boolean bool = super.f(paramMessage);
        GMTrace.o(18874233782272L, 140624);
        return bool;
      }
      c.this.a(c.this.hKV);
      GMTrace.o(18874233782272L, 140624);
      return true;
    }
    
    public final String getName()
    {
      GMTrace.i(18874099564544L, 140623);
      String str = c.this.mName + "|Foreground";
      GMTrace.o(18874099564544L, 140623);
      return str;
    }
  }
  
  private final class e
    extends com.tencent.mm.plugin.appbrand.report.c
  {
    public e()
    {
      GMTrace.i(18875441741824L, 140633);
      GMTrace.o(18875441741824L, 140633);
    }
    
    private com.tencent.mm.plugin.appbrand.jsruntime.d Tf()
    {
      GMTrace.i(20767509053440L, 154730);
      com.tencent.mm.plugin.appbrand.jsruntime.d locald = (com.tencent.mm.plugin.appbrand.jsruntime.d)c.this.hzM.hyI.hzO.q(com.tencent.mm.plugin.appbrand.jsruntime.d.class);
      GMTrace.o(20767509053440L, 154730);
      return locald;
    }
    
    public final void enter()
    {
      GMTrace.i(18875710177280L, 140635);
      super.enter();
      c.this.vlJ.sendEmptyMessageDelayed(11, c.this.hzM.hyG.hRf * 1000L);
      com.tencent.mm.plugin.appbrand.jsruntime.d locald = Tf();
      if (locald != null) {
        locald.pause();
      }
      GMTrace.o(18875710177280L, 140635);
    }
    
    public final void exit()
    {
      GMTrace.i(18875844395008L, 140636);
      super.exit();
      c.this.vlJ.removeMessages(11);
      com.tencent.mm.plugin.appbrand.jsruntime.d locald = Tf();
      if (locald != null) {
        locald.resume();
      }
      GMTrace.o(18875844395008L, 140636);
    }
    
    public final boolean f(Message paramMessage)
    {
      GMTrace.i(18875978612736L, 140637);
      switch (paramMessage.what)
      {
      default: 
        boolean bool = super.f(paramMessage);
        GMTrace.o(18875978612736L, 140637);
        return bool;
      case 3: 
        c.this.a(c.this.hKU);
        GMTrace.o(18875978612736L, 140637);
        return true;
      }
      w.i(c.this.TAG, "suspend timeout");
      c.this.Tb();
      GMTrace.o(18875978612736L, 140637);
      return true;
    }
    
    public final String getName()
    {
      GMTrace.i(18875575959552L, 140634);
      String str = c.this.mName + "|Suspend";
      GMTrace.o(18875575959552L, 140634);
      return str;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\b\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */