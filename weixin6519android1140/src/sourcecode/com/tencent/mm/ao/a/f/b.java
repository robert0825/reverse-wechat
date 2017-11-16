package com.tencent.mm.ao.a.f;

import android.graphics.Bitmap;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ao.a.c.a;
import com.tencent.mm.ao.a.c.d;
import com.tencent.mm.ao.a.c.e;
import com.tencent.mm.ao.a.c.f;
import com.tencent.mm.ao.a.c.g;
import com.tencent.mm.ao.a.c.i;
import com.tencent.mm.ao.a.c.j;
import com.tencent.mm.ao.a.c.k;
import com.tencent.mm.ao.a.c.l;
import com.tencent.mm.ao.a.c.m;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class b
  implements Runnable
{
  private final com.tencent.mm.ao.a.a.b gJX;
  public final com.tencent.mm.ao.a.a.c gKp;
  private final m gKq;
  private final a gKr;
  private final com.tencent.mm.ao.a.c.b gKs;
  private final f gKt;
  private final j gKu;
  private final e gKw;
  private final com.tencent.mm.ao.a.b gLj;
  public final com.tencent.mm.ao.a.c gLl;
  private final ae gLm;
  private final i gLn;
  private final g gLo;
  private final k gLp;
  private final d gLq;
  private final l gLr;
  public final String url;
  
  public b(String paramString, com.tencent.mm.ao.a.c paramc, ae paramae, com.tencent.mm.ao.a.a.c paramc1, i parami, j paramj, com.tencent.mm.ao.a.b paramb, g paramg, e parame, d paramd, l paraml)
  {
    GMTrace.i(20313718915072L, 151349);
    this.url = paramString;
    this.gLl = paramc;
    this.gLm = paramae;
    this.gLj = paramb;
    this.gLo = paramg;
    this.gJX = this.gLj.gJX;
    if (paramc1 == null)
    {
      this.gKp = this.gJX.gKp;
      this.gLn = parami;
      if (paramj != null) {
        break label199;
      }
      this.gKu = this.gJX.gKu;
      label88:
      if (this.gKp.gKs == null) {
        break label208;
      }
      this.gKs = this.gKp.gKs;
      label109:
      this.gKq = this.gJX.gKq;
      this.gKr = this.gJX.gKr;
      this.gKt = this.gJX.gKt;
      this.gLp = this.gJX.gKv;
      if (parame != null) {
        break label222;
      }
    }
    label199:
    label208:
    label222:
    for (this.gKw = this.gJX.gKw;; this.gKw = parame)
    {
      this.gLq = paramd;
      this.gLr = paraml;
      GMTrace.o(20313718915072L, 151349);
      return;
      this.gKp = paramc1;
      break;
      this.gKu = paramj;
      break label88;
      this.gKs = this.gJX.gKs;
      break label109;
    }
  }
  
  private void i(String paramString, Bitmap paramBitmap)
  {
    GMTrace.i(13732889493504L, 102318);
    if (this.gKp.gKA)
    {
      w.d("MicroMsg.imageloader.ImageLoadTask", "[cpan] run. put key %s to memory cache.", new Object[] { this.url });
      this.gKq.b(paramString, paramBitmap);
    }
    GMTrace.o(13732889493504L, 102318);
  }
  
  public final void av(long paramLong)
  {
    GMTrace.i(13733157928960L, 102320);
    if (this.gKu != null) {
      this.gKu.av(paramLong);
    }
    GMTrace.o(13733157928960L, 102320);
  }
  
  public final String kw(String paramString)
  {
    GMTrace.i(13733023711232L, 102319);
    if ((bg.nm(paramString)) || (this.gKp == null))
    {
      GMTrace.o(13733023711232L, 102319);
      return null;
    }
    String str = paramString;
    if (this.gKp.gKZ) {
      str = paramString + "round" + this.gKp.gLa;
    }
    paramString = str + "size" + this.gKp.gKI + this.gKp.gKJ;
    GMTrace.o(13733023711232L, 102319);
    return paramString;
  }
  
  /* Error */
  public final void run()
  {
    // Byte code:
    //   0: ldc2_w 194
    //   3: ldc -60
    //   5: invokestatic 54	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   8: aconst_null
    //   9: astore 12
    //   11: new 198	com/tencent/mm/ao/a/d/b
    //   14: dup
    //   15: invokespecial 199	com/tencent/mm/ao/a/d/b:<init>	()V
    //   18: astore 14
    //   20: aload_0
    //   21: aload_0
    //   22: getfield 56	com/tencent/mm/ao/a/f/b:url	Ljava/lang/String;
    //   25: invokevirtual 201	com/tencent/mm/ao/a/f/b:kw	(Ljava/lang/String;)Ljava/lang/String;
    //   28: astore 17
    //   30: ldc 120
    //   32: ldc -53
    //   34: iconst_1
    //   35: anewarray 4	java/lang/Object
    //   38: dup
    //   39: iconst_0
    //   40: aload_0
    //   41: getfield 56	com/tencent/mm/ao/a/f/b:url	Ljava/lang/String;
    //   44: aastore
    //   45: invokestatic 128	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   48: invokestatic 209	java/lang/System:currentTimeMillis	()J
    //   51: lstore 5
    //   53: aload_0
    //   54: getfield 74	com/tencent/mm/ao/a/f/b:gKp	Lcom/tencent/mm/ao/a/a/c;
    //   57: getfield 212	com/tencent/mm/ao/a/a/c:gKH	I
    //   60: istore_3
    //   61: aload_0
    //   62: getfield 74	com/tencent/mm/ao/a/f/b:gKp	Lcom/tencent/mm/ao/a/a/c;
    //   65: getfield 215	com/tencent/mm/ao/a/a/c:gKK	Z
    //   68: istore 9
    //   70: aload_0
    //   71: getfield 74	com/tencent/mm/ao/a/f/b:gKp	Lcom/tencent/mm/ao/a/a/c;
    //   74: getfield 218	com/tencent/mm/ao/a/a/c:eDW	Ljava/lang/String;
    //   77: astore 18
    //   79: ldc 120
    //   81: new 158	java/lang/StringBuilder
    //   84: dup
    //   85: ldc -36
    //   87: invokespecial 223	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   90: iload 9
    //   92: invokevirtual 226	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   95: invokevirtual 176	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   98: invokestatic 229	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   101: ldc 120
    //   103: ldc -25
    //   105: iconst_1
    //   106: anewarray 4	java/lang/Object
    //   109: dup
    //   110: iconst_0
    //   111: iload_3
    //   112: invokestatic 237	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   115: aastore
    //   116: invokestatic 128	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   119: ldc 120
    //   121: ldc -17
    //   123: iconst_2
    //   124: anewarray 4	java/lang/Object
    //   127: dup
    //   128: iconst_0
    //   129: aload_0
    //   130: getfield 58	com/tencent/mm/ao/a/f/b:gLl	Lcom/tencent/mm/ao/a/c;
    //   133: getfield 244	com/tencent/mm/ao/a/c:width	I
    //   136: invokestatic 237	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   139: aastore
    //   140: dup
    //   141: iconst_1
    //   142: aload_0
    //   143: getfield 58	com/tencent/mm/ao/a/f/b:gLl	Lcom/tencent/mm/ao/a/c;
    //   146: getfield 247	com/tencent/mm/ao/a/c:height	I
    //   149: invokestatic 237	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   152: aastore
    //   153: invokestatic 128	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   156: iload_3
    //   157: tableswitch	default:+2262->2419, 1:+326->483, 2:+1266->1423, 3:+1296->1453, 4:+1348->1505, 5:+911->1068
    //   192: ldc 120
    //   194: ldc -7
    //   196: iconst_1
    //   197: anewarray 4	java/lang/Object
    //   200: dup
    //   201: iconst_0
    //   202: iload_3
    //   203: invokestatic 237	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   206: aastore
    //   207: invokestatic 252	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   210: invokestatic 209	java/lang/System:currentTimeMillis	()J
    //   213: lstore 7
    //   215: aload 12
    //   217: ifnull +2205 -> 2422
    //   220: aload 12
    //   222: invokevirtual 258	android/graphics/Bitmap:isRecycled	()Z
    //   225: ifeq +1849 -> 2074
    //   228: goto +2194 -> 2422
    //   231: ldc 120
    //   233: ldc_w 260
    //   236: invokestatic 263	com/tencent/mm/sdk/platformtools/w:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   239: aload 14
    //   241: astore 13
    //   243: aload 12
    //   245: ifnull +2013 -> 2258
    //   248: aload 12
    //   250: invokevirtual 258	android/graphics/Bitmap:isRecycled	()Z
    //   253: ifne +2005 -> 2258
    //   256: ldc 120
    //   258: ldc_w 265
    //   261: invokestatic 229	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   264: aload 12
    //   266: astore 14
    //   268: aload_0
    //   269: getfield 74	com/tencent/mm/ao/a/f/b:gKp	Lcom/tencent/mm/ao/a/a/c;
    //   272: getfield 268	com/tencent/mm/ao/a/a/c:gKM	Z
    //   275: ifeq +17 -> 292
    //   278: aload 12
    //   280: aload_0
    //   281: getfield 74	com/tencent/mm/ao/a/f/b:gKp	Lcom/tencent/mm/ao/a/a/c;
    //   284: getfield 271	com/tencent/mm/ao/a/a/c:gKN	I
    //   287: invokestatic 277	com/tencent/mm/sdk/platformtools/d:c	(Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;
    //   290: astore 14
    //   292: new 279	com/tencent/mm/ao/a/f/c
    //   295: dup
    //   296: aload_0
    //   297: getfield 56	com/tencent/mm/ao/a/f/b:url	Ljava/lang/String;
    //   300: aload_0
    //   301: getfield 58	com/tencent/mm/ao/a/f/b:gLl	Lcom/tencent/mm/ao/a/c;
    //   304: aload 14
    //   306: aload_0
    //   307: getfield 62	com/tencent/mm/ao/a/f/b:gLj	Lcom/tencent/mm/ao/a/b;
    //   310: aload_0
    //   311: aload_0
    //   312: getfield 56	com/tencent/mm/ao/a/f/b:url	Ljava/lang/String;
    //   315: invokevirtual 201	com/tencent/mm/ao/a/f/b:kw	(Ljava/lang/String;)Ljava/lang/String;
    //   318: invokespecial 282	com/tencent/mm/ao/a/f/c:<init>	(Ljava/lang/String;Lcom/tencent/mm/ao/a/c;Landroid/graphics/Bitmap;Lcom/tencent/mm/ao/a/b;Ljava/lang/String;)V
    //   321: astore 12
    //   323: aload_0
    //   324: getfield 60	com/tencent/mm/ao/a/f/b:gLm	Lcom/tencent/mm/sdk/platformtools/ae;
    //   327: ifnull +13 -> 340
    //   330: aload_0
    //   331: getfield 60	com/tencent/mm/ao/a/f/b:gLm	Lcom/tencent/mm/sdk/platformtools/ae;
    //   334: aload 12
    //   336: invokevirtual 288	com/tencent/mm/sdk/platformtools/ae:post	(Ljava/lang/Runnable;)Z
    //   339: pop
    //   340: aload 13
    //   342: aload 14
    //   344: putfield 292	com/tencent/mm/ao/a/d/b:bitmap	Landroid/graphics/Bitmap;
    //   347: aload 14
    //   349: astore 12
    //   351: aload_0
    //   352: getfield 64	com/tencent/mm/ao/a/f/b:gLo	Lcom/tencent/mm/ao/a/c/g;
    //   355: ifnull +37 -> 392
    //   358: aload 13
    //   360: ifnull +32 -> 392
    //   363: aload 13
    //   365: aload 12
    //   367: putfield 292	com/tencent/mm/ao/a/d/b:bitmap	Landroid/graphics/Bitmap;
    //   370: aload_0
    //   371: getfield 64	com/tencent/mm/ao/a/f/b:gLo	Lcom/tencent/mm/ao/a/c/g;
    //   374: aload_0
    //   375: getfield 56	com/tencent/mm/ao/a/f/b:url	Ljava/lang/String;
    //   378: aload_0
    //   379: getfield 58	com/tencent/mm/ao/a/f/b:gLl	Lcom/tencent/mm/ao/a/c;
    //   382: invokevirtual 296	com/tencent/mm/ao/a/c:Da	()Landroid/widget/ImageView;
    //   385: aload 13
    //   387: invokeinterface 302 4 0
    //   392: aload_0
    //   393: getfield 76	com/tencent/mm/ao/a/f/b:gLn	Lcom/tencent/mm/ao/a/c/i;
    //   396: astore 13
    //   398: aload_0
    //   399: getfield 56	com/tencent/mm/ao/a/f/b:url	Ljava/lang/String;
    //   402: astore 14
    //   404: aload_0
    //   405: getfield 58	com/tencent/mm/ao/a/f/b:gLl	Lcom/tencent/mm/ao/a/c;
    //   408: invokevirtual 296	com/tencent/mm/ao/a/c:Da	()Landroid/widget/ImageView;
    //   411: pop
    //   412: aload 13
    //   414: aload 14
    //   416: aload 12
    //   418: aload_0
    //   419: getfield 74	com/tencent/mm/ao/a/f/b:gKp	Lcom/tencent/mm/ao/a/a/c;
    //   422: getfield 306	com/tencent/mm/ao/a/a/c:gLe	[Ljava/lang/Object;
    //   425: invokeinterface 311 4 0
    //   430: aload_0
    //   431: getfield 62	com/tencent/mm/ao/a/f/b:gLj	Lcom/tencent/mm/ao/a/b;
    //   434: astore 12
    //   436: aload 12
    //   438: getfield 315	com/tencent/mm/ao/a/b:gKb	Ljava/util/HashMap;
    //   441: ifnull +33 -> 474
    //   444: aload_0
    //   445: ifnull +29 -> 474
    //   448: aload_0
    //   449: getfield 58	com/tencent/mm/ao/a/f/b:gLl	Lcom/tencent/mm/ao/a/c;
    //   452: ifnull +22 -> 474
    //   455: aload 12
    //   457: getfield 315	com/tencent/mm/ao/a/b:gKb	Ljava/util/HashMap;
    //   460: aload_0
    //   461: getfield 58	com/tencent/mm/ao/a/f/b:gLl	Lcom/tencent/mm/ao/a/c;
    //   464: invokevirtual 319	com/tencent/mm/ao/a/c:Jl	()I
    //   467: invokestatic 237	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   470: invokevirtual 325	java/util/HashMap:remove	(Ljava/lang/Object;)Ljava/lang/Object;
    //   473: pop
    //   474: ldc2_w 194
    //   477: ldc -60
    //   479: invokestatic 108	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   482: return
    //   483: aload_0
    //   484: getfield 74	com/tencent/mm/ao/a/f/b:gKp	Lcom/tencent/mm/ao/a/a/c;
    //   487: getfield 328	com/tencent/mm/ao/a/a/c:eIy	Ljava/lang/String;
    //   490: astore 13
    //   492: aload_0
    //   493: getfield 74	com/tencent/mm/ao/a/f/b:gKp	Lcom/tencent/mm/ao/a/a/c;
    //   496: getfield 331	com/tencent/mm/ao/a/a/c:gKO	Z
    //   499: ifeq +119 -> 618
    //   502: aload 13
    //   504: invokestatic 153	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
    //   507: ifne +111 -> 618
    //   510: aload 13
    //   512: invokestatic 336	com/tencent/mm/a/e:aZ	(Ljava/lang/String;)Z
    //   515: ifeq +103 -> 618
    //   518: aload_0
    //   519: getfield 74	com/tencent/mm/ao/a/f/b:gKp	Lcom/tencent/mm/ao/a/a/c;
    //   522: getfield 339	com/tencent/mm/ao/a/a/c:gLb	Z
    //   525: ifeq +65 -> 590
    //   528: aload_0
    //   529: getfield 58	com/tencent/mm/ao/a/f/b:gLl	Lcom/tencent/mm/ao/a/c;
    //   532: aload 13
    //   534: aload_0
    //   535: getfield 74	com/tencent/mm/ao/a/f/b:gKp	Lcom/tencent/mm/ao/a/a/c;
    //   538: getfield 182	com/tencent/mm/ao/a/a/c:gKI	I
    //   541: aload_0
    //   542: getfield 74	com/tencent/mm/ao/a/f/b:gKp	Lcom/tencent/mm/ao/a/a/c;
    //   545: getfield 188	com/tencent/mm/ao/a/a/c:gKJ	I
    //   548: invokestatic 344	com/tencent/mm/ao/a/g/a:b	(Lcom/tencent/mm/ao/a/c;Ljava/lang/String;II)Landroid/graphics/Bitmap;
    //   551: astore 13
    //   553: aload 13
    //   555: astore 12
    //   557: aload_0
    //   558: getfield 74	com/tencent/mm/ao/a/f/b:gKp	Lcom/tencent/mm/ao/a/a/c;
    //   561: getfield 347	com/tencent/mm/ao/a/a/c:density	I
    //   564: ifle +1848 -> 2412
    //   567: aload 13
    //   569: astore 12
    //   571: aload 13
    //   573: aload_0
    //   574: getfield 74	com/tencent/mm/ao/a/f/b:gKp	Lcom/tencent/mm/ao/a/a/c;
    //   577: getfield 347	com/tencent/mm/ao/a/a/c:density	I
    //   580: invokevirtual 351	android/graphics/Bitmap:setDensity	(I)V
    //   583: aload 13
    //   585: astore 12
    //   587: goto -377 -> 210
    //   590: aload_0
    //   591: getfield 58	com/tencent/mm/ao/a/f/b:gLl	Lcom/tencent/mm/ao/a/c;
    //   594: aload 13
    //   596: aload_0
    //   597: getfield 74	com/tencent/mm/ao/a/f/b:gKp	Lcom/tencent/mm/ao/a/a/c;
    //   600: getfield 182	com/tencent/mm/ao/a/a/c:gKI	I
    //   603: aload_0
    //   604: getfield 74	com/tencent/mm/ao/a/f/b:gKp	Lcom/tencent/mm/ao/a/a/c;
    //   607: getfield 188	com/tencent/mm/ao/a/a/c:gKJ	I
    //   610: invokestatic 353	com/tencent/mm/ao/a/g/a:a	(Lcom/tencent/mm/ao/a/c;Ljava/lang/String;II)Landroid/graphics/Bitmap;
    //   613: astore 13
    //   615: goto -62 -> 553
    //   618: aload_0
    //   619: getfield 56	com/tencent/mm/ao/a/f/b:url	Ljava/lang/String;
    //   622: invokestatic 153	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
    //   625: ifne +432 -> 1057
    //   628: aload_0
    //   629: getfield 56	com/tencent/mm/ao/a/f/b:url	Ljava/lang/String;
    //   632: invokestatic 336	com/tencent/mm/a/e:aZ	(Ljava/lang/String;)Z
    //   635: ifeq +337 -> 972
    //   638: iload 9
    //   640: ifeq +21 -> 661
    //   643: aload_0
    //   644: getfield 98	com/tencent/mm/ao/a/f/b:gLp	Lcom/tencent/mm/ao/a/c/k;
    //   647: aload 18
    //   649: aload_0
    //   650: getfield 56	com/tencent/mm/ao/a/f/b:url	Ljava/lang/String;
    //   653: invokeinterface 359 3 0
    //   658: ifeq +300 -> 958
    //   661: aload_0
    //   662: getfield 74	com/tencent/mm/ao/a/f/b:gKp	Lcom/tencent/mm/ao/a/a/c;
    //   665: getfield 339	com/tencent/mm/ao/a/a/c:gLb	Z
    //   668: ifeq +168 -> 836
    //   671: aload_0
    //   672: getfield 58	com/tencent/mm/ao/a/f/b:gLl	Lcom/tencent/mm/ao/a/c;
    //   675: aload_0
    //   676: getfield 56	com/tencent/mm/ao/a/f/b:url	Ljava/lang/String;
    //   679: aload_0
    //   680: getfield 74	com/tencent/mm/ao/a/f/b:gKp	Lcom/tencent/mm/ao/a/a/c;
    //   683: getfield 182	com/tencent/mm/ao/a/a/c:gKI	I
    //   686: aload_0
    //   687: getfield 74	com/tencent/mm/ao/a/f/b:gKp	Lcom/tencent/mm/ao/a/a/c;
    //   690: getfield 188	com/tencent/mm/ao/a/a/c:gKJ	I
    //   693: invokestatic 344	com/tencent/mm/ao/a/g/a:b	(Lcom/tencent/mm/ao/a/c;Ljava/lang/String;II)Landroid/graphics/Bitmap;
    //   696: astore 13
    //   698: aload 13
    //   700: astore 15
    //   702: aload 13
    //   704: astore 12
    //   706: aload_0
    //   707: getfield 74	com/tencent/mm/ao/a/f/b:gKp	Lcom/tencent/mm/ao/a/a/c;
    //   710: getfield 362	com/tencent/mm/ao/a/a/c:gLd	Z
    //   713: ifeq +69 -> 782
    //   716: aload 13
    //   718: astore 15
    //   720: aload 13
    //   722: ifnonnull +60 -> 782
    //   725: aload 13
    //   727: astore 15
    //   729: aload 13
    //   731: astore 12
    //   733: aload_0
    //   734: getfield 105	com/tencent/mm/ao/a/f/b:gLr	Lcom/tencent/mm/ao/a/c/l;
    //   737: ifnull +45 -> 782
    //   740: aload 13
    //   742: astore 12
    //   744: aload_0
    //   745: getfield 103	com/tencent/mm/ao/a/f/b:gLq	Lcom/tencent/mm/ao/a/c/d;
    //   748: ifnull +188 -> 936
    //   751: aload 13
    //   753: astore 12
    //   755: aload_0
    //   756: getfield 105	com/tencent/mm/ao/a/f/b:gLr	Lcom/tencent/mm/ao/a/c/l;
    //   759: aload_0
    //   760: getfield 103	com/tencent/mm/ao/a/f/b:gLq	Lcom/tencent/mm/ao/a/c/d;
    //   763: aload_0
    //   764: getfield 74	com/tencent/mm/ao/a/f/b:gKp	Lcom/tencent/mm/ao/a/a/c;
    //   767: getfield 306	com/tencent/mm/ao/a/a/c:gLe	[Ljava/lang/Object;
    //   770: invokeinterface 367 2 0
    //   775: invokeinterface 373 2 0
    //   780: astore 15
    //   782: aload 15
    //   784: ifnull +33 -> 817
    //   787: aload 15
    //   789: astore 12
    //   791: aload_0
    //   792: getfield 74	com/tencent/mm/ao/a/f/b:gKp	Lcom/tencent/mm/ao/a/a/c;
    //   795: getfield 347	com/tencent/mm/ao/a/a/c:density	I
    //   798: ifle +19 -> 817
    //   801: aload 15
    //   803: astore 12
    //   805: aload 15
    //   807: aload_0
    //   808: getfield 74	com/tencent/mm/ao/a/f/b:gKp	Lcom/tencent/mm/ao/a/a/c;
    //   811: getfield 347	com/tencent/mm/ao/a/a/c:density	I
    //   814: invokevirtual 351	android/graphics/Bitmap:setDensity	(I)V
    //   817: aload 15
    //   819: astore 12
    //   821: ldc 120
    //   823: ldc_w 375
    //   826: invokestatic 229	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   829: aload 15
    //   831: astore 12
    //   833: goto -623 -> 210
    //   836: aload_0
    //   837: getfield 103	com/tencent/mm/ao/a/f/b:gLq	Lcom/tencent/mm/ao/a/c/d;
    //   840: ifnull +66 -> 906
    //   843: aload_0
    //   844: getfield 58	com/tencent/mm/ao/a/f/b:gLl	Lcom/tencent/mm/ao/a/c;
    //   847: aload_0
    //   848: getfield 103	com/tencent/mm/ao/a/f/b:gLq	Lcom/tencent/mm/ao/a/c/d;
    //   851: aload_0
    //   852: getfield 74	com/tencent/mm/ao/a/f/b:gKp	Lcom/tencent/mm/ao/a/a/c;
    //   855: getfield 306	com/tencent/mm/ao/a/a/c:gLe	[Ljava/lang/Object;
    //   858: invokeinterface 367 2 0
    //   863: aload_0
    //   864: getfield 74	com/tencent/mm/ao/a/f/b:gKp	Lcom/tencent/mm/ao/a/a/c;
    //   867: getfield 182	com/tencent/mm/ao/a/a/c:gKI	I
    //   870: aload_0
    //   871: getfield 74	com/tencent/mm/ao/a/f/b:gKp	Lcom/tencent/mm/ao/a/a/c;
    //   874: getfield 188	com/tencent/mm/ao/a/a/c:gKJ	I
    //   877: aload_0
    //   878: getfield 74	com/tencent/mm/ao/a/f/b:gKp	Lcom/tencent/mm/ao/a/a/c;
    //   881: getfield 378	com/tencent/mm/ao/a/a/c:gKQ	Z
    //   884: aload_0
    //   885: getfield 74	com/tencent/mm/ao/a/f/b:gKp	Lcom/tencent/mm/ao/a/a/c;
    //   888: getfield 381	com/tencent/mm/ao/a/a/c:alpha	F
    //   891: aload_0
    //   892: getfield 74	com/tencent/mm/ao/a/f/b:gKp	Lcom/tencent/mm/ao/a/a/c;
    //   895: getfield 384	com/tencent/mm/ao/a/a/c:gKL	Z
    //   898: invokestatic 387	com/tencent/mm/ao/a/g/a:a	(Lcom/tencent/mm/ao/a/c;[BIIZFZ)Landroid/graphics/Bitmap;
    //   901: astore 13
    //   903: goto -205 -> 698
    //   906: aload_0
    //   907: getfield 58	com/tencent/mm/ao/a/f/b:gLl	Lcom/tencent/mm/ao/a/c;
    //   910: aload_0
    //   911: getfield 56	com/tencent/mm/ao/a/f/b:url	Ljava/lang/String;
    //   914: aload_0
    //   915: getfield 74	com/tencent/mm/ao/a/f/b:gKp	Lcom/tencent/mm/ao/a/a/c;
    //   918: getfield 182	com/tencent/mm/ao/a/a/c:gKI	I
    //   921: aload_0
    //   922: getfield 74	com/tencent/mm/ao/a/f/b:gKp	Lcom/tencent/mm/ao/a/a/c;
    //   925: getfield 188	com/tencent/mm/ao/a/a/c:gKJ	I
    //   928: invokestatic 353	com/tencent/mm/ao/a/g/a:a	(Lcom/tencent/mm/ao/a/c;Ljava/lang/String;II)Landroid/graphics/Bitmap;
    //   931: astore 13
    //   933: goto -235 -> 698
    //   936: aload 13
    //   938: astore 12
    //   940: aload_0
    //   941: getfield 105	com/tencent/mm/ao/a/f/b:gLr	Lcom/tencent/mm/ao/a/c/l;
    //   944: aload_0
    //   945: getfield 56	com/tencent/mm/ao/a/f/b:url	Ljava/lang/String;
    //   948: invokeinterface 391 2 0
    //   953: astore 15
    //   955: goto -173 -> 782
    //   958: ldc 120
    //   960: ldc_w 393
    //   963: invokestatic 263	com/tencent/mm/sdk/platformtools/w:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   966: aconst_null
    //   967: astore 12
    //   969: goto -759 -> 210
    //   972: aload_0
    //   973: getfield 74	com/tencent/mm/ao/a/f/b:gKp	Lcom/tencent/mm/ao/a/a/c;
    //   976: getfield 396	com/tencent/mm/ao/a/a/c:gKP	Z
    //   979: ifeq +19 -> 998
    //   982: aload_0
    //   983: getfield 101	com/tencent/mm/ao/a/f/b:gKw	Lcom/tencent/mm/ao/a/c/e;
    //   986: aload_0
    //   987: getfield 74	com/tencent/mm/ao/a/f/b:gKp	Lcom/tencent/mm/ao/a/a/c;
    //   990: getfield 306	com/tencent/mm/ao/a/a/c:gLe	[Ljava/lang/Object;
    //   993: invokeinterface 401 2 0
    //   998: ldc 120
    //   1000: ldc_w 403
    //   1003: invokestatic 263	com/tencent/mm/sdk/platformtools/w:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   1006: goto -796 -> 210
    //   1009: astore 15
    //   1011: aload 14
    //   1013: astore 12
    //   1015: aconst_null
    //   1016: astore 13
    //   1018: aload 15
    //   1020: astore 14
    //   1022: ldc 120
    //   1024: ldc_w 405
    //   1027: iconst_1
    //   1028: anewarray 4	java/lang/Object
    //   1031: dup
    //   1032: iconst_0
    //   1033: aload 14
    //   1035: invokevirtual 406	java/lang/Exception:toString	()Ljava/lang/String;
    //   1038: aastore
    //   1039: invokestatic 252	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1042: aload 12
    //   1044: astore 14
    //   1046: aload 13
    //   1048: astore 12
    //   1050: aload 14
    //   1052: astore 13
    //   1054: goto -811 -> 243
    //   1057: ldc 120
    //   1059: ldc_w 408
    //   1062: invokestatic 263	com/tencent/mm/sdk/platformtools/w:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   1065: goto -855 -> 210
    //   1068: aconst_null
    //   1069: astore 15
    //   1071: iconst_0
    //   1072: istore_2
    //   1073: aload_0
    //   1074: getfield 90	com/tencent/mm/ao/a/f/b:gKr	Lcom/tencent/mm/ao/a/c/a;
    //   1077: aload_0
    //   1078: getfield 56	com/tencent/mm/ao/a/f/b:url	Ljava/lang/String;
    //   1081: aload_0
    //   1082: getfield 74	com/tencent/mm/ao/a/f/b:gKp	Lcom/tencent/mm/ao/a/a/c;
    //   1085: invokeinterface 413 3 0
    //   1090: astore 16
    //   1092: aload 16
    //   1094: ifnull +1312 -> 2406
    //   1097: iload 9
    //   1099: ifeq +23 -> 1122
    //   1102: aload 16
    //   1104: astore 15
    //   1106: aload_0
    //   1107: getfield 98	com/tencent/mm/ao/a/f/b:gLp	Lcom/tencent/mm/ao/a/c/k;
    //   1110: aload 18
    //   1112: aload 16
    //   1114: invokeinterface 416 3 0
    //   1119: ifeq +281 -> 1400
    //   1122: aload 16
    //   1124: astore 15
    //   1126: aload_0
    //   1127: getfield 58	com/tencent/mm/ao/a/f/b:gLl	Lcom/tencent/mm/ao/a/c;
    //   1130: astore 12
    //   1132: aload 16
    //   1134: astore 15
    //   1136: aload_0
    //   1137: getfield 74	com/tencent/mm/ao/a/f/b:gKp	Lcom/tencent/mm/ao/a/a/c;
    //   1140: getfield 182	com/tencent/mm/ao/a/a/c:gKI	I
    //   1143: istore_2
    //   1144: aload 16
    //   1146: astore 15
    //   1148: aload_0
    //   1149: getfield 74	com/tencent/mm/ao/a/f/b:gKp	Lcom/tencent/mm/ao/a/a/c;
    //   1152: getfield 188	com/tencent/mm/ao/a/a/c:gKJ	I
    //   1155: istore 4
    //   1157: aload 16
    //   1159: astore 15
    //   1161: aload_0
    //   1162: getfield 74	com/tencent/mm/ao/a/f/b:gKp	Lcom/tencent/mm/ao/a/a/c;
    //   1165: getfield 378	com/tencent/mm/ao/a/a/c:gKQ	Z
    //   1168: istore 10
    //   1170: aload 16
    //   1172: astore 15
    //   1174: aload_0
    //   1175: getfield 74	com/tencent/mm/ao/a/f/b:gKp	Lcom/tencent/mm/ao/a/a/c;
    //   1178: getfield 381	com/tencent/mm/ao/a/a/c:alpha	F
    //   1181: fstore_1
    //   1182: aload 16
    //   1184: astore 15
    //   1186: aload_0
    //   1187: getfield 74	com/tencent/mm/ao/a/f/b:gKp	Lcom/tencent/mm/ao/a/a/c;
    //   1190: getfield 384	com/tencent/mm/ao/a/a/c:gKL	Z
    //   1193: istore 11
    //   1195: iload_2
    //   1196: ifle +8 -> 1204
    //   1199: iload 4
    //   1201: ifgt +181 -> 1382
    //   1204: aload 12
    //   1206: ifnull +162 -> 1368
    //   1209: aload 16
    //   1211: astore 15
    //   1213: aload 12
    //   1215: getfield 244	com/tencent/mm/ao/a/c:width	I
    //   1218: ifle +150 -> 1368
    //   1221: aload 16
    //   1223: astore 15
    //   1225: aload 12
    //   1227: getfield 244	com/tencent/mm/ao/a/c:width	I
    //   1230: ifle +138 -> 1368
    //   1233: aload 16
    //   1235: astore 15
    //   1237: aload 16
    //   1239: fconst_0
    //   1240: aload 12
    //   1242: getfield 244	com/tencent/mm/ao/a/c:width	I
    //   1245: aload 12
    //   1247: getfield 247	com/tencent/mm/ao/a/c:height	I
    //   1250: invokestatic 419	com/tencent/mm/sdk/platformtools/d:a	(Ljava/io/InputStream;FII)Landroid/graphics/Bitmap;
    //   1253: astore 12
    //   1255: aload 12
    //   1257: astore 13
    //   1259: iload 10
    //   1261: ifeq +19 -> 1280
    //   1264: aload 16
    //   1266: astore 15
    //   1268: aload 12
    //   1270: iload_2
    //   1271: iload 4
    //   1273: iconst_0
    //   1274: iconst_1
    //   1275: invokestatic 422	com/tencent/mm/sdk/platformtools/d:a	(Landroid/graphics/Bitmap;IIZZ)Landroid/graphics/Bitmap;
    //   1278: astore 13
    //   1280: aload 13
    //   1282: astore 12
    //   1284: fload_1
    //   1285: fconst_0
    //   1286: fcmpl
    //   1287: ifle +15 -> 1302
    //   1290: aload 16
    //   1292: astore 15
    //   1294: aload 13
    //   1296: fload_1
    //   1297: invokestatic 425	com/tencent/mm/sdk/platformtools/d:c	(Landroid/graphics/Bitmap;F)Landroid/graphics/Bitmap;
    //   1300: astore 12
    //   1302: aload 12
    //   1304: astore 13
    //   1306: iload 11
    //   1308: ifeq +14 -> 1322
    //   1311: aload 16
    //   1313: astore 15
    //   1315: aload 12
    //   1317: invokestatic 429	com/tencent/mm/sdk/platformtools/d:Q	(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    //   1320: astore 13
    //   1322: iconst_1
    //   1323: istore_2
    //   1324: aload 16
    //   1326: ifnull +8 -> 1334
    //   1329: aload 16
    //   1331: invokevirtual 434	java/io/InputStream:close	()V
    //   1334: iload_2
    //   1335: ifeq +1064 -> 2399
    //   1338: aload 13
    //   1340: ifnonnull +1059 -> 2399
    //   1343: aload_0
    //   1344: getfield 90	com/tencent/mm/ao/a/f/b:gKr	Lcom/tencent/mm/ao/a/c/a;
    //   1347: aload_0
    //   1348: getfield 56	com/tencent/mm/ao/a/f/b:url	Ljava/lang/String;
    //   1351: aload_0
    //   1352: getfield 74	com/tencent/mm/ao/a/f/b:gKp	Lcom/tencent/mm/ao/a/a/c;
    //   1355: invokeinterface 437 3 0
    //   1360: pop
    //   1361: aload 13
    //   1363: astore 12
    //   1365: goto -1155 -> 210
    //   1368: aload 16
    //   1370: astore 15
    //   1372: aload 16
    //   1374: invokestatic 441	com/tencent/mm/sdk/platformtools/d:decodeStream	(Ljava/io/InputStream;)Landroid/graphics/Bitmap;
    //   1377: astore 12
    //   1379: goto -124 -> 1255
    //   1382: aload 16
    //   1384: astore 15
    //   1386: aload 16
    //   1388: fconst_0
    //   1389: iload_2
    //   1390: iload 4
    //   1392: invokestatic 419	com/tencent/mm/sdk/platformtools/d:a	(Ljava/io/InputStream;FII)Landroid/graphics/Bitmap;
    //   1395: astore 12
    //   1397: goto -142 -> 1255
    //   1400: iconst_1
    //   1401: istore_2
    //   1402: aconst_null
    //   1403: astore 13
    //   1405: goto -81 -> 1324
    //   1408: astore 12
    //   1410: aload 15
    //   1412: ifnull +8 -> 1420
    //   1415: aload 15
    //   1417: invokevirtual 434	java/io/InputStream:close	()V
    //   1420: aload 12
    //   1422: athrow
    //   1423: aload_0
    //   1424: getfield 58	com/tencent/mm/ao/a/f/b:gLl	Lcom/tencent/mm/ao/a/c;
    //   1427: aload_0
    //   1428: getfield 56	com/tencent/mm/ao/a/f/b:url	Ljava/lang/String;
    //   1431: aload_0
    //   1432: getfield 74	com/tencent/mm/ao/a/f/b:gKp	Lcom/tencent/mm/ao/a/a/c;
    //   1435: getfield 182	com/tencent/mm/ao/a/a/c:gKI	I
    //   1438: aload_0
    //   1439: getfield 74	com/tencent/mm/ao/a/f/b:gKp	Lcom/tencent/mm/ao/a/a/c;
    //   1442: getfield 188	com/tencent/mm/ao/a/a/c:gKJ	I
    //   1445: invokestatic 443	com/tencent/mm/ao/a/g/a:c	(Lcom/tencent/mm/ao/a/c;Ljava/lang/String;II)Landroid/graphics/Bitmap;
    //   1448: astore 12
    //   1450: goto -1240 -> 210
    //   1453: aload_0
    //   1454: getfield 69	com/tencent/mm/ao/a/f/b:gJX	Lcom/tencent/mm/ao/a/a/b;
    //   1457: getfield 447	com/tencent/mm/ao/a/a/b:gKm	Landroid/content/res/Resources;
    //   1460: aload_0
    //   1461: getfield 56	com/tencent/mm/ao/a/f/b:url	Ljava/lang/String;
    //   1464: ldc_w 449
    //   1467: aload_0
    //   1468: getfield 69	com/tencent/mm/ao/a/f/b:gJX	Lcom/tencent/mm/ao/a/a/b;
    //   1471: getfield 452	com/tencent/mm/ao/a/a/b:packageName	Ljava/lang/String;
    //   1474: invokevirtual 458	android/content/res/Resources:getIdentifier	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
    //   1477: istore_2
    //   1478: aload_0
    //   1479: getfield 58	com/tencent/mm/ao/a/f/b:gLl	Lcom/tencent/mm/ao/a/c;
    //   1482: iload_2
    //   1483: aload_0
    //   1484: getfield 74	com/tencent/mm/ao/a/f/b:gKp	Lcom/tencent/mm/ao/a/a/c;
    //   1487: getfield 182	com/tencent/mm/ao/a/a/c:gKI	I
    //   1490: aload_0
    //   1491: getfield 74	com/tencent/mm/ao/a/f/b:gKp	Lcom/tencent/mm/ao/a/a/c;
    //   1494: getfield 188	com/tencent/mm/ao/a/a/c:gKJ	I
    //   1497: invokestatic 461	com/tencent/mm/ao/a/g/a:a	(Lcom/tencent/mm/ao/a/c;III)Landroid/graphics/Bitmap;
    //   1500: astore 12
    //   1502: goto -1292 -> 210
    //   1505: aload_0
    //   1506: getfield 56	com/tencent/mm/ao/a/f/b:url	Ljava/lang/String;
    //   1509: invokestatic 464	java/lang/Integer:valueOf	(Ljava/lang/String;)Ljava/lang/Integer;
    //   1512: invokevirtual 467	java/lang/Integer:intValue	()I
    //   1515: istore_2
    //   1516: aload_0
    //   1517: getfield 58	com/tencent/mm/ao/a/f/b:gLl	Lcom/tencent/mm/ao/a/c;
    //   1520: iload_2
    //   1521: aload_0
    //   1522: getfield 74	com/tencent/mm/ao/a/f/b:gKp	Lcom/tencent/mm/ao/a/a/c;
    //   1525: getfield 182	com/tencent/mm/ao/a/a/c:gKI	I
    //   1528: aload_0
    //   1529: getfield 74	com/tencent/mm/ao/a/f/b:gKp	Lcom/tencent/mm/ao/a/a/c;
    //   1532: getfield 188	com/tencent/mm/ao/a/a/c:gKJ	I
    //   1535: invokestatic 461	com/tencent/mm/ao/a/g/a:a	(Lcom/tencent/mm/ao/a/c;III)Landroid/graphics/Bitmap;
    //   1538: astore 12
    //   1540: goto -1330 -> 210
    //   1543: invokestatic 209	java/lang/System:currentTimeMillis	()J
    //   1546: lstore 5
    //   1548: ldc 120
    //   1550: ldc_w 469
    //   1553: invokestatic 229	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   1556: aload_0
    //   1557: getfield 64	com/tencent/mm/ao/a/f/b:gLo	Lcom/tencent/mm/ao/a/c/g;
    //   1560: ifnull +32 -> 1592
    //   1563: aload_0
    //   1564: getfield 64	com/tencent/mm/ao/a/f/b:gLo	Lcom/tencent/mm/ao/a/c/g;
    //   1567: astore 13
    //   1569: aload_0
    //   1570: getfield 56	com/tencent/mm/ao/a/f/b:url	Ljava/lang/String;
    //   1573: astore 15
    //   1575: aload_0
    //   1576: getfield 58	com/tencent/mm/ao/a/f/b:gLl	Lcom/tencent/mm/ao/a/c;
    //   1579: invokevirtual 296	com/tencent/mm/ao/a/c:Da	()Landroid/widget/ImageView;
    //   1582: pop
    //   1583: aload 13
    //   1585: aload 15
    //   1587: invokeinterface 472 2 0
    //   1592: aload_0
    //   1593: getfield 84	com/tencent/mm/ao/a/f/b:gKs	Lcom/tencent/mm/ao/a/c/b;
    //   1596: aload_0
    //   1597: getfield 56	com/tencent/mm/ao/a/f/b:url	Ljava/lang/String;
    //   1600: invokeinterface 478 2 0
    //   1605: astore 13
    //   1607: aload 13
    //   1609: ifnonnull +787 -> 2396
    //   1612: new 198	com/tencent/mm/ao/a/d/b
    //   1615: dup
    //   1616: aconst_null
    //   1617: aconst_null
    //   1618: invokespecial 481	com/tencent/mm/ao/a/d/b:<init>	([BLjava/lang/String;)V
    //   1621: astore 14
    //   1623: aload 14
    //   1625: astore 13
    //   1627: aload 13
    //   1629: getfield 485	com/tencent/mm/ao/a/d/b:data	[B
    //   1632: ifnonnull +12 -> 1644
    //   1635: aload 13
    //   1637: iconst_1
    //   1638: putfield 488	com/tencent/mm/ao/a/d/b:status	I
    //   1641: goto -1398 -> 243
    //   1644: iload 9
    //   1646: ifeq +22 -> 1668
    //   1649: aload_0
    //   1650: getfield 98	com/tencent/mm/ao/a/f/b:gLp	Lcom/tencent/mm/ao/a/c/k;
    //   1653: aload 18
    //   1655: aload 13
    //   1657: getfield 485	com/tencent/mm/ao/a/d/b:data	[B
    //   1660: invokeinterface 491 3 0
    //   1665: ifeq +374 -> 2039
    //   1668: ldc 120
    //   1670: ldc_w 493
    //   1673: invokestatic 229	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   1676: invokestatic 209	java/lang/System:currentTimeMillis	()J
    //   1679: lstore 7
    //   1681: aload_0
    //   1682: getfield 58	com/tencent/mm/ao/a/f/b:gLl	Lcom/tencent/mm/ao/a/c;
    //   1685: aload 13
    //   1687: getfield 485	com/tencent/mm/ao/a/d/b:data	[B
    //   1690: aload_0
    //   1691: getfield 74	com/tencent/mm/ao/a/f/b:gKp	Lcom/tencent/mm/ao/a/a/c;
    //   1694: getfield 182	com/tencent/mm/ao/a/a/c:gKI	I
    //   1697: aload_0
    //   1698: getfield 74	com/tencent/mm/ao/a/f/b:gKp	Lcom/tencent/mm/ao/a/a/c;
    //   1701: getfield 188	com/tencent/mm/ao/a/a/c:gKJ	I
    //   1704: aload_0
    //   1705: getfield 74	com/tencent/mm/ao/a/f/b:gKp	Lcom/tencent/mm/ao/a/a/c;
    //   1708: getfield 378	com/tencent/mm/ao/a/a/c:gKQ	Z
    //   1711: aload_0
    //   1712: getfield 74	com/tencent/mm/ao/a/f/b:gKp	Lcom/tencent/mm/ao/a/a/c;
    //   1715: getfield 381	com/tencent/mm/ao/a/a/c:alpha	F
    //   1718: aload_0
    //   1719: getfield 74	com/tencent/mm/ao/a/f/b:gKp	Lcom/tencent/mm/ao/a/a/c;
    //   1722: getfield 384	com/tencent/mm/ao/a/a/c:gKL	Z
    //   1725: invokestatic 387	com/tencent/mm/ao/a/g/a:a	(Lcom/tencent/mm/ao/a/c;[BIIZFZ)Landroid/graphics/Bitmap;
    //   1728: astore 15
    //   1730: aload 15
    //   1732: ifnonnull +20 -> 1752
    //   1735: aload 15
    //   1737: astore 14
    //   1739: aload 13
    //   1741: iconst_3
    //   1742: putfield 488	com/tencent/mm/ao/a/d/b:status	I
    //   1745: aload 15
    //   1747: astore 12
    //   1749: goto -1506 -> 243
    //   1752: aload 15
    //   1754: astore 14
    //   1756: aload 13
    //   1758: getfield 485	com/tencent/mm/ao/a/d/b:data	[B
    //   1761: astore 12
    //   1763: aload 15
    //   1765: astore 14
    //   1767: aload_0
    //   1768: getfield 74	com/tencent/mm/ao/a/f/b:gKp	Lcom/tencent/mm/ao/a/a/c;
    //   1771: getfield 496	com/tencent/mm/ao/a/a/c:gKC	Z
    //   1774: ifeq +27 -> 1801
    //   1777: aload 15
    //   1779: astore 14
    //   1781: aload_0
    //   1782: getfield 90	com/tencent/mm/ao/a/f/b:gKr	Lcom/tencent/mm/ao/a/c/a;
    //   1785: aload_0
    //   1786: getfield 56	com/tencent/mm/ao/a/f/b:url	Ljava/lang/String;
    //   1789: aload 12
    //   1791: aload_0
    //   1792: getfield 74	com/tencent/mm/ao/a/f/b:gKp	Lcom/tencent/mm/ao/a/a/c;
    //   1795: invokeinterface 499 4 0
    //   1800: pop
    //   1801: aload 15
    //   1803: astore 14
    //   1805: aload_0
    //   1806: getfield 74	com/tencent/mm/ao/a/f/b:gKp	Lcom/tencent/mm/ao/a/a/c;
    //   1809: getfield 502	com/tencent/mm/ao/a/a/c:gKB	Z
    //   1812: ifeq +27 -> 1839
    //   1815: aload 15
    //   1817: astore 14
    //   1819: aload_0
    //   1820: getfield 90	com/tencent/mm/ao/a/f/b:gKr	Lcom/tencent/mm/ao/a/c/a;
    //   1823: aload_0
    //   1824: getfield 56	com/tencent/mm/ao/a/f/b:url	Ljava/lang/String;
    //   1827: aload 12
    //   1829: aload_0
    //   1830: getfield 74	com/tencent/mm/ao/a/f/b:gKp	Lcom/tencent/mm/ao/a/a/c;
    //   1833: invokeinterface 499 4 0
    //   1838: pop
    //   1839: aload 15
    //   1841: astore 12
    //   1843: aload 15
    //   1845: astore 14
    //   1847: aload_0
    //   1848: getfield 74	com/tencent/mm/ao/a/f/b:gKp	Lcom/tencent/mm/ao/a/a/c;
    //   1851: getfield 156	com/tencent/mm/ao/a/a/c:gKZ	Z
    //   1854: ifeq +56 -> 1910
    //   1857: aload 15
    //   1859: astore 14
    //   1861: aload_0
    //   1862: getfield 74	com/tencent/mm/ao/a/f/b:gKp	Lcom/tencent/mm/ao/a/a/c;
    //   1865: getfield 169	com/tencent/mm/ao/a/a/c:gLa	F
    //   1868: fconst_0
    //   1869: fcmpl
    //   1870: ifne +147 -> 2017
    //   1873: aload 15
    //   1875: astore 14
    //   1877: aload 15
    //   1879: invokevirtual 505	android/graphics/Bitmap:getWidth	()I
    //   1882: aload 15
    //   1884: invokevirtual 508	android/graphics/Bitmap:getHeight	()I
    //   1887: if_icmpne +51 -> 1938
    //   1890: aload 15
    //   1892: astore 14
    //   1894: aload 15
    //   1896: iconst_0
    //   1897: aload 15
    //   1899: invokevirtual 505	android/graphics/Bitmap:getWidth	()I
    //   1902: iconst_2
    //   1903: idiv
    //   1904: i2f
    //   1905: invokestatic 511	com/tencent/mm/sdk/platformtools/d:a	(Landroid/graphics/Bitmap;ZF)Landroid/graphics/Bitmap;
    //   1908: astore 12
    //   1910: aload 12
    //   1912: astore 14
    //   1914: aload_0
    //   1915: aload 17
    //   1917: aload 12
    //   1919: invokespecial 513	com/tencent/mm/ao/a/f/b:i	(Ljava/lang/String;Landroid/graphics/Bitmap;)V
    //   1922: aload 12
    //   1924: astore 14
    //   1926: aload_0
    //   1927: lload 7
    //   1929: lload 5
    //   1931: lsub
    //   1932: invokevirtual 514	com/tencent/mm/ao/a/f/b:av	(J)V
    //   1935: goto -1692 -> 243
    //   1938: aload 15
    //   1940: astore 14
    //   1942: aload 15
    //   1944: invokevirtual 505	android/graphics/Bitmap:getWidth	()I
    //   1947: aload 15
    //   1949: invokevirtual 508	android/graphics/Bitmap:getHeight	()I
    //   1952: invokestatic 520	java/lang/Math:min	(II)I
    //   1955: istore_3
    //   1956: iload_3
    //   1957: istore_2
    //   1958: iload_3
    //   1959: ifgt +21 -> 1980
    //   1962: aload 15
    //   1964: astore 14
    //   1966: aload 15
    //   1968: invokevirtual 505	android/graphics/Bitmap:getWidth	()I
    //   1971: aload 15
    //   1973: invokevirtual 508	android/graphics/Bitmap:getHeight	()I
    //   1976: invokestatic 523	java/lang/Math:max	(II)I
    //   1979: istore_2
    //   1980: aload 15
    //   1982: astore 14
    //   1984: aload 15
    //   1986: iload_2
    //   1987: iload_2
    //   1988: iconst_1
    //   1989: invokestatic 526	com/tencent/mm/sdk/platformtools/d:a	(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;
    //   1992: astore 12
    //   1994: aload 12
    //   1996: astore 14
    //   1998: aload 12
    //   2000: iconst_0
    //   2001: aload 12
    //   2003: invokevirtual 505	android/graphics/Bitmap:getWidth	()I
    //   2006: iconst_2
    //   2007: idiv
    //   2008: i2f
    //   2009: invokestatic 511	com/tencent/mm/sdk/platformtools/d:a	(Landroid/graphics/Bitmap;ZF)Landroid/graphics/Bitmap;
    //   2012: astore 12
    //   2014: goto -104 -> 1910
    //   2017: aload 15
    //   2019: astore 14
    //   2021: aload 15
    //   2023: iconst_0
    //   2024: aload_0
    //   2025: getfield 74	com/tencent/mm/ao/a/f/b:gKp	Lcom/tencent/mm/ao/a/a/c;
    //   2028: getfield 169	com/tencent/mm/ao/a/a/c:gLa	F
    //   2031: invokestatic 511	com/tencent/mm/sdk/platformtools/d:a	(Landroid/graphics/Bitmap;ZF)Landroid/graphics/Bitmap;
    //   2034: astore 12
    //   2036: goto -126 -> 1910
    //   2039: aload 13
    //   2041: iconst_2
    //   2042: putfield 488	com/tencent/mm/ao/a/d/b:status	I
    //   2045: ldc 120
    //   2047: ldc_w 528
    //   2050: invokestatic 263	com/tencent/mm/sdk/platformtools/w:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   2053: aconst_null
    //   2054: astore 12
    //   2056: goto -1813 -> 243
    //   2059: ldc 120
    //   2061: ldc_w 530
    //   2064: invokestatic 263	com/tencent/mm/sdk/platformtools/w:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   2067: aload 14
    //   2069: astore 13
    //   2071: goto -1828 -> 243
    //   2074: aload_0
    //   2075: getfield 74	com/tencent/mm/ao/a/f/b:gKp	Lcom/tencent/mm/ao/a/a/c;
    //   2078: getfield 156	com/tencent/mm/ao/a/a/c:gKZ	Z
    //   2081: ifeq +308 -> 2389
    //   2084: aload_0
    //   2085: getfield 74	com/tencent/mm/ao/a/f/b:gKp	Lcom/tencent/mm/ao/a/a/c;
    //   2088: getfield 169	com/tencent/mm/ao/a/a/c:gLa	F
    //   2091: fconst_0
    //   2092: fcmpl
    //   2093: ifne +147 -> 2240
    //   2096: aload 12
    //   2098: invokevirtual 505	android/graphics/Bitmap:getWidth	()I
    //   2101: aload 12
    //   2103: invokevirtual 508	android/graphics/Bitmap:getHeight	()I
    //   2106: if_icmpne +67 -> 2173
    //   2109: aload 12
    //   2111: iconst_0
    //   2112: aload 12
    //   2114: invokevirtual 505	android/graphics/Bitmap:getWidth	()I
    //   2117: iconst_2
    //   2118: idiv
    //   2119: i2f
    //   2120: invokestatic 511	com/tencent/mm/sdk/platformtools/d:a	(Landroid/graphics/Bitmap;ZF)Landroid/graphics/Bitmap;
    //   2123: astore 13
    //   2125: aload 13
    //   2127: astore 12
    //   2129: aload_0
    //   2130: aload 17
    //   2132: aload 13
    //   2134: invokespecial 513	com/tencent/mm/ao/a/f/b:i	(Ljava/lang/String;Landroid/graphics/Bitmap;)V
    //   2137: aload 13
    //   2139: astore 12
    //   2141: aload_0
    //   2142: lload 7
    //   2144: lload 5
    //   2146: lsub
    //   2147: invokevirtual 514	com/tencent/mm/ao/a/f/b:av	(J)V
    //   2150: aload 13
    //   2152: astore 12
    //   2154: ldc 120
    //   2156: ldc_w 532
    //   2159: invokestatic 229	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   2162: aload 13
    //   2164: astore 12
    //   2166: aload 14
    //   2168: astore 13
    //   2170: goto -1927 -> 243
    //   2173: aload 12
    //   2175: invokevirtual 505	android/graphics/Bitmap:getWidth	()I
    //   2178: aload 12
    //   2180: invokevirtual 508	android/graphics/Bitmap:getHeight	()I
    //   2183: invokestatic 520	java/lang/Math:min	(II)I
    //   2186: istore_3
    //   2187: iload_3
    //   2188: istore_2
    //   2189: iload_3
    //   2190: ifgt +17 -> 2207
    //   2193: aload 12
    //   2195: invokevirtual 505	android/graphics/Bitmap:getWidth	()I
    //   2198: aload 12
    //   2200: invokevirtual 508	android/graphics/Bitmap:getHeight	()I
    //   2203: invokestatic 523	java/lang/Math:max	(II)I
    //   2206: istore_2
    //   2207: aload 12
    //   2209: iload_2
    //   2210: iload_2
    //   2211: iconst_1
    //   2212: invokestatic 526	com/tencent/mm/sdk/platformtools/d:a	(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;
    //   2215: astore 13
    //   2217: aload 13
    //   2219: astore 12
    //   2221: aload 13
    //   2223: iconst_0
    //   2224: aload 13
    //   2226: invokevirtual 505	android/graphics/Bitmap:getWidth	()I
    //   2229: iconst_2
    //   2230: idiv
    //   2231: i2f
    //   2232: invokestatic 511	com/tencent/mm/sdk/platformtools/d:a	(Landroid/graphics/Bitmap;ZF)Landroid/graphics/Bitmap;
    //   2235: astore 13
    //   2237: goto -112 -> 2125
    //   2240: aload 12
    //   2242: iconst_0
    //   2243: aload_0
    //   2244: getfield 74	com/tencent/mm/ao/a/f/b:gKp	Lcom/tencent/mm/ao/a/a/c;
    //   2247: getfield 169	com/tencent/mm/ao/a/a/c:gLa	F
    //   2250: invokestatic 511	com/tencent/mm/sdk/platformtools/d:a	(Landroid/graphics/Bitmap;ZF)Landroid/graphics/Bitmap;
    //   2253: astore 13
    //   2255: goto -130 -> 2125
    //   2258: ldc 120
    //   2260: ldc_w 534
    //   2263: invokestatic 263	com/tencent/mm/sdk/platformtools/w:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   2266: goto -1915 -> 351
    //   2269: astore 12
    //   2271: goto -937 -> 1334
    //   2274: astore 13
    //   2276: goto -856 -> 1420
    //   2279: astore 15
    //   2281: aload 12
    //   2283: astore 13
    //   2285: aload 14
    //   2287: astore 12
    //   2289: aload 15
    //   2291: astore 14
    //   2293: goto -1271 -> 1022
    //   2296: astore 15
    //   2298: aload 14
    //   2300: astore 12
    //   2302: aload 15
    //   2304: astore 14
    //   2306: goto -1284 -> 1022
    //   2309: astore 16
    //   2311: aload 14
    //   2313: astore 13
    //   2315: aload 12
    //   2317: astore 15
    //   2319: aload 16
    //   2321: astore 14
    //   2323: aload 13
    //   2325: astore 12
    //   2327: aload 15
    //   2329: astore 13
    //   2331: goto -1309 -> 1022
    //   2334: astore 14
    //   2336: aload 12
    //   2338: astore 15
    //   2340: aload 13
    //   2342: astore 12
    //   2344: aload 15
    //   2346: astore 13
    //   2348: goto -1326 -> 1022
    //   2351: astore 14
    //   2353: aload 12
    //   2355: astore 15
    //   2357: aload 13
    //   2359: astore 12
    //   2361: aload 15
    //   2363: astore 13
    //   2365: goto -1343 -> 1022
    //   2368: astore 16
    //   2370: aload 14
    //   2372: astore 15
    //   2374: aload 13
    //   2376: astore 12
    //   2378: aload 16
    //   2380: astore 14
    //   2382: aload 15
    //   2384: astore 13
    //   2386: goto -1364 -> 1022
    //   2389: aload 12
    //   2391: astore 13
    //   2393: goto -268 -> 2125
    //   2396: goto -769 -> 1627
    //   2399: aload 13
    //   2401: astore 12
    //   2403: goto -2193 -> 210
    //   2406: aconst_null
    //   2407: astore 13
    //   2409: goto -1085 -> 1324
    //   2412: aload 13
    //   2414: astore 12
    //   2416: goto -2206 -> 210
    //   2419: goto -2227 -> 192
    //   2422: iload_3
    //   2423: tableswitch	default:+33->2456, 1:+-364->2059, 2:+-364->2059, 3:+-364->2059, 4:+-364->2059, 5:+-880->1543
    //   2456: goto -2225 -> 231
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	2459	0	this	b
    //   1181	116	1	f	float
    //   1072	1139	2	i	int
    //   60	2363	3	j	int
    //   1155	236	4	k	int
    //   51	2094	5	l1	long
    //   213	1930	7	l2	long
    //   68	1577	9	bool1	boolean
    //   1168	92	10	bool2	boolean
    //   1193	114	11	bool3	boolean
    //   9	1387	12	localObject1	Object
    //   1408	13	12	localObject2	Object
    //   1448	793	12	localObject3	Object
    //   2269	13	12	localIOException1	java.io.IOException
    //   2287	128	12	localObject4	Object
    //   241	2013	13	localObject5	Object
    //   2274	1	13	localIOException2	java.io.IOException
    //   2283	130	13	localObject6	Object
    //   18	2304	14	localObject7	Object
    //   2334	1	14	localException1	Exception
    //   2351	20	14	localException2	Exception
    //   2380	1	14	localObject8	Object
    //   700	254	15	localObject9	Object
    //   1009	10	15	localException3	Exception
    //   1069	953	15	localObject10	Object
    //   2279	11	15	localException4	Exception
    //   2296	7	15	localException5	Exception
    //   2317	66	15	localObject11	Object
    //   1090	297	16	localInputStream	java.io.InputStream
    //   2309	11	16	localException6	Exception
    //   2368	11	16	localException7	Exception
    //   28	2103	17	str1	String
    //   77	1577	18	str2	String
    // Exception table:
    //   from	to	target	type
    //   20	156	1009	java/lang/Exception
    //   192	210	1009	java/lang/Exception
    //   483	553	1009	java/lang/Exception
    //   590	615	1009	java/lang/Exception
    //   618	638	1009	java/lang/Exception
    //   643	661	1009	java/lang/Exception
    //   661	698	1009	java/lang/Exception
    //   836	903	1009	java/lang/Exception
    //   906	933	1009	java/lang/Exception
    //   958	966	1009	java/lang/Exception
    //   972	998	1009	java/lang/Exception
    //   998	1006	1009	java/lang/Exception
    //   1057	1065	1009	java/lang/Exception
    //   1415	1420	1009	java/lang/Exception
    //   1420	1423	1009	java/lang/Exception
    //   1423	1450	1009	java/lang/Exception
    //   1453	1502	1009	java/lang/Exception
    //   1505	1540	1009	java/lang/Exception
    //   1073	1092	1408	finally
    //   1106	1122	1408	finally
    //   1126	1132	1408	finally
    //   1136	1144	1408	finally
    //   1148	1157	1408	finally
    //   1161	1170	1408	finally
    //   1174	1182	1408	finally
    //   1186	1195	1408	finally
    //   1213	1221	1408	finally
    //   1225	1233	1408	finally
    //   1237	1255	1408	finally
    //   1268	1280	1408	finally
    //   1294	1302	1408	finally
    //   1315	1322	1408	finally
    //   1372	1379	1408	finally
    //   1386	1397	1408	finally
    //   1329	1334	2269	java/io/IOException
    //   1415	1420	2274	java/io/IOException
    //   557	567	2279	java/lang/Exception
    //   571	583	2279	java/lang/Exception
    //   706	716	2279	java/lang/Exception
    //   733	740	2279	java/lang/Exception
    //   744	751	2279	java/lang/Exception
    //   755	782	2279	java/lang/Exception
    //   791	801	2279	java/lang/Exception
    //   805	817	2279	java/lang/Exception
    //   821	829	2279	java/lang/Exception
    //   940	955	2279	java/lang/Exception
    //   2129	2137	2279	java/lang/Exception
    //   2141	2150	2279	java/lang/Exception
    //   2154	2162	2279	java/lang/Exception
    //   2221	2237	2279	java/lang/Exception
    //   1329	1334	2296	java/lang/Exception
    //   1343	1361	2296	java/lang/Exception
    //   210	215	2309	java/lang/Exception
    //   220	228	2309	java/lang/Exception
    //   231	239	2309	java/lang/Exception
    //   1543	1592	2309	java/lang/Exception
    //   1592	1607	2309	java/lang/Exception
    //   2059	2067	2309	java/lang/Exception
    //   2074	2125	2309	java/lang/Exception
    //   2173	2187	2309	java/lang/Exception
    //   2193	2207	2309	java/lang/Exception
    //   2207	2217	2309	java/lang/Exception
    //   2240	2255	2309	java/lang/Exception
    //   1612	1623	2334	java/lang/Exception
    //   1627	1641	2351	java/lang/Exception
    //   1649	1668	2351	java/lang/Exception
    //   1668	1730	2351	java/lang/Exception
    //   2039	2053	2351	java/lang/Exception
    //   1739	1745	2368	java/lang/Exception
    //   1756	1763	2368	java/lang/Exception
    //   1767	1777	2368	java/lang/Exception
    //   1781	1801	2368	java/lang/Exception
    //   1805	1815	2368	java/lang/Exception
    //   1819	1839	2368	java/lang/Exception
    //   1847	1857	2368	java/lang/Exception
    //   1861	1873	2368	java/lang/Exception
    //   1877	1890	2368	java/lang/Exception
    //   1894	1910	2368	java/lang/Exception
    //   1914	1922	2368	java/lang/Exception
    //   1926	1935	2368	java/lang/Exception
    //   1942	1956	2368	java/lang/Exception
    //   1966	1980	2368	java/lang/Exception
    //   1984	1994	2368	java/lang/Exception
    //   1998	2014	2368	java/lang/Exception
    //   2021	2036	2368	java/lang/Exception
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ao\a\f\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */