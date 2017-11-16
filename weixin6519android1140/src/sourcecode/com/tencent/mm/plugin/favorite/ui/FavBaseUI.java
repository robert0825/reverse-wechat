package com.tencent.mm.plugin.favorite.ui;

import android.os.Bundle;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewStub;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.ad.n;
import com.tencent.mm.g.b.ef;
import com.tencent.mm.plugin.favorite.b.ag;
import com.tencent.mm.plugin.favorite.b.x;
import com.tencent.mm.plugin.favorite.c.b;
import com.tencent.mm.plugin.favorite.c.f;
import com.tencent.mm.plugin.favorite.c.g;
import com.tencent.mm.plugin.favorite.ui.a.a;
import com.tencent.mm.plugin.favorite.ui.base.c.a;
import com.tencent.mm.sdk.e.j.a;
import com.tencent.mm.sdk.e.l;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.c;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.v;
import com.tencent.mm.y.at;

public abstract class FavBaseUI
  extends MMActivity
  implements AdapterView.OnItemClickListener
{
  protected ae ghS;
  private final Object hvH;
  protected g laj;
  private View ldA;
  protected com.tencent.mm.plugin.favorite.ui.base.c ldB;
  protected c.a ldC;
  private com.tencent.mm.ad.e ldD;
  private com.tencent.mm.ad.e ldE;
  private Runnable ldF;
  protected Runnable ldG;
  private Runnable ldH;
  private j.a ldI;
  private boolean ldr;
  protected boolean lds;
  private boolean ldt;
  private long ldu;
  protected ListView ldv;
  protected TextView ldw;
  private HandlerThread ldx;
  protected ae ldy;
  protected View ldz;
  
  public FavBaseUI()
  {
    GMTrace.i(6363396702208L, 47411);
    this.ldr = false;
    this.lds = false;
    this.ldt = false;
    this.ldu = 0L;
    this.ghS = new ae(Looper.getMainLooper());
    this.ldC = null;
    this.hvH = new Object();
    this.ldD = new com.tencent.mm.ad.e()
    {
      public final void a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, com.tencent.mm.ad.k paramAnonymousk)
      {
        GMTrace.i(6439766589440L, 47980);
        w.i("MicroMsg.FavoriteBaseUI", "on fav sync end");
        if (((com.tencent.mm.plugin.favorite.b.af)paramAnonymousk).lcv)
        {
          w.i("MicroMsg.FavoriteBaseUI", "need batch get return");
          GMTrace.o(6439766589440L, 47980);
          return;
        }
        w.i("MicroMsg.FavoriteBaseUI", "dismiss loading dialog");
        if (FavBaseUI.c(FavBaseUI.this)) {
          FavBaseUI.d(FavBaseUI.this);
        }
        FavBaseUI.this.et(false);
        FavBaseUI.this.ayC();
        GMTrace.o(6439766589440L, 47980);
      }
    };
    this.ldE = new com.tencent.mm.ad.e()
    {
      public final void a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, com.tencent.mm.ad.k paramAnonymousk)
      {
        GMTrace.i(6439498153984L, 47978);
        w.i("MicroMsg.FavoriteBaseUI", "on batch get end");
        if (FavBaseUI.c(FavBaseUI.this))
        {
          w.i("MicroMsg.FavoriteBaseUI", "init currently, dismiss dialog");
          FavBaseUI.d(FavBaseUI.this);
          FavBaseUI.this.et(false);
        }
        GMTrace.o(6439498153984L, 47978);
      }
    };
    this.ldF = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(6318165327872L, 47074);
        a locala = FavBaseUI.this.ayy();
        locala.ayQ();
        locala.ayR();
        FavBaseUI.this.ayC();
        GMTrace.o(6318165327872L, 47074);
      }
    };
    this.ldG = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(6319910158336L, 47087);
        a locala = FavBaseUI.this.ayy();
        if ((!locala.isEmpty()) && (SystemClock.elapsedRealtime() - FavBaseUI.e(FavBaseUI.this) < 400L))
        {
          w.d("MicroMsg.FavoriteBaseUI", "try refresh, time limit, now %d last %d delay %d", new Object[] { Long.valueOf(SystemClock.elapsedRealtime()), Long.valueOf(FavBaseUI.e(FavBaseUI.this)), Integer.valueOf(400) });
          FavBaseUI.this.ghS.postDelayed(this, 200L);
          GMTrace.o(6319910158336L, 47087);
          return;
        }
        FavBaseUI.f(FavBaseUI.this);
        FavBaseUI.a(FavBaseUI.this, SystemClock.elapsedRealtime());
        w.v("MicroMsg.FavoriteBaseUI", "do refresh job");
        locala.notifyDataSetChanged();
        FavBaseUI.this.a(locala);
        if (FavBaseUI.this.lds)
        {
          w.v("MicroMsg.FavoriteBaseUI", "do scroll to first");
          FavBaseUI.this.ldv.setSelection(0);
          FavBaseUI.this.lds = false;
        }
        GMTrace.o(6319910158336L, 47087);
      }
    };
    this.ldH = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(6441645637632L, 47994);
        synchronized (FavBaseUI.g(FavBaseUI.this))
        {
          FavBaseUI.this.ayz();
          FavBaseUI.this.ayy().ayR();
          FavBaseUI.this.ayC();
          GMTrace.o(6441645637632L, 47994);
          return;
        }
      }
    };
    this.ldI = new j.a()
    {
      long ldK;
      
      public final void a(String paramAnonymousString, l paramAnonymousl)
      {
        GMTrace.i(6413594132480L, 47785);
        FavBaseUI.this.ldy.removeCallbacks(FavBaseUI.h(FavBaseUI.this));
        if (bg.aI(this.ldK) > 200L)
        {
          this.ldK = bg.Pw();
          FavBaseUI.this.ldy.post(FavBaseUI.h(FavBaseUI.this));
          GMTrace.o(6413594132480L, 47785);
          return;
        }
        FavBaseUI.this.ldy.postDelayed(FavBaseUI.h(FavBaseUI.this), 200L);
        GMTrace.o(6413594132480L, 47785);
      }
    };
    GMTrace.o(6363396702208L, 47411);
  }
  
  private void eu(boolean paramBoolean)
  {
    GMTrace.i(6365007314944L, 47423);
    if (paramBoolean)
    {
      if (this.ldw == null) {
        this.ldw = ((TextView)((ViewStub)findViewById(R.h.bwO)).inflate().findViewById(R.h.bwB));
      }
      this.ldw.setVisibility(0);
      GMTrace.o(6365007314944L, 47423);
      return;
    }
    if (this.ldw != null) {
      this.ldw.setVisibility(8);
    }
    GMTrace.o(6365007314944L, 47423);
  }
  
  protected final void MP()
  {
    GMTrace.i(6364738879488L, 47421);
    long l = System.currentTimeMillis();
    this.ldv = ((ListView)findViewById(R.h.bzE));
    this.ldv.setDrawingCacheEnabled(false);
    new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(6322057641984L, 47103);
        BackwardSupportUtil.c.a(FavBaseUI.this.ldv);
        GMTrace.o(6322057641984L, 47103);
      }
    };
    initHeaderView();
    this.ldz = v.fb(this).inflate(R.i.cwB, null);
    this.ldv.setOnScrollListener(new AbsListView.OnScrollListener()
    {
      public final void onScroll(AbsListView paramAnonymousAbsListView, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        GMTrace.i(6374939426816L, 47497);
        GMTrace.o(6374939426816L, 47497);
      }
      
      public final void onScrollStateChanged(AbsListView paramAnonymousAbsListView, int paramAnonymousInt)
      {
        GMTrace.i(6374805209088L, 47496);
        if (paramAnonymousInt == 0)
        {
          if (com.tencent.mm.plugin.favorite.h.axB().n(FavBaseUI.this.ayy().ayO(), FavBaseUI.this.ayy().getType()))
          {
            w.v("MicroMsg.FavoriteBaseUI", "has shown all, do not load data");
            GMTrace.o(6374805209088L, 47496);
            return;
          }
          if (FavBaseUI.a(FavBaseUI.this))
          {
            w.i("MicroMsg.FavoriteBaseUI", "force bottom load data");
            FavBaseUI.b(FavBaseUI.this);
          }
        }
        GMTrace.o(6374805209088L, 47496);
      }
    });
    this.ldv.setOnItemClickListener(this);
    this.ldv.setOnTouchListener(new View.OnTouchListener()
    {
      public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
      {
        GMTrace.i(6320447029248L, 47091);
        FavBaseUI.this.aLo();
        GMTrace.o(6320447029248L, 47091);
        return false;
      }
    });
    this.ldv.setAdapter(ayy());
    a(ayy());
    w.d("MicroMsg.FavoriteBaseUI", "init view use %d ms", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
    GMTrace.o(6364738879488L, 47421);
  }
  
  protected final void a(a parama)
  {
    GMTrace.i(6365409968128L, 47426);
    if (parama == null)
    {
      w.w("MicroMsg.FavoriteBaseUI", "handle empty view fail, adapter is null");
      GMTrace.o(6365409968128L, 47426);
      return;
    }
    if (parama.isEmpty()) {
      if (ayA())
      {
        et(true);
        eu(false);
      }
    }
    while ((parama.isEmpty()) || (com.tencent.mm.plugin.favorite.h.axB().n(parama.ayO(), parama.getType())))
    {
      this.ldv.removeFooterView(this.ldz);
      GMTrace.o(6365409968128L, 47426);
      return;
      et(false);
      eu(true);
      ayB();
      continue;
      et(false);
      eu(false);
    }
    if (this.ldv.getFooterViewsCount() == 0) {
      this.ldv.addFooterView(this.ldz);
    }
    GMTrace.o(6365409968128L, 47426);
  }
  
  protected abstract boolean ayA();
  
  protected abstract void ayB();
  
  protected void ayC()
  {
    GMTrace.i(6365275750400L, 47425);
    w.i("MicroMsg.FavoriteBaseUI", "on storage change, try refresh job");
    this.ghS.removeCallbacks(this.ldG);
    this.ghS.post(this.ldG);
    GMTrace.o(6365275750400L, 47425);
  }
  
  public abstract a ayy();
  
  protected abstract void ayz();
  
  protected final void et(boolean paramBoolean)
  {
    GMTrace.i(6364873097216L, 47422);
    if (paramBoolean)
    {
      if (this.ldA == null) {
        this.ldA = ((ViewStub)findViewById(R.h.bwD)).inflate();
      }
      this.ldA.setVisibility(0);
      GMTrace.o(6364873097216L, 47422);
      return;
    }
    if (this.ldA != null) {
      this.ldA.setVisibility(8);
    }
    GMTrace.o(6364873097216L, 47422);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(6363530919936L, 47412);
    int i = R.i.cwQ;
    GMTrace.o(6363530919936L, 47412);
    return i;
  }
  
  protected void initHeaderView()
  {
    GMTrace.i(6365141532672L, 47424);
    this.ldB = new com.tencent.mm.plugin.favorite.ui.base.c(this.vKB.vKW);
    this.ldB.lgI = this.ldC;
    this.ldB.ey(false);
    this.ldB.lgG.setVisibility(8);
    this.ldB.lgH.setVisibility(8);
    w.d("MicroMsg.FavoriteBaseUI", "padding %s, %s", new Object[] { Integer.valueOf(this.ldB.getPaddingTop()), Integer.valueOf(this.ldB.getPaddingBottom()) });
    this.ldv.addHeaderView(this.ldB);
    GMTrace.o(6365141532672L, 47424);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(6364202008576L, 47417);
    long l = System.currentTimeMillis();
    super.onCreate(paramBundle);
    if (com.tencent.mm.plugin.favorite.h.axB().fTZ == null)
    {
      com.tencent.mm.plugin.favorite.h.axq().laC = ef.re();
      finish();
      GMTrace.o(6364202008576L, 47417);
      return;
    }
    w.i("MicroMsg.FavoriteBaseUI", "onCreate MMCore.accHasReady[%b]", new Object[] { Boolean.valueOf(at.AU()) });
    paramBundle = new ag();
    at.wS().a(paramBundle, 0);
    com.tencent.mm.plugin.favorite.h.axB().c(this.ldI);
    at.wS().a(400, this.ldD);
    at.wS().a(402, this.ldE);
    this.ldx = com.tencent.mm.sdk.f.e.SV(getClass().getName() + "_handlerThread_" + System.currentTimeMillis());
    this.ldx.start();
    this.ldy = new ae(this.ldx.getLooper());
    this.laj = new g(this.vKB.vKW, 64);
    MP();
    at.AR();
    if (bg.e((Integer)com.tencent.mm.y.c.xh().get(8217, null)) == 0)
    {
      w.i("MicroMsg.FavoriteBaseUI", "do init data for first time");
      this.ldt = true;
      paramBundle = new com.tencent.mm.plugin.favorite.b.af();
      at.wS().a(paramBundle, 0);
      if (this.ldt)
      {
        w.i("MicroMsg.FavoriteBaseUI", "show loading dialog");
        if ((ayy() == null) || (ayy().isEmpty())) {
          et(true);
        }
        eu(false);
      }
    }
    for (;;)
    {
      com.tencent.mm.plugin.favorite.h.axv().run();
      com.tencent.mm.plugin.favorite.h.axs().run();
      com.tencent.mm.plugin.favorite.h.axr().run();
      com.tencent.mm.plugin.favorite.h.axt().run();
      at.xB().A(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(6357491122176L, 47367);
          x.ayc();
          GMTrace.o(6357491122176L, 47367);
        }
      });
      w.d("MicroMsg.FavoriteBaseUI", "on create use %d ms", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
      GMTrace.o(6364202008576L, 47417);
      return;
      x.startSync();
      if (ayy().isEmpty())
      {
        et(true);
        eu(false);
        this.ldz.setVisibility(8);
      }
      else
      {
        et(false);
        eu(false);
      }
    }
  }
  
  protected void onDestroy()
  {
    GMTrace.i(6364604661760L, 47420);
    super.onDestroy();
    if (com.tencent.mm.plugin.favorite.h.axB().fTZ == null)
    {
      GMTrace.o(6364604661760L, 47420);
      return;
    }
    this.laj.destory();
    this.laj = null;
    this.ldx.quit();
    com.tencent.mm.plugin.favorite.h.axB().j(this.ldI);
    at.wS().b(400, this.ldD);
    at.wS().b(402, this.ldE);
    GMTrace.o(6364604661760L, 47420);
  }
  
  protected void onPause()
  {
    GMTrace.i(6364470444032L, 47419);
    super.onPause();
    ayy();
    GMTrace.o(6364470444032L, 47419);
  }
  
  protected void onResume()
  {
    GMTrace.i(6364336226304L, 47418);
    super.onResume();
    com.tencent.mm.pluginsdk.wallet.h.zJ(5);
    GMTrace.o(6364336226304L, 47418);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\favorite\ui\FavBaseUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */