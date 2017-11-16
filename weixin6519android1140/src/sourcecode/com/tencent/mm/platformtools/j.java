package com.tencent.mm.platformtools;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.util.DisplayMetrics;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.sdk.platformtools.MMBitmapFactory.DecodeResultLogger;
import com.tencent.mm.sdk.platformtools.MMBitmapFactory.KVStatHelper;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ar;
import com.tencent.mm.sdk.platformtools.ar.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.d;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.ak.a;
import com.tencent.mm.y.ak.e;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Vector;
import junit.framework.Assert;

public final class j
{
  private static Vector<WeakReference<a>> gsw;
  public static LinkedList<a> hiX;
  
  static
  {
    GMTrace.i(459427282944L, 3423);
    gsw = new Vector();
    hiX = new LinkedList();
    GMTrace.o(459427282944L, 3423);
  }
  
  public static Bitmap a(i parami)
  {
    GMTrace.i(458487758848L, 3416);
    if (!b(parami))
    {
      GMTrace.o(458487758848L, 3416);
      return null;
    }
    if (!h.xy().xk())
    {
      parami = parami.Ps();
      GMTrace.o(458487758848L, 3416);
      return parami;
    }
    if (parami.Pr())
    {
      parami = b.a(b.hiY, parami);
      GMTrace.o(458487758848L, 3416);
      return parami;
    }
    parami = b.b(b.hiY, parami);
    GMTrace.o(458487758848L, 3416);
    return parami;
  }
  
  public static boolean a(a parama)
  {
    GMTrace.i(458085105664L, 3413);
    boolean bool = gsw.add(new WeakReference(parama));
    GMTrace.o(458085105664L, 3413);
    return bool;
  }
  
  public static boolean b(i parami)
  {
    GMTrace.i(458890412032L, 3419);
    if ((parami == null) || (bg.nm(parami.Pn())))
    {
      GMTrace.o(458890412032L, 3419);
      return false;
    }
    GMTrace.o(458890412032L, 3419);
    return true;
  }
  
  public static boolean b(a parama)
  {
    GMTrace.i(458219323392L, 3414);
    hiX.remove(parama);
    boolean bool = hiX.add(parama);
    GMTrace.o(458219323392L, 3414);
    return bool;
  }
  
  public static boolean c(a parama)
  {
    GMTrace.i(458353541120L, 3415);
    boolean bool = hiX.remove(parama);
    GMTrace.o(458353541120L, 3415);
    return bool;
  }
  
  public static void j(String paramString, Bitmap paramBitmap)
  {
    GMTrace.i(16009759031296L, 119282);
    Vector localVector = new Vector();
    int i = 0;
    if (i < gsw.size())
    {
      WeakReference localWeakReference = (WeakReference)gsw.get(i);
      if (localWeakReference != null)
      {
        a locala = (a)localWeakReference.get();
        if (locala == null) {
          break label76;
        }
        locala.k(paramString, paramBitmap);
      }
      for (;;)
      {
        i += 1;
        break;
        label76:
        localVector.add(localWeakReference);
      }
    }
    gsw.removeAll(localVector);
    GMTrace.o(16009759031296L, 119282);
  }
  
  public static Bitmap l(String paramString, int paramInt1, int paramInt2)
  {
    GMTrace.i(458756194304L, 3418);
    paramString = b.l(paramString, paramInt1, paramInt2);
    GMTrace.o(458756194304L, 3418);
    return paramString;
  }
  
  public static Bitmap nf(String paramString)
  {
    GMTrace.i(458621976576L, 3417);
    paramString = b.nf(paramString);
    GMTrace.o(458621976576L, 3417);
    return paramString;
  }
  
  public static Bitmap ng(String paramString)
  {
    GMTrace.i(19116496781312L, 142429);
    paramString = b.ng(paramString);
    GMTrace.o(19116496781312L, 142429);
    return paramString;
  }
  
  public static abstract interface a
  {
    public abstract void k(String paramString, Bitmap paramBitmap);
  }
  
  private static enum b
  {
    private static DisplayMetrics hjd;
    private Map<String, c> hiZ;
    private Map<String, WeakReference<Bitmap>> hja;
    private ar hjb;
    private ar hjc;
    
    static
    {
      GMTrace.i(468151435264L, 3488);
      hiY = new b("INSTANCE");
      hje = new b[] { hiY };
      hjd = null;
      GMTrace.o(468151435264L, 3488);
    }
    
    private b()
    {
      GMTrace.i(466540822528L, 3476);
      this.hiZ = new HashMap();
      this.hja = new HashMap();
      this.hjb = null;
      this.hjc = null;
      GMTrace.o(466540822528L, 3476);
    }
    
    private void b(i parami, Bitmap paramBitmap)
    {
      GMTrace.i(466943475712L, 3479);
      Assert.assertTrue("picture strategy here must be validity", j.b(parami));
      String str = parami.Pp();
      if (this.hja.containsKey(str)) {}
      for (parami = (Bitmap)((WeakReference)this.hja.get(str)).get();; parami = null)
      {
        if ((parami == null) || (parami.isRecycled()))
        {
          this.hja.remove(str);
          this.hja.put(str, new WeakReference(paramBitmap));
        }
        GMTrace.o(466943475712L, 3479);
        return;
      }
    }
    
    private Bitmap c(i parami)
    {
      GMTrace.i(466675040256L, 3477);
      Assert.assertTrue("picture strategy here must be validity", j.b(parami));
      String str = parami.Pn();
      c localc = (c)this.hiZ.get(str);
      Object localObject = localc;
      if (localc == null) {
        localObject = new c();
      }
      if (((c)localObject).hjh) {
        if (((c)localObject).hji >= 3)
        {
          if (bg.aG(((c)localObject).hjj) < 120L)
          {
            w.w("MicroMsg.MMPictureLogic", "download fail interval less than %d s for %s", new Object[] { Integer.valueOf(120), str });
            GMTrace.o(466675040256L, 3477);
            return null;
          }
          ((c)localObject).hji = 0;
          ((c)localObject).hjh = false;
          ((c)localObject).hjj = ((int)bg.Pu());
          this.hiZ.put(str, localObject);
          label151:
          if (!parami.Pq()) {
            break label387;
          }
          localObject = parami.Pl();
          if (localObject == null) {
            break label315;
          }
        }
      }
      label315:
      for (localObject = ((i.b)localObject).ne(parami.Pm());; localObject = nf(parami.Pm()))
      {
        if (localObject == null) {
          break label328;
        }
        parami = a(parami, (Bitmap)localObject);
        this.hiZ.remove(str);
        GMTrace.o(466675040256L, 3477);
        return parami;
        ((c)localObject).hji += 1;
        break;
        if (bg.aG(((c)localObject).hjj) < 120L)
        {
          w.d("MicroMsg.MMPictureLogic", "downloading interval less than %d s for %s", new Object[] { Integer.valueOf(120), str });
          GMTrace.o(466675040256L, 3477);
          return null;
        }
        ((c)localObject).hji += 1;
        ((c)localObject).hjj = ((int)bg.Pu());
        this.hiZ.put(str, localObject);
        break label151;
      }
      label328:
      if ((this.hjb == null) || (this.hjb.Yi())) {
        this.hjb = new ar(1, "readerapp-pic-logic-download", 3);
      }
      this.hjb.c(new a(parami));
      GMTrace.o(466675040256L, 3477);
      return null;
      label387:
      if ((this.hjc == null) || (this.hjc.Yi())) {
        this.hjc = new ar(1, "readerapp-pic-logic-reader", 1);
      }
      this.hjc.c(new b(parami));
      GMTrace.o(466675040256L, 3477);
      return null;
    }
    
    public static Bitmap l(String paramString, int paramInt1, int paramInt2)
    {
      GMTrace.i(467077693440L, 3480);
      if (bg.nm(paramString))
      {
        w.w("MicroMsg.MMPictureLogic", "error input, path is null");
        GMTrace.o(467077693440L, 3480);
        return null;
      }
      if ((paramInt1 <= 0) || (paramInt2 <= 0))
      {
        w.w("MicroMsg.MMPictureLogic", "error input, targetWidth %d, targetHeight %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
        GMTrace.o(467077693440L, 3480);
        return null;
      }
      MMBitmapFactory.DecodeResultLogger localDecodeResultLogger = new MMBitmapFactory.DecodeResultLogger();
      Bitmap localBitmap = d.a(paramString, paramInt1, paramInt2, localDecodeResultLogger, 0, new int[0]);
      if ((localBitmap == null) && (localDecodeResultLogger.getDecodeResult() >= 2000))
      {
        paramString = MMBitmapFactory.KVStatHelper.getKVStatString(paramString, 8, localDecodeResultLogger);
        g.ork.A(12712, paramString);
      }
      GMTrace.o(467077693440L, 3480);
      return localBitmap;
    }
    
    public static Bitmap nf(String paramString)
    {
      GMTrace.i(467211911168L, 3481);
      if (hjd == null) {
        hjd = ab.getContext().getResources().getDisplayMetrics();
      }
      DisplayMetrics localDisplayMetrics = hjd;
      paramString = l(paramString, localDisplayMetrics.widthPixels, localDisplayMetrics.heightPixels);
      GMTrace.o(467211911168L, 3481);
      return paramString;
    }
    
    public static Bitmap ng(String paramString)
    {
      GMTrace.i(19116362563584L, 142428);
      if (bg.nm(paramString))
      {
        w.w("MicroMsg.MMPictureLogic", "error input, path is null");
        GMTrace.o(19116362563584L, 142428);
        return null;
      }
      MMBitmapFactory.DecodeResultLogger localDecodeResultLogger = new MMBitmapFactory.DecodeResultLogger();
      Bitmap localBitmap = d.a(paramString, 0, 0, localDecodeResultLogger, 0, new int[0]);
      if ((localBitmap == null) && (localDecodeResultLogger.getDecodeResult() >= 2000))
      {
        paramString = MMBitmapFactory.KVStatHelper.getKVStatString(paramString, 8, localDecodeResultLogger);
        g.ork.A(12712, paramString);
      }
      GMTrace.o(19116362563584L, 142428);
      return localBitmap;
    }
    
    protected final Bitmap a(i parami, Bitmap paramBitmap)
    {
      GMTrace.i(466809257984L, 3478);
      Assert.assertTrue("picture strategy here must be validity", j.b(parami));
      Bitmap localBitmap;
      if (paramBitmap != null)
      {
        localBitmap = parami.a(paramBitmap, i.a.hiV, parami.Pm());
        if ((localBitmap != paramBitmap) && (!paramBitmap.isRecycled()))
        {
          w.i("MicroMsg.MMPictureLogic", "recycle bitmap:%s", new Object[] { paramBitmap.toString() });
          paramBitmap.recycle();
        }
        b(parami, localBitmap);
      }
      for (parami = localBitmap;; parami = paramBitmap)
      {
        GMTrace.o(466809257984L, 3478);
        return parami;
        parami.a(i.a.hiV, null);
      }
    }
    
    private static final class a
      implements ar.a
    {
      private Bitmap gsp;
      private int hjf;
      private i hjg;
      
      public a(i parami)
      {
        GMTrace.i(469627830272L, 3499);
        this.hjf = 0;
        this.gsp = null;
        if (!j.b(parami)) {
          throw new IllegalArgumentException("from net, picture strategy here must be validity");
        }
        this.hjg = parami;
        GMTrace.o(469627830272L, 3499);
      }
      
      /* Error */
      public final boolean Dj()
      {
        // Byte code:
        //   0: ldc2_w 58
        //   3: sipush 3500
        //   6: invokestatic 31	com/tencent/gmtrace/GMTrace:i	(JI)V
        //   9: aload_0
        //   10: getfield 47	com/tencent/mm/platformtools/j$b$a:hjg	Lcom/tencent/mm/platformtools/i;
        //   13: ifnonnull +21 -> 34
        //   16: ldc 61
        //   18: ldc 63
        //   20: invokestatic 69	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
        //   23: ldc2_w 58
        //   26: sipush 3500
        //   29: invokestatic 50	com/tencent/gmtrace/GMTrace:o	(JI)V
        //   32: iconst_1
        //   33: ireturn
        //   34: aconst_null
        //   35: astore 9
        //   37: aconst_null
        //   38: astore 6
        //   40: aconst_null
        //   41: astore_2
        //   42: aconst_null
        //   43: astore 10
        //   45: aconst_null
        //   46: astore_3
        //   47: aconst_null
        //   48: astore 4
        //   50: aconst_null
        //   51: astore 8
        //   53: aload_0
        //   54: getfield 47	com/tencent/mm/platformtools/j$b$a:hjg	Lcom/tencent/mm/platformtools/i;
        //   57: invokeinterface 74 1 0
        //   62: new 76	java/io/File
        //   65: dup
        //   66: aload_0
        //   67: getfield 47	com/tencent/mm/platformtools/j$b$a:hjg	Lcom/tencent/mm/platformtools/i;
        //   70: invokeinterface 80 1 0
        //   75: invokespecial 81	java/io/File:<init>	(Ljava/lang/String;)V
        //   78: astore 11
        //   80: new 83	java/io/FileOutputStream
        //   83: dup
        //   84: new 85	java/lang/StringBuilder
        //   87: dup
        //   88: invokespecial 86	java/lang/StringBuilder:<init>	()V
        //   91: aload 11
        //   93: invokevirtual 89	java/io/File:getAbsolutePath	()Ljava/lang/String;
        //   96: invokevirtual 93	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   99: ldc 95
        //   101: invokevirtual 93	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   104: invokevirtual 98	java/lang/StringBuilder:toString	()Ljava/lang/String;
        //   107: invokespecial 99	java/io/FileOutputStream:<init>	(Ljava/lang/String;)V
        //   110: astore 7
        //   112: aload 8
        //   114: astore 5
        //   116: aload 9
        //   118: astore 6
        //   120: aload 10
        //   122: astore_2
        //   123: aload 7
        //   125: astore 4
        //   127: aload_0
        //   128: getfield 47	com/tencent/mm/platformtools/j$b$a:hjg	Lcom/tencent/mm/platformtools/i;
        //   131: invokeinterface 102 1 0
        //   136: aconst_null
        //   137: invokestatic 107	com/tencent/mm/network/b:a	(Ljava/lang/String;Lcom/tencent/mm/network/b$b;)Lcom/tencent/mm/network/u;
        //   140: astore 12
        //   142: aload 8
        //   144: astore 5
        //   146: aload 9
        //   148: astore 6
        //   150: aload 10
        //   152: astore_2
        //   153: aload 7
        //   155: astore 4
        //   157: invokestatic 112	com/tencent/mm/ao/p:Jh	()Z
        //   160: ifeq +109 -> 269
        //   163: aload 8
        //   165: astore 5
        //   167: aload 9
        //   169: astore 6
        //   171: aload 10
        //   173: astore_2
        //   174: aload 7
        //   176: astore 4
        //   178: aload_0
        //   179: getfield 47	com/tencent/mm/platformtools/j$b$a:hjg	Lcom/tencent/mm/platformtools/i;
        //   182: invokeinterface 102 1 0
        //   187: invokestatic 116	com/tencent/mm/ao/p:kp	(Ljava/lang/String;)Z
        //   190: ifeq +79 -> 269
        //   193: aload 8
        //   195: astore 5
        //   197: aload 9
        //   199: astore 6
        //   201: aload 10
        //   203: astore_2
        //   204: aload 7
        //   206: astore 4
        //   208: getstatic 121	com/tencent/mm/protocal/d:tJC	I
        //   211: invokestatic 125	com/tencent/mm/ao/p:gA	(I)Ljava/lang/String;
        //   214: astore 13
        //   216: aload 8
        //   218: astore 5
        //   220: aload 9
        //   222: astore 6
        //   224: aload 10
        //   226: astore_2
        //   227: aload 7
        //   229: astore 4
        //   231: ldc 61
        //   233: ldc 127
        //   235: iconst_1
        //   236: anewarray 4	java/lang/Object
        //   239: dup
        //   240: iconst_0
        //   241: aload 13
        //   243: aastore
        //   244: invokestatic 131	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
        //   247: aload 8
        //   249: astore 5
        //   251: aload 9
        //   253: astore 6
        //   255: aload 10
        //   257: astore_2
        //   258: aload 7
        //   260: astore 4
        //   262: aload 12
        //   264: aload 13
        //   266: invokevirtual 136	com/tencent/mm/network/u:mY	(Ljava/lang/String;)V
        //   269: aload 8
        //   271: astore 5
        //   273: aload 9
        //   275: astore 6
        //   277: aload 10
        //   279: astore_2
        //   280: aload 7
        //   282: astore 4
        //   284: aload 12
        //   286: sipush 10000
        //   289: invokevirtual 140	com/tencent/mm/network/u:setConnectTimeout	(I)V
        //   292: aload 8
        //   294: astore 5
        //   296: aload 9
        //   298: astore 6
        //   300: aload 10
        //   302: astore_2
        //   303: aload 7
        //   305: astore 4
        //   307: aload 12
        //   309: sipush 20000
        //   312: invokevirtual 143	com/tencent/mm/network/u:setReadTimeout	(I)V
        //   315: aload 8
        //   317: astore 5
        //   319: aload 9
        //   321: astore 6
        //   323: aload 10
        //   325: astore_2
        //   326: aload 7
        //   328: astore 4
        //   330: aload 12
        //   332: ldc -111
        //   334: invokevirtual 148	com/tencent/mm/network/u:setRequestMethod	(Ljava/lang/String;)V
        //   337: aload 8
        //   339: astore 5
        //   341: aload 9
        //   343: astore 6
        //   345: aload 10
        //   347: astore_2
        //   348: aload 7
        //   350: astore 4
        //   352: aload 12
        //   354: invokestatic 151	com/tencent/mm/network/b:a	(Lcom/tencent/mm/network/u;)I
        //   357: ifne +24 -> 381
        //   360: aload 8
        //   362: astore 5
        //   364: aload 9
        //   366: astore 6
        //   368: aload 10
        //   370: astore_2
        //   371: aload 7
        //   373: astore 4
        //   375: aload 12
        //   377: invokevirtual 155	com/tencent/mm/network/u:getInputStream	()Ljava/io/InputStream;
        //   380: astore_3
        //   381: aload 8
        //   383: astore 5
        //   385: aload_3
        //   386: astore 6
        //   388: aload_3
        //   389: astore_2
        //   390: aload 7
        //   392: astore 4
        //   394: aload 12
        //   396: getfield 159	com/tencent/mm/network/u:hhh	Ljava/net/HttpURLConnection;
        //   399: invokevirtual 164	java/net/HttpURLConnection:getContentType	()Ljava/lang/String;
        //   402: astore 8
        //   404: aload 8
        //   406: astore 5
        //   408: aload_3
        //   409: astore 6
        //   411: aload_3
        //   412: astore_2
        //   413: aload 7
        //   415: astore 4
        //   417: ldc 61
        //   419: ldc -90
        //   421: iconst_1
        //   422: anewarray 4	java/lang/Object
        //   425: dup
        //   426: iconst_0
        //   427: aload 8
        //   429: aastore
        //   430: invokestatic 131	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
        //   433: aload_3
        //   434: ifnonnull +132 -> 566
        //   437: aload 8
        //   439: astore 5
        //   441: aload_3
        //   442: astore 6
        //   444: aload_3
        //   445: astore_2
        //   446: aload 7
        //   448: astore 4
        //   450: ldc 61
        //   452: ldc -88
        //   454: iconst_1
        //   455: anewarray 4	java/lang/Object
        //   458: dup
        //   459: iconst_0
        //   460: aload_0
        //   461: getfield 47	com/tencent/mm/platformtools/j$b$a:hjg	Lcom/tencent/mm/platformtools/i;
        //   464: invokeinterface 102 1 0
        //   469: aastore
        //   470: invokestatic 171	com/tencent/mm/sdk/platformtools/w:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
        //   473: aload 8
        //   475: astore 5
        //   477: aload_3
        //   478: astore 6
        //   480: aload_3
        //   481: astore_2
        //   482: aload 7
        //   484: astore 4
        //   486: aload_0
        //   487: getfield 47	com/tencent/mm/platformtools/j$b$a:hjg	Lcom/tencent/mm/platformtools/i;
        //   490: aload 8
        //   492: iconst_0
        //   493: invokeinterface 174 3 0
        //   498: aload_3
        //   499: ifnull +7 -> 506
        //   502: aload_3
        //   503: invokevirtual 179	java/io/InputStream:close	()V
        //   506: aload 7
        //   508: invokevirtual 180	java/io/FileOutputStream:close	()V
        //   511: ldc2_w 58
        //   514: sipush 3500
        //   517: invokestatic 50	com/tencent/gmtrace/GMTrace:o	(JI)V
        //   520: iconst_1
        //   521: ireturn
        //   522: astore_2
        //   523: ldc 61
        //   525: ldc -74
        //   527: iconst_1
        //   528: anewarray 4	java/lang/Object
        //   531: dup
        //   532: iconst_0
        //   533: aload_2
        //   534: invokestatic 188	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
        //   537: aastore
        //   538: invokestatic 190	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
        //   541: goto -35 -> 506
        //   544: astore_2
        //   545: ldc 61
        //   547: ldc -74
        //   549: iconst_1
        //   550: anewarray 4	java/lang/Object
        //   553: dup
        //   554: iconst_0
        //   555: aload_2
        //   556: invokestatic 188	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
        //   559: aastore
        //   560: invokestatic 190	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
        //   563: goto -52 -> 511
        //   566: aload 8
        //   568: astore 5
        //   570: aload_3
        //   571: astore 6
        //   573: aload_3
        //   574: astore_2
        //   575: aload 7
        //   577: astore 4
        //   579: sipush 1024
        //   582: newarray <illegal type>
        //   584: astore 9
        //   586: aload 8
        //   588: astore 5
        //   590: aload_3
        //   591: astore 6
        //   593: aload_3
        //   594: astore_2
        //   595: aload 7
        //   597: astore 4
        //   599: aload_3
        //   600: aload 9
        //   602: invokevirtual 194	java/io/InputStream:read	([B)I
        //   605: istore_1
        //   606: iload_1
        //   607: iconst_m1
        //   608: if_icmpeq +163 -> 771
        //   611: aload 8
        //   613: astore 5
        //   615: aload_3
        //   616: astore 6
        //   618: aload_3
        //   619: astore_2
        //   620: aload 7
        //   622: astore 4
        //   624: aload_0
        //   625: aload_0
        //   626: getfield 33	com/tencent/mm/platformtools/j$b$a:hjf	I
        //   629: iload_1
        //   630: iadd
        //   631: putfield 33	com/tencent/mm/platformtools/j$b$a:hjf	I
        //   634: aload 8
        //   636: astore 5
        //   638: aload_3
        //   639: astore 6
        //   641: aload_3
        //   642: astore_2
        //   643: aload 7
        //   645: astore 4
        //   647: aload 7
        //   649: aload 9
        //   651: iconst_0
        //   652: iload_1
        //   653: invokevirtual 198	java/io/FileOutputStream:write	([BII)V
        //   656: goto -70 -> 586
        //   659: astore_2
        //   660: aload 7
        //   662: astore_3
        //   663: aload 5
        //   665: astore 7
        //   667: aload_2
        //   668: astore 5
        //   670: aload 6
        //   672: astore_2
        //   673: aload_3
        //   674: astore 4
        //   676: ldc 61
        //   678: ldc -74
        //   680: iconst_1
        //   681: anewarray 4	java/lang/Object
        //   684: dup
        //   685: iconst_0
        //   686: aload 5
        //   688: invokestatic 188	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
        //   691: aastore
        //   692: invokestatic 190	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
        //   695: aload 6
        //   697: astore_2
        //   698: aload_3
        //   699: astore 4
        //   701: ldc 61
        //   703: ldc -56
        //   705: iconst_1
        //   706: anewarray 4	java/lang/Object
        //   709: dup
        //   710: iconst_0
        //   711: aload_0
        //   712: getfield 47	com/tencent/mm/platformtools/j$b$a:hjg	Lcom/tencent/mm/platformtools/i;
        //   715: invokeinterface 102 1 0
        //   720: aastore
        //   721: invokestatic 171	com/tencent/mm/sdk/platformtools/w:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
        //   724: aload 6
        //   726: astore_2
        //   727: aload_3
        //   728: astore 4
        //   730: aload_0
        //   731: getfield 47	com/tencent/mm/platformtools/j$b$a:hjg	Lcom/tencent/mm/platformtools/i;
        //   734: aload 7
        //   736: iconst_0
        //   737: invokeinterface 174 3 0
        //   742: aload 6
        //   744: ifnull +8 -> 752
        //   747: aload 6
        //   749: invokevirtual 179	java/io/InputStream:close	()V
        //   752: aload_3
        //   753: ifnull +7 -> 760
        //   756: aload_3
        //   757: invokevirtual 180	java/io/FileOutputStream:close	()V
        //   760: ldc2_w 58
        //   763: sipush 3500
        //   766: invokestatic 50	com/tencent/gmtrace/GMTrace:o	(JI)V
        //   769: iconst_1
        //   770: ireturn
        //   771: aload 8
        //   773: astore 5
        //   775: aload_3
        //   776: astore 6
        //   778: aload_3
        //   779: astore_2
        //   780: aload 7
        //   782: astore 4
        //   784: ldc 61
        //   786: ldc -54
        //   788: iconst_2
        //   789: anewarray 4	java/lang/Object
        //   792: dup
        //   793: iconst_0
        //   794: aload_0
        //   795: getfield 47	com/tencent/mm/platformtools/j$b$a:hjg	Lcom/tencent/mm/platformtools/i;
        //   798: invokeinterface 102 1 0
        //   803: aastore
        //   804: dup
        //   805: iconst_1
        //   806: aload_0
        //   807: getfield 33	com/tencent/mm/platformtools/j$b$a:hjf	I
        //   810: invokestatic 208	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
        //   813: aastore
        //   814: invokestatic 210	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
        //   817: aload 8
        //   819: astore 5
        //   821: aload_3
        //   822: astore 6
        //   824: aload_3
        //   825: astore_2
        //   826: aload 7
        //   828: astore 4
        //   830: aload_0
        //   831: getfield 47	com/tencent/mm/platformtools/j$b$a:hjg	Lcom/tencent/mm/platformtools/i;
        //   834: aload 8
        //   836: iconst_1
        //   837: invokeinterface 174 3 0
        //   842: aload_3
        //   843: ifnull +7 -> 850
        //   846: aload_3
        //   847: invokevirtual 179	java/io/InputStream:close	()V
        //   850: aload 7
        //   852: invokevirtual 180	java/io/FileOutputStream:close	()V
        //   855: aconst_null
        //   856: astore_2
        //   857: new 85	java/lang/StringBuilder
        //   860: dup
        //   861: invokespecial 86	java/lang/StringBuilder:<init>	()V
        //   864: aload 11
        //   866: invokevirtual 89	java/io/File:getAbsolutePath	()Ljava/lang/String;
        //   869: invokevirtual 93	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   872: ldc 95
        //   874: invokevirtual 93	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   877: invokevirtual 98	java/lang/StringBuilder:toString	()Ljava/lang/String;
        //   880: invokestatic 216	com/tencent/mm/a/g:bg	(Ljava/lang/String;)Ljava/lang/String;
        //   883: pop
        //   884: aload_0
        //   885: getfield 47	com/tencent/mm/platformtools/j$b$a:hjg	Lcom/tencent/mm/platformtools/i;
        //   888: invokeinterface 220 1 0
        //   893: astore_3
        //   894: aload_3
        //   895: ifnull +325 -> 1220
        //   898: aload_3
        //   899: new 85	java/lang/StringBuilder
        //   902: dup
        //   903: invokespecial 86	java/lang/StringBuilder:<init>	()V
        //   906: aload 11
        //   908: invokevirtual 89	java/io/File:getAbsolutePath	()Ljava/lang/String;
        //   911: invokevirtual 93	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   914: ldc 95
        //   916: invokevirtual 93	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   919: invokevirtual 98	java/lang/StringBuilder:toString	()Ljava/lang/String;
        //   922: invokeinterface 226 2 0
        //   927: astore_3
        //   928: aload_3
        //   929: ifnull +321 -> 1250
        //   932: aload_0
        //   933: getfield 47	com/tencent/mm/platformtools/j$b$a:hjg	Lcom/tencent/mm/platformtools/i;
        //   936: aload_3
        //   937: getstatic 232	com/tencent/mm/platformtools/i$a:hiU	Lcom/tencent/mm/platformtools/i$a;
        //   940: new 85	java/lang/StringBuilder
        //   943: dup
        //   944: invokespecial 86	java/lang/StringBuilder:<init>	()V
        //   947: aload 11
        //   949: invokevirtual 89	java/io/File:getAbsolutePath	()Ljava/lang/String;
        //   952: invokevirtual 93	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   955: ldc 95
        //   957: invokevirtual 93	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   960: invokevirtual 98	java/lang/StringBuilder:toString	()Ljava/lang/String;
        //   963: invokeinterface 235 4 0
        //   968: astore_2
        //   969: aload_2
        //   970: aload_3
        //   971: if_acmpeq +32 -> 1003
        //   974: aload_3
        //   975: invokevirtual 240	android/graphics/Bitmap:isRecycled	()Z
        //   978: ifne +25 -> 1003
        //   981: ldc 61
        //   983: ldc -14
        //   985: iconst_1
        //   986: anewarray 4	java/lang/Object
        //   989: dup
        //   990: iconst_0
        //   991: aload_3
        //   992: invokevirtual 243	java/lang/Object:toString	()Ljava/lang/String;
        //   995: aastore
        //   996: invokestatic 210	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
        //   999: aload_3
        //   1000: invokevirtual 246	android/graphics/Bitmap:recycle	()V
        //   1003: getstatic 250	com/tencent/mm/platformtools/j$b:hiY	Lcom/tencent/mm/platformtools/j$b;
        //   1006: aload_0
        //   1007: getfield 47	com/tencent/mm/platformtools/j$b$a:hjg	Lcom/tencent/mm/platformtools/i;
        //   1010: aload_2
        //   1011: invokestatic 253	com/tencent/mm/platformtools/j$b:a	(Lcom/tencent/mm/platformtools/j$b;Lcom/tencent/mm/platformtools/i;Landroid/graphics/Bitmap;)V
        //   1014: new 76	java/io/File
        //   1017: dup
        //   1018: new 85	java/lang/StringBuilder
        //   1021: dup
        //   1022: invokespecial 86	java/lang/StringBuilder:<init>	()V
        //   1025: aload 11
        //   1027: invokevirtual 89	java/io/File:getAbsolutePath	()Ljava/lang/String;
        //   1030: invokevirtual 93	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   1033: ldc 95
        //   1035: invokevirtual 93	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   1038: invokevirtual 98	java/lang/StringBuilder:toString	()Ljava/lang/String;
        //   1041: invokespecial 81	java/io/File:<init>	(Ljava/lang/String;)V
        //   1044: invokevirtual 256	java/io/File:delete	()Z
        //   1047: pop
        //   1048: aload_0
        //   1049: aload_2
        //   1050: putfield 35	com/tencent/mm/platformtools/j$b$a:gsp	Landroid/graphics/Bitmap;
        //   1053: ldc2_w 58
        //   1056: sipush 3500
        //   1059: invokestatic 50	com/tencent/gmtrace/GMTrace:o	(JI)V
        //   1062: iconst_1
        //   1063: ireturn
        //   1064: astore_2
        //   1065: ldc 61
        //   1067: ldc -74
        //   1069: iconst_1
        //   1070: anewarray 4	java/lang/Object
        //   1073: dup
        //   1074: iconst_0
        //   1075: aload_2
        //   1076: invokestatic 188	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
        //   1079: aastore
        //   1080: invokestatic 190	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
        //   1083: goto -233 -> 850
        //   1086: astore_2
        //   1087: ldc 61
        //   1089: ldc -74
        //   1091: iconst_1
        //   1092: anewarray 4	java/lang/Object
        //   1095: dup
        //   1096: iconst_0
        //   1097: aload_2
        //   1098: invokestatic 188	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
        //   1101: aastore
        //   1102: invokestatic 190	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
        //   1105: goto -250 -> 855
        //   1108: astore_2
        //   1109: ldc 61
        //   1111: ldc -74
        //   1113: iconst_1
        //   1114: anewarray 4	java/lang/Object
        //   1117: dup
        //   1118: iconst_0
        //   1119: aload_2
        //   1120: invokestatic 188	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
        //   1123: aastore
        //   1124: invokestatic 190	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
        //   1127: goto -375 -> 752
        //   1130: astore_2
        //   1131: ldc 61
        //   1133: ldc -74
        //   1135: iconst_1
        //   1136: anewarray 4	java/lang/Object
        //   1139: dup
        //   1140: iconst_0
        //   1141: aload_2
        //   1142: invokestatic 188	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
        //   1145: aastore
        //   1146: invokestatic 190	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
        //   1149: goto -389 -> 760
        //   1152: astore_3
        //   1153: aconst_null
        //   1154: astore 4
        //   1156: aload_2
        //   1157: ifnull +7 -> 1164
        //   1160: aload_2
        //   1161: invokevirtual 179	java/io/InputStream:close	()V
        //   1164: aload 4
        //   1166: ifnull +8 -> 1174
        //   1169: aload 4
        //   1171: invokevirtual 180	java/io/FileOutputStream:close	()V
        //   1174: aload_3
        //   1175: athrow
        //   1176: astore_2
        //   1177: ldc 61
        //   1179: ldc -74
        //   1181: iconst_1
        //   1182: anewarray 4	java/lang/Object
        //   1185: dup
        //   1186: iconst_0
        //   1187: aload_2
        //   1188: invokestatic 188	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
        //   1191: aastore
        //   1192: invokestatic 190	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
        //   1195: goto -31 -> 1164
        //   1198: astore_2
        //   1199: ldc 61
        //   1201: ldc -74
        //   1203: iconst_1
        //   1204: anewarray 4	java/lang/Object
        //   1207: dup
        //   1208: iconst_0
        //   1209: aload_2
        //   1210: invokestatic 188	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
        //   1213: aastore
        //   1214: invokestatic 190	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
        //   1217: goto -43 -> 1174
        //   1220: new 85	java/lang/StringBuilder
        //   1223: dup
        //   1224: invokespecial 86	java/lang/StringBuilder:<init>	()V
        //   1227: aload 11
        //   1229: invokevirtual 89	java/io/File:getAbsolutePath	()Ljava/lang/String;
        //   1232: invokevirtual 93	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   1235: ldc 95
        //   1237: invokevirtual 93	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   1240: invokevirtual 98	java/lang/StringBuilder:toString	()Ljava/lang/String;
        //   1243: invokestatic 259	com/tencent/mm/platformtools/j$b:nf	(Ljava/lang/String;)Landroid/graphics/Bitmap;
        //   1246: astore_3
        //   1247: goto -319 -> 928
        //   1250: aload_0
        //   1251: getfield 47	com/tencent/mm/platformtools/j$b$a:hjg	Lcom/tencent/mm/platformtools/i;
        //   1254: getstatic 232	com/tencent/mm/platformtools/i$a:hiU	Lcom/tencent/mm/platformtools/i$a;
        //   1257: aload 8
        //   1259: invokeinterface 262 3 0
        //   1264: goto -295 -> 969
        //   1267: astore_2
        //   1268: ldc 61
        //   1270: ldc_w 264
        //   1273: iconst_1
        //   1274: anewarray 4	java/lang/Object
        //   1277: dup
        //   1278: iconst_0
        //   1279: aload_0
        //   1280: getfield 47	com/tencent/mm/platformtools/j$b$a:hjg	Lcom/tencent/mm/platformtools/i;
        //   1283: invokeinterface 102 1 0
        //   1288: aastore
        //   1289: invokestatic 171	com/tencent/mm/sdk/platformtools/w:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
        //   1292: ldc 61
        //   1294: ldc -74
        //   1296: iconst_1
        //   1297: anewarray 4	java/lang/Object
        //   1300: dup
        //   1301: iconst_0
        //   1302: aload_2
        //   1303: invokestatic 188	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
        //   1306: aastore
        //   1307: invokestatic 190	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
        //   1310: aconst_null
        //   1311: astore_2
        //   1312: goto -264 -> 1048
        //   1315: astore_3
        //   1316: goto -160 -> 1156
        //   1319: astore 5
        //   1321: aconst_null
        //   1322: astore_3
        //   1323: aload 4
        //   1325: astore 7
        //   1327: goto -657 -> 670
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	1330	0	this	a
        //   605	48	1	i	int
        //   41	441	2	localObject1	Object
        //   522	12	2	localIOException1	java.io.IOException
        //   544	12	2	localIOException2	java.io.IOException
        //   574	69	2	localObject2	Object
        //   659	9	2	localException1	Exception
        //   672	378	2	localObject3	Object
        //   1064	12	2	localIOException3	java.io.IOException
        //   1086	12	2	localIOException4	java.io.IOException
        //   1108	12	2	localIOException5	java.io.IOException
        //   1130	31	2	localIOException6	java.io.IOException
        //   1176	12	2	localIOException7	java.io.IOException
        //   1198	12	2	localIOException8	java.io.IOException
        //   1267	36	2	localException2	Exception
        //   1311	1	2	localObject4	Object
        //   46	954	3	localObject5	Object
        //   1152	23	3	localObject6	Object
        //   1246	1	3	localBitmap	Bitmap
        //   1315	1	3	localObject7	Object
        //   1322	1	3	localObject8	Object
        //   48	1276	4	localObject9	Object
        //   114	706	5	localObject10	Object
        //   1319	1	5	localException3	Exception
        //   38	785	6	localObject11	Object
        //   110	1216	7	localObject12	Object
        //   51	1207	8	str1	String
        //   35	615	9	arrayOfByte	byte[]
        //   43	326	10	localObject13	Object
        //   78	1150	11	localFile	java.io.File
        //   140	255	12	localu	com.tencent.mm.network.u
        //   214	51	13	str2	String
        // Exception table:
        //   from	to	target	type
        //   502	506	522	java/io/IOException
        //   506	511	544	java/io/IOException
        //   127	142	659	java/lang/Exception
        //   157	163	659	java/lang/Exception
        //   178	193	659	java/lang/Exception
        //   208	216	659	java/lang/Exception
        //   231	247	659	java/lang/Exception
        //   262	269	659	java/lang/Exception
        //   284	292	659	java/lang/Exception
        //   307	315	659	java/lang/Exception
        //   330	337	659	java/lang/Exception
        //   352	360	659	java/lang/Exception
        //   375	381	659	java/lang/Exception
        //   394	404	659	java/lang/Exception
        //   417	433	659	java/lang/Exception
        //   450	473	659	java/lang/Exception
        //   486	498	659	java/lang/Exception
        //   579	586	659	java/lang/Exception
        //   599	606	659	java/lang/Exception
        //   624	634	659	java/lang/Exception
        //   647	656	659	java/lang/Exception
        //   784	817	659	java/lang/Exception
        //   830	842	659	java/lang/Exception
        //   846	850	1064	java/io/IOException
        //   850	855	1086	java/io/IOException
        //   747	752	1108	java/io/IOException
        //   756	760	1130	java/io/IOException
        //   53	112	1152	finally
        //   1160	1164	1176	java/io/IOException
        //   1169	1174	1198	java/io/IOException
        //   857	894	1267	java/lang/Exception
        //   898	928	1267	java/lang/Exception
        //   932	969	1267	java/lang/Exception
        //   974	1003	1267	java/lang/Exception
        //   1003	1048	1267	java/lang/Exception
        //   1220	1247	1267	java/lang/Exception
        //   1250	1264	1267	java/lang/Exception
        //   127	142	1315	finally
        //   157	163	1315	finally
        //   178	193	1315	finally
        //   208	216	1315	finally
        //   231	247	1315	finally
        //   262	269	1315	finally
        //   284	292	1315	finally
        //   307	315	1315	finally
        //   330	337	1315	finally
        //   352	360	1315	finally
        //   375	381	1315	finally
        //   394	404	1315	finally
        //   417	433	1315	finally
        //   450	473	1315	finally
        //   486	498	1315	finally
        //   579	586	1315	finally
        //   599	606	1315	finally
        //   624	634	1315	finally
        //   647	656	1315	finally
        //   676	695	1315	finally
        //   701	724	1315	finally
        //   730	742	1315	finally
        //   784	817	1315	finally
        //   830	842	1315	finally
        //   53	112	1319	java/lang/Exception
      }
      
      public final boolean Dk()
      {
        GMTrace.i(469896265728L, 3501);
        try
        {
          ak.a.gmY.aI(this.hjf, 0);
          j.b.a(j.b.hiY, this.hjg.Pn(), this.hjg.Po(), this.gsp);
          this.gsp = null;
          GMTrace.o(469896265728L, 3501);
          return false;
        }
        catch (Exception localException)
        {
          for (;;)
          {
            w.e("MicroMsg.MMPictureLogic", "exception:%s", new Object[] { bg.f(localException) });
          }
        }
      }
    }
    
    private static final class b
      implements ar.a
    {
      public Bitmap gsp;
      private i hjg;
      
      public b(i parami)
      {
        GMTrace.i(459964153856L, 3427);
        this.gsp = null;
        if (!j.b(parami)) {
          throw new IllegalArgumentException("from sdcard, picture strategy here must be validity");
        }
        this.hjg = parami;
        GMTrace.o(459964153856L, 3427);
      }
      
      public final boolean Dj()
      {
        boolean bool = false;
        GMTrace.i(460098371584L, 3428);
        this.gsp = j.b.nf(this.hjg.Pm());
        if (this.gsp != null) {
          this.gsp = j.b.hiY.a(this.hjg, this.gsp);
        }
        String str1 = this.hjg.Pn();
        String str2 = this.hjg.Pm();
        if (this.gsp != null) {
          bool = true;
        }
        w.v("MicroMsg.MMPictureLogic", "get url[%s] from[%s] result[%B]", new Object[] { str1, str2, Boolean.valueOf(bool) });
        GMTrace.o(460098371584L, 3428);
        return true;
      }
      
      public final boolean Dk()
      {
        GMTrace.i(460232589312L, 3429);
        if (this.gsp == null)
        {
          w.d("MicroMsg.MMPictureLogic", "can not find bitmap on sdCard, url=%s, try to download it", new Object[] { this.hjg.Pn() });
          if ((j.b.a(j.b.hiY) == null) || (j.b.a(j.b.hiY).Yi())) {
            j.b.a(j.b.hiY, new ar(1, "readerapp-pic-logic-download", 3));
          }
          j.b.a(j.b.hiY).c(new j.b.a(this.hjg));
        }
        for (;;)
        {
          GMTrace.o(460232589312L, 3429);
          return false;
          j.b.a(j.b.hiY, this.hjg.Pn(), this.hjg.Po(), this.gsp);
          this.gsp = null;
        }
      }
    }
    
    static final class c
    {
      boolean hjh;
      int hji;
      int hjj;
      
      c()
      {
        GMTrace.i(474459668480L, 3535);
        GMTrace.o(474459668480L, 3535);
      }
      
      public final String toString()
      {
        GMTrace.i(474593886208L, 3536);
        Object localObject = new StringBuilder();
        ((StringBuilder)localObject).append("fail[").append(this.hjh).append("],");
        ((StringBuilder)localObject).append("tryTimes[").append(this.hji).append("],");
        ((StringBuilder)localObject).append("lastTS[").append(this.hjj).append("]");
        localObject = ((StringBuilder)localObject).toString();
        GMTrace.o(474593886208L, 3536);
        return (String)localObject;
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\platformtools\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */