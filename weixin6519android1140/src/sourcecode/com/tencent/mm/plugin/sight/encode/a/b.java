package com.tencent.mm.plugin.sight.encode.a;

import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bu.g;
import com.tencent.mm.kernel.h;
import com.tencent.mm.modelvideo.o;
import com.tencent.mm.modelvideo.r;
import com.tencent.mm.modelvideo.s;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.List;

public final class b
{
  public b()
  {
    GMTrace.i(9283706028032L, 69169);
    GMTrace.o(9283706028032L, 69169);
  }
  
  public static void a(a parama, final int paramInt)
  {
    GMTrace.i(9283974463488L, 69171);
    if (parama == null)
    {
      GMTrace.o(9283974463488L, 69171);
      return;
    }
    af.t(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(9292430180352L, 69234);
        this.oUV.onError(paramInt);
        GMTrace.o(9292430180352L, 69234);
      }
    });
    GMTrace.o(9283974463488L, 69171);
  }
  
  public static abstract interface a
  {
    public abstract void onError(int paramInt);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\sight\encode\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */