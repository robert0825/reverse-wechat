package com.tencent.mm.plugin.exdevice.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.a;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.sdk.platformtools.af;

public class ExdeviceRankListHeaderView
  extends RelativeLayout
{
  private TextView kKa;
  View.OnClickListener kKb;
  private Animation kKc;
  private Animation kKd;
  boolean kKe;
  private Context mContext;
  private Runnable mHideRunnable;
  
  public ExdeviceRankListHeaderView(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(11100477194240L, 82705);
    this.kKe = true;
    cm(paramContext);
    GMTrace.o(11100477194240L, 82705);
  }
  
  public ExdeviceRankListHeaderView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, -1);
    GMTrace.i(11100342976512L, 82704);
    GMTrace.o(11100342976512L, 82704);
  }
  
  public ExdeviceRankListHeaderView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(11100208758784L, 82703);
    this.kKe = true;
    cm(paramContext);
    GMTrace.o(11100208758784L, 82703);
  }
  
  private void cm(Context paramContext)
  {
    GMTrace.i(11100611411968L, 82706);
    this.mContext = paramContext;
    this.kKa = ((TextView)LayoutInflater.from(this.mContext).inflate(R.i.cwb, this, true).findViewById(R.h.blZ));
    this.kKa.setVisibility(4);
    this.kKc = AnimationUtils.loadAnimation(this.mContext, R.a.abc_fade_in);
    this.kKd = AnimationUtils.loadAnimation(this.mContext, R.a.abc_fade_out);
    this.mHideRunnable = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(11051756158976L, 82342);
        ExdeviceRankListHeaderView.e(ExdeviceRankListHeaderView.this).startAnimation(ExdeviceRankListHeaderView.d(ExdeviceRankListHeaderView.this));
        GMTrace.o(11051756158976L, 82342);
      }
    };
    this.kKc.setAnimationListener(new Animation.AnimationListener()
    {
      public final void onAnimationEnd(Animation paramAnonymousAnimation)
      {
        GMTrace.i(11084102631424L, 82583);
        ExdeviceRankListHeaderView.d(ExdeviceRankListHeaderView.this).reset();
        af.i(ExdeviceRankListHeaderView.f(ExdeviceRankListHeaderView.this), 4000L);
        GMTrace.o(11084102631424L, 82583);
      }
      
      public final void onAnimationRepeat(Animation paramAnonymousAnimation)
      {
        GMTrace.i(11083968413696L, 82582);
        GMTrace.o(11083968413696L, 82582);
      }
      
      public final void onAnimationStart(Animation paramAnonymousAnimation)
      {
        GMTrace.i(11083834195968L, 82581);
        ExdeviceRankListHeaderView.e(ExdeviceRankListHeaderView.this).setVisibility(0);
        GMTrace.o(11083834195968L, 82581);
      }
    });
    this.kKd.setAnimationListener(new Animation.AnimationListener()
    {
      public final void onAnimationEnd(Animation paramAnonymousAnimation)
      {
        GMTrace.i(11029073362944L, 82173);
        ExdeviceRankListHeaderView.e(ExdeviceRankListHeaderView.this).setVisibility(4);
        GMTrace.o(11029073362944L, 82173);
      }
      
      public final void onAnimationRepeat(Animation paramAnonymousAnimation)
      {
        GMTrace.i(11028939145216L, 82172);
        GMTrace.o(11028939145216L, 82172);
      }
      
      public final void onAnimationStart(Animation paramAnonymousAnimation)
      {
        GMTrace.i(11028804927488L, 82171);
        ExdeviceRankListHeaderView.e(ExdeviceRankListHeaderView.this).setVisibility(0);
        GMTrace.o(11028804927488L, 82171);
      }
    });
    this.kKc.setFillAfter(true);
    this.kKc.setFillEnabled(true);
    this.kKd.setFillAfter(true);
    this.kKd.setFillAfter(true);
    setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(11085444808704L, 82593);
        if (ExdeviceRankListHeaderView.a(ExdeviceRankListHeaderView.this)) {
          ExdeviceRankListHeaderView.b(ExdeviceRankListHeaderView.this);
        }
        if (ExdeviceRankListHeaderView.c(ExdeviceRankListHeaderView.this) != null) {
          ExdeviceRankListHeaderView.c(ExdeviceRankListHeaderView.this).onClick(ExdeviceRankListHeaderView.this);
        }
        GMTrace.o(11085444808704L, 82593);
      }
    });
    GMTrace.o(11100611411968L, 82706);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\exdevice\ui\ExdeviceRankListHeaderView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */