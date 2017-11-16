package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.content.Context;
import android.os.Handler;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.k;
import android.support.v7.widget.RecyclerView.t;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.br.a;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.m;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.p;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.s;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class c
  extends i
{
  public int pGl;
  private RecyclerView pGm;
  private b pGn;
  Map<Integer, a> pGo;
  public LinearLayoutManager pGp;
  public Set<Integer> pGq;
  
  public c(Context paramContext, m paramm, ViewGroup paramViewGroup)
  {
    super(paramContext, paramm, paramViewGroup);
    GMTrace.i(8276133543936L, 61662);
    this.pGl = a.fromDPToPix(paramContext, 12);
    this.pGo = new HashMap();
    this.pGq = new HashSet();
    GMTrace.o(8276133543936L, 61662);
  }
  
  private void bkE()
  {
    GMTrace.i(8276536197120L, 61665);
    if (this.pGp != null) {
      cY(this.pGp.eZ(), this.pGp.fa());
    }
    GMTrace.o(8276536197120L, 61665);
  }
  
  protected final int aXW()
  {
    GMTrace.i(8276267761664L, 61663);
    int i = i.g.pfg;
    GMTrace.o(8276267761664L, 61663);
    return i;
  }
  
  public final m bkB()
  {
    GMTrace.i(16043581898752L, 119534);
    m localm = (m)this.pGS;
    GMTrace.o(16043581898752L, 119534);
    return localm;
  }
  
  public final View bkC()
  {
    GMTrace.i(8276401979392L, 61664);
    this.pGm = ((RecyclerView)this.hqF.findViewById(i.f.pbI));
    this.pGm.setBackgroundColor(((m)this.pGS).backgroundColor);
    Object localObject = ((m)this.pGS).pEj.iterator();
    int i = 0;
    int j;
    do
    {
      if (!((Iterator)localObject).hasNext()) {
        break;
      }
      s locals = (s)((Iterator)localObject).next();
      if (!(locals instanceof p)) {
        break label270;
      }
      p localp = (p)locals;
      float f = locals.pEC;
      j = (int)(locals.pEB + f + localp.height) + (this.pGl << 1);
    } while (i > j);
    label270:
    for (;;)
    {
      i = j;
      continue;
      localObject = this.pGm.getLayoutParams();
      ((ViewGroup.LayoutParams)localObject).height = i;
      this.pGm.setLayoutParams((ViewGroup.LayoutParams)localObject);
      this.pGn = new b();
      this.pGm.a(this.pGn);
      this.pGp = new LinearLayoutManager();
      this.pGp.setOrientation(0);
      this.pGm.a(this.pGp);
      this.pGm.a(new c(this.pGm, this.pGp));
      this.pGm.setNestedScrollingEnabled(false);
      this.pGm.Tc = true;
      localObject = this.hqF;
      GMTrace.o(8276401979392L, 61664);
      return (View)localObject;
    }
  }
  
  public final void bkD()
  {
    GMTrace.i(16043716116480L, 119535);
    bkE();
    int i = this.pGp.eZ();
    int j = this.pGp.fa();
    Iterator localIterator = this.pGo.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      if ((((Integer)localEntry.getKey()).intValue() < i) || (((Integer)localEntry.getKey()).intValue() > j)) {
        ((a)localEntry.getValue()).bkF();
      }
    }
    GMTrace.o(16043716116480L, 119535);
  }
  
  public final void bkm()
  {
    GMTrace.i(8276804632576L, 61667);
    super.bkm();
    bkE();
    GMTrace.o(8276804632576L, 61667);
  }
  
  public final void bkn()
  {
    GMTrace.i(8276938850304L, 61668);
    super.bkn();
    if (this.pGp != null)
    {
      int i = this.pGp.eZ();
      int j = this.pGp.fa();
      while (i <= j)
      {
        a locala = (a)this.pGo.get(Integer.valueOf(i));
        if (locala != null) {
          locala.bkF();
        }
        i += 1;
      }
    }
    GMTrace.o(8276938850304L, 61668);
  }
  
  final void cY(int paramInt1, int paramInt2)
  {
    GMTrace.i(8276670414848L, 61666);
    while (paramInt1 <= paramInt2)
    {
      a locala2 = (a)this.pGo.get(Integer.valueOf(paramInt1));
      a locala1 = locala2;
      if (locala2 == null)
      {
        locala1 = new a();
        this.pGo.put(Integer.valueOf(paramInt1), locala1);
      }
      if (!locala1.isVisible)
      {
        locala1.isVisible = true;
        locala1.pGr = System.currentTimeMillis();
        locala1.count += 1;
      }
      paramInt1 += 1;
    }
    GMTrace.o(8276670414848L, 61666);
  }
  
  public final boolean q(JSONArray paramJSONArray)
  {
    GMTrace.i(8277073068032L, 61669);
    Object localObject1 = new JSONObject();
    if (super.L((JSONObject)localObject1)) {
      paramJSONArray.put(localObject1);
    }
    try
    {
      Object localObject2 = this.pGo;
      localObject1 = this.pGq;
      this.pGq = new HashSet();
      this.pGo = new HashMap();
      localObject2 = ((Map)localObject2).entrySet().iterator();
      while (((Iterator)localObject2).hasNext())
      {
        Object localObject4 = (Map.Entry)((Iterator)localObject2).next();
        Object localObject3 = (s)((m)this.pGS).pEj.get(((Integer)((Map.Entry)localObject4).getKey()).intValue());
        if ((!((s)localObject3).pEL) && ((localObject3 instanceof p)))
        {
          Object localObject5 = (p)localObject3;
          localObject3 = new JSONObject();
          ((JSONObject)localObject3).put("cid", ((s)((m)this.pGS).pEj.get(((Integer)((Map.Entry)localObject4).getKey()).intValue())).pEz);
          ((JSONObject)localObject3).put("exposureCount", ((a)((Map.Entry)localObject4).getValue()).count);
          ((JSONObject)localObject3).put("stayTime", ((a)((Map.Entry)localObject4).getValue()).time);
          if (((Set)localObject1).contains(((Map.Entry)localObject4).getKey()))
          {
            localObject4 = aa.RP(((p)localObject5).pEn);
            localObject5 = new JSONObject();
            ((JSONObject)localObject5).put("urlMd5", localObject4);
            ((JSONObject)localObject5).put("needDownload", 1);
            ((JSONObject)localObject3).put("imgUrlInfo", localObject5);
          }
          paramJSONArray.put(localObject3);
        }
      }
      GMTrace.o(8277073068032L, 61669);
    }
    catch (JSONException paramJSONArray)
    {
      w.e("AdLandingCarouselComp", bg.f(paramJSONArray));
      GMTrace.o(8277073068032L, 61669);
      return false;
    }
    return true;
  }
  
  private final class a
  {
    int count;
    boolean isVisible;
    long pGr;
    long time;
    
    public a()
    {
      GMTrace.i(8268080480256L, 61602);
      GMTrace.o(8268080480256L, 61602);
    }
    
    final void bkF()
    {
      GMTrace.i(8268214697984L, 61603);
      if (this.isVisible)
      {
        this.isVisible = false;
        if (this.pGr > 0L)
        {
          this.time += System.currentTimeMillis() - this.pGr;
          this.pGr = 0L;
        }
      }
      GMTrace.o(8268214697984L, 61603);
    }
  }
  
  private final class b
    extends RecyclerView.a<a>
  {
    public b()
    {
      GMTrace.i(8274657148928L, 61651);
      GMTrace.o(8274657148928L, 61651);
    }
    
    public final int getItemCount()
    {
      GMTrace.i(8274791366656L, 61652);
      int i = c.this.bkB().pEj.size();
      GMTrace.o(8274791366656L, 61652);
      return i;
    }
    
    final class a
      extends RecyclerView.t
    {
      public f pGt;
      
      public a(View paramView, f paramf)
      {
        super();
        GMTrace.i(8230902169600L, 61325);
        this.pGt = paramf;
        GMTrace.o(8230902169600L, 61325);
      }
    }
  }
  
  private final class c
    extends RecyclerView.k
  {
    public RecyclerView neA;
    public Runnable pGA;
    private LinearLayoutManager pGv;
    public int pGw;
    private int pGx;
    private int pGy;
    private long pGz;
    
    public c(RecyclerView paramRecyclerView, LinearLayoutManager paramLinearLayoutManager)
    {
      GMTrace.i(8269288439808L, 61611);
      this.pGw = Integer.MAX_VALUE;
      this.pGx = -1;
      this.pGy = -1;
      this.pGz = 0L;
      this.pGA = new Runnable()
      {
        public final void run()
        {
          GMTrace.i(8221372710912L, 61254);
          if (c.c.this.pGw == 1)
          {
            c.c localc = c.c.this;
            w.d("AdLandingCarouselComp", "onDraggin first visible " + localc.pGs.pGp.eZ() + ", last visible " + localc.pGs.pGp.fa());
            localc.pGs.bkD();
            c.c.this.neA.postDelayed(c.c.this.pGA, 100L);
          }
          GMTrace.o(8221372710912L, 61254);
        }
      };
      this.neA = paramRecyclerView;
      this.pGv = paramLinearLayoutManager;
      GMTrace.o(8269288439808L, 61611);
    }
    
    private void bkG()
    {
      GMTrace.i(8269422657536L, 61612);
      this.neA.getHandler().removeCallbacks(this.pGA);
      GMTrace.o(8269422657536L, 61612);
    }
    
    private void f(int paramInt1, int paramInt2, long paramLong)
    {
      int i = 1;
      GMTrace.i(8269825310720L, 61615);
      w.d("AdLandingCarouselComp", "flyingItems start %d, end %d, timeExposure %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Long.valueOf(paramLong) });
      c localc = c.this;
      if (paramInt1 > paramInt2)
      {
        w.e("AdLandingCarouselComp", "wtf start > end");
        GMTrace.o(8269825310720L, 61615);
        return;
      }
      localc.cY(paramInt1, paramInt2);
      if (paramInt2 == paramInt1) {}
      for (;;)
      {
        paramLong /= i;
        while (paramInt1 <= paramInt2)
        {
          c.a locala = (c.a)localc.pGo.get(Integer.valueOf(paramInt1));
          if ((locala != null) && (locala.isVisible))
          {
            locala.isVisible = false;
            locala.pGr = 0L;
            locala.time += paramLong;
          }
          paramInt1 += 1;
        }
        i = paramInt2 - paramInt1 + 1;
      }
      GMTrace.o(8269825310720L, 61615);
    }
    
    public final void c(RecyclerView paramRecyclerView, int paramInt1, int paramInt2)
    {
      GMTrace.i(8269691092992L, 61614);
      super.c(paramRecyclerView, paramInt1, paramInt2);
      GMTrace.o(8269691092992L, 61614);
    }
    
    public final void e(RecyclerView paramRecyclerView, int paramInt)
    {
      GMTrace.i(8269556875264L, 61613);
      super.e(paramRecyclerView, paramInt);
      if (paramInt != this.pGw)
      {
        if (paramInt != 1) {
          bkG();
        }
        switch (paramInt)
        {
        }
      }
      for (;;)
      {
        this.pGw = paramInt;
        w.d("AdLandingCarouselComp", "state " + paramInt);
        GMTrace.o(8269556875264L, 61613);
        return;
        c.this.bkD();
        if (this.pGw == 2)
        {
          int i = this.pGv.eZ();
          int j = this.pGv.fa();
          if (j < this.pGx)
          {
            f(j, this.pGx, System.currentTimeMillis() - this.pGz);
          }
          else if (i > this.pGy)
          {
            f(this.pGy, i, System.currentTimeMillis() - this.pGz);
            continue;
            bkG();
            this.neA.postDelayed(this.pGA, 100L);
            continue;
            this.pGx = this.pGv.eZ();
            this.pGy = this.pGv.fa();
            this.pGz = System.currentTimeMillis();
          }
        }
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\storage\AdLandingPagesStorage\AdLandingPageComponent\component\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */