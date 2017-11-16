package com.tencent.mm.plugin.favorite.ui;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.view.m;
import android.support.v4.view.m.e;
import android.support.v7.widget.Toolbar.LayoutParams;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.a;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.favorite.b.j;
import com.tencent.mm.plugin.favorite.b.k;
import com.tencent.mm.plugin.favorite.b.q;
import com.tencent.mm.plugin.favorite.b.t;
import com.tencent.mm.plugin.favorite.b.x;
import com.tencent.mm.plugin.favorite.b.x.a;
import com.tencent.mm.plugin.favorite.ui.a.b;
import com.tencent.mm.plugin.favorite.ui.a.c;
import com.tencent.mm.plugin.favorite.ui.base.FavCapacityPanel;
import com.tencent.mm.plugin.favorite.ui.base.FavSearchActionView;
import com.tencent.mm.plugin.favorite.ui.base.FavSearchActionView.a;
import com.tencent.mm.plugin.favorite.ui.base.FavTagPanel;
import com.tencent.mm.plugin.favorite.ui.base.FavTypePanel;
import com.tencent.mm.plugin.favorite.ui.base.FavTypePanel.a;
import com.tencent.mm.plugin.favorite.ui.c.a.b;
import com.tencent.mm.plugin.favorite.ui.c.e;
import com.tencent.mm.pluginsdk.ui.applet.e.a;
import com.tencent.mm.pluginsdk.ui.applet.o.a;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.MMTagPanel.d;
import com.tencent.mm.ui.base.i;
import com.tencent.mm.ui.p;
import com.tencent.mm.y.at;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

@com.tencent.mm.ui.base.a(19)
public class FavSearchUI
  extends MMActivity
{
  private String eyD;
  private int heT;
  private ListView jtV;
  private com.tencent.mm.plugin.favorite.c.g ldO;
  private b ldP;
  private c leA;
  private FavSearchActionView leB;
  private FavTypePanel leC;
  private ListView leD;
  private View leE;
  private FavCapacityPanel leF;
  private Animation leG;
  private Animation leH;
  private List<Integer> leI;
  private List<String> leJ;
  private List<String> leK;
  private Set<String> leL;
  private View leM;
  private ImageButton leN;
  private MenuItem leO;
  private List<Long> leP;
  private String lex;
  private Set<Integer> ley;
  private x.a lez;
  private ae mHandler;
  
  public FavSearchUI()
  {
    GMTrace.i(6313870360576L, 47042);
    this.leL = new HashSet();
    this.leP = new ArrayList();
    GMTrace.o(6313870360576L, 47042);
  }
  
  private void ayG()
  {
    GMTrace.i(6314541449216L, 47047);
    if (this.leB != null)
    {
      GMTrace.o(6314541449216L, 47047);
      return;
    }
    this.leB = ((FavSearchActionView)View.inflate(this.vKB.vKW, R.i.cwF, null));
    this.leM = this.leB.findViewById(R.h.bcj);
    this.leM.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(6321252335616L, 47097);
        FavSearchUI.this.finish();
        GMTrace.o(6321252335616L, 47097);
      }
    });
    this.leN = ((ImageButton)this.leB.findViewById(R.h.cah));
    this.leN.setVisibility(8);
    this.leB.lgR = new FavSearchActionView.a()
    {
      public final void Qz()
      {
        GMTrace.i(6440840331264L, 47988);
        w.d("MicroMsg.FavSearchUI", "on enter search, show tag panel");
        FavSearchUI.c(FavSearchUI.this);
        GMTrace.o(6440840331264L, 47988);
      }
      
      public final void a(final List<Integer> paramAnonymousList, final List<String> paramAnonymousList1, final List<String> paramAnonymousList2)
      {
        GMTrace.i(6441108766720L, 47990);
        FavSearchUI.a(FavSearchUI.this).post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(6443256250368L, 48006);
            FavSearchUI.a(FavSearchUI.this, paramAnonymousList, paramAnonymousList1, paramAnonymousList2);
            w.d("MicroMsg.FavSearchUI", "on text changed, types %s keys %s tags %s", new Object[] { paramAnonymousList, paramAnonymousList1, paramAnonymousList2 });
            FavSearchUI.b(FavSearchUI.this, paramAnonymousList1);
            FavSearchUI.c(FavSearchUI.this, paramAnonymousList2);
            FavSearchUI.d(FavSearchUI.this, paramAnonymousList);
            FavSearchUI.d(FavSearchUI.this).aB(paramAnonymousList2);
            FavSearchUI.e(FavSearchUI.this).aD(paramAnonymousList);
            FavSearchUI.f(FavSearchUI.this).b(paramAnonymousList, paramAnonymousList1, paramAnonymousList2);
            FavSearchUI.a(FavSearchUI.this, false);
            GMTrace.o(6443256250368L, 48006);
          }
        });
        GMTrace.o(6441108766720L, 47990);
      }
      
      public final void a(List<Integer> paramAnonymousList, List<String> paramAnonymousList1, List<String> paramAnonymousList2, boolean paramAnonymousBoolean)
      {
        GMTrace.i(6440974548992L, 47989);
        w.d("MicroMsg.FavSearchUI", "on search, types %s keys %s tags %s", new Object[] { paramAnonymousList, paramAnonymousList1, paramAnonymousList2 });
        FavSearchUI.b(FavSearchUI.this, paramAnonymousList1);
        FavSearchUI.c(FavSearchUI.this, paramAnonymousList2);
        FavSearchUI.d(FavSearchUI.this, paramAnonymousList);
        FavSearchUI.d(FavSearchUI.this).aB(paramAnonymousList2);
        FavSearchUI.e(FavSearchUI.this).aD(paramAnonymousList);
        if (paramAnonymousBoolean)
        {
          FavSearchUI.c(FavSearchUI.this);
          FavSearchUI.a(FavSearchUI.this, paramAnonymousList, paramAnonymousList1, paramAnonymousList2);
          GMTrace.o(6440974548992L, 47989);
          return;
        }
        FavSearchUI.f(FavSearchUI.this).b(paramAnonymousList, paramAnonymousList1, paramAnonymousList2);
        FavSearchUI.a(FavSearchUI.this, true);
        FavSearchUI.a(FavSearchUI.this, paramAnonymousList, paramAnonymousList1, paramAnonymousList2);
        GMTrace.o(6440974548992L, 47989);
      }
    };
    GMTrace.o(6314541449216L, 47047);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(6314004578304L, 47043);
    int i = R.i.cwG;
    GMTrace.o(6314004578304L, 47043);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(6314138796032L, 47044);
    super.onCreate(paramBundle);
    this.mHandler = new ae();
    sq("");
    this.heT = getIntent().getIntExtra("key_search_type", 0);
    if (1 == this.heT)
    {
      this.eyD = getIntent().getStringExtra("key_to_user");
      this.lex = getIntent().getStringExtra("key_fav_item_id");
    }
    this.leD = ((ListView)findViewById(R.h.cgq));
    this.jtV = ((ListView)findViewById(R.h.caL));
    this.leE = findViewById(R.h.cat);
    this.leG = AnimationUtils.loadAnimation(this.vKB.vKW, R.a.aLA);
    this.leH = AnimationUtils.loadAnimation(this.vKB.vKW, R.a.aLB);
    ayG();
    this.leC = ((FavTypePanel)View.inflate(this.vKB.vKW, R.i.cwM, null));
    this.leC.lhg = new FavTypePanel.a()
    {
      public final void y(int paramAnonymousInt, boolean paramAnonymousBoolean)
      {
        GMTrace.i(6374536773632L, 47494);
        FavSearchActionView localFavSearchActionView;
        if (paramAnonymousBoolean)
        {
          localFavSearchActionView = FavSearchUI.a(FavSearchUI.this);
          localFavSearchActionView.lfZ.add(Integer.valueOf(paramAnonymousInt));
          if (localFavSearchActionView.lfj != null)
          {
            localFavSearchActionView.ayX();
            FavTagPanel localFavTagPanel = localFavSearchActionView.lfj;
            String str = x.x(localFavSearchActionView.getContext(), paramAnonymousInt);
            if (bg.nm(str)) {
              w.w("MicroMsg.FavTagPanel", "want to add type, but it is null or empty");
            }
            while (localFavSearchActionView.lgR != null)
            {
              localFavSearchActionView.ye(localFavSearchActionView.lfj.cam());
              localFavSearchActionView.lgR.a(localFavSearchActionView.lfZ, localFavSearchActionView.lgQ, localFavSearchActionView.lgP, false);
              com.tencent.mm.plugin.report.service.g.ork.i(11126, new Object[] { Integer.valueOf(1) });
              GMTrace.o(6374536773632L, 47494);
              return;
              str = str.trim();
              Object localObject = localFavTagPanel.lgW.iterator();
              for (;;)
              {
                if (((Iterator)localObject).hasNext()) {
                  if (str.equals(((MMTagPanel.d)((Iterator)localObject).next()).wfB))
                  {
                    w.w("MicroMsg.FavTagPanel", "want to add type %s, but it exsited!", new Object[] { str });
                    break;
                  }
                }
              }
              localObject = localFavTagPanel.cas();
              localFavTagPanel.lgW.add(localObject);
              localFavTagPanel.a((MMTagPanel.d)localObject, str, true);
              ((MMTagPanel.d)localObject).wfC.setOnClickListener(localFavTagPanel.lgY);
              localFavTagPanel.addView(((MMTagPanel.d)localObject).wfC, localFavTagPanel.lgW.size() - 1);
              localFavTagPanel.cat();
            }
          }
        }
        else
        {
          localFavSearchActionView = FavSearchUI.a(FavSearchUI.this);
          localFavSearchActionView.lfZ.remove(Integer.valueOf(paramAnonymousInt));
          if (localFavSearchActionView.lfj == null)
          {
            GMTrace.o(6374536773632L, 47494);
            return;
          }
          localFavSearchActionView.ayX();
          localFavSearchActionView.lfj.yh(x.x(localFavSearchActionView.getContext(), paramAnonymousInt));
          if (localFavSearchActionView.lgR == null)
          {
            GMTrace.o(6374536773632L, 47494);
            return;
          }
          localFavSearchActionView.ye(localFavSearchActionView.lfj.cam());
          localFavSearchActionView.lgR.a(localFavSearchActionView.lfZ, localFavSearchActionView.lgQ, localFavSearchActionView.lgP, true);
        }
        GMTrace.o(6374536773632L, 47494);
      }
    };
    this.leF = ((FavCapacityPanel)View.inflate(this.vKB.vKW, R.i.cwo, null));
    this.leF.lgs = getIntent().getIntExtra("key_enter_fav_search_from", 0);
    this.leA = new c(this.vKB.vKW)
    {
      protected final void ya(String paramAnonymousString)
      {
        GMTrace.i(6372523507712L, 47479);
        FavSearchActionView localFavSearchActionView = FavSearchUI.a(FavSearchUI.this);
        localFavSearchActionView.lgP.add(paramAnonymousString);
        if (localFavSearchActionView.lfj == null)
        {
          GMTrace.o(6372523507712L, 47479);
          return;
        }
        localFavSearchActionView.lfj.VE("");
        localFavSearchActionView.lfj.ba(paramAnonymousString, true);
        if (localFavSearchActionView.lgR == null)
        {
          GMTrace.o(6372523507712L, 47479);
          return;
        }
        localFavSearchActionView.ye(localFavSearchActionView.lfj.cam());
        localFavSearchActionView.lgR.a(localFavSearchActionView.lfZ, localFavSearchActionView.lgQ, localFavSearchActionView.lgP, false);
        com.tencent.mm.plugin.report.service.g.ork.i(11126, new Object[] { Integer.valueOf(2) });
        GMTrace.o(6372523507712L, 47479);
      }
      
      protected final void yb(String paramAnonymousString)
      {
        GMTrace.i(6372657725440L, 47480);
        FavSearchActionView localFavSearchActionView = FavSearchUI.a(FavSearchUI.this);
        localFavSearchActionView.lgP.remove(paramAnonymousString);
        if (localFavSearchActionView.lfj == null)
        {
          GMTrace.o(6372657725440L, 47480);
          return;
        }
        if (localFavSearchActionView.lgP.isEmpty()) {
          localFavSearchActionView.lfj.VE(localFavSearchActionView.getResources().getString(R.l.cUr));
        }
        localFavSearchActionView.lfj.removeTag(paramAnonymousString);
        if (localFavSearchActionView.lgR == null)
        {
          GMTrace.o(6372657725440L, 47480);
          return;
        }
        localFavSearchActionView.ye(localFavSearchActionView.lfj.cam());
        localFavSearchActionView.lgR.a(localFavSearchActionView.lfZ, localFavSearchActionView.lgQ, localFavSearchActionView.lgP, true);
        GMTrace.o(6372657725440L, 47480);
      }
    };
    this.leD.addHeaderView(this.leC);
    if (com.tencent.mm.plugin.favorite.h.axu().axR() > 0)
    {
      paramBundle = (TextView)View.inflate(this.vKB.vKW, R.i.cwJ, null);
      this.leD.addHeaderView(paramBundle);
    }
    this.leD.addFooterView(this.leF);
    this.leD.setAdapter(this.leA);
    this.leD.setOnTouchListener(new View.OnTouchListener()
    {
      public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
      {
        GMTrace.i(6317896892416L, 47072);
        switch (paramAnonymousMotionEvent.getAction())
        {
        }
        for (;;)
        {
          GMTrace.o(6317896892416L, 47072);
          return false;
          FavSearchUI.this.aLo();
        }
      }
    });
    this.ldO = new com.tencent.mm.plugin.favorite.c.g(this.vKB.vKW, 16);
    paramBundle = this.vKB.vKW;
    this.ldP = new b(this.ldO, false);
    if (1 == this.heT)
    {
      this.ley = new HashSet();
      this.lez = new q();
      if (!bg.nm(this.lex))
      {
        paramBundle = this.lex.split(",");
        int j = paramBundle.length;
        int i = 0;
        while (i < j)
        {
          int k = bg.getInt(paramBundle[i], Integer.MAX_VALUE);
          if (Integer.MAX_VALUE != k) {
            this.ley.add(Integer.valueOf(k));
          }
          i += 1;
        }
      }
      this.ldP.e(this.ley);
      this.ldP.a(this.lez);
    }
    this.jtV.setAdapter(this.ldP);
    this.jtV.setOnItemClickListener(new AdapterView.OnItemClickListener()
    {
      public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, final int paramAnonymousInt, long paramAnonymousLong)
      {
        GMTrace.i(6372255072256L, 47477);
        final a.b localb = (a.b)paramAnonymousView.getTag();
        if (1 == FavSearchUI.g(FavSearchUI.this))
        {
          if (localb == null)
          {
            w.w("MicroMsg.FavSearchUI", "on item click, holder is null");
            GMTrace.o(6372255072256L, 47477);
            return;
          }
          if (localb.lcn == null)
          {
            w.w("MicroMsg.FavSearchUI", "on item click, info is null");
            GMTrace.o(6372255072256L, 47477);
            return;
          }
          paramAnonymousAdapterView = new e.a(FavSearchUI.this.vKB.vKW);
          paramAnonymousAdapterView.bA(FavSearchUI.h(FavSearchUI.this));
          e.a(paramAnonymousAdapterView, FavSearchUI.this.vKB.vKW, localb.lcn);
          e.b(paramAnonymousAdapterView, FavSearchUI.this.vKB.vKW, localb.lcn);
          {
            public final void a(boolean paramAnonymous2Boolean, String paramAnonymous2String, int paramAnonymous2Int)
            {
              GMTrace.i(6320715464704L, 47093);
              FavSearchUI.this.aLo();
              if (paramAnonymous2Boolean)
              {
                final com.tencent.mm.ui.base.r localr = com.tencent.mm.ui.base.h.a(FavSearchUI.this.vKB.vKW, FavSearchUI.this.getString(R.l.dtM), false, null);
                com.tencent.mm.plugin.favorite.b.r.a(FavSearchUI.this.vKB.vKW, FavSearchUI.h(FavSearchUI.this), paramAnonymous2String, localb.lcn, new Runnable()
                {
                  public final void run()
                  {
                    GMTrace.i(6325681520640L, 47130);
                    if (localr != null) {
                      localr.dismiss();
                    }
                    com.tencent.mm.ui.snackbar.a.e(FavSearchUI.this, FavSearchUI.this.getString(R.l.dwg));
                    af.i(new Runnable()
                    {
                      public final void run()
                      {
                        GMTrace.i(6312930836480L, 47035);
                        FavSearchUI.this.finish();
                        GMTrace.o(6312930836480L, 47035);
                      }
                    }, 1800L);
                    GMTrace.o(6325681520640L, 47130);
                  }
                });
              }
              GMTrace.o(6320715464704L, 47093);
            }
          }.show();
          GMTrace.o(6372255072256L, 47477);
          return;
        }
        if (2 == FavSearchUI.g(FavSearchUI.this))
        {
          if (localb == null)
          {
            w.w("MicroMsg.FavSearchUI", "on item click, holder is null");
            GMTrace.o(6372255072256L, 47477);
            return;
          }
          if (localb.lcn == null)
          {
            w.w("MicroMsg.FavSearchUI", "on item click, info is null");
            GMTrace.o(6372255072256L, 47477);
            return;
          }
          paramAnonymousAdapterView = new Intent();
          paramAnonymousAdapterView.putExtra("key_fav_result_local_id", localb.lcn.field_localId);
          FavSearchUI.this.setResult(-1, paramAnonymousAdapterView);
          FavSearchUI.this.finish();
          GMTrace.o(6372255072256L, 47477);
          return;
        }
        FavSearchUI.f(FavSearchUI.this).onItemClick(paramAnonymousAdapterView, paramAnonymousView, paramAnonymousInt, paramAnonymousLong);
        if (localb.lcn != null) {
          at.xB().A(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(6370510241792L, 47464);
              w.d("MicroMsg.FavSearchUI", "type %s", new Object[] { Integer.valueOf(localb.lcn.field_type) });
              long l = localb.lcn.field_localId;
              if (FavSearchUI.i(FavSearchUI.this).size() == 0) {
                FavSearchUI.a(FavSearchUI.this, com.tencent.mm.plugin.favorite.h.axB().axQ());
              }
              if (FavSearchUI.i(FavSearchUI.this).size() != 0)
              {
                localObject = FavSearchUI.i(FavSearchUI.this).iterator();
                j = 1;
                for (;;)
                {
                  i = j;
                  if (!((Iterator)localObject).hasNext()) {
                    break;
                  }
                  i = j;
                  if (((Long)((Iterator)localObject).next()).longValue() == l) {
                    break;
                  }
                  j += 1;
                }
              }
              int i = 1;
              Object localObject = com.tencent.mm.plugin.report.service.g.ork;
              int j = localb.lcn.field_type;
              int k = FavSearchUI.j(FavSearchUI.this);
              if (FavSearchUI.i(FavSearchUI.this).size() == 0) {
                i = paramAnonymousInt;
              }
              ((com.tencent.mm.plugin.report.service.g)localObject).i(12746, new Object[] { Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(i) });
              GMTrace.o(6370510241792L, 47464);
            }
          });
        }
        GMTrace.o(6372255072256L, 47477);
      }
    });
    this.jtV.setOnTouchListener(new View.OnTouchListener()
    {
      public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
      {
        GMTrace.i(6376415821824L, 47508);
        switch (paramAnonymousMotionEvent.getAction())
        {
        }
        for (;;)
        {
          GMTrace.o(6376415821824L, 47508);
          return false;
          FavSearchUI.this.aLo();
        }
      }
    });
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(6415338962944L, 47798);
        FavSearchUI.this.finish();
        GMTrace.o(6415338962944L, 47798);
        return true;
      }
    });
    com.tencent.mm.plugin.favorite.h.axu().a(this.leA);
    at.xB().h(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(6362457178112L, 47404);
        FavSearchUI.a(FavSearchUI.this, com.tencent.mm.plugin.favorite.h.axB().axQ());
        GMTrace.o(6362457178112L, 47404);
      }
    }, 1000L);
    GMTrace.o(6314138796032L, 47044);
  }
  
  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    GMTrace.i(6314407231488L, 47046);
    w.d("MicroMsg.FavSearchUI", "on create options menu");
    ayG();
    this.leO = paramMenu.add(0, R.h.bMU, 0, R.l.cSG);
    m.a(this.leO, this.leB);
    m.a(this.leO, 9);
    this.leB.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(6467952312320L, 48190);
        FavSearchActionView localFavSearchActionView = FavSearchUI.a(FavSearchUI.this);
        if (localFavSearchActionView.lfj != null) {
          localFavSearchActionView.lfj.cap();
        }
        FavSearchUI.this.aLs();
        GMTrace.o(6467952312320L, 48190);
      }
    });
    m.a(this.leO, new m.e()
    {
      public final boolean onMenuItemActionCollapse(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(6325413085184L, 47128);
        FavSearchUI.this.finish();
        GMTrace.o(6325413085184L, 47128);
        return true;
      }
      
      public final boolean onMenuItemActionExpand(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(6325278867456L, 47127);
        GMTrace.o(6325278867456L, 47127);
        return true;
      }
    });
    this.mHandler.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(6366752145408L, 47436);
        if (FavSearchUI.b(FavSearchUI.this) != null)
        {
          m.b(FavSearchUI.b(FavSearchUI.this));
          Toolbar.LayoutParams localLayoutParams = (Toolbar.LayoutParams)FavSearchUI.a(FavSearchUI.this).getLayoutParams();
          if (localLayoutParams != null)
          {
            localLayoutParams.height = -1;
            localLayoutParams.width = -1;
          }
          FavSearchUI.a(FavSearchUI.this).setLayoutParams(localLayoutParams);
        }
        GMTrace.o(6366752145408L, 47436);
      }
    });
    GMTrace.o(6314407231488L, 47046);
    return true;
  }
  
  protected void onDestroy()
  {
    GMTrace.i(6314273013760L, 47045);
    super.onDestroy();
    this.ldO.destory();
    this.ldO = null;
    com.tencent.mm.plugin.favorite.h.axu().a(this.leA);
    com.tencent.mm.plugin.favorite.h.axu().c(this.leL);
    if (this.ldP != null) {
      this.ldP.finish();
    }
    GMTrace.o(6314273013760L, 47045);
  }
  
  protected void onResume()
  {
    GMTrace.i(6314675666944L, 47048);
    this.ldP.ayR();
    this.ldP.notifyDataSetChanged();
    FavCapacityPanel localFavCapacityPanel = this.leF;
    TextView localTextView;
    Context localContext;
    int i;
    if (localFavCapacityPanel.lgq != x.aye() / 1048576L)
    {
      localFavCapacityPanel.lgq = (x.aye() / 1048576L);
      localTextView = localFavCapacityPanel.lgr;
      localContext = localFavCapacityPanel.lgr.getContext();
      i = R.l.dsJ;
      if (localFavCapacityPanel.lgt - localFavCapacityPanel.lgq <= 0L) {
        break label153;
      }
    }
    label153:
    for (long l = localFavCapacityPanel.lgt - localFavCapacityPanel.lgq;; l = 0L)
    {
      localTextView.setText(localContext.getString(i, new Object[] { Long.valueOf(l), Long.valueOf(localFavCapacityPanel.lgq) }));
      super.onResume();
      GMTrace.o(6314675666944L, 47048);
      return;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\favorite\ui\FavSearchUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */