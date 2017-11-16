package com.tencent.mm.ui.conversation;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.d.a;
import com.tencent.mm.g.a.af;
import com.tencent.mm.g.a.jb;
import com.tencent.mm.network.n;
import com.tencent.mm.network.n.a;
import com.tencent.mm.platformtools.t;
import com.tencent.mm.pluginsdk.ui.b.b;
import com.tencent.mm.sdk.e.m;
import com.tencent.mm.sdk.e.m.b;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.ap;
import com.tencent.mm.y.at;
import com.tencent.mm.y.q;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class a
  implements d.a, m.b, ap
{
  Context context;
  n ovf;
  List<b> wVA;
  List<b> wVB;
  List<b> wVC;
  com.tencent.mm.sdk.b.c wVD;
  com.tencent.mm.sdk.b.c wVE;
  public ListView wVF;
  public View wVG;
  List<b> wVy;
  List<b> wVz;
  
  public a()
  {
    GMTrace.i(14483032375296L, 107907);
    this.wVy = new LinkedList();
    this.wVz = new LinkedList();
    this.wVA = new LinkedList();
    this.wVB = new LinkedList();
    this.wVC = new LinkedList();
    GMTrace.o(14483032375296L, 107907);
  }
  
  private static void da(List<b> paramList)
  {
    GMTrace.i(14681674612736L, 109387);
    paramList = paramList.iterator();
    while (paramList.hasNext()) {
      ((b)paramList.next()).setVisibility(8);
    }
    GMTrace.o(14681674612736L, 109387);
  }
  
  static void db(List<b> paramList)
  {
    GMTrace.i(14484106117120L, 107915);
    paramList = paramList.iterator();
    while (paramList.hasNext()) {
      ((b)paramList.next()).release();
    }
    GMTrace.o(14484106117120L, 107915);
  }
  
  static void dc(List<b> paramList)
  {
    GMTrace.i(14484240334848L, 107916);
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext()) {
      ((b)localIterator.next()).destroy();
    }
    paramList.clear();
    GMTrace.o(14484240334848L, 107916);
  }
  
  public final void AI()
  {
    GMTrace.i(14483569246208L, 107911);
    cgQ();
    GMTrace.o(14483569246208L, 107911);
  }
  
  public final void a(int paramInt, m paramm, Object paramObject)
  {
    GMTrace.i(14483435028480L, 107910);
    if (at.AU())
    {
      at.AR();
      if (paramm == com.tencent.mm.y.c.xh())
      {
        paramInt = t.aG(paramObject);
        if (8193 == paramInt) {
          cgQ();
        }
        if (42 == paramInt) {
          cgQ();
        }
      }
    }
    GMTrace.o(14483435028480L, 107910);
  }
  
  final void cY(List<b> paramList)
  {
    GMTrace.i(14483703463936L, 107912);
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      b localb = (b)paramList.next();
      this.wVF.addHeaderView(localb.getView());
    }
    GMTrace.o(14483703463936L, 107912);
  }
  
  final void cZ(List<b> paramList)
  {
    GMTrace.i(14483837681664L, 107913);
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      b localb = (b)paramList.next();
      if (localb.getView() != null) {
        this.wVF.removeHeaderView(localb.getView());
      }
    }
    GMTrace.o(14483837681664L, 107913);
  }
  
  public final void cgQ()
  {
    int j = 1;
    GMTrace.i(14483166593024L, 107908);
    if ((this.context == null) || (!at.AU()))
    {
      GMTrace.o(14483166593024L, 107908);
      return;
    }
    w.i("MicroMsg.BannerHelper", "updateBanner, :%d", new Object[] { Integer.valueOf(hashCode()) });
    boolean bool1 = i(this.wVy, true);
    boolean bool2 = i(this.wVz, true);
    boolean bool3 = i(this.wVA, true);
    boolean bool4 = i(this.wVB, true);
    int i = j;
    if (!bool1)
    {
      i = j;
      if (!bool2)
      {
        i = j;
        if (!bool3)
        {
          if (!bool4) {
            break label220;
          }
          i = j;
        }
      }
    }
    if (bool2)
    {
      da(this.wVA);
      da(this.wVB);
    }
    for (;;)
    {
      if ((i != 0) && (this.wVF.getVisibility() != 0))
      {
        this.wVF.setVisibility(0);
        this.wVG.setVisibility(8);
      }
      Iterator localIterator = this.wVC.iterator();
      while (localIterator.hasNext())
      {
        b localb = (b)localIterator.next();
        if (localb != null) {
          localb.abd();
        }
      }
      label220:
      i = 0;
      break;
      if (bool3) {
        da(this.wVB);
      }
    }
    GMTrace.o(14483166593024L, 107908);
  }
  
  final boolean i(List<b> paramList, boolean paramBoolean)
  {
    GMTrace.i(14483971899392L, 107914);
    paramList = paramList.iterator();
    boolean bool = false;
    if (paramList.hasNext())
    {
      b localb = (b)paramList.next();
      View localView = ((ViewGroup)localb.getView()).getChildAt(0);
      if (localb.abd())
      {
        if ((localView != null) && (localView.getVisibility() == 0)) {}
        for (bool = true;; bool = false)
        {
          w.i("MicroMsg.BannerHelper", "refreshAndReturnIsVisible[true] :%s, checkAll:%b, isVisible:%b, hc:%d", new Object[] { localb, Boolean.valueOf(paramBoolean), Boolean.valueOf(bool), Integer.valueOf(hashCode()) });
          if (paramBoolean) {
            break;
          }
          GMTrace.o(14483971899392L, 107914);
          return true;
        }
      }
      if ((localView != null) && (localView.getVisibility() == 0)) {
        w.i("MicroMsg.BannerHelper", "refreshAndReturnIsVisible[false] but visible :%s, checkAll:%b, hc:%d", new Object[] { localb, Boolean.valueOf(paramBoolean), Integer.valueOf(hashCode()) });
      }
    }
    for (;;)
    {
      break;
      GMTrace.o(14483971899392L, 107914);
      return bool;
      bool = true;
    }
  }
  
  public final void ib(String paramString)
  {
    GMTrace.i(14483300810752L, 107909);
    if ((at.AU()) && (!at.wF()) && (t.nl(paramString).length() > 0) && (paramString.equals(q.zE()))) {
      cgQ();
    }
    GMTrace.o(14483300810752L, 107909);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\conversation\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */