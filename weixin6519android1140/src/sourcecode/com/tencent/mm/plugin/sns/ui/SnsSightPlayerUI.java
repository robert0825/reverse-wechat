package com.tencent.mm.plugin.sns.ui;

import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Looper;
import android.support.v7.app.ActionBarActivity;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.Display;
import android.view.GestureDetector;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnCreateContextMenuListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.g.a.cf;
import com.tencent.mm.g.a.dh;
import com.tencent.mm.g.a.dh.b;
import com.tencent.mm.g.a.pd;
import com.tencent.mm.g.a.ph;
import com.tencent.mm.g.a.pl;
import com.tencent.mm.g.a.pm;
import com.tencent.mm.g.a.rm;
import com.tencent.mm.k.e;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.plugin.sns.a.b.j;
import com.tencent.mm.plugin.sns.a.b.j.a;
import com.tencent.mm.plugin.sns.a.b.j.b;
import com.tencent.mm.plugin.sns.a.b.j.c;
import com.tencent.mm.plugin.sns.a.b.j.d;
import com.tencent.mm.plugin.sns.a.b.j.e;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.i.a;
import com.tencent.mm.plugin.sns.i.c;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.i.j;
import com.tencent.mm.plugin.sns.model.am;
import com.tencent.mm.plugin.sns.model.b.b;
import com.tencent.mm.pluginsdk.ui.tools.VideoSightView;
import com.tencent.mm.pluginsdk.ui.tools.f.a;
import com.tencent.mm.protocal.c.anu;
import com.tencent.mm.protocal.c.bhq;
import com.tencent.mm.protocal.c.bhr;
import com.tencent.mm.protocal.c.biz;
import com.tencent.mm.protocal.c.oa;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.an;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.ad;
import com.tencent.mm.ui.base.p.d;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.tools.g.b;
import com.tencent.mm.ui.tools.l;
import com.tencent.mm.ui.widget.MMPinProgressBtn;
import com.tencent.mm.y.ac;
import com.tencent.mm.y.d.a;
import com.tencent.mm.y.s;
import java.io.File;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@com.tencent.mm.ui.base.a(3)
public class SnsSightPlayerUI
  extends MMActivity
  implements b.b, d.a
{
  private int duration;
  private String eHy;
  private String eIy;
  private anu eUs;
  private int eWr;
  private VelocityTracker ez;
  private String gKE;
  private boolean gpJ;
  private com.tencent.mm.y.d imE;
  private GestureDetector imP;
  private String imagePath;
  private boolean isInit;
  Bundle jFK;
  private boolean jFL;
  com.tencent.mm.ui.tools.g jFM;
  private int jFN;
  private int jFO;
  private int jFP;
  private int jFQ;
  com.tencent.mm.pluginsdk.ui.tools.f jGP;
  public l jGV;
  private int led;
  private TextView lhN;
  private boolean lhQ;
  private ImageView lje;
  p.d mTX;
  private int oSE;
  ViewGroup oTI;
  private int oTQ;
  private int oTR;
  public int oTY;
  private TextView oTy;
  private boolean oTz;
  private float pYo;
  private int pYp;
  private int pYq;
  private boolean poX;
  private boolean qdA;
  private boolean qdB;
  private boolean qdC;
  private boolean qdw;
  private float qdy;
  private float qdz;
  private com.tencent.mm.plugin.sns.a.b.h qfm;
  private String qfn;
  private TextView qfo;
  private MMPinProgressBtn qfp;
  private com.tencent.mm.plugin.sns.storage.m qfq;
  private String qfr;
  private RelativeLayout qfs;
  View.OnCreateContextMenuListener qft;
  private int scene;
  
  public SnsSightPlayerUI()
  {
    GMTrace.i(8374515138560L, 62395);
    this.qfm = new com.tencent.mm.plugin.sns.a.b.h("SnsSightPlayerUI");
    this.gKE = "";
    this.imagePath = "";
    this.eHy = "";
    this.qfn = "";
    this.poX = false;
    this.jGP = null;
    this.oTy = null;
    this.qfo = null;
    this.qfp = null;
    this.scene = 0;
    this.duration = 0;
    this.eWr = 0;
    this.oSE = 0;
    this.led = 0;
    this.oTz = false;
    this.qdw = false;
    this.oTQ = 0;
    this.oTR = 0;
    this.isInit = false;
    this.lhQ = false;
    this.qfq = null;
    this.eUs = null;
    this.eIy = "";
    this.qfr = "";
    this.lhN = null;
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
    this.gpJ = false;
    this.qft = new View.OnCreateContextMenuListener()
    {
      public final void onCreateContextMenu(ContextMenu paramAnonymousContextMenu, View paramAnonymousView, ContextMenu.ContextMenuInfo paramAnonymousContextMenuInfo)
      {
        GMTrace.i(8580539351040L, 63930);
        if (bg.Sy(com.tencent.mm.k.g.ut().getValue("SIGHTCannotTransmitForFav")) == 0)
        {
          boolean bool1 = FileOp.aZ(SnsSightPlayerUI.c(SnsSightPlayerUI.this));
          boolean bool2 = FileOp.aZ(SnsSightPlayerUI.t(SnsSightPlayerUI.this));
          w.i("MicroMsg.SnsSightPlayerUI", "config can forward sight, thumb existed %B, video existed %B", new Object[] { Boolean.valueOf(bool1), Boolean.valueOf(bool2) });
          if ((bool1) && (bool2)) {
            paramAnonymousContextMenu.add(0, 3, 0, SnsSightPlayerUI.this.getString(i.j.piy));
          }
        }
        for (int i = 1;; i = 0)
        {
          if (com.tencent.mm.bj.d.LL("favorite")) {
            paramAnonymousContextMenu.add(0, 2, 0, SnsSightPlayerUI.this.getString(i.j.dNH));
          }
          if (i != 0)
          {
            paramAnonymousView = new dh();
            paramAnonymousView.eEV.eEM = SnsSightPlayerUI.d(SnsSightPlayerUI.this);
            com.tencent.mm.sdk.b.a.vgX.m(paramAnonymousView);
            if (paramAnonymousView.eEW.eEu) {
              paramAnonymousContextMenu.add(0, 4, 0, SnsSightPlayerUI.this.getString(i.j.phO));
            }
          }
          if (!SnsSightPlayerUI.i(SnsSightPlayerUI.this)) {
            paramAnonymousContextMenu.add(0, 1, 0, SnsSightPlayerUI.this.vKB.vKW.getString(i.j.pkS));
          }
          GMTrace.o(8580539351040L, 63930);
          return;
        }
      }
    };
    this.mTX = new p.d()
    {
      public final void c(MenuItem paramAnonymousMenuItem, int paramAnonymousInt)
      {
        GMTrace.i(8544971653120L, 63665);
        switch (paramAnonymousMenuItem.getItemId())
        {
        }
        for (;;)
        {
          GMTrace.o(8544971653120L, 63665);
          return;
          paramAnonymousMenuItem = com.tencent.mm.plugin.sns.model.ae.bjd().Is(SnsSightPlayerUI.d(SnsSightPlayerUI.this));
          if (paramAnonymousMenuItem == null)
          {
            GMTrace.o(8544971653120L, 63665);
            return;
          }
          Object localObject = new cf();
          com.tencent.mm.plugin.sns.i.a.a((cf)localObject, paramAnonymousMenuItem);
          ((cf)localObject).eDv.activity = SnsSightPlayerUI.this;
          ((cf)localObject).eDv.eDC = 17;
          com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject);
          if (SnsSightPlayerUI.i(SnsSightPlayerUI.this))
          {
            localObject = new com.tencent.mm.plugin.sns.a.b.c(paramAnonymousMenuItem.bmh(), 11, 5, "", 2, SnsSightPlayerUI.a(SnsSightPlayerUI.this).blE());
            com.tencent.mm.kernel.h.xz();
            com.tencent.mm.kernel.h.xx().fYr.a((k)localObject, 0);
            j.a(j.d.pow, j.c.poq, j.e.poD, 0, paramAnonymousMenuItem);
          }
          if (SnsSightPlayerUI.e(SnsSightPlayerUI.this) == 0)
          {
            localObject = new ph();
            ((ph)localObject).eUh.eEM = paramAnonymousMenuItem.blY();
            ((ph)localObject).eUh.eUg = i.g(paramAnonymousMenuItem);
            com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject);
          }
          GMTrace.o(8544971653120L, 63665);
          return;
          localObject = new Intent();
          com.tencent.mm.plugin.sns.storage.m localm = com.tencent.mm.plugin.sns.model.ae.bjd().Is(SnsSightPlayerUI.d(SnsSightPlayerUI.this));
          if (localm != null) {
            w.i("MicroMsg.SnsSightPlayerUI", "expose id " + localm.blE());
          }
          if (localm == null)
          {
            paramAnonymousMenuItem = Integer.valueOf(0);
            ((Intent)localObject).putExtra("k_expose_msg_id", paramAnonymousMenuItem);
            if (localm != null) {
              break label396;
            }
          }
          label396:
          for (paramAnonymousMenuItem = "";; paramAnonymousMenuItem = localm.field_userName)
          {
            ((Intent)localObject).putExtra("k_username", paramAnonymousMenuItem);
            ((Intent)localObject).putExtra("showShare", false);
            ((Intent)localObject).putExtra("rawUrl", String.format("https://weixin110.qq.com/security/readtemplate?t=weixin_report/w_type&scene=%d#wechat_redirect", new Object[] { Integer.valueOf(33) }));
            com.tencent.mm.bj.d.b(SnsSightPlayerUI.this, "webview", ".ui.tools.WebViewUI", (Intent)localObject);
            GMTrace.o(8544971653120L, 63665);
            return;
            paramAnonymousMenuItem = localm.blE();
            break;
          }
          SnsSightPlayerUI.u(SnsSightPlayerUI.this);
          paramAnonymousMenuItem = new Intent();
          paramAnonymousMenuItem.putExtra("Select_Conv_Type", 3);
          paramAnonymousMenuItem.putExtra("select_is_ret", true);
          paramAnonymousMenuItem.putExtra("mutil_select_is_ret", true);
          paramAnonymousMenuItem.putExtra("image_path", SnsSightPlayerUI.c(SnsSightPlayerUI.this));
          paramAnonymousMenuItem.putExtra("Retr_Msg_Type", 11);
          com.tencent.mm.bj.d.a(SnsSightPlayerUI.this, ".ui.transmit.SelectConversationUI", paramAnonymousMenuItem, 4097);
          GMTrace.o(8544971653120L, 63665);
          return;
          paramAnonymousMenuItem = com.tencent.mm.plugin.sns.model.ae.bjd().Is(SnsSightPlayerUI.d(SnsSightPlayerUI.this));
          if (paramAnonymousMenuItem == null)
          {
            GMTrace.o(8544971653120L, 63665);
            return;
          }
          localObject = new Intent();
          if ((paramAnonymousMenuItem.blD().uUc.ueV == 15) && ((anu)paramAnonymousMenuItem.blD().uUc.ueW.get(0) == null))
          {
            w.w("MicroMsg.SnsSightPlayerUI", "send sight fail, mediaObj is null");
            GMTrace.o(8544971653120L, 63665);
            return;
          }
          ((Intent)localObject).putExtra("exdevice_open_scene_type", 2);
          ((Intent)localObject).putExtra("sns_local_id", SnsSightPlayerUI.d(SnsSightPlayerUI.this));
          ((Intent)localObject).putExtra("sns_send_data_ui_activity", true);
          com.tencent.mm.bj.d.a(SnsSightPlayerUI.this, ".ui.chatting.ChattingSendDataToDeviceUI", (Intent)localObject);
        }
      }
    };
    this.oTY = 0;
    GMTrace.o(8374515138560L, 62395);
  }
  
  private void K(int paramInt, boolean paramBoolean)
  {
    GMTrace.i(8377065275392L, 62414);
    if ((this.oTR == 0) || (this.oTQ == 0))
    {
      localObject = getResources().getDisplayMetrics();
      this.oTR = ((DisplayMetrics)localObject).heightPixels;
      this.oTQ = ((DisplayMetrics)localObject).widthPixels;
    }
    Object localObject = this.oTI.getLayoutParams();
    RelativeLayout.LayoutParams localLayoutParams = (RelativeLayout.LayoutParams)this.qfo.getLayoutParams();
    LinearLayout.LayoutParams localLayoutParams1 = new LinearLayout.LayoutParams(-1, -2);
    if (paramInt == 1)
    {
      localLayoutParams1.width = this.oTQ;
      localLayoutParams1.height = ((int)(this.oTQ * 1.0D * 240.0D / 320.0D));
      localLayoutParams.addRule(12, 0);
      localLayoutParams.addRule(1, 0);
      localLayoutParams.addRule(11, -1);
      localLayoutParams.addRule(3, this.oTI.getId());
      findViewById(i.f.chF).setVisibility(0);
    }
    for (;;)
    {
      w.i("MicroMsg.SnsSightPlayerUI", "orientation " + paramInt + " " + localLayoutParams1.width + " " + localLayoutParams1.height);
      ((View)this.jGP).setLayoutParams(localLayoutParams1);
      if ((this.jGP instanceof com.tencent.mm.plugin.sight.decode.a.a)) {
        ((com.tencent.mm.plugin.sight.decode.a.a)this.jGP).cV(localLayoutParams1.width, localLayoutParams1.height);
      }
      ((ViewGroup.LayoutParams)localObject).height = localLayoutParams1.height;
      ((ViewGroup.LayoutParams)localObject).width = localLayoutParams1.width;
      this.oTy.setLayoutParams(localLayoutParams);
      this.oTI.setLayoutParams((ViewGroup.LayoutParams)localObject);
      ((View)this.jGP).requestLayout();
      if (!paramBoolean) {
        vw(paramInt);
      }
      GMTrace.o(8377065275392L, 62414);
      return;
      localLayoutParams1.height = this.oTQ;
      localLayoutParams1.width = ((int)(this.oTQ * 1.0D * 320.0D / 240.0D));
      localLayoutParams.addRule(11, 0);
      localLayoutParams.addRule(3, 0);
      localLayoutParams.addRule(12, -1);
      localLayoutParams.addRule(1, this.oTI.getId());
      findViewById(i.f.chF).setVisibility(8);
    }
  }
  
  private void blb()
  {
    GMTrace.i(8375052009472L, 62399);
    w.i("MicroMsg.SnsSightPlayerUI", "snsSightplayui pauseplay");
    this.jGP.pause();
    this.jGP.onDetach();
    this.imE.bf(false);
    GMTrace.o(8375052009472L, 62399);
  }
  
  private void hv(boolean paramBoolean)
  {
    GMTrace.i(8374917791744L, 62398);
    this.jGP.start();
    this.duration = this.jGP.getDuration();
    w.i("MicroMsg.SnsSightPlayerUI", "startplay get duration " + this.duration);
    this.imE.a(this);
    com.tencent.mm.plugin.sns.a.b.a.a locala;
    if (paramBoolean)
    {
      locala = this.qfm.pnK;
      if (getResources().getConfiguration().orientation != 2) {
        break label134;
      }
    }
    label134:
    for (int i = 2;; i = 1)
    {
      locala.poL = i;
      this.qfm.pnK.poM = bg.Pw();
      this.qfm.pnK.poK = 2;
      GMTrace.o(8374917791744L, 62398);
      return;
    }
  }
  
  private void vw(int paramInt)
  {
    GMTrace.i(8377199493120L, 62415);
    if (!this.poX)
    {
      GMTrace.o(8377199493120L, 62415);
      return;
    }
    com.tencent.mm.plugin.sns.a.b.a.a locala;
    if (this.jGP.isPlaying())
    {
      if (this.duration == 0) {
        this.duration = this.jGP.getDuration();
      }
      this.qfm.ud(this.duration);
      this.qfm.pnK.poM = bg.Pw();
      locala = this.qfm.pnK;
      if (paramInt != 2) {
        break label168;
      }
    }
    label168:
    for (paramInt = 2;; paramInt = 1)
    {
      locala.poL = paramInt;
      this.qfm.pnK.poK = 2;
      w.i("MicroMsg.SnsSightPlayerUI", "duration " + this.duration + " orient " + this.qfm.pnK.poL);
      GMTrace.o(8377199493120L, 62415);
      return;
    }
  }
  
  public final void Hd(String paramString)
  {
    GMTrace.i(8376259969024L, 62408);
    GMTrace.o(8376259969024L, 62408);
  }
  
  protected final int Qf()
  {
    GMTrace.i(8376796839936L, 62412);
    GMTrace.o(8376796839936L, 62412);
    return 7;
  }
  
  public final void alL()
  {
    GMTrace.i(8375857315840L, 62405);
    int k = this.oTI.getWidth();
    int j = this.oTI.getHeight();
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
      int m = ad.fd(this.vKB.vKW);
      this.jFM.xhm = (1.0F / this.pYo);
      if ((this.pYp != 0) || (this.pYq != 0))
      {
        j = (int)(this.oTI.getWidth() / 2 * (1.0F - this.pYo));
        k = this.pYp;
        i = (int)((m + this.oTI.getHeight()) / 2 - i / 2 * this.pYo + this.pYq);
        this.jFM.eD(j + k, i);
      }
    }
    this.jFM.a(this.oTI, this.lje, new g.b()
    {
      public final void onAnimationEnd()
      {
        GMTrace.i(8707106668544L, 64873);
        new com.tencent.mm.sdk.platformtools.ae().post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(8552085192704L, 63718);
            SnsSightPlayerUI.this.finish();
            SnsSightPlayerUI.this.overridePendingTransition(0, 0);
            GMTrace.o(8552085192704L, 63718);
          }
        });
        GMTrace.o(8707106668544L, 64873);
      }
      
      public final void onAnimationStart()
      {
        GMTrace.i(8706972450816L, 64872);
        if (SnsSightPlayerUI.p(SnsSightPlayerUI.this) != null) {
          SnsSightPlayerUI.p(SnsSightPlayerUI.this).setVisibility(8);
        }
        GMTrace.o(8706972450816L, 64872);
      }
    }, null);
    GMTrace.o(8375857315840L, 62405);
  }
  
  public final void av(String paramString, boolean paramBoolean)
  {
    GMTrace.i(8376394186752L, 62409);
    GMTrace.o(8376394186752L, 62409);
  }
  
  public final void aw(String paramString, boolean paramBoolean)
  {
    GMTrace.i(8376662622208L, 62411);
    w.i("MicroMsg.SnsSightPlayerUI", "onSightFinish " + paramString);
    if ((this.poX) && (!bg.nm(paramString)) && (this.eUs != null) && (paramString.equals(this.eUs.mmR)) && (FileOp.aZ(this.gKE)))
    {
      this.qfm.pnD = 1;
      this.jGP.setVideoPath(this.gKE);
      hv(true);
      if (this.qfp != null) {
        this.qfp.setVisibility(8);
      }
    }
    GMTrace.o(8376662622208L, 62411);
  }
  
  public final void bhV()
  {
    GMTrace.i(8376528404480L, 62410);
    GMTrace.o(8376528404480L, 62410);
  }
  
  public void finish()
  {
    GMTrace.i(8374783574016L, 62397);
    if (!this.gpJ)
    {
      super.finish();
      this.gpJ = true;
    }
    GMTrace.o(8374783574016L, 62397);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(8375186227200L, 62400);
    int i = i.g.pgh;
    GMTrace.o(8375186227200L, 62400);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(8376125751296L, 62407);
    if (4097 == paramInt1)
    {
      Object localObject1;
      if (-1 == paramInt2)
      {
        localObject1 = paramIntent.getStringExtra("Select_Conv_User");
        String str1 = paramIntent.getStringExtra("custom_send_text");
        Iterator localIterator = bg.g(((String)localObject1).split(",")).iterator();
        String str2;
        label155:
        Object localObject3;
        bhr localbhr;
        label251:
        label271:
        label300:
        label469:
        do
        {
          if (!localIterator.hasNext()) {
            break label854;
          }
          str2 = (String)localIterator.next();
          if (this.scene == 0)
          {
            localObject1 = com.tencent.mm.plugin.sns.model.ae.bjd().Is(this.eHy);
            if (localObject1 != null)
            {
              if (!s.eb(str2)) {
                break;
              }
              localObject2 = new pl();
              ((pl)localObject2).eUl.eUg = i.g((com.tencent.mm.plugin.sns.storage.m)localObject1);
              ((pl)localObject2).eUl.eEM = ((com.tencent.mm.plugin.sns.storage.m)localObject1).blY();
              com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject2);
            }
          }
          localObject2 = this.qfq.blD();
          if (!this.poX) {
            break label707;
          }
          localObject3 = this.qfq.blz();
          localbhr = new bhr();
          localbhr.ulk = this.eUs.qkw;
          localbhr.gkI = this.eUs.uCV;
          if (((biz)localObject2).uUc.ueV != 15) {
            break label654;
          }
          localbhr.gkO = this.qfq.blB().pyc;
          localbhr.gkP = ((biz)localObject2).mmR;
          if (!bg.nm(this.eUs.uCZ)) {
            break label683;
          }
          localObject1 = ((biz)localObject2).uTZ;
          localbhr.gkK = ((String)localObject1);
          if (!bg.nm(this.eUs.uCY)) {
            break label695;
          }
          localObject1 = this.eUs.uCO;
          localbhr.gkN = ((String)localObject1);
          if ((localObject3 != null) && (((com.tencent.mm.plugin.sns.storage.b)localObject3).pCO == 0))
          {
            localbhr.gkM = ((com.tencent.mm.plugin.sns.storage.b)localObject3).pCQ;
            localbhr.gkL = ((com.tencent.mm.plugin.sns.storage.b)localObject3).pCP;
          }
          if (localObject3 != null) {
            localbhr.gkM = ((com.tencent.mm.plugin.sns.storage.b)localObject3).pCg;
          }
          i = i.Hc(this.gKE);
          w.i("MicroMsg.SnsSightPlayerUI", "send adsight to %s, videopath %s, thumbpath %s url: %s time: %d streamvideothumburl %s, duration: %s", new Object[] { str2, this.gKE, this.imagePath, this.eUs.uCV, Integer.valueOf(this.eUs.qkw), localbhr.gkN, Integer.valueOf(i) });
          com.tencent.mm.plugin.messenger.a.d.aOe().a(this, str2, this.gKE, this.imagePath, 43, i, localbhr, false, false, ((biz)localObject2).pTh);
          if (str1 != null) {
            com.tencent.mm.plugin.messenger.a.d.aOe().cR(str1, str2);
          }
          com.tencent.mm.ui.snackbar.a.e(this, getString(i.j.dCJ));
        } while (!this.poX);
        localObject1 = new com.tencent.mm.plugin.sns.a.b.c(this.qfq.bmh(), 12, 5, "", 2, this.qfq.blE());
        com.tencent.mm.kernel.h.xz();
        com.tencent.mm.kernel.h.xx().fYr.a((k)localObject1, 0);
        boolean bool = s.eb(str2);
        Object localObject2 = j.d.pow;
        if (bool)
        {
          localObject1 = j.c.pot;
          label572:
          localObject3 = j.e.poD;
          if (!bool) {
            break label795;
          }
        }
        label654:
        label683:
        label695:
        label707:
        label795:
        for (int i = com.tencent.mm.y.m.fk(str2);; i = 0)
        {
          j.a((j.d)localObject2, (j.c)localObject1, (j.e)localObject3, i, this.qfq);
          break;
          localObject2 = new pm();
          ((pm)localObject2).eUm.eUg = i.g((com.tencent.mm.plugin.sns.storage.m)localObject1);
          ((pm)localObject2).eUm.eEM = ((com.tencent.mm.plugin.sns.storage.m)localObject1).blY();
          com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject2);
          break label155;
          localbhr.gkO = ((biz)localObject2).uUh.gkO;
          localbhr.gkP = ((biz)localObject2).uUh.gkP;
          break label251;
          localObject1 = this.eUs.uCZ;
          break label271;
          localObject1 = this.eUs.uCY;
          break label300;
          i = i.Hc(this.gKE);
          w.i("MicroMsg.SnsSightPlayerUI", "send sight to %s, videopath %s, thumbpath %s, duration: %s", new Object[] { str2, this.gKE, this.imagePath, Integer.valueOf(i) });
          com.tencent.mm.plugin.messenger.a.d.aOe().a(this, str2, this.gKE, this.imagePath, 43, i, ((biz)localObject2).pTh);
          break label469;
          localObject1 = j.c.por;
          break label572;
        }
      }
      if (this.poX)
      {
        localObject1 = new com.tencent.mm.plugin.sns.a.b.c(this.qfq.bmh(), 13, 5, "", 2, this.qfq.blE());
        com.tencent.mm.kernel.h.xz();
        com.tencent.mm.kernel.h.xx().fYr.a((k)localObject1, 0);
      }
    }
    label854:
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    GMTrace.o(8376125751296L, 62407);
  }
  
  public void onBackPressed()
  {
    GMTrace.i(8375991533568L, 62406);
    alL();
    GMTrace.o(8375991533568L, 62406);
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    GMTrace.i(8376931057664L, 62413);
    super.onConfigurationChanged(paramConfiguration);
    w.i("MicroMsg.SnsSightPlayerUI", "onConfigurationChanged " + paramConfiguration.orientation + " " + this.oTY);
    if (this.oTY == paramConfiguration.orientation)
    {
      GMTrace.o(8376931057664L, 62413);
      return;
    }
    int i = paramConfiguration.orientation;
    K(paramConfiguration.orientation, false);
    this.oTY = paramConfiguration.orientation;
    GMTrace.o(8376931057664L, 62413);
  }
  
  public void onCreate(final Bundle paramBundle)
  {
    GMTrace.i(8374649356288L, 62396);
    if (getIntent().getExtras() != null) {
      getIntent().getExtras().setClassLoader(getClass().getClassLoader());
    }
    this.scene = getIntent().getIntExtra("intent_from_scene", -1);
    long l = System.currentTimeMillis();
    super.onCreate(paramBundle);
    this.vKB.bXF();
    com.tencent.mm.plugin.sns.model.ae.biY().a(this);
    if (Build.VERSION.SDK_INT >= 21) {
      getWindow().setStatusBarColor(getResources().getColor(i.c.black));
    }
    if (com.tencent.mm.compatible.util.d.et(19))
    {
      getWindow().setFlags(201327616, 201327616);
      this.jFK = paramBundle;
      this.imE = new com.tencent.mm.y.d();
      this.gKE = getIntent().getStringExtra("intent_videopath");
      this.imagePath = getIntent().getStringExtra("intent_thumbpath");
      this.eHy = getIntent().getStringExtra("intent_localid");
      this.poX = getIntent().getBooleanExtra("intent_isad", false);
      this.qfq = com.tencent.mm.plugin.sns.model.ae.bjd().Is(this.eHy);
      if (!this.poX) {
        break label360;
      }
      if (this.qfq != null) {
        break label257;
      }
    }
    label257:
    Object localObject1;
    for (int i = 0;; i = 1)
    {
      if (i != 0) {
        break label360;
      }
      finish();
      GMTrace.o(8374649356288L, 62396);
      return;
      getWindow().setFlags(1024, 1024);
      break;
      this.eUs = ((anu)this.qfq.blD().uUc.ueW.get(0));
      paramBundle = am.dE(com.tencent.mm.plugin.sns.model.ae.getAccSnsPath(), this.eUs.mmR);
      localObject1 = i.k(this.eUs);
      this.qfr = (paramBundle + (String)localObject1);
      this.eIy = (paramBundle + i.e(this.eUs));
    }
    label360:
    if (com.tencent.mm.p.a.pD() != null) {
      com.tencent.mm.p.a.pD().ri();
    }
    this.qfm.pnF = bg.Pw();
    this.qfs = ((RelativeLayout)findViewById(i.f.hBF));
    this.qfs.setOnTouchListener(new View.OnTouchListener()
    {
      public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
      {
        GMTrace.i(8682813259776L, 64692);
        SnsSightPlayerUI.this.alL();
        GMTrace.o(8682813259776L, 64692);
        return true;
      }
    });
    w.d("MicroMsg.SnsSightPlayerUI", com.tencent.mm.compatible.util.g.tB() + " initView: fullpath:" + this.gKE + ", imagepath:" + this.imagePath);
    this.jFM = new com.tencent.mm.ui.tools.g(this.vKB.vKW);
    this.lje = ((ImageView)findViewById(i.f.bCu));
    this.lje.setLayerType(2, null);
    this.oTy = ((TextView)findViewById(i.f.chF));
    this.qfp = ((MMPinProgressBtn)findViewById(i.f.ceT));
    this.oTI = ((ViewGroup)findViewById(i.f.ckd));
    this.jGP = com.tencent.mm.pluginsdk.ui.tools.n.dX(this.vKB.vKW);
    paramBundle = new LinearLayout.LayoutParams(-1, -2);
    this.lhN = ((TextView)findViewById(i.f.ceK));
    this.oTI.addView((View)this.jGP, 0, paramBundle);
    this.qfo = ((TextView)findViewById(i.f.pem));
    this.qfo.setText("");
    if (!this.poX) {
      this.qfo.setVisibility(8);
    }
    if (this.poX) {
      if (this.eUs == null)
      {
        this.lhN.setVisibility(8);
        com.tencent.mm.pluginsdk.ui.tools.m.a(this.lhN, (VideoSightView)this.jGP);
        label675:
        this.jGP.a(new f.a()
        {
          public final void Xq()
          {
            GMTrace.i(8724823408640L, 65005);
            w.d("MicroMsg.SnsSightPlayerUI", com.tencent.mm.compatible.util.g.tB() + " onPrepared");
            SnsSightPlayerUI.a(SnsSightPlayerUI.this, true);
            GMTrace.o(8724823408640L, 65005);
          }
          
          public final int bM(int paramAnonymousInt1, int paramAnonymousInt2)
          {
            GMTrace.i(8725226061824L, 65008);
            GMTrace.o(8725226061824L, 65008);
            return 0;
          }
          
          public final void bs(int paramAnonymousInt1, int paramAnonymousInt2)
          {
            GMTrace.i(8725360279552L, 65009);
            GMTrace.o(8725360279552L, 65009);
          }
          
          public final void onCompletion()
          {
            GMTrace.i(8725091844096L, 65007);
            w.d("MicroMsg.SnsSightPlayerUI", "on completion");
            if (!SnsSightPlayerUI.i(SnsSightPlayerUI.this)) {
              SnsSightPlayerUI.j(SnsSightPlayerUI.this).post(new Runnable()
              {
                public final void run()
                {
                  GMTrace.i(8602282622976L, 64092);
                  if (SnsSightPlayerUI.j(SnsSightPlayerUI.this).getVisibility() != 0)
                  {
                    SnsSightPlayerUI.j(SnsSightPlayerUI.this).setVisibility(0);
                    SnsSightPlayerUI.j(SnsSightPlayerUI.this).startAnimation(AnimationUtils.loadAnimation(SnsSightPlayerUI.this.vKB.vKW, i.a.aLs));
                  }
                  GMTrace.o(8602282622976L, 64092);
                }
              });
            }
            SnsSightPlayerUI.f(SnsSightPlayerUI.this).ci(true);
            com.tencent.mm.plugin.sns.a.b.a.a locala = SnsSightPlayerUI.k(SnsSightPlayerUI.this).pnK;
            locala.poH += 1;
            SnsSightPlayerUI.a(SnsSightPlayerUI.this, false);
            GMTrace.o(8725091844096L, 65007);
          }
          
          public final void onError(int paramAnonymousInt1, int paramAnonymousInt2)
          {
            GMTrace.i(8724957626368L, 65006);
            w.e("MicroMsg.SnsSightPlayerUI", "on play video error, what %d extra %d", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2) });
            SnsSightPlayerUI.f(SnsSightPlayerUI.this).stop();
            if (SnsSightPlayerUI.g(SnsSightPlayerUI.this))
            {
              GMTrace.o(8724957626368L, 65006);
              return;
            }
            SnsSightPlayerUI.h(SnsSightPlayerUI.this);
            com.tencent.mm.sdk.a.b.r(Base64.encodeToString((com.tencent.mm.plugin.sight.base.d.bgi() + "[SnsSightPlayerUI] on play video error, what " + paramAnonymousInt1 + " extra " + paramAnonymousInt2 + ", path=" + bg.aq(SnsSightPlayerUI.c(SnsSightPlayerUI.this), "")).getBytes(), 2), "FullScreenPlaySight");
            final String str = SnsSightPlayerUI.c(SnsSightPlayerUI.this);
            af.t(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(8766028251136L, 65312);
                Object localObject = (ImageView)SnsSightPlayerUI.this.findViewById(i.f.ckO);
                if (localObject != null)
                {
                  ((ImageView)localObject).setImageBitmap(this.oip);
                  ((ImageView)localObject).setVisibility(0);
                }
                localObject = new Intent();
                ((Intent)localObject).setAction("android.intent.action.VIEW");
                ((Intent)localObject).setDataAndType(Uri.fromFile(new File(str)), "video/*");
                try
                {
                  SnsSightPlayerUI.this.vKB.vKW.startActivity(Intent.createChooser((Intent)localObject, SnsSightPlayerUI.this.vKB.vKW.getString(i.j.dve)));
                  GMTrace.o(8766028251136L, 65312);
                  return;
                }
                catch (Exception localException)
                {
                  w.e("MicroMsg.SnsSightPlayerUI", "startActivity fail, activity not found");
                  com.tencent.mm.ui.base.h.h(SnsSightPlayerUI.this.vKB.vKW, i.j.due, i.j.duf);
                  GMTrace.o(8766028251136L, 65312);
                }
              }
            });
            GMTrace.o(8724957626368L, 65006);
          }
        });
        findViewById(i.f.ckd).setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(8544032129024L, 63658);
            SnsSightPlayerUI.this.alL();
            GMTrace.o(8544032129024L, 63658);
          }
        });
        ((View)this.jGP).setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(8767907299328L, 65326);
            SnsSightPlayerUI.this.alL();
            GMTrace.o(8767907299328L, 65326);
          }
        });
        this.imP = new GestureDetector(this.vKB.vKW, new GestureDetector.SimpleOnGestureListener()
        {
          public final void onLongPress(MotionEvent paramAnonymousMotionEvent)
          {
            GMTrace.i(8338544787456L, 62127);
            SnsSightPlayerUI.b(SnsSightPlayerUI.this, true);
            super.onLongPress(paramAnonymousMotionEvent);
            GMTrace.o(8338544787456L, 62127);
          }
          
          public final boolean onScroll(MotionEvent paramAnonymousMotionEvent1, MotionEvent paramAnonymousMotionEvent2, float paramAnonymousFloat1, float paramAnonymousFloat2)
          {
            GMTrace.i(8338410569728L, 62126);
            paramAnonymousFloat1 = ((View)SnsSightPlayerUI.f(SnsSightPlayerUI.this)).getTranslationX();
            paramAnonymousFloat2 = paramAnonymousMotionEvent2.getX();
            float f1 = paramAnonymousMotionEvent1.getX();
            float f2 = ((View)SnsSightPlayerUI.f(SnsSightPlayerUI.this)).getTranslationY();
            float f3 = paramAnonymousMotionEvent2.getY();
            float f4 = paramAnonymousMotionEvent1.getY();
            if (SnsSightPlayerUI.l(SnsSightPlayerUI.this))
            {
              ((View)SnsSightPlayerUI.f(SnsSightPlayerUI.this)).setTranslationX(paramAnonymousFloat1 + paramAnonymousFloat2 - f1);
              ((View)SnsSightPlayerUI.f(SnsSightPlayerUI.this)).setTranslationY(f2 + f3 - f4);
            }
            GMTrace.o(8338410569728L, 62126);
            return true;
          }
        });
        ((View)this.jGP).setOnTouchListener(new View.OnTouchListener()
        {
          public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
          {
            GMTrace.i(8582418399232L, 63944);
            SnsSightPlayerUI.m(SnsSightPlayerUI.this).onTouchEvent(paramAnonymousMotionEvent);
            if (SnsSightPlayerUI.n(SnsSightPlayerUI.this) == null) {
              SnsSightPlayerUI.a(SnsSightPlayerUI.this, VelocityTracker.obtain());
            }
            SnsSightPlayerUI.n(SnsSightPlayerUI.this).addMovement(paramAnonymousMotionEvent);
            switch (paramAnonymousMotionEvent.getAction() & 0xFF)
            {
            default: 
            case 0: 
            case 1: 
              for (;;)
              {
                GMTrace.o(8582418399232L, 63944);
                return false;
                SnsSightPlayerUI.a(SnsSightPlayerUI.this, paramAnonymousMotionEvent.getX());
                SnsSightPlayerUI.b(SnsSightPlayerUI.this, paramAnonymousMotionEvent.getY());
                continue;
                if (SnsSightPlayerUI.o(SnsSightPlayerUI.this))
                {
                  ((View)SnsSightPlayerUI.f(SnsSightPlayerUI.this)).setPivotX(SnsSightPlayerUI.this.oTI.getWidth() / 2);
                  ((View)SnsSightPlayerUI.f(SnsSightPlayerUI.this)).setPivotY(SnsSightPlayerUI.this.oTI.getHeight() / 2);
                  ((View)SnsSightPlayerUI.f(SnsSightPlayerUI.this)).setScaleX(1.0F);
                  ((View)SnsSightPlayerUI.f(SnsSightPlayerUI.this)).setScaleY(1.0F);
                  ((View)SnsSightPlayerUI.f(SnsSightPlayerUI.this)).setTranslationX(0.0F);
                  ((View)SnsSightPlayerUI.f(SnsSightPlayerUI.this)).setTranslationY(0.0F);
                  paramAnonymousView = SnsSightPlayerUI.this;
                  if (paramAnonymousView.jGV == null) {
                    paramAnonymousView.jGV = new l(paramAnonymousView.vKB.vKW);
                  }
                  paramAnonymousView.jGV.a((View)paramAnonymousView.jGP, paramAnonymousView.qft, paramAnonymousView.mTX);
                  if (SnsSightPlayerUI.p(SnsSightPlayerUI.this) != null) {
                    SnsSightPlayerUI.p(SnsSightPlayerUI.this).setVisibility(0);
                  }
                  SnsSightPlayerUI.c(SnsSightPlayerUI.this, false);
                  SnsSightPlayerUI.b(SnsSightPlayerUI.this, false);
                }
                else
                {
                  if ((SnsSightPlayerUI.l(SnsSightPlayerUI.this)) && (!SnsSightPlayerUI.q(SnsSightPlayerUI.this)))
                  {
                    SnsSightPlayerUI.this.alL();
                    SnsSightPlayerUI.b(SnsSightPlayerUI.this, false);
                    GMTrace.o(8582418399232L, 63944);
                    return true;
                  }
                  SnsSightPlayerUI.b(SnsSightPlayerUI.this, false);
                }
              }
            }
            float f2 = ((View)SnsSightPlayerUI.f(SnsSightPlayerUI.this)).getTranslationX();
            float f3 = ((View)SnsSightPlayerUI.f(SnsSightPlayerUI.this)).getTranslationY();
            paramAnonymousView = SnsSightPlayerUI.n(SnsSightPlayerUI.this);
            paramAnonymousView.computeCurrentVelocity(1000);
            int i = (int)paramAnonymousView.getXVelocity();
            int j = (int)paramAnonymousView.getYVelocity();
            if (((Math.abs(f2) <= 250.0F) && (Math.abs(j) > Math.abs(i)) && (j > 0) && (!SnsSightPlayerUI.q(SnsSightPlayerUI.this))) || (SnsSightPlayerUI.l(SnsSightPlayerUI.this)))
            {
              float f1 = 1.0F - f3 / SnsSightPlayerUI.this.oTI.getHeight();
              if (f1 > 1.0F)
              {
                f1 = 1.0F;
                label528:
                if (((j > 0) && (f1 < SnsSightPlayerUI.r(SnsSightPlayerUI.this))) || ((j < 0) && (f1 >= 0.5D)))
                {
                  SnsSightPlayerUI.a(SnsSightPlayerUI.this, (int)f2);
                  SnsSightPlayerUI.b(SnsSightPlayerUI.this, (int)f3);
                  SnsSightPlayerUI.c(SnsSightPlayerUI.this, f1);
                  if (SnsSightPlayerUI.p(SnsSightPlayerUI.this) != null) {
                    SnsSightPlayerUI.p(SnsSightPlayerUI.this).setVisibility(8);
                  }
                  ((View)SnsSightPlayerUI.f(SnsSightPlayerUI.this)).setPivotX(SnsSightPlayerUI.this.oTI.getWidth() / 2);
                  ((View)SnsSightPlayerUI.f(SnsSightPlayerUI.this)).setPivotY(SnsSightPlayerUI.this.oTI.getHeight() / 2);
                  ((View)SnsSightPlayerUI.f(SnsSightPlayerUI.this)).setScaleX(f1);
                  ((View)SnsSightPlayerUI.f(SnsSightPlayerUI.this)).setScaleY(f1);
                  SnsSightPlayerUI.s(SnsSightPlayerUI.this).setAlpha(f1);
                }
                SnsSightPlayerUI.c(SnsSightPlayerUI.this, true);
                label712:
                if (f3 <= 200.0F) {
                  break label815;
                }
                SnsSightPlayerUI.d(SnsSightPlayerUI.this, false);
              }
            }
            for (;;)
            {
              if (f3 > 50.0F) {
                ((View)SnsSightPlayerUI.f(SnsSightPlayerUI.this)).setOnLongClickListener(null);
              }
              if (SnsSightPlayerUI.n(SnsSightPlayerUI.this) != null)
              {
                SnsSightPlayerUI.n(SnsSightPlayerUI.this).recycle();
                SnsSightPlayerUI.a(SnsSightPlayerUI.this, null);
              }
              if (!SnsSightPlayerUI.l(SnsSightPlayerUI.this)) {
                break;
              }
              GMTrace.o(8582418399232L, 63944);
              return true;
              break label528;
              SnsSightPlayerUI.c(SnsSightPlayerUI.this, false);
              break label712;
              label815:
              if (f3 > 10.0F) {
                SnsSightPlayerUI.d(SnsSightPlayerUI.this, true);
              }
            }
          }
        });
        if (!FileOp.aZ(this.gKE)) {
          break label1294;
        }
        if (this.gKE != null)
        {
          this.jGP.stop();
          this.jGP.setVideoPath(this.gKE);
        }
        this.qfp.setVisibility(8);
      }
    }
    for (this.qfm.pnD = 1;; this.qfm.pnD = 0)
    {
      w.d("MicroMsg.SnsSightPlayerUI", System.currentTimeMillis() - l + " initView end");
      paramBundle = new rm();
      paramBundle.eWo.type = 1;
      com.tencent.mm.sdk.b.a.vgX.m(paramBundle);
      if (this.jGV == null) {
        this.jGV = new l(this.vKB.vKW);
      }
      this.jGV.a((View)this.jGP, this.qft, this.mTX);
      ((View)this.jGP).post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(8334518255616L, 62097);
          DisplayMetrics localDisplayMetrics = new DisplayMetrics();
          SnsSightPlayerUI.this.getWindowManager().getDefaultDisplay().getMetrics(localDisplayMetrics);
          if ((SnsSightPlayerUI.f(SnsSightPlayerUI.this) instanceof VideoSightView)) {
            ((VideoSightView)SnsSightPlayerUI.f(SnsSightPlayerUI.this)).tW(localDisplayMetrics.widthPixels);
          }
          ((View)SnsSightPlayerUI.f(SnsSightPlayerUI.this)).requestLayout();
          ((View)SnsSightPlayerUI.f(SnsSightPlayerUI.this)).postInvalidate();
          GMTrace.o(8334518255616L, 62097);
        }
      });
      GMTrace.o(8374649356288L, 62396);
      return;
      if (bg.nm(this.eUs.uCV))
      {
        w.i("MicroMsg.SnsSightPlayerUI", "onCreate: there is no attachurl, show more info btn");
        paramBundle = this.qfq.blD();
        final Object localObject2 = this.qfq.blz();
        localObject1 = ((com.tencent.mm.plugin.sns.storage.b)localObject2).pCP;
        localObject2 = ((com.tencent.mm.plugin.sns.storage.b)localObject2).pCQ;
        if ((!bg.nm((String)localObject1)) && (!bg.nm((String)localObject2)))
        {
          this.lhN.setVisibility(0);
          this.lhN.setText((CharSequence)localObject1);
          this.lhN.setOnClickListener(new View.OnClickListener()
          {
            public final void onClick(final View paramAnonymousView)
            {
              GMTrace.i(8315325120512L, 61954);
              Object localObject;
              String str;
              if (j.b.pok.value != 0)
              {
                localObject = j.a.poe;
                str = paramBundle.mmR;
                if (SnsSightPlayerUI.a(SnsSightPlayerUI.this).blB() != null) {
                  break label214;
                }
              }
              label214:
              for (paramAnonymousView = "";; paramAnonymousView = SnsSightPlayerUI.a(SnsSightPlayerUI.this).blB().pyc)
              {
                j.a((j.a)localObject, str, paramAnonymousView, 1, j.b.pok.value, paramBundle.jhi, null, paramBundle.mmR, 0L, 0, 0);
                paramAnonymousView = new Intent();
                localObject = new Bundle();
                ((Bundle)localObject).putString("key_snsad_statextstr", paramBundle.pTh);
                paramAnonymousView.putExtra("jsapiargs", (Bundle)localObject);
                paramAnonymousView.putExtra("rawUrl", localObject2);
                paramAnonymousView.putExtra("useJs", true);
                localObject = new com.tencent.mm.plugin.sns.a.b.c(SnsSightPlayerUI.a(SnsSightPlayerUI.this).bmh(), 18, 5, "", 2, SnsSightPlayerUI.a(SnsSightPlayerUI.this).blE());
                com.tencent.mm.kernel.h.xz();
                com.tencent.mm.kernel.h.xx().fYr.a((k)localObject, 0);
                new com.tencent.mm.sdk.platformtools.ae(Looper.getMainLooper()).post(new Runnable()
                {
                  public final void run()
                  {
                    GMTrace.i(8736366133248L, 65091);
                    com.tencent.mm.plugin.sns.c.a.hnH.j(paramAnonymousView, SnsSightPlayerUI.this);
                    SnsSightPlayerUI.this.finish();
                    GMTrace.o(8736366133248L, 65091);
                  }
                });
                GMTrace.o(8315325120512L, 61954);
                return;
              }
            }
          });
          break;
        }
        this.lhN.setVisibility(8);
        break;
      }
      localObject1 = getResources().getString(i.j.edf);
      paramBundle = (Bundle)localObject1;
      if (this.eUs.qkw / 60 > 0) {
        paramBundle = (String)localObject1 + getResources().getString(i.j.edh, new Object[] { Integer.valueOf(this.eUs.qkw / 60) });
      }
      localObject1 = paramBundle;
      if (this.eUs.qkw % 60 > 0) {
        localObject1 = paramBundle + getResources().getString(i.j.edi, new Object[] { Integer.valueOf(this.eUs.qkw % 60) });
      }
      paramBundle = (String)localObject1 + getResources().getString(i.j.edg);
      this.lhN.setText(paramBundle);
      this.lhN.setVisibility(0);
      this.lhN.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(8320962265088L, 61996);
          if (SnsSightPlayerUI.a(SnsSightPlayerUI.this).uX(32)) {
            j.a(j.b.pok, j.a.pod, SnsSightPlayerUI.a(SnsSightPlayerUI.this));
          }
          Intent localIntent = new Intent();
          paramAnonymousView = am.dE(com.tencent.mm.plugin.sns.model.ae.getAccSnsPath(), SnsSightPlayerUI.b(SnsSightPlayerUI.this).mmR);
          Object localObject = i.k(SnsSightPlayerUI.b(SnsSightPlayerUI.this));
          localIntent.setClass(SnsSightPlayerUI.this, VideoAdPlayerUI.class);
          localIntent.putExtra("KFullVideoPath", paramAnonymousView + (String)localObject);
          localIntent.putExtra("KThumbPath", SnsSightPlayerUI.c(SnsSightPlayerUI.this));
          localIntent.putExtra("IsAd", true);
          localIntent.putExtra("KStremVideoUrl", SnsSightPlayerUI.b(SnsSightPlayerUI.this).uCV);
          if (bg.nm(SnsSightPlayerUI.b(SnsSightPlayerUI.this).uCY))
          {
            paramAnonymousView = SnsSightPlayerUI.b(SnsSightPlayerUI.this).uCO;
            localIntent.putExtra("KThumUrl", paramAnonymousView);
            localIntent.putExtra("KMediaId", SnsSightPlayerUI.b(SnsSightPlayerUI.this).mmR);
            localIntent.putExtra("KUrl", SnsSightPlayerUI.b(SnsSightPlayerUI.this).lPM);
            localIntent.putExtra("KViewId", SnsSightPlayerUI.a(SnsSightPlayerUI.this).bmh());
            localObject = SnsSightPlayerUI.a(SnsSightPlayerUI.this).blD();
            if (SnsSightPlayerUI.a(SnsSightPlayerUI.this).blB() != null) {
              break label682;
            }
            paramAnonymousView = "";
            label263:
            localIntent.putExtra("KSta_StremVideoAduxInfo", paramAnonymousView);
            localIntent.putExtra("KSta_StremVideoPublishId", ((biz)localObject).mmR);
            localIntent.putExtra("KSta_SourceType", 1);
            localIntent.putExtra("KSta_Scene", j.b.pok.value);
            localIntent.putExtra("KSta_FromUserName", ((biz)localObject).jhi);
            localIntent.putExtra("KSta_SnSId", ((biz)localObject).mmR);
            localIntent.putExtra("KSta_SnsStatExtStr", ((biz)localObject).pTh);
            localIntent.putExtra("KMediaVideoTime", SnsSightPlayerUI.b(SnsSightPlayerUI.this).qkw);
            if (!bg.nm(SnsSightPlayerUI.b(SnsSightPlayerUI.this).uCZ)) {
              break label699;
            }
            paramAnonymousView = ((biz)localObject).uTZ;
            label374:
            localIntent.putExtra("KMediaTitle", paramAnonymousView);
            paramAnonymousView = SnsSightPlayerUI.a(SnsSightPlayerUI.this).blz();
            if ((paramAnonymousView != null) && (paramAnonymousView.pCO == 0))
            {
              localIntent.putExtra("StreamWording", paramAnonymousView.pCP);
              localIntent.putExtra("StremWebUrl", paramAnonymousView.pCQ);
            }
            localObject = com.tencent.mm.plugin.sns.model.ae.bjd().Is(SnsSightPlayerUI.d(SnsSightPlayerUI.this));
            if (SnsSightPlayerUI.e(SnsSightPlayerUI.this) != 0) {
              break label713;
            }
            paramAnonymousView = com.tencent.mm.modelsns.b.ha(747);
            label457:
            paramAnonymousView.lu(i.g((com.tencent.mm.plugin.sns.storage.m)localObject)).hd(((com.tencent.mm.plugin.sns.storage.m)localObject).field_type).bC(true).lu(((com.tencent.mm.plugin.sns.storage.m)localObject).bmi()).hd(SnsSightPlayerUI.b(SnsSightPlayerUI.this).qkw);
            paramAnonymousView.LR();
            if (SnsSightPlayerUI.e(SnsSightPlayerUI.this) != 0) {
              break label723;
            }
          }
          label682:
          label699:
          label713:
          label723:
          for (paramAnonymousView = com.tencent.mm.modelsns.b.ha(748);; paramAnonymousView = com.tencent.mm.modelsns.b.hb(748))
          {
            paramAnonymousView.lu(i.g((com.tencent.mm.plugin.sns.storage.m)localObject)).hd(((com.tencent.mm.plugin.sns.storage.m)localObject).field_type).bC(true).lu(((com.tencent.mm.plugin.sns.storage.m)localObject).bmi()).hd(SnsSightPlayerUI.b(SnsSightPlayerUI.this).qkw);
            paramAnonymousView.b(localIntent, "intent_key_StatisticsOplog");
            SnsSightPlayerUI.this.startActivity(localIntent);
            paramAnonymousView = new com.tencent.mm.plugin.sns.a.b.c(SnsSightPlayerUI.a(SnsSightPlayerUI.this).bmh(), 14, 5, "", 2, SnsSightPlayerUI.a(SnsSightPlayerUI.this).blE());
            com.tencent.mm.kernel.h.xz();
            com.tencent.mm.kernel.h.xx().fYr.a(paramAnonymousView, 0);
            if (SnsSightPlayerUI.e(SnsSightPlayerUI.this) == 0)
            {
              paramAnonymousView = new pd();
              paramAnonymousView.eUd.isStart = true;
              com.tencent.mm.sdk.b.a.vgX.m(paramAnonymousView);
            }
            GMTrace.o(8320962265088L, 61996);
            return;
            paramAnonymousView = SnsSightPlayerUI.b(SnsSightPlayerUI.this).uCY;
            break;
            paramAnonymousView = SnsSightPlayerUI.a(SnsSightPlayerUI.this).blB().pyc;
            break label263;
            paramAnonymousView = SnsSightPlayerUI.b(SnsSightPlayerUI.this).uCZ;
            break label374;
            paramAnonymousView = com.tencent.mm.modelsns.b.hb(747);
            break label457;
          }
        }
      });
      break;
      this.lhN.setVisibility(8);
      break label675;
      label1294:
      com.tencent.mm.plugin.sns.model.ae.biY().a(this.eUs, 6, null, an.vBh);
      this.qfp.setVisibility(0);
      this.qfp.cjf();
    }
  }
  
  public void onDestroy()
  {
    boolean bool = true;
    GMTrace.i(8375320444928L, 62401);
    super.onDestroy();
    Object localObject;
    int i;
    label51:
    int j;
    if (this.poX)
    {
      if (this.qfq == null)
      {
        localObject = "";
        String str = this.qfm.bhH();
        if (this.qfq != null) {
          break label361;
        }
        i = 0;
        com.tencent.mm.kernel.h.xz();
        com.tencent.mm.ad.n localn = com.tencent.mm.kernel.h.xx().fYr;
        if (this.scene != 0) {
          break label372;
        }
        j = 1;
        label72:
        localn.a(new com.tencent.mm.plugin.sns.a.b.d((String)localObject, j, 2, this.qfm.pnE, null, null, 2, str, -1, i), 0);
      }
    }
    else
    {
      w.d("MicroMsg.SnsSightPlayerUI", "on dismiss");
      if ((this.poX) && (this.qfq != null) && (this.qfq.uX(32))) {
        j.a(j.b.pok, j.a.pof, this.qfq);
      }
      com.tencent.mm.plugin.sns.model.ae.biY().b(this);
      localObject = com.tencent.mm.modelsns.b.q(getIntent());
      if (localObject != null)
      {
        if (!this.poX) {
          break label382;
        }
        if (bg.nm(this.eUs.uCV)) {
          break label377;
        }
        label193:
        ((com.tencent.mm.modelsns.b)localObject).bC(bool);
      }
    }
    for (;;)
    {
      ((com.tencent.mm.modelsns.b)localObject).update();
      ((com.tencent.mm.modelsns.b)localObject).LR();
      if (com.tencent.mm.p.a.pD() != null) {
        com.tencent.mm.p.a.pD().rh();
      }
      if (this.jGP != null)
      {
        this.jGP.a(null);
        this.jGP.stop();
        this.jGP.onDetach();
      }
      if (!this.oTz)
      {
        localObject = new rm();
        ((rm)localObject).eWo.type = 0;
        ((rm)localObject).eWo.eWp = this.oSE;
        ((rm)localObject).eWo.eWq = this.led;
        ((rm)localObject).eWo.eWr = this.eWr;
        com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject);
      }
      this.imE.bf(false);
      GMTrace.o(8375320444928L, 62401);
      return;
      localObject = this.qfq.bmh();
      break;
      label361:
      i = this.qfq.bml();
      break label51;
      label372:
      j = 2;
      break label72;
      label377:
      bool = false;
      break label193;
      label382:
      ((com.tencent.mm.modelsns.b)localObject).bC(false);
    }
  }
  
  public void onPause()
  {
    GMTrace.i(8375723098112L, 62404);
    super.onPause();
    int i = getResources().getConfiguration().orientation;
    w.i("MicroMsg.SnsSightPlayerUI", "onpause  " + i);
    vw(i);
    if (!this.qdw)
    {
      blb();
      w.v("check", "onclick");
      new com.tencent.mm.sdk.platformtools.ae().post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(8467930677248L, 63091);
          SnsSightPlayerUI.this.finish();
          GMTrace.o(8467930677248L, 63091);
        }
      });
      GMTrace.o(8375723098112L, 62404);
      return;
    }
    blb();
    GMTrace.o(8375723098112L, 62404);
  }
  
  protected void onResume()
  {
    GMTrace.i(8375588880384L, 62403);
    super.onResume();
    if (!this.isInit)
    {
      int i = getResources().getConfiguration().orientation;
      w.i("MicroMsg.SnsSightPlayerUI", "initOrientation " + i);
      if (getResources().getConfiguration().orientation == 2) {
        K(getResources().getConfiguration().orientation, true);
      }
      this.isInit = true;
    }
    if ((this.oTR == 0) || (this.oTQ == 0))
    {
      DisplayMetrics localDisplayMetrics = getResources().getDisplayMetrics();
      this.oTR = localDisplayMetrics.heightPixels;
      this.oTQ = localDisplayMetrics.widthPixels;
    }
    if ((this.qdw) && (FileOp.aZ(this.gKE)))
    {
      hv(false);
      this.qdw = false;
    }
    GMTrace.o(8375588880384L, 62403);
  }
  
  public void onStart()
  {
    GMTrace.i(8375454662656L, 62402);
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
          this.oTI.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener()
          {
            public final boolean onPreDraw()
            {
              GMTrace.i(8494774222848L, 63291);
              SnsSightPlayerUI.this.oTI.getViewTreeObserver().removeOnPreDrawListener(this);
              SnsSightPlayerUI.this.jFM.a(SnsSightPlayerUI.this.oTI, SnsSightPlayerUI.s(SnsSightPlayerUI.this), null);
              GMTrace.o(8494774222848L, 63291);
              return true;
            }
          });
        }
      }
    }
    super.onStart();
    GMTrace.o(8375454662656L, 62402);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\ui\SnsSightPlayerUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */