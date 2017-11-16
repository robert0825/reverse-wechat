package com.tencent.mm.pluginsdk.ui.emoji;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.m.a.c;
import com.tencent.mm.plugin.m.a.e;
import com.tencent.mm.plugin.m.a.f;

public class PopEmojiView
  extends LinearLayout
{
  private ViewGroup iwt;
  public MMEmojiView tCa;
  private ProgressBar tCb;
  
  public PopEmojiView(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(1193329819648L, 8891);
    init(paramContext);
    GMTrace.o(1193329819648L, 8891);
  }
  
  public PopEmojiView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(1193464037376L, 8892);
    init(paramContext);
    GMTrace.o(1193464037376L, 8892);
  }
  
  public PopEmojiView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(1193598255104L, 8893);
    init(paramContext);
    GMTrace.o(1193598255104L, 8893);
  }
  
  private void init(Context paramContext)
  {
    GMTrace.i(20129303756800L, 149975);
    this.iwt = ((ViewGroup)inflate(getContext(), a.f.kwq, null));
    this.tCa = ((MMEmojiView)this.iwt.findViewById(a.e.image));
    this.tCa.tBY = true;
    this.tCa.tBW = (paramContext.getResources().getDimensionPixelSize(a.c.kbm) - paramContext.getResources().getDimensionPixelSize(a.c.aQw) * 3);
    this.tCb = ((ProgressBar)this.iwt.findViewById(a.e.progress));
    addView(this.iwt, -1, -1);
    GMTrace.o(20129303756800L, 149975);
  }
  
  public final void zC(int paramInt)
  {
    GMTrace.i(1193866690560L, 8895);
    switch (1.tCc[(paramInt - 1)])
    {
    }
    for (;;)
    {
      GMTrace.o(1193866690560L, 8895);
      return;
      this.tCa.setVisibility(4);
      this.tCb.setVisibility(0);
      GMTrace.o(1193866690560L, 8895);
      return;
      this.tCa.setVisibility(0);
      this.tCb.setVisibility(8);
    }
  }
  
  public static enum a
  {
    static
    {
      GMTrace.i(1194537779200L, 8900);
      tCd = 1;
      tCe = 2;
      tCf = new int[] { tCd, tCe };
      GMTrace.o(1194537779200L, 8900);
    }
    
    public static int[] bMS()
    {
      GMTrace.i(1194403561472L, 8899);
      int[] arrayOfInt = (int[])tCf.clone();
      GMTrace.o(1194403561472L, 8899);
      return arrayOfInt;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\ui\emoji\PopEmojiView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */