package com.tencent.mm.pluginsdk.ui;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.d.a;
import com.tencent.mm.bn.a.a.a;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.d;
import com.tencent.mm.sdk.platformtools.w;
import java.io.IOException;

public final class b
  extends j
  implements d.a
{
  Bitmap jvJ;
  private float tsK;
  
  private b(String paramString)
  {
    super(a.b.bKI(), paramString);
    GMTrace.i(1180579135488L, 8796);
    this.tsK = 0.5F;
    this.jvJ = null;
    GMTrace.o(1180579135488L, 8796);
  }
  
  public b(String paramString, float paramFloat)
  {
    this(paramString);
    GMTrace.i(1180713353216L, 8797);
    this.tsK = paramFloat;
    GMTrace.o(1180713353216L, 8797);
  }
  
  private void a(Canvas paramCanvas, Bitmap paramBitmap)
  {
    GMTrace.i(1181116006400L, 8800);
    Rect localRect2 = getBounds();
    Rect localRect1 = null;
    if ((this.ttH > 1.0F) || (this.ndd))
    {
      int i = paramBitmap.getHeight() / 15 / 2;
      int j = paramBitmap.getWidth() / 15 / 2;
      localRect1 = new Rect(j, i, paramBitmap.getWidth() - j, paramBitmap.getHeight() - i);
    }
    paramCanvas.drawBitmap(paramBitmap, localRect1, localRect2, gid);
    GMTrace.o(1181116006400L, 8800);
  }
  
  public final void draw(Canvas paramCanvas)
  {
    Bitmap localBitmap = null;
    GMTrace.i(1180981788672L, 8799);
    com.tencent.mm.bn.a.a locala = a.a.vdS;
    if (locala != null) {
      localBitmap = a.a.vdS.Bf(this.tag);
    }
    if (localBitmap != null)
    {
      a(paramCanvas, localBitmap);
      GMTrace.o(1180981788672L, 8799);
      return;
    }
    if (this.ttC) {}
    for (localBitmap = this.nPm.b(this.tag, paramCanvas.getWidth(), paramCanvas.getHeight(), 1); localBitmap != null; localBitmap = this.nPm.bw(this.tag))
    {
      localBitmap = d.a(localBitmap, false, this.tsK * localBitmap.getWidth());
      if (locala != null) {
        locala.o(this.tag, localBitmap);
      }
      a(paramCanvas, localBitmap);
      GMTrace.o(1180981788672L, 8799);
      return;
    }
    if (((localBitmap != null) && (!localBitmap.isRecycled())) || (this.jvJ == null)) {}
    try
    {
      this.jvJ = BackwardSupportUtil.b.a(ab.getContext().getAssets().open("avatar/default_nor_avatar.png"), com.tencent.mm.br.a.getDensity(null));
      this.jvJ = d.a(this.jvJ, false, this.tsK * this.jvJ.getWidth());
      a(paramCanvas, this.jvJ);
      GMTrace.o(1180981788672L, 8799);
      return;
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.AvatarRoundDrawable", localIOException, "", new Object[0]);
      }
    }
  }
  
  public final void ib(String paramString)
  {
    GMTrace.i(1180847570944L, 8798);
    super.ib(paramString);
    GMTrace.o(1180847570944L, 8798);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\ui\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */