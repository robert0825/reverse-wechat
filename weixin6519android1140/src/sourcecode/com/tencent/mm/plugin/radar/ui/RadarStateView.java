package com.tencent.mm.plugin.radar.ui;

import android.content.Context;
import android.os.Message;
import android.util.AttributeSet;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.a;
import com.tencent.mm.R.k;
import com.tencent.mm.br.a;
import com.tencent.mm.plugin.radar.a.c.d;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.w;

public class RadarStateView
  extends RelativeLayout
{
  public c.d nZZ;
  boolean oaV;
  private Animation oaW;
  private Animation oaX;
  boolean obc;
  ae obd;
  private ImageView obe;
  
  public RadarStateView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(8917962719232L, 66444);
    this.nZZ = c.d.nZu;
    this.oaV = false;
    this.obc = true;
    this.obd = new ae()
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(8902796115968L, 66331);
        RadarStateView.a(RadarStateView.this);
        RadarStateView.this.aZV();
        GMTrace.o(8902796115968L, 66331);
      }
    };
    this.oaW = null;
    this.oaX = null;
    this.obe = null;
    GMTrace.o(8917962719232L, 66444);
  }
  
  public RadarStateView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(8918096936960L, 66445);
    this.nZZ = c.d.nZu;
    this.oaV = false;
    this.obc = true;
    this.obd = new ae()
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(8902796115968L, 66331);
        RadarStateView.a(RadarStateView.this);
        RadarStateView.this.aZV();
        GMTrace.o(8902796115968L, 66331);
      }
    };
    this.oaW = null;
    this.oaX = null;
    this.obe = null;
    GMTrace.o(8918096936960L, 66445);
  }
  
  final void aZU()
  {
    GMTrace.i(8918231154688L, 66446);
    w.d("MicroMsg.RadarStateView", " state : " + this.nZZ);
    if (!this.obc)
    {
      setVisibility(8);
      GMTrace.o(8918231154688L, 66446);
      return;
    }
    switch (4.oaH[this.nZZ.ordinal()])
    {
    }
    for (;;)
    {
      GMTrace.o(8918231154688L, 66446);
      return;
      setVisibility(8);
      GMTrace.o(8918231154688L, 66446);
      return;
      setBackgroundResource(R.k.cOo);
      this.obe.setImageResource(R.k.cOs);
      setVisibility(0);
      GMTrace.o(8918231154688L, 66446);
      return;
      setBackgroundResource(R.k.cOp);
      this.obe.setImageResource(R.k.cOr);
      setVisibility(0);
      GMTrace.o(8918231154688L, 66446);
      return;
      setBackgroundResource(R.k.cOp);
      this.obe.setImageResource(R.k.cOq);
      setVisibility(0);
    }
  }
  
  public final void aZV()
  {
    GMTrace.i(8918499590144L, 66448);
    if (!this.obc)
    {
      GMTrace.o(8918499590144L, 66448);
      return;
    }
    init();
    aZU();
    this.oaV = true;
    startAnimation(this.oaW);
    GMTrace.o(8918499590144L, 66448);
  }
  
  public final void aZW()
  {
    GMTrace.i(8918633807872L, 66449);
    if (!this.obc)
    {
      GMTrace.o(8918633807872L, 66449);
      return;
    }
    init();
    aZU();
    startAnimation(this.oaX);
    GMTrace.o(8918633807872L, 66449);
  }
  
  final void init()
  {
    GMTrace.i(8918365372416L, 66447);
    if (this.obe == null)
    {
      this.obe = new ImageView(getContext());
      RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(-2, -2);
      localLayoutParams.addRule(11);
      localLayoutParams.addRule(15);
      localLayoutParams.setMargins(0, 0, a.fromDPToPix(getContext(), 5), a.fromDPToPix(getContext(), 2));
      this.obe.setLayoutParams(localLayoutParams);
      addView(this.obe);
    }
    if (this.oaW == null)
    {
      this.oaW = AnimationUtils.loadAnimation(getContext(), R.a.aLM);
      this.oaW.setAnimationListener(new Animation.AnimationListener()
      {
        public final void onAnimationEnd(Animation paramAnonymousAnimation)
        {
          GMTrace.i(8902393462784L, 66328);
          GMTrace.o(8902393462784L, 66328);
        }
        
        public final void onAnimationRepeat(Animation paramAnonymousAnimation)
        {
          GMTrace.i(8902527680512L, 66329);
          GMTrace.o(8902527680512L, 66329);
        }
        
        public final void onAnimationStart(Animation paramAnonymousAnimation)
        {
          GMTrace.i(8902259245056L, 66327);
          GMTrace.o(8902259245056L, 66327);
        }
      });
    }
    if (this.oaX == null)
    {
      this.oaX = AnimationUtils.loadAnimation(getContext(), R.a.aLL);
      this.oaX.setAnimationListener(new Animation.AnimationListener()
      {
        public final void onAnimationEnd(Animation paramAnonymousAnimation)
        {
          GMTrace.i(8904406728704L, 66343);
          RadarStateView.b(RadarStateView.this);
          RadarStateView.this.setVisibility(8);
          GMTrace.o(8904406728704L, 66343);
        }
        
        public final void onAnimationRepeat(Animation paramAnonymousAnimation)
        {
          GMTrace.i(8904540946432L, 66344);
          GMTrace.o(8904540946432L, 66344);
        }
        
        public final void onAnimationStart(Animation paramAnonymousAnimation)
        {
          GMTrace.i(8904272510976L, 66342);
          GMTrace.o(8904272510976L, 66342);
        }
      });
    }
    GMTrace.o(8918365372416L, 66447);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\radar\ui\RadarStateView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */