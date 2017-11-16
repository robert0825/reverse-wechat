package com.tencent.mm.plugin.favorite.ui.a;

import android.content.Context;
import android.content.res.Resources;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView.LayoutParams;
import android.widget.AdapterView;
import android.widget.CheckBox;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.l;
import com.tencent.mm.g.a.jn;
import com.tencent.mm.plugin.favorite.b.x;
import com.tencent.mm.plugin.favorite.ui.c.a.b;
import com.tencent.mm.plugin.favorite.ui.c.a.c;
import com.tencent.mm.plugin.favorite.ui.c.d;
import com.tencent.mm.plugin.favorite.ui.c.f;
import com.tencent.mm.plugin.favorite.ui.c.i;
import com.tencent.mm.plugin.favorite.ui.c.l;
import com.tencent.mm.plugin.favorite.ui.c.m;
import com.tencent.mm.plugin.favorite.ui.c.n;
import com.tencent.mm.plugin.favorite.ui.c.o;
import com.tencent.mm.plugin.favorite.ui.c.p;
import com.tencent.mm.plugin.favorite.ui.c.q;
import com.tencent.mm.plugin.favorite.ui.c.r;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public final class b
  extends a
{
  private com.tencent.mm.sdk.b.c ian;
  private boolean lfS;
  public List<com.tencent.mm.plugin.favorite.b.j> lfT;
  private List<com.tencent.mm.plugin.favorite.b.j> lfU;
  private List<com.tencent.mm.plugin.favorite.b.j> lfV;
  public List<Long> lfW;
  public boolean lfX;
  private Map<Long, com.tencent.mm.plugin.favorite.b.j> lfY;
  private List<Integer> lfZ;
  private List<String> lga;
  private List<String> lgb;
  private SparseArray<com.tencent.mm.plugin.favorite.ui.c.a> lgc;
  private boolean lgd;
  public a.c lge;
  public boolean lgf;
  public boolean lgg;
  
  public b(com.tencent.mm.plugin.favorite.c.g paramg, boolean paramBoolean)
  {
    GMTrace.i(6328902746112L, 47154);
    this.lfS = false;
    this.lfT = new ArrayList();
    this.lfU = new ArrayList();
    this.lfV = new LinkedList();
    this.lfW = new ArrayList();
    this.lfX = false;
    this.lfY = new TreeMap();
    this.lfZ = new ArrayList();
    this.lga = new LinkedList();
    this.lgb = new LinkedList();
    this.lgc = new SparseArray();
    this.lgd = false;
    this.lgf = false;
    this.lgg = false;
    this.ian = new com.tencent.mm.sdk.b.c() {};
    this.type = -1;
    this.lgc.put(1, new m(paramg));
    this.lgc.put(2, new d(paramg));
    this.lgc.put(3, new q(paramg));
    this.lgc.put(4, new p(paramg));
    this.lgc.put(5, new o(paramg));
    this.lgc.put(6, new f(paramg));
    this.lgc.put(7, new com.tencent.mm.plugin.favorite.ui.c.h(paramg));
    this.lgc.put(8, new com.tencent.mm.plugin.favorite.ui.c.c(paramg));
    this.lgc.put(10, new i(paramg));
    this.lgc.put(12, new l(paramg));
    this.lgc.put(15, new l(paramg));
    this.lgc.put(11, new com.tencent.mm.plugin.favorite.ui.c.g(paramg));
    this.lgc.put(14, new com.tencent.mm.plugin.favorite.ui.c.j(paramg));
    this.lgc.put(16, new com.tencent.mm.plugin.favorite.ui.c.k(paramg));
    this.lgc.put(17, new com.tencent.mm.plugin.favorite.ui.c.b(paramg));
    this.lgc.put(18, new r(paramg));
    this.lgc.put(-2, new n(paramg));
    if (paramBoolean != this.lgf)
    {
      this.lgf = paramBoolean;
      if (paramBoolean) {
        this.lfY.clear();
      }
    }
    if (!this.lgf) {
      ayQ();
    }
    ayR();
    notifyDataSetChanged();
    com.tencent.mm.sdk.b.a.vgX.c(this.ian);
    com.tencent.mm.sdk.b.a.vgX.b(this.ian);
    GMTrace.o(6328902746112L, 47154);
  }
  
  private boolean ayS()
  {
    GMTrace.i(6329305399296L, 47157);
    if ((!this.lga.isEmpty()) || (!this.lgb.isEmpty()) || (!this.lfZ.isEmpty()))
    {
      GMTrace.o(6329305399296L, 47157);
      return true;
    }
    GMTrace.o(6329305399296L, 47157);
    return false;
  }
  
  public final void a(boolean paramBoolean, com.tencent.mm.plugin.favorite.b.j paramj)
  {
    GMTrace.i(6329439617024L, 47158);
    if (paramBoolean == this.lfX)
    {
      GMTrace.o(6329439617024L, 47158);
      return;
    }
    this.lfX = paramBoolean;
    if (paramBoolean)
    {
      this.lfY.clear();
      if (paramj != null)
      {
        paramj = com.tencent.mm.plugin.favorite.h.axB().cf(paramj.field_localId);
        if (paramj != null) {
          this.lfY.put(Long.valueOf(paramj.field_localId), paramj);
        }
      }
    }
    notifyDataSetChanged();
    GMTrace.o(6329439617024L, 47158);
  }
  
  public final void ayQ()
  {
    GMTrace.i(6329171181568L, 47156);
    if (ayS())
    {
      w.v("MicroMsg.FavoriteAdapter", "searching, do not load more data");
      GMTrace.o(6329171181568L, 47156);
      return;
    }
    if (x.ayb())
    {
      w.w("MicroMsg.FavoriteAdapter", "want to load more data, but now doing batchget");
      GMTrace.o(6329171181568L, 47156);
      return;
    }
    if (!this.lgf) {
      try
      {
        this.lastUpdateTime = x.q(this.lastUpdateTime, this.type);
        GMTrace.o(6329171181568L, 47156);
        return;
      }
      catch (Exception localException)
      {
        w.printErrStackTrace("MicroMsg.FavoriteAdapter", localException, "", new Object[0]);
        GMTrace.o(6329171181568L, 47156);
        return;
      }
    }
    this.lfU = x.f(this.lfT, this.lfW);
    this.lfS = true;
    GMTrace.o(6329171181568L, 47156);
  }
  
  public final void ayR()
  {
    GMTrace.i(6330110705664L, 47163);
    w.v("MicroMsg.FavoriteAdapter", "reset data list beg");
    this.lfS = false;
    List localList = this.lfU;
    if (localList != null)
    {
      w.d("MicroMsg.FavoriteAdapter", "before do recycle, need recycle list size[%d]", new Object[] { Integer.valueOf(localList.size()) });
      w.d("MicroMsg.FavoriteAdapter", "after do recycle, current can reused list size[%d]", new Object[] { Integer.valueOf(this.lfV.size()) });
      localList.clear();
    }
    if (!ayS())
    {
      w.i("MicroMsg.FavoriteAdapter", "on reset data list, last update time is %d, type is %d", new Object[] { Long.valueOf(this.lastUpdateTime), Integer.valueOf(this.type) });
      if (!this.lgf)
      {
        this.lfU = x.b(this.lastUpdateTime, this.type, this.lfP, this.lfQ);
        if ((this.lfU != null) && (this.lastUpdateTime == 0L) && (this.lfU.size() > 0)) {
          this.lastUpdateTime = ((com.tencent.mm.plugin.favorite.b.j)this.lfU.get(this.lfU.size() - 1)).field_updateTime;
        }
      }
      for (;;)
      {
        if (this.lfU == null)
        {
          w.w("MicroMsg.FavoriteAdapter", "reset data list fail, get null list, new empty one");
          this.lfU = new ArrayList();
        }
        if ((!this.lgf) && (!ayS()) && (this.lfU.size() < 20) && (!com.tencent.mm.plugin.favorite.h.axB().n(this.lastUpdateTime, this.type)))
        {
          w.v("MicroMsg.FavoriteAdapter", "least than page count, loadMoreData");
          ayQ();
        }
        this.lfS = true;
        w.v("MicroMsg.FavoriteAdapter", "reset data list end");
        GMTrace.o(6330110705664L, 47163);
        return;
        this.lfW = x.aym();
        this.lfU = x.f(null, this.lfW);
      }
    }
    w.i("MicroMsg.FavoriteAdapter", "on reset data list, do search, searchStr:%s, tagStr:%s, searchTypes:%s", new Object[] { this.lga, this.lgb, this.lfZ });
    this.lfU = x.a(this.lga, this.lgb, this.lfZ, this.lfV, this.lfP, this.lfQ);
    if (this.lfU == null) {}
    for (int i = 0;; i = this.lfU.size())
    {
      com.tencent.mm.plugin.report.service.g.ork.i(10649, new Object[] { Integer.valueOf(i) });
      break;
    }
  }
  
  public final int ayT()
  {
    GMTrace.i(6329708052480L, 47160);
    int i = this.lfY.size();
    GMTrace.o(6329708052480L, 47160);
    return i;
  }
  
  public final long ayU()
  {
    GMTrace.i(6329842270208L, 47161);
    Iterator localIterator = this.lfY.values().iterator();
    long l = 0L;
    if (localIterator.hasNext())
    {
      com.tencent.mm.plugin.favorite.b.j localj = (com.tencent.mm.plugin.favorite.b.j)localIterator.next();
      if (localj == null) {
        break label73;
      }
      l = localj.field_datatotalsize + l;
    }
    label73:
    for (;;)
    {
      break;
      GMTrace.o(6329842270208L, 47161);
      return l;
    }
  }
  
  public final void b(List<Integer> paramList, List<String> paramList1, List<String> paramList2)
  {
    GMTrace.i(6329976487936L, 47162);
    this.lfZ.clear();
    if (paramList != null) {
      this.lfZ.addAll(paramList);
    }
    this.lga.clear();
    if (paramList1 != null) {
      this.lga.addAll(paramList1);
    }
    this.lgb.clear();
    if (paramList2 != null) {
      this.lgb.addAll(paramList2);
    }
    this.lgd = true;
    ayR();
    this.lgd = false;
    GMTrace.o(6329976487936L, 47162);
  }
  
  public final int cw(long paramLong)
  {
    GMTrace.i(6331318665216L, 47172);
    Object localObject = com.tencent.mm.plugin.favorite.h.axB().cf(paramLong);
    if (localObject == null)
    {
      GMTrace.o(6331318665216L, 47172);
      return -1;
    }
    if (this.lfY.size() >= 30)
    {
      w.w("MicroMsg.FavoriteAdapter", "call select item, match max select count %d", new Object[] { Integer.valueOf(30) });
      com.tencent.mm.ui.base.h.bm(ab.getContext(), ab.getContext().getResources().getString(R.l.dub, new Object[] { Integer.valueOf(30) }));
      GMTrace.o(6331318665216L, 47172);
      return -1;
    }
    this.lfY.put(Long.valueOf(paramLong), localObject);
    int i;
    if (((com.tencent.mm.plugin.favorite.b.j)localObject).field_updateTime < this.lastUpdateTime)
    {
      this.lastUpdateTime = ((com.tencent.mm.plugin.favorite.b.j)localObject).field_updateTime;
      ayR();
      localObject = this.lfU.iterator();
      i = 0;
      while (((Iterator)localObject).hasNext())
      {
        if (((com.tencent.mm.plugin.favorite.b.j)((Iterator)localObject).next()).field_localId == paramLong)
        {
          notifyDataSetChanged();
          GMTrace.o(6331318665216L, 47172);
          return i;
        }
        i += 1;
      }
      notifyDataSetChanged();
    }
    for (;;)
    {
      GMTrace.o(6331318665216L, 47172);
      return -1;
      localObject = this.lfT.iterator();
      i = 0;
      while (((Iterator)localObject).hasNext())
      {
        if (((com.tencent.mm.plugin.favorite.b.j)((Iterator)localObject).next()).field_localId == paramLong)
        {
          notifyDataSetChanged();
          GMTrace.o(6331318665216L, 47172);
          return i;
        }
        i += 1;
      }
    }
  }
  
  public final List<com.tencent.mm.plugin.favorite.b.j> ex(boolean paramBoolean)
  {
    GMTrace.i(6329573834752L, 47159);
    LinkedList localLinkedList = new LinkedList();
    Iterator localIterator = this.lfY.values().iterator();
    while (localIterator.hasNext())
    {
      com.tencent.mm.plugin.favorite.b.j localj = (com.tencent.mm.plugin.favorite.b.j)localIterator.next();
      if (localj != null) {
        localLinkedList.add(localj);
      }
    }
    if (paramBoolean) {
      this.lfY.clear();
    }
    GMTrace.o(6329573834752L, 47159);
    return localLinkedList;
  }
  
  public final void finish()
  {
    GMTrace.i(6329036963840L, 47155);
    com.tencent.mm.sdk.b.a.vgX.c(this.ian);
    GMTrace.o(6329036963840L, 47155);
  }
  
  public final int getCount()
  {
    GMTrace.i(6331184447488L, 47171);
    int i = this.lfT.size();
    GMTrace.o(6331184447488L, 47171);
    return i + 1;
  }
  
  public final long getItemId(int paramInt)
  {
    GMTrace.i(6331050229760L, 47170);
    long l = paramInt;
    GMTrace.o(6331050229760L, 47170);
    return l;
  }
  
  public final int getItemViewType(int paramInt)
  {
    GMTrace.i(6330513358848L, 47166);
    if (paramInt == 0)
    {
      GMTrace.o(6330513358848L, 47166);
      return 0;
    }
    com.tencent.mm.plugin.favorite.b.j localj = nE(paramInt - 1);
    switch (localj.field_type)
    {
    case 9: 
    case 13: 
    default: 
      w.w("MicroMsg.FavoriteAdapter", "get item view type unknown, %d", new Object[] { Integer.valueOf(localj.field_type) });
      GMTrace.o(6330513358848L, 47166);
      return -2;
    }
    paramInt = localj.field_type;
    GMTrace.o(6330513358848L, 47166);
    return paramInt;
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    GMTrace.i(6330781794304L, 47168);
    if (paramInt == 0)
    {
      paramView = new View(paramViewGroup.getContext());
      paramView.setLayoutParams(new AbsListView.LayoutParams(0, 0));
      paramView.setBackgroundResource(R.e.aNF);
      paramView.setPadding(0, 0, 0, 0);
      paramView.setEnabled(false);
      GMTrace.o(6330781794304L, 47168);
      return paramView;
    }
    com.tencent.mm.plugin.favorite.b.j localj = nE(paramInt - 1);
    com.tencent.mm.plugin.favorite.ui.c.a locala = (com.tencent.mm.plugin.favorite.ui.c.a)this.lgc.get(localj.field_type);
    if (locala == null)
    {
      w.w("MicroMsg.FavoriteAdapter", "unknown type %d, use unknown item creator", new Object[] { Integer.valueOf(localj.field_type) });
      locala = (com.tencent.mm.plugin.favorite.ui.c.a)this.lgc.get(-2);
      ayP();
      paramView = locala.a(paramView, paramViewGroup, localj);
      GMTrace.o(6330781794304L, 47168);
      return paramView;
    }
    locala.ljH.jul = ayS();
    locala.ljH.lastUpdateTime = this.lastUpdateTime;
    locala.ljH.lfX = this.lfX;
    locala.ljH.lfY = this.lfY;
    locala.ljH.ljJ = this.lge;
    locala.ljH.lgf = this.lgf;
    paramView = locala.a(paramView, paramViewGroup, localj);
    GMTrace.o(6330781794304L, 47168);
    return paramView;
  }
  
  public final int getViewTypeCount()
  {
    GMTrace.i(6330647576576L, 47167);
    int i = this.lgc.size();
    GMTrace.o(6330647576576L, 47167);
    return i + 3;
  }
  
  public final boolean isEmpty()
  {
    GMTrace.i(6330244923392L, 47164);
    boolean bool = this.lfT.isEmpty();
    GMTrace.o(6330244923392L, 47164);
    return bool;
  }
  
  public final com.tencent.mm.plugin.favorite.b.j nE(int paramInt)
  {
    GMTrace.i(6330916012032L, 47169);
    if ((paramInt < 0) || (paramInt >= this.lfT.size()))
    {
      w.e("MicroMsg.FavoriteAdapter", "get item, but position error");
      localj = new com.tencent.mm.plugin.favorite.b.j();
      GMTrace.o(6330916012032L, 47169);
      return localj;
    }
    com.tencent.mm.plugin.favorite.b.j localj = (com.tencent.mm.plugin.favorite.b.j)this.lfT.get(paramInt);
    GMTrace.o(6330916012032L, 47169);
    return localj;
  }
  
  public final void notifyDataSetChanged()
  {
    GMTrace.i(6330379141120L, 47165);
    w.v("MicroMsg.FavoriteAdapter", "on notify data set changed requset, can exchange tempList[%B]", new Object[] { Boolean.valueOf(this.lfS) });
    if (this.lfS)
    {
      if ((this.lgf) && (this.lfU != null) && (this.lfT != null) && (this.lfU.size() == this.lfT.size())) {
        this.lgg = true;
      }
      List localList = this.lfT;
      this.lfT = this.lfU;
      this.lfU = localList;
      this.lfS = false;
    }
    w.v("MicroMsg.FavoriteAdapter", "on notify data set changed end");
    super.notifyDataSetChanged();
    GMTrace.o(6330379141120L, 47165);
  }
  
  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    GMTrace.i(6331452882944L, 47173);
    paramAdapterView = (a.b)paramView.getTag();
    if (paramAdapterView == null)
    {
      w.w("MicroMsg.FavoriteAdapter", "on item click, holder is null");
      GMTrace.o(6331452882944L, 47173);
      return;
    }
    if (paramAdapterView.lcn == null)
    {
      w.w("MicroMsg.FavoriteAdapter", "on item click, info is null");
      GMTrace.o(6331452882944L, 47173);
      return;
    }
    if ((this.lfX) || (this.lgf))
    {
      if ((!paramAdapterView.hqJ.isChecked()) && (this.lfY.size() >= 30))
      {
        w.w("MicroMsg.FavoriteAdapter", "call select item, match max select count %d", new Object[] { Integer.valueOf(30) });
        com.tencent.mm.ui.base.h.bm(ab.getContext(), ab.getContext().getResources().getString(R.l.dub, new Object[] { Integer.valueOf(30) }));
        GMTrace.o(6331452882944L, 47173);
        return;
      }
      paramView = paramAdapterView.hqJ;
      if (!paramAdapterView.hqJ.isChecked()) {}
      for (boolean bool = true;; bool = false)
      {
        paramView.setChecked(bool);
        GMTrace.o(6331452882944L, 47173);
        return;
      }
    }
    com.tencent.mm.plugin.favorite.ui.c.a locala = (com.tencent.mm.plugin.favorite.ui.c.a)this.lgc.get(paramAdapterView.lcn.field_type);
    if (locala != null)
    {
      locala.cj(paramView);
      w.d("MicroMsg.FavoriteAdapter", "item click type %s", new Object[] { Integer.valueOf(paramAdapterView.lcn.field_type) });
    }
    GMTrace.o(6331452882944L, 47173);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\favorite\ui\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */