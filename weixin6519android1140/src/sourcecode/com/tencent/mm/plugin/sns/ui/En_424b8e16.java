package com.tencent.mm.plugin.sns.ui;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.text.ClipboardManager;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup.LayoutParams;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.LinearInterpolator;
import android.view.animation.Transformation;
import android.widget.AbsoluteLayout.LayoutParams;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.bu;
import com.tencent.mm.g.a.gj;
import com.tencent.mm.g.a.jy;
import com.tencent.mm.g.a.kc;
import com.tencent.mm.g.a.kj;
import com.tencent.mm.g.a.kk;
import com.tencent.mm.g.a.kq;
import com.tencent.mm.g.a.nj;
import com.tencent.mm.g.a.pd;
import com.tencent.mm.g.a.pg;
import com.tencent.mm.g.a.ph;
import com.tencent.mm.g.a.pl;
import com.tencent.mm.g.a.pm;
import com.tencent.mm.g.a.pn;
import com.tencent.mm.g.a.ps;
import com.tencent.mm.g.a.pu;
import com.tencent.mm.g.a.qe;
import com.tencent.mm.g.a.rm;
import com.tencent.mm.g.a.rw;
import com.tencent.mm.kiss.WxPresenterActivity;
import com.tencent.mm.plugin.sns.a.b.i.5;
import com.tencent.mm.plugin.sns.b.h.a;
import com.tencent.mm.plugin.sns.h.a.a;
import com.tencent.mm.plugin.sns.h.b.2;
import com.tencent.mm.plugin.sns.i.d;
import com.tencent.mm.plugin.sns.i.e;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.i.i;
import com.tencent.mm.plugin.sns.i.j;
import com.tencent.mm.plugin.sns.j.b.b;
import com.tencent.mm.plugin.sns.j.c.a;
import com.tencent.mm.plugin.sns.j.c.b;
import com.tencent.mm.plugin.sns.model.al.a;
import com.tencent.mm.plugin.sns.model.as;
import com.tencent.mm.plugin.sns.model.at;
import com.tencent.mm.plugin.sns.model.au;
import com.tencent.mm.plugin.sns.model.q;
import com.tencent.mm.plugin.sns.model.x;
import com.tencent.mm.plugin.sns.ui.a.a.c;
import com.tencent.mm.protocal.c.bfh;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.c;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.s;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.MMPullDownView;
import com.tencent.mm.ui.base.MMPullDownView.f;
import com.tencent.mm.ui.base.p.c;
import com.tencent.mm.ui.base.p.d;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.v;
import com.tencent.mm.ui.widget.QFadeImageView;
import com.tencent.mm.ui.widget.QImageView;
import com.tencent.mm.ui.widget.QImageView.a;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class En_424b8e16
  extends WxPresenterActivity
  implements com.tencent.mm.ad.e, h.a, u, com.tencent.mm.y.ao
{
  private static final Set<Activity> pQQ;
  private ActionBar FM;
  private String iAx;
  private long jro;
  private int mScreenHeight;
  private int mScreenWidth;
  private int nti;
  private final long pPS;
  private long pPT;
  private com.tencent.mm.plugin.sns.j.b pPU;
  private com.tencent.mm.plugin.sns.j.a pPV;
  private ax pPW;
  private LinearLayout pPX;
  private QFadeImageView pPY;
  private boolean pPZ;
  private boolean pPg;
  private com.tencent.mm.sdk.b.c pQA;
  private com.tencent.mm.sdk.b.c pQB;
  private com.tencent.mm.sdk.b.c pQC;
  private com.tencent.mm.sdk.b.c pQD;
  private com.tencent.mm.sdk.b.c pQE;
  private com.tencent.mm.sdk.b.c pQF;
  private com.tencent.mm.sdk.b.c pQG;
  private long pQH;
  boolean pQI;
  Runnable pQJ;
  Runnable pQK;
  private Handler pQL;
  private Runnable pQM;
  private bb.a pQN;
  private com.tencent.mm.vending.app.a.b pQO;
  boolean pQP;
  private MenuItem.OnMenuItemClickListener pQR;
  private View pQS;
  private ImageView pQT;
  private View pQU;
  private MenuItem pQV;
  private ba pQW;
  private View.OnClickListener pQX;
  private boolean pQY;
  private boolean pQa;
  private j pQb;
  private a pQc;
  private TestTimeForSns pQd;
  private int pQe;
  private boolean pQf;
  private String pQg;
  private com.tencent.mm.plugin.sns.h.a pQh;
  protected com.tencent.mm.plugin.sns.a.b.g pQi;
  private au pQj;
  private as pQk;
  private String pQl;
  private boolean pQm;
  private boolean pQn;
  private int pQo;
  private bb pQp;
  private Runnable pQq;
  private com.tencent.mm.sdk.b.c pQr;
  private boolean pQs;
  private com.tencent.mm.sdk.b.c pQt;
  private com.tencent.mm.sdk.b.c pQu;
  private com.tencent.mm.sdk.b.c pQv;
  private com.tencent.mm.sdk.b.c pQw;
  private com.tencent.mm.sdk.b.c pQx;
  private com.tencent.mm.sdk.b.c pQy;
  private com.tencent.mm.sdk.b.c pQz;
  private com.tencent.mm.sdk.b.c pvK;
  private boolean pzo;
  
  static
  {
    GMTrace.i(8463098839040L, 63055);
    pQQ = new HashSet();
    GMTrace.o(8463098839040L, 63055);
  }
  
  public En_424b8e16()
  {
    GMTrace.i(8452495638528L, 62976);
    this.pPS = 300L;
    this.pPT = SystemClock.elapsedRealtime();
    this.pPU = ((com.tencent.mm.plugin.sns.j.b)m(com.tencent.mm.plugin.sns.j.b.class));
    if (this.pPU != null) {}
    for (com.tencent.mm.plugin.sns.j.a locala = this.pPU.bqv();; locala = null)
    {
      this.pPV = locala;
      this.pPZ = false;
      this.pQa = false;
      this.pPg = false;
      this.pQe = 0;
      this.pQf = false;
      this.pQg = "";
      this.pQh = new com.tencent.mm.plugin.sns.h.a();
      this.pQi = new com.tencent.mm.plugin.sns.a.b.g(1);
      this.pQj = new au();
      this.pQk = new as();
      this.pQq = new Runnable()
      {
        public final void run()
        {
          GMTrace.i(8395184668672L, 62549);
          ax localax = En_424b8e16.a(En_424b8e16.this);
          if (localax != null)
          {
            localax.qhd.bpp();
            localax.qhd.notifyVendingDataChange();
          }
          GMTrace.o(8395184668672L, 62549);
        }
      };
      this.pQr = new com.tencent.mm.sdk.b.c() {};
      this.pQs = false;
      this.pzo = false;
      this.pQt = new com.tencent.mm.sdk.b.c() {};
      this.pQu = new com.tencent.mm.sdk.b.c() {};
      this.pQv = new com.tencent.mm.sdk.b.c() {};
      this.pQw = new com.tencent.mm.sdk.b.c() {};
      this.pQx = new com.tencent.mm.sdk.b.c() {};
      this.pQy = new com.tencent.mm.sdk.b.c() {};
      this.pQz = new com.tencent.mm.sdk.b.c() {};
      this.pQA = new com.tencent.mm.sdk.b.c() {};
      this.pQB = new com.tencent.mm.sdk.b.c() {};
      this.pvK = new com.tencent.mm.sdk.b.c() {};
      this.pQC = new com.tencent.mm.sdk.b.c() {};
      this.pQD = new com.tencent.mm.sdk.b.c() {};
      this.pQE = new com.tencent.mm.sdk.b.c() {};
      this.pQF = new com.tencent.mm.sdk.b.c() {};
      this.pQG = new com.tencent.mm.sdk.b.c() {};
      this.pQH = 0L;
      this.pQI = false;
      this.nti = 0;
      this.pQJ = new Runnable()
      {
        public final void run()
        {
          GMTrace.i(8466722717696L, 63082);
          if (En_424b8e16.a(En_424b8e16.this) == null)
          {
            GMTrace.o(8466722717696L, 63082);
            return;
          }
          if (En_424b8e16.m(En_424b8e16.this)) {
            com.tencent.mm.plugin.sns.model.ae.bja().pause();
          }
          GMTrace.o(8466722717696L, 63082);
        }
      };
      this.pQK = new Runnable()
      {
        public final void run()
        {
          GMTrace.i(8326062538752L, 62034);
          if (En_424b8e16.a(En_424b8e16.this) == null)
          {
            GMTrace.o(8326062538752L, 62034);
            return;
          }
          if (!En_424b8e16.m(En_424b8e16.this))
          {
            w.v("MicroMsg.SnsTimeLineUI", "zeustest update onFling notify resume %s", new Object[] { Integer.valueOf(En_424b8e16.h(En_424b8e16.this).mqO.getFirstVisiblePosition() - En_424b8e16.h(En_424b8e16.this).mqO.getHeaderViewsCount()) });
            com.tencent.mm.plugin.sns.model.ae.bja().start();
            En_424b8e16.a(En_424b8e16.this).qhc.bpD();
          }
          GMTrace.o(8326062538752L, 62034);
        }
      };
      this.pQL = ((com.tencent.mm.vending.h.b)com.tencent.mm.vending.h.d.xyI.xyO).mHandler;
      this.pQM = new Runnable()
      {
        public final void run()
        {
          GMTrace.i(8392634531840L, 62530);
          En_424b8e16.this.bXx();
          En_424b8e16.n(En_424b8e16.this);
          En_424b8e16.this.sq(En_424b8e16.this.getString(i.j.pkU));
          En_424b8e16.o(En_424b8e16.this);
          En_424b8e16.b(En_424b8e16.this, En_424b8e16.h(En_424b8e16.this).mqO.getFirstVisiblePosition());
          GMTrace.o(8392634531840L, 62530);
        }
      };
      this.pQN = new bb.a()
      {
        private int pRd;
        private int pRe;
        
        public final void H(int paramAnonymousInt, boolean paramAnonymousBoolean)
        {
          GMTrace.i(8432899850240L, 62830);
          if (En_424b8e16.a(En_424b8e16.this) != null) {
            En_424b8e16.a(En_424b8e16.this).qhd.notifyVendingDataChange();
          }
          if (!paramAnonymousBoolean) {
            En_424b8e16.this.xI().D(c.b.class);
          }
          GMTrace.o(8432899850240L, 62830);
        }
        
        public final void a(int paramAnonymousInt, List<Integer> paramAnonymousList1, List<Integer> paramAnonymousList2)
        {
          int j = 1;
          GMTrace.i(8432228761600L, 62825);
          int i = j;
          if (paramAnonymousInt > 0)
          {
            paramAnonymousList1 = com.tencent.mm.plugin.sns.model.ae.bjd().va(paramAnonymousInt);
            i = j;
            if (paramAnonymousList1 != null)
            {
              if (paramAnonymousList1.field_pravited > 0) {
                Toast.makeText(En_424b8e16.this, i.j.pju, 1).show();
              }
              i = j;
              if (paramAnonymousList1.field_pravited == 1) {
                i = 0;
              }
            }
          }
          if (i != 0) {
            BackwardSupportUtil.c.a(En_424b8e16.h(En_424b8e16.this).mqO);
          }
          if (En_424b8e16.a(En_424b8e16.this) != null) {
            En_424b8e16.a(En_424b8e16.this).qhd.notifyVendingDataChange();
          }
          GMTrace.o(8432228761600L, 62825);
        }
        
        public final void bnc()
        {
          GMTrace.i(8431691890688L, 62821);
          En_424b8e16.k(En_424b8e16.this).qoP.b(En_424b8e16.p(En_424b8e16.this), En_424b8e16.i(En_424b8e16.this), false, En_424b8e16.q(En_424b8e16.this));
          w.d("MicroMsg.SnsTimeLineUI", "onLoadingMore here");
          if (En_424b8e16.r(En_424b8e16.this) == null)
          {
            w.e("MicroMsg.SnsTimeLineUI", "mLogicHandler handler null");
            GMTrace.o(8431691890688L, 62821);
            return;
          }
          if (En_424b8e16.g(En_424b8e16.this) != null)
          {
            En_424b8e16.r(En_424b8e16.this).removeCallbacks(En_424b8e16.s(En_424b8e16.this));
            En_424b8e16.r(En_424b8e16.this).postDelayed(En_424b8e16.s(En_424b8e16.this), 3000L);
          }
          GMTrace.o(8431691890688L, 62821);
        }
        
        public final ListView bnd()
        {
          GMTrace.i(8431826108416L, 62822);
          if (En_424b8e16.g(En_424b8e16.this).mqO == null) {
            En_424b8e16.g(En_424b8e16.this).mqO = ((ListView)En_424b8e16.this.findViewById(i.f.pdG));
          }
          ListView localListView = En_424b8e16.g(En_424b8e16.this).mqO;
          GMTrace.o(8431826108416L, 62822);
          return localListView;
        }
        
        public final MMPullDownView bne()
        {
          GMTrace.i(8431960326144L, 62823);
          MMPullDownView localMMPullDownView = (MMPullDownView)En_424b8e16.this.findViewById(i.f.pdN);
          GMTrace.o(8431960326144L, 62823);
          return localMMPullDownView;
        }
        
        public final boolean bnf()
        {
          GMTrace.i(8432362979328L, 62826);
          boolean bool = En_424b8e16.t(En_424b8e16.this);
          GMTrace.o(8432362979328L, 62826);
          return bool;
        }
        
        public final void bng()
        {
          GMTrace.i(8432497197056L, 62827);
          En_424b8e16.this.bnb();
          if (En_424b8e16.l(En_424b8e16.this) != null)
          {
            w.d("MicroMsg.SnsTimeLineUI", "refreshIv onLoadingTap");
            En_424b8e16.l(En_424b8e16.this).setVisibility(0);
          }
          En_424b8e16.k(En_424b8e16.this).qoO.b(En_424b8e16.p(En_424b8e16.this), En_424b8e16.i(En_424b8e16.this), En_424b8e16.j(En_424b8e16.this), En_424b8e16.q(En_424b8e16.this));
          GMTrace.o(8432497197056L, 62827);
        }
        
        public final void bnh()
        {
          GMTrace.i(8432631414784L, 62828);
          En_424b8e16.this.bnb();
          GMTrace.o(8432631414784L, 62828);
        }
        
        public final void bni()
        {
          GMTrace.i(8432765632512L, 62829);
          int i = En_424b8e16.h(En_424b8e16.this).mqO.getFirstVisiblePosition();
          int j = En_424b8e16.h(En_424b8e16.this).mqO.getLastVisiblePosition();
          if ((i == this.pRd) && (j == this.pRe))
          {
            GMTrace.o(8432765632512L, 62829);
            return;
          }
          this.pRd = i;
          this.pRe = j;
          w.i("MicroMsg.SnsTimeLineUI", "onListViewScoll %s %s ", new Object[] { Integer.valueOf(i), Integer.valueOf(j) });
          com.tencent.mm.plugin.sns.h.a locala1 = En_424b8e16.f(En_424b8e16.this);
          av localav = En_424b8e16.a(En_424b8e16.this).qhc;
          i = com.tencent.mm.modelsns.c.gVL;
          final a.a locala;
          if (i == 2) {
            locala = null;
          }
          for (;;)
          {
            com.tencent.mm.vending.g.g.ckp().b(new com.tencent.mm.vending.c.a() {});
            GMTrace.o(8432765632512L, 62829);
            return;
            if ((i == 4) && (!locala1.pzo))
            {
              locala = null;
            }
            else
            {
              long l = System.nanoTime();
              locala = new a.a();
              locala.pzp = System.currentTimeMillis();
              locala.mScreenHeight = locala1.mScreenHeight;
              locala.mScreenWidth = locala1.mScreenWidth;
              int k = locala1.pzn.getTop();
              j = locala1.pzn.getHeight();
              i = j;
              if (k < 0) {
                i = j + k;
              }
              locala.pzr = i;
              j = locala1.hvF.getFirstVisiblePosition() - 1;
              int m = locala1.hvF.getLastVisiblePosition() - 1;
              locala.pzq = j;
              locala.lEi = m;
              int n = localav.getCount();
              boolean bool = false;
              if (locala1.hvF.getChildAt(0) != null) {
                bool = locala1.hvF.getChildAt(0) instanceof SnsHeader;
              }
              w.v("MicroMsg.CaptureSnsHelper", "first last %s %s isHeaderExist %s", new Object[] { Integer.valueOf(j), Integer.valueOf(m), Boolean.valueOf(bool) });
              if (bool)
              {
                i = 1;
                int i1 = locala1.hvF.getChildCount();
                label381:
                if (j > m) {
                  break label885;
                }
                k = i;
                if (j < n)
                {
                  k = i;
                  if (j >= 0)
                  {
                    if (i < i1) {
                      break label451;
                    }
                    w.e("MicroMsg.CaptureSnsHelper", "childPos biger than childCount %d %d", new Object[] { Integer.valueOf(i), Integer.valueOf(i1) });
                    k = i;
                  }
                }
              }
              for (;;)
              {
                j += 1;
                i = k;
                break label381;
                i = 0;
                break;
                label451:
                if (locala.pzs == null) {
                  locala.pzs = new LinkedList();
                }
                com.tencent.mm.plugin.sns.h.a.b localb = new com.tencent.mm.plugin.sns.h.a.b();
                locala.pzs.add(localb);
                Object localObject = locala1.hvF.getChildAt(i);
                k = i + 1;
                int i2;
                int i3;
                int i4;
                if (localObject != null)
                {
                  i = ((View)localObject).getTop();
                  i2 = ((View)localObject).getLeft();
                  i3 = ((View)localObject).getHeight();
                  i4 = ((View)localObject).getWidth();
                  com.tencent.mm.plugin.sns.storage.m localm = localav.vf(j);
                  localb.pzx = com.tencent.mm.plugin.sns.data.i.g(localm);
                  localb.pzv = localm.field_type;
                  localb.pzw = localm.uX(32);
                  localb.pzt = i;
                  localb.pzu = i2;
                  localb.mViewHeight = i3;
                  localb.mViewWidth = i4;
                }
                if ((localObject != null) && (((View)localObject).getTag() != null) && ((((View)localObject).getTag() instanceof a.c)))
                {
                  localObject = (a.c)((View)localObject).getTag();
                  if ((((a.c)localObject).qlA) && (((a.c)localObject).pOm != null))
                  {
                    i = ((a.c)localObject).pOm.getTop();
                    i2 = ((a.c)localObject).pOm.getLeft();
                    i3 = ((a.c)localObject).qls.getHeight();
                    i4 = ((a.c)localObject).qls.getWidth();
                    int i5 = ((a.c)localObject).qlt.getTop();
                    int i6 = ((a.c)localObject).qlt.getLeft();
                    int i7 = ((a.c)localObject).qlt.getHeight();
                    int i8 = ((a.c)localObject).qlt.getWidth();
                    w.v("MicroMsg.CaptureSnsHelper", "holder position %s %s index %s", new Object[] { Integer.valueOf(((a.c)localObject).position), Integer.valueOf(j), Integer.valueOf(k) });
                    if (((a.c)localObject).pmB.uQO != 0)
                    {
                      localb.pzz = ((a.c)localObject).pmB.uQO;
                      localb.pzA = i;
                      localb.pzB = i2;
                      localb.pzC = i4;
                      localb.pzD = i3;
                    }
                    if (((a.c)localObject).pmB.uQR != 0)
                    {
                      localb.pzy = ((a.c)localObject).pmB.uQR;
                      localb.pzF = (i6 + i2);
                      localb.pzE = (i5 + i);
                      localb.pzG = i8;
                      localb.pzH = i7;
                    }
                  }
                }
              }
              label885:
              w.i("MicroMsg.CaptureSnsHelper", "end cap: " + (System.nanoTime() - l));
            }
          }
        }
        
        public final int getType()
        {
          GMTrace.i(8432094543872L, 62824);
          GMTrace.o(8432094543872L, 62824);
          return 1;
        }
        
        public final void hX(boolean paramAnonymousBoolean)
        {
          GMTrace.i(8433034067968L, 62831);
          En_424b8e16 localEn_424b8e16 = En_424b8e16.this;
          localEn_424b8e16.pQI = paramAnonymousBoolean;
          com.tencent.mm.sdk.platformtools.ae localae = com.tencent.mm.plugin.sns.model.ae.aDa();
          com.tencent.mm.plugin.sns.model.g localg = com.tencent.mm.plugin.sns.model.ae.bja();
          com.tencent.mm.plugin.sns.model.b localb = com.tencent.mm.plugin.sns.model.ae.biY();
          if (paramAnonymousBoolean)
          {
            if ((localg.pqS) || (localb.pqS))
            {
              localae.removeCallbacks(localEn_424b8e16.pQJ);
              localae.removeCallbacks(localEn_424b8e16.pQK);
              localae.postDelayed(localEn_424b8e16.pQJ, 0L);
              GMTrace.o(8433034067968L, 62831);
            }
          }
          else if ((!localg.pqS) || (!localb.pqS))
          {
            localae.removeCallbacks(localEn_424b8e16.pQJ);
            localae.removeCallbacks(localEn_424b8e16.pQK);
            localae.postDelayed(localEn_424b8e16.pQK, 0L);
          }
          GMTrace.o(8433034067968L, 62831);
        }
      };
      this.pQO = new com.tencent.mm.vending.app.a.b() {};
      this.mScreenWidth = 0;
      this.mScreenHeight = 0;
      this.pQP = true;
      this.jro = 0L;
      this.pQR = new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(8591947857920L, 64015);
          En_424b8e16.this.aLo();
          En_424b8e16.this.finish();
          GMTrace.o(8591947857920L, 64015);
          return false;
        }
      };
      this.pQW = null;
      this.pQX = new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(17838341357568L, 132906);
          if (SystemClock.elapsedRealtime() - En_424b8e16.G(En_424b8e16.this) < 300L) {
            En_424b8e16.D(En_424b8e16.this);
          }
          En_424b8e16.a(En_424b8e16.this, SystemClock.elapsedRealtime());
          com.tencent.mm.plugin.sns.model.ae.aDa().removeCallbacks(En_424b8e16.H(En_424b8e16.this));
          En_424b8e16.H(En_424b8e16.this).run();
          GMTrace.o(17838341357568L, 132906);
        }
      };
      this.pQY = false;
      GMTrace.o(8452495638528L, 62976);
      return;
    }
  }
  
  private void bmW()
  {
    GMTrace.i(8454508904448L, 62991);
    W(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(8753009131520L, 65215);
        En_424b8e16.D(En_424b8e16.this);
        GMTrace.o(8753009131520L, 65215);
      }
    });
    GMTrace.o(8454508904448L, 62991);
  }
  
  private void bmY()
  {
    GMTrace.i(8454777339904L, 62993);
    bmW();
    a(this.pQR, i.e.aTo);
    GMTrace.o(8454777339904L, 62993);
  }
  
  private void bmZ()
  {
    GMTrace.i(8455045775360L, 62995);
    if (this.pQU != null) {
      this.pQU.setVisibility(8);
    }
    GMTrace.o(8455045775360L, 62995);
  }
  
  private void bna()
  {
    GMTrace.i(8455314210816L, 62997);
    if (com.tencent.mm.p.a.aP(this))
    {
      GMTrace.o(8455314210816L, 62997);
      return;
    }
    boolean bool = com.tencent.mm.pluginsdk.h.a.a(this, "android.permission.CAMERA", 18, "", "");
    w.i("MicroMsg.SnsTimeLineUI", "summerper checkPermission checkCamera[%b], stack[%s], activity[%s]", new Object[] { Boolean.valueOf(bool), bg.bQW(), this });
    if (!bool)
    {
      GMTrace.o(8455314210816L, 62997);
      return;
    }
    bool = com.tencent.mm.pluginsdk.h.a.a(this, "android.permission.RECORD_AUDIO", 18, "", "");
    w.i("MicroMsg.SnsTimeLineUI", "summerper checkPermission checkmicrophone[%b], stack[%s], activity[%s]", new Object[] { Boolean.valueOf(bool), bg.bQW(), this });
    if (!bool)
    {
      GMTrace.o(8455314210816L, 62997);
      return;
    }
    com.tencent.mm.plugin.report.service.g.ork.i(13822, new Object[] { Integer.valueOf(1), Integer.valueOf(2) });
    Intent localIntent = new Intent();
    com.tencent.mm.pluginsdk.ui.tools.k.x(this.vKB.vKW, localIntent);
    GMTrace.o(8455314210816L, 62997);
  }
  
  public final void AE()
  {
    GMTrace.i(8455716864000L, 63000);
    xI().D(c.b.class);
    GMTrace.o(8455716864000L, 63000);
  }
  
  public final void AF()
  {
    GMTrace.i(8455851081728L, 63001);
    GMTrace.o(8455851081728L, 63001);
  }
  
  public final void AG()
  {
    GMTrace.i(8455985299456L, 63002);
    if (this.pQY)
    {
      GMTrace.o(8455985299456L, 63002);
      return;
    }
    w.v("MicroMsg.SnsTimeLineUI", "notifyHbReward imp");
    this.pQY = true;
    com.tencent.mm.plugin.sns.model.ae.aDa().postDelayed(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(8368609558528L, 62351);
        if (En_424b8e16.a(En_424b8e16.this) != null) {
          En_424b8e16.a(En_424b8e16.this).qhd.notifyVendingDataChange();
        }
        En_424b8e16.I(En_424b8e16.this);
        GMTrace.o(8368609558528L, 62351);
      }
    }, 1000L);
    GMTrace.o(8455985299456L, 63002);
  }
  
  public final void AH()
  {
    GMTrace.i(8456387952640L, 63005);
    xI().D(c.b.class);
    GMTrace.o(8456387952640L, 63005);
  }
  
  protected final void MP()
  {
    GMTrace.i(8454240468992L, 62989);
    this.pQp.pzn.setDrawingCacheEnabled(false);
    this.pQb.pxF = ((FrameLayout)findViewById(i.f.pen));
    oM(i.j.pkU);
    int i = com.tencent.mm.plugin.sns.model.ae.bjk().position;
    Object localObject = (AdListView)this.pQp.bnd();
    ((AdListView)localObject).pND = this.pQi;
    ((AdListView)localObject).pNE = this.pQj;
    ((AdListView)localObject).pNF = this.pQk;
    this.pQk.a(com.tencent.mm.plugin.sns.model.ae.biU());
    w.i("MicroMsg.SnsTimeLineUI", "oncreate firstPosition %d isToResume: " + this.pPg, new Object[] { Integer.valueOf(i) });
    this.pPY = ((QFadeImageView)findViewById(i.f.pdO));
    this.pPY.setImageResource(i.i.phh);
    this.pQc = new a(this.pQp.bnd());
    this.pQc.setInterpolator(new LinearInterpolator());
    this.pQc.setAnimationListener(new Animation.AnimationListener()
    {
      public final void onAnimationEnd(Animation paramAnonymousAnimation)
      {
        GMTrace.i(8374380920832L, 62394);
        w.i("MicroMsg.SnsTimeLineUI", "refreshAnim end");
        GMTrace.o(8374380920832L, 62394);
      }
      
      public final void onAnimationRepeat(Animation paramAnonymousAnimation)
      {
        GMTrace.i(8374246703104L, 62393);
        w.i("MicroMsg.SnsTimeLineUI", "refreshAnim repeat");
        GMTrace.o(8374246703104L, 62393);
      }
      
      public final void onAnimationStart(Animation paramAnonymousAnimation)
      {
        GMTrace.i(8374112485376L, 62392);
        w.i("MicroMsg.SnsTimeLineUI", "refreshAnim start");
        GMTrace.o(8374112485376L, 62392);
      }
    });
    this.pPW = new ax(this, this.pQp.bnd(), this.pQb.pPl, this.pQb, this.pQl);
    this.pQb.pPl.qnb = new av.a()
    {
      public final boolean bnj()
      {
        GMTrace.i(8589397721088L, 63996);
        En_424b8e16.this.xI().D(c.b.class);
        GMTrace.o(8589397721088L, 63996);
        return false;
      }
    };
    this.pQb.pyk = this.pPW.qhc;
    this.pPW.qhd.xwF = new com.tencent.mm.vending.a.b.a()
    {
      public final void bnk()
      {
        GMTrace.i(8742137495552L, 65134);
        com.tencent.mm.plugin.report.service.f.tp(14);
        GMTrace.o(8742137495552L, 65134);
      }
      
      public final void bnl()
      {
        GMTrace.i(8742271713280L, 65135);
        com.tencent.mm.plugin.report.service.f.tq(14);
        GMTrace.o(8742271713280L, 65135);
      }
    };
    this.pQd = ((TestTimeForSns)this.pQb.pxF);
    this.pQd.setListener(new TestTimeForSns.a()
    {
      public final void aDr()
      {
        GMTrace.i(8394916233216L, 62547);
        w.i("MicroMsg.SnsTimeLineUI", "sns has drawed");
        En_424b8e16.v(En_424b8e16.this).post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(8448871759872L, 62949);
            if ((En_424b8e16.a(En_424b8e16.this) == null) || (En_424b8e16.v(En_424b8e16.this) == null))
            {
              w.i("MicroMsg.SnsTimeLineUI", "onViewDrawed is error");
              GMTrace.o(8448871759872L, 62949);
              return;
            }
            En_424b8e16.v(En_424b8e16.this).setListener(null);
            En_424b8e16.a(En_424b8e16.this, En_424b8e16.z(En_424b8e16.this));
            if (En_424b8e16.A(En_424b8e16.this))
            {
              w.w("MicroMsg.SnsTimeLineUI", "too fast that it finish");
              GMTrace.o(8448871759872L, 62949);
              return;
            }
            if (En_424b8e16.t(En_424b8e16.this)) {
              com.tencent.mm.plugin.sns.model.ae.biT().w(com.tencent.mm.plugin.sns.model.ae.bjk().pvz, -1);
            }
            if (!En_424b8e16.t(En_424b8e16.this)) {
              En_424b8e16.k(En_424b8e16.this).qoO.b(En_424b8e16.p(En_424b8e16.this), En_424b8e16.i(En_424b8e16.this), En_424b8e16.j(En_424b8e16.this), En_424b8e16.q(En_424b8e16.this));
            }
            En_424b8e16.a(En_424b8e16.this, false);
            GMTrace.o(8448871759872L, 62949);
          }
        });
        GMTrace.o(8394916233216L, 62547);
      }
    });
    this.pQp.mqO.setOnTouchListener(new View.OnTouchListener()
    {
      public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
      {
        GMTrace.i(8704824967168L, 64856);
        if (paramAnonymousMotionEvent.getAction() == 1)
        {
          En_424b8e16.this.bnb();
          if ((En_424b8e16.h(En_424b8e16.this).mqO != null) && (En_424b8e16.h(En_424b8e16.this).mqO.getFirstVisiblePosition() == 0))
          {
            w.d("MicroMsg.SnsTimeLineUI", "refreshIv onTouch set refreshIv visible");
            En_424b8e16.l(En_424b8e16.this).setVisibility(0);
          }
          En_424b8e16.y(En_424b8e16.this).bno();
        }
        if (paramAnonymousMotionEvent.getAction() == 0)
        {
          if ((En_424b8e16.h(En_424b8e16.this).mqO != null) && (En_424b8e16.h(En_424b8e16.this).mqO.getFirstVisiblePosition() == 0)) {
            En_424b8e16.l(En_424b8e16.this).setVisibility(0);
          }
          En_424b8e16.g(En_424b8e16.this).bmN();
          En_424b8e16.g(En_424b8e16.this).pPc.bpW();
        }
        if (En_424b8e16.this.pQi != null) {
          En_424b8e16.this.pQi.bhG();
        }
        GMTrace.o(8704824967168L, 64856);
        return false;
      }
    });
    this.pQp.mqO.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(8720260005888L, 64971);
        if (En_424b8e16.g(En_424b8e16.this) == null)
        {
          GMTrace.o(8720260005888L, 64971);
          return;
        }
        En_424b8e16.g(En_424b8e16.this).pPc.pYK = En_424b8e16.h(En_424b8e16.this).mqO.getBottom();
        En_424b8e16.g(En_424b8e16.this).pPc.qki = En_424b8e16.h(En_424b8e16.this).mTU.getTop();
        En_424b8e16.y(En_424b8e16.this).pRr = En_424b8e16.h(En_424b8e16.this).pzn.getTop();
        GMTrace.o(8720260005888L, 64971);
      }
    });
    this.pQp.mTU.weh = new MMPullDownView.f()
    {
      public final void aq(float paramAnonymousFloat)
      {
        GMTrace.i(8506316947456L, 63377);
        En_424b8e16.B(En_424b8e16.this);
        En_424b8e16.a locala;
        float f1;
        if ((En_424b8e16.h(En_424b8e16.this).pzn.getTop() >= En_424b8e16.y(En_424b8e16.this).pRr) || (paramAnonymousFloat > 0.0F))
        {
          locala = En_424b8e16.y(En_424b8e16.this);
          if (locala.mqO != null)
          {
            if (locala.mqO.getFirstVisiblePosition() != 0) {
              break label336;
            }
            En_424b8e16.l(locala.pQZ).setVisibility(0);
          }
          if (En_424b8e16.l(locala.pQZ).getVisibility() == 0)
          {
            En_424b8e16.l(locala.pQZ).clearAnimation();
            locala.init();
            locala.pRo -= paramAnonymousFloat / 2.0F;
            float f2 = locala.pRo;
            f1 = f2;
            if (f2 < locala.pRn)
            {
              f1 = locala.pRn;
              locala.pRo = locala.pRn;
            }
            if (f1 <= locala.pRm) {
              break label360;
            }
            f1 = locala.pRm;
          }
        }
        label336:
        label360:
        for (;;)
        {
          if (f1 == locala.pRm) {}
          for (paramAnonymousFloat *= 2.0F;; paramAnonymousFloat = 5.0F * paramAnonymousFloat)
          {
            En_424b8e16.l(locala.pQZ).a(QImageView.a.xsq);
            En_424b8e16.l(locala.pQZ).mMatrix.postRotate(paramAnonymousFloat, locala.pRk, locala.pRl);
            En_424b8e16.l(locala.pQZ).setImageResource(i.i.phh);
            AbsoluteLayout.LayoutParams localLayoutParams = (AbsoluteLayout.LayoutParams)En_424b8e16.l(locala.pQZ).getLayoutParams();
            localLayoutParams.y = ((int)f1);
            En_424b8e16.l(locala.pQZ).setLayoutParams(localLayoutParams);
            En_424b8e16.l(locala.pQZ).invalidate();
            En_424b8e16.g(En_424b8e16.this).bmN();
            En_424b8e16.this.bnb();
            En_424b8e16.g(En_424b8e16.this).pPc.bpW();
            GMTrace.o(8506316947456L, 63377);
            return;
            En_424b8e16.l(locala.pQZ).setVisibility(8);
            break;
          }
        }
      }
      
      public final void bnm()
      {
        GMTrace.i(8506451165184L, 63378);
        En_424b8e16.y(En_424b8e16.this).bno();
        GMTrace.o(8506451165184L, 63378);
      }
    };
    this.pQb.pPb = ((SnsCommentFooter)findViewById(i.f.paf));
    this.pQb.pPb.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(8564701659136L, 63812);
        com.tencent.mm.compatible.util.j.g(En_424b8e16.this);
        GMTrace.o(8564701659136L, 63812);
      }
    });
    this.pQb.pPc = new bi(this.pQp.mqO, this.pQb.pPb);
    this.pPX = ((LinearLayout)this.pQp.pzn.findViewById(i.f.pdC));
    this.pPX.findViewById(i.f.pdA).setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(8368877993984L, 62353);
        if ((En_424b8e16.g(En_424b8e16.this) != null) && (En_424b8e16.g(En_424b8e16.this).pOZ != null)) {
          En_424b8e16.g(En_424b8e16.this).pOZ.pvl.hH(true);
        }
        paramAnonymousView = (c.b)En_424b8e16.this.xI().C(c.b.class);
        com.tencent.mm.modelsns.b localb = com.tencent.mm.modelsns.b.ha(725);
        localb.hd(paramAnonymousView.qoS);
        localb.LR();
        paramAnonymousView = new Intent();
        paramAnonymousView.setClass(En_424b8e16.this, SnsMsgUI.class);
        En_424b8e16.this.startActivityForResult(paramAnonymousView, 13);
        GMTrace.o(8368877993984L, 62353);
      }
    });
    localObject = this.pQp.pzn;
    View.OnClickListener local32 = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(8491821432832L, 63269);
        paramAnonymousView = new Intent();
        paramAnonymousView.setClass(En_424b8e16.this, SnsUserUI.class);
        paramAnonymousView = com.tencent.mm.plugin.sns.model.ae.biT().f(paramAnonymousView, En_424b8e16.C(En_424b8e16.this));
        if (paramAnonymousView == null)
        {
          En_424b8e16.this.finish();
          GMTrace.o(8491821432832L, 63269);
          return;
        }
        com.tencent.mm.kernel.h.xz();
        int i = bg.a((Integer)com.tencent.mm.kernel.h.xy().xh().get(68388, null), 0);
        com.tencent.mm.kernel.h.xz();
        com.tencent.mm.kernel.h.xy().xh().set(68388, Integer.valueOf(i + 1));
        En_424b8e16.this.startActivity(paramAnonymousView);
        if ((paramAnonymousView.getFlags() & 0x4000000) != 0) {
          En_424b8e16.this.finish();
        }
        GMTrace.o(8491821432832L, 63269);
      }
    };
    if ((((SnsHeader)localObject).qaE != null) && (((SnsHeader)localObject).qaE.hqg != null)) {
      ((SnsHeader)localObject).qaE.hqg.setOnClickListener(local32);
    }
    this.pQb.pPd = new ao(this);
    bmY();
    GMTrace.o(8454240468992L, 62989);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ad.k paramk)
  {
    GMTrace.i(8456119517184L, 63003);
    w.i("MicroMsg.SnsTimeLineUI", "uionSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString + " type = " + paramk.getType());
    if (paramk.getType() == 218)
    {
      paramString = (q)paramk;
      if (((paramString.type == 1) || (paramString.type == 6) || (paramString.type == 4)) && (this.pQb.pPm != null)) {
        this.pQb.pPm.dismiss();
      }
      if (paramString.type == 11)
      {
        if (this.pQp.hsU != null) {
          this.pQp.hsU.dismiss();
        }
        if (this.pQT != null) {
          this.pQT.setImageResource(i.i.cKW);
        }
      }
    }
    if (this.pPW != null) {
      this.pPW.qhd.notifyVendingDataChange();
    }
    if (paramk.getType() == 211)
    {
      paramString = (x)paramk;
      if (!paramString.psb) {
        break label387;
      }
      paramk = com.tencent.mm.modelsns.b.ha(727);
      paramk.hd(this.pPW.getCount()).hd(paramString.Ob);
      paramk.LR();
    }
    for (;;)
    {
      if (this.pQc != null)
      {
        this.pQa = false;
        paramString = this.pQc;
        w.i("MicroMsg.SnsTimeLineUI", "play end vis: %d, sumY %f MAX_Y %f", new Object[] { Integer.valueOf(paramString.pQZ.pPY.getVisibility()), Float.valueOf(paramString.pRo), Float.valueOf(paramString.pRm) });
        if (paramString.pQZ.pPY.getVisibility() == 0)
        {
          paramString.init();
          if (paramString.pRo >= paramString.pRm)
          {
            paramString.pQZ.pPY.clearAnimation();
            paramString.pQZ.pPY.startAnimation(paramString);
            paramString.setDuration(1200L);
            paramString.pRq = false;
          }
        }
      }
      GMTrace.o(8456119517184L, 63003);
      return;
      label387:
      paramk = com.tencent.mm.modelsns.b.ha(728);
      paramk.hd(this.pPW.getCount()).hd(paramString.Ob).hd(0);
      paramk.LR();
    }
  }
  
  public final void a(final boolean paramBoolean1, final String paramString, boolean paramBoolean2, boolean paramBoolean3, int paramInt, long paramLong)
  {
    GMTrace.i(8452764073984L, 62978);
    this.pQL.removeCallbacks(this.pQq);
    com.tencent.mm.vending.g.g.ckp().b(new com.tencent.mm.vending.c.a() {}).d(new com.tencent.mm.vending.c.a() {});
    GMTrace.o(8452764073984L, 62978);
  }
  
  public final void a(final boolean paramBoolean1, final boolean paramBoolean2, final String paramString, boolean paramBoolean3, boolean paramBoolean4, int paramInt, long paramLong)
  {
    GMTrace.i(8452629856256L, 62977);
    this.pQL.removeCallbacks(this.pQq);
    com.tencent.mm.vending.g.g.ckp().b(new com.tencent.mm.vending.c.a() {}).d(new com.tencent.mm.vending.c.a() {});
    GMTrace.o(8452629856256L, 62977);
  }
  
  public final void aoK()
  {
    GMTrace.i(8454374686720L, 62990);
    super.aoK();
    af.t(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(8546984919040L, 63680);
        En_424b8e16.this.bnb();
        GMTrace.o(8546984919040L, 63680);
      }
    });
    if (this.vKB.vLo == 2)
    {
      if ((this.pQb != null) && (this.pQb.pPb != null) && (!this.pQb.pPb.boL()))
      {
        w.i("MicroMsg.SnsTimeLineUI", "onKeyBoardStateChange find");
        GMTrace.o(8454374686720L, 62990);
      }
    }
    else if ((this.vKB.vLo == 1) && (this.pQb != null))
    {
      j localj = this.pQb;
      if (localj.pPa)
      {
        localj.pPa = false;
        localj.pPc.bpV();
      }
    }
    GMTrace.o(8454374686720L, 62990);
  }
  
  public final boolean bmX()
  {
    GMTrace.i(8454643122176L, 62992);
    boolean bool = super.bmX();
    GMTrace.o(8454643122176L, 62992);
    return bool;
  }
  
  public final boolean bnb()
  {
    GMTrace.i(8455582646272L, 62999);
    if ((this.pQb == null) || (this.pQb.pPi == null))
    {
      GMTrace.o(8455582646272L, 62999);
      return false;
    }
    if ((this.pQb == null) || (this.pQb.pPj == null)) {}
    for (;;)
    {
      com.tencent.mm.plugin.sns.abtest.a.bhx();
      boolean bool = this.pQb.pPi.bnb();
      GMTrace.o(8455582646272L, 62999);
      return bool;
      this.pQb.pPj.bjU();
    }
  }
  
  public final boolean cC(View paramView)
  {
    GMTrace.i(8455448428544L, 62998);
    this.pQb.pPj.bjU();
    bh localbh = this.pQb.pPi;
    if (!(paramView.getTag() instanceof a.c))
    {
      w.e("MicroMsg.TimeLineCommentHelper", "showCommentBtn err2");
      GMTrace.o(8455448428544L, 62998);
      return false;
    }
    a.c localc = (a.c)paramView.getTag();
    Object localObject1 = localc.eEM;
    if (localbh.qkd != null)
    {
      if ((localbh.qkd.getTag() instanceof bh.a))
      {
        localObject2 = (bh.a)localbh.qkd.getTag();
        if (((bh.a)localObject2).pxZ.equals(localObject1))
        {
          localbh.cE(((bh.a)localObject2).pmD);
          GMTrace.o(8455448428544L, 62998);
          return true;
        }
        localbh.bnb();
      }
      localbh.qkd = null;
    }
    localbh.qkd = new SnsCommentShowAbLayout(localbh.mContext);
    com.tencent.mm.sdk.platformtools.k.bC(localbh.qkd);
    localbh.qkd.setId(i.f.coT);
    new FrameLayout.LayoutParams(-1, -1);
    localbh.pxF.addView(localbh.qkd);
    int i = BackwardSupportUtil.b.a(localbh.mContext, 192.0F);
    int j = BackwardSupportUtil.b.a(localbh.mContext, 76.0F);
    BackwardSupportUtil.b.a(localbh.mContext, 20.0F);
    int k = BackwardSupportUtil.b.a(localbh.mContext, 12.0F);
    int m = BackwardSupportUtil.b.a(localbh.mContext, 40.0F);
    Object localObject2 = v.fb(localbh.mContext).inflate(i.g.pfz, null);
    new Rect();
    Object localObject3 = new int[2];
    int n = com.tencent.mm.pluginsdk.e.dG(localbh.mContext);
    paramView.getLocationInWindow((int[])localObject3);
    localbh.pnx = com.tencent.mm.pluginsdk.e.dH(localbh.mContext);
    w.d("MicroMsg.TimeLineCommentHelper", "addCommentView getLocationInWindow " + localObject3[0] + "  " + localObject3[1] + " height: " + n + " height_hardcode:" + j + " statusBarHeight: " + localbh.pnx);
    localObject3 = new AbsoluteLayout.LayoutParams(-2, -2, localObject3[0] - i + k, localObject3[1] - localbh.pnx - n - (m / 2 - paramView.getMeasuredHeight() / 2));
    localObject1 = new bh.a(localbh, (String)localObject1, (View)localObject2);
    localbh.qkd.setTag(localObject1);
    localbh.qkd.addView((View)localObject2, (ViewGroup.LayoutParams)localObject3);
    if (localc.jHw == 11) {
      ((View)localObject2).findViewById(i.f.oZd).setBackgroundResource(i.e.oXG);
    }
    ((View)localObject2).setVisibility(8);
    new com.tencent.mm.sdk.platformtools.ae().post(new bh.1(localbh, paramView, (View)localObject2));
    GMTrace.o(8455448428544L, 62998);
    return true;
  }
  
  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    int j = 0;
    GMTrace.i(8452898291712L, 62979);
    w.i("MicroMsg.SnsTimeLineUI", "dispatchKeyEvent %s", new Object[] { paramKeyEvent.toString() });
    int k = this.vKB.vLo;
    j localj = this.pQb;
    int i = j;
    if (paramKeyEvent.getKeyCode() == 4)
    {
      i = j;
      if (localj.pPb.getVisibility() == 0)
      {
        localj.pPb.setVisibility(8);
        i = 1;
      }
    }
    if ((i != 0) && (k == 2))
    {
      GMTrace.o(8452898291712L, 62979);
      return true;
    }
    boolean bool = super.dispatchKeyEvent(paramKeyEvent);
    GMTrace.o(8452898291712L, 62979);
    return bool;
  }
  
  protected void finalize()
  {
    GMTrace.i(8456253734912L, 63004);
    w.d("MicroMsg.SnsTimeLineUI", "finalize");
    super.finalize();
    GMTrace.o(8456253734912L, 63004);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(8454106251264L, 62988);
    int i = i.g.pgA;
    GMTrace.o(8454106251264L, 62988);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(8456656388096L, 63007);
    w.v("MicroMsg.SnsTimeLineUI", "on ActivityResult, requestCode %d, resultCode %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if (paramInt1 == 15)
    {
      if ((this.pQb != null) && (this.pQb.pPl != null) && (this.pQb.pPl.qmv != null))
      {
        this.pQb.pPl.qmv.onActivityResult(paramInt1, paramInt2, paramIntent);
        af.i(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(8687779315712L, 64729);
            En_424b8e16.this.aLo();
            GMTrace.o(8687779315712L, 64729);
          }
        }, 300L);
      }
      GMTrace.o(8456656388096L, 63007);
      return;
    }
    if (paramInt1 == 16)
    {
      w.i("MicroMsg.SnsTimeLineUI", "REQUEST_CODE_FOR_FULLSCREEN");
      GMTrace.o(8456656388096L, 63007);
      return;
    }
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    this.pQp.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (paramInt1 == 11)
    {
      this.pPU.qoO.b(this.iAx, this.pQm, this.pQn, this.pQo);
      GMTrace.o(8456656388096L, 63007);
      return;
    }
    GMTrace.o(8456656388096L, 63007);
  }
  
  public void onBackPressed()
  {
    GMTrace.i(8456522170368L, 63006);
    finish();
    GMTrace.o(8456522170368L, 63006);
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    GMTrace.i(8453166727168L, 62981);
    super.onConfigurationChanged(paramConfiguration);
    w.i("MicroMsg.SnsTimeLineUI", "onConfigurationChanged");
    com.tencent.mm.sdk.b.a.vgX.m(new bu());
    com.tencent.mm.pluginsdk.e.h(this);
    com.tencent.mm.plugin.sns.ui.widget.c.bqr().qoE = 0;
    com.tencent.mm.plugin.sns.ui.widget.a.bqp().qoE = 0;
    com.tencent.mm.kiss.widget.textview.c.gaW.xN();
    this.pPW.qhc.bpy();
    this.pPW.qhd.resolvedClear();
    GMTrace.o(8453166727168L, 62981);
  }
  
  public void onCreate(Bundle arg1)
  {
    int j = 1;
    GMTrace.i(8453032509440L, 62980);
    if (this.vKB != null) {
      this.vKB.aa(2, true);
    }
    getIntent().setExtrasClassLoader(getClass().getClassLoader());
    com.tencent.mm.pluginsdk.e.g(this);
    super.onCreate(???);
    int i = com.tencent.mm.y.c.c.Cu().cL("Sns_Private_Recent_Setting_Guide", 0);
    w.i("MicroMsg.SnsTimeLineUI", "Sns_Private_Recent_Setting_Guide abtestvalue = " + i);
    if (i == 1)
    {
      com.tencent.mm.kernel.h.xz();
      if (!com.tencent.mm.kernel.h.xy().xh().getBoolean(w.a.vwA, false))
      {
        ??? = getIntent();
        ???.setClass(this.vKB.vKW, SnsSettingIntroduceUI.class);
        startActivity(???);
        overridePendingTransition(0, 0);
        finish();
        com.tencent.mm.kernel.h.xz();
        com.tencent.mm.kernel.h.xy().xh().a(w.a.vwA, Boolean.valueOf(true));
      }
    }
    com.tencent.mm.bw.b.bVF();
    this.pPV.a(c.b.class, this.pQO);
    this.pPV.a(this);
    Object localObject1 = (c.a)this.pPV.C(c.a.class);
    this.iAx = ((c.a)localObject1).iAx;
    this.pQl = ((c.a)localObject1).pQl;
    this.pQm = ((c.a)localObject1).pQm;
    this.pQn = ((c.a)localObject1).pQn;
    this.pQo = ((c.a)localObject1).pQo;
    ??? = ((c.a)localObject1).lTY;
    localObject1 = ((c.a)localObject1).qiS;
    this.pQp = new bb(this);
    this.pQp.qiR = this.pQN;
    ((com.tencent.mm.plugin.notification.b.a)com.tencent.mm.kernel.h.j(com.tencent.mm.plugin.notification.b.a.class)).getNotification().dV(2);
    com.tencent.mm.plugin.sns.ui.widget.c.bqr().qoE = 0;
    com.tencent.mm.plugin.sns.ui.widget.a.bqp().qoE = 0;
    Object localObject3 = com.tencent.mm.modelsns.c.gVM;
    com.tencent.mm.modelsns.c.LS();
    label409:
    label658:
    int k;
    if (getIntent().getBooleanExtra("is_sns_notify_open", true))
    {
      i = 1;
      this.pQb = new j(this, i, bg.aq(getIntent().getStringExtra("new_feed_id"), ""), getIntent().getIntExtra("sns_unread_count", 0));
      this.pPg = getIntent().getBooleanExtra("sns_resume_state", true);
      if (!com.tencent.mm.plugin.sns.model.ae.biM()) {
        break label1693;
      }
      this.pPg = false;
      this.pPZ = this.pPg;
      this.pQp.a(this.pQl, this.iAx, ???, (String)localObject1, this.pQm, this.pQn, this.pQo);
      this.pQp.onCreate();
      com.tencent.mm.plugin.sns.model.ae.biU().init();
      this.FM = cN().cO();
      com.tencent.mm.kernel.h.xz();
      com.tencent.mm.kernel.h.xx().fYr.a(213, this);
      com.tencent.mm.kernel.h.xz();
      com.tencent.mm.kernel.h.xx().fYr.a(682, this);
      com.tencent.mm.kernel.h.xz();
      com.tencent.mm.kernel.h.xx().fYr.a(218, this);
      com.tencent.mm.kernel.h.xz();
      com.tencent.mm.kernel.h.xx().fYr.a(211, this);
      com.tencent.mm.kernel.h.xz();
      com.tencent.mm.kernel.h.xx().fYr.a(683, this);
      MP();
      ??? = com.tencent.mm.plugin.sns.model.ae.biU();
      localObject1 = this.pQp.mqO;
      localObject3 = this.pPW.qhc;
      ???.pyj = ((ListView)localObject1);
      ???.pyk = ((av)localObject3);
      ??? = com.tencent.mm.plugin.sns.model.ae.biU();
      com.tencent.mm.kernel.h.xz();
      com.tencent.mm.kernel.h.xx().fYr.a(291, ???);
      this.pQa = getIntent().getBooleanExtra("sns_timeline_NeedFirstLoadint", false);
      this.pQb.liU = ((ClipboardManager)getSystemService("clipboard"));
      if (!com.tencent.mm.plugin.sns.model.ae.biM()) {
        break label1713;
      }
      this.pPg = false;
      ??? = this.pPV;
      ???.qhd = this.pPW.qhd;
      localObject1 = ???.qhd;
      ???.xwI.a((com.tencent.mm.vending.e.a)localObject1);
      if (!this.pPg) {
        break label1740;
      }
      this.pQa = false;
      k = com.tencent.mm.plugin.sns.model.ae.bjk().position;
      localObject1 = this.pPW.qhd;
      localObject3 = com.tencent.mm.plugin.sns.model.ae.bjk().kNA;
    }
    for (;;)
    {
      synchronized (((aw)localObject1).qgX)
      {
        ((aw)localObject1).kNA = ((String)localObject3);
        this.pPW.qhd.pWe = com.tencent.mm.plugin.sns.model.ae.bjk().pWe;
        this.pPW.qhd.qgW = true;
        this.pPW.load();
        i = k;
        if (k >= this.pPW.getCount())
        {
          i = this.pPW.getCount() - 1;
          w.e("MicroMsg.SnsTimeLineUI", "error position %s", new Object[] { Integer.valueOf(this.pPW.getCount()) });
        }
        this.pQp.mqO.setAdapter(this.pPW);
        w.d("MicroMsg.SnsTimeLineUI", "resume position %s", new Object[] { Integer.valueOf(com.tencent.mm.plugin.sns.model.ae.bjk().pWf) });
        this.pQp.mqO.setSelectionFromTop(i, com.tencent.mm.plugin.sns.model.ae.bjk().pWf);
        this.pPY.setVisibility(4);
        i = this.pPW.getCount();
        k = this.pQp.mqO.getFirstVisiblePosition();
        if (k < i) {
          this.pQg = com.tencent.mm.plugin.sns.data.i.g(this.pPW.vf(k));
        }
        com.tencent.mm.kernel.h.xz();
        this.pQe = ((Integer)com.tencent.mm.kernel.h.xy().xh().get(327776, Integer.valueOf(0))).intValue();
        this.pQb.pPi = new bh(this, this.pPW.qhc, this.pQb.pxF);
        this.pQb.pPk = new com.tencent.mm.plugin.sns.f.b(this, this.pPW.qhc.pxE, this.pQb.pxF);
        this.pQb.pPj = new c(this, this.pPW.qhc.pxE, this.pQb.pxF, this.pQb.pPk);
        if (this.pQk != null) {
          this.pQk.a(this.pQb.pPk);
        }
        if (i > 0)
        {
          ??? = this.pPW.vf(0);
          if ((this.pQb.pOZ != null) && (this.pQb.pOZ.pvl != null)) {
            this.pQb.pOZ.pvl.pzJ = ???.field_snsId;
          }
          ??? = com.tencent.mm.plugin.sns.h.d.pBQ;
          if (???.fUO != 0)
          {
            if (???.pBR.isEmpty())
            {
              ???.fJJ.setLong(2, bg.Pu());
              ???.pBS.clear();
            }
            w.i("MicroMsg.SnsReportHelper", "enterTimeLine exposureFeedSize %d", new Object[] { Integer.valueOf(???.pBR.size()) });
          }
        }
        com.tencent.mm.plugin.report.service.g.ork.A(13312, "1," + bg.Pv());
        com.tencent.mm.sdk.b.a.vgX.b(this.pQr);
        if (getIntent().getBooleanExtra("is_need_resend_sns", false))
        {
          af.i(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(8663754342400L, 64550);
              com.tencent.mm.ui.base.h.a(En_424b8e16.this, En_424b8e16.this.getString(i.j.dMv), "", En_424b8e16.this.getString(i.j.dMw), En_424b8e16.this.getString(i.j.cSk), new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
              {
                public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
                {
                  GMTrace.i(8321499136000L, 62000);
                  paramAnonymous2DialogInterface = new nj();
                  com.tencent.mm.sdk.b.a.vgX.m(paramAnonymous2DialogInterface);
                  GMTrace.o(8321499136000L, 62000);
                }
              }, new DialogInterface.OnClickListener()
              {
                public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
                {
                  GMTrace.i(8617583443968L, 64206);
                  paramAnonymous2DialogInterface = new kq();
                  com.tencent.mm.sdk.b.a.vgX.m(paramAnonymous2DialogInterface);
                  GMTrace.o(8617583443968L, 64206);
                }
              });
              GMTrace.o(8663754342400L, 64550);
            }
          }, 500L);
          getIntent().putExtra("is_need_resend_sns", false);
        }
        com.tencent.mm.kernel.h.xz();
        if (com.tencent.mm.kernel.h.xw().wL())
        {
          com.tencent.mm.kernel.h.xz();
          com.tencent.mm.kernel.h.xy().xh().set(589825, Boolean.valueOf(false));
        }
        this.pQb.pOY = this.pQi;
        ??? = this.pQi;
        i = this.pQp.pmG;
        localObject1 = this.FM.getCustomView();
        ???.pmG = i;
        ???.pnv = ((View)localObject1);
        ???.activity = this;
        com.tencent.mm.sdk.b.a.vgX.b(this.pQv);
        com.tencent.mm.sdk.b.a.vgX.b(this.pQw);
        com.tencent.mm.sdk.b.a.vgX.b(this.pQx);
        com.tencent.mm.sdk.b.a.vgX.b(this.pQy);
        com.tencent.mm.sdk.b.a.vgX.b(this.pQz);
        com.tencent.mm.sdk.b.a.vgX.b(this.pQB);
        com.tencent.mm.sdk.b.a.vgX.b(this.pQA);
        com.tencent.mm.sdk.b.a.vgX.b(this.pvK);
        com.tencent.mm.sdk.b.a.vgX.b(this.pQC);
        com.tencent.mm.sdk.b.a.vgX.b(this.pQD);
        com.tencent.mm.sdk.b.a.vgX.b(this.pQF);
        com.tencent.mm.sdk.b.a.vgX.b(this.pQE);
        com.tencent.mm.sdk.b.a.vgX.b(this.pQG);
        com.tencent.mm.plugin.sns.abtest.c.bhC();
        com.tencent.mm.plugin.sns.abtest.a.d(this, this.pQb.pxF);
        if (this.pQh != null)
        {
          ??? = this.pQh;
          localObject1 = this.pQp.mqO;
          localObject3 = this.pQp.pzn;
          ???.hvF = ((ListView)localObject1);
          ???.pzn = ((SnsHeader)localObject3);
        }
        if ((this.pQb != null) && (this.pQb.pOZ != null))
        {
          ??? = this.pQb.pOZ.pvl;
          w.i("MicroMsg.SnsBrowseInfoHelper", "onTimelineCreate");
          ???.pzI = true;
          ???.pBF = System.currentTimeMillis();
        }
        boolean bool = getIntent().getBooleanExtra("enter_by_red", false);
        if ((this.pQb != null) && (this.pQb.pOZ != null))
        {
          ??? = this.pQb.pOZ.pvl;
          if (!bool) {
            break label1772;
          }
          i = j;
          ???.pzV = i;
        }
        com.tencent.mm.plugin.sns.model.ae.bja().prm.clear();
        com.tencent.mm.pluginsdk.e.h(this);
        GMTrace.o(8453032509440L, 62980);
        return;
        i = 0;
        break;
        label1693:
        if (!this.pPg) {
          break label409;
        }
        this.pPg = com.tencent.mm.plugin.sns.model.ae.bjk().boe();
        break label409;
        label1713:
        if (!this.pPg) {
          break label658;
        }
        this.pPg = com.tencent.mm.plugin.sns.model.ae.bjk().boe();
      }
      label1740:
      this.pQp.mqO.setAdapter(this.pPW);
      this.pPY.setVisibility(0);
      this.pPW.load();
      continue;
      label1772:
      i = 0;
    }
  }
  
  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    GMTrace.i(8454911557632L, 62994);
    boolean bool = super.onCreateOptionsMenu(paramMenu);
    this.pQV = paramMenu.add(0, 0, 0, i.j.pio);
    int i;
    if (this.pQS == null)
    {
      i = cN().cO().getHeight();
      if (i != 0) {
        break label309;
      }
      paramMenu = getResources().getDisplayMetrics();
      if (paramMenu.widthPixels <= paramMenu.heightPixels) {
        break label295;
      }
      i = getResources().getDimensionPixelSize(i.d.aPM);
    }
    label295:
    label309:
    for (;;)
    {
      int j = com.tencent.mm.br.a.fromDPToPix(this, 56);
      paramMenu = new ViewGroup.LayoutParams(j, i);
      this.pQS = View.inflate(this, i.g.pgt, null);
      this.pQT = ((ImageView)this.pQS.findViewById(i.f.icon));
      this.pQU = this.pQS.findViewById(i.f.chB);
      this.pQS.setLayoutParams(paramMenu);
      this.pQS.setBackgroundResource(i.e.aTq);
      this.pQS.setMinimumHeight(i);
      this.pQS.setMinimumWidth(j);
      this.pQT.setImageResource(i.i.cKW);
      this.pQS.setContentDescription(getString(i.j.eex));
      this.pQS.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(8688584622080L, 64735);
          En_424b8e16.E(En_424b8e16.this);
          GMTrace.o(8688584622080L, 64735);
        }
      });
      this.pQS.setOnLongClickListener(new View.OnLongClickListener()
      {
        public final boolean onLongClick(View paramAnonymousView)
        {
          GMTrace.i(8388473782272L, 62499);
          if ((En_424b8e16.g(En_424b8e16.this) != null) && (En_424b8e16.g(En_424b8e16.this).pOZ != null)) {
            En_424b8e16.g(En_424b8e16.this).pOZ.pvl.hI(true);
          }
          com.tencent.mm.kernel.h.xz();
          if (!((Boolean)com.tencent.mm.kernel.h.xy().xh().get(7490, Boolean.valueOf(true))).booleanValue())
          {
            paramAnonymousView = new Intent();
            paramAnonymousView.setClass(En_424b8e16.this, En_c4f742e5.class);
            paramAnonymousView.putExtra("KSnsPostManu", true);
            paramAnonymousView.putExtra("KTouchCameraTime", bg.Pu());
            paramAnonymousView.putExtra("sns_comment_type", 1);
            paramAnonymousView.putExtra("Ksnsupload_type", 9);
            com.tencent.mm.modelsns.b localb = com.tencent.mm.modelsns.b.ha(705);
            localb.he(localb.gVA).lv(System.currentTimeMillis()).he(localb.gVC).he(1);
            localb = com.tencent.mm.plugin.sns.h.e.pBV.a(localb);
            localb.LR();
            localb.b(paramAnonymousView, "intent_key_StatisticsOplog");
            En_424b8e16.this.startActivityForResult(paramAnonymousView, 9);
          }
          for (;;)
          {
            GMTrace.o(8388473782272L, 62499);
            return true;
            En_424b8e16.this.startActivity(new Intent().setClass(En_424b8e16.this, SnsLongMsgUI.class));
            com.tencent.mm.kernel.h.xz();
            com.tencent.mm.kernel.h.xy().xh().set(7490, Boolean.valueOf(false));
          }
        }
      });
      this.pQS.post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(8502693068800L, 63350);
          En_424b8e16.this.aQ();
          GMTrace.o(8502693068800L, 63350);
        }
        
        public final String toString()
        {
          GMTrace.i(8502827286528L, 63351);
          String str = super.toString() + "|supportInvalidateOptionsMenu";
          GMTrace.o(8502827286528L, 63351);
          return str;
        }
      });
      android.support.v4.view.m.a(this.pQV, this.pQS);
      android.support.v4.view.m.a(this.pQV, 2);
      this.pQV.setVisible(true);
      bmZ();
      GMTrace.o(8454911557632L, 62994);
      return bool;
      i = getResources().getDimensionPixelSize(i.d.aPN);
    }
  }
  
  public void onDestroy()
  {
    GMTrace.i(8453300944896L, 62982);
    this.pQf = true;
    w.i("MicroMsg.SnsTimeLineUI", "timeline on destory");
    com.tencent.mm.sdk.b.a.vgX.c(this.pQv);
    com.tencent.mm.sdk.b.a.vgX.c(this.pQw);
    com.tencent.mm.sdk.b.a.vgX.c(this.pQx);
    com.tencent.mm.sdk.b.a.vgX.c(this.pQy);
    com.tencent.mm.sdk.b.a.vgX.c(this.pQz);
    com.tencent.mm.sdk.b.a.vgX.c(this.pQB);
    com.tencent.mm.sdk.b.a.vgX.c(this.pQA);
    com.tencent.mm.sdk.b.a.vgX.c(this.pvK);
    com.tencent.mm.sdk.b.a.vgX.c(this.pQC);
    com.tencent.mm.sdk.b.a.vgX.c(this.pQD);
    com.tencent.mm.sdk.b.a.vgX.c(this.pQE);
    com.tencent.mm.sdk.b.a.vgX.c(this.pQF);
    com.tencent.mm.sdk.b.a.vgX.c(this.pQG);
    long l;
    Object localObject4;
    label344:
    String str;
    if ((this.pQb != null) && (this.pQb.pOZ != null))
    {
      localObject1 = this.pQb.pOZ.pvl;
      if (this.pQs)
      {
        i = 1;
        ((com.tencent.mm.plugin.sns.h.b)localObject1).pzW = i;
      }
    }
    else
    {
      localObject2 = com.tencent.mm.plugin.sns.h.d.pBQ;
      if (((com.tencent.mm.plugin.sns.h.d)localObject2).fUO == 0) {
        break label599;
      }
      w.i("MicroMsg.SnsReportHelper", "exitTimeline exposureFeedSize %d, exposureAppIdSize %d", new Object[] { Integer.valueOf(((com.tencent.mm.plugin.sns.h.d)localObject2).pBR.size()), Integer.valueOf(((com.tencent.mm.plugin.sns.h.d)localObject2).pBS.size()) });
      l = ((com.tencent.mm.plugin.sns.h.d)localObject2).fJJ.getLong(2, 0L);
      if ((((com.tencent.mm.plugin.sns.h.d)localObject2).pBR.isEmpty()) || ((((com.tencent.mm.plugin.sns.h.d)localObject2).pBR.size() <= ((com.tencent.mm.plugin.sns.h.d)localObject2).pBT) && (bg.aG(l) <= ((com.tencent.mm.plugin.sns.h.d)localObject2).pBU))) {
        break label1356;
      }
      localObject3 = new StringBuffer();
      localObject4 = ((com.tencent.mm.plugin.sns.h.d)localObject2).pBR.keySet().iterator();
      i = 0;
      if (!((Iterator)localObject4).hasNext()) {
        break label464;
      }
      str = (String)((Iterator)localObject4).next();
      localObject1 = (String)((com.tencent.mm.plugin.sns.h.d)localObject2).pBS.get(str);
      if (bg.nm((String)localObject1)) {
        break label456;
      }
      i = 1;
    }
    for (;;)
    {
      ((StringBuffer)localObject3).append(str + "#" + ((com.tencent.mm.plugin.sns.h.d)localObject2).pBR.get(str) + "#" + (String)localObject1 + "|");
      break label344;
      i = 0;
      break;
      label456:
      localObject1 = "";
    }
    label464:
    ((StringBuffer)localObject3).append("," + l + "," + bg.Pu() + ",1," + i);
    w.v("MicroMsg.SnsReportHelper", "report(13226) %d: %s", new Object[] { Integer.valueOf(13226), localObject3 });
    com.tencent.mm.plugin.report.service.g.ork.A(13226, ((StringBuffer)localObject3).toString());
    ((com.tencent.mm.plugin.sns.h.d)localObject2).fJJ.set(3, null);
    ((com.tencent.mm.plugin.sns.h.d)localObject2).fJJ.set(4, null);
    ((com.tencent.mm.plugin.sns.h.d)localObject2).pBR.clear();
    ((com.tencent.mm.plugin.sns.h.d)localObject2).pBS.clear();
    ((com.tencent.mm.plugin.sns.h.d)localObject2).fJJ.setLong(2, bg.Pu());
    label599:
    com.tencent.mm.kernel.h.xz();
    Object localObject3 = (String)com.tencent.mm.kernel.h.xy().xh().get(68377, null);
    int i = this.pPW.getCount();
    Object localObject1 = "";
    Object localObject2 = null;
    if (i > 0)
    {
      localObject2 = this.pPW.vf(i - 1);
      localObject1 = com.tencent.mm.plugin.sns.data.i.g((com.tencent.mm.plugin.sns.storage.m)localObject2);
    }
    if ((this.pQb != null) && (this.pQb.pOZ != null))
    {
      localObject4 = this.pQb.pOZ.pvl;
      if (localObject2 == null)
      {
        i = -1;
        label696:
        w.i("MicroMsg.SnsBrowseInfoHelper", "onTimelineDestroy");
        l = System.currentTimeMillis() - ((com.tencent.mm.plugin.sns.h.b)localObject4).pBF;
        ((com.tencent.mm.plugin.sns.h.b)localObject4).pzK += l;
        w.i("MicroMsg.SnsBrowseInfoHelper", "onTimelineEns passedtime: " + l + " BrowseTime: " + ((com.tencent.mm.plugin.sns.h.b)localObject4).pzK + "BackgroundTime: " + ((com.tencent.mm.plugin.sns.h.b)localObject4).pAt);
        com.tencent.mm.sdk.f.e.b(new b.2((com.tencent.mm.plugin.sns.h.b)localObject4, i), "onTimelineDestroy_report", 1);
        ((com.tencent.mm.plugin.sns.h.b)localObject4).pzI = false;
      }
    }
    else
    {
      localObject2 = com.tencent.mm.modelsns.b.ha(704);
      if (((com.tencent.mm.modelsns.b)localObject2).LN())
      {
        ((com.tencent.mm.modelsns.b)localObject2).bC(this.pQs);
        if (bg.nm((String)localObject3)) {
          break label1396;
        }
      }
    }
    int m;
    label1356:
    label1396:
    for (boolean bool = true;; bool = false)
    {
      ((com.tencent.mm.modelsns.b)localObject2).bC(bool);
      ((com.tencent.mm.modelsns.b)localObject2).lu(this.pQg);
      ((com.tencent.mm.modelsns.b)localObject2).lu((String)localObject1);
      ((com.tencent.mm.modelsns.b)localObject2).lu((String)localObject1);
      ((com.tencent.mm.modelsns.b)localObject2).hd(this.pQp.qiQ);
      ((com.tencent.mm.modelsns.b)localObject2).lu("");
      com.tencent.mm.modelsns.b.LQ();
      ((com.tencent.mm.modelsns.b)localObject2).LR();
      localObject1 = (AdListView)this.pQp.bnd();
      this.pQk.pwd.clear();
      com.tencent.mm.plugin.sns.model.ae.biU().clean();
      localObject2 = com.tencent.mm.plugin.sns.model.ae.biX();
      com.tencent.mm.plugin.sns.model.ae.biQ().post(new i.5((com.tencent.mm.plugin.sns.a.b.i)localObject2));
      ((AdListView)localObject1).pND.clear();
      ((AdListView)localObject1).pND = null;
      ((AdListView)localObject1).pNE.bir();
      ((AdListView)localObject1).pNE = null;
      com.tencent.mm.plugin.sns.model.t.bix();
      if (!com.tencent.mm.plugin.sns.model.ae.biM()) {
        this.pQL.removeCallbacks(this.pQq);
      }
      com.tencent.mm.kernel.h.xz();
      if (com.tencent.mm.kernel.h.xw().wL())
      {
        com.tencent.mm.kernel.h.xz();
        com.tencent.mm.kernel.h.xx().fYr.b(213, this);
        com.tencent.mm.kernel.h.xz();
        com.tencent.mm.kernel.h.xx().fYr.b(682, this);
        com.tencent.mm.kernel.h.xz();
        com.tencent.mm.kernel.h.xx().fYr.b(218, this);
        com.tencent.mm.kernel.h.xz();
        com.tencent.mm.kernel.h.xx().fYr.b(211, this);
        com.tencent.mm.kernel.h.xz();
        com.tencent.mm.kernel.h.xx().fYr.b(683, this);
        com.tencent.mm.kernel.h.xz();
        com.tencent.mm.kernel.h.xy().xh().set(327776, Integer.valueOf(this.pQe));
        com.tencent.mm.kernel.h.xz();
        com.tencent.mm.kernel.h.xy().xh().set(589825, Boolean.valueOf(false));
      }
      if (this.pQb != null)
      {
        localObject1 = this.pQb;
        ((j)localObject1).pPl.art();
        if (((j)localObject1).pPb != null) {
          ((j)localObject1).pPb.aMT();
        }
        com.tencent.mm.sdk.b.a.vgX.c(((j)localObject1).pPn);
      }
      com.tencent.mm.plugin.sns.model.ae.aDa().removeCallbacks(this.pQM);
      if (this.pPW == null) {
        break label1689;
      }
      m = this.pQp.mqO.getFirstVisiblePosition();
      i = 0;
      j = 0;
      while (j < this.pQp.mqO.getCount())
      {
        localObject1 = this.pQp.mqO.getChildAt(j);
        int k = i;
        if (localObject1 != null)
        {
          int n = this.pQp.mqO.getPositionForView((View)localObject1);
          k = i;
          if (n == m)
          {
            localObject2 = new int[2];
            ((View)localObject1).getLocationInWindow((int[])localObject2);
            w.d("MicroMsg.SnsTimeLineUI", "this is the pos for view %d x %d y %d", new Object[] { Integer.valueOf(n), Integer.valueOf(localObject2[0]), Integer.valueOf(localObject2[1]) });
            k = localObject2[1];
          }
        }
        j += 1;
        i = k;
      }
      ((com.tencent.mm.plugin.sns.h.d)localObject2).fJJ.set(3, ((com.tencent.mm.plugin.sns.h.d)localObject2).pBR);
      ((com.tencent.mm.plugin.sns.h.d)localObject2).fJJ.set(4, ((com.tencent.mm.plugin.sns.h.d)localObject2).pBS);
      break;
      i = ((com.tencent.mm.plugin.sns.storage.m)localObject2).field_createTime;
      break label696;
    }
    int j = BackwardSupportUtil.b.a(this, 50.0F);
    if ((!com.tencent.mm.plugin.sns.model.ae.biM()) && (this.pPV.biT() != null))
    {
      localObject1 = com.tencent.mm.plugin.sns.model.ae.bjk();
      localObject2 = this.pPW.qhd.kNA;
      localObject3 = this.pPW.qhd.pWe;
      l = this.pPV.biT().pvz;
      ((aj)localObject1).pWd = bg.Pw();
      ((aj)localObject1).kNA = ((String)localObject2);
      ((aj)localObject1).pWe = ((String)localObject3);
      ((aj)localObject1).pvz = l;
      ((aj)localObject1).position = m;
      ((aj)localObject1).pWf = (i - j);
      w.i("MicroMsg.ResumeSnsControl", "lastSnsTime %s limitSeq %s respMinSeq %s timeLastId %s position %s topy %s", new Object[] { Long.valueOf(((aj)localObject1).pWd), localObject2, localObject3, Long.valueOf(l), Integer.valueOf(m), Integer.valueOf(((aj)localObject1).pWf) });
    }
    w.d("MicroMsg.SnsTimeLineUI", "top h %d", new Object[] { Integer.valueOf(i - j) });
    localObject1 = this.pPW.qhc;
    com.tencent.mm.sdk.b.a.vgX.c(((av)localObject1).ian);
    if (com.tencent.mm.plugin.sns.model.ae.biM()) {
      w.e("MicroMsg.SnsTimeLineBaseAdapter", "is invalid to getSnsInfoStorage");
    }
    for (;;)
    {
      localObject1 = this.pPW.qhc;
      if (((av)localObject1).pYR != null) {
        ((av)localObject1).pYR.activity = null;
      }
      localObject1 = this.pPW.qhc;
      com.tencent.mm.sdk.b.a.vgX.c(((av)localObject1).ian);
      this.pPW.qhc.bpB();
      label1689:
      az.clean();
      com.tencent.mm.sdk.b.a.vgX.c(this.pQr);
      com.tencent.mm.kernel.h.xz();
      if (com.tencent.mm.kernel.h.xw().wL()) {
        com.tencent.mm.plugin.sns.model.ae.bja().prm.clear();
      }
      this.pPW = null;
      this.pQb = null;
      ax.bpG();
      com.tencent.mm.plugin.sns.abtest.c.bhD();
      localObject1 = com.tencent.mm.plugin.sns.model.ae.biU();
      com.tencent.mm.kernel.h.xz();
      com.tencent.mm.kernel.h.xx().fYr.b(291, (com.tencent.mm.ad.e)localObject1);
      com.tencent.mm.plugin.sns.abtest.a.clean();
      this.pQp.onDestroy();
      super.onDestroy();
      com.tencent.mm.kiss.widget.textview.c.gaW.xN();
      GMTrace.o(8453300944896L, 62982);
      return;
      com.tencent.mm.plugin.sns.model.ae.bja();
    }
  }
  
  public void onPause()
  {
    GMTrace.i(8453972033536L, 62987);
    this.pPY.clearAnimation();
    com.tencent.mm.plugin.sns.model.t.b(this);
    com.tencent.mm.plugin.sns.model.ae.bja().pro = null;
    Object localObject = new rm();
    ((rm)localObject).eWo.type = 1;
    com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject);
    if (this.pPW != null)
    {
      localObject = this.pPW.qhc;
      com.tencent.mm.sdk.b.a.vgX.c(((av)localObject).pZg);
      com.tencent.mm.sdk.b.a.vgX.c(((av)localObject).pZf);
      com.tencent.mm.sdk.b.a.vgX.c(((av)localObject).pZh);
    }
    if ((this.pQb != null) && (this.pQb.pOY != null)) {
      this.pQb.pOY.jro = bg.Pw();
    }
    if ((this.pQb != null) && (this.pQb.pOZ != null)) {
      this.pQb.pOZ.pvl.hE(false);
    }
    com.tencent.mm.modelstat.d.e("En_424b8e16", this.jro, bg.Pu());
    bb.onPause();
    super.onPause();
    com.tencent.mm.sdk.b.a.vgX.c(this.pQu);
    com.tencent.mm.sdk.b.a.vgX.c(this.pQt);
    GMTrace.o(8453972033536L, 62987);
  }
  
  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    GMTrace.i(8456790605824L, 63008);
    w.i("MicroMsg.SnsTimeLineUI", "summerper onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramArrayOfInt[0]), Long.valueOf(Thread.currentThread().getId()) });
    switch (paramInt)
    {
    }
    label176:
    for (;;)
    {
      GMTrace.o(8456790605824L, 63008);
      return;
      if (paramArrayOfInt[0] == 0)
      {
        bna();
        GMTrace.o(8456790605824L, 63008);
        return;
      }
      if ("android.permission.CAMERA".equals(paramArrayOfString[0])) {}
      for (paramInt = i.j.dNn;; paramInt = i.j.dNr)
      {
        if (paramArrayOfInt[0] == 0) {
          break label176;
        }
        com.tencent.mm.ui.base.h.a(this, getString(paramInt), getString(i.j.dNu), getString(i.j.dFX), getString(i.j.cSk), false, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(17837401833472L, 132899);
            paramAnonymousDialogInterface.dismiss();
            En_424b8e16.this.startActivity(new Intent("android.settings.MANAGE_APPLICATIONS_SETTINGS"));
            GMTrace.o(17837401833472L, 132899);
          }
        }, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(8478533877760L, 63170);
            paramAnonymousDialogInterface.dismiss();
            GMTrace.o(8478533877760L, 63170);
          }
        });
        break;
      }
    }
  }
  
  public void onResume()
  {
    GMTrace.i(8453435162624L, 62983);
    if ((com.tencent.mm.sdk.a.b.bPq()) && (com.tencent.mm.sdk.a.b.bPo())) {
      pQQ.add(this);
    }
    bb.onResume();
    super.onResume();
    this.jro = bg.Pu();
    int i;
    Object localObject2;
    com.tencent.mm.plugin.sns.storage.m localm;
    Object localObject1;
    if (this.pQP)
    {
      this.pQP = false;
      i = this.pPW.getCount();
      if (getIntent().getBooleanExtra("is_from_find_more", false))
      {
        localObject2 = com.tencent.mm.modelsns.b.c(getIntent(), "enter_log");
        if (localObject2 != null)
        {
          if (i <= 0) {
            break label670;
          }
          localm = this.pPW.vf(0);
          if (localm != null) {
            break label636;
          }
          localObject1 = "0";
          ((com.tencent.mm.modelsns.b)localObject2).lu((String)localObject1);
          if (localm != null) {
            break label648;
          }
          localObject1 = "0";
          label135:
          ((com.tencent.mm.modelsns.b)localObject2).lu((String)localObject1);
          ((com.tencent.mm.modelsns.b)localObject2).lu(String.valueOf(i));
          label152:
          ((com.tencent.mm.modelsns.b)localObject2).LR();
        }
      }
    }
    if (this.mScreenWidth == 0)
    {
      localObject1 = new DisplayMetrics();
      getWindowManager().getDefaultDisplay().getMetrics((DisplayMetrics)localObject1);
      this.mScreenWidth = ((DisplayMetrics)localObject1).widthPixels;
      this.mScreenHeight = ((DisplayMetrics)localObject1).heightPixels;
      localObject1 = this.pQh;
      i = this.mScreenWidth;
      int j = this.mScreenHeight;
      ((com.tencent.mm.plugin.sns.h.a)localObject1).mScreenWidth = i;
      ((com.tencent.mm.plugin.sns.h.a)localObject1).mScreenHeight = j;
    }
    if (com.tencent.mm.plugin.sns.model.ae.biM()) {
      finish();
    }
    com.tencent.mm.plugin.sns.model.ae.bja().pro = this.pPW.qhc;
    xI().D(c.b.class);
    com.tencent.mm.plugin.sns.model.t.a(this);
    if (this.pQa) {
      this.pPY.post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(8506048512000L, 63375);
          w.i("MicroMsg.SnsTimeLineUI", "onResume go to playAnim " + En_424b8e16.w(En_424b8e16.this));
          if (En_424b8e16.w(En_424b8e16.this))
          {
            En_424b8e16.x(En_424b8e16.this);
            En_424b8e16.y(En_424b8e16.this).bnn();
          }
          GMTrace.o(8506048512000L, 63375);
        }
      });
    }
    for (;;)
    {
      localObject1 = new rm();
      ((rm)localObject1).eWo.eWp = this.pQp.mqO.getFirstVisiblePosition();
      ((rm)localObject1).eWo.eWq = this.pQp.mqO.getLastVisiblePosition();
      ((rm)localObject1).eWo.eWr = this.pQp.mqO.getHeaderViewsCount();
      ((rm)localObject1).eWo.type = 0;
      com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject1);
      if ((this.pQb != null) && (this.pQb.pOY != null)) {
        this.pQb.pOY.onResume();
      }
      if (this.pPW != null)
      {
        localObject1 = this.pPW.qhc;
        com.tencent.mm.sdk.b.a.vgX.b(((av)localObject1).pZg);
        com.tencent.mm.sdk.b.a.vgX.b(((av)localObject1).pZf);
        com.tencent.mm.sdk.b.a.vgX.b(((av)localObject1).pZh);
      }
      if ((this.pQb != null) && (this.pQb.pOZ != null))
      {
        this.pQb.pOZ.pvl.hE(true);
        this.pQb.pOZ.pvl.hF(false);
        this.pQb.pOZ.pvl.hG(false);
        this.pQb.pOZ.pvl.hH(false);
        this.pQb.pOZ.pvl.hR(false);
        localObject1 = this.pQb.pOZ.pvl;
        ((com.tencent.mm.plugin.sns.h.b)localObject1).hP(false);
        ((com.tencent.mm.plugin.sns.h.b)localObject1).hQ(false);
        ((com.tencent.mm.plugin.sns.h.b)localObject1).hJ(false);
        ((com.tencent.mm.plugin.sns.h.b)localObject1).hO(false);
        ((com.tencent.mm.plugin.sns.h.b)localObject1).hM(false);
        ((com.tencent.mm.plugin.sns.h.b)localObject1).hO(false);
        ((com.tencent.mm.plugin.sns.h.b)localObject1).hS(false);
        ((com.tencent.mm.plugin.sns.h.b)localObject1).hN(false);
        ((com.tencent.mm.plugin.sns.h.b)localObject1).hO(false);
        ((com.tencent.mm.plugin.sns.h.b)localObject1).hK(false);
        ((com.tencent.mm.plugin.sns.h.b)localObject1).hL(false);
      }
      localObject1 = com.tencent.mm.plugin.sns.model.ae.bja();
      ((com.tencent.mm.plugin.sns.model.g)localObject1).prp = 0L;
      ((com.tencent.mm.plugin.sns.model.g)localObject1).prq = 0L;
      com.tencent.mm.sdk.b.a.vgX.b(this.pQu);
      com.tencent.mm.sdk.b.a.vgX.b(this.pQt);
      GMTrace.o(8453435162624L, 62983);
      return;
      label636:
      localObject1 = com.tencent.mm.plugin.sns.data.i.dt(localm.field_snsId);
      break;
      label648:
      localObject1 = localm.field_createTime;
      break label135;
      label670:
      ((com.tencent.mm.modelsns.b)localObject2).lu("");
      ((com.tencent.mm.modelsns.b)localObject2).lu("");
      ((com.tencent.mm.modelsns.b)localObject2).lu("0");
      break label152;
      localObject1 = this.pQc;
      if (((a)localObject1).pQZ.pPY.getVisibility() == 0)
      {
        ((a)localObject1).init();
        localObject2 = (AbsoluteLayout.LayoutParams)((a)localObject1).pQZ.pPY.getLayoutParams();
        ((AbsoluteLayout.LayoutParams)localObject2).y = ((int)((a)localObject1).pRn);
        ((a)localObject1).pQZ.pPY.setLayoutParams((ViewGroup.LayoutParams)localObject2);
        ((a)localObject1).pQZ.pPY.invalidate();
      }
    }
  }
  
  public void onStart()
  {
    GMTrace.i(8453703598080L, 62985);
    super.onStart();
    GMTrace.o(8453703598080L, 62985);
  }
  
  public void onStop()
  {
    GMTrace.i(8453837815808L, 62986);
    super.onStop();
    GMTrace.o(8453837815808L, 62986);
  }
  
  final class a
    extends Animation
  {
    ListView mqO;
    float pRk;
    float pRl;
    float pRm;
    float pRn;
    float pRo;
    private float pRp;
    boolean pRq;
    int pRr;
    boolean pRs;
    int pRt;
    float pRu;
    float pRv;
    
    public a(ListView paramListView)
    {
      GMTrace.i(8542153080832L, 63644);
      this.pRm = -1.0F;
      this.pRo = 0.0F;
      this.pRs = false;
      this.pRt = 0;
      this.pRu = 0.0F;
      this.pRv = 0.0F;
      this.mqO = paramListView;
      GMTrace.o(8542153080832L, 63644);
    }
    
    protected final void applyTransformation(float paramFloat, Transformation paramTransformation)
    {
      GMTrace.i(8542689951744L, 63648);
      if (En_424b8e16.l(En_424b8e16.this).getVisibility() != 0)
      {
        GMTrace.o(8542689951744L, 63648);
        return;
      }
      float f = this.pRp;
      f = (float)getDuration() * (paramFloat - f);
      if (f < 2.0F)
      {
        GMTrace.o(8542689951744L, 63648);
        return;
      }
      this.pRp = paramFloat;
      En_424b8e16.l(En_424b8e16.this).setImageResource(i.i.phh);
      En_424b8e16.l(En_424b8e16.this).a(QImageView.a.xsq);
      if (((float)getDuration() * paramFloat >= (float)(getDuration() - 600L)) || (this.pRq))
      {
        paramTransformation = (AbsoluteLayout.LayoutParams)En_424b8e16.l(En_424b8e16.this).getLayoutParams();
        this.pRo = (paramTransformation.y - f / 3.0F);
        paramTransformation.y = ((int)this.pRo);
        En_424b8e16.l(En_424b8e16.this).setLayoutParams(paramTransformation);
      }
      for (;;)
      {
        En_424b8e16.l(En_424b8e16.this).invalidate();
        GMTrace.o(8542689951744L, 63648);
        return;
        En_424b8e16.l(En_424b8e16.this).mMatrix.postRotate(f / 2.5F, this.pRk, this.pRl);
      }
    }
    
    public final void bnn()
    {
      GMTrace.i(8542287298560L, 63645);
      w.d("MicroMsg.SnsTimeLineUI", "animtest playLoading");
      if (En_424b8e16.l(En_424b8e16.this).getVisibility() != 0)
      {
        GMTrace.o(8542287298560L, 63645);
        return;
      }
      init();
      this.pRo = (this.pRm + 20.0F);
      AbsoluteLayout.LayoutParams localLayoutParams = (AbsoluteLayout.LayoutParams)En_424b8e16.l(En_424b8e16.this).getLayoutParams();
      localLayoutParams.y = ((int)this.pRm);
      En_424b8e16.l(En_424b8e16.this).setLayoutParams(localLayoutParams);
      bno();
      GMTrace.o(8542287298560L, 63645);
    }
    
    public final void bno()
    {
      GMTrace.i(8542421516288L, 63646);
      if (En_424b8e16.l(En_424b8e16.this).getVisibility() != 0)
      {
        GMTrace.o(8542421516288L, 63646);
        return;
      }
      init();
      En_424b8e16.l(En_424b8e16.this).clearAnimation();
      En_424b8e16.l(En_424b8e16.this).startAnimation(this);
      if (this.pRo >= this.pRm)
      {
        setDuration(20000L);
        this.pRq = false;
        GMTrace.o(8542421516288L, 63646);
        return;
      }
      setDuration(600L);
      this.pRq = true;
      GMTrace.o(8542421516288L, 63646);
    }
    
    final void init()
    {
      GMTrace.i(8542555734016L, 63647);
      if ((this.pRm == -1.0F) || (this.pRl < 0.1D))
      {
        this.pRm = BackwardSupportUtil.b.a(En_424b8e16.this, 25.0F);
        this.pRk = (En_424b8e16.l(En_424b8e16.this).getWidth() / 2);
        this.pRl = (En_424b8e16.l(En_424b8e16.this).getHeight() / 2);
        this.pRn = (this.pRl * -2.0F - 3.0F);
        w.d("MicroMsg.SnsTimeLineUI", "MIN_Y" + this.pRn);
        this.pRo = this.pRn;
        if (!this.pRs)
        {
          w.i("MicroMsg.SnsTimeLineUI", "initState");
          this.pRt = ((AbsoluteLayout.LayoutParams)En_424b8e16.l(En_424b8e16.this).getLayoutParams()).y;
          this.pRu = this.pRm;
          this.pRv = this.pRo;
        }
        this.pRs = true;
      }
      GMTrace.o(8542555734016L, 63647);
    }
    
    public final void initialize(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      GMTrace.i(8542824169472L, 63649);
      super.initialize(paramInt1, paramInt2, paramInt3, paramInt4);
      this.pRp = 0.0F;
      this.pRo = this.pRm;
      GMTrace.o(8542824169472L, 63649);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\ui\En_424b8e16.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */