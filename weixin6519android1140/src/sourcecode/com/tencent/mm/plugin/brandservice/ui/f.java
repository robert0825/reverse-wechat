package com.tencent.mm.plugin.brandservice.ui;

import android.content.Context;
import android.util.SparseArray;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.protocal.c.axu;
import com.tencent.mm.protocal.c.azq;
import com.tencent.mm.protocal.c.bbb;
import com.tencent.mm.protocal.c.in;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class f
  extends c
{
  List<axu> jvh;
  private SparseArray<com.tencent.mm.plugin.brandservice.ui.base.a> jvi;
  private int jvj;
  
  public f(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(10875259846656L, 81027);
    this.jvh = null;
    this.jvi = new SparseArray();
    a(new c.b()
    {
      public final void a(c paramAnonymousc, com.tencent.mm.ui.base.sortview.a paramAnonymousa, int paramAnonymousInt1, String paramAnonymousString, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        GMTrace.i(20420019355648L, 152141);
        in localin = f.this.lp(paramAnonymousInt3);
        paramAnonymousa = new StringBuilder().append(bg.nl(f.this.jtD)).append(",").append(paramAnonymousInt1).append(",").append(bg.nl(paramAnonymousString)).append(",").append(paramAnonymousInt2).append(",").append(paramAnonymousc.jtN).append(",");
        if (localin == null) {}
        for (paramAnonymousc = "";; paramAnonymousc = localin.tXx + ",0")
        {
          paramAnonymousc = paramAnonymousc;
          g.ork.A(10866, paramAnonymousc);
          w.d("MicroMsg.SearchOrRecommendBizAdapter", "report : " + paramAnonymousc);
          GMTrace.o(20420019355648L, 152141);
          return;
        }
      }
    });
    GMTrace.o(10875259846656L, 81027);
  }
  
  public final void a(in paramin, boolean paramBoolean)
  {
    GMTrace.i(10875528282112L, 81029);
    super.a(paramin, paramBoolean);
    if (this.jvj == 0) {
      this.jvj = super.getCount();
    }
    GMTrace.o(10875528282112L, 81029);
  }
  
  public final void aij()
  {
    GMTrace.i(10875796717568L, 81031);
    super.aij();
    GMTrace.o(10875796717568L, 81031);
  }
  
  public final void c(String paramString, List<in> paramList)
  {
    GMTrace.i(10875394064384L, 81028);
    super.c(paramString, paramList);
    this.jvj = super.getCount();
    GMTrace.o(10875394064384L, 81028);
  }
  
  public final int getCount()
  {
    GMTrace.i(10875662499840L, 81030);
    int i = super.getCount();
    int j = i;
    if (i == 0)
    {
      j = i;
      if (this.jvh != null)
      {
        Iterator localIterator = this.jvh.iterator();
        if (localIterator.hasNext())
        {
          axu localaxu = (axu)localIterator.next();
          if ((localaxu == null) || (localaxu.uMs == null)) {
            break label97;
          }
          i += localaxu.uMs.size();
        }
      }
    }
    label97:
    for (;;)
    {
      break;
      j = i;
      GMTrace.o(10875662499840L, 81030);
      return j;
    }
  }
  
  protected final Object[] lt(int paramInt)
  {
    GMTrace.i(10876065153024L, 81033);
    Object localObject2 = lo(paramInt);
    Object localObject1 = lp(paramInt);
    if (localObject2 != null)
    {
      localObject2 = ((c.a)localObject2).jtQ;
      if (paramInt < this.jvj)
      {
        paramInt = 39;
        if (localObject1 == null) {
          break label87;
        }
      }
      label87:
      for (localObject1 = ((in)localObject1).tXx;; localObject1 = "")
      {
        GMTrace.o(10876065153024L, 81033);
        return new Object[] { this, localObject2, Integer.valueOf(paramInt), localObject1 };
        paramInt = 56;
        break;
      }
    }
    localObject1 = super.lt(paramInt);
    GMTrace.o(10876065153024L, 81033);
    return (Object[])localObject1;
  }
  
  public final com.tencent.mm.ui.base.sortview.a lv(int paramInt)
  {
    Object localObject2 = null;
    GMTrace.i(20417200783360L, 152120);
    int i = super.getCount();
    if (i != 0)
    {
      localObject1 = super.lv(paramInt);
      GMTrace.o(20417200783360L, 152120);
      return (com.tencent.mm.ui.base.sortview.a)localObject1;
    }
    Object localObject3 = (com.tencent.mm.plugin.brandservice.ui.base.a)this.jvi.get(paramInt);
    Object localObject1 = localObject3;
    if (localObject3 == null)
    {
      localObject1 = localObject3;
      if (this.jvh.size() > 0)
      {
        localObject1 = this.jvh.iterator();
        if (!((Iterator)localObject1).hasNext()) {
          break label235;
        }
        localObject3 = (axu)((Iterator)localObject1).next();
        if (i != paramInt) {
          break label189;
        }
        if (((axu)localObject3).uMq != null) {
          break label177;
        }
        localObject1 = null;
        label117:
        localObject3 = (bbb)((axu)localObject3).uMs.get(0);
        localObject2 = localObject1;
        localObject1 = localObject3;
      }
    }
    for (;;)
    {
      localObject1 = new b(localObject1, (String)localObject2);
      ((com.tencent.mm.plugin.brandservice.ui.base.a)localObject1).lw(paramInt);
      ((com.tencent.mm.plugin.brandservice.ui.base.a)localObject1).lx(paramInt);
      this.jvi.put(paramInt, localObject1);
      GMTrace.o(20417200783360L, 152120);
      return (com.tencent.mm.ui.base.sortview.a)localObject1;
      label177:
      localObject1 = ((axu)localObject3).uMq.toString();
      break label117;
      label189:
      if (paramInt < ((axu)localObject3).uMs.size() + i)
      {
        localObject1 = (bbb)((axu)localObject3).uMs.get(paramInt - i);
      }
      else
      {
        i = ((axu)localObject3).uMs.size() + i;
        break;
        label235:
        localObject1 = null;
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\brandservice\ui\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */