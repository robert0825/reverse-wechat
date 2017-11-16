package com.tencent.mapsdk.rastercore.tile;

import android.os.Handler;
import com.tencent.mapsdk.raster.model.TileOverlayOptions;
import com.tencent.mapsdk.rastercore.d.e;
import com.tencent.mapsdk.rastercore.tile.b.c;

public final class f
{
  private boolean a = false;
  private com.tencent.mapsdk.rastercore.e.a.f b;
  public e c;
  public Handler d = new Handler();
  private a e;
  private float f = 0.0F;
  
  public f(e parame)
  {
    this.c = parame;
  }
  
  public final void a(boolean paramBoolean)
  {
    if ((paramBoolean) && (this.a) && (this.b != null)) {
      return;
    }
    if (paramBoolean)
    {
      TileOverlayOptions localTileOverlayOptions = new TileOverlayOptions();
      localTileOverlayOptions.tileProvider(c.a(this.c, MapTile.MapSource.TRAFFIC)).diskCacheEnabled(false).visible(true).zIndex(0.0F);
      this.b = this.c.g().a(localTileOverlayOptions);
      this.e = new a(60000);
      this.d.post(this.e);
    }
    for (;;)
    {
      this.a = paramBoolean;
      return;
      if (this.b == null) {
        break;
      }
      this.b.b();
      this.b = null;
      this.e.a(false);
      this.d.removeCallbacks(this.e);
      this.e = null;
    }
  }
  
  public final boolean a()
  {
    return this.a;
  }
  
  final class a
    implements Runnable
  {
    private boolean a = true;
    private int b = 60000;
    
    public a(int paramInt) {}
    
    public final void a(boolean paramBoolean)
    {
      this.a = false;
    }
    
    public final void run()
    {
      f.this.c.a(false, false);
      if (this.a) {
        f.this.d.postDelayed(this, this.b);
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mapsdk\rastercore\tile\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */