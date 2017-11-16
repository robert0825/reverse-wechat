package com.tencent.mm.plugin.game.ui;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.bj.d;
import com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo;
import com.tencent.mm.plugin.game.c.ao;
import com.tencent.mm.plugin.game.model.SubCoreGameCenter;
import com.tencent.mm.plugin.game.model.ai;
import com.tencent.mm.plugin.game.model.ar;
import com.tencent.mm.plugin.game.model.ay;
import com.tencent.mm.plugin.game.model.m;
import com.tencent.mm.plugin.game.model.q;
import com.tencent.mm.plugin.game.model.t;
import com.tencent.mm.plugin.game.model.z;
import com.tencent.mm.pluginsdk.model.app.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.v;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.p;
import com.tencent.mm.y.at;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

public class GameCenterUI2
  extends GameCenterActivity
  implements com.tencent.mm.ad.e
{
  private Dialog kAu;
  private int lNQ;
  private ao lOf;
  private l.a lUA;
  private GameCenterListView lUY;
  private f lUZ;
  j lUz;
  private GameTopBannerView lVa;
  private GameInfoView lVb;
  private GameInfoViewForeign lVc;
  private GameMessageBubbleView lVd;
  private GameCommonRecommendView lVe;
  private MyGameInfoView lVf;
  private GameInstalledView lVg;
  private GameClassifyView lVh;
  private View lVi;
  private TextView lVj;
  private View lVk;
  private TextView lVl;
  private ImageView lVm;
  private View lVn;
  private boolean lVo;
  private boolean lVp;
  private boolean lVq;
  private String lVr;
  private q lVs;
  private q lVt;
  private q lVu;
  private boolean lVv;
  private View.OnClickListener lVw;
  private View.OnClickListener lVx;
  
  public GameCenterUI2()
  {
    GMTrace.i(12734578032640L, 94880);
    this.lVo = true;
    this.lVq = false;
    this.lVr = "";
    this.lNQ = 0;
    this.lVv = false;
    this.lUz = new j();
    this.lVw = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(12686930739200L, 94525);
        com.tencent.mm.plugin.game.model.a.a locala = com.tencent.mm.plugin.game.model.a.aEY();
        int i;
        if (locala.eQl == 2) {
          i = com.tencent.mm.plugin.game.d.c.p(GameCenterUI2.this.vKB.vKW, locala.url, "game_center_library");
        }
        for (;;)
        {
          ai.a(GameCenterUI2.this.vKB.vKW, 10, 1005, 1, i, GameCenterUI2.f(GameCenterUI2.this), null);
          GMTrace.o(12686930739200L, 94525);
          return;
          paramAnonymousView = paramAnonymousView.getTag();
          if ((paramAnonymousView != null) && ((paramAnonymousView instanceof String)) && (!bg.nm((String)paramAnonymousView)))
          {
            paramAnonymousView = (String)paramAnonymousView;
            i = com.tencent.mm.plugin.game.d.c.p(GameCenterUI2.this, paramAnonymousView, "game_center_library");
          }
          else
          {
            paramAnonymousView = new Intent(GameCenterUI2.this, GameLibraryUI.class);
            paramAnonymousView.putExtra("game_report_from_scene", 1005);
            GameCenterUI2.this.startActivity(paramAnonymousView);
            i = 6;
          }
        }
      }
    };
    this.lVx = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(12662637330432L, 94344);
        Object localObject = paramAnonymousView.getTag();
        if ((localObject != null) && ((localObject instanceof String)) && (!bg.nm((String)localObject)))
        {
          paramAnonymousView = (String)paramAnonymousView.getTag();
          int i = com.tencent.mm.plugin.game.d.c.p(GameCenterUI2.this.vKB.vKW, paramAnonymousView, "game_center_feedback");
          ai.a(GameCenterUI2.this.vKB.vKW, 10, 1010, 1, i, GameCenterUI2.f(GameCenterUI2.this), null);
        }
        GMTrace.o(12662637330432L, 94344);
      }
    };
    this.lUA = new l.a()
    {
      public final void oL(int paramAnonymousInt)
      {
        GMTrace.i(12733235855360L, 94870);
        int i = GameCenterUI2.g(GameCenterUI2.this).getHeaderViewsCount();
        int j = GameCenterUI2.g(GameCenterUI2.this).getFirstVisiblePosition() - i;
        int k = GameCenterUI2.g(GameCenterUI2.this).getLastVisiblePosition();
        if ((paramAnonymousInt >= j) && (paramAnonymousInt <= k - i))
        {
          View localView = GameCenterUI2.g(GameCenterUI2.this).getChildAt(paramAnonymousInt - j);
          GameCenterUI2.h(GameCenterUI2.this).x(localView, paramAnonymousInt);
        }
        GMTrace.o(12733235855360L, 94870);
      }
    };
    GMTrace.o(12734578032640L, 94880);
  }
  
  private void a(com.tencent.mm.plugin.game.model.ae paramae)
  {
    GMTrace.i(15199620825088L, 113246);
    if ((paramae != null) && (paramae.aFO() != null)) {}
    for (this.lVr = paramae.aFO().lPE; !bg.nm(this.lVr); this.lVr = "")
    {
      if (this.lVp) {
        break label104;
      }
      a(0, R.k.cIU, new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(12677938151424L, 94458);
          int i = com.tencent.mm.plugin.game.d.c.aa(GameCenterUI2.this.vKB.vKW, GameCenterUI2.o(GameCenterUI2.this));
          ai.a(GameCenterUI2.this, 10, 1008, AuthorizedGameListUI.lTw, i, GameCenterUI2.f(GameCenterUI2.this), null);
          GMTrace.o(12677938151424L, 94458);
          return true;
        }
      });
      this.lVp = true;
      GMTrace.o(15199620825088L, 113246);
      return;
    }
    if (this.lVp)
    {
      AZ(0);
      this.lVp = false;
    }
    label104:
    GMTrace.o(15199620825088L, 113246);
  }
  
  private void goBack()
  {
    GMTrace.i(12734980685824L, 94883);
    Object localObject = getIntent().getStringExtra("jump_find_more_friends");
    if ((!bg.nm((String)localObject)) && (((String)localObject).equals("jump_find_more_friends")))
    {
      localObject = new Intent();
      ((Intent)localObject).addFlags(67108864);
      ((Intent)localObject).putExtra("preferred_tab", 2);
      d.a(this, ".ui.LauncherUI", (Intent)localObject);
    }
    finish();
    GMTrace.o(12734980685824L, 94883);
  }
  
  protected final void MP()
  {
    GMTrace.i(12735517556736L, 94887);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(12748134023168L, 94981);
        GameCenterUI2.e(GameCenterUI2.this);
        GMTrace.o(12748134023168L, 94981);
        return true;
      }
    });
    oM(R.l.dAR);
    this.lUY = ((GameCenterListView)findViewById(R.h.bCL));
    this.lUY.setOnItemClickListener(this.lUz);
    this.lUz.oJ(this.lNQ);
    this.lUZ = new f(this);
    this.lUZ.oJ(this.lNQ);
    this.lUZ.a(this.lUA);
    Object localObject = (LayoutInflater)this.vKB.vKW.getSystemService("layout_inflater");
    View localView = ((LayoutInflater)localObject).inflate(R.i.czx, this.lUY, false);
    this.lVa = ((GameTopBannerView)localView.findViewById(R.h.cia));
    this.lUY.addHeaderView(localView);
    localView = ((LayoutInflater)localObject).inflate(R.i.cyn, this.lUY, false);
    this.lVc = ((GameInfoViewForeign)localView.findViewById(R.h.bCJ));
    this.lUY.addHeaderView(localView);
    localView = ((LayoutInflater)localObject).inflate(R.i.cym, this.lUY, false);
    this.lVb = ((GameInfoView)localView.findViewById(R.h.bCI));
    this.lUY.addHeaderView(localView);
    localView = ((LayoutInflater)localObject).inflate(R.i.cyi, this.lUY, false);
    this.lVd = ((GameMessageBubbleView)localView.findViewById(R.h.bEF));
    this.lUY.addHeaderView(localView);
    localView = ((LayoutInflater)localObject).inflate(R.i.cyq, this.lUY, false);
    this.lVf = ((MyGameInfoView)localView.findViewById(R.h.bPj));
    this.lUY.addHeaderView(localView);
    localView = ((LayoutInflater)localObject).inflate(R.i.bCH, this.lUY, false);
    this.lVe = ((GameCommonRecommendView)localView.findViewById(R.h.bCH));
    this.lUY.addHeaderView(localView);
    localView = ((LayoutInflater)localObject).inflate(R.i.cyo, this.lUY, false);
    this.lVg = ((GameInstalledView)localView.findViewById(R.h.bEg));
    this.lUY.addHeaderView(localView);
    localView = ((LayoutInflater)localObject).inflate(R.i.cyr, this.lUY, false);
    this.lVh = ((GameClassifyView)localView.findViewById(R.h.bCO));
    this.lUY.addHeaderView(localView);
    localView = ((LayoutInflater)localObject).inflate(R.i.cyl, this.lUY, false);
    this.lUY.addFooterView(localView);
    this.lVi = localView.findViewById(R.h.bEa);
    this.lVi.setOnClickListener(this.lVw);
    this.lVj = ((TextView)localView.findViewById(R.h.bEb));
    localView = ((LayoutInflater)localObject).inflate(R.i.cyj, null);
    this.lUY.addFooterView(localView);
    this.lVk = localView.findViewById(R.h.bzH);
    this.lVl = ((TextView)localView.findViewById(R.h.bzI));
    this.lVl.setOnClickListener(this.lVx);
    localObject = ((LayoutInflater)localObject).inflate(R.i.cyK, this.lUY, false);
    this.lUY.addFooterView((View)localObject);
    this.lVm = ((ImageView)((View)localObject).findViewById(R.h.bEe));
    this.lUY.setAdapter(this.lUZ);
    this.lVn = findViewById(R.h.bFt);
    GMTrace.o(12735517556736L, 94887);
  }
  
  protected final int Qf()
  {
    GMTrace.i(12735383339008L, 94886);
    GMTrace.o(12735383339008L, 94886);
    return 1;
  }
  
  public final void a(int paramInt1, int paramInt2, final String paramString, k paramk)
  {
    GMTrace.i(12735651774464L, 94888);
    w.i("MicroMsg.GameCenterUI2", "errType: %d errCode: %d, scene: %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramk.hashCode()) });
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      switch (paramk.getType())
      {
      }
      for (;;)
      {
        GMTrace.o(12735651774464L, 94888);
        return;
        final long l = System.currentTimeMillis();
        paramString = ((ar)paramk).kzP.gtD.gtK;
        com.tencent.mm.plugin.game.d.c.xB().A(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(12687199174656L, 94527);
            if (paramString == null) {
              GameCenterUI2.a(GameCenterUI2.this, new ao());
            }
            for (;;)
            {
              af.t(new Runnable()
              {
                public final void run()
                {
                  GMTrace.i(12771219472384L, 95153);
                  try
                  {
                    GameCenterUI2.a(GameCenterUI2.this, this.lVA, 2);
                    if (GameCenterUI2.i(GameCenterUI2.this) != null) {
                      GameCenterUI2.i(GameCenterUI2.this).dismiss();
                    }
                    w.i("MicroMsg.GameCenterUI2", "Server data parsing time: %d", new Object[] { Long.valueOf(System.currentTimeMillis() - GameCenterUI2.2.this.fJi) });
                    GMTrace.o(12771219472384L, 95153);
                    return;
                  }
                  catch (Exception localException)
                  {
                    for (;;)
                    {
                      w.e("MicroMsg.GameCenterUI2", "GameCenter crash, %s", new Object[] { localException.getMessage() });
                      GameCenterUI2.this.finish();
                    }
                  }
                }
              });
              GMTrace.o(12687199174656L, 94527);
              return;
              GameCenterUI2.a(GameCenterUI2.this, (ao)paramString);
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
    GMTrace.o(12735651774464L, 94888);
  }
  
  public final int aGs()
  {
    GMTrace.i(19279705538560L, 143645);
    GMTrace.o(19279705538560L, 143645);
    return 10;
  }
  
  public final int aGt()
  {
    GMTrace.i(19279839756288L, 143646);
    GMTrace.o(19279839756288L, 143646);
    return 1000;
  }
  
  public final int aGu()
  {
    GMTrace.i(19279973974016L, 143647);
    int i = this.lNQ;
    GMTrace.o(19279973974016L, 143647);
    return i;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(12735249121280L, 94885);
    int i = R.i.cyk;
    GMTrace.o(12735249121280L, 94885);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(12735920209920L, 94890);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    w.i("MicroMsg.GameCenterUI2", "requestCode = %d, resultCode = %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    GMTrace.o(12735920209920L, 94890);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(12734712250368L, 94881);
    super.onCreate(paramBundle);
    long l = System.currentTimeMillis();
    if (!at.AU())
    {
      w.e("MicroMsg.GameCenterUI2", "account not ready");
      finish();
      GMTrace.o(12734712250368L, 94881);
      return;
    }
    this.lNQ = getIntent().getIntExtra("game_report_from_scene", 0);
    this.lVq = getIntent().getBooleanExtra("from_find_more_friend", false);
    com.tencent.mm.plugin.game.d.c.xB().A(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(12732296331264L, 94863);
        GameCenterUI2.a(GameCenterUI2.this);
        if (GameCenterUI2.b(GameCenterUI2.this))
        {
          GameCenterUI2.c(GameCenterUI2.this);
          GameCenterUI2.d(GameCenterUI2.this);
          SubCoreGameCenter.aGg();
          t.aFt();
          SubCoreGameCenter.aGg();
          t.aFv();
        }
        GMTrace.o(12732296331264L, 94863);
      }
    });
    at.wS().a(1238, this);
    MP();
    com.tencent.mm.plugin.game.d.c.xB().A(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(12723974832128L, 94801);
        Object localObject1 = SubCoreGameCenter.aGj().zI("pb_index_2");
        SharedPreferences localSharedPreferences;
        int i;
        label189:
        Object localObject3;
        String str;
        Object localObject2;
        if (localObject1 == null)
        {
          af.t(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(12709747752960L, 94695);
              if (GameCenterUI2.this.isFinishing())
              {
                GMTrace.o(12709747752960L, 94695);
                return;
              }
              GameCenterUI2.a(GameCenterUI2.this, com.tencent.mm.plugin.game.d.c.cD(GameCenterUI2.this));
              GameCenterUI2.i(GameCenterUI2.this).show();
              GMTrace.o(12709747752960L, 94695);
            }
          });
          SubCoreGameCenter.aGl().init(GameCenterUI2.this);
          com.tencent.mm.plugin.game.d.c.U(com.tencent.mm.plugin.game.model.e.aFf());
          af.t(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(12747597152256L, 94977);
              GameCenterUI2.j(GameCenterUI2.this).ed(true);
              GMTrace.o(12747597152256L, 94977);
            }
          });
          localObject1 = new ar(v.bPK(), com.tencent.mm.plugin.game.model.e.aFf(), GameCenterUI2.k(GameCenterUI2.this), GameCenterUI2.l(GameCenterUI2.this), GameCenterUI2.m(GameCenterUI2.this), GameCenterUI2.b(GameCenterUI2.this));
          at.wS().a((k)localObject1, 0);
          ActionBarActivity localActionBarActivity = GameCenterUI2.this.vKB.vKW;
          long l = System.currentTimeMillis() / 1000L;
          localSharedPreferences = localActionBarActivity.getSharedPreferences("game_center_pref", 0);
          localObject1 = localSharedPreferences.getString("download_app_id_time_map", "");
          if (bg.nm((String)localObject1)) {
            break label510;
          }
          String[] arrayOfString1 = ((String)localObject1).split(",");
          localObject1 = new String();
          int j = arrayOfString1.length;
          i = 0;
          if (i >= j) {
            break label442;
          }
          localObject3 = arrayOfString1[i];
          String[] arrayOfString2 = ((String)localObject3).split("-");
          str = arrayOfString2[0];
          localObject2 = localObject1;
          if (!bg.nm(str))
          {
            localObject2 = localObject1;
            if (!g.n(localActionBarActivity, str))
            {
              if (l - bg.getLong(arrayOfString2[1], 0L) >= 86400L) {
                break label319;
              }
              localObject2 = (String)localObject1 + (String)localObject3 + ",";
            }
          }
        }
        for (;;)
        {
          i += 1;
          localObject1 = localObject2;
          break label189;
          af.t(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(12691359924224L, 94558);
              try
              {
                GameCenterUI2.a(GameCenterUI2.this, this.lVA, 1);
                GMTrace.o(12691359924224L, 94558);
                return;
              }
              catch (Exception localException)
              {
                w.e("MicroMsg.GameCenterUI2", "GameCenter crash, %s", new Object[] { localException.getMessage() });
                GameCenterUI2.this.finish();
                GMTrace.o(12691359924224L, 94558);
              }
            }
          });
          break;
          label319:
          localObject3 = com.tencent.mm.plugin.downloader.model.f.apJ().vv(str);
          w.i("MicroMsg.GameCenterLogic", "checkGameDownloadTime, status = %d, id = %d", new Object[] { Integer.valueOf(((FileDownloadTaskInfo)localObject3).status), Long.valueOf(((FileDownloadTaskInfo)localObject3).id) });
          if (((FileDownloadTaskInfo)localObject3).status == 2)
          {
            com.tencent.mm.plugin.downloader.model.f.apJ().bf(((FileDownloadTaskInfo)localObject3).id);
            localObject2 = localObject1;
          }
          else if (((FileDownloadTaskInfo)localObject3).status != 0)
          {
            localObject2 = localObject1;
            if (((FileDownloadTaskInfo)localObject3).status != 4) {}
          }
          else
          {
            localObject2 = localObject1;
            if (com.tencent.mm.a.e.aZ(((FileDownloadTaskInfo)localObject3).path))
            {
              com.tencent.mm.loader.stub.b.deleteFile(((FileDownloadTaskInfo)localObject3).path);
              localObject2 = localObject1;
            }
          }
        }
        label442:
        if (!bg.nm((String)localObject1))
        {
          localObject2 = localObject1;
          if (((String)localObject1).charAt(((String)localObject1).length() - 1) == ',') {
            localObject2 = ((String)localObject1).substring(0, ((String)localObject1).length() - 1);
          }
          localSharedPreferences.edit().putString("download_app_id_time_map", ((String)localObject2).toString()).apply();
        }
        label510:
        localObject1 = v.bPK();
        ab.getContext().getSharedPreferences("game_center_pref", 0).edit().putString("game_center_pref_lang", (String)localObject1).commit();
        com.tencent.mm.plugin.game.d.a.a.mdJ.aGN();
        GMTrace.o(12723974832128L, 94801);
      }
    });
    ai.a(this, 10, 1000, 0, 1, 0, null, this.lNQ, 0, null, null, null);
    w.i("MicroMsg.GameCenterUI2", "[onCreate] time:" + (System.currentTimeMillis() - l));
    w.i("MicroMsg.GameCenterUI2", "fromScene = %d", new Object[] { Integer.valueOf(this.lNQ) });
    GMTrace.o(12734712250368L, 94881);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(12735114903552L, 94884);
    w.i("MicroMsg.GameCenterUI2", "onDestroy");
    super.onDestroy();
    if (!at.AU())
    {
      w.e("MicroMsg.GameCenterUI2", "account not ready");
      GMTrace.o(12735114903552L, 94884);
      return;
    }
    if (this.lUZ != null) {
      this.lUZ.clear();
    }
    if (this.lVg != null)
    {
      localObject = this.lVg;
      if (((GameInstalledView)localObject).lOh != null) {
        ((GameInstalledView)localObject).lOh.clear();
      }
      if (((GameInstalledView)localObject).lWM != null) {
        com.tencent.mm.plugin.game.model.l.b(((GameInstalledView)localObject).lWM);
      }
    }
    if (this.lVf != null)
    {
      localObject = this.lVf;
      if (((MyGameInfoView)localObject).lWM != null) {
        com.tencent.mm.plugin.game.model.l.b(((MyGameInfoView)localObject).lWM);
      }
      if (MyGameInfoView.mdg != null) {
        MyGameInfoView.mdg.clear();
      }
    }
    com.tencent.mm.plugin.game.d.a.a.mdJ.clearCache();
    at.wS().b(1238, this);
    Object localObject = SubCoreGameCenter.aGl();
    w.i("MicroMsg.GameAppCacheService", "clear cached apppinfos");
    if (((com.tencent.mm.plugin.game.model.b)localObject).lLu != null) {
      ((com.tencent.mm.plugin.game.model.b)localObject).lLu.clear();
    }
    if (((com.tencent.mm.plugin.game.model.b)localObject).lLt != null) {
      ((com.tencent.mm.plugin.game.model.b)localObject).lLt.clear();
    }
    ay.aGc();
    GMTrace.o(12735114903552L, 94884);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(12735785992192L, 94889);
    if ((paramInt == 4) && (paramKeyEvent.getRepeatCount() == 0))
    {
      goBack();
      GMTrace.o(12735785992192L, 94889);
      return true;
    }
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    GMTrace.o(12735785992192L, 94889);
    return bool;
  }
  
  protected void onResume()
  {
    GMTrace.i(12734846468096L, 94882);
    super.onResume();
    if (!at.AU())
    {
      w.e("MicroMsg.GameCenterUI2", "account not ready");
      GMTrace.o(12734846468096L, 94882);
      return;
    }
    if (!this.lVo)
    {
      if (this.lVb.getVisibility() == 0) {
        this.lVb.aGA();
      }
      for (;;)
      {
        SubCoreGameCenter.aGl().init(this);
        this.lVg.ed(false);
        this.lUZ.refresh();
        if (this.lVf == null) {
          break;
        }
        localObject1 = this.lVf;
        String[] arrayOfString = new String[MyGameInfoView.mdg.keySet().size()];
        MyGameInfoView.mdg.keySet().toArray(arrayOfString);
        int i = 0;
        while (i < arrayOfString.length)
        {
          Object localObject2 = arrayOfString[i];
          Object localObject3 = (View)MyGameInfoView.mdg.get(localObject2);
          if (localObject3 != null)
          {
            localObject3 = (MyGameInfoView.a)((View)localObject3).getTag();
            localObject2 = (m)((MyGameInfoView)localObject1).mdf.get(localObject2);
            if ((localObject2 != null) && (((m)localObject2).lMw != null)) {
              ((MyGameInfoView)localObject1).lWN.a(((MyGameInfoView.a)localObject3).lZQ, ((MyGameInfoView.a)localObject3).lZP, ((m)localObject2).lMw, (m)((MyGameInfoView)localObject1).mdf.get(((m)localObject2).lMw.field_appId));
            }
          }
          i += 1;
        }
        if (this.lVc.getVisibility() == 0) {
          this.lVc.aGA();
        }
      }
      Object localObject1 = this.lVd;
      ((GameMessageBubbleView)localObject1).maw.setOnClickListener(null);
      ((GameMessageBubbleView)localObject1).setVisibility(8);
      if (this.lVq) {
        this.lVd.aGF();
      }
      if (com.tencent.mm.plugin.game.d.a.a.mdJ.mdI)
      {
        com.tencent.mm.plugin.game.d.a.a.mdJ.mdI = false;
        com.tencent.mm.plugin.game.d.c.xB().A(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(12662905765888L, 94346);
            ar localar = new ar(v.bPK(), com.tencent.mm.plugin.game.model.e.aFf(), GameCenterUI2.k(GameCenterUI2.this), GameCenterUI2.l(GameCenterUI2.this), GameCenterUI2.m(GameCenterUI2.this), GameCenterUI2.b(GameCenterUI2.this));
            at.wS().a(localar, 0);
            GMTrace.o(12662905765888L, 94346);
          }
        });
      }
    }
    this.lVo = false;
    GMTrace.o(12734846468096L, 94882);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\ui\GameCenterUI2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */