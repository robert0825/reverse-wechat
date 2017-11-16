package com.tencent.mm.plugin.fts.d;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.widget.ImageView;
import com.tencent.gmtrace.GMTrace;

public abstract interface g
{
  public abstract Bitmap a(String paramString1, String paramString2, boolean paramBoolean, int paramInt1, int paramInt2);
  
  public abstract String a(ImageView paramImageView, String paramString1, String paramString2, boolean paramBoolean, int paramInt1, int paramInt2);
  
  public abstract void a(Context paramContext, ImageView paramImageView, String paramString1, String paramString2, boolean paramBoolean, int paramInt1, int paramInt2);
  
  public abstract boolean aCA();
  
  public abstract void aCB();
  
  public abstract void aCC();
  
  public abstract void aCD();
  
  public abstract void aCy();
  
  public abstract void aCz();
  
  public static final class a
    extends BitmapDrawable
  {
    private a(Resources paramResources, Bitmap paramBitmap)
    {
      super(paramBitmap);
      GMTrace.i(16701919854592L, 124439);
      GMTrace.o(16701919854592L, 124439);
    }
    
    public static void a(Resources paramResources, Bitmap paramBitmap, ImageView paramImageView)
    {
      GMTrace.i(16701785636864L, 124438);
      paramImageView.setImageDrawable(new a(paramResources, paramBitmap));
      paramImageView.postInvalidate();
      GMTrace.o(16701785636864L, 124438);
    }
    
    public final void draw(Canvas paramCanvas)
    {
      GMTrace.i(16702054072320L, 124440);
      if ((getBitmap() != null) && (!getBitmap().isRecycled())) {
        super.draw(paramCanvas);
      }
      GMTrace.o(16702054072320L, 124440);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\fts\d\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */