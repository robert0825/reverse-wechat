package com.tencent.mm.plugin.sns.ui;

import android.annotation.TargetApi;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager.e;
import android.support.v4.view.ViewPager.h;
import android.support.v4.view.u;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.Base64;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLayoutChangeListener;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.plugin.sns.i.c;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.i.i;
import com.tencent.mm.plugin.sns.i.j;
import com.tencent.mm.plugin.sns.model.AdLandingPagesProxy;
import com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.a;
import com.tencent.mm.plugin.sns.model.AdlandingRemoteServiceConnectedReceiver;
import com.tencent.mm.plugin.sns.model.am;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.v;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdlandingDummyViewPager;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.DummyViewPager;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.a.b.a;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.o;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.q;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.s;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.z;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.e;
import com.tencent.mm.plugin.sns.storage.b.c;
import com.tencent.mm.protocal.c.anu;
import com.tencent.mm.protocal.c.bhf;
import com.tencent.mm.protocal.c.bhg;
import com.tencent.mm.protocal.c.biz;
import com.tencent.mm.protocal.c.oa;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.p.c;
import com.tencent.mm.ui.base.p.d;
import com.tencent.mm.ui.widget.f.a;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

public class SnsAdNativeLandingPagesUI
  extends MMActivity
{
  public static boolean pXf;
  int cfz;
  String eUg;
  private long fKc;
  int gVx;
  String hVd;
  private boolean iYa;
  private long iyB;
  private int jFN;
  private int jFO;
  private int jFP;
  private int jFQ;
  private ImageView jru;
  private int jsi;
  String kBQ;
  String kBR;
  private com.tencent.mm.remoteservice.d kSj;
  protected com.tencent.mm.ui.snackbar.b.b lKN;
  private ImageView lje;
  String pCr;
  String pDC;
  private int pDb;
  private int pEM;
  private int pHH;
  private int pHI;
  private int pHJ;
  private View pKI;
  z pKr;
  public LinkedList<com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.c> pWU;
  private ImageView pWV;
  private ImageView pWW;
  Bundle pWX;
  b pWY;
  private boolean pWZ;
  private boolean pXA;
  private BroadcastReceiver pXB;
  String pXa;
  String pXb;
  private String pXc;
  private ImageView pXd;
  String pXe;
  com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.g pXg;
  boolean pXh;
  private int pXi;
  int pXj;
  String pXk;
  String pXl;
  String pXm;
  private AdlandingDummyViewPager pXn;
  int pXo;
  private ae pXp;
  private LinkedList<View> pXq;
  private boolean pXr;
  private View pXs;
  com.tencent.mm.plugin.sns.storage.m pXt;
  private volatile int pXu;
  private BroadcastReceiver pXv;
  private BroadcastReceiver pXw;
  private b.a pXx;
  private ViewPager.e pXy;
  private Map<Integer, Fragment> pXz;
  String pyc;
  private long startTime;
  String uin;
  Map<String, String> values;
  int yvo;
  
  static
  {
    GMTrace.i(17146448969728L, 127751);
    pXf = false;
    GMTrace.o(17146448969728L, 127751);
  }
  
  public SnsAdNativeLandingPagesUI()
  {
    GMTrace.i(8524704776192L, 63514);
    this.pWU = new LinkedList();
    this.jFN = 0;
    this.jFO = 0;
    this.jFP = 0;
    this.jFQ = 0;
    this.pWZ = false;
    this.pHH = 1000;
    this.pHI = 700;
    this.pHJ = 250;
    this.iyB = 0L;
    this.fKc = 0L;
    this.pXg = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.g();
    this.pXh = false;
    this.pXi = 0;
    this.pXp = new ae();
    this.kSj = new com.tencent.mm.remoteservice.d(com.tencent.mm.sdk.platformtools.ab.getContext());
    this.pXr = true;
    this.iYa = false;
    this.pXu = 2;
    this.pXv = new BroadcastReceiver()
    {
      public final void onReceive(Context paramAnonymousContext, Intent paramAnonymousIntent)
      {
        GMTrace.i(17146717405184L, 127753);
        int i = paramAnonymousIntent.getIntExtra("show", 0);
        paramAnonymousContext = (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.a.b)((android.support.v4.app.n)SnsAdNativeLandingPagesUI.a(SnsAdNativeLandingPagesUI.this).xH).I(SnsAdNativeLandingPagesUI.a(SnsAdNativeLandingPagesUI.this).xI);
        w.d("MicroMsg.SnsAdNativeLandingPagesUI", "recv videoProgressbarStatusChangeReceiver show %d", new Object[] { Integer.valueOf(i) });
        if (paramAnonymousContext.bls())
        {
          paramAnonymousContext.blr();
          GMTrace.o(17146717405184L, 127753);
          return;
        }
        paramAnonymousContext.blq();
        GMTrace.o(17146717405184L, 127753);
      }
    };
    this.pXw = new BroadcastReceiver()
    {
      public final void onReceive(Context paramAnonymousContext, Intent paramAnonymousIntent)
      {
        GMTrace.i(17138530123776L, 127692);
        SnsAdNativeLandingPagesUI.b(SnsAdNativeLandingPagesUI.this);
        GMTrace.o(17138530123776L, 127692);
      }
    };
    this.pXx = new b.a()
    {
      public final void a(final com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.a.b paramAnonymousb)
      {
        GMTrace.i(17147254276096L, 127757);
        paramAnonymousb = paramAnonymousb.blo();
        if (paramAnonymousb != null) {
          paramAnonymousb.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener()
          {
            public final boolean onPreDraw()
            {
              GMTrace.i(17137859035136L, 127687);
              paramAnonymousb.getViewTreeObserver().removeOnPreDrawListener(this);
              SnsAdNativeLandingPagesUI.c(SnsAdNativeLandingPagesUI.this);
              SnsAdNativeLandingPagesUI.d(SnsAdNativeLandingPagesUI.this);
              GMTrace.o(17137859035136L, 127687);
              return true;
            }
          });
        }
        GMTrace.o(17147254276096L, 127757);
      }
    };
    this.pXy = new ViewPager.h()
    {
      public final void V(int paramAnonymousInt)
      {
        GMTrace.i(17139066994688L, 127696);
        super.V(paramAnonymousInt);
        int i = 0;
        if (i < SnsAdNativeLandingPagesUI.this.pWU.size())
        {
          Object localObject = (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.c)SnsAdNativeLandingPagesUI.this.pWU.get(i);
          localObject = (Fragment)SnsAdNativeLandingPagesUI.f(SnsAdNativeLandingPagesUI.this).get(Integer.valueOf(((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.c)localObject).id));
          if (localObject != null)
          {
            if (i != paramAnonymousInt) {
              break label90;
            }
            ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.a.b)localObject).blr();
          }
          for (;;)
          {
            i += 1;
            break;
            label90:
            ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.a.b)localObject).blq();
          }
        }
        GMTrace.o(17139066994688L, 127696);
      }
      
      public final void W(int paramAnonymousInt)
      {
        GMTrace.i(17138932776960L, 127695);
        super.W(paramAnonymousInt);
        SnsAdNativeLandingPagesUI.e(SnsAdNativeLandingPagesUI.this).pKw = paramAnonymousInt;
        Object localObject;
        if (paramAnonymousInt == 1)
        {
          paramAnonymousInt = 0;
          while (paramAnonymousInt < SnsAdNativeLandingPagesUI.this.pWU.size())
          {
            localObject = (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.c)SnsAdNativeLandingPagesUI.this.pWU.get(paramAnonymousInt);
            localObject = (Fragment)SnsAdNativeLandingPagesUI.f(SnsAdNativeLandingPagesUI.this).get(Integer.valueOf(((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.c)localObject).id));
            if (localObject != null) {
              ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.a.b)localObject).blq();
            }
            paramAnonymousInt += 1;
          }
          com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.ab.dg(SnsAdNativeLandingPagesUI.this.vKB.vKW);
          GMTrace.o(17138932776960L, 127695);
          return;
        }
        if (paramAnonymousInt == 0)
        {
          localObject = (Fragment)SnsAdNativeLandingPagesUI.f(SnsAdNativeLandingPagesUI.this).get(Integer.valueOf(((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.c)SnsAdNativeLandingPagesUI.this.pWU.get(SnsAdNativeLandingPagesUI.a(SnsAdNativeLandingPagesUI.this).xI)).id));
          if (localObject != null) {
            ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.a.b)localObject).blr();
          }
        }
        GMTrace.o(17138932776960L, 127695);
      }
      
      public final void a(int paramAnonymousInt1, float paramAnonymousFloat, int paramAnonymousInt2)
      {
        GMTrace.i(17138798559232L, 127694);
        super.a(paramAnonymousInt1, paramAnonymousFloat, paramAnonymousInt2);
        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.a.b localb = SnsAdNativeLandingPagesUI.e(SnsAdNativeLandingPagesUI.this);
        if (localb.pKq != null) {
          localb.pKq.bkD();
        }
        if (SnsAdNativeLandingPagesUI.this.vKB.vLo == 1) {
          SnsAdNativeLandingPagesUI.this.aLo();
        }
        GMTrace.o(17138798559232L, 127694);
      }
    };
    this.pXz = new HashMap();
    this.pXA = true;
    this.lKN = new com.tencent.mm.ui.snackbar.b.b()
    {
      public final void aEW()
      {
        GMTrace.i(17148596453376L, 127767);
        try
        {
          AdLandingPagesProxy.getInstance().favEditTag();
          GMTrace.o(17148596453376L, 127767);
          return;
        }
        catch (Exception localException)
        {
          w.e("MicroMsg.SnsAdNativeLandingPagesUI", "favorite edittag fail, ex = " + localException.getMessage());
          GMTrace.o(17148596453376L, 127767);
        }
      }
    };
    this.pXB = new BroadcastReceiver()
    {
      public final void onReceive(Context paramAnonymousContext, Intent paramAnonymousIntent)
      {
        GMTrace.i(17132892979200L, 127650);
        if (paramAnonymousIntent.getAction().equals("android.intent.action.SCREEN_OFF"))
        {
          w.d("MicroMsg.SnsAdNativeLandingPagesUI", "android.intent.action.SCREEN_OFF");
          GMTrace.o(17132892979200L, 127650);
          return;
        }
        if (paramAnonymousIntent.getAction().equals("android.intent.action.SCREEN_ON"))
        {
          w.d("MicroMsg.SnsAdNativeLandingPagesUI", "android.intent.action.SCREEN_ON");
          SnsAdNativeLandingPagesUI.b(SnsAdNativeLandingPagesUI.this);
        }
        GMTrace.o(17132892979200L, 127650);
      }
    };
    GMTrace.o(8524704776192L, 63514);
  }
  
  private void bof()
  {
    GMTrace.i(17142019784704L, 127718);
    if (this.pWU == null)
    {
      GMTrace.o(17142019784704L, 127718);
      return;
    }
    Iterator localIterator = this.pWU.iterator();
    while (localIterator.hasNext())
    {
      Object localObject = (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.c)localIterator.next();
      localObject = (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.a.b)this.pXz.get(Integer.valueOf(((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.c)localObject).id));
      if (localObject != null)
      {
        ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.a.b)localObject).pKu = true;
        if (((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.a.b)localObject).pKs) {
          ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.a.b)localObject).bll();
        }
      }
    }
    ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.a.b)this.pXz.get(Integer.valueOf(((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.c)this.pWU.getFirst()).id))).blr();
    GMTrace.o(17142019784704L, 127718);
  }
  
  private void bog()
  {
    GMTrace.i(17142154002432L, 127719);
    Iterator localIterator = ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.a.c)this.pXn.xH).pp.iterator();
    while (localIterator.hasNext())
    {
      com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.a.b localb = (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.a.b)localIterator.next();
      if ((localb.pKq != null) && (localb.getUserVisibleHint())) {
        localb.pKq.blg();
      }
    }
    GMTrace.o(17142154002432L, 127719);
  }
  
  private void boi()
  {
    int j = 1;
    GMTrace.i(8525778518016L, 63522);
    Object localObject2;
    label66:
    Object localObject3;
    int i;
    if (this.pWU != null)
    {
      localObject1 = this.pWU.iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.c)((Iterator)localObject1).next()).pLi;
        if (localObject2 != null)
        {
          localObject2 = ((List)localObject2).iterator();
          if (((Iterator)localObject2).hasNext())
          {
            localObject3 = (s)((Iterator)localObject2).next();
            if (this.pEM != 0) {
              break label135;
            }
          }
          label135:
          for (i = this.cfz;; i = this.pEM)
          {
            ((s)localObject3).uJ(i);
            ((s)localObject3).hU(pXf);
            ((s)localObject3).If(this.pyc);
            ((s)localObject3).Ig(this.uin);
            break label66;
            break;
          }
        }
      }
    }
    Object localObject1 = (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.a.c)this.pXn.xH;
    if (localObject1 == null)
    {
      localObject1 = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.a.c(aR(), new ArrayList());
      this.pXn.a((u)localObject1);
    }
    for (;;)
    {
      i = 0;
      if (i < this.pWU.size())
      {
        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.c localc = (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.c)this.pWU.get(i);
        Object localObject4;
        boolean bool1;
        label277:
        label287:
        boolean bool2;
        if (localc.pEK)
        {
          localObject3 = (Fragment)this.pXz.get(Integer.valueOf(localc.id));
          if (localObject3 != null) {
            break label408;
          }
          localObject3 = this.pXn;
          localObject4 = this.pKr;
          if (i != this.pWU.size() - 1) {
            break label391;
          }
          bool1 = true;
          if (i != 0) {
            break label396;
          }
          localObject2 = this.pXx;
          boolean bool3 = this.pWZ;
          if ((this.pXo & 0x8) != 0) {
            break label402;
          }
          bool2 = true;
          label306:
          localObject2 = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.a.b.a(localc, (DummyViewPager)localObject3, (z)localObject4, bool1, (b.a)localObject2, bool3, bool2);
          this.pXz.put(Integer.valueOf(localc.id), localObject2);
          label344:
          ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.a.c)localObject1).pp.remove(localObject2);
          if (i < ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.a.c)localObject1).pp.size()) {
            break label448;
          }
          ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.a.c)localObject1).pp.add(localObject2);
        }
        for (;;)
        {
          i += 1;
          break;
          label391:
          bool1 = false;
          break label277;
          label396:
          localObject2 = null;
          break label287;
          label402:
          bool2 = false;
          break label306;
          label408:
          localObject4 = (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.a.b)localObject3;
          localObject2 = localObject3;
          if (((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.a.b)localObject4).pKl == localc) {
            break label344;
          }
          ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.a.b)localObject4).pKl = localc;
          ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.a.b)localObject4).ayZ();
          localObject2 = localObject3;
          break label344;
          label448:
          ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.a.c)localObject1).pp.add(i, localObject2);
        }
      }
      ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.a.c)localObject1).notifyDataSetChanged();
      localObject1 = this.pXn;
      i = this.pWU.size();
      if (i <= 0)
      {
        new StringBuilder("Requested offscreen page limit ").append(i).append(" too small; defaulting to 1");
        i = j;
      }
      for (;;)
      {
        if (i != ((AdLandingViewPager)localObject1).xZ)
        {
          ((AdLandingViewPager)localObject1).xZ = i;
          ((AdLandingViewPager)localObject1).populate();
        }
        GMTrace.o(8525778518016L, 63522);
        return;
      }
    }
  }
  
  private List<com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.i> boj()
  {
    GMTrace.i(18573586071552L, 138384);
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.a.c)this.pXn.xH).pp.iterator();
    while (localIterator.hasNext()) {
      localArrayList.addAll(((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.a.b)localIterator.next()).blp());
    }
    GMTrace.o(18573586071552L, 138384);
    return localArrayList;
  }
  
  private List<com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.i> bok()
  {
    GMTrace.i(17839549317120L, 132915);
    ArrayList localArrayList = new ArrayList();
    localArrayList.addAll(((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.a.b)this.pXz.get(Integer.valueOf(((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.c)this.pWU.getFirst()).id))).blp());
    GMTrace.o(17839549317120L, 132915);
    return localArrayList;
  }
  
  private void bol()
  {
    GMTrace.i(16257524957184L, 121128);
    w.i("MicroMsg.SnsAdNativeLandingPagesUI", "setFullScreen");
    if (Build.VERSION.SDK_INT < 16)
    {
      getWindow().setFlags(1024, 1024);
      GMTrace.o(16257524957184L, 121128);
      return;
    }
    getWindow().getDecorView().setSystemUiVisibility(5126);
    GMTrace.o(16257524957184L, 121128);
  }
  
  private boolean bom()
  {
    GMTrace.i(8526315388928L, 63526);
    if (this.pXo != 0)
    {
      if (((this.pXo & 0x4) == 0) || ((this.pXo & 0x2) == 0) || ((this.pXo & 0x1) == 0))
      {
        GMTrace.o(8526315388928L, 63526);
        return true;
      }
      GMTrace.o(8526315388928L, 63526);
      return false;
    }
    GMTrace.o(8526315388928L, 63526);
    return true;
  }
  
  private void bon()
  {
    GMTrace.i(17142422437888L, 127721);
    Object localObject2 = bok();
    Object localObject1 = new LinkedList();
    localObject2 = ((List)localObject2).iterator();
    while (((Iterator)localObject2).hasNext()) {
      ((LinkedList)localObject1).add((View)((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.i)((Iterator)localObject2).next()).getView().getParent());
    }
    this.pXs = null;
    if (this.pXq != null) {
      this.pXq.clear();
    }
    if (!((LinkedList)localObject1).isEmpty())
    {
      this.pXs = ((View)((LinkedList)localObject1).removeFirst());
      if (this.pXq == null) {
        this.pXq = new LinkedList();
      }
      this.pXq.clear();
      int i = this.pXs.getHeight();
      localObject1 = ((LinkedList)localObject1).iterator();
      int j;
      do
      {
        if (!((Iterator)localObject1).hasNext()) {
          break;
        }
        localObject2 = (View)((Iterator)localObject1).next();
        j = i + ((View)localObject2).getHeight();
        this.pXq.add(localObject2);
        i = j;
      } while (j < this.jsi);
    }
    GMTrace.o(17142422437888L, 127721);
  }
  
  private a boo()
  {
    GMTrace.i(20830859821056L, 155202);
    Object localObject = new com.tencent.mm.plugin.sns.storage.b(this.pXa);
    if (((com.tencent.mm.plugin.sns.storage.b)localObject).bkg())
    {
      int i = AdLandingPagesProxy.getInstance().getAdVoteIndex(((com.tencent.mm.plugin.sns.storage.b)localObject).pDw.pDA, this.pyc, this.uin);
      if ((i > 0) && (i <= ((com.tencent.mm.plugin.sns.storage.b)localObject).pDw.pDB.size()))
      {
        localObject = (b.c)((com.tencent.mm.plugin.sns.storage.b)localObject).pDw.pDB.get(i - 1);
        a locala = new a();
        if (!bg.nm(((b.c)localObject).kBR))
        {
          locala.kBR = ((b.c)localObject).kBR;
          if (bg.nm(((b.c)localObject).pDC)) {
            break label170;
          }
          locala.pDC = ((b.c)localObject).pDC;
          label130:
          if (bg.nm(((b.c)localObject).pDD)) {
            break label181;
          }
        }
        label170:
        label181:
        for (locala.pDD = ((b.c)localObject).pDD;; locala.pDD = this.pXe)
        {
          GMTrace.o(20830859821056L, 155202);
          return locala;
          locala.kBR = this.kBR;
          break;
          locala.pDC = this.pDC;
          break label130;
        }
      }
    }
    GMTrace.o(20830859821056L, 155202);
    return null;
  }
  
  private String bop()
  {
    GMTrace.i(20830994038784L, 155203);
    Object localObject = new bhf();
    ((bhf)localObject).uTb = new bhg();
    ((bhf)localObject).uTb.uTf = this.pXg.pyc;
    ((bhf)localObject).uTb.uTe = this.pXg.eUg;
    ((bhf)localObject).uTb.gVx = this.gVx;
    try
    {
      localObject = Base64.encodeToString(((bhf)localObject).toByteArray(), 2);
      GMTrace.o(20830994038784L, 155203);
      return (String)localObject;
    }
    catch (Exception localException)
    {
      GMTrace.o(20830994038784L, 155203);
    }
    return "";
  }
  
  private String boq()
  {
    GMTrace.i(20831128256512L, 155204);
    String str = this.pXa.replaceAll("(?s)<adCanvasInfoLeft[^>]*>.*?</adCanvasInfoLeft>", "").replaceAll("(?s)<adCanvasInfoRight[^>]*>.*?</adCanvasInfoRight>", "");
    GMTrace.o(20831128256512L, 155204);
    return str;
  }
  
  private boolean ctR()
  {
    GMTrace.i(21064935538688L, 156946);
    if (this.yvo == 0)
    {
      GMTrace.o(21064935538688L, 156946);
      return true;
    }
    GMTrace.o(21064935538688L, 156946);
    return false;
  }
  
  private boolean isFullScreen()
  {
    GMTrace.i(16257390739456L, 121127);
    if (this.pWU != null)
    {
      Iterator localIterator1 = this.pWU.iterator();
      int i = 0;
      for (;;)
      {
        j = i;
        if (!localIterator1.hasNext()) {
          break label89;
        }
        Iterator localIterator2 = ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.c)localIterator1.next()).pLi.iterator();
        if (localIterator2.hasNext())
        {
          if (((s)localIterator2.next()).type != 82) {
            break;
          }
          i = 1;
        }
      }
    }
    int j = 0;
    label89:
    if (j == 0)
    {
      GMTrace.o(16257390739456L, 121127);
      return true;
    }
    GMTrace.o(16257390739456L, 121127);
    return false;
  }
  
  private void rw()
  {
    GMTrace.i(17142288220160L, 127720);
    Object localObject3 = boj();
    this.iyB += System.currentTimeMillis() - this.startTime;
    this.pXg.pLM = ((int)this.iyB);
    Object localObject1 = this.pXg;
    int j;
    if (this.pWU == null)
    {
      j = 0;
      ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.g)localObject1).pLL = j;
      localObject1 = this.pXg;
      localObject2 = new JSONArray();
      localObject3 = ((List)localObject3).iterator();
      while (((Iterator)localObject3).hasNext())
      {
        Object localObject4 = (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.i)((Iterator)localObject3).next();
        if (!((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.i)localObject4).bkM().pEL)
        {
          JSONObject localJSONObject = new JSONObject();
          if (!((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.i)localObject4).q((JSONArray)localObject2))
          {
            if (((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.i)localObject4).L(localJSONObject)) {
              ((JSONArray)localObject2).put(localJSONObject);
            }
            if ((localObject4 instanceof com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.n))
            {
              localObject4 = ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.n)localObject4).bkV().iterator();
              while (((Iterator)localObject4).hasNext()) {
                ((JSONArray)localObject2).put((JSONObject)((Iterator)localObject4).next());
              }
            }
          }
        }
      }
    }
    Object localObject2 = this.pWU.iterator();
    for (int i = 0;; i = ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.c)((Iterator)localObject2).next()).pLi.size() + i)
    {
      j = i;
      if (!((Iterator)localObject2).hasNext()) {
        break;
      }
    }
    ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.g)localObject1).pLP = ((JSONArray)localObject2).toString();
    w.d("MicroMsg.AdLandingPagesReportInfo", "componentsStatStr:%s", new Object[] { ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.g)localObject1).pLP });
    if (!bg.nm(((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.g)localObject1).pLP)) {}
    try
    {
      ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.g)localObject1).pLP = URLEncoder.encode(((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.g)localObject1).pLP, "UTF-8");
      localObject1 = this.pXg.blx();
      if (AdLandingPagesProxy.getInstance().isRecExpAd(this.pXg.eUg))
      {
        com.tencent.mm.plugin.report.service.g.ork.A(14650, (String)localObject1);
        w.i("MicroMsg.SnsAdNativeLandingPagesUI", "post kv stat 14650 data: " + (String)localObject1);
        GMTrace.o(17142288220160L, 127720);
        return;
      }
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      for (;;)
      {
        w.e("MicroMsg.AdLandingPagesReportInfo", "not support encode " + localUnsupportedEncodingException.toString());
      }
      com.tencent.mm.plugin.report.service.g.ork.A(13387, localUnsupportedEncodingException);
      w.i("MicroMsg.SnsAdNativeLandingPagesUI", "post kv stat 13387 data: " + localUnsupportedEncodingException);
      GMTrace.o(17142288220160L, 127720);
    }
  }
  
  @TargetApi(16)
  protected final void MP()
  {
    GMTrace.i(8526046953472L, 63524);
    super.MP();
    this.pKI = findViewById(i.f.bZf);
    this.pXn = ((AdlandingDummyViewPager)findViewById(i.f.pew));
    Object localObject = this.pXn;
    ViewPager.e locale = this.pXy;
    ((AdlandingDummyViewPager)localObject).pKf.add(locale);
    this.lje = ((ImageView)findViewById(i.f.bCu));
    this.pWW = ((ImageView)findViewById(i.f.pch));
    this.jru = ((ImageView)findViewById(i.f.pcg));
    this.jru.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(15293841670144L, 113948);
        if (SnsAdNativeLandingPagesUI.this.vKB.vLo == 1) {
          SnsAdNativeLandingPagesUI.this.aLo();
        }
        SnsAdNativeLandingPagesUI.this.alL();
        GMTrace.o(15293841670144L, 113948);
      }
    });
    this.pWV = ((ImageView)findViewById(i.f.pcv));
    int i = i.c.white;
    if (!ctR())
    {
      this.pWW.setVisibility(4);
      i = i.c.black;
    }
    localObject = this.jru.getDrawable();
    if (localObject != null)
    {
      android.support.v4.b.a.a.a((Drawable)localObject, android.support.v4.content.a.c(this, i));
      this.jru.setImageDrawable((Drawable)localObject);
    }
    localObject = this.pWV.getDrawable();
    if (localObject != null)
    {
      android.support.v4.b.a.a.a((Drawable)localObject, android.support.v4.content.a.c(this, i));
      this.pWV.setImageDrawable((Drawable)localObject);
    }
    if (bom()) {
      this.pWV.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(final View paramAnonymousView)
        {
          GMTrace.i(17138395906048L, 127691);
          paramAnonymousView = new com.tencent.mm.ui.widget.f(SnsAdNativeLandingPagesUI.this, com.tencent.mm.ui.widget.f.xpQ, false);
          paramAnonymousView.qik = new p.c()
          {
            public final void a(com.tencent.mm.ui.base.n paramAnonymous2n)
            {
              GMTrace.i(17137322164224L, 127683);
              if ((SnsAdNativeLandingPagesUI.s(SnsAdNativeLandingPagesUI.this) == 0) || ((SnsAdNativeLandingPagesUI.s(SnsAdNativeLandingPagesUI.this) & 0x2) == 0)) {
                paramAnonymous2n.a(1, SnsAdNativeLandingPagesUI.this.getString(i.j.dSm), i.i.cKE);
              }
              if ((SnsAdNativeLandingPagesUI.s(SnsAdNativeLandingPagesUI.this) == 0) || ((SnsAdNativeLandingPagesUI.s(SnsAdNativeLandingPagesUI.this) & 0x1) == 0)) {
                paramAnonymous2n.a(2, SnsAdNativeLandingPagesUI.this.getString(i.j.piz), i.i.cKu);
              }
              if (((SnsAdNativeLandingPagesUI.s(SnsAdNativeLandingPagesUI.this) == 0) || ((SnsAdNativeLandingPagesUI.s(SnsAdNativeLandingPagesUI.this) & 0x4) == 0)) && (SnsAdNativeLandingPagesUI.t(SnsAdNativeLandingPagesUI.this) != 7)) {
                paramAnonymous2n.a(3, SnsAdNativeLandingPagesUI.this.getString(i.j.dfl), i.i.cKn);
              }
              GMTrace.o(17137322164224L, 127683);
            }
          };
          paramAnonymousView.xqc = new f.a()
          {
            public final void onDismiss()
            {
              GMTrace.i(17138127470592L, 127689);
              SnsAdNativeLandingPagesUI.b(SnsAdNativeLandingPagesUI.this);
              GMTrace.o(17138127470592L, 127689);
            }
          };
          paramAnonymousView.qil = new p.d()
          {
            public final void c(MenuItem paramAnonymous2MenuItem, int paramAnonymous2Int)
            {
              GMTrace.i(17132624543744L, 127648);
              SnsAdNativeLandingPagesUI.b(SnsAdNativeLandingPagesUI.this);
              if (paramAnonymous2MenuItem != null) {
                switch (paramAnonymous2MenuItem.getItemId())
                {
                }
              }
              for (;;)
              {
                GMTrace.o(17132624543744L, 127648);
                return;
                SnsAdNativeLandingPagesUI.u(SnsAdNativeLandingPagesUI.this);
                GMTrace.o(17132624543744L, 127648);
                return;
                SnsAdNativeLandingPagesUI.v(SnsAdNativeLandingPagesUI.this);
                GMTrace.o(17132624543744L, 127648);
                return;
                SnsAdNativeLandingPagesUI.w(SnsAdNativeLandingPagesUI.this);
              }
            }
          };
          paramAnonymousView.rRu = true;
          if (!SnsAdNativeLandingPagesUI.x(SnsAdNativeLandingPagesUI.this))
          {
            SnsAdNativeLandingPagesUI.this.aLo();
            SnsAdNativeLandingPagesUI.y(SnsAdNativeLandingPagesUI.this).postDelayed(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(17148328017920L, 127765);
                paramAnonymousView.bFk();
                GMTrace.o(17148328017920L, 127765);
              }
            }, 300L);
            GMTrace.o(17138395906048L, 127691);
            return;
          }
          paramAnonymousView.bFk();
          GMTrace.o(17138395906048L, 127691);
        }
      });
    }
    for (;;)
    {
      this.pXd = ((ImageView)findViewById(i.f.pdx));
      if ((this.pWU != null) && (this.pWU.size() != 0)) {
        break;
      }
      w.e("MicroMsg.SnsAdNativeLandingPagesUI", "landingPages is null");
      GMTrace.o(8526046953472L, 63524);
      return;
      this.pWV.setVisibility(8);
    }
    boi();
    this.pWY = new b(this.vKB.vKW);
    this.pKI.addOnLayoutChangeListener(new View.OnLayoutChangeListener()
    {
      public final void onLayoutChange(View paramAnonymousView, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3, int paramAnonymousInt4, int paramAnonymousInt5, int paramAnonymousInt6, int paramAnonymousInt7, int paramAnonymousInt8)
      {
        GMTrace.i(17139335430144L, 127698);
        if (SnsAdNativeLandingPagesUI.z(SnsAdNativeLandingPagesUI.this).getHeight() == SnsAdNativeLandingPagesUI.A(SnsAdNativeLandingPagesUI.this))
        {
          SnsAdNativeLandingPagesUI.z(SnsAdNativeLandingPagesUI.this).removeOnLayoutChangeListener(this);
          SnsAdNativeLandingPagesUI.c(SnsAdNativeLandingPagesUI.this);
          SnsAdNativeLandingPagesUI.d(SnsAdNativeLandingPagesUI.this);
        }
        GMTrace.o(17139335430144L, 127698);
      }
    });
    GMTrace.o(8526046953472L, 63524);
  }
  
  protected final int Qf()
  {
    GMTrace.i(8524973211648L, 63516);
    GMTrace.o(8524973211648L, 63516);
    return 1;
  }
  
  public final void Zp()
  {
    GMTrace.i(8525644300288L, 63521);
    this.pXg.fJC = 2;
    com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.g localg = this.pXg;
    localg.pLK += 1;
    super.Zp();
    GMTrace.o(8525644300288L, 63521);
  }
  
  public final void alL()
  {
    GMTrace.i(8526986477568L, 63531);
    bog();
    rw();
    this.pXh = true;
    if (!this.pWZ)
    {
      finish();
      GMTrace.o(8526986477568L, 63531);
      return;
    }
    try
    {
      ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.i)bok().get(0)).bkO();
      this.pXn.c(0, false);
      RecyclerView localRecyclerView = ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.a.b)this.pXz.get(Integer.valueOf(((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.c)this.pWU.getFirst()).id))).blo();
      if (localRecyclerView != null) {
        ((LinearLayoutManager)localRecyclerView.SW).J(0, 0);
      }
      bog();
      if (this.pXs != null)
      {
        this.pXs.postDelayed(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(17133027196928L, 127651);
            SnsAdNativeLandingPagesUI.J(SnsAdNativeLandingPagesUI.this);
            SnsAdNativeLandingPagesUI.K(SnsAdNativeLandingPagesUI.this);
            SnsAdNativeLandingPagesUI.this.pWY.p(SnsAdNativeLandingPagesUI.L(SnsAdNativeLandingPagesUI.this), SnsAdNativeLandingPagesUI.M(SnsAdNativeLandingPagesUI.this), SnsAdNativeLandingPagesUI.N(SnsAdNativeLandingPagesUI.this), SnsAdNativeLandingPagesUI.O(SnsAdNativeLandingPagesUI.this));
            Object localObject1 = SnsAdNativeLandingPagesUI.this.pWY;
            View localView = SnsAdNativeLandingPagesUI.P(SnsAdNativeLandingPagesUI.this);
            LinkedList localLinkedList = SnsAdNativeLandingPagesUI.Q(SnsAdNativeLandingPagesUI.this);
            Object localObject2 = SnsAdNativeLandingPagesUI.R(SnsAdNativeLandingPagesUI.this);
            b.b local1 = new b.b()
            {
              public final void onAnimationEnd()
              {
                GMTrace.i(17139738083328L, 127701);
                new ae().post(new Runnable()
                {
                  public final void run()
                  {
                    GMTrace.i(17132087672832L, 127644);
                    SnsAdNativeLandingPagesUI.this.finish();
                    SnsAdNativeLandingPagesUI.this.overridePendingTransition(0, 0);
                    GMTrace.o(17132087672832L, 127644);
                  }
                });
                GMTrace.o(17139738083328L, 127701);
              }
              
              public final void onAnimationStart()
              {
                GMTrace.i(17139603865600L, 127700);
                SnsAdNativeLandingPagesUI.E(SnsAdNativeLandingPagesUI.this).setVisibility(8);
                GMTrace.o(17139603865600L, 127700);
              }
            };
            if ((Build.VERSION.SDK_INT < 12) || (localView == null) || (((b)localObject1).pNw == ((b)localObject1).pNt) || (((b)localObject1).pNw == ((b)localObject1).pNv) || (((b)localObject1).pNw == ((b)localObject1).pNs))
            {
              GMTrace.o(17133027196928L, 127651);
              return;
            }
            localView.getLocationOnScreen(new int[2]);
            ((b)localObject1).i(localView, true);
            if (localObject2 != null) {
              ((View)localObject2).animate().setDuration(300L).setInterpolator(new DecelerateInterpolator(1.2F)).alpha(0.0F);
            }
            localObject2 = new AnimationSet(true);
            Object localObject3 = new b.3((b)localObject1, ((b)localObject1).pNj, ((b)localObject1).pNj, localView, null);
            ((ScaleAnimation)localObject3).setDuration(300L);
            ((ScaleAnimation)localObject3).setInterpolator(new DecelerateInterpolator(1.2F));
            ((AnimationSet)localObject2).addAnimation((Animation)localObject3);
            localObject3 = new TranslateAnimation(0.0F, ((b)localObject1).pNf, 0.0F, ((b)localObject1).pNg);
            ((TranslateAnimation)localObject3).setDuration(300L);
            ((TranslateAnimation)localObject3).setInterpolator(new DecelerateInterpolator(1.2F));
            ((AnimationSet)localObject2).addAnimation((Animation)localObject3);
            ((AnimationSet)localObject2).setFillAfter(true);
            ((AnimationSet)localObject2).setAnimationListener(new b.4((b)localObject1, local1));
            localView.startAnimation((Animation)localObject2);
            localObject1 = localLinkedList.iterator();
            while (((Iterator)localObject1).hasNext()) {
              ((View)((Iterator)localObject1).next()).setAlpha(0.0F);
            }
            GMTrace.o(17133027196928L, 127651);
          }
        }, 10L);
        GMTrace.o(8526986477568L, 63531);
        return;
      }
      finish();
      overridePendingTransition(0, 0);
      GMTrace.o(8526986477568L, 63531);
      return;
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
  }
  
  public final void aoK()
  {
    GMTrace.i(16257659174912L, 121129);
    super.aoK();
    if (this.pXn != null) {
      this.pXn.postDelayed(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(17146985840640L, 127755);
          if (SnsAdNativeLandingPagesUI.this.vKB.vLo != 1) {
            SnsAdNativeLandingPagesUI.b(SnsAdNativeLandingPagesUI.this);
          }
          for (;;)
          {
            new ArrayList();
            Iterator localIterator = ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.a.c)SnsAdNativeLandingPagesUI.a(SnsAdNativeLandingPagesUI.this).xH).pp.iterator();
            while (localIterator.hasNext())
            {
              com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.a.b localb = (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.a.b)localIterator.next();
              int i = SnsAdNativeLandingPagesUI.this.vKB.vLo;
              localb.blk();
            }
            SnsAdNativeLandingPagesUI.S(SnsAdNativeLandingPagesUI.this);
          }
          GMTrace.o(17146985840640L, 127755);
        }
      }, 500L);
    }
    GMTrace.o(16257659174912L, 121129);
  }
  
  final void boh()
  {
    GMTrace.i(20830725603328L, 155201);
    Map localMap;
    HashMap localHashMap;
    String str2;
    int i;
    if (!bg.nm(this.pXc))
    {
      localMap = com.tencent.mm.c.f.q(this.pXc, "ADInfo");
      this.pyc = bg.aq((String)localMap.get("." + "ADInfo" + ".uxInfo"), "");
      this.pXg.pyc = this.pyc;
      this.pCr = bg.aq((String)localMap.get("." + "ADInfo" + ".session_data.aid"), "");
      this.hVd = bg.aq((String)localMap.get("." + "ADInfo" + ".session_data.trace_id"), "");
      localHashMap = new HashMap();
      str2 = "." + "ADInfo" + ".adCanvasExt.adCardItemList.cardItem";
      i = 0;
      if (i <= 0) {
        break label840;
      }
    }
    label675:
    label840:
    for (String str1 = str2 + i;; str1 = str2)
    {
      if (localMap.containsKey(str1 + ".cardTpId"))
      {
        String str3 = bg.aq((String)localMap.get(str1 + ".cardTpId"), "");
        str1 = bg.aq((String)localMap.get(str1 + ".cardExt"), "");
        if ((!bg.nm(str3)) && (!bg.nm(str1))) {
          localHashMap.put(str3, str1);
        }
        i += 1;
        break;
      }
      str1 = e.k(this.pXa, localHashMap);
      if (!bg.nm(str1)) {
        this.pXa = str1;
      }
      if (!bg.nm(this.pCr))
      {
        if (this.pXa.contains("<originAid>")) {
          this.pXa = this.pXa.replaceFirst("<originAid>[\\s\\S]*</originAid>", "<originAid>" + this.pCr + "</originAid>");
        }
      }
      else if (!bg.nm(this.hVd))
      {
        if (!this.pXa.contains("<originTraceId>")) {
          break label675;
        }
        this.pXa = this.pXa.replaceFirst("<originTraceId>[\\s\\S]*</originTraceId>", "<originTraceId>" + this.hVd + "</originTraceId>");
      }
      for (;;)
      {
        if (!bg.nm(this.pyc))
        {
          if (this.pXa.contains("<originUxInfo>"))
          {
            this.pXa = this.pXa.replaceFirst("<originUxInfo>[\\s\\S]*</originUxInfo>", "<originUxInfo>" + this.pyc + "</originUxInfo>");
            GMTrace.o(20830725603328L, 155201);
            return;
            this.pXa = this.pXa.replace("<" + this.pXb + ">", "<" + this.pXb + "><originAid>" + this.pCr + "</originAid>");
            break;
            this.pXa = this.pXa.replace("<" + this.pXb + ">", "<" + this.pXb + "><originTraceId>" + this.hVd + "</originTraceId>");
            continue;
          }
          this.pXa = this.pXa.replace("<" + this.pXb + ">", "<" + this.pXb + "><originUxInfo>" + this.pyc + "</originUxInfo>");
        }
      }
      GMTrace.o(20830725603328L, 155201);
      return;
    }
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(8526181171200L, 63525);
    int i = i.g.pfs;
    GMTrace.o(8526181171200L, 63525);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(8527657566208L, 63536);
    if (paramInt1 == 1) {
      if (paramInt2 == -1) {
        com.tencent.mm.ui.base.h.bm(this.vKB.vKW, this.vKB.vKW.getString(i.j.cUy));
      }
    }
    for (;;)
    {
      super.onActivityResult(paramInt1, paramInt2, paramIntent);
      GMTrace.o(8527657566208L, 63536);
      return;
      int i;
      if (paramInt1 == 2)
      {
        if (paramIntent.getBooleanExtra("kfavorite", false))
        {
          i = AdLandingPagesProxy.getInstance().doFav(paramIntent, 42);
          ((com.tencent.mm.plugin.fav.a.a)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.fav.a.a.class)).a(i, 42, this, this.lKN);
        }
      }
      else if (paramInt1 == v.pIP) {
        try
        {
          Object localObject = paramIntent.getStringExtra("KComponentCid");
          Iterator localIterator = boj().iterator();
          com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.i locali;
          do
          {
            if (!localIterator.hasNext()) {
              break;
            }
            locali = (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.i)localIterator.next();
          } while (!locali.bkN().equals(localObject));
          localObject = (v)locali;
          i = paramIntent.getIntExtra("KStreamVideoPlayCount", 0);
          int j = paramIntent.getIntExtra("KStreamVideoPlayCompleteCount", 0);
          int k = paramIntent.getIntExtra("KStreamVideoTotalPlayTimeInMs", 0);
          ((v)localObject).pnH = (i + ((v)localObject).pnH);
          ((v)localObject).pnI += j;
          ((v)localObject).pnJ += k;
        }
        catch (Exception localException) {}
      }
    }
  }
  
  public void onBackPressed()
  {
    GMTrace.i(8527120695296L, 63532);
    alL();
    GMTrace.o(8527120695296L, 63532);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(8524838993920L, 63515);
    super.onCreate(paramBundle);
    this.startTime = System.currentTimeMillis();
    this.fKc = System.currentTimeMillis();
    this.pXg.fKc = this.fKc;
    new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.b.a(this);
    bol();
    this.jsi = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.ab.df(this)[1];
    this.pWX = paramBundle;
    this.vKB.bXF();
    getWindow().addFlags(128);
    AdLandingPagesProxy.create(this.kSj);
    this.kSj.C(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(17137187946496L, 127682);
        AdlandingRemoteServiceConnectedReceiver.a(android.support.v4.content.d.l(SnsAdNativeLandingPagesUI.this));
        Object localObject3 = SnsAdNativeLandingPagesUI.this;
        ((SnsAdNativeLandingPagesUI)localObject3).pXt = AdLandingPagesProxy.getInstance().getSnsInfo(((SnsAdNativeLandingPagesUI)localObject3).eUg);
        AdLandingPagesProxy.getInstance().asyncCacheXml(((SnsAdNativeLandingPagesUI)localObject3).eUg);
        if (((SnsAdNativeLandingPagesUI)localObject3).values == null)
        {
          w.e("MicroMsg.SnsAdNativeLandingPagesUI", "parse landingpagexml is error,landingpagexml is " + ((SnsAdNativeLandingPagesUI)localObject3).pXa);
          SnsAdNativeLandingPagesUI.b(SnsAdNativeLandingPagesUI.this);
          SnsAdNativeLandingPagesUI.this.MP();
          SnsAdNativeLandingPagesUI.g(SnsAdNativeLandingPagesUI.this);
          if (SnsAdNativeLandingPagesUI.h(SnsAdNativeLandingPagesUI.this) == 1) {
            AdLandingPagesProxy.getInstance().doDynamicUpdateScene(SnsAdNativeLandingPagesUI.i(SnsAdNativeLandingPagesUI.this), SnsAdNativeLandingPagesUI.j(SnsAdNativeLandingPagesUI.this), SnsAdNativeLandingPagesUI.k(SnsAdNativeLandingPagesUI.this), new AdLandingPagesProxy.a()
            {
              public final void al(final Object paramAnonymous2Object)
              {
                GMTrace.i(17141482913792L, 127714);
                SnsAdNativeLandingPagesUI.l(SnsAdNativeLandingPagesUI.this).removeCallbacksAndMessages(null);
                SnsAdNativeLandingPagesUI.l(SnsAdNativeLandingPagesUI.this).post(new Runnable()
                {
                  public final void run()
                  {
                    GMTrace.i(17148059582464L, 127763);
                    SnsAdNativeLandingPagesUI.this.pWU = e.c(SnsAdNativeLandingPagesUI.m(SnsAdNativeLandingPagesUI.this), SnsAdNativeLandingPagesUI.n(SnsAdNativeLandingPagesUI.this), (String)paramAnonymous2Object, SnsAdNativeLandingPagesUI.o(SnsAdNativeLandingPagesUI.this), SnsAdNativeLandingPagesUI.p(SnsAdNativeLandingPagesUI.this));
                    af.t(new Runnable()
                    {
                      public final void run()
                      {
                        GMTrace.i(17147522711552L, 127759);
                        SnsAdNativeLandingPagesUI.q(SnsAdNativeLandingPagesUI.this);
                        GMTrace.o(17147522711552L, 127759);
                      }
                    });
                    GMTrace.o(17148059582464L, 127763);
                  }
                });
                GMTrace.o(17141482913792L, 127714);
              }
              
              public final void f(int paramAnonymous2Int1, int paramAnonymous2Int2, Object paramAnonymous2Object)
              {
                GMTrace.i(17839280881664L, 132913);
                GMTrace.o(17839280881664L, 132913);
              }
            });
          }
          SnsAdNativeLandingPagesUI.r(SnsAdNativeLandingPagesUI.this);
          GMTrace.o(17137187946496L, 127682);
          return;
        }
        Object localObject1;
        if ((((SnsAdNativeLandingPagesUI)localObject3).cfz == 1) || (((SnsAdNativeLandingPagesUI)localObject3).cfz == 2) || (((SnsAdNativeLandingPagesUI)localObject3).cfz == 14) || (((SnsAdNativeLandingPagesUI)localObject3).cfz == 9) || (((SnsAdNativeLandingPagesUI)localObject3).cfz == 10))
        {
          long l = 0L;
          if (((SnsAdNativeLandingPagesUI)localObject3).pXt != null)
          {
            l = ((SnsAdNativeLandingPagesUI)localObject3).pXt.field_snsId;
            if (TextUtils.isEmpty(((SnsAdNativeLandingPagesUI)localObject3).pCr)) {
              ((SnsAdNativeLandingPagesUI)localObject3).pCr = AdLandingPagesProxy.getInstance().getSnsAid(((SnsAdNativeLandingPagesUI)localObject3).eUg);
            }
            if (TextUtils.isEmpty(((SnsAdNativeLandingPagesUI)localObject3).hVd)) {
              ((SnsAdNativeLandingPagesUI)localObject3).hVd = AdLandingPagesProxy.getInstance().getSnsTraceid(((SnsAdNativeLandingPagesUI)localObject3).eUg);
            }
            ((SnsAdNativeLandingPagesUI)localObject3).gVx = AdLandingPagesProxy.getInstance().getSnsAdType(((SnsAdNativeLandingPagesUI)localObject3).eUg);
          }
          ((SnsAdNativeLandingPagesUI)localObject3).values.put("." + ((SnsAdNativeLandingPagesUI)localObject3).pXb + ".originSnsId", String.valueOf(l));
          ((SnsAdNativeLandingPagesUI)localObject3).values.put("." + ((SnsAdNativeLandingPagesUI)localObject3).pXb + ".originUxInfo", ((SnsAdNativeLandingPagesUI)localObject3).pyc);
          localObject1 = "<" + ((SnsAdNativeLandingPagesUI)localObject3).pXb + ">";
          localObject1 = (String)localObject1 + String.format("<originSnsId>%s</originSnsId>", new Object[] { Long.valueOf(l) });
          localObject1 = (String)localObject1 + String.format("<originUxInfo>%s</originUxInfo>", new Object[] { ((SnsAdNativeLandingPagesUI)localObject3).pyc });
          localObject1 = (String)localObject1 + String.format("<originAdType>%d</originAdType>", new Object[] { Integer.valueOf(((SnsAdNativeLandingPagesUI)localObject3).gVx) });
          localObject1 = (String)localObject1 + String.format("<originAid>%s</originAid>", new Object[] { ((SnsAdNativeLandingPagesUI)localObject3).pCr });
          localObject1 = (String)localObject1 + String.format("<originTraceId>%s</originTraceId>", new Object[] { ((SnsAdNativeLandingPagesUI)localObject3).hVd });
          ((SnsAdNativeLandingPagesUI)localObject3).pXa = ((SnsAdNativeLandingPagesUI)localObject3).pXa.replace("<" + ((SnsAdNativeLandingPagesUI)localObject3).pXb + ">", (CharSequence)localObject1);
          ((SnsAdNativeLandingPagesUI)localObject3).pXg.pyc = ((SnsAdNativeLandingPagesUI)localObject3).pyc;
          ((SnsAdNativeLandingPagesUI)localObject3).pXg.eUg = String.valueOf(l);
        }
        Object localObject2;
        Object localObject4;
        for (;;)
        {
          ((SnsAdNativeLandingPagesUI)localObject3).pXg.pLQ = AdLandingPagesProxy.getInstance().getSnsStatExtBySnsId(bg.Sz(((SnsAdNativeLandingPagesUI)localObject3).pXg.eUg));
          ((SnsAdNativeLandingPagesUI)localObject3).kBR = bg.aq((String)((SnsAdNativeLandingPagesUI)localObject3).values.get("." + ((SnsAdNativeLandingPagesUI)localObject3).pXb + ".adCanvasInfo.shareTitle"), "");
          ((SnsAdNativeLandingPagesUI)localObject3).kBQ = bg.aq((String)((SnsAdNativeLandingPagesUI)localObject3).values.get("." + ((SnsAdNativeLandingPagesUI)localObject3).pXb + ".adCanvasInfo.shareWebUrl"), "");
          ((SnsAdNativeLandingPagesUI)localObject3).pDC = bg.aq((String)((SnsAdNativeLandingPagesUI)localObject3).values.get("." + ((SnsAdNativeLandingPagesUI)localObject3).pXb + ".adCanvasInfo.shareDesc"), "");
          ((SnsAdNativeLandingPagesUI)localObject3).pXj = bg.Sy(bg.aq((String)((SnsAdNativeLandingPagesUI)localObject3).values.get("." + ((SnsAdNativeLandingPagesUI)localObject3).pXb + ".adCanvasInfo.bizId"), ""));
          ((SnsAdNativeLandingPagesUI)localObject3).pXk = bg.aq((String)((SnsAdNativeLandingPagesUI)localObject3).values.get("." + ((SnsAdNativeLandingPagesUI)localObject3).pXb + ".adCanvasInfo.shareAppId"), "");
          ((SnsAdNativeLandingPagesUI)localObject3).pXl = bg.aq((String)((SnsAdNativeLandingPagesUI)localObject3).values.get("." + ((SnsAdNativeLandingPagesUI)localObject3).pXb + ".adCanvasInfo.shareType"), "");
          ((SnsAdNativeLandingPagesUI)localObject3).pXm = bg.aq((String)((SnsAdNativeLandingPagesUI)localObject3).values.get("." + ((SnsAdNativeLandingPagesUI)localObject3).pXb + ".adCanvasInfo.userInfo"), "");
          ((SnsAdNativeLandingPagesUI)localObject3).pXo = bg.Sy(bg.aq((String)((SnsAdNativeLandingPagesUI)localObject3).values.get("." + ((SnsAdNativeLandingPagesUI)localObject3).pXb + ".adCanvasInfo.disableShareBitSet"), ""));
          ((SnsAdNativeLandingPagesUI)localObject3).yvo = bg.Sy(bg.aq((String)((SnsAdNativeLandingPagesUI)localObject3).values.get("." + ((SnsAdNativeLandingPagesUI)localObject3).pXb + ".adCanvasInfo.statusBarStyle"), ""));
          localObject1 = ((SnsAdNativeLandingPagesUI)localObject3).values;
          localObject2 = "." + ((SnsAdNativeLandingPagesUI)localObject3).pXb;
          localObject4 = (String)((Map)localObject1).get((String)localObject2 + ".adCanvasInfo.arrowDownIconStyle.iconUrl");
          if (!TextUtils.isEmpty((CharSequence)localObject4)) {
            break label1819;
          }
          ((SnsAdNativeLandingPagesUI)localObject3).pKr = null;
          label1229:
          ((SnsAdNativeLandingPagesUI)localObject3).uin = AdLandingPagesProxy.getInstance().getUin();
          ((SnsAdNativeLandingPagesUI)localObject3).boh();
          if (bg.nm(((SnsAdNativeLandingPagesUI)localObject3).pCr)) {
            ((SnsAdNativeLandingPagesUI)localObject3).pCr = bg.aq((String)((SnsAdNativeLandingPagesUI)localObject3).values.get("." + ((SnsAdNativeLandingPagesUI)localObject3).pXb + ".originAid"), "");
          }
          if (bg.nm(((SnsAdNativeLandingPagesUI)localObject3).hVd)) {
            ((SnsAdNativeLandingPagesUI)localObject3).hVd = bg.aq((String)((SnsAdNativeLandingPagesUI)localObject3).values.get("." + ((SnsAdNativeLandingPagesUI)localObject3).pXb + ".originTraceId"), "");
          }
          ((SnsAdNativeLandingPagesUI)localObject3).pWU = e.k(((SnsAdNativeLandingPagesUI)localObject3).pXa, ((SnsAdNativeLandingPagesUI)localObject3).pXb, ((SnsAdNativeLandingPagesUI)localObject3).pCr, ((SnsAdNativeLandingPagesUI)localObject3).hVd);
          if (((SnsAdNativeLandingPagesUI)localObject3).pWU.size() <= 0) {
            break;
          }
          localObject2 = "";
          localObject4 = (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.c)((SnsAdNativeLandingPagesUI)localObject3).pWU.get(0);
          localObject1 = localObject2;
          if (((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.c)localObject4).pLi.size() > 0)
          {
            localObject4 = (s)((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.c)localObject4).pLi.get(0);
            if (!(localObject4 instanceof com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.p)) {
              break label2127;
            }
            ((SnsAdNativeLandingPagesUI)localObject3).pXe = ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.p)localObject4).pEn;
            localObject1 = localObject2;
          }
          label1479:
          if (((SnsAdNativeLandingPagesUI)localObject3).pXt == null) {
            break label2294;
          }
          localObject2 = ((SnsAdNativeLandingPagesUI)localObject3).pXt.blD();
          if ((localObject2 == null) || (((biz)localObject2).uUc == null) || (((biz)localObject2).uUc.ueW == null) || (((biz)localObject2).uUc.ueW.isEmpty())) {
            break;
          }
          localObject3 = (anu)((biz)localObject2).uUc.ueW.getFirst();
          localObject2 = am.dE(AdLandingPagesProxy.getInstance().getAccSnsPath(), ((anu)localObject3).mmR) + com.tencent.mm.plugin.sns.data.i.j((anu)localObject3);
          localObject3 = ((anu)localObject3).lPM;
          if (!((String)localObject1).equals(localObject3)) {
            break;
          }
          localObject1 = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.d.dM("adId", (String)localObject3);
          if ((FileOp.aZ((String)localObject1)) || (!FileOp.aZ((String)localObject2))) {
            break;
          }
          w.i("MicroMsg.SnsAdNativeLandingPagesUI", "copy outsideFiel:%s->%s", new Object[] { localObject2, localObject1 });
          FileOp.o((String)localObject2, (String)localObject1);
          break;
          ((SnsAdNativeLandingPagesUI)localObject3).pXg.eUg = ((String)((SnsAdNativeLandingPagesUI)localObject3).values.get("." + ((SnsAdNativeLandingPagesUI)localObject3).pXb + ".originSnsId"));
          ((SnsAdNativeLandingPagesUI)localObject3).pXg.pyc = ((String)((SnsAdNativeLandingPagesUI)localObject3).values.get("." + ((SnsAdNativeLandingPagesUI)localObject3).pXb + ".originUxInfo"));
          ((SnsAdNativeLandingPagesUI)localObject3).pyc = ((SnsAdNativeLandingPagesUI)localObject3).pXg.pyc;
          ((SnsAdNativeLandingPagesUI)localObject3).gVx = bg.Sy((String)((SnsAdNativeLandingPagesUI)localObject3).values.get("." + ((SnsAdNativeLandingPagesUI)localObject3).pXb + ".originAdType"));
        }
        label1819:
        if (((SnsAdNativeLandingPagesUI)localObject3).pKr == null) {
          ((SnsAdNativeLandingPagesUI)localObject3).pKr = new z();
        }
        ((SnsAdNativeLandingPagesUI)localObject3).pKr.iconUrl = ((String)localObject4);
        int k = bg.Sy((String)((Map)localObject1).get((String)localObject2 + ".adCanvasInfo.sizeType"));
        int i = bg.Sy((String)((Map)localObject1).get((String)localObject2 + ".adCanvasInfo.basicRootFontSize"));
        int j = bg.Sy((String)((Map)localObject1).get((String)localObject2 + ".adCanvasInfo.basicWidth"));
        if ((i == 0) && (k == 1)) {
          i = e.pLs;
        }
        for (;;)
        {
          if ((j == 0) && (k == 1)) {
            j = e.pLr;
          }
          for (;;)
          {
            ((SnsAdNativeLandingPagesUI)localObject3).pKr.pEC = e.a(bg.SA((String)((Map)localObject1).get((String)localObject2 + ".adCanvasInfo.arrowDownIconStyle.paddingBottom")), k, j, i);
            ((SnsAdNativeLandingPagesUI)localObject3).pKr.width = e.a(bg.SA((String)((Map)localObject1).get((String)localObject2 + ".adCanvasInfo.arrowDownIconStyle.layoutWidth")), k, j, i);
            ((SnsAdNativeLandingPagesUI)localObject3).pKr.height = e.a(bg.SA((String)((Map)localObject1).get((String)localObject2 + ".adCanvasInfo.arrowDownIconStyle.layoutHeight")), k, j, i);
            break label1229;
            label2127:
            if ((localObject4 instanceof o))
            {
              ((SnsAdNativeLandingPagesUI)localObject3).pXe = ((o)localObject4).pEn;
              localObject1 = localObject2;
              break label1479;
            }
            if ((localObject4 instanceof q))
            {
              ((SnsAdNativeLandingPagesUI)localObject3).pXe = ((q)localObject4).pEq;
              localObject1 = ((q)localObject4).pEp;
              break label1479;
            }
            localObject1 = localObject2;
            if (!(localObject4 instanceof com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.n)) {
              break label1479;
            }
            localObject4 = (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.n)localObject4;
            localObject1 = localObject2;
            if (((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.n)localObject4).pEj.isEmpty()) {
              break label1479;
            }
            localObject4 = (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.m)((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.n)localObject4).pEj.getFirst();
            localObject1 = localObject2;
            if (((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.m)localObject4).pEj.isEmpty()) {
              break label1479;
            }
            localObject4 = (s)((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.m)localObject4).pEj.getFirst();
            localObject1 = localObject2;
            if (!(localObject4 instanceof com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.p)) {
              break label1479;
            }
            ((SnsAdNativeLandingPagesUI)localObject3).pXe = ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.p)localObject4).pEn;
            localObject1 = localObject2;
            break label1479;
            label2294:
            break;
          }
        }
      }
    });
    this.cfz = getIntent().getIntExtra("sns_landig_pages_from_source", 1);
    this.pEM = getIntent().getIntExtra("sns_landig_pages_origin_from_source", 0);
    this.pXa = getIntent().getStringExtra("sns_landing_pages_xml");
    this.pXa = this.pXa.replaceAll("</*RecXml[\\s|\\S]*?>", "");
    this.pXg.pyf = getIntent().getStringExtra("sns_landing_pages_expid");
    this.pXb = getIntent().getStringExtra("sns_landing_pages_xml_prefix");
    this.eUg = getIntent().getStringExtra("sns_landing_pages_share_sns_id");
    this.pyc = getIntent().getStringExtra("sns_landing_pages_ux_info");
    this.pCr = getIntent().getStringExtra("sns_landing_pages_aid");
    this.hVd = getIntent().getStringExtra("sns_landing_pages_traceid");
    paramBundle = getIntent().getStringExtra("sns_landing_pages_search_extra");
    com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.g localg = this.pXg;
    if (!TextUtils.isEmpty(paramBundle))
    {
      if (localg.extra.length() > 0) {
        localg.extra += "&";
      }
      localg.extra = (localg.extra + "searchextra=" + URLEncoder.encode(paramBundle));
    }
    paramBundle = getIntent().getStringExtra("sns_landing_pages_extra");
    localg = this.pXg;
    if (!TextUtils.isEmpty(paramBundle)) {
      localg.extra = (localg.extra + "&extra1=" + URLEncoder.encode(paramBundle));
    }
    pXf = getIntent().getBooleanExtra("sns_landing_is_native_sight_ad", false);
    this.pDb = getIntent().getIntExtra("sns_landing_pages_rec_src", 0);
    this.pXi = getIntent().getIntExtra("sns_landing_pages_from_outer_index", 0);
    this.pXc = getIntent().getStringExtra("sns_landing_pages_ad_info");
    this.pWZ = getIntent().getBooleanExtra("sns_landing_pages_need_enter_and_exit_animation", false);
    if (this.pWZ) {
      this.pXg.pLF = 0;
    }
    for (this.pXg.fJC = 0;; this.pXg.fJC = 1)
    {
      this.pXg.pLG = this.cfz;
      this.pXg.pLH = 0;
      this.pXg.pLI = 0;
      this.pXg.pLJ = 1;
      this.pXg.pLK = 0;
      this.pXg.pEM = this.pEM;
      if ((this.pXb == null) || ("".equals(this.pXa))) {
        this.pXb = "adxml";
      }
      if ((!bg.nm(this.pXa)) && (!bg.nm(this.pXb))) {
        break;
      }
      w.e("MicroMsg.SnsAdNativeLandingPagesUI", "landingPagesXml is " + this.pXa + ",landingPagesXmlPrex is " + this.pXb);
      GMTrace.o(8524838993920L, 63515);
      return;
      this.pXg.pLF = 1;
    }
    this.values = com.tencent.mm.c.f.q(this.pXa, this.pXb);
    this.pXg.pLR = bg.aq((String)this.values.get("." + this.pXb + ".adCanvasInfo.canvasId"), "");
    GMTrace.o(8524838993920L, 63515);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(8525107429376L, 63517);
    getWindow().clearFlags(128);
    if (this.iYa)
    {
      w.i("MicroMsg.SnsAdNativeLandingPagesUI", "the SnsAdNativeLadingPagesUI is destroy");
      if (!this.pXh)
      {
        bog();
        rw();
      }
    }
    unregisterReceiver(this.pXB);
    super.onDestroy();
    GMTrace.o(8525107429376L, 63517);
  }
  
  protected void onPause()
  {
    GMTrace.i(8525375864832L, 63519);
    super.onPause();
    if (this.iYa) {
      this.iyB += System.currentTimeMillis() - this.startTime;
    }
    android.support.v4.content.d.l(this).unregisterReceiver(this.pXv);
    android.support.v4.content.d.l(this).unregisterReceiver(this.pXw);
    GMTrace.o(8525375864832L, 63519);
  }
  
  protected void onResume()
  {
    GMTrace.i(8525241647104L, 63518);
    super.onResume();
    w.i("MicroMsg.SnsAdNativeLandingPagesUI", "onResume");
    bol();
    android.support.v4.content.d.l(this).a(this.pXv, new IntentFilter("com.tencent.mm.adlanding.video_progressbar_change"));
    android.support.v4.content.d.l(this).a(this.pXw, new IntentFilter("com.tencent.mm.adlanding.set_uioption"));
    if (this.iYa) {
      this.startTime = System.currentTimeMillis();
    }
    registerReceiver(this.pXB, new IntentFilter("android.intent.action.SCREEN_ON"));
    GMTrace.o(8525241647104L, 63518);
  }
  
  private final class a
  {
    public String kBR;
    public String pDC;
    public String pDD;
    
    public a()
    {
      GMTrace.i(20833141522432L, 155219);
      this.kBR = "";
      this.pDC = "";
      this.pDD = "";
      GMTrace.o(20833141522432L, 155219);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\ui\SnsAdNativeLandingPagesUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */