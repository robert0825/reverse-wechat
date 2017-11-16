package com.tencent.mm.pluginsdk.ui;

import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnLongClickListener;
import android.view.View.OnTouchListener;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.ad.n;
import com.tencent.mm.plugin.report.kvdata.VoiceInputBehavior;
import com.tencent.mm.plugin.report.kvdata.log_13905;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.at;

@TargetApi(16)
public class VoiceInputLayoutImpl
  extends VoiceInputLayout
{
  private View.OnTouchListener nft;
  private View tvE;
  private m tvF;
  private boolean tvG;
  private long tvH;
  private View.OnLongClickListener tvI;
  
  public VoiceInputLayoutImpl(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(930665725952L, 6934);
    this.tvG = false;
    this.tvI = new View.OnLongClickListener()
    {
      public final boolean onLongClick(View paramAnonymousView)
      {
        GMTrace.i(924223275008L, 6886);
        w.d("MicroMsg.VoiceInputLayoutImp", "btn onLongClickListener currentState %s", new Object[] { Integer.valueOf(VoiceInputLayoutImpl.this.tvc) });
        VoiceInputLayoutImpl.a(VoiceInputLayoutImpl.this, true);
        paramAnonymousView = VoiceInputLayoutImpl.a(VoiceInputLayoutImpl.this);
        w.d("MicroMsg.VoiceInputDrawable", "longClickState %s", new Object[] { Integer.valueOf(paramAnonymousView.tvc) });
        paramAnonymousView.tvc = 7;
        paramAnonymousView.iKQ.cancel();
        paramAnonymousView.tuT = 0.0F;
        paramAnonymousView.invalidateSelf();
        GMTrace.o(924223275008L, 6886);
        return true;
      }
    };
    this.nft = new View.OnTouchListener()
    {
      public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
      {
        GMTrace.i(929323548672L, 6924);
        switch (paramAnonymousMotionEvent.getAction())
        {
        }
        for (;;)
        {
          GMTrace.o(929323548672L, 6924);
          return false;
          VoiceInputLayoutImpl.a(VoiceInputLayoutImpl.this, false);
          VoiceInputLayoutImpl.a(VoiceInputLayoutImpl.this, bg.Pw());
          w.d("MicroMsg.VoiceInputLayoutImp", "btn onTouch ACTION_DOWN currentState %s longClickStartTime %s", new Object[] { Integer.valueOf(VoiceInputLayoutImpl.this.tvc), Long.valueOf(VoiceInputLayoutImpl.b(VoiceInputLayoutImpl.this)) });
          paramAnonymousView = VoiceInputLayoutImpl.a(VoiceInputLayoutImpl.this);
          w.d("MicroMsg.VoiceInputDrawable", "readyPressState %s", new Object[] { Integer.valueOf(paramAnonymousView.tvc) });
          paramAnonymousView.tvc = 6;
          paramAnonymousView.iKQ.cancel();
          paramAnonymousView.tuT = 0.0F;
          paramAnonymousView.invalidateSelf();
          VoiceInputLayoutImpl.this.H(false, false);
          continue;
          w.d("MicroMsg.VoiceInputLayoutImp", "btn onTouch ACTION_UP currentState %s longClickDown %s", new Object[] { Integer.valueOf(VoiceInputLayoutImpl.this.tvc), Boolean.valueOf(VoiceInputLayoutImpl.c(VoiceInputLayoutImpl.this)) });
          if (VoiceInputLayoutImpl.c(VoiceInputLayoutImpl.this))
          {
            VoiceInputLayoutImpl.this.H(true, false);
            VoiceInputLayoutImpl.a(VoiceInputLayoutImpl.this, false);
            VoiceInputLayoutImpl.a(VoiceInputLayoutImpl.this, 0L);
          }
          else
          {
            VoiceInputLayoutImpl.this.H(false, true);
          }
        }
      }
    };
    init(paramContext);
    GMTrace.o(930665725952L, 6934);
  }
  
  public VoiceInputLayoutImpl(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(930531508224L, 6933);
    this.tvG = false;
    this.tvI = new View.OnLongClickListener()
    {
      public final boolean onLongClick(View paramAnonymousView)
      {
        GMTrace.i(924223275008L, 6886);
        w.d("MicroMsg.VoiceInputLayoutImp", "btn onLongClickListener currentState %s", new Object[] { Integer.valueOf(VoiceInputLayoutImpl.this.tvc) });
        VoiceInputLayoutImpl.a(VoiceInputLayoutImpl.this, true);
        paramAnonymousView = VoiceInputLayoutImpl.a(VoiceInputLayoutImpl.this);
        w.d("MicroMsg.VoiceInputDrawable", "longClickState %s", new Object[] { Integer.valueOf(paramAnonymousView.tvc) });
        paramAnonymousView.tvc = 7;
        paramAnonymousView.iKQ.cancel();
        paramAnonymousView.tuT = 0.0F;
        paramAnonymousView.invalidateSelf();
        GMTrace.o(924223275008L, 6886);
        return true;
      }
    };
    this.nft = new View.OnTouchListener()
    {
      public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
      {
        GMTrace.i(929323548672L, 6924);
        switch (paramAnonymousMotionEvent.getAction())
        {
        }
        for (;;)
        {
          GMTrace.o(929323548672L, 6924);
          return false;
          VoiceInputLayoutImpl.a(VoiceInputLayoutImpl.this, false);
          VoiceInputLayoutImpl.a(VoiceInputLayoutImpl.this, bg.Pw());
          w.d("MicroMsg.VoiceInputLayoutImp", "btn onTouch ACTION_DOWN currentState %s longClickStartTime %s", new Object[] { Integer.valueOf(VoiceInputLayoutImpl.this.tvc), Long.valueOf(VoiceInputLayoutImpl.b(VoiceInputLayoutImpl.this)) });
          paramAnonymousView = VoiceInputLayoutImpl.a(VoiceInputLayoutImpl.this);
          w.d("MicroMsg.VoiceInputDrawable", "readyPressState %s", new Object[] { Integer.valueOf(paramAnonymousView.tvc) });
          paramAnonymousView.tvc = 6;
          paramAnonymousView.iKQ.cancel();
          paramAnonymousView.tuT = 0.0F;
          paramAnonymousView.invalidateSelf();
          VoiceInputLayoutImpl.this.H(false, false);
          continue;
          w.d("MicroMsg.VoiceInputLayoutImp", "btn onTouch ACTION_UP currentState %s longClickDown %s", new Object[] { Integer.valueOf(VoiceInputLayoutImpl.this.tvc), Boolean.valueOf(VoiceInputLayoutImpl.c(VoiceInputLayoutImpl.this)) });
          if (VoiceInputLayoutImpl.c(VoiceInputLayoutImpl.this))
          {
            VoiceInputLayoutImpl.this.H(true, false);
            VoiceInputLayoutImpl.a(VoiceInputLayoutImpl.this, false);
            VoiceInputLayoutImpl.a(VoiceInputLayoutImpl.this, 0L);
          }
          else
          {
            VoiceInputLayoutImpl.this.H(false, true);
          }
        }
      }
    };
    init(paramContext);
    GMTrace.o(930531508224L, 6933);
  }
  
  private void U(int paramInt, boolean paramBoolean)
  {
    GMTrace.i(932007903232L, 6944);
    log_13905 locallog_13905 = new log_13905();
    VoiceInputBehavior localVoiceInputBehavior = new VoiceInputBehavior();
    if (paramBoolean) {
      if (this.tvy)
      {
        localVoiceInputBehavior.fullScreenVoiceLongClick = paramInt;
        if ((paramInt != 4) && (this.tvG) && (this.tvH != 0L)) {
          localVoiceInputBehavior.fullScreenVoiceLongClickTime = bg.aI(this.tvH);
        }
      }
    }
    for (;;)
    {
      locallog_13905.viOp_ = localVoiceInputBehavior;
      g.ork.b(13905, locallog_13905);
      w.i("MicroMsg.VoiceInputLayoutImp", "report cancel = %s send = %s click = %s longClick = %s longClickTime = %s textClick = %s textChangeCount = %s textChangeTime = %s textChangeReturn = %s voiceInputTime = %s fail = %s clear = %s smileIconClick = %s voiceIconClick = %s fullScreenVoiceLongClick = %s fullScreenVoiceLongClickTime = %s", new Object[] { Integer.valueOf(localVoiceInputBehavior.cancel), Integer.valueOf(localVoiceInputBehavior.send), Integer.valueOf(localVoiceInputBehavior.click), Integer.valueOf(localVoiceInputBehavior.longClick), Long.valueOf(localVoiceInputBehavior.longClickTime), Integer.valueOf(localVoiceInputBehavior.textClick), Integer.valueOf(localVoiceInputBehavior.textChangeCount), Long.valueOf(localVoiceInputBehavior.textChangeTime), Integer.valueOf(localVoiceInputBehavior.textChangeReturn), Long.valueOf(localVoiceInputBehavior.voiceInputTime), Integer.valueOf(localVoiceInputBehavior.fail), Integer.valueOf(localVoiceInputBehavior.clear), Integer.valueOf(localVoiceInputBehavior.smileIconClick), Integer.valueOf(localVoiceInputBehavior.voiceIconClick), Integer.valueOf(localVoiceInputBehavior.fullScreenVoiceLongClick), Long.valueOf(localVoiceInputBehavior.fullScreenVoiceLongClickTime) });
      GMTrace.o(932007903232L, 6944);
      return;
      localVoiceInputBehavior.longClick = paramInt;
      if ((paramInt != 4) && (this.tvG) && (this.tvH != 0L))
      {
        localVoiceInputBehavior.longClickTime = bg.aI(this.tvH);
        continue;
        localVoiceInputBehavior.click = paramInt;
      }
    }
  }
  
  private void bLt()
  {
    GMTrace.i(931068379136L, 6937);
    runOnUiThread(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(1166083620864L, 8688);
        m localm = VoiceInputLayoutImpl.a(VoiceInputLayoutImpl.this);
        w.d("MicroMsg.VoiceInputDrawable", "disableState %s", new Object[] { Integer.valueOf(localm.tvc) });
        localm.tvc = 5;
        localm.iKQ.cancel();
        localm.tuT = 0.0F;
        localm.invalidateSelf();
        GMTrace.o(1166083620864L, 8688);
      }
    });
    bLl();
    GMTrace.o(931068379136L, 6937);
  }
  
  private static boolean bLu()
  {
    GMTrace.i(931202596864L, 6938);
    int i = at.wS().DN();
    if ((i == 4) || (i == 6))
    {
      GMTrace.o(931202596864L, 6938);
      return true;
    }
    GMTrace.o(931202596864L, 6938);
    return false;
  }
  
  private void init(Context paramContext)
  {
    GMTrace.i(930799943680L, 6935);
    this.tvE = inflate(paramContext, R.i.cHs, this).findViewById(R.h.clX);
    this.tvE.setLayerType(1, null);
    this.tvF = new m(paramContext);
    this.tvE.setBackground(this.tvF);
    this.tvE.setEnabled(true);
    this.tvE.setOnTouchListener(this.nft);
    this.tvE.setOnLongClickListener(this.tvI);
    reset(true);
    if (isInEditMode())
    {
      GMTrace.o(930799943680L, 6935);
      return;
    }
    if (!bLu()) {
      bLt();
    }
    GMTrace.o(930799943680L, 6935);
  }
  
  private static void runOnUiThread(Runnable paramRunnable)
  {
    GMTrace.i(931873685504L, 6943);
    if (Thread.currentThread() != Looper.getMainLooper().getThread())
    {
      af.t(paramRunnable);
      GMTrace.o(931873685504L, 6943);
      return;
    }
    paramRunnable.run();
    GMTrace.o(931873685504L, 6943);
  }
  
  public final void H(boolean paramBoolean1, boolean paramBoolean2)
  {
    GMTrace.i(930934161408L, 6936);
    w.d("MicroMsg.VoiceInputLayoutImp", "directStart currentState = %s longUp = %s clickUp = %s", new Object[] { Integer.valueOf(this.tvc), Boolean.valueOf(paramBoolean1), Boolean.valueOf(paramBoolean2) });
    if (this.tvc == 1)
    {
      if ((!paramBoolean1) && (!paramBoolean2))
      {
        if (!bLu())
        {
          bLt();
          GMTrace.o(930934161408L, 6936);
          return;
        }
        bLi();
        GMTrace.o(930934161408L, 6936);
        return;
      }
      if ((paramBoolean1) && (!paramBoolean2))
      {
        U(4, this.tvG);
        U(this.tvc, this.tvG);
        this.tvF.bLd();
        GMTrace.o(930934161408L, 6936);
      }
    }
    else
    {
      if (this.tvc == 2)
      {
        if (!paramBoolean2)
        {
          if (paramBoolean1) {
            U(4, this.tvG);
          }
          U(this.tvc, this.tvG);
          be();
          GMTrace.o(930934161408L, 6936);
          return;
        }
        this.tvF.bLd();
        bLj();
        if (this.tvB != null) {
          this.tvB.bLn();
        }
        U(5, this.tvG);
        GMTrace.o(930934161408L, 6936);
        return;
      }
      if ((!paramBoolean1) && (!paramBoolean2))
      {
        U(this.tvc, this.tvG);
        bLj();
        GMTrace.o(930934161408L, 6936);
        return;
      }
      if ((paramBoolean1) && (!paramBoolean2))
      {
        U(4, this.tvG);
        U(this.tvc, this.tvG);
        this.tvF.bLd();
      }
    }
    GMTrace.o(930934161408L, 6936);
  }
  
  protected final void ce(boolean paramBoolean)
  {
    GMTrace.i(931471032320L, 6940);
    if (!paramBoolean) {
      U(17, false);
    }
    runOnUiThread(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(1161520218112L, 8654);
        m localm = VoiceInputLayoutImpl.a(VoiceInputLayoutImpl.this);
        w.d("MicroMsg.VoiceInputDrawable", "recognizingState %s", new Object[] { Integer.valueOf(localm.tvc) });
        localm.tvc = 4;
        localm.iKQ.cancel();
        localm.tuT = 0.0F;
        localm.iKQ.setInterpolator(new AccelerateDecelerateInterpolator());
        localm.iKQ.setDuration(1000L);
        localm.iKQ.setRepeatCount(-1);
        localm.iKQ.start();
        GMTrace.o(1161520218112L, 8654);
      }
    });
    GMTrace.o(931471032320L, 6940);
  }
  
  protected final void kc(boolean paramBoolean)
  {
    GMTrace.i(931336814592L, 6939);
    runOnUiThread(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(1223797243904L, 9118);
        m localm = VoiceInputLayoutImpl.a(VoiceInputLayoutImpl.this);
        boolean bool = this.tvK;
        w.d("MicroMsg.VoiceInputDrawable", "recordingStartState() called with: maxAmplitudeRate = [%s] fromLongCkick = %s", new Object[] { Integer.valueOf(0), Boolean.valueOf(bool) });
        if (!bool) {
          localm.tvc = 3;
        }
        localm.tuY = true;
        localm.invalidateSelf();
        GMTrace.o(1223797243904L, 9118);
      }
    });
    GMTrace.o(931336814592L, 6939);
  }
  
  protected final void onReset()
  {
    GMTrace.i(931605250048L, 6941);
    runOnUiThread(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(928920895488L, 6921);
        VoiceInputLayoutImpl.a(VoiceInputLayoutImpl.this).bLd();
        GMTrace.o(928920895488L, 6921);
      }
    });
    GMTrace.o(931605250048L, 6941);
  }
  
  protected final void zc(final int paramInt)
  {
    GMTrace.i(931739467776L, 6942);
    runOnUiThread(new Runnable()
    {
      public final void run()
      {
        boolean bool = true;
        GMTrace.i(1172794507264L, 8738);
        m localm = VoiceInputLayoutImpl.a(VoiceInputLayoutImpl.this);
        int i = paramInt;
        w.d("MicroMsg.VoiceInputDrawable", "recordingState() called with: maxAmplitudeRate = [%s]", new Object[] { Integer.valueOf(i) });
        if (i < 28) {}
        for (;;)
        {
          localm.tuY = bool;
          localm.invalidateSelf();
          GMTrace.o(1172794507264L, 8738);
          return;
          bool = false;
        }
      }
    });
    GMTrace.o(931739467776L, 6942);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\pluginsdk\ui\VoiceInputLayoutImpl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */