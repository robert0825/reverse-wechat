package com.tencent.mm.plugin.game.ui;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.os.Looper;
import android.widget.ImageView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.platformtools.j;
import com.tencent.mm.plugin.game.model.ak;
import com.tencent.mm.pluginsdk.model.app.an;
import com.tencent.mm.pluginsdk.model.app.g;
import com.tencent.mm.sdk.e.l;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.w;

public final class i
  extends BitmapDrawable
  implements com.tencent.mm.platformtools.j.a
{
  private static Bitmap erM;
  private static ae gie;
  private Runnable gig;
  private Bitmap jvt;
  private String mUrl;
  
  static
  {
    GMTrace.i(12757931917312L, 95054);
    gie = new ae(Looper.getMainLooper());
    GMTrace.o(12757931917312L, 95054);
  }
  
  private i(String paramString) {}
  
  private i(String paramString, Bitmap paramBitmap)
  {
    super(paramBitmap);
    GMTrace.i(12757260828672L, 95049);
    this.gig = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(12729209323520L, 94840);
        i.this.invalidateSelf();
        GMTrace.o(12729209323520L, 94840);
      }
    };
    paramBitmap = getPaint();
    paramBitmap.setAntiAlias(true);
    paramBitmap.setFilterBitmap(true);
    j.a(this);
    setUrl(paramString);
    GMTrace.o(12757260828672L, 95049);
  }
  
  public final void draw(Canvas paramCanvas)
  {
    GMTrace.i(12757529264128L, 95051);
    if ((this.jvt != null) && (!this.jvt.isRecycled()))
    {
      Rect localRect1 = getBounds();
      Rect localRect2 = new Rect(0, 0, this.jvt.getWidth(), this.jvt.getHeight());
      paramCanvas.drawBitmap(this.jvt, localRect2, localRect1, getPaint());
      GMTrace.o(12757529264128L, 95051);
      return;
    }
    super.draw(paramCanvas);
    GMTrace.o(12757529264128L, 95051);
  }
  
  public final void k(String paramString, Bitmap paramBitmap)
  {
    GMTrace.i(12757395046400L, 95050);
    if ((this.mUrl != null) && (this.mUrl.hashCode().equals(paramString)) && (paramBitmap != null) && (!paramBitmap.isRecycled()))
    {
      w.i("MicroMsg.GameDrawable", "onGerPictureFinish() function has been invoke.");
      this.jvt = paramBitmap;
      gie.post(this.gig);
    }
    GMTrace.o(12757395046400L, 95050);
  }
  
  public final void setUrl(String paramString)
  {
    GMTrace.i(12757663481856L, 95052);
    if ((paramString != null) && (!paramString.equals(this.mUrl)))
    {
      w.i("MicroMsg.GameDrawable", "set a new url for the drawable,url:[%s]", new Object[] { paramString });
      this.mUrl = paramString;
      paramString = j.a(new ak(this.mUrl));
      if ((paramString != null) && (!paramString.isRecycled())) {
        this.jvt = paramString;
      }
      gie.post(this.gig);
    }
    GMTrace.o(12757663481856L, 95052);
  }
  
  public static final class a {}
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\ui\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */