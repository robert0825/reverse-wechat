package com.tencent.mm.ui;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Looper;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.loader.stub.a;
import com.tencent.mm.loader.stub.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.chatting.en;

public class SplashWelcomeView
  extends FrameLayout
  implements en
{
  private Bitmap bitmap;
  private boolean hasDrawed;
  private en vOB;
  private volatile boolean vOC;
  private volatile boolean vOD;
  private boolean vOE;
  private ImageView vOF;
  private int vOG;
  
  public SplashWelcomeView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(17920348389376L, 133517);
    fc(paramContext);
    GMTrace.o(17920348389376L, 133517);
  }
  
  public SplashWelcomeView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(17920482607104L, 133518);
    fc(paramContext);
    GMTrace.o(17920482607104L, 133518);
  }
  
  private void bYl()
  {
    for (;;)
    {
      try
      {
        GMTrace.i(17920751042560L, 133520);
        if (this.vOC) {
          break label96;
        }
        this.vOC = true;
        Bitmap localBitmap = this.bitmap;
        if (localBitmap != null)
        {
          try
          {
            af.t(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(17934709686272L, 133624);
                w.d("SplashWelcomeView", "set top imageView");
                final ImageView localImageView = new ImageView(SplashWelcomeView.this.getContext());
                localImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                localImageView.setImageBitmap(SplashWelcomeView.d(SplashWelcomeView.this));
                localImageView.setAlpha(0.0F);
                SplashWelcomeView.this.addView(localImageView, new FrameLayout.LayoutParams(-1, -1));
                ValueAnimator localValueAnimator = ValueAnimator.ofFloat(new float[] { 0.0F, 1.0F }).setDuration(1000L);
                localValueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener()
                {
                  public final void onAnimationUpdate(ValueAnimator paramAnonymous2ValueAnimator)
                  {
                    GMTrace.i(17887465046016L, 133272);
                    float f = ((Float)paramAnonymous2ValueAnimator.getAnimatedValue()).floatValue();
                    localImageView.setAlpha(f);
                    GMTrace.o(17887465046016L, 133272);
                  }
                });
                localValueAnimator.start();
                w.i("SplashWelcomeView", "start play animation");
                new aj(Looper.getMainLooper(), new aj.a()
                {
                  public final boolean pM()
                  {
                    GMTrace.i(17887733481472L, 133274);
                    w.i("SplashWelcomeView", "stop show new launch image");
                    GMTrace.o(17887733481472L, 133274);
                    return true;
                  }
                }, false).z(1750L, 0L);
                GMTrace.o(17934709686272L, 133624);
              }
            });
            GMTrace.o(17920751042560L, 133520);
          }
          catch (Exception localException)
          {
            w.printErrStackTrace("SplashWelcomeView", localException, "%s", new Object[] { localException.getMessage() });
            GMTrace.o(17920751042560L, 133520);
            continue;
          }
          return;
        }
      }
      finally {}
      w.i("SplashWelcomeView", "new launch bitmap is null");
      label96:
      GMTrace.o(17920751042560L, 133520);
    }
  }
  
  private void fc(Context paramContext)
  {
    GMTrace.i(17920616824832L, 133519);
    this.vOF = new SplashImageView(paramContext);
    this.vOF.setScaleType(ImageView.ScaleType.CENTER_CROP);
    ((SplashImageView)this.vOF).vOB = this;
    addView(this.vOF, new FrameLayout.LayoutParams(-1, -1));
    final String str;
    for (;;)
    {
      try
      {
        if (!ab.bPY())
        {
          w.i("SplashWelcomeView", "not main process, only load default splash bitmap.");
          GMTrace.o(17920616824832L, 133519);
          return;
        }
        paramContext = ab.getContext().getSharedPreferences("system_config_prefs", 0);
        long l1 = paramContext.getLong("new_launch_image_begin_time", 0L);
        long l2 = paramContext.getLong("new_launch_image_end_time", 0L);
        long l3 = System.currentTimeMillis() / 1000L;
        w.i("SplashWelcomeView", "beginTime:%s,endTime:%s,currentTime:%s", new Object[] { Long.valueOf(l1), Long.valueOf(l2), Long.valueOf(l3) });
        str = a.ghv + "splashWelcomeImg";
        if ((l3 <= l1) || (l3 >= l2)) {
          break label403;
        }
        this.vOG = paramContext.getInt("launch_fail_times", 0);
        int i = paramContext.getInt("launch_last_status", 0);
        if (i == 1)
        {
          w.i("SplashWelcomeView", "last launch status is 'start'.");
          this.vOG += 1;
          paramContext.edit().putInt("launch_fail_times", this.vOG).commit();
          paramContext.edit().putInt("launch_last_status", 1).apply();
          if (this.vOG >= 3)
          {
            w.i("SplashWelcomeView", "launch exceed max failed times, %d", new Object[] { Integer.valueOf(this.vOG) });
            i = 0;
            if (i != 0) {
              break;
            }
            GMTrace.o(17920616824832L, 133519);
          }
        }
        else
        {
          if (i != 2) {
            continue;
          }
          w.i("SplashWelcomeView", "last launch status is 'end'.");
          continue;
        }
        i = 1;
      }
      catch (Exception paramContext)
      {
        w.printErrStackTrace("SplashWelcomeView", paramContext, "%s", new Object[] { paramContext.getMessage() });
        GMTrace.o(17920616824832L, 133519);
        return;
      }
    }
    com.tencent.mm.sdk.f.e.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(17879277764608L, 133211);
        if (com.tencent.mm.a.e.aZ(str))
        {
          try
          {
            byte[] arrayOfByte = com.tencent.mm.a.e.c(str, 0, com.tencent.mm.a.e.aY(str));
            if ((arrayOfByte != null) && (arrayOfByte.length > 0))
            {
              SplashWelcomeView.a(SplashWelcomeView.this, BitmapFactory.decodeByteArray(arrayOfByte, 0, arrayOfByte.length));
              w.i("SplashWelcomeView", "ready to play animation, hasDrawed %s", new Object[] { Boolean.valueOf(SplashWelcomeView.a(SplashWelcomeView.this)) });
              SplashWelcomeView.b(SplashWelcomeView.this);
            }
            if (SplashWelcomeView.a(SplashWelcomeView.this))
            {
              SplashWelcomeView.c(SplashWelcomeView.this);
              GMTrace.o(17879277764608L, 133211);
              return;
            }
          }
          catch (Exception localException)
          {
            w.printErrStackTrace("SplashWelcomeView", localException, "decode new welcome image error: %s", new Object[] { localException.getMessage() });
            if (SplashWelcomeView.a(SplashWelcomeView.this))
            {
              SplashWelcomeView.c(SplashWelcomeView.this);
              GMTrace.o(17879277764608L, 133211);
              return;
            }
          }
          finally
          {
            if (SplashWelcomeView.a(SplashWelcomeView.this)) {
              SplashWelcomeView.c(SplashWelcomeView.this);
            }
          }
          GMTrace.o(17879277764608L, 133211);
          return;
        }
        w.i("SplashWelcomeView", "cannot find %s", new Object[] { str });
        GMTrace.o(17879277764608L, 133211);
      }
    }, "readWelcomeBg");
    this.vOE = true;
    GMTrace.o(17920616824832L, 133519);
    return;
    label403:
    w.i("SplashWelcomeView", "change launch image activity is finished!");
    b.deleteFile(str);
    GMTrace.o(17920616824832L, 133519);
  }
  
  public final void aDr()
  {
    GMTrace.i(17921019478016L, 133522);
    w.i("SplashWelcomeView", "hasDrawed:%s", new Object[] { Boolean.valueOf(this.hasDrawed) });
    if (!this.hasDrawed)
    {
      this.hasDrawed = true;
      if ((this.vOD) && (!this.vOC)) {
        bYl();
      }
      if (this.vOB != null) {
        this.vOB.aDr();
      }
    }
    GMTrace.o(17921019478016L, 133522);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\SplashWelcomeView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */