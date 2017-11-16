package com.tencent.mapsdk.rastercore.d;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.ViewGroup.LayoutParams;
import com.tencent.mapsdk.raster.model.QMapLanguage;
import com.tencent.mapsdk.rastercore.d;
import com.tencent.mapsdk.rastercore.d.a;
import com.tencent.mapsdk.rastercore.d.b;
import com.tencent.mapsdk.rastercore.tile.MapTile.MapSource;
import com.tencent.tencentmap.mapsdk.map.MapView;
import com.tencent.tencentmap.mapsdk.map.g.j;

public final class e
  implements d.b
{
  public static volatile int A = com.tencent.mapsdk.rastercore.b.c;
  private static volatile int B = 1000;
  private static volatile int C = 1000;
  public static volatile int D = com.tencent.mapsdk.rastercore.b.d;
  private static volatile int E = com.tencent.mapsdk.rastercore.b.b;
  private static volatile String F = QMapLanguage.getLanguageCode(QMapLanguage.QMapLanguage_en);
  public static int a = 0;
  public static int b = 0;
  public static int c = 0;
  public static int d = 0;
  public static int e = 0;
  public static int f = 0;
  public static int g = 0;
  public static int h = 0;
  private static volatile Context i;
  private static boolean w = true;
  private static boolean y = false;
  private static volatile int z = com.tencent.mapsdk.rastercore.b.a;
  private MapView j;
  private a k;
  private b l;
  private f m;
  private com.tencent.mapsdk.rastercore.tile.a.1 n;
  private com.tencent.mapsdk.rastercore.tile.f o;
  private c p;
  private a.1 q;
  private volatile com.tencent.mapsdk.rastercore.g.b r;
  private com.tencent.mapsdk.rastercore.g.a s;
  private int t = 1;
  private g.j u = null;
  private boolean v = false;
  private Rect x = null;
  
  public e(MapView paramMapView)
  {
    Object localObject = paramMapView.getContext().getApplicationContext();
    i = (Context)localObject;
    if (localObject == null) {}
    for (boolean bool = false;; bool = i.getSharedPreferences("mapsdk_pref", 0).getBoolean("worldEnable", false))
    {
      y = bool;
      com.tencent.mapsdk.rastercore.tile.a.a.a().a(i);
      if (i != null)
      {
        C = d.a.a().a(i.getPackageName(), false);
        z = d.a.a().a(C, 0);
        new StringBuilder("CurrentVersion in MapContext:").append(z);
        B = d.a.a().a(i.getPackageName(), true);
        A = d.a.a().a(B, 2);
        D = d.a.a().a(-1, 3);
        E = d.a.a().a(-1, 1);
        new Thread()
        {
          public final void run()
          {
            com.tencent.mapsdk.rastercore.tile.a.a.a().a(MapTile.MapSource.BING, e.A);
            com.tencent.mapsdk.rastercore.tile.a.a.a().a(MapTile.MapSource.SATELLITE, e.D);
          }
        }.start();
      }
      this.j = paramMapView;
      this.q = new a.1(this);
      this.r = new com.tencent.mapsdk.rastercore.g.b(this);
      this.p = new c(this);
      this.s = new com.tencent.mapsdk.rastercore.g.a(this);
      this.k = new a(this);
      this.l = new b(this);
      this.m = new f(this);
      this.n = new com.tencent.mapsdk.rastercore.tile.a.1(this, z, A, D);
      this.o = new com.tencent.mapsdk.rastercore.tile.f(this);
      this.p.a();
      localObject = new ViewGroup.LayoutParams(-1, -1);
      paramMapView.addView(this.l, (ViewGroup.LayoutParams)localObject);
      paramMapView.addView(this.s, (ViewGroup.LayoutParams)localObject);
      paramMapView.addView(this.r, (ViewGroup.LayoutParams)localObject);
      this.q.b(1);
      this.q.a(true);
      this.q.c(0);
      com.tencent.mapsdk.rastercore.a.a(this);
      new d(i, this).a();
      return;
    }
  }
  
  public static Context a()
  {
    return i;
  }
  
  public static void a(String paramString)
  {
    F = paramString;
  }
  
  public static void c(boolean paramBoolean)
  {
    w = false;
  }
  
  public static void d(boolean paramBoolean)
  {
    y = paramBoolean;
  }
  
  public static void e(boolean paramBoolean)
  {
    if (i == null) {
      return;
    }
    SharedPreferences.Editor localEditor = i.getSharedPreferences("mapsdk_pref", 0).edit();
    localEditor.putBoolean("worldEnable", paramBoolean);
    localEditor.commit();
  }
  
  public static void n() {}
  
  public static boolean q()
  {
    return w;
  }
  
  public static boolean r()
  {
    return y;
  }
  
  public static int s()
  {
    return A;
  }
  
  public static int t()
  {
    return B;
  }
  
  public static String u()
  {
    return F;
  }
  
  public static int v()
  {
    return z;
  }
  
  public static int w()
  {
    return D;
  }
  
  public static int x()
  {
    return E;
  }
  
  public static int y()
  {
    return C;
  }
  
  public final void a(int paramInt)
  {
    if (paramInt == 2) {
      this.r.a(true);
    }
    for (;;)
    {
      this.t = paramInt;
      a(false, false);
      return;
      this.r.a(false);
    }
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, Bitmap paramBitmap)
  {
    C = paramInt1;
    z = paramInt2;
    new StringBuilder("CurrentVersion in Update:").append(z);
    A = paramInt4;
    B = paramInt3;
    D = paramInt5;
    E = paramInt6;
    this.n.a(paramInt2);
    this.n.b(paramInt4);
    this.n.c(paramInt5);
    if (this.r != null) {
      this.r.a(paramBitmap);
    }
  }
  
  public final void a(Bundle paramBundle)
  {
    if (paramBundle != null)
    {
      this.q.e(paramBundle.getBoolean("ANIMATION_ENABLED", true));
      this.q.b(paramBundle.getBoolean("SCROLL_ENABLED", true));
      this.q.c(paramBundle.getBoolean("ZOOM_ENABLED", true));
      this.q.b(paramBundle.getInt("LOGO_POSITION", 0));
      this.q.c(paramBundle.getInt("SCALEVIEW_POSITION", 0));
      this.q.a(paramBundle.getBoolean("SCALE_CONTROLL_ENABLED", true));
      this.l.b(paramBundle.getDouble("ZOOM", this.l.c()), false, null);
      Double localDouble = Double.valueOf(paramBundle.getDouble("CENTERX", NaN.0D));
      paramBundle = Double.valueOf(paramBundle.getDouble("CENTERY", NaN.0D));
      if ((!localDouble.isNaN()) && (!paramBundle.isNaN())) {
        this.l.a(new com.tencent.mapsdk.rastercore.b.c(localDouble.doubleValue(), paramBundle.doubleValue()));
      }
    }
  }
  
  public final void a(g.j paramj)
  {
    a(paramj, null);
  }
  
  public final void a(g.j paramj, Rect paramRect)
  {
    this.u = paramj;
    this.x = paramRect;
    if (this.v)
    {
      o();
      return;
    }
    this.l.a(true);
    a(false, false);
  }
  
  public final void a(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      this.s.setVisibility(0);
      this.s.d();
      return;
    }
    com.tencent.mapsdk.rastercore.g.a.b();
    com.tencent.mapsdk.rastercore.g.a.c();
    this.s.setVisibility(8);
  }
  
  public final void a(boolean paramBoolean1, boolean paramBoolean2)
  {
    this.v = false;
    this.n.a(paramBoolean1, paramBoolean2);
    this.j.layout();
    this.j.postInvalidate();
  }
  
  public final c b()
  {
    return this.p;
  }
  
  public final void b(int paramInt)
  {
    if (this.r != null)
    {
      this.r.a(paramInt);
      this.r.invalidate();
      if (this.s.getVisibility() == 0) {
        this.s.invalidate();
      }
    }
  }
  
  public final void b(Bundle paramBundle)
  {
    paramBundle.putBoolean("ANIMATION_ENABLED", this.q.k());
    paramBundle.putBoolean("SCROLL_ENABLED", this.q.h());
    paramBundle.putBoolean("ZOOM_ENABLED", this.q.i());
    paramBundle.putInt("LOGO_POSITION", this.q.j());
    paramBundle.putInt("SCALEVIEW_POSITION", this.q.f());
    paramBundle.putBoolean("SCALE_CONTROLL_ENABLED", this.q.g());
    paramBundle.putDouble("ZOOM", this.l.c());
    paramBundle.putDouble("CENTERX", this.l.b().b());
    paramBundle.putDouble("CENTERY", this.l.b().a());
  }
  
  protected final void b(boolean paramBoolean)
  {
    this.v = paramBoolean;
  }
  
  public final b c()
  {
    return this.l;
  }
  
  public final void c(int paramInt)
  {
    if ((this.s != null) && (this.s.getVisibility() == 0))
    {
      this.s.a(paramInt);
      this.s.invalidate();
    }
  }
  
  public final MapView d()
  {
    return this.j;
  }
  
  public final a e()
  {
    return this.k;
  }
  
  public final a.1 f()
  {
    return this.q;
  }
  
  public final com.tencent.mapsdk.rastercore.tile.a.1 g()
  {
    return this.n;
  }
  
  public final f h()
  {
    return this.m;
  }
  
  public final com.tencent.mapsdk.rastercore.tile.f i()
  {
    return this.o;
  }
  
  public final void j()
  {
    this.s.e();
  }
  
  public final void k()
  {
    this.s.d();
  }
  
  public final int l()
  {
    return this.t;
  }
  
  public final void m()
  {
    this.s.a();
    this.r.a();
    this.k.b();
    this.j.stopAnimation();
    this.j.removeAllViews();
    this.n.a();
    com.tencent.mapsdk.rastercore.tile.a.a.a().c();
    new Thread()
    {
      /* Error */
      public final void run()
      {
        // Byte code:
        //   0: aconst_null
        //   1: astore_2
        //   2: new 17	java/lang/StringBuilder
        //   5: dup
        //   6: invokespecial 18	java/lang/StringBuilder:<init>	()V
        //   9: getstatic 22	com/tencent/mapsdk/rastercore/d/e:c	I
        //   12: invokestatic 28	java/lang/Integer:toString	(I)Ljava/lang/String;
        //   15: invokevirtual 32	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   18: ldc 34
        //   20: invokevirtual 32	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   23: getstatic 37	com/tencent/mapsdk/rastercore/d/e:d	I
        //   26: invokestatic 28	java/lang/Integer:toString	(I)Ljava/lang/String;
        //   29: invokevirtual 32	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   32: invokevirtual 40	java/lang/StringBuilder:toString	()Ljava/lang/String;
        //   35: astore_1
        //   36: new 17	java/lang/StringBuilder
        //   39: dup
        //   40: invokespecial 18	java/lang/StringBuilder:<init>	()V
        //   43: getstatic 43	com/tencent/mapsdk/rastercore/d/e:a	I
        //   46: invokestatic 28	java/lang/Integer:toString	(I)Ljava/lang/String;
        //   49: invokevirtual 32	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   52: ldc 34
        //   54: invokevirtual 32	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   57: getstatic 46	com/tencent/mapsdk/rastercore/d/e:b	I
        //   60: invokestatic 28	java/lang/Integer:toString	(I)Ljava/lang/String;
        //   63: invokevirtual 32	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   66: invokevirtual 40	java/lang/StringBuilder:toString	()Ljava/lang/String;
        //   69: astore_3
        //   70: new 17	java/lang/StringBuilder
        //   73: dup
        //   74: invokespecial 18	java/lang/StringBuilder:<init>	()V
        //   77: getstatic 49	com/tencent/mapsdk/rastercore/d/e:e	I
        //   80: invokestatic 28	java/lang/Integer:toString	(I)Ljava/lang/String;
        //   83: invokevirtual 32	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   86: ldc 34
        //   88: invokevirtual 32	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   91: iconst_0
        //   92: invokestatic 28	java/lang/Integer:toString	(I)Ljava/lang/String;
        //   95: invokevirtual 32	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   98: invokevirtual 40	java/lang/StringBuilder:toString	()Ljava/lang/String;
        //   101: astore 4
        //   103: new 17	java/lang/StringBuilder
        //   106: dup
        //   107: invokespecial 18	java/lang/StringBuilder:<init>	()V
        //   110: getstatic 52	com/tencent/mapsdk/rastercore/d/e:f	I
        //   113: invokestatic 28	java/lang/Integer:toString	(I)Ljava/lang/String;
        //   116: invokevirtual 32	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   119: ldc 34
        //   121: invokevirtual 32	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   124: iconst_0
        //   125: invokestatic 28	java/lang/Integer:toString	(I)Ljava/lang/String;
        //   128: invokevirtual 32	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   131: invokevirtual 40	java/lang/StringBuilder:toString	()Ljava/lang/String;
        //   134: astore 5
        //   136: new 54	java/net/URL
        //   139: dup
        //   140: new 17	java/lang/StringBuilder
        //   143: dup
        //   144: ldc 56
        //   146: invokespecial 59	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
        //   149: getstatic 64	com/tencent/mapsdk/rastercore/a:a	Ljava/lang/StringBuffer;
        //   152: invokevirtual 67	java/lang/StringBuffer:toString	()Ljava/lang/String;
        //   155: invokevirtual 32	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   158: ldc 69
        //   160: invokevirtual 32	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   163: aload_1
        //   164: invokevirtual 32	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   167: ldc 71
        //   169: invokevirtual 32	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   172: aload_3
        //   173: invokevirtual 32	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   176: ldc 73
        //   178: invokevirtual 32	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   181: aload 4
        //   183: invokevirtual 32	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   186: ldc 75
        //   188: invokevirtual 32	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   191: aload 5
        //   193: invokevirtual 32	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   196: invokevirtual 40	java/lang/StringBuilder:toString	()Ljava/lang/String;
        //   199: invokespecial 76	java/net/URL:<init>	(Ljava/lang/String;)V
        //   202: invokevirtual 80	java/net/URL:openConnection	()Ljava/net/URLConnection;
        //   205: checkcast 82	java/net/HttpURLConnection
        //   208: astore_1
        //   209: aload_1
        //   210: ldc 84
        //   212: invokevirtual 87	java/net/HttpURLConnection:setRequestMethod	(Ljava/lang/String;)V
        //   215: aload_1
        //   216: invokevirtual 90	java/net/HttpURLConnection:connect	()V
        //   219: aload_1
        //   220: invokevirtual 94	java/net/HttpURLConnection:getResponseCode	()I
        //   223: sipush 200
        //   226: if_icmpne +40 -> 266
        //   229: aload_1
        //   230: invokevirtual 98	java/net/HttpURLConnection:getInputStream	()Ljava/io/InputStream;
        //   233: pop
        //   234: iconst_0
        //   235: putstatic 22	com/tencent/mapsdk/rastercore/d/e:c	I
        //   238: iconst_0
        //   239: putstatic 37	com/tencent/mapsdk/rastercore/d/e:d	I
        //   242: iconst_0
        //   243: putstatic 43	com/tencent/mapsdk/rastercore/d/e:a	I
        //   246: iconst_0
        //   247: putstatic 46	com/tencent/mapsdk/rastercore/d/e:b	I
        //   250: iconst_0
        //   251: putstatic 49	com/tencent/mapsdk/rastercore/d/e:e	I
        //   254: iconst_0
        //   255: putstatic 52	com/tencent/mapsdk/rastercore/d/e:f	I
        //   258: iconst_0
        //   259: putstatic 101	com/tencent/mapsdk/rastercore/d/e:g	I
        //   262: iconst_0
        //   263: putstatic 46	com/tencent/mapsdk/rastercore/d/e:b	I
        //   266: aload_1
        //   267: ifnull +7 -> 274
        //   270: aload_1
        //   271: invokevirtual 104	java/net/HttpURLConnection:disconnect	()V
        //   274: return
        //   275: astore_1
        //   276: aconst_null
        //   277: astore_1
        //   278: aload_1
        //   279: ifnull -5 -> 274
        //   282: aload_1
        //   283: invokevirtual 104	java/net/HttpURLConnection:disconnect	()V
        //   286: return
        //   287: astore_3
        //   288: aload_2
        //   289: astore_1
        //   290: aload_3
        //   291: astore_2
        //   292: aload_1
        //   293: ifnull +7 -> 300
        //   296: aload_1
        //   297: invokevirtual 104	java/net/HttpURLConnection:disconnect	()V
        //   300: aload_2
        //   301: athrow
        //   302: astore_2
        //   303: goto -11 -> 292
        //   306: astore_2
        //   307: goto -29 -> 278
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	310	0	this	2
        //   35	236	1	localObject1	Object
        //   275	1	1	localException1	Exception
        //   277	20	1	localObject2	Object
        //   1	300	2	localObject3	Object
        //   302	1	2	localObject4	Object
        //   306	1	2	localException2	Exception
        //   69	104	3	str1	String
        //   287	4	3	localObject5	Object
        //   101	81	4	str2	String
        //   134	58	5	str3	String
        // Exception table:
        //   from	to	target	type
        //   2	209	275	java/lang/Exception
        //   2	209	287	finally
        //   209	266	302	finally
        //   209	266	306	java/lang/Exception
      }
    }.start();
    System.gc();
  }
  
  protected final void o()
  {
    if (this.u != null)
    {
      this.j.setDrawingCacheEnabled(true);
      this.j.buildDrawingCache();
      if (this.x != null) {
        break label48;
      }
      Bitmap.createBitmap(this.j.getDrawingCache());
    }
    for (;;)
    {
      this.j.destroyDrawingCache();
      return;
      label48:
      Bitmap.createBitmap(this.j.getDrawingCache(), this.x.left, this.x.top, this.x.width(), this.x.height());
    }
  }
  
  public final void p()
  {
    if (this.r != null) {
      this.r.invalidate();
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mapsdk\rastercore\d\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */