package com.tencent.mapsdk.rastercore.tile;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.tencent.mapsdk.rastercore.tile.a.c;
import com.tencent.mapsdk.rastercore.tile.b.b;
import com.tencent.tencentmap.mapsdk.map.g;
import com.tencent.tencentmap.mapsdk.map.g.b;
import java.util.concurrent.Callable;

public final class e
  implements Callable<Bitmap>
{
  private a a;
  private Bitmap b = null;
  private a c;
  private boolean d = false;
  private c e = null;
  
  public e(a parama, a parama1)
  {
    this.a = parama;
    this.c = parama1;
  }
  
  private void e()
  {
    if (this.a != null) {
      this.a.a(this);
    }
    this.a = null;
    if ((this.b != null) && (!this.b.isRecycled())) {
      this.b.recycle();
    }
    this.b = null;
  }
  
  private Bitmap f()
  {
    int i = 0;
    Object localObject2 = null;
    if (i < 4) {
      localObject5 = localObject2;
    }
    do
    {
      do
      {
        for (;;)
        {
          Object localObject6;
          Object localObject1;
          int j;
          try
          {
            localObject6 = this.c;
            localObject5 = localObject2;
            boolean bool = this.d;
            localObject5 = localObject2;
            if (this.e != null)
            {
              localObject5 = localObject2;
              localObject1 = this.e.a();
              localObject5 = localObject2;
              localObject6 = ((a)localObject6).a(bool, (String)localObject1);
              localObject1 = localObject2;
              if (localObject6 == null) {
                continue;
              }
              localObject5 = localObject2;
              if ((localObject6.length != 1) || (localObject6[0] != -1)) {
                continue;
              }
              localObject5 = localObject2;
              if (!this.d) {
                continue;
              }
              localObject5 = localObject2;
              com.tencent.mapsdk.rastercore.tile.a.a.a().a(this.c, null, true);
              localObject5 = localObject2;
              if (this.e != null)
              {
                localObject5 = localObject2;
                if (this.e.b() != null)
                {
                  localObject5 = localObject2;
                  com.tencent.mapsdk.rastercore.d.e.e += 1;
                  localObject5 = localObject2;
                  com.tencent.mapsdk.rastercore.d.e.a += 1;
                  localObject5 = localObject2;
                  localObject1 = this.e.b();
                  localObject5 = localObject1;
                  return (Bitmap)localObject5;
                }
              }
            }
            else
            {
              localObject1 = null;
              continue;
            }
            return null;
          }
          catch (Exception localException1) {}
          try
          {
            localObject1 = BitmapFactory.decodeByteArray((byte[])localObject6, 0, localObject6.length);
            if (localObject1 == null) {}
          }
          catch (Exception localException5)
          {
            Exception localException2 = localException4;
            Object localObject4 = localException5;
            continue;
            continue;
          }
          try
          {
            if (this.d)
            {
              com.tencent.mapsdk.rastercore.d.e.f += 1;
              com.tencent.mapsdk.rastercore.d.e.c += 1;
            }
            j = localObject6.length;
            if (j < 2097152)
            {
              try
              {
                localObject2 = new c((byte[])localObject6, this.c.l());
                com.tencent.mapsdk.rastercore.tile.a.a.a().a((c)localObject2, this.c);
                localObject5 = localObject1;
                if (localObject1 != null) {
                  continue;
                }
                if (i != 0) {
                  continue;
                }
                localObject5 = localObject1;
                Thread.sleep(300L);
                localObject5 = localObject1;
                new StringBuilder().append(this.c.l()).append(",重试次数：2");
                localObject2 = localObject1;
                i += 1;
              }
              catch (Throwable localThrowable)
              {
                if (g.ybS == null) {
                  break label748;
                }
              }
              g.ybS.collectErrorInfo("TileNetFetcher downLoad function occured exception when call CacheManager Put,the downloaded data length-" + localObject6.length + ";tileInfo:x=" + this.c.b() + ",y=" + this.c.c() + "z=" + this.c.d() + "exceptionInfo:" + localThrowable.toString());
              break label748;
            }
            if (g.ybS != null) {
              g.ybS.collectErrorInfo("TileNetFetcher downLoad function,the downloaded data length-" + localObject6.length + ";tileInfo:x=" + this.c.b() + ",y=" + this.c.c() + "z=" + this.c.d());
            }
            continue;
            try
            {
              new StringBuilder("decoder bitmap error:").append(localException3.getMessage());
            }
            catch (Exception localException4)
            {
              for (;;)
              {
                Object localObject3;
                localObject5 = localException1;
                localException2 = localException4;
              }
            }
          }
          catch (Exception localException3) {}
          if (i == 1)
          {
            localObject5 = localObject1;
            Thread.sleep(500L);
            localObject5 = localObject1;
            new StringBuilder().append(this.c.l()).append(",重试次数3");
            localObject3 = localObject1;
            continue;
            new StringBuilder("Error occured:").append(localException1.getMessage());
            localObject3 = localObject5;
          }
          else
          {
            localObject3 = localException1;
            if (i == 2)
            {
              localObject5 = localException1;
              Thread.sleep(700L);
              localObject5 = localException1;
              new StringBuilder().append(this.c.l()).append(",重试次数4");
              localObject3 = localException1;
            }
          }
        }
        localObject5 = localObject3;
      } while (this.c.e().getClass() != b.class);
      localObject5 = localObject3;
    } while (localObject3 != null);
    new StringBuilder().append(this.c.l()).append(",重试4次，仍然失败");
    return (Bitmap)localObject3;
  }
  
  public final Bitmap a()
  {
    return this.b;
  }
  
  public final void a(c paramc)
  {
    this.e = paramc;
  }
  
  public final void a(boolean paramBoolean)
  {
    this.d = paramBoolean;
  }
  
  public final String b()
  {
    if (this.c != null) {
      return this.c.toString();
    }
    return "";
  }
  
  public final void c()
  {
    if (this.b != null) {
      this.b.recycle();
    }
    this.b = null;
  }
  
  public final Bitmap d()
  {
    if (this.a != null) {
      this.a.b(this);
    }
    try
    {
      this.b = f();
      Bitmap localBitmap = this.b;
      return localBitmap;
    }
    finally
    {
      e();
    }
  }
  
  public static abstract interface a
  {
    public abstract void a(e parame);
    
    public abstract void b(e parame);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mapsdk\rastercore\tile\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */