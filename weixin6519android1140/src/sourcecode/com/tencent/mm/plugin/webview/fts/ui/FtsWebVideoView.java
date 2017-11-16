package com.tencent.mm.plugin.webview.fts.ui;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.plugin.webview.fts.c.b.a;
import com.tencent.mm.plugin.webview.fts.c.c;
import com.tencent.mm.plugin.webview.fts.c.d;
import com.tencent.mm.plugin.webview.fts.c.d.1;
import com.tencent.mm.pluginsdk.ui.h.b;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.math.BigDecimal;
import org.json.JSONException;
import org.json.JSONObject;

public class FtsWebVideoView
  extends RelativeLayout
{
  private TextView ilI;
  private LinearLayout ilO;
  private TextView ilQ;
  private ImageView ilR;
  private ImageView ilS;
  public String ilT;
  public int ilU;
  public boolean ilV;
  private boolean ilY;
  private boolean imb;
  private int imc;
  private String imd;
  public boolean jGN;
  private boolean jRF;
  private boolean mAutoPlay;
  private boolean mLoop;
  private b rDe;
  public FtsVideoWrapper rDf;
  public FtsWebVideoViewControlBar rDg;
  private View rDh;
  private FtsWebDotPercentIndicator rDi;
  private ImageView rDj;
  private Button rDk;
  private TextView rDl;
  private TextView rDm;
  private a rDn;
  public a rDo;
  public d rDp;
  public b.a rDq;
  public int rDr;
  public boolean rDs;
  private ImageView rDt;
  private int rDu;
  public BroadcastReceiver rDv;
  private String url;
  private View yvt;
  private View yvu;
  private long yvv;
  private View yvw;
  private View yvx;
  
  public FtsWebVideoView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(20466592907264L, 152488);
    this.rDe = b.rDx;
    this.rDu = c.rDB;
    this.rDv = new BroadcastReceiver()
    {
      public final void onReceive(Context paramAnonymousContext, Intent paramAnonymousIntent)
      {
        GMTrace.i(20483906994176L, 152617);
        if (FtsWebVideoView.d(FtsWebVideoView.this).isPlaying()) {
          FtsWebVideoView.a(FtsWebVideoView.this, paramAnonymousContext);
        }
        GMTrace.o(20483906994176L, 152617);
      }
    };
    init(paramContext);
    GMTrace.o(20466592907264L, 152488);
  }
  
  public FtsWebVideoView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(20466727124992L, 152489);
    this.rDe = b.rDx;
    this.rDu = c.rDB;
    this.rDv = new BroadcastReceiver()
    {
      public final void onReceive(Context paramAnonymousContext, Intent paramAnonymousIntent)
      {
        GMTrace.i(20483906994176L, 152617);
        if (FtsWebVideoView.d(FtsWebVideoView.this).isPlaying()) {
          FtsWebVideoView.a(FtsWebVideoView.this, paramAnonymousContext);
        }
        GMTrace.o(20483906994176L, 152617);
      }
    };
    init(paramContext);
    GMTrace.o(20466727124992L, 152489);
  }
  
  public FtsWebVideoView(Context paramContext, boolean paramBoolean)
  {
    super(paramContext);
    GMTrace.i(20466458689536L, 152487);
    this.rDe = b.rDx;
    this.rDu = c.rDB;
    this.rDv = new BroadcastReceiver()
    {
      public final void onReceive(Context paramAnonymousContext, Intent paramAnonymousIntent)
      {
        GMTrace.i(20483906994176L, 152617);
        if (FtsWebVideoView.d(FtsWebVideoView.this).isPlaying()) {
          FtsWebVideoView.a(FtsWebVideoView.this, paramAnonymousContext);
        }
        GMTrace.o(20483906994176L, 152617);
      }
    };
    setAutoPlay(paramBoolean);
    init(paramContext);
    GMTrace.o(20466458689536L, 152487);
  }
  
  private boolean Xi()
  {
    GMTrace.i(20469411479552L, 152509);
    w.i("MicroMsg.FtsWebVideoView", "isLive %b %b", new Object[] { Boolean.valueOf(this.imb), Boolean.valueOf(this.rDf.Xi()) });
    if ((this.imb) || (this.rDf.Xi()))
    {
      GMTrace.o(20469411479552L, 152509);
      return true;
    }
    GMTrace.o(20469411479552L, 152509);
    return false;
  }
  
  private void bBQ()
  {
    GMTrace.i(20467666649088L, 152496);
    this.rDh.setVisibility(8);
    GMTrace.o(20467666649088L, 152496);
  }
  
  private boolean bBS()
  {
    GMTrace.i(20468874608640L, 152505);
    if ((this.ilV) && (!ctV()))
    {
      GMTrace.o(20468874608640L, 152505);
      return true;
    }
    GMTrace.o(20468874608640L, 152505);
    return false;
  }
  
  private void ctU()
  {
    GMTrace.i(21043058049024L, 156783);
    if (Xg())
    {
      this.rDt.setVisibility(0);
      GMTrace.o(21043058049024L, 156783);
      return;
    }
    this.rDt.setVisibility(8);
    GMTrace.o(21043058049024L, 156783);
  }
  
  private boolean ctV()
  {
    GMTrace.i(21043192266752L, 156784);
    if (this.rDh.getVisibility() == 0)
    {
      GMTrace.o(21043192266752L, 156784);
      return true;
    }
    GMTrace.o(21043192266752L, 156784);
    return false;
  }
  
  private boolean ds(final Context paramContext)
  {
    GMTrace.i(20466995560448L, 152491);
    int i = this.rDu;
    if (am.isConnected(paramContext))
    {
      if ((!this.rDs) && (!am.isWifi(paramContext)))
      {
        pause();
        this.rDu = c.rDC;
        this.rDg.setVisibility(8);
        Object localObject1;
        if (this.rDr == 0)
        {
          localObject1 = getContext().getString(R.l.egx);
          localObject2 = paramContext.getString(R.l.egi);
          paramContext.getString(R.l.egf);
          eg((String)localObject1, (String)localObject2);
          GMTrace.o(20466995560448L, 152491);
          return false;
        }
        Object localObject2 = getContext();
        i = R.l.egw;
        long l = this.rDr;
        if (l < 0L) {
          localObject1 = "";
        }
        for (;;)
        {
          localObject1 = ((Context)localObject2).getString(i, new Object[] { localObject1 });
          break;
          localObject1 = new BigDecimal(l);
          float f = ((BigDecimal)localObject1).divide(new BigDecimal(1048576), 2, 0).floatValue();
          if (f > 1.0F)
          {
            localObject1 = (int)f + "M";
          }
          else
          {
            f = ((BigDecimal)localObject1).divide(new BigDecimal(1024), 2, 0).floatValue();
            localObject1 = (int)f + "K";
          }
        }
      }
    }
    else
    {
      if (i == c.yvy)
      {
        this.yvw.setVisibility(0);
        this.yvx.setVisibility(8);
        this.rDh.setVisibility(0);
        postDelayed(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(21048024104960L, 156820);
            FtsWebVideoView.b(FtsWebVideoView.this, paramContext);
            GMTrace.o(21048024104960L, 156820);
          }
        }, 200L);
      }
      for (;;)
      {
        GMTrace.o(20466995560448L, 152491);
        return false;
        eY(paramContext);
      }
    }
    GMTrace.o(20466995560448L, 152491);
    return true;
  }
  
  private void eY(Context paramContext)
  {
    GMTrace.i(21042923831296L, 156782);
    this.rDu = c.yvy;
    pause();
    eg(paramContext.getString(R.l.egv), paramContext.getString(R.l.egF));
    GMTrace.o(21042923831296L, 156782);
  }
  
  private void eg(String paramString1, String paramString2)
  {
    GMTrace.i(20467129778176L, 152492);
    bBQ();
    this.yvw.setVisibility(8);
    this.yvx.setVisibility(0);
    this.rDg.setVisibility(8);
    this.rDh.setVisibility(0);
    if (!TextUtils.isEmpty(paramString1))
    {
      this.rDm.setText(paramString1);
      this.rDm.setVisibility(0);
      if (TextUtils.isEmpty(paramString2)) {
        break label145;
      }
      this.rDk.setText(paramString2);
      this.rDk.setVisibility(0);
    }
    for (;;)
    {
      this.yvt.setVisibility(0);
      this.yvu.setVisibility(8);
      this.rDl.setVisibility(8);
      ctU();
      GMTrace.o(20467129778176L, 152492);
      return;
      this.rDm.setVisibility(8);
      break;
      label145:
      this.rDk.setVisibility(8);
    }
  }
  
  private void init(Context paramContext)
  {
    GMTrace.i(20466861342720L, 152490);
    LayoutInflater.from(paramContext).inflate(R.i.cya, this);
    this.rDf = ((FtsVideoWrapper)findViewById(R.h.ckL));
    this.ilI = ((TextView)findViewById(R.h.progress));
    this.rDh = findViewById(R.h.chp);
    this.yvt = findViewById(R.h.gFM);
    this.ilO = ((LinearLayout)findViewById(R.h.bdm));
    this.rDi = ((FtsWebDotPercentIndicator)findViewById(R.h.bdn));
    this.ilQ = ((TextView)findViewById(R.h.bdk));
    this.ilR = ((ImageView)findViewById(R.h.bdl));
    this.ilS = ((ImageView)findViewById(R.h.bsp));
    this.yvw = findViewById(R.h.ckq);
    this.yvx = findViewById(R.h.ifJ);
    Object localObject1 = this.rDi;
    ((FtsWebDotPercentIndicator)localObject1).ilo = 8;
    ((FtsWebDotPercentIndicator)localObject1).removeAllViews();
    int i = 0;
    while (i < ((FtsWebDotPercentIndicator)localObject1).ilo)
    {
      ((FtsWebDotPercentIndicator)localObject1).addView((ImageView)((FtsWebDotPercentIndicator)localObject1).CJ.inflate(R.i.cxZ, (ViewGroup)localObject1, false));
      i += 1;
    }
    this.rDj = ((ImageView)findViewById(R.h.bsr));
    this.yvu = findViewById(R.h.gFI);
    this.rDl = ((TextView)findViewById(R.h.chq));
    this.rDk = ((Button)findViewById(R.h.chr));
    this.rDm = ((TextView)findViewById(R.h.chs));
    this.rDt = ((ImageView)findViewById(R.h.bxW));
    this.rDl.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(20473035358208L, 152536);
        FtsWebVideoView.this.pause();
        GMTrace.o(20473035358208L, 152536);
      }
    });
    this.rDt.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(20481356857344L, 152598);
        if (!FtsWebVideoView.this.Xg()) {}
        for (boolean bool = true;; bool = false)
        {
          FtsWebVideoView.this.jp(bool);
          GMTrace.o(20481356857344L, 152598);
          return;
        }
      }
    });
    this.rDk.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(20484578082816L, 152622);
        if (FtsWebVideoView.a(FtsWebVideoView.this) == FtsWebVideoView.c.rDC) {
          FtsWebVideoView.b(FtsWebVideoView.this);
        }
        FtsWebVideoView.this.start(true);
        GMTrace.o(20484578082816L, 152622);
      }
    });
    this.yvu.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(20459882020864L, 152438);
        FtsWebVideoView.this.start(true);
        FtsWebVideoView.c(FtsWebVideoView.this).bBW();
        GMTrace.o(20459882020864L, 152438);
      }
    });
    this.rDn = new a(getContext(), this, new a.b()
    {
      public final void R(float paramAnonymousFloat)
      {
        GMTrace.i(21049097846784L, 156828);
        w.d("MicroMsg.FtsWebVideoView", "onAdjustVolume:" + paramAnonymousFloat);
        FtsWebVideoView.i(FtsWebVideoView.this).Q(paramAnonymousFloat);
        FtsWebVideoView.j(FtsWebVideoView.this).setText(R.l.dyF);
        FtsWebVideoView.k(FtsWebVideoView.this).setImageResource(R.k.cMJ);
        FtsWebVideoView.l(FtsWebVideoView.this).setVisibility(0);
        GMTrace.o(21049097846784L, 156828);
      }
      
      public final void S(float paramAnonymousFloat)
      {
        GMTrace.i(21049232064512L, 156829);
        w.d("MicroMsg.FtsWebVideoView", "onAdjustBrightness:" + paramAnonymousFloat);
        FtsWebVideoView.i(FtsWebVideoView.this).Q(paramAnonymousFloat);
        FtsWebVideoView.j(FtsWebVideoView.this).setText(R.l.dyE);
        FtsWebVideoView.k(FtsWebVideoView.this).setImageResource(R.k.cMH);
        FtsWebVideoView.l(FtsWebVideoView.this).setVisibility(0);
        GMTrace.o(21049232064512L, 156829);
      }
      
      public final void Xl()
      {
        GMTrace.i(21048158322688L, 156821);
        w.d("MicroMsg.FtsWebVideoView", "onSingleTap");
        if (FtsWebVideoView.f(FtsWebVideoView.this)) {
          FtsWebVideoView.c(FtsWebVideoView.this).js(FtsWebVideoView.e(FtsWebVideoView.this));
        }
        GMTrace.o(21048158322688L, 156821);
      }
      
      public final void Xm()
      {
        GMTrace.i(21048292540416L, 156822);
        w.d("MicroMsg.FtsWebVideoView", "onDoubleTap");
        GMTrace.o(21048292540416L, 156822);
      }
      
      public final void Xn()
      {
        GMTrace.i(21048426758144L, 156823);
        if (FtsWebVideoView.d(FtsWebVideoView.this).Xi())
        {
          w.i("MicroMsg.FtsWebVideoView", "onStartDragProgress isLive: no seek");
          GMTrace.o(21048426758144L, 156823);
          return;
        }
        FtsWebVideoView.g(FtsWebVideoView.this).setVisibility(0);
        FtsWebVideoView.c(FtsWebVideoView.this).bBX();
        GMTrace.o(21048426758144L, 156823);
      }
      
      public final void Xo()
      {
        GMTrace.i(21049366282240L, 156830);
        FtsWebVideoView.l(FtsWebVideoView.this).setVisibility(8);
        GMTrace.o(21049366282240L, 156830);
      }
      
      public final void Xp()
      {
        GMTrace.i(21049500499968L, 156831);
        FtsWebVideoView.l(FtsWebVideoView.this).setVisibility(8);
        GMTrace.o(21049500499968L, 156831);
      }
      
      public final boolean ctT()
      {
        GMTrace.i(21048829411328L, 156826);
        if (FtsWebVideoView.h(FtsWebVideoView.this))
        {
          GMTrace.o(21048829411328L, 156826);
          return false;
        }
        GMTrace.o(21048829411328L, 156826);
        return true;
      }
      
      public final int d(int paramAnonymousInt, float paramAnonymousFloat)
      {
        int j = 0;
        GMTrace.i(21048560975872L, 156824);
        if (FtsWebVideoView.d(FtsWebVideoView.this).Xi())
        {
          w.i("MicroMsg.FtsWebVideoView", "onDragProgress isLive: no seek");
          GMTrace.o(21048560975872L, 156824);
          return 0;
        }
        w.i("MicroMsg.FtsWebVideoView", "onDragProgress:" + paramAnonymousInt + "/" + paramAnonymousFloat);
        paramAnonymousFloat /= FtsWebVideoView.this.getMeasuredWidth();
        int i = FtsWebVideoView.d(FtsWebVideoView.this).XG();
        paramAnonymousInt = getCurrentPosition();
        paramAnonymousInt = (int)(paramAnonymousFloat * i) + paramAnonymousInt;
        if (paramAnonymousInt < 0) {
          paramAnonymousInt = j;
        }
        for (;;)
        {
          String str = c.ax(i * 1000L);
          FtsWebVideoView.g(FtsWebVideoView.this).setText(c.ax(paramAnonymousInt * 1000L) + "/" + str);
          GMTrace.o(21048560975872L, 156824);
          return paramAnonymousInt;
          if (paramAnonymousInt > i) {
            paramAnonymousInt = i;
          }
        }
      }
      
      public final void e(int paramAnonymousInt, float paramAnonymousFloat)
      {
        GMTrace.i(21048695193600L, 156825);
        FtsWebVideoView.c(FtsWebVideoView.this).bBY();
        FtsWebVideoView.g(FtsWebVideoView.this).setVisibility(8);
        w.i("MicroMsg.FtsWebVideoView", "onEndDragProgress: dragPosition=%d currentPositon=%d totalDistanceX=%s", new Object[] { Integer.valueOf(paramAnonymousInt), Integer.valueOf(FtsWebVideoView.d(FtsWebVideoView.this).XI()), Float.valueOf(paramAnonymousFloat) });
        if (FtsWebVideoView.d(FtsWebVideoView.this).Xi())
        {
          w.i("MicroMsg.FtsWebVideoView", "onEndDragProgress isLive: no seek");
          GMTrace.o(21048695193600L, 156825);
          return;
        }
        FtsWebVideoView.this.r(paramAnonymousInt, false);
        FtsWebVideoView.c(FtsWebVideoView.this).bBY();
        GMTrace.o(21048695193600L, 156825);
      }
      
      public final int getCurrentPosition()
      {
        GMTrace.i(21048963629056L, 156827);
        int i = FtsWebVideoView.d(FtsWebVideoView.this).XI();
        GMTrace.o(21048963629056L, 156827);
        return i;
      }
    });
    this.rDf.imw = new h.b()
    {
      public final void Xq()
      {
        GMTrace.i(21046413492224L, 156808);
        w.i("MicroMsg.FtsWebVideoView", "onPrepared");
        a locala = FtsWebVideoView.o(FtsWebVideoView.this);
        locala.imT = -1;
        locala.imU = 0;
        locala.imS = 0.0F;
        FtsWebVideoView.c(FtsWebVideoView.this).js(FtsWebVideoView.e(FtsWebVideoView.this));
        GMTrace.o(21046413492224L, 156808);
      }
      
      public final void Xr()
      {
        GMTrace.i(21046547709952L, 156809);
        w.i("MicroMsg.FtsWebVideoView", "onVideoEnded");
        d locald;
        if (FtsWebVideoView.m(FtsWebVideoView.this) != null)
        {
          locald = FtsWebVideoView.m(FtsWebVideoView.this);
          w.d("MicroMsg.JsApiVideoCallback", "onVideoEnded %s", new Object[] { locald.toString() });
          locald.XL();
        }
        try
        {
          locald.X(locald.a(3, null));
          if (FtsWebVideoView.p(FtsWebVideoView.this))
          {
            FtsWebVideoView.this.r(0, true);
            GMTrace.o(21046547709952L, 156809);
            return;
          }
        }
        catch (JSONException localJSONException)
        {
          for (;;)
          {
            w.printErrStackTrace("MicroMsg.JsApiVideoCallback", localJSONException, null, new Object[0]);
          }
          FtsWebVideoView.this.r(0, false);
          FtsWebVideoView.this.pause();
          FtsWebVideoView.q(FtsWebVideoView.this);
          FtsWebVideoView.r(FtsWebVideoView.this).setImageResource(R.g.aWM);
          FtsWebVideoView.c(FtsWebVideoView.this).setVisibility(8);
          GMTrace.o(21046547709952L, 156809);
        }
      }
      
      public final void Xs()
      {
        GMTrace.i(21046816145408L, 156811);
        w.i("MicroMsg.FtsWebVideoView", "onVideoPause");
        if ((FtsWebVideoView.m(FtsWebVideoView.this) != null) && (FtsWebVideoView.m(FtsWebVideoView.this) != null))
        {
          d locald = FtsWebVideoView.m(FtsWebVideoView.this);
          w.d("MicroMsg.JsApiVideoCallback", "onVideoPause %s", new Object[] { locald.toString() });
          locald.XL();
          try
          {
            locald.X(locald.a(2, null));
            GMTrace.o(21046816145408L, 156811);
            return;
          }
          catch (JSONException localJSONException)
          {
            w.printErrStackTrace("MicroMsg.JsApiVideoCallback", localJSONException, null, new Object[0]);
          }
        }
        GMTrace.o(21046816145408L, 156811);
      }
      
      public final void Xt()
      {
        GMTrace.i(21046950363136L, 156812);
        w.i("MicroMsg.FtsWebVideoView", "onVideoPlay, isLive:%b", new Object[] { Boolean.valueOf(FtsWebVideoView.t(FtsWebVideoView.this)) });
        d locald;
        if (FtsWebVideoView.m(FtsWebVideoView.this) != null)
        {
          locald = FtsWebVideoView.m(FtsWebVideoView.this);
          w.d("MicroMsg.JsApiVideoCallback", "onVideoPlay %s", new Object[] { locald.toString() });
          locald.imL = 0;
          if (locald.imK == null) {
            locald.imK = new aj(new d.1(locald), true);
          }
          locald.imK.z(250L, 250L);
        }
        try
        {
          locald.X(locald.a(1, null));
          if ((FtsWebVideoView.u(FtsWebVideoView.this) > 0L) && (FtsWebVideoView.u(FtsWebVideoView.this) != Long.MAX_VALUE))
          {
            long l = System.currentTimeMillis() - FtsWebVideoView.u(FtsWebVideoView.this);
            g.ork.i(14909, new Object[] { Long.valueOf(l), Long.valueOf(System.currentTimeMillis()), Long.valueOf(l), am.eu(FtsWebVideoView.this.getContext()), FtsWebVideoView.n(FtsWebVideoView.this) });
          }
          GMTrace.o(21046950363136L, 156812);
          return;
        }
        catch (JSONException localJSONException)
        {
          for (;;)
          {
            w.printErrStackTrace("MicroMsg.JsApiVideoCallback", localJSONException, null, new Object[0]);
          }
        }
      }
      
      public final void Xu()
      {
        GMTrace.i(21047084580864L, 156813);
        w.i("MicroMsg.FtsWebVideoView", "onVideoWaiting");
        FtsWebVideoView.c(FtsWebVideoView.this).bBX();
        FtsWebVideoView.a(FtsWebVideoView.this, true);
        GMTrace.o(21047084580864L, 156813);
      }
      
      public final void Xv()
      {
        GMTrace.i(21047218798592L, 156814);
        w.i("MicroMsg.FtsWebVideoView", "onVideoWaitingEnd");
        FtsWebVideoView.a(FtsWebVideoView.this, false);
        FtsWebVideoView.c(FtsWebVideoView.this).bBY();
        FtsWebVideoView.c(FtsWebVideoView.this).bBW();
        GMTrace.o(21047218798592L, 156814);
      }
      
      public final void bs(int paramAnonymousInt1, int paramAnonymousInt2)
      {
        GMTrace.i(21046681927680L, 156810);
        w.i("MicroMsg.FtsWebVideoView", "onGetVideoSize width=%d height=%d", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2) });
        FtsWebVideoView localFtsWebVideoView;
        if (FtsWebVideoView.s(FtsWebVideoView.this) == FtsWebVideoView.b.rDx)
        {
          localFtsWebVideoView = FtsWebVideoView.this;
          if (paramAnonymousInt1 >= paramAnonymousInt2) {
            break label102;
          }
        }
        label102:
        for (FtsWebVideoView.b localb = FtsWebVideoView.b.rDz;; localb = FtsWebVideoView.b.rDy)
        {
          FtsWebVideoView.a(localFtsWebVideoView, localb);
          w.i("MicroMsg.FtsWebVideoView", "onGetVideoSize adjust direction from AUTO to %s", new Object[] { FtsWebVideoView.s(FtsWebVideoView.this) });
          GMTrace.o(21046681927680L, 156810);
          return;
        }
      }
      
      public final void w(String paramAnonymousString, int paramAnonymousInt1, int paramAnonymousInt2)
      {
        GMTrace.i(21046279274496L, 156807);
        w.i("MicroMsg.FtsWebVideoView", "onError errorMsg=%s what=%d extra=%d", new Object[] { paramAnonymousString, Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2) });
        if (FtsWebVideoView.m(FtsWebVideoView.this) != null)
        {
          paramAnonymousString = FtsWebVideoView.m(FtsWebVideoView.this);
          w.e("MicroMsg.JsApiVideoCallback", "onError what %d, extra %d", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2) });
          paramAnonymousString.clean();
        }
        try
        {
          JSONObject localJSONObject = new JSONObject();
          localJSONObject.put("errCode", paramAnonymousInt1);
          localJSONObject.put("errMsg", String.valueOf(paramAnonymousInt2));
          paramAnonymousString.X(paramAnonymousString.a(7, localJSONObject));
          FtsWebVideoView.this.pause();
          FtsWebVideoView.a(FtsWebVideoView.this, FtsWebVideoView.this.getContext().getString(R.l.egk, new Object[] { paramAnonymousInt1 + ":" + paramAnonymousInt2 }), FtsWebVideoView.this.getContext().getString(R.l.egF));
          g.ork.i(14911, new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2), am.eu(FtsWebVideoView.this.getContext()), FtsWebVideoView.n(FtsWebVideoView.this) });
          GMTrace.o(21046279274496L, 156807);
          return;
        }
        catch (JSONException paramAnonymousString)
        {
          for (;;)
          {
            w.printErrStackTrace("MicroMsg.JsApiVideoCallback", paramAnonymousString, null, new Object[0]);
          }
        }
      }
    };
    this.rDg = new FtsWebVideoViewControlBar(getContext());
    this.rDg.setVisibility(8);
    localObject1 = this.rDg;
    Object localObject2 = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(20473840664576L, 152542);
        if (!FtsWebVideoView.this.Xg()) {}
        for (boolean bool = true;; bool = false)
        {
          FtsWebVideoView.this.jp(bool);
          GMTrace.o(20473840664576L, 152542);
          return;
        }
      }
    };
    ((FtsWebVideoViewControlBar)localObject1).imh.setOnClickListener((View.OnClickListener)localObject2);
    ((FtsWebVideoViewControlBar)localObject1).rDt.setOnClickListener((View.OnClickListener)localObject2);
    localObject1 = this.rDg;
    localObject2 = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(21049634717696L, 156832);
        FtsWebVideoView.v(FtsWebVideoView.this);
        FtsWebVideoView.c(FtsWebVideoView.this).bBW();
        GMTrace.o(21049634717696L, 156832);
      }
    };
    ((FtsWebVideoViewControlBar)localObject1).rDE.setOnClickListener((View.OnClickListener)localObject2);
    this.rDg.oSQ = new com.tencent.mm.plugin.sight.decode.ui.b()
    {
      public final void Xw()
      {
        GMTrace.i(21047353016320L, 156815);
        w.i("MicroMsg.FtsWebVideoView", "onSeekPre");
        FtsWebVideoView.c(FtsWebVideoView.this).bBV();
        GMTrace.o(21047353016320L, 156815);
      }
      
      public final void iM(int paramAnonymousInt)
      {
        GMTrace.i(21047487234048L, 156816);
        w.i("MicroMsg.FtsWebVideoView", "onSeekTo %d", new Object[] { Integer.valueOf(paramAnonymousInt) });
        FtsWebVideoView.this.r(paramAnonymousInt, false);
        FtsWebVideoView.c(FtsWebVideoView.this).bBW();
        GMTrace.o(21047487234048L, 156816);
      }
    };
    this.rDg.d(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(21046145056768L, 156806);
        if (FtsWebVideoView.d(FtsWebVideoView.this).isPlaying())
        {
          FtsWebVideoView.c(FtsWebVideoView.this).bBV();
          FtsWebVideoView.this.pause();
          GMTrace.o(21046145056768L, 156806);
          return;
        }
        FtsWebVideoView.c(FtsWebVideoView.this).bBW();
        FtsWebVideoView.this.start(true);
        GMTrace.o(21046145056768L, 156806);
      }
    });
    this.rDg.rDF = new FtsWebVideoViewControlBar.a()
    {
      public final int Xj()
      {
        GMTrace.i(21049903153152L, 156834);
        int i = FtsWebVideoView.d(FtsWebVideoView.this).MU();
        GMTrace.o(21049903153152L, 156834);
        return i;
      }
      
      public final int Xk()
      {
        GMTrace.i(21050037370880L, 156835);
        int i = FtsWebVideoView.d(FtsWebVideoView.this).XG();
        GMTrace.o(21050037370880L, 156835);
        return i;
      }
      
      public final int ctW()
      {
        GMTrace.i(21050171588608L, 156836);
        int i = FtsWebVideoView.d(FtsWebVideoView.this).XH();
        GMTrace.o(21050171588608L, 156836);
        return i;
      }
    };
    this.rDf.a(this.rDg);
    paramContext.registerReceiver(this.rDv, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    bBQ();
    GMTrace.o(20466861342720L, 152490);
  }
  
  public static void setDuration(int paramInt)
  {
    GMTrace.i(20467398213632L, 152494);
    if (paramInt <= 0)
    {
      w.i("MicroMsg.FtsWebVideoView", "setDuration error duration=%d", new Object[] { Integer.valueOf(paramInt) });
      GMTrace.o(20467398213632L, 152494);
      return;
    }
    GMTrace.o(20467398213632L, 152494);
  }
  
  public final boolean Xg()
  {
    GMTrace.i(20469143044096L, 152507);
    if (this.rDo == null)
    {
      w.w("MicroMsg.FtsWebVideoView", "isInFullScreen mFullScreenDelegate null");
      GMTrace.o(20469143044096L, 152507);
      return false;
    }
    boolean bool = this.rDo.isFullScreen();
    GMTrace.o(20469143044096L, 152507);
    return bool;
  }
  
  public final int bBR()
  {
    GMTrace.i(20468740390912L, 152504);
    int i = ((AudioManager)getContext().getSystemService("audio")).getStreamVolume(3);
    GMTrace.o(20468740390912L, 152504);
    return i;
  }
  
  public final void ch(String paramString, int paramInt)
  {
    GMTrace.i(20468069302272L, 152499);
    w.i("MicroMsg.FtsWebVideoView", "setVideoPath path=%s isLive=%s", new Object[] { paramString, Boolean.valueOf(false) });
    this.url = paramString;
    if (bg.nm(paramString))
    {
      w.v("MicroMsg.FtsWebVideoView", "setVideoPath videoPath empty");
      GMTrace.o(20468069302272L, 152499);
      return;
    }
    stop();
    this.imb = false;
    this.rDf.b(false, paramString, paramInt);
    if (this.rDg != null) {
      this.rDg.tY(paramInt);
    }
    if (this.imc > 0) {
      this.rDf.iN(this.imc);
    }
    if (this.mAutoPlay)
    {
      w.i("MicroMsg.FtsWebVideoView", "setVideoPath autoPlay");
      start(false);
    }
    if ((paramString.startsWith("wxfile://")) && (!bg.nm(paramString)) && (!bg.nm(this.imd))) {
      w.i("MicroMsg.FtsWebVideoView", "setCover mCoverUrl not null");
    }
    GMTrace.o(20468069302272L, 152499);
  }
  
  public final void cn(boolean paramBoolean)
  {
    GMTrace.i(20469277261824L, 152508);
    if (this.rDp == null)
    {
      GMTrace.o(20469277261824L, 152508);
      return;
    }
    String str;
    if (this.rDe == b.rDz) {
      str = "vertical";
    }
    for (;;)
    {
      d locald = this.rDp;
      int i = this.ilU;
      try
      {
        w.i("MicroMsg.JsApiVideoCallback", "onVideoFullScreenChange videoPlayerId=%d isFullScreen=%b direction:%s", new Object[] { Integer.valueOf(i), Boolean.valueOf(paramBoolean), str });
        JSONObject localJSONObject = locald.XK();
        localJSONObject.put("fullScreen", paramBoolean);
        localJSONObject.put("direction", str);
        locald.X(locald.a(5, localJSONObject));
        ctU();
        GMTrace.o(20469277261824L, 152508);
        return;
        str = "horizontal";
      }
      catch (JSONException localJSONException)
      {
        for (;;)
        {
          w.e("MicroMsg.JsApiVideoCallback", "onVideoFullScreenChange e=%s", new Object[] { localJSONException });
        }
      }
    }
  }
  
  public final void jp(boolean paramBoolean)
  {
    boolean bool = false;
    GMTrace.i(20469008826368L, 152506);
    w.i("MicroMsg.FtsWebVideoView", "operateFullScreen toFullScreen=%b", new Object[] { Boolean.valueOf(paramBoolean) });
    if (this.rDo == null)
    {
      w.w("MicroMsg.FtsWebVideoView", "operateFullScreen mFullScreenDelegate null");
      GMTrace.o(20469008826368L, 152506);
      return;
    }
    if (paramBoolean == Xg())
    {
      w.i("MicroMsg.FtsWebVideoView", "operateFullScreen current same");
      GMTrace.o(20469008826368L, 152506);
      return;
    }
    if (paramBoolean)
    {
      Object localObject = this.rDo;
      paramBoolean = bool;
      if (this.rDe != b.rDz) {
        paramBoolean = true;
      }
      ((a)localObject).jq(paramBoolean);
      localObject = this.rDg;
      ((FtsWebVideoViewControlBar)localObject).imq = true;
      ((FtsWebVideoViewControlBar)localObject).XB();
      cn(true);
      GMTrace.o(20469008826368L, 152506);
      return;
    }
    this.rDo.WT();
    this.rDg.WT();
    GMTrace.o(20469008826368L, 152506);
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    GMTrace.i(20468606173184L, 152503);
    if ((this.ilY) || (Xg()))
    {
      a locala;
      if (this.rDn != null)
      {
        locala = this.rDn;
        if (locala.rCX.ctT())
        {
          int i = paramMotionEvent.getActionMasked();
          if (i == 0)
          {
            locala.imS = paramMotionEvent.getRawX();
            locala.imR = ((AudioManager)locala.mContext.getSystemService("audio")).getStreamVolume(3);
            locala.hZu = c.bL(locala.mContext);
          }
          locala.imP.onTouchEvent(paramMotionEvent);
          if ((i != 1) && (i != 3)) {
            break label185;
          }
          if (locala.rCW != a.a.rDc) {
            break label196;
          }
          locala.rCX.e(locala.imU, paramMotionEvent.getRawX() - locala.imS);
          locala.imT = -1;
          locala.imU = 0;
          locala.imS = 0.0F;
        }
      }
      for (;;)
      {
        locala.rCW = a.a.rCZ;
        label185:
        GMTrace.o(20468606173184L, 152503);
        return true;
        label196:
        if (locala.rCW == a.a.rDa)
        {
          ((AudioManager)locala.mContext.getSystemService("audio")).getStreamMaxVolume(3);
          locala.rCX.Xo();
        }
        else if (locala.rCW == a.a.rDb)
        {
          locala.rCX.Xp();
        }
      }
    }
    if ((paramMotionEvent.getAction() == 0) && (bBS())) {
      this.rDg.js(this.jRF);
    }
    boolean bool = super.onTouchEvent(paramMotionEvent);
    GMTrace.o(20468606173184L, 152503);
    return bool;
  }
  
  public final void pause()
  {
    GMTrace.i(20467800866816L, 152497);
    w.i("MicroMsg.FtsWebVideoView", "pause");
    bBQ();
    if (!this.rDf.isPlaying())
    {
      GMTrace.o(20467800866816L, 152497);
      return;
    }
    this.rDf.pause();
    GMTrace.o(20467800866816L, 152497);
  }
  
  public final void qO(String paramString)
  {
    GMTrace.i(20468337737728L, 152501);
    w.i("MicroMsg.FtsWebVideoView", "setCover coverUrl=%s", new Object[] { paramString });
    if (bg.nm(paramString))
    {
      GMTrace.o(20468337737728L, 152501);
      return;
    }
    this.imd = paramString;
    com.tencent.mm.modelappbrand.a.b.CT().a(this.ilS, paramString, null, null);
    GMTrace.o(20468337737728L, 152501);
  }
  
  public final void r(int paramInt, boolean paramBoolean)
  {
    GMTrace.i(20468203520000L, 152500);
    w.i("MicroMsg.FtsWebVideoView", "seek to position=%d current=%d isLive=%b", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(this.rDf.XI()), Boolean.valueOf(this.imb) });
    if (Xi())
    {
      GMTrace.o(20468203520000L, 152500);
      return;
    }
    if (paramBoolean)
    {
      this.rDf.o(paramInt, paramBoolean);
      GMTrace.o(20468203520000L, 152500);
      return;
    }
    this.rDf.iN(paramInt);
    GMTrace.o(20468203520000L, 152500);
  }
  
  public final void setAutoPlay(boolean paramBoolean)
  {
    GMTrace.i(20467263995904L, 152493);
    w.i("MicroMsg.FtsWebVideoView", "setAutoPlay =%b", new Object[] { Boolean.valueOf(paramBoolean) });
    this.mAutoPlay = paramBoolean;
    GMTrace.o(20467263995904L, 152493);
  }
  
  public final void setMute(boolean paramBoolean)
  {
    GMTrace.i(20468471955456L, 152502);
    w.i("MicroMsg.FtsWebVideoView", "setMute isMute=%b", new Object[] { Boolean.valueOf(paramBoolean) });
    this.jGN = paramBoolean;
    this.rDf.setMute(paramBoolean);
    if (paramBoolean)
    {
      this.rDg.uN();
      GMTrace.o(20468471955456L, 152502);
      return;
    }
    this.rDg.bBU();
    GMTrace.o(20468471955456L, 152502);
  }
  
  public final void start(boolean paramBoolean)
  {
    GMTrace.i(21073928126464L, 157013);
    w.i("MicroMsg.FtsWebVideoView", "start");
    bBQ();
    if ((paramBoolean) && (!ds(getContext())))
    {
      w.i("MicroMsg.FtsWebVideoView", "start network is not wifi");
      GMTrace.o(21073928126464L, 157013);
      return;
    }
    this.rDu = c.rDB;
    if (this.rDf.isPlaying())
    {
      GMTrace.o(21073928126464L, 157013);
      return;
    }
    if (this.ilV)
    {
      FtsWebVideoViewControlBar localFtsWebVideoViewControlBar = this.rDg;
      if (localFtsWebVideoViewControlBar.imp == null) {
        localFtsWebVideoViewControlBar.imp = new aj(new FtsWebVideoViewControlBar.2(localFtsWebVideoViewControlBar), true);
      }
      localFtsWebVideoViewControlBar.XC();
      localFtsWebVideoViewControlBar.imp.stopTimer();
      localFtsWebVideoViewControlBar.imp.z(500L, 500L);
    }
    this.rDf.start();
    if (this.yvv == 0L)
    {
      this.yvv = System.currentTimeMillis();
      GMTrace.o(21073928126464L, 157013);
      return;
    }
    this.yvv = Long.MAX_VALUE;
    GMTrace.o(21073928126464L, 157013);
  }
  
  public final void stop()
  {
    GMTrace.i(20467935084544L, 152498);
    w.i("MicroMsg.FtsWebVideoView", "stop");
    if (!this.rDf.isPlaying())
    {
      GMTrace.o(20467935084544L, 152498);
      return;
    }
    this.rDf.stop();
    FtsWebVideoViewControlBar localFtsWebVideoViewControlBar = this.rDg;
    if (localFtsWebVideoViewControlBar.imp != null) {
      localFtsWebVideoViewControlBar.imp.stopTimer();
    }
    GMTrace.o(20467935084544L, 152498);
  }
  
  public static abstract interface a
  {
    public abstract void WT();
    
    public abstract boolean isFullScreen();
    
    public abstract void jq(boolean paramBoolean);
  }
  
  private static enum b
  {
    static
    {
      GMTrace.i(20473572229120L, 152540);
      rDx = new b("AUTO", 0);
      rDy = new b("LANDSCAPE", 1);
      rDz = new b("PORTRAIT", 2);
      rDA = new b[] { rDx, rDy, rDz };
      GMTrace.o(20473572229120L, 152540);
    }
    
    private b()
    {
      GMTrace.i(20473438011392L, 152539);
      GMTrace.o(20473438011392L, 152539);
    }
  }
  
  private static enum c
  {
    static
    {
      GMTrace.i(20464713859072L, 152474);
      rDB = 1;
      rDC = 2;
      yvy = 3;
      rDD = new int[] { rDB, rDC, yvy };
      GMTrace.o(20464713859072L, 152474);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\webview\fts\ui\FtsWebVideoView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */