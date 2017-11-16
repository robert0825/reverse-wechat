package com.tencent.mm.plugin.fts.d;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.fts.a.a.f;
import com.tencent.mm.plugin.fts.a.a.g;
import com.tencent.mm.plugin.fts.a.a.i;
import com.tencent.mm.plugin.fts.a.j;
import com.tencent.mm.plugin.fts.a.l;
import com.tencent.mm.plugin.fts.d.a.d;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public abstract class c
  extends b
  implements j
{
  public String eQb;
  public List<String> hWm;
  public HashSet<String> lwW;
  private com.tencent.mm.plugin.fts.a.a.a lwZ;
  public List<i.a> lzp;
  
  public c(Context paramContext, i.b paramb, int paramInt)
  {
    super(paramContext, paramb, paramInt);
    GMTrace.i(16708496523264L, 124488);
    this.lzp = Collections.synchronizedList(new LinkedList());
    this.hWm = new LinkedList();
    this.lwW = new HashSet();
    GMTrace.o(16708496523264L, 124488);
  }
  
  public final void Ty()
  {
    GMTrace.i(16709570265088L, 124496);
    this.eQb = null;
    this.lwW.clear();
    this.lzp.clear();
    GMTrace.o(16709570265088L, 124496);
  }
  
  public abstract com.tencent.mm.plugin.fts.a.a.a a(ae paramae, HashSet<String> paramHashSet);
  
  public com.tencent.mm.plugin.fts.d.a.a a(int paramInt, i parami, List<String> paramList)
  {
    GMTrace.i(18561372258304L, 138293);
    GMTrace.o(18561372258304L, 138293);
    return null;
  }
  
  public abstract com.tencent.mm.plugin.fts.d.a.a a(int paramInt, i.a parama);
  
  public final void a(g paramg)
  {
    int i = 0;
    GMTrace.i(18561238040576L, 138292);
    switch (paramg.aGY)
    {
    default: 
      GMTrace.o(18561238040576L, 138292);
      return;
    case 0: 
      w.i("MicroMsg.FTS.BaseNativeFTSUIUnit", "search type %d | result %d", new Object[] { Integer.valueOf(getType()), Integer.valueOf(paramg.lxb.size()) });
      if ((this.eQb == null) || (!this.eQb.equals(paramg.luZ.eQb)))
      {
        w.i("MicroMsg.FTS.BaseNativeFTSUIUnit", "Native Search: Not Same query origin:%s current:%s", new Object[] { paramg.luZ.eQb, this.eQb });
        GMTrace.o(18561238040576L, 138292);
        return;
      }
      String[] arrayOfString = paramg.lxa;
      ArrayList localArrayList = new ArrayList();
      if ((arrayOfString != null) && (arrayOfString.length > 0)) {
        while (i < arrayOfString.length)
        {
          localArrayList.add(arrayOfString[i]);
          i += 1;
        }
      }
      this.hWm = localArrayList;
      this.lwW = paramg.luZ.lwW;
      a(paramg, this.lwW);
    }
    do
    {
      this.lzn.a(this, paramg.luZ.eQb);
      break;
      w.i("MicroMsg.FTS.BaseNativeFTSUIUnit", "onSearchError: type=%d | errorCode=%d | originQuery=%s", new Object[] { Integer.valueOf(getType()), Integer.valueOf(paramg.aGY), paramg.luZ.eQb });
    } while (paramg.luZ.eQb.equals(this.eQb));
    w.i("MicroMsg.FTS.BaseNativeFTSUIUnit", "Native Search: Not Same Query");
    GMTrace.o(18561238040576L, 138292);
  }
  
  public abstract void a(g paramg, HashSet<String> paramHashSet);
  
  public final void a(String paramString, ae paramae, HashSet<String> paramHashSet)
  {
    GMTrace.i(16708630740992L, 124489);
    aCw();
    Ty();
    this.eQb = paramString;
    this.lwZ = a(paramae, paramHashSet);
    GMTrace.o(16708630740992L, 124489);
  }
  
  public final void aCw()
  {
    GMTrace.i(16709033394176L, 124492);
    if (this.lwZ != null)
    {
      ((l)h.j(l.class)).cancelSearchTask(this.lwZ);
      this.lwZ = null;
    }
    GMTrace.o(16709033394176L, 124492);
  }
  
  public final LinkedList<Integer> aCx()
  {
    GMTrace.i(16709838700544L, 124498);
    LinkedList localLinkedList = new LinkedList();
    int j = this.lzp.size();
    int i = 0;
    while (i < j)
    {
      i.a locala = (i.a)this.lzp.get(i);
      if (locala.lzE != Integer.MAX_VALUE) {
        localLinkedList.add(Integer.valueOf(locala.lzE));
      }
      i += 1;
    }
    GMTrace.o(16709838700544L, 124498);
    return localLinkedList;
  }
  
  public com.tencent.mm.plugin.fts.d.a.b b(int paramInt, i.a parama)
  {
    GMTrace.i(17482395942912L, 130254);
    parama = new com.tencent.mm.plugin.fts.d.a.b(paramInt);
    GMTrace.o(17482395942912L, 130254);
    return parama;
  }
  
  public final int oa(int paramInt)
  {
    GMTrace.i(16709167611904L, 124493);
    int k = this.lzp.size();
    int i = 0;
    if (i < k)
    {
      i.a locala = (i.a)this.lzp.get(i);
      locala.lzE = paramInt;
      int j = paramInt;
      if (locala.lzF) {
        j = paramInt + 1;
      }
      paramInt = j + (locala.lzI.size() + locala.lzJ);
      locala.lzG = paramInt;
      if (!locala.lzH) {
        break label116;
      }
      paramInt += 1;
    }
    label116:
    for (;;)
    {
      i += 1;
      break;
      GMTrace.o(16709167611904L, 124493);
      return paramInt;
    }
  }
  
  public final com.tencent.mm.plugin.fts.d.a.a ob(int paramInt)
  {
    GMTrace.i(16709301829632L, 124494);
    int j = this.lzp.size();
    int i = 0;
    while (i < j)
    {
      i.a locala = (i.a)this.lzp.get(i);
      Object localObject;
      if ((locala.lzE == paramInt) && (locala.lzF)) {
        localObject = b(paramInt, locala);
      }
      while (localObject != null)
      {
        if ((!locala.lzH) && (((com.tencent.mm.plugin.fts.d.a.a)localObject).position == locala.lzG)) {
          ((com.tencent.mm.plugin.fts.d.a.a)localObject).lzW = true;
        }
        ((com.tencent.mm.plugin.fts.d.a.a)localObject).lzo = this.lzo;
        ((com.tencent.mm.plugin.fts.d.a.a)localObject).eQb = this.eQb;
        ((com.tencent.mm.plugin.fts.d.a.a)localObject).lzX = locala.gRj;
        GMTrace.o(16709301829632L, 124494);
        return (com.tencent.mm.plugin.fts.d.a.a)localObject;
        if ((locala.lzG == paramInt) && (locala.lzH))
        {
          localObject = new d(paramInt);
          ((com.tencent.mm.plugin.fts.d.a.a)localObject).lzZ = (locala.lzG - locala.lzE);
        }
        else
        {
          localObject = a(paramInt, locala);
        }
      }
      i += 1;
    }
    GMTrace.o(16709301829632L, 124494);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\fts\d\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */