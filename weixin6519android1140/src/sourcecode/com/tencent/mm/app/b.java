package com.tencent.mm.app;

import android.content.Context;
import android.graphics.Bitmap;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.k;
import com.tencent.mm.ac.d;
import com.tencent.mm.ac.d.a;
import com.tencent.mm.ac.n;
import com.tencent.mm.compatible.f.a;
import com.tencent.mm.pluginsdk.ui.j;
import com.tencent.mm.pluginsdk.ui.j.a;
import com.tencent.mm.sdk.platformtools.ab;

final class b
  implements j.a
{
  private Bitmap erM;
  d erN;
  
  public b()
  {
    GMTrace.i(13043278807040L, 97180);
    this.erM = null;
    this.erM = a.decodeResource(ab.getContext().getResources(), R.k.aVS);
    GMTrace.o(13043278807040L, 97180);
  }
  
  public final void a(j paramj)
  {
    GMTrace.i(13043413024768L, 97181);
    if ((paramj instanceof d.a)) {
      n.Dh().a((d.a)paramj);
    }
    GMTrace.o(13043413024768L, 97181);
  }
  
  public final Bitmap b(String paramString, int paramInt1, int paramInt2, int paramInt3)
  {
    GMTrace.i(13043949895680L, 97185);
    paramString = com.tencent.mm.ac.b.c(paramString, paramInt1, paramInt2, paramInt3);
    GMTrace.o(13043949895680L, 97185);
    return paramString;
  }
  
  public final Bitmap bw(String paramString)
  {
    GMTrace.i(13043547242496L, 97182);
    paramString = com.tencent.mm.ac.b.a(paramString, false, -1);
    GMTrace.o(13043547242496L, 97182);
    return paramString;
  }
  
  public final Bitmap bx(String paramString)
  {
    GMTrace.i(13043815677952L, 97184);
    if (this.erN == null) {
      this.erN = n.Dh();
    }
    paramString = d.hW(paramString);
    GMTrace.o(13043815677952L, 97184);
    return paramString;
  }
  
  public final Bitmap oT()
  {
    GMTrace.i(13043681460224L, 97183);
    Bitmap localBitmap = this.erM;
    GMTrace.o(13043681460224L, 97183);
    return localBitmap;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\app\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */