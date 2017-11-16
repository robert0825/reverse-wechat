package com.tencent.mm.plugin.favorite.ui;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.ViewStub;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.n;
import com.tencent.mm.plugin.favorite.b.ag;
import com.tencent.mm.plugin.favorite.b.c.a;
import com.tencent.mm.plugin.favorite.b.j;
import com.tencent.mm.plugin.favorite.b.x;
import com.tencent.mm.plugin.favorite.ui.a.b;
import com.tencent.mm.plugin.favorite.ui.base.a;
import com.tencent.mm.plugin.favorite.ui.base.a.a;
import com.tencent.mm.plugin.favorite.ui.c.a.c;
import com.tencent.mm.protocal.c.th;
import com.tencent.mm.protocal.c.tt;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.v;
import com.tencent.mm.y.at;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class FavCleanUI
  extends MMActivity
  implements a.c
{
  protected ae ghS;
  private View ldA;
  private Runnable ldF;
  protected Runnable ldG;
  private com.tencent.mm.plugin.favorite.c.g ldO;
  private b ldP;
  private ListView ldQ;
  private TextView ldR;
  private a ldS;
  private boolean ldT;
  private int ldU;
  private c.a ldV;
  private com.tencent.mm.ad.e ldW;
  private boolean ldr;
  protected boolean lds;
  private long ldu;
  private HandlerThread ldx;
  protected ae ldy;
  protected View ldz;
  
  public FavCleanUI()
  {
    GMTrace.i(6367154798592L, 47439);
    this.ldr = false;
    this.ghS = new ae(Looper.getMainLooper());
    this.ldT = false;
    this.ldU = 0;
    this.ldV = new c.a()
    {
      public final void onFinish()
      {
        GMTrace.i(6318433763328L, 47076);
        w.i("MicroMsg.FavCleanUI", "FavCleanFirstLoader onFinish()");
        FavCleanUI.c(FavCleanUI.this);
        FavCleanUI.d(FavCleanUI.this);
        GMTrace.o(6318433763328L, 47076);
      }
    };
    this.ldW = new com.tencent.mm.ad.e()
    {
      public final void a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, com.tencent.mm.ad.k paramAnonymousk)
      {
        GMTrace.i(6414399438848L, 47791);
        w.i("MicroMsg.FavCleanUI", "on getfavinfo scene end");
        if (FavCleanUI.f(FavCleanUI.this) != null) {
          FavCleanUI.f(FavCleanUI.this).lgt = x.aye();
        }
        GMTrace.o(6414399438848L, 47791);
      }
    };
    this.ldF = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(6318702198784L, 47078);
        if (FavCleanUI.e(FavCleanUI.this) != null) {
          FavCleanUI.e(FavCleanUI.this).ayQ();
        }
        FavCleanUI.this.ayC();
        GMTrace.o(6318702198784L, 47078);
      }
    };
    this.ldu = 0L;
    this.lds = false;
    this.ldG = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(6441377202176L, 47992);
        if (FavCleanUI.e(FavCleanUI.this) == null)
        {
          GMTrace.o(6441377202176L, 47992);
          return;
        }
        if ((!FavCleanUI.e(FavCleanUI.this).isEmpty()) && (SystemClock.elapsedRealtime() - FavCleanUI.h(FavCleanUI.this) < 1000L))
        {
          w.d("MicroMsg.FavCleanUI", "try refresh, time limit, now %d last %d delay %d", new Object[] { Long.valueOf(SystemClock.elapsedRealtime()), Long.valueOf(FavCleanUI.h(FavCleanUI.this)), Integer.valueOf(1000) });
          FavCleanUI.this.ghS.postDelayed(this, 500L);
          GMTrace.o(6441377202176L, 47992);
          return;
        }
        FavCleanUI.i(FavCleanUI.this);
        FavCleanUI.a(FavCleanUI.this, SystemClock.elapsedRealtime());
        w.v("MicroMsg.FavCleanUI", "do refresh job");
        FavCleanUI.d(FavCleanUI.this);
        if (FavCleanUI.this.lds)
        {
          w.v("MicroMsg.FavCleanUI", "do scroll to first");
          FavCleanUI.j(FavCleanUI.this).setSelection(0);
          FavCleanUI.this.lds = false;
        }
        GMTrace.o(6441377202176L, 47992);
      }
    };
    GMTrace.o(6367154798592L, 47439);
  }
  
  private void ev(boolean paramBoolean)
  {
    GMTrace.i(6368362758144L, 47448);
    if (paramBoolean)
    {
      this.ldA.setVisibility(8);
      this.ldR.setVisibility(0);
      this.ldQ.removeFooterView(this.ldz);
      if (this.ldS != null)
      {
        this.ldS.hide();
        GMTrace.o(6368362758144L, 47448);
      }
    }
    else
    {
      this.ldA.setVisibility(8);
      this.ldR.setVisibility(8);
      this.ldQ.removeFooterView(this.ldz);
      if (this.ldS != null) {
        this.ldS.show();
      }
    }
    GMTrace.o(6368362758144L, 47448);
  }
  
  private void ew(boolean paramBoolean)
  {
    GMTrace.i(6368496975872L, 47449);
    if (paramBoolean)
    {
      if (this.ldQ.getFooterViewsCount() == 0)
      {
        this.ldQ.addFooterView(this.ldz);
        GMTrace.o(6368496975872L, 47449);
      }
    }
    else {
      this.ldQ.removeFooterView(this.ldz);
    }
    GMTrace.o(6368496975872L, 47449);
  }
  
  protected final void ayC()
  {
    GMTrace.i(6368228540416L, 47447);
    w.i("MicroMsg.FavCleanUI", "on storage change, try refresh job");
    this.ghS.removeCallbacks(this.ldG);
    this.ghS.post(this.ldG);
    GMTrace.o(6368228540416L, 47447);
  }
  
  public final void cv(long paramLong)
  {
    GMTrace.i(6368765411328L, 47451);
    Object localObject = com.tencent.mm.plugin.favorite.h.axB().cf(paramLong);
    if ((localObject != null) && (((j)localObject).field_favProto != null) && (((j)localObject).field_favProto.ulB.size() != 0))
    {
      localObject = ((j)localObject).field_favProto.ulB.iterator();
      while (((Iterator)localObject).hasNext()) {
        paramLong = ((th)((Iterator)localObject).next()).ujO;
      }
    }
    if (this.ldP.lgf)
    {
      localObject = this.ldS;
      if (this.ldP.ayT() > 0) {}
      for (boolean bool = true;; bool = false)
      {
        if (((a)localObject).lgw) {
          ((a)localObject).jUq.setEnabled(bool);
        }
        localObject = this.ldS;
        List localList = this.ldP.ex(false);
        paramLong = this.ldP.ayU();
        if ((localList.size() == 0) || (paramLong <= 0L)) {
          break;
        }
        ((a)localObject).jUx.setText(((a)localObject).jUx.getContext().getString(R.l.dsL, new Object[] { com.tencent.mm.plugin.favorite.c.cb(paramLong) }));
        ((a)localObject).jUq.setEnabled(true);
        GMTrace.o(6368765411328L, 47451);
        return;
      }
      ((a)localObject).ayV();
    }
    GMTrace.o(6368765411328L, 47451);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(6367289016320L, 47440);
    int i = R.i.cwp;
    GMTrace.o(6367289016320L, 47440);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(6368094322688L, 47446);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    GMTrace.o(6368094322688L, 47446);
  }
  
  public void onBackPressed()
  {
    GMTrace.i(6368631193600L, 47450);
    finish();
    super.onBackPressed();
    GMTrace.o(6368631193600L, 47450);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(6367423234048L, 47441);
    super.onCreate(paramBundle);
    this.ldU = getIntent().getIntExtra("key_enter_fav_cleanui_from", 0);
    this.ldx = com.tencent.mm.sdk.f.e.SV(getClass().getName() + "_handlerThread_" + System.currentTimeMillis());
    this.ldx.start();
    this.ldy = new ae(this.ldx.getLooper());
    this.ldQ = ((ListView)findViewById(R.h.byG));
    oM(R.l.dsN);
    this.ldT = true;
    paramBundle = new ag();
    at.wS().a(paramBundle, 0);
    at.wS().a(438, this.ldW);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(6338029551616L, 47222);
        FavCleanUI.this.finish();
        GMTrace.o(6338029551616L, 47222);
        return true;
      }
    });
    paramBundle = (ViewStub)findViewById(R.h.bwD);
    if (paramBundle != null) {}
    for (this.ldA = paramBundle.inflate();; this.ldA = findViewById(R.h.bzD))
    {
      this.ldR = ((TextView)findViewById(R.h.bwB));
      this.ldA.setVisibility(0);
      this.ldR.setVisibility(8);
      this.ldQ.removeFooterView(this.ldz);
      if (this.ldS != null) {
        this.ldS.hide();
      }
      this.ldz = v.fb(this).inflate(R.i.cwB, null);
      this.ldQ.setOnScrollListener(new AbsListView.OnScrollListener()
      {
        public final void onScroll(AbsListView paramAnonymousAbsListView, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
        {
          GMTrace.i(6371718201344L, 47473);
          GMTrace.o(6371718201344L, 47473);
        }
        
        public final void onScrollStateChanged(AbsListView paramAnonymousAbsListView, int paramAnonymousInt)
        {
          GMTrace.i(6371583983616L, 47472);
          if ((paramAnonymousInt == 0) && (FavCleanUI.a(FavCleanUI.this)))
          {
            w.i("MicroMsg.FavCleanUI", "force bottom load data");
            FavCleanUI.b(FavCleanUI.this);
          }
          GMTrace.o(6371583983616L, 47472);
        }
      });
      if (this.ldT)
      {
        this.ldS = new a();
        paramBundle = this.ldS;
        View localView = findViewById(R.h.byF);
        paramBundle.lgw = false;
        paramBundle.lgx = localView;
        this.ldS.lgy = new a.a()
        {
          public final void ayD()
          {
            GMTrace.i(6413325697024L, 47783);
            com.tencent.mm.ui.base.h.a(FavCleanUI.this.vKB.vKW, FavCleanUI.this.getString(R.l.dsM), "", new DialogInterface.OnClickListener()
            {
              public final void onClick(final DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
              {
                GMTrace.i(6337224245248L, 47216);
                long l = FavCleanUI.e(FavCleanUI.this).ayU();
                paramAnonymous2DialogInterface = FavCleanUI.e(FavCleanUI.this).ex(true);
                final Object localObject = FavCleanUI.f(FavCleanUI.this);
                ((a)localObject).lgt += l;
                x.cn(x.ayg() - l);
                if (paramAnonymous2DialogInterface.isEmpty())
                {
                  GMTrace.o(6337224245248L, 47216);
                  return;
                }
                com.tencent.mm.plugin.report.service.g.ork.i(14110, new Object[] { Integer.valueOf(FavCleanUI.g(FavCleanUI.this)), Integer.valueOf(paramAnonymous2DialogInterface.size()), Integer.valueOf((int)(l * 1.0D / 1024.0D)) });
                localObject = com.tencent.mm.ui.base.h.a(FavCleanUI.this.vKB.vKW, FavCleanUI.this.getString(R.l.dsV), false, null);
                at.xB().A(new Runnable()
                {
                  public final void run()
                  {
                    GMTrace.i(6334539890688L, 47196);
                    x.az(paramAnonymous2DialogInterface);
                    af.t(new Runnable()
                    {
                      public final void run()
                      {
                        GMTrace.i(6418023317504L, 47818);
                        b localb = FavCleanUI.e(FavCleanUI.this);
                        List localList = FavCleanUI.5.1.1.this.ldZ;
                        ArrayList localArrayList;
                        Iterator localIterator1;
                        if (localb.lfT != null)
                        {
                          localArrayList = new ArrayList();
                          localIterator1 = localb.lfT.iterator();
                        }
                        label339:
                        label344:
                        for (;;)
                        {
                          Object localObject;
                          Iterator localIterator2;
                          j localj;
                          if (localIterator1.hasNext())
                          {
                            localObject = (j)localIterator1.next();
                            if (localObject != null)
                            {
                              localIterator2 = localList.iterator();
                              do
                              {
                                if (!localIterator2.hasNext()) {
                                  break;
                                }
                                localj = (j)localIterator2.next();
                              } while ((localj == null) || (((j)localObject).field_localId != localj.field_localId));
                            }
                          }
                          else
                          {
                            for (int i = 1;; i = 0)
                            {
                              if (i != 0) {
                                break label344;
                              }
                              localArrayList.add(localObject);
                              break;
                              localb.lfT = localArrayList;
                              localArrayList = new ArrayList();
                              localIterator1 = localb.lfW.iterator();
                              for (;;)
                              {
                                if (localIterator1.hasNext())
                                {
                                  localObject = (Long)localIterator1.next();
                                  localIterator2 = localList.iterator();
                                  do
                                  {
                                    if (!localIterator2.hasNext()) {
                                      break;
                                    }
                                    localj = (j)localIterator2.next();
                                  } while ((localj == null) || (!((Long)localObject).equals(Long.valueOf(localj.field_localId))));
                                }
                                for (i = 1;; i = 0)
                                {
                                  if (i != 0) {
                                    break label339;
                                  }
                                  localArrayList.add(localObject);
                                  break;
                                  localb.lfW = localArrayList;
                                  FavCleanUI.e(FavCleanUI.this).notifyDataSetChanged();
                                  FavCleanUI.f(FavCleanUI.this).ayV();
                                  FavCleanUI.5.1.1.this.lea.dismiss();
                                  GMTrace.o(6418023317504L, 47818);
                                  return;
                                }
                              }
                            }
                          }
                        }
                      }
                      
                      public final String toString()
                      {
                        GMTrace.i(6418157535232L, 47819);
                        String str = super.toString() + "|batchDelFavItems";
                        GMTrace.o(6418157535232L, 47819);
                        return str;
                      }
                    });
                    GMTrace.o(6334539890688L, 47196);
                  }
                });
                com.tencent.mm.plugin.report.service.g.ork.i(11125, new Object[] { Integer.valueOf(paramAnonymous2DialogInterface.size()), Integer.valueOf(3) });
                GMTrace.o(6337224245248L, 47216);
              }
            }, null);
            GMTrace.o(6413325697024L, 47783);
          }
        };
        this.ldT = false;
      }
      com.tencent.mm.plugin.favorite.b.c.axD().a(this.ldV);
      GMTrace.o(6367423234048L, 47441);
      return;
    }
  }
  
  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    GMTrace.i(6367691669504L, 47443);
    w.d("MicroMsg.FavCleanUI", "on create options menu");
    boolean bool = super.onCreateOptionsMenu(paramMenu);
    GMTrace.o(6367691669504L, 47443);
    return bool;
  }
  
  protected void onDestroy()
  {
    GMTrace.i(6367557451776L, 47442);
    super.onDestroy();
    com.tencent.mm.plugin.favorite.b.c localc = com.tencent.mm.plugin.favorite.b.c.axD();
    c.a locala = this.ldV;
    if (localc.laW.contains(locala)) {
      localc.laW.remove(locala);
    }
    if (this.ldO != null)
    {
      this.ldO.destory();
      this.ldO = null;
    }
    if (this.ldP != null) {
      this.ldP.finish();
    }
    this.ldx.quit();
    at.wS().b(438, this.ldW);
    GMTrace.o(6367557451776L, 47442);
  }
  
  public boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    GMTrace.i(6367825887232L, 47444);
    boolean bool = super.onOptionsItemSelected(paramMenuItem);
    GMTrace.o(6367825887232L, 47444);
    return bool;
  }
  
  protected void onResume()
  {
    GMTrace.i(6367960104960L, 47445);
    super.onResume();
    GMTrace.o(6367960104960L, 47445);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\favorite\ui\FavCleanUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */