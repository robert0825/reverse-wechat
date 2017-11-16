package com.tencent.mm.plugin.mmsight.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewParent;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.mmsight.segment.RecyclerThumbSeekBar;
import com.tencent.mm.plugin.u.a.d;
import com.tencent.mm.plugin.u.a.e;
import com.tencent.mm.ui.v;

public class VideoSeekBarEditorView
  extends LinearLayout
{
  Button kWK;
  RecyclerThumbSeekBar njA;
  Button njB;
  private LinearLayout njC;
  
  public VideoSeekBarEditorView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(20168629551104L, 150268);
    init(paramContext);
    GMTrace.o(20168629551104L, 150268);
  }
  
  public VideoSeekBarEditorView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(20168763768832L, 150269);
    init(paramContext);
    GMTrace.o(20168763768832L, 150269);
  }
  
  private void init(Context paramContext)
  {
    GMTrace.i(20168897986560L, 150270);
    this.njC = ((LinearLayout)v.fb(paramContext).inflate(a.e.nlg, this, true));
    this.njA = ((RecyclerThumbSeekBar)findViewById(a.d.nkZ));
    this.kWK = ((Button)findViewById(a.d.nkE));
    this.njB = ((Button)findViewById(a.d.nkF));
    GMTrace.o(20168897986560L, 150270);
  }
  
  public final void aQH()
  {
    GMTrace.i(20169032204288L, 150271);
    this.njA.release();
    ViewParent localViewParent = this.njA.getParent();
    if ((localViewParent instanceof LinearLayout))
    {
      LinearLayout.LayoutParams localLayoutParams = (LinearLayout.LayoutParams)this.njA.getLayoutParams();
      ((LinearLayout)localViewParent).removeView(this.njA);
      this.njA = new RecyclerThumbSeekBar(getContext());
      ((LinearLayout)localViewParent).addView(this.njA, 0, localLayoutParams);
    }
    GMTrace.o(20169032204288L, 150271);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\mmsight\ui\VideoSeekBarEditorView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */