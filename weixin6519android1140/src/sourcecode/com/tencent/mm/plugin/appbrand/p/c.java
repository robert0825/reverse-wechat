package com.tencent.mm.plugin.appbrand.p;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.p.d.d.a;
import com.tencent.mm.sdk.platformtools.w;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.channels.SelectionKey;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public final class c
  implements a
{
  public static boolean DEBUG;
  public static int iHj;
  public static final List<com.tencent.mm.plugin.appbrand.p.b.a> iHk;
  private Boolean iHA;
  public String iHB;
  public SelectionKey iHl;
  public ByteChannel iHm;
  public final BlockingQueue<ByteBuffer> iHn;
  public final BlockingQueue<ByteBuffer> iHo;
  private volatile boolean iHp;
  public int iHq;
  public final d iHr;
  private List<com.tencent.mm.plugin.appbrand.p.b.a> iHs;
  public com.tencent.mm.plugin.appbrand.p.b.a iHt;
  public int iHu;
  private d.a iHv;
  private ByteBuffer iHw;
  public com.tencent.mm.plugin.appbrand.p.e.a iHx;
  private String iHy;
  private Integer iHz;
  
  static
  {
    GMTrace.i(10186857119744L, 75898);
    iHj = 16384;
    DEBUG = false;
    ArrayList localArrayList = new ArrayList(4);
    iHk = localArrayList;
    localArrayList.add(new com.tencent.mm.plugin.appbrand.p.b.c());
    iHk.add(new com.tencent.mm.plugin.appbrand.p.b.b());
    iHk.add(new com.tencent.mm.plugin.appbrand.p.b.d());
    GMTrace.o(10186857119744L, 75898);
  }
  
  public c(d paramd, com.tencent.mm.plugin.appbrand.p.b.a parama)
  {
    GMTrace.i(10184306982912L, 75879);
    this.iHp = false;
    this.iHq = a.a.iHa;
    this.iHt = null;
    this.iHv = null;
    this.iHw = ByteBuffer.allocate(0);
    this.iHx = null;
    this.iHy = null;
    this.iHz = null;
    this.iHA = null;
    this.iHB = null;
    if ((paramd == null) || ((parama == null) && (this.iHu == a.b.iHh))) {
      throw new IllegalArgumentException("parameters must not be null");
    }
    this.iHn = new LinkedBlockingQueue();
    this.iHo = new LinkedBlockingQueue();
    this.iHr = paramd;
    this.iHu = a.b.iHg;
    if (parama != null) {
      this.iHt = parama.abM();
    }
    GMTrace.o(10184306982912L, 75879);
  }
  
  private void a(com.tencent.mm.plugin.appbrand.p.c.b paramb)
  {
    GMTrace.i(10185514942464L, 75888);
    c(paramb.iIg, paramb.getMessage(), false);
    GMTrace.o(10185514942464L, 75888);
  }
  
  private void a(com.tencent.mm.plugin.appbrand.p.e.f paramf)
  {
    GMTrace.i(10186186031104L, 75893);
    if (DEBUG) {
      w.i("MicroMsg.AppBrandNetWork.WebSocketImpl", "open using draft: " + this.iHt.getClass().getSimpleName());
    }
    this.iHq = a.a.iHc;
    try
    {
      this.iHr.abI();
      GMTrace.o(10186186031104L, 75893);
      return;
    }
    catch (RuntimeException paramf)
    {
      this.iHr.c(paramf);
      GMTrace.o(10186186031104L, 75893);
    }
  }
  
  /* Error */
  private boolean d(ByteBuffer paramByteBuffer)
  {
    // Byte code:
    //   0: ldc2_w 223
    //   3: ldc -31
    //   5: invokestatic 53	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   8: aload_0
    //   9: getfield 111	com/tencent/mm/plugin/appbrand/p/c:iHw	Ljava/nio/ByteBuffer;
    //   12: invokevirtual 229	java/nio/ByteBuffer:capacity	()I
    //   15: ifne +94 -> 109
    //   18: aload_1
    //   19: astore 5
    //   21: aload 5
    //   23: invokevirtual 233	java/nio/ByteBuffer:mark	()Ljava/nio/Buffer;
    //   26: pop
    //   27: aload_0
    //   28: getfield 101	com/tencent/mm/plugin/appbrand/p/c:iHt	Lcom/tencent/mm/plugin/appbrand/p/b/a;
    //   31: ifnonnull +362 -> 393
    //   34: aload 5
    //   36: invokevirtual 233	java/nio/ByteBuffer:mark	()Ljava/nio/Buffer;
    //   39: pop
    //   40: aload 5
    //   42: invokevirtual 236	java/nio/ByteBuffer:limit	()I
    //   45: getstatic 240	com/tencent/mm/plugin/appbrand/p/b/a:iHR	[B
    //   48: arraylength
    //   49: if_icmple +141 -> 190
    //   52: getstatic 246	com/tencent/mm/plugin/appbrand/p/b/a$b:iHY	Lcom/tencent/mm/plugin/appbrand/p/b/a$b;
    //   55: astore 4
    //   57: getstatic 249	com/tencent/mm/plugin/appbrand/p/b/a$b:iHX	Lcom/tencent/mm/plugin/appbrand/p/b/a$b;
    //   60: astore 6
    //   62: aload 4
    //   64: aload 6
    //   66: if_acmpne +327 -> 393
    //   69: aload_0
    //   70: aload_0
    //   71: getfield 144	com/tencent/mm/plugin/appbrand/p/c:iHr	Lcom/tencent/mm/plugin/appbrand/p/d;
    //   74: aload_0
    //   75: invokeinterface 252 2 0
    //   80: invokestatic 258	com/tencent/mm/plugin/appbrand/p/f/b:sH	(Ljava/lang/String;)[B
    //   83: invokestatic 262	java/nio/ByteBuffer:wrap	([B)Ljava/nio/ByteBuffer;
    //   86: invokespecial 266	com/tencent/mm/plugin/appbrand/p/c:f	(Ljava/nio/ByteBuffer;)V
    //   89: aload_0
    //   90: bipush -3
    //   92: ldc_w 268
    //   95: iconst_0
    //   96: invokevirtual 171	com/tencent/mm/plugin/appbrand/p/c:c	(ILjava/lang/String;Z)V
    //   99: ldc2_w 223
    //   102: ldc -31
    //   104: invokestatic 84	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   107: iconst_0
    //   108: ireturn
    //   109: aload_0
    //   110: getfield 111	com/tencent/mm/plugin/appbrand/p/c:iHw	Ljava/nio/ByteBuffer;
    //   113: invokevirtual 271	java/nio/ByteBuffer:remaining	()I
    //   116: aload_1
    //   117: invokevirtual 271	java/nio/ByteBuffer:remaining	()I
    //   120: if_icmpge +44 -> 164
    //   123: aload_0
    //   124: getfield 111	com/tencent/mm/plugin/appbrand/p/c:iHw	Ljava/nio/ByteBuffer;
    //   127: invokevirtual 229	java/nio/ByteBuffer:capacity	()I
    //   130: aload_1
    //   131: invokevirtual 271	java/nio/ByteBuffer:remaining	()I
    //   134: iadd
    //   135: invokestatic 109	java/nio/ByteBuffer:allocate	(I)Ljava/nio/ByteBuffer;
    //   138: astore 4
    //   140: aload_0
    //   141: getfield 111	com/tencent/mm/plugin/appbrand/p/c:iHw	Ljava/nio/ByteBuffer;
    //   144: invokevirtual 274	java/nio/ByteBuffer:flip	()Ljava/nio/Buffer;
    //   147: pop
    //   148: aload 4
    //   150: aload_0
    //   151: getfield 111	com/tencent/mm/plugin/appbrand/p/c:iHw	Ljava/nio/ByteBuffer;
    //   154: invokevirtual 278	java/nio/ByteBuffer:put	(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;
    //   157: pop
    //   158: aload_0
    //   159: aload 4
    //   161: putfield 111	com/tencent/mm/plugin/appbrand/p/c:iHw	Ljava/nio/ByteBuffer;
    //   164: aload_0
    //   165: getfield 111	com/tencent/mm/plugin/appbrand/p/c:iHw	Ljava/nio/ByteBuffer;
    //   168: aload_1
    //   169: invokevirtual 278	java/nio/ByteBuffer:put	(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;
    //   172: pop
    //   173: aload_0
    //   174: getfield 111	com/tencent/mm/plugin/appbrand/p/c:iHw	Ljava/nio/ByteBuffer;
    //   177: invokevirtual 274	java/nio/ByteBuffer:flip	()Ljava/nio/Buffer;
    //   180: pop
    //   181: aload_0
    //   182: getfield 111	com/tencent/mm/plugin/appbrand/p/c:iHw	Ljava/nio/ByteBuffer;
    //   185: astore 5
    //   187: goto -166 -> 21
    //   190: aload 5
    //   192: invokevirtual 236	java/nio/ByteBuffer:limit	()I
    //   195: getstatic 240	com/tencent/mm/plugin/appbrand/p/b/a:iHR	[B
    //   198: arraylength
    //   199: if_icmpge +107 -> 306
    //   202: new 220	com/tencent/mm/plugin/appbrand/p/c/a
    //   205: dup
    //   206: getstatic 240	com/tencent/mm/plugin/appbrand/p/b/a:iHR	[B
    //   209: arraylength
    //   210: invokespecial 279	com/tencent/mm/plugin/appbrand/p/c/a:<init>	(I)V
    //   213: athrow
    //   214: astore 4
    //   216: ldc -77
    //   218: new 181	java/lang/StringBuilder
    //   221: dup
    //   222: ldc_w 281
    //   225: invokespecial 184	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   228: aload 4
    //   230: invokevirtual 282	com/tencent/mm/plugin/appbrand/p/c/a:toString	()Ljava/lang/String;
    //   233: invokevirtual 197	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   236: invokevirtual 200	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   239: invokestatic 285	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   242: aload_0
    //   243: getfield 111	com/tencent/mm/plugin/appbrand/p/c:iHw	Ljava/nio/ByteBuffer;
    //   246: invokevirtual 229	java/nio/ByteBuffer:capacity	()I
    //   249: ifne +723 -> 972
    //   252: aload 5
    //   254: invokevirtual 288	java/nio/ByteBuffer:reset	()Ljava/nio/Buffer;
    //   257: pop
    //   258: aload 4
    //   260: getfield 291	com/tencent/mm/plugin/appbrand/p/c/a:iIf	I
    //   263: istore_3
    //   264: iload_3
    //   265: istore_2
    //   266: iload_3
    //   267: ifne +12 -> 279
    //   270: aload 5
    //   272: invokevirtual 229	java/nio/ByteBuffer:capacity	()I
    //   275: bipush 16
    //   277: iadd
    //   278: istore_2
    //   279: aload_0
    //   280: iload_2
    //   281: invokestatic 109	java/nio/ByteBuffer:allocate	(I)Ljava/nio/ByteBuffer;
    //   284: putfield 111	com/tencent/mm/plugin/appbrand/p/c:iHw	Ljava/nio/ByteBuffer;
    //   287: aload_0
    //   288: getfield 111	com/tencent/mm/plugin/appbrand/p/c:iHw	Ljava/nio/ByteBuffer;
    //   291: aload_1
    //   292: invokevirtual 278	java/nio/ByteBuffer:put	(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;
    //   295: pop
    //   296: ldc2_w 223
    //   299: ldc -31
    //   301: invokestatic 84	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   304: iconst_0
    //   305: ireturn
    //   306: iconst_0
    //   307: istore_2
    //   308: aload 5
    //   310: invokevirtual 295	java/nio/ByteBuffer:hasRemaining	()Z
    //   313: ifeq +30 -> 343
    //   316: getstatic 240	com/tencent/mm/plugin/appbrand/p/b/a:iHR	[B
    //   319: iload_2
    //   320: baload
    //   321: aload 5
    //   323: invokevirtual 299	java/nio/ByteBuffer:get	()B
    //   326: if_icmpeq +679 -> 1005
    //   329: aload 5
    //   331: invokevirtual 288	java/nio/ByteBuffer:reset	()Ljava/nio/Buffer;
    //   334: pop
    //   335: getstatic 246	com/tencent/mm/plugin/appbrand/p/b/a$b:iHY	Lcom/tencent/mm/plugin/appbrand/p/b/a$b;
    //   338: astore 4
    //   340: goto -283 -> 57
    //   343: getstatic 249	com/tencent/mm/plugin/appbrand/p/b/a$b:iHX	Lcom/tencent/mm/plugin/appbrand/p/b/a$b;
    //   346: astore 4
    //   348: goto -291 -> 57
    //   351: astore 4
    //   353: ldc -77
    //   355: new 181	java/lang/StringBuilder
    //   358: dup
    //   359: ldc_w 301
    //   362: invokespecial 184	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   365: aload 4
    //   367: invokevirtual 302	com/tencent/mm/plugin/appbrand/p/c/b:toString	()Ljava/lang/String;
    //   370: invokevirtual 197	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   373: invokevirtual 200	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   376: invokestatic 285	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   379: aload_0
    //   380: sipush 1006
    //   383: ldc_w 304
    //   386: iconst_1
    //   387: invokevirtual 171	com/tencent/mm/plugin/appbrand/p/c:c	(ILjava/lang/String;Z)V
    //   390: goto -291 -> 99
    //   393: aload_0
    //   394: getfield 123	com/tencent/mm/plugin/appbrand/p/c:iHu	I
    //   397: getstatic 128	com/tencent/mm/plugin/appbrand/p/a$b:iHh	I
    //   400: if_icmpne +435 -> 835
    //   403: aload_0
    //   404: getfield 101	com/tencent/mm/plugin/appbrand/p/c:iHt	Lcom/tencent/mm/plugin/appbrand/p/b/a;
    //   407: ifnonnull +329 -> 736
    //   410: aload_0
    //   411: getfield 306	com/tencent/mm/plugin/appbrand/p/c:iHs	Ljava/util/List;
    //   414: invokeinterface 310 1 0
    //   419: astore 4
    //   421: aload 4
    //   423: invokeinterface 315 1 0
    //   428: ifeq +280 -> 708
    //   431: aload 4
    //   433: invokeinterface 319 1 0
    //   438: checkcast 149	com/tencent/mm/plugin/appbrand/p/b/a
    //   441: invokevirtual 153	com/tencent/mm/plugin/appbrand/p/b/a:abM	()Lcom/tencent/mm/plugin/appbrand/p/b/a;
    //   444: astore 6
    //   446: aload 6
    //   448: aload_0
    //   449: getfield 123	com/tencent/mm/plugin/appbrand/p/c:iHu	I
    //   452: invokevirtual 322	com/tencent/mm/plugin/appbrand/p/b/a:jP	(I)V
    //   455: aload 5
    //   457: invokevirtual 288	java/nio/ByteBuffer:reset	()Ljava/nio/Buffer;
    //   460: pop
    //   461: aload 6
    //   463: aload 5
    //   465: invokevirtual 326	com/tencent/mm/plugin/appbrand/p/b/a:j	(Ljava/nio/ByteBuffer;)Lcom/tencent/mm/plugin/appbrand/p/e/f;
    //   468: astore 7
    //   470: aload 7
    //   472: instanceof 328
    //   475: ifne +24 -> 499
    //   478: aload_0
    //   479: sipush 1002
    //   482: ldc_w 330
    //   485: iconst_0
    //   486: invokespecial 332	com/tencent/mm/plugin/appbrand/p/c:e	(ILjava/lang/String;Z)V
    //   489: ldc2_w 223
    //   492: ldc -31
    //   494: invokestatic 84	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   497: iconst_0
    //   498: ireturn
    //   499: aload 7
    //   501: checkcast 328	com/tencent/mm/plugin/appbrand/p/e/a
    //   504: astore 7
    //   506: aload 6
    //   508: aload 7
    //   510: invokevirtual 335	com/tencent/mm/plugin/appbrand/p/b/a:a	(Lcom/tencent/mm/plugin/appbrand/p/e/a;)Lcom/tencent/mm/plugin/appbrand/p/b/a$b;
    //   513: getstatic 249	com/tencent/mm/plugin/appbrand/p/b/a$b:iHX	Lcom/tencent/mm/plugin/appbrand/p/b/a$b;
    //   516: if_acmpne -95 -> 421
    //   519: aload_0
    //   520: aload 7
    //   522: invokeinterface 338 1 0
    //   527: putfield 121	com/tencent/mm/plugin/appbrand/p/c:iHB	Ljava/lang/String;
    //   530: aload_0
    //   531: getfield 144	com/tencent/mm/plugin/appbrand/p/c:iHr	Lcom/tencent/mm/plugin/appbrand/p/d;
    //   534: invokeinterface 342 1 0
    //   539: astore 8
    //   541: aload_0
    //   542: aload 6
    //   544: aload 7
    //   546: aload 8
    //   548: invokevirtual 345	com/tencent/mm/plugin/appbrand/p/b/a:a	(Lcom/tencent/mm/plugin/appbrand/p/e/a;Lcom/tencent/mm/plugin/appbrand/p/e/i;)Lcom/tencent/mm/plugin/appbrand/p/e/c;
    //   551: invokestatic 349	com/tencent/mm/plugin/appbrand/p/b/a:b	(Lcom/tencent/mm/plugin/appbrand/p/e/f;)Ljava/util/List;
    //   554: invokevirtual 353	com/tencent/mm/plugin/appbrand/p/c:W	(Ljava/util/List;)V
    //   557: aload_0
    //   558: aload 6
    //   560: putfield 101	com/tencent/mm/plugin/appbrand/p/c:iHt	Lcom/tencent/mm/plugin/appbrand/p/b/a;
    //   563: aload_0
    //   564: aload 7
    //   566: invokespecial 355	com/tencent/mm/plugin/appbrand/p/c:a	(Lcom/tencent/mm/plugin/appbrand/p/e/f;)V
    //   569: ldc2_w 223
    //   572: ldc -31
    //   574: invokestatic 84	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   577: iconst_1
    //   578: ireturn
    //   579: astore 6
    //   581: aload_0
    //   582: aload 6
    //   584: getfield 163	com/tencent/mm/plugin/appbrand/p/c/b:iIg	I
    //   587: aload 6
    //   589: invokevirtual 167	com/tencent/mm/plugin/appbrand/p/c/b:getMessage	()Ljava/lang/String;
    //   592: iconst_0
    //   593: invokespecial 332	com/tencent/mm/plugin/appbrand/p/c:e	(ILjava/lang/String;Z)V
    //   596: ldc2_w 223
    //   599: ldc -31
    //   601: invokestatic 84	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   604: iconst_0
    //   605: ireturn
    //   606: astore 6
    //   608: aload_0
    //   609: getfield 144	com/tencent/mm/plugin/appbrand/p/c:iHr	Lcom/tencent/mm/plugin/appbrand/p/d;
    //   612: aload 6
    //   614: invokeinterface 216 2 0
    //   619: aload_0
    //   620: iconst_m1
    //   621: aload 6
    //   623: invokevirtual 356	java/lang/RuntimeException:getMessage	()Ljava/lang/String;
    //   626: iconst_0
    //   627: invokespecial 332	com/tencent/mm/plugin/appbrand/p/c:e	(ILjava/lang/String;Z)V
    //   630: ldc2_w 223
    //   633: ldc -31
    //   635: invokestatic 84	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   638: iconst_0
    //   639: ireturn
    //   640: astore 6
    //   642: ldc -77
    //   644: new 181	java/lang/StringBuilder
    //   647: dup
    //   648: ldc_w 358
    //   651: invokespecial 184	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   654: aload 6
    //   656: invokevirtual 359	com/tencent/mm/plugin/appbrand/p/c/d:toString	()Ljava/lang/String;
    //   659: invokevirtual 197	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   662: invokevirtual 200	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   665: invokestatic 285	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   668: goto -247 -> 421
    //   671: astore 4
    //   673: ldc -77
    //   675: new 181	java/lang/StringBuilder
    //   678: dup
    //   679: ldc_w 281
    //   682: invokespecial 184	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   685: aload 4
    //   687: invokevirtual 359	com/tencent/mm/plugin/appbrand/p/c/d:toString	()Ljava/lang/String;
    //   690: invokevirtual 197	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   693: invokevirtual 200	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   696: invokestatic 285	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   699: aload_0
    //   700: aload 4
    //   702: invokespecial 361	com/tencent/mm/plugin/appbrand/p/c:a	(Lcom/tencent/mm/plugin/appbrand/p/c/b;)V
    //   705: goto -409 -> 296
    //   708: aload_0
    //   709: getfield 101	com/tencent/mm/plugin/appbrand/p/c:iHt	Lcom/tencent/mm/plugin/appbrand/p/b/a;
    //   712: ifnonnull +14 -> 726
    //   715: aload_0
    //   716: sipush 1002
    //   719: ldc_w 363
    //   722: iconst_0
    //   723: invokevirtual 171	com/tencent/mm/plugin/appbrand/p/c:c	(ILjava/lang/String;Z)V
    //   726: ldc2_w 223
    //   729: ldc -31
    //   731: invokestatic 84	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   734: iconst_0
    //   735: ireturn
    //   736: aload_0
    //   737: getfield 101	com/tencent/mm/plugin/appbrand/p/c:iHt	Lcom/tencent/mm/plugin/appbrand/p/b/a;
    //   740: aload 5
    //   742: invokevirtual 326	com/tencent/mm/plugin/appbrand/p/b/a:j	(Ljava/nio/ByteBuffer;)Lcom/tencent/mm/plugin/appbrand/p/e/f;
    //   745: astore 4
    //   747: aload 4
    //   749: instanceof 328
    //   752: ifne +24 -> 776
    //   755: aload_0
    //   756: sipush 1002
    //   759: ldc_w 330
    //   762: iconst_0
    //   763: invokespecial 332	com/tencent/mm/plugin/appbrand/p/c:e	(ILjava/lang/String;Z)V
    //   766: ldc2_w 223
    //   769: ldc -31
    //   771: invokestatic 84	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   774: iconst_0
    //   775: ireturn
    //   776: aload 4
    //   778: checkcast 328	com/tencent/mm/plugin/appbrand/p/e/a
    //   781: astore 4
    //   783: aload_0
    //   784: getfield 101	com/tencent/mm/plugin/appbrand/p/c:iHt	Lcom/tencent/mm/plugin/appbrand/p/b/a;
    //   787: aload 4
    //   789: invokevirtual 335	com/tencent/mm/plugin/appbrand/p/b/a:a	(Lcom/tencent/mm/plugin/appbrand/p/e/a;)Lcom/tencent/mm/plugin/appbrand/p/b/a$b;
    //   792: getstatic 249	com/tencent/mm/plugin/appbrand/p/b/a$b:iHX	Lcom/tencent/mm/plugin/appbrand/p/b/a$b;
    //   795: if_acmpne +19 -> 814
    //   798: aload_0
    //   799: aload 4
    //   801: invokespecial 355	com/tencent/mm/plugin/appbrand/p/c:a	(Lcom/tencent/mm/plugin/appbrand/p/e/f;)V
    //   804: ldc2_w 223
    //   807: ldc -31
    //   809: invokestatic 84	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   812: iconst_1
    //   813: ireturn
    //   814: aload_0
    //   815: sipush 1002
    //   818: ldc_w 365
    //   821: iconst_0
    //   822: invokevirtual 171	com/tencent/mm/plugin/appbrand/p/c:c	(ILjava/lang/String;Z)V
    //   825: ldc2_w 223
    //   828: ldc -31
    //   830: invokestatic 84	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   833: iconst_0
    //   834: ireturn
    //   835: aload_0
    //   836: getfield 123	com/tencent/mm/plugin/appbrand/p/c:iHu	I
    //   839: getstatic 147	com/tencent/mm/plugin/appbrand/p/a$b:iHg	I
    //   842: if_icmpne -546 -> 296
    //   845: aload_0
    //   846: getfield 101	com/tencent/mm/plugin/appbrand/p/c:iHt	Lcom/tencent/mm/plugin/appbrand/p/b/a;
    //   849: aload_0
    //   850: getfield 123	com/tencent/mm/plugin/appbrand/p/c:iHu	I
    //   853: invokevirtual 322	com/tencent/mm/plugin/appbrand/p/b/a:jP	(I)V
    //   856: aload_0
    //   857: getfield 101	com/tencent/mm/plugin/appbrand/p/c:iHt	Lcom/tencent/mm/plugin/appbrand/p/b/a;
    //   860: aload 5
    //   862: invokevirtual 326	com/tencent/mm/plugin/appbrand/p/b/a:j	(Ljava/nio/ByteBuffer;)Lcom/tencent/mm/plugin/appbrand/p/e/f;
    //   865: astore 4
    //   867: aload 4
    //   869: instanceof 367
    //   872: ifne +24 -> 896
    //   875: aload_0
    //   876: sipush 1002
    //   879: ldc_w 330
    //   882: iconst_0
    //   883: invokespecial 332	com/tencent/mm/plugin/appbrand/p/c:e	(ILjava/lang/String;Z)V
    //   886: ldc2_w 223
    //   889: ldc -31
    //   891: invokestatic 84	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   894: iconst_0
    //   895: ireturn
    //   896: aload 4
    //   898: checkcast 367	com/tencent/mm/plugin/appbrand/p/e/h
    //   901: astore 4
    //   903: aload_0
    //   904: getfield 101	com/tencent/mm/plugin/appbrand/p/c:iHt	Lcom/tencent/mm/plugin/appbrand/p/b/a;
    //   907: aload_0
    //   908: getfield 113	com/tencent/mm/plugin/appbrand/p/c:iHx	Lcom/tencent/mm/plugin/appbrand/p/e/a;
    //   911: aload 4
    //   913: invokevirtual 370	com/tencent/mm/plugin/appbrand/p/b/a:a	(Lcom/tencent/mm/plugin/appbrand/p/e/a;Lcom/tencent/mm/plugin/appbrand/p/e/h;)Lcom/tencent/mm/plugin/appbrand/p/b/a$b;
    //   916: getstatic 249	com/tencent/mm/plugin/appbrand/p/b/a$b:iHX	Lcom/tencent/mm/plugin/appbrand/p/b/a$b;
    //   919: if_acmpne +19 -> 938
    //   922: aload_0
    //   923: aload 4
    //   925: invokespecial 355	com/tencent/mm/plugin/appbrand/p/c:a	(Lcom/tencent/mm/plugin/appbrand/p/e/f;)V
    //   928: ldc2_w 223
    //   931: ldc -31
    //   933: invokestatic 84	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   936: iconst_1
    //   937: ireturn
    //   938: aload_0
    //   939: sipush 1002
    //   942: new 181	java/lang/StringBuilder
    //   945: dup
    //   946: ldc_w 372
    //   949: invokespecial 184	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   952: aload 4
    //   954: invokeinterface 375 1 0
    //   959: invokevirtual 197	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   962: invokevirtual 200	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   965: iconst_0
    //   966: invokevirtual 171	com/tencent/mm/plugin/appbrand/p/c:c	(ILjava/lang/String;Z)V
    //   969: goto -673 -> 296
    //   972: aload_0
    //   973: getfield 111	com/tencent/mm/plugin/appbrand/p/c:iHw	Ljava/nio/ByteBuffer;
    //   976: aload_0
    //   977: getfield 111	com/tencent/mm/plugin/appbrand/p/c:iHw	Ljava/nio/ByteBuffer;
    //   980: invokevirtual 236	java/nio/ByteBuffer:limit	()I
    //   983: invokevirtual 379	java/nio/ByteBuffer:position	(I)Ljava/nio/Buffer;
    //   986: pop
    //   987: aload_0
    //   988: getfield 111	com/tencent/mm/plugin/appbrand/p/c:iHw	Ljava/nio/ByteBuffer;
    //   991: aload_0
    //   992: getfield 111	com/tencent/mm/plugin/appbrand/p/c:iHw	Ljava/nio/ByteBuffer;
    //   995: invokevirtual 229	java/nio/ByteBuffer:capacity	()I
    //   998: invokevirtual 381	java/nio/ByteBuffer:limit	(I)Ljava/nio/Buffer;
    //   1001: pop
    //   1002: goto -706 -> 296
    //   1005: iload_2
    //   1006: iconst_1
    //   1007: iadd
    //   1008: istore_2
    //   1009: goto -701 -> 308
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1012	0	this	c
    //   0	1012	1	paramByteBuffer	ByteBuffer
    //   265	744	2	i	int
    //   263	4	3	j	int
    //   55	105	4	localObject1	Object
    //   214	45	4	locala	com.tencent.mm.plugin.appbrand.p.c.a
    //   338	9	4	localb	com.tencent.mm.plugin.appbrand.p.b.a.b
    //   351	15	4	localb1	com.tencent.mm.plugin.appbrand.p.c.b
    //   419	13	4	localIterator	Iterator
    //   671	30	4	locald1	com.tencent.mm.plugin.appbrand.p.c.d
    //   745	208	4	localObject2	Object
    //   19	842	5	localByteBuffer	ByteBuffer
    //   60	499	6	localObject3	Object
    //   579	9	6	localb2	com.tencent.mm.plugin.appbrand.p.c.b
    //   606	16	6	localRuntimeException	RuntimeException
    //   640	15	6	locald2	com.tencent.mm.plugin.appbrand.p.c.d
    //   468	97	7	localObject4	Object
    //   539	8	8	locali	com.tencent.mm.plugin.appbrand.p.e.i
    // Exception table:
    //   from	to	target	type
    //   27	57	214	com/tencent/mm/plugin/appbrand/p/c/a
    //   57	62	214	com/tencent/mm/plugin/appbrand/p/c/a
    //   69	99	214	com/tencent/mm/plugin/appbrand/p/c/a
    //   190	214	214	com/tencent/mm/plugin/appbrand/p/c/a
    //   308	340	214	com/tencent/mm/plugin/appbrand/p/c/a
    //   343	348	214	com/tencent/mm/plugin/appbrand/p/c/a
    //   353	390	214	com/tencent/mm/plugin/appbrand/p/c/a
    //   393	421	214	com/tencent/mm/plugin/appbrand/p/c/a
    //   421	446	214	com/tencent/mm/plugin/appbrand/p/c/a
    //   446	489	214	com/tencent/mm/plugin/appbrand/p/c/a
    //   499	530	214	com/tencent/mm/plugin/appbrand/p/c/a
    //   530	541	214	com/tencent/mm/plugin/appbrand/p/c/a
    //   541	569	214	com/tencent/mm/plugin/appbrand/p/c/a
    //   581	596	214	com/tencent/mm/plugin/appbrand/p/c/a
    //   608	630	214	com/tencent/mm/plugin/appbrand/p/c/a
    //   642	668	214	com/tencent/mm/plugin/appbrand/p/c/a
    //   673	705	214	com/tencent/mm/plugin/appbrand/p/c/a
    //   708	726	214	com/tencent/mm/plugin/appbrand/p/c/a
    //   736	766	214	com/tencent/mm/plugin/appbrand/p/c/a
    //   776	804	214	com/tencent/mm/plugin/appbrand/p/c/a
    //   814	825	214	com/tencent/mm/plugin/appbrand/p/c/a
    //   835	886	214	com/tencent/mm/plugin/appbrand/p/c/a
    //   896	928	214	com/tencent/mm/plugin/appbrand/p/c/a
    //   938	969	214	com/tencent/mm/plugin/appbrand/p/c/a
    //   69	99	351	com/tencent/mm/plugin/appbrand/p/c/b
    //   530	541	579	com/tencent/mm/plugin/appbrand/p/c/b
    //   530	541	606	java/lang/RuntimeException
    //   446	489	640	com/tencent/mm/plugin/appbrand/p/c/d
    //   499	530	640	com/tencent/mm/plugin/appbrand/p/c/d
    //   530	541	640	com/tencent/mm/plugin/appbrand/p/c/d
    //   541	569	640	com/tencent/mm/plugin/appbrand/p/c/d
    //   581	596	640	com/tencent/mm/plugin/appbrand/p/c/d
    //   608	630	640	com/tencent/mm/plugin/appbrand/p/c/d
    //   393	421	671	com/tencent/mm/plugin/appbrand/p/c/d
    //   421	446	671	com/tencent/mm/plugin/appbrand/p/c/d
    //   642	668	671	com/tencent/mm/plugin/appbrand/p/c/d
    //   708	726	671	com/tencent/mm/plugin/appbrand/p/c/d
    //   736	766	671	com/tencent/mm/plugin/appbrand/p/c/d
    //   776	804	671	com/tencent/mm/plugin/appbrand/p/c/d
    //   814	825	671	com/tencent/mm/plugin/appbrand/p/c/d
    //   835	886	671	com/tencent/mm/plugin/appbrand/p/c/d
    //   896	928	671	com/tencent/mm/plugin/appbrand/p/c/d
    //   938	969	671	com/tencent/mm/plugin/appbrand/p/c/d
  }
  
  /* Error */
  private void e(int paramInt, String paramString, boolean paramBoolean)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc2_w 382
    //   5: ldc_w 384
    //   8: invokestatic 53	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   11: aload_0
    //   12: getfield 92	com/tencent/mm/plugin/appbrand/p/c:iHp	Z
    //   15: ifeq +15 -> 30
    //   18: ldc2_w 382
    //   21: ldc_w 384
    //   24: invokestatic 84	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   27: aload_0
    //   28: monitorexit
    //   29: return
    //   30: aload_0
    //   31: iload_1
    //   32: invokestatic 390	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   35: putfield 117	com/tencent/mm/plugin/appbrand/p/c:iHz	Ljava/lang/Integer;
    //   38: aload_0
    //   39: aload_2
    //   40: putfield 115	com/tencent/mm/plugin/appbrand/p/c:iHy	Ljava/lang/String;
    //   43: aload_0
    //   44: iload_3
    //   45: invokestatic 395	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   48: putfield 119	com/tencent/mm/plugin/appbrand/p/c:iHA	Ljava/lang/Boolean;
    //   51: aload_0
    //   52: iconst_1
    //   53: putfield 92	com/tencent/mm/plugin/appbrand/p/c:iHp	Z
    //   56: aload_0
    //   57: getfield 101	com/tencent/mm/plugin/appbrand/p/c:iHt	Lcom/tencent/mm/plugin/appbrand/p/b/a;
    //   60: ifnull +10 -> 70
    //   63: aload_0
    //   64: getfield 101	com/tencent/mm/plugin/appbrand/p/c:iHt	Lcom/tencent/mm/plugin/appbrand/p/b/a;
    //   67: invokevirtual 397	com/tencent/mm/plugin/appbrand/p/b/a:reset	()V
    //   70: aload_0
    //   71: aconst_null
    //   72: putfield 113	com/tencent/mm/plugin/appbrand/p/c:iHx	Lcom/tencent/mm/plugin/appbrand/p/e/a;
    //   75: ldc2_w 382
    //   78: ldc_w 384
    //   81: invokestatic 84	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   84: goto -57 -> 27
    //   87: astore_2
    //   88: aload_0
    //   89: monitorexit
    //   90: aload_2
    //   91: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	92	0	this	c
    //   0	92	1	paramInt	int
    //   0	92	2	paramString	String
    //   0	92	3	paramBoolean	boolean
    // Exception table:
    //   from	to	target	type
    //   2	27	87	finally
    //   30	70	87	finally
    //   70	84	87	finally
  }
  
  private void e(ByteBuffer paramByteBuffer)
  {
    GMTrace.i(10184709636096L, 75882);
    for (;;)
    {
      d.a locala1;
      boolean bool;
      int i;
      try
      {
        Iterator localIterator = this.iHt.i(paramByteBuffer).iterator();
        if (!localIterator.hasNext()) {
          break label495;
        }
        paramByteBuffer = (com.tencent.mm.plugin.appbrand.p.d.d)localIterator.next();
        if (DEBUG) {
          w.i("MicroMsg.AppBrandNetWork.WebSocketImpl", "matched frame: " + paramByteBuffer);
        }
        locala1 = paramByteBuffer.abR();
        bool = paramByteBuffer.abP();
        if (locala1 != d.a.iIo) {
          break label226;
        }
        if (!(paramByteBuffer instanceof com.tencent.mm.plugin.appbrand.p.d.a)) {
          break label505;
        }
        paramByteBuffer = (com.tencent.mm.plugin.appbrand.p.d.a)paramByteBuffer;
        i = paramByteBuffer.abN();
        paramByteBuffer = paramByteBuffer.getMessage();
        if (this.iHq == a.a.iHd)
        {
          d(i, paramByteBuffer, true);
          continue;
        }
        if (this.iHt.abL() != com.tencent.mm.plugin.appbrand.p.b.a.a.iHV) {
          break label216;
        }
      }
      catch (com.tencent.mm.plugin.appbrand.p.c.b paramByteBuffer)
      {
        w.e("MicroMsg.AppBrandNetWork.WebSocketImpl", "decodeFrames: " + paramByteBuffer.toString());
        this.iHr.c(paramByteBuffer);
        a(paramByteBuffer);
        GMTrace.o(10184709636096L, 75882);
        return;
      }
      c(i, paramByteBuffer, true);
      continue;
      label216:
      e(i, paramByteBuffer, false);
      continue;
      label226:
      if (locala1 == d.a.iIm)
      {
        this.iHr.a(this, paramByteBuffer);
      }
      else if (locala1 != d.a.iIn)
      {
        if ((!bool) || (locala1 == d.a.iIj))
        {
          if (locala1 != d.a.iIj)
          {
            if (this.iHv != null) {
              throw new com.tencent.mm.plugin.appbrand.p.c.b("Previous continuous frame sequence not completed.");
            }
            this.iHv = locala1;
          }
          label357:
          do
          {
            for (;;)
            {
              try
              {
                this.iHr.c(paramByteBuffer);
              }
              catch (RuntimeException paramByteBuffer)
              {
                this.iHr.c(paramByteBuffer);
              }
              break;
              if (!bool) {
                break label357;
              }
              if (this.iHv == null) {
                throw new com.tencent.mm.plugin.appbrand.p.c.b("Continuous frame sequence was not started.");
              }
              this.iHv = null;
            }
          } while (this.iHv != null);
          throw new com.tencent.mm.plugin.appbrand.p.c.b("Continuous frame sequence was not started.");
        }
        if (this.iHv != null) {
          throw new com.tencent.mm.plugin.appbrand.p.c.b("Continuous frame sequence not completed.");
        }
        d.a locala2 = d.a.iIk;
        if (locala1 == locala2)
        {
          try
          {
            this.iHr.sB(com.tencent.mm.plugin.appbrand.p.f.b.m(paramByteBuffer.abO()));
          }
          catch (RuntimeException paramByteBuffer)
          {
            this.iHr.c(paramByteBuffer);
          }
        }
        else
        {
          locala2 = d.a.iIl;
          if (locala1 == locala2)
          {
            try
            {
              this.iHr.g(paramByteBuffer.abO());
            }
            catch (RuntimeException paramByteBuffer)
            {
              this.iHr.c(paramByteBuffer);
            }
          }
          else
          {
            throw new com.tencent.mm.plugin.appbrand.p.c.b("non control or continious frame expected");
            label495:
            GMTrace.o(10184709636096L, 75882);
            return;
            label505:
            paramByteBuffer = "";
            i = 1005;
          }
        }
      }
    }
  }
  
  private void f(ByteBuffer paramByteBuffer)
  {
    GMTrace.i(10185917595648L, 75891);
    if (DEBUG) {
      w.i("MicroMsg.AppBrandNetWork.WebSocketImpl", "write(\" + buf.remaining() + \"): {\" + ( buf.remaining() > 1000 ? \"too big to display\" : new String( buf.array() ) ) + \"}");
    }
    this.iHn.add(paramByteBuffer);
    GMTrace.o(10185917595648L, 75891);
  }
  
  private void jN(int paramInt)
  {
    GMTrace.i(10185112289280L, 75885);
    d(paramInt, "", true);
    GMTrace.o(10185112289280L, 75885);
  }
  
  public final void W(List<ByteBuffer> paramList)
  {
    GMTrace.i(10186051813376L, 75892);
    paramList = paramList.iterator();
    while (paramList.hasNext()) {
      f((ByteBuffer)paramList.next());
    }
    GMTrace.o(10186051813376L, 75892);
  }
  
  public final InetSocketAddress abF()
  {
    GMTrace.i(10186722902016L, 75897);
    InetSocketAddress localInetSocketAddress = this.iHr.abJ();
    GMTrace.o(10186722902016L, 75897);
    return localInetSocketAddress;
  }
  
  public final void abH()
  {
    GMTrace.i(10185380724736L, 75887);
    if (this.iHq == a.a.iHa)
    {
      jN(-1);
      GMTrace.o(10185380724736L, 75887);
      return;
    }
    if (this.iHp)
    {
      d(this.iHz.intValue(), this.iHy, this.iHA.booleanValue());
      GMTrace.o(10185380724736L, 75887);
      return;
    }
    if (this.iHt.abL() == com.tencent.mm.plugin.appbrand.p.b.a.a.iHT)
    {
      jN(1000);
      GMTrace.o(10185380724736L, 75887);
      return;
    }
    if ((this.iHt.abL() == com.tencent.mm.plugin.appbrand.p.b.a.a.iHU) && (this.iHu != a.b.iHh))
    {
      jN(1000);
      GMTrace.o(10185380724736L, 75887);
      return;
    }
    jN(1006);
    GMTrace.o(10185380724736L, 75887);
  }
  
  public final void b(com.tencent.mm.plugin.appbrand.p.d.d paramd)
  {
    GMTrace.i(10185783377920L, 75890);
    if (DEBUG) {
      w.i("MicroMsg.AppBrandNetWork.WebSocketImpl", "\"send frame: \" + framedata ");
    }
    f(this.iHt.d(paramd));
    GMTrace.o(10185783377920L, 75890);
  }
  
  public void c(int paramInt, String paramString, boolean paramBoolean)
  {
    GMTrace.i(10184843853824L, 75883);
    if ((this.iHq != a.a.iHd) && (this.iHq != a.a.iHe))
    {
      if (this.iHq == a.a.iHc)
      {
        if (paramInt == 1006)
        {
          this.iHq = a.a.iHd;
          e(paramInt, paramString, false);
          GMTrace.o(10184843853824L, 75883);
          return;
        }
        if (this.iHt.abL() == com.tencent.mm.plugin.appbrand.p.b.a.a.iHT) {}
      }
      for (;;)
      {
        try
        {
          b(new com.tencent.mm.plugin.appbrand.p.d.b(paramInt, paramString));
          e(paramInt, paramString, paramBoolean);
          if (paramInt == 1002) {
            e(paramInt, paramString, paramBoolean);
          }
          this.iHq = a.a.iHd;
          this.iHw = null;
          GMTrace.o(10184843853824L, 75883);
          return;
        }
        catch (com.tencent.mm.plugin.appbrand.p.c.b localb)
        {
          w.e("MicroMsg.AppBrandNetWork.WebSocketImpl", "close: " + localb.toString());
          this.iHr.c(localb);
          e(1006, "generated frame is invalid", false);
          continue;
        }
        if (paramInt == -3) {
          e(-3, paramString, true);
        } else {
          e(-1, paramString, false);
        }
      }
    }
    GMTrace.o(10184843853824L, 75883);
  }
  
  public final void c(ByteBuffer paramByteBuffer)
  {
    GMTrace.i(10184441200640L, 75880);
    if (DEBUG) {
      w.i("MicroMsg.AppBrandNetWork.WebSocketImpl", "\"process(\" + socketBuffer.remaining() + \"): {\" + ( socketBuffer.remaining() > 1000 ? \"too big to display\" : new String( socketBuffer.array(), socketBuffer.position(), socketBuffer.remaining() ) ) + \"}\"");
    }
    if (this.iHq != a.a.iHa)
    {
      e(paramByteBuffer);
      GMTrace.o(10184441200640L, 75880);
      return;
    }
    if (d(paramByteBuffer))
    {
      if (paramByteBuffer.hasRemaining())
      {
        e(paramByteBuffer);
        GMTrace.o(10184441200640L, 75880);
        return;
      }
      if (this.iHw.hasRemaining()) {
        e(this.iHw);
      }
    }
    GMTrace.o(10184441200640L, 75880);
  }
  
  /* Error */
  public void d(int paramInt, String paramString, boolean paramBoolean)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc2_w 567
    //   5: ldc_w 569
    //   8: invokestatic 53	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   11: aload_0
    //   12: getfield 99	com/tencent/mm/plugin/appbrand/p/c:iHq	I
    //   15: getstatic 544	com/tencent/mm/plugin/appbrand/p/a$a:iHe	I
    //   18: if_icmpne +15 -> 33
    //   21: ldc2_w 567
    //   24: ldc_w 569
    //   27: invokestatic 84	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   30: aload_0
    //   31: monitorexit
    //   32: return
    //   33: aload_0
    //   34: getfield 571	com/tencent/mm/plugin/appbrand/p/c:iHl	Ljava/nio/channels/SelectionKey;
    //   37: ifnull +10 -> 47
    //   40: aload_0
    //   41: getfield 571	com/tencent/mm/plugin/appbrand/p/c:iHl	Ljava/nio/channels/SelectionKey;
    //   44: invokevirtual 576	java/nio/channels/SelectionKey:cancel	()V
    //   47: aload_0
    //   48: getfield 578	com/tencent/mm/plugin/appbrand/p/c:iHm	Ljava/nio/channels/ByteChannel;
    //   51: astore 4
    //   53: aload 4
    //   55: ifnull +12 -> 67
    //   58: aload_0
    //   59: getfield 578	com/tencent/mm/plugin/appbrand/p/c:iHm	Ljava/nio/channels/ByteChannel;
    //   62: invokeinterface 583 1 0
    //   67: aload_0
    //   68: getfield 144	com/tencent/mm/plugin/appbrand/p/c:iHr	Lcom/tencent/mm/plugin/appbrand/p/d;
    //   71: iload_1
    //   72: aload_2
    //   73: invokeinterface 586 3 0
    //   78: aload_0
    //   79: getfield 101	com/tencent/mm/plugin/appbrand/p/c:iHt	Lcom/tencent/mm/plugin/appbrand/p/b/a;
    //   82: ifnull +10 -> 92
    //   85: aload_0
    //   86: getfield 101	com/tencent/mm/plugin/appbrand/p/c:iHt	Lcom/tencent/mm/plugin/appbrand/p/b/a;
    //   89: invokevirtual 397	com/tencent/mm/plugin/appbrand/p/b/a:reset	()V
    //   92: aload_0
    //   93: aconst_null
    //   94: putfield 113	com/tencent/mm/plugin/appbrand/p/c:iHx	Lcom/tencent/mm/plugin/appbrand/p/e/a;
    //   97: aload_0
    //   98: getstatic 544	com/tencent/mm/plugin/appbrand/p/a$a:iHe	I
    //   101: putfield 99	com/tencent/mm/plugin/appbrand/p/c:iHq	I
    //   104: aload_0
    //   105: getfield 140	com/tencent/mm/plugin/appbrand/p/c:iHn	Ljava/util/concurrent/BlockingQueue;
    //   108: invokeinterface 589 1 0
    //   113: ldc2_w 567
    //   116: ldc_w 569
    //   119: invokestatic 84	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   122: goto -92 -> 30
    //   125: astore_2
    //   126: aload_0
    //   127: monitorexit
    //   128: aload_2
    //   129: athrow
    //   130: astore 4
    //   132: aload_0
    //   133: getfield 144	com/tencent/mm/plugin/appbrand/p/c:iHr	Lcom/tencent/mm/plugin/appbrand/p/d;
    //   136: aload 4
    //   138: invokeinterface 216 2 0
    //   143: goto -76 -> 67
    //   146: astore_2
    //   147: aload_0
    //   148: getfield 144	com/tencent/mm/plugin/appbrand/p/c:iHr	Lcom/tencent/mm/plugin/appbrand/p/d;
    //   151: aload_2
    //   152: invokeinterface 216 2 0
    //   157: goto -79 -> 78
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	160	0	this	c
    //   0	160	1	paramInt	int
    //   0	160	2	paramString	String
    //   0	160	3	paramBoolean	boolean
    //   51	3	4	localByteChannel	ByteChannel
    //   130	7	4	localIOException	java.io.IOException
    // Exception table:
    //   from	to	target	type
    //   2	30	125	finally
    //   33	47	125	finally
    //   47	53	125	finally
    //   58	67	125	finally
    //   67	78	125	finally
    //   78	92	125	finally
    //   92	122	125	finally
    //   132	143	125	finally
    //   147	157	125	finally
    //   58	67	130	java/io/IOException
    //   67	78	146	java/lang/RuntimeException
  }
  
  public final void d(Collection<com.tencent.mm.plugin.appbrand.p.d.d> paramCollection)
  {
    GMTrace.i(10185649160192L, 75889);
    if (!isOpen()) {
      throw new com.tencent.mm.plugin.appbrand.p.c.f();
    }
    paramCollection = paramCollection.iterator();
    while (paramCollection.hasNext()) {
      b((com.tencent.mm.plugin.appbrand.p.d.d)paramCollection.next());
    }
    GMTrace.o(10185649160192L, 75889);
  }
  
  public final int hashCode()
  {
    GMTrace.i(10186454466560L, 75895);
    int i = super.hashCode();
    GMTrace.o(10186454466560L, 75895);
    return i;
  }
  
  public final boolean isOpen()
  {
    GMTrace.i(10186320248832L, 75894);
    if (this.iHq == a.a.iHc)
    {
      GMTrace.o(10186320248832L, 75894);
      return true;
    }
    GMTrace.o(10186320248832L, 75894);
    return false;
  }
  
  public final String toString()
  {
    GMTrace.i(10186588684288L, 75896);
    String str = super.toString();
    GMTrace.o(10186588684288L, 75896);
    return str;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\p\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */