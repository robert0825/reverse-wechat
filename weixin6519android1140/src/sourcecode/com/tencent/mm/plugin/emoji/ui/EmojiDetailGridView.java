package com.tencent.mm.plugin.emoji.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.view.SmileySubGrid;

public class EmojiDetailGridView
  extends SmileySubGrid
{
  String klt;
  EmojiDetailScrollView kpa;
  private volatile boolean kpb;
  
  public EmojiDetailGridView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(11396024631296L, 84907);
    this.kpb = true;
    GMTrace.o(11396024631296L, 84907);
  }
  
  protected final int asA()
  {
    GMTrace.i(11396427284480L, 84910);
    GMTrace.o(11396427284480L, 84910);
    return 200;
  }
  
  protected final void dQ(boolean paramBoolean)
  {
    GMTrace.i(11396293066752L, 84909);
    if (this.kpa != null) {
      this.kpa.kpc = paramBoolean;
    }
    GMTrace.o(11396293066752L, 84909);
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    GMTrace.i(11396158849024L, 84908);
    super.onMeasure(paramInt1, View.MeasureSpec.makeMeasureSpec(536870911, Integer.MIN_VALUE));
    GMTrace.o(11396158849024L, 84908);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\emoji\ui\EmojiDetailGridView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */