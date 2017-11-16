package com.google.android.gms.common.images;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.google.android.gms.c.k;
import com.google.android.gms.c.l;
import com.google.android.gms.c.l.a;
import com.google.android.gms.common.internal.v;
import java.lang.ref.WeakReference;
import java.util.Arrays;

public abstract class a
{
  final a ajN;
  protected int ajO;
  protected int ajP;
  
  final void a(Context paramContext, Bitmap paramBitmap)
  {
    if (paramBitmap == null) {
      throw new IllegalArgumentException("null reference");
    }
    Bitmap localBitmap = paramBitmap;
    if ((this.ajP & 0x1) != 0) {
      localBitmap = k.c(paramBitmap);
    }
    new BitmapDrawable(paramContext.getResources(), localBitmap);
    kp();
  }
  
  final void a(Context paramContext, l paraml)
  {
    int i;
    Resources localResources;
    Drawable localDrawable;
    if (this.ajO != 0)
    {
      i = this.ajO;
      localResources = paramContext.getResources();
      if (this.ajP <= 0) {
        break label179;
      }
      l.a locala = new l.a(i, this.ajP);
      if ((Drawable)paraml.get(locala) == null)
      {
        localDrawable = localResources.getDrawable(i);
        paramContext = localDrawable;
        if ((this.ajP & 0x1) != 0)
        {
          if (localDrawable != null) {
            break label105;
          }
          paramContext = null;
          paramContext = new BitmapDrawable(localResources, k.c(paramContext));
        }
        paraml.put(locala, paramContext);
      }
    }
    for (;;)
    {
      kp();
      return;
      label105:
      if ((localDrawable instanceof BitmapDrawable))
      {
        paramContext = ((BitmapDrawable)localDrawable).getBitmap();
        break;
      }
      paramContext = Bitmap.createBitmap(localDrawable.getIntrinsicWidth(), localDrawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
      Canvas localCanvas = new Canvas(paramContext);
      localDrawable.setBounds(0, 0, localCanvas.getWidth(), localCanvas.getHeight());
      localDrawable.draw(localCanvas);
      break;
      label179:
      localResources.getDrawable(i);
    }
  }
  
  protected abstract void kp();
  
  static final class a
  {
    public final Uri uri;
    
    public a(Uri paramUri)
    {
      this.uri = paramUri;
    }
    
    public final boolean equals(Object paramObject)
    {
      if (!(paramObject instanceof a)) {
        return false;
      }
      if (this == paramObject) {
        return true;
      }
      return v.d(((a)paramObject).uri, this.uri);
    }
    
    public final int hashCode()
    {
      return Arrays.hashCode(new Object[] { this.uri });
    }
  }
  
  public static final class b
    extends a
  {
    private WeakReference<ImageManager.a> ajQ;
    
    public final boolean equals(Object paramObject)
    {
      if (!(paramObject instanceof b)) {
        return false;
      }
      if (this == paramObject) {
        return true;
      }
      paramObject = (b)paramObject;
      ImageManager.a locala1 = (ImageManager.a)this.ajQ.get();
      ImageManager.a locala2 = (ImageManager.a)((b)paramObject).ajQ.get();
      return (locala2 != null) && (locala1 != null) && (v.d(locala2, locala1)) && (v.d(((b)paramObject).ajN, this.ajN));
    }
    
    public final int hashCode()
    {
      return Arrays.hashCode(new Object[] { this.ajN });
    }
    
    protected final void kp()
    {
      this.ajQ.get();
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\google\android\gms\common\images\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */