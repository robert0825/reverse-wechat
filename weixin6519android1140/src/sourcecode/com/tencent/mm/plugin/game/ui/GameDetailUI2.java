package com.tencent.mm.plugin.game.ui;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Pair;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.ad.k;
import com.tencent.mm.ao.a.a.c.a;
import com.tencent.mm.plugin.game.c.am;
import com.tencent.mm.plugin.game.c.av;
import com.tencent.mm.plugin.game.c.aw;
import com.tencent.mm.plugin.game.c.az;
import com.tencent.mm.plugin.game.c.ba;
import com.tencent.mm.plugin.game.c.cc;
import com.tencent.mm.plugin.game.c.q;
import com.tencent.mm.plugin.game.model.SubCoreGameCenter;
import com.tencent.mm.plugin.game.model.ac;
import com.tencent.mm.plugin.game.model.ac.a;
import com.tencent.mm.plugin.game.model.ac.b;
import com.tencent.mm.plugin.game.model.ad;
import com.tencent.mm.plugin.game.model.ai;
import com.tencent.mm.plugin.game.model.ap;
import com.tencent.mm.plugin.game.model.l.b;
import com.tencent.mm.plugin.game.model.m;
import com.tencent.mm.plugin.game.model.z;
import com.tencent.mm.plugin.game.widget.TextProgressBar;
import com.tencent.mm.pluginsdk.model.app.g;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.pluginsdk.ui.applet.o.a;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.v;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.p.c;
import com.tencent.mm.ui.base.p.d;
import com.tencent.mm.ui.p;
import com.tencent.mm.y.at;
import com.tencent.mm.y.u;
import com.tencent.mm.y.u.b;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class GameDetailUI2
  extends MMActivity
  implements com.tencent.mm.ad.e
{
  private String appId;
  private Dialog kAu;
  private com.tencent.mm.plugin.game.model.c lMw;
  private int lNQ;
  private String lWF;
  private String lWG;
  private int lWI;
  private boolean lWJ;
  private boolean lWK;
  private String lWL;
  private l.b lWM;
  private e lWN;
  private m lWO;
  private ViewGroup lWP;
  private ImageView lWQ;
  private ImageView lWR;
  private TextView lWS;
  private Button lWT;
  private TextProgressBar lWU;
  private TextView lWV;
  private LinearLayout lWW;
  private GameDetailAutoScrollView lWX;
  private LinearLayout lWY;
  private TextView lWZ;
  private View.OnClickListener lXA;
  private View.OnClickListener lXB;
  private View.OnClickListener lXC;
  private View.OnClickListener lXD;
  private LinearLayout lXa;
  private TextView lXb;
  private LinearLayout lXc;
  private ImageView lXd;
  private View lXe;
  private TextView lXf;
  private TextView lXg;
  private View lXh;
  private TextView lXi;
  private ImageView lXj;
  private TextView lXk;
  private TextView lXl;
  private LinearLayout lXm;
  private GameMediaList lXn;
  private TextView lXo;
  private TextView lXp;
  private TextView lXq;
  private boolean lXr;
  private LinearLayout lXs;
  private TextView lXt;
  private LinearLayout lXu;
  private TextView lXv;
  private cc lXw;
  private DialogInterface.OnClickListener lXx;
  private View.OnClickListener lXy;
  private View.OnClickListener lXz;
  
  public GameDetailUI2()
  {
    GMTrace.i(12668140257280L, 94385);
    this.appId = null;
    this.lMw = null;
    this.lWF = null;
    this.lWG = null;
    this.lWI = 18;
    this.lNQ = 0;
    this.lWL = null;
    this.lWM = null;
    this.lWN = null;
    this.lWO = null;
    this.lXr = false;
    this.lXx = new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(12744644362240L, 94955);
        GameDetailUI2.i(GameDetailUI2.this).aFo();
        GameDetailUI2.m(GameDetailUI2.this).a(GameDetailUI2.j(GameDetailUI2.this), GameDetailUI2.k(GameDetailUI2.this), GameDetailUI2.l(GameDetailUI2.this), GameDetailUI2.i(GameDetailUI2.this));
        GMTrace.o(12744644362240L, 94955);
      }
    };
    this.lXy = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(12690420400128L, 94551);
        if (GameDetailUI2.l(GameDetailUI2.this) == null)
        {
          w.e("MicroMsg.GameDetailUI2", "Null appInfo");
          GMTrace.o(12690420400128L, 94551);
          return;
        }
        if (GameDetailUI2.i(GameDetailUI2.this) == null)
        {
          w.e("MicroMsg.GameDetailUI2", "No DownloadInfo found");
          GMTrace.o(12690420400128L, 94551);
          return;
        }
        GameDetailUI2.i(GameDetailUI2.this).cB(GameDetailUI2.this.vKB.vKW);
        GameDetailUI2.m(GameDetailUI2.this).a(GameDetailUI2.l(GameDetailUI2.this), GameDetailUI2.i(GameDetailUI2.this));
        GMTrace.o(12690420400128L, 94551);
      }
    };
    this.lXz = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(12675388014592L, 94439);
        if ((paramAnonymousView.getTag() instanceof String))
        {
          com.tencent.mm.plugin.game.d.c.a(paramAnonymousView, GameDetailUI2.this);
          ai.a(GameDetailUI2.this.vKB.vKW, 12, 1203, 999, 7, GameDetailUI2.f(GameDetailUI2.this), GameDetailUI2.g(GameDetailUI2.this), null);
          GMTrace.o(12675388014592L, 94439);
          return;
        }
        Object localObject = new GameDetailRankUI.a();
        ((GameDetailRankUI.a)localObject).lWF = GameDetailUI2.n(GameDetailUI2.this);
        ((GameDetailRankUI.a)localObject).lWG = GameDetailUI2.o(GameDetailUI2.this);
        ((GameDetailRankUI.a)localObject).lWH = GameDetailUI2.l(GameDetailUI2.this);
        paramAnonymousView = u.gy("rankData");
        u.Av().p(paramAnonymousView, true).o(GameDetailRankUI.lWD, localObject);
        localObject = new Intent(GameDetailUI2.this.vKB.vKW, GameDetailRankUI.class);
        ((Intent)localObject).putExtra(GameDetailRankUI.EXTRA_SESSION_ID, paramAnonymousView);
        GameDetailUI2.this.startActivity((Intent)localObject);
        ai.a(GameDetailUI2.this.vKB.vKW, 12, 1203, 999, 6, GameDetailUI2.f(GameDetailUI2.this), GameDetailUI2.g(GameDetailUI2.this), null);
        GMTrace.o(12675388014592L, 94439);
      }
    };
    this.lXA = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(12775111786496L, 95182);
        com.tencent.mm.plugin.game.d.c.a(paramAnonymousView, GameDetailUI2.this);
        ai.a(GameDetailUI2.this.vKB.vKW, 12, 1204, 999, 7, GameDetailUI2.f(GameDetailUI2.this), GameDetailUI2.g(GameDetailUI2.this), null);
        GMTrace.o(12775111786496L, 95182);
      }
    };
    this.lXB = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(12715250679808L, 94736);
        com.tencent.mm.plugin.game.d.c.a(paramAnonymousView, GameDetailUI2.this);
        ai.a(GameDetailUI2.this.vKB.vKW, 12, 1205, 1, 7, GameDetailUI2.f(GameDetailUI2.this), GameDetailUI2.g(GameDetailUI2.this), null);
        GMTrace.o(12715250679808L, 94736);
      }
    };
    this.lXC = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(12740349394944L, 94923);
        com.tencent.mm.plugin.game.d.c.a(paramAnonymousView, GameDetailUI2.this);
        ai.a(GameDetailUI2.this.vKB.vKW, 12, 1205, 999, 7, GameDetailUI2.f(GameDetailUI2.this), GameDetailUI2.g(GameDetailUI2.this), null);
        GMTrace.o(12740349394944L, 94923);
      }
    };
    this.lXD = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(12758603005952L, 95059);
        com.tencent.mm.plugin.game.d.c.a(paramAnonymousView, GameDetailUI2.this);
        ai.a(GameDetailUI2.this.vKB.vKW, 12, 1206, 1, 7, GameDetailUI2.f(GameDetailUI2.this), GameDetailUI2.g(GameDetailUI2.this), null);
        GMTrace.o(12758603005952L, 95059);
      }
    };
    GMTrace.o(12668140257280L, 94385);
  }
  
  private void a(ac paramac)
  {
    GMTrace.i(12669482434560L, 94395);
    Object localObject1 = null;
    if ((paramac.lNZ.lOa == null) || (paramac.lNZ.lOa.size() == 0)) {
      localObject1 = paramac.lNW.lQW;
    }
    if ((localObject1 == null) || (((LinkedList)localObject1).size() == 0))
    {
      this.lWW.setVisibility(8);
      GMTrace.o(12669482434560L, 94395);
      return;
    }
    this.lWW.setVisibility(0);
    this.lWW.removeAllViews();
    paramac = ((LinkedList)localObject1).iterator();
    if (paramac.hasNext())
    {
      localObject1 = (q)paramac.next();
      View localView = LayoutInflater.from(this.vKB.vKW).inflate(R.i.cyE, this.lWW, false);
      ImageView localImageView = (ImageView)localView.findViewById(R.h.bDQ);
      TextView localTextView1 = (TextView)localView.findViewById(R.h.bDR);
      TextView localTextView2 = (TextView)localView.findViewById(R.h.bDP);
      if (!bg.nm(((q)localObject1).jhi)) {
        a.b.a(localImageView, ((q)localObject1).jhi, 0.5F, false);
      }
      for (;;)
      {
        localTextView1.setText(((q)localObject1).eBt);
        localTextView2.setText(((q)localObject1).lQf);
        this.lWW.addView(localView);
        break;
        Object localObject2 = new c.a();
        ((c.a)localObject2).gKZ = true;
        localObject2 = ((c.a)localObject2).Jn();
        com.tencent.mm.ao.n.Jd().a(((q)localObject1).lPh, localImageView, (com.tencent.mm.ao.a.a.c)localObject2);
      }
    }
    GMTrace.o(12669482434560L, 94395);
  }
  
  private void b(ac paramac)
  {
    GMTrace.i(12669616652288L, 94396);
    if ((paramac.aFF() != null) && (!paramac.aFF().isEmpty()))
    {
      this.lXa.setVisibility(0);
      int i;
      if (!bg.nm(paramac.aFE()))
      {
        this.lXb.setVisibility(0);
        this.lXb.setText(paramac.aFE());
        this.lXc.removeAllViews();
        if (paramac.aFG() != 1) {
          break label277;
        }
        this.lXc.setOrientation(1);
        i = R.i.cyw;
        this.lXd.setVisibility(8);
      }
      Object localObject;
      for (;;)
      {
        localObject = paramac.aFF();
        if (localObject == null) {
          break label300;
        }
        localObject = ((LinkedList)localObject).iterator();
        while (((Iterator)localObject).hasNext())
        {
          ac.b localb = (ac.b)((Iterator)localObject).next();
          View localView = LayoutInflater.from(this.vKB.vKW).inflate(i, this.lXc, false);
          ImageView localImageView = (ImageView)localView.findViewById(R.h.bDg);
          com.tencent.mm.ao.n.Jd().a(localb.eQA, localImageView);
          if (paramac.aFG() == 1) {
            ((TextView)localView.findViewById(R.h.bDh)).setText(localb.title);
          }
          ((TextView)localView.findViewById(R.h.bDf)).setText(localb.desc);
          if (paramac.aFG() == 1)
          {
            localView.setTag(localb.url);
            localView.setOnClickListener(this.lXA);
          }
          this.lXc.addView(localView);
        }
        this.lXb.setVisibility(8);
        break;
        label277:
        this.lXc.setOrientation(0);
        i = R.i.cyv;
        this.lXd.setVisibility(0);
      }
      label300:
      if (paramac.lNW.lRe != null)
      {
        localObject = new ac.a();
        ((ac.a)localObject).title = paramac.lNW.lRe.lRJ;
        ((ac.a)localObject).desc = paramac.lNW.lRe.desc;
        ((ac.a)localObject).url = paramac.lNW.lRe.url;
        paramac = (ac)localObject;
        if (paramac == null) {
          break label546;
        }
        this.lXe.setVisibility(0);
        this.lXf.setText(paramac.title);
        if (bg.nm(paramac.desc)) {
          break label534;
        }
        this.lXg.setVisibility(0);
        this.lXg.setText(paramac.desc);
      }
      for (;;)
      {
        this.lXe.setTag(paramac.url);
        this.lXe.setOnClickListener(this.lXA);
        GMTrace.o(12669616652288L, 94396);
        return;
        if ((paramac.lNW.lQZ != null) && (!bg.nm(paramac.lNW.lQZ.lRL)) && (!bg.nm(paramac.lNW.lQZ.lRM)))
        {
          localObject = new ac.a();
          ((ac.a)localObject).title = paramac.lNW.lQZ.lRL;
          ((ac.a)localObject).url = paramac.lNW.lQZ.lRM;
          paramac = (ac)localObject;
          break;
        }
        paramac = null;
        break;
        label534:
        this.lXg.setVisibility(8);
      }
      label546:
      this.lXe.setVisibility(8);
      GMTrace.o(12669616652288L, 94396);
      return;
    }
    this.lXa.setVisibility(8);
    GMTrace.o(12669616652288L, 94396);
  }
  
  private void b(ad paramad)
  {
    int i = 0;
    GMTrace.i(12669348216832L, 94394);
    List localList = paramad.lOa;
    if ((localList == null) || (localList.size() == 0))
    {
      this.lWY.setVisibility(8);
      this.lWZ.setVisibility(8);
      GMTrace.o(12669348216832L, 94394);
      return;
    }
    this.lWY.setVisibility(0);
    if (localList.size() > 3) {
      this.lWZ.setVisibility(0);
    }
    for (;;)
    {
      this.lWY.removeAllViews();
      h localh = new h(this.vKB.vKW);
      localh.CH = R.i.cyB;
      localh.a(paramad);
      localh.lNQ = this.lNQ;
      while ((i < localList.size()) && (i < 3))
      {
        paramad = localh.getView(i, null, this.lWW);
        this.lWY.addView(paramad);
        i += 1;
      }
      this.lWZ.setVisibility(8);
    }
    GMTrace.o(12669348216832L, 94394);
  }
  
  private void c(ac paramac)
  {
    GMTrace.i(12669750870016L, 94397);
    if ((paramac.aFL() != null) && (!paramac.aFL().isEmpty()))
    {
      this.lXs.setVisibility(0);
      if (!bg.nm(paramac.aFK()))
      {
        this.lXt.setVisibility(0);
        this.lXt.setText(paramac.aFK());
      }
      for (;;)
      {
        this.lXu.removeAllViews();
        this.lXu.setOnClickListener(null);
        Iterator localIterator = paramac.aFL().iterator();
        while (localIterator.hasNext())
        {
          ba localba = (ba)localIterator.next();
          View localView = LayoutInflater.from(this.vKB.vKW).inflate(R.i.cyx, this.lXu, false);
          TextView localTextView1 = (TextView)localView.findViewById(R.h.bDt);
          TextView localTextView2 = (TextView)localView.findViewById(R.h.bDu);
          TextView localTextView3 = (TextView)localView.findViewById(R.h.bDr);
          ImageView localImageView = (ImageView)localView.findViewById(R.h.bDs);
          localTextView1.setText(localba.lRR);
          localTextView2.setText(localba.eBt);
          localTextView3.setText(localba.lQf);
          com.tencent.mm.ao.n.Jd().a(localba.lRN, localImageView);
          localView.setTag(localba.lPd);
          localView.setOnClickListener(this.lXB);
          this.lXu.addView(localView);
        }
        this.lXt.setVisibility(8);
      }
      if (paramac.lNW.lQZ == null) {
        paramac = null;
      }
      while (paramac != null)
      {
        this.lXv.setVisibility(0);
        this.lXv.setText((CharSequence)paramac.first);
        this.lXv.setTag(paramac.second);
        this.lXv.setOnClickListener(this.lXC);
        GMTrace.o(12669750870016L, 94397);
        return;
        if ((bg.nm(paramac.lNW.lQY.eBt)) || (bg.nm(paramac.lNW.lQY.lRM))) {
          paramac = null;
        } else {
          paramac = new Pair(paramac.lNW.lQY.lRL, paramac.lNW.lQY.lRM);
        }
      }
      this.lXv.setVisibility(8);
      GMTrace.o(12669750870016L, 94397);
      return;
    }
    this.lXs.setVisibility(8);
    GMTrace.o(12669750870016L, 94397);
  }
  
  private void goBack()
  {
    GMTrace.i(12669079781376L, 94392);
    Object localObject = getIntent().getStringExtra("jump_game_center");
    if ((!bg.nm((String)localObject)) && (((String)localObject).equals("jump_game_center")))
    {
      localObject = new Intent(this, GameCenterUI.class);
      ((Intent)localObject).putExtra("jump_find_more_friends", "jump_find_more_friends");
      startActivity((Intent)localObject);
    }
    finish();
    GMTrace.o(12669079781376L, 94392);
  }
  
  protected final void MP()
  {
    GMTrace.i(12669213999104L, 94393);
    oM(R.l.dzN);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(12660758282240L, 94330);
        GameDetailUI2.a(GameDetailUI2.this);
        GMTrace.o(12660758282240L, 94330);
        return true;
      }
    });
    this.lWP = ((ViewGroup)findViewById(R.h.bCR));
    this.lWQ = ((ImageView)findViewById(R.h.bCS));
    this.lWR = ((ImageView)findViewById(R.h.bEd));
    this.lWS = ((TextView)findViewById(R.h.bEK));
    this.lWV = ((TextView)findViewById(R.h.bEf));
    this.lWT = ((Button)findViewById(R.h.bCz));
    this.lWU = ((TextProgressBar)findViewById(R.h.bEN));
    this.lWU.oX(this.lWI);
    this.lWW = ((LinearLayout)findViewById(R.h.bDO));
    this.lWX = ((GameDetailAutoScrollView)findViewById(R.h.bDN));
    this.lWY = ((LinearLayout)findViewById(R.h.bDx));
    this.lWZ = ((TextView)findViewById(R.h.bDz));
    this.lXa = ((LinearLayout)findViewById(R.h.bCZ));
    this.lXb = ((TextView)findViewById(R.h.bDi));
    this.lXc = ((LinearLayout)findViewById(R.h.bDa));
    this.lXd = ((ImageView)findViewById(R.h.bDb));
    this.lXe = findViewById(R.h.bDc);
    this.lXf = ((TextView)findViewById(R.h.bDe));
    this.lXg = ((TextView)findViewById(R.h.bDd));
    this.lXh = findViewById(R.h.bDj);
    this.lXi = ((TextView)findViewById(R.h.bDn));
    this.lXj = ((ImageView)findViewById(R.h.bDm));
    this.lXk = ((TextView)findViewById(R.h.bDk));
    this.lXl = ((TextView)findViewById(R.h.bDl));
    this.lXm = ((LinearLayout)findViewById(R.h.bCV));
    this.lXn = ((GameMediaList)findViewById(R.h.bDw));
    GameMediaList localGameMediaList = this.lXn;
    String str = this.appId;
    int i = this.lNQ;
    localGameMediaList.appId = str;
    localGameMediaList.kSi = 12;
    localGameMediaList.lXV = i;
    localGameMediaList.mContext = this;
    this.lXn.lZU = R.i.cyW;
    this.lXo = ((TextView)findViewById(R.h.bCX));
    this.lXp = ((TextView)findViewById(R.h.bCW));
    this.lXp.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener()
    {
      public final void onGlobalLayout()
      {
        GMTrace.i(12717263945728L, 94751);
        if (GameDetailUI2.b(GameDetailUI2.this).getLineCount() > 3)
        {
          GameDetailUI2.c(GameDetailUI2.this).setVisibility(0);
          GMTrace.o(12717263945728L, 94751);
          return;
        }
        GameDetailUI2.c(GameDetailUI2.this).setVisibility(8);
        GMTrace.o(12717263945728L, 94751);
      }
    });
    this.lXq = ((TextView)findViewById(R.h.bCY));
    this.lXq.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(12688272916480L, 94535);
        if (!GameDetailUI2.d(GameDetailUI2.this))
        {
          GameDetailUI2.b(GameDetailUI2.this).setMaxLines(100);
          GameDetailUI2.c(GameDetailUI2.this).setText(GameDetailUI2.this.getResources().getText(R.l.dzF));
          GameDetailUI2.a(GameDetailUI2.this, true);
          GMTrace.o(12688272916480L, 94535);
          return;
        }
        GameDetailUI2.b(GameDetailUI2.this).setMaxLines(3);
        GameDetailUI2.c(GameDetailUI2.this).setText(GameDetailUI2.this.getResources().getText(R.l.dzE));
        GameDetailUI2.a(GameDetailUI2.this, false);
        GMTrace.o(12688272916480L, 94535);
      }
    });
    this.lXs = ((LinearLayout)findViewById(R.h.bDo));
    this.lXt = ((TextView)findViewById(R.h.bDv));
    this.lXu = ((LinearLayout)findViewById(R.h.bDp));
    this.lXv = ((TextView)findViewById(R.h.bDq));
    GMTrace.o(12669213999104L, 94393);
  }
  
  protected final int Qf()
  {
    GMTrace.i(12668542910464L, 94388);
    GMTrace.o(12668542910464L, 94388);
    return 1;
  }
  
  public final void a(int paramInt1, int paramInt2, final String paramString, k paramk)
  {
    GMTrace.i(12669885087744L, 94398);
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      if (!com.tencent.mm.plugin.game.a.a.hnI.a(this, paramInt1, paramInt2, paramString)) {
        Toast.makeText(this, getString(R.l.dAi, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), 0).show();
      }
      if (this.kAu != null) {
        this.kAu.cancel();
      }
      GMTrace.o(12669885087744L, 94398);
      return;
    }
    switch (paramk.getType())
    {
    }
    for (;;)
    {
      GMTrace.o(12669885087744L, 94398);
      return;
      paramString = ((ap)paramk).kzP.gtD.gtK;
      at.xB().A(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(12714713808896L, 94732);
          af.t(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(12746657628160L, 94970);
              GameDetailUI2.a(GameDetailUI2.this, this.lXH);
              if (GameDetailUI2.h(GameDetailUI2.this) != null) {
                GameDetailUI2.h(GameDetailUI2.this).dismiss();
              }
              GMTrace.o(12746657628160L, 94970);
            }
          });
          GMTrace.o(12714713808896L, 94732);
        }
      });
    }
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(12668408692736L, 94387);
    int i = R.i.cyt;
    GMTrace.o(12668408692736L, 94387);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(12670019305472L, 94399);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    w.i("MicroMsg.GameDetailUI2", "requestCode = %d, resultCode = %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    switch (paramInt1)
    {
    default: 
      w.e("MicroMsg.GameDetailUI2", "error request code");
      GMTrace.o(12670019305472L, 94399);
      return;
    case 1: 
      switch (paramInt2)
      {
      case 1: 
      default: 
        GMTrace.o(12670019305472L, 94399);
        return;
      case 3: 
        if (this.lWO != null)
        {
          this.lWO.aFo();
          GMTrace.o(12670019305472L, 94399);
          return;
        }
        break;
      case 2: 
        if ((this.lMw != null) && (this.lWO != null))
        {
          this.lWO.aFp();
          this.lWN.a(this.lMw, this.lWO);
          GMTrace.o(12670019305472L, 94399);
          return;
        }
        break;
      case 0: 
        GMTrace.o(12670019305472L, 94399);
        return;
      }
      break;
    case 2: 
      if (paramInt2 == -1)
      {
        final String str2 = paramIntent.getStringExtra("Select_Conv_User");
        if (!bg.nm(str2))
        {
          String str1 = this.lXw.lPh;
          paramIntent = str1;
          if (bg.nm(str1)) {
            paramIntent = this.lMw.field_appIconUrl;
          }
          com.tencent.mm.pluginsdk.ui.applet.e.b(this.vKB, this.lXw.lSP, paramIntent, this.lXw.lSQ, null, getResources().getString(R.l.cUs), new o.a()
          {
            public final void a(boolean paramAnonymousBoolean, String paramAnonymousString, int paramAnonymousInt)
            {
              GMTrace.i(12764105932800L, 95100);
              if (paramAnonymousBoolean)
              {
                GameDetailUI2.a(GameDetailUI2.this, str2, paramAnonymousString);
                com.tencent.mm.ui.base.h.bm(GameDetailUI2.this, GameDetailUI2.this.getResources().getString(R.l.div));
                ai.a(GameDetailUI2.this.vKB.vKW, 12, 1207, 2, 14, GameDetailUI2.f(GameDetailUI2.this), GameDetailUI2.g(GameDetailUI2.this), null);
                GMTrace.o(12764105932800L, 95100);
                return;
              }
              GMTrace.o(12764105932800L, 95100);
            }
          });
        }
        GMTrace.o(12670019305472L, 94399);
        return;
      }
      break;
    case 3: 
      if (paramInt2 == -1)
      {
        ai.a(this.vKB.vKW, 12, 1207, 2, 15, this.appId, this.lNQ, null);
        GMTrace.o(12670019305472L, 94399);
        return;
      }
      break;
    }
    GMTrace.o(12670019305472L, 94399);
  }
  
  public void onCreate(final Bundle paramBundle)
  {
    int i = 1;
    GMTrace.i(12668274475008L, 94386);
    super.onCreate(paramBundle);
    if (!at.AU())
    {
      w.e("MicroMsg.GameDetailUI2", "account not ready");
      finish();
      GMTrace.o(12668274475008L, 94386);
      return;
    }
    this.lWJ = true;
    this.lWK = false;
    this.appId = getIntent().getStringExtra("game_app_id");
    if (bg.nm(this.appId))
    {
      w.e("MicroMsg.GameDetailUI2", "appid is null or nill");
      finish();
      MP();
      at.wS().a(1217, this);
      paramBundle = SubCoreGameCenter.aGj().zI(this.appId);
      if ((paramBundle != null) && (paramBundle.length != 0)) {
        break label220;
      }
      w.i("MicroMsg.GameDetailUI2", "No cache found");
      i = 0;
    }
    for (;;)
    {
      if (i == 0)
      {
        this.kAu = com.tencent.mm.plugin.game.d.c.cD(this);
        this.kAu.show();
      }
      paramBundle = v.bPK();
      boolean bool = g.n(this, this.appId);
      paramBundle = new ap(paramBundle, this.appId, bool);
      at.wS().a(paramBundle, 0);
      GMTrace.o(12668274475008L, 94386);
      return;
      this.lNQ = getIntent().getIntExtra("game_report_from_scene", 0);
      break;
      label220:
      at.xB().A(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(12775380221952L, 95184);
          af.t(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(12731356807168L, 94856);
              GameDetailUI2.a(GameDetailUI2.this, this.lXH);
              GMTrace.o(12731356807168L, 94856);
            }
          });
          GMTrace.o(12775380221952L, 95184);
        }
      });
    }
  }
  
  protected void onDestroy()
  {
    GMTrace.i(12668811345920L, 94390);
    super.onDestroy();
    at.wS().b(1217, this);
    if (this.lWM != null) {
      com.tencent.mm.plugin.game.model.l.b(this.lWM);
    }
    GMTrace.o(12668811345920L, 94390);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(12668945563648L, 94391);
    if ((paramInt == 4) && (paramKeyEvent.getRepeatCount() == 0))
    {
      goBack();
      GMTrace.o(12668945563648L, 94391);
      return true;
    }
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    GMTrace.o(12668945563648L, 94391);
    return bool;
  }
  
  protected void onResume()
  {
    GMTrace.i(12668677128192L, 94389);
    super.onResume();
    if ((this.lMw != null) && (this.lWO != null))
    {
      this.lWO.aFo();
      this.lWN.a(this.lWU, this.lWT, this.lMw, this.lWO);
    }
    if (!this.lWJ)
    {
      b(new ad(this.appId));
      GMTrace.o(12668677128192L, 94389);
      return;
    }
    this.lWJ = false;
    GMTrace.o(12668677128192L, 94389);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\ui\GameDetailUI2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */