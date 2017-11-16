package com.tencent.mm.s;

import android.os.Looper;
import android.os.Message;
import android.util.SparseArray;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.h;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.w.a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public final class a
{
  static a fUl;
  public b fUm;
  ArrayList<WeakReference<a>> fUn;
  public boolean fUo;
  private final int fUp;
  private final int fUq;
  private ae handler;
  
  public a()
  {
    GMTrace.i(14597385879552L, 108759);
    this.fUm = new b();
    this.fUn = new ArrayList();
    this.fUo = false;
    this.fUp = 0;
    this.fUq = 1;
    this.handler = new ae(Looper.getMainLooper())
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(14597251661824L, 108758);
        Object localObject1;
        if ((paramAnonymousMessage.what == 0) && ((paramAnonymousMessage.obj instanceof a.b)))
        {
          localObject1 = (a.b)paramAnonymousMessage.obj;
          if (((a.b)localObject1).fUt == null) {
            break label245;
          }
          a locala = a.this;
          Object localObject3 = ((a.b)localObject1).fUt;
          localObject1 = null;
          Iterator localIterator = locala.fUn.iterator();
          Object localObject2;
          while (localIterator.hasNext())
          {
            WeakReference localWeakReference = (WeakReference)localIterator.next();
            if ((localWeakReference != null) && (localWeakReference.get() != null))
            {
              ((a.a)localWeakReference.get()).a((w.a)localObject3);
            }
            else
            {
              localObject2 = localObject1;
              if (localObject1 == null) {
                localObject2 = new ArrayList();
              }
              ((ArrayList)localObject2).add(localWeakReference);
              localObject1 = localObject2;
            }
          }
          if (localObject1 != null)
          {
            localObject2 = ((ArrayList)localObject1).iterator();
            while (((Iterator)localObject2).hasNext())
            {
              localObject3 = (WeakReference)((Iterator)localObject2).next();
              locala.fUn.remove(localObject3);
            }
            ((ArrayList)localObject1).clear();
          }
        }
        while ((paramAnonymousMessage.what == 1) && ((paramAnonymousMessage.obj instanceof a.c)))
        {
          paramAnonymousMessage = (a.c)paramAnonymousMessage.obj;
          if (paramAnonymousMessage.fUt != null)
          {
            a.this.vI();
            GMTrace.o(14597251661824L, 108758);
            return;
            label245:
            a.this.eJ(((a.b)localObject1).fUs);
          }
          else
          {
            a.this.eK(paramAnonymousMessage.fUu);
          }
        }
        GMTrace.o(14597251661824L, 108758);
      }
    };
    GMTrace.o(14597385879552L, 108759);
  }
  
  private void a(int paramInt1, int paramInt2, String paramString)
  {
    GMTrace.i(14598056968192L, 108764);
    if (!this.fUo)
    {
      w.w("MicroMsg.NewBadge", "updateDataSource NewBadge has not initialized");
      GMTrace.o(14598056968192L, 108764);
      return;
    }
    b localb = this.fUm;
    w.d("MicroMsg.NewBadgeDecoder", "[carl] updateDataSourceValue, dataSourceId %d, type %d, value %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    b.a locala2 = localb.eO(paramInt1);
    b.a locala1 = locala2;
    if (locala2 == null)
    {
      locala1 = localb.a(paramInt1, paramInt2, "", "");
      localb.fUw.put(paramInt1, locala1);
      localb.a(locala1);
    }
    locala1.value = paramString;
    locala1.type = paramInt2;
    locala1.eEU = localb.vJ();
    localb.a(locala1);
    this.handler.sendMessage(this.handler.obtainMessage(0, new b(paramInt1, paramInt2, paramString)));
    GMTrace.o(14598056968192L, 108764);
  }
  
  private void a(w.a parama, int paramInt, String paramString)
  {
    GMTrace.i(16745003745280L, 124760);
    if (!this.fUo)
    {
      w.w("MicroMsg.NewBadge", "updateDataSource NewBadge has not initialized");
      GMTrace.o(16745003745280L, 124760);
      return;
    }
    b localb = this.fUm;
    w.d("MicroMsg.NewBadgeDecoder", "[carl] updateDataSourceValue, dataSourceKey %s, type %d, value %s", new Object[] { parama, Integer.valueOf(paramInt), paramString });
    b.a locala2 = localb.e(parama);
    b.a locala1 = locala2;
    if (locala2 == null)
    {
      locala1 = localb.a(parama, paramInt, "", "");
      localb.fUx.put(parama, locala1);
      localb.a(locala1);
    }
    locala1.value = paramString;
    locala1.type = paramInt;
    locala1.eEU = localb.vJ();
    localb.a(locala1);
    this.handler.sendMessage(this.handler.obtainMessage(0, new b(parama, paramInt, paramString)));
    GMTrace.o(16745003745280L, 124760);
  }
  
  public static int parseInt(String paramString)
  {
    GMTrace.i(14598728056832L, 108769);
    if (bg.nm(paramString))
    {
      GMTrace.o(14598728056832L, 108769);
      return 0;
    }
    int i = bg.Sy(paramString);
    GMTrace.o(14598728056832L, 108769);
    return i;
  }
  
  public final void a(a parama)
  {
    GMTrace.i(14598862274560L, 108770);
    if (!this.fUo)
    {
      w.w("MicroMsg.NewBadge", "addWatch NewBadge has not initialized");
      GMTrace.o(14598862274560L, 108770);
      return;
    }
    this.fUn.add(new WeakReference(parama));
    GMTrace.o(14598862274560L, 108770);
  }
  
  public final void a(w.a parama, boolean paramBoolean)
  {
    GMTrace.i(14597788532736L, 108762);
    if (!paramBoolean) {}
    for (String str = "0";; str = "1")
    {
      a(parama, 1, str);
      GMTrace.o(14597788532736L, 108762);
      return;
    }
  }
  
  public final boolean a(w.a parama1, w.a parama2)
  {
    GMTrace.i(14598325403648L, 108766);
    if (!this.fUo)
    {
      w.w("MicroMsg.NewBadge", "hasNew NewBadge has not initialized");
      GMTrace.o(14598325403648L, 108766);
      return false;
    }
    parama1 = this.fUm.a(parama1, parama2, 1);
    if (parama1 == null)
    {
      GMTrace.o(14598325403648L, 108766);
      return false;
    }
    if (parseInt(parama1.value) == 0)
    {
      GMTrace.o(14598325403648L, 108766);
      return false;
    }
    GMTrace.o(14598325403648L, 108766);
    return true;
  }
  
  public final boolean aD(int paramInt1, int paramInt2)
  {
    GMTrace.i(14598191185920L, 108765);
    if (!this.fUo)
    {
      w.w("MicroMsg.NewBadge", "hasNew NewBadge has not initialized");
      GMTrace.o(14598191185920L, 108765);
      return false;
    }
    b.a locala = this.fUm.p(paramInt1, paramInt2, 1);
    if (locala == null)
    {
      GMTrace.o(14598191185920L, 108765);
      return false;
    }
    if (parseInt(locala.value) == 0)
    {
      GMTrace.o(14598191185920L, 108765);
      return false;
    }
    GMTrace.o(14598191185920L, 108765);
    return true;
  }
  
  public final boolean aE(int paramInt1, int paramInt2)
  {
    GMTrace.i(14598459621376L, 108767);
    if (!this.fUo)
    {
      w.w("MicroMsg.NewBadge", "hasDot NewBadge has not initialized");
      GMTrace.o(14598459621376L, 108767);
      return false;
    }
    b.a locala = this.fUm.p(paramInt1, paramInt2, 2);
    if (locala == null)
    {
      GMTrace.o(14598459621376L, 108767);
      return false;
    }
    if (parseInt(locala.value) == 0)
    {
      GMTrace.o(14598459621376L, 108767);
      return false;
    }
    GMTrace.o(14598459621376L, 108767);
    return true;
  }
  
  public final void aF(int paramInt1, int paramInt2)
  {
    GMTrace.i(14598593839104L, 108768);
    if (!this.fUo)
    {
      w.w("MicroMsg.NewBadge", "markRead NewBadge has not initialized");
      GMTrace.o(14598593839104L, 108768);
      return;
    }
    b localb = this.fUm;
    w.d("MicroMsg.NewBadgeDecoder", "[carl] doWatch, doWatch %d, watcherId %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    b.a locala = localb.eO(paramInt1);
    if (locala == null) {
      w.d("MicroMsg.NewBadgeDecoder", "[carl] doWatch, dataSource == null");
    }
    for (;;)
    {
      this.handler.sendMessage(this.handler.obtainMessage(1, new c(paramInt2, paramInt1)));
      GMTrace.o(14598593839104L, 108768);
      return;
      b.b localb2 = localb.eP(paramInt2);
      b.b localb1 = localb2;
      if (localb2 == null)
      {
        w.e("MicroMsg.NewBadgeDecoder", "[carl] doWatch, watcher == null, do some fix");
        localb1 = localb.eN(paramInt2);
        localb.fUy.put(paramInt2, localb1);
      }
      localb1.fUE.put(paramInt1, locala.eEU);
      localb.a(localb1);
    }
  }
  
  public final void b(a parama)
  {
    GMTrace.i(14598996492288L, 108771);
    if (!this.fUo)
    {
      w.w("MicroMsg.NewBadge", "removeWatch NewBadge has not initialized");
      GMTrace.o(14598996492288L, 108771);
      return;
    }
    Object localObject1 = null;
    int i = 0;
    Object localObject2;
    while (i < this.fUn.size())
    {
      WeakReference localWeakReference = (WeakReference)this.fUn.get(i);
      if ((localWeakReference != null) && (localWeakReference.get() != null))
      {
        localObject2 = localObject1;
        if (localWeakReference.get() != parama) {}
      }
      else
      {
        localObject2 = localObject1;
        if (localObject1 == null) {
          localObject2 = new ArrayList();
        }
        ((ArrayList)localObject2).add(localWeakReference);
      }
      i += 1;
      localObject1 = localObject2;
    }
    if (localObject1 != null)
    {
      parama = ((ArrayList)localObject1).iterator();
      while (parama.hasNext())
      {
        localObject2 = (WeakReference)parama.next();
        this.fUn.remove(localObject2);
      }
      ((ArrayList)localObject1).clear();
    }
    GMTrace.o(14598996492288L, 108771);
  }
  
  public final void b(w.a parama, boolean paramBoolean)
  {
    GMTrace.i(16744869527552L, 124759);
    if (!paramBoolean) {}
    for (String str = "0";; str = "1")
    {
      a(parama, 2, str);
      GMTrace.o(16744869527552L, 124759);
      return;
    }
  }
  
  public final boolean b(w.a parama1, w.a parama2)
  {
    GMTrace.i(16745137963008L, 124761);
    if (!this.fUo)
    {
      w.w("MicroMsg.NewBadge", "hasDot NewBadge has not initialized");
      GMTrace.o(16745137963008L, 124761);
      return false;
    }
    parama1 = this.fUm.a(parama1, parama2, 2);
    if (parama1 == null)
    {
      GMTrace.o(16745137963008L, 124761);
      return false;
    }
    if (parseInt(parama1.value) == 0)
    {
      GMTrace.o(16745137963008L, 124761);
      return false;
    }
    GMTrace.o(16745137963008L, 124761);
    return true;
  }
  
  public final void c(w.a parama1, w.a parama2)
  {
    GMTrace.i(16745272180736L, 124762);
    if (!this.fUo)
    {
      w.w("MicroMsg.NewBadge", "markRead NewBadge has not initialized");
      GMTrace.o(16745272180736L, 124762);
      return;
    }
    b localb = this.fUm;
    w.d("MicroMsg.NewBadgeDecoder", "[carl] doWatch, doWatch %s, watcherKey %s", new Object[] { parama1, parama2 });
    b.a locala = localb.e(parama1);
    if (locala == null) {
      w.d("MicroMsg.NewBadgeDecoder", "[carl] doWatch, dataSource == null");
    }
    for (;;)
    {
      this.handler.sendMessage(this.handler.obtainMessage(1, new c(parama2, parama1)));
      GMTrace.o(16745272180736L, 124762);
      return;
      b.b localb2 = localb.f(parama2);
      b.b localb1 = localb2;
      if (localb2 == null)
      {
        w.e("MicroMsg.NewBadgeDecoder", "[carl] doWatch, watcher == null, do some fix");
        localb1 = localb.d(parama2);
        localb.fUz.put(parama2, localb1);
      }
      localb1.fUF.put(parama1.name(), locala.eEU);
      localb.a(localb1);
    }
  }
  
  public final void eJ(int paramInt)
  {
    GMTrace.i(16087471095808L, 119861);
    Object localObject1 = null;
    Object localObject3 = this.fUn.iterator();
    Object localObject2;
    while (((Iterator)localObject3).hasNext())
    {
      WeakReference localWeakReference = (WeakReference)((Iterator)localObject3).next();
      if ((localWeakReference != null) && (localWeakReference.get() != null))
      {
        ((a)localWeakReference.get()).eJ(paramInt);
      }
      else
      {
        localObject2 = localObject1;
        if (localObject1 == null) {
          localObject2 = new ArrayList();
        }
        ((ArrayList)localObject2).add(localWeakReference);
        localObject1 = localObject2;
      }
    }
    if (localObject1 != null)
    {
      localObject2 = ((ArrayList)localObject1).iterator();
      while (((Iterator)localObject2).hasNext())
      {
        localObject3 = (WeakReference)((Iterator)localObject2).next();
        this.fUn.remove(localObject3);
      }
      ((ArrayList)localObject1).clear();
    }
    GMTrace.o(16087471095808L, 119861);
  }
  
  public final void eK(int paramInt)
  {
    GMTrace.i(16087605313536L, 119862);
    Object localObject1 = null;
    Object localObject3 = this.fUn.iterator();
    Object localObject2;
    while (((Iterator)localObject3).hasNext())
    {
      WeakReference localWeakReference = (WeakReference)((Iterator)localObject3).next();
      if ((localWeakReference != null) && (localWeakReference.get() != null))
      {
        ((a)localWeakReference.get()).eK(paramInt);
      }
      else
      {
        localObject2 = localObject1;
        if (localObject1 == null) {
          localObject2 = new ArrayList();
        }
        ((ArrayList)localObject2).add(localWeakReference);
        localObject1 = localObject2;
      }
    }
    if (localObject1 != null)
    {
      localObject2 = ((ArrayList)localObject1).iterator();
      while (((Iterator)localObject2).hasNext())
      {
        localObject3 = (WeakReference)((Iterator)localObject2).next();
        this.fUn.remove(localObject3);
      }
      ((ArrayList)localObject1).clear();
    }
    GMTrace.o(16087605313536L, 119862);
  }
  
  public final void init()
  {
    GMTrace.i(14597520097280L, 108760);
    this.fUo = true;
    this.fUm.fUB = h.xy().xh();
    GMTrace.o(14597520097280L, 108760);
  }
  
  public final void k(int paramInt, boolean paramBoolean)
  {
    GMTrace.i(14597654315008L, 108761);
    if (!paramBoolean) {}
    for (String str = "0";; str = "1")
    {
      a(paramInt, 1, str);
      GMTrace.o(14597654315008L, 108761);
      return;
    }
  }
  
  public final void l(int paramInt, boolean paramBoolean)
  {
    GMTrace.i(14597922750464L, 108763);
    if (!paramBoolean) {}
    for (String str = "0";; str = "1")
    {
      a(paramInt, 2, str);
      GMTrace.o(14597922750464L, 108763);
      return;
    }
  }
  
  public final void vI()
  {
    GMTrace.i(16087739531264L, 119863);
    Object localObject1 = null;
    Object localObject3 = this.fUn.iterator();
    Object localObject2;
    while (((Iterator)localObject3).hasNext())
    {
      WeakReference localWeakReference = (WeakReference)((Iterator)localObject3).next();
      if ((localWeakReference != null) && (localWeakReference.get() != null))
      {
        localWeakReference.get();
      }
      else
      {
        localObject2 = localObject1;
        if (localObject1 == null) {
          localObject2 = new ArrayList();
        }
        ((ArrayList)localObject2).add(localWeakReference);
        localObject1 = localObject2;
      }
    }
    if (localObject1 != null)
    {
      localObject2 = ((ArrayList)localObject1).iterator();
      while (((Iterator)localObject2).hasNext())
      {
        localObject3 = (WeakReference)((Iterator)localObject2).next();
        this.fUn.remove(localObject3);
      }
      ((ArrayList)localObject1).clear();
    }
    GMTrace.o(16087739531264L, 119863);
  }
  
  public static abstract interface a
  {
    public abstract void a(w.a parama);
    
    public abstract void eJ(int paramInt);
    
    public abstract void eK(int paramInt);
  }
  
  final class b
  {
    int fUs;
    w.a fUt;
    int type;
    String value;
    
    public b(int paramInt1, int paramInt2, String paramString)
    {
      GMTrace.i(14594433089536L, 108737);
      this.fUs = paramInt1;
      this.type = paramInt2;
      this.value = paramString;
      GMTrace.o(14594433089536L, 108737);
    }
    
    public b(w.a parama, int paramInt, String paramString)
    {
      GMTrace.i(14594567307264L, 108738);
      this.fUt = parama;
      this.type = paramInt;
      this.value = paramString;
      GMTrace.o(14594567307264L, 108738);
    }
  }
  
  final class c
  {
    int fUs;
    w.a fUt;
    int fUu;
    w.a fUv;
    
    public c(int paramInt1, int paramInt2)
    {
      GMTrace.i(14594298871808L, 108736);
      this.fUu = paramInt1;
      this.fUs = paramInt2;
      GMTrace.o(14594298871808L, 108736);
    }
    
    public c(w.a parama1, w.a parama2)
    {
      GMTrace.i(16744466874368L, 124756);
      this.fUv = parama1;
      this.fUt = parama2;
      GMTrace.o(16744466874368L, 124756);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\s\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */