package com.tencent.mm.plugin.sight.decode.ui;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.WindowManager;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.util.g;
import com.tencent.mm.plugin.ag.a.e;
import com.tencent.mm.plugin.ag.a.f;
import com.tencent.mm.pluginsdk.ui.tools.VideoSightView;
import com.tencent.mm.pluginsdk.ui.tools.f;
import com.tencent.mm.pluginsdk.ui.tools.f.a;
import com.tencent.mm.pluginsdk.ui.tools.f.b;
import com.tencent.mm.pluginsdk.ui.tools.f.c;
import com.tencent.mm.pluginsdk.ui.tools.f.d;
import com.tencent.mm.pluginsdk.ui.tools.f.e;
import com.tencent.mm.pluginsdk.ui.tools.n;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.y.d.a;

public class VideoPlayView
  extends RelativeLayout
  implements f, d.a
{
  private int duration;
  public String gKE;
  private ae ghS;
  private boolean jGN;
  public f jGP;
  private ProgressBar ktM;
  public View npf;
  private int oTE;
  private int oTF;
  private boolean oTG;
  public a oTH;
  private ViewGroup oTI;
  public a oTJ;
  private double oTK;
  public TextView oTL;
  public String oTM;
  public View oTN;
  public View oTO;
  public boolean oTP;
  private int oTQ;
  private int oTR;
  private boolean oTS;
  private boolean oTT;
  private long oTU;
  private Animation oTV;
  private Animation oTW;
  private Runnable oTX;
  public int oTY;
  
  public VideoPlayView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(9257667788800L, 68975);
    this.oTE = 320;
    this.oTF = 240;
    this.oTG = true;
    this.jGP = null;
    this.oTK = 0.0D;
    this.oTM = "";
    this.ghS = new ae();
    this.oTP = true;
    this.duration = 0;
    this.oTQ = 0;
    this.oTR = 0;
    this.oTS = false;
    this.oTT = false;
    this.oTU = 0L;
    this.oTV = new AlphaAnimation(1.0F, 0.0F);
    this.oTW = new AlphaAnimation(0.0F, 1.0F);
    this.oTX = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(9241964314624L, 68858);
        VideoPlayView.this.bgN();
        GMTrace.o(9241964314624L, 68858);
      }
    };
    this.oTY = 0;
    this.jGN = false;
    init();
    GMTrace.o(9257667788800L, 68975);
  }
  
  public VideoPlayView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(9257802006528L, 68976);
    this.oTE = 320;
    this.oTF = 240;
    this.oTG = true;
    this.jGP = null;
    this.oTK = 0.0D;
    this.oTM = "";
    this.ghS = new ae();
    this.oTP = true;
    this.duration = 0;
    this.oTQ = 0;
    this.oTR = 0;
    this.oTS = false;
    this.oTT = false;
    this.oTU = 0L;
    this.oTV = new AlphaAnimation(1.0F, 0.0F);
    this.oTW = new AlphaAnimation(0.0F, 1.0F);
    this.oTX = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(9241964314624L, 68858);
        VideoPlayView.this.bgN();
        GMTrace.o(9241964314624L, 68858);
      }
    };
    this.oTY = 0;
    this.jGN = false;
    init();
    GMTrace.o(9257802006528L, 68976);
  }
  
  private void bgM()
  {
    GMTrace.i(9258070441984L, 68978);
    ((View)this.oTJ).setVisibility(0);
    this.oTN.setVisibility(0);
    if (this.oTP) {
      this.oTO.setVisibility(0);
    }
    int i;
    if (this.oTY == 2) {
      i = 0;
    }
    for (;;)
    {
      if (i != 0) {
        this.npf.setVisibility(0);
      }
      this.ghS.removeCallbacks(this.oTX);
      this.ghS.postDelayed(this.oTX, 3000L);
      GMTrace.o(9258070441984L, 68978);
      return;
      if (bg.nm(this.oTM)) {
        i = 0;
      } else {
        i = 1;
      }
    }
  }
  
  private void hv(boolean paramBoolean)
  {
    GMTrace.i(9258607312896L, 68982);
    this.jGP.o(this.oTK);
    this.jGP.start();
    w.i("MicroMsg.VideoPlayView", "startplay get duration " + this.duration + " lastPlayProgressTime: " + this.oTK);
    if (this.oTH != null) {
      this.oTH.hx(paramBoolean);
    }
    GMTrace.o(9258607312896L, 68982);
  }
  
  private void init()
  {
    GMTrace.i(9257936224256L, 68977);
    this.oTV.setDuration(200L);
    this.oTW.setDuration(200L);
    View.inflate(getContext(), a.f.pex, this);
    this.oTN = findViewById(a.e.qzv);
    this.oTO = findViewById(a.e.qzu);
    this.ktM = ((ProgressBar)findViewById(a.e.bUy));
    this.oTI = ((ViewGroup)findViewById(a.e.ckd));
    this.jGP = n.dX(getContext());
    this.jGP.ci(false);
    RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(-1, -1);
    this.oTI.addView((View)this.jGP, 0, localLayoutParams);
    this.oTL = ((TextView)findViewById(a.e.ceK));
    this.npf = this.oTL;
    this.jGP.a(new f.a()
    {
      public final void Xq()
      {
        GMTrace.i(9264110239744L, 69023);
        w.d("MicroMsg.VideoPlayView", g.tB() + " onPrepared");
        VideoPlayView.a(VideoPlayView.this, true);
        GMTrace.o(9264110239744L, 69023);
      }
      
      public final int bM(final int paramAnonymousInt1, final int paramAnonymousInt2)
      {
        GMTrace.i(9264512892928L, 69026);
        af.t(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(9271357997056L, 69077);
            w.i("MicroMsg.VideoPlayView", "play time " + paramAnonymousInt1 + " video time " + paramAnonymousInt2);
            if (paramAnonymousInt2 > 0)
            {
              VideoPlayView.b(VideoPlayView.this, paramAnonymousInt2);
              if ((VideoPlayView.c(VideoPlayView.this) != null) && (VideoPlayView.h(VideoPlayView.this))) {
                VideoPlayView.i(VideoPlayView.this);
              }
              VideoPlayView.f(VideoPlayView.this).ua(paramAnonymousInt2);
            }
            if (VideoPlayView.c(VideoPlayView.this) != null)
            {
              if (VideoPlayView.c(VideoPlayView.this).bgE() != paramAnonymousInt2) {
                VideoPlayView.c(VideoPlayView.this).tY(paramAnonymousInt2);
              }
              VideoPlayView.c(VideoPlayView.this).seek(paramAnonymousInt1);
              VideoPlayView.c(VideoPlayView.this).cp(true);
            }
            if (VideoPlayView.j(VideoPlayView.this).getVisibility() == 0) {
              VideoPlayView.j(VideoPlayView.this).setVisibility(8);
            }
            VideoPlayView.a(VideoPlayView.this, paramAnonymousInt1);
            GMTrace.o(9271357997056L, 69077);
          }
        });
        GMTrace.o(9264512892928L, 69026);
        return 0;
      }
      
      public final void bs(int paramAnonymousInt1, int paramAnonymousInt2)
      {
        GMTrace.i(9264647110656L, 69027);
        VideoPlayView.c(VideoPlayView.this, paramAnonymousInt1);
        VideoPlayView.d(VideoPlayView.this, paramAnonymousInt2);
        if (VideoPlayView.k(VideoPlayView.this)) {
          VideoPlayView.l(VideoPlayView.this).post(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(18656801062912L, 139004);
              VideoPlayView.e(VideoPlayView.this, VideoPlayView.this.oTY);
              GMTrace.o(18656801062912L, 139004);
            }
          });
        }
        GMTrace.o(9264647110656L, 69027);
      }
      
      public final void onCompletion()
      {
        GMTrace.i(9264378675200L, 69025);
        w.d("MicroMsg.VideoPlayView", "on completion " + bg.bQW().toString());
        if (!VideoPlayView.b(VideoPlayView.this))
        {
          VideoPlayView.a(VideoPlayView.this, 0.0D);
          VideoPlayView.this.o(0.0D);
          VideoPlayView.c(VideoPlayView.this).cp(false);
          VideoPlayView.a(VideoPlayView.this, 0);
          VideoPlayView.d(VideoPlayView.this);
          if (System.currentTimeMillis() - VideoPlayView.e(VideoPlayView.this) < 2000L)
          {
            w.i("MicroMsg.VideoPlayView", "Too short onCompletion");
            GMTrace.o(9264378675200L, 69025);
            return;
          }
          VideoPlayView.a(VideoPlayView.this, System.currentTimeMillis());
          if (VideoPlayView.f(VideoPlayView.this) != null)
          {
            VideoPlayView.f(VideoPlayView.this).bgR();
            GMTrace.o(9264378675200L, 69025);
          }
        }
        else
        {
          VideoPlayView.c(VideoPlayView.this).cp(false);
          VideoPlayView.a(VideoPlayView.this, (int)VideoPlayView.g(VideoPlayView.this));
          VideoPlayView.d(VideoPlayView.this);
          if (VideoPlayView.f(VideoPlayView.this) != null) {
            VideoPlayView.f(VideoPlayView.this).bgS();
          }
        }
        GMTrace.o(9264378675200L, 69025);
      }
      
      public final void onError(int paramAnonymousInt1, int paramAnonymousInt2)
      {
        GMTrace.i(9264244457472L, 69024);
        w.e("MicroMsg.VideoPlayView", "on play video error, what %d extra %d", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2) });
        VideoPlayView.a(VideoPlayView.this).stop();
        GMTrace.o(9264244457472L, 69024);
      }
    });
    if ((this.jGP instanceof VideoSightView)) {
      ((VideoSightView)this.jGP).pJS = false;
    }
    setOnTouchListener(new View.OnTouchListener()
    {
      public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
      {
        GMTrace.i(9253372821504L, 68943);
        if (paramAnonymousMotionEvent.getAction() == 1) {
          VideoPlayView.m(VideoPlayView.this);
        }
        for (;;)
        {
          GMTrace.o(9253372821504L, 68943);
          return true;
          paramAnonymousMotionEvent.getAction();
        }
      }
    });
    bgN();
    ((View)this.jGP).post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(9264915546112L, 69029);
        DisplayMetrics localDisplayMetrics = new DisplayMetrics();
        if ((VideoPlayView.this.getContext() instanceof MMActivity))
        {
          ((MMActivity)VideoPlayView.this.getContext()).getWindowManager().getDefaultDisplay().getMetrics(localDisplayMetrics);
          if ((VideoPlayView.a(VideoPlayView.this) instanceof VideoSightView)) {
            ((VideoSightView)VideoPlayView.a(VideoPlayView.this)).tW(localDisplayMetrics.widthPixels);
          }
        }
        ((View)VideoPlayView.a(VideoPlayView.this)).requestLayout();
        ((View)VideoPlayView.a(VideoPlayView.this)).postInvalidate();
        GMTrace.o(9264915546112L, 69029);
      }
    });
    GMTrace.o(9257936224256L, 68977);
  }
  
  private void tZ(int paramInt)
  {
    GMTrace.i(9258741530624L, 68983);
    if (paramInt >= 0) {}
    for (double d = paramInt;; d = this.jGP.bgO())
    {
      this.oTK = d;
      w.i("MicroMsg.VideoPlayView", "pause play " + this.oTK + " lastTime: " + paramInt + " last " + this.jGP.bgO());
      this.jGP.pause();
      this.ghS.post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(9238474653696L, 68832);
          if (VideoPlayView.c(VideoPlayView.this) != null) {
            VideoPlayView.c(VideoPlayView.this).cp(false);
          }
          GMTrace.o(9238474653696L, 68832);
        }
      });
      if (this.oTH != null) {
        this.oTH.bgQ();
      }
      GMTrace.o(9258741530624L, 68983);
      return;
    }
  }
  
  public final String NE()
  {
    GMTrace.i(9259009966080L, 68985);
    String str = this.gKE;
    GMTrace.o(9259009966080L, 68985);
    return str;
  }
  
  public final void a(f.a parama)
  {
    GMTrace.i(9259815272448L, 68991);
    this.jGP.a(parama);
    GMTrace.o(9259815272448L, 68991);
  }
  
  public final void a(f.b paramb)
  {
    GMTrace.i(16373489074176L, 121992);
    GMTrace.o(16373489074176L, 121992);
  }
  
  public final void a(f.c paramc)
  {
    GMTrace.i(16373354856448L, 121991);
    GMTrace.o(16373354856448L, 121991);
  }
  
  public final void a(f.d paramd)
  {
    GMTrace.i(17438909399040L, 129930);
    GMTrace.o(17438909399040L, 129930);
  }
  
  public final void a(f.e parame)
  {
    GMTrace.i(9261023232000L, 69000);
    GMTrace.o(9261023232000L, 69000);
  }
  
  public final void bgL()
  {
    GMTrace.i(18912754270208L, 140911);
    this.ktM.setVisibility(0);
    GMTrace.o(18912754270208L, 140911);
  }
  
  public final void bgN()
  {
    GMTrace.i(9258204659712L, 68979);
    if (this.oTJ != null) {
      ((View)this.oTJ).setVisibility(4);
    }
    this.oTN.setVisibility(8);
    this.oTO.setVisibility(8);
    this.npf.setVisibility(8);
    GMTrace.o(9258204659712L, 68979);
  }
  
  public final double bgO()
  {
    GMTrace.i(9259681054720L, 68990);
    double d = Math.max(this.oTK, this.jGP.bgO());
    GMTrace.o(9259681054720L, 68990);
    return d;
  }
  
  public final long bgP()
  {
    GMTrace.i(9260620578816L, 68997);
    GMTrace.o(9260620578816L, 68997);
    return 0L;
  }
  
  public final void c(double paramDouble, boolean paramBoolean)
  {
    GMTrace.i(9260889014272L, 68999);
    o(paramDouble);
    GMTrace.o(9260889014272L, 68999);
  }
  
  public final void ci(boolean paramBoolean)
  {
    GMTrace.i(9259546836992L, 68989);
    this.jGP.ci(paramBoolean);
    GMTrace.o(9259546836992L, 68989);
  }
  
  public final int getCurrentPosition()
  {
    GMTrace.i(9259949490176L, 68992);
    int i = this.jGP.getCurrentPosition();
    GMTrace.o(9259949490176L, 68992);
    return i;
  }
  
  public final int getDuration()
  {
    GMTrace.i(9260083707904L, 68993);
    if (this.duration == 0)
    {
      i = this.jGP.getDuration();
      GMTrace.o(9260083707904L, 68993);
      return i;
    }
    int i = this.duration;
    GMTrace.o(9260083707904L, 68993);
    return i;
  }
  
  public final void hu(boolean paramBoolean)
  {
    GMTrace.i(18912620052480L, 140910);
    this.oTS = paramBoolean;
    Object localObject;
    if ((this.jGP != null) && ((this.jGP instanceof VideoSightView)))
    {
      localObject = (VideoSightView)this.jGP;
      if (((SightPlayImageView)localObject).oTg != null)
      {
        localObject = ((SightPlayImageView)localObject).oTg;
        if (paramBoolean) {
          break label72;
        }
      }
    }
    label72:
    for (paramBoolean = true;; paramBoolean = false)
    {
      ((com.tencent.mm.plugin.sight.decode.a.b)localObject).oSm = paramBoolean;
      GMTrace.o(18912620052480L, 140910);
      return;
    }
  }
  
  public final void hw(boolean paramBoolean)
  {
    GMTrace.i(9260352143360L, 68995);
    this.jGP.hw(paramBoolean);
    GMTrace.o(9260352143360L, 68995);
  }
  
  public final boolean isPlaying()
  {
    GMTrace.i(9258875748352L, 68984);
    boolean bool = this.jGP.isPlaying();
    GMTrace.o(9258875748352L, 68984);
    return bool;
  }
  
  public final boolean j(Context paramContext, boolean paramBoolean)
  {
    GMTrace.i(9259144183808L, 68986);
    paramBoolean = this.jGP.j(paramContext, paramBoolean);
    GMTrace.o(9259144183808L, 68986);
    return paramBoolean;
  }
  
  public final void o(double paramDouble)
  {
    GMTrace.i(9260217925632L, 68994);
    this.jGP.o(paramDouble);
    this.oTJ.seek((int)paramDouble);
    GMTrace.o(9260217925632L, 68994);
  }
  
  public final void onDetach()
  {
    GMTrace.i(9259412619264L, 68988);
    this.jGP.onDetach();
    GMTrace.o(9259412619264L, 68988);
  }
  
  public final void pause()
  {
    GMTrace.i(9258473095168L, 68981);
    tZ(-1);
    GMTrace.o(9258473095168L, 68981);
  }
  
  public final void setMute(boolean paramBoolean)
  {
    GMTrace.i(9260754796544L, 68998);
    this.jGN = paramBoolean;
    GMTrace.o(9260754796544L, 68998);
  }
  
  public final void setVideoPath(String paramString)
  {
    GMTrace.i(9257533571072L, 68974);
    this.gKE = paramString;
    w.i("MicroMsg.VideoPlayView", "videoPath  %s", new Object[] { this.gKE });
    this.jGP.setVideoPath(this.gKE);
    GMTrace.o(9257533571072L, 68974);
  }
  
  public final boolean start()
  {
    GMTrace.i(9258338877440L, 68980);
    hv(true);
    GMTrace.o(9258338877440L, 68980);
    return true;
  }
  
  public final void stop()
  {
    GMTrace.i(9259278401536L, 68987);
    this.jGP.stop();
    GMTrace.o(9259278401536L, 68987);
  }
  
  public final void update(int paramInt)
  {
    GMTrace.i(9260486361088L, 68996);
    this.oTT = true;
    Object localObject;
    if ((this.oTR == 0) || (this.oTQ == 0))
    {
      localObject = getResources().getDisplayMetrics();
      this.oTR = ((DisplayMetrics)localObject).heightPixels;
      this.oTQ = ((DisplayMetrics)localObject).widthPixels;
      if (this.oTR < this.oTQ)
      {
        this.oTR = ((DisplayMetrics)localObject).widthPixels;
        this.oTQ = ((DisplayMetrics)localObject).heightPixels;
      }
      w.i("MicroMsg.VideoPlayView", "getScreen screen_height:" + this.oTR + " screen_width:" + this.oTQ);
    }
    ViewGroup.LayoutParams localLayoutParams = this.oTI.getLayoutParams();
    RelativeLayout.LayoutParams localLayoutParams1;
    if (this.oTJ == null)
    {
      localObject = null;
      localLayoutParams1 = new RelativeLayout.LayoutParams(-1, -1);
      if (paramInt != 1) {
        break label418;
      }
      localLayoutParams1.width = this.oTQ;
      localLayoutParams1.height = ((int)(this.oTQ * 1.0D * this.oTF / this.oTE));
      if (this.oTJ != null) {
        ((RelativeLayout.LayoutParams)localObject).bottomMargin = BackwardSupportUtil.b.a(getContext(), 0.0F);
      }
    }
    for (;;)
    {
      if (this.oTJ != null)
      {
        this.oTJ.bgH();
        ((View)this.oTJ).setLayoutParams((ViewGroup.LayoutParams)localObject);
        if ((this.oTJ instanceof AdVideoPlayerLoadingBar)) {
          this.ghS.postDelayed(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(9249480507392L, 68914);
              if (!VideoPlayView.a(VideoPlayView.this).isPlaying()) {
                ((AdVideoPlayerLoadingBar)VideoPlayView.c(VideoPlayView.this)).bgJ();
              }
              GMTrace.o(9249480507392L, 68914);
            }
          }, 500L);
        }
      }
      w.i("MicroMsg.VideoPlayView", "orientation " + paramInt + " " + localLayoutParams1.width + " " + localLayoutParams1.height);
      ((View)this.jGP).setLayoutParams(localLayoutParams1);
      if ((this.jGP instanceof com.tencent.mm.plugin.sight.decode.a.a)) {
        ((com.tencent.mm.plugin.sight.decode.a.a)this.jGP).cV(localLayoutParams1.width, localLayoutParams1.height);
      }
      localLayoutParams.height = localLayoutParams1.height;
      localLayoutParams.width = localLayoutParams1.width;
      this.oTI.setLayoutParams(localLayoutParams);
      ((View)this.jGP).requestLayout();
      GMTrace.o(9260486361088L, 68996);
      return;
      localObject = (RelativeLayout.LayoutParams)((View)this.oTJ).getLayoutParams();
      break;
      label418:
      localLayoutParams1.height = this.oTQ;
      localLayoutParams1.width = ((int)(this.oTQ * 1.0D * this.oTE / this.oTF));
      if (this.oTJ != null) {
        ((RelativeLayout.LayoutParams)localObject).bottomMargin = BackwardSupportUtil.b.a(getContext(), 0.0F);
      }
    }
  }
  
  public static abstract interface a
  {
    public abstract void bgQ();
    
    public abstract void bgR();
    
    public abstract void bgS();
    
    public abstract void hx(boolean paramBoolean);
    
    public abstract void ua(int paramInt);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sight\decode\ui\VideoPlayView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */