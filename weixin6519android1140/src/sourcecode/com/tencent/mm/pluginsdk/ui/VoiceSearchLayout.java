package com.tencent.mm.pluginsdk.ui;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.AnimationDrawable;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.a;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.bd.e.b;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.at;

public class VoiceSearchLayout
  extends LinearLayout
{
  private static final int[] jsq;
  private static final int[] twf;
  private static final int[] twg;
  private int eDj;
  public boolean isStart;
  public final aj jsM;
  public View kJj;
  public a tvW;
  public Button tvX;
  public boolean tvY;
  public int tvZ;
  public b twa;
  public View twb;
  public AnimationDrawable twc;
  public com.tencent.mm.bd.e twd;
  private boolean twe;
  private int twh;
  private int twi;
  public int twj;
  
  static
  {
    GMTrace.i(928652460032L, 6919);
    jsq = new int[] { R.g.bbK, R.g.bbL, R.g.bbM, R.g.bbN, R.g.bby, R.g.bbz, R.g.bbA, R.g.bbB, R.g.bbC, R.g.bbD, R.g.bbE, R.g.bbF, R.g.bbG, R.g.bbH };
    twf = new int[] { R.g.bbK, R.g.bbK, R.g.bbK, R.g.bbL, R.g.bbM, R.g.bbL, R.g.bbK, R.g.bbN, R.g.bbK, R.g.bbK };
    twg = new int[] { R.g.bbI, R.g.bbJ, R.g.bbJ, R.g.bbJ, R.g.bbI };
    GMTrace.o(928652460032L, 6919);
  }
  
  public VoiceSearchLayout(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(924625928192L, 6889);
    this.kJj = null;
    this.tvW = null;
    this.isStart = false;
    this.tvY = false;
    this.tvZ = 0;
    this.twe = false;
    this.eDj = 0;
    this.twh = 0;
    this.twi = 0;
    this.twj = 0;
    this.jsM = new aj(new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(1176015732736L, 8762);
        if (VoiceSearchLayout.a(VoiceSearchLayout.this) == null)
        {
          GMTrace.o(1176015732736L, 8762);
          return true;
        }
        if (VoiceSearchLayout.b(VoiceSearchLayout.this) < VoiceSearchLayout.bLw().length)
        {
          VoiceSearchLayout.a(VoiceSearchLayout.this, VoiceSearchLayout.bLw()[VoiceSearchLayout.c(VoiceSearchLayout.this)]);
          GMTrace.o(1176015732736L, 8762);
          return true;
        }
        com.tencent.mm.bd.e locale = VoiceSearchLayout.a(VoiceSearchLayout.this);
        w.d("MicroMsg.SceneVoiceAddr", "cAmplitude " + locale.hfa);
        int i = locale.hfa;
        locale.hfa = 0;
        if (i > com.tencent.mm.bd.e.ezm) {
          com.tencent.mm.bd.e.ezm = i;
        }
        w.d("getMaxAmplitude", " map: " + i + " max:" + com.tencent.mm.bd.e.ezm + " per:" + i * 100 / com.tencent.mm.bd.e.ezm);
        i = i * 100 / com.tencent.mm.bd.e.ezm;
        w.d("MicroMsg.VoiceSearchLayout", "addr vol:" + i);
        int k = VoiceSearchLayout.d(VoiceSearchLayout.this);
        if (VoiceSearchLayout.d(VoiceSearchLayout.this) == VoiceSearchLayout.e(VoiceSearchLayout.this))
        {
          if (i <= 10)
          {
            VoiceSearchLayout.f(VoiceSearchLayout.this);
            if (VoiceSearchLayout.g(VoiceSearchLayout.this) >= VoiceSearchLayout.bLx().length) {
              VoiceSearchLayout.h(VoiceSearchLayout.this);
            }
            VoiceSearchLayout.a(VoiceSearchLayout.this, VoiceSearchLayout.bLx()[VoiceSearchLayout.g(VoiceSearchLayout.this)]);
            GMTrace.o(1176015732736L, 8762);
            return true;
          }
          int j = i / 5;
          i = j;
          if (j >= VoiceSearchLayout.bLy().length) {
            i = VoiceSearchLayout.bLy().length - 1;
          }
          w.d("MicroMsg.VoiceSearchLayout", "addr mvol:" + i);
          VoiceSearchLayout.b(VoiceSearchLayout.this, i);
        }
        for (;;)
        {
          VoiceSearchLayout.a(VoiceSearchLayout.this, VoiceSearchLayout.bLy()[k]);
          GMTrace.o(1176015732736L, 8762);
          return true;
          if (VoiceSearchLayout.d(VoiceSearchLayout.this) > VoiceSearchLayout.e(VoiceSearchLayout.this)) {
            VoiceSearchLayout.i(VoiceSearchLayout.this);
          } else {
            VoiceSearchLayout.j(VoiceSearchLayout.this);
          }
        }
      }
    }, true);
    init(paramContext);
    GMTrace.o(924625928192L, 6889);
  }
  
  public VoiceSearchLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(924491710464L, 6888);
    this.kJj = null;
    this.tvW = null;
    this.isStart = false;
    this.tvY = false;
    this.tvZ = 0;
    this.twe = false;
    this.eDj = 0;
    this.twh = 0;
    this.twi = 0;
    this.twj = 0;
    this.jsM = new aj(new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(1176015732736L, 8762);
        if (VoiceSearchLayout.a(VoiceSearchLayout.this) == null)
        {
          GMTrace.o(1176015732736L, 8762);
          return true;
        }
        if (VoiceSearchLayout.b(VoiceSearchLayout.this) < VoiceSearchLayout.bLw().length)
        {
          VoiceSearchLayout.a(VoiceSearchLayout.this, VoiceSearchLayout.bLw()[VoiceSearchLayout.c(VoiceSearchLayout.this)]);
          GMTrace.o(1176015732736L, 8762);
          return true;
        }
        com.tencent.mm.bd.e locale = VoiceSearchLayout.a(VoiceSearchLayout.this);
        w.d("MicroMsg.SceneVoiceAddr", "cAmplitude " + locale.hfa);
        int i = locale.hfa;
        locale.hfa = 0;
        if (i > com.tencent.mm.bd.e.ezm) {
          com.tencent.mm.bd.e.ezm = i;
        }
        w.d("getMaxAmplitude", " map: " + i + " max:" + com.tencent.mm.bd.e.ezm + " per:" + i * 100 / com.tencent.mm.bd.e.ezm);
        i = i * 100 / com.tencent.mm.bd.e.ezm;
        w.d("MicroMsg.VoiceSearchLayout", "addr vol:" + i);
        int k = VoiceSearchLayout.d(VoiceSearchLayout.this);
        if (VoiceSearchLayout.d(VoiceSearchLayout.this) == VoiceSearchLayout.e(VoiceSearchLayout.this))
        {
          if (i <= 10)
          {
            VoiceSearchLayout.f(VoiceSearchLayout.this);
            if (VoiceSearchLayout.g(VoiceSearchLayout.this) >= VoiceSearchLayout.bLx().length) {
              VoiceSearchLayout.h(VoiceSearchLayout.this);
            }
            VoiceSearchLayout.a(VoiceSearchLayout.this, VoiceSearchLayout.bLx()[VoiceSearchLayout.g(VoiceSearchLayout.this)]);
            GMTrace.o(1176015732736L, 8762);
            return true;
          }
          int j = i / 5;
          i = j;
          if (j >= VoiceSearchLayout.bLy().length) {
            i = VoiceSearchLayout.bLy().length - 1;
          }
          w.d("MicroMsg.VoiceSearchLayout", "addr mvol:" + i);
          VoiceSearchLayout.b(VoiceSearchLayout.this, i);
        }
        for (;;)
        {
          VoiceSearchLayout.a(VoiceSearchLayout.this, VoiceSearchLayout.bLy()[k]);
          GMTrace.o(1176015732736L, 8762);
          return true;
          if (VoiceSearchLayout.d(VoiceSearchLayout.this) > VoiceSearchLayout.e(VoiceSearchLayout.this)) {
            VoiceSearchLayout.i(VoiceSearchLayout.this);
          } else {
            VoiceSearchLayout.j(VoiceSearchLayout.this);
          }
        }
      }
    }, true);
    init(paramContext);
    GMTrace.o(924491710464L, 6888);
  }
  
  @TargetApi(11)
  public VoiceSearchLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(924357492736L, 6887);
    this.kJj = null;
    this.tvW = null;
    this.isStart = false;
    this.tvY = false;
    this.tvZ = 0;
    this.twe = false;
    this.eDj = 0;
    this.twh = 0;
    this.twi = 0;
    this.twj = 0;
    this.jsM = new aj(new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(1176015732736L, 8762);
        if (VoiceSearchLayout.a(VoiceSearchLayout.this) == null)
        {
          GMTrace.o(1176015732736L, 8762);
          return true;
        }
        if (VoiceSearchLayout.b(VoiceSearchLayout.this) < VoiceSearchLayout.bLw().length)
        {
          VoiceSearchLayout.a(VoiceSearchLayout.this, VoiceSearchLayout.bLw()[VoiceSearchLayout.c(VoiceSearchLayout.this)]);
          GMTrace.o(1176015732736L, 8762);
          return true;
        }
        com.tencent.mm.bd.e locale = VoiceSearchLayout.a(VoiceSearchLayout.this);
        w.d("MicroMsg.SceneVoiceAddr", "cAmplitude " + locale.hfa);
        int i = locale.hfa;
        locale.hfa = 0;
        if (i > com.tencent.mm.bd.e.ezm) {
          com.tencent.mm.bd.e.ezm = i;
        }
        w.d("getMaxAmplitude", " map: " + i + " max:" + com.tencent.mm.bd.e.ezm + " per:" + i * 100 / com.tencent.mm.bd.e.ezm);
        i = i * 100 / com.tencent.mm.bd.e.ezm;
        w.d("MicroMsg.VoiceSearchLayout", "addr vol:" + i);
        int k = VoiceSearchLayout.d(VoiceSearchLayout.this);
        if (VoiceSearchLayout.d(VoiceSearchLayout.this) == VoiceSearchLayout.e(VoiceSearchLayout.this))
        {
          if (i <= 10)
          {
            VoiceSearchLayout.f(VoiceSearchLayout.this);
            if (VoiceSearchLayout.g(VoiceSearchLayout.this) >= VoiceSearchLayout.bLx().length) {
              VoiceSearchLayout.h(VoiceSearchLayout.this);
            }
            VoiceSearchLayout.a(VoiceSearchLayout.this, VoiceSearchLayout.bLx()[VoiceSearchLayout.g(VoiceSearchLayout.this)]);
            GMTrace.o(1176015732736L, 8762);
            return true;
          }
          int j = i / 5;
          i = j;
          if (j >= VoiceSearchLayout.bLy().length) {
            i = VoiceSearchLayout.bLy().length - 1;
          }
          w.d("MicroMsg.VoiceSearchLayout", "addr mvol:" + i);
          VoiceSearchLayout.b(VoiceSearchLayout.this, i);
        }
        for (;;)
        {
          VoiceSearchLayout.a(VoiceSearchLayout.this, VoiceSearchLayout.bLy()[k]);
          GMTrace.o(1176015732736L, 8762);
          return true;
          if (VoiceSearchLayout.d(VoiceSearchLayout.this) > VoiceSearchLayout.e(VoiceSearchLayout.this)) {
            VoiceSearchLayout.i(VoiceSearchLayout.this);
          } else {
            VoiceSearchLayout.j(VoiceSearchLayout.this);
          }
        }
      }
    }, true);
    init(paramContext);
    GMTrace.o(924357492736L, 6887);
  }
  
  private void init(Context paramContext)
  {
    GMTrace.i(924760145920L, 6890);
    this.kJj = inflate(paramContext, R.i.clV, this);
    this.tvX = ((Button)this.kJj.findViewById(R.h.clX));
    this.twb = this.kJj.findViewById(R.h.clU);
    kd(false);
    reset();
    GMTrace.o(924760145920L, 6890);
  }
  
  private void kd(boolean paramBoolean)
  {
    GMTrace.i(925431234560L, 6895);
    if (paramBoolean)
    {
      this.tvX.setBackgroundResource(R.g.bbu);
      this.twc = ((AnimationDrawable)this.tvX.getBackground());
      if (this.twc != null)
      {
        this.twc.start();
        GMTrace.o(925431234560L, 6895);
      }
    }
    else
    {
      this.tvX.setBackgroundResource(R.g.bbx);
    }
    GMTrace.o(925431234560L, 6895);
  }
  
  private static void sp()
  {
    GMTrace.i(925968105472L, 6899);
    w.d("MicroMsg.VoiceSearchLayout", "resumeMusic");
    at.AS().sp();
    GMTrace.o(925968105472L, 6899);
  }
  
  public final void a(boolean paramBoolean, i parami)
  {
    GMTrace.i(925833887744L, 6898);
    if (paramBoolean)
    {
      w.d("MicroMsg.VoiceSearchLayout", "pauseMusic");
      at.AS().so();
      parami = new com.tencent.mm.compatible.b.i();
      if (!paramBoolean) {
        break label146;
      }
    }
    for (;;)
    {
      try
      {
        parami.setDataSource(getContext(), Uri.parse("android.resource://" + getContext().getPackageName() + "/" + R.k.cNS));
        parami.setAudioStreamType(5);
        parami.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
        {
          public final void onCompletion(MediaPlayer paramAnonymousMediaPlayer)
          {
            GMTrace.i(1164473008128L, 8676);
            paramAnonymousMediaPlayer.release();
            GMTrace.o(1164473008128L, 8676);
          }
        });
        parami.setOnErrorListener(new MediaPlayer.OnErrorListener()
        {
          public final boolean onError(MediaPlayer paramAnonymousMediaPlayer, int paramAnonymousInt1, int paramAnonymousInt2)
          {
            GMTrace.i(1198832746496L, 8932);
            GMTrace.o(1198832746496L, 8932);
            return false;
          }
        });
        parami.prepare();
        parami.setLooping(false);
        parami.start();
        GMTrace.o(925833887744L, 6898);
        return;
      }
      catch (Exception parami)
      {
        label146:
        w.printErrStackTrace("MicroMsg.VoiceSearchLayout", parami, "", new Object[0]);
        GMTrace.o(925833887744L, 6898);
      }
      sp();
      break;
      parami.setDataSource(getContext(), Uri.parse("android.resource://" + getContext().getPackageName() + "/" + R.k.cNu));
    }
  }
  
  public final void bLj()
  {
    GMTrace.i(925162799104L, 6893);
    w.d("MicroMsg.VoiceSearchLayout", "doCancel " + this.isStart);
    if (this.isStart)
    {
      this.isStart = false;
      if (this.tvW != null) {
        this.tvW.bLA();
      }
    }
    reset();
    if (getVisibility() == 0)
    {
      setVisibility(8);
      if (this.twa != null) {
        this.twa.ke(false);
      }
    }
    sp();
    if (this.twd != null) {
      this.twd.cancel();
    }
    if (this.jsM != null) {
      this.jsM.stopTimer();
    }
    GMTrace.o(925162799104L, 6893);
  }
  
  public final void bLv()
  {
    GMTrace.i(925028581376L, 6892);
    w.d("MicroMsg.VoiceSearchLayout", "checkStop " + this.isStart);
    if (this.isStart)
    {
      bLj();
      this.isStart = false;
    }
    GMTrace.o(925028581376L, 6892);
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    GMTrace.i(924894363648L, 6891);
    if (!this.tvY) {
      bLv();
    }
    GMTrace.o(924894363648L, 6891);
    return true;
  }
  
  public final void reset()
  {
    GMTrace.i(925297016832L, 6894);
    kd(false);
    this.isStart = false;
    this.tvY = false;
    this.tvX.setBackgroundResource(R.g.bbx);
    this.twb.setBackgroundDrawable(getResources().getDrawable(R.g.bbw));
    GMTrace.o(925297016832L, 6894);
  }
  
  public void setVisibility(int paramInt)
  {
    GMTrace.i(925565452288L, 6896);
    Object localObject;
    if ((super.getVisibility() != paramInt) && (!this.twe))
    {
      if (paramInt != 8) {
        break label86;
      }
      localObject = AnimationUtils.loadAnimation(getContext(), R.a.aLt);
      startAnimation((Animation)localObject);
      super.setVisibility(paramInt);
      if (this.twa != null)
      {
        localObject = this.twa;
        if (paramInt != 0) {
          break label100;
        }
      }
    }
    label86:
    label100:
    for (boolean bool = true;; bool = false)
    {
      ((b)localObject).ke(bool);
      GMTrace.o(925565452288L, 6896);
      return;
      localObject = AnimationUtils.loadAnimation(getContext(), R.a.aLs);
      break;
    }
  }
  
  public final void ze(int paramInt)
  {
    GMTrace.i(925699670016L, 6897);
    LinearLayout.LayoutParams localLayoutParams = (LinearLayout.LayoutParams)this.twb.getLayoutParams();
    localLayoutParams.topMargin = paramInt;
    this.twb.setLayoutParams(localLayoutParams);
    GMTrace.o(925699670016L, 6897);
  }
  
  public static abstract interface a
  {
    public abstract void a(boolean paramBoolean, String[] paramArrayOfString, long paramLong);
    
    public abstract void bLA();
    
    public abstract void bLz();
  }
  
  public static abstract interface b
  {
    public abstract void ke(boolean paramBoolean);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\ui\VoiceSearchLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */