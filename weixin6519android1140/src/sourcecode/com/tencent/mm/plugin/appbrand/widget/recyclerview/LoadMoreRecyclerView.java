package com.tencent.mm.plugin.appbrand.widget.recyclerview;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.c;
import android.support.v7.widget.RecyclerView.h;
import android.support.v7.widget.RecyclerView.k;
import android.util.AttributeSet;
import android.view.View;
import com.tencent.gmtrace.GMTrace;

public class LoadMoreRecyclerView
  extends MRecyclerView
{
  private View iTF;
  public a iTG;
  boolean iTH;
  
  public LoadMoreRecyclerView(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(10034788433920L, 74765);
    init();
    GMTrace.o(10034788433920L, 74765);
  }
  
  public LoadMoreRecyclerView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(10034922651648L, 74766);
    init();
    GMTrace.o(10034922651648L, 74766);
  }
  
  public LoadMoreRecyclerView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(10035056869376L, 74767);
    init();
    GMTrace.o(10035056869376L, 74767);
  }
  
  private void init()
  {
    GMTrace.i(10035325304832L, 74769);
    final LinearLayoutManager localLinearLayoutManager = abm();
    super.a(localLinearLayoutManager);
    a(new RecyclerView.k()
    {
      int iTI;
      
      public final void c(RecyclerView paramAnonymousRecyclerView, int paramAnonymousInt1, int paramAnonymousInt2)
      {
        GMTrace.i(10039754489856L, 74802);
        super.c(paramAnonymousRecyclerView, paramAnonymousInt1, paramAnonymousInt2);
        this.iTI = localLinearLayoutManager.fa();
        GMTrace.o(10039754489856L, 74802);
      }
      
      public final void e(RecyclerView paramAnonymousRecyclerView, int paramAnonymousInt)
      {
        GMTrace.i(10039620272128L, 74801);
        super.e(paramAnonymousRecyclerView, paramAnonymousInt);
        if ((paramAnonymousInt == 0) && (LoadMoreRecyclerView.this.iTH) && (this.iTI == LoadMoreRecyclerView.this.iTL.getItemCount() - 1) && (LoadMoreRecyclerView.a(LoadMoreRecyclerView.this) != null))
        {
          paramAnonymousRecyclerView = LoadMoreRecyclerView.a(LoadMoreRecyclerView.this);
          RecyclerView.a locala = LoadMoreRecyclerView.this.iTL.SV;
          paramAnonymousRecyclerView.aaX();
        }
        GMTrace.o(10039620272128L, 74801);
      }
    });
    this.iTL.a(new RecyclerView.c()
    {
      public final void V(int paramAnonymousInt1, int paramAnonymousInt2)
      {
        GMTrace.i(10036130611200L, 74775);
        super.V(paramAnonymousInt1, paramAnonymousInt2);
        if ((LoadMoreRecyclerView.this.iTH) && (localLinearLayoutManager.fa() == LoadMoreRecyclerView.this.iTL.getItemCount() - 1) && (LoadMoreRecyclerView.a(LoadMoreRecyclerView.this) != null))
        {
          LoadMoreRecyclerView.a locala = LoadMoreRecyclerView.a(LoadMoreRecyclerView.this);
          RecyclerView.a locala1 = LoadMoreRecyclerView.this.iTL.SV;
          locala.aaX();
        }
        GMTrace.o(10036130611200L, 74775);
      }
    });
    GMTrace.o(10035325304832L, 74769);
  }
  
  public final void a(RecyclerView.h paramh)
  {
    GMTrace.i(10035593740288L, 74771);
    GMTrace.o(10035593740288L, 74771);
  }
  
  public LinearLayoutManager abm()
  {
    GMTrace.i(10035191087104L, 74768);
    getContext();
    LinearLayoutManager localLinearLayoutManager = new LinearLayoutManager();
    GMTrace.o(10035191087104L, 74768);
    return localLinearLayoutManager;
  }
  
  protected final boolean adW()
  {
    GMTrace.i(10035727958016L, 74772);
    if (this.iTF != null)
    {
      if ((this.iTL.getItemCount() == 1) && (this.iTL.adV() == 1))
      {
        GMTrace.o(10035727958016L, 74772);
        return true;
      }
      GMTrace.o(10035727958016L, 74772);
      return false;
    }
    boolean bool = super.adW();
    GMTrace.o(10035727958016L, 74772);
    return bool;
  }
  
  public final void addFooterView(View paramView)
  {
    GMTrace.i(10035459522560L, 74770);
    int i = this.iTL.adV() - 1;
    if ((this.iTF == null) || (i < 0))
    {
      super.addFooterView(paramView);
      GMTrace.o(10035459522560L, 74770);
      return;
    }
    super.b(i, paramView);
    GMTrace.o(10035459522560L, 74770);
  }
  
  public final void cW(boolean paramBoolean)
  {
    GMTrace.i(20830054514688L, 155196);
    if (this.iTH == paramBoolean)
    {
      GMTrace.o(20830054514688L, 155196);
      return;
    }
    this.iTH = paramBoolean;
    View localView;
    if (this.iTF != null)
    {
      localView = this.iTF;
      if (!this.iTH) {
        break label65;
      }
    }
    label65:
    for (int i = 0;; i = 8)
    {
      localView.setVisibility(i);
      GMTrace.o(20830054514688L, 155196);
      return;
    }
  }
  
  public final void cd(View paramView)
  {
    GMTrace.i(20829920296960L, 155195);
    if (this.iTF == paramView)
    {
      GMTrace.o(20829920296960L, 155195);
      return;
    }
    if ((this.iTF != null) && (!this.iTF.equals(paramView))) {
      ce(this.iTF);
    }
    this.iTF = paramView;
    if (this.iTF != null)
    {
      addFooterView(this.iTF);
      paramView = this.iTF;
      if (!this.iTH) {
        break label99;
      }
    }
    label99:
    for (int i = 0;; i = 8)
    {
      paramView.setVisibility(i);
      GMTrace.o(20829920296960L, 155195);
      return;
    }
  }
  
  public static abstract interface a
  {
    public abstract void aaX();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\widget\recyclerview\LoadMoreRecyclerView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */