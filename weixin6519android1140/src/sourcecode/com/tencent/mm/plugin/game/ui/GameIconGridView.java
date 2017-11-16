package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.widget.GridView;
import com.tencent.gmtrace.GMTrace;

public class GameIconGridView
  extends GridView
{
  public GameIconGridView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(12675656450048L, 94441);
    GMTrace.o(12675656450048L, 94441);
  }
  
  public GameIconGridView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(12675522232320L, 94440);
    GMTrace.o(12675522232320L, 94440);
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    GMTrace.i(12675790667776L, 94442);
    super.onMeasure(paramInt1, View.MeasureSpec.makeMeasureSpec(536870911, Integer.MIN_VALUE));
    GMTrace.o(12675790667776L, 94442);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\game\ui\GameIconGridView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */