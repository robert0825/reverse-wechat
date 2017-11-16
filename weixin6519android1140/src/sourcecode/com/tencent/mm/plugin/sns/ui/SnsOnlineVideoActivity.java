package com.tencent.mm.plugin.sns.ui;

import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.dh;
import com.tencent.mm.g.a.dh.b;
import com.tencent.mm.g.a.gk;
import com.tencent.mm.g.a.pl;
import com.tencent.mm.g.a.pm;
import com.tencent.mm.g.a.qf;
import com.tencent.mm.g.a.qf.a;
import com.tencent.mm.g.a.rm;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.plugin.messenger.a.c;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.i.d;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.i.j;
import com.tencent.mm.plugin.sns.model.am;
import com.tencent.mm.pluginsdk.l;
import com.tencent.mm.protocal.c.anu;
import com.tencent.mm.protocal.c.aq;
import com.tencent.mm.protocal.c.as;
import com.tencent.mm.protocal.c.biz;
import com.tencent.mm.protocal.c.oa;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.ad;
import com.tencent.mm.ui.base.p.c;
import com.tencent.mm.ui.base.p.d;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.tools.g.b;
import com.tencent.mm.ui.widget.f.a;
import com.tencent.mm.y.s;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@com.tencent.mm.ui.base.a(3)
public class SnsOnlineVideoActivity
  extends MMActivity
{
  private String eHy;
  private String eIy;
  private anu eUs;
  private VelocityTracker ez;
  private String gKE;
  private GestureDetector imP;
  private Bundle jFK;
  private boolean jFL;
  private com.tencent.mm.ui.tools.g jFM;
  private int jFN;
  private int jFO;
  private int jFP;
  private int jFQ;
  private boolean jGN;
  private boolean liL;
  private RelativeLayout ljd;
  private ImageView lje;
  p.d mTX;
  private boolean mWy;
  private com.tencent.mm.ui.widget.f pSj;
  private boolean pUx;
  private com.tencent.mm.plugin.sns.storage.m pXt;
  private Button pYf;
  private float pYo;
  private int pYp;
  private int pYq;
  private boolean qdA;
  private boolean qdB;
  private boolean qdC;
  p.c qdD;
  private OnlineVideoView qdv;
  private boolean qdw;
  private boolean qdx;
  private float qdy;
  private float qdz;
  private int scene;
  
  public SnsOnlineVideoActivity()
  {
    GMTrace.i(8689255710720L, 64740);
    this.liL = true;
    this.scene = 0;
    this.qdw = false;
    this.jFL = false;
    this.jFN = 0;
    this.jFO = 0;
    this.jFP = 0;
    this.jFQ = 0;
    this.qdy = 0.0F;
    this.qdz = 0.0F;
    this.qdA = false;
    this.qdB = false;
    this.qdC = false;
    this.pYo = 1.0F;
    this.pYp = 0;
    this.pYq = 0;
    this.qdD = new p.c()
    {
      public final void a(com.tencent.mm.ui.base.n paramAnonymousn)
      {
        int i = 1;
        GMTrace.i(16633603031040L, 123930);
        if (bg.Sy(com.tencent.mm.k.g.ut().getValue("SIGHTCannotTransmitForFav")) == 0)
        {
          boolean bool1 = FileOp.aZ(SnsOnlineVideoActivity.n(SnsOnlineVideoActivity.this));
          boolean bool2 = FileOp.aZ(SnsOnlineVideoActivity.o(SnsOnlineVideoActivity.this));
          w.i("MicroMsg.SnsOnlineVideoActivity", "config can forward sight, thumb existed %B, video existed %B", new Object[] { Boolean.valueOf(bool1), Boolean.valueOf(bool2) });
          paramAnonymousn.add(0, 3, 0, SnsOnlineVideoActivity.this.getString(i.j.piy));
          if ((!bool1) || (!bool2)) {}
        }
        for (;;)
        {
          if (com.tencent.mm.bj.d.LL("favorite")) {
            paramAnonymousn.add(0, 2, 0, SnsOnlineVideoActivity.this.getString(i.j.dNH));
          }
          paramAnonymousn.add(0, 5, 0, SnsOnlineVideoActivity.this.getString(i.j.dUN));
          if (i != 0)
          {
            dh localdh = new dh();
            localdh.eEV.eEM = SnsOnlineVideoActivity.p(SnsOnlineVideoActivity.this);
            com.tencent.mm.sdk.b.a.vgX.m(localdh);
            if (localdh.eEW.eEu) {
              paramAnonymousn.add(0, 4, 0, SnsOnlineVideoActivity.this.getString(i.j.phO));
            }
          }
          GMTrace.o(16633603031040L, 123930);
          return;
          i = 0;
        }
      }
    };
    this.mTX = new p.d()
    {
      public final void c(MenuItem paramAnonymousMenuItem, int paramAnonymousInt)
      {
        boolean bool = false;
        GMTrace.i(16632395071488L, 123921);
        switch (paramAnonymousMenuItem.getItemId())
        {
        }
        for (;;)
        {
          GMTrace.o(16632395071488L, 123921);
          return;
          paramAnonymousMenuItem = new qf();
          paramAnonymousMenuItem.eUO.eHJ = 2;
          paramAnonymousMenuItem.eUO.eUP = 17;
          Object localObject = paramAnonymousMenuItem.eUO;
          if (SnsOnlineVideoActivity.q(SnsOnlineVideoActivity.this) == 0) {
            bool = true;
          }
          ((qf.a)localObject).eUQ = bool;
          paramAnonymousMenuItem.eUO.eHy = SnsOnlineVideoActivity.p(SnsOnlineVideoActivity.this);
          com.tencent.mm.sdk.b.a.vgX.m(paramAnonymousMenuItem);
          GMTrace.o(16632395071488L, 123921);
          return;
          localObject = new Intent();
          com.tencent.mm.plugin.sns.storage.m localm = com.tencent.mm.plugin.sns.model.ae.bjd().Is(SnsOnlineVideoActivity.p(SnsOnlineVideoActivity.this));
          if (localm != null) {
            w.i("MicroMsg.SnsOnlineVideoActivity", "expose id " + localm.blE());
          }
          if (localm == null)
          {
            paramAnonymousMenuItem = Integer.valueOf(0);
            ((Intent)localObject).putExtra("k_expose_msg_id", paramAnonymousMenuItem);
            if (localm != null) {
              break label296;
            }
          }
          label296:
          for (paramAnonymousMenuItem = "";; paramAnonymousMenuItem = localm.field_userName)
          {
            ((Intent)localObject).putExtra("k_username", paramAnonymousMenuItem);
            ((Intent)localObject).putExtra("showShare", false);
            ((Intent)localObject).putExtra("rawUrl", String.format("https://weixin110.qq.com/security/readtemplate?t=weixin_report/w_type&scene=%d#wechat_redirect", new Object[] { Integer.valueOf(33) }));
            com.tencent.mm.bj.d.b(SnsOnlineVideoActivity.this, "webview", ".ui.tools.WebViewUI", (Intent)localObject);
            GMTrace.o(16632395071488L, 123921);
            return;
            paramAnonymousMenuItem = localm.blE();
            break;
          }
          SnsOnlineVideoActivity.r(SnsOnlineVideoActivity.this);
          paramAnonymousMenuItem = new qf();
          paramAnonymousMenuItem.eUO.eHJ = 1;
          paramAnonymousMenuItem.eUO.eUR = 4097;
          paramAnonymousMenuItem.eUO.eHy = SnsOnlineVideoActivity.p(SnsOnlineVideoActivity.this);
          com.tencent.mm.sdk.b.a.vgX.m(paramAnonymousMenuItem);
          GMTrace.o(16632395071488L, 123921);
          return;
          paramAnonymousMenuItem = com.tencent.mm.plugin.sns.model.ae.bjd().Is(SnsOnlineVideoActivity.p(SnsOnlineVideoActivity.this));
          if (paramAnonymousMenuItem == null)
          {
            GMTrace.o(16632395071488L, 123921);
            return;
          }
          localObject = new Intent();
          if ((paramAnonymousMenuItem.blD().uUc.ueV == 15) && ((anu)paramAnonymousMenuItem.blD().uUc.ueW.get(0) == null))
          {
            w.w("MicroMsg.SnsOnlineVideoActivity", "send sight fail, mediaObj is null");
            GMTrace.o(16632395071488L, 123921);
            return;
          }
          ((Intent)localObject).putExtra("exdevice_open_scene_type", 2);
          ((Intent)localObject).putExtra("sns_local_id", SnsOnlineVideoActivity.p(SnsOnlineVideoActivity.this));
          ((Intent)localObject).putExtra("sns_send_data_ui_activity", true);
          com.tencent.mm.bj.d.a(SnsOnlineVideoActivity.this, ".ui.chatting.ChattingSendDataToDeviceUI", (Intent)localObject);
          GMTrace.o(16632395071488L, 123921);
          return;
          paramAnonymousMenuItem = new qf();
          paramAnonymousMenuItem.eUO.eHJ = 3;
          paramAnonymousMenuItem.eUO.eHy = SnsOnlineVideoActivity.p(SnsOnlineVideoActivity.this);
          com.tencent.mm.sdk.b.a.vgX.m(paramAnonymousMenuItem);
        }
      }
    };
    GMTrace.o(8689255710720L, 64740);
  }
  
  private void alN()
  {
    GMTrace.i(8689658363904L, 64743);
    if (this.pUx)
    {
      w.i("MicroMsg.SnsOnlineVideoActivity", "it is preview mode, don't register menu.");
      GMTrace.o(8689658363904L, 64743);
      return;
    }
    this.qdv.setOnLongClickListener(new View.OnLongClickListener()
    {
      public final boolean onLongClick(View paramAnonymousView)
      {
        GMTrace.i(16632529289216L, 123922);
        SnsOnlineVideoActivity.a(SnsOnlineVideoActivity.this, new com.tencent.mm.ui.widget.f(SnsOnlineVideoActivity.this.vKB.vKW, com.tencent.mm.ui.widget.f.xpQ, false));
        SnsOnlineVideoActivity.l(SnsOnlineVideoActivity.this).qik = SnsOnlineVideoActivity.this.qdD;
        SnsOnlineVideoActivity.l(SnsOnlineVideoActivity.this).qil = SnsOnlineVideoActivity.this.mTX;
        SnsOnlineVideoActivity.l(SnsOnlineVideoActivity.this).xqc = new f.a()
        {
          public final void onDismiss()
          {
            GMTrace.i(16633334595584L, 123928);
            SnsOnlineVideoActivity.a(SnsOnlineVideoActivity.this, null);
            GMTrace.o(16633334595584L, 123928);
          }
        };
        SnsOnlineVideoActivity.l(SnsOnlineVideoActivity.this).bFk();
        GMTrace.o(16632529289216L, 123922);
        return true;
      }
    });
    GMTrace.o(8689658363904L, 64743);
  }
  
  private void bpm()
  {
    GMTrace.i(17628961701888L, 131346);
    boolean bool = ad.fe(this);
    int i = ad.fd(this);
    if ((this.mWy) && (bool) && (this.pYf != null) && (this.pYf.getVisibility() == 0))
    {
      ViewGroup.MarginLayoutParams localMarginLayoutParams = (ViewGroup.MarginLayoutParams)this.pYf.getLayoutParams();
      localMarginLayoutParams.bottomMargin = (i + localMarginLayoutParams.bottomMargin);
      this.pYf.setLayoutParams(localMarginLayoutParams);
    }
    GMTrace.o(17628961701888L, 131346);
  }
  
  public final void alL()
  {
    GMTrace.i(8690329452544L, 64748);
    if ((this.pYf != null) && (this.pYf.getVisibility() == 0)) {
      this.pYf.setVisibility(8);
    }
    int k = this.ljd.getWidth();
    int j = this.ljd.getHeight();
    int i = j;
    if (this.jFP != 0)
    {
      i = j;
      if (this.jFQ != 0) {
        i = (int)(k / this.jFP * this.jFQ);
      }
    }
    this.jFM.eC(k, i);
    this.jFM.p(this.jFO, this.jFN, this.jFP, this.jFQ);
    if (this.pYo != 1.0D)
    {
      this.jFM.xhm = (1.0F / this.pYo);
      if ((this.pYp != 0) || (this.pYq != 0))
      {
        j = (int)(this.ljd.getWidth() / 2 * (1.0F - this.pYo));
        k = this.pYp;
        i = (int)(this.ljd.getHeight() / 2 + this.pYq - i / 2 * this.pYo);
        this.jFM.eD(j + k, i);
      }
    }
    this.jFM.a(this.qdv, this.lje, new g.b()
    {
      public final void onAnimationEnd()
      {
        GMTrace.i(16633200377856L, 123927);
        new com.tencent.mm.sdk.platformtools.ae().post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(16631589765120L, 123915);
            SnsOnlineVideoActivity.this.finish();
            SnsOnlineVideoActivity.this.overridePendingTransition(0, 0);
            GMTrace.o(16631589765120L, 123915);
          }
        });
        GMTrace.o(16633200377856L, 123927);
      }
      
      public final void onAnimationStart()
      {
        GMTrace.i(16633066160128L, 123926);
        GMTrace.o(16633066160128L, 123926);
      }
    }, null);
    GMTrace.o(8690329452544L, 64748);
  }
  
  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    GMTrace.i(8690463670272L, 64749);
    if ((paramKeyEvent.getKeyCode() == 4) && (paramKeyEvent.getAction() == 0))
    {
      w.d("MicroMsg.SnsOnlineVideoActivity", "dispatchKeyEvent");
      alL();
      GMTrace.o(8690463670272L, 64749);
      return true;
    }
    boolean bool = super.dispatchKeyEvent(paramKeyEvent);
    GMTrace.o(8690463670272L, 64749);
    return bool;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(8689524146176L, 64742);
    int i = i.g.pgF;
    GMTrace.o(8689524146176L, 64742);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(8690597888000L, 64750);
    w.i("MicroMsg.SnsOnlineVideoActivity", "on activity result reqCode %d resultCode %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if ((4097 == paramInt1) && (-1 == paramInt2))
    {
      Object localObject1 = paramIntent.getStringExtra("Select_Conv_User");
      String str1 = paramIntent.getStringExtra("custom_send_text");
      Iterator localIterator = bg.g(((String)localObject1).split(",")).iterator();
      if (localIterator.hasNext())
      {
        String str2 = (String)localIterator.next();
        if (this.scene == 0)
        {
          localObject1 = com.tencent.mm.plugin.sns.model.ae.bjd().Is(this.eHy);
          if (localObject1 != null)
          {
            if (!s.eb(str2)) {
              break label353;
            }
            localObject2 = new pl();
            ((pl)localObject2).eUl.eUg = i.g((com.tencent.mm.plugin.sns.storage.m)localObject1);
            ((pl)localObject2).eUl.eEM = ((com.tencent.mm.plugin.sns.storage.m)localObject1).blY();
            com.tencent.mm.sdk.b.a.vgX.m((b)localObject2);
          }
        }
        label181:
        Object localObject2 = this.pXt.blD();
        int i = i.Hc(this.gKE);
        anu localanu;
        if (bg.nm(this.eIy))
        {
          localanu = this.eUs;
          if (localanu == null) {
            localObject1 = "";
          }
        }
        for (;;)
        {
          this.eIy = ((String)localObject1);
          w.i("MicroMsg.SnsOnlineVideoActivity", "send sight to %s, videopath %s, thumbpath %s url: %s time: %d, duration: %s", new Object[] { str2, this.gKE, this.eIy, this.eUs.uCV, Integer.valueOf(this.eUs.qkw), Integer.valueOf(i) });
          com.tencent.mm.plugin.messenger.a.d.aOe().a(this, str2, this.gKE, this.eIy, 43, i, ((biz)localObject2).pTh);
          if (str1 != null) {
            com.tencent.mm.plugin.messenger.a.d.aOe().cR(str1, str2);
          }
          com.tencent.mm.ui.snackbar.a.e(this, getString(i.j.dCJ));
          break;
          label353:
          localObject2 = new pm();
          ((pm)localObject2).eUm.eUg = i.g((com.tencent.mm.plugin.sns.storage.m)localObject1);
          ((pm)localObject2).eUm.eEM = ((com.tencent.mm.plugin.sns.storage.m)localObject1).blY();
          com.tencent.mm.sdk.b.a.vgX.m((b)localObject2);
          break label181;
          String str3 = am.dE(com.tencent.mm.plugin.sns.model.ae.getAccSnsPath(), localanu.mmR);
          localObject1 = str3 + i.e(localanu);
          boolean bool = FileOp.aZ((String)localObject1);
          w.d("MicroMsg.SnsVideoLogic", "get sns video thumb path %s [%b]", new Object[] { localObject1, Boolean.valueOf(bool) });
          if (!bool)
          {
            localObject1 = str3 + i.n(localanu);
            w.i("MicroMsg.SnsVideoLogic", "get sns video thumb path %s", new Object[] { localObject1 });
            continue;
            localObject1 = this.eIy;
          }
        }
      }
    }
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    GMTrace.o(8690597888000L, 64750);
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    GMTrace.i(17628827484160L, 131345);
    super.onConfigurationChanged(paramConfiguration);
    if (paramConfiguration.orientation == 1)
    {
      w.d("MicroMsg.SnsOnlineVideoActivity", "vertical orientation");
      bpm();
      GMTrace.o(17628827484160L, 131345);
      return;
    }
    if (paramConfiguration.orientation == 2)
    {
      w.d("MicroMsg.SnsOnlineVideoActivity", "horizontal orientation");
      if ((this.pYf != null) && (this.pYf.getVisibility() == 0))
      {
        paramConfiguration = (ViewGroup.MarginLayoutParams)this.pYf.getLayoutParams();
        if (paramConfiguration.bottomMargin != getResources().getDimensionPixelSize(i.d.oXp))
        {
          paramConfiguration.bottomMargin = getResources().getDimensionPixelSize(i.d.oXp);
          this.pYf.setLayoutParams(paramConfiguration);
        }
      }
      GMTrace.o(17628827484160L, 131345);
      return;
    }
    GMTrace.o(17628827484160L, 131345);
  }
  
  public void onCreate(final Bundle paramBundle)
  {
    GMTrace.i(8689389928448L, 64741);
    if (getIntent().getExtras() != null) {
      getIntent().getExtras().setClassLoader(getClass().getClassLoader());
    }
    super.onCreate(paramBundle);
    this.vKB.bXF();
    try
    {
      if (com.tencent.mm.compatible.util.d.et(19))
      {
        getWindow().setFlags(201327616, 201327616);
        this.mWy = true;
        getWindow().addFlags(128);
        this.jFK = paramBundle;
        this.eIy = getIntent().getStringExtra("intent_thumbpath");
        this.eHy = getIntent().getStringExtra("intent_localid");
        this.scene = getIntent().getIntExtra("intent_from_scene", -1);
        this.pUx = getIntent().getBooleanExtra("intent_ispreview", false);
        this.jGN = getIntent().getBooleanExtra("intent_ismute", false);
        paramBundle = getIntent().getStringExtra("intent_videopath");
        w.i("MicroMsg.SnsOnlineVideoActivity", "init data get intent info finish. thumbPath %s localId %s scene %d isPreView %b isMute %b videoPath %s", new Object[] { this.eIy, this.eHy, Integer.valueOf(this.scene), Boolean.valueOf(this.pUx), Boolean.valueOf(this.jGN), paramBundle });
        if (this.pUx) {
          break label646;
        }
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        try
        {
          this.pXt = com.tencent.mm.plugin.sns.model.ae.bjd().Is(this.eHy);
          this.eUs = ((anu)this.pXt.blD().uUc.ueW.get(0));
          this.gKE = (am.dE(com.tencent.mm.plugin.sns.model.ae.getAccSnsPath(), this.eUs.mmR) + i.j(this.eUs));
          w.i("MicroMsg.SnsOnlineVideoActivity", "init data finish, sns info local id %s ", new Object[] { this.pXt.blY() });
          this.ljd = ((RelativeLayout)findViewById(i.f.ckK));
          this.qdv = ((OnlineVideoView)findViewById(i.f.ckL));
          if (this.pUx) {
            break label654;
          }
          this.qdv.a(this.eUs, this.pXt.blY(), this.pXt.field_createTime);
          paramBundle = this.qdv;
          paramBundle.jGN = this.jGN;
          paramBundle.jGP.setMute(paramBundle.jGN);
          this.lje = ((ImageView)findViewById(i.f.bCu));
          this.lje.setLayerType(2, null);
          this.ljd.setOnTouchListener(new View.OnTouchListener()
          {
            public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
            {
              GMTrace.i(8354785132544L, 62248);
              SnsOnlineVideoActivity.this.alL();
              GMTrace.o(8354785132544L, 62248);
              return true;
            }
          });
          this.imP = new GestureDetector(this.vKB.vKW, new GestureDetector.SimpleOnGestureListener()
          {
            public final void onLongPress(MotionEvent paramAnonymousMotionEvent)
            {
              GMTrace.i(8604832759808L, 64111);
              SnsOnlineVideoActivity.a(SnsOnlineVideoActivity.this, true);
              super.onLongPress(paramAnonymousMotionEvent);
              GMTrace.o(8604832759808L, 64111);
            }
            
            public final boolean onScroll(MotionEvent paramAnonymousMotionEvent1, MotionEvent paramAnonymousMotionEvent2, float paramAnonymousFloat1, float paramAnonymousFloat2)
            {
              GMTrace.i(8604698542080L, 64110);
              paramAnonymousFloat1 = paramAnonymousMotionEvent2.getRawX() - paramAnonymousMotionEvent1.getRawX();
              paramAnonymousFloat2 = paramAnonymousMotionEvent2.getRawY() - paramAnonymousMotionEvent1.getRawY();
              if ((Math.abs(paramAnonymousFloat1) <= SnsOnlineVideoActivity.a(SnsOnlineVideoActivity.this).getWidth()) && (Math.abs(paramAnonymousFloat2) <= SnsOnlineVideoActivity.a(SnsOnlineVideoActivity.this).getHeight()) && (SnsOnlineVideoActivity.b(SnsOnlineVideoActivity.this)))
              {
                SnsOnlineVideoActivity.c(SnsOnlineVideoActivity.this).setTranslationX(paramAnonymousFloat1);
                SnsOnlineVideoActivity.c(SnsOnlineVideoActivity.this).setTranslationY(paramAnonymousFloat2);
              }
              GMTrace.o(8604698542080L, 64110);
              return true;
            }
            
            public final boolean onSingleTapUp(MotionEvent paramAnonymousMotionEvent)
            {
              GMTrace.i(8604966977536L, 64112);
              SnsOnlineVideoActivity.this.alL();
              boolean bool = super.onSingleTapUp(paramAnonymousMotionEvent);
              GMTrace.o(8604966977536L, 64112);
              return bool;
            }
          });
          this.qdv.setOnTouchListener(new View.OnTouchListener()
          {
            public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
            {
              GMTrace.i(8503364157440L, 63355);
              SnsOnlineVideoActivity.d(SnsOnlineVideoActivity.this).onTouchEvent(paramAnonymousMotionEvent);
              if (SnsOnlineVideoActivity.e(SnsOnlineVideoActivity.this) == null) {
                SnsOnlineVideoActivity.a(SnsOnlineVideoActivity.this, VelocityTracker.obtain());
              }
              if (SnsOnlineVideoActivity.e(SnsOnlineVideoActivity.this) != null) {
                SnsOnlineVideoActivity.e(SnsOnlineVideoActivity.this).addMovement(paramAnonymousMotionEvent);
              }
              switch (paramAnonymousMotionEvent.getAction() & 0xFF)
              {
              default: 
              case 0: 
              case 1: 
                for (;;)
                {
                  GMTrace.o(8503364157440L, 63355);
                  return false;
                  SnsOnlineVideoActivity.a(SnsOnlineVideoActivity.this, paramAnonymousMotionEvent.getX());
                  SnsOnlineVideoActivity.b(SnsOnlineVideoActivity.this, paramAnonymousMotionEvent.getY());
                  if (SnsOnlineVideoActivity.f(SnsOnlineVideoActivity.this))
                  {
                    SnsOnlineVideoActivity.g(SnsOnlineVideoActivity.this);
                    SnsOnlineVideoActivity.b(SnsOnlineVideoActivity.this, false);
                    continue;
                    if (SnsOnlineVideoActivity.f(SnsOnlineVideoActivity.this))
                    {
                      SnsOnlineVideoActivity.c(SnsOnlineVideoActivity.this).setPivotX(SnsOnlineVideoActivity.a(SnsOnlineVideoActivity.this).getWidth() / 2);
                      SnsOnlineVideoActivity.c(SnsOnlineVideoActivity.this).setPivotY(SnsOnlineVideoActivity.a(SnsOnlineVideoActivity.this).getHeight() / 2);
                      SnsOnlineVideoActivity.c(SnsOnlineVideoActivity.this).setScaleX(1.0F);
                      SnsOnlineVideoActivity.c(SnsOnlineVideoActivity.this).setScaleY(1.0F);
                      SnsOnlineVideoActivity.c(SnsOnlineVideoActivity.this).setTranslationX(0.0F);
                      SnsOnlineVideoActivity.c(SnsOnlineVideoActivity.this).setTranslationY(0.0F);
                      SnsOnlineVideoActivity.h(SnsOnlineVideoActivity.this).setAlpha(1.0F);
                      SnsOnlineVideoActivity.c(SnsOnlineVideoActivity.this, 1.0F);
                      SnsOnlineVideoActivity.c(SnsOnlineVideoActivity.this, false);
                      SnsOnlineVideoActivity.a(SnsOnlineVideoActivity.this, false);
                      GMTrace.o(8503364157440L, 63355);
                      return true;
                    }
                    if ((SnsOnlineVideoActivity.b(SnsOnlineVideoActivity.this)) && (!SnsOnlineVideoActivity.i(SnsOnlineVideoActivity.this)))
                    {
                      SnsOnlineVideoActivity.this.alL();
                      SnsOnlineVideoActivity.a(SnsOnlineVideoActivity.this, false);
                      GMTrace.o(8503364157440L, 63355);
                      return true;
                    }
                    SnsOnlineVideoActivity.a(SnsOnlineVideoActivity.this, false);
                  }
                }
              }
              paramAnonymousView = SnsOnlineVideoActivity.e(SnsOnlineVideoActivity.this);
              paramAnonymousView.computeCurrentVelocity(1000);
              int i = (int)paramAnonymousView.getXVelocity();
              int j = (int)paramAnonymousView.getYVelocity();
              float f1 = SnsOnlineVideoActivity.c(SnsOnlineVideoActivity.this).getTranslationX();
              float f3 = SnsOnlineVideoActivity.c(SnsOnlineVideoActivity.this).getTranslationY();
              SnsOnlineVideoActivity.a(SnsOnlineVideoActivity.this, (int)f1);
              SnsOnlineVideoActivity.b(SnsOnlineVideoActivity.this, (int)f3);
              w.d("MicroMsg.SnsOnlineVideoActivity", "dancy scaled:%s, tx:%s, ty:%s, vx:%s, vy:%s", new Object[] { Boolean.valueOf(SnsOnlineVideoActivity.b(SnsOnlineVideoActivity.this)), Float.valueOf(f1), Float.valueOf(f3), Integer.valueOf(i), Integer.valueOf(j) });
              if (((Math.abs(f1) <= 250.0F) && (Math.abs(j) > Math.abs(i)) && (j > 0) && (!SnsOnlineVideoActivity.i(SnsOnlineVideoActivity.this))) || (SnsOnlineVideoActivity.b(SnsOnlineVideoActivity.this)))
              {
                float f2 = 1.0F - f3 / SnsOnlineVideoActivity.a(SnsOnlineVideoActivity.this).getHeight();
                f1 = f2;
                if (f2 > 1.0F) {
                  f1 = 1.0F;
                }
                if (((j > 0) && (f1 < SnsOnlineVideoActivity.j(SnsOnlineVideoActivity.this))) || ((j < 0) && (f1 >= 0.5D)))
                {
                  w.d("MicroMsg.SnsOnlineVideoActivity", "dancy scale:%s", new Object[] { Float.valueOf(f1) });
                  SnsOnlineVideoActivity.c(SnsOnlineVideoActivity.this, f1);
                  SnsOnlineVideoActivity.c(SnsOnlineVideoActivity.this).setPivotX(SnsOnlineVideoActivity.a(SnsOnlineVideoActivity.this).getWidth() / 2);
                  SnsOnlineVideoActivity.c(SnsOnlineVideoActivity.this).setPivotY(SnsOnlineVideoActivity.a(SnsOnlineVideoActivity.this).getHeight() / 2);
                  SnsOnlineVideoActivity.c(SnsOnlineVideoActivity.this).setScaleX(f1);
                  SnsOnlineVideoActivity.c(SnsOnlineVideoActivity.this).setScaleY(f1);
                  SnsOnlineVideoActivity.c(SnsOnlineVideoActivity.this).setTranslationY(f3);
                  SnsOnlineVideoActivity.h(SnsOnlineVideoActivity.this).setAlpha(f1);
                }
                SnsOnlineVideoActivity.c(SnsOnlineVideoActivity.this, true);
                label729:
                if (f3 <= 200.0F) {
                  break label826;
                }
                SnsOnlineVideoActivity.b(SnsOnlineVideoActivity.this, false);
              }
              for (;;)
              {
                if (f3 > 50.0F) {
                  SnsOnlineVideoActivity.c(SnsOnlineVideoActivity.this).setOnLongClickListener(null);
                }
                if (SnsOnlineVideoActivity.e(SnsOnlineVideoActivity.this) != null)
                {
                  SnsOnlineVideoActivity.e(SnsOnlineVideoActivity.this).recycle();
                  SnsOnlineVideoActivity.a(SnsOnlineVideoActivity.this, null);
                }
                if (!SnsOnlineVideoActivity.b(SnsOnlineVideoActivity.this)) {
                  break;
                }
                GMTrace.o(8503364157440L, 63355);
                return true;
                SnsOnlineVideoActivity.c(SnsOnlineVideoActivity.this, false);
                break label729;
                label826:
                if (f3 > 10.0F) {
                  SnsOnlineVideoActivity.b(SnsOnlineVideoActivity.this, true);
                }
              }
            }
          });
          this.jFM = new com.tencent.mm.ui.tools.g(this.vKB.vKW);
          paramBundle = this.pXt;
          if (paramBundle != null) {
            break label731;
          }
          w.i("MicroMsg.SnsOnlineVideoActivity", "snsInfo is null, return");
          alN();
          paramBundle = new rm();
          paramBundle.eWo.type = 1;
          com.tencent.mm.sdk.b.a.vgX.m(paramBundle);
          GMTrace.o(8689389928448L, 64741);
          return;
          getWindow().setFlags(1024, 1024);
          this.mWy = false;
          continue;
          localException = localException;
          w.printErrStackTrace("MicroMsg.SnsOnlineVideoActivity", localException, "", new Object[0]);
        }
        catch (Exception paramBundle)
        {
          w.e("MicroMsg.SnsOnlineVideoActivity", "init data exception " + paramBundle.toString());
          continue;
        }
        label646:
        this.gKE = paramBundle;
        continue;
        label654:
        paramBundle = this.qdv;
        final Object localObject1 = this.gKE;
        Object localObject2 = this.eIy;
        paramBundle.pUy = ((String)localObject1);
        paramBundle.pUx = true;
        paramBundle.lhi.setImageBitmap(BackwardSupportUtil.b.c((String)localObject2, 1.0F));
        w.i("MicroMsg.OnlineVideoView", "%d set preview video %s isPreview %b ", new Object[] { Integer.valueOf(paramBundle.hashCode()), localObject1, Boolean.valueOf(paramBundle.pUx) });
        continue;
        label731:
        this.pYf = ((Button)findViewById(i.f.paJ));
        localObject1 = paramBundle.blD();
        if (localObject1 != null) {}
        for (paramBundle = ((biz)localObject1).pwN;; paramBundle = null)
        {
          localObject2 = new ay();
          ag.a(this, (ay)localObject2, ((biz)localObject1).pwN);
          if (!((ay)localObject2).qig) {
            break label838;
          }
          this.pYf.setVisibility(0);
          this.pYf.setText(((ay)localObject2).qih);
          this.pYf.setOnClickListener(new View.OnClickListener()
          {
            public final void onClick(View paramAnonymousView)
            {
              GMTrace.i(16632931942400L, 123925);
              if (paramBundle.tOK == null)
              {
                GMTrace.o(16632931942400L, 123925);
                return;
              }
              SnsOnlineVideoActivity.k(SnsOnlineVideoActivity.this);
              paramAnonymousView = com.tencent.mm.plugin.sns.c.a.hnI.bH(paramBundle.tOK.lQa);
              int i = 0;
              if (localObject1.uUc.ueV == 1) {
                i = 2;
              }
              while (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.e.a(localObject1, SnsOnlineVideoActivity.this))
              {
                com.tencent.mm.plugin.sns.c.a.hnI.a(SnsOnlineVideoActivity.this, paramBundle.tOK.lQa, paramAnonymousView, localObject1.jhi, i, 19, 9, paramBundle.tOK.tOD, localObject1.mmR);
                GMTrace.o(16632931942400L, 123925);
                return;
                if (localObject1.uUc.ueV == 3) {
                  i = 5;
                } else if (localObject1.uUc.ueV == 15) {
                  i = 38;
                }
              }
              switch (paramBundle.jib)
              {
              }
              for (;;)
              {
                GMTrace.o(16632931942400L, 123925);
                return;
                Object localObject = new Intent();
                ((Intent)localObject).putExtra("rawUrl", paramBundle.lPM);
                com.tencent.mm.plugin.sns.c.a.hnH.j((Intent)localObject, SnsOnlineVideoActivity.this);
                com.tencent.mm.plugin.sns.c.a.hnI.a(SnsOnlineVideoActivity.this, paramBundle.tOK.lQa, paramAnonymousView, localObject1.jhi, i, 19, 1, paramBundle.tOK.tOD, localObject1.mmR);
                GMTrace.o(16632931942400L, 123925);
                return;
                if (paramBundle.tOG == 1)
                {
                  localObject = new gk();
                  ((gk)localObject).eJy.actionCode = 2;
                  ((gk)localObject).eJy.scene = 3;
                  ((gk)localObject).eJy.appId = paramBundle.tOK.lQa;
                  ((gk)localObject).eJy.context = SnsOnlineVideoActivity.this;
                  com.tencent.mm.sdk.b.a.vgX.m((b)localObject);
                  com.tencent.mm.plugin.sns.c.a.hnI.a(SnsOnlineVideoActivity.this, paramBundle.tOK.lQa, paramAnonymousView, localObject1.jhi, i, 19, 6, paramBundle.tOK.tOD, localObject1.mmR);
                  GMTrace.o(16632931942400L, 123925);
                  return;
                  int j = ag.a(SnsOnlineVideoActivity.this, paramBundle);
                  if (j == 1)
                  {
                    localObject = new gk();
                    ((gk)localObject).eJy.context = SnsOnlineVideoActivity.this;
                    ((gk)localObject).eJy.actionCode = 2;
                    ((gk)localObject).eJy.appId = paramBundle.tOK.lQa;
                    ((gk)localObject).eJy.messageAction = paramBundle.tOK.tOF;
                    ((gk)localObject).eJy.messageExt = paramBundle.tOK.tOE;
                    ((gk)localObject).eJy.scene = 3;
                    com.tencent.mm.sdk.b.a.vgX.m((b)localObject);
                    com.tencent.mm.plugin.sns.c.a.hnI.a(SnsOnlineVideoActivity.this, paramBundle.tOK.lQa, paramAnonymousView, localObject1.jhi, i, 19, 6, paramBundle.tOK.tOD, localObject1.mmR);
                    GMTrace.o(16632931942400L, 123925);
                    return;
                  }
                  if (j == 2)
                  {
                    localObject = new gk();
                    ((gk)localObject).eJy.context = SnsOnlineVideoActivity.this;
                    ((gk)localObject).eJy.actionCode = 1;
                    ((gk)localObject).eJy.appId = paramBundle.tOK.lQa;
                    ((gk)localObject).eJy.messageAction = paramBundle.tOK.tOF;
                    ((gk)localObject).eJy.messageExt = paramBundle.tOK.tOE;
                    ((gk)localObject).eJy.scene = 3;
                    com.tencent.mm.sdk.b.a.vgX.m((b)localObject);
                    com.tencent.mm.plugin.sns.c.a.hnI.a(SnsOnlineVideoActivity.this, paramBundle.tOK.lQa, paramAnonymousView, localObject1.jhi, i, 19, 3, paramBundle.tOK.tOD, localObject1.mmR);
                  }
                }
              }
            }
          });
          if (getRequestedOrientation() == 0) {
            break;
          }
          bpm();
          break;
        }
        label838:
        this.pYf.setVisibility(8);
      }
    }
  }
  
  protected void onDestroy()
  {
    GMTrace.i(8690195234816L, 64747);
    this.qdv.onDestroy();
    try
    {
      getWindow().clearFlags(128);
      super.onDestroy();
      GMTrace.o(8690195234816L, 64747);
      return;
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
  }
  
  protected void onPause()
  {
    GMTrace.i(8690061017088L, 64746);
    if (Build.VERSION.SDK_INT >= 21) {
      getWindow().setFlags(2048, 2048);
    }
    this.qdv.onPause();
    if (!this.qdw)
    {
      w.d("MicroMsg.SnsOnlineVideoActivity", "close Popup");
      if (!this.qdx) {
        break label95;
      }
      new com.tencent.mm.sdk.platformtools.ae().postDelayed(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(16632663506944L, 123923);
          SnsOnlineVideoActivity.this.finish();
          GMTrace.o(16632663506944L, 123923);
        }
      }, 500L);
    }
    for (;;)
    {
      super.onPause();
      GMTrace.o(8690061017088L, 64746);
      return;
      label95:
      new com.tencent.mm.sdk.platformtools.ae().post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(16635213643776L, 123942);
          SnsOnlineVideoActivity.this.finish();
          GMTrace.o(16635213643776L, 123942);
        }
      });
    }
  }
  
  protected void onResume()
  {
    GMTrace.i(8689926799360L, 64745);
    if (Build.VERSION.SDK_INT >= 21) {
      getWindow().clearFlags(2048);
    }
    if (!this.liL) {
      this.qdv.onResume();
    }
    this.liL = false;
    if (this.qdw) {
      this.qdw = false;
    }
    super.onResume();
    GMTrace.o(8689926799360L, 64745);
  }
  
  public void onStart()
  {
    GMTrace.i(8689792581632L, 64744);
    Bundle localBundle = this.jFK;
    if (!this.jFL)
    {
      this.jFL = true;
      if (Build.VERSION.SDK_INT >= 12)
      {
        this.jFN = getIntent().getIntExtra("img_gallery_top", 0);
        this.jFO = getIntent().getIntExtra("img_gallery_left", 0);
        this.jFP = getIntent().getIntExtra("img_gallery_width", 0);
        this.jFQ = getIntent().getIntExtra("img_gallery_height", 0);
        this.jFM.p(this.jFO, this.jFN, this.jFP, this.jFQ);
        if (localBundle == null) {
          this.qdv.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener()
          {
            public final boolean onPreDraw()
            {
              GMTrace.i(16632126636032L, 123919);
              SnsOnlineVideoActivity.c(SnsOnlineVideoActivity.this).getViewTreeObserver().removeOnPreDrawListener(this);
              SnsOnlineVideoActivity.m(SnsOnlineVideoActivity.this).a(SnsOnlineVideoActivity.c(SnsOnlineVideoActivity.this), SnsOnlineVideoActivity.h(SnsOnlineVideoActivity.this), new g.b()
              {
                public final void onAnimationEnd()
                {
                  GMTrace.i(16635616296960L, 123945);
                  if (SnsOnlineVideoActivity.c(SnsOnlineVideoActivity.this) != null) {
                    SnsOnlineVideoActivity.c(SnsOnlineVideoActivity.this).onResume();
                  }
                  GMTrace.o(16635616296960L, 123945);
                }
                
                public final void onAnimationStart()
                {
                  GMTrace.i(16635482079232L, 123944);
                  GMTrace.o(16635482079232L, 123944);
                }
              });
              GMTrace.o(16632126636032L, 123919);
              return true;
            }
          });
        }
      }
    }
    super.onStart();
    GMTrace.o(8689792581632L, 64744);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\ui\SnsOnlineVideoActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */