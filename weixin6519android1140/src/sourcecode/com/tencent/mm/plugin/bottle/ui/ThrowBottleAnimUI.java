package com.tencent.mm.plugin.bottle.ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Message;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationSet;
import android.widget.AbsoluteLayout.LayoutParams;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.br.a;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

@SuppressLint({"HandlerLeak"})
public class ThrowBottleAnimUI
  extends FrameLayout
{
  int Qo;
  int Qp;
  BottleBeachUI jqX;
  private SprayLayout jsb;
  private BottleImageView jsc;
  private TextView jsd;
  private AnimationSet jse;
  private int jsf;
  private int jsg;
  private int jsh;
  private int jsi;
  int jsj;
  a jsk;
  boolean jsl;
  private ae jsm;
  
  public ThrowBottleAnimUI(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(7640075730944L, 56923);
    this.jsm = new ae()
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(7628935659520L, 56840);
        super.handleMessage(paramAnonymousMessage);
        if ((ThrowBottleAnimUI.i(ThrowBottleAnimUI.this) == null) && (ThrowBottleAnimUI.a(ThrowBottleAnimUI.this) != null)) {
          ThrowBottleAnimUI.a(ThrowBottleAnimUI.this, (SprayLayout)ThrowBottleAnimUI.a(ThrowBottleAnimUI.this).findViewById(R.h.bia));
        }
        if (ThrowBottleAnimUI.i(ThrowBottleAnimUI.this) != null) {
          ThrowBottleAnimUI.i(ThrowBottleAnimUI.this).stop();
        }
        if (ThrowBottleAnimUI.m(ThrowBottleAnimUI.this) != null) {
          ThrowBottleAnimUI.m(ThrowBottleAnimUI.this).ahQ();
        }
        GMTrace.o(7628935659520L, 56840);
      }
    };
    this.jqX = ((BottleBeachUI)paramContext);
    MP();
    GMTrace.o(7640075730944L, 56923);
  }
  
  public ThrowBottleAnimUI(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(7640209948672L, 56924);
    this.jsm = new ae()
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(7628935659520L, 56840);
        super.handleMessage(paramAnonymousMessage);
        if ((ThrowBottleAnimUI.i(ThrowBottleAnimUI.this) == null) && (ThrowBottleAnimUI.a(ThrowBottleAnimUI.this) != null)) {
          ThrowBottleAnimUI.a(ThrowBottleAnimUI.this, (SprayLayout)ThrowBottleAnimUI.a(ThrowBottleAnimUI.this).findViewById(R.h.bia));
        }
        if (ThrowBottleAnimUI.i(ThrowBottleAnimUI.this) != null) {
          ThrowBottleAnimUI.i(ThrowBottleAnimUI.this).stop();
        }
        if (ThrowBottleAnimUI.m(ThrowBottleAnimUI.this) != null) {
          ThrowBottleAnimUI.m(ThrowBottleAnimUI.this).ahQ();
        }
        GMTrace.o(7628935659520L, 56840);
      }
    };
    this.jqX = ((BottleBeachUI)paramContext);
    MP();
    GMTrace.o(7640209948672L, 56924);
  }
  
  private void MP()
  {
    GMTrace.i(7640612601856L, 56927);
    inflate(this.jqX, R.i.cqv, this);
    this.jsc = ((BottleImageView)findViewById(R.h.bih));
    this.jsd = ((TextView)findViewById(R.h.bik));
    DisplayMetrics localDisplayMetrics = this.jqX.getResources().getDisplayMetrics();
    this.jsh = localDisplayMetrics.widthPixels;
    this.jsi = localDisplayMetrics.heightPixels;
    GMTrace.o(7640612601856L, 56927);
  }
  
  private int ahR()
  {
    GMTrace.i(7640746819584L, 56928);
    int i = Math.abs(getWidth());
    if (i <= 0)
    {
      i = this.jsh;
      GMTrace.o(7640746819584L, 56928);
      return i;
    }
    GMTrace.o(7640746819584L, 56928);
    return i;
  }
  
  private int ahS()
  {
    GMTrace.i(7640881037312L, 56929);
    int i = Math.abs(getHeight());
    if (i <= 0)
    {
      i = this.jsi;
      GMTrace.o(7640881037312L, 56929);
      return i;
    }
    GMTrace.o(7640881037312L, 56929);
    return i;
  }
  
  final void ahT()
  {
    GMTrace.i(7641015255040L, 56930);
    this.jsc.setImageDrawable(null);
    int i = this.jsc.getBackground().getIntrinsicWidth();
    int j = this.jsc.getBackground().getIntrinsicHeight();
    this.jsc.setVisibility(0);
    int k = BackwardSupportUtil.b.a(this.jqX, 40.0F);
    this.jsc.setLayoutParams(new AbsoluteLayout.LayoutParams(-2, -2, ahR() - (i + k), ahS() - (j + k)));
    GMTrace.o(7641015255040L, 56930);
  }
  
  final void ahU()
  {
    GMTrace.i(7641149472768L, 56931);
    int j = this.jsc.getBackground().getIntrinsicWidth();
    int k = this.jsc.getBackground().getIntrinsicHeight();
    this.jsc.setVisibility(0);
    int m = BackwardSupportUtil.b.a(this.jqX, 40.0F);
    Object localObject = this.jqX;
    int i;
    if (bg.bQO())
    {
      i = R.g.aUt;
      setBackgroundDrawable(a.b((Context)localObject, i));
      if (!this.jsl) {
        break label296;
      }
      this.jsc.setImageDrawable(a.b(this.jqX, R.g.aUB));
    }
    for (;;)
    {
      this.jsc.setLayoutParams(new AbsoluteLayout.LayoutParams(-2, -2, 0, 0));
      localObject = this.jsc;
      i = ahR();
      int n = this.jsf;
      int i1 = j / 2;
      int i2 = ahS();
      int i3 = this.jsg;
      int i4 = k / 2;
      Animation.AnimationListener local3 = new Animation.AnimationListener()
      {
        public final void onAnimationEnd(Animation paramAnonymousAnimation)
        {
          GMTrace.i(7624238039040L, 56805);
          ThrowBottleAnimUI.b(ThrowBottleAnimUI.this).setVisibility(8);
          if (ThrowBottleAnimUI.i(ThrowBottleAnimUI.this) == null) {
            ThrowBottleAnimUI.a(ThrowBottleAnimUI.this, (SprayLayout)ThrowBottleAnimUI.a(ThrowBottleAnimUI.this).findViewById(R.h.bia));
          }
          ThrowBottleAnimUI.i(ThrowBottleAnimUI.this).y(1, ThrowBottleAnimUI.j(ThrowBottleAnimUI.this), ThrowBottleAnimUI.k(ThrowBottleAnimUI.this));
          ThrowBottleAnimUI.l(ThrowBottleAnimUI.this).sendEmptyMessageDelayed(0, 2000L);
          GMTrace.o(7624238039040L, 56805);
        }
        
        public final void onAnimationRepeat(Animation paramAnonymousAnimation)
        {
          GMTrace.i(7624103821312L, 56804);
          GMTrace.o(7624103821312L, 56804);
        }
        
        public final void onAnimationStart(Animation paramAnonymousAnimation)
        {
          GMTrace.i(7623969603584L, 56803);
          GMTrace.o(7623969603584L, 56803);
        }
      };
      ((BottleImageView)localObject).Qo = (i - (j + m));
      ((BottleImageView)localObject).Qq = (n - i1);
      ((BottleImageView)localObject).Qp = (i2 - (m + k));
      ((BottleImageView)localObject).Qr = (i3 - i4);
      ((BottleImageView)localObject).jqp.setAnimationListener(local3);
      ((BottleImageView)localObject).jqp.setDuration(2000L);
      ((BottleImageView)localObject).jqp.setRepeatCount(0);
      ((BottleImageView)localObject).jqp.setStartOffset(500L);
      ((BottleImageView)localObject).jqp.setInterpolator(((BottleImageView)localObject).context, 17432582);
      ((BottleImageView)localObject).startAnimation(((BottleImageView)localObject).jqp);
      GMTrace.o(7641149472768L, 56931);
      return;
      i = R.g.aUu;
      break;
      label296:
      this.jsc.setImageDrawable(a.b(this.jqX, R.g.aUA));
    }
  }
  
  final void ahV()
  {
    GMTrace.i(7641283690496L, 56932);
    this.jsf = (ahR() / 2);
    this.jsg = (ahS() * 460 / 800);
    w.v("MicroMsg.ThrowBottleAnimView", "to (" + this.jsf + "," + this.jsg + ")  bottle (" + this.jsc.getDrawable().getIntrinsicWidth() + "," + this.jsc.getDrawable().getIntrinsicHeight() + ")");
    GMTrace.o(7641283690496L, 56932);
  }
  
  public boolean isInEditMode()
  {
    GMTrace.i(7640478384128L, 56926);
    GMTrace.o(7640478384128L, 56926);
    return false;
  }
  
  public final void release()
  {
    GMTrace.i(7640344166400L, 56925);
    this.jqX = null;
    this.jse = null;
    this.jsb = null;
    if (this.jsc != null)
    {
      BottleImageView localBottleImageView = this.jsc;
      localBottleImageView.context = null;
      localBottleImageView.jqp = null;
    }
    this.jsc = null;
    this.jsk = null;
    GMTrace.o(7640344166400L, 56925);
  }
  
  public static abstract interface a
  {
    public abstract void ahQ();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\bottle\ui\ThrowBottleAnimUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */