package com.tencent.mm.plugin.sns.ui;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.messenger.foundation.a.a.c;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.model.ai;
import com.tencent.mm.plugin.sns.storage.m;
import com.tencent.mm.protocal.c.bfh;
import com.tencent.mm.protocal.c.biz;
import com.tencent.mm.protocal.c.oa;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.vending.base.Vending.d;
import com.tencent.mm.vending.f.a;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.Set;

public final class ax
  extends BaseAdapter
  implements x
{
  private static HashMap<Long, a> qhe;
  private boolean fYn;
  av qhc;
  public aw qhd;
  
  static
  {
    GMTrace.i(8318814781440L, 61980);
    qhe = new HashMap();
    GMTrace.o(8318814781440L, 61980);
  }
  
  public ax(MMActivity paramMMActivity, ListView paramListView, com.tencent.mm.plugin.sns.ui.b.b paramb, j paramj, String paramString)
  {
    GMTrace.i(8316533080064L, 61963);
    this.fYn = false;
    this.qhc = new av(paramMMActivity, paramListView, paramb, paramj, 10, this);
    this.qhc.pYh = true;
    this.qhd = new aw();
    paramListView = this.qhd;
    paramb = this.qhc;
    paramListView.mContext = paramMMActivity;
    paramListView.qgS = paramb;
    paramListView.pQl = paramString;
    com.tencent.mm.kernel.h.xz();
    paramListView.goW = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yK();
    paramMMActivity = this.qhd;
    a.i("Vending.ForwardVending", "Vending.setRangeSize(%s)", new Object[] { Integer.valueOf(10) });
    paramMMActivity.xxd = 10;
    this.qhd.addVendingDataChangedCallback(new Vending.d()
    {
      public final void bpH()
      {
        GMTrace.i(8712609595392L, 64914);
        ax.this.notifyDataSetChanged();
        GMTrace.o(8712609595392L, 64914);
      }
    });
    GMTrace.o(8316533080064L, 61963);
  }
  
  public static void C(m paramm)
  {
    GMTrace.i(8317741039616L, 61972);
    long l1;
    a locala;
    if (paramm != null)
    {
      l1 = paramm.field_snsId;
      if (!qhe.containsKey(Long.valueOf(l1)))
      {
        locala = new a();
        if ((paramm.blD() != null) && (paramm.blD().uUc != null) && (paramm.blD().uUc.ueV == 1) && (paramm.blD().uUc.ueW != null) && (paramm.blD().uUc.ueW.size() > 0))
        {
          locala.pwj = paramm.blD().uUc.ueW.size();
          locala.qhg = new HashSet();
          locala.qhh = new HashSet();
          locala.qhi = new HashSet();
          locala.qhj = new HashSet();
          locala.id = paramm.blD().mmR;
        }
      }
    }
    try
    {
      bfh localbfh = ai.n(paramm);
      locala.qhm = localbfh.uQO;
      locala.qhn = localbfh.uQR;
    }
    catch (Exception localException)
    {
      try
      {
        for (;;)
        {
          com.tencent.mm.kernel.h.xz();
          locala.lyJ = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aOf().Cp(paramm.field_userName);
          long l2 = System.currentTimeMillis();
          com.tencent.mm.kernel.h.xz();
          locala.qhl = ((l2 - ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aOf().Cv(paramm.field_userName)) / 1000L);
          qhe.put(Long.valueOf(l1), locala);
          GMTrace.o(8317741039616L, 61972);
          return;
          localException = localException;
          locala.qhm = 0;
          locala.qhn = 0;
        }
      }
      catch (Exception paramm)
      {
        for (;;)
        {
          locala.lyJ = 0;
          locala.qhl = 0L;
        }
      }
    }
  }
  
  public static void b(m paramm, int paramInt)
  {
    GMTrace.i(8317875257344L, 61973);
    if (paramm != null)
    {
      long l = paramm.field_snsId;
      if (qhe.containsKey(Long.valueOf(l)))
      {
        paramm = (a)qhe.get(Long.valueOf(l));
        if (paramm.qhk == 0) {
          paramm.qhk = (paramInt + 1);
        }
        if (paramm.qhg == null) {
          paramm.qhg = new HashSet();
        }
        paramm.qhg.add(Integer.valueOf(paramInt + 1));
      }
    }
    GMTrace.o(8317875257344L, 61973);
  }
  
  public static void bpG()
  {
    GMTrace.i(8318412128256L, 61977);
    Iterator localIterator = qhe.entrySet().iterator();
    while (localIterator.hasNext())
    {
      a locala = (a)((Map.Entry)localIterator.next()).getValue();
      locala.networkType = i.bhU();
      w.d("MicroMsg.SnsTimeLineVendingAdapter", "report big pic click, picNum:%d, clickPicNum:%d, firstClickPos:%d, networkType:%d, id:%s", new Object[] { Integer.valueOf(locala.pwj), Integer.valueOf(locala.qhg.size()), Integer.valueOf(locala.qhk), Integer.valueOf(locala.networkType), locala.id });
      Object localObject1 = locala.qhh.iterator();
      for (String str = ""; ((Iterator)localObject1).hasNext(); str = str + localObject2 + "|") {
        localObject2 = (Integer)((Iterator)localObject1).next();
      }
      localObject1 = str;
      if (str.length() >= 2) {
        localObject1 = str.substring(0, str.length() - 1);
      }
      Object localObject2 = locala.qhi.iterator();
      for (str = ""; ((Iterator)localObject2).hasNext(); str = str + localObject3 + "|") {
        localObject3 = (Integer)((Iterator)localObject2).next();
      }
      localObject2 = str;
      if (str.length() >= 2) {
        localObject2 = str.substring(0, str.length() - 1);
      }
      Object localObject3 = locala.qhj.iterator();
      Integer localInteger;
      for (str = ""; ((Iterator)localObject3).hasNext(); str = str + localInteger + "|") {
        localInteger = (Integer)((Iterator)localObject3).next();
      }
      localObject3 = str;
      if (str.length() >= 2) {
        localObject3 = str.substring(0, str.length() - 1);
      }
      g.ork.i(11599, new Object[] { Integer.valueOf(locala.pwj), Integer.valueOf(locala.qhg.size()), Integer.valueOf(locala.qhk), Integer.valueOf(locala.networkType), Integer.valueOf(0), locala.id, Long.valueOf(locala.qhl), Integer.valueOf(locala.lyJ), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(locala.qhm), Integer.valueOf(locala.qhn), Integer.valueOf(0), localObject1, localObject2, localObject3 });
    }
    qhe.clear();
    GMTrace.o(8318412128256L, 61977);
  }
  
  public static void c(m paramm, int paramInt)
  {
    GMTrace.i(8318009475072L, 61974);
    if (paramm != null)
    {
      long l = paramm.field_snsId;
      if (qhe.containsKey(Long.valueOf(l)))
      {
        paramm = (a)qhe.get(Long.valueOf(l));
        if (paramm.qhh == null) {
          paramm.qhh = new HashSet();
        }
        if (!paramm.qhh.contains(Integer.valueOf(paramInt + 1))) {
          paramm.qhh.add(Integer.valueOf(paramInt + 1));
        }
      }
    }
    GMTrace.o(8318009475072L, 61974);
  }
  
  public static void d(m paramm, int paramInt)
  {
    GMTrace.i(8318143692800L, 61975);
    if (paramm != null)
    {
      long l = paramm.field_snsId;
      if (qhe.containsKey(Long.valueOf(l)))
      {
        paramm = (a)qhe.get(Long.valueOf(l));
        if (paramm.qhi == null) {
          paramm.qhi = new HashSet();
        }
        if (!paramm.qhi.contains(Integer.valueOf(paramInt + 1))) {
          paramm.qhi.add(Integer.valueOf(paramInt + 1));
        }
      }
    }
    GMTrace.o(8318143692800L, 61975);
  }
  
  public static void e(m paramm, int paramInt)
  {
    GMTrace.i(8318277910528L, 61976);
    if (paramm != null)
    {
      long l = paramm.field_snsId;
      if (qhe.containsKey(Long.valueOf(l)))
      {
        paramm = (a)qhe.get(Long.valueOf(l));
        if (paramm.qhj == null) {
          paramm.qhj = new HashSet();
        }
        if (!paramm.qhj.contains(Integer.valueOf(paramInt + 1))) {
          paramm.qhj.add(Integer.valueOf(paramInt + 1));
        }
      }
    }
    GMTrace.o(8318277910528L, 61976);
  }
  
  public final void bny()
  {
    GMTrace.i(8317204168704L, 61968);
    this.qhd.notifyVendingDataChange();
    GMTrace.o(8317204168704L, 61968);
  }
  
  public final int getCount()
  {
    GMTrace.i(8317606821888L, 61971);
    int i = this.qhd.mCount;
    GMTrace.o(8317606821888L, 61971);
    return i;
  }
  
  public final long getItemId(int paramInt)
  {
    GMTrace.i(8317472604160L, 61970);
    GMTrace.o(8317472604160L, 61970);
    return 0L;
  }
  
  public final int getItemViewType(int paramInt)
  {
    GMTrace.i(8317069950976L, 61967);
    paramInt = this.qhc.getItemViewType(paramInt);
    GMTrace.o(8317069950976L, 61967);
    return paramInt;
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    GMTrace.i(8316801515520L, 61965);
    paramView = this.qhc.g(paramInt, paramView);
    GMTrace.o(8316801515520L, 61965);
    return paramView;
  }
  
  public final int getViewTypeCount()
  {
    GMTrace.i(8316935733248L, 61966);
    GMTrace.o(8316935733248L, 61966);
    return 12;
  }
  
  public final void load()
  {
    GMTrace.i(8316667297792L, 61964);
    if (this.fYn)
    {
      GMTrace.o(8316667297792L, 61964);
      return;
    }
    this.fYn = true;
    this.qhd.notifyVendingDataChangeSynchronize();
    GMTrace.o(8316667297792L, 61964);
  }
  
  public final m vf(int paramInt)
  {
    GMTrace.i(8317338386432L, 61969);
    Object localObject = (ay)this.qhd.get(paramInt);
    if (localObject == null)
    {
      GMTrace.o(8317338386432L, 61969);
      return null;
    }
    localObject = ((ay)localObject).oWL;
    GMTrace.o(8317338386432L, 61969);
    return (m)localObject;
  }
  
  static final class a
  {
    String id;
    int lyJ;
    int networkType;
    int pwj;
    HashSet<Integer> qhg;
    HashSet<Integer> qhh;
    HashSet<Integer> qhi;
    HashSet<Integer> qhj;
    int qhk;
    long qhl;
    int qhm;
    int qhn;
    
    a()
    {
      GMTrace.i(8540005597184L, 63628);
      GMTrace.o(8540005597184L, 63628);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\ui\ax.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */