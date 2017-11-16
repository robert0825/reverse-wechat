package com.tencent.mm.plugin.card.sharecard.ui;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mars.smc.IDKey;
import com.tencent.mm.R.f;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.n;
import com.tencent.mm.plugin.card.base.CardBaseUI;
import com.tencent.mm.plugin.card.model.al;
import com.tencent.mm.plugin.card.ui.CardDetailUI;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.sdk.e.j.a;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.p;
import com.tencent.mm.y.at;
import java.util.ArrayList;

public class ShareCardListUI
  extends CardBaseUI
  implements com.tencent.mm.plugin.card.base.d, j.a
{
  private b.a jAQ;
  private f jCH;
  private e jCI;
  private i jCJ;
  private boolean jCK;
  private boolean jCL;
  private boolean jCM;
  private boolean jCN;
  private boolean jCO;
  private boolean jCP;
  private String jCQ;
  private boolean jCR;
  private boolean jCS;
  private boolean jCT;
  private int jCU;
  private boolean jCV;
  private long jCW;
  boolean jCX;
  private long jCY;
  private final long jCZ;
  private com.tencent.mm.plugin.card.sharecard.a.b jCy;
  private boolean jDa;
  private boolean jDb;
  private String jyz;
  private long mStartTime;
  
  public ShareCardListUI()
  {
    GMTrace.i(5078933045248L, 37841);
    this.jyz = null;
    this.jCK = false;
    this.jCL = true;
    this.jCM = false;
    this.jCN = true;
    this.jCO = true;
    this.jCP = false;
    this.jCQ = "";
    this.jCR = false;
    this.jCS = false;
    this.jCT = false;
    this.jCU = 0;
    this.jCV = false;
    this.jAQ = null;
    this.mStartTime = 0L;
    this.jCW = 0L;
    this.jCX = false;
    this.jCY = 0L;
    this.jCZ = 500L;
    this.jDa = false;
    this.jDb = false;
    GMTrace.o(5078933045248L, 37841);
  }
  
  private void akW()
  {
    GMTrace.i(5080006787072L, 37849);
    w.d("MicroMsg.ShareCardListUI", "initLocation");
    at.xB().A(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(5085375496192L, 37889);
        ShareCardListUI.a(ShareCardListUI.this);
        ShareCardListUI.b(ShareCardListUI.this);
        ShareCardListUI.this.jCX = true;
        w.d("MicroMsg.ShareCardListUI", "initLocation end");
        GMTrace.o(5085375496192L, 37889);
      }
    });
    GMTrace.o(5080006787072L, 37849);
  }
  
  private void akX()
  {
    GMTrace.i(5080543657984L, 37853);
    long l = System.currentTimeMillis() - this.jCY;
    if ((this.jDa) && (l < 1000L))
    {
      w.d("MicroMsg.ShareCardListUI", "DoingUpdateView return");
      GMTrace.o(5080543657984L, 37853);
      return;
    }
    w.d("MicroMsg.ShareCardListUI", "try2UpdateView isDoingUpdateView %s,interval %s", new Object[] { Boolean.valueOf(this.jDa), Long.valueOf(l) });
    this.jDa = true;
    if (l < 500L)
    {
      af.i(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(5077725085696L, 37832);
          ShareCardListUI.i(ShareCardListUI.this);
          if (!ShareCardListUI.this.isFinishing())
          {
            ShareCardListUI.j(ShareCardListUI.this);
            GMTrace.o(5077725085696L, 37832);
            return;
          }
          w.w("MicroMsg.ShareCardListUI", "Activity is finished!!!");
          GMTrace.o(5077725085696L, 37832);
        }
      }, 500L);
      GMTrace.o(5080543657984L, 37853);
      return;
    }
    if ((this.jCU == 0) || (this.jCU == 4) || ((this.jCU == 2) && ((!com.tencent.mm.plugin.card.sharecard.a.b.akJ()) || (!com.tencent.mm.plugin.card.sharecard.a.b.akI()))) || ((this.jCU == 1) && ((!com.tencent.mm.plugin.card.sharecard.a.b.akJ()) || (com.tencent.mm.plugin.card.sharecard.a.b.akI()))) || ((this.jCU == 3) && ((!com.tencent.mm.plugin.card.sharecard.a.b.akI()) || (com.tencent.mm.plugin.card.sharecard.a.b.akJ())))) {
      this.jCU = com.tencent.mm.plugin.card.sharecard.a.b.akH();
    }
    al.aks().putValue("key_share_card_show_type", Integer.valueOf(this.jCU));
    w.i("MicroMsg.ShareCardListUI", "updateView() currentType is %s, canShowLocalCity %s, canShowOtherCity %s", new Object[] { Integer.valueOf(this.jCU), Boolean.valueOf(com.tencent.mm.plugin.card.sharecard.a.b.akJ()), Boolean.valueOf(com.tencent.mm.plugin.card.sharecard.a.b.akI()) });
    f localf = this.jCH;
    localf.jCD.setVisibility(0);
    localf.jCC.setImageDrawable(localf.iPC.getResources().getDrawable(R.g.aUT));
    localf.jCD.setText(R.l.ddx);
    localf.jCE.setText(R.l.ddw);
    LinearLayout.LayoutParams localLayoutParams = (LinearLayout.LayoutParams)localf.jCC.getLayoutParams();
    localLayoutParams.topMargin = localf.iPC.getResources().getDimensionPixelOffset(R.f.aRv);
    localf.jCC.setLayoutParams(localLayoutParams);
    localf.jCC.invalidate();
    if ((!com.tencent.mm.plugin.card.sharecard.a.b.akJ()) && (!com.tencent.mm.plugin.card.sharecard.a.b.akI()))
    {
      this.jCI.akV();
      this.jCJ.jDd.setVisibility(8);
      if (this.jwt.getEmptyView() != this.jwv)
      {
        this.jwt.setEmptyView(this.jwv);
        this.jwt.invalidate();
      }
    }
    for (;;)
    {
      akY();
      this.jCY = System.currentTimeMillis();
      this.jDa = false;
      GMTrace.o(5080543657984L, 37853);
      return;
      this.jCI.ar();
      this.jCJ.ar();
      if ((this.jCU == 4) && (this.jwt.getEmptyView() != null))
      {
        this.jwt.setEmptyView(null);
        this.jwt.invalidate();
      }
    }
  }
  
  private void akY()
  {
    GMTrace.i(5080677875712L, 37854);
    if ((this.jwu instanceof c))
    {
      c localc = (c)this.jwu;
      localc.jCv = this.jCU;
      localc.a(null, null);
    }
    GMTrace.o(5080677875712L, 37854);
  }
  
  private void akZ()
  {
    GMTrace.i(5081080528896L, 37857);
    if ((com.tencent.mm.plugin.card.sharecard.a.b.akL()) && (com.tencent.mm.plugin.card.sharecard.a.b.akM()))
    {
      w.i("MicroMsg.ShareCardListUI", "doGetLayout() no data to load");
      this.jCO = true;
      GMTrace.o(5081080528896L, 37857);
      return;
    }
    if ((!com.tencent.mm.plugin.card.sharecard.a.b.akL()) || (!com.tencent.mm.plugin.card.sharecard.a.b.akM())) {
      this.jCN = false;
    }
    w.i("MicroMsg.ShareCardListUI", "doGetLayout() >> doNetSceneGetCardsHomePageLayout()");
    ala();
    al.akt().m("", "", 4);
    GMTrace.o(5081080528896L, 37857);
  }
  
  private void ala()
  {
    GMTrace.i(5081214746624L, 37858);
    if (this.jCP)
    {
      w.e("MicroMsg.ShareCardListUI", "doNetSceneGetCardsHomePageLayout, isDoingGetData is true");
      GMTrace.o(5081214746624L, 37858);
      return;
    }
    if ((bg.nm(this.jCQ)) && (!com.tencent.mm.plugin.card.sharecard.a.b.akJ()) && (!com.tencent.mm.plugin.card.sharecard.a.b.akI()) && (!com.tencent.mm.plugin.card.sharecard.a.b.akJ()) && (!com.tencent.mm.plugin.card.sharecard.a.b.akI()))
    {
      this.jCI.akS();
      this.jwt.setEmptyView(null);
      this.jwt.invalidate();
      this.jDb = true;
    }
    if ((this.jCN) && (!bg.nm(this.jCQ))) {
      this.jCQ = "";
    }
    this.jCP = true;
    com.tencent.mm.plugin.card.sharecard.model.b localb = new com.tencent.mm.plugin.card.sharecard.model.b(al.akt().fJn, al.akt().fJo, this.jCQ);
    at.wS().a(localb, 0);
    GMTrace.o(5081214746624L, 37858);
  }
  
  private void alb()
  {
    GMTrace.i(5082422706176L, 37867);
    int i = getIntent().getIntExtra("key_from_scene", 22);
    boolean bool1 = com.tencent.mm.s.c.vK().aD(262152, 266256);
    boolean bool2 = com.tencent.mm.s.c.vK().aE(262152, 266256);
    boolean bool3 = com.tencent.mm.s.c.vK().a(w.a.vqU, w.a.vqW);
    boolean bool4 = com.tencent.mm.s.c.vK().a(w.a.vqV, w.a.vqX);
    at.AR();
    String str = bg.nl((String)com.tencent.mm.y.c.xh().get(w.a.vra, null));
    if (bool1)
    {
      g.ork.i(11324, new Object[] { "ShareCardListUI", Integer.valueOf(0), "", "", Integer.valueOf(2), Integer.valueOf(i), "", Integer.valueOf(0), str });
      GMTrace.o(5082422706176L, 37867);
      return;
    }
    if (bool2)
    {
      g.ork.i(11324, new Object[] { "ShareCardListUI", Integer.valueOf(0), "", "", Integer.valueOf(1), Integer.valueOf(i), "", Integer.valueOf(0), str });
      GMTrace.o(5082422706176L, 37867);
      return;
    }
    if ((bool3) && (!bool4))
    {
      g.ork.i(11324, new Object[] { "ShareCardListUI", Integer.valueOf(0), "", "", Integer.valueOf(3), Integer.valueOf(i), "", Integer.valueOf(0), str });
      GMTrace.o(5082422706176L, 37867);
      return;
    }
    if ((bool3) && (bool4))
    {
      g.ork.i(11324, new Object[] { "ShareCardListUI", Integer.valueOf(0), "", "", Integer.valueOf(4), Integer.valueOf(i), "", Integer.valueOf(0), str });
      GMTrace.o(5082422706176L, 37867);
      return;
    }
    if (bool4)
    {
      g.ork.i(11324, new Object[] { "ShareCardListUI", Integer.valueOf(0), "", "", Integer.valueOf(5), Integer.valueOf(i), "", Integer.valueOf(0), str });
      GMTrace.o(5082422706176L, 37867);
      return;
    }
    g.ork.i(11324, new Object[] { "ShareCardListUI", Integer.valueOf(0), "", "", Integer.valueOf(0), Integer.valueOf(i), "", Integer.valueOf(0), str });
    GMTrace.o(5082422706176L, 37867);
  }
  
  private void dv(boolean paramBoolean)
  {
    GMTrace.i(5079469916160L, 37845);
    w.i("MicroMsg.ShareCardListUI", "doRefreshData() >> updateView() shouldGetLayout %s fromOnresume %s", new Object[] { Boolean.valueOf(this.jCL), Boolean.valueOf(paramBoolean) });
    if (this.jCL)
    {
      this.jCL = false;
      this.jCR = false;
      this.jCN = true;
      this.jCQ = "";
      w.d("MicroMsg.ShareCardListUI", "doRefreshData() >> doNetSceneGetCardsHomePageLayout()");
      if (!paramBoolean) {
        break label110;
      }
      if ((this.jCV) && (this.jCX)) {
        aiT();
      }
    }
    for (;;)
    {
      akX();
      GMTrace.o(5079469916160L, 37845);
      return;
      label110:
      ala();
    }
  }
  
  protected final void MP()
  {
    GMTrace.i(5079872569344L, 37848);
    super.MP();
    boolean bool = com.tencent.mm.pluginsdk.h.a.a(this, "android.permission.ACCESS_COARSE_LOCATION", 69, null, null);
    w.i("MicroMsg.ShareCardListUI", "checkPermission checkLocation[%b]", new Object[] { Boolean.valueOf(bool) });
    this.jCV = bool;
    if (this.jCV)
    {
      akW();
      GMTrace.o(5079872569344L, 37848);
      return;
    }
    w.e("MicroMsg.ShareCardListUI", "location permission is denied, doGetLayout");
    akZ();
    GMTrace.o(5079872569344L, 37848);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ad.k paramk)
  {
    boolean bool = true;
    GMTrace.i(5082020052992L, 37864);
    super.a(paramInt1, paramInt2, paramString, paramk);
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      if ((paramk instanceof com.tencent.mm.plugin.card.sharecard.model.b))
      {
        paramString = (com.tencent.mm.plugin.card.sharecard.model.b)paramk;
        this.jCP = false;
        this.jCQ = paramString.jAY;
        this.jCy.R(paramString.jzG, this.jCN);
        if ((!com.tencent.mm.plugin.card.sharecard.a.b.akL()) || (!com.tencent.mm.plugin.card.sharecard.a.b.akM())) {
          this.jCN = false;
        }
        if ((com.tencent.mm.plugin.card.sharecard.a.b.akL()) && (com.tencent.mm.plugin.card.sharecard.a.b.akM())) {}
        for (;;)
        {
          this.jCO = bool;
          w.i("MicroMsg.ShareCardListUI", "NetSceneGetShareCardsLayout() >> updateView()");
          akX();
          GMTrace.o(5082020052992L, 37864);
          return;
          bool = false;
        }
      }
    }
    else
    {
      if ((paramk instanceof com.tencent.mm.plugin.card.sharecard.model.b))
      {
        if (this.jDb)
        {
          this.jDb = false;
          this.jCI.akT();
          this.jwt.setEmptyView(this.jwv);
          this.jwt.invalidate();
        }
        this.jCP = false;
        this.jCO = true;
      }
      w.i("MicroMsg.ShareCardListUI", "share card list ui, onSceneEnd, errType = %d, errCode = %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    }
    GMTrace.o(5082020052992L, 37864);
  }
  
  protected final void a(com.tencent.mm.plugin.card.base.b paramb)
  {
    GMTrace.i(5081885835264L, 37863);
    Intent localIntent = new Intent(this, CardDetailUI.class);
    w.i("MicroMsg.ShareCardListUI", "card tp id:" + paramb.ajA());
    w.i("MicroMsg.ShareCardListUI", "card id:" + paramb.ajz());
    localIntent.putExtra("key_card_id", al.akv().ui(paramb.ajA()));
    localIntent.putExtra("key_card_tp_id", paramb.ajA());
    localIntent.putExtra("key_is_share_card", true);
    localIntent.putExtra("key_from_scene", 3);
    startActivity(localIntent);
    com.tencent.mm.plugin.card.sharecard.a.b.uf(paramb.ajA());
    GMTrace.o(5081885835264L, 37863);
  }
  
  public final void a(String paramString, com.tencent.mm.sdk.e.l paraml)
  {
    GMTrace.i(5082288488448L, 37866);
    w.d("MicroMsg.ShareCardListUI", "onNotifyChange");
    this.jCL = true;
    GMTrace.o(5082288488448L, 37866);
  }
  
  protected final void aiM()
  {
    GMTrace.i(5080275222528L, 37851);
    oM(R.l.ddC);
    this.jCy = new com.tencent.mm.plugin.card.sharecard.a.b(this);
    this.jAQ = new b.a() {};
    this.jCy.jAQ = this.jAQ;
    this.jCy.init();
    this.jCU = com.tencent.mm.plugin.card.sharecard.a.b.akH();
    Object localObject;
    if (this.jCJ == null)
    {
      this.jCJ = new i(this, this.vKB.hqF);
      localObject = this.jCJ;
      ((i)localObject).jDd = View.inflate(((i)localObject).iPC, R.i.crx, null);
      ((i)localObject).jDe = ((TextView)((i)localObject).jDd.findViewById(R.h.bkB));
      ((i)localObject).jDf = ((TextView)((i)localObject).jDd.findViewById(R.h.bkC));
      ((i)localObject).ar();
    }
    if (this.jCH == null)
    {
      this.jCH = new f(this, this.vKB.hqF);
      localObject = this.jCH;
      ((f)localObject).jCC = ((ImageView)((f)localObject).jBw.findViewById(R.h.bQZ));
      ((f)localObject).jCE = ((TextView)((f)localObject).jBw.findViewById(R.h.bRb));
      ((f)localObject).jCD = ((TextView)((f)localObject).jBw.findViewById(R.h.bRc));
      this.jCH.jCy = this.jCy;
    }
    if (this.jCI == null)
    {
      localObject = this.vKB.hqF;
      this.jCI = new e(this);
      this.jCI.jCy = this.jCy;
      this.jCI.akR();
      localObject = this.jCI;
      View.OnClickListener local3 = new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(5089267810304L, 37918);
          ShareCardListUI.c(ShareCardListUI.this);
          if (com.tencent.mm.plugin.card.sharecard.a.b.akJ())
          {
            ShareCardListUI.c(ShareCardListUI.this);
            if (com.tencent.mm.plugin.card.sharecard.a.b.akI()) {
              ShareCardListUI.a(ShareCardListUI.this, 2);
            }
          }
          for (;;)
          {
            g.ork.i(11582, new Object[] { "OperChangeOtherCity ", Integer.valueOf(0), Integer.valueOf(0), "", "", "" });
            al.aks().putValue("key_share_card_show_type", Integer.valueOf(ShareCardListUI.d(ShareCardListUI.this)));
            ShareCardListUI.e(ShareCardListUI.this);
            ShareCardListUI.f(ShareCardListUI.this).ar();
            ShareCardListUI.c(ShareCardListUI.this);
            com.tencent.mm.plugin.card.sharecard.a.b.jAR = true;
            GMTrace.o(5089267810304L, 37918);
            return;
            ShareCardListUI.c(ShareCardListUI.this);
            if (com.tencent.mm.plugin.card.sharecard.a.b.akI()) {
              ShareCardListUI.a(ShareCardListUI.this, 3);
            }
          }
        }
      };
      if (((e)localObject).jCx != null) {
        ((e)localObject).jCx.setOnClickListener(local3);
      }
    }
    if (this.jww != null) {
      this.jww.addView(this.jCJ.jDd);
    }
    if (this.jwx != null) {
      this.jwx.addView(this.jCI.jCx);
    }
    this.jwt.setVisibility(0);
    this.jwt.setOnScrollListener(new AbsListView.OnScrollListener()
    {
      public final void onScroll(AbsListView paramAnonymousAbsListView, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        GMTrace.i(5092891688960L, 37945);
        if ((paramAnonymousAbsListView.getLastVisiblePosition() == paramAnonymousAbsListView.getCount() - 1) && (!ShareCardListUI.g(ShareCardListUI.this)) && (ShareCardListUI.d(ShareCardListUI.this) != 4))
        {
          w.d("MicroMsg.ShareCardListUI", "onScroll() >> doNetSceneGetCardsHomePageLayout()");
          ShareCardListUI.h(ShareCardListUI.this);
        }
        GMTrace.o(5092891688960L, 37945);
      }
      
      public final void onScrollStateChanged(AbsListView paramAnonymousAbsListView, int paramAnonymousInt)
      {
        GMTrace.i(5092757471232L, 37944);
        GMTrace.o(5092757471232L, 37944);
      }
    });
    if ((getIntent() != null) && (getIntent().getBooleanExtra("KEY_IS_SHOW_SHARE_CARD_ENTRANCE_TIPS", true)))
    {
      at.AR();
      localObject = (Integer)com.tencent.mm.y.c.xh().get(w.a.vrm, Integer.valueOf(0));
      if ((localObject == null) || (((Integer)localObject).intValue() != 1))
      {
        at.AR();
        com.tencent.mm.y.c.xh().a(w.a.vrm, Integer.valueOf(1));
        com.tencent.mm.plugin.card.b.d.c(this, R.i.crC, R.l.ddJ, "");
      }
    }
    for (;;)
    {
      this.jyz = getIntent().getStringExtra("KEY_CARD_TP_ID");
      this.jCQ = getIntent().getStringExtra("key_layout_buff");
      if (!bg.nm(this.jCQ)) {
        this.jCL = false;
      }
      if (!bg.nm(this.jyz))
      {
        this.jCK = true;
        this.jCM = true;
      }
      GMTrace.o(5080275222528L, 37851);
      return;
      at.AR();
      localObject = (Integer)com.tencent.mm.y.c.xh().get(w.a.vrm, Integer.valueOf(0));
      if ((localObject != null) && (((Integer)localObject).intValue() != 1))
      {
        at.AR();
        com.tencent.mm.y.c.xh().a(w.a.vrm, Integer.valueOf(1));
      }
    }
  }
  
  protected final BaseAdapter aiO()
  {
    GMTrace.i(5079738351616L, 37847);
    c localc = new c(this.vKB.vKW);
    GMTrace.o(5079738351616L, 37847);
    return localc;
  }
  
  protected final boolean aiP()
  {
    GMTrace.i(5081348964352L, 37859);
    boolean bool = super.aiP();
    GMTrace.o(5081348964352L, 37859);
    return bool;
  }
  
  protected final boolean aiQ()
  {
    GMTrace.i(5081483182080L, 37860);
    GMTrace.o(5081483182080L, 37860);
    return false;
  }
  
  protected final void aiV()
  {
    GMTrace.i(5080812093440L, 37855);
    this.jCT = true;
    if (this.jCR)
    {
      w.e("MicroMsg.ShareCardListUI", "onLocationFinish, has do GetShareCardLayout,don't get again");
      if (this.jCV) {
        aiU();
      }
      GMTrace.o(5080812093440L, 37855);
      return;
    }
    w.d("MicroMsg.ShareCardListUI", "onLocationFinish()");
    this.jCR = true;
    akZ();
    aiU();
    GMTrace.o(5080812093440L, 37855);
  }
  
  protected final void aiW()
  {
    GMTrace.i(5080946311168L, 37856);
    if ((this.jCS) || (this.jCR))
    {
      aiU();
      GMTrace.o(5080946311168L, 37856);
      return;
    }
    this.jCS = true;
    w.i("MicroMsg.ShareCardListUI", "onLocationFail()");
    akZ();
    GMTrace.o(5080946311168L, 37856);
  }
  
  protected final void aiX()
  {
    GMTrace.i(5080141004800L, 37850);
    w.i("MicroMsg.ShareCardListUI", "onMPermissionGranted LocationPermissionGranted " + this.jCV);
    if (!this.jCV)
    {
      this.jCV = true;
      akW();
    }
    GMTrace.o(5080141004800L, 37850);
  }
  
  public final void ajG()
  {
    GMTrace.i(5082154270720L, 37865);
    com.tencent.mm.plugin.card.sharecard.a.b.akG();
    this.jCL = true;
    w.i("MicroMsg.ShareCardListUI", "onDBchange() shouldRefreshDataOnDbChange %s  mIsActive %s hasLocationInfo %s", new Object[] { Boolean.valueOf(this.jCM), Boolean.valueOf(this.jwz), Boolean.valueOf(this.jCT) });
    if ((this.jCM) && (this.jwz) && (this.jCT)) {
      dv(false);
    }
    for (;;)
    {
      this.jCM = false;
      GMTrace.o(5082154270720L, 37865);
      return;
      akX();
    }
  }
  
  protected final void b(com.tencent.mm.plugin.card.base.b paramb)
  {
    GMTrace.i(5081617399808L, 37861);
    if (paramb != null) {
      com.tencent.mm.plugin.card.sharecard.a.b.ua(paramb.ajA());
    }
    super.b(paramb);
    GMTrace.o(5081617399808L, 37861);
  }
  
  protected final void c(com.tencent.mm.plugin.card.base.b paramb)
  {
    GMTrace.i(5081751617536L, 37862);
    super.c(paramb);
    GMTrace.o(5081751617536L, 37862);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(5079067262976L, 37842);
    super.onCreate(paramBundle);
    long l = System.currentTimeMillis();
    this.mStartTime = l;
    this.jCW = l;
    MP();
    at.wS().a(1164, this);
    al.aku().a(this);
    alb();
    al.akv().c(this);
    GMTrace.o(5079067262976L, 37842);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(5079201480704L, 37843);
    if (this.jCV) {
      aiU();
    }
    this.jCH.jCy = null;
    this.jCI.jCy = null;
    this.jCy.jAQ = null;
    at.wS().b(1164, this);
    al.aku().b(this);
    com.tencent.mm.plugin.card.sharecard.a.b.akK();
    al.akv().j(this);
    long l = System.currentTimeMillis() - this.jCW;
    if (!TextUtils.isEmpty(this.jyz)) {
      g.ork.i(13219, new Object[] { "ShareCardListUI", Integer.valueOf(0), "", "", Long.valueOf(l) });
    }
    for (;;)
    {
      super.onDestroy();
      GMTrace.o(5079201480704L, 37843);
      return;
      g.ork.i(13219, new Object[] { "ShareCardListUI", Integer.valueOf(1), "", "", Long.valueOf(l) });
    }
  }
  
  protected void onNewIntent(Intent paramIntent)
  {
    GMTrace.i(5080409440256L, 37852);
    super.onNewIntent(paramIntent);
    setIntent(paramIntent);
    alb();
    if (paramIntent != null)
    {
      this.jyz = paramIntent.getStringExtra("KEY_CARD_TP_ID");
      if (!bg.nm(this.jyz))
      {
        this.jCK = true;
        this.jCM = true;
      }
    }
    GMTrace.o(5080409440256L, 37852);
  }
  
  protected void onPause()
  {
    GMTrace.i(5079604133888L, 37846);
    super.onPause();
    this.jCL = false;
    this.jCM = true;
    GMTrace.o(5079604133888L, 37846);
  }
  
  protected void onResume()
  {
    GMTrace.i(5079335698432L, 37844);
    dv(true);
    long l = System.currentTimeMillis();
    if (this.mStartTime != 0L)
    {
      int i = (int)(l - this.mStartTime);
      ArrayList localArrayList = new ArrayList();
      IDKey localIDKey1 = new IDKey();
      localIDKey1.SetID(281);
      localIDKey1.SetKey(56);
      localIDKey1.SetValue(1L);
      IDKey localIDKey2 = new IDKey();
      localIDKey2.SetID(281);
      localIDKey2.SetKey(57);
      localIDKey2.SetValue(i);
      localArrayList.add(localIDKey1);
      localArrayList.add(localIDKey2);
      g.ork.b(localArrayList, true);
      this.mStartTime = 0L;
    }
    super.onResume();
    GMTrace.o(5079335698432L, 37844);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\card\sharecard\ui\ShareCardListUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */