package com.tencent.mm.plugin.voip.ui;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.l;
import com.tencent.mm.ac.b;
import com.tencent.mm.plugin.voip.video.CaptureView;
import com.tencent.mm.sdk.f.e;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.lang.ref.WeakReference;

public abstract class d
  extends Fragment
{
  protected static int mScreenHeight;
  protected static int mScreenWidth;
  protected static final int[] qLl;
  protected String fKP;
  protected ae iAX;
  protected int mStatus;
  protected boolean qHg;
  protected WeakReference<c> qKZ;
  protected long qLb;
  protected RelativeLayout qLm;
  protected ImageView qLn;
  protected ImageView qLo;
  protected int qLp;
  protected d qLq;
  protected c qLr;
  public a qLs;
  public b qLt;
  
  static
  {
    GMTrace.i(5331128156160L, 39720);
    qLl = new int[] { -1, R.l.eiR, R.l.ejb, R.l.eja };
    GMTrace.o(5331128156160L, 39720);
  }
  
  public d()
  {
    GMTrace.i(5327906930688L, 39696);
    this.qLb = -1L;
    this.qLp = 4096;
    this.mStatus = -1;
    this.qLr = new c();
    GMTrace.o(5327906930688L, 39696);
  }
  
  protected static void E(View paramView, int paramInt)
  {
    GMTrace.i(5330859720704L, 39718);
    if (paramView == null)
    {
      GMTrace.o(5330859720704L, 39718);
      return;
    }
    RelativeLayout.LayoutParams localLayoutParams = (RelativeLayout.LayoutParams)paramView.getLayoutParams();
    localLayoutParams.topMargin += paramInt;
    paramView.setLayoutParams(localLayoutParams);
    GMTrace.o(5330859720704L, 39718);
  }
  
  protected static String ax(long paramLong)
  {
    GMTrace.i(5330725502976L, 39717);
    String str = String.format("%02d:%02d", new Object[] { Long.valueOf(paramLong / 60L), Long.valueOf(paramLong % 60L) });
    GMTrace.o(5330725502976L, 39717);
    return str;
  }
  
  protected abstract void JP(String paramString);
  
  public abstract void a(int paramInt1, int paramInt2, int[] paramArrayOfInt);
  
  public final void a(c paramc)
  {
    GMTrace.i(5330054414336L, 39712);
    this.qKZ = new WeakReference(paramc);
    GMTrace.o(5330054414336L, 39712);
  }
  
  public final void a(d paramd)
  {
    GMTrace.i(5330188632064L, 39713);
    this.qLq = paramd;
    GMTrace.o(5330188632064L, 39713);
  }
  
  public abstract void a(byte[] paramArrayOfByte, long paramLong, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6);
  
  protected final void b(TextView paramTextView, String paramString)
  {
    GMTrace.i(5330322849792L, 39714);
    if ((paramTextView == null) || (bg.nm(paramString)))
    {
      w.e("MicroMsg.VoipBaseFragment", "TextView is null or text is null");
      GMTrace.o(5330322849792L, 39714);
      return;
    }
    paramTextView.setText(paramString);
    int i = getResources().getDisplayMetrics().widthPixels;
    int j = getResources().getDisplayMetrics().heightPixels;
    paramTextView.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(j, Integer.MIN_VALUE));
    paramTextView.setWidth(paramTextView.getMeasuredWidth());
    GMTrace.o(5330322849792L, 39714);
  }
  
  public abstract void b(CaptureView paramCaptureView);
  
  public abstract void buu();
  
  protected abstract void bvw();
  
  protected abstract void bvx();
  
  protected final void bvy()
  {
    GMTrace.i(5330591285248L, 39716);
    if ((this.fKP == null) || (this.qLn.getVisibility() == 0))
    {
      GMTrace.o(5330591285248L, 39716);
      return;
    }
    this.qLn.setVisibility(0);
    this.qLs = new a();
    e.post(this.qLs, "VoipBaseFragment_blurbitmap");
    GMTrace.o(5330591285248L, 39716);
  }
  
  protected final void bvz()
  {
    GMTrace.i(20667651063808L, 153986);
    this.qLo.setVisibility(0);
    this.qLt = new b();
    e.post(this.qLt, "VoipBaseFragment_blurtransparentbitmap");
    GMTrace.o(20667651063808L, 153986);
  }
  
  protected abstract void ca(String paramString, int paramInt);
  
  public void dq(int paramInt1, int paramInt2)
  {
    GMTrace.i(5328309583872L, 39699);
    this.qLp = paramInt1;
    this.mStatus = paramInt2;
    GMTrace.o(5328309583872L, 39699);
  }
  
  public final void eh(long paramLong)
  {
    GMTrace.i(5328443801600L, 39700);
    this.qLb = paramLong;
    GMTrace.o(5328443801600L, 39700);
  }
  
  public final void onAttach(Activity paramActivity)
  {
    GMTrace.i(5328175366144L, 39698);
    super.onAttach(paramActivity);
    if (Build.VERSION.SDK_INT < 23)
    {
      if (mScreenWidth == 0)
      {
        paramActivity = paramActivity.getWindowManager().getDefaultDisplay();
        mScreenWidth = paramActivity.getWidth();
        mScreenHeight = paramActivity.getHeight();
        GMTrace.o(5328175366144L, 39698);
      }
    }
    else
    {
      paramActivity = paramActivity.getWindowManager().getDefaultDisplay();
      DisplayMetrics localDisplayMetrics = new DisplayMetrics();
      paramActivity.getRealMetrics(localDisplayMetrics);
      mScreenWidth = localDisplayMetrics.widthPixels;
      mScreenHeight = localDisplayMetrics.heightPixels;
    }
    GMTrace.o(5328175366144L, 39698);
  }
  
  public final void onCreate(Bundle paramBundle)
  {
    GMTrace.i(5328041148416L, 39697);
    super.onCreate(paramBundle);
    paramBundle = this.ol;
    this.fKP = paramBundle.getString("key_username");
    this.qHg = paramBundle.getBoolean("key_isoutcall");
    if (-1 == this.mStatus) {
      this.mStatus = paramBundle.getInt("key_status");
    }
    this.iAX = new ae();
    GMTrace.o(5328041148416L, 39697);
  }
  
  public void onDetach()
  {
    GMTrace.i(5328846454784L, 39703);
    if (this.iAX != null) {
      this.iAX.removeCallbacksAndMessages(null);
    }
    this.qLq = null;
    super.onDetach();
    GMTrace.o(5328846454784L, 39703);
  }
  
  public void onStop()
  {
    GMTrace.i(5330457067520L, 39715);
    super.onStop();
    GMTrace.o(5330457067520L, 39715);
  }
  
  public abstract void setMute(boolean paramBoolean);
  
  public void uninit()
  {
    GMTrace.i(5328712237056L, 39702);
    w.d("MicroMsg.VoipBaseFragment", "uninit");
    this.qLr.bvA();
    c localc = this.qLr;
    w.d("MicroMsg.DynamicTextWrap", "uninit");
    localc.bvA();
    localc.htb = null;
    if (this.qLs != null)
    {
      e.remove(this.qLs);
      this.qLs = null;
    }
    if (this.qLt != null)
    {
      e.remove(this.qLt);
      this.qLt = null;
    }
    GMTrace.o(5328712237056L, 39702);
  }
  
  public abstract void wu(int paramInt);
  
  public final class a
    implements Runnable
  {
    public a()
    {
      GMTrace.i(5352737210368L, 39881);
      GMTrace.o(5352737210368L, 39881);
    }
    
    public final void run()
    {
      GMTrace.i(5352871428096L, 39882);
      w.i("MicroMsg.VoipBaseFragment", "try load blur bitmap,timestamp: " + System.currentTimeMillis());
      Bitmap localBitmap2 = b.a(d.this.fKP, false, -1);
      if ((localBitmap2 == null) || (d.this.qLm == null))
      {
        GMTrace.o(5352871428096L, 39882);
        return;
      }
      int i = 0;
      while (((d.this.qLm.getHeight() == 0) || (d.this.qLm.getWidth() == 0)) && (i < 10)) {
        try
        {
          Thread.sleep(300L);
          i += 1;
        }
        catch (InterruptedException localInterruptedException)
        {
          w.e("MicroMsg.VoipBaseFragment", "wait voip initialize interrupted");
          GMTrace.o(5352871428096L, 39882);
          return;
        }
      }
      final Bitmap localBitmap1 = localBitmap2;
      if (localBitmap2.getHeight() <= localBitmap2.getWidth())
      {
        localBitmap1 = localBitmap2;
        if (localBitmap2.getHeight() / 5 > 0)
        {
          localBitmap1 = localBitmap2;
          if ((int)(localBitmap2.getHeight() * 0.6D) > 0) {
            localBitmap1 = Bitmap.createBitmap(localBitmap2, localBitmap2.getWidth() / 5, localBitmap2.getHeight() / 5, (int)(localBitmap2.getHeight() * 0.6D), (int)(localBitmap2.getHeight() * 0.6D), null, false);
          }
        }
      }
      float f = 1.0F * d.this.qLm.getHeight() / d.this.qLm.getWidth();
      i = (int)(localBitmap1.getHeight() / f);
      localBitmap1 = com.tencent.mm.sdk.platformtools.d.a(localBitmap1, localBitmap1.getHeight(), i, true, false);
      if (localBitmap1 == null)
      {
        w.e("MicroMsg.VoipBaseFragment", "extract Thumb Nail for blur background failed");
        GMTrace.o(5352871428096L, 39882);
        return;
      }
      try
      {
        localBitmap1 = com.tencent.mm.sdk.platformtools.d.c(localBitmap1, 20);
        w.i("MicroMsg.VoipBaseFragment", "blur ok, timestamp: " + System.currentTimeMillis());
        d.this.iAX.post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(5371796127744L, 40023);
            if (d.this.qLn != null)
            {
              d.this.qLn.setBackgroundDrawable(new BitmapDrawable(localBitmap1));
              d.this.qLn.getBackground().setAlpha(128);
            }
            d.this.qLs = null;
            GMTrace.o(5371796127744L, 40023);
          }
        });
        GMTrace.o(5352871428096L, 39882);
        return;
      }
      catch (Exception localException)
      {
        w.e("MicroMsg.VoipBaseFragment", "fastblur failed: " + localException.getMessage());
        GMTrace.o(5352871428096L, 39882);
      }
    }
  }
  
  public final class b
    implements Runnable
  {
    public b()
    {
      GMTrace.i(20667382628352L, 153984);
      GMTrace.o(20667382628352L, 153984);
    }
    
    public final void run()
    {
      GMTrace.i(20667516846080L, 153985);
      w.i("MicroMsg.VoipBaseFragment", "try create blur bitmap,timestamp: " + System.currentTimeMillis());
      final Bitmap localBitmap = com.tencent.mm.sdk.platformtools.d.Ag(R.g.bbV);
      w.i("MicroMsg.VoipBaseFragment", "blur transparent ok, timestamp: " + System.currentTimeMillis());
      d.this.iAX.post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(20667919499264L, 153988);
          if (d.this.qLo != null)
          {
            d.this.qLo.setBackgroundDrawable(new BitmapDrawable(localBitmap));
            d.this.qLo.getBackground().setAlpha(230);
            d.this.qLo.getBackground().setFilterBitmap(true);
          }
          d.this.qLt = null;
          GMTrace.o(20667919499264L, 153988);
        }
      });
      GMTrace.o(20667516846080L, 153985);
    }
  }
  
  protected static final class c
  {
    aj htb;
    public TextView jU;
    public int qLA;
    public int[] qLy;
    private int qLz;
    
    protected c()
    {
      GMTrace.i(5365353676800L, 39975);
      this.htb = new aj(new aj.a()
      {
        public final boolean pM()
        {
          GMTrace.i(5334215163904L, 39743);
          int i = d.c.this.qLy[(d.c.this.qLA % d.c.this.qLy.length)];
          if (d.c.this.jU != null)
          {
            if (-1 != i) {
              break label84;
            }
            d.c.this.jU.setText(null);
          }
          for (;;)
          {
            d.c localc = d.c.this;
            localc.qLA += 1;
            GMTrace.o(5334215163904L, 39743);
            return true;
            label84:
            d.c.this.jU.setText(i);
          }
        }
      }, true);
      GMTrace.o(5365353676800L, 39975);
    }
    
    public final void a(TextView paramTextView, int[] paramArrayOfInt)
    {
      GMTrace.i(5365487894528L, 39976);
      if ((paramArrayOfInt == null) || (paramTextView == null))
      {
        w.e("MicroMsg.DynamicTextWrap", "textList or tv is null");
        GMTrace.o(5365487894528L, 39976);
        return;
      }
      bvA();
      this.qLA = 0;
      this.qLy = paramArrayOfInt;
      this.jU = paramTextView;
      this.qLz = 500;
      if (this.htb != null)
      {
        paramArrayOfInt = this.htb;
        long l = this.qLz;
        paramArrayOfInt.z(l, l);
      }
      w.j("MicroMsg.DynamicTextWrap", "start textview:" + paramTextView, new Object[0]);
      GMTrace.o(5365487894528L, 39976);
    }
    
    public final void bvA()
    {
      GMTrace.i(5365622112256L, 39977);
      if (this.htb != null) {
        this.htb.stopTimer();
      }
      w.j("MicroMsg.DynamicTextWrap", "stop textview: " + this.jU, new Object[0]);
      this.jU = null;
      GMTrace.o(5365622112256L, 39977);
    }
  }
  
  public static abstract interface d
  {
    public abstract void x(boolean paramBoolean1, boolean paramBoolean2);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\voip\ui\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */