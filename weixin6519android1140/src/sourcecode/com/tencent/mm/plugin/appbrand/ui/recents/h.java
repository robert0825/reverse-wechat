package com.tencent.mm.plugin.appbrand.ui.recents;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PointF;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.z;
import android.util.DisplayMetrics;
import com.tencent.gmtrace.GMTrace;

final class h
  extends z
{
  private final LinearLayoutManager iFU;
  private final int iFV;
  private final int iFW;
  
  h(Context paramContext, LinearLayoutManager paramLinearLayoutManager)
  {
    super(paramContext);
    GMTrace.i(16363959615488L, 121921);
    this.iFU = paramLinearLayoutManager;
    this.iFV = 3000;
    this.iFW = Math.round(paramContext.getResources().getDisplayMetrics().heightPixels * 0.75F);
    GMTrace.o(16363959615488L, 121921);
  }
  
  public final PointF aW(int paramInt)
  {
    GMTrace.i(16364228050944L, 121923);
    PointF localPointF = this.iFU.aW(paramInt);
    GMTrace.o(16364228050944L, 121923);
    return localPointF;
  }
  
  protected final int aZ(int paramInt)
  {
    GMTrace.i(16364093833216L, 121922);
    paramInt = Math.min(this.iFV, paramInt);
    paramInt = super.aZ(Math.max(this.iFW, paramInt));
    GMTrace.o(16364093833216L, 121922);
    return paramInt;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\ui\recents\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */