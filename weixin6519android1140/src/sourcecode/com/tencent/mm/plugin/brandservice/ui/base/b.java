package com.tencent.mm.plugin.brandservice.ui.base;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.widget.ImageView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.af.m;
import com.tencent.mm.af.m.a;
import com.tencent.mm.af.m.a.a;
import com.tencent.mm.af.x;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.at;

public final class b
  extends BitmapDrawable
  implements m.a.a
{
  private static Bitmap erM;
  private static ae gie;
  private static int jvu;
  private Runnable gig;
  private String iAx;
  private Bitmap jvt;
  private Runnable jvv;
  private String mUrl;
  
  static
  {
    GMTrace.i(10907069448192L, 81264);
    jvu = 200;
    gie = new ae(Looper.getMainLooper());
    GMTrace.o(10907069448192L, 81264);
  }
  
  private b(String paramString1, String paramString2)
  {
    this(paramString1, paramString2, erM);
    GMTrace.i(10905593053184L, 81253);
    GMTrace.o(10905593053184L, 81253);
  }
  
  private b(String paramString1, String paramString2, Bitmap paramBitmap)
  {
    super(paramBitmap);
    GMTrace.i(10905727270912L, 81254);
    this.gig = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(10896734683136L, 81187);
        b.this.invalidateSelf();
        GMTrace.o(10896734683136L, 81187);
      }
    };
    this.jvv = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(10907472101376L, 81267);
        Bitmap localBitmap = m.d(b.a(b.this), b.b(b.this), 0);
        if ((localBitmap != null) && (!localBitmap.isRecycled())) {
          b.aiy().post(b.c(b.this));
        }
        GMTrace.o(10907472101376L, 81267);
      }
    };
    paramBitmap = getPaint();
    paramBitmap.setAntiAlias(true);
    paramBitmap.setFilterBitmap(true);
    x.FO().a(this);
    bx(paramString1, paramString2);
    GMTrace.o(10905727270912L, 81254);
  }
  
  public final void bx(String paramString1, String paramString2)
  {
    GMTrace.i(10906129924096L, 81257);
    if (bg.nm(paramString1)) {
      w.w("MicroMsg.BrandAvatarDrawable", "The username is null or nil.");
    }
    this.iAx = paramString1;
    if ((paramString2 != this.mUrl) && ((paramString2 == null) || ((paramString2 != null) && (!paramString2.equals(this.mUrl)))))
    {
      w.i("MicroMsg.BrandAvatarDrawable", "set a new url for the drawable, url:[%s]", new Object[] { paramString2 });
      this.mUrl = paramString2;
      gie.post(this.gig);
    }
    GMTrace.o(10906129924096L, 81257);
  }
  
  public final void draw(Canvas paramCanvas)
  {
    GMTrace.i(10905995706368L, 81256);
    this.jvt = m.iY(this.iAx);
    if ((this.jvt != null) && (!this.jvt.isRecycled()))
    {
      Rect localRect1 = getBounds();
      Rect localRect2 = new Rect(0, 0, this.jvt.getWidth(), this.jvt.getHeight());
      paramCanvas.drawBitmap(this.jvt, localRect2, localRect1, getPaint());
      GMTrace.o(10905995706368L, 81256);
      return;
    }
    at.xB().h(this.jvv, jvu);
    super.draw(paramCanvas);
    GMTrace.o(10905995706368L, 81256);
  }
  
  public final void ja(String paramString)
  {
    GMTrace.i(10905861488640L, 81255);
    if ((this.iAx != null) && (this.iAx.equals(paramString))) {
      gie.postDelayed(this.gig, jvu);
    }
    GMTrace.o(10905861488640L, 81255);
  }
  
  public static final class a
  {
    public static void a(ImageView paramImageView, String paramString1, String paramString2)
    {
      GMTrace.i(10900358561792L, 81214);
      Bitmap localBitmap = BitmapFactory.decodeResource(ab.getContext().getResources(), R.g.aUD);
      Drawable localDrawable = paramImageView.getDrawable();
      if ((localDrawable != null) && ((localDrawable instanceof b)))
      {
        ((b)localDrawable).bx(paramString1, paramString2);
        GMTrace.o(10900358561792L, 81214);
        return;
      }
      if ((localBitmap != null) && (!localBitmap.isRecycled())) {}
      for (paramString1 = new b(paramString1, paramString2, localBitmap, (byte)0);; paramString1 = new b(paramString1, paramString2, (byte)0))
      {
        paramImageView.setImageDrawable(paramString1);
        GMTrace.o(10900358561792L, 81214);
        return;
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\brandservice\ui\base\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */