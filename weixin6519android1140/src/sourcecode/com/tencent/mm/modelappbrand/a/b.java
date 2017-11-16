package com.tencent.mm.modelappbrand.a;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.HandlerThread;
import android.widget.ImageView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.f.a;
import com.tencent.mm.a.g;
import com.tencent.mm.compatible.util.e;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.h;
import com.tencent.mm.sdk.platformtools.w;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.ref.Reference;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class b
{
  public static final String gro;
  public final Map<h, String> gri;
  public final Map<String, h> grj;
  public final Map<Integer, String> grk;
  public final d grl;
  private final i grm;
  private final g grn;
  
  static
  {
    GMTrace.i(12918456320000L, 96250);
    String str2 = e.ghz;
    String str1 = str2;
    if (!str2.endsWith("/")) {
      str1 = str2 + "/";
    }
    str1 = str1 + "wxacache/";
    gro = str1;
    h.Nj(str1);
    GMTrace.o(12918456320000L, 96250);
  }
  
  public b()
  {
    GMTrace.i(12916174618624L, 96233);
    this.gri = new ConcurrentHashMap();
    this.grj = new ConcurrentHashMap();
    this.grk = new ConcurrentHashMap();
    this.grm = new c();
    this.grn = new a();
    this.grl = new d(new ae(new af("AppBrandSimpleImageLoaderDiskIOHandlerThread").ngv.getLooper()));
    GMTrace.o(12916174618624L, 96233);
  }
  
  public static b CT()
  {
    GMTrace.i(12916040400896L, 96232);
    b localb = l.grN;
    GMTrace.o(12916040400896L, 96232);
    return localb;
  }
  
  public static boolean CU()
  {
    GMTrace.i(16084786741248L, 119841);
    boolean bool = com.tencent.mm.compatible.util.f.ty();
    GMTrace.o(16084786741248L, 119841);
    return bool;
  }
  
  public static String R(String paramString1, String paramString2)
  {
    GMTrace.i(12916979924992L, 96239);
    paramString1 = paramString1 + paramString2;
    GMTrace.o(12916979924992L, 96239);
    return paramString1;
  }
  
  public static String hz(String paramString)
  {
    GMTrace.i(12917114142720L, 96240);
    String str = null;
    if (!bg.nm(paramString)) {
      str = g.n(paramString.getBytes());
    }
    GMTrace.o(12917114142720L, 96240);
    return str;
  }
  
  public final String a(ImageView paramImageView, String paramString, Drawable paramDrawable, f paramf)
  {
    GMTrace.i(12916711489536L, 96237);
    paramImageView = a(paramImageView, paramString, paramDrawable, paramf, null);
    GMTrace.o(12916711489536L, 96237);
    return paramImageView;
  }
  
  public final String a(ImageView paramImageView, String paramString, final Drawable paramDrawable, f paramf, e parame)
  {
    GMTrace.i(12916845707264L, 96238);
    if (paramImageView == null)
    {
      GMTrace.o(12916845707264L, 96238);
      return null;
    }
    if (paramImageView != null)
    {
      Object localObject = (String)this.grk.get(Integer.valueOf(paramImageView.hashCode()));
      if (localObject != null)
      {
        localObject = (h)this.grj.get(localObject);
        if (localObject != null)
        {
          localObject = (String)this.gri.get(localObject);
          if (!bg.nm((String)localObject)) {
            this.grj.remove(localObject);
          }
        }
      }
    }
    if (bg.nm(paramString))
    {
      if (paramDrawable != null) {
        paramImageView.setImageDrawable(paramDrawable);
      }
      GMTrace.o(12916845707264L, 96238);
      return null;
    }
    paramDrawable = new j(paramImageView, this)
    {
      public final void CV()
      {
        GMTrace.i(20049578426368L, 149381);
        if ((Da() != null) && (paramDrawable != null)) {
          Da().setImageDrawable(paramDrawable);
        }
        GMTrace.o(20049578426368L, 149381);
      }
    };
    paramString = a(paramDrawable, paramString, paramf, parame);
    if (!paramDrawable.grC) {
      this.grk.put(Integer.valueOf(paramImageView.hashCode()), R(paramDrawable.amf, paramString));
    }
    GMTrace.o(12916845707264L, 96238);
    return paramString;
  }
  
  public final String a(h paramh, String paramString, f paramf)
  {
    GMTrace.i(16865531265024L, 125658);
    paramh = a(paramh, paramString, paramf, null);
    GMTrace.o(16865531265024L, 125658);
    return paramh;
  }
  
  public final String a(final h paramh, final String paramString, final f paramf, final e parame)
  {
    GMTrace.i(12916577271808L, 96236);
    if (paramh == null)
    {
      GMTrace.o(12916577271808L, 96236);
      return null;
    }
    if (bg.nm(paramString))
    {
      paramh.CW();
      GMTrace.o(12916577271808L, 96236);
      return null;
    }
    w.d("MicroMsg.AppBrandSimpleImageLoader", "load before start LoadTask url %s", new Object[] { paramString });
    parame = new k(paramString, paramf, this, this.grm, this.grn, parame, paramh.CX());
    paramf = parame.Dd();
    paramh = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(20049309990912L, 149379);
        Object localObject = b.this.hw(paramf);
        if (localObject != null)
        {
          paramh.j((Bitmap)localObject);
          w.d("MicroMsg.AppBrandSimpleImageLoader", "load already cached, url %s, bitmap %s", new Object[] { paramString, localObject });
          GMTrace.o(20049309990912L, 149379);
          return;
        }
        localObject = parame.Dc();
        b.this.gri.put(paramh, localObject);
        b.this.grj.put(localObject, paramh);
        paramh.CV();
        localObject = parame;
        ((b.k)localObject).grB.grl.post(new b.k.2((b.k)localObject));
        GMTrace.o(20049309990912L, 149379);
      }
    };
    if (af.isMainThread()) {
      paramh.run();
    }
    for (;;)
    {
      GMTrace.o(12916577271808L, 96236);
      return paramf;
      af.t(paramh);
    }
  }
  
  public final Bitmap hw(String paramString)
  {
    GMTrace.i(16865397047296L, 125657);
    paramString = this.grm.hC(paramString);
    if ((paramString == null) || (paramString.isRecycled()))
    {
      GMTrace.o(16865397047296L, 125657);
      return null;
    }
    GMTrace.o(16865397047296L, 125657);
    return paramString;
  }
  
  /* Error */
  public final Bitmap hx(String paramString)
  {
    // Byte code:
    //   0: ldc2_w 328
    //   3: ldc_w 330
    //   6: invokestatic 83	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: aload_1
    //   10: invokestatic 202	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
    //   13: ifeq +14 -> 27
    //   16: ldc2_w 328
    //   19: ldc_w 330
    //   22: invokestatic 121	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   25: aconst_null
    //   26: areturn
    //   27: aload_0
    //   28: getfield 138	com/tencent/mm/modelappbrand/a/b:grm	Lcom/tencent/mm/modelappbrand/a/b$i;
    //   31: aload_1
    //   32: invokeinterface 317 2 0
    //   37: astore_3
    //   38: aload_3
    //   39: ifnull +14 -> 53
    //   42: ldc2_w 328
    //   45: ldc_w 330
    //   48: invokestatic 121	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   51: aload_3
    //   52: areturn
    //   53: aload_1
    //   54: ldc_w 332
    //   57: invokevirtual 335	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   60: istore_2
    //   61: iload_2
    //   62: ifeq +91 -> 153
    //   65: new 337	java/io/FileInputStream
    //   68: dup
    //   69: aload_1
    //   70: ldc_w 332
    //   73: ldc_w 339
    //   76: invokevirtual 342	java/lang/String:replaceFirst	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   79: invokespecial 343	java/io/FileInputStream:<init>	(Ljava/lang/String;)V
    //   82: astore_3
    //   83: aload_3
    //   84: astore 4
    //   86: aload_3
    //   87: invokestatic 349	com/tencent/mm/sdk/platformtools/d:decodeStream	(Ljava/io/InputStream;)Landroid/graphics/Bitmap;
    //   90: astore 5
    //   92: aload 5
    //   94: ifnull +18 -> 112
    //   97: aload_3
    //   98: astore 4
    //   100: aload_0
    //   101: getfield 138	com/tencent/mm/modelappbrand/a/b:grm	Lcom/tencent/mm/modelappbrand/a/b$i;
    //   104: aload_1
    //   105: aload 5
    //   107: invokeinterface 352 3 0
    //   112: aload_3
    //   113: invokestatic 355	com/tencent/mm/sdk/platformtools/bg:g	(Ljava/io/Closeable;)V
    //   116: ldc2_w 328
    //   119: ldc_w 330
    //   122: invokestatic 121	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   125: aload 5
    //   127: areturn
    //   128: astore_1
    //   129: ldc_w 278
    //   132: ldc_w 357
    //   135: invokestatic 360	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   138: aconst_null
    //   139: invokestatic 355	com/tencent/mm/sdk/platformtools/bg:g	(Ljava/io/Closeable;)V
    //   142: ldc2_w 328
    //   145: ldc_w 330
    //   148: invokestatic 121	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   151: aconst_null
    //   152: areturn
    //   153: aload_0
    //   154: getfield 141	com/tencent/mm/modelappbrand/a/b:grn	Lcom/tencent/mm/modelappbrand/a/b$g;
    //   157: aload_1
    //   158: invokestatic 362	com/tencent/mm/modelappbrand/a/b:hz	(Ljava/lang/String;)Ljava/lang/String;
    //   161: invokeinterface 366 2 0
    //   166: astore_3
    //   167: goto -84 -> 83
    //   170: astore_1
    //   171: aconst_null
    //   172: astore_3
    //   173: aload_3
    //   174: astore 4
    //   176: ldc_w 278
    //   179: aload_1
    //   180: ldc_w 368
    //   183: iconst_0
    //   184: anewarray 4	java/lang/Object
    //   187: invokestatic 372	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   190: aload_3
    //   191: invokestatic 355	com/tencent/mm/sdk/platformtools/bg:g	(Ljava/io/Closeable;)V
    //   194: ldc2_w 328
    //   197: ldc_w 330
    //   200: invokestatic 121	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   203: aconst_null
    //   204: areturn
    //   205: astore_1
    //   206: aconst_null
    //   207: astore 4
    //   209: aload 4
    //   211: invokestatic 355	com/tencent/mm/sdk/platformtools/bg:g	(Ljava/io/Closeable;)V
    //   214: aload_1
    //   215: athrow
    //   216: astore_1
    //   217: goto -8 -> 209
    //   220: astore_1
    //   221: goto -48 -> 173
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	224	0	this	b
    //   0	224	1	paramString	String
    //   60	2	2	bool	boolean
    //   37	154	3	localObject1	Object
    //   84	126	4	localObject2	Object
    //   90	36	5	localBitmap	Bitmap
    // Exception table:
    //   from	to	target	type
    //   65	83	128	java/io/FileNotFoundException
    //   53	61	170	java/lang/Exception
    //   65	83	170	java/lang/Exception
    //   129	138	170	java/lang/Exception
    //   153	167	170	java/lang/Exception
    //   53	61	205	finally
    //   65	83	205	finally
    //   129	138	205	finally
    //   153	167	205	finally
    //   86	92	216	finally
    //   100	112	216	finally
    //   176	190	216	finally
    //   86	92	220	java/lang/Exception
    //   100	112	220	java/lang/Exception
  }
  
  public final String hy(String paramString)
  {
    GMTrace.i(17773782630400L, 132425);
    if (bg.nm(paramString))
    {
      GMTrace.o(17773782630400L, 132425);
      return null;
    }
    paramString = a(new b(), paramString, null);
    GMTrace.o(17773782630400L, 132425);
    return paramString;
  }
  
  private static final class a
    implements b.g
  {
    public a()
    {
      GMTrace.i(12924496117760L, 96295);
      GMTrace.o(12924496117760L, 96295);
    }
    
    public final OutputStream hA(String paramString)
    {
      GMTrace.i(12924630335488L, 96296);
      Object localObject = b.gro + paramString;
      try
      {
        localObject = new FileOutputStream((String)localObject);
        GMTrace.o(12924630335488L, 96296);
        return (OutputStream)localObject;
      }
      catch (IOException localIOException)
      {
        w.printErrStackTrace("MicroMsg.AppBrandSimpleImageLoader.DefaultDiskCache", localIOException, "openWrite fileName %s", new Object[] { paramString });
        GMTrace.o(12924630335488L, 96296);
      }
      return null;
    }
    
    public final boolean hB(String paramString)
    {
      GMTrace.i(12924898770944L, 96298);
      if ((!bg.nm(paramString)) && (com.tencent.mm.loader.stub.b.deleteFile(b.gro + paramString)))
      {
        GMTrace.o(12924898770944L, 96298);
        return true;
      }
      GMTrace.o(12924898770944L, 96298);
      return false;
    }
    
    public final InputStream openRead(String paramString)
    {
      GMTrace.i(12924764553216L, 96297);
      Object localObject = b.gro + paramString;
      try
      {
        localObject = new FileInputStream((String)localObject);
        GMTrace.o(12924764553216L, 96297);
        return (InputStream)localObject;
      }
      catch (IOException localIOException)
      {
        w.d("MicroMsg.AppBrandSimpleImageLoader.DefaultDiskCache", "openRead fileName %s, e %s", new Object[] { paramString, localIOException });
        GMTrace.o(12924764553216L, 96297);
      }
      return null;
    }
  }
  
  public static class b
    implements b.h
  {
    public b()
    {
      GMTrace.i(15657034842112L, 116654);
      GMTrace.o(15657034842112L, 116654);
    }
    
    public final void CV()
    {
      GMTrace.i(12921945980928L, 96276);
      GMTrace.o(12921945980928L, 96276);
    }
    
    public final void CW()
    {
      GMTrace.i(12922214416384L, 96278);
      GMTrace.o(12922214416384L, 96278);
    }
    
    public final String CX()
    {
      GMTrace.i(12922348634112L, 96279);
      GMTrace.o(12922348634112L, 96279);
      return "DefaultLoadTarget";
    }
    
    public void j(Bitmap paramBitmap)
    {
      GMTrace.i(12922080198656L, 96277);
      GMTrace.o(12922080198656L, 96277);
    }
  }
  
  public static final class c
    implements b.i
  {
    public final com.tencent.mm.a.f<String, Reference<Bitmap>> gru;
    
    public c()
    {
      GMTrace.i(12919932715008L, 96261);
      this.gru = new com.tencent.mm.a.f(31457280)
      {
        private final Map<Reference<Bitmap>, Integer> grv;
        
        public final void a(f.a<String, Reference<Bitmap>> paramAnonymousa)
        {
          GMTrace.i(12921409110016L, 96272);
          w.d("MicroMsg.AppBrandSimpleImageLoader.DefaultMemoryCache", "clear(OnClearListener)");
          super.a(paramAnonymousa);
          this.grv.clear();
          GMTrace.o(12921409110016L, 96272);
        }
        
        public final void clear()
        {
          GMTrace.i(12921274892288L, 96271);
          w.d("MicroMsg.AppBrandSimpleImageLoader.DefaultMemoryCache", "clear");
          super.clear();
          this.grv.clear();
          GMTrace.o(12921274892288L, 96271);
        }
      };
      GMTrace.o(12919932715008L, 96261);
    }
    
    public final void b(String paramString, Bitmap paramBitmap)
    {
      GMTrace.i(12920201150464L, 96263);
      if ((bg.nm(paramString)) || (paramBitmap == null))
      {
        GMTrace.o(12920201150464L, 96263);
        return;
      }
      w.d("MicroMsg.AppBrandSimpleImageLoader.DefaultMemoryCache", "put, key %s, bmp %s", new Object[] { paramString, paramBitmap });
      this.gru.put(paramString, new SoftReference(paramBitmap));
      GMTrace.o(12920201150464L, 96263);
    }
    
    public final void g(Bitmap paramBitmap)
    {
      GMTrace.i(12920335368192L, 96264);
      w.d("MicroMsg.AppBrandSimpleImageLoader.DefaultMemoryCache", "release, bmp %s", new Object[] { paramBitmap });
      if (paramBitmap != null) {
        paramBitmap.isRecycled();
      }
      GMTrace.o(12920335368192L, 96264);
    }
    
    public final Bitmap hC(String paramString)
    {
      GMTrace.i(12920066932736L, 96262);
      if (bg.nm(paramString))
      {
        GMTrace.o(12920066932736L, 96262);
        return null;
      }
      Object localObject = (Reference)this.gru.get(paramString);
      if (localObject == null)
      {
        GMTrace.o(12920066932736L, 96262);
        return null;
      }
      localObject = (Bitmap)((Reference)localObject).get();
      if ((localObject == null) || (((Bitmap)localObject).isRecycled()))
      {
        this.gru.remove(paramString);
        GMTrace.o(12920066932736L, 96262);
        return null;
      }
      GMTrace.o(12920066932736L, 96262);
      return (Bitmap)localObject;
    }
  }
  
  private static final class d
  {
    private final ae grx;
    final Map<String, List<a>> gry;
    final Map<String, Boolean> grz;
    
    public d(ae paramae)
    {
      GMTrace.i(12912148086784L, 96203);
      this.gry = new HashMap();
      this.grz = new HashMap();
      this.grx = paramae;
      GMTrace.o(12912148086784L, 96203);
    }
    
    final void a(String paramString, a parama)
    {
      GMTrace.i(12912550739968L, 96206);
      if ((bg.nm(paramString)) || (parama == null))
      {
        GMTrace.o(12912550739968L, 96206);
        return;
      }
      paramString = (List)this.gry.get(paramString);
      if (paramString == null)
      {
        GMTrace.o(12912550739968L, 96206);
        return;
      }
      paramString.remove(parama);
      GMTrace.o(12912550739968L, 96206);
    }
    
    final void hD(String paramString)
    {
      GMTrace.i(12912282304512L, 96204);
      if (bg.nm(paramString))
      {
        GMTrace.o(12912282304512L, 96204);
        return;
      }
      paramString = (List)this.gry.remove(paramString);
      if (bg.cc(paramString))
      {
        GMTrace.o(12912282304512L, 96204);
        return;
      }
      paramString = paramString.iterator();
      while (paramString.hasNext()) {
        ((a)paramString.next()).CY();
      }
      GMTrace.o(12912282304512L, 96204);
    }
    
    final void hE(String paramString)
    {
      GMTrace.i(12912416522240L, 96205);
      if (bg.nm(paramString))
      {
        GMTrace.o(12912416522240L, 96205);
        return;
      }
      this.grz.remove(paramString);
      GMTrace.o(12912416522240L, 96205);
    }
    
    final void hF(String paramString)
    {
      GMTrace.i(12912684957696L, 96207);
      if (bg.nm(paramString))
      {
        GMTrace.o(12912684957696L, 96207);
        return;
      }
      paramString = (List)this.gry.remove(paramString);
      if (!bg.cc(paramString))
      {
        Iterator localIterator = paramString.iterator();
        while (localIterator.hasNext()) {
          ((a)localIterator.next()).CZ();
        }
        paramString.clear();
      }
      GMTrace.o(12912684957696L, 96207);
    }
    
    final void post(Runnable paramRunnable)
    {
      GMTrace.i(12912819175424L, 96208);
      this.grx.post(paramRunnable);
      GMTrace.o(12912819175424L, 96208);
    }
    
    static abstract interface a
    {
      public abstract void CY();
      
      public abstract void CZ();
    }
  }
  
  public static abstract interface e
  {
    public abstract Bitmap e(InputStream paramInputStream);
  }
  
  public static abstract interface f
  {
    public abstract String CX();
    
    public abstract Bitmap k(Bitmap paramBitmap);
  }
  
  public static abstract interface g
  {
    public abstract OutputStream hA(String paramString);
    
    public abstract boolean hB(String paramString);
    
    public abstract InputStream openRead(String paramString);
  }
  
  public static abstract interface h
  {
    public abstract void CV();
    
    public abstract void CW();
    
    public abstract String CX();
    
    public abstract void j(Bitmap paramBitmap);
  }
  
  public static abstract interface i
  {
    public abstract void b(String paramString, Bitmap paramBitmap);
    
    public abstract void g(Bitmap paramBitmap);
    
    public abstract Bitmap hC(String paramString);
  }
  
  private static class j
    implements b.h
  {
    public final String amf;
    private final WeakReference<ImageView> grA;
    private final b grB;
    boolean grC;
    
    public j(ImageView paramImageView, b paramb)
    {
      GMTrace.i(12913892917248L, 96216);
      this.grC = false;
      this.grA = new WeakReference(paramImageView);
      this.grB = paramb;
      this.amf = ("ImageView#" + paramImageView.hashCode());
      GMTrace.o(12913892917248L, 96216);
    }
    
    private void Db()
    {
      GMTrace.i(12914027134976L, 96217);
      if (this.grA.get() != null) {
        this.grB.grk.remove(Integer.valueOf(((ImageView)this.grA.get()).hashCode()));
      }
      GMTrace.o(12914027134976L, 96217);
    }
    
    public void CV()
    {
      GMTrace.i(12914161352704L, 96218);
      GMTrace.o(12914161352704L, 96218);
    }
    
    public final void CW()
    {
      GMTrace.i(12914429788160L, 96220);
      Db();
      GMTrace.o(12914429788160L, 96220);
    }
    
    public final String CX()
    {
      GMTrace.i(12914564005888L, 96221);
      String str = this.amf;
      GMTrace.o(12914564005888L, 96221);
      return str;
    }
    
    final ImageView Da()
    {
      GMTrace.i(12913758699520L, 96215);
      ImageView localImageView = (ImageView)this.grA.get();
      GMTrace.o(12913758699520L, 96215);
      return localImageView;
    }
    
    public final void j(Bitmap paramBitmap)
    {
      GMTrace.i(12914295570432L, 96219);
      Db();
      ImageView localImageView = (ImageView)this.grA.get();
      if (localImageView != null)
      {
        if (!af.isMainThread()) {
          w.j("MicroMsg.AppBrandSimpleImageLoader", "onBitmapLoaded invoke in non-main thread!!!", new Object[0]);
        }
        localImageView.setImageDrawable(new d(localImageView.getResources(), paramBitmap));
      }
      this.grC = true;
      GMTrace.o(12914295570432L, 96219);
    }
  }
  
  private static final class k
    implements b.d.a
  {
    public final b grB;
    final String grD;
    private final b.f grE;
    private final b.i grF;
    private final b.e grG;
    private final String grH;
    public boolean grI;
    final b.g grn;
    
    public k(String paramString1, b.f paramf, b paramb, b.i parami, b.g paramg, b.e parame, String paramString2)
    {
      GMTrace.i(12918590537728L, 96251);
      this.grI = true;
      this.grD = paramString1;
      this.grE = paramf;
      this.grB = paramb;
      this.grF = parami;
      this.grn = paramg;
      this.grG = parame;
      this.grH = paramString2;
      GMTrace.o(12918590537728L, 96251);
    }
    
    /* Error */
    private Bitmap Df()
    {
      // Byte code:
      //   0: aconst_null
      //   1: astore_2
      //   2: ldc2_w 75
      //   5: ldc 77
      //   7: invokestatic 48	com/tencent/gmtrace/GMTrace:i	(JI)V
      //   10: invokestatic 81	com/tencent/mm/modelappbrand/a/b:CU	()Z
      //   13: ifne +18 -> 31
      //   16: ldc 83
      //   18: ldc 85
      //   20: invokestatic 91	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;)V
      //   23: new 93	com/tencent/mm/modelappbrand/a/c$b
      //   26: dup
      //   27: invokespecial 94	com/tencent/mm/modelappbrand/a/c$b:<init>	()V
      //   30: athrow
      //   31: aload_0
      //   32: getfield 52	com/tencent/mm/modelappbrand/a/b$k:grD	Ljava/lang/String;
      //   35: ifnull +124 -> 159
      //   38: aload_0
      //   39: getfield 52	com/tencent/mm/modelappbrand/a/b$k:grD	Ljava/lang/String;
      //   42: ldc 96
      //   44: invokevirtual 102	java/lang/String:startsWith	(Ljava/lang/String;)Z
      //   47: ifeq +112 -> 159
      //   50: new 104	java/io/FileInputStream
      //   53: dup
      //   54: aload_0
      //   55: getfield 52	com/tencent/mm/modelappbrand/a/b$k:grD	Ljava/lang/String;
      //   58: ldc 96
      //   60: ldc 106
      //   62: invokevirtual 110	java/lang/String:replaceFirst	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
      //   65: invokespecial 113	java/io/FileInputStream:<init>	(Ljava/lang/String;)V
      //   68: astore_1
      //   69: aload_1
      //   70: ifnull +238 -> 308
      //   73: aload_0
      //   74: aload_1
      //   75: invokespecial 117	com/tencent/mm/modelappbrand/a/b$k:f	(Ljava/io/InputStream;)Landroid/graphics/Bitmap;
      //   78: astore_1
      //   79: aload_1
      //   80: ifnull +205 -> 285
      //   83: aload_1
      //   84: invokevirtual 122	android/graphics/Bitmap:isRecycled	()Z
      //   87: ifne +198 -> 285
      //   90: ldc 83
      //   92: ldc 124
      //   94: iconst_3
      //   95: anewarray 4	java/lang/Object
      //   98: dup
      //   99: iconst_0
      //   100: aload_1
      //   101: aastore
      //   102: dup
      //   103: iconst_1
      //   104: aload_1
      //   105: invokestatic 130	android/support/v4/b/a:b	(Landroid/graphics/Bitmap;)I
      //   108: sipush 1024
      //   111: idiv
      //   112: invokestatic 136	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   115: aastore
      //   116: dup
      //   117: iconst_2
      //   118: aload_0
      //   119: getfield 52	com/tencent/mm/modelappbrand/a/b$k:grD	Ljava/lang/String;
      //   122: aastore
      //   123: invokestatic 139	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
      //   126: ldc2_w 75
      //   129: ldc 77
      //   131: invokestatic 67	com/tencent/gmtrace/GMTrace:o	(JI)V
      //   134: aload_1
      //   135: areturn
      //   136: astore_1
      //   137: ldc 83
      //   139: aload_1
      //   140: ldc -115
      //   142: iconst_0
      //   143: anewarray 4	java/lang/Object
      //   146: invokestatic 145	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
      //   149: ldc2_w 75
      //   152: ldc 77
      //   154: invokestatic 67	com/tencent/gmtrace/GMTrace:o	(JI)V
      //   157: aconst_null
      //   158: areturn
      //   159: aload_0
      //   160: getfield 60	com/tencent/mm/modelappbrand/a/b$k:grn	Lcom/tencent/mm/modelappbrand/a/b$g;
      //   163: aload_0
      //   164: getfield 52	com/tencent/mm/modelappbrand/a/b$k:grD	Ljava/lang/String;
      //   167: invokestatic 149	com/tencent/mm/modelappbrand/a/b:hz	(Ljava/lang/String;)Ljava/lang/String;
      //   170: invokeinterface 155 2 0
      //   175: astore_3
      //   176: aload_3
      //   177: astore_1
      //   178: aload_3
      //   179: ifnonnull -110 -> 69
      //   182: ldc 83
      //   184: ldc -99
      //   186: iconst_1
      //   187: anewarray 4	java/lang/Object
      //   190: dup
      //   191: iconst_0
      //   192: aload_0
      //   193: getfield 50	com/tencent/mm/modelappbrand/a/b$k:grI	Z
      //   196: invokestatic 162	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
      //   199: aastore
      //   200: invokestatic 139	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
      //   203: aload_0
      //   204: getfield 50	com/tencent/mm/modelappbrand/a/b$k:grI	Z
      //   207: ifeq +21 -> 228
      //   210: new 17	com/tencent/mm/modelappbrand/a/b$k$4
      //   213: dup
      //   214: aload_0
      //   215: invokespecial 165	com/tencent/mm/modelappbrand/a/b$k$4:<init>	(Lcom/tencent/mm/modelappbrand/a/b$k;)V
      //   218: ldc -89
      //   220: invokestatic 173	com/tencent/mm/sdk/f/e:post	(Ljava/lang/Runnable;Ljava/lang/String;)V
      //   223: aload_3
      //   224: astore_1
      //   225: goto -156 -> 69
      //   228: aload_0
      //   229: getfield 56	com/tencent/mm/modelappbrand/a/b$k:grB	Lcom/tencent/mm/modelappbrand/a/b;
      //   232: getfield 177	com/tencent/mm/modelappbrand/a/b:grl	Lcom/tencent/mm/modelappbrand/a/b$d;
      //   235: aload_0
      //   236: getfield 52	com/tencent/mm/modelappbrand/a/b$k:grD	Ljava/lang/String;
      //   239: invokestatic 149	com/tencent/mm/modelappbrand/a/b:hz	(Ljava/lang/String;)Ljava/lang/String;
      //   242: invokevirtual 182	com/tencent/mm/modelappbrand/a/b$d:hF	(Ljava/lang/String;)V
      //   245: aload_0
      //   246: getfield 56	com/tencent/mm/modelappbrand/a/b$k:grB	Lcom/tencent/mm/modelappbrand/a/b;
      //   249: getfield 177	com/tencent/mm/modelappbrand/a/b:grl	Lcom/tencent/mm/modelappbrand/a/b$d;
      //   252: aload_0
      //   253: getfield 52	com/tencent/mm/modelappbrand/a/b$k:grD	Ljava/lang/String;
      //   256: invokestatic 149	com/tencent/mm/modelappbrand/a/b:hz	(Ljava/lang/String;)Ljava/lang/String;
      //   259: invokevirtual 185	com/tencent/mm/modelappbrand/a/b$d:hE	(Ljava/lang/String;)V
      //   262: aload_3
      //   263: astore_1
      //   264: goto -195 -> 69
      //   267: astore_1
      //   268: ldc 83
      //   270: aload_1
      //   271: ldc -69
      //   273: iconst_0
      //   274: anewarray 4	java/lang/Object
      //   277: invokestatic 145	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
      //   280: aload_2
      //   281: astore_1
      //   282: goto -203 -> 79
      //   285: ldc 83
      //   287: ldc -67
      //   289: iconst_1
      //   290: anewarray 4	java/lang/Object
      //   293: dup
      //   294: iconst_0
      //   295: aload_1
      //   296: aastore
      //   297: invokestatic 139	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
      //   300: new 191	com/tencent/mm/modelappbrand/a/c$a
      //   303: dup
      //   304: invokespecial 192	com/tencent/mm/modelappbrand/a/c$a:<init>	()V
      //   307: athrow
      //   308: ldc2_w 75
      //   311: ldc 77
      //   313: invokestatic 67	com/tencent/gmtrace/GMTrace:o	(JI)V
      //   316: aconst_null
      //   317: areturn
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	318	0	this	k
      //   68	67	1	localObject1	Object
      //   136	4	1	localFileNotFoundException	java.io.FileNotFoundException
      //   177	87	1	localObject2	Object
      //   267	4	1	localException	Exception
      //   281	15	1	localObject3	Object
      //   1	280	2	localObject4	Object
      //   175	88	3	localInputStream	InputStream
      // Exception table:
      //   from	to	target	type
      //   50	69	136	java/io/FileNotFoundException
      //   73	79	267	java/lang/Exception
    }
    
    private Bitmap f(InputStream paramInputStream)
    {
      GMTrace.i(12919664279552L, 96259);
      try
      {
        if (this.grG != null)
        {
          localBitmap = this.grG.e(paramInputStream);
          bg.g(paramInputStream);
          GMTrace.o(12919664279552L, 96259);
          return localBitmap;
        }
        Bitmap localBitmap = com.tencent.mm.sdk.platformtools.d.decodeStream(paramInputStream);
        bg.g(paramInputStream);
        GMTrace.o(12919664279552L, 96259);
        return localBitmap;
      }
      finally
      {
        bg.g(paramInputStream);
      }
    }
    
    private void l(Bitmap paramBitmap)
    {
      boolean bool2 = false;
      GMTrace.i(18913559576576L, 140917);
      if ((paramBitmap != null) && (!paramBitmap.isRecycled())) {}
      for (boolean bool1 = true;; bool1 = false)
      {
        w.d("MicroMsg.AppBrandSimpleImageLoader.LoadTask", "postLoadInWorkerThread bitmap ok %b", new Object[] { Boolean.valueOf(bool1) });
        final Bitmap localBitmap = paramBitmap;
        if (this.grE != null)
        {
          localBitmap = paramBitmap;
          if (paramBitmap != null)
          {
            localBitmap = paramBitmap;
            if (!paramBitmap.isRecycled())
            {
              localBitmap = this.grE.k(paramBitmap);
              w.d("MicroMsg.AppBrandSimpleImageLoader.LoadTask", "postLoadInWorkerThread, transform bmp, origin %s, transformed %s", new Object[] { paramBitmap, localBitmap });
              if (localBitmap != paramBitmap) {
                this.grF.g(paramBitmap);
              }
            }
          }
        }
        this.grF.b(Dd(), localBitmap);
        bool1 = bool2;
        if (localBitmap != null)
        {
          bool1 = bool2;
          if (!localBitmap.isRecycled()) {
            bool1 = true;
          }
        }
        w.d("MicroMsg.AppBrandSimpleImageLoader.LoadTask", "postLoadInWorkerThread before post to main thread, bitmap %s, ok %b", new Object[] { localBitmap, Boolean.valueOf(bool1) });
        af.t(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(12922617069568L, 96281);
            b.k localk = b.k.this;
            Object localObject = localBitmap;
            if ((localObject == null) || (((Bitmap)localObject).isRecycled()))
            {
              w.d("MicroMsg.AppBrandSimpleImageLoader.LoadTask", "postLoadInMainThread, onLoadFailed bmp %s", new Object[] { localObject });
              localObject = (b.h)localk.grB.grj.remove(localk.Dc());
              if (localObject != null)
              {
                ((b.h)localObject).CW();
                localk.grB.gri.remove(localObject);
              }
              GMTrace.o(12922617069568L, 96281);
              return;
            }
            w.d("MicroMsg.AppBrandSimpleImageLoader.LoadTask", "postLoadInMainThread, onBitmapLoaded bmp %s", new Object[] { localObject });
            localk.j((Bitmap)localObject);
            GMTrace.o(12922617069568L, 96281);
          }
        });
        GMTrace.o(18913559576576L, 140917);
        return;
      }
    }
    
    public final void CY()
    {
      GMTrace.i(12919127408640L, 96255);
      final Object localObject1 = this.grF.hC(Dd());
      if ((localObject1 != null) && (!((Bitmap)localObject1).isRecycled()))
      {
        w.d("MicroMsg.AppBrandSimpleImageLoader.LoadTask", "before actually doIOJob, same keyForMemory bitmap already exists, key %s", new Object[] { Dd() });
        af.t(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(12911745433600L, 96200);
            b.k.this.j(localObject1);
            GMTrace.o(12911745433600L, 96200);
          }
        });
        GMTrace.o(12919127408640L, 96255);
        return;
      }
      localObject1 = this.grB.grl;
      Object localObject2 = b.hz(this.grD);
      boolean bool;
      b.d locald;
      String str;
      if (bg.nm((String)localObject2))
      {
        bool = false;
        if (!bool) {
          break label232;
        }
        locald = this.grB.grl;
        str = b.hz(this.grD);
        if ((!bg.nm(str)) && (this != null)) {
          break label177;
        }
      }
      for (;;)
      {
        w.d("MicroMsg.AppBrandSimpleImageLoader.LoadTask", "already has job processing, make this job pending, key %s", new Object[] { b.hz(this.grD) });
        GMTrace.o(12919127408640L, 96255);
        return;
        bool = ((b.d)localObject1).grz.containsKey(localObject2);
        break;
        label177:
        localObject2 = (List)locald.gry.get(str);
        localObject1 = localObject2;
        if (localObject2 == null)
        {
          localObject1 = new LinkedList();
          locald.gry.put(str, localObject1);
        }
        ((List)localObject1).add(this);
      }
      label232:
      localObject1 = this.grB.grl;
      localObject2 = b.hz(this.grD);
      if (!bg.nm((String)localObject2)) {
        ((b.d)localObject1).grz.put(localObject2, Boolean.valueOf(true));
      }
      De();
      GMTrace.o(12919127408640L, 96255);
    }
    
    public final void CZ()
    {
      GMTrace.i(12919261626368L, 96256);
      b.h localh = (b.h)this.grB.grj.remove(Dc());
      if (localh != null) {
        this.grB.gri.remove(localh);
      }
      GMTrace.o(12919261626368L, 96256);
    }
    
    public final String Dc()
    {
      GMTrace.i(12918724755456L, 96252);
      String str = b.R(this.grH, Dd());
      GMTrace.o(12918724755456L, 96252);
      return str;
    }
    
    public final String Dd()
    {
      GMTrace.i(12918858973184L, 96253);
      StringBuilder localStringBuilder = new StringBuilder().append(this.grD);
      if (this.grE == null) {}
      for (String str = "";; str = ":transformation:" + this.grE.CX())
      {
        str = str;
        GMTrace.o(12918858973184L, 96253);
        return str;
      }
    }
    
    public final void De()
    {
      GMTrace.i(12918993190912L, 96254);
      try
      {
        Bitmap localBitmap = Df();
        if ((localBitmap != null) && (!localBitmap.isRecycled()))
        {
          this.grB.grl.hE(b.hz(this.grD));
          this.grB.grl.a(b.hz(this.grD), this);
          l(localBitmap);
          this.grB.grl.hD(b.hz(this.grD));
        }
        GMTrace.o(12918993190912L, 96254);
        return;
      }
      catch (c localc)
      {
        w.d("MicroMsg.AppBrandSimpleImageLoader.LoadTask", " doIOJobImpl, exp %s", new Object[] { localc });
        this.grB.grl.hE(b.hz(this.grD));
        this.grB.grl.hF(b.hz(this.grD));
        l(null);
        GMTrace.o(12918993190912L, 96254);
        return;
      }
      catch (IOException localIOException)
      {
        w.printErrStackTrace("MicroMsg.AppBrandSimpleImageLoader.LoadTask", localIOException, " doIOJobImpl, io exp ", new Object[0]);
        this.grB.grl.hE(b.hz(this.grD));
        this.grB.grl.a(b.hz(this.grD), this);
        this.grB.grl.hD(b.hz(this.grD));
        GMTrace.o(12918993190912L, 96254);
      }
    }
    
    public final void j(Bitmap paramBitmap)
    {
      GMTrace.i(12919395844096L, 96257);
      b.h localh = (b.h)this.grB.grj.remove(Dc());
      if (localh != null)
      {
        localh.j(paramBitmap);
        this.grB.gri.remove(localh);
      }
      GMTrace.o(12919395844096L, 96257);
    }
  }
  
  private static final class l
  {
    static final b grN;
    
    static
    {
      GMTrace.i(12915369312256L, 96227);
      grN = new b();
      GMTrace.o(12915369312256L, 96227);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\modelappbrand\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */