package com.tencent.mm.plugin.mall.ui;

import android.graphics.Point;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.d;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.ad;

public final class a
{
  private static int mRA;
  private static int mRw;
  private static int mRx;
  private static int mRy;
  private static int mRz;
  
  static
  {
    GMTrace.i(15053860372480L, 112160);
    mRw = 39;
    mRx = 40;
    mRy = 95;
    mRz = 0;
    mRA = 0;
    GMTrace.o(15053860372480L, 112160);
  }
  
  public static int aMZ()
  {
    GMTrace.i(15053457719296L, 112157);
    int i = mRz;
    GMTrace.o(15053457719296L, 112157);
    return i;
  }
  
  public static int aNa()
  {
    GMTrace.i(15053591937024L, 112158);
    int i = mRA;
    GMTrace.o(15053591937024L, 112158);
    return i;
  }
  
  public static int aNb()
  {
    GMTrace.i(15053726154752L, 112159);
    int i = com.tencent.mm.br.a.fromDPToPix(ab.getContext(), mRw);
    GMTrace.o(15053726154752L, 112159);
    return i;
  }
  
  public static void d(MMActivity paramMMActivity)
  {
    GMTrace.i(15053323501568L, 112156);
    int k = com.tencent.mm.br.a.fromDPToPix(paramMMActivity, mRw);
    int m = com.tencent.mm.br.a.fromDPToPix(paramMMActivity, mRx);
    int j = ad.ff(paramMMActivity).y;
    int i = j;
    if (ad.fe(paramMMActivity)) {
      i = j - ad.fd(paramMMActivity);
    }
    if (paramMMActivity.cN().cO() != null) {}
    for (j = paramMMActivity.cN().cO().getHeight();; j = 0)
    {
      int n = com.tencent.mm.br.a.fromDPToPix(paramMMActivity, mRy);
      mRz = Math.round((i - k * 2 - m - j) / 5.0F);
      w.i("MicroMsg.FunctionGridSizeCalculator", "calc GRID_HEIGHT_SIZE_PX: %s, minHeight: %s", new Object[] { Integer.valueOf(mRz), Integer.valueOf(n) });
      if (mRz < n) {
        mRz = n;
      }
      mRA = Math.round(mRz * 4 / 3.0F);
      w.i("MicroMsg.FunctionGridSizeCalculator", "calcGridSize, GRID_HEIGHT_SIZE_PX: %s, TOP_FUNC_LINE_GRID_SIZE_PX: %s", new Object[] { Integer.valueOf(mRz), Integer.valueOf(mRA) });
      GMTrace.o(15053323501568L, 112156);
      return;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\mall\ui\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */