package com.tencent.mm.af;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.g;
import com.tencent.mm.kernel.a;
import com.tencent.mm.kernel.h;
import com.tencent.mm.network.b;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.ar;
import com.tencent.mm.sdk.platformtools.ar.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.ak.a;
import com.tencent.mm.y.ak.e;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class m
{
  public static String X(String paramString1, String paramString2)
  {
    GMTrace.i(4540585738240L, 33830);
    if ((paramString1 == null) || (!h.xw().wL()))
    {
      GMTrace.o(4540585738240L, 33830);
      return null;
    }
    paramString1 = x.FG().iC(paramString1);
    if (paramString1.field_brandIconURL != null)
    {
      paramString1 = paramString1.field_brandIconURL;
      GMTrace.o(4540585738240L, 33830);
      return paramString1;
    }
    GMTrace.o(4540585738240L, 33830);
    return paramString2;
  }
  
  public static Bitmap d(String paramString1, String paramString2, int paramInt)
  {
    GMTrace.i(4540183085056L, 33827);
    if (!h.xy().isSDCardAvailable())
    {
      paramString1 = fS(paramInt);
      GMTrace.o(4540183085056L, 33827);
      return paramString1;
    }
    if ((paramString1 == null) || (!h.xw().wL()))
    {
      GMTrace.o(4540183085056L, 33827);
      return null;
    }
    final String str = paramString2;
    if (paramString2 == null)
    {
      paramString2 = X(paramString1, null);
      str = paramString2;
      if (paramString2 == null)
      {
        GMTrace.o(4540183085056L, 33827);
        return null;
      }
    }
    paramString2 = x.FO();
    Object localObject;
    if (paramString2.gxu.containsKey(paramString1))
    {
      localObject = (Bitmap)((WeakReference)paramString2.gxu.get(paramString1)).get();
      if ((localObject == null) || (((Bitmap)localObject).isRecycled()))
      {
        localObject = X(paramString1, str);
        localObject = com.tencent.mm.sdk.platformtools.d.RD(a.iZ(paramString1 + (String)localObject));
        if (localObject == null)
        {
          w.i("MicroMsg.BrandLogic", "not found brand icon local");
          paramString2 = null;
          label182:
          if (paramString2 == null) {
            break label291;
          }
          GMTrace.o(4540183085056L, 33827);
          return paramString2;
        }
        paramString2.e(paramString1, (Bitmap)localObject);
      }
    }
    for (;;)
    {
      paramString2 = (WeakReference)paramString2.gxu.get(paramString1);
      if (paramString2 == null) {
        break;
      }
      paramString2 = (Bitmap)paramString2.get();
      break label182;
      localObject = X(paramString1, str);
      localObject = com.tencent.mm.sdk.platformtools.d.RD(a.iZ(paramString1 + (String)localObject));
      if (localObject == null)
      {
        w.i("MicroMsg.BrandLogic", "not found brand icon local");
        break;
      }
      paramString2.e(paramString1, (Bitmap)localObject);
    }
    label291:
    af.t(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(4529043013632L, 33744);
        m.a locala = x.FO();
        String str1 = this.gxq;
        String str2 = str;
        if ((bg.nm(str1)) || (bg.nm(str2)))
        {
          w.e("MicroMsg.BrandLogic", "pushing for brand " + str1 + ", url " + str2);
          GMTrace.o(4529043013632L, 33744);
          return;
        }
        if (bg.aG(bg.e((Integer)locala.gxt.get(str1))) < 300L)
        {
          w.i("MicroMsg.BrandLogic", "downloading interval less than 5 mins for " + str1);
          GMTrace.o(4529043013632L, 33744);
          return;
        }
        locala.gxt.put(str1, Integer.valueOf((int)bg.Pu()));
        if ((locala.gxv == null) || (locala.gxv.Yi())) {
          locala.gxv = new ar(1, "brand-logic");
        }
        str2 = m.X(str1, str2);
        locala.gxv.c(new m.b(str1, str2));
        GMTrace.o(4529043013632L, 33744);
      }
    });
    GMTrace.o(4540183085056L, 33827);
    return null;
  }
  
  /* Error */
  private static Bitmap fS(int paramInt)
  {
    // Byte code:
    //   0: ldc2_w 155
    //   3: ldc -99
    //   5: invokestatic 25	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   8: iload_0
    //   9: ifgt +13 -> 22
    //   12: ldc2_w 155
    //   15: ldc -99
    //   17: invokestatic 40	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   20: aconst_null
    //   21: areturn
    //   22: new 159	android/graphics/BitmapFactory$Options
    //   25: dup
    //   26: invokespecial 160	android/graphics/BitmapFactory$Options:<init>	()V
    //   29: astore_2
    //   30: aload_2
    //   31: invokestatic 163	com/tencent/mm/sdk/platformtools/d:b	(Landroid/graphics/BitmapFactory$Options;)V
    //   34: invokestatic 169	com/tencent/mm/sdk/platformtools/ab:getContext	()Landroid/content/Context;
    //   37: invokevirtual 175	android/content/Context:getResources	()Landroid/content/res/Resources;
    //   40: iload_0
    //   41: invokevirtual 181	android/content/res/Resources:openRawResource	(I)Ljava/io/InputStream;
    //   44: astore_1
    //   45: aload_1
    //   46: aconst_null
    //   47: aload_2
    //   48: invokestatic 187	android/graphics/BitmapFactory:decodeStream	(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   51: astore_2
    //   52: aload_1
    //   53: ifnull +7 -> 60
    //   56: aload_1
    //   57: invokevirtual 192	java/io/InputStream:close	()V
    //   60: aload_2
    //   61: astore_1
    //   62: aload_2
    //   63: ifnull +16 -> 79
    //   66: aload_2
    //   67: iconst_0
    //   68: aload_2
    //   69: invokevirtual 196	android/graphics/Bitmap:getWidth	()I
    //   72: iconst_1
    //   73: ishr
    //   74: i2f
    //   75: invokestatic 199	com/tencent/mm/sdk/platformtools/d:a	(Landroid/graphics/Bitmap;ZF)Landroid/graphics/Bitmap;
    //   78: astore_1
    //   79: ldc2_w 155
    //   82: ldc -99
    //   84: invokestatic 40	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   87: aload_1
    //   88: areturn
    //   89: astore_1
    //   90: ldc -123
    //   92: aload_1
    //   93: ldc -55
    //   95: iconst_0
    //   96: anewarray 4	java/lang/Object
    //   99: invokestatic 205	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   102: goto -42 -> 60
    //   105: astore_2
    //   106: aconst_null
    //   107: astore_1
    //   108: aload_1
    //   109: ifnull +7 -> 116
    //   112: aload_1
    //   113: invokevirtual 192	java/io/InputStream:close	()V
    //   116: aload_2
    //   117: athrow
    //   118: astore_1
    //   119: ldc -123
    //   121: aload_1
    //   122: ldc -55
    //   124: iconst_0
    //   125: anewarray 4	java/lang/Object
    //   128: invokestatic 205	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   131: goto -15 -> 116
    //   134: astore_2
    //   135: goto -27 -> 108
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	138	0	paramInt	int
    //   44	44	1	localObject1	Object
    //   89	4	1	localIOException1	java.io.IOException
    //   107	6	1	localObject2	Object
    //   118	4	1	localIOException2	java.io.IOException
    //   29	40	2	localObject3	Object
    //   105	12	2	localObject4	Object
    //   134	1	2	localObject5	Object
    // Exception table:
    //   from	to	target	type
    //   56	60	89	java/io/IOException
    //   34	45	105	finally
    //   112	116	118	java/io/IOException
    //   45	52	134	finally
  }
  
  public static Bitmap iX(String paramString)
  {
    boolean bool = false;
    GMTrace.i(4540048867328L, 33826);
    if ((bg.nm(paramString)) || (!h.xy().isSDCardAvailable()) || (!h.xw().wL()))
    {
      GMTrace.o(4540048867328L, 33826);
      return null;
    }
    a locala = x.FO();
    String str = String.format("%s%f", new Object[] { paramString, Float.valueOf(1.5F) });
    Bitmap localBitmap1;
    if (locala.gxu.containsKey(str))
    {
      Bitmap localBitmap2 = (Bitmap)((WeakReference)locala.gxu.get(str)).get();
      if (localBitmap2 != null)
      {
        localBitmap1 = localBitmap2;
        if (!localBitmap2.isRecycled()) {}
      }
      else
      {
        localBitmap1 = BackwardSupportUtil.b.c(paramString, 1.5F);
        locala.gxu.remove(str);
        locala.gxu.put(str, new WeakReference(localBitmap1));
      }
    }
    for (;;)
    {
      if (localBitmap1 == null) {
        bool = true;
      }
      w.i("MicroMsg.BrandLogic", "get verify user icon = %s, is null ? %s", new Object[] { paramString, String.valueOf(bool) });
      GMTrace.o(4540048867328L, 33826);
      return localBitmap1;
      localBitmap1 = BackwardSupportUtil.b.c(paramString, 1.5F);
      locala.gxu.put(str, new WeakReference(localBitmap1));
    }
  }
  
  public static Bitmap iY(String paramString)
  {
    GMTrace.i(4540317302784L, 33828);
    if (!h.xy().isSDCardAvailable())
    {
      paramString = fS(0);
      GMTrace.o(4540317302784L, 33828);
      return paramString;
    }
    if ((paramString == null) || (!h.xw().wL()))
    {
      GMTrace.o(4540317302784L, 33828);
      return null;
    }
    Object localObject = x.FO();
    if (((a)localObject).gxu.containsKey(paramString))
    {
      localObject = (Bitmap)((WeakReference)((a)localObject).gxu.get(paramString)).get();
      if (localObject != null)
      {
        paramString = (String)localObject;
        if (!((Bitmap)localObject).isRecycled()) {}
      }
      else
      {
        GMTrace.o(4540317302784L, 33828);
        return null;
      }
    }
    else
    {
      paramString = null;
    }
    GMTrace.o(4540317302784L, 33828);
    return paramString;
  }
  
  public static final class a
  {
    List<a> gxs;
    Map<String, Integer> gxt;
    Map<String, WeakReference<Bitmap>> gxu;
    ar gxv;
    
    public a()
    {
      GMTrace.i(4552396898304L, 33918);
      this.gxs = new ArrayList();
      this.gxt = new HashMap();
      this.gxu = new HashMap();
      this.gxv = null;
      GMTrace.o(4552396898304L, 33918);
    }
    
    public static String iZ(String paramString)
    {
      GMTrace.i(4552933769216L, 33922);
      if (h.xw().wL())
      {
        paramString = ((o)h.h(o.class)).zh() + "/brand_" + g.n(paramString.getBytes());
        GMTrace.o(4552933769216L, 33922);
        return paramString;
      }
      GMTrace.o(4552933769216L, 33922);
      return "";
    }
    
    public final void FA()
    {
      GMTrace.i(4552799551488L, 33921);
      this.gxs.clear();
      GMTrace.o(4552799551488L, 33921);
    }
    
    public final void a(a parama)
    {
      GMTrace.i(4552531116032L, 33919);
      this.gxs.add(parama);
      GMTrace.o(4552531116032L, 33919);
    }
    
    public final void b(a parama)
    {
      GMTrace.i(4552665333760L, 33920);
      this.gxs.remove(parama);
      GMTrace.o(4552665333760L, 33920);
    }
    
    final void e(String paramString, Bitmap paramBitmap)
    {
      GMTrace.i(4553067986944L, 33923);
      Bitmap localBitmap1;
      if (this.gxu.containsKey(paramString)) {
        localBitmap1 = (Bitmap)((WeakReference)this.gxu.get(paramString)).get();
      }
      for (;;)
      {
        Bitmap localBitmap3;
        if (localBitmap1 != null)
        {
          localBitmap3 = localBitmap1;
          if (!localBitmap1.isRecycled()) {
            break label113;
          }
        }
        try
        {
          localBitmap1 = Bitmap.createScaledBitmap(paramBitmap, 128, 128, true);
          localBitmap1 = com.tencent.mm.sdk.platformtools.d.a(localBitmap1, true, localBitmap1.getWidth() >> 1);
          this.gxu.remove(paramString);
          this.gxu.put(paramString, new WeakReference(localBitmap1));
          localBitmap3 = localBitmap1;
          label113:
          if (localBitmap3 == paramBitmap)
          {
            GMTrace.o(4553067986944L, 33923);
            return;
            localBitmap1 = null;
          }
        }
        catch (OutOfMemoryError localOutOfMemoryError)
        {
          for (;;)
          {
            Bitmap localBitmap2 = paramBitmap;
          }
          w.i("MicroMsg.BrandLogic", "recycle bitmap:%s", new Object[] { paramBitmap.toString() });
          paramBitmap.recycle();
          GMTrace.o(4553067986944L, 33923);
        }
      }
    }
    
    public static abstract interface a
    {
      public abstract void ja(String paramString);
    }
  }
  
  private static final class b
    implements ar.a
  {
    public byte[] gso;
    private final String gxw;
    private final String url;
    
    public b(String paramString1, String paramString2)
    {
      GMTrace.i(4536827641856L, 33802);
      this.gso = null;
      this.gxw = paramString1;
      this.url = paramString2;
      GMTrace.o(4536827641856L, 33802);
    }
    
    public final boolean Dj()
    {
      GMTrace.i(4536961859584L, 33803);
      if ((bg.nm(this.gxw)) || (bg.nm(this.url)))
      {
        GMTrace.o(4536961859584L, 33803);
        return false;
      }
      Object localObject1;
      Object localObject2;
      try
      {
        ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
        localObject1 = b.k(this.url, 3000, 5000);
        if (localObject1 == null)
        {
          GMTrace.o(4536961859584L, 33803);
          return false;
        }
        localObject2 = new byte['Ѐ'];
        for (;;)
        {
          int i = ((InputStream)localObject1).read((byte[])localObject2);
          if (i == -1) {
            break;
          }
          localByteArrayOutputStream.write((byte[])localObject2, 0, i);
        }
        ((InputStream)localObject1).close();
      }
      catch (Exception localException1)
      {
        w.e("MicroMsg.BrandLogic", "exception:%s", new Object[] { bg.f(localException1) });
        w.e("MicroMsg.BrandLogic", "get url:" + this.url + " failed.");
        this.gso = null;
        GMTrace.o(4536961859584L, 33803);
        return false;
      }
      this.gso = localException1.toByteArray();
      localException1.close();
      if (bg.bq(this.gso))
      {
        w.e("MicroMsg.BrandLogic", "imgBuff null brand:" + this.gxw);
        GMTrace.o(4536961859584L, 33803);
        return false;
      }
      m.a locala;
      String str;
      if (h.xw().wL())
      {
        ak.a.gmY.aI(this.gso.length, 0);
        locala = x.FO();
        localObject1 = this.gxw;
        str = this.url;
        localObject2 = this.gso;
      }
      try
      {
        str = (String)localObject1 + str;
        localObject2 = com.tencent.mm.sdk.platformtools.d.bg((byte[])localObject2);
        com.tencent.mm.sdk.platformtools.d.a((Bitmap)localObject2, 100, Bitmap.CompressFormat.PNG, m.a.iZ(str), false);
        locala.e((String)localObject1, (Bitmap)localObject2);
        w.i("MicroMsg.BrandLogic", "update brand icon for  " + (String)localObject1 + ", done");
        locala.gxt.remove(localObject1);
        GMTrace.o(4536961859584L, 33803);
        return true;
      }
      catch (Exception localException2)
      {
        for (;;)
        {
          w.e("MicroMsg.BrandLogic", "exception:%s", new Object[] { bg.f(localException2) });
        }
      }
    }
    
    public final boolean Dk()
    {
      GMTrace.i(4537096077312L, 33804);
      m.a locala = x.FO();
      String str = this.gxw;
      int i = 0;
      try
      {
        while (i < locala.gxs.size())
        {
          ((m.a.a)locala.gxs.get(i)).ja(str);
          i += 1;
        }
        return false;
      }
      catch (Exception localException)
      {
        w.e("MicroMsg.BrandLogic", "exception:%s", new Object[] { bg.f(localException) });
        GMTrace.o(4537096077312L, 33804);
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\af\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */