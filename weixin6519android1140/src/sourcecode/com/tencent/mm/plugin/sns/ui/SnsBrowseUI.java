package com.tencent.mm.plugin.sns.ui;

import android.content.Intent;
import android.graphics.BitmapFactory.Options;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.view.Window;
import android.widget.Button;
import android.widget.Gallery;
import android.widget.ImageView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.g.a.gj;
import com.tencent.mm.g.a.gj.b;
import com.tencent.mm.g.a.gk;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.sns.a.b.c;
import com.tencent.mm.plugin.sns.a.b.f;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.model.ai;
import com.tencent.mm.pluginsdk.l;
import com.tencent.mm.pluginsdk.model.v;
import com.tencent.mm.pluginsdk.model.v.a;
import com.tencent.mm.protocal.c.aq;
import com.tencent.mm.protocal.c.as;
import com.tencent.mm.protocal.c.biz;
import com.tencent.mm.protocal.c.oa;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.d;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.an;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.MMPageControlView;
import com.tencent.mm.ui.base.MultiTouchImageView;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.tools.MMGestureGallery;
import com.tencent.mm.ui.tools.MMGestureGallery.b;
import com.tencent.mm.ui.tools.g.a;
import com.tencent.mm.ui.tools.g.b;
import com.tencent.mm.y.q;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

@com.tencent.mm.ui.base.a(3)
public class SnsBrowseUI
  extends SnsBaseGalleryUI
  implements t.a
{
  private String eHy;
  private int eJw;
  Bundle jFK;
  private boolean jFL;
  com.tencent.mm.ui.tools.g jFM;
  private int jFN;
  private int jFO;
  private int jFP;
  private int jFQ;
  private int jsh;
  private int jsi;
  private ImageView lje;
  private com.tencent.mm.sdk.platformtools.ae mHandler;
  private int pYg;
  private boolean pYh;
  private boolean pYi;
  private boolean pYj;
  private v pYk;
  private int pYl;
  private int pYm;
  private int pYn;
  private float pYo;
  private int pYp;
  private int pYq;
  
  public SnsBrowseUI()
  {
    GMTrace.i(8760256888832L, 65269);
    this.pYg = 0;
    this.eJw = 0;
    this.pYh = false;
    this.pYi = false;
    this.pYj = false;
    this.jFL = false;
    this.jsh = 0;
    this.jsi = 0;
    this.jFN = 0;
    this.jFO = 0;
    this.jFP = 0;
    this.jFQ = 0;
    this.mHandler = new com.tencent.mm.sdk.platformtools.ae();
    this.pYn = 0;
    this.pYo = 1.0F;
    this.pYp = 0;
    this.pYq = 0;
    GMTrace.o(8760256888832L, 65269);
  }
  
  protected final void MP()
  {
    GMTrace.i(8761464848384L, 65278);
    this.jFM = new com.tencent.mm.ui.tools.g(this.vKB.vKW);
    this.jFL = false;
    final Object localObject1 = bg.aq(getIntent().getStringExtra("sns_gallery_userName"), "");
    this.eHy = bg.aq(getIntent().getStringExtra("sns_gallery_localId"), "");
    this.pYg = getIntent().getIntExtra("sns_gallery_position", 0);
    this.eJw = getIntent().getIntExtra("sns_position", 0);
    this.pYh = getIntent().getBooleanExtra("k_is_from_sns_main_timeline", false);
    this.pYi = getIntent().getBooleanExtra("k_is_from_sns_msg_ui", false);
    this.pYj = getIntent().getBooleanExtra("sns_soon_enter_photoedit_ui", false);
    com.tencent.mm.plugin.sns.storage.m localm = com.tencent.mm.plugin.sns.model.ae.bjd().Is(this.eHy);
    this.lje = ((ImageView)findViewById(i.f.bCu));
    this.lje.setLayerType(2, null);
    this.pYe = new SnsInfoFlip(this);
    this.pYe.setLayerType(2, null);
    this.pYe.pYh = this.pYh;
    this.pYe.pSi = true;
    final Object localObject2 = ai.Hx(this.eHy);
    this.pYe.qaY = true;
    this.pYe.qba = true;
    this.pYe.vn(localm.field_type);
    this.pYe.pYj = this.pYj;
    this.pYe.a((List)localObject2, (String)localObject1, this.pYg, this.pXZ, this);
    localObject1 = this.pYe;
    localObject2 = an.bTm();
    ((an)localObject2).time = localm.field_createTime;
    ((SnsInfoFlip)localObject1).ppi = ((an)localObject2);
    addView(this.pYe);
    if ((localm != null) && (localm.uX(32))) {
      this.pYe.poX = true;
    }
    this.pYf = ((Button)findViewById(i.f.paJ));
    localObject2 = localm.blD();
    if (localObject2 != null)
    {
      localObject1 = ((biz)localObject2).pwN;
      ay localay = new ay();
      ag.a(this, localay, ((biz)localObject2).pwN);
      if (!localay.qig) {
        break label479;
      }
      this.pYf.setVisibility(0);
      this.pYf.setText(localay.qih);
      this.pYf.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(15055470985216L, 112172);
          if (localObject1.tOK == null)
          {
            GMTrace.o(15055470985216L, 112172);
            return;
          }
          paramAnonymousView = com.tencent.mm.plugin.sns.c.a.hnI.bH(localObject1.tOK.lQa);
          int i = 0;
          if (localObject2.uUc.ueV == 1) {
            i = 2;
          }
          while (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.e.a(localObject2, SnsBrowseUI.this))
          {
            com.tencent.mm.plugin.sns.c.a.hnI.a(SnsBrowseUI.this, localObject1.tOK.lQa, paramAnonymousView, localObject2.jhi, i, 18, 9, localObject1.tOK.tOD, localObject2.mmR);
            GMTrace.o(15055470985216L, 112172);
            return;
            if (localObject2.uUc.ueV == 3) {
              i = 5;
            } else if (localObject2.uUc.ueV == 15) {
              i = 4;
            }
          }
          switch (localObject1.jib)
          {
          }
          for (;;)
          {
            GMTrace.o(15055470985216L, 112172);
            return;
            Object localObject = new Intent();
            ((Intent)localObject).putExtra("rawUrl", localObject1.lPM);
            com.tencent.mm.plugin.sns.c.a.hnH.j((Intent)localObject, SnsBrowseUI.this);
            com.tencent.mm.plugin.sns.c.a.hnI.a(SnsBrowseUI.this, localObject1.tOK.lQa, paramAnonymousView, localObject2.jhi, i, 18, 1, localObject1.tOK.tOD, localObject2.mmR);
            GMTrace.o(15055470985216L, 112172);
            return;
            if (localObject1.tOG == 1)
            {
              localObject = new gk();
              ((gk)localObject).eJy.actionCode = 2;
              ((gk)localObject).eJy.scene = 3;
              ((gk)localObject).eJy.appId = localObject1.tOK.lQa;
              ((gk)localObject).eJy.context = SnsBrowseUI.this;
              com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject);
              com.tencent.mm.plugin.sns.c.a.hnI.a(SnsBrowseUI.this, localObject1.tOK.lQa, paramAnonymousView, localObject2.jhi, i, 18, 6, localObject1.tOK.tOD, localObject2.mmR);
              GMTrace.o(15055470985216L, 112172);
              return;
              int j = ag.a(SnsBrowseUI.this, localObject1);
              if (j == 1)
              {
                localObject = new gk();
                ((gk)localObject).eJy.context = SnsBrowseUI.this;
                ((gk)localObject).eJy.actionCode = 2;
                ((gk)localObject).eJy.appId = localObject1.tOK.lQa;
                ((gk)localObject).eJy.messageAction = localObject1.tOK.tOF;
                ((gk)localObject).eJy.messageExt = localObject1.tOK.tOE;
                ((gk)localObject).eJy.scene = 3;
                com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject);
                com.tencent.mm.plugin.sns.c.a.hnI.a(SnsBrowseUI.this, localObject1.tOK.lQa, paramAnonymousView, localObject2.jhi, i, 18, 6, localObject1.tOK.tOD, localObject2.mmR);
                GMTrace.o(15055470985216L, 112172);
                return;
              }
              if (j == 2)
              {
                localObject = new gk();
                ((gk)localObject).eJy.context = SnsBrowseUI.this;
                ((gk)localObject).eJy.actionCode = 1;
                ((gk)localObject).eJy.appId = localObject1.tOK.lQa;
                ((gk)localObject).eJy.messageAction = localObject1.tOK.tOF;
                ((gk)localObject).eJy.messageExt = localObject1.tOK.tOE;
                ((gk)localObject).eJy.scene = 3;
                com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject);
                com.tencent.mm.plugin.sns.c.a.hnI.a(SnsBrowseUI.this, localObject1.tOK.lQa, paramAnonymousView, localObject2.jhi, i, 18, 3, localObject1.tOK.tOD, localObject2.mmR);
              }
            }
          }
        }
      });
    }
    for (;;)
    {
      if (com.tencent.mm.plugin.sns.lucky.a.m.h(localm)) {
        break label491;
      }
      w.e("MicroMsg.SnsPopMediasUI", "error see photo !! " + localm.field_userName + " " + localm.field_snsId);
      finish();
      GMTrace.o(8761464848384L, 65278);
      return;
      localObject1 = null;
      break;
      label479:
      this.pYf.setVisibility(8);
    }
    label491:
    if ((localm.field_type == 21) && (!localm.field_userName.equals(q.zE())))
    {
      this.pYk = new v(com.tencent.mm.compatible.util.e.ghx + "/Pictures/Screenshots/", new v.a()
      {
        public final void boy()
        {
          GMTrace.i(8543361040384L, 63653);
          com.tencent.mm.plugin.sns.lucky.a.b.nU(44);
          com.tencent.mm.plugin.sns.lucky.b.a.a(4, com.tencent.mm.plugin.sns.model.ae.bjd().Is(SnsBrowseUI.a(SnsBrowseUI.this)));
          GMTrace.o(8543361040384L, 63653);
        }
      });
      this.pYk.start();
    }
    GMTrace.o(8761464848384L, 65278);
  }
  
  protected final int Qf()
  {
    GMTrace.i(8762135937024L, 65283);
    GMTrace.o(8762135937024L, 65283);
    return 2;
  }
  
  public final void ahC()
  {
    GMTrace.i(8761196412928L, 65276);
    GMTrace.o(8761196412928L, 65276);
  }
  
  public final void alL()
  {
    GMTrace.i(8761599066112L, 65279);
    int n = this.jFP;
    int i = this.jFQ;
    int m = this.jFO;
    int k = this.jFN;
    if (!this.pYi)
    {
      localObject = new gj();
      ((gj)localObject).eJu.eJx = this.pYe.qaT.getSelectedItemPosition();
      ((gj)localObject).eJu.eJw = this.eJw;
      com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject);
      n = ((gj)localObject).eJv.eBT;
      i = ((gj)localObject).eJv.eBU;
      m = ((gj)localObject).eJv.eBR;
      k = ((gj)localObject).eJv.eBS;
    }
    this.pYl = this.pYe.getWidth();
    this.pYm = this.pYe.getHeight();
    com.tencent.mm.plugin.sns.model.ae.bja();
    Object localObject = com.tencent.mm.plugin.sns.model.g.B(this.pYe.bnu());
    int j = i;
    if (localObject != null)
    {
      localObject = d.RB((String)localObject);
      float f = this.pYl / ((BitmapFactory.Options)localObject).outWidth;
      this.pYm = ((int)(((BitmapFactory.Options)localObject).outHeight * f));
      j = i;
      if (this.pYm > this.pYe.getHeight())
      {
        j = i;
        if (this.pYm < this.pYe.getHeight() * 2.5D)
        {
          this.pYn = (this.pYm - this.pYe.getHeight());
          j = i;
          if (this.pYe.getCount() == 1)
          {
            j = i * this.pYe.getHeight() / this.pYm;
            this.pYn = 0;
          }
        }
        this.pYm = this.pYe.getHeight();
      }
    }
    this.jFM.eC(this.pYl, this.pYm);
    this.jFM.p(m, k, n, j);
    if (this.pYo != 1.0D)
    {
      this.jFM.xhm = (1.0F / this.pYo);
      if ((this.pYp != 0) || (this.pYq != 0))
      {
        i = (int)(this.pYe.getWidth() / 2 * (1.0F - this.pYo));
        j = this.pYp;
        k = (int)(this.pYe.getHeight() / 2 + this.pYq - this.pYm / 2 * this.pYo);
        this.jFM.eD(i + j, k);
      }
    }
    this.jFM.pNl = this.pYn;
    this.jFM.a(this.pYe, this.lje, new g.b()new g.a
    {
      public final void onAnimationEnd()
      {
        GMTrace.i(15056007856128L, 112176);
        SnsBrowseUI.e(SnsBrowseUI.this).post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(15055202549760L, 112170);
            SnsBrowseUI.this.finish();
            SnsBrowseUI.this.overridePendingTransition(0, 0);
            GMTrace.o(15055202549760L, 112170);
          }
        });
        GMTrace.o(15056007856128L, 112176);
      }
      
      public final void onAnimationStart()
      {
        GMTrace.i(15055873638400L, 112175);
        SnsInfoFlip localSnsInfoFlip = SnsBrowseUI.this.pYe;
        if (localSnsInfoFlip.qbg != null) {
          localSnsInfoFlip.qbg.setVisibility(8);
        }
        SnsBrowseUI.e(SnsBrowseUI.this).postDelayed(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(15054128807936L, 112162);
            Object localObject = SnsBrowseUI.this.pYe;
            if (((SnsInfoFlip)localObject).qaT != null)
            {
              localObject = ((SnsInfoFlip)localObject).qaT.getSelectedView();
              if ((localObject instanceof MultiTouchImageView)) {
                ((MultiTouchImageView)localObject).caC();
              }
            }
            GMTrace.o(15054128807936L, 112162);
          }
        }, 20L);
        GMTrace.o(15055873638400L, 112175);
      }
    }, new g.a()
    {
      public final void q(int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3, int paramAnonymousInt4)
      {
        GMTrace.i(15055739420672L, 112174);
        if ((SnsBrowseUI.this.pYe.qaT != null) && (Build.VERSION.SDK_INT >= 18)) {
          SnsBrowseUI.this.pYe.qaT.setClipBounds(new Rect(paramAnonymousInt1, paramAnonymousInt2, paramAnonymousInt3, paramAnonymousInt4));
        }
        GMTrace.o(15055739420672L, 112174);
      }
    });
    GMTrace.o(8761599066112L, 65279);
  }
  
  public final void bT(String paramString, int paramInt)
  {
    GMTrace.i(8761867501568L, 65281);
    w.i("MicroMsg.SnsPopMediasUI", "[notifyData] opType:%s reset:%s localId;%s", new Object[] { Integer.valueOf(paramInt), Boolean.valueOf(true), paramString });
    if (this.pYe != null) {
      this.pYe.awY();
    }
    GMTrace.o(8761867501568L, 65281);
  }
  
  public final void bU(String paramString, int paramInt)
  {
    GMTrace.i(8762270154752L, 65284);
    this.pYg = paramInt;
    GMTrace.o(8762270154752L, 65284);
  }
  
  public final void box()
  {
    GMTrace.i(8761733283840L, 65280);
    final Gallery localGallery = this.pYe.qaT;
    if ((localGallery instanceof MMGestureGallery)) {
      ((MMGestureGallery)localGallery).xhJ = new MMGestureGallery.b()
      {
        public final void C(float paramAnonymousFloat1, float paramAnonymousFloat2)
        {
          GMTrace.i(15054531461120L, 112165);
          if (((SnsBrowseUI.f(SnsBrowseUI.this) == 0) || (SnsBrowseUI.g(SnsBrowseUI.this) == 0)) && (SnsBrowseUI.this.pYe != null))
          {
            SnsBrowseUI.b(SnsBrowseUI.this, SnsBrowseUI.this.pYe.getHeight());
            SnsBrowseUI.a(SnsBrowseUI.this, SnsBrowseUI.this.pYe.getWidth());
          }
          if (SnsBrowseUI.f(SnsBrowseUI.this) != 0)
          {
            float f2 = 1.0F - paramAnonymousFloat2 / SnsBrowseUI.f(SnsBrowseUI.this);
            float f1 = f2;
            if (f2 > 1.0F) {
              f1 = 1.0F;
            }
            SnsBrowseUI.a(SnsBrowseUI.this, f1);
            View localView = ((MMGestureGallery)localGallery).getSelectedView();
            if ((localView instanceof MultiTouchImageView))
            {
              localView.setPivotX(SnsBrowseUI.g(SnsBrowseUI.this) / 2);
              localView.setPivotY(SnsBrowseUI.f(SnsBrowseUI.this) / 2);
              localView.setScaleX(f1);
              localView.setScaleY(f1);
              localView.setTranslationX(paramAnonymousFloat1);
              localView.setTranslationY(paramAnonymousFloat2);
              SnsBrowseUI.d(SnsBrowseUI.this).setAlpha(f1);
            }
          }
          GMTrace.o(15054531461120L, 112165);
        }
        
        public final void D(float paramAnonymousFloat1, float paramAnonymousFloat2)
        {
          GMTrace.i(15054665678848L, 112166);
          SnsBrowseUI.e(SnsBrowseUI.this, (int)paramAnonymousFloat1);
          SnsBrowseUI.f(SnsBrowseUI.this, (int)paramAnonymousFloat2);
          GMTrace.o(15054665678848L, 112166);
        }
      };
    }
    GMTrace.o(8761733283840L, 65280);
  }
  
  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    GMTrace.i(8761330630656L, 65277);
    if ((paramKeyEvent.getKeyCode() == 4) && (paramKeyEvent.getAction() == 0))
    {
      w.d("MicroMsg.SnsPopMediasUI", "dispatchKeyEvent");
      setResult(-1, new Intent());
      alL();
      GMTrace.o(8761330630656L, 65277);
      return true;
    }
    boolean bool = super.dispatchKeyEvent(paramKeyEvent);
    GMTrace.o(8761330630656L, 65277);
    return bool;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(8760927977472L, 65274);
    int i = i.g.pfx;
    GMTrace.o(8760927977472L, 65274);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(8762001719296L, 65282);
    w.i("MicroMsg.SnsPopMediasUI", "onAcvityResult requestCode:" + paramInt1);
    if (paramInt2 != -1)
    {
      GMTrace.o(8762001719296L, 65282);
      return;
    }
    GMTrace.o(8762001719296L, 65282);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(8760391106560L, 65270);
    super.onCreate(paramBundle);
    this.vKB.bXF();
    if (getIntent().getExtras() != null) {
      getIntent().getExtras().setClassLoader(getClass().getClassLoader());
    }
    if (Build.VERSION.SDK_INT >= 21) {
      getWindow().setFlags(1024, 1024);
    }
    MP();
    this.jFK = paramBundle;
    GMTrace.o(8760391106560L, 65270);
  }
  
  public void onDestroy()
  {
    GMTrace.i(8760525324288L, 65271);
    int j;
    SnsInfoFlip localSnsInfoFlip;
    if (this.pYe != null)
    {
      j = getIntent().getIntExtra("K_ad_scene", -1);
      localSnsInfoFlip = this.pYe;
      localObject1 = this.eHy;
      if (localSnsInfoFlip.poX)
      {
        if (j >= 0) {
          break label199;
        }
        w.i("MicroMsg.SnsInfoFlip", "pass by scene " + j);
      }
    }
    int i;
    label199:
    com.tencent.mm.plugin.sns.storage.m localm;
    do
    {
      localObject1 = com.tencent.mm.modelsns.b.q(getIntent());
      if (localObject1 != null)
      {
        this.pYe.qbv.size();
        i = this.pYe.boY();
        ((com.tencent.mm.modelsns.b)localObject1).hd(this.pYe.getCount()).hd(i);
        ((com.tencent.mm.modelsns.b)localObject1).update();
        ((com.tencent.mm.modelsns.b)localObject1).LR();
      }
      this.pYe.boW();
      this.pYe.onDestroy();
      com.tencent.mm.plugin.sns.model.ae.bja().K(this);
      if (this.pYh) {
        this.pYe.bpa();
      }
      if (this.pYk != null) {
        this.pYk.stop();
      }
      super.onDestroy();
      GMTrace.o(8760525324288L, 65271);
      return;
      localm = com.tencent.mm.plugin.sns.model.ae.bjd().Is((String)localObject1);
    } while (localm == null);
    long l1;
    long l2;
    if (localSnsInfoFlip.qbu >= 0)
    {
      if (!localSnsInfoFlip.qaW.containsKey(Integer.valueOf(localSnsInfoFlip.qbu))) {
        break label613;
      }
      l1 = ((Long)localSnsInfoFlip.qaW.get(Integer.valueOf(localSnsInfoFlip.qbu))).longValue();
      if (l1 > 0L)
      {
        if (!localSnsInfoFlip.qaX.containsKey(Integer.valueOf(localSnsInfoFlip.qbu))) {
          break label619;
        }
        l2 = ((Long)localSnsInfoFlip.qaX.get(Integer.valueOf(localSnsInfoFlip.qbu))).longValue();
        label315:
        l1 = bg.aI(l1);
        l2 += l1;
        localSnsInfoFlip.qaX.put(Integer.valueOf(localSnsInfoFlip.qbu), Long.valueOf(l2));
        w.i("MicroMsg.SnsInfoFlip", "lastSelectPosition " + localSnsInfoFlip.qbu + " curtime " + l2 + " passtime " + l1);
      }
    }
    Object localObject2 = localm.bmj();
    StringBuffer localStringBuffer = new StringBuffer();
    Object localObject1 = new StringBuffer();
    localStringBuffer.append("<desc>");
    Iterator localIterator = localSnsInfoFlip.qaV.keySet().iterator();
    label449:
    if (localIterator.hasNext())
    {
      Integer localInteger = (Integer)localIterator.next();
      int k = ((Integer)localSnsInfoFlip.qaV.get(localInteger)).intValue();
      if (localSnsInfoFlip.qaX.containsKey(localInteger)) {}
      for (i = (int)(((Long)localSnsInfoFlip.qaX.get(localInteger)).longValue() * 1L);; i = 0)
      {
        localStringBuffer.append(String.format("<item><id>%d</id><duration>%d</duration><count>%d</count></item>", new Object[] { localInteger, Integer.valueOf(i), Integer.valueOf(k) }));
        ((StringBuffer)localObject1).append(String.format("%d|%d|%d", new Object[] { localInteger, Integer.valueOf(i), Integer.valueOf(k) }) + "&");
        break label449;
        label613:
        l1 = 0L;
        break;
        label619:
        l2 = 0L;
        break label315;
      }
    }
    localStringBuffer.append("</desc>");
    localObject1 = ((StringBuffer)localObject1).toString();
    if (((String)localObject1).endsWith("&")) {
      localObject1 = ((String)localObject1).substring(0, ((String)localObject1).length() - 1);
    }
    for (;;)
    {
      if ((localm == null) || (!localm.bkj())) {
        com.tencent.mm.plugin.sns.model.ae.biX().i(12014, new Object[] { f.a(localm.field_snsId, new Object[] { com.tencent.mm.plugin.sns.data.i.dt(localm.field_snsId), localm.bmi(), Integer.valueOf(j), Long.valueOf(localSnsInfoFlip.qbm), Long.valueOf(System.currentTimeMillis()), localObject1, Integer.valueOf(localSnsInfoFlip.getCount()) }) });
      }
      if (((com.tencent.mm.plugin.sns.storage.e)localObject2).blz().pDs != 1)
      {
        localObject2 = new c(localm.bmh(), 6, j, localStringBuffer.toString(), localm.bmm(), localm.blE());
        h.xz();
        h.xx().fYr.a((k)localObject2, 0);
      }
      localObject2 = com.tencent.mm.modelsns.b.ha(729);
      ((com.tencent.mm.modelsns.b)localObject2).lu(com.tencent.mm.plugin.sns.data.i.dt(localm.field_snsId)).lu(localm.bmi()).hd(j).lu(localSnsInfoFlip.qbm).lu(System.currentTimeMillis()).lu((String)localObject1).hd(localSnsInfoFlip.getCount());
      ((com.tencent.mm.modelsns.b)localObject2).LR();
      break;
    }
  }
  
  protected void onPause()
  {
    GMTrace.i(8760659542016L, 65272);
    if (this.pYe != null) {
      this.pYe.onPause();
    }
    super.onPause();
    GMTrace.o(8760659542016L, 65272);
  }
  
  public void onResume()
  {
    GMTrace.i(8760793759744L, 65273);
    super.onResume();
    if (this.pYe != null) {
      this.pYe.awY();
    }
    GMTrace.o(8760793759744L, 65273);
  }
  
  public void onStart()
  {
    GMTrace.i(8761062195200L, 65275);
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
          this.pYe.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener()
          {
            public final boolean onPreDraw()
            {
              GMTrace.i(15054263025664L, 112163);
              SnsBrowseUI.this.pYe.getViewTreeObserver().removeOnPreDrawListener(this);
              SnsBrowseUI.a(SnsBrowseUI.this, SnsBrowseUI.this.pYe.getWidth());
              SnsBrowseUI.b(SnsBrowseUI.this, SnsBrowseUI.this.pYe.getHeight());
              SnsBrowseUI.c(SnsBrowseUI.this, SnsBrowseUI.this.pYe.getWidth());
              SnsBrowseUI.d(SnsBrowseUI.this, SnsBrowseUI.this.pYe.getHeight());
              com.tencent.mm.plugin.sns.model.ae.bja();
              Object localObject = com.tencent.mm.plugin.sns.model.g.B(SnsBrowseUI.this.pYe.bnu());
              if (localObject != null)
              {
                localObject = d.RB((String)localObject);
                SnsBrowseUI localSnsBrowseUI = SnsBrowseUI.this;
                float f = SnsBrowseUI.b(SnsBrowseUI.this) / ((BitmapFactory.Options)localObject).outWidth;
                SnsBrowseUI.d(localSnsBrowseUI, (int)(((BitmapFactory.Options)localObject).outHeight * f));
                if (SnsBrowseUI.c(SnsBrowseUI.this) > SnsBrowseUI.this.pYe.getHeight()) {
                  SnsBrowseUI.d(SnsBrowseUI.this, SnsBrowseUI.this.pYe.getHeight());
                }
              }
              SnsBrowseUI.this.jFM.eC(SnsBrowseUI.b(SnsBrowseUI.this), SnsBrowseUI.c(SnsBrowseUI.this));
              SnsBrowseUI.this.jFM.a(SnsBrowseUI.this.pYe, SnsBrowseUI.d(SnsBrowseUI.this), null);
              SnsBrowseUI.this.box();
              GMTrace.o(15054263025664L, 112163);
              return true;
            }
          });
        }
      }
    }
    super.onStart();
    w.d("MicroMsg.SnsPopMediasUI", "onStart ");
    GMTrace.o(8761062195200L, 65275);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\ui\SnsBrowseUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */