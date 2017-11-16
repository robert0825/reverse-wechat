package com.tencent.mm.plugin.card.ui;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.os.Looper;
import android.os.MessageQueue;
import android.os.MessageQueue.IdleHandler;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mars.smc.IDKey;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.n;
import com.tencent.mm.plugin.card.a.e;
import com.tencent.mm.plugin.card.b.q;
import com.tencent.mm.plugin.card.base.CardBaseUI;
import com.tencent.mm.plugin.card.model.CardInfo;
import com.tencent.mm.plugin.card.model.ad;
import com.tencent.mm.plugin.card.model.al;
import com.tencent.mm.plugin.card.model.n.a;
import com.tencent.mm.plugin.card.sharecard.ui.ShareCardListUI;
import com.tencent.mm.protocal.c.ju;
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

public class CardHomePageUI
  extends CardBaseUI
  implements com.tencent.mm.plugin.card.base.d, j.a
{
  private int fromScene;
  private boolean jCL;
  private boolean jCN;
  private boolean jCP;
  private String jCQ;
  private boolean jCR;
  private boolean jCS;
  private long jCW;
  boolean jCX;
  private com.tencent.mm.plugin.card.sharecard.a.b jCy;
  private i jHh;
  private f jHi;
  private f jHj;
  private f jHk;
  private boolean jHl;
  private boolean jHm;
  private TextView jHn;
  private long mStartTime;
  
  public CardHomePageUI()
  {
    GMTrace.i(5031956840448L, 37491);
    this.jCN = true;
    this.jCP = false;
    this.jCQ = "";
    this.jHl = true;
    this.jCL = false;
    this.jCR = false;
    this.jCS = false;
    this.jHm = false;
    this.mStartTime = 0L;
    this.jCW = 0L;
    this.fromScene = 0;
    this.jCX = false;
    GMTrace.o(5031956840448L, 37491);
  }
  
  private void akW()
  {
    GMTrace.i(5033164800000L, 37500);
    w.d("MicroMsg.CardHomePageUI", "initLocation");
    at.xB().A(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(18882018410496L, 140682);
        CardHomePageUI.c(CardHomePageUI.this);
        CardHomePageUI.d(CardHomePageUI.this);
        CardHomePageUI.this.jCX = true;
        w.d("MicroMsg.CardHomePageUI", "initLocation end");
        GMTrace.o(18882018410496L, 140682);
      }
    });
    GMTrace.o(5033164800000L, 37500);
  }
  
  private void akZ()
  {
    GMTrace.i(5034238541824L, 37508);
    w.d("MicroMsg.CardHomePageUI", "doGetLayout() >> doNetSceneGetCardsHomePageLayout()");
    Object localObject;
    if (!this.jHl)
    {
      w.i("MicroMsg.CardHomePageUI", "doNetSceneGetCardsHomePageLayout, shouldGetHomePage is false");
      if (!com.tencent.mm.plugin.card.b.l.amV()) {
        break label220;
      }
      at.AR();
      int i = ((Integer)com.tencent.mm.y.c.xh().get(w.a.vrg, Integer.valueOf(1))).intValue();
      w.i("MicroMsg.BatchGetCardMgr", "need do getCardsLayoutScene scene is " + i);
      localObject = new ad(al.akt().fJn, al.akt().fJo, i);
      at.wS().a((com.tencent.mm.ad.k)localObject, 0);
    }
    for (;;)
    {
      al.akt().m("", "", 4);
      GMTrace.o(5034238541824L, 37508);
      return;
      if (this.jCP)
      {
        w.e("MicroMsg.CardHomePageUI", "doNetSceneGetCardsHomePageLayout, isDoingGetData is true");
        break;
      }
      if ((this.jCN) && (!bg.nm(this.jCQ))) {
        this.jCQ = "";
      }
      this.jCP = true;
      this.jHl = false;
      localObject = new com.tencent.mm.plugin.card.sharecard.model.b(al.akt().fJn, al.akt().fJo, this.jCQ);
      at.wS().a((com.tencent.mm.ad.k)localObject, 0);
      break;
      label220:
      w.i("MicroMsg.CardHomePageUI", "the card entrance is not open, don't do doNetSceneGetCardsLayout!");
    }
  }
  
  private void alO()
  {
    GMTrace.i(5033701670912L, 37504);
    w.i("MicroMsg.CardHomePageUI", "updateMemberCardItem()");
    Object localObject = (c)this.jwu;
    if (this.jHn == null)
    {
      this.jHn = ((TextView)findViewById(R.h.bMK));
      this.jHn.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(4936393818112L, 36779);
          paramAnonymousView = new Intent(CardHomePageUI.this, CardIndexUI.class);
          paramAnonymousView.putExtra("key_card_type", 1);
          CardHomePageUI.this.startActivity(paramAnonymousView);
          com.tencent.mm.plugin.report.service.g.ork.i(11324, new Object[] { "GotoMemberCardUI", Integer.valueOf(0), "", "", Integer.valueOf(0), Integer.valueOf(0), "", Integer.valueOf(0), Integer.valueOf(0) });
          GMTrace.o(4936393818112L, 36779);
        }
      });
    }
    if (((c)localObject).getCount() > 0)
    {
      this.jHn.setVisibility(0);
      this.jHn.setText(getString(R.l.ddR, new Object[] { Integer.valueOf(com.tencent.mm.plugin.card.sharecard.a.b.akF()) }));
    }
    for (;;)
    {
      this.jHi.jBw.setVisibility(8);
      GMTrace.o(5033701670912L, 37504);
      return;
      this.jHn.setVisibility(0);
      this.jHn.setText(getString(R.l.ddR, new Object[] { Integer.valueOf(0) }));
      localObject = (LinearLayout)findViewById(R.h.bkn);
      if (localObject != null)
      {
        LinearLayout.LayoutParams localLayoutParams = (LinearLayout.LayoutParams)((LinearLayout)localObject).getLayoutParams();
        localLayoutParams.topMargin = com.tencent.mm.br.a.fromDPToPix(this, 29);
        localLayoutParams.bottomMargin = com.tencent.mm.br.a.fromDPToPix(this, 29);
        ((LinearLayout)localObject).setLayoutParams(localLayoutParams);
      }
    }
  }
  
  private void alP()
  {
    GMTrace.i(5035580719104L, 37518);
    Intent localIntent = new Intent();
    localIntent.addFlags(67108864);
    localIntent.putExtra("preferred_tab", 3);
    com.tencent.mm.bj.d.a(this, "com.tencent.mm.ui.LauncherUI", localIntent);
    finish();
    GMTrace.o(5035580719104L, 37518);
  }
  
  private void alb()
  {
    GMTrace.i(5035043848192L, 37514);
    int i = getIntent().getIntExtra("key_from_scene", 22);
    boolean bool1 = com.tencent.mm.s.c.vK().aD(262152, 266256);
    boolean bool2 = com.tencent.mm.s.c.vK().aE(262152, 266256);
    boolean bool3 = com.tencent.mm.s.c.vK().a(w.a.vqU, w.a.vqW);
    boolean bool4 = com.tencent.mm.s.c.vK().a(w.a.vqV, w.a.vqX);
    at.AR();
    String str = bg.nl((String)com.tencent.mm.y.c.xh().get(w.a.vra, null));
    if (bool1)
    {
      com.tencent.mm.plugin.report.service.g.ork.i(11324, new Object[] { "CardHomePageUI", Integer.valueOf(0), "", "", Integer.valueOf(2), Integer.valueOf(i), "", Integer.valueOf(0), str });
      GMTrace.o(5035043848192L, 37514);
      return;
    }
    if (bool2)
    {
      com.tencent.mm.plugin.report.service.g.ork.i(11324, new Object[] { "CardHomePageUI", Integer.valueOf(0), "", "", Integer.valueOf(1), Integer.valueOf(i), "", Integer.valueOf(0), str });
      GMTrace.o(5035043848192L, 37514);
      return;
    }
    if ((bool3) && (!bool4))
    {
      com.tencent.mm.plugin.report.service.g.ork.i(11324, new Object[] { "CardHomePageUI", Integer.valueOf(0), "", "", Integer.valueOf(3), Integer.valueOf(i), "", Integer.valueOf(0), str });
      GMTrace.o(5035043848192L, 37514);
      return;
    }
    if ((bool3) && (bool4))
    {
      com.tencent.mm.plugin.report.service.g.ork.i(11324, new Object[] { "CardHomePageUI", Integer.valueOf(0), "", "", Integer.valueOf(4), Integer.valueOf(i), "", Integer.valueOf(0), str });
      GMTrace.o(5035043848192L, 37514);
      return;
    }
    if (bool4)
    {
      com.tencent.mm.plugin.report.service.g.ork.i(11324, new Object[] { "CardHomePageUI", Integer.valueOf(0), "", "", Integer.valueOf(5), Integer.valueOf(i), "", Integer.valueOf(0), str });
      GMTrace.o(5035043848192L, 37514);
      return;
    }
    com.tencent.mm.plugin.report.service.g.ork.i(11324, new Object[] { "CardHomePageUI", Integer.valueOf(0), "", "", Integer.valueOf(0), Integer.valueOf(i), "", Integer.valueOf(0), str });
    GMTrace.o(5035043848192L, 37514);
  }
  
  private void ar()
  {
    GMTrace.i(5033567453184L, 37503);
    w.i("MicroMsg.CardHomePageUI", "updateView()");
    this.jHh.alT();
    alO();
    this.jHj.ar();
    this.jHk.ar();
    GMTrace.o(5033567453184L, 37503);
  }
  
  protected final void MP()
  {
    GMTrace.i(5032762146816L, 37497);
    boolean bool = com.tencent.mm.pluginsdk.h.a.a(this, "android.permission.ACCESS_COARSE_LOCATION", 69, null, null);
    w.i("MicroMsg.CardHomePageUI", "checkPermission checkLocation[%b]", new Object[] { Boolean.valueOf(bool) });
    this.jHm = bool;
    if (this.jHm) {
      akW();
    }
    for (;;)
    {
      super.MP();
      GMTrace.o(5032762146816L, 37497);
      return;
      w.e("MicroMsg.CardHomePageUI", "location permission is denied, doGetLayout");
      akZ();
    }
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ad.k paramk)
  {
    GMTrace.i(5034909630464L, 37513);
    super.a(paramInt1, paramInt2, paramString, paramk);
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      if ((paramk instanceof ad))
      {
        alO();
        this.jwA.Bf();
        this.jHk.ar();
        GMTrace.o(5034909630464L, 37513);
        return;
      }
      if ((paramk instanceof com.tencent.mm.plugin.card.sharecard.model.b))
      {
        paramString = (com.tencent.mm.plugin.card.sharecard.model.b)paramk;
        this.jCP = false;
        this.jCQ = paramString.jAY;
        this.jCy.R(paramString.jzG, this.jCN);
        if ((!com.tencent.mm.plugin.card.sharecard.a.b.akL()) || (!com.tencent.mm.plugin.card.sharecard.a.b.akM())) {
          this.jCN = false;
        }
        w.i("MicroMsg.CardHomePageUI", "NetSceneGetShareCardsLayout() >> updateView()");
        ar();
        GMTrace.o(5034909630464L, 37513);
      }
    }
    else
    {
      if ((paramk instanceof com.tencent.mm.plugin.card.sharecard.model.b)) {
        this.jCP = false;
      }
      w.i("MicroMsg.CardHomePageUI", "share card list ui, onSceneEnd, errType = %d, errCode = %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    }
    GMTrace.o(5034909630464L, 37513);
  }
  
  public final void a(String paramString, com.tencent.mm.sdk.e.l paraml)
  {
    GMTrace.i(5035312283648L, 37516);
    this.jCL = true;
    GMTrace.o(5035312283648L, 37516);
  }
  
  protected final void aiM()
  {
    GMTrace.i(5032896364544L, 37498);
    oM(R.l.dcM);
    a(0, getString(R.l.ddk), new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(5029675139072L, 37474);
        com.tencent.mm.plugin.card.b.b.a(CardHomePageUI.this, true);
        com.tencent.mm.plugin.report.service.g.ork.i(11582, new Object[] { "CardListMsgMenu", Integer.valueOf(2), Integer.valueOf(0), "", "" });
        GMTrace.o(5029675139072L, 37474);
        return true;
      }
    });
    this.jCy = new com.tencent.mm.plugin.card.sharecard.a.b(this);
    this.jCy.init();
    if (this.jHh == null)
    {
      this.jHh = new i(this, this.vKB.hqF);
      i locali = this.jHh;
      locali.jIi = View.inflate(locali.iPC, R.i.crp, null);
      locali.jIi.setVisibility(8);
      locali.jIj = ((TextView)locali.jIi.findViewById(R.h.bkA));
      locali.jIk = ((ImageView)locali.jIi.findViewById(R.h.bkz));
      locali.jIi.setOnClickListener(new i.1(locali));
      locali.alT();
      if (locali.jIl == null)
      {
        locali.jIl = ((ViewStub)locali.jBw.findViewById(R.h.bkU)).inflate();
        locali.jIl.setVisibility(8);
        locali.jIm = ((TextView)locali.jIl.findViewById(R.h.bkA));
        locali.jIn = ((ImageView)locali.jIl.findViewById(R.h.bkz));
        locali.jIl.setOnClickListener(new i.2(locali));
      }
      this.jHh.jDg = true;
    }
    if (this.jHi == null) {
      this.jHi = new f(this, findViewById(R.h.bkR), 1, this.jCy);
    }
    if (this.jHj == null) {
      this.jHj = new f(this, findViewById(R.h.bly), 2, this.jCy);
    }
    if (this.jHk == null) {
      this.jHk = new f(this, findViewById(R.h.blI), 3, this.jCy);
    }
    if (this.jHi != null) {
      this.jHi.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(5007260778496L, 37307);
          paramAnonymousView = new Intent(CardHomePageUI.this, CardIndexUI.class);
          paramAnonymousView.putExtra("key_card_type", 1);
          CardHomePageUI.this.startActivity(paramAnonymousView);
          com.tencent.mm.plugin.report.service.g.ork.i(11324, new Object[] { "GotoMemberCardUI", Integer.valueOf(0), "", "", Integer.valueOf(0), Integer.valueOf(1), "", Integer.valueOf(0), Integer.valueOf(0) });
          GMTrace.o(5007260778496L, 37307);
        }
      });
    }
    if (this.jHj != null) {
      this.jHj.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(4970887774208L, 37036);
          paramAnonymousView = new Intent(CardHomePageUI.this, ShareCardListUI.class);
          paramAnonymousView.putExtra("key_layout_buff", CardHomePageUI.e(CardHomePageUI.this));
          CardHomePageUI.f(CardHomePageUI.this);
          CardHomePageUI.this.startActivity(paramAnonymousView);
          paramAnonymousView = (com.tencent.mm.plugin.card.sharecard.model.l)al.aks().getValue("key_share_card_layout_data");
          int i;
          int j;
          label86:
          int k;
          if (paramAnonymousView != null)
          {
            if (!paramAnonymousView.eTS) {
              break label307;
            }
            i = 1;
            if (!paramAnonymousView.eTT) {
              break label312;
            }
            j = 1;
            if (paramAnonymousView.jBk == null) {
              break label317;
            }
            k = 1;
            label96:
            if (!TextUtils.isEmpty(paramAnonymousView.jBl)) {
              break label323;
            }
          }
          label307:
          label312:
          label317:
          label323:
          for (int m = 0;; m = 1)
          {
            com.tencent.mm.plugin.report.service.g.ork.i(13685, new Object[] { Integer.valueOf(2), Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(m) });
            if (paramAnonymousView.eTT == true)
            {
              CardHomePageUI.g(CardHomePageUI.this);
              paramAnonymousView.eTT = false;
            }
            if (paramAnonymousView.eTS)
            {
              CardHomePageUI.g(CardHomePageUI.this);
              paramAnonymousView.eTS = false;
              paramAnonymousView.jBk = null;
              paramAnonymousView.jBl = "";
            }
            at.AR();
            com.tencent.mm.y.c.xh().a(w.a.vrc, "");
            com.tencent.mm.plugin.report.service.g.ork.i(11324, new Object[] { "ClickShareCard", Integer.valueOf(0), "", "", Integer.valueOf(0), Integer.valueOf(0), "", Integer.valueOf(0), Integer.valueOf(0) });
            GMTrace.o(4970887774208L, 37036);
            return;
            i = 0;
            break;
            j = 0;
            break label86;
            k = 0;
            break label96;
          }
        }
      });
    }
    if (this.jHk != null) {
      this.jHk.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(18900540456960L, 140820);
          paramAnonymousView = new Intent(CardHomePageUI.this, CardIndexUI.class);
          paramAnonymousView.putExtra("key_card_type", 3);
          CardHomePageUI.this.startActivity(paramAnonymousView);
          com.tencent.mm.plugin.report.service.g.ork.i(11324, new Object[] { "ClickTicketCard", Integer.valueOf(0), "", "", Integer.valueOf(0), Integer.valueOf(0), "", Integer.valueOf(0), Integer.valueOf(0) });
          GMTrace.o(18900540456960L, 140820);
        }
      });
    }
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(18896782360576L, 140792);
        if ((CardHomePageUI.a(CardHomePageUI.this) == 1) || (CardHomePageUI.a(CardHomePageUI.this) == 2)) {
          CardHomePageUI.b(CardHomePageUI.this);
        }
        for (;;)
        {
          GMTrace.o(18896782360576L, 140792);
          return true;
          CardHomePageUI.this.finish();
        }
      }
    });
    GMTrace.o(5032896364544L, 37498);
  }
  
  protected final int aiN()
  {
    GMTrace.i(5033030582272L, 37499);
    int i = n.a.jzE;
    GMTrace.o(5033030582272L, 37499);
    return i;
  }
  
  protected final boolean aiP()
  {
    GMTrace.i(5034372759552L, 37509);
    boolean bool = super.aiP();
    GMTrace.o(5034372759552L, 37509);
    return bool;
  }
  
  protected final boolean aiQ()
  {
    GMTrace.i(5034506977280L, 37510);
    GMTrace.o(5034506977280L, 37510);
    return true;
  }
  
  protected final void aiV()
  {
    GMTrace.i(5033970106368L, 37506);
    if (this.jCR)
    {
      w.e("MicroMsg.CardHomePageUI", "onLocationFinish, has do GetShareCardLayout,don't get again");
      if (this.jHm) {
        aiU();
      }
      GMTrace.o(5033970106368L, 37506);
      return;
    }
    w.d("MicroMsg.CardHomePageUI", "onLocationFinish()");
    this.jCR = true;
    akZ();
    aiU();
    GMTrace.o(5033970106368L, 37506);
  }
  
  protected final void aiW()
  {
    GMTrace.i(5034104324096L, 37507);
    if ((this.jCS) || (this.jCR))
    {
      aiU();
      GMTrace.o(5034104324096L, 37507);
      return;
    }
    this.jCS = true;
    w.i("MicroMsg.CardHomePageUI", "onLocationFail()");
    akZ();
    GMTrace.o(5034104324096L, 37507);
  }
  
  protected final void aiX()
  {
    GMTrace.i(5033299017728L, 37501);
    w.i("MicroMsg.CardHomePageUI", "onMPermissionGranted locationPermissionGranted " + this.jHm);
    if (!this.jHm)
    {
      this.jHm = true;
      akW();
    }
    GMTrace.o(5033299017728L, 37501);
  }
  
  protected final void aiY()
  {
    GMTrace.i(5033835888640L, 37505);
    alO();
    GMTrace.o(5033835888640L, 37505);
  }
  
  public final void ajG()
  {
    GMTrace.i(5035178065920L, 37515);
    this.jCL = true;
    GMTrace.o(5035178065920L, 37515);
  }
  
  protected final void b(com.tencent.mm.plugin.card.base.b paramb)
  {
    GMTrace.i(5034641195008L, 37511);
    super.b(paramb);
    GMTrace.o(5034641195008L, 37511);
  }
  
  protected final void c(com.tencent.mm.plugin.card.base.b paramb)
  {
    GMTrace.i(5034775412736L, 37512);
    super.c(paramb);
    GMTrace.o(5034775412736L, 37512);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(5032225275904L, 37493);
    int i = R.i.crb;
    GMTrace.o(5032225275904L, 37493);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(5032091058176L, 37492);
    super.onCreate(paramBundle);
    this.fromScene = getIntent().getIntExtra("key_home_page_from_scene", 0);
    long l = System.currentTimeMillis();
    this.mStartTime = l;
    this.jCW = l;
    MP();
    paramBundle = this.jHh;
    al.akr().a(paramBundle);
    at.wS().a(1164, this);
    at.wS().a(984, this);
    al.aku().akE();
    al.akm();
    com.tencent.mm.plugin.card.a.b.lD(1);
    alb();
    Looper.myQueue().addIdleHandler(new MessageQueue.IdleHandler()
    {
      public final boolean queueIdle()
      {
        GMTrace.i(18882555281408L, 140686);
        Object localObject;
        int i;
        if (CardHomePageUI.h(CardHomePageUI.this) != null)
        {
          CardHomePageUI.h(CardHomePageUI.this);
          at.AR();
          localObject = (Integer)com.tencent.mm.y.c.xh().get(w.a.vrq, Integer.valueOf(0));
          if ((localObject == null) || (((Integer)localObject).intValue() != 1)) {
            break label89;
          }
          i = 0;
        }
        for (;;)
        {
          if (i != 0)
          {
            w.i("MicroMsg.CardHomePageUI", "try2UpdateCardType");
            CardHomePageUI.i(CardHomePageUI.this);
          }
          GMTrace.o(18882555281408L, 140686);
          return false;
          label89:
          at.AR();
          com.tencent.mm.y.c.xh().a(w.a.vrq, Integer.valueOf(1));
          localObject = al.akn().lF(n.a.jzz);
          if ((localObject != null) && (((Cursor)localObject).getCount() > 0))
          {
            ((Cursor)localObject).moveToFirst();
            if (!((Cursor)localObject).isAfterLast())
            {
              CardInfo localCardInfo = new CardInfo();
              localCardInfo.b((Cursor)localObject);
              if (localCardInfo.field_card_type == -1)
              {
                if (localCardInfo.ajv() != null) {
                  break label190;
                }
                w.e("MicroMsg.ShareCardDataMgr", "updateCardType fail , info.getCardTpInfo() == null");
              }
              for (;;)
              {
                ((Cursor)localObject).moveToNext();
                break;
                label190:
                localCardInfo.field_card_type = localCardInfo.ajv().jxG;
                if (!al.akn().c(localCardInfo, new String[0])) {
                  w.e("MicroMsg.ShareCardDataMgr", "updateCardType fail , cardId = %s", new Object[] { localCardInfo.field_card_id });
                }
              }
            }
            ((Cursor)localObject).close();
            i = 1;
          }
          else
          {
            w.e("MicroMsg.ShareCardDataMgr", "updateAllCardInfoByBlockField cursor is null or size is 0");
            i = 0;
          }
        }
      }
    });
    al.aku().a(this);
    al.akn().c(this);
    GMTrace.o(5032091058176L, 37492);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(5032359493632L, 37494);
    if (this.jHm) {
      aiU();
    }
    i locali = this.jHh;
    al.akr().b(locali);
    this.jCy.jAQ = null;
    at.wS().b(1164, this);
    at.wS().b(984, this);
    al.aku().b(this);
    al.akn().j(this);
    com.tencent.mm.plugin.card.a.k.akb();
    com.tencent.mm.plugin.card.sharecard.a.b.akK();
    long l1 = System.currentTimeMillis();
    long l2 = this.jCW;
    com.tencent.mm.plugin.report.service.g.ork.i(13219, new Object[] { "CardHomePageUI", Integer.valueOf(this.fromScene), "", "", Long.valueOf(l1 - l2) });
    super.onDestroy();
    GMTrace.o(5032359493632L, 37494);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(5035446501376L, 37517);
    if (paramInt == 4)
    {
      if ((this.fromScene != 1) && (this.fromScene != 2)) {
        break label52;
      }
      alP();
    }
    for (;;)
    {
      boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
      GMTrace.o(5035446501376L, 37517);
      return bool;
      label52:
      finish();
    }
  }
  
  protected void onNewIntent(Intent paramIntent)
  {
    GMTrace.i(5033433235456L, 37502);
    super.onNewIntent(paramIntent);
    setIntent(paramIntent);
    alb();
    this.jCL = true;
    this.jHl = true;
    GMTrace.o(5033433235456L, 37502);
  }
  
  protected void onPause()
  {
    GMTrace.i(5032627929088L, 37496);
    super.onPause();
    GMTrace.o(5032627929088L, 37496);
  }
  
  protected void onResume()
  {
    GMTrace.i(5032493711360L, 37495);
    w.i("MicroMsg.CardHomePageUI", "onResume locationPermissionGranted %s, hasInitLocation %s, shouldGetLayout %s", new Object[] { Boolean.valueOf(this.jHm), Boolean.valueOf(this.jCX), Boolean.valueOf(this.jCL) });
    if ((this.jHm) && (this.jCX) && (this.jCL))
    {
      this.jCQ = "";
      this.jCR = false;
      aiT();
    }
    for (;;)
    {
      this.jCL = false;
      ar();
      long l = System.currentTimeMillis();
      if (this.mStartTime != 0L)
      {
        int i = (int)(l - this.mStartTime);
        ArrayList localArrayList = new ArrayList();
        IDKey localIDKey1 = new IDKey();
        localIDKey1.SetID(281);
        localIDKey1.SetKey(0);
        localIDKey1.SetValue(1L);
        IDKey localIDKey2 = new IDKey();
        localIDKey2.SetID(281);
        localIDKey2.SetKey(1);
        localIDKey2.SetValue(i);
        localArrayList.add(localIDKey1);
        localArrayList.add(localIDKey2);
        com.tencent.mm.plugin.report.service.g.ork.b(localArrayList, true);
        this.mStartTime = 0L;
      }
      at.xB().A(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(18881615757312L, 140679);
          al.akD().a(q.jLy);
          GMTrace.o(18881615757312L, 140679);
        }
      });
      super.onResume();
      GMTrace.o(5032493711360L, 37495);
      return;
      if (this.jCL)
      {
        this.jCQ = "";
        akZ();
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\card\ui\CardHomePageUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */