package com.tencent.mm.kiss.widget.textview;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.util.AttributeSet;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public class PLTextView
  extends StaticTextView
{
  private static long gaY;
  private static int gaZ;
  private static long gba;
  private static long gbb;
  private static int gbc;
  private static long gbd;
  private static long gbe;
  private static int gbf;
  private static long gbg;
  private static boolean gbh;
  
  static
  {
    GMTrace.i(435804962816L, 3247);
    gaY = 0L;
    gaZ = 0;
    gba = -2147483648L;
    gbb = 0L;
    gbc = 0;
    gbd = -2147483648L;
    gbe = 0L;
    gbf = 0;
    gbg = -2147483648L;
    gbh = false;
    GMTrace.o(435804962816L, 3247);
  }
  
  public PLTextView(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(434597003264L, 3238);
    GMTrace.o(434597003264L, 3238);
  }
  
  public PLTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(434731220992L, 3239);
    GMTrace.o(434731220992L, 3239);
  }
  
  public PLTextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(434865438720L, 3240);
    GMTrace.o(434865438720L, 3240);
  }
  
  public void o(CharSequence paramCharSequence)
  {
    GMTrace.i(435402309632L, 3244);
    super.setText(paramCharSequence, false);
    GMTrace.o(435402309632L, 3244);
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    GMTrace.i(435670745088L, 3246);
    super.onConfigurationChanged(paramConfiguration);
    if (xU() != null) {
      xU().gby = false;
    }
    GMTrace.o(435670745088L, 3246);
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    GMTrace.i(435268091904L, 3243);
    long l = 0L;
    if (gbh) {
      l = System.currentTimeMillis();
    }
    super.onDraw(paramCanvas);
    if (gbh)
    {
      l = System.currentTimeMillis() - l;
      gbe += l;
      gbf += 1;
      if (l > gbg) {
        gbg = l;
      }
    }
    GMTrace.o(435268091904L, 3243);
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    GMTrace.i(435133874176L, 3242);
    long l = 0L;
    if (gbh) {
      l = System.currentTimeMillis();
    }
    super.onMeasure(paramInt1, paramInt2);
    if (gbh)
    {
      l = System.currentTimeMillis() - l;
      gbb += l;
      gbc += 1;
      if (l > gbd) {
        gbd = l;
      }
    }
    GMTrace.o(435133874176L, 3242);
  }
  
  public void p(CharSequence paramCharSequence)
  {
    GMTrace.i(435536527360L, 3245);
    GMTrace.o(435536527360L, 3245);
  }
  
  public final void setText(CharSequence paramCharSequence)
  {
    GMTrace.i(434999656448L, 3241);
    if (bg.L(paramCharSequence))
    {
      if (h.DEBUG) {
        w.d("MicroMsg.PLTextView", "set null text");
      }
      GMTrace.o(434999656448L, 3241);
      return;
    }
    long l1 = 0L;
    long l2 = 0L;
    if (h.DEBUG) {
      l1 = System.currentTimeMillis();
    }
    if ((xU() != null) && (xU().gby)) {
      c.gaW.a(xQ(), xU());
    }
    f localf = c.gaW.a(xQ(), paramCharSequence);
    boolean bool;
    if (localf != null)
    {
      bool = true;
      p(paramCharSequence);
      b(localf);
    }
    for (;;)
    {
      if (h.DEBUG)
      {
        l2 = System.currentTimeMillis();
        w.d("MicroMsg.PLTextView", "setText used %fms, hitCache: %b, hashCode: %d, text: %s hitCache %s", new Object[] { Double.valueOf((l2 - l1) / 1000000.0D), Boolean.valueOf(bool), Integer.valueOf(hashCode()), paramCharSequence, Boolean.valueOf(bool) });
      }
      if (gbh)
      {
        l1 = l2 - l1;
        gaY += l1;
        gaZ += 1;
        if (l1 > gba) {
          gba = l1;
        }
      }
      GMTrace.o(434999656448L, 3241);
      return;
      bool = false;
      o(paramCharSequence);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\kiss\widget\textview\PLTextView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */