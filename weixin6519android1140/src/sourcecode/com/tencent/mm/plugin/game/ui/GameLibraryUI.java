package com.tencent.mm.plugin.game.ui;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.ad.n;
import com.tencent.mm.plugin.game.d.c;
import com.tencent.mm.plugin.game.model.SubCoreGameCenter;
import com.tencent.mm.plugin.game.model.ai;
import com.tencent.mm.plugin.game.model.as;
import com.tencent.mm.plugin.game.model.z;
import com.tencent.mm.pluginsdk.l;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.p;
import com.tencent.mm.y.at;
import java.util.HashMap;
import java.util.LinkedList;

public class GameLibraryUI
  extends MMActivity
  implements com.tencent.mm.ad.e
{
  private View iTF;
  private Dialog kAu;
  private int lNQ;
  private int lNV;
  private l.a lUA;
  private AbsListView.OnScrollListener lUB;
  private ListView lUt;
  private k lUu;
  private boolean lUv;
  private boolean lUw;
  private j lUz;
  private boolean lVo;
  private View.OnClickListener lVw;
  private GameBannerView lZh;
  private GameLibraryCategoriesView lZi;
  private View lZj;
  private TextView lZk;
  private View lZl;
  private GameDropdownView lZm;
  private HashMap<Integer, String> lZn;
  private int lZo;
  private View lZp;
  private Button lZq;
  private boolean lZr;
  private int lZs;
  private int lZt;
  private View.OnClickListener lZu;
  private GameDropdownView.a lZv;
  private boolean lyf;
  
  public GameLibraryUI()
  {
    GMTrace.i(12710150406144L, 94698);
    this.lZo = 0;
    this.lyf = false;
    this.lUv = false;
    this.lNV = 0;
    this.lUw = true;
    this.lZr = false;
    this.lVo = true;
    this.lNQ = 0;
    this.lZs = 990;
    this.lZt = 0;
    this.lUz = new j();
    this.lUA = new l.a()
    {
      public final void oL(int paramAnonymousInt)
      {
        GMTrace.i(12689883529216L, 94547);
        int i = GameLibraryUI.b(GameLibraryUI.this).getFirstVisiblePosition() - GameLibraryUI.c(GameLibraryUI.this);
        int j = GameLibraryUI.b(GameLibraryUI.this).getLastVisiblePosition();
        int k = GameLibraryUI.c(GameLibraryUI.this);
        if ((paramAnonymousInt >= i) && (paramAnonymousInt <= j - k))
        {
          View localView = GameLibraryUI.b(GameLibraryUI.this).getChildAt(paramAnonymousInt - i);
          GameLibraryUI.d(GameLibraryUI.this).x(localView, paramAnonymousInt);
        }
        GMTrace.o(12689883529216L, 94547);
      }
    };
    this.lZu = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(12730417283072L, 94849);
        c.a(paramAnonymousView, GameLibraryUI.this);
        ai.a(GameLibraryUI.this, 11, 1110, 999, 7, GameLibraryUI.e(GameLibraryUI.this), null);
        GMTrace.o(12730417283072L, 94849);
      }
    };
    this.lVw = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(12694446931968L, 94581);
        int i = 6;
        if ((paramAnonymousView.getTag() instanceof String))
        {
          c.a(paramAnonymousView, GameLibraryUI.this);
          i = 7;
        }
        for (;;)
        {
          ai.a(GameLibraryUI.this, 11, 1113, 1, i, GameLibraryUI.e(GameLibraryUI.this), null);
          GMTrace.o(12694446931968L, 94581);
          return;
          paramAnonymousView = new Intent(GameLibraryUI.this, GameCategoryUI.class);
          paramAnonymousView.putExtra("extra_type", 2);
          paramAnonymousView.putExtra("extra_category_name", GameLibraryUI.this.getString(R.l.dAa));
          paramAnonymousView.putExtra("game_report_from_scene", 1113);
          GameLibraryUI.this.startActivity(paramAnonymousView);
        }
      }
    };
    this.lZv = new GameDropdownView.a()
    {
      public final void oQ(int paramAnonymousInt)
      {
        GMTrace.i(12659684540416L, 94322);
        LinkedList localLinkedList = new LinkedList();
        localLinkedList.addAll(GameLibraryUI.f(GameLibraryUI.this).keySet());
        if (paramAnonymousInt > localLinkedList.size() - 1)
        {
          GMTrace.o(12659684540416L, 94322);
          return;
        }
        GameLibraryUI.a(GameLibraryUI.this, ((Integer)localLinkedList.get(paramAnonymousInt)).intValue());
        w.i("MicroMsg.GameLibraryUI", "Selected SortType: %d", new Object[] { Integer.valueOf(GameLibraryUI.g(GameLibraryUI.this)) });
        GameLibraryUI.b(GameLibraryUI.this, 0);
        GameLibraryUI.h(GameLibraryUI.this);
        ai.a(GameLibraryUI.this, 11, 1111, GameLibraryUI.g(GameLibraryUI.this) + GameLibraryUI.i(GameLibraryUI.this), 2, GameLibraryUI.e(GameLibraryUI.this), null);
        GMTrace.o(12659684540416L, 94322);
      }
    };
    this.lUB = new AbsListView.OnScrollListener()
    {
      public final void onScroll(AbsListView paramAnonymousAbsListView, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        GMTrace.i(12719411429376L, 94767);
        GMTrace.o(12719411429376L, 94767);
      }
      
      public final void onScrollStateChanged(AbsListView paramAnonymousAbsListView, int paramAnonymousInt)
      {
        GMTrace.i(12719277211648L, 94766);
        if ((paramAnonymousInt == 0) && (paramAnonymousAbsListView.getLastVisiblePosition() == paramAnonymousAbsListView.getCount() - 1))
        {
          if ((!GameLibraryUI.j(GameLibraryUI.this)) || (GameLibraryUI.k(GameLibraryUI.this)))
          {
            GMTrace.o(12719277211648L, 94766);
            return;
          }
          GameLibraryUI.l(GameLibraryUI.this).setVisibility(0);
          GameLibraryUI.h(GameLibraryUI.this);
        }
        GMTrace.o(12719277211648L, 94766);
      }
    };
    GMTrace.o(12710150406144L, 94698);
  }
  
  private void aGC()
  {
    GMTrace.i(12711492583424L, 94708);
    Object localObject = com.tencent.mm.plugin.game.model.e.aFf();
    int i = this.lNV;
    int j = this.lZo;
    if (this.lNV == 0) {}
    for (boolean bool = true;; bool = false)
    {
      localObject = new as(i, (LinkedList)localObject, j, bool);
      at.wS().a((com.tencent.mm.ad.k)localObject, 0);
      this.lUv = true;
      GMTrace.o(12711492583424L, 94708);
      return;
    }
  }
  
  private void goBack()
  {
    GMTrace.i(12711358365696L, 94707);
    Object localObject = getIntent().getStringExtra("jump_game_center");
    if ((!bg.nm((String)localObject)) && (((String)localObject).equals("jump_game_center")))
    {
      localObject = new Intent(this, GameCenterUI.class);
      ((Intent)localObject).putExtra("jump_find_more_friends", "jump_find_more_friends");
      startActivity((Intent)localObject);
    }
    finish();
    GMTrace.o(12711358365696L, 94707);
  }
  
  protected final void MP()
  {
    GMTrace.i(12711224147968L, 94706);
    oM(R.l.cyM);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(12767058722816L, 95122);
        GameLibraryUI.a(GameLibraryUI.this);
        GMTrace.o(12767058722816L, 95122);
        return true;
      }
    });
    if (!bg.nm(SubCoreGameCenter.aGd())) {
      a(0, R.l.eey, R.k.cIT, new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(12696325980160L, 94595);
          paramAnonymousMenuItem = new Intent(GameLibraryUI.this, GameSearchUI.class);
          paramAnonymousMenuItem.putExtra("game_report_from_scene", 1109);
          GameLibraryUI.this.startActivity(paramAnonymousMenuItem);
          GMTrace.o(12696325980160L, 94595);
          return true;
        }
      });
    }
    this.lUt = ((ListView)findViewById(R.h.bEs));
    this.lUt.setOnItemClickListener(this.lUz);
    this.lUz.oJ(this.lNQ);
    this.lUt.setOnScrollListener(this.lUB);
    this.lUu = new k(this);
    this.lUu.oJ(this.lNQ);
    this.lUu.a(this.lUA);
    LayoutInflater localLayoutInflater = (LayoutInflater)this.vKB.vKW.getSystemService("layout_inflater");
    Object localObject = localLayoutInflater.inflate(R.i.bEv, this.lUt, false);
    this.lZh = ((GameBannerView)((View)localObject).findViewById(R.h.bEv));
    this.lZh.lNQ = this.lNQ;
    this.lUt.addHeaderView((View)localObject);
    this.lZt += 1;
    this.lZi = ((GameLibraryCategoriesView)localLayoutInflater.inflate(R.i.cyO, this.lUt, false));
    localObject = new LinearLayout(this);
    ((LinearLayout)localObject).addView(this.lZi);
    this.lUt.addHeaderView((View)localObject);
    this.lZt += 1;
    this.lZj = localLayoutInflater.inflate(R.i.cyS, this.lUt, false);
    this.lZj.setOnClickListener(this.lZu);
    this.lZk = ((TextView)this.lZj.findViewById(R.h.bEu));
    this.lZl = localLayoutInflater.inflate(R.i.cyN, this.lUt, false);
    this.lZl.setOnClickListener(null);
    this.lZm = ((GameDropdownView)this.lZl.findViewById(R.h.bEq));
    this.lZm.lXR = this.lZl;
    this.lZm.lXQ = this.lZv;
    this.iTF = localLayoutInflater.inflate(R.i.cyT, this.lUt, false);
    this.iTF.setVisibility(8);
    localObject = new LinearLayout(this);
    ((LinearLayout)localObject).addView(this.iTF);
    this.lUt.addFooterView((View)localObject);
    this.lZp = localLayoutInflater.inflate(R.i.cyR, this.lUt, false);
    this.lZp.setVisibility(8);
    this.lZq = ((Button)this.lZp.findViewById(R.h.bEt));
    this.lZq.setOnClickListener(this.lVw);
    this.lUt.addFooterView(this.lZp);
    this.lUt.setAdapter(this.lUu);
    GMTrace.o(12711224147968L, 94706);
  }
  
  protected final int Qf()
  {
    GMTrace.i(12711089930240L, 94705);
    GMTrace.o(12711089930240L, 94705);
    return 1;
  }
  
  public final void a(int paramInt1, int paramInt2, final String paramString, com.tencent.mm.ad.k paramk)
  {
    GMTrace.i(12711626801152L, 94709);
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      switch (paramk.getType())
      {
      }
      for (;;)
      {
        GMTrace.o(12711626801152L, 94709);
        return;
        paramString = ((as)paramk).kzP.gtD.gtK;
        at.xB().A(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(12700486729728L, 94626);
            final Object localObject = paramString;
            if ((GameLibraryUI.m(GameLibraryUI.this) == 0) && (!GameLibraryUI.n(GameLibraryUI.this))) {}
            for (boolean bool = true;; bool = false)
            {
              localObject = new com.tencent.mm.plugin.game.model.af((com.tencent.mm.bm.a)localObject, bool, GameLibraryUI.m(GameLibraryUI.this));
              GameLibraryUI.o(GameLibraryUI.this);
              com.tencent.mm.sdk.platformtools.af.t(new Runnable()
              {
                public final void run()
                {
                  GMTrace.i(12662100459520L, 94340);
                  GameLibraryUI localGameLibraryUI = GameLibraryUI.this;
                  com.tencent.mm.plugin.game.model.af localaf = localObject;
                  if (GameLibraryUI.m(GameLibraryUI.this) != 0) {}
                  for (boolean bool = true;; bool = false)
                  {
                    GameLibraryUI.a(localGameLibraryUI, localaf, bool);
                    GameLibraryUI.p(GameLibraryUI.this);
                    GameLibraryUI.l(GameLibraryUI.this).setVisibility(8);
                    GameLibraryUI.b(GameLibraryUI.this, GameLibraryUI.m(GameLibraryUI.this) + 15);
                    if (GameLibraryUI.q(GameLibraryUI.this) != null) {
                      GameLibraryUI.q(GameLibraryUI.this).dismiss();
                    }
                    GMTrace.o(12662100459520L, 94340);
                    return;
                  }
                }
              });
              GMTrace.o(12700486729728L, 94626);
              return;
            }
          }
        });
      }
    }
    if (!com.tencent.mm.plugin.game.a.a.hnI.a(this, paramInt1, paramInt2, paramString)) {
      Toast.makeText(this, getString(R.l.dAi, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), 0).show();
    }
    if (this.kAu != null) {
      this.kAu.cancel();
    }
    GMTrace.o(12711626801152L, 94709);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(12710955712512L, 94704);
    int i = R.i.cyM;
    GMTrace.o(12710955712512L, 94704);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(12711761018880L, 94710);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    w.i("MicroMsg.GameLibraryUI", "requestCode = %d, resultCode = %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if (paramInt1 != 1)
    {
      w.e("MicroMsg.GameLibraryUI", "error request code");
      GMTrace.o(12711761018880L, 94710);
      return;
    }
    GMTrace.o(12711761018880L, 94710);
  }
  
  public void onCreate(final Bundle paramBundle)
  {
    GMTrace.i(12710284623872L, 94699);
    super.onCreate(paramBundle);
    if (!at.AU())
    {
      w.e("MicroMsg.GameLibraryUI", "account not ready");
      finish();
      GMTrace.o(12710284623872L, 94699);
      return;
    }
    this.lNQ = getIntent().getIntExtra("game_report_from_scene", 0);
    at.wS().a(1218, this);
    MP();
    paramBundle = SubCoreGameCenter.aGj().zI("pb_library");
    if (paramBundle == null) {
      w.i("MicroMsg.GameLibraryUI", "No cache found");
    }
    for (int i = 0;; i = 1)
    {
      if (i == 0)
      {
        this.kAu = c.cD(this);
        this.kAu.show();
      }
      aGC();
      ai.a(this, 11, 1100, 0, 1, this.lNQ, null);
      GMTrace.o(12710284623872L, 94699);
      return;
      at.xB().A(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(12772964302848L, 95166);
          com.tencent.mm.sdk.platformtools.af.t(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(12719008776192L, 94764);
              GameLibraryUI.a(GameLibraryUI.this, this.lZx, false);
              GMTrace.o(12719008776192L, 94764);
            }
          });
          GMTrace.o(12772964302848L, 95166);
        }
      });
    }
  }
  
  protected void onDestroy()
  {
    GMTrace.i(12710687277056L, 94702);
    w.i("MicroMsg.GameLibraryUI", "onDestroy");
    super.onDestroy();
    at.wS().b(1218, this);
    this.lUu.clear();
    if (this.lZh != null) {
      this.lZh.lUm.stopTimer();
    }
    GMTrace.o(12710687277056L, 94702);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(12710821494784L, 94703);
    if ((paramInt == 4) && (paramKeyEvent.getRepeatCount() == 0))
    {
      goBack();
      GMTrace.o(12710821494784L, 94703);
      return true;
    }
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    GMTrace.o(12710821494784L, 94703);
    return bool;
  }
  
  protected void onPause()
  {
    GMTrace.i(12710553059328L, 94701);
    super.onPause();
    if (this.lZh != null)
    {
      GameBannerView localGameBannerView = this.lZh;
      if (localGameBannerView.lUm != null)
      {
        localGameBannerView.lUm.stopTimer();
        w.i("MicroMsg.GameBannerView", "Auto scroll stopped");
      }
    }
    GMTrace.o(12710553059328L, 94701);
  }
  
  protected void onResume()
  {
    GMTrace.i(12710418841600L, 94700);
    super.onResume();
    if (!at.AU())
    {
      w.e("MicroMsg.GameLibraryUI", "account not ready");
      GMTrace.o(12710418841600L, 94700);
      return;
    }
    this.lUu.refresh();
    if ((!this.lVo) && (this.lZh != null))
    {
      GameBannerView localGameBannerView = this.lZh;
      if ((localGameBannerView.lUm != null) && (localGameBannerView.lUm.bQn()) && (localGameBannerView.lUl.size() > 1))
      {
        localGameBannerView.lUm.z(5000L, 5000L);
        w.i("MicroMsg.GameBannerView", "Auto scroll restarted");
      }
    }
    if (this.lVo) {
      this.lVo = false;
    }
    GMTrace.o(12710418841600L, 94700);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\ui\GameLibraryUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */