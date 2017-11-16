package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.a;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import java.util.ArrayList;

public class GameDetailAutoScrollView
  extends LinearLayout
{
  int kuY;
  aj lUm;
  ArrayList<String> lVX;
  ViewGroup lVY;
  TextView lVZ;
  TextView lWa;
  ViewGroup lWb;
  private TextView lWc;
  private TextView lWd;
  private Animation lWe;
  private Animation lWf;
  
  public GameDetailAutoScrollView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(12727464493056L, 94827);
    this.lVX = new ArrayList();
    this.kuY = 0;
    this.lUm = new aj(new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(12732564766720L, 94865);
        GameDetailAutoScrollView.a(GameDetailAutoScrollView.this);
        GMTrace.o(12732564766720L, 94865);
        return true;
      }
    }, true);
    this.lVY = ((ViewGroup)LayoutInflater.from(paramContext).inflate(R.i.cyu, this, false));
    this.lVZ = ((TextView)this.lVY.findViewById(R.h.bCT));
    this.lWa = ((TextView)this.lVY.findViewById(R.h.bCU));
    addView(this.lVY);
    this.lVY.setVisibility(8);
    this.lWb = ((ViewGroup)LayoutInflater.from(paramContext).inflate(R.i.cyu, this, false));
    this.lWc = ((TextView)this.lWb.findViewById(R.h.bCT));
    this.lWd = ((TextView)this.lWb.findViewById(R.h.bCU));
    addView(this.lWb);
    this.lWb.setVisibility(8);
    this.lWe = AnimationUtils.loadAnimation(paramContext, R.a.aLZ);
    this.lWf = AnimationUtils.loadAnimation(paramContext, R.a.aMd);
    GMTrace.o(12727464493056L, 94827);
  }
  
  protected void onDetachedFromWindow()
  {
    GMTrace.i(12727598710784L, 94828);
    super.onDetachedFromWindow();
    this.lUm.stopTimer();
    GMTrace.o(12727598710784L, 94828);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\ui\GameDetailAutoScrollView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */