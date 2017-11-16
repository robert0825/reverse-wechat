package com.tencent.mm.plugin.sns.model;

import android.graphics.BitmapFactory.Options;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.ad.k.b;
import com.tencent.mm.modelcdntran.a;
import com.tencent.mm.modelcdntran.d;
import com.tencent.mm.modelcdntran.i;
import com.tencent.mm.modelcdntran.i.a;
import com.tencent.mm.modelcdntran.keep_ProgressInfo;
import com.tencent.mm.modelcdntran.keep_SceneResult;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.plugin.sns.storage.r;
import com.tencent.mm.protocal.c.anr;
import com.tencent.mm.protocal.c.anx;
import com.tencent.mm.protocal.c.azp;
import com.tencent.mm.protocal.c.bet;
import com.tencent.mm.protocal.c.bgk;
import com.tencent.mm.protocal.c.bgl;
import com.tencent.mm.sdk.platformtools.MMBitmapFactory;
import com.tencent.mm.sdk.platformtools.MMNativeJpeg;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.io.ByteArrayOutputStream;
import java.util.LinkedList;

public final class y
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private com.tencent.mm.ad.b fUa;
  public com.tencent.mm.ad.e fUd;
  private int gIJ;
  public String gIp;
  public int gIq;
  private i.a gIz;
  private int gsL;
  private int offset;
  private String path;
  private int ppo;
  private String psX;
  private bgk psY;
  private String psZ;
  private boolean pta;
  private boolean ptb;
  private boolean ptc;
  public long ptd;
  public int pte;
  public long startTime;
  
  /* Error */
  public y(int paramInt1, String paramString, boolean paramBoolean, int paramInt2)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 42	com/tencent/mm/ad/k:<init>	()V
    //   4: ldc2_w 43
    //   7: ldc 45
    //   9: invokestatic 51	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   12: aload_0
    //   13: sipush 8192
    //   16: putfield 53	com/tencent/mm/plugin/sns/model/y:gIJ	I
    //   19: aload_0
    //   20: iconst_0
    //   21: putfield 55	com/tencent/mm/plugin/sns/model/y:offset	I
    //   24: aload_0
    //   25: ldc 57
    //   27: putfield 59	com/tencent/mm/plugin/sns/model/y:path	Ljava/lang/String;
    //   30: aload_0
    //   31: ldc 57
    //   33: putfield 61	com/tencent/mm/plugin/sns/model/y:psX	Ljava/lang/String;
    //   36: aload_0
    //   37: iconst_0
    //   38: putfield 63	com/tencent/mm/plugin/sns/model/y:ppo	I
    //   41: aload_0
    //   42: ldc 57
    //   44: putfield 65	com/tencent/mm/plugin/sns/model/y:psZ	Ljava/lang/String;
    //   47: aload_0
    //   48: ldc 57
    //   50: putfield 67	com/tencent/mm/plugin/sns/model/y:gIp	Ljava/lang/String;
    //   53: aload_0
    //   54: iconst_0
    //   55: putfield 69	com/tencent/mm/plugin/sns/model/y:pta	Z
    //   58: aload_0
    //   59: iconst_0
    //   60: putfield 71	com/tencent/mm/plugin/sns/model/y:ptb	Z
    //   63: aload_0
    //   64: iconst_0
    //   65: putfield 73	com/tencent/mm/plugin/sns/model/y:ptc	Z
    //   68: aload_0
    //   69: lconst_0
    //   70: putfield 75	com/tencent/mm/plugin/sns/model/y:ptd	J
    //   73: aload_0
    //   74: lconst_0
    //   75: putfield 77	com/tencent/mm/plugin/sns/model/y:startTime	J
    //   78: aload_0
    //   79: iconst_0
    //   80: putfield 79	com/tencent/mm/plugin/sns/model/y:gIq	I
    //   83: aload_0
    //   84: iconst_0
    //   85: putfield 81	com/tencent/mm/plugin/sns/model/y:pte	I
    //   88: aload_0
    //   89: new 8	com/tencent/mm/plugin/sns/model/y$1
    //   92: dup
    //   93: aload_0
    //   94: invokespecial 84	com/tencent/mm/plugin/sns/model/y$1:<init>	(Lcom/tencent/mm/plugin/sns/model/y;)V
    //   97: putfield 86	com/tencent/mm/plugin/sns/model/y:gIz	Lcom/tencent/mm/modelcdntran/i$a;
    //   100: aload_0
    //   101: invokestatic 92	java/lang/System:currentTimeMillis	()J
    //   104: putfield 75	com/tencent/mm/plugin/sns/model/y:ptd	J
    //   107: aload_0
    //   108: iload_1
    //   109: putfield 63	com/tencent/mm/plugin/sns/model/y:ppo	I
    //   112: aload_0
    //   113: aload_2
    //   114: putfield 65	com/tencent/mm/plugin/sns/model/y:psZ	Ljava/lang/String;
    //   117: aload_0
    //   118: iload 4
    //   120: putfield 81	com/tencent/mm/plugin/sns/model/y:pte	I
    //   123: new 94	com/tencent/mm/ad/b$a
    //   126: dup
    //   127: invokespecial 95	com/tencent/mm/ad/b$a:<init>	()V
    //   130: astore_2
    //   131: aload_2
    //   132: new 97	com/tencent/mm/protocal/c/bgk
    //   135: dup
    //   136: invokespecial 98	com/tencent/mm/protocal/c/bgk:<init>	()V
    //   139: putfield 102	com/tencent/mm/ad/b$a:gtF	Lcom/tencent/mm/bm/a;
    //   142: aload_2
    //   143: new 104	com/tencent/mm/protocal/c/bgl
    //   146: dup
    //   147: invokespecial 105	com/tencent/mm/protocal/c/bgl:<init>	()V
    //   150: putfield 108	com/tencent/mm/ad/b$a:gtG	Lcom/tencent/mm/bm/a;
    //   153: aload_2
    //   154: ldc 110
    //   156: putfield 113	com/tencent/mm/ad/b$a:uri	Ljava/lang/String;
    //   159: aload_2
    //   160: sipush 207
    //   163: putfield 116	com/tencent/mm/ad/b$a:gtE	I
    //   166: aload_2
    //   167: bipush 95
    //   169: putfield 119	com/tencent/mm/ad/b$a:gtH	I
    //   172: aload_2
    //   173: ldc 120
    //   175: putfield 123	com/tencent/mm/ad/b$a:gtI	I
    //   178: aload_0
    //   179: aload_2
    //   180: invokevirtual 127	com/tencent/mm/ad/b$a:DA	()Lcom/tencent/mm/ad/b;
    //   183: putfield 129	com/tencent/mm/plugin/sns/model/y:fUa	Lcom/tencent/mm/ad/b;
    //   186: aload_0
    //   187: aload_0
    //   188: getfield 129	com/tencent/mm/plugin/sns/model/y:fUa	Lcom/tencent/mm/ad/b;
    //   191: getfield 135	com/tencent/mm/ad/b:gtC	Lcom/tencent/mm/ad/b$b;
    //   194: getfield 140	com/tencent/mm/ad/b$b:gtK	Lcom/tencent/mm/bm/a;
    //   197: checkcast 97	com/tencent/mm/protocal/c/bgk
    //   200: putfield 142	com/tencent/mm/plugin/sns/model/y:psY	Lcom/tencent/mm/protocal/c/bgk;
    //   203: invokestatic 148	com/tencent/mm/plugin/sns/model/ae:biS	()Lcom/tencent/mm/plugin/sns/storage/r;
    //   206: iload_1
    //   207: i2l
    //   208: invokevirtual 154	com/tencent/mm/plugin/sns/storage/r:dV	(J)Lcom/tencent/mm/plugin/sns/storage/q;
    //   211: astore 7
    //   213: aload_0
    //   214: iload_3
    //   215: putfield 73	com/tencent/mm/plugin/sns/model/y:ptc	Z
    //   218: ldc -100
    //   220: new 158	java/lang/StringBuilder
    //   223: dup
    //   224: ldc -96
    //   226: invokespecial 163	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   229: iload_1
    //   230: invokevirtual 167	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   233: ldc -87
    //   235: invokevirtual 172	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   238: aload 7
    //   240: getfield 175	com/tencent/mm/plugin/sns/storage/q:offset	I
    //   243: invokevirtual 167	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   246: ldc -79
    //   248: invokevirtual 172	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   251: aload 7
    //   253: getfield 180	com/tencent/mm/plugin/sns/storage/q:pMK	Ljava/lang/String;
    //   256: invokevirtual 172	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   259: ldc -74
    //   261: invokevirtual 172	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   264: aload 7
    //   266: getfield 185	com/tencent/mm/plugin/sns/storage/q:pMJ	I
    //   269: invokevirtual 167	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   272: invokevirtual 189	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   275: invokestatic 194	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   278: iload_3
    //   279: ifne +18 -> 297
    //   282: aload_0
    //   283: getfield 142	com/tencent/mm/plugin/sns/model/y:psY	Lcom/tencent/mm/protocal/c/bgk;
    //   286: iconst_1
    //   287: putfield 197	com/tencent/mm/protocal/c/bgk:uEI	I
    //   290: ldc -100
    //   292: ldc -57
    //   294: invokestatic 194	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   297: new 201	com/tencent/mm/protocal/c/anx
    //   300: dup
    //   301: invokespecial 202	com/tencent/mm/protocal/c/anx:<init>	()V
    //   304: aload 7
    //   306: getfield 206	com/tencent/mm/plugin/sns/storage/q:pMO	[B
    //   309: invokevirtual 210	com/tencent/mm/protocal/c/anx:aD	([B)Lcom/tencent/mm/bm/a;
    //   312: checkcast 201	com/tencent/mm/protocal/c/anx
    //   315: astore 6
    //   317: aload_0
    //   318: aload 7
    //   320: getfield 180	com/tencent/mm/plugin/sns/storage/q:pMK	Ljava/lang/String;
    //   323: invokestatic 216	com/tencent/mm/plugin/sns/data/i:GQ	(Ljava/lang/String;)Ljava/lang/String;
    //   326: putfield 61	com/tencent/mm/plugin/sns/model/y:psX	Ljava/lang/String;
    //   329: aload_0
    //   330: new 158	java/lang/StringBuilder
    //   333: dup
    //   334: invokespecial 217	java/lang/StringBuilder:<init>	()V
    //   337: invokestatic 220	com/tencent/mm/plugin/sns/model/ae:getAccSnsPath	()Ljava/lang/String;
    //   340: aload 7
    //   342: getfield 180	com/tencent/mm/plugin/sns/storage/q:pMK	Ljava/lang/String;
    //   345: invokestatic 226	com/tencent/mm/plugin/sns/model/am:dE	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   348: invokevirtual 172	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   351: aload_0
    //   352: getfield 61	com/tencent/mm/plugin/sns/model/y:psX	Ljava/lang/String;
    //   355: invokevirtual 172	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   358: invokevirtual 189	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   361: putfield 59	com/tencent/mm/plugin/sns/model/y:path	Ljava/lang/String;
    //   364: aload_0
    //   365: aload_0
    //   366: getfield 59	com/tencent/mm/plugin/sns/model/y:path	Ljava/lang/String;
    //   369: invokestatic 232	com/tencent/mm/modelsfs/FileOp:kX	(Ljava/lang/String;)J
    //   372: l2i
    //   373: putfield 234	com/tencent/mm/plugin/sns/model/y:gsL	I
    //   376: aload_0
    //   377: aload_0
    //   378: getfield 59	com/tencent/mm/plugin/sns/model/y:path	Ljava/lang/String;
    //   381: invokestatic 238	com/tencent/mm/plugin/sns/data/i:GZ	(Ljava/lang/String;)Z
    //   384: putfield 69	com/tencent/mm/plugin/sns/model/y:pta	Z
    //   387: ldc -100
    //   389: new 158	java/lang/StringBuilder
    //   392: dup
    //   393: ldc -16
    //   395: invokespecial 163	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   398: aload_0
    //   399: getfield 234	com/tencent/mm/plugin/sns/model/y:gsL	I
    //   402: invokevirtual 167	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   405: ldc -14
    //   407: invokevirtual 172	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   410: aload_0
    //   411: getfield 69	com/tencent/mm/plugin/sns/model/y:pta	Z
    //   414: invokevirtual 245	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   417: invokevirtual 189	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   420: invokestatic 194	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   423: aload 6
    //   425: getfield 248	com/tencent/mm/protocal/c/anx:uDL	Ljava/lang/String;
    //   428: astore 5
    //   430: aload 5
    //   432: astore_2
    //   433: aload 5
    //   435: invokestatic 253	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
    //   438: ifeq +56 -> 494
    //   441: new 158	java/lang/StringBuilder
    //   444: dup
    //   445: invokespecial 217	java/lang/StringBuilder:<init>	()V
    //   448: invokestatic 256	com/tencent/mm/sdk/platformtools/bg:Pw	()J
    //   451: invokevirtual 259	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   454: invokevirtual 189	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   457: invokevirtual 265	java/lang/String:getBytes	()[B
    //   460: invokestatic 271	com/tencent/mm/a/g:n	([B)Ljava/lang/String;
    //   463: astore_2
    //   464: aload 6
    //   466: aload_2
    //   467: putfield 248	com/tencent/mm/protocal/c/anx:uDL	Ljava/lang/String;
    //   470: aload 7
    //   472: aload 6
    //   474: invokevirtual 274	com/tencent/mm/protocal/c/anx:toByteArray	()[B
    //   477: putfield 206	com/tencent/mm/plugin/sns/storage/q:pMO	[B
    //   480: invokestatic 148	com/tencent/mm/plugin/sns/model/ae:biS	()Lcom/tencent/mm/plugin/sns/storage/r;
    //   483: aload 7
    //   485: getfield 277	com/tencent/mm/plugin/sns/storage/q:pMe	I
    //   488: aload 7
    //   490: invokevirtual 281	com/tencent/mm/plugin/sns/storage/r:a	(ILcom/tencent/mm/plugin/sns/storage/q;)I
    //   493: pop
    //   494: aload_0
    //   495: getfield 142	com/tencent/mm/plugin/sns/model/y:psY	Lcom/tencent/mm/protocal/c/bgk;
    //   498: aload_0
    //   499: getfield 234	com/tencent/mm/plugin/sns/model/y:gsL	I
    //   502: putfield 284	com/tencent/mm/protocal/c/bgk:tRC	I
    //   505: aload_0
    //   506: getfield 142	com/tencent/mm/plugin/sns/model/y:psY	Lcom/tencent/mm/protocal/c/bgk;
    //   509: aload 7
    //   511: getfield 175	com/tencent/mm/plugin/sns/storage/q:offset	I
    //   514: putfield 287	com/tencent/mm/protocal/c/bgk:tRD	I
    //   517: aload_0
    //   518: getfield 142	com/tencent/mm/plugin/sns/model/y:psY	Lcom/tencent/mm/protocal/c/bgk;
    //   521: aload_2
    //   522: putfield 290	com/tencent/mm/protocal/c/bgk:tPP	Ljava/lang/String;
    //   525: aload_0
    //   526: aload_2
    //   527: putfield 67	com/tencent/mm/plugin/sns/model/y:gIp	Ljava/lang/String;
    //   530: ldc -100
    //   532: new 158	java/lang/StringBuilder
    //   535: dup
    //   536: ldc_w 292
    //   539: invokespecial 163	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   542: aload 6
    //   544: getfield 295	com/tencent/mm/protocal/c/anx:uDk	I
    //   547: invokevirtual 167	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   550: invokevirtual 189	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   553: invokestatic 298	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   556: aload_0
    //   557: getfield 142	com/tencent/mm/plugin/sns/model/y:psY	Lcom/tencent/mm/protocal/c/bgk;
    //   560: aload 6
    //   562: getfield 295	com/tencent/mm/protocal/c/anx:uDk	I
    //   565: putfield 299	com/tencent/mm/protocal/c/bgk:uDk	I
    //   568: ldc -100
    //   570: new 158	java/lang/StringBuilder
    //   573: dup
    //   574: ldc_w 301
    //   577: invokespecial 163	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   580: aload 6
    //   582: getfield 304	com/tencent/mm/protocal/c/anx:uDl	I
    //   585: invokevirtual 167	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   588: invokevirtual 189	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   591: invokestatic 298	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   594: aload_0
    //   595: getfield 142	com/tencent/mm/plugin/sns/model/y:psY	Lcom/tencent/mm/protocal/c/bgk;
    //   598: new 158	java/lang/StringBuilder
    //   601: dup
    //   602: invokespecial 217	java/lang/StringBuilder:<init>	()V
    //   605: aload 6
    //   607: getfield 307	com/tencent/mm/protocal/c/anx:lPj	Ljava/lang/String;
    //   610: invokevirtual 172	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   613: invokevirtual 189	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   616: putfield 310	com/tencent/mm/protocal/c/bgk:tRP	Ljava/lang/String;
    //   619: aload_0
    //   620: getfield 142	com/tencent/mm/plugin/sns/model/y:psY	Lcom/tencent/mm/protocal/c/bgk;
    //   623: aload 6
    //   625: getfield 304	com/tencent/mm/protocal/c/anx:uDl	I
    //   628: putfield 311	com/tencent/mm/protocal/c/bgk:uDl	I
    //   631: ldc -100
    //   633: new 158	java/lang/StringBuilder
    //   636: dup
    //   637: ldc_w 313
    //   640: invokespecial 163	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   643: aload 7
    //   645: getfield 316	com/tencent/mm/plugin/sns/storage/q:type	I
    //   648: invokevirtual 167	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   651: ldc_w 318
    //   654: invokevirtual 172	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   657: aload 6
    //   659: getfield 321	com/tencent/mm/protocal/c/anx:eDW	Ljava/lang/String;
    //   662: invokevirtual 172	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   665: ldc_w 323
    //   668: invokevirtual 172	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   671: aload 6
    //   673: getfield 326	com/tencent/mm/protocal/c/anx:eSd	Ljava/lang/String;
    //   676: invokevirtual 172	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   679: ldc_w 328
    //   682: invokevirtual 172	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   685: aload 6
    //   687: getfield 331	com/tencent/mm/protocal/c/anx:iZe	I
    //   690: invokevirtual 167	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   693: invokevirtual 189	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   696: invokestatic 298	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   699: aload_0
    //   700: getfield 142	com/tencent/mm/plugin/sns/model/y:psY	Lcom/tencent/mm/protocal/c/bgk;
    //   703: aload 7
    //   705: getfield 316	com/tencent/mm/plugin/sns/storage/q:type	I
    //   708: putfield 334	com/tencent/mm/protocal/c/bgk:jib	I
    //   711: new 336	com/tencent/mm/protocal/c/bjz
    //   714: dup
    //   715: invokespecial 337	com/tencent/mm/protocal/c/bjz:<init>	()V
    //   718: astore_2
    //   719: aload_2
    //   720: aload 6
    //   722: getfield 340	com/tencent/mm/protocal/c/anx:token	Ljava/lang/String;
    //   725: putfield 343	com/tencent/mm/protocal/c/bjz:uUQ	Ljava/lang/String;
    //   728: aload_2
    //   729: aload 6
    //   731: getfield 346	com/tencent/mm/protocal/c/anx:uDu	Ljava/lang/String;
    //   734: putfield 349	com/tencent/mm/protocal/c/bjz:uUR	Ljava/lang/String;
    //   737: aload_0
    //   738: getfield 142	com/tencent/mm/plugin/sns/model/y:psY	Lcom/tencent/mm/protocal/c/bgk;
    //   741: aload_2
    //   742: putfield 353	com/tencent/mm/protocal/c/bgk:uJw	Lcom/tencent/mm/protocal/c/bjz;
    //   745: aload 6
    //   747: getfield 321	com/tencent/mm/protocal/c/anx:eDW	Ljava/lang/String;
    //   750: invokestatic 253	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
    //   753: ifne +15 -> 768
    //   756: aload_0
    //   757: getfield 142	com/tencent/mm/plugin/sns/model/y:psY	Lcom/tencent/mm/protocal/c/bgk;
    //   760: aload 6
    //   762: getfield 321	com/tencent/mm/protocal/c/anx:eDW	Ljava/lang/String;
    //   765: putfield 356	com/tencent/mm/protocal/c/bgk:ugH	Ljava/lang/String;
    //   768: aload 6
    //   770: getfield 326	com/tencent/mm/protocal/c/anx:eSd	Ljava/lang/String;
    //   773: invokestatic 253	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
    //   776: ifne +15 -> 791
    //   779: aload_0
    //   780: getfield 142	com/tencent/mm/plugin/sns/model/y:psY	Lcom/tencent/mm/protocal/c/bgk;
    //   783: aload 6
    //   785: getfield 326	com/tencent/mm/protocal/c/anx:eSd	Ljava/lang/String;
    //   788: putfield 359	com/tencent/mm/protocal/c/bgk:lQa	Ljava/lang/String;
    //   791: aload_0
    //   792: getfield 142	com/tencent/mm/plugin/sns/model/y:psY	Lcom/tencent/mm/protocal/c/bgk;
    //   795: aload 6
    //   797: getfield 331	com/tencent/mm/protocal/c/anx:iZe	I
    //   800: putfield 362	com/tencent/mm/protocal/c/bgk:uSg	I
    //   803: getstatic 367	com/tencent/mm/platformtools/r:hjM	Z
    //   806: ifeq +11 -> 817
    //   809: aload_0
    //   810: getfield 142	com/tencent/mm/plugin/sns/model/y:psY	Lcom/tencent/mm/protocal/c/bgk;
    //   813: iconst_0
    //   814: putfield 334	com/tencent/mm/protocal/c/bgk:jib	I
    //   817: aload_0
    //   818: getfield 77	com/tencent/mm/plugin/sns/model/y:startTime	J
    //   821: lconst_0
    //   822: lcmp
    //   823: ifne +17 -> 840
    //   826: aload_0
    //   827: invokestatic 370	com/tencent/mm/sdk/platformtools/bg:Pv	()J
    //   830: putfield 77	com/tencent/mm/plugin/sns/model/y:startTime	J
    //   833: aload_0
    //   834: getstatic 375	com/tencent/mm/modelcdntran/b:MediaType_FRIENDS	I
    //   837: putfield 79	com/tencent/mm/plugin/sns/model/y:gIq	I
    //   840: aload_0
    //   841: getfield 142	com/tencent/mm/plugin/sns/model/y:psY	Lcom/tencent/mm/protocal/c/bgk;
    //   844: astore_2
    //   845: invokestatic 381	com/tencent/mm/modelcdntran/g:Gk	()Lcom/tencent/mm/modelcdntran/c;
    //   848: pop
    //   849: bipush 32
    //   851: invokestatic 387	com/tencent/mm/modelcdntran/c:fT	(I)Z
    //   854: ifne +86 -> 940
    //   857: invokestatic 381	com/tencent/mm/modelcdntran/g:Gk	()Lcom/tencent/mm/modelcdntran/c;
    //   860: pop
    //   861: ldc -100
    //   863: ldc_w 389
    //   866: iconst_1
    //   867: anewarray 391	java/lang/Object
    //   870: dup
    //   871: iconst_0
    //   872: bipush 32
    //   874: invokestatic 387	com/tencent/mm/modelcdntran/c:fT	(I)Z
    //   877: invokestatic 397	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   880: aastore
    //   881: invokestatic 401	com/tencent/mm/sdk/platformtools/w:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   884: iconst_0
    //   885: istore_1
    //   886: iload_1
    //   887: ifeq +101 -> 988
    //   890: aload_0
    //   891: iconst_1
    //   892: putfield 71	com/tencent/mm/plugin/sns/model/y:ptb	Z
    //   895: ldc2_w 43
    //   898: ldc 45
    //   900: invokestatic 404	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   903: return
    //   904: astore_2
    //   905: ldc -100
    //   907: ldc_w 406
    //   910: invokestatic 409	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   913: ldc2_w 43
    //   916: ldc 45
    //   918: invokestatic 404	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   921: return
    //   922: astore 5
    //   924: ldc -100
    //   926: aload 5
    //   928: ldc 57
    //   930: iconst_0
    //   931: anewarray 391	java/lang/Object
    //   934: invokestatic 413	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   937: goto -443 -> 494
    //   940: getstatic 416	com/tencent/mm/platformtools/r:hkB	I
    //   943: iconst_2
    //   944: if_icmpne +8 -> 952
    //   947: iconst_0
    //   948: istore_1
    //   949: goto -63 -> 886
    //   952: aload_0
    //   953: aload_2
    //   954: getfield 290	com/tencent/mm/protocal/c/bgk:tPP	Ljava/lang/String;
    //   957: putfield 67	com/tencent/mm/plugin/sns/model/y:gIp	Ljava/lang/String;
    //   960: aload_0
    //   961: getfield 67	com/tencent/mm/plugin/sns/model/y:gIp	Ljava/lang/String;
    //   964: invokestatic 253	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
    //   967: ifeq +16 -> 983
    //   970: ldc -100
    //   972: ldc_w 418
    //   975: invokestatic 420	com/tencent/mm/sdk/platformtools/w:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   978: iconst_0
    //   979: istore_1
    //   980: goto -94 -> 886
    //   983: iconst_1
    //   984: istore_1
    //   985: goto -99 -> 886
    //   988: aload_0
    //   989: invokespecial 424	com/tencent/mm/plugin/sns/model/y:biA	()Z
    //   992: ifne +7 -> 999
    //   995: aload_0
    //   996: invokespecial 427	com/tencent/mm/plugin/sns/model/y:onError	()V
    //   999: ldc2_w 43
    //   1002: ldc 45
    //   1004: invokestatic 404	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   1007: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1008	0	this	y
    //   0	1008	1	paramInt1	int
    //   0	1008	2	paramString	String
    //   0	1008	3	paramBoolean	boolean
    //   0	1008	4	paramInt2	int
    //   428	6	5	str	String
    //   922	5	5	localException	Exception
    //   315	481	6	localanx	anx
    //   211	493	7	localq	com.tencent.mm.plugin.sns.storage.q
    // Exception table:
    //   from	to	target	type
    //   297	317	904	java/lang/Exception
    //   470	494	922	java/lang/Exception
  }
  
  private boolean biA()
  {
    GMTrace.i(8073867427840L, 60155);
    Object localObject = ae.biS().dV(this.ppo);
    int j = ((com.tencent.mm.plugin.sns.storage.q)localObject).pMJ - ((com.tencent.mm.plugin.sns.storage.q)localObject).offset;
    int i = j;
    if (j > this.gIJ) {
      i = this.gIJ;
    }
    this.offset = ((com.tencent.mm.plugin.sns.storage.q)localObject).offset;
    localObject = FileOp.c(this.path, this.offset, i);
    if ((localObject == null) || (localObject.length <= 0))
    {
      GMTrace.o(8073867427840L, 60155);
      return false;
    }
    azp localazp = new azp();
    localazp.be((byte[])localObject);
    this.psY.tTe = localazp;
    this.psY.tRD = this.offset;
    GMTrace.o(8073867427840L, 60155);
    return true;
  }
  
  private void onError()
  {
    GMTrace.i(8074806951936L, 60162);
    com.tencent.mm.plugin.sns.storage.q localq = ae.biS().dV(this.ppo);
    localq.offset = 0;
    try
    {
      anx localanx = (anx)new anx().aD(localq.pMO);
      localanx.uDL = "";
      localq.pMO = localanx.toByteArray();
      ae.biS().a(this.ppo, localq);
      ae.bjc().ur(this.ppo);
      GMTrace.o(8074806951936L, 60162);
      return;
    }
    catch (Exception localException)
    {
      w.e("MicroMsg.NetSceneMMSnsUpload", "parseFrom MediaUploadInfo error in NetSceneSnsUpload");
      GMTrace.o(8074806951936L, 60162);
    }
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    int i = 107;
    GMTrace.i(8075075387392L, 60164);
    this.fUd = parame1;
    if (this.ptb)
    {
      this.gIp = this.psY.tPP;
      if (bg.nm(this.gIp))
      {
        w.w("MicroMsg.NetSceneMMSnsUpload", "cdntra genClientId failed not use cdn");
        GMTrace.o(8075075387392L, 60164);
        return 0;
      }
      parame = new i();
      parame.gAB = this.gIz;
      parame.field_mediaId = this.gIp;
      parame.field_fullpath = this.path;
      parame.field_thumbpath = "";
      parame.field_fileType = com.tencent.mm.modelcdntran.b.MediaType_FRIENDS;
      parame.field_talker = "";
      parame.field_priority = com.tencent.mm.modelcdntran.b.gzd;
      parame.field_needStorage = true;
      parame.field_isStreamMedia = false;
      if (r.bmx()) {
        if (this.ptc) {
          i = 108;
        }
      }
      for (parame.field_appType = i;; parame.field_appType = i)
      {
        parame.field_bzScene = 1;
        if (com.tencent.mm.modelcdntran.g.Gk().c(parame)) {
          break;
        }
        w.e("MicroMsg.NetSceneMMSnsUpload", "cdntra addSendTask failed. clientid:%s", new Object[] { this.gIp });
        this.gIp = "";
        break;
        if (!r.bmw()) {
          break label220;
        }
        if (this.ptc) {
          i = 108;
        }
      }
      label220:
      com.tencent.mm.modelcdntran.g.Gk();
      if (com.tencent.mm.modelcdntran.c.fT(64))
      {
        if (this.ptc) {}
        for (i = 104;; i = 103)
        {
          parame.field_appType = i;
          break;
        }
      }
      if (this.ptc) {}
      for (i = 101;; i = 100)
      {
        parame.field_appType = i;
        break;
      }
    }
    i = a(parame, this.fUa, this);
    GMTrace.o(8075075387392L, 60164);
    return i;
  }
  
  protected final int a(com.tencent.mm.network.q paramq)
  {
    GMTrace.i(8074001645568L, 60156);
    int i = k.b.gum;
    GMTrace.o(8074001645568L, 60156);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, com.tencent.mm.network.q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(8074404298752L, 60159);
    w.i("MicroMsg.NetSceneMMSnsUpload", "netId : " + paramInt1 + " errType :" + paramInt2 + " errCode: " + paramInt3 + " errMsg :" + paramString);
    paramq = (bgl)((com.tencent.mm.ad.b)paramq).gtD.gtK;
    if (paramInt2 == 4)
    {
      um(paramInt3);
      if (this.pte == 21) {
        com.tencent.mm.plugin.sns.lucky.a.b.nU(12);
      }
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(8074404298752L, 60159);
      return;
    }
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      onError();
      if (this.pte == 21) {
        com.tencent.mm.plugin.sns.lucky.a.b.nU(13);
      }
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(8074404298752L, 60159);
      return;
    }
    paramArrayOfByte = ae.biS().dV(this.ppo);
    if ((paramq.tRD < 0) || ((paramq.tRD > paramArrayOfByte.pMJ) && (paramArrayOfByte.pMJ > 0)))
    {
      onError();
      if (paramInt2 == 3) {
        com.tencent.mm.plugin.sns.lucky.a.b.nU(14);
      }
      GMTrace.o(8074404298752L, 60159);
      return;
    }
    if (paramq.tRD < paramArrayOfByte.offset)
    {
      onError();
      if (paramInt2 == 3) {
        com.tencent.mm.plugin.sns.lucky.a.b.nU(14);
      }
      GMTrace.o(8074404298752L, 60159);
      return;
    }
    w.d("MicroMsg.NetSceneMMSnsUpload", " bufferUrl: " + paramq.uSh.lPM + " bufferUrlType: " + paramq.uSh.jib + "  id:" + paramq.tXT + " thumb Count: " + paramq.uDI + "  type " + paramq.jib + " startPos : " + paramq.tRD);
    paramArrayOfByte.offset = paramq.tRD;
    ae.biS().a(this.ppo, paramArrayOfByte);
    if ((paramArrayOfByte.offset == paramArrayOfByte.pMJ) && (paramArrayOfByte.pMJ != 0))
    {
      paramInt1 = 1;
      if (paramInt1 == 0) {
        break label639;
      }
      w.i("MicroMsg.NetSceneMMSnsUpload", "uploadsns done pass: " + (System.currentTimeMillis() - this.ptd));
      if ((paramq.uDJ.size() == 0) || (paramq.uDJ.size() <= 0)) {
        break label587;
      }
      a(paramq.uSh.lPM, paramq.uSh.jib, ((bet)paramq.uDJ.get(0)).lPM, ((bet)paramq.uDJ.get(0)).jib, paramq.tXT, this.psY.ugH);
    }
    for (;;)
    {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(8074404298752L, 60159);
      return;
      paramInt1 = 0;
      break;
      label587:
      a(paramq.uSh.lPM, paramq.uSh.jib, "", 0, paramq.tXT, this.psY.ugH);
    }
    label639:
    if ((biA()) && (a(this.gtW, this.fUd) < 0)) {
      this.fUd.a(3, -1, "doScene failed", this);
    }
    GMTrace.o(8074404298752L, 60159);
  }
  
  public final boolean a(String paramString1, int paramInt1, String paramString2, int paramInt2, String paramString3, String paramString4)
  {
    GMTrace.i(8074538516480L, 60160);
    com.tencent.mm.plugin.sns.storage.q localq = ae.biS().dV(this.ppo);
    w.i("MicroMsg.NetSceneMMSnsUpload", "upload ok " + paramString1 + "  " + paramString3 + "  " + paramInt1 + " thumbUrl: " + paramString2);
    BitmapFactory.Options localOptions = new BitmapFactory.Options();
    localOptions.inJustDecodeBounds = true;
    MMBitmapFactory.decodeFile(this.path, localOptions, null, 0, new int[0]);
    Object localObject;
    if (localOptions.outMimeType != null) {
      localObject = localOptions.outMimeType.toLowerCase();
    }
    for (;;)
    {
      int i = -1;
      if ((((String)localObject).endsWith("jpg")) || (((String)localObject).endsWith("jpeg")))
      {
        int j = MMNativeJpeg.queryQuality(this.path);
        i = j;
        if (j == 0) {
          i = -1;
        }
      }
      long l = FileOp.kX(this.path);
      com.tencent.mm.plugin.sns.h.c.a(paramString1, localOptions.outMimeType, localOptions.outWidth, localOptions.outHeight, i, l);
      localq.pMN = paramString3;
      try
      {
        paramString3 = (anx)new anx().aD(localq.pMO);
        localObject = paramString3;
        if (paramString3 == null) {
          localObject = new anx();
        }
        paramString3 = new anr();
        paramString3.jib = paramInt1;
        paramString3.lPM = paramString1;
        ((anx)localObject).uDH = paramString3;
        ((anx)localObject).uDK = 0;
        ((anx)localObject).eDW = paramString4;
        if (!bg.nm(paramString2))
        {
          paramString1 = new anr();
          paramString1.jib = paramInt2;
          paramString1.lPM = paramString2;
          ((anx)localObject).uDJ.add(paramString1);
        }
      }
      catch (Exception paramString3)
      {
        try
        {
          localq.pMO = ((anx)localObject).toByteArray();
          localq.bmv();
          ae.biS().a(this.ppo, localq);
          ae.bjc().ur(this.ppo);
          if (ae.biZ() != null) {
            ae.biZ().bhR();
          }
          GMTrace.o(8074538516480L, 60160);
          return true;
          localObject = "";
          continue;
          paramString3 = paramString3;
          paramString3 = null;
        }
        catch (Exception paramString1)
        {
          for (;;)
          {
            w.printErrStackTrace("MicroMsg.NetSceneMMSnsUpload", paramString1, "", new Object[0]);
          }
        }
      }
    }
  }
  
  protected final void cancel()
  {
    GMTrace.i(8074941169664L, 60163);
    super.cancel();
    if ((this.ptb) && (!bg.nm(this.gIp)))
    {
      w.i("MicroMsg.NetSceneMMSnsUpload", "cancel by cdn " + this.gIp);
      com.tencent.mm.modelcdntran.g.Gk().jy(this.gIp);
    }
    GMTrace.o(8074941169664L, 60163);
  }
  
  public final int getType()
  {
    GMTrace.i(8074270081024L, 60158);
    GMTrace.o(8074270081024L, 60158);
    return 207;
  }
  
  public final void ul(int paramInt)
  {
    GMTrace.i(16041434415104L, 119518);
    int i = 0;
    while (i < a.gzb.length)
    {
      if (paramInt == a.gzb[i])
      {
        um(0);
        GMTrace.o(16041434415104L, 119518);
        return;
      }
      i += 1;
    }
    onError();
    GMTrace.o(16041434415104L, 119518);
  }
  
  public final void um(int paramInt)
  {
    GMTrace.i(8074672734208L, 60161);
    com.tencent.mm.plugin.sns.storage.q localq = ae.biS().dV(this.ppo);
    try
    {
      anx localanx = (anx)new anx().aD(localq.pMO);
      localanx.uDK = 1;
      localanx.uDt = paramInt;
      localq.pMO = localanx.toByteArray();
      ae.bjc().ur(this.ppo);
      ae.biS().a(this.ppo, localq);
      GMTrace.o(8074672734208L, 60161);
      return;
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
  }
  
  protected final int vB()
  {
    GMTrace.i(8074135863296L, 60157);
    if (this.pta)
    {
      GMTrace.o(8074135863296L, 60157);
      return 675;
    }
    GMTrace.o(8074135863296L, 60157);
    return 100;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\model\y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */