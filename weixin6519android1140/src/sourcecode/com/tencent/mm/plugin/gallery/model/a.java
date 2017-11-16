package com.tencent.mm.plugin.gallery.model;

import android.graphics.Bitmap;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.k;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.ar.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Vector;

public final class a
{
  private static final int lAN;
  public b lAO;
  private a lAP;
  public f<String> lAQ;
  private f<b> lAR;
  public volatile boolean lAS;
  
  static
  {
    GMTrace.i(11904709820416L, 88697);
    if (com.tencent.mm.compatible.util.d.eu(14)) {}
    for (int i = 20;; i = 30)
    {
      lAN = i;
      GMTrace.o(11904709820416L, 88697);
      return;
    }
  }
  
  public a()
  {
    GMTrace.i(11903501860864L, 88688);
    this.lAS = false;
    this.lAO = new b();
    this.lAP = new a();
    this.lAQ = new f();
    this.lAR = new f();
    GMTrace.o(11903501860864L, 88688);
  }
  
  public final void a(b.b paramb)
  {
    GMTrace.i(11904038731776L, 88692);
    b localb = this.lAO;
    if (localb.gsw.size() > 64) {
      w.i("MicroMsg.GalleryCache", "has exceed the max listener size[%d], remove some listeners[%s]", new Object[] { Integer.valueOf(64), (b.b)localb.gsw.remove(0) });
    }
    w.v("MicroMsg.GalleryCache", "try add listener[%s]", new Object[] { paramb });
    if (!localb.gsw.contains(paramb))
    {
      w.d("MicroMsg.GalleryCache", "add listener[%s] ok", new Object[] { paramb });
      localb.gsw.add(paramb);
    }
    GMTrace.o(11904038731776L, 88692);
  }
  
  public final void aCI()
  {
    GMTrace.i(11903904514048L, 88691);
    if (this.lAS)
    {
      w.w("MircoMsg.CacheService", "is decoding now, wait a minute");
      GMTrace.o(11903904514048L, 88691);
      return;
    }
    if ((this.lAR != null) && (this.lAR.size() > 0))
    {
      this.lAS = true;
      Object localObject2 = (b)this.lAR.aDe();
      if (localObject2 == null)
      {
        w.e("MircoMsg.CacheService", "obj is null");
        this.lAS = false;
        aCI();
        GMTrace.o(11903904514048L, 88691);
        return;
      }
      a locala = this.lAP;
      if (c.aCM() == null)
      {
        w.w("MircoMsg.CacheService", "add thread object, but worker thread is null");
        GMTrace.o(11903904514048L, 88691);
        return;
      }
      Object localObject1 = c.aCM();
      localObject2 = new a.a.1(locala, (ar.a)localObject2);
      localObject1 = ((e)localObject1).aCY();
      if (localObject1 == null)
      {
        w.e("MicroMsg.GalleryHandlerThread", "post at front of queue, but decode handler is null");
        GMTrace.o(11903904514048L, 88691);
        return;
      }
      w.i("MicroMsg.GalleryHandlerThread", "postAtFrontOfQueue:[%b]", new Object[] { Boolean.valueOf(((ae)localObject1).postAtFrontOfQueueV2((Runnable)localObject2)) });
      GMTrace.o(11903904514048L, 88691);
      return;
    }
    w.i("MircoMsg.CacheService", "all job empty");
    if (c.aCM() == null)
    {
      GMTrace.o(11903904514048L, 88691);
      return;
    }
    c.aCM().s(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(11906320433152L, 88709);
        Object localObject = a.this.lAO;
        if (((b)localObject).lBa != null)
        {
          localObject = ((b)localObject).lBa;
          if (((d)localObject).lbr)
          {
            ((d)localObject).lbr = false;
            ((d)localObject).aCU();
            ((d)localObject).aCV();
            ((d)localObject).of(-1);
            ((d)localObject).aCX();
          }
        }
        GMTrace.o(11906320433152L, 88709);
      }
      
      public final String toString()
      {
        GMTrace.i(11906454650880L, 88710);
        String str = super.toString() + "|tryStartDocode";
        GMTrace.o(11906454650880L, 88710);
        return str;
      }
    });
    GMTrace.o(11903904514048L, 88691);
  }
  
  public final Bitmap b(String paramString1, int paramInt, String paramString2, long paramLong)
  {
    GMTrace.i(11903636078592L, 88689);
    if (bg.nm(paramString1))
    {
      w.w("MircoMsg.CacheService", "file path is null");
      GMTrace.o(11903636078592L, 88689);
      return null;
    }
    Object localObject = this.lAO.getBitmap(paramString1);
    if (localObject != null)
    {
      w.v("MircoMsg.CacheService", "get bitmap from cache: %s", new Object[] { paramString1 });
      GMTrace.o(11903636078592L, 88689);
      return (Bitmap)localObject;
    }
    w.v("MircoMsg.CacheService", "filePathInService size is : [%d]", new Object[] { Integer.valueOf(this.lAQ.size()) });
    if (this.lAQ.ba(paramString1))
    {
      w.w("MircoMsg.CacheService", "has already getting bitmap from file, %s", new Object[] { paramString1 });
      aCI();
      GMTrace.o(11903636078592L, 88689);
      return null;
    }
    if (this.lAQ.size() > lAN)
    {
      w.w("MircoMsg.CacheService", "the running task has exceed 40, remove the first one");
      w.w("MircoMsg.CacheService", "filePathInService size: [%d], waitingDecodeTask size:[%d]", new Object[] { Integer.valueOf(this.lAQ.size()), Integer.valueOf(this.lAR.size()) });
      if (!this.lAR.isEmpty())
      {
        localObject = (b)this.lAR.aDe();
        if (localObject != null)
        {
          localObject = ((b)localObject).mFilePath;
          this.lAQ.bb(localObject);
        }
      }
    }
    this.lAQ.add(paramString1);
    this.lAR.add(new b(paramString1, paramInt, paramString2, paramLong));
    aCI();
    GMTrace.o(11903636078592L, 88689);
    return null;
  }
  
  public final Bitmap zc(String paramString)
  {
    GMTrace.i(11903770296320L, 88690);
    if (bg.nm(paramString))
    {
      w.w("MircoMsg.CacheService", "file path is null");
      GMTrace.o(11903770296320L, 88690);
      return null;
    }
    Bitmap localBitmap = this.lAO.getBitmap(paramString);
    if (localBitmap != null)
    {
      w.v("MircoMsg.CacheService", "get bitmap from cache: %s", new Object[] { paramString });
      GMTrace.o(11903770296320L, 88690);
      return localBitmap;
    }
    GMTrace.o(11903770296320L, 88690);
    return null;
  }
  
  private final class a
  {
    public a()
    {
      GMTrace.i(11907796828160L, 88720);
      GMTrace.o(11907796828160L, 88720);
    }
  }
  
  private final class b
    implements ar.a
  {
    private Bitmap bitmap;
    private int eGK;
    private String lAW;
    private long lAX;
    private int lAY;
    public String mFilePath;
    
    public b(String paramString1, int paramInt, String paramString2, long paramLong)
    {
      this(paramString1, paramInt, paramString2, paramLong, (byte)0);
      GMTrace.i(11905246691328L, 88701);
      GMTrace.o(11905246691328L, 88701);
    }
    
    private b(String paramString1, int paramInt, String paramString2, long paramLong, byte paramByte)
    {
      GMTrace.i(11905380909056L, 88702);
      this.mFilePath = paramString1;
      this.lAX = paramLong;
      this.lAW = paramString2;
      this.lAY = 12288;
      this.eGK = paramInt;
      GMTrace.o(11905380909056L, 88702);
    }
    
    /* Error */
    public final boolean Dj()
    {
      // Byte code:
      //   0: ldc2_w 62
      //   3: ldc 64
      //   5: invokestatic 35	com/tencent/gmtrace/GMTrace:i	(JI)V
      //   8: aload_0
      //   9: getfield 41	com/tencent/mm/plugin/gallery/model/a$b:lAT	Lcom/tencent/mm/plugin/gallery/model/a;
      //   12: getfield 68	com/tencent/mm/plugin/gallery/model/a:lAO	Lcom/tencent/mm/plugin/gallery/model/b;
      //   15: astore 6
      //   17: ldc 70
      //   19: iconst_3
      //   20: anewarray 4	java/lang/Object
      //   23: dup
      //   24: iconst_0
      //   25: aload_0
      //   26: getfield 49	com/tencent/mm/plugin/gallery/model/a$b:mFilePath	Ljava/lang/String;
      //   29: aastore
      //   30: dup
      //   31: iconst_1
      //   32: aload_0
      //   33: getfield 53	com/tencent/mm/plugin/gallery/model/a$b:lAW	Ljava/lang/String;
      //   36: aastore
      //   37: dup
      //   38: iconst_2
      //   39: aload_0
      //   40: getfield 51	com/tencent/mm/plugin/gallery/model/a$b:lAX	J
      //   43: invokestatic 76	java/lang/Long:valueOf	(J)Ljava/lang/Long;
      //   46: aastore
      //   47: invokestatic 82	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      //   50: astore 7
      //   52: aload 6
      //   54: getfield 88	com/tencent/mm/plugin/gallery/model/b:lBa	Lcom/tencent/mm/plugin/gallery/model/d;
      //   57: ifnonnull +47 -> 104
      //   60: aconst_null
      //   61: astore 6
      //   63: aload_0
      //   64: aload 6
      //   66: putfield 90	com/tencent/mm/plugin/gallery/model/a$b:bitmap	Landroid/graphics/Bitmap;
      //   69: aload_0
      //   70: getfield 90	com/tencent/mm/plugin/gallery/model/a$b:bitmap	Landroid/graphics/Bitmap;
      //   73: ifnull +49 -> 122
      //   76: ldc 92
      //   78: ldc 94
      //   80: iconst_1
      //   81: anewarray 4	java/lang/Object
      //   84: dup
      //   85: iconst_0
      //   86: aload_0
      //   87: getfield 49	com/tencent/mm/plugin/gallery/model/a$b:mFilePath	Ljava/lang/String;
      //   90: aastore
      //   91: invokestatic 100	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
      //   94: ldc2_w 62
      //   97: ldc 64
      //   99: invokestatic 38	com/tencent/gmtrace/GMTrace:o	(JI)V
      //   102: iconst_1
      //   103: ireturn
      //   104: aload 6
      //   106: getfield 88	com/tencent/mm/plugin/gallery/model/b:lBa	Lcom/tencent/mm/plugin/gallery/model/d;
      //   109: aload 7
      //   111: invokevirtual 104	java/lang/String:hashCode	()I
      //   114: invokevirtual 110	com/tencent/mm/plugin/gallery/model/d:oh	(I)Landroid/graphics/Bitmap;
      //   117: astore 6
      //   119: goto -56 -> 63
      //   122: aload_0
      //   123: aload_0
      //   124: getfield 51	com/tencent/mm/plugin/gallery/model/a$b:lAX	J
      //   127: aload_0
      //   128: getfield 57	com/tencent/mm/plugin/gallery/model/a$b:eGK	I
      //   131: aload_0
      //   132: getfield 49	com/tencent/mm/plugin/gallery/model/a$b:mFilePath	Ljava/lang/String;
      //   135: aload_0
      //   136: getfield 53	com/tencent/mm/plugin/gallery/model/a$b:lAW	Ljava/lang/String;
      //   139: invokestatic 116	com/tencent/mm/plugin/gallery/model/j:a	(JILjava/lang/String;Ljava/lang/String;)Landroid/graphics/Bitmap;
      //   142: putfield 90	com/tencent/mm/plugin/gallery/model/a$b:bitmap	Landroid/graphics/Bitmap;
      //   145: aload_0
      //   146: getfield 90	com/tencent/mm/plugin/gallery/model/a$b:bitmap	Landroid/graphics/Bitmap;
      //   149: ifnull +620 -> 769
      //   152: aload_0
      //   153: getfield 41	com/tencent/mm/plugin/gallery/model/a$b:lAT	Lcom/tencent/mm/plugin/gallery/model/a;
      //   156: getfield 68	com/tencent/mm/plugin/gallery/model/a:lAO	Lcom/tencent/mm/plugin/gallery/model/b;
      //   159: astore 6
      //   161: aload_0
      //   162: getfield 49	com/tencent/mm/plugin/gallery/model/a$b:mFilePath	Ljava/lang/String;
      //   165: astore 8
      //   167: aload_0
      //   168: getfield 53	com/tencent/mm/plugin/gallery/model/a$b:lAW	Ljava/lang/String;
      //   171: astore 9
      //   173: aload_0
      //   174: getfield 51	com/tencent/mm/plugin/gallery/model/a$b:lAX	J
      //   177: lstore 4
      //   179: aload_0
      //   180: getfield 90	com/tencent/mm/plugin/gallery/model/a$b:bitmap	Landroid/graphics/Bitmap;
      //   183: astore 7
      //   185: aload 7
      //   187: ifnull +81 -> 268
      //   190: ldc 70
      //   192: iconst_3
      //   193: anewarray 4	java/lang/Object
      //   196: dup
      //   197: iconst_0
      //   198: aload 8
      //   200: aastore
      //   201: dup
      //   202: iconst_1
      //   203: aload 9
      //   205: aastore
      //   206: dup
      //   207: iconst_2
      //   208: lload 4
      //   210: invokestatic 76	java/lang/Long:valueOf	(J)Ljava/lang/Long;
      //   213: aastore
      //   214: invokestatic 82	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      //   217: astore 9
      //   219: aload 6
      //   221: getfield 88	com/tencent/mm/plugin/gallery/model/b:lBa	Lcom/tencent/mm/plugin/gallery/model/d;
      //   224: ifnull +44 -> 268
      //   227: aload 6
      //   229: getfield 88	com/tencent/mm/plugin/gallery/model/b:lBa	Lcom/tencent/mm/plugin/gallery/model/d;
      //   232: astore 8
      //   234: aload 9
      //   236: invokevirtual 104	java/lang/String:hashCode	()I
      //   239: istore_3
      //   240: aload 8
      //   242: getfield 120	com/tencent/mm/plugin/gallery/model/d:lBr	Ljava/util/List;
      //   245: ifnull +16 -> 261
      //   248: aload 8
      //   250: getfield 120	com/tencent/mm/plugin/gallery/model/d:lBr	Ljava/util/List;
      //   253: invokeinterface 125 1 0
      //   258: ifgt +20 -> 278
      //   261: ldc 127
      //   263: ldc -127
      //   265: invokestatic 133	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
      //   268: ldc2_w 62
      //   271: ldc 64
      //   273: invokestatic 38	com/tencent/gmtrace/GMTrace:o	(JI)V
      //   276: iconst_1
      //   277: ireturn
      //   278: aload 7
      //   280: ifnonnull +13 -> 293
      //   283: ldc 127
      //   285: ldc -121
      //   287: invokestatic 133	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
      //   290: goto -22 -> 268
      //   293: ldc 127
      //   295: ldc -119
      //   297: iconst_3
      //   298: anewarray 4	java/lang/Object
      //   301: dup
      //   302: iconst_0
      //   303: iload_3
      //   304: invokestatic 142	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   307: aastore
      //   308: dup
      //   309: iconst_1
      //   310: aload 7
      //   312: invokevirtual 147	android/graphics/Bitmap:getWidth	()I
      //   315: invokestatic 142	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   318: aastore
      //   319: dup
      //   320: iconst_2
      //   321: aload 7
      //   323: invokevirtual 150	android/graphics/Bitmap:getHeight	()I
      //   326: invokestatic 142	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   329: aastore
      //   330: invokestatic 100	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
      //   333: aload 8
      //   335: getfield 120	com/tencent/mm/plugin/gallery/model/d:lBr	Ljava/util/List;
      //   338: ifnull +16 -> 354
      //   341: aload 8
      //   343: getfield 120	com/tencent/mm/plugin/gallery/model/d:lBr	Ljava/util/List;
      //   346: invokeinterface 125 1 0
      //   351: ifgt +19 -> 370
      //   354: iconst_m1
      //   355: istore_1
      //   356: iload_1
      //   357: ifge +105 -> 462
      //   360: ldc 127
      //   362: ldc -104
      //   364: invokestatic 133	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
      //   367: goto -99 -> 268
      //   370: aload 8
      //   372: invokevirtual 155	com/tencent/mm/plugin/gallery/model/d:aCW	()I
      //   375: istore_2
      //   376: iload_2
      //   377: istore_1
      //   378: iload_2
      //   379: ifge +69 -> 448
      //   382: ldc 127
      //   384: ldc -99
      //   386: iconst_1
      //   387: anewarray 4	java/lang/Object
      //   390: dup
      //   391: iconst_0
      //   392: aload 8
      //   394: getfield 160	com/tencent/mm/plugin/gallery/model/d:lBt	I
      //   397: invokestatic 142	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   400: aastore
      //   401: invokestatic 100	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
      //   404: aload 8
      //   406: getfield 160	com/tencent/mm/plugin/gallery/model/d:lBt	I
      //   409: iconst_1
      //   410: iadd
      //   411: bipush 25
      //   413: if_icmplt +38 -> 451
      //   416: iconst_0
      //   417: istore_1
      //   418: ldc 127
      //   420: ldc -94
      //   422: iconst_1
      //   423: anewarray 4	java/lang/Object
      //   426: dup
      //   427: iconst_0
      //   428: iload_1
      //   429: invokestatic 142	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   432: aastore
      //   433: invokestatic 100	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
      //   436: aload 8
      //   438: iload_1
      //   439: invokevirtual 166	com/tencent/mm/plugin/gallery/model/d:og	(I)V
      //   442: aload 8
      //   444: iload_1
      //   445: invokevirtual 169	com/tencent/mm/plugin/gallery/model/d:of	(I)V
      //   448: goto -92 -> 356
      //   451: aload 8
      //   453: getfield 160	com/tencent/mm/plugin/gallery/model/d:lBt	I
      //   456: iconst_1
      //   457: iadd
      //   458: istore_1
      //   459: goto -41 -> 418
      //   462: aload 8
      //   464: getfield 173	com/tencent/mm/plugin/gallery/model/d:lBs	Landroid/util/SparseArray;
      //   467: iload_3
      //   468: invokevirtual 179	android/util/SparseArray:get	(I)Ljava/lang/Object;
      //   471: checkcast 181	com/tencent/mm/protocal/c/aij
      //   474: astore 6
      //   476: aload 6
      //   478: ifnonnull +301 -> 779
      //   481: new 181	com/tencent/mm/protocal/c/aij
      //   484: dup
      //   485: invokespecial 182	com/tencent/mm/protocal/c/aij:<init>	()V
      //   488: astore 6
      //   490: aload 6
      //   492: iload_3
      //   493: putfield 185	com/tencent/mm/protocal/c/aij:key	I
      //   496: new 187	java/io/ByteArrayOutputStream
      //   499: dup
      //   500: invokespecial 188	java/io/ByteArrayOutputStream:<init>	()V
      //   503: astore 9
      //   505: aload 7
      //   507: getstatic 194	android/graphics/Bitmap$CompressFormat:JPEG	Landroid/graphics/Bitmap$CompressFormat;
      //   510: bipush 100
      //   512: aload 9
      //   514: invokevirtual 198	android/graphics/Bitmap:compress	(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
      //   517: pop
      //   518: invokestatic 204	java/lang/System:currentTimeMillis	()J
      //   521: lstore 4
      //   523: aload 8
      //   525: getfield 120	com/tencent/mm/plugin/gallery/model/d:lBr	Ljava/util/List;
      //   528: iload_1
      //   529: invokeinterface 205 2 0
      //   534: checkcast 207	java/io/RandomAccessFile
      //   537: astore 7
      //   539: aload 6
      //   541: aload 7
      //   543: invokevirtual 210	java/io/RandomAccessFile:length	()J
      //   546: putfield 213	com/tencent/mm/protocal/c/aij:uxL	J
      //   549: aload 6
      //   551: iload_1
      //   552: putfield 216	com/tencent/mm/protocal/c/aij:uxM	I
      //   555: aload 6
      //   557: aload 9
      //   559: invokevirtual 217	java/io/ByteArrayOutputStream:size	()I
      //   562: putfield 219	com/tencent/mm/protocal/c/aij:length	I
      //   565: aload 9
      //   567: invokevirtual 223	java/io/ByteArrayOutputStream:toByteArray	()[B
      //   570: astore 10
      //   572: aload 7
      //   574: aload 6
      //   576: getfield 213	com/tencent/mm/protocal/c/aij:uxL	J
      //   579: invokevirtual 227	java/io/RandomAccessFile:seek	(J)V
      //   582: aload 7
      //   584: aload 10
      //   586: invokevirtual 231	java/io/RandomAccessFile:write	([B)V
      //   589: aload 8
      //   591: iload_1
      //   592: putfield 160	com/tencent/mm/plugin/gallery/model/d:lBt	I
      //   595: ldc 127
      //   597: ldc -23
      //   599: iconst_5
      //   600: anewarray 4	java/lang/Object
      //   603: dup
      //   604: iconst_0
      //   605: invokestatic 204	java/lang/System:currentTimeMillis	()J
      //   608: lload 4
      //   610: lsub
      //   611: invokestatic 76	java/lang/Long:valueOf	(J)Ljava/lang/Long;
      //   614: aastore
      //   615: dup
      //   616: iconst_1
      //   617: aload 6
      //   619: getfield 185	com/tencent/mm/protocal/c/aij:key	I
      //   622: invokestatic 142	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   625: aastore
      //   626: dup
      //   627: iconst_2
      //   628: aload 6
      //   630: getfield 213	com/tencent/mm/protocal/c/aij:uxL	J
      //   633: invokestatic 76	java/lang/Long:valueOf	(J)Ljava/lang/Long;
      //   636: aastore
      //   637: dup
      //   638: iconst_3
      //   639: aload 6
      //   641: getfield 219	com/tencent/mm/protocal/c/aij:length	I
      //   644: invokestatic 142	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   647: aastore
      //   648: dup
      //   649: iconst_4
      //   650: aload 6
      //   652: getfield 216	com/tencent/mm/protocal/c/aij:uxM	I
      //   655: invokestatic 142	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   658: aastore
      //   659: invokestatic 100	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
      //   662: aload 9
      //   664: invokestatic 236	com/tencent/mm/plugin/gallery/model/d:e	(Ljava/io/Closeable;)V
      //   667: aload 8
      //   669: iconst_1
      //   670: putfield 240	com/tencent/mm/plugin/gallery/model/d:lbr	Z
      //   673: aload 8
      //   675: getfield 173	com/tencent/mm/plugin/gallery/model/d:lBs	Landroid/util/SparseArray;
      //   678: iload_3
      //   679: aload 6
      //   681: invokevirtual 244	android/util/SparseArray:put	(ILjava/lang/Object;)V
      //   684: goto -416 -> 268
      //   687: astore 6
      //   689: ldc 127
      //   691: ldc -10
      //   693: iconst_1
      //   694: anewarray 4	java/lang/Object
      //   697: dup
      //   698: iconst_0
      //   699: aload 6
      //   701: invokevirtual 250	java/lang/Exception:getMessage	()Ljava/lang/String;
      //   704: aastore
      //   705: invokestatic 252	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
      //   708: ldc 127
      //   710: aload 6
      //   712: ldc -2
      //   714: iconst_0
      //   715: anewarray 4	java/lang/Object
      //   718: invokestatic 258	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
      //   721: aload 9
      //   723: invokestatic 236	com/tencent/mm/plugin/gallery/model/d:e	(Ljava/io/Closeable;)V
      //   726: goto -458 -> 268
      //   729: astore 6
      //   731: ldc 127
      //   733: ldc_w 260
      //   736: iconst_1
      //   737: anewarray 4	java/lang/Object
      //   740: dup
      //   741: iconst_0
      //   742: aload 6
      //   744: invokevirtual 250	java/lang/Exception:getMessage	()Ljava/lang/String;
      //   747: aastore
      //   748: invokestatic 252	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
      //   751: aload 9
      //   753: invokestatic 236	com/tencent/mm/plugin/gallery/model/d:e	(Ljava/io/Closeable;)V
      //   756: goto -488 -> 268
      //   759: astore 6
      //   761: aload 9
      //   763: invokestatic 236	com/tencent/mm/plugin/gallery/model/d:e	(Ljava/io/Closeable;)V
      //   766: aload 6
      //   768: athrow
      //   769: ldc2_w 62
      //   772: ldc 64
      //   774: invokestatic 38	com/tencent/gmtrace/GMTrace:o	(JI)V
      //   777: iconst_0
      //   778: ireturn
      //   779: goto -283 -> 496
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	782	0	this	b
      //   355	237	1	i	int
      //   375	4	2	j	int
      //   239	440	3	k	int
      //   177	432	4	l	long
      //   15	665	6	localObject1	Object
      //   687	24	6	localException1	Exception
      //   729	14	6	localException2	Exception
      //   759	8	6	localObject2	Object
      //   50	533	7	localObject3	Object
      //   165	509	8	localObject4	Object
      //   171	591	9	localObject5	Object
      //   570	15	10	arrayOfByte	byte[]
      // Exception table:
      //   from	to	target	type
      //   505	518	687	java/lang/Exception
      //   518	662	729	java/lang/Exception
      //   518	662	759	finally
      //   731	751	759	finally
    }
    
    public final boolean Dk()
    {
      GMTrace.i(11905649344512L, 88704);
      w.d("MircoMsg.CacheService", "do on post execute, filePath[%s]", new Object[] { this.mFilePath });
      a.this.lAQ.bb(this.mFilePath);
      w.v("MircoMsg.CacheService", "remove filePathInService at position 0 : now position:[%d]", new Object[] { Integer.valueOf(a.this.lAQ.size()) });
      if (this.bitmap == null)
      {
        w.e("MircoMsg.CacheService", "decode file failed, %s ", new Object[] { this.mFilePath });
        GMTrace.o(11905649344512L, 88704);
        return false;
      }
      b localb = a.this.lAO;
      String str = this.mFilePath;
      Bitmap localBitmap = this.bitmap;
      int i = this.lAY;
      if (localb.lAZ == null) {
        w.e("MicroMsg.GalleryCache", "cache is null");
      }
      for (;;)
      {
        this.bitmap = null;
        GMTrace.o(11905649344512L, 88704);
        return true;
        localb.lAZ.m(str, new b.a(localb, localBitmap, i));
        localb.gsv.bI(str);
        localb.gsv.doNotify();
      }
    }
    
    public final boolean equals(Object paramObject)
    {
      GMTrace.i(11905783562240L, 88705);
      if (paramObject == null)
      {
        GMTrace.o(11905783562240L, 88705);
        return false;
      }
      if (this == paramObject)
      {
        GMTrace.o(11905783562240L, 88705);
        return true;
      }
      if ((paramObject instanceof b))
      {
        paramObject = (b)paramObject;
        boolean bool = bg.aq(this.mFilePath, "").equals(((b)paramObject).mFilePath);
        GMTrace.o(11905783562240L, 88705);
        return bool;
      }
      GMTrace.o(11905783562240L, 88705);
      return false;
    }
    
    public final int hashCode()
    {
      GMTrace.i(11905917779968L, 88706);
      int i = bg.aq(this.mFilePath, "").hashCode();
      GMTrace.o(11905917779968L, 88706);
      return i;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\gallery\model\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */