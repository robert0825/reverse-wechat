package com.tencent.mm.modelappbrand.a;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.support.v4.b.a.i;
import android.support.v4.b.a.k;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.v.a.j;
import java.lang.ref.WeakReference;

public enum a
{
  private static volatile WeakReference<Bitmap> grg;
  
  static
  {
    GMTrace.i(12923690811392L, 96289);
    grh = new a[0];
    GMTrace.o(12923690811392L, 96289);
  }
  
  public static Drawable CS()
  {
    GMTrace.i(12923556593664L, 96288);
    if ((grg == null) || (grg.get() == null) || (((Bitmap)grg.get()).isRecycled())) {
      grg = new WeakReference(com.tencent.mm.compatible.f.a.decodeResource(ab.getResources(), a.j.aVS));
    }
    i locali = k.a(ab.getResources(), (Bitmap)grg.get());
    locali.bt();
    GMTrace.o(12923556593664L, 96288);
    return locali;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\modelappbrand\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */