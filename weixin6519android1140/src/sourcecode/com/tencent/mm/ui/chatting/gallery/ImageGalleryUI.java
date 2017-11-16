package com.tencent.mm.ui.chatting.gallery;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Looper;
import android.support.v4.view.ViewPager.e;
import android.view.Display;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.a;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.g.a.ak;
import com.tencent.mm.g.a.al;
import com.tencent.mm.g.a.ar;
import com.tencent.mm.g.a.ar.b;
import com.tencent.mm.g.a.bz;
import com.tencent.mm.g.a.dh;
import com.tencent.mm.g.a.dh.b;
import com.tencent.mm.g.a.gj;
import com.tencent.mm.g.a.gj.b;
import com.tencent.mm.g.a.kb;
import com.tencent.mm.g.a.mk;
import com.tencent.mm.g.a.mm;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.modelvideo.r;
import com.tencent.mm.modelvideo.t;
import com.tencent.mm.pluginsdk.ui.tools.VideoPlayerSeekBar;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.au;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.ad;
import com.tencent.mm.ui.base.MMViewPager;
import com.tencent.mm.ui.base.MMViewPager.b;
import com.tencent.mm.ui.base.MMViewPager.c;
import com.tencent.mm.ui.base.MMViewPager.e;
import com.tencent.mm.ui.base.MultiTouchImageView;
import com.tencent.mm.ui.base.p.c;
import com.tencent.mm.ui.base.p.d;
import com.tencent.mm.ui.mogic.WxViewPager;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.tools.g.b;
import com.tencent.mm.ui.widget.f.a;
import com.tencent.mm.y.at;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import junit.framework.Assert;

@com.tencent.mm.ui.base.a(3)
public class ImageGalleryUI
  extends MMActivity
  implements View.OnClickListener, aj.a
{
  protected String chatroomName;
  public long eDr;
  protected String eDs;
  private int iom;
  private int ion;
  Bundle jFK;
  private boolean jFL;
  com.tencent.mm.ui.tools.g jFM;
  int jFN;
  int jFO;
  int jFP;
  int jFQ;
  public long juT;
  private p.d krF;
  protected MMViewPager lEk;
  private com.tencent.mm.sdk.b.c leg;
  private ImageView lje;
  private ae mHandler;
  private boolean mWy;
  private com.tencent.mm.ui.widget.f pSj;
  private String pSk;
  private String pSn;
  private boolean pSo;
  private com.tencent.mm.sdk.b.c pSq;
  int pYl;
  int pYm;
  int pYn;
  private float pYo;
  private int pYp;
  private int pYq;
  public boolean txk;
  protected boolean wIL;
  private HashSet<Long> wJv;
  private final boolean wKB;
  public b wKr;
  int wMA;
  int wMB;
  boolean wMC;
  ArrayList<Integer> wMD;
  protected boolean wME;
  protected boolean wMF;
  private boolean wMG;
  private String wMH;
  public a wMI;
  private View wMJ;
  private CheckBox wMK;
  private View wML;
  private boolean wMM;
  private int wMN;
  private ViewPager.e wMO;
  boolean wMP;
  aj wMQ;
  private HashMap<Long, String> wMR;
  private boolean wMS;
  private boolean wMT;
  private aj wMU;
  private boolean wMV;
  private boolean wMW;
  private b.b wMk;
  private RelativeLayout wMl;
  private RelativeLayout wMm;
  private boolean wMn;
  private boolean wMo;
  private ImageView wMp;
  private RelativeLayout wMq;
  private RelativeLayout wMr;
  private FrameLayout wMs;
  View wMt;
  Button wMu;
  Button wMv;
  View wMw;
  private View wMx;
  protected VideoPlayerSeekBar wMy;
  private MultiTouchImageView wMz;
  private boolean wuY;
  
  public ImageGalleryUI()
  {
    GMTrace.i(2446923399168L, 18231);
    this.wMo = false;
    this.pYn = 0;
    this.wMA = 0;
    this.wMB = 0;
    this.jFN = 0;
    this.jFO = 0;
    this.jFP = 0;
    this.jFQ = 0;
    this.wMD = new ArrayList();
    this.wuY = false;
    this.txk = false;
    this.pSo = false;
    this.wME = false;
    this.wIL = false;
    this.wMF = false;
    this.jFL = false;
    this.wKB = false;
    this.wMH = null;
    this.leg = new com.tencent.mm.sdk.b.c() {};
    this.pSq = new com.tencent.mm.sdk.b.c() {};
    this.wMM = true;
    this.pYo = 1.0F;
    this.pYp = 0;
    this.pYq = 0;
    this.krF = new p.d()
    {
      public final void c(MenuItem paramAnonymousMenuItem, int paramAnonymousInt)
      {
        GMTrace.i(2483162185728L, 18501);
        switch (paramAnonymousMenuItem.getItemId())
        {
        }
        for (;;)
        {
          GMTrace.o(2483162185728L, 18501);
          return;
          paramAnonymousMenuItem = ImageGalleryUI.f(ImageGalleryUI.this).cfg();
          r localr;
          if ((paramAnonymousMenuItem != null) && (paramAnonymousMenuItem.bTG()))
          {
            localr = t.mw(paramAnonymousMenuItem.field_imgPath);
            if ((localr.status != 199) && (localr.status != 199))
            {
              ImageGalleryUI.b(ImageGalleryUI.this, t.d(paramAnonymousMenuItem.field_msgId, 1));
              ImageGalleryUI.f(ImageGalleryUI.this).Dj(ImageGalleryUI.this.lEk.xI);
              GMTrace.o(2483162185728L, 18501);
              return;
            }
            ImageGalleryUI.f(ImageGalleryUI.this).De(ImageGalleryUI.this.lEk.xI);
            GMTrace.o(2483162185728L, 18501);
            return;
          }
          ImageGalleryUI.f(ImageGalleryUI.this).De(ImageGalleryUI.this.lEk.xI);
          GMTrace.o(2483162185728L, 18501);
          return;
          paramAnonymousMenuItem = ImageGalleryUI.f(ImageGalleryUI.this).cfg();
          if ((paramAnonymousMenuItem != null) && (paramAnonymousMenuItem.bTG()))
          {
            localr = t.mw(paramAnonymousMenuItem.field_imgPath);
            if ((localr.status != 199) && (localr.status != 199))
            {
              ImageGalleryUI.b(ImageGalleryUI.this, t.d(paramAnonymousMenuItem.field_msgId, 2));
              ImageGalleryUI.f(ImageGalleryUI.this).Dj(ImageGalleryUI.this.lEk.xI);
              GMTrace.o(2483162185728L, 18501);
              return;
            }
            paramAnonymousMenuItem = new ArrayList();
            paramAnonymousMenuItem.add(ImageGalleryUI.f(ImageGalleryUI.this).cfg());
            b.c(ImageGalleryUI.this.vKB.vKW, paramAnonymousMenuItem);
            GMTrace.o(2483162185728L, 18501);
            return;
          }
          paramAnonymousMenuItem = new ArrayList();
          paramAnonymousMenuItem.add(ImageGalleryUI.f(ImageGalleryUI.this).cfg());
          com.tencent.mm.modelstat.b.gWv.x((au)paramAnonymousMenuItem.get(0));
          b.c(ImageGalleryUI.this.vKB.vKW, paramAnonymousMenuItem);
          GMTrace.o(2483162185728L, 18501);
          return;
          ImageGalleryUI.f(ImageGalleryUI.this).Df(ImageGalleryUI.this.lEk.xI);
          GMTrace.o(2483162185728L, 18501);
          return;
          if (com.tencent.mm.bj.d.LL("favorite"))
          {
            ImageGalleryUI.f(ImageGalleryUI.this).Dg(ImageGalleryUI.this.lEk.xI);
            GMTrace.o(2483162185728L, 18501);
            return;
            w.i("MicroMsg.ImageGalleryUI", "request deal QBAR string");
            paramAnonymousMenuItem = new bz();
            paramAnonymousMenuItem.eDf.activity = ImageGalleryUI.this;
            paramAnonymousMenuItem.eDf.eBB = ImageGalleryUI.c(ImageGalleryUI.this);
            paramAnonymousMenuItem.eDf.eDg = ImageGalleryUI.v(ImageGalleryUI.this);
            paramAnonymousMenuItem.eDf.eDh = ImageGalleryUI.w(ImageGalleryUI.this);
            paramAnonymousMenuItem.eDf.scene = 37;
            paramAnonymousMenuItem.eDf.eDm = ImageGalleryUI.this.getIntent().getBundleExtra("_stat_obj");
            ImageGalleryUI.a(ImageGalleryUI.this, paramAnonymousMenuItem);
            ImageGalleryUI.b(ImageGalleryUI.this, paramAnonymousMenuItem);
            com.tencent.mm.sdk.b.a.vgX.m(paramAnonymousMenuItem);
            GMTrace.o(2483162185728L, 18501);
            return;
            ImageGalleryUI.x(ImageGalleryUI.this);
            GMTrace.o(2483162185728L, 18501);
            return;
            if (b.aX(ImageGalleryUI.f(ImageGalleryUI.this).cfg())) {
              ImageGalleryUI.y(ImageGalleryUI.this);
            }
          }
        }
      }
    };
    this.wMN = 0;
    this.wMO = new ViewPager.e()
    {
      private boolean wMY;
      
      public final void V(int paramAnonymousInt)
      {
        GMTrace.i(2440212512768L, 18181);
        if (ImageGalleryUI.f(ImageGalleryUI.this) == null)
        {
          GMTrace.o(2440212512768L, 18181);
          return;
        }
        Object localObject1 = ImageGalleryUI.f(ImageGalleryUI.this).Cd(paramAnonymousInt);
        if (localObject1 == null) {
          w.e("MicroMsg.ImageGalleryUI", "onPageSelected the view is null, position = %s ", new Object[] { Integer.valueOf(paramAnonymousInt) });
        }
        ImageGalleryUI.q(ImageGalleryUI.this);
        ImageGalleryUI.e(ImageGalleryUI.this, paramAnonymousInt);
        Object localObject2;
        long l;
        if (ImageGalleryUI.f(ImageGalleryUI.this) != null)
        {
          localObject2 = ImageGalleryUI.f(ImageGalleryUI.this);
          ((b)localObject2).wKy.cfo();
          ((b)localObject2).wKz.cfo();
          localObject2 = ImageGalleryUI.f(ImageGalleryUI.this).Dd(paramAnonymousInt);
          if (((b.aX((au)localObject2)) || (b.ba((au)localObject2))) && (localObject1 != null) && (((View)localObject1).getTag() != null)) {
            ((j)((View)localObject1).getTag()).wNU.caC();
          }
          if (localObject2 != null) {
            ImageGalleryUI.this.fj(((ce)localObject2).field_msgId);
          }
          if (ImageGalleryUI.f(ImageGalleryUI.this) == null) {
            break label424;
          }
          localObject1 = ImageGalleryUI.f(ImageGalleryUI.this).f((au)localObject2, false);
          ImageGalleryUI.f(ImageGalleryUI.this);
          if (!b.a((au)localObject2, (com.tencent.mm.ao.d)localObject1)) {
            break label348;
          }
          localObject1 = com.tencent.mm.ao.e.a((com.tencent.mm.ao.d)localObject1);
          int i = ((com.tencent.mm.ao.d)localObject1).gsL;
          int j = ((com.tencent.mm.ao.d)localObject1).offset;
          if (i == 0) {
            break label342;
          }
          l = j * 100L / i - 1L;
          i = Math.max(1, (int)l);
          w.d("MicroMsg.ImageGalleryUI", "jacks loading hd from imgInfo : %d, time: %d", new Object[] { Integer.valueOf(i), Long.valueOf(System.currentTimeMillis()) });
          ImageGalleryUI.this.Dx(i);
        }
        for (;;)
        {
          if (ImageGalleryUI.f(ImageGalleryUI.this) != null) {
            ImageGalleryUI.f(ImageGalleryUI.this).V(paramAnonymousInt);
          }
          GMTrace.o(2440212512768L, 18181);
          return;
          label342:
          l = 0L;
          break;
          label348:
          if ((localObject2 != null) && (!((au)localObject2).bTG()) && (ImageGalleryUI.f(ImageGalleryUI.this).bc((au)localObject2)))
          {
            ImageGalleryUI.this.eO(false);
          }
          else
          {
            ImageGalleryUI.this.eO(true);
            for (;;)
            {
              if (localObject2 != null) {
                break label434;
              }
              w.e("MicroMsg.ImageGalleryUI", "update footer fail, msg is null, position = " + paramAnonymousInt);
              break;
              label424:
              w.e("MicroMsg.ImageGalleryUI", "[arthurdan.ImageGallery] Notice!!! adapter is null");
            }
            label434:
            ImageGalleryUI.this.bq((au)localObject2);
            ImageGalleryUI.g(ImageGalleryUI.this);
          }
        }
      }
      
      public final void W(int paramAnonymousInt)
      {
        GMTrace.i(2440346730496L, 18182);
        w.d("MicroMsg.ImageGalleryUI", "onPageScrollStateChanged: %d", new Object[] { Integer.valueOf(paramAnonymousInt) });
        if (paramAnonymousInt == 2)
        {
          this.wMY = true;
          ImageGalleryUI.z(ImageGalleryUI.this);
          ImageGalleryUI.A(ImageGalleryUI.this);
          ImageGalleryUI.B(ImageGalleryUI.this);
        }
        if (paramAnonymousInt == 0)
        {
          if (this.wMY) {
            ImageGalleryUI.this.cfJ();
          }
          this.wMY = false;
        }
        if (ImageGalleryUI.f(ImageGalleryUI.this) != null)
        {
          Object localObject = ImageGalleryUI.f(ImageGalleryUI.this);
          if (((b)localObject).wKx != null)
          {
            localObject = ((b)localObject).wKx;
            ((d)localObject).xl = paramAnonymousInt;
            if (((d)localObject).wLL != null) {
              ((d)localObject).wLL.W(paramAnonymousInt);
            }
          }
        }
        GMTrace.o(2440346730496L, 18182);
      }
      
      public final void a(int paramAnonymousInt1, float paramAnonymousFloat, int paramAnonymousInt2)
      {
        GMTrace.i(2440078295040L, 18180);
        GMTrace.o(2440078295040L, 18180);
      }
    };
    this.wMP = false;
    this.wMQ = new aj(new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(2473095856128L, 18426);
        if (ImageGalleryUI.C(ImageGalleryUI.this)) {
          ImageGalleryUI.this.cfA();
        }
        GMTrace.o(2473095856128L, 18426);
        return false;
      }
    }, false);
    this.wMR = new HashMap();
    this.wMS = false;
    this.wMT = false;
    this.mHandler = new ae(Looper.getMainLooper());
    this.wMV = false;
    this.wMW = false;
    this.wJv = new HashSet();
    GMTrace.o(2446923399168L, 18231);
  }
  
  private void Du(int paramInt)
  {
    GMTrace.i(2451486801920L, 18265);
    w.i("MicroMsg.ImageGalleryUI", "enterGrid source : " + paramInt);
    if (this.wKr == null)
    {
      w.w("MicroMsg.ImageGalleryUI", "try to enterGrid, but adapter is NULL");
      GMTrace.o(2451486801920L, 18265);
      return;
    }
    com.tencent.mm.plugin.report.service.g.ork.a(219L, 13L, 1L, true);
    int i = this.wKr.asx();
    if (this.wKr.cfg() == null)
    {
      w.e("MicroMsg.ImageGalleryUI", "msgInfo is null");
      GMTrace.o(2451486801920L, 18265);
      return;
    }
    int j = this.wKr.wKt.Dn(this.lEk.xI);
    if (!this.wME)
    {
      Intent localIntent = new Intent();
      localIntent.setClass(this.vKB.vKW, MediaHistoryGalleryUI.class);
      localIntent.addFlags(67108864);
      localIntent.putExtra("kintent_intent_source", paramInt);
      localIntent.putExtra("kintent_talker", cft());
      localIntent.putExtra("kintent_image_count", i);
      localIntent.putExtra("kintent_image_index", j);
      localIntent.putExtra("key_biz_chat_id", this.juT);
      localIntent.putExtra("key_is_biz_chat", this.txk);
      startActivity(localIntent);
      com.tencent.mm.ui.base.b.fl(this.vKB.vKW);
      this.mHandler.postDelayed(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(2445849657344L, 18223);
          ImageGalleryUI.this.finish();
          GMTrace.o(2445849657344L, 18223);
        }
      }, 50L);
      GMTrace.o(2451486801920L, 18265);
      return;
    }
    alL();
    GMTrace.o(2451486801920L, 18265);
  }
  
  static Animation Dw(int paramInt)
  {
    GMTrace.i(2453097414656L, 18277);
    AlphaAnimation localAlphaAnimation = new AlphaAnimation(1.0F, 0.0F);
    localAlphaAnimation.setDuration(paramInt);
    localAlphaAnimation.setFillAfter(true);
    localAlphaAnimation.setInterpolator(new AccelerateInterpolator(10.0F));
    GMTrace.o(2453097414656L, 18277);
    return localAlphaAnimation;
  }
  
  private static void L(View paramView, int paramInt)
  {
    GMTrace.i(2447728705536L, 18237);
    if (paramView != null) {
      paramView.setVisibility(paramInt);
    }
    GMTrace.o(2447728705536L, 18237);
  }
  
  private View a(b paramb, MMViewPager paramMMViewPager)
  {
    GMTrace.i(2449070882816L, 18247);
    boolean bool1;
    if (paramb == null)
    {
      bool1 = true;
      if (paramMMViewPager != null) {
        break label81;
      }
    }
    label81:
    for (boolean bool2 = true;; bool2 = false)
    {
      w.d("MicroMsg.ImageGalleryUI", "get current view adapter is null %b, gallery is null %b", new Object[] { Boolean.valueOf(bool1), Boolean.valueOf(bool2) });
      if ((paramb == null) || (paramMMViewPager == null)) {
        break label159;
      }
      if (paramb.cfg() != null) {
        break label87;
      }
      GMTrace.o(2449070882816L, 18247);
      return null;
      bool1 = false;
      break;
    }
    label87:
    if ((paramb.cfg().bTC()) || (paramb.cfg().bTK())) {
      paramb = paramb.os(paramMMViewPager.xI);
    }
    for (;;)
    {
      GMTrace.o(2449070882816L, 18247);
      return paramb;
      if ((paramb.cfg().bTG()) || (paramb.cfg().bTH()))
      {
        paramb = paramb.Dh(paramMMViewPager.xI);
        continue;
        label159:
        w.w("MicroMsg.ImageGalleryUI", "%d get current view but adapter or gallery is null", new Object[] { Integer.valueOf(hashCode()) });
      }
      else
      {
        paramb = null;
      }
    }
  }
  
  private void alL()
  {
    GMTrace.i(2449205100544L, 18248);
    if ((this.wMo) || (this.wKr == null))
    {
      w.i("MicroMsg.ImageGalleryUI", "isRunningExitAnimation");
      GMTrace.o(2449205100544L, 18248);
      return;
    }
    if (this.wMn)
    {
      finish();
      com.tencent.mm.ui.base.b.fl(this.vKB.vKW);
      GMTrace.o(2449205100544L, 18248);
      return;
    }
    w.i("MicroMsg.ImageGalleryUI", "runExitAnimation");
    int n = 0;
    int m = 0;
    int i2 = this.lEk.getWidth() / 2;
    int i1 = this.lEk.getHeight() / 2;
    this.wKr.cfe();
    Object localObject1;
    int i3;
    int i;
    int k;
    int j;
    label428:
    Object localObject2;
    if (this.wME)
    {
      localObject1 = new gj();
      ((gj)localObject1).eJu.eDr = this.wKr.Dd(this.lEk.xI).field_msgId;
      com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject1);
      i3 = ((gj)localObject1).eJv.eBT;
      i = ((gj)localObject1).eJv.eBU;
      k = ((gj)localObject1).eJv.eBR;
      j = ((gj)localObject1).eJv.eBS;
      this.pYl = this.lEk.getWidth();
      this.pYm = this.lEk.getHeight();
      if (this.wKr.cfg() != null)
      {
        if ((this.wKr.cfg().bTH()) || (this.wKr.cfg().bTG())) {
          this.pYm = ((int)(this.pYl / i3 * i));
        }
        if ((this.wKr.cfg().bTC()) || (this.wKr.cfg().bTK())) {
          this.wMz = this.wKr.os(this.lEk.xI);
        }
      }
      m = i;
      if (this.wMz != null)
      {
        this.pYm = ((int)(this.pYl / this.wMz.imageWidth * this.wMz.imageHeight));
        m = i;
        if (this.pYm > this.lEk.getHeight())
        {
          m = i;
          if (this.pYm < this.lEk.getHeight() * 1.5D)
          {
            if (!this.wME) {
              break label914;
            }
            this.pYn = (this.pYm - this.lEk.getHeight());
            m = i;
          }
          this.pYm = this.lEk.getHeight();
        }
      }
      localObject1 = this.jFM;
      i = this.wMA;
      n = this.wMB;
      ((com.tencent.mm.ui.tools.g)localObject1).pNm = i;
      ((com.tencent.mm.ui.tools.g)localObject1).pNn = n;
      ((com.tencent.mm.ui.tools.g)localObject1).pNo = 0;
      ((com.tencent.mm.ui.tools.g)localObject1).pNp = 0;
      this.jFM.pNl = this.pYn;
      this.jFM.eC(this.pYl, this.pYm);
      this.jFM.p(k, j, i3, m);
      localObject1 = this.lEk;
      localObject2 = a(this.wKr, this.lEk);
      if (localObject2 == null) {
        break label933;
      }
      localObject1 = localObject2;
      if (this.pYo != 1.0D)
      {
        this.jFM.xhm = (1.0F / this.pYo);
        if (this.pYp == 0)
        {
          localObject1 = localObject2;
          if (this.pYq == 0) {}
        }
        else
        {
          i = (int)(this.lEk.getWidth() / 2 * (1.0F - this.pYo));
          j = this.pYp;
          k = (int)(this.lEk.getHeight() / 2 + this.pYq - this.pYm / 2 * this.pYo);
          this.jFM.eD(i + j, k);
          localObject1 = localObject2;
        }
      }
    }
    label914:
    label933:
    for (;;)
    {
      this.jFM.a((View)localObject1, this.lje, new g.b()
      {
        public final void onAnimationEnd()
        {
          GMTrace.i(2465579663360L, 18370);
          w.i("MicroMsg.ImageGalleryUI", "runExitAnimation onAnimationEnd");
          ImageGalleryUI.p(ImageGalleryUI.this).post(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(2435380674560L, 18145);
              ImageGalleryUI.this.finish();
              ImageGalleryUI.this.overridePendingTransition(0, 0);
              GMTrace.o(2435380674560L, 18145);
            }
          });
          ImageGalleryUI.a(ImageGalleryUI.this, false);
          GMTrace.o(2465579663360L, 18370);
        }
        
        public final void onAnimationStart()
        {
          GMTrace.i(2465445445632L, 18369);
          ImageGalleryUI.a(ImageGalleryUI.this, true);
          ImageGalleryUI.dC(ImageGalleryUI.s(ImageGalleryUI.this));
          ImageGalleryUI.dC(ImageGalleryUI.t(ImageGalleryUI.this));
          new ae().postDelayed(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(2413905838080L, 17985);
              if (ImageGalleryUI.l(ImageGalleryUI.this) != null) {
                ImageGalleryUI.l(ImageGalleryUI.this).caC();
              }
              GMTrace.o(2413905838080L, 17985);
            }
          }, 20L);
          GMTrace.o(2465445445632L, 18369);
        }
      }, null);
      GMTrace.o(2449205100544L, 18248);
      return;
      localObject1 = this.wKr.Dd(this.lEk.xI);
      if (localObject1 != null)
      {
        localObject2 = new ar();
        ((ar)localObject2).eBP.eAH = ((au)localObject1);
        com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject2);
        n = ((ar)localObject2).eBQ.eBT;
        m = ((ar)localObject2).eBQ.eBU;
        i2 = ((ar)localObject2).eBQ.eBR;
        i1 = ((ar)localObject2).eBQ.eBS;
      }
      if ((i2 == 0) && (i1 == 0))
      {
        k = this.lEk.getWidth() / 2;
        j = this.lEk.getHeight() / 2;
        i = m;
        i3 = n;
        break;
      }
      j = i1;
      k = i2;
      i = m;
      i3 = n;
      if (localObject1 == null) {
        break;
      }
      if (((ce)localObject1).field_isSend == 0) {
        this.wMA = com.tencent.mm.br.a.fromDPToPix(this.vKB.vKW, 5);
      }
      j = i1;
      k = i2;
      i = m;
      i3 = n;
      if (((ce)localObject1).field_isSend != 1) {
        break;
      }
      this.wMB = com.tencent.mm.br.a.fromDPToPix(this.vKB.vKW, 5);
      j = i1;
      k = i2;
      i = m;
      i3 = n;
      break;
      m = i * this.lEk.getHeight() / this.pYm;
      break label428;
    }
  }
  
  public static void cfC()
  {
    GMTrace.i(19188974354432L, 142969);
    GMTrace.o(19188974354432L, 142969);
  }
  
  private void cfG()
  {
    GMTrace.i(2452694761472L, 18274);
    if ((cfr().wMq == null) || (!this.wMV) || (cfx()))
    {
      GMTrace.o(2452694761472L, 18274);
      return;
    }
    if (cfr().wMq.getVisibility() == 0) {}
    for (boolean bool = true;; bool = false)
    {
      w.d("MicroMsg.ImageGalleryUI", "fadeInEnterGirdBtn: %B %s", new Object[] { Boolean.valueOf(bool), bg.bQW() });
      cfr().wMq.startAnimation(cfI());
      cfs().wMr.startAnimation(cfI());
      this.wMV = false;
      GMTrace.o(2452694761472L, 18274);
      return;
    }
  }
  
  private void cfH()
  {
    boolean bool = true;
    GMTrace.i(2452828979200L, 18275);
    if ((cfr().wMs == null) || (!this.wMW))
    {
      GMTrace.o(2452828979200L, 18275);
      return;
    }
    if (cfr().wMs.getVisibility() == 0) {}
    for (;;)
    {
      w.d("MicroMsg.ImageGalleryUI", "fadeInPositionAtChatRecordBtn: %B", new Object[] { Boolean.valueOf(bool) });
      cfr().wMs.startAnimation(cfI());
      this.wMW = false;
      GMTrace.o(2452828979200L, 18275);
      return;
      bool = false;
    }
  }
  
  private static Animation cfI()
  {
    GMTrace.i(2452963196928L, 18276);
    AlphaAnimation localAlphaAnimation = new AlphaAnimation(0.0F, 1.0F);
    localAlphaAnimation.setDuration(150L);
    localAlphaAnimation.setFillAfter(true);
    GMTrace.o(2452963196928L, 18276);
    return localAlphaAnimation;
  }
  
  private void cfK()
  {
    GMTrace.i(2453500067840L, 18280);
    w.d("MicroMsg.ImageGalleryUI", "jacks stop Hide Timer");
    this.wMU.stopTimer();
    GMTrace.o(2453500067840L, 18280);
  }
  
  private void cfL()
  {
    GMTrace.i(2454439591936L, 18287);
    boolean bool = ad.fe(this);
    int i = ad.fd(this);
    w.i("MicroMsg.ImageGalleryUI", "%d handleVerticalUI image gallery ui isNavigationBarTint %b isNavBarVisibility %b navBarHeight %d", new Object[] { Integer.valueOf(hashCode()), Boolean.valueOf(this.mWy), Boolean.valueOf(bool), Integer.valueOf(i) });
    if ((this.mWy) && (bool))
    {
      RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(this.wMl.getLayoutParams());
      localLayoutParams.addRule(12);
      localLayoutParams.setMargins(localLayoutParams.leftMargin, localLayoutParams.topMargin, localLayoutParams.rightMargin, i);
      this.wMl.setLayoutParams(localLayoutParams);
      localLayoutParams = new RelativeLayout.LayoutParams(this.wMm.getLayoutParams());
      localLayoutParams.addRule(10);
      localLayoutParams.setMargins(localLayoutParams.leftMargin, localLayoutParams.topMargin, 0, localLayoutParams.bottomMargin);
      this.wMm.setLayoutParams(localLayoutParams);
    }
    GMTrace.o(2454439591936L, 18287);
  }
  
  private void cfM()
  {
    GMTrace.i(2454573809664L, 18288);
    boolean bool = ad.fe(this);
    int i = ad.fd(this);
    w.i("MicroMsg.ImageGalleryUI", "%d handleHorizontalUI image gallery ui isNavigationBarTint %b isNavBarVisibility %b navBarHeight %d", new Object[] { Integer.valueOf(hashCode()), Boolean.valueOf(this.mWy), Boolean.valueOf(bool), Integer.valueOf(i) });
    if ((this.mWy) && (bool))
    {
      RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(this.wMl.getLayoutParams());
      localLayoutParams.addRule(12);
      localLayoutParams.setMargins(localLayoutParams.leftMargin, localLayoutParams.topMargin, i, 0);
      this.wMl.setLayoutParams(localLayoutParams);
      localLayoutParams = new RelativeLayout.LayoutParams(this.wMm.getLayoutParams());
      localLayoutParams.addRule(10);
      localLayoutParams.setMargins(localLayoutParams.leftMargin, localLayoutParams.topMargin, i, localLayoutParams.bottomMargin);
      this.wMm.setLayoutParams(localLayoutParams);
    }
    GMTrace.o(2454573809664L, 18288);
  }
  
  private void cfN()
  {
    GMTrace.i(16438584672256L, 122477);
    String str1 = getIntent().getStringExtra("GalleryUI_FromUser");
    String str2 = getIntent().getStringExtra("GalleryUI_ToUser");
    Intent localIntent = new Intent();
    au localau = this.wKr.cfg();
    String str3 = d.a(localau, d.bm(localau), false);
    w.i("MicroMsg.ImageGalleryUI", "edit image path:%s msgId:%s", new Object[] { str3, Long.valueOf(localau.field_msgId) });
    localIntent.putExtra("before_photo_edit", str3);
    localIntent.putExtra("GalleryUI_FromUser", str1);
    localIntent.putExtra("GalleryUI_ToUser", str2);
    localIntent.putExtra("GalleryUI_ToUser", str2);
    localIntent.putExtra("from_scene", 291);
    localIntent.putExtra("after_photo_edit", "");
    com.tencent.mm.bj.d.b(this, "photoedit", ".ui.MMNewPhotoEditUI", localIntent, 4369);
    overridePendingTransition(0, 0);
    GMTrace.o(16438584672256L, 122477);
  }
  
  private ImageGalleryUI cfr()
  {
    GMTrace.i(2447460270080L, 18235);
    if (this.wMq == null) {
      this.wMq = ((RelativeLayout)((ViewStub)findViewById(R.h.bFv)).inflate());
    }
    GMTrace.o(2447460270080L, 18235);
    return this;
  }
  
  private ImageGalleryUI cfs()
  {
    GMTrace.i(2447594487808L, 18236);
    if (this.wMr == null)
    {
      this.wMr = ((RelativeLayout)((ViewStub)findViewById(R.h.bGC)).inflate());
      this.wMr.findViewById(R.h.buN).setOnClickListener(this);
    }
    GMTrace.o(2447594487808L, 18236);
    return this;
  }
  
  private String cft()
  {
    GMTrace.i(2448802447360L, 18245);
    if ((this.chatroomName != null) && (this.chatroomName.length() > 0))
    {
      str = this.chatroomName;
      GMTrace.o(2448802447360L, 18245);
      return str;
    }
    String str = this.eDs;
    GMTrace.o(2448802447360L, 18245);
    return str;
  }
  
  private void cfu()
  {
    GMTrace.i(2449876189184L, 18253);
    if ((this.wKr == null) || (this.wMn))
    {
      GMTrace.o(2449876189184L, 18253);
      return;
    }
    if (!this.wKr.cff())
    {
      GMTrace.o(2449876189184L, 18253);
      return;
    }
    if (cfr().wMq == null)
    {
      GMTrace.o(2449876189184L, 18253);
      return;
    }
    if (g.a.wMg.wMe)
    {
      cfw();
      GMTrace.o(2449876189184L, 18253);
      return;
    }
    if ((this.wuY) || (this.wMG))
    {
      cfw();
      GMTrace.o(2449876189184L, 18253);
      return;
    }
    w.d("MicroMsg.ImageGalleryUI", "%d show enter grid is video %b", new Object[] { Integer.valueOf(hashCode()), Boolean.valueOf(cfx()) });
    cfv();
    cfJ();
    GMTrace.o(2449876189184L, 18253);
  }
  
  private void cfv()
  {
    int i = 0;
    GMTrace.i(2450010406912L, 18254);
    L(cfr().wMq, 0);
    RelativeLayout localRelativeLayout = cfs().wMr;
    if (this.wMk == b.b.wKY) {}
    for (;;)
    {
      L(localRelativeLayout, i);
      GMTrace.o(2450010406912L, 18254);
      return;
      i = 8;
    }
  }
  
  private void cfw()
  {
    GMTrace.i(2450144624640L, 18255);
    L(cfr().wMq, 8);
    L(cfs().wMr, 8);
    GMTrace.o(2450144624640L, 18255);
  }
  
  private boolean cfx()
  {
    GMTrace.i(2450547277824L, 18258);
    if (this.wMk == b.b.wKZ)
    {
      GMTrace.o(2450547277824L, 18258);
      return true;
    }
    GMTrace.o(2450547277824L, 18258);
    return false;
  }
  
  private static boolean d(au paramau, com.tencent.mm.ao.d paramd)
  {
    GMTrace.i(2450278842368L, 18256);
    if (paramd == null)
    {
      GMTrace.o(2450278842368L, 18256);
      return false;
    }
    try
    {
      if ((b.b(paramau, paramd) == 0) && (paramd.II()))
      {
        boolean bool = paramau.bTO();
        if (!bool)
        {
          GMTrace.o(2450278842368L, 18256);
          return true;
        }
      }
    }
    catch (NullPointerException paramau)
    {
      w.e("MicroMsg.ImageGalleryUI", "error:" + paramau);
      GMTrace.o(2450278842368L, 18256);
    }
    return false;
  }
  
  private static int dA(View paramView)
  {
    GMTrace.i(2447862923264L, 18238);
    if (paramView != null)
    {
      int i = paramView.getVisibility();
      GMTrace.o(2447862923264L, 18238);
      return i;
    }
    GMTrace.o(2447862923264L, 18238);
    return 8;
  }
  
  private static void dB(View paramView)
  {
    GMTrace.i(2451218366464L, 18263);
    if (com.tencent.mm.compatible.util.d.et(16))
    {
      paramView.setBackground(null);
      GMTrace.o(2451218366464L, 18263);
      return;
    }
    paramView.setBackgroundDrawable(null);
    GMTrace.o(2451218366464L, 18263);
  }
  
  private void mm(boolean paramBoolean)
  {
    GMTrace.i(2451084148736L, 18262);
    w.d("MicroMsg.ImageGalleryUI", "switch tool bar bg %b", new Object[] { Boolean.valueOf(paramBoolean) });
    if (paramBoolean)
    {
      this.wMm.setBackgroundResource(R.g.aXq);
      this.wMl.setBackgroundResource(R.g.aXp);
      GMTrace.o(2451084148736L, 18262);
      return;
    }
    dB(this.wMm);
    dB(this.wMl);
    GMTrace.o(2451084148736L, 18262);
  }
  
  public final void Dt(int paramInt)
  {
    GMTrace.i(2450413060096L, 18257);
    bq(this.wKr.Dd(paramInt));
    GMTrace.o(2450413060096L, 18257);
  }
  
  public final void Dv(final int paramInt)
  {
    GMTrace.i(2452157890560L, 18270);
    if (cfq().wMx == null)
    {
      GMTrace.o(2452157890560L, 18270);
      return;
    }
    cfq().wMx.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(2436991287296L, 18157);
        if (ImageGalleryUI.f(ImageGalleryUI.this) == null)
        {
          GMTrace.o(2436991287296L, 18157);
          return;
        }
        b localb = ImageGalleryUI.f(ImageGalleryUI.this);
        int i = paramInt;
        localb.wKy.pause(i);
        GMTrace.o(2436991287296L, 18157);
      }
    });
    GMTrace.o(2452157890560L, 18270);
  }
  
  public final void Dx(int paramInt)
  {
    GMTrace.i(2453634285568L, 18281);
    eO(true);
    cfA();
    cfp().wMt.setVisibility(0);
    cfp().wMu.setVisibility(8);
    cfp().wMv.setVisibility(0);
    cfp().wMw.setVisibility(8);
    cfE();
    cfF();
    cfp().wMv.setText(paramInt + "%");
    GMTrace.o(2453634285568L, 18281);
  }
  
  protected final void MP()
  {
    GMTrace.i(2448936665088L, 18246);
    this.jFM = new com.tencent.mm.ui.tools.g(this.vKB.vKW);
    this.wMU = new aj(this, false);
    this.jFL = false;
    this.eDs = getIntent().getStringExtra("img_gallery_talker");
    this.wME = getIntent().getBooleanExtra("img_gallery_enter_from_grid", false);
    this.wIL = getIntent().getBooleanExtra("img_gallery_enter_from_chatting_ui", false);
    this.wMG = getIntent().getBooleanExtra("img_gallery_enter_from_appbrand_service_chatting_ui", false);
    this.wuY = getIntent().getBooleanExtra("show_search_chat_content_result", false);
    this.txk = getIntent().getBooleanExtra("key_is_biz_chat", false);
    this.juT = getIntent().getLongExtra("key_biz_chat_id", -1L);
    this.wMn = getIntent().getBooleanExtra("img_preview_only", false);
    if (!this.wMn)
    {
      localObject1 = "MicroMsg.ImageGalleryUI initView, talker is null, stack = " + bg.bQW();
      if (this.eDs == null) {
        break label386;
      }
    }
    long l;
    label386:
    for (boolean bool = true;; bool = false)
    {
      Assert.assertTrue((String)localObject1, bool);
      this.chatroomName = getIntent().getStringExtra("img_gallery_chatroom_name");
      this.wMF = getIntent().getBooleanExtra("img_gallery_back_from_grid", false);
      this.wMH = getIntent().getStringExtra("img_gallery_enter_video_opcode");
      bool = getIntent().getBooleanExtra("img_gallery_is_restransmit_after_download", false);
      localObject2 = getIntent().getStringExtra("img_gallery_directly_send_name");
      this.eDr = getIntent().getLongExtra("img_gallery_msg_id", 0L);
      l = getIntent().getLongExtra("img_gallery_msg_svr_id", 0L);
      if ((this.eDr > 0L) || (l != 0L)) {
        break;
      }
      w.e("MicroMsg.ImageGalleryUI", " initView, msgId is invalid, msgId = " + this.eDr + ", msgSvrId = " + l + ", stack = " + bg.bQW());
      finish();
      GMTrace.o(2448936665088L, 18246);
      return;
    }
    if (this.eDr == 0L)
    {
      at.AR();
      this.eDr = com.tencent.mm.y.c.yM().B(cft(), l).field_msgId;
    }
    at.AR();
    Object localObject1 = com.tencent.mm.y.c.yM().cM(this.eDr);
    if (((ce)localObject1).field_msgId <= 0L)
    {
      w.e("MicroMsg.ImageGalleryUI", " initView, msgId is invalid, msgId = " + this.eDr + ", msgSvrId = " + l + ", stack = " + bg.bQW());
      finish();
      GMTrace.o(2448936665088L, 18246);
      return;
    }
    this.wKr = new b(this, this.eDr, cft(), this.txk, this.juT, bool, (String)localObject2, Boolean.valueOf(this.wMF));
    this.wKr.wKB = false;
    this.wKr.wKv = getIntent().getBooleanExtra("start_chatting_ui", true);
    this.wKr.wKA = new b.c()
    {
      public final void Xq()
      {
        GMTrace.i(2426522304512L, 18079);
        if (ImageGalleryUI.f(ImageGalleryUI.this) == null)
        {
          GMTrace.o(2426522304512L, 18079);
          return;
        }
        ImageGalleryUI.g(ImageGalleryUI.this);
        ImageGalleryUI.f(ImageGalleryUI.this).V(100000);
        GMTrace.o(2426522304512L, 18079);
      }
    };
    this.wMl = ((RelativeLayout)findViewById(R.h.bsE));
    this.wMm = ((RelativeLayout)findViewById(R.h.bsD));
    this.wMp = ((ImageView)findViewById(R.h.ckc));
    this.wMp.setOnClickListener(this);
    Object localObject2 = getWindowManager().getDefaultDisplay();
    int j = ((Display)localObject2).getWidth();
    int k = ((Display)localObject2).getHeight();
    int i;
    if (j < k)
    {
      i = 1;
      w.d("MicroMsg.ImageGalleryUI", "%d is vertical screen orient %d [%d, %d]", new Object[] { Integer.valueOf(hashCode()), Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k) });
      if (i != 0) {
        break label1102;
      }
      i = 0;
      label727:
      if (i == 0) {
        break label1107;
      }
      cfL();
    }
    for (;;)
    {
      this.lje = ((ImageView)findViewById(R.h.bCu));
      this.lje.setLayerType(2, null);
      this.lEk = ((MMViewPager)findViewById(R.h.bCs));
      this.lEk.setLayerType(2, null);
      this.lEk.setVerticalFadingEdgeEnabled(false);
      this.lEk.setHorizontalFadingEdgeEnabled(false);
      this.lEk.wfV = new MMViewPager.e()
      {
        public final void aDF()
        {
          GMTrace.i(2434978021376L, 18142);
          ImageGalleryUI.i(ImageGalleryUI.this);
          GMTrace.o(2434978021376L, 18142);
        }
        
        public final void alM()
        {
          GMTrace.i(2434843803648L, 18141);
          ImageGalleryUI.h(ImageGalleryUI.this);
          GMTrace.o(2434843803648L, 18141);
        }
      };
      if (!this.wMn)
      {
        this.lEk.wfX = this.wMO;
        this.lEk.wfW = new MMViewPager.c()
        {
          public final void ayF()
          {
            GMTrace.i(2434172715008L, 18136);
            ImageGalleryUI.this.ml(true);
            GMTrace.o(2434172715008L, 18136);
          }
        };
      }
      this.lEk.DU(1);
      localObject2 = this.lEk;
      i = ((WxViewPager)localObject2).xP;
      ((WxViewPager)localObject2).xP = 50;
      j = ((WxViewPager)localObject2).getWidth();
      ((WxViewPager)localObject2).v(j, j, 50, i);
      ((WxViewPager)localObject2).requestLayout();
      this.lEk.a(this.wKr);
      Dt(100000);
      this.lEk.Y(100000);
      this.lEk.postDelayed(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(2409073999872L, 17949);
          if (ImageGalleryUI.f(ImageGalleryUI.this) == null)
          {
            GMTrace.o(2409073999872L, 17949);
            return;
          }
          if ((g.a.wMg.wMe) && (ImageGalleryUI.j(ImageGalleryUI.this) != null))
          {
            ImageGalleryUI.j(ImageGalleryUI.this).setChecked(g.a.wMg.bp(ImageGalleryUI.f(ImageGalleryUI.this).cfg()));
            ImageGalleryUI.k(ImageGalleryUI.this).setOnClickListener(ImageGalleryUI.this);
          }
          if (ImageGalleryUI.this.lEk.xI != 100000)
          {
            GMTrace.o(2409073999872L, 17949);
            return;
          }
          ImageGalleryUI.this.cfJ();
          b.b localb = b.bd(ImageGalleryUI.f(ImageGalleryUI.this).Dd(100000));
          if ((!ImageGalleryUI.this.wMF) && (localb == b.b.wKZ)) {
            ImageGalleryUI.f(ImageGalleryUI.this).Di(100000);
          }
          if (localb == b.b.wLa) {
            ImageGalleryUI.f(ImageGalleryUI.this).Dm(100000);
          }
          GMTrace.o(2409073999872L, 17949);
        }
      }, 0L);
      if (g.a.wMg.wMe)
      {
        this.wMJ = ((ViewStub)findViewById(R.h.cbT)).inflate();
        this.wMJ.setVisibility(0);
        this.wMK = ((CheckBox)this.wMJ.findViewById(R.h.bMz));
        this.wML = this.wMJ.findViewById(R.h.bMA);
      }
      this.wMC = getIntent().getBooleanExtra("img_gallery_enter_PhotoEditUI", false);
      localObject1 = this.wKr.f((au)localObject1, true);
      if (localObject1 == null) {
        w.e("MicroMsg.ImageGalleryUI", "[initView] imgInfo is null!!! isSoonEnterPhotoEdit:%s", new Object[] { Boolean.valueOf(this.wMC) });
      }
      if ((!this.wMC) || (localObject1 == null) || (!((com.tencent.mm.ao.d)localObject1).IH())) {
        break label1114;
      }
      cfN();
      this.wMC = false;
      GMTrace.o(2448936665088L, 18246);
      return;
      i = 0;
      break;
      label1102:
      i = 1;
      break label727;
      label1107:
      cfM();
    }
    label1114:
    if (this.wMC) {
      w.w("MicroMsg.ImageGalleryUI", "img not GetCompleted!");
    }
    GMTrace.o(2448936665088L, 18246);
  }
  
  protected final void VC()
  {
    GMTrace.i(2449741971456L, 18252);
    super.VC();
    GMTrace.o(2449741971456L, 18252);
  }
  
  public final boolean aaS()
  {
    GMTrace.i(2447997140992L, 18239);
    GMTrace.o(2447997140992L, 18239);
    return true;
  }
  
  public final void bq(au paramau)
  {
    int j = 0;
    label129:
    com.tencent.mm.ao.d locald;
    for (;;)
    {
      try
      {
        GMTrace.i(2451352584192L, 18264);
        this.wMk = b.bd(paramau);
        w.i("MicroMsg.ImageGalleryUI", "updateFooterInfo currGalleryType : " + this.wMk);
        if ((g.a.wMg.wMe) && (this.wMK != null)) {
          this.wMK.setChecked(g.a.wMg.bp(paramau));
        }
        switch (11.wKH[this.wMk.ordinal()])
        {
        case 1: 
          GMTrace.o(2451352584192L, 18264);
          return;
        }
      }
      finally {}
      cfA();
      L(this.wMt, 8);
      mn(true);
      paramau = i.br(paramau);
      if (paramau == null)
      {
        GMTrace.o(2451352584192L, 18264);
      }
      else
      {
        cfq().wMy.tY(paramau.hcv);
        i = j;
        try
        {
          if (this.wKr.cfh() != null)
          {
            i = j;
            if (this.wKr.cfh().wNI != null) {
              i = this.wKr.cfh().wNI.getCurrentPosition() / 1000;
            }
          }
        }
        catch (Exception paramau)
        {
          for (;;)
          {
            w.printErrStackTrace("MicroMsg.ImageGalleryUI", paramau, "", new Object[0]);
            i = j;
          }
        }
        cfq().wMy.seek(i);
        GMTrace.o(2451352584192L, 18264);
        continue;
        locald = this.wKr.f(paramau, false);
        cfA();
        cfu();
        if (locald != null) {
          break;
        }
        w.w("MicroMsg.ImageGalleryUI", "updateFooterInfo img info is null");
        GMTrace.o(2451352584192L, 18264);
      }
    }
    int i = this.lEk.xI;
    Object localObject2;
    if ((d(paramau, locald)) && (!paramau.bTO()) && (locald.IH()))
    {
      cfp().wMu.setVisibility(0);
      cfp().wMv.setVisibility(8);
      cfp().wMw.setVisibility(8);
      String str = (String)this.wMR.get(Long.valueOf(locald.gGR));
      localObject2 = str;
      if (str == null)
      {
        localObject2 = bh.q(locald.gHc, "msg");
        if (localObject2 != null) {
          break label607;
        }
        w.e("MicroMsg.ImageGalleryUI", "parse cdnInfo failed. [%s]", new Object[] { locald.gHc });
        i = -1;
        break label906;
      }
    }
    for (;;)
    {
      label468:
      this.wMR.put(Long.valueOf(locald.gGR), localObject2);
      cfp().wMu.setText(getString(R.l.dmi, new Object[] { localObject2 }));
      L(this.wMt, 0);
      label520:
      if ((this.wMC) && (locald.IH()) && (this.wKr.cfg() != null) && (paramau.field_msgId == this.wKr.cfg().field_msgId))
      {
        w.i("MicroMsg.ImageGalleryUI", "get image successfully! -> gotoPhotoEditUI msgId:%s", new Object[] { Long.valueOf(paramau.field_msgId) });
        cfN();
        this.wMC = false;
        GMTrace.o(2451352584192L, 18264);
        break label129;
        label607:
        i = bg.getInt((String)((Map)localObject2).get(".msg.img.$hdlength"), 0);
        break label906;
      }
      long l;
      label906:
      do
      {
        Object localObject1;
        localObject2 = new BigDecimal(localObject1);
        float f = ((BigDecimal)localObject2).divide(new BigDecimal(1048576), 2, 0).floatValue();
        if (f > 1.0F)
        {
          localObject2 = (int)f + "M";
          break label468;
        }
        f = ((BigDecimal)localObject2).divide(new BigDecimal(1024), 2, 0).floatValue();
        localObject2 = (int)f + "K";
        break label468;
        L(this.wMt, 8);
        break label520;
        localObject2 = this.wKr.cfg();
        boolean bool = this.wMC;
        l = paramau.field_msgId;
        if (localObject2 == null) {}
        for (paramau = "null";; paramau = Long.valueOf(((ce)localObject2).field_msgId))
        {
          w.w("MicroMsg.ImageGalleryUI", "isSoonEnterPhotoEdit:%s msgId:%s curMsgId:%s getCompleted:%s", new Object[] { Boolean.valueOf(bool), Long.valueOf(l), paramau, Boolean.valueOf(locald.IH()) });
          GMTrace.o(2451352584192L, 18264);
          break;
        }
        cfA();
        cfu();
        GMTrace.o(2451352584192L, 18264);
        break label129;
        cfA();
        cfu();
        L(this.wMt, 8);
        this.wKr.Dm(this.lEk.xI);
        break;
        break;
        l = i;
      } while (l >= 0L);
      localObject2 = "";
    }
  }
  
  public final void cfA()
  {
    GMTrace.i(2450949931008L, 18261);
    w.i("MicroMsg.ImageGalleryUI", "hide video tool bar");
    mm(false);
    L(cfq().wMx, 8);
    L(this.wMp, 8);
    if (cfx())
    {
      cfK();
      cfw();
    }
    this.wMP = false;
    GMTrace.o(2450949931008L, 18261);
  }
  
  public final int cfB()
  {
    GMTrace.i(15334106988544L, 114248);
    int i = this.lEk.xI;
    GMTrace.o(15334106988544L, 114248);
    return i;
  }
  
  public final boolean cfD()
  {
    GMTrace.i(2452023672832L, 18269);
    boolean bool = cfq().wMy.eIC;
    GMTrace.o(2452023672832L, 18269);
    return bool;
  }
  
  final void cfE()
  {
    GMTrace.i(2452426326016L, 18272);
    if ((cfr().wMq == null) || (this.wMV))
    {
      GMTrace.o(2452426326016L, 18272);
      return;
    }
    if (this.wMq.getVisibility() == 0) {}
    for (boolean bool = true;; bool = false)
    {
      w.d("MicroMsg.ImageGalleryUI", "fadeOutEnterGirdBtn: %B", new Object[] { Boolean.valueOf(bool) });
      Animation localAnimation = Dw(300);
      localAnimation.setFillAfter(false);
      localAnimation.setAnimationListener(new Animation.AnimationListener()
      {
        public final void onAnimationEnd(Animation paramAnonymousAnimation)
        {
          GMTrace.i(2462090002432L, 18344);
          ImageGalleryUI.D(ImageGalleryUI.this);
          ImageGalleryUI.E(ImageGalleryUI.this);
          GMTrace.o(2462090002432L, 18344);
        }
        
        public final void onAnimationRepeat(Animation paramAnonymousAnimation)
        {
          GMTrace.i(2462224220160L, 18345);
          GMTrace.o(2462224220160L, 18345);
        }
        
        public final void onAnimationStart(Animation paramAnonymousAnimation)
        {
          GMTrace.i(2461955784704L, 18343);
          GMTrace.o(2461955784704L, 18343);
        }
      });
      cfr().wMq.startAnimation(localAnimation);
      this.wMV = true;
      GMTrace.o(2452426326016L, 18272);
      return;
    }
  }
  
  final void cfF()
  {
    GMTrace.i(2452560543744L, 18273);
    if ((cfr().wMs == null) || (this.wMW))
    {
      GMTrace.o(2452560543744L, 18273);
      return;
    }
    cfr().wMs.startAnimation(Dw(300));
    this.wMW = true;
    GMTrace.o(2452560543744L, 18273);
  }
  
  protected final void cfJ()
  {
    GMTrace.i(2453365850112L, 18279);
    if ((dA(this.wMt) == 0) && (dA(this.wMu) == 0)) {}
    for (int i = 1; (i != 0) || (this.wKr == null); i = 0)
    {
      GMTrace.o(2453365850112L, 18279);
      return;
    }
    w.d("MicroMsg.ImageGalleryUI", "jacks start Hide Timer");
    this.wMU.z(4000L, 4000L);
    GMTrace.o(2453365850112L, 18279);
  }
  
  final ImageGalleryUI cfp()
  {
    GMTrace.i(2447191834624L, 18233);
    if (this.wMt == null)
    {
      this.wMt = ((ViewStub)findViewById(R.h.bGD)).inflate();
      this.wMu = ((Button)this.wMt.findViewById(R.h.bsF));
      this.wMv = ((Button)this.wMt.findViewById(R.h.bsG));
      this.wMw = this.wMt.findViewById(R.h.bsH);
    }
    GMTrace.o(2447191834624L, 18233);
    return this;
  }
  
  protected final ImageGalleryUI cfq()
  {
    GMTrace.i(2447326052352L, 18234);
    if (this.wMx == null)
    {
      this.wMx = ((ViewStub)findViewById(R.h.ckn)).inflate();
      this.wMy = ((VideoPlayerSeekBar)findViewById(R.h.cku));
      this.wMy.f(this);
    }
    GMTrace.o(2447326052352L, 18234);
    return this;
  }
  
  protected final void cfy()
  {
    GMTrace.i(2450681495552L, 18259);
    if (this.wMP) {
      this.wMQ.z(4000L, 4000L);
    }
    GMTrace.o(2450681495552L, 18259);
  }
  
  public final void cfz()
  {
    GMTrace.i(2450815713280L, 18260);
    w.i("MicroMsg.ImageGalleryUI", "show video tool bar");
    eO(true);
    mm(true);
    L(this.wMt, 8);
    L(cfq().wMx, 0);
    L(this.wMp, 0);
    cfr().wMq.clearAnimation();
    if (this.wMn) {
      cfw();
    }
    for (;;)
    {
      cfK();
      this.wMP = true;
      cfy();
      GMTrace.o(2450815713280L, 18260);
      return;
      cfv();
    }
  }
  
  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    GMTrace.i(2452292108288L, 18271);
    if ((paramKeyEvent.getKeyCode() == 82) && (paramKeyEvent.getAction() == 1))
    {
      if (this.pSj != null)
      {
        this.pSj.bFl();
        this.pSj = null;
      }
      for (;;)
      {
        GMTrace.o(2452292108288L, 18271);
        return true;
        ml(true);
      }
    }
    boolean bool = super.dispatchKeyEvent(paramKeyEvent);
    GMTrace.o(2452292108288L, 18271);
    return bool;
  }
  
  public final void eO(boolean paramBoolean)
  {
    int i = 8;
    GMTrace.i(2449473536000L, 18250);
    if (((paramBoolean) && (this.wMl.getVisibility() == 0)) || ((!paramBoolean) && (this.wMl.getVisibility() == 8)))
    {
      GMTrace.o(2449473536000L, 18250);
      return;
    }
    Object localObject = this.wMl;
    if (paramBoolean) {
      i = 0;
    }
    ((RelativeLayout)localObject).setVisibility(i);
    localObject = this.vKB.vKW;
    if (paramBoolean) {}
    for (i = R.a.aLh;; i = R.a.aLi)
    {
      localObject = AnimationUtils.loadAnimation((Context)localObject, i);
      this.wMl.startAnimation((Animation)localObject);
      GMTrace.o(2449473536000L, 18250);
      return;
    }
  }
  
  public final int fi(long paramLong)
  {
    GMTrace.i(2454036938752L, 18284);
    if (bg.nm(this.wMH))
    {
      GMTrace.o(2454036938752L, 18284);
      return 0;
    }
    try
    {
      int j = t.f(paramLong, this.wMH);
      int i = j;
      if (j == -1)
      {
        this.wMH = null;
        i = 0;
      }
      w.d("MicroMsg.ImageGalleryUI", "get enter video op code %d %s", new Object[] { Integer.valueOf(i), this.wMH });
      GMTrace.o(2454036938752L, 18284);
      return i;
    }
    catch (Exception localException)
    {
      w.e("MicroMsg.ImageGalleryUI", "get enter video op code error : " + localException.toString());
      GMTrace.o(2454036938752L, 18284);
    }
    return 0;
  }
  
  public void finish()
  {
    GMTrace.i(2453902721024L, 18283);
    this.wJv.clear();
    super.finish();
    GMTrace.o(2453902721024L, 18283);
  }
  
  public final void fj(long paramLong)
  {
    GMTrace.i(2454171156480L, 18285);
    if ((bg.nm(this.wMH)) || (paramLong == 0L))
    {
      GMTrace.o(2454171156480L, 18285);
      return;
    }
    if (t.f(paramLong, this.wMH) == -1)
    {
      this.wMH = null;
      w.d("MicroMsg.ImageGalleryUI", "reset enter video op code %s", new Object[] { this.wMH });
    }
    GMTrace.o(2454171156480L, 18285);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(2449607753728L, 18251);
    int i = R.i.czL;
    GMTrace.o(2449607753728L, 18251);
    return i;
  }
  
  protected final void ml(boolean paramBoolean)
  {
    GMTrace.i(2449339318272L, 18249);
    if (this.wKr == null)
    {
      GMTrace.o(2449339318272L, 18249);
      return;
    }
    if (this.wMN < 0)
    {
      GMTrace.o(2449339318272L, 18249);
      return;
    }
    Object localObject2 = this.wKr.Dd(this.wMN);
    int i = this.wKr.wKx.bl((au)localObject2);
    if ((i == 5) || (i == 6))
    {
      w.w("MicroMsg.ImageGalleryUI", "jacks fail downloaded img, return");
      GMTrace.o(2449339318272L, 18249);
      return;
    }
    if (this.wKr.bc((au)localObject2))
    {
      w.w("MicroMsg.ImageGalleryUI", "jacks downloading, return");
      GMTrace.o(2449339318272L, 18249);
      return;
    }
    if ((b.aY((au)localObject2)) && (i.br((au)localObject2) == null))
    {
      w.w("MicroMsg.ImageGalleryUI", "video info is null, return now.");
      GMTrace.o(2449339318272L, 18249);
      return;
    }
    final Object localObject3 = new ArrayList();
    final ArrayList localArrayList = new ArrayList();
    ((List)localObject3).add(Integer.valueOf(0));
    localArrayList.add(getString(R.l.dSm));
    if (com.tencent.mm.bj.d.LL("favorite"))
    {
      ((List)localObject3).add(Integer.valueOf(2));
      localArrayList.add(getString(R.l.dNH));
    }
    if ((b.aX((au)localObject2)) || (b.bb((au)localObject2)))
    {
      ((List)localObject3).add(Integer.valueOf(1));
      localArrayList.add(getString(R.l.dUK));
      if ((b.aX((au)localObject2)) || (b.aZ((au)localObject2)))
      {
        localObject1 = new dh();
        ((dh)localObject1).eEV.eDr = ((ce)localObject2).field_msgId;
        com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject1);
        if ((((dh)localObject1).eEW.eEu) || (com.tencent.mm.pluginsdk.model.app.g.N(this.vKB.vKW, ((ce)localObject2).field_type)))
        {
          ((List)localObject3).add(Integer.valueOf(4));
          localArrayList.add(getString(R.l.dgi));
        }
      }
      if (b.aX((au)localObject2))
      {
        ((List)localObject3).add(Integer.valueOf(6));
        localArrayList.add(getString(R.l.dfG));
      }
      if ((this.pSn != null) && (!this.wMG))
      {
        ((List)localObject3).add(Integer.valueOf(3));
        if (!com.tencent.mm.plugin.scanner.a.an(this.iom, this.pSn)) {
          break label804;
        }
        localObject1 = getString(R.l.dQh);
        label472:
        localArrayList.add(localObject1);
      }
      if ((!this.wuY) && (!this.txk) && (!g.a.wMg.wMe) && (!this.wMG))
      {
        ((List)localObject3).add(Integer.valueOf(5));
        localArrayList.add(getString(R.l.dfF));
      }
      if ((this.pSj == null) || (!this.pSo)) {
        break label815;
      }
      this.pSo = false;
      label557:
      this.pSj.qik = new p.c()
      {
        public final void a(com.tencent.mm.ui.base.n paramAnonymousn)
        {
          GMTrace.i(2462761091072L, 18349);
          paramAnonymousn.clear();
          int i = 0;
          while (i < localObject3.size())
          {
            paramAnonymousn.e(((Integer)localObject3.get(i)).intValue(), (CharSequence)localArrayList.get(i));
            i += 1;
          }
          GMTrace.o(2462761091072L, 18349);
        }
      };
      this.pSj.qil = this.krF;
      this.pSj.bFk();
      this.pSj.xqc = new f.a()
      {
        public final void onDismiss()
        {
          GMTrace.i(14655636373504L, 109193);
          al localal = new al();
          localal.eBC.filePath = ImageGalleryUI.b(ImageGalleryUI.this);
          com.tencent.mm.sdk.b.a.vgX.m(localal);
          ImageGalleryUI.u(ImageGalleryUI.this);
          ImageGalleryUI.e(ImageGalleryUI.this);
          ImageGalleryUI.a(ImageGalleryUI.this, null);
          ImageGalleryUI.a(ImageGalleryUI.this, ImageGalleryUI.b(ImageGalleryUI.this, 0));
          GMTrace.o(14655636373504L, 109193);
        }
      };
      if (((b.aX((au)localObject2)) || (b.bb((au)localObject2))) && (true == paramBoolean) && (at.wS().DN() != 0) && (!this.wMG))
      {
        localObject1 = null;
        if (!b.aX((au)localObject2)) {
          break label840;
        }
        localObject3 = this.wKr.f((au)localObject2, true);
        if (localObject3 == null) {}
      }
    }
    label804:
    label815:
    label840:
    for (Object localObject1 = d.a((au)localObject2, (com.tencent.mm.ao.d)localObject3, false);; localObject1 = b.bh((au)localObject2))
    {
      if (localObject1 != null)
      {
        localObject2 = new mk();
        ((mk)localObject2).eRq.filePath = ((String)localObject1);
        this.pSk = ((String)localObject1);
        com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject2);
      }
      GMTrace.o(2449339318272L, 18249);
      return;
      if ((b.aY((au)localObject2)) || (b.aZ((au)localObject2)))
      {
        ((List)localObject3).add(Integer.valueOf(1));
        localArrayList.add(getString(R.l.dUN));
        break;
      }
      ((List)localObject3).add(Integer.valueOf(1));
      localArrayList.add(getString(R.l.dUM));
      break;
      localObject1 = getString(R.l.dQg);
      break label472;
      this.pSj = new com.tencent.mm.ui.widget.f(this.vKB.vKW, com.tencent.mm.ui.widget.f.xpQ, false);
      break label557;
    }
  }
  
  public final void mn(boolean paramBoolean)
  {
    GMTrace.i(2451889455104L, 18268);
    try
    {
      VideoPlayerSeekBar localVideoPlayerSeekBar = cfq().wMy;
      if (!paramBoolean) {}
      for (paramBoolean = true;; paramBoolean = false)
      {
        localVideoPlayerSeekBar.cp(paramBoolean);
        GMTrace.o(2451889455104L, 18268);
        return;
      }
      return;
    }
    catch (Exception localException)
    {
      w.e("MicroMsg.ImageGalleryUI", "set video state iv error : " + localException.toString());
      GMTrace.o(2451889455104L, 18268);
    }
  }
  
  public void onBackPressed()
  {
    GMTrace.i(2448668229632L, 18244);
    w.i("MicroMsg.ImageGalleryUI", "onBackPressed");
    if (this.wME)
    {
      Du(1);
      GMTrace.o(2448668229632L, 18244);
      return;
    }
    try
    {
      g.a.wMg.detach();
      alL();
      GMTrace.o(2448668229632L, 18244);
      return;
    }
    catch (Exception localException)
    {
      w.e("MicroMsg.ImageGalleryUI", localException.getMessage());
      GMTrace.o(2448668229632L, 18244);
    }
  }
  
  public void onClick(View paramView)
  {
    boolean bool1 = true;
    GMTrace.i(2451755237376L, 18267);
    if (this.wKr == null)
    {
      GMTrace.o(2451755237376L, 18267);
      return;
    }
    if (paramView.getId() == R.h.bFv)
    {
      Du(0);
      GMTrace.o(2451755237376L, 18267);
      return;
    }
    if (paramView.getId() == R.h.buN)
    {
      w.i("MicroMsg.ImageGalleryUI", "[oreh download_and_save] hdImg suc, curPos:%d", new Object[] { Integer.valueOf(this.lEk.xI) });
      L(cfs().wMr, 8);
      paramView = this.wKr.Dd(this.lEk.xI);
      com.tencent.mm.ao.d locald = this.wKr.f(paramView, false);
      int i = this.lEk.xI;
      if ((d(paramView, locald)) && (!paramView.bTO()) && (locald.IH()))
      {
        this.wKr.af(this.lEk.xI, true);
        GMTrace.o(2451755237376L, 18267);
        return;
      }
      b.b(this.vKB.vKW, this.wKr.cfg(), true);
      GMTrace.o(2451755237376L, 18267);
      return;
    }
    if (paramView.getId() == R.h.bsF)
    {
      this.wKr.af(this.lEk.xI, false);
      GMTrace.o(2451755237376L, 18267);
      return;
    }
    if (paramView.getId() == R.h.bsG)
    {
      this.wKr.Dl(this.lEk.xI);
      Dt(this.lEk.xI);
      cfG();
      cfH();
      cfJ();
      GMTrace.o(2451755237376L, 18267);
      return;
    }
    if (paramView.getId() == R.h.bcL)
    {
      onBackPressed();
      GMTrace.o(2451755237376L, 18267);
      return;
    }
    if (paramView.getId() == R.h.ckc)
    {
      onBackPressed();
      GMTrace.o(2451755237376L, 18267);
      return;
    }
    if (paramView.getId() == R.h.bMA)
    {
      boolean bool2 = this.wMK.isChecked();
      if ((!bool2) && (g.a.wMg.wKD.size() >= 9))
      {
        Toast.makeText(this, getResources().getString(R.l.dzj, new Object[] { Integer.valueOf(9) }), 1).show();
        GMTrace.o(2451755237376L, 18267);
        return;
      }
      paramView = this.wMK;
      if (!bool2) {}
      for (;;)
      {
        paramView.setChecked(bool1);
        if (!this.wMK.isChecked()) {
          break;
        }
        g.a.wMg.bn(this.wKr.cfg());
        GMTrace.o(2451755237376L, 18267);
        return;
        bool1 = false;
      }
      g.a.wMg.bo(this.wKr.cfg());
      GMTrace.o(2451755237376L, 18267);
      return;
    }
    if (paramView.getId() == R.h.bTl) {
      this.wKr.Di(this.lEk.xI);
    }
    GMTrace.o(2451755237376L, 18267);
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    GMTrace.i(2454305374208L, 18286);
    super.onConfigurationChanged(paramConfiguration);
    if (paramConfiguration.orientation == 1)
    {
      w.d("MicroMsg.ImageGalleryUI", "%d image gallery ui is vertical screen", new Object[] { Integer.valueOf(hashCode()) });
      cfL();
      GMTrace.o(2454305374208L, 18286);
      return;
    }
    if (paramConfiguration.orientation == 2)
    {
      w.d("MicroMsg.ImageGalleryUI", "%d image gallery ui is horizontal screen", new Object[] { Integer.valueOf(hashCode()) });
      cfM();
      GMTrace.o(2454305374208L, 18286);
      return;
    }
    GMTrace.o(2454305374208L, 18286);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(2448131358720L, 18240);
    requestWindowFeature(1);
    long l = System.currentTimeMillis();
    this.wMM = true;
    super.onCreate(paramBundle);
    if (com.tencent.mm.compatible.util.d.et(19)) {
      getWindow().setFlags(201327616, 201327616);
    }
    for (this.mWy = true;; this.mWy = false)
    {
      MP();
      this.jFK = paramBundle;
      com.tencent.mm.sdk.b.a.vgX.b(this.leg);
      com.tencent.mm.sdk.b.a.vgX.b(this.pSq);
      this.wMo = false;
      w.d("MicroMsg.ImageGalleryUI", "ImageGallery onCreate spent : %s", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
      GMTrace.o(2448131358720L, 18240);
      return;
      getWindow().setFlags(1024, 1024);
    }
  }
  
  protected void onDestroy()
  {
    GMTrace.i(2448534011904L, 18243);
    w.i("MicroMsg.ImageGalleryUI", "%d image gallery ui on destroy", new Object[] { Integer.valueOf(hashCode()) });
    if (this.wKr != null)
    {
      this.wKr.detach();
      this.wKr = null;
    }
    cfK();
    this.wMQ.stopTimer();
    com.tencent.mm.sdk.b.a.vgX.c(this.leg);
    com.tencent.mm.sdk.b.a.vgX.c(this.pSq);
    if (this.wMy != null) {
      this.wMy.f(null);
    }
    this.wMy = null;
    super.onDestroy();
    GMTrace.o(2448534011904L, 18243);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(2453768503296L, 18282);
    if (paramInt == 82)
    {
      GMTrace.o(2453768503296L, 18282);
      return true;
    }
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    GMTrace.o(2453768503296L, 18282);
    return bool;
  }
  
  protected void onPause()
  {
    GMTrace.i(2447057616896L, 18232);
    w.i("MicroMsg.ImageGalleryUI", "on pause");
    super.onPause();
    if (Build.VERSION.SDK_INT >= 21) {
      getWindow().setFlags(2048, 2048);
    }
    Object localObject;
    if ((!isFinishing()) && (this.wKr != null))
    {
      localObject = this.wKr;
      ((b)localObject).wKy.wNm.sendEmptyMessageAtTime(1, 200L);
      ((b)localObject).wKz.cfo();
    }
    if (this.pSn != null)
    {
      localObject = new ak();
      ((ak)localObject).eBA.activity = this;
      ((ak)localObject).eBA.eBB = this.pSn;
      com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject);
      this.pSn = null;
      this.ion = 0;
      this.iom = 0;
    }
    GMTrace.o(2447057616896L, 18232);
  }
  
  protected void onResume()
  {
    GMTrace.i(2448265576448L, 18241);
    super.onResume();
    if (Build.VERSION.SDK_INT >= 21) {
      getWindow().clearFlags(2048);
    }
    if ((!this.wMM) && (this.wKr != null)) {
      Dt(this.lEk.xI);
    }
    this.wMM = false;
    if (this.wKr != null) {
      this.wKr.cfi();
    }
    GMTrace.o(2448265576448L, 18241);
  }
  
  public void onStart()
  {
    GMTrace.i(2448399794176L, 18242);
    this.wMF = getIntent().getBooleanExtra("img_gallery_back_from_grid", false);
    if (!this.wMn)
    {
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
          if ((this.jFN == 0) && (this.jFO == 0) && (this.jFP == 0) && (this.jFQ == 0))
          {
            au localau = this.wKr.Dd(this.lEk.xI);
            if (localau != null)
            {
              ar localar = new ar();
              localar.eBP.eAH = localau;
              com.tencent.mm.sdk.b.a.vgX.m(localar);
              this.jFP = localar.eBQ.eBT;
              this.jFQ = localar.eBQ.eBU;
              this.jFO = localar.eBQ.eBR;
              this.jFN = localar.eBQ.eBS;
            }
          }
          this.jFM.p(this.jFO, this.jFN, this.jFP, this.jFQ);
          if (localBundle == null) {
            this.lEk.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener()
            {
              public final boolean onPreDraw()
              {
                GMTrace.i(2462492655616L, 18347);
                ImageGalleryUI.this.lEk.getViewTreeObserver().removeOnPreDrawListener(this);
                ImageGalleryUI.this.pYl = ImageGalleryUI.this.lEk.getWidth();
                ImageGalleryUI.this.pYm = ImageGalleryUI.this.lEk.getHeight();
                if (ImageGalleryUI.f(ImageGalleryUI.this).cfg().bTH()) {
                  ImageGalleryUI.this.pYm = ((int)(ImageGalleryUI.this.pYl / ImageGalleryUI.this.jFP * ImageGalleryUI.this.jFQ));
                }
                if (ImageGalleryUI.f(ImageGalleryUI.this).cfg().bTC()) {
                  ImageGalleryUI.a(ImageGalleryUI.this, ImageGalleryUI.f(ImageGalleryUI.this).os(ImageGalleryUI.this.lEk.xI));
                }
                if (ImageGalleryUI.l(ImageGalleryUI.this) != null)
                {
                  ImageGalleryUI.this.pYm = ((int)(ImageGalleryUI.this.pYl / ImageGalleryUI.l(ImageGalleryUI.this).imageWidth * ImageGalleryUI.l(ImageGalleryUI.this).imageHeight));
                  if (ImageGalleryUI.this.pYm > ImageGalleryUI.this.lEk.getHeight()) {
                    ImageGalleryUI.this.pYm = ImageGalleryUI.this.lEk.getHeight();
                  }
                }
                ImageGalleryUI.this.jFM.eC(ImageGalleryUI.this.pYl, ImageGalleryUI.this.pYm);
                if (!ImageGalleryUI.this.wMF)
                {
                  ImageGalleryUI.m(ImageGalleryUI.this);
                  ImageGalleryUI.n(ImageGalleryUI.this);
                  ImageGalleryUI.this.jFM.a(ImageGalleryUI.this.lEk, ImageGalleryUI.o(ImageGalleryUI.this), new g.b()
                  {
                    public final void onAnimationEnd()
                    {
                      GMTrace.i(2471082590208L, 18411);
                      ImageGalleryUI.p(ImageGalleryUI.this).post(new Runnable()
                      {
                        public final void run()
                        {
                          GMTrace.i(2434575368192L, 18139);
                          if (ImageGalleryUI.this.wMI != null) {
                            ImageGalleryUI.this.wMI.i(Boolean.valueOf(false));
                          }
                          GMTrace.o(2434575368192L, 18139);
                        }
                      });
                      GMTrace.o(2471082590208L, 18411);
                    }
                    
                    public final void onAnimationStart()
                    {
                      GMTrace.i(2470948372480L, 18410);
                      if (ImageGalleryUI.this.wMI != null) {
                        ImageGalleryUI.this.wMI.i(Boolean.valueOf(true));
                      }
                      GMTrace.o(2470948372480L, 18410);
                    }
                  });
                }
                ImageGalleryUI.q(ImageGalleryUI.this);
                GMTrace.o(2462492655616L, 18347);
                return true;
              }
            });
          }
        }
      }
    }
    super.onStart();
    GMTrace.o(2448399794176L, 18242);
  }
  
  public final boolean pM()
  {
    GMTrace.i(2453231632384L, 18278);
    cfE();
    cfF();
    GMTrace.o(2453231632384L, 18278);
    return false;
  }
  
  public static abstract interface a
  {
    public abstract void i(Boolean paramBoolean);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\chatting\gallery\ImageGalleryUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */