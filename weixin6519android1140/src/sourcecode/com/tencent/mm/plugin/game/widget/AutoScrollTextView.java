package com.tencent.mm.plugin.game.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.a;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import java.util.ArrayList;

public class AutoScrollTextView
  extends LinearLayout
{
  private int kuY;
  private aj lUm;
  private ArrayList<String> lVX;
  private Animation lWe;
  private Animation lWf;
  private TextView meg;
  private TextView meh;
  
  public AutoScrollTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(12576603766784L, 93703);
    this.lVX = new ArrayList();
    this.kuY = 0;
    this.lUm = new aj(new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(12582509346816L, 93747);
        AutoScrollTextView.a(AutoScrollTextView.this);
        GMTrace.o(12582509346816L, 93747);
        return true;
      }
    }, true);
    this.meg = new TextView(paramContext, paramAttributeSet);
    this.meg.setVisibility(8);
    this.meh = new TextView(paramContext, paramAttributeSet);
    this.meh.setVisibility(8);
    addView(this.meg);
    addView(this.meh);
    setOrientation(1);
    setGravity(17);
    setPadding(0, 0, 0, 0);
    this.lWe = AnimationUtils.loadAnimation(paramContext, R.a.aLZ);
    this.lWf = AnimationUtils.loadAnimation(paramContext, R.a.aMd);
    GMTrace.o(12576603766784L, 93703);
  }
  
  protected void onDetachedFromWindow()
  {
    GMTrace.i(12576737984512L, 93704);
    super.onDetachedFromWindow();
    this.lUm.stopTimer();
    GMTrace.o(12576737984512L, 93704);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\game\widget\AutoScrollTextView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */