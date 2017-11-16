package com.tencent.mm.plugin.location.model;

import android.widget.ImageView;
import android.widget.ProgressBar;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ao.f;
import com.tencent.mm.ao.n;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.pluginsdk.location.a;
import com.tencent.mm.pluginsdk.location.b;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.au;
import com.tencent.mm.storage.au.b;
import com.tencent.mm.y.at;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public final class j
  implements a
{
  int h;
  HashMap<Long, WeakReference<ImageView>> mxi;
  HashMap<Long, au.b> mxj;
  HashMap<Long, WeakReference<ProgressBar>> mxk;
  HashMap<Long, WeakReference<ImageView>> mxl;
  HashMap<au.b, au> mxm;
  HashMap<Long, Integer> mxn;
  HashSet<Long> mxo;
  int w;
  
  public j()
  {
    GMTrace.i(9643677974528L, 71851);
    this.mxi = new HashMap();
    this.mxj = new HashMap();
    this.mxk = new HashMap();
    this.mxl = new HashMap();
    this.mxm = new HashMap();
    this.mxn = new HashMap();
    this.mxo = new HashSet();
    this.w = 300;
    this.h = 300;
    start();
    GMTrace.o(9643677974528L, 71851);
  }
  
  public final void a(b paramb)
  {
    GMTrace.i(9644080627712L, 71854);
    if (paramb == null)
    {
      GMTrace.o(9644080627712L, 71854);
      return;
    }
    if (!this.mxj.containsKey(Long.valueOf(paramb.tmw)))
    {
      GMTrace.o(9644080627712L, 71854);
      return;
    }
    paramb = (au.b)this.mxj.get(Long.valueOf(paramb.tmw));
    paramb = (au)this.mxm.remove(paramb);
    if (paramb == null)
    {
      GMTrace.o(9644080627712L, 71854);
      return;
    }
    this.mxi.get(Long.valueOf(paramb.field_msgId));
    if ((paramb != null) && ((paramb.fwB < 0) || (paramb.fwB > 5)))
    {
      paramb.dP(0);
      paramb.dP(paramb.fwB + 1);
      if (at.AU())
      {
        at.AR();
        com.tencent.mm.y.c.yM().a(paramb.field_msgId, paramb);
        w.i("MicroMsg.StaticMapMsgLogic", "on error count %d", new Object[] { Integer.valueOf(paramb.fwB) });
      }
    }
    GMTrace.o(9644080627712L, 71854);
  }
  
  public final void a(String paramString, b paramb)
  {
    GMTrace.i(9643946409984L, 71853);
    if (paramb == null)
    {
      GMTrace.o(9643946409984L, 71853);
      return;
    }
    if (!this.mxj.containsKey(Long.valueOf(paramb.tmw)))
    {
      GMTrace.o(9643946409984L, 71853);
      return;
    }
    paramb = (au.b)this.mxj.get(Long.valueOf(paramb.tmw));
    paramb = (au)this.mxm.remove(paramb);
    if (paramb == null)
    {
      GMTrace.o(9643946409984L, 71853);
      return;
    }
    WeakReference localWeakReference = (WeakReference)this.mxi.get(Long.valueOf(paramb.field_msgId));
    if ((localWeakReference == null) || (localWeakReference.get() == null))
    {
      GMTrace.o(9643946409984L, 71853);
      return;
    }
    if (!this.mxn.containsKey(Long.valueOf(paramb.field_msgId)))
    {
      GMTrace.o(9643946409984L, 71853);
      return;
    }
    int i = ((Integer)this.mxn.remove(Long.valueOf(paramb.field_msgId))).intValue();
    if (paramb.field_isSend == 0) {}
    for (boolean bool = true;; bool = false)
    {
      ((ImageView)localWeakReference.get()).setImageBitmap(n.IZ().a(paramb.field_msgId, paramString, i, this.w, this.h, bool));
      paramString = (WeakReference)this.mxk.remove(Long.valueOf(paramb.field_msgId));
      if ((paramString != null) && (paramString.get() != null)) {
        ((ProgressBar)paramString.get()).setVisibility(8);
      }
      paramString = (WeakReference)this.mxl.remove(Long.valueOf(paramb.field_msgId));
      if ((paramString != null) && (paramString.get() != null)) {
        ((ImageView)paramString.get()).setVisibility(0);
      }
      GMTrace.o(9643946409984L, 71853);
      return;
    }
  }
  
  public final void start()
  {
    GMTrace.i(9643812192256L, 71852);
    k localk = l.aKl();
    if (this != null)
    {
      Iterator localIterator = localk.fIz.iterator();
      do
      {
        if (!localIterator.hasNext()) {
          break;
        }
      } while (!equals((a)localIterator.next()));
    }
    for (;;)
    {
      GMTrace.o(9643812192256L, 71852);
      return;
      localk.fIz.add(this);
      w.i("MicroMsg.StaticMapServer", "addMapCallBack " + localk.fIz.size());
      if (localk.fIz.size() == 1) {
        localk.start();
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\location\model\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */