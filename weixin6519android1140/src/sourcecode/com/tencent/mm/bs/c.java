package com.tencent.mm.bs;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory.Options;
import android.graphics.drawable.Drawable;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.f.a.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.svg.b.b;

public final class c
{
  com.tencent.mm.svg.a.a vev;
  
  static
  {
    GMTrace.i(371783106560L, 2770);
    com.tencent.mm.compatible.f.a.a(new a());
    b.kO(ab.getContext().getSharedPreferences("wechat_svg_debug", 4).getBoolean("open_tag", false));
    GMTrace.o(371783106560L, 2770);
  }
  
  public c()
  {
    GMTrace.i(371380453376L, 2767);
    this.vev = new com.tencent.mm.svg.a.a();
    GMTrace.o(371380453376L, 2767);
  }
  
  public static void ky(boolean paramBoolean)
  {
    GMTrace.i(371648888832L, 2769);
    ab.getContext().getSharedPreferences("wechat_svg_debug", 4).edit().putBoolean("open_tag", paramBoolean).commit();
    b.kO(paramBoolean);
    GMTrace.o(371648888832L, 2769);
  }
  
  public final Drawable c(Resources paramResources, int paramInt)
  {
    GMTrace.i(371514671104L, 2768);
    Drawable localDrawable = null;
    if (this.vev.d(paramResources, paramInt)) {
      localDrawable = com.tencent.mm.svg.a.a.c(paramResources, paramInt);
    }
    GMTrace.o(371514671104L, 2768);
    return localDrawable;
  }
  
  public static final class a
    implements a.a
  {
    com.tencent.mm.svg.a.a vev;
    
    public a()
    {
      GMTrace.i(371112017920L, 2765);
      this.vev = new com.tencent.mm.svg.a.a();
      GMTrace.o(371112017920L, 2765);
    }
    
    public final Bitmap decodeResource(Resources paramResources, int paramInt, BitmapFactory.Options paramOptions)
    {
      GMTrace.i(371246235648L, 2766);
      if (this.vev.d(paramResources, paramInt))
      {
        float f = 0.0F;
        if (paramOptions != null) {
          f = paramOptions.inDensity / 160.0F;
        }
        paramResources = com.tencent.mm.svg.a.a.b(paramResources, paramInt, f);
        GMTrace.o(371246235648L, 2766);
        return paramResources;
      }
      GMTrace.o(371246235648L, 2766);
      return null;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\bs\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */