package com.tencent.mm.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.gmtrace.GMTrace;

public final class ab
{
  private static float fWN;
  
  static
  {
    GMTrace.i(2533225398272L, 18874);
    fWN = 0.0F;
    GMTrace.o(2533225398272L, 18874);
  }
  
  public static float dZ(Context paramContext)
  {
    GMTrace.i(2532956962816L, 18872);
    float f = paramContext.getSharedPreferences(com.tencent.mm.sdk.platformtools.ab.bPU(), 0).getFloat("text_size_scale_key", 1.0F);
    fWN = f;
    GMTrace.o(2532956962816L, 18872);
    return f;
  }
  
  public static void e(Context paramContext, float paramFloat)
  {
    GMTrace.i(2533091180544L, 18873);
    paramContext = paramContext.getSharedPreferences(com.tencent.mm.sdk.platformtools.ab.bPU(), 0).edit();
    paramContext.putFloat("text_size_scale_key", paramFloat);
    paramContext.commit();
    fWN = paramFloat;
    GMTrace.o(2533091180544L, 18873);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\ui\ab.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */