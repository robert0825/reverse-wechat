package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget;

import android.os.Handler;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.k;
import com.tencent.gmtrace.GMTrace;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class b
{
  private RecyclerView neA;
  public Map<Integer, a> pGo;
  private LinearLayoutManager pGp;
  public b pJU;
  private com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.a.b pJV;
  
  public b(RecyclerView paramRecyclerView, com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.a.b paramb)
  {
    GMTrace.i(17099472764928L, 127401);
    this.pGo = new HashMap();
    this.neA = paramRecyclerView;
    this.pJV = paramb;
    if ((paramRecyclerView.SW == null) || (!(paramRecyclerView.SW instanceof LinearLayoutManager))) {
      throw new IllegalArgumentException("set LinearLayoutManger to RecyclerView first");
    }
    if ((paramRecyclerView.fl() == null) || (!(paramRecyclerView.fl() instanceof b))) {
      throw new IllegalArgumentException("set Adapter which implemented ExposureListener to RecyclerView first");
    }
    this.pJU = ((b)paramRecyclerView.fl());
    this.pGp = ((LinearLayoutManager)paramRecyclerView.SW);
    this.neA.a(new c(paramRecyclerView, (LinearLayoutManager)paramRecyclerView.SW));
    GMTrace.o(17099472764928L, 127401);
  }
  
  public final void bkD()
  {
    GMTrace.i(17099606982656L, 127402);
    bkE();
    int i = this.pGp.eZ();
    int j = this.pGp.fa();
    Iterator localIterator = this.pGo.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      if ((((Integer)localEntry.getKey()).intValue() < i) || (((Integer)localEntry.getKey()).intValue() > j))
      {
        if (((a)localEntry.getValue()).pDL)
        {
          this.pJU.uP(((Integer)localEntry.getKey()).intValue());
          ((a)localEntry.getValue()).bkF();
        }
      }
      else if ((((a)localEntry.getValue()).pDL) && (!this.pJU.uQ(((Integer)localEntry.getKey()).intValue())))
      {
        this.pJU.uP(((Integer)localEntry.getKey()).intValue());
        ((a)localEntry.getValue()).bkF();
      }
    }
    GMTrace.o(17099606982656L, 127402);
  }
  
  public final void bkE()
  {
    GMTrace.i(17099741200384L, 127403);
    if (this.pGp != null)
    {
      int i = this.pGp.eZ();
      int j = this.pGp.fa();
      if ((i == j) && (i == -1))
      {
        GMTrace.o(17099741200384L, 127403);
        return;
      }
      cY(i, j);
    }
    GMTrace.o(17099741200384L, 127403);
  }
  
  public final void blg()
  {
    GMTrace.i(17100009635840L, 127405);
    int i;
    int j;
    if (this.pGp != null)
    {
      i = this.pGp.eZ();
      j = this.pGp.fa();
      if ((i != j) || (i != -1)) {
        break label113;
      }
      GMTrace.o(17100009635840L, 127405);
    }
    label113:
    for (;;)
    {
      if (i <= j)
      {
        a locala = (a)this.pGo.get(Integer.valueOf(i));
        if ((locala != null) && (locala.pDL))
        {
          this.pJU.uP(i);
          locala.bkF();
        }
        i += 1;
      }
      else
      {
        GMTrace.o(17100009635840L, 127405);
        return;
      }
    }
  }
  
  final void cY(int paramInt1, int paramInt2)
  {
    GMTrace.i(17099875418112L, 127404);
    while (paramInt1 <= paramInt2)
    {
      a locala2 = (a)this.pGo.get(Integer.valueOf(paramInt1));
      a locala1 = locala2;
      if (locala2 == null)
      {
        locala1 = new a();
        this.pGo.put(Integer.valueOf(paramInt1), locala1);
      }
      if ((!locala1.pDL) && (this.pJU.uQ(paramInt1)))
      {
        this.pJU.a(paramInt1, this);
        if (!locala1.pDL) {
          locala1.pDL = true;
        }
      }
      paramInt1 += 1;
    }
    GMTrace.o(17099875418112L, 127404);
  }
  
  private final class a
  {
    public boolean pDL;
    
    public a()
    {
      GMTrace.i(17100143853568L, 127406);
      GMTrace.o(17100143853568L, 127406);
    }
    
    final void bkF()
    {
      GMTrace.i(17100278071296L, 127407);
      if (this.pDL) {
        this.pDL = false;
      }
      GMTrace.o(17100278071296L, 127407);
    }
  }
  
  public static abstract interface b
  {
    public abstract void a(int paramInt, b paramb);
    
    public abstract void onDestroy();
    
    public abstract void uP(int paramInt);
    
    public abstract boolean uQ(int paramInt);
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
      GMTrace.i(17098667458560L, 127395);
      this.pGw = Integer.MAX_VALUE;
      this.pGx = -1;
      this.pGy = -1;
      this.pGz = 0L;
      this.pGA = new Runnable()
      {
        public final void run()
        {
          GMTrace.i(17123766173696L, 127582);
          if (b.c.this.pGw == 1)
          {
            b.this.bkD();
            b.c.this.neA.postDelayed(b.c.this.pGA, 100L);
          }
          GMTrace.o(17123766173696L, 127582);
        }
      };
      this.neA = paramRecyclerView;
      this.pGv = paramLinearLayoutManager;
      GMTrace.o(17098667458560L, 127395);
    }
    
    private void bkG()
    {
      GMTrace.i(17098801676288L, 127396);
      this.neA.getHandler().removeCallbacks(this.pGA);
      GMTrace.o(17098801676288L, 127396);
    }
    
    private void cZ(int paramInt1, int paramInt2)
    {
      GMTrace.i(17099204329472L, 127399);
      b localb = b.this;
      if (paramInt1 <= paramInt2)
      {
        localb.cY(paramInt1, paramInt2);
        while (paramInt1 <= paramInt2)
        {
          b.a locala = (b.a)localb.pGo.get(Integer.valueOf(paramInt1));
          if ((locala != null) && (locala.pDL))
          {
            localb.pJU.uP(paramInt1);
            locala.bkF();
          }
          paramInt1 += 1;
        }
      }
      GMTrace.o(17099204329472L, 127399);
    }
    
    public final void c(RecyclerView paramRecyclerView, int paramInt1, int paramInt2)
    {
      GMTrace.i(17099070111744L, 127398);
      super.c(paramRecyclerView, paramInt1, paramInt2);
      GMTrace.o(17099070111744L, 127398);
    }
    
    public final void e(RecyclerView paramRecyclerView, int paramInt)
    {
      GMTrace.i(17098935894016L, 127397);
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
        GMTrace.o(17098935894016L, 127397);
        return;
        b.this.bkD();
        if (this.pGw == 2)
        {
          int i = this.pGv.eZ();
          int j = this.pGv.fa();
          if (j < this.pGx)
          {
            cZ(j, this.pGx);
          }
          else if (i > this.pGy)
          {
            cZ(this.pGy, i);
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


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\storage\AdLandingPagesStorage\AdLandingPageComponent\component\widget\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */