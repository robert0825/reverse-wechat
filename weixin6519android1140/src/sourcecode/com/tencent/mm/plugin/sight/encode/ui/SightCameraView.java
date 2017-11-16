package com.tencent.mm.plugin.sight.encode.ui;

import android.content.Context;
import android.content.res.Resources;
import android.hardware.Camera;
import android.hardware.Camera.Parameters;
import android.os.Looper;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.compatible.d.c;
import com.tencent.mm.compatible.d.p;
import com.tencent.mm.compatible.d.u;
import com.tencent.mm.plugin.sight.encode.a.a;
import com.tencent.mm.plugin.sight.encode.a.a.a;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.at;
import com.tencent.mm.y.d.a;

public abstract class SightCameraView
  extends FrameLayout
  implements d.a
{
  private com.tencent.mm.y.d imE;
  private Animation mqx;
  protected int nba;
  private long oOB;
  protected e oWd;
  protected a oWe;
  protected ImageView oWf;
  protected long oWg;
  protected int oWh;
  protected boolean oWi;
  protected boolean oWj;
  protected int oWk;
  private aj oWl;
  private int oWm;
  private Runnable oWn;
  private Runnable oWo;
  
  public SightCameraView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    GMTrace.i(9355512512512L, 69704);
    GMTrace.o(9355512512512L, 69704);
  }
  
  public SightCameraView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(9355378294784L, 69703);
    this.oWg = -1L;
    this.oWh = a.oWs;
    this.oWi = false;
    this.oWj = false;
    this.nba = 320;
    this.oWk = 6500;
    this.oOB = 0L;
    this.oWl = new aj(Looper.getMainLooper(), new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(9310549573632L, 69369);
        float f = (float)SightCameraView.this.oWe.bgZ() / SightCameraView.this.oWk;
        if ((Float.compare(f, 0.0F) <= 0) && (System.currentTimeMillis() - SightCameraView.a(SightCameraView.this) > 20000L))
        {
          w.e("MicroMsg.SightCameraView", "ERROR record duration, %dms !!!", new Object[] { Long.valueOf(20000L) });
          SightCameraView.this.axe();
          GMTrace.o(9310549573632L, 69369);
          return false;
        }
        if ((Float.compare(f, 1.0F) > 0) && (SightCameraView.this.oWe.bha() == a.a.oUL)) {
          if (!SightCameraView.this.oWe.bgY()) {
            SightCameraView.b(SightCameraView.this);
          }
        }
        for (;;)
        {
          GMTrace.o(9310549573632L, 69369);
          return true;
          SightCameraView.this.ao(f);
        }
      }
    }, true);
    this.oWm = -1;
    this.oWn = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(9322763386880L, 69460);
        GMTrace.o(9322763386880L, 69460);
      }
      
      public final String toString()
      {
        GMTrace.i(9322897604608L, 69461);
        String str = super.toString() + "|startRecord";
        GMTrace.o(9322897604608L, 69461);
        return str;
      }
    };
    this.oWo = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(9339809038336L, 69587);
        GMTrace.o(9339809038336L, 69587);
      }
      
      public final String toString()
      {
        GMTrace.i(9339943256064L, 69588);
        String str = super.toString() + "|cancelRecord";
        GMTrace.o(9339943256064L, 69588);
        return str;
      }
    };
    this.imE = new com.tencent.mm.y.d();
    if (com.tencent.mm.plugin.sight.base.d.bgh()) {
      inflate(getContext(), R.i.cGG, this);
    }
    for (;;)
    {
      this.oWi = false;
      this.oWj = false;
      this.oWd = new e();
      paramContext = this.oWd;
      w.i("MicroMsg.SightCamera", "init needRotate %s", new Object[] { Boolean.valueOf(false) });
      if (p.fQE.fRe)
      {
        paramContext.oWa.mZu = p.fQE.mVideoHeight;
        paramContext.oWa.mZv = p.fQE.mVideoWidth;
        paramContext.oWa.mZt = p.fQE.fRg;
      }
      paramContext.oWa.mZE = c.getNumberOfCameras();
      paramContext.oWa.eSp = 0;
      this.oWf = ((ImageView)findViewById(R.h.bUx));
      bhu();
      GMTrace.o(9355378294784L, 69703);
      return;
      inflate(getContext(), R.i.cGF, this);
    }
  }
  
  private void bhu()
  {
    GMTrace.i(18474533388288L, 137646);
    if (this.oWf.getVisibility() == 4)
    {
      GMTrace.o(18474533388288L, 137646);
      return;
    }
    if (this.mqx != null) {
      this.mqx.cancel();
    }
    this.oWf.setVisibility(4);
    GMTrace.o(18474533388288L, 137646);
  }
  
  public abstract void an(float paramFloat);
  
  public final void ao(float paramFloat)
  {
    GMTrace.i(9355915165696L, 69707);
    w.d("MicroMsg.SightCameraView", "update progress %f", new Object[] { Float.valueOf(paramFloat) });
    if (this.oWm < 0) {
      this.oWm = getResources().getDisplayMetrics().widthPixels;
    }
    if (paramFloat < 0.0F)
    {
      localLayoutParams = this.oWf.getLayoutParams();
      localLayoutParams.width = this.oWm;
      this.oWf.setLayoutParams(localLayoutParams);
      GMTrace.o(9355915165696L, 69707);
      return;
    }
    if (paramFloat > 1.0F)
    {
      i = this.oWm / 2;
      localLayoutParams = this.oWf.getLayoutParams();
      localLayoutParams.width = (this.oWm - (i - 1) * 2);
      this.oWf.setLayoutParams(localLayoutParams);
      GMTrace.o(9355915165696L, 69707);
      return;
    }
    int i = (int)(getResources().getDisplayMetrics().widthPixels * paramFloat / 2.0F);
    ViewGroup.LayoutParams localLayoutParams = this.oWf.getLayoutParams();
    localLayoutParams.width = (this.oWm - i * 2);
    this.oWf.setLayoutParams(localLayoutParams);
    GMTrace.o(9355915165696L, 69707);
  }
  
  protected abstract void as(String paramString, boolean paramBoolean);
  
  protected final void axe()
  {
    GMTrace.i(9356720472064L, 69713);
    w.w("MicroMsg.SightCameraView", "cancel record");
    if (this.oWe == null) {
      throw new IllegalStateException("The mSightMedia must be set!");
    }
    at.xB().bQi().removeCallbacks(this.oWn);
    at.xB().A(this.oWo);
    this.oWl.stopTimer();
    ao(0.0F);
    bhu();
    setKeepScreenOn(false);
    GMTrace.o(9356720472064L, 69713);
  }
  
  protected abstract void bhr();
  
  protected abstract int bhs();
  
  protected abstract int bht();
  
  protected final void bhv()
  {
    GMTrace.i(9358062649344L, 69723);
    this.imE.a(this);
    GMTrace.o(9358062649344L, 69723);
  }
  
  protected final void bhw()
  {
    GMTrace.i(9358196867072L, 69724);
    this.imE.bf(false);
    GMTrace.o(9358196867072L, 69724);
  }
  
  protected abstract void hz(boolean paramBoolean);
  
  public abstract boolean isPlaying();
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    boolean bool = false;
    GMTrace.i(9358599520256L, 69727);
    e locale;
    if ((paramMotionEvent.getAction() == 0) && (this.oWi) && (this.oWj))
    {
      w.i("MicroMsg.SightCameraView", "check double click %dms", new Object[] { Long.valueOf(SystemClock.elapsedRealtime() - this.oWg) });
      if (SystemClock.elapsedRealtime() - this.oWg >= 400L) {
        break label399;
      }
      this.oWd.oWc.removeMessages(4354);
      locale = this.oWd;
      if (locale.mXX) {
        break label143;
      }
      w.w("MicroMsg.SightCamera", "want to trigger zoom, but current status is not preview");
    }
    for (;;)
    {
      this.oWg = SystemClock.elapsedRealtime();
      paramMotionEvent.getX();
      paramMotionEvent.getY();
      com.tencent.mm.compatible.util.d.eu(14);
      GMTrace.o(9358599520256L, 69727);
      return true;
      try
      {
        label143:
        Camera.Parameters localParameters = locale.fPj.getParameters();
        if (localParameters == null) {
          continue;
        }
        w.i("MicroMsg.SightCamera", "trigger zoom, has zoomed %B, isSupported %B", new Object[] { Boolean.valueOf(locale.mXV), Boolean.valueOf(localParameters.isZoomSupported()) });
        if (!localParameters.isZoomSupported()) {
          continue;
        }
        locale.oWc.removeMessages(4353);
        if (locale.mXV)
        {
          locale.oWc.mYL = false;
          locale.oWc.mXV = false;
          locale.oWc.mYK = (e.a.c(localParameters) * -1);
          locale.oWc.sendMessage(locale.oWc.obtainMessage(4353, locale.fPj));
          if (!locale.mXV) {
            bool = true;
          }
          locale.mXV = bool;
        }
      }
      catch (Exception localException)
      {
        for (;;)
        {
          w.e("MicroMsg.SightCamera", "getParameters failed %s", new Object[] { localException.getMessage() });
          w.printErrStackTrace("MicroMsg.SightCamera", localException, "", new Object[0]);
          localObject = null;
          continue;
          locale.oWc.mYL = false;
          locale.oWc.mXV = true;
          locale.oWc.mYK = e.a.c((Camera.Parameters)localObject);
          locale.oWc.sendMessage(locale.oWc.obtainMessage(4353, locale.fPj));
        }
      }
      label399:
      Object localObject = this.oWd;
      float f1 = paramMotionEvent.getX();
      float f2 = paramMotionEvent.getY();
      int i = bhs();
      int j = bht();
      if (!com.tencent.mm.compatible.util.d.eu(14))
      {
        ((e)localObject).oWc.removeMessages(4354);
        ((e)localObject).oWc.mYN = f1;
        ((e)localObject).oWc.mps = f2;
        ((e)localObject).oWc.mYO = i;
        ((e)localObject).oWc.mYP = j;
        ((e)localObject).oWc.sendMessageDelayed(((e)localObject).oWc.obtainMessage(4354, ((e)localObject).fPj), 400L);
      }
    }
  }
  
  public final void uc(int paramInt)
  {
    GMTrace.i(9354975641600L, 69700);
    this.nba = paramInt;
    GMTrace.o(9354975641600L, 69700);
  }
  
  protected static enum a
  {
    static
    {
      GMTrace.i(9318871072768L, 69431);
      oWq = 1;
      oWr = 2;
      oWs = 3;
      oWt = new int[] { oWq, oWr, oWs };
      GMTrace.o(9318871072768L, 69431);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\sight\encode\ui\SightCameraView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */