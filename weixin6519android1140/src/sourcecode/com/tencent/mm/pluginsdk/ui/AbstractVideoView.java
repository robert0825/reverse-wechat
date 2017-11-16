package com.tencent.mm.pluginsdk.ui;

import android.content.Context;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.report.d;
import com.tencent.mm.plugin.sight.decode.ui.b;
import com.tencent.mm.plugin.z.a.a;
import com.tencent.mm.plugin.z.a.b;
import com.tencent.mm.pluginsdk.ui.tools.VideoPlayerSeekBar;
import com.tencent.mm.pluginsdk.ui.tools.f;
import com.tencent.mm.pluginsdk.ui.tools.f.a;
import com.tencent.mm.pluginsdk.ui.tools.f.b;
import com.tencent.mm.pluginsdk.ui.tools.f.c;
import com.tencent.mm.pluginsdk.ui.tools.f.d;
import com.tencent.mm.pluginsdk.ui.tools.f.e;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public abstract class AbstractVideoView
  extends RelativeLayout
  implements h, f.a, f.b, f.c, f.d, f.e
{
  private boolean GI;
  public String TAG;
  protected ae ghS;
  protected h.b imw;
  public f jGP;
  protected TextView jUS;
  protected ImageView len;
  protected ProgressBar lho;
  protected Context mContext;
  private int nqN;
  protected TextView pUB;
  private b tsA;
  private View.OnClickListener tsB;
  public h.c tsC;
  protected l tsD;
  protected boolean tsk;
  protected RelativeLayout tsl;
  protected LinearLayout tsm;
  protected VideoPlayerSeekBar tsn;
  protected g tso;
  protected boolean tsp;
  public int tsq;
  public boolean tsr;
  public int tss;
  public boolean tst;
  public int tsu;
  private long tsv;
  private int tsw;
  protected aj tsx;
  protected aj tsy;
  protected aj tsz;
  
  public AbstractVideoView(Context paramContext)
  {
    this(paramContext, null);
    GMTrace.i(17461860630528L, 130101);
    GMTrace.o(17461860630528L, 130101);
  }
  
  public AbstractVideoView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    GMTrace.i(16395769217024L, 122158);
    GMTrace.o(16395769217024L, 122158);
  }
  
  public AbstractVideoView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(16395903434752L, 122159);
    this.TAG = "MicroMsg.AbstractVideoView";
    this.tsk = true;
    this.tsp = true;
    this.tsq = 0;
    this.tsr = false;
    this.ghS = new ae(Looper.getMainLooper());
    this.tss = 0;
    this.tst = true;
    this.tsu = -1;
    this.nqN = 0;
    this.GI = false;
    this.tsv = 0L;
    this.tsw = 0;
    this.tsx = new aj(new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(16399929966592L, 122189);
        if (!AbstractVideoView.this.isPlaying())
        {
          GMTrace.o(16399929966592L, 122189);
          return false;
        }
        if (AbstractVideoView.this.tsr)
        {
          if (AbstractVideoView.this.imw != null) {
            AbstractVideoView.this.imw.Xt();
          }
          AbstractVideoView.this.tsr = false;
        }
        AbstractVideoView.this.oV(AbstractVideoView.this.XI());
        AbstractVideoView.a(AbstractVideoView.this, AbstractVideoView.this.isPlaying());
        GMTrace.o(16399929966592L, 122189);
        return true;
      }
    }, true);
    this.tsy = new aj(new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(17468034646016L, 130147);
        boolean bool = AbstractVideoView.this.isPlaying();
        int i = AbstractVideoView.this.XH();
        w.i(AbstractVideoView.this.TAG, "%s prepare start checker isplaying[%b] currPosMs[%d]", new Object[] { AbstractVideoView.this.aiH(), Boolean.valueOf(bool), Integer.valueOf(i) });
        if ((AbstractVideoView.this.jGP != null) && (i <= 50)) {
          AbstractVideoView.this.jGP.o(0.0D);
        }
        GMTrace.o(17468034646016L, 130147);
        return false;
      }
    }, false);
    this.tsz = new aj(new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(20205405208576L, 150542);
        if (AbstractVideoView.a(AbstractVideoView.this) > 0)
        {
          if (AbstractVideoView.this.isPlaying())
          {
            AbstractVideoView.b(AbstractVideoView.this);
            GMTrace.o(20205405208576L, 150542);
            return false;
          }
          GMTrace.o(20205405208576L, 150542);
          return true;
        }
        GMTrace.o(20205405208576L, 150542);
        return false;
      }
    }, true);
    this.tsA = new b()
    {
      public final void Xw()
      {
        GMTrace.i(20205539426304L, 150543);
        GMTrace.o(20205539426304L, 150543);
      }
      
      public final void iM(int paramAnonymousInt)
      {
        GMTrace.i(20205673644032L, 150544);
        if (AbstractVideoView.this.o(paramAnonymousInt, true)) {
          AbstractVideoView.this.bF(false);
        }
        AbstractVideoView.this.tsn.cp(true);
        GMTrace.o(20205673644032L, 150544);
      }
    };
    this.tsB = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(20207015821312L, 150554);
        w.i(AbstractVideoView.this.TAG, "%s seek bar play button on click ", new Object[] { AbstractVideoView.this.aiH() });
        AbstractVideoView.this.bKC();
        GMTrace.o(20207015821312L, 150554);
      }
    };
    this.tsC = null;
    this.tsD = new l();
    this.mContext = paramContext;
    MP();
    GMTrace.o(16395903434752L, 122159);
  }
  
  private void jo(boolean paramBoolean)
  {
    GMTrace.i(16396306087936L, 122162);
    this.tso.jo(paramBoolean);
    GMTrace.o(16396306087936L, 122162);
  }
  
  public void MP()
  {
    GMTrace.i(16396171870208L, 122161);
    w.i(this.TAG, "%s init view ", new Object[] { aiH() });
    LayoutInflater.from(this.mContext).inflate(a.b.nHu, this);
    this.len = ((ImageView)findViewById(a.a.ckG));
    this.tsl = ((RelativeLayout)findViewById(a.a.ckF));
    this.pUB = ((TextView)findViewById(a.a.ckk));
    this.lho = ((ProgressBar)findViewById(a.a.ckq));
    this.jUS = ((TextView)findViewById(a.a.ckI));
    this.tsm = ((LinearLayout)findViewById(a.a.ckn));
    Object localObject = (VideoPlayerSeekBar)findViewById(a.a.cku);
    this.tsn = ((VideoPlayerSeekBar)localObject);
    this.tso = ((g)localObject);
    this.tsn.oSQ = this.tsA;
    this.tsn.setOnClickListener(this.tsB);
    this.jGP = bu(this.mContext);
    this.jGP.a(this);
    this.jGP.a(this);
    this.jGP.a(this);
    this.jGP.a(this);
    localObject = new RelativeLayout.LayoutParams(-1, -2);
    ((RelativeLayout.LayoutParams)localObject).addRule(13);
    this.tsl.addView((View)this.jGP, (ViewGroup.LayoutParams)localObject);
    GMTrace.o(16396171870208L, 122161);
  }
  
  public void MR()
  {
    GMTrace.i(17463605460992L, 130114);
    w.i(this.TAG, "%s onUIPause", new Object[] { aiH() });
    this.tsq = XI();
    this.tsr = isPlaying();
    this.tsw = 0;
    this.tsv = 0L;
    pause();
    stopTimer();
    this.tsk = false;
    ex(MW() + 11);
    GMTrace.o(17463605460992L, 130114);
  }
  
  public void MS()
  {
    GMTrace.i(17463471243264L, 130113);
    w.i(this.TAG, "%s onUIResume", new Object[] { aiH() });
    this.tsk = true;
    ex(MW() + 10);
    GMTrace.o(17463471243264L, 130113);
  }
  
  public int MU()
  {
    GMTrace.i(17462397501440L, 130105);
    GMTrace.o(17462397501440L, 130105);
    return 0;
  }
  
  public void MV()
  {
    GMTrace.i(17463873896448L, 130116);
    w.i(this.TAG, "%s on surface available", new Object[] { aiH() });
    bF(false);
    GMTrace.o(17463873896448L, 130116);
  }
  
  public abstract int MW();
  
  protected final void OW(String paramString)
  {
    GMTrace.i(17464947638272L, 130124);
    this.tsD.url = paramString;
    GMTrace.o(17464947638272L, 130124);
  }
  
  public final void XF()
  {
    GMTrace.i(17462129065984L, 130103);
    this.tsm.removeView((View)this.tso);
    GMTrace.o(17462129065984L, 130103);
  }
  
  public int XG()
  {
    GMTrace.i(16397648265216L, 122172);
    if (this.jGP != null)
    {
      int i = Math.round(this.jGP.getDuration() * 1.0F / 1000.0F);
      GMTrace.o(16397648265216L, 122172);
      return i;
    }
    GMTrace.o(16397648265216L, 122172);
    return -1;
  }
  
  public final int XH()
  {
    GMTrace.i(17799149780992L, 132614);
    if (this.jGP != null)
    {
      int i = this.jGP.getCurrentPosition();
      GMTrace.o(17799149780992L, 132614);
      return i;
    }
    GMTrace.o(17799149780992L, 132614);
    return 0;
  }
  
  public final int XI()
  {
    GMTrace.i(17462800154624L, 130108);
    if (this.jGP != null)
    {
      int i = Math.round(this.jGP.getCurrentPosition() * 1.0F / 1000.0F);
      GMTrace.o(17462800154624L, 130108);
      return i;
    }
    GMTrace.o(17462800154624L, 130108);
    return 0;
  }
  
  public final void XJ()
  {
    GMTrace.i(17463739678720L, 130115);
    w.i(this.TAG, "%s onUIDestroy", new Object[] { aiH() });
    stop();
    this.ghS.removeCallbacksAndMessages(null);
    stopTimer();
    this.tsz.stopTimer();
    ex(MW() + 12);
    GMTrace.o(17463739678720L, 130115);
  }
  
  public final void Xq()
  {
    GMTrace.i(16398050918400L, 122175);
    w.i(this.TAG, "%s onPrepared startWhenPrepared[%b] seekTimeWhenPrepared[%d] isPrepared[%b]", new Object[] { aiH(), Boolean.valueOf(this.tst), Integer.valueOf(this.tsu), Boolean.valueOf(this.GI) });
    this.GI = true;
    if (this.jGP != null) {
      this.jGP.a(this);
    }
    int i = XG();
    if ((this.tso != null) && (this.tso.bgE() != i)) {
      this.tso.tY(i);
    }
    int k;
    int j;
    if (this.tst) {
      if (this.tsu < 0)
      {
        if (play()) {
          this.tsy.z(1000L, 1000L);
        }
        this.tsu = -1;
        this.tst = true;
        this.tsw = 0;
        this.tsv = 0L;
        if (this.imw != null) {
          this.imw.Xq();
        }
        if (this.nqN > 0)
        {
          w.d(this.TAG, "%s start error check timer", new Object[] { aiH() });
          this.tsz.z(5000L, 5000L);
        }
        ex(MW() + 2);
        if (this.tsD.tuw == 0L) {
          this.tsD.tuw = bg.Pv();
        }
        i = XG();
        this.tsD.duration = i;
        if ((this.tsD.tuv > 0L) && (this.tsD.tuw > 0L))
        {
          k = (int)((this.tsD.tuw - this.tsD.tuv) / 1000L);
          if (!am.isWifi(this.mContext)) {
            break label490;
          }
          j = 20;
          i = 24;
        }
      }
    }
    for (;;)
    {
      int m = MW();
      int n = MW();
      i = bg.e((Integer)d.a(k, new int[] { 1, 2, 3, 4 }, j + m, i + n));
      w.d(this.TAG, "%s rptFirstPlayTime [%d]", new Object[] { aiH(), Integer.valueOf(i) });
      ex(i);
      GMTrace.o(16398050918400L, 122175);
      return;
      if (!Xi())
      {
        o(this.tsu, this.tst);
        break;
      }
      play();
      break;
      if (this.tsu < 0) {}
      for (i = 0;; i = this.tsu)
      {
        o(i, this.tst);
        break;
      }
      label490:
      if (am.is4G(this.mContext))
      {
        j = 25;
        i = 29;
      }
      else if (am.is3G(this.mContext))
      {
        j = 30;
        i = 34;
      }
      else
      {
        if (!am.is2G(this.mContext)) {
          break label547;
        }
        j = 35;
        i = 39;
      }
    }
    label547:
    GMTrace.o(16398050918400L, 122175);
  }
  
  public final void a(g paramg)
  {
    GMTrace.i(17461994848256L, 130102);
    if (!(paramg instanceof View))
    {
      w.w(this.TAG, "%s set video footer view but is not view", new Object[] { aiH() });
      GMTrace.o(17461994848256L, 130102);
      return;
    }
    XF();
    this.tso = paramg;
    this.tsp = false;
    this.tsm.addView((View)this.tso);
    GMTrace.o(17461994848256L, 130102);
  }
  
  public final void a(h.b paramb)
  {
    GMTrace.i(17463068590080L, 130110);
    this.imw = paramb;
    GMTrace.o(17463068590080L, 130110);
  }
  
  public final void aJR()
  {
    GMTrace.i(16396842958848L, 122166);
    w.d(this.TAG, "%s hide loading %s", new Object[] { aiH(), bg.bQW() });
    this.ghS.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(17477161451520L, 130215);
        if ((AbstractVideoView.this.lho != null) && (AbstractVideoView.this.lho.getVisibility() != 8))
        {
          w.i(AbstractVideoView.this.TAG, "%s hide loading", new Object[] { AbstractVideoView.this.aiH() });
          AbstractVideoView.this.lho.setVisibility(8);
          if (AbstractVideoView.this.imw != null) {
            AbstractVideoView.this.imw.Xv();
          }
        }
        GMTrace.o(17477161451520L, 130215);
      }
    });
    GMTrace.o(16396842958848L, 122166);
  }
  
  public final void aQG()
  {
    GMTrace.i(16398185136128L, 122176);
    w.i(this.TAG, "%s onTextureUpdate ", new Object[] { aiH() });
    aJR();
    GMTrace.o(16398185136128L, 122176);
  }
  
  public final void abq()
  {
    GMTrace.i(16396708741120L, 122165);
    this.ghS.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(17468839952384L, 130153);
        if ((AbstractVideoView.this.lho != null) && (AbstractVideoView.this.lho.getVisibility() != 0))
        {
          w.i(AbstractVideoView.this.TAG, "%s show loading", new Object[] { AbstractVideoView.this.aiH() });
          AbstractVideoView.this.lho.setVisibility(0);
          if (AbstractVideoView.this.imw != null) {
            AbstractVideoView.this.imw.Xu();
          }
        }
        GMTrace.o(17468839952384L, 130153);
      }
    });
    GMTrace.o(16396708741120L, 122165);
  }
  
  public final String aiH()
  {
    GMTrace.i(16396977176576L, 122167);
    String str = hashCode();
    GMTrace.o(16396977176576L, 122167);
    return str;
  }
  
  public void bE(boolean paramBoolean)
  {
    GMTrace.i(16398722007040L, 122180);
    w.i(this.TAG, "%s on seek complete startPlay[%b]", new Object[] { aiH(), Boolean.valueOf(paramBoolean) });
    if (this.jGP != null) {
      this.jGP.a(this);
    }
    aJR();
    jo(paramBoolean);
    oV(XI());
    if (paramBoolean)
    {
      bF(false);
      this.tsr = false;
      if (this.imw != null) {
        this.imw.Xt();
      }
    }
    GMTrace.o(16398722007040L, 122180);
  }
  
  public void bF(boolean paramBoolean)
  {
    GMTrace.i(17462263283712L, 130104);
    w.d(this.TAG, "%s start timer rightNow[%b]", new Object[] { aiH(), Boolean.valueOf(paramBoolean) });
    this.tsx.z(500L, 500L);
    GMTrace.o(17462263283712L, 130104);
  }
  
  public final boolean bKC()
  {
    GMTrace.i(16397111394304L, 122168);
    if (this.jGP == null)
    {
      GMTrace.o(16397111394304L, 122168);
      return false;
    }
    if (isPlaying()) {
      pause();
    }
    for (;;)
    {
      GMTrace.o(16397111394304L, 122168);
      return true;
      if (bg.nm(this.jGP.NE())) {
        start();
      } else {
        play();
      }
    }
  }
  
  public final void bKD()
  {
    GMTrace.i(17464410767360L, 130120);
    if (this.tsD.pUZ == 0L) {
      this.tsD.pUZ = bg.Pv();
    }
    GMTrace.o(17464410767360L, 130120);
  }
  
  public final void bKE()
  {
    GMTrace.i(17464544985088L, 130121);
    this.tsD.tuy = bg.Pv();
    GMTrace.o(17464544985088L, 130121);
  }
  
  public final void bKF()
  {
    GMTrace.i(17464679202816L, 130122);
    this.tsD.tuz = bg.Pv();
    if (this.tsD.tuy > 0L)
    {
      l locall = this.tsD;
      locall.tuA += this.tsD.tuz - this.tsD.tuy;
    }
    GMTrace.o(17464679202816L, 130122);
  }
  
  public final void bKG()
  {
    GMTrace.i(17464813420544L, 130123);
    l locall = this.tsD;
    locall.blockCount += 1;
    GMTrace.o(17464813420544L, 130123);
  }
  
  public final void bKH()
  {
    GMTrace.i(17465081856000L, 130125);
    int k;
    int j;
    int i;
    if ((this.tsD.tuz > 0L) && (this.tsD.tuy > 0L))
    {
      k = (int)((this.tsD.tuz - this.tsD.tuy) / 1000L);
      if (!am.isWifi(this.mContext)) {
        break label164;
      }
      j = 70;
      i = 74;
    }
    for (;;)
    {
      int m = MW();
      int n = MW();
      i = bg.e((Integer)d.a(k, new int[] { 1, 2, 3, 4 }, j + m, i + n));
      w.d(this.TAG, "%s rptResumeTime [%d]", new Object[] { aiH(), Integer.valueOf(i) });
      ex(i);
      GMTrace.o(17465081856000L, 130125);
      return;
      label164:
      if (am.is4G(this.mContext))
      {
        j = 75;
        i = 79;
      }
      else if (am.is3G(this.mContext))
      {
        j = 80;
        i = 84;
      }
      else
      {
        if (!am.is2G(this.mContext)) {
          break;
        }
        j = 85;
        i = 89;
      }
    }
    GMTrace.o(17465081856000L, 130125);
  }
  
  public final int bM(int paramInt1, int paramInt2)
  {
    GMTrace.i(16398453571584L, 122178);
    GMTrace.o(16398453571584L, 122178);
    return 0;
  }
  
  public final void boa()
  {
    GMTrace.i(17464276549632L, 130119);
    if (this.tsD.tuv == 0L) {
      this.tsD.tuv = bg.Pv();
    }
    GMTrace.o(17464276549632L, 130119);
  }
  
  public final void bs(int paramInt1, int paramInt2)
  {
    GMTrace.i(16398587789312L, 122179);
    w.i(this.TAG, "%s on get video size [%d, %d]", new Object[] { aiH(), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if (this.imw != null) {
      this.imw.bs(paramInt1, paramInt2);
    }
    ex(MW() + 8);
    GMTrace.o(16398587789312L, 122179);
  }
  
  public f bu(Context paramContext)
  {
    GMTrace.i(16396037652480L, 122160);
    GMTrace.o(16396037652480L, 122160);
    return null;
  }
  
  public final void ex(long paramLong)
  {
    GMTrace.i(17464142331904L, 130118);
    if (this.tsC != null) {
      this.tsC.a(600L, paramLong, 1L, false);
    }
    GMTrace.o(17464142331904L, 130118);
  }
  
  public final boolean iN(int paramInt)
  {
    GMTrace.i(16397514047488L, 122171);
    boolean bool = o(paramInt, isPlaying());
    GMTrace.o(16397514047488L, 122171);
    return bool;
  }
  
  public final boolean isPlaying()
  {
    GMTrace.i(16397782482944L, 122173);
    boolean bool = false;
    if (this.jGP != null) {
      bool = this.jGP.isPlaying();
    }
    GMTrace.o(16397782482944L, 122173);
    return bool;
  }
  
  public final boolean isPrepared()
  {
    GMTrace.i(17462934372352L, 130109);
    boolean bool;
    if (this.jGP != null) {
      if ((!bg.nm(this.jGP.NE())) && (this.GI)) {
        bool = true;
      }
    }
    for (;;)
    {
      w.d(this.TAG, "%s is prepared [%b] isPrepared[%b]", new Object[] { aiH(), Boolean.valueOf(bool), Boolean.valueOf(this.GI) });
      GMTrace.o(17462934372352L, 130109);
      return bool;
      bool = false;
      continue;
      bool = false;
    }
  }
  
  public boolean o(int paramInt, boolean paramBoolean)
  {
    GMTrace.i(17462665936896L, 130107);
    boolean bool2 = isPrepared();
    int j = XG();
    if ((j > 0) && (paramInt > j)) {}
    for (int i = j;; i = paramInt)
    {
      boolean bool1;
      if (this.jGP != null) {
        if (!bg.nm(this.jGP.NE())) {
          bool1 = true;
        }
      }
      for (;;)
      {
        w.i(this.TAG, "%s seek to [%d %d] seconds afterPlay[%b] isPrepared[%b] duration[%d] hadSetPath[%b]", new Object[] { aiH(), Integer.valueOf(i), Integer.valueOf(paramInt), Boolean.valueOf(paramBoolean), Boolean.valueOf(bool2), Integer.valueOf(j), Boolean.valueOf(bool1) });
        ex(MW() + 5);
        if (!bool2) {
          break;
        }
        if (this.jGP == null) {
          break label214;
        }
        abq();
        oV(i);
        this.jGP.c(i * 1000, paramBoolean);
        GMTrace.o(17462665936896L, 130107);
        return paramBoolean;
        bool1 = false;
        continue;
        bool1 = false;
      }
      this.tsu = i;
      if (bool1) {
        this.tst = true;
      }
      for (;;)
      {
        label214:
        GMTrace.o(17462665936896L, 130107);
        return false;
        this.tst = paramBoolean;
        start();
      }
    }
  }
  
  public final void oV(int paramInt)
  {
    GMTrace.i(16396574523392L, 122164);
    this.tso.uM(paramInt);
    GMTrace.o(16396574523392L, 122164);
  }
  
  public void onCompletion()
  {
    GMTrace.i(16398319353856L, 122177);
    w.i(this.TAG, "%s onCompletion", new Object[] { aiH() });
    aJR();
    stopTimer();
    if (this.imw != null) {
      this.imw.Xr();
    }
    this.tsw = 0;
    this.tsv = 0L;
    ex(MW() + 7);
    GMTrace.o(16398319353856L, 122177);
  }
  
  public final void onError(final int paramInt1, int paramInt2)
  {
    GMTrace.i(16397916700672L, 122174);
    w.w(this.TAG, "%s onError info [%d %d] errorCount[%d]", new Object[] { aiH(), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(this.nqN) });
    ex(MW() + 90);
    this.nqN += 1;
    if (this.nqN > 5)
    {
      ex(MW() + 92);
      this.tsD.tuB = paramInt1;
      this.tsD.tuC = paramInt2;
      h.b localb;
      String str;
      if (this.imw != null)
      {
        localb = this.imw;
        if (paramInt1 != 64526) {
          break label164;
        }
        str = "MEDIA_ERR_SRC_NOT_SUPPORTED";
      }
      for (;;)
      {
        localb.w(str, paramInt1, paramInt2);
        stop();
        aJR();
        GMTrace.o(16397916700672L, 122174);
        return;
        label164:
        if (paramInt1 == 64529) {
          str = "MEDIA_ERR_SRC_NOT_SUPPORTED";
        } else if (paramInt1 == 64532)
        {
          if (!am.isConnected(this.mContext)) {
            str = "MEDIA_ERR_NETWORK";
          } else {
            str = "MEDIA_ERR_DECODE";
          }
        }
        else if (!am.isConnected(this.mContext)) {
          str = "MEDIA_ERR_NETWORK";
        } else {
          str = "MEDIA_ERR_DECODE";
        }
      }
    }
    paramInt2 = XI();
    if (this.tsu == -1) {}
    for (paramInt1 = paramInt2;; paramInt1 = this.tsu)
    {
      w.i(this.TAG, "%s onError now, try to start again. currPlaySec[%d] seekTimeWhenPrepared[%d] currPosSec[%d]", new Object[] { aiH(), Integer.valueOf(paramInt1), Integer.valueOf(this.tsu), Integer.valueOf(paramInt2) });
      stop();
      abq();
      this.ghS.postDelayed(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(20205270990848L, 150541);
          AbstractVideoView.this.oV(paramInt1);
          AbstractVideoView.this.o(paramInt1, true);
          GMTrace.o(20205270990848L, 150541);
        }
      }, 200L);
      GMTrace.o(16397916700672L, 122174);
      return;
    }
  }
  
  public final boolean pause()
  {
    GMTrace.i(16397379829760L, 122170);
    w.i(this.TAG, "%s pause", new Object[] { aiH() });
    ex(MW() + 4);
    if (this.jGP != null)
    {
      jo(false);
      this.jGP.pause();
      stopTimer();
      if (this.imw != null) {
        this.imw.Xs();
      }
      this.tsD.pVb = bg.Pv();
      GMTrace.o(16397379829760L, 122170);
      return true;
    }
    GMTrace.o(16397379829760L, 122170);
    return false;
  }
  
  public final boolean play()
  {
    GMTrace.i(16397245612032L, 122169);
    if (!this.tsk)
    {
      w.w(this.TAG, "%s ui on pause now, why u call me to play? [%s]", new Object[] { aiH(), bg.bQW() });
      GMTrace.o(16397245612032L, 122169);
      return false;
    }
    ex(MW() + 3);
    if (this.jGP != null)
    {
      boolean bool = this.jGP.start();
      w.i(this.TAG, "%s video play [%b] isPlayOnUiPause[%b]", new Object[] { aiH(), Boolean.valueOf(bool), Boolean.valueOf(this.tsr) });
      jo(bool);
      if (bool)
      {
        this.tsr = false;
        bF(false);
        if (this.imw != null) {
          this.imw.Xt();
        }
      }
      GMTrace.o(16397245612032L, 122169);
      return bool;
    }
    GMTrace.o(16397245612032L, 122169);
    return false;
  }
  
  public final void setMute(boolean paramBoolean)
  {
    GMTrace.i(17463337025536L, 130112);
    if (this.jGP != null) {
      this.jGP.setMute(paramBoolean);
    }
    GMTrace.o(17463337025536L, 130112);
  }
  
  public void stop()
  {
    GMTrace.i(17463202807808L, 130111);
    w.i(this.TAG, "%s stop", new Object[] { aiH() });
    ex(MW() + 6);
    if (this.jGP != null) {
      this.jGP.stop();
    }
    this.tsu = -1;
    this.tst = true;
    this.GI = false;
    this.tsw = 0;
    this.tsv = 0L;
    stopTimer();
    this.ghS.postDelayed(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(17468303081472L, 130149);
        try
        {
          AbstractVideoView.this.oV(0);
          AbstractVideoView.a(AbstractVideoView.this, AbstractVideoView.this.isPlaying());
          GMTrace.o(17468303081472L, 130149);
          return;
        }
        catch (Throwable localThrowable)
        {
          GMTrace.o(17468303081472L, 130149);
        }
      }
    }, 10L);
    this.tsD.tux = bg.Pv();
    int j;
    int i;
    label230:
    Object localObject;
    if (this.tsD.blockCount > 0)
    {
      if (am.isWifi(this.mContext))
      {
        j = 41;
        i = 45;
        int k = MW();
        int m = MW();
        i = bg.e((Integer)d.a(this.tsD.blockCount, new int[] { 1, 2, 3, 4 }, j + k, i + m));
        w.d(this.TAG, "%s rptBlockCount [%d]", new Object[] { aiH(), Integer.valueOf(i) });
        ex(i);
      }
    }
    else
    {
      localObject = new StringBuffer();
      ((StringBuffer)localObject).append(this.tsD.tuv).append(",");
      ((StringBuffer)localObject).append(this.tsD.tuw).append(",");
      ((StringBuffer)localObject).append(this.tsD.tux).append(",");
      ((StringBuffer)localObject).append(this.tsD.pVb).append(",");
      ((StringBuffer)localObject).append(this.tsD.tuy).append(",");
      ((StringBuffer)localObject).append(this.tsD.tuz).append(",");
      ((StringBuffer)localObject).append(this.tsD.tuA).append(",");
      ((StringBuffer)localObject).append(this.tsD.blockCount).append(",");
      ((StringBuffer)localObject).append(this.tsD.tuw - this.tsD.tuv).append(",");
      ((StringBuffer)localObject).append(this.tsD.url).append(",");
      ((StringBuffer)localObject).append(this.tsD.duration).append(",");
      ((StringBuffer)localObject).append(this.tsD.tuB).append(",");
      ((StringBuffer)localObject).append(this.tsD.tuC).append(",");
      ((StringBuffer)localObject).append(this.tsD.pUZ).append(",");
      if (this.tsD.pUZ <= this.tsD.tuv) {
        break label693;
      }
    }
    label693:
    for (long l = this.tsD.pUZ - this.tsD.tuv;; l = 0L)
    {
      ((StringBuffer)localObject).append(l).append(",");
      ((StringBuffer)localObject).append(this.tss);
      localObject = ((StringBuffer)localObject).toString();
      w.i(this.TAG, "%s rpt video kv stat{%s}", new Object[] { aiH(), localObject });
      if (this.tsC != null) {
        this.tsC.A(14349, (String)localObject);
      }
      GMTrace.o(17463202807808L, 130111);
      return;
      if (am.is4G(this.mContext))
      {
        j = 46;
        i = 50;
        break;
      }
      if (am.is3G(this.mContext))
      {
        j = 51;
        i = 55;
        break;
      }
      if (!am.is2G(this.mContext)) {
        break label230;
      }
      j = 56;
      i = 60;
      break;
    }
  }
  
  public void stopTimer()
  {
    GMTrace.i(17462531719168L, 130106);
    this.tsx.stopTimer();
    this.tsy.stopTimer();
    GMTrace.o(17462531719168L, 130106);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\pluginsdk\ui\AbstractVideoView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */