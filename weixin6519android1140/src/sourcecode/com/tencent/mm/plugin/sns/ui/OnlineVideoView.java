package com.tencent.mm.plugin.sns.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.cf;
import com.tencent.mm.g.a.cf.b;
import com.tencent.mm.g.a.kw;
import com.tencent.mm.g.a.kw.a;
import com.tencent.mm.g.a.ph;
import com.tencent.mm.g.a.pk;
import com.tencent.mm.g.a.pk.a;
import com.tencent.mm.g.a.qf;
import com.tencent.mm.kernel.e;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.modelvideo.o;
import com.tencent.mm.plugin.s.j;
import com.tencent.mm.plugin.sns.i.e;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.i.j;
import com.tencent.mm.plugin.sns.model.am;
import com.tencent.mm.plugin.sns.model.ap;
import com.tencent.mm.plugin.sns.model.aq;
import com.tencent.mm.plugin.sns.model.b.b;
import com.tencent.mm.plugin.sns.storage.m;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView;
import com.tencent.mm.pluginsdk.ui.tools.VideoTextureView;
import com.tencent.mm.pluginsdk.ui.tools.f.a;
import com.tencent.mm.pluginsdk.ui.tools.f.e;
import com.tencent.mm.protocal.c.anu;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.an;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.ui.widget.MMPinProgressBtn;
import com.tencent.mm.y.ac;
import com.tencent.mm.y.d.a;
import java.io.File;
import java.util.HashMap;

public class OnlineVideoView
  extends RelativeLayout
  implements af.a, f.a, d.a
{
  private int duration;
  private String eHy;
  private int eUP;
  private boolean eUQ;
  private int eUR;
  private anu eUs;
  private int gGY;
  private com.tencent.mm.y.d imE;
  com.tencent.mm.sdk.platformtools.ae jFJ;
  boolean jGN;
  com.tencent.mm.pluginsdk.ui.tools.f jGP;
  private aj jGW;
  ImageView lhi;
  private TextView lhj;
  private boolean lhk;
  private boolean lhl;
  private int lhm;
  private ProgressBar lho;
  private MMPinProgressBtn lhp;
  private RelativeLayout ljd;
  private Context mContext;
  private com.tencent.mm.plugin.s.b mVG;
  private a pUA;
  private TextView pUB;
  private af pUC;
  private boolean pUD;
  private boolean pUE;
  private int pUF;
  private int pUG;
  private long pUH;
  private long pUI;
  private aj pUJ;
  private b.b pUK;
  private c pUL;
  c pUM;
  private long pUN;
  private int pUO;
  private boolean pUp;
  private f.e pUs;
  private int pUw;
  boolean pUx;
  String pUy;
  private boolean pUz;
  private an ppi;
  private c pvY;
  
  public OnlineVideoView(Context paramContext)
  {
    this(paramContext, null);
    GMTrace.i(8726702456832L, 65019);
    GMTrace.o(8726702456832L, 65019);
  }
  
  public OnlineVideoView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    GMTrace.i(8726836674560L, 65020);
    GMTrace.o(8726836674560L, 65020);
  }
  
  public OnlineVideoView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(8726970892288L, 65021);
    this.pUw = 0;
    this.pUx = false;
    this.lhk = false;
    this.jGN = false;
    this.eUs = null;
    this.pUz = false;
    this.pUC = null;
    this.pUE = false;
    this.duration = 0;
    this.pUF = 0;
    this.pUG = 0;
    this.pUH = 0L;
    this.pUI = 0L;
    this.lhm = 0;
    this.jFJ = new com.tencent.mm.sdk.platformtools.ae(Looper.getMainLooper());
    this.pUJ = new aj(new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(8513833140224L, 63433);
        if ((OnlineVideoView.k(OnlineVideoView.this) == null) || (OnlineVideoView.d(OnlineVideoView.this) == null))
        {
          GMTrace.o(8513833140224L, 63433);
          return false;
        }
        if (((View)OnlineVideoView.d(OnlineVideoView.this)).getAlpha() < 1.0F) {
          OnlineVideoView.m(OnlineVideoView.this);
        }
        if (OnlineVideoView.d(OnlineVideoView.this).isPlaying()) {
          OnlineVideoView.n(OnlineVideoView.this);
        }
        try
        {
          boolean bool = bg.nm(OnlineVideoView.k(OnlineVideoView.this).hah);
          if (!bool) {}
          for (int i = 1; i == 0; i = 0)
          {
            GMTrace.o(8513833140224L, 63433);
            return false;
          }
          i = OnlineVideoView.d(OnlineVideoView.this).getCurrentPosition() / 1000;
          bool = OnlineVideoView.k(OnlineVideoView.this).hm(i);
          GMTrace.o(8513833140224L, 63433);
          return bool;
        }
        catch (Exception localException)
        {
          w.e("MicroMsg.OnlineVideoView", "online video timer check error : " + localException.toString());
          GMTrace.o(8513833140224L, 63433);
        }
        return false;
      }
    }, true);
    this.jGW = new aj(new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(14707847069696L, 109582);
        if (OnlineVideoView.d(OnlineVideoView.this) == null)
        {
          GMTrace.o(14707847069696L, 109582);
          return false;
        }
        if (((View)OnlineVideoView.d(OnlineVideoView.this)).getAlpha() < 1.0F) {
          OnlineVideoView.m(OnlineVideoView.this);
        }
        if (OnlineVideoView.d(OnlineVideoView.this).isPlaying())
        {
          OnlineVideoView.n(OnlineVideoView.this);
          OnlineVideoView.d(OnlineVideoView.this).getCurrentPosition();
        }
        GMTrace.o(14707847069696L, 109582);
        return true;
      }
    }, true);
    this.pUK = new b.b()
    {
      public final void Hd(String paramAnonymousString)
      {
        GMTrace.i(14704894279680L, 109560);
        GMTrace.o(14704894279680L, 109560);
      }
      
      public final void av(String paramAnonymousString, boolean paramAnonymousBoolean)
      {
        GMTrace.i(14705028497408L, 109561);
        GMTrace.o(14705028497408L, 109561);
      }
      
      public final void aw(final String paramAnonymousString, final boolean paramAnonymousBoolean)
      {
        GMTrace.i(14705296932864L, 109563);
        OnlineVideoView.o(OnlineVideoView.this).postDelayed(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(14706907545600L, 109575);
            w.i("MicroMsg.OnlineVideoView", "%d weixin download finish[%b], go to prepare video", new Object[] { Integer.valueOf(OnlineVideoView.this.hashCode()), Boolean.valueOf(paramAnonymousBoolean) });
            if ((OnlineVideoView.e(OnlineVideoView.this) != null) && (paramAnonymousBoolean) && (bg.eW(OnlineVideoView.e(OnlineVideoView.this).mmR, paramAnonymousString)))
            {
              ap.dG(OnlineVideoView.a(OnlineVideoView.this), "");
              String str = ap.a(OnlineVideoView.a(OnlineVideoView.this), OnlineVideoView.e(OnlineVideoView.this));
              if (!bg.nm(str)) {
                OnlineVideoView.this.az(str, false);
              }
            }
            GMTrace.o(14706907545600L, 109575);
          }
        }, 100L);
        GMTrace.o(14705296932864L, 109563);
      }
      
      public final void bhV()
      {
        GMTrace.i(14705162715136L, 109562);
        GMTrace.o(14705162715136L, 109562);
      }
    };
    this.pUL = new c() {};
    this.pUM = new c() {};
    this.pvY = new c()
    {
      private boolean a(kw paramAnonymouskw)
      {
        GMTrace.i(14709994553344L, 109598);
        if (OnlineVideoView.k(OnlineVideoView.this) == null)
        {
          w.w("MicroMsg.OnlineVideoView", "%d online video helper is null.", new Object[] { Integer.valueOf(OnlineVideoView.this.hashCode()) });
          GMTrace.o(14709994553344L, 109598);
          return false;
        }
        try
        {
          bool = OnlineVideoView.k(OnlineVideoView.this).Ja(paramAnonymouskw.eOZ.mediaId);
          if (!bool)
          {
            GMTrace.o(14709994553344L, 109598);
            return false;
          }
          if (paramAnonymouskw.eOZ.retCode == 44424)
          {
            paramAnonymouskw = OnlineVideoView.this;
            com.tencent.mm.plugin.report.service.g.ork.a(354L, 218L, 1L, false);
            paramAnonymouskw.jFJ.post(new OnlineVideoView.9(paramAnonymouskw));
            GMTrace.o(14709994553344L, 109598);
            return false;
          }
          if ((paramAnonymouskw.eOZ.retCode != 0) && (paramAnonymouskw.eOZ.retCode != 44530))
          {
            w.w("MicroMsg.OnlineVideoView", "%d stream download online video error. retCode %d ", new Object[] { Integer.valueOf(OnlineVideoView.this.hashCode()), Integer.valueOf(paramAnonymouskw.eOZ.retCode) });
            GMTrace.o(14709994553344L, 109598);
            return false;
          }
          switch (paramAnonymouskw.eOZ.eHJ)
          {
          }
        }
        catch (Exception paramAnonymouskw)
        {
          for (;;)
          {
            boolean bool;
            long l2;
            long l1;
            w.e("MicroMsg.OnlineVideoView", "online video callback error: " + paramAnonymouskw.toString());
            continue;
            if (l1 > localaf.gAP) {}
            for (;;)
            {
              localaf.gAP = l1;
              localaf.pUZ = bg.Pv();
              try
              {
                if (localaf.ham != null) {
                  break label537;
                }
                w.w("MicroMsg.OnlineVideoViewHelper", "parser is null, thread is error.");
              }
              catch (Exception paramAnonymouskw)
              {
                w.e("MicroMsg.OnlineVideoViewHelper", "deal moov ready error: " + paramAnonymouskw.toString());
              }
              break;
              l1 = localaf.gAP;
            }
            if (localaf.ham.n(localaf.hai, l2))
            {
              localaf.han = localaf.ham.hnp;
              w.i("MicroMsg.OnlineVideoViewHelper", "mp4 parse moov success. duration %d cdnMediaId %s isFastStart %b", new Object[] { Integer.valueOf(localaf.han), localaf.hah, Boolean.valueOf(bool) });
              if (!bool) {
                com.tencent.mm.sdk.platformtools.af.t(new af.1(localaf));
              }
              if (localaf.hao == -1) {}
              for (localaf.hal = 1;; localaf.hal = 2)
              {
                com.tencent.mm.plugin.report.service.g.ork.a(354L, 204L, 1L, false);
                break;
              }
            }
            w.w("MicroMsg.OnlineVideoViewHelper", "mp4 parse moov error. cdnMediaId %s", new Object[] { localaf.hah });
            o.Ni();
            com.tencent.mm.modelcdntran.f.e(localaf.hah, 0, -1);
            com.tencent.mm.plugin.report.service.g.ork.a(354L, 205L, 1L, false);
            com.tencent.mm.plugin.report.service.g.ork.i(13836, new Object[] { Integer.valueOf(402), Long.valueOf(bg.Pu()), "" });
            continue;
            af localaf = OnlineVideoView.k(OnlineVideoView.this);
            Object localObject = paramAnonymouskw.eOZ.mediaId;
            int i = paramAnonymouskw.eOZ.offset;
            int j = paramAnonymouskw.eOZ.length;
            localaf.hau = false;
            if ((i < 0) || (j < 0)) {
              w.w("MicroMsg.OnlineVideoViewHelper", "deal data available error offset[%d], length[%d]", new Object[] { Integer.valueOf(i), Integer.valueOf(j) });
            }
            while (!localaf.Ja((String)localObject))
            {
              if (paramAnonymouskw.eOZ.length <= 0) {
                break;
              }
              OnlineVideoView.this.bF(true);
              break;
            }
            localObject = localaf.hah + i + "_" + j;
            localObject = (Integer)localaf.pUV.get(localObject);
            if ((localObject != null) && (((Integer)localObject).intValue() > 0)) {
              localaf.har = ((Integer)localObject).intValue();
            }
            for (;;)
            {
              w.i("MicroMsg.OnlineVideoViewHelper", "deal data available. offset[%d] length[%d] cachePlayTime[%d]", new Object[] { Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(localaf.har) });
              break;
              try
              {
                localaf.har = localaf.ham.bi(i, j);
              }
              catch (Exception localException)
              {
                w.e("MicroMsg.OnlineVideoViewHelper", "deal data available file pos to video time error: " + localException.toString());
              }
            }
            OnlineVideoView.this.bF(true);
            continue;
            w.i("MicroMsg.OnlineVideoView", "%d download finish. cdnMediaId %s sendReqCode %d favFromScene %d", new Object[] { Integer.valueOf(OnlineVideoView.this.hashCode()), paramAnonymouskw.eOZ.mediaId, Integer.valueOf(OnlineVideoView.s(OnlineVideoView.this)), Integer.valueOf(OnlineVideoView.t(OnlineVideoView.this)) });
            paramAnonymouskw = OnlineVideoView.k(OnlineVideoView.this);
            w.i("MicroMsg.OnlineVideoViewHelper", "deal stream finish. playStatus %d cdnMediaId %s", new Object[] { Integer.valueOf(paramAnonymouskw.hal), paramAnonymouskw.hah });
            paramAnonymouskw.hau = false;
            paramAnonymouskw.hak = 3;
            com.tencent.mm.plugin.report.service.g.ork.a(354L, 206L, 1L, false);
            if (paramAnonymouskw.hal == 0)
            {
              w.w("MicroMsg.OnlineVideoViewHelper", "it had not moov callback and download finish start to play video.");
              paramAnonymouskw.bnZ();
            }
            for (;;)
            {
              if (OnlineVideoView.s(OnlineVideoView.this) <= 0) {
                break label1244;
              }
              OnlineVideoView.n(OnlineVideoView.this);
              OnlineVideoView.b(OnlineVideoView.this, OnlineVideoView.s(OnlineVideoView.this));
              break;
              if (paramAnonymouskw.hal == 5)
              {
                w.w("MicroMsg.OnlineVideoViewHelper", "it had play error, it request all video data finish, start to play." + paramAnonymouskw.hah);
                paramAnonymouskw.bnZ();
              }
            }
            if (OnlineVideoView.t(OnlineVideoView.this) > 0)
            {
              OnlineVideoView.n(OnlineVideoView.this);
              OnlineVideoView.b(OnlineVideoView.this, OnlineVideoView.t(OnlineVideoView.this), OnlineVideoView.u(OnlineVideoView.this));
            }
            else if (OnlineVideoView.v(OnlineVideoView.this))
            {
              OnlineVideoView.n(OnlineVideoView.this);
              OnlineVideoView.w(OnlineVideoView.this);
            }
            else
            {
              OnlineVideoView.this.bF(true);
              continue;
              if (OnlineVideoView.j(OnlineVideoView.this) == 1)
              {
                localaf = OnlineVideoView.k(OnlineVideoView.this);
                String str = paramAnonymouskw.eOZ.mediaId;
                i = paramAnonymouskw.eOZ.offset;
                j = paramAnonymouskw.eOZ.length;
                if (localaf.Ja(str))
                {
                  localaf.progress = i;
                  localaf.oGI = j;
                  localaf.pUX = (localaf.progress * 100 / localaf.oGI);
                  w.i("MicroMsg.OnlineVideoViewHelper", "deal video[%s] progress callback[%d, %d]. downloadedPercent[%d]", new Object[] { localaf.hah, Integer.valueOf(localaf.progress), Integer.valueOf(localaf.oGI), Integer.valueOf(localaf.pUX) });
                }
                if (localaf.pUX >= 100) {
                  localaf.hak = 3;
                }
              }
              else if (OnlineVideoView.j(OnlineVideoView.this) == 2)
              {
                OnlineVideoView.a(OnlineVideoView.this, paramAnonymouskw.eOZ.offset, paramAnonymouskw.eOZ.length);
                continue;
                paramAnonymouskw = OnlineVideoView.k(OnlineVideoView.this);
                w.i("MicroMsg.OnlineVideoViewHelper", "deal had dup video. cdnMediaId %s", new Object[] { paramAnonymouskw.hah });
                paramAnonymouskw.bnZ();
              }
            }
          }
        }
        w.w("MicroMsg.OnlineVideoView", "%d unknown event opcode %d", new Object[] { Integer.valueOf(OnlineVideoView.this.hashCode()), Integer.valueOf(paramAnonymouskw.eOZ.eHJ) });
        for (;;)
        {
          GMTrace.o(14709994553344L, 109598);
          return false;
          localaf = OnlineVideoView.k(OnlineVideoView.this);
          l2 = paramAnonymouskw.eOZ.offset;
          l1 = paramAnonymouskw.eOZ.ePa;
          bool = paramAnonymouskw.eOZ.ePb;
          w.i("MicroMsg.OnlineVideoViewHelper", "deal moov ready moovPos %d, timeDuration %d, cdnMediaId %s startDownload[%d %d]", new Object[] { Long.valueOf(l2), Integer.valueOf(localaf.han), localaf.hah, Long.valueOf(l1), Long.valueOf(localaf.gAP) });
          if (localaf.han == 0) {
            break;
          }
          w.w("MicroMsg.OnlineVideoViewHelper", "moov had callback, do nothing.");
          OnlineVideoView.r(OnlineVideoView.this);
        }
      }
    };
    this.pUs = new f.e()
    {
      public final void aQG()
      {
        GMTrace.i(14710262988800L, 109600);
        w.i("MicroMsg.OnlineVideoView", "%d on texture update.", new Object[] { Integer.valueOf(OnlineVideoView.this.hashCode()) });
        try
        {
          OnlineVideoView.m(OnlineVideoView.this);
          GMTrace.o(14710262988800L, 109600);
          return;
        }
        catch (Exception localException)
        {
          w.e("MicroMsg.OnlineVideoView", "texture view update. error " + localException.toString());
          GMTrace.o(14710262988800L, 109600);
        }
      }
    };
    this.mVG = new com.tencent.mm.plugin.s.b()
    {
      public final long aOw()
      {
        GMTrace.i(14709055029248L, 109591);
        w.i("MicroMsg.OnlineVideoView", "%d sns video get online cache", new Object[] { Integer.valueOf(OnlineVideoView.this.hashCode()) });
        com.tencent.mm.kernel.h.xz();
        com.tencent.mm.kernel.h.xy().xh().a(w.a.vww, Boolean.valueOf(true));
        try
        {
          if ((OnlineVideoView.x(OnlineVideoView.this)) && (OnlineVideoView.k(OnlineVideoView.this) != null))
          {
            int i = OnlineVideoView.k(OnlineVideoView.this).har;
            long l = i;
            GMTrace.o(14709055029248L, 109591);
            return l;
          }
        }
        catch (Exception localException)
        {
          GMTrace.o(14709055029248L, 109591);
        }
        return 0L;
      }
    };
    this.mContext = paramContext;
    w.i("MicroMsg.OnlineVideoView", "%d ui init view.", new Object[] { Integer.valueOf(hashCode()) });
    LayoutInflater.from(paramContext).inflate(i.g.pgG, this);
    this.lhi = ((ImageView)findViewById(i.f.ckG));
    this.ljd = ((RelativeLayout)findViewById(i.f.ckF));
    this.pUB = ((TextView)findViewById(i.f.ckk));
    this.pUB.setVisibility(8);
    this.lhp = ((MMPinProgressBtn)findViewById(i.f.ckv));
    this.lho = ((ProgressBar)findViewById(i.f.ckq));
    this.lhj = ((TextView)findViewById(i.f.ckI));
    com.tencent.mm.modelcontrol.d.Gv();
    if (com.tencent.mm.modelcontrol.d.GC())
    {
      this.lhl = true;
      this.jGP = new VideoPlayerTextureView(paramContext);
      ((VideoPlayerTextureView)this.jGP).mVG = this.mVG;
      ((VideoPlayerTextureView)this.jGP).tHo = true;
      com.tencent.mm.plugin.report.service.g.ork.a(354L, 148L, 1L, false);
    }
    for (;;)
    {
      this.jGP.a(this);
      paramContext = new RelativeLayout.LayoutParams(-1, -2);
      paramContext.addRule(13);
      this.ljd.addView((View)this.jGP, paramContext);
      a(false, 0.0F);
      GMTrace.o(8726970892288L, 65021);
      return;
      this.lhl = false;
      this.jGP = new VideoTextureView(paramContext);
      com.tencent.mm.plugin.report.service.g.ork.a(354L, 149L, 1L, false);
    }
  }
  
  private void J(final int paramInt, final boolean paramBoolean)
  {
    GMTrace.i(8728178851840L, 65030);
    this.jFJ.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(8537992331264L, 63613);
        Object localObject1 = com.tencent.mm.plugin.sns.model.ae.bjd().Is(OnlineVideoView.a(OnlineVideoView.this));
        if (localObject1 == null)
        {
          GMTrace.o(8537992331264L, 63613);
          return;
        }
        w.i("MicroMsg.OnlineVideoView", "fav download video[%s] farFromScene %d isFromMain %b", new Object[] { OnlineVideoView.a(OnlineVideoView.this), Integer.valueOf(paramInt), Boolean.valueOf(paramBoolean) });
        Object localObject2 = new cf();
        ((cf)localObject2).eDv.eDC = paramInt;
        ((cf)localObject2).eDv.activity = ((Activity)OnlineVideoView.b(OnlineVideoView.this));
        com.tencent.mm.plugin.sns.i.a.a((cf)localObject2, (m)localObject1);
        com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject2);
        if (((cf)localObject2).eDw.ret == 0) {
          OnlineVideoView.bnW();
        }
        for (;;)
        {
          if (paramBoolean)
          {
            localObject2 = new ph();
            ((ph)localObject2).eUh.eEM = ((m)localObject1).blY();
            ((ph)localObject2).eUh.eUg = com.tencent.mm.plugin.sns.data.i.g((m)localObject1);
            com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject2);
          }
          OnlineVideoView.c(OnlineVideoView.this);
          if (OnlineVideoView.d(OnlineVideoView.this) == null) {
            break label330;
          }
          if (!bg.nm(OnlineVideoView.d(OnlineVideoView.this).NE())) {
            break;
          }
          w.i("MicroMsg.OnlineVideoView", "%d had not set video path to play", new Object[] { Integer.valueOf(OnlineVideoView.this.hashCode()) });
          localObject1 = ap.a(OnlineVideoView.a(OnlineVideoView.this), OnlineVideoView.e(OnlineVideoView.this));
          if (!bg.nm((String)localObject1)) {
            OnlineVideoView.this.az((String)localObject1, false);
          }
          GMTrace.o(8537992331264L, 63613);
          return;
          OnlineVideoView.bnX();
        }
        if (!OnlineVideoView.d(OnlineVideoView.this).isPlaying())
        {
          OnlineVideoView.d(OnlineVideoView.this).start();
          GMTrace.o(8537992331264L, 63613);
          return;
        }
        label330:
        GMTrace.o(8537992331264L, 63613);
      }
    });
    GMTrace.o(8728178851840L, 65030);
  }
  
  private void a(final boolean paramBoolean, final float paramFloat)
  {
    GMTrace.i(8728447287296L, 65032);
    this.jFJ.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(8750861647872L, 65199);
        w.i("MicroMsg.OnlineVideoView", "%d switch video model isVideoPlay %b %f", new Object[] { Integer.valueOf(OnlineVideoView.this.hashCode()), Boolean.valueOf(paramBoolean), Float.valueOf(paramFloat) });
        View localView = (View)OnlineVideoView.d(OnlineVideoView.this);
        if (paramBoolean)
        {
          OnlineVideoView.f(OnlineVideoView.this).setAlpha(paramFloat);
          OnlineVideoView.f(OnlineVideoView.this).setVisibility(0);
          localView.setAlpha(paramFloat);
          localView.setVisibility(0);
          if (paramFloat >= 1.0D)
          {
            OnlineVideoView.g(OnlineVideoView.this).setVisibility(8);
            GMTrace.o(8750861647872L, 65199);
          }
        }
        else
        {
          OnlineVideoView.f(OnlineVideoView.this).setVisibility(8);
          localView.setVisibility(8);
          OnlineVideoView.g(OnlineVideoView.this).setVisibility(0);
        }
        GMTrace.o(8750861647872L, 65199);
      }
    });
    GMTrace.o(8728447287296L, 65032);
  }
  
  private void aJR()
  {
    GMTrace.i(8728984158208L, 65036);
    this.jFJ.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(8539871379456L, 63627);
        if ((OnlineVideoView.h(OnlineVideoView.this) != null) && (OnlineVideoView.h(OnlineVideoView.this).getVisibility() != 8))
        {
          w.i("MicroMsg.OnlineVideoView", "%d hide loading.", new Object[] { Integer.valueOf(OnlineVideoView.this.hashCode()) });
          OnlineVideoView.h(OnlineVideoView.this).setVisibility(8);
        }
        if ((OnlineVideoView.i(OnlineVideoView.this) != null) && (OnlineVideoView.i(OnlineVideoView.this).getVisibility() != 8))
        {
          w.i("MicroMsg.OnlineVideoView", "%d hide progress.", new Object[] { Integer.valueOf(OnlineVideoView.this.hashCode()) });
          OnlineVideoView.i(OnlineVideoView.this).setVisibility(8);
        }
        GMTrace.o(8539871379456L, 63627);
      }
    });
    GMTrace.o(8728984158208L, 65036);
  }
  
  private void abq()
  {
    GMTrace.i(8728849940480L, 65035);
    this.jFJ.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(8450079719424L, 62958);
        w.i("MicroMsg.OnlineVideoView", "%d show loading. downloadMode %d", new Object[] { Integer.valueOf(OnlineVideoView.this.hashCode()), Integer.valueOf(OnlineVideoView.j(OnlineVideoView.this)) });
        if (OnlineVideoView.j(OnlineVideoView.this) == 1)
        {
          if ((OnlineVideoView.h(OnlineVideoView.this) != null) && (OnlineVideoView.h(OnlineVideoView.this).getVisibility() != 0)) {
            OnlineVideoView.h(OnlineVideoView.this).setVisibility(0);
          }
          if ((OnlineVideoView.i(OnlineVideoView.this) != null) && (OnlineVideoView.i(OnlineVideoView.this).getVisibility() != 8)) {
            OnlineVideoView.i(OnlineVideoView.this).setVisibility(8);
          }
        }
        if (OnlineVideoView.j(OnlineVideoView.this) == 2)
        {
          if ((OnlineVideoView.i(OnlineVideoView.this) != null) && (OnlineVideoView.i(OnlineVideoView.this).getVisibility() != 0)) {
            OnlineVideoView.i(OnlineVideoView.this).setVisibility(0);
          }
          if ((OnlineVideoView.h(OnlineVideoView.this) != null) && (OnlineVideoView.h(OnlineVideoView.this).getVisibility() != 8)) {
            OnlineVideoView.h(OnlineVideoView.this).setVisibility(8);
          }
        }
        if (OnlineVideoView.j(OnlineVideoView.this) == 3)
        {
          if ((OnlineVideoView.i(OnlineVideoView.this) != null) && (OnlineVideoView.i(OnlineVideoView.this).getVisibility() != 0))
          {
            OnlineVideoView.i(OnlineVideoView.this).setVisibility(0);
            OnlineVideoView.i(OnlineVideoView.this).cjf();
          }
          if ((OnlineVideoView.h(OnlineVideoView.this) != null) && (OnlineVideoView.h(OnlineVideoView.this).getVisibility() != 8)) {
            OnlineVideoView.h(OnlineVideoView.this).setVisibility(8);
          }
        }
        GMTrace.o(8450079719424L, 62958);
      }
    });
    GMTrace.o(8728849940480L, 65035);
  }
  
  private void bnK()
  {
    GMTrace.i(18573854507008L, 138386);
    if (!this.pUx) {}
    for (String str = ap.a(this.eHy, this.eUs);; str = this.pUy)
    {
      w.i("MicroMsg.OnlineVideoView", "%d toggleVideo local id %s finish path %s isPreview %b", new Object[] { Integer.valueOf(hashCode()), this.eHy, str, Boolean.valueOf(this.pUx) });
      if (bg.nm(str)) {
        break;
      }
      w.i("MicroMsg.OnlineVideoView", "%d sns video already download finish, play now", new Object[] { Integer.valueOf(hashCode()) });
      a(true, 0.0F);
      az(str, false);
      GMTrace.o(18573854507008L, 138386);
      return;
    }
    a(false, 0.0F);
    q(false, 0);
    abq();
    GMTrace.o(18573854507008L, 138386);
  }
  
  private void bnO()
  {
    GMTrace.i(8728313069568L, 65031);
    long l = bg.Pw();
    String str1 = ap.a(this.eHy, this.eUs);
    String str2 = com.tencent.mm.modelvideo.t.mx(str1);
    if (bg.nm(str2))
    {
      Toast.makeText(this.mContext, this.mContext.getString(i.j.egt), 1).show();
      com.tencent.mm.plugin.report.service.g.ork.a(354L, 222L, 1L, false);
    }
    for (;;)
    {
      this.pUz = false;
      w.i("MicroMsg.OnlineVideoView", "%d save downloaded video finish %d %s", new Object[] { Integer.valueOf(hashCode()), Long.valueOf(bg.aI(l)), str1 });
      this.jFJ.post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(8577989214208L, 63911);
          if (OnlineVideoView.d(OnlineVideoView.this) != null)
          {
            if (bg.nm(OnlineVideoView.d(OnlineVideoView.this).NE()))
            {
              w.i("MicroMsg.OnlineVideoView", "%d had not set video path to play", new Object[] { Integer.valueOf(OnlineVideoView.this.hashCode()) });
              String str = ap.a(OnlineVideoView.a(OnlineVideoView.this), OnlineVideoView.e(OnlineVideoView.this));
              if (!bg.nm(str)) {
                OnlineVideoView.this.az(str, false);
              }
              GMTrace.o(8577989214208L, 63911);
              return;
            }
            if (!OnlineVideoView.d(OnlineVideoView.this).isPlaying())
            {
              OnlineVideoView.d(OnlineVideoView.this).start();
              GMTrace.o(8577989214208L, 63911);
              return;
            }
          }
          GMTrace.o(8577989214208L, 63911);
        }
      });
      GMTrace.o(8728313069568L, 65031);
      return;
      Toast.makeText(this.mContext, this.mContext.getString(i.j.egu, new Object[] { str2 }), 1).show();
      com.tencent.mm.platformtools.d.b(str2, this.mContext);
      com.tencent.mm.plugin.report.service.g.ork.a(354L, 221L, 1L, false);
    }
  }
  
  private void bnR()
  {
    GMTrace.i(8731131641856L, 65052);
    this.pUN = bg.Pv();
    w.d("MicroMsg.OnlineVideoView", "%d notePlayVideo notePlayVideo %d ", new Object[] { Integer.valueOf(hashCode()), Long.valueOf(this.pUN) });
    GMTrace.o(8731131641856L, 65052);
  }
  
  private void bnS()
  {
    GMTrace.i(8731265859584L, 65053);
    if (this.pUN > 0L) {
      this.pUO = ((int)(this.pUO + (bg.Pv() - this.pUN) / 1000L));
    }
    w.i("MicroMsg.OnlineVideoView", "%d notePauseVideo playVideoDuration %d ", new Object[] { Integer.valueOf(hashCode()), Integer.valueOf(this.pUO) });
    this.pUN = 0L;
    GMTrace.o(8731265859584L, 65053);
  }
  
  private void q(boolean paramBoolean, int paramInt)
  {
    GMTrace.i(8728581505024L, 65033);
    if (this.eUs == null)
    {
      w.w("MicroMsg.OnlineVideoView", "%d start download video but media is null.", new Object[] { Integer.valueOf(hashCode()) });
      GMTrace.o(8728581505024L, 65033);
      return;
    }
    if (this.pUC == null)
    {
      w.w("MicroMsg.OnlineVideoView", "%d start download video but helper is null.", new Object[] { Integer.valueOf(hashCode()) });
      GMTrace.o(8728581505024L, 65033);
      return;
    }
    if (this.eUs.uCN == 2)
    {
      w.w("MicroMsg.OnlineVideoView", "%d it start download video, url type is weixin", new Object[] { Integer.valueOf(hashCode()) });
      this.pUw = 3;
      com.tencent.mm.plugin.sns.model.ae.biY().a(this.eUs, 4, null, this.ppi);
      GMTrace.o(8728581505024L, 65033);
      return;
    }
    int i;
    if (!paramBoolean)
    {
      com.tencent.mm.modelcontrol.d.Gv();
      if (com.tencent.mm.modelcontrol.d.GB())
      {
        w.i("MicroMsg.OnlineVideoView", "%d it start online download video", new Object[] { Integer.valueOf(hashCode()) });
        this.pUw = 1;
        paramBoolean = true;
        i = paramInt;
        if (paramInt == 0) {
          i = 30;
        }
        paramInt = i;
      }
    }
    af localaf;
    anu localanu;
    String str;
    do
    {
      localaf = this.pUC;
      localanu = this.eUs;
      i = this.gGY;
      str = this.eHy;
      localaf.eUs = localanu;
      localaf.gGY = i;
      localaf.eEM = str;
      localaf.hai = ap.C(localanu);
      localaf.hah = ap.at(i, localanu.lPM);
      if ((!bg.nm(localaf.hai)) && (!bg.nm(localaf.hah))) {
        break;
      }
      GMTrace.o(8728581505024L, 65033);
      return;
      w.i("MicroMsg.OnlineVideoView", "%d it start offline download video", new Object[] { Integer.valueOf(hashCode()) });
      this.pUw = 2;
      paramBoolean = false;
    } while (paramInt != 0);
    for (;;)
    {
      paramInt = 31;
    }
    w.i("MicroMsg.OnlineVideoViewHelper", "start online download video %s isPlayMode %b", new Object[] { localaf.hah, Boolean.valueOf(paramBoolean) });
    com.tencent.mm.plugin.sns.model.ae.bjb().a(localanu, i, str, paramBoolean, true, paramInt);
    localaf.hak = 1;
    localaf.gAP = bg.Pv();
    if (paramBoolean)
    {
      com.tencent.mm.plugin.report.service.g.ork.a(354L, 201L, 1L, false);
      GMTrace.o(8728581505024L, 65033);
      return;
    }
    com.tencent.mm.plugin.report.service.g.ork.a(354L, 202L, 1L, false);
    GMTrace.o(8728581505024L, 65033);
  }
  
  private void vi(int paramInt)
  {
    GMTrace.i(8728044634112L, 65029);
    String str = am.dE(com.tencent.mm.plugin.sns.model.ae.getAccSnsPath(), this.eUs.mmR) + com.tencent.mm.plugin.sns.data.i.e(this.eUs);
    Intent localIntent = new Intent();
    localIntent.putExtra("Select_Conv_Type", 3);
    localIntent.putExtra("select_is_ret", true);
    localIntent.putExtra("mutil_select_is_ret", true);
    localIntent.putExtra("image_path", str);
    localIntent.putExtra("Retr_Msg_Type", 11);
    w.i("MicroMsg.OnlineVideoView", "send video path %s reqCode %d", new Object[] { str, Integer.valueOf(paramInt) });
    com.tencent.mm.bj.d.a(this.mContext, ".ui.transmit.SelectConversationUI", localIntent, paramInt);
    this.eUR = 0;
    GMTrace.o(8728044634112L, 65029);
  }
  
  public final void MT()
  {
    GMTrace.i(8730326335488L, 65046);
    w.i("MicroMsg.OnlineVideoView", "%d pauseByDataBlock", new Object[] { Integer.valueOf(hashCode()) });
    bnS();
    abq();
    if (this.jGP.isPlaying())
    {
      w.i("MicroMsg.OnlineVideoView", "%d pause play", new Object[] { Integer.valueOf(hashCode()) });
      bnS();
      this.jGP.pause();
    }
    GMTrace.o(8730326335488L, 65046);
  }
  
  public final void Xq()
  {
    GMTrace.i(8729521029120L, 65040);
    w.i("MicroMsg.OnlineVideoView", "%d onPrepared playErrorCode[%d] onErrorPlayTimeSec[%d]", new Object[] { Integer.valueOf(hashCode()), Integer.valueOf(this.lhm), Integer.valueOf(this.pUF) });
    this.lhm = 0;
    if (this.pUF > 0)
    {
      qz(this.pUF);
      this.pUF = 0;
      GMTrace.o(8729521029120L, 65040);
      return;
    }
    this.pUG = 0;
    aJR();
    bnR();
    this.jGP.start();
    this.duration = (this.jGP.getDuration() / 1000);
    w.i("MicroMsg.OnlineVideoView", "%d start play duration %d sns local id %s ", new Object[] { Integer.valueOf(hashCode()), Integer.valueOf(this.duration), this.eHy });
    bF(false);
    GMTrace.o(8729521029120L, 65040);
  }
  
  public final void a(anu paramanu, String paramString, int paramInt)
  {
    GMTrace.i(8727239327744L, 65023);
    this.eHy = paramString;
    this.gGY = paramInt;
    paramString = an.bTq();
    paramString.time = this.gGY;
    this.ppi = paramString;
    if (this.eUs != paramanu)
    {
      this.eUs = paramanu;
      boolean bool = com.tencent.mm.plugin.sns.model.ae.bja().c(this.eUs, this.lhi, i.e.black, this.mContext.hashCode(), this.ppi);
      w.i("MicroMsg.OnlineVideoView", "%d fresh thumb image %b", new Object[] { Integer.valueOf(hashCode()), Boolean.valueOf(bool) });
    }
    this.pUx = false;
    w.i("MicroMsg.OnlineVideoView", "%d set video data[%s, %d] isPreview %b ", new Object[] { Integer.valueOf(hashCode()), this.eHy, Integer.valueOf(this.gGY), Boolean.valueOf(this.pUx) });
    GMTrace.o(8727239327744L, 65023);
  }
  
  public final void az(String paramString, boolean paramBoolean)
  {
    GMTrace.i(8730057900032L, 65044);
    w.i("MicroMsg.OnlineVideoView", "%d prepare video isOnlinePlay %b filePath %s", new Object[] { Integer.valueOf(hashCode()), Boolean.valueOf(paramBoolean), paramString });
    if (bg.nm(paramString))
    {
      w.w("MicroMsg.OnlineVideoView", "%d prepare video but filepath is null.", new Object[] { Integer.valueOf(hashCode()) });
      GMTrace.o(8730057900032L, 65044);
      return;
    }
    this.pUD = paramBoolean;
    Object localObject;
    boolean bool;
    if (this.jGP != null)
    {
      if (this.pUG == -3) {
        break label256;
      }
      if ((this.jGP instanceof VideoPlayerTextureView))
      {
        localObject = (VideoPlayerTextureView)this.jGP;
        if (this.pUD) {
          break label235;
        }
        bool = false;
        ((VideoPlayerTextureView)localObject).fT(bool);
        ((VideoPlayerTextureView)this.jGP).fU(paramBoolean);
      }
      this.jGP.a(this.pUs);
      this.jGP.setVideoPath(paramString);
      a(true, 0.0F);
    }
    for (;;)
    {
      com.tencent.mm.kernel.h.xz();
      if (((Integer)com.tencent.mm.kernel.h.xy().xh().get(w.a.vvu, Integer.valueOf(0))).intValue() == 1)
      {
        this.lhj.setText(com.tencent.mm.plugin.sight.base.d.CG(paramString));
        this.lhj.setVisibility(0);
      }
      GMTrace.o(8730057900032L, 65044);
      return;
      label235:
      com.tencent.mm.kernel.h.xz();
      bool = com.tencent.mm.kernel.h.xy().xh().getBoolean(w.a.vww, false);
      break;
      label256:
      w.i("MicroMsg.OnlineVideoView", "%d prepare video reset source", new Object[] { Integer.valueOf(hashCode()) });
      if ((this.jGP instanceof VideoPlayerTextureView))
      {
        localObject = (VideoPlayerTextureView)this.jGP;
        w.i("MicroMsg.VideoPlayerTextureView", "%d reset source ", new Object[] { Integer.valueOf(localObject.hashCode()) });
        if (((VideoPlayerTextureView)localObject).tHj != null)
        {
          localObject = ((VideoPlayerTextureView)localObject).tHj;
          if (((com.tencent.mm.plugin.s.i)localObject).mWb != null) {
            ((com.tencent.mm.plugin.s.i)localObject).mWb.aOI();
          }
        }
      }
      qz(this.pUF);
    }
  }
  
  protected final void bF(boolean paramBoolean)
  {
    GMTrace.i(14710799859712L, 109604);
    if (this.pUD)
    {
      if (paramBoolean)
      {
        com.tencent.mm.sdk.platformtools.af.t(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(14707175981056L, 109577);
            if ((OnlineVideoView.d(OnlineVideoView.this) != null) && (OnlineVideoView.k(OnlineVideoView.this) != null))
            {
              int i = OnlineVideoView.d(OnlineVideoView.this).getCurrentPosition() / 1000;
              OnlineVideoView.k(OnlineVideoView.this).hm(i);
            }
            OnlineVideoView.l(OnlineVideoView.this).z(500L, 500L);
            GMTrace.o(14707175981056L, 109577);
          }
        });
        GMTrace.o(14710799859712L, 109604);
        return;
      }
      this.pUJ.z(500L, 500L);
      GMTrace.o(14710799859712L, 109604);
      return;
    }
    this.jGW.z(500L, 500L);
    GMTrace.o(14710799859712L, 109604);
  }
  
  public final int bM(int paramInt1, int paramInt2)
  {
    GMTrace.i(8729789464576L, 65042);
    GMTrace.o(8729789464576L, 65042);
    return 0;
  }
  
  public final void bnN()
  {
    GMTrace.i(8727105110016L, 65022);
    w.d("MicroMsg.OnlineVideoView", "%d unRegister sns ui event", new Object[] { Integer.valueOf(hashCode()) });
    com.tencent.mm.sdk.b.a.vgX.c(this.pUM);
    GMTrace.o(8727105110016L, 65022);
  }
  
  protected final void bnP()
  {
    GMTrace.i(18573988724736L, 138387);
    this.pUJ.stopTimer();
    this.jGW.stopTimer();
    GMTrace.o(18573988724736L, 138387);
  }
  
  public final boolean bnQ()
  {
    boolean bool = true;
    GMTrace.i(8730192117760L, 65045);
    w.i("MicroMsg.OnlineVideoView", "%d resumeByDataGain", new Object[] { Integer.valueOf(hashCode()) });
    if (!this.jGP.isPlaying())
    {
      bnR();
      bool = this.jGP.start();
      aJR();
    }
    GMTrace.o(8730192117760L, 65045);
    return bool;
  }
  
  public final int bnT()
  {
    GMTrace.i(8731400077312L, 65054);
    if (this.pUO < 0) {
      this.pUO = 0;
    }
    w.i("MicroMsg.OnlineVideoView", "%d get play video duration [%d]", new Object[] { Integer.valueOf(hashCode()), Integer.valueOf(this.pUO) });
    int i = this.pUO;
    GMTrace.o(8731400077312L, 65054);
    return i;
  }
  
  public final int bnU()
  {
    GMTrace.i(8731534295040L, 65055);
    int i = this.lhm;
    GMTrace.o(8731534295040L, 65055);
    return i;
  }
  
  public final int bnV()
  {
    int j = 0;
    GMTrace.i(8731668512768L, 65056);
    if ((this.pUI > 0L) && (this.pUH > 0L)) {}
    for (int i = (int)(this.pUI - this.pUH);; i = 0)
    {
      if (i < 0) {
        i = j;
      }
      for (;;)
      {
        GMTrace.o(8731668512768L, 65056);
        return i;
      }
    }
  }
  
  public final void bs(int paramInt1, int paramInt2)
  {
    GMTrace.i(8729923682304L, 65043);
    GMTrace.o(8729923682304L, 65043);
  }
  
  public final void onCompletion()
  {
    GMTrace.i(8729655246848L, 65041);
    w.i("MicroMsg.OnlineVideoView", "%d on completion", new Object[] { Integer.valueOf(hashCode()) });
    if (this.pUA == null)
    {
      if ((com.tencent.mm.compatible.util.d.ev(18)) || (!this.lhl))
      {
        qz(0);
        GMTrace.o(8729655246848L, 65041);
        return;
      }
      if (this.jGP != null)
      {
        String str = this.jGP.NE();
        this.jGP.stop();
        az(str, this.pUD);
      }
    }
    GMTrace.o(8729655246848L, 65041);
  }
  
  public final void onDestroy()
  {
    GMTrace.i(8727910416384L, 65028);
    w.d("MicroMsg.OnlineVideoView", "%d on destroy %s", new Object[] { Integer.valueOf(hashCode()), bg.bQW() });
    this.pUI = bg.Pv();
    w.i("MicroMsg.OnlineVideoView", "%d logic unInit", new Object[] { Integer.valueOf(hashCode()) });
    bnS();
    this.jGP.stop();
    com.tencent.mm.sdk.b.a.vgX.c(this.pvY);
    com.tencent.mm.sdk.b.a.vgX.c(this.pUL);
    com.tencent.mm.plugin.sns.model.ae.biY().b(this.pUK);
    bnP();
    this.jFJ.removeCallbacksAndMessages(null);
    if (this.pUC != null)
    {
      this.pUC.bnY();
      this.pUC.clear();
    }
    if (com.tencent.mm.p.a.pD() != null) {
      com.tencent.mm.p.a.pD().rh();
    }
    if (this.imE != null) {
      this.imE.bf(false);
    }
    this.imE = null;
    this.eUs = null;
    this.eHy = null;
    this.pUC = null;
    this.pUG = 0;
    GMTrace.o(8727910416384L, 65028);
  }
  
  public final void onError(int paramInt1, int paramInt2)
  {
    GMTrace.i(8729386811392L, 65039);
    w.e("MicroMsg.OnlineVideoView", "%d on play video error what %d extra %d. isOnlinePlay %b isMMVideoPlayer[%b]", new Object[] { Integer.valueOf(hashCode()), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Boolean.valueOf(this.pUD), Boolean.valueOf(this.lhl) });
    Object localObject;
    if (this.pUD)
    {
      com.tencent.mm.plugin.report.service.g.ork.a(354L, 230L, 1L, false);
      this.lhm = paramInt2;
      bnS();
      localObject = this.jGP.NE();
      this.pUF = (this.jGP.getCurrentPosition() / 1000);
      if (!this.pUD) {
        break label396;
      }
      if (paramInt1 != -2) {
        break label346;
      }
      this.jGP.stop();
    }
    for (;;)
    {
      try
      {
        abq();
        if (this.pUC != null)
        {
          localObject = this.pUC;
          String str = ((af)localObject).hah + 0 + "_-1";
          if (!((af)localObject).pUV.containsKey(str))
          {
            w.i("MicroMsg.OnlineVideoViewHelper", "request all data. [%s]", new Object[] { ((af)localObject).hah });
            o.Ni();
            com.tencent.mm.modelcdntran.f.e(((af)localObject).hah, 0, -1);
            ((af)localObject).pUV.put(str, Integer.valueOf(0));
            com.tencent.mm.plugin.report.service.g.ork.a(354L, 207L, 1L, false);
            com.tencent.mm.plugin.report.service.g.ork.i(13836, new Object[] { Integer.valueOf(403), Long.valueOf(bg.Pu()), "" });
          }
          ((af)localObject).hal = 5;
          ((af)localObject).haq = true;
          ((af)localObject).hat = false;
        }
        bnS();
        GMTrace.o(8729386811392L, 65039);
        return;
      }
      catch (Exception localException)
      {
        label346:
        GMTrace.o(8729386811392L, 65039);
        return;
      }
      com.tencent.mm.plugin.report.service.g.ork.a(354L, 231L, 1L, false);
      break;
      if (paramInt1 == -3)
      {
        this.pUG = paramInt1;
        this.jGP.pause();
      }
      else
      {
        bnP();
        this.jGP.stop();
      }
    }
    label396:
    this.jGP.stop();
    this.lhk = true;
    a(false, 0.0F);
    if (!bg.nm(localException))
    {
      w.w("MicroMsg.OnlineVideoView", "%d start third player to play", new Object[] { Integer.valueOf(hashCode()) });
      this.jFJ.post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(14703954755584L, 109553);
          Intent localIntent = new Intent();
          localIntent.setAction("android.intent.action.VIEW");
          localIntent.setDataAndType(Uri.fromFile(new File(localException)), "video/*");
          try
          {
            OnlineVideoView.this.getContext().startActivity(localIntent);
            GMTrace.o(14703954755584L, 109553);
            return;
          }
          catch (Exception localException)
          {
            w.e("MicroMsg.OnlineVideoView", "startActivity fail, activity not found");
            com.tencent.mm.ui.base.h.h(OnlineVideoView.this.getContext(), i.j.due, i.j.duf);
            GMTrace.o(14703954755584L, 109553);
          }
        }
      });
    }
    GMTrace.o(8729386811392L, 65039);
  }
  
  public final void onPause()
  {
    GMTrace.i(18573720289280L, 138385);
    w.d("MicroMsg.OnlineVideoView", "%d on pause %s ", new Object[] { Integer.valueOf(hashCode()), bg.bQW() });
    bnP();
    if (this.jGP != null) {
      this.jGP.stop();
    }
    GMTrace.o(18573720289280L, 138385);
  }
  
  public final void onResume()
  {
    GMTrace.i(8727641980928L, 65026);
    w.d("MicroMsg.OnlineVideoView", "%d on resume %s", new Object[] { Integer.valueOf(hashCode()), bg.bQW() });
    this.pUH = bg.Pv();
    if (this.pUC == null)
    {
      w.i("MicroMsg.OnlineVideoView", "%d logic init, create new helper and add listener.", new Object[] { Integer.valueOf(hashCode()) });
      this.pUC = new af(this);
      com.tencent.mm.sdk.b.a.vgX.b(this.pvY);
      com.tencent.mm.sdk.b.a.vgX.b(this.pUL);
      com.tencent.mm.plugin.sns.model.ae.biY().a(this.pUK);
      this.imE = new com.tencent.mm.y.d();
      this.imE.a(this);
      if (com.tencent.mm.p.a.pD() != null) {
        com.tencent.mm.p.a.pD().ri();
      }
    }
    if (!this.lhk) {
      bnK();
    }
    this.pUp = true;
    GMTrace.o(8727641980928L, 65026);
  }
  
  public final void qz(int paramInt)
  {
    GMTrace.i(15298270855168L, 113981);
    w.i("MicroMsg.OnlineVideoView", "%d seek second %d afterSeekPlay %b", new Object[] { Integer.valueOf(hashCode()), Integer.valueOf(paramInt), Boolean.valueOf(true) });
    this.pUG = 0;
    aJR();
    this.jGP.c(paramInt * 1000, true);
    bF(false);
    GMTrace.o(15298270855168L, 113981);
  }
  
  public static abstract interface a {}
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\ui\OnlineVideoView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */