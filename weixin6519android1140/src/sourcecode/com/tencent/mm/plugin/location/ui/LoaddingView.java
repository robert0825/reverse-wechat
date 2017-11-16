package com.tencent.mm.plugin.location.ui;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.a;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.sdk.platformtools.bg;

public class LoaddingView
  extends LinearLayout
  implements c
{
  private TextView myG;
  private ProgressBar myH;
  private Animation myI;
  private View myJ;
  private boolean myK;
  private String myL;
  
  public LoaddingView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(9651059949568L, 71906);
    this.myK = false;
    this.myL = "";
    init(paramContext);
    GMTrace.o(9651059949568L, 71906);
  }
  
  @TargetApi(11)
  public LoaddingView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(9650925731840L, 71905);
    this.myK = false;
    this.myL = "";
    init(paramContext);
    GMTrace.o(9650925731840L, 71905);
  }
  
  private void init(Context paramContext)
  {
    GMTrace.i(9651194167296L, 71907);
    this.myI = AnimationUtils.loadAnimation(paramContext, R.a.aMg);
    paramContext = LayoutInflater.from(paramContext).inflate(R.i.cAR, this, true);
    this.myH = ((ProgressBar)paramContext.findViewById(R.h.bLc));
    this.myG = ((TextView)paramContext.findViewById(R.h.bLm));
    this.myJ = paramContext.findViewById(R.h.bKU);
    this.myG.setText("");
    this.myG.setVisibility(0);
    this.myH.setVisibility(0);
    GMTrace.o(9651194167296L, 71907);
  }
  
  public final String aKF()
  {
    GMTrace.i(9651462602752L, 71909);
    String str = this.myL;
    GMTrace.o(9651462602752L, 71909);
    return str;
  }
  
  public final void setText(String paramString)
  {
    GMTrace.i(9651328385024L, 71908);
    if ((this.myG == null) || (this.myH == null) || (this.myK))
    {
      GMTrace.o(9651328385024L, 71908);
      return;
    }
    if (!bg.nm(paramString))
    {
      this.myG.setText(paramString);
      this.myH.setVisibility(8);
      this.myG.setVisibility(0);
      GMTrace.o(9651328385024L, 71908);
      return;
    }
    this.myG.setText("");
    this.myG.setVisibility(0);
    this.myH.setVisibility(0);
    GMTrace.o(9651328385024L, 71908);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\location\ui\LoaddingView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */