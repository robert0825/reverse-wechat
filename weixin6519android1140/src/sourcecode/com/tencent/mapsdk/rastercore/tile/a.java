package com.tencent.mapsdk.rastercore.tile;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.PointF;
import com.tencent.mapsdk.raster.model.Tile;
import com.tencent.mapsdk.raster.model.TileOverlayOptions;
import com.tencent.mapsdk.raster.model.TileProvider;
import com.tencent.mapsdk.rastercore.b.c;
import com.tencent.mapsdk.rastercore.d.e;
import com.tencent.mapsdk.rastercore.e.a.f;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public final class a
{
  private static final Comparator<a> l = new a();
  private final int a;
  private final int b;
  private final int c;
  private MapTile.MapSource d;
  private final int e;
  private TileProvider f;
  private Bitmap g;
  private String h;
  private boolean i = true;
  private volatile boolean j = false;
  private f k;
  
  public a(TileProvider paramTileProvider, int paramInt1, int paramInt2, int paramInt3, int paramInt4, MapTile.MapSource paramMapSource, String paramString)
  {
    this.f = paramTileProvider;
    this.a = paramInt1;
    this.b = paramInt2;
    this.c = paramInt3;
    this.h = paramString;
    this.d = paramMapSource;
    this.e = paramInt4;
  }
  
  public a(f paramf, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this(paramf.f(), paramInt1, paramInt2, paramInt3, paramInt4, MapTile.MapSource.CUSTOMER, paramf.g());
    this.k = paramf;
  }
  
  public static Comparator<a> k()
  {
    return l;
  }
  
  public final String a()
  {
    return this.h;
  }
  
  public final void a(Bitmap paramBitmap)
  {
    this.g = paramBitmap;
  }
  
  public final boolean a(Canvas paramCanvas)
  {
    if ((this.k != null) && (!this.k.e())) {}
    while ((this.g == null) || (this.g.isRecycled())) {
      return false;
    }
    try
    {
      paramCanvas.drawBitmap(this.g, 0.0F, 0.0F, null);
      return true;
    }
    catch (Exception paramCanvas)
    {
      if ((this.g != null) && (!this.g.isRecycled())) {
        this.g.recycle();
      }
      this.g = null;
    }
    return false;
  }
  
  public final boolean a(f paramf)
  {
    if (this.k == null) {
      return false;
    }
    return this.k.equals(paramf);
  }
  
  public final byte[] a(boolean paramBoolean, String paramString)
  {
    try
    {
      paramString = this.f.getTile(this.a, this.b, this.c, this.d, new Object[] { Integer.valueOf(this.e), paramString, Boolean.valueOf(paramBoolean) });
      if (paramString != null)
      {
        paramString = paramString.getData();
        return paramString;
      }
      return null;
    }
    catch (Exception paramString)
    {
      new StringBuilder("get tile raises exception:").append(paramString.getMessage());
    }
    return null;
  }
  
  public final int b()
  {
    return this.a;
  }
  
  public final int c()
  {
    return this.b;
  }
  
  public final int d()
  {
    return this.c;
  }
  
  public final TileProvider e()
  {
    return this.f;
  }
  
  public final Bitmap f()
  {
    return this.g;
  }
  
  public final boolean g()
  {
    return this.i;
  }
  
  public final void h()
  {
    this.j = true;
    if ((this.g != null) && (!this.g.isRecycled())) {
      this.g.recycle();
    }
    this.g = null;
  }
  
  public final boolean i()
  {
    return this.j;
  }
  
  public final float j()
  {
    if (this.k != null) {
      return this.k.a();
    }
    return Float.NEGATIVE_INFINITY;
  }
  
  public final int l()
  {
    return this.e;
  }
  
  public final MapTile.MapSource m()
  {
    return this.d;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(128);
    localStringBuilder.append(this.a);
    localStringBuilder.append("_");
    localStringBuilder.append(this.b);
    localStringBuilder.append("_");
    localStringBuilder.append(this.c);
    localStringBuilder.append("_");
    localStringBuilder.append(this.d);
    localStringBuilder.append("_");
    localStringBuilder.append(this.f.getClass().getCanonicalName());
    return localStringBuilder.toString();
  }
  
  static final class a
    implements Comparator<a>
  {}
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mapsdk\rastercore\tile\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */