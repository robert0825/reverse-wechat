package com.tencent.mm.plugin.exdevice.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.k;
import com.tencent.mm.ao.d;
import com.tencent.mm.ao.f;
import com.tencent.mm.g.a.dx;
import com.tencent.mm.g.a.eb;
import com.tencent.mm.g.a.hq;
import com.tencent.mm.g.a.hq.b;
import com.tencent.mm.g.b.bp;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.modelcdntran.i.a;
import com.tencent.mm.modelcdntran.keep_ProgressInfo;
import com.tencent.mm.modelcdntran.keep_SceneResult;
import com.tencent.mm.modelvideo.o;
import com.tencent.mm.modelvideo.s;
import com.tencent.mm.plugin.exdevice.jni.Java2CExDevice;
import com.tencent.mm.pluginsdk.model.app.an;
import com.tencent.mm.protocal.c.ahq;
import com.tencent.mm.protocal.c.ahr;
import com.tencent.mm.protocal.c.ahs;
import com.tencent.mm.protocal.c.aht;
import com.tencent.mm.protocal.c.ahu;
import com.tencent.mm.protocal.c.ahv;
import com.tencent.mm.protocal.c.ahw;
import com.tencent.mm.protocal.c.biz;
import com.tencent.mm.protocal.c.bjs;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.au;
import com.tencent.mm.storage.au.b;
import com.tencent.mm.x.f.a;
import com.tencent.mm.y.at;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

public final class g
  implements e
{
  String eMN;
  public long fKQ;
  long fUI;
  String gIp;
  public i.a gIz;
  boolean kyM;
  boolean kyN;
  boolean kyO;
  String kyP;
  public String kyQ;
  int kyR;
  public String kyS;
  public String kyT;
  private String kyU;
  boolean kyV;
  boolean kyW;
  public HashMap<String, String> kyX;
  public ahr kyY;
  long kyZ;
  public List<com.tencent.mm.plugin.exdevice.h.b> kza;
  public List<com.tencent.mm.plugin.exdevice.h.b> kzb;
  public HashMap<String, String> kzc;
  HashMap<String, Integer> kzd;
  public HashMap<String, Boolean> kze;
  j.a kzf;
  j.a kzg;
  j.a kzh;
  j.a kzi;
  Runnable kzj;
  ahr kzk;
  String kzl;
  String kzm;
  int kzn;
  public HashMap<Integer, String> kzo;
  
  public g()
  {
    GMTrace.i(10955924701184L, 81628);
    this.kyM = false;
    this.kyN = false;
    this.kyO = false;
    this.kyS = "send_data_sucess";
    this.kyT = "send_data_failed";
    this.kyU = "send_data_sending";
    this.kyV = false;
    this.kyW = false;
    this.kyX = new HashMap();
    this.gIp = "";
    this.kza = null;
    this.kzb = new ArrayList();
    this.kzc = new HashMap();
    this.kzd = new HashMap();
    this.kze = new HashMap();
    this.kzj = new Runnable()
    {
      /* Error */
      public final void run()
      {
        // Byte code:
        //   0: aconst_null
        //   1: astore 5
        //   3: ldc2_w 36
        //   6: ldc 38
        //   8: invokestatic 26	com/tencent/gmtrace/GMTrace:i	(JI)V
        //   11: new 40	java/lang/StringBuilder
        //   14: dup
        //   15: invokespecial 41	java/lang/StringBuilder:<init>	()V
        //   18: getstatic 47	com/tencent/mm/compatible/util/e:fRY	Ljava/lang/String;
        //   21: invokevirtual 51	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   24: ldc 53
        //   26: iconst_3
        //   27: anewarray 4	java/lang/Object
        //   30: dup
        //   31: iconst_0
        //   32: ldc 55
        //   34: aastore
        //   35: dup
        //   36: iconst_1
        //   37: aload_0
        //   38: getfield 14	com/tencent/mm/plugin/exdevice/model/g$1:kzp	Lcom/tencent/mm/plugin/exdevice/model/g;
        //   41: getfield 58	com/tencent/mm/plugin/exdevice/model/g:eMN	Ljava/lang/String;
        //   44: invokevirtual 64	java/lang/String:hashCode	()I
        //   47: invokestatic 70	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
        //   50: aastore
        //   51: dup
        //   52: iconst_2
        //   53: ldc 72
        //   55: aastore
        //   56: invokestatic 76	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   59: invokevirtual 51	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   62: invokevirtual 80	java/lang/StringBuilder:toString	()Ljava/lang/String;
        //   65: astore 6
        //   67: aload_0
        //   68: getfield 14	com/tencent/mm/plugin/exdevice/model/g$1:kzp	Lcom/tencent/mm/plugin/exdevice/model/g;
        //   71: getfield 58	com/tencent/mm/plugin/exdevice/model/g:eMN	Ljava/lang/String;
        //   74: invokestatic 84	com/tencent/mm/plugin/exdevice/model/g:wF	(Ljava/lang/String;)[B
        //   77: astore_2
        //   78: aload_2
        //   79: ifnull +270 -> 349
        //   82: aload_2
        //   83: iconst_0
        //   84: aload_2
        //   85: arraylength
        //   86: invokestatic 90	android/graphics/BitmapFactory:decodeByteArray	([BII)Landroid/graphics/Bitmap;
        //   89: astore 4
        //   91: aload_0
        //   92: getfield 14	com/tencent/mm/plugin/exdevice/model/g$1:kzp	Lcom/tencent/mm/plugin/exdevice/model/g;
        //   95: astore 7
        //   97: new 92	java/io/File
        //   100: dup
        //   101: aload 6
        //   103: invokespecial 95	java/io/File:<init>	(Ljava/lang/String;)V
        //   106: astore_2
        //   107: new 97	java/io/BufferedOutputStream
        //   110: dup
        //   111: new 99	java/io/FileOutputStream
        //   114: dup
        //   115: aload_2
        //   116: invokespecial 102	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
        //   119: invokespecial 105	java/io/BufferedOutputStream:<init>	(Ljava/io/OutputStream;)V
        //   122: astore_3
        //   123: aload_3
        //   124: astore_2
        //   125: aload 4
        //   127: getstatic 111	android/graphics/Bitmap$CompressFormat:JPEG	Landroid/graphics/Bitmap$CompressFormat;
        //   130: bipush 80
        //   132: aload_3
        //   133: invokevirtual 117	android/graphics/Bitmap:compress	(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
        //   136: pop
        //   137: aload_3
        //   138: astore_2
        //   139: aload_3
        //   140: invokevirtual 120	java/io/BufferedOutputStream:flush	()V
        //   143: aload_3
        //   144: invokevirtual 123	java/io/BufferedOutputStream:close	()V
        //   147: aload_0
        //   148: getfield 14	com/tencent/mm/plugin/exdevice/model/g$1:kzp	Lcom/tencent/mm/plugin/exdevice/model/g;
        //   151: aload 6
        //   153: putfield 126	com/tencent/mm/plugin/exdevice/model/g:kyQ	Ljava/lang/String;
        //   156: aload_0
        //   157: getfield 14	com/tencent/mm/plugin/exdevice/model/g$1:kzp	Lcom/tencent/mm/plugin/exdevice/model/g;
        //   160: getfield 126	com/tencent/mm/plugin/exdevice/model/g:kyQ	Ljava/lang/String;
        //   163: ifnonnull +219 -> 382
        //   166: aload_0
        //   167: getfield 14	com/tencent/mm/plugin/exdevice/model/g$1:kzp	Lcom/tencent/mm/plugin/exdevice/model/g;
        //   170: getfield 126	com/tencent/mm/plugin/exdevice/model/g:kyQ	Ljava/lang/String;
        //   173: invokestatic 132	com/tencent/mm/modelsfs/FileOp:aZ	(Ljava/lang/String;)Z
        //   176: ifne +206 -> 382
        //   179: ldc -122
        //   181: ldc -120
        //   183: invokestatic 142	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
        //   186: aload_0
        //   187: getfield 14	com/tencent/mm/plugin/exdevice/model/g$1:kzp	Lcom/tencent/mm/plugin/exdevice/model/g;
        //   190: getfield 145	com/tencent/mm/plugin/exdevice/model/g:kzm	Ljava/lang/String;
        //   193: aload_0
        //   194: getfield 14	com/tencent/mm/plugin/exdevice/model/g$1:kzp	Lcom/tencent/mm/plugin/exdevice/model/g;
        //   197: getfield 148	com/tencent/mm/plugin/exdevice/model/g:kyT	Ljava/lang/String;
        //   200: invokestatic 151	com/tencent/mm/plugin/exdevice/model/g:bW	(Ljava/lang/String;Ljava/lang/String;)V
        //   203: ldc2_w 36
        //   206: ldc 38
        //   208: invokestatic 29	com/tencent/gmtrace/GMTrace:o	(JI)V
        //   211: return
        //   212: astore_2
        //   213: ldc -122
        //   215: aload_2
        //   216: ldc -103
        //   218: iconst_0
        //   219: anewarray 4	java/lang/Object
        //   222: invokestatic 157	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
        //   225: goto -78 -> 147
        //   228: astore_2
        //   229: ldc -122
        //   231: aload_2
        //   232: ldc -103
        //   234: iconst_0
        //   235: anewarray 4	java/lang/Object
        //   238: invokestatic 157	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
        //   241: ldc2_w 36
        //   244: ldc 38
        //   246: invokestatic 29	com/tencent/gmtrace/GMTrace:o	(JI)V
        //   249: return
        //   250: astore 4
        //   252: aconst_null
        //   253: astore_3
        //   254: aload_3
        //   255: astore_2
        //   256: ldc -122
        //   258: ldc -97
        //   260: invokestatic 142	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
        //   263: aload_3
        //   264: astore_2
        //   265: aload 7
        //   267: getfield 145	com/tencent/mm/plugin/exdevice/model/g:kzm	Ljava/lang/String;
        //   270: aload 7
        //   272: getfield 148	com/tencent/mm/plugin/exdevice/model/g:kyT	Ljava/lang/String;
        //   275: invokestatic 151	com/tencent/mm/plugin/exdevice/model/g:bW	(Ljava/lang/String;Ljava/lang/String;)V
        //   278: aload_3
        //   279: astore_2
        //   280: ldc -122
        //   282: aload 4
        //   284: ldc -103
        //   286: iconst_0
        //   287: anewarray 4	java/lang/Object
        //   290: invokestatic 157	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
        //   293: aload_3
        //   294: ifnull -147 -> 147
        //   297: aload_3
        //   298: invokevirtual 123	java/io/BufferedOutputStream:close	()V
        //   301: goto -154 -> 147
        //   304: astore_2
        //   305: ldc -122
        //   307: aload_2
        //   308: ldc -103
        //   310: iconst_0
        //   311: anewarray 4	java/lang/Object
        //   314: invokestatic 157	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
        //   317: goto -170 -> 147
        //   320: astore_3
        //   321: aconst_null
        //   322: astore_2
        //   323: aload_2
        //   324: ifnull +7 -> 331
        //   327: aload_2
        //   328: invokevirtual 123	java/io/BufferedOutputStream:close	()V
        //   331: aload_3
        //   332: athrow
        //   333: astore_2
        //   334: ldc -122
        //   336: aload_2
        //   337: ldc -103
        //   339: iconst_0
        //   340: anewarray 4	java/lang/Object
        //   343: invokestatic 157	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
        //   346: goto -15 -> 331
        //   349: ldc -122
        //   351: ldc -95
        //   353: invokestatic 142	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
        //   356: aload_0
        //   357: getfield 14	com/tencent/mm/plugin/exdevice/model/g$1:kzp	Lcom/tencent/mm/plugin/exdevice/model/g;
        //   360: getfield 145	com/tencent/mm/plugin/exdevice/model/g:kzm	Ljava/lang/String;
        //   363: aload_0
        //   364: getfield 14	com/tencent/mm/plugin/exdevice/model/g$1:kzp	Lcom/tencent/mm/plugin/exdevice/model/g;
        //   367: getfield 148	com/tencent/mm/plugin/exdevice/model/g:kyT	Ljava/lang/String;
        //   370: invokestatic 151	com/tencent/mm/plugin/exdevice/model/g:bW	(Ljava/lang/String;Ljava/lang/String;)V
        //   373: ldc2_w 36
        //   376: ldc 38
        //   378: invokestatic 29	com/tencent/gmtrace/GMTrace:o	(JI)V
        //   381: return
        //   382: new 163	com/tencent/mm/protocal/c/ahs
        //   385: dup
        //   386: invokespecial 164	com/tencent/mm/protocal/c/ahs:<init>	()V
        //   389: astore 6
        //   391: aload_0
        //   392: getfield 14	com/tencent/mm/plugin/exdevice/model/g$1:kzp	Lcom/tencent/mm/plugin/exdevice/model/g;
        //   395: getfield 126	com/tencent/mm/plugin/exdevice/model/g:kyQ	Ljava/lang/String;
        //   398: astore 7
        //   400: aload 7
        //   402: ifnull +215 -> 617
        //   405: aload 7
        //   407: invokevirtual 167	java/lang/String:length	()I
        //   410: ifle +207 -> 617
        //   413: new 92	java/io/File
        //   416: dup
        //   417: aload 7
        //   419: invokespecial 95	java/io/File:<init>	(Ljava/lang/String;)V
        //   422: astore_2
        //   423: aload_2
        //   424: invokevirtual 170	java/io/File:getName	()Ljava/lang/String;
        //   427: astore_3
        //   428: aload_2
        //   429: invokevirtual 173	java/io/File:length	()J
        //   432: l2i
        //   433: istore_1
        //   434: aload_3
        //   435: aload_3
        //   436: ldc -81
        //   438: invokevirtual 179	java/lang/String:lastIndexOf	(Ljava/lang/String;)I
        //   441: iconst_1
        //   442: iadd
        //   443: aload_3
        //   444: invokevirtual 167	java/lang/String:length	()I
        //   447: invokevirtual 183	java/lang/String:substring	(II)Ljava/lang/String;
        //   450: astore 4
        //   452: aload_2
        //   453: invokestatic 189	com/tencent/mm/a/g:h	(Ljava/io/File;)Ljava/lang/String;
        //   456: astore_2
        //   457: ldc -122
        //   459: ldc -65
        //   461: iconst_1
        //   462: anewarray 4	java/lang/Object
        //   465: dup
        //   466: iconst_0
        //   467: aload 7
        //   469: aastore
        //   470: invokestatic 194	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
        //   473: ldc -122
        //   475: ldc -60
        //   477: iconst_1
        //   478: anewarray 4	java/lang/Object
        //   481: dup
        //   482: iconst_0
        //   483: iload_1
        //   484: invokestatic 70	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
        //   487: aastore
        //   488: invokestatic 194	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
        //   491: ldc -122
        //   493: ldc -58
        //   495: iconst_1
        //   496: anewarray 4	java/lang/Object
        //   499: dup
        //   500: iconst_0
        //   501: aload_2
        //   502: aastore
        //   503: invokestatic 194	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
        //   506: aload 6
        //   508: aload 4
        //   510: putfield 201	com/tencent/mm/protocal/c/ahs:uhC	Ljava/lang/String;
        //   513: aload 6
        //   515: aload_3
        //   516: putfield 204	com/tencent/mm/protocal/c/ahs:lPi	Ljava/lang/String;
        //   519: aload 6
        //   521: iload_1
        //   522: putfield 208	com/tencent/mm/protocal/c/ahs:jhV	I
        //   525: aload 6
        //   527: aload_2
        //   528: putfield 211	com/tencent/mm/protocal/c/ahs:ugy	Ljava/lang/String;
        //   531: aload_0
        //   532: getfield 14	com/tencent/mm/plugin/exdevice/model/g$1:kzp	Lcom/tencent/mm/plugin/exdevice/model/g;
        //   535: getfield 215	com/tencent/mm/plugin/exdevice/model/g:kzk	Lcom/tencent/mm/protocal/c/ahr;
        //   538: aload 6
        //   540: putfield 221	com/tencent/mm/protocal/c/ahr:uxh	Lcom/tencent/mm/protocal/c/ahs;
        //   543: aload_0
        //   544: getfield 14	com/tencent/mm/plugin/exdevice/model/g$1:kzp	Lcom/tencent/mm/plugin/exdevice/model/g;
        //   547: getfield 215	com/tencent/mm/plugin/exdevice/model/g:kzk	Lcom/tencent/mm/protocal/c/ahr;
        //   550: iconst_3
        //   551: putfield 224	com/tencent/mm/protocal/c/ahr:uxe	I
        //   554: new 226	com/tencent/mm/plugin/exdevice/model/n
        //   557: dup
        //   558: aload_0
        //   559: getfield 14	com/tencent/mm/plugin/exdevice/model/g$1:kzp	Lcom/tencent/mm/plugin/exdevice/model/g;
        //   562: getfield 215	com/tencent/mm/plugin/exdevice/model/g:kzk	Lcom/tencent/mm/protocal/c/ahr;
        //   565: aload_0
        //   566: getfield 14	com/tencent/mm/plugin/exdevice/model/g$1:kzp	Lcom/tencent/mm/plugin/exdevice/model/g;
        //   569: getfield 229	com/tencent/mm/plugin/exdevice/model/g:kzl	Ljava/lang/String;
        //   572: aload_0
        //   573: getfield 14	com/tencent/mm/plugin/exdevice/model/g$1:kzp	Lcom/tencent/mm/plugin/exdevice/model/g;
        //   576: getfield 145	com/tencent/mm/plugin/exdevice/model/g:kzm	Ljava/lang/String;
        //   579: aload_0
        //   580: getfield 14	com/tencent/mm/plugin/exdevice/model/g$1:kzp	Lcom/tencent/mm/plugin/exdevice/model/g;
        //   583: getfield 232	com/tencent/mm/plugin/exdevice/model/g:kzn	I
        //   586: invokespecial 235	com/tencent/mm/plugin/exdevice/model/n:<init>	(Lcom/tencent/mm/protocal/c/ahr;Ljava/lang/String;Ljava/lang/String;I)V
        //   589: astore_2
        //   590: invokestatic 241	com/tencent/mm/y/at:wS	()Lcom/tencent/mm/ad/n;
        //   593: aload_2
        //   594: iconst_0
        //   595: invokevirtual 247	com/tencent/mm/ad/n:a	(Lcom/tencent/mm/ad/k;I)Z
        //   598: pop
        //   599: ldc2_w 36
        //   602: ldc 38
        //   604: invokestatic 29	com/tencent/gmtrace/GMTrace:o	(JI)V
        //   607: return
        //   608: astore_3
        //   609: goto -286 -> 323
        //   612: astore 4
        //   614: goto -360 -> 254
        //   617: aconst_null
        //   618: astore_3
        //   619: iconst_m1
        //   620: istore_1
        //   621: aconst_null
        //   622: astore_2
        //   623: aload 5
        //   625: astore 4
        //   627: goto -121 -> 506
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	630	0	this	1
        //   433	188	1	i	int
        //   77	62	2	localObject1	Object
        //   212	4	2	localIOException1	java.io.IOException
        //   228	4	2	localException	Exception
        //   255	25	2	localObject2	Object
        //   304	4	2	localIOException2	java.io.IOException
        //   322	6	2	localObject3	Object
        //   333	4	2	localIOException3	java.io.IOException
        //   422	201	2	localObject4	Object
        //   122	176	3	localBufferedOutputStream	java.io.BufferedOutputStream
        //   320	12	3	localObject5	Object
        //   427	89	3	str1	String
        //   608	1	3	localObject6	Object
        //   618	1	3	localObject7	Object
        //   89	37	4	localBitmap	android.graphics.Bitmap
        //   250	33	4	localIOException4	java.io.IOException
        //   450	59	4	str2	String
        //   612	1	4	localIOException5	java.io.IOException
        //   625	1	4	localObject8	Object
        //   1	623	5	localObject9	Object
        //   65	474	6	localObject10	Object
        //   95	373	7	localObject11	Object
        // Exception table:
        //   from	to	target	type
        //   143	147	212	java/io/IOException
        //   11	78	228	java/lang/Exception
        //   82	107	228	java/lang/Exception
        //   143	147	228	java/lang/Exception
        //   147	203	228	java/lang/Exception
        //   213	225	228	java/lang/Exception
        //   297	301	228	java/lang/Exception
        //   305	317	228	java/lang/Exception
        //   327	331	228	java/lang/Exception
        //   331	333	228	java/lang/Exception
        //   334	346	228	java/lang/Exception
        //   349	373	228	java/lang/Exception
        //   382	400	228	java/lang/Exception
        //   405	506	228	java/lang/Exception
        //   506	599	228	java/lang/Exception
        //   107	123	250	java/io/IOException
        //   297	301	304	java/io/IOException
        //   107	123	320	finally
        //   327	331	333	java/io/IOException
        //   125	137	608	finally
        //   139	143	608	finally
        //   256	263	608	finally
        //   265	278	608	finally
        //   280	293	608	finally
        //   125	137	612	java/io/IOException
        //   139	143	612	java/io/IOException
      }
    };
    this.gIz = new i.a()
    {
      public final int a(String paramAnonymousString, int paramAnonymousInt, keep_ProgressInfo paramAnonymouskeep_ProgressInfo, keep_SceneResult paramAnonymouskeep_SceneResult, boolean paramAnonymousBoolean)
      {
        GMTrace.i(10940623880192L, 81514);
        w.d("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", "cdntra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s] sentToCloud:[%s]", new Object[] { g.this.gIp, Integer.valueOf(paramAnonymousInt), paramAnonymouskeep_ProgressInfo, paramAnonymouskeep_SceneResult, Boolean.valueOf(g.this.kyV) });
        if (paramAnonymouskeep_ProgressInfo != null) {}
        label564:
        label574:
        for (;;)
        {
          try
          {
            paramAnonymousInt = (int)(paramAnonymouskeep_ProgressInfo.field_finishedLength / paramAnonymouskeep_ProgressInfo.field_toltalLength * 100.0F);
            w.d("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", "sent to cloud progress %d", new Object[] { Integer.valueOf(paramAnonymousInt) });
            if (paramAnonymousInt < 100) {
              break label574;
            }
            paramAnonymousInt = 99;
            paramAnonymousString = g.this.kyX.keySet().iterator();
            if (paramAnonymousString.hasNext())
            {
              paramAnonymouskeep_ProgressInfo = (String)paramAnonymousString.next();
              g.this.aS(paramAnonymouskeep_ProgressInfo, paramAnonymousInt);
              continue;
            }
            if (paramAnonymouskeep_SceneResult == null) {
              break label564;
            }
          }
          catch (Exception paramAnonymousString)
          {
            w.e("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", "cdnCallback Exception %s", new Object[] { paramAnonymousString });
            GMTrace.o(10940623880192L, 81514);
            return 0;
          }
          if (g.this.kyV)
          {
            paramAnonymousString = new ahr();
            g.this.a(paramAnonymousString, g.this.fKQ);
            g.this.kyV = false;
            if ((g.bx(g.this.fKQ).booleanValue()) || (g.by(g.this.fKQ).booleanValue()))
            {
              paramAnonymousString.uxh.tYF = paramAnonymouskeep_SceneResult.field_aesKey;
              paramAnonymousString.uxh.uxl = g.this.kyZ;
              paramAnonymousString.uxh.tYJ = paramAnonymouskeep_SceneResult.field_fileId;
              paramAnonymousString.uxh.lPM = paramAnonymouskeep_SceneResult.field_fileUrl;
              w.i("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", "image_msg.url:[%s]", new Object[] { paramAnonymousString.uxh.lPM });
            }
            for (;;)
            {
              g.this.kyY = paramAnonymousString;
              paramAnonymouskeep_ProgressInfo = g.this.kyX.keySet().iterator();
              while (paramAnonymouskeep_ProgressInfo.hasNext())
              {
                paramAnonymouskeep_SceneResult = (String)paramAnonymouskeep_ProgressInfo.next();
                paramAnonymouskeep_SceneResult = new n(paramAnonymousString, (String)g.this.kyX.get(paramAnonymouskeep_SceneResult), paramAnonymouskeep_SceneResult, 1);
                at.wS().a(paramAnonymouskeep_SceneResult, 0);
              }
              if (g.bw(g.this.fKQ).booleanValue())
              {
                paramAnonymousString.uxi.tYF = paramAnonymouskeep_SceneResult.field_aesKey;
                paramAnonymousString.uxi.tYJ = paramAnonymouskeep_SceneResult.field_fileId;
                paramAnonymousString.uxi.lPM = paramAnonymouskeep_SceneResult.field_fileUrl;
                w.i("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", "file_msg.url:[%s]", new Object[] { paramAnonymousString.uxi.lPM });
              }
              else if (g.bz(g.this.fKQ).booleanValue())
              {
                paramAnonymousString.uxk.lPM = paramAnonymouskeep_SceneResult.field_fileUrl;
                w.i("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", "video_msg.url:[%s]", new Object[] { paramAnonymousString.uxk.lPM });
              }
            }
            g.this.kyX.clear();
          }
          GMTrace.o(10940623880192L, 81514);
          return 0;
        }
      }
      
      public final void a(String paramAnonymousString, ByteArrayOutputStream paramAnonymousByteArrayOutputStream)
      {
        GMTrace.i(10940758097920L, 81515);
        w.i("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", "getCdnAuthInfo mediaId = " + paramAnonymousString);
        GMTrace.o(10940758097920L, 81515);
      }
      
      public final byte[] h(String paramAnonymousString, byte[] paramAnonymousArrayOfByte)
      {
        GMTrace.i(10940892315648L, 81516);
        w.i("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", "decodePrepareResponse ");
        GMTrace.o(10940892315648L, 81516);
        return paramAnonymousArrayOfByte;
      }
    };
    this.kzo = new HashMap();
    this.kzb.clear();
    this.kzc.clear();
    this.kze.clear();
    this.kza = ad.atR().auv();
    if ((this.kza != null) && (this.kza.size() > 0))
    {
      w.d("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", "Bind Device Size is %d", new Object[] { Integer.valueOf(this.kza.size()) });
      int j = this.kza.size();
      int i = 0;
      while (i < j)
      {
        if ((((com.tencent.mm.plugin.exdevice.h.b)this.kza.get(i)).fsL.contains("internet_to_device")) && (!((com.tencent.mm.plugin.exdevice.h.b)this.kza.get(i)).fsL.contains("wechat_to_device"))) {
          this.kzb.add(this.kza.get(i));
        }
        i += 1;
      }
      this.kzi = new j.a()
      {
        public final void f(int paramAnonymousInt, Object... paramAnonymousVarArgs)
        {
          GMTrace.i(10963709329408L, 81686);
          if ((paramAnonymousInt != 15) || (paramAnonymousVarArgs == null) || (paramAnonymousVarArgs.length < 2) || (!(paramAnonymousVarArgs[0] instanceof Integer)) || (!(paramAnonymousVarArgs[1] instanceof byte[])))
          {
            GMTrace.o(10963709329408L, 81686);
            return;
          }
          int i = ((Integer)paramAnonymousVarArgs[0]).intValue();
          paramAnonymousVarArgs = (byte[])paramAnonymousVarArgs[1];
          for (;;)
          {
            try
            {
              paramAnonymousVarArgs = new String(paramAnonymousVarArgs);
              w.d("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", "file transfer update json %s", new Object[] { paramAnonymousVarArgs });
              paramAnonymousInt = new JSONObject(paramAnonymousVarArgs).getInt("progress");
            }
            catch (JSONException paramAnonymousVarArgs)
            {
              try
              {
                g.this.aS((String)g.this.kzo.get(Integer.valueOf(i)), paramAnonymousInt);
                if (paramAnonymousInt >= 100) {
                  g.this.kzo.remove(Integer.valueOf(i));
                }
                w.d("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", "progress %d", new Object[] { Integer.valueOf(paramAnonymousInt) });
                GMTrace.o(10963709329408L, 81686);
                return;
              }
              catch (JSONException paramAnonymousVarArgs)
              {
                for (;;) {}
              }
              paramAnonymousVarArgs = paramAnonymousVarArgs;
              paramAnonymousInt = 0;
            }
            tmp193_190[0] = paramAnonymousVarArgs;
            w.e("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", "JSON decode failed in file transfer update callback %s", tmp193_190);
          }
        }
      };
      this.kzf = new j.a()
      {
        /* Error */
        public final void f(int paramAnonymousInt, Object... paramAnonymousVarArgs)
        {
          // Byte code:
          //   0: aconst_null
          //   1: astore 4
          //   3: aconst_null
          //   4: astore 7
          //   6: ldc2_w 35
          //   9: ldc 37
          //   11: invokestatic 26	com/tencent/gmtrace/GMTrace:i	(JI)V
          //   14: iload_1
          //   15: bipush 14
          //   17: if_icmpne +21 -> 38
          //   20: aload_2
          //   21: ifnull +17 -> 38
          //   24: aload_2
          //   25: arraylength
          //   26: ifle +12 -> 38
          //   29: aload_2
          //   30: iconst_0
          //   31: aaload
          //   32: instanceof 39
          //   35: ifne +12 -> 47
          //   38: ldc2_w 35
          //   41: ldc 37
          //   43: invokestatic 29	com/tencent/gmtrace/GMTrace:o	(JI)V
          //   46: return
          //   47: aload_2
          //   48: iconst_0
          //   49: aaload
          //   50: checkcast 39	[B
          //   53: checkcast 39	[B
          //   56: astore_2
          //   57: new 41	org/json/JSONObject
          //   60: dup
          //   61: new 43	java/lang/String
          //   64: dup
          //   65: aload_2
          //   66: invokespecial 46	java/lang/String:<init>	([B)V
          //   69: invokespecial 49	org/json/JSONObject:<init>	(Ljava/lang/String;)V
          //   72: astore 6
          //   74: aload 6
          //   76: ldc 51
          //   78: invokevirtual 55	org/json/JSONObject:getJSONObject	(Ljava/lang/String;)Lorg/json/JSONObject;
          //   81: astore_2
          //   82: aload_2
          //   83: ldc 57
          //   85: invokevirtual 61	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
          //   88: astore 5
          //   90: aload 4
          //   92: astore 7
          //   94: aload_2
          //   95: ldc 63
          //   97: invokevirtual 61	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
          //   100: astore 4
          //   102: aload 4
          //   104: astore 7
          //   106: aload 6
          //   108: ldc 65
          //   110: invokevirtual 69	org/json/JSONObject:isNull	(Ljava/lang/String;)Z
          //   113: ifeq +23 -> 136
          //   116: aload 4
          //   118: astore 7
          //   120: ldc 71
          //   122: ldc 73
          //   124: invokestatic 79	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;)V
          //   127: ldc2_w 35
          //   130: ldc 37
          //   132: invokestatic 29	com/tencent/gmtrace/GMTrace:o	(JI)V
          //   135: return
          //   136: aload 4
          //   138: astore 7
          //   140: ldc 71
          //   142: ldc 81
          //   144: iconst_1
          //   145: anewarray 4	java/lang/Object
          //   148: dup
          //   149: iconst_0
          //   150: aload 6
          //   152: ldc 65
          //   154: invokevirtual 85	org/json/JSONObject:getJSONArray	(Ljava/lang/String;)Lorg/json/JSONArray;
          //   157: invokevirtual 91	org/json/JSONArray:toString	()Ljava/lang/String;
          //   160: aastore
          //   161: invokestatic 94	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
          //   164: aload 5
          //   166: astore 6
          //   168: aload 4
          //   170: astore 5
          //   172: aload_2
          //   173: astore 4
          //   175: aload 6
          //   177: ifnull +29 -> 206
          //   180: aload 5
          //   182: ifnull +24 -> 206
          //   185: ldc 71
          //   187: ldc 96
          //   189: iconst_2
          //   190: anewarray 4	java/lang/Object
          //   193: dup
          //   194: iconst_0
          //   195: aload 6
          //   197: aastore
          //   198: dup
          //   199: iconst_1
          //   200: aload 5
          //   202: aastore
          //   203: invokestatic 98	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
          //   206: aload_0
          //   207: getfield 14	com/tencent/mm/plugin/exdevice/model/g$4:kzp	Lcom/tencent/mm/plugin/exdevice/model/g;
          //   210: getfield 102	com/tencent/mm/plugin/exdevice/model/g:kza	Ljava/util/List;
          //   213: invokeinterface 108 1 0
          //   218: istore_3
          //   219: iconst_0
          //   220: istore_1
          //   221: iload_1
          //   222: iload_3
          //   223: if_icmpge +206 -> 429
          //   226: aload_0
          //   227: getfield 14	com/tencent/mm/plugin/exdevice/model/g$4:kzp	Lcom/tencent/mm/plugin/exdevice/model/g;
          //   230: getfield 102	com/tencent/mm/plugin/exdevice/model/g:kza	Ljava/util/List;
          //   233: iload_1
          //   234: invokeinterface 112 2 0
          //   239: checkcast 114	com/tencent/mm/plugin/exdevice/h/b
          //   242: getfield 118	com/tencent/mm/plugin/exdevice/h/b:field_deviceID	Ljava/lang/String;
          //   245: aload 5
          //   247: invokevirtual 122	java/lang/String:equals	(Ljava/lang/Object;)Z
          //   250: ifeq +139 -> 389
          //   253: aload_0
          //   254: getfield 14	com/tencent/mm/plugin/exdevice/model/g$4:kzp	Lcom/tencent/mm/plugin/exdevice/model/g;
          //   257: getfield 102	com/tencent/mm/plugin/exdevice/model/g:kza	Ljava/util/List;
          //   260: iload_1
          //   261: invokeinterface 112 2 0
          //   266: checkcast 114	com/tencent/mm/plugin/exdevice/h/b
          //   269: getfield 125	com/tencent/mm/plugin/exdevice/h/b:field_deviceType	Ljava/lang/String;
          //   272: aload 6
          //   274: invokevirtual 122	java/lang/String:equals	(Ljava/lang/Object;)Z
          //   277: ifeq +112 -> 389
          //   280: aload_0
          //   281: getfield 14	com/tencent/mm/plugin/exdevice/model/g$4:kzp	Lcom/tencent/mm/plugin/exdevice/model/g;
          //   284: getfield 102	com/tencent/mm/plugin/exdevice/model/g:kza	Ljava/util/List;
          //   287: iload_1
          //   288: invokeinterface 112 2 0
          //   293: checkcast 114	com/tencent/mm/plugin/exdevice/h/b
          //   296: getfield 130	com/tencent/mm/g/b/bp:fsL	Ljava/lang/String;
          //   299: ldc -124
          //   301: invokevirtual 136	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
          //   304: ifeq +85 -> 389
          //   307: aload_0
          //   308: getfield 14	com/tencent/mm/plugin/exdevice/model/g$4:kzp	Lcom/tencent/mm/plugin/exdevice/model/g;
          //   311: getfield 139	com/tencent/mm/plugin/exdevice/model/g:kzb	Ljava/util/List;
          //   314: aload_0
          //   315: getfield 14	com/tencent/mm/plugin/exdevice/model/g$4:kzp	Lcom/tencent/mm/plugin/exdevice/model/g;
          //   318: getfield 102	com/tencent/mm/plugin/exdevice/model/g:kza	Ljava/util/List;
          //   321: iload_1
          //   322: invokeinterface 112 2 0
          //   327: invokeinterface 141 2 0
          //   332: ifne +57 -> 389
          //   335: aload_0
          //   336: getfield 14	com/tencent/mm/plugin/exdevice/model/g$4:kzp	Lcom/tencent/mm/plugin/exdevice/model/g;
          //   339: getfield 145	com/tencent/mm/plugin/exdevice/model/g:kzc	Ljava/util/HashMap;
          //   342: aload 5
          //   344: aload 4
          //   346: invokevirtual 146	org/json/JSONObject:toString	()Ljava/lang/String;
          //   349: invokevirtual 152	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
          //   352: pop
          //   353: aload_0
          //   354: getfield 14	com/tencent/mm/plugin/exdevice/model/g$4:kzp	Lcom/tencent/mm/plugin/exdevice/model/g;
          //   357: getfield 139	com/tencent/mm/plugin/exdevice/model/g:kzb	Ljava/util/List;
          //   360: aload_0
          //   361: getfield 14	com/tencent/mm/plugin/exdevice/model/g$4:kzp	Lcom/tencent/mm/plugin/exdevice/model/g;
          //   364: getfield 102	com/tencent/mm/plugin/exdevice/model/g:kza	Ljava/util/List;
          //   367: iload_1
          //   368: invokeinterface 112 2 0
          //   373: invokeinterface 155 2 0
          //   378: pop
          //   379: aload_0
          //   380: getfield 14	com/tencent/mm/plugin/exdevice/model/g$4:kzp	Lcom/tencent/mm/plugin/exdevice/model/g;
          //   383: getfield 139	com/tencent/mm/plugin/exdevice/model/g:kzb	Ljava/util/List;
          //   386: invokestatic 159	com/tencent/mm/plugin/exdevice/model/g:au	(Ljava/util/List;)V
          //   389: iload_1
          //   390: iconst_1
          //   391: iadd
          //   392: istore_1
          //   393: goto -172 -> 221
          //   396: astore 6
          //   398: aconst_null
          //   399: astore 4
          //   401: aconst_null
          //   402: astore_2
          //   403: ldc 71
          //   405: ldc -95
          //   407: iconst_1
          //   408: anewarray 4	java/lang/Object
          //   411: dup
          //   412: iconst_0
          //   413: aload 6
          //   415: aastore
          //   416: invokestatic 164	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
          //   419: aload 7
          //   421: astore 5
          //   423: aload_2
          //   424: astore 6
          //   426: goto -251 -> 175
          //   429: ldc2_w 35
          //   432: ldc 37
          //   434: invokestatic 29	com/tencent/gmtrace/GMTrace:o	(JI)V
          //   437: return
          //   438: astore 6
          //   440: aconst_null
          //   441: astore 5
          //   443: aload_2
          //   444: astore 4
          //   446: aload 5
          //   448: astore_2
          //   449: goto -46 -> 403
          //   452: astore 6
          //   454: aload_2
          //   455: astore 4
          //   457: aload 5
          //   459: astore_2
          //   460: goto -57 -> 403
          // Local variable table:
          //   start	length	slot	name	signature
          //   0	463	0	this	4
          //   0	463	1	paramAnonymousInt	int
          //   0	463	2	paramAnonymousVarArgs	Object[]
          //   218	6	3	i	int
          //   1	455	4	localObject1	Object
          //   88	370	5	localObject2	Object
          //   72	201	6	localObject3	Object
          //   396	18	6	localException1	Exception
          //   424	1	6	arrayOfObject	Object[]
          //   438	1	6	localException2	Exception
          //   452	1	6	localException3	Exception
          //   4	416	7	localObject4	Object
          // Exception table:
          //   from	to	target	type
          //   57	82	396	java/lang/Exception
          //   82	90	438	java/lang/Exception
          //   94	102	452	java/lang/Exception
          //   106	116	452	java/lang/Exception
          //   120	127	452	java/lang/Exception
          //   140	164	452	java/lang/Exception
        }
      };
      this.kzg = new j.a()
      {
        public final void f(int paramAnonymousInt, Object... paramAnonymousVarArgs)
        {
          GMTrace.i(10976996884480L, 81785);
          if ((paramAnonymousInt != 12) || (paramAnonymousVarArgs == null) || (paramAnonymousVarArgs.length < 2) || (!(paramAnonymousVarArgs[0] instanceof Integer)) || (!(paramAnonymousVarArgs[1] instanceof byte[])))
          {
            GMTrace.o(10976996884480L, 81785);
            return;
          }
          paramAnonymousInt = ((Integer)paramAnonymousVarArgs[0]).intValue();
          Object localObject = (byte[])paramAnonymousVarArgs[1];
          if (paramAnonymousInt > 0)
          {
            paramAnonymousVarArgs = (String)g.this.kzo.get(Integer.valueOf(paramAnonymousInt));
            if (paramAnonymousVarArgs != null) {
              try
              {
                localObject = new String((byte[])localObject);
                w.d("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", "receive response json %s", new Object[] { localObject });
                JSONObject localJSONObject = new JSONObject((String)localObject);
                if ((!localJSONObject.isNull("errcode")) && (localJSONObject.getInt("errcode") != 0))
                {
                  g.bW(paramAnonymousVarArgs, g.this.kyT);
                  w.e("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", "send msg failed data %s", new Object[] { localObject });
                  GMTrace.o(10976996884480L, 81785);
                  return;
                }
                g.bW(paramAnonymousVarArgs, g.this.kyS);
                w.d("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", "send data success!");
                GMTrace.o(10976996884480L, 81785);
                return;
              }
              catch (JSONException paramAnonymousVarArgs)
              {
                w.e("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", "JSON decode mUseWCLanDeviceServiceCmdId failed %s", new Object[] { paramAnonymousVarArgs });
                GMTrace.o(10976996884480L, 81785);
                return;
              }
            }
          }
          w.d("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", "receive cmdId =" + paramAnonymousInt);
          GMTrace.o(10976996884480L, 81785);
        }
      };
      this.kzh = new j.a()
      {
        public final void f(int paramAnonymousInt, Object... paramAnonymousVarArgs)
        {
          GMTrace.i(10985184165888L, 81846);
          if ((paramAnonymousInt != 13) || (paramAnonymousVarArgs == null) || (paramAnonymousVarArgs.length < 2) || (!(paramAnonymousVarArgs[0] instanceof String)) || (!(paramAnonymousVarArgs[1] instanceof Integer)))
          {
            GMTrace.o(10985184165888L, 81846);
            return;
          }
          Object localObject = (String)paramAnonymousVarArgs[0];
          paramAnonymousInt = ((Integer)paramAnonymousVarArgs[1]).intValue();
          String str = null;
          paramAnonymousVarArgs = str;
          try
          {
            localObject = new JSONObject(new String((String)localObject));
            paramAnonymousVarArgs = str;
            str = ((JSONObject)localObject).getString("deviceId");
            paramAnonymousVarArgs = str;
            ((JSONObject)localObject).getString("deviceType");
            paramAnonymousVarArgs = str;
          }
          catch (Exception localException)
          {
            for (;;)
            {
              w.printErrStackTrace("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", localException, "", new Object[0]);
              w.e("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", "JSON decode failed in device ConnState notify callback");
            }
            g.this.kze.put(paramAnonymousVarArgs, Boolean.valueOf(false));
            w.e("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", "device not connect stateCode = " + paramAnonymousInt);
            GMTrace.o(10985184165888L, 81846);
            return;
          }
          switch (paramAnonymousInt)
          {
          }
          for (;;)
          {
            GMTrace.o(10985184165888L, 81846);
            return;
            g.this.kze.put(paramAnonymousVarArgs, Boolean.valueOf(true));
            w.i("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", "device connect");
          }
        }
      };
      at.wS().a(1717, this);
      j.atI().a(14, this.kzf);
      j.atI().a(12, this.kzg);
      j.atI().a(13, this.kzh);
      j.atI().a(15, this.kzi);
      w.d("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", "initWCLanDeviceLib...");
      Java2CExDevice.initWCLanDeviceLib();
    }
    GMTrace.o(10955924701184L, 81628);
  }
  
  public static void au(List<com.tencent.mm.plugin.exdevice.h.b> paramList)
  {
    GMTrace.i(16061701292032L, 119669);
    ArrayList localArrayList = new ArrayList();
    int j = paramList.size();
    int i = 0;
    while (i < j)
    {
      HashMap localHashMap = new HashMap();
      localHashMap.put("deviceType", ((com.tencent.mm.plugin.exdevice.h.b)paramList.get(i)).field_deviceType);
      localHashMap.put("deviceID", ((com.tencent.mm.plugin.exdevice.h.b)paramList.get(i)).field_deviceID);
      localHashMap.put("displayName", c((com.tencent.mm.plugin.exdevice.h.b)paramList.get(i)));
      localHashMap.put("iconUrl", ((com.tencent.mm.plugin.exdevice.h.b)paramList.get(i)).iconUrl);
      localHashMap.put("ability", ((com.tencent.mm.plugin.exdevice.h.b)paramList.get(i)).fsL);
      localHashMap.put("abilityInf", ((com.tencent.mm.plugin.exdevice.h.b)paramList.get(i)).fsM);
      localArrayList.add(localHashMap);
      i += 1;
    }
    paramList = new dx();
    paramList.eFD.eEP = localArrayList;
    a.vgX.m(paramList);
    GMTrace.o(16061701292032L, 119669);
  }
  
  private String bA(long paramLong)
  {
    GMTrace.i(10956998443008L, 81636);
    String str = "";
    at.AR();
    Object localObject1 = com.tencent.mm.y.c.yM().cM(paramLong);
    if (((ce)localObject1).field_msgId == 0L)
    {
      GMTrace.o(10956998443008L, 81636);
      return "";
    }
    int i = ((ce)localObject1).field_type;
    Object localObject2 = ((ce)localObject1).field_content;
    if (((au)localObject1).aCp())
    {
      localObject2 = f.a.eS((String)localObject2);
      if ((localObject2 != null) && ((((f.a)localObject2).type == 6) || (((f.a)localObject2).type == 2)))
      {
        localObject1 = an.afP().Op(((f.a)localObject2).eAE);
        if (localObject1 != null) {
          localObject1 = ((com.tencent.mm.pluginsdk.model.app.b)localObject1).field_fileFullPath;
        }
      }
    }
    for (;;)
    {
      GMTrace.o(10956998443008L, 81636);
      return (String)localObject1;
      w.e("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", "getFilePath attInfo is null");
      localObject1 = str;
      continue;
      localObject1 = str;
      if (localObject2 != null) {
        if (((f.a)localObject2).type != 3)
        {
          localObject1 = str;
          if (((f.a)localObject2).type != 5) {}
        }
        else
        {
          this.kyN = true;
          localObject1 = str;
          continue;
          if (i == 3)
          {
            localObject2 = com.tencent.mm.ao.n.IZ().n((au)localObject1);
            localObject1 = str;
            if (localObject2 != null)
            {
              str = com.tencent.mm.ao.n.IZ().ke(((d)localObject2).gGS);
              localObject1 = str;
              if (bg.nm(str)) {
                localObject1 = com.tencent.mm.ao.n.IZ().ke(((d)localObject2).gGU);
              }
            }
          }
          else if (i == 62)
          {
            o.Nh();
            localObject1 = s.mk(((ce)localObject1).field_imgPath);
          }
          else
          {
            localObject1 = str;
            if (i == 48)
            {
              this.kyN = true;
              localObject1 = str;
            }
          }
        }
      }
    }
  }
  
  public static void bW(String paramString1, String paramString2)
  {
    GMTrace.i(10957132660736L, 81637);
    eb localeb = new eb();
    localeb.eFO.eFQ = paramString2;
    localeb.eFO.esG = paramString1;
    a.vgX.m(localeb);
    GMTrace.o(10957132660736L, 81637);
  }
  
  public static Boolean bw(long paramLong)
  {
    boolean bool2 = false;
    GMTrace.i(10956058918912L, 81629);
    at.AR();
    Object localObject = com.tencent.mm.y.c.yM().cM(paramLong);
    if (((ce)localObject).field_msgId == 0L)
    {
      GMTrace.o(10956058918912L, 81629);
      return Boolean.valueOf(false);
    }
    String str = ((ce)localObject).field_content;
    boolean bool1 = bool2;
    if (((ce)localObject).field_type == 49)
    {
      localObject = f.a.eS(str);
      bool1 = bool2;
      if (localObject != null)
      {
        bool1 = bool2;
        if (((f.a)localObject).type == 6) {
          bool1 = true;
        }
      }
    }
    GMTrace.o(10956058918912L, 81629);
    return Boolean.valueOf(bool1);
  }
  
  public static Boolean bx(long paramLong)
  {
    boolean bool = false;
    GMTrace.i(10956193136640L, 81630);
    at.AR();
    au localau = com.tencent.mm.y.c.yM().cM(paramLong);
    if (localau.field_msgId == 0L)
    {
      GMTrace.o(10956193136640L, 81630);
      return Boolean.valueOf(false);
    }
    if (localau.field_type == 3) {
      bool = true;
    }
    GMTrace.o(10956193136640L, 81630);
    return Boolean.valueOf(bool);
  }
  
  public static Boolean by(long paramLong)
  {
    boolean bool = false;
    GMTrace.i(10956327354368L, 81631);
    at.AR();
    au localau = com.tencent.mm.y.c.yM().cM(paramLong);
    if (localau.field_msgId == 0L)
    {
      GMTrace.o(10956327354368L, 81631);
      return Boolean.valueOf(false);
    }
    if (localau.bTK()) {
      bool = true;
    }
    GMTrace.o(10956327354368L, 81631);
    return Boolean.valueOf(bool);
  }
  
  public static Boolean bz(long paramLong)
  {
    boolean bool = false;
    GMTrace.i(10956461572096L, 81632);
    at.AR();
    au localau = com.tencent.mm.y.c.yM().cM(paramLong);
    if (localau.field_msgId == 0L)
    {
      GMTrace.o(10956461572096L, 81632);
      return Boolean.valueOf(false);
    }
    if (localau.field_type == 62) {
      bool = true;
    }
    GMTrace.o(10956461572096L, 81632);
    return Boolean.valueOf(bool);
  }
  
  static String c(com.tencent.mm.plugin.exdevice.h.b paramb)
  {
    GMTrace.i(10957401096192L, 81639);
    if (paramb == null)
    {
      GMTrace.o(10957401096192L, 81639);
      return "";
    }
    String str = null;
    if (!bg.nm(paramb.fsF)) {
      str = paramb.fsF;
    }
    for (;;)
    {
      paramb = bg.nl(str);
      GMTrace.o(10957401096192L, 81639);
      return paramb;
      if (!bg.nm(paramb.fsG)) {
        str = paramb.fsG;
      } else if (paramb.field_mac != 0L) {
        str = com.tencent.mm.plugin.exdevice.j.b.bS(paramb.field_mac);
      } else if (!bg.nm(paramb.field_deviceID)) {
        str = paramb.field_deviceID;
      }
    }
  }
  
  /* Error */
  static String s(String paramString, long paramLong)
  {
    // Byte code:
    //   0: ldc2_w 493
    //   3: ldc_w 495
    //   6: invokestatic 84	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: aload_0
    //   10: ifnonnull +14 -> 24
    //   13: ldc2_w 493
    //   16: ldc_w 495
    //   19: invokestatic 247	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   22: aconst_null
    //   23: areturn
    //   24: aload_0
    //   25: iconst_0
    //   26: aload_0
    //   27: ldc_w 497
    //   30: invokevirtual 501	java/lang/String:lastIndexOf	(Ljava/lang/String;)I
    //   33: invokevirtual 505	java/lang/String:substring	(II)Ljava/lang/String;
    //   36: astore_3
    //   37: new 507	java/lang/StringBuilder
    //   40: dup
    //   41: ldc_w 509
    //   44: invokespecial 512	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   47: aload_0
    //   48: invokevirtual 515	java/lang/String:hashCode	()I
    //   51: invokevirtual 519	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   54: invokevirtual 523	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   57: astore 4
    //   59: new 507	java/lang/StringBuilder
    //   62: dup
    //   63: invokespecial 524	java/lang/StringBuilder:<init>	()V
    //   66: aload_3
    //   67: invokevirtual 527	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   70: ldc_w 497
    //   73: invokevirtual 527	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   76: aload 4
    //   78: invokevirtual 527	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   81: invokevirtual 523	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   84: astore 6
    //   86: new 529	com/tencent/mm/modelsfs/c
    //   89: dup
    //   90: new 531	java/io/File
    //   93: dup
    //   94: aload 6
    //   96: invokespecial 532	java/io/File:<init>	(Ljava/lang/String;)V
    //   99: lload_1
    //   100: invokespecial 535	com/tencent/mm/modelsfs/c:<init>	(Ljava/io/File;J)V
    //   103: astore_3
    //   104: aload_0
    //   105: invokestatic 541	com/tencent/mm/modelsfs/FileOp:openRead	(Ljava/lang/String;)Ljava/io/InputStream;
    //   108: astore_0
    //   109: aload_0
    //   110: astore 5
    //   112: aload_3
    //   113: astore 4
    //   115: sipush 1024
    //   118: newarray <illegal type>
    //   120: astore 7
    //   122: aload_0
    //   123: astore 5
    //   125: aload_3
    //   126: astore 4
    //   128: aload_0
    //   129: aload 7
    //   131: invokevirtual 547	java/io/InputStream:read	([B)I
    //   134: iconst_m1
    //   135: if_icmpeq +77 -> 212
    //   138: aload_0
    //   139: astore 5
    //   141: aload_3
    //   142: astore 4
    //   144: aload_3
    //   145: aload 7
    //   147: invokevirtual 553	java/io/OutputStream:write	([B)V
    //   150: goto -28 -> 122
    //   153: astore 6
    //   155: aload_0
    //   156: astore 5
    //   158: aload_3
    //   159: astore 4
    //   161: ldc -94
    //   163: ldc_w 555
    //   166: iconst_1
    //   167: anewarray 4	java/lang/Object
    //   170: dup
    //   171: iconst_0
    //   172: aload 6
    //   174: invokevirtual 558	java/io/IOException:getMessage	()Ljava/lang/String;
    //   177: aastore
    //   178: invokestatic 560	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   181: aload_3
    //   182: ifnull +11 -> 193
    //   185: aload_3
    //   186: invokevirtual 563	java/io/OutputStream:flush	()V
    //   189: aload_3
    //   190: invokevirtual 566	java/io/OutputStream:close	()V
    //   193: aload_0
    //   194: ifnull +7 -> 201
    //   197: aload_0
    //   198: invokevirtual 567	java/io/InputStream:close	()V
    //   201: ldc2_w 493
    //   204: ldc_w 495
    //   207: invokestatic 247	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   210: aconst_null
    //   211: areturn
    //   212: aload_3
    //   213: invokevirtual 563	java/io/OutputStream:flush	()V
    //   216: aload_3
    //   217: invokevirtual 566	java/io/OutputStream:close	()V
    //   220: aload_0
    //   221: ifnull +7 -> 228
    //   224: aload_0
    //   225: invokevirtual 567	java/io/InputStream:close	()V
    //   228: ldc2_w 493
    //   231: ldc_w 495
    //   234: invokestatic 247	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   237: aload 6
    //   239: areturn
    //   240: astore_0
    //   241: ldc -94
    //   243: aload_0
    //   244: ldc 113
    //   246: iconst_0
    //   247: anewarray 4	java/lang/Object
    //   250: invokestatic 571	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   253: ldc2_w 493
    //   256: ldc_w 495
    //   259: invokestatic 247	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   262: aconst_null
    //   263: areturn
    //   264: astore_0
    //   265: ldc -94
    //   267: aload_0
    //   268: ldc 113
    //   270: iconst_0
    //   271: anewarray 4	java/lang/Object
    //   274: invokestatic 571	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   277: ldc2_w 493
    //   280: ldc_w 495
    //   283: invokestatic 247	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   286: aconst_null
    //   287: areturn
    //   288: astore_0
    //   289: ldc -94
    //   291: aload_0
    //   292: ldc 113
    //   294: iconst_0
    //   295: anewarray 4	java/lang/Object
    //   298: invokestatic 571	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   301: ldc2_w 493
    //   304: ldc_w 495
    //   307: invokestatic 247	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   310: aconst_null
    //   311: areturn
    //   312: astore_0
    //   313: ldc -94
    //   315: aload_0
    //   316: ldc 113
    //   318: iconst_0
    //   319: anewarray 4	java/lang/Object
    //   322: invokestatic 571	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   325: ldc2_w 493
    //   328: ldc_w 495
    //   331: invokestatic 247	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   334: aconst_null
    //   335: areturn
    //   336: astore_0
    //   337: aconst_null
    //   338: astore 5
    //   340: aconst_null
    //   341: astore_3
    //   342: aload_3
    //   343: ifnull +11 -> 354
    //   346: aload_3
    //   347: invokevirtual 563	java/io/OutputStream:flush	()V
    //   350: aload_3
    //   351: invokevirtual 566	java/io/OutputStream:close	()V
    //   354: aload 5
    //   356: ifnull +8 -> 364
    //   359: aload 5
    //   361: invokevirtual 567	java/io/InputStream:close	()V
    //   364: aload_0
    //   365: athrow
    //   366: astore_0
    //   367: ldc -94
    //   369: aload_0
    //   370: ldc 113
    //   372: iconst_0
    //   373: anewarray 4	java/lang/Object
    //   376: invokestatic 571	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   379: ldc2_w 493
    //   382: ldc_w 495
    //   385: invokestatic 247	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   388: aconst_null
    //   389: areturn
    //   390: astore_0
    //   391: ldc -94
    //   393: aload_0
    //   394: ldc 113
    //   396: iconst_0
    //   397: anewarray 4	java/lang/Object
    //   400: invokestatic 571	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   403: ldc2_w 493
    //   406: ldc_w 495
    //   409: invokestatic 247	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   412: aconst_null
    //   413: areturn
    //   414: astore_0
    //   415: aconst_null
    //   416: astore 5
    //   418: goto -76 -> 342
    //   421: astore_0
    //   422: aload 4
    //   424: astore_3
    //   425: goto -83 -> 342
    //   428: astore 6
    //   430: aconst_null
    //   431: astore_0
    //   432: aconst_null
    //   433: astore_3
    //   434: goto -279 -> 155
    //   437: astore 6
    //   439: aconst_null
    //   440: astore_0
    //   441: goto -286 -> 155
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	444	0	paramString	String
    //   0	444	1	paramLong	long
    //   36	398	3	localObject1	Object
    //   57	366	4	localObject2	Object
    //   110	307	5	str1	String
    //   84	11	6	str2	String
    //   153	85	6	localIOException1	java.io.IOException
    //   428	1	6	localIOException2	java.io.IOException
    //   437	1	6	localIOException3	java.io.IOException
    //   120	26	7	arrayOfByte	byte[]
    // Exception table:
    //   from	to	target	type
    //   115	122	153	java/io/IOException
    //   128	138	153	java/io/IOException
    //   144	150	153	java/io/IOException
    //   212	220	240	java/io/IOException
    //   224	228	264	java/io/IOException
    //   185	193	288	java/io/IOException
    //   197	201	312	java/io/IOException
    //   86	104	336	finally
    //   346	354	366	java/io/IOException
    //   359	364	390	java/io/IOException
    //   104	109	414	finally
    //   115	122	421	finally
    //   128	138	421	finally
    //   144	150	421	finally
    //   161	181	421	finally
    //   86	104	428	java/io/IOException
    //   104	109	437	java/io/IOException
  }
  
  /* Error */
  public static byte[] wF(String paramString)
  {
    // Byte code:
    //   0: ldc2_w 576
    //   3: ldc_w 578
    //   6: invokestatic 84	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: ldc -94
    //   11: ldc_w 580
    //   14: iconst_1
    //   15: anewarray 4	java/lang/Object
    //   18: dup
    //   19: iconst_0
    //   20: aload_0
    //   21: aastore
    //   22: invokestatic 176	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   25: aload_0
    //   26: aconst_null
    //   27: invokestatic 585	com/tencent/mm/network/b:a	(Ljava/lang/String;Lcom/tencent/mm/network/b$b;)Lcom/tencent/mm/network/u;
    //   30: astore_2
    //   31: aload_2
    //   32: ldc_w 587
    //   35: invokevirtual 592	com/tencent/mm/network/u:setRequestMethod	(Ljava/lang/String;)V
    //   38: aload_2
    //   39: sipush 25000
    //   42: invokevirtual 596	com/tencent/mm/network/u:setConnectTimeout	(I)V
    //   45: aload_2
    //   46: sipush 25000
    //   49: invokevirtual 599	com/tencent/mm/network/u:setReadTimeout	(I)V
    //   52: aload_2
    //   53: invokevirtual 603	com/tencent/mm/network/u:getInputStream	()Ljava/io/InputStream;
    //   56: astore_3
    //   57: aload_2
    //   58: invokevirtual 606	com/tencent/mm/network/u:getResponseCode	()I
    //   61: sipush 200
    //   64: if_icmpne +250 -> 314
    //   67: new 608	java/io/ByteArrayOutputStream
    //   70: dup
    //   71: invokespecial 609	java/io/ByteArrayOutputStream:<init>	()V
    //   74: astore_0
    //   75: aload_2
    //   76: astore 7
    //   78: aload_3
    //   79: astore 6
    //   81: aload_0
    //   82: astore 5
    //   84: sipush 1024
    //   87: newarray <illegal type>
    //   89: astore 4
    //   91: aload_2
    //   92: astore 7
    //   94: aload_3
    //   95: astore 6
    //   97: aload_0
    //   98: astore 5
    //   100: aload_3
    //   101: aload 4
    //   103: invokevirtual 547	java/io/InputStream:read	([B)I
    //   106: istore_1
    //   107: iload_1
    //   108: iconst_m1
    //   109: if_icmpeq +85 -> 194
    //   112: aload_2
    //   113: astore 7
    //   115: aload_3
    //   116: astore 6
    //   118: aload_0
    //   119: astore 5
    //   121: aload_0
    //   122: aload 4
    //   124: iconst_0
    //   125: iload_1
    //   126: invokevirtual 612	java/io/ByteArrayOutputStream:write	([BII)V
    //   129: goto -38 -> 91
    //   132: astore 4
    //   134: aload_2
    //   135: astore 7
    //   137: aload_3
    //   138: astore 6
    //   140: aload_0
    //   141: astore 5
    //   143: ldc -94
    //   145: aload 4
    //   147: ldc 113
    //   149: iconst_0
    //   150: anewarray 4	java/lang/Object
    //   153: invokestatic 571	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   156: aload_0
    //   157: ifnull +7 -> 164
    //   160: aload_0
    //   161: invokevirtual 613	java/io/ByteArrayOutputStream:close	()V
    //   164: aload_3
    //   165: ifnull +7 -> 172
    //   168: aload_3
    //   169: invokevirtual 567	java/io/InputStream:close	()V
    //   172: aload_2
    //   173: ifnull +10 -> 183
    //   176: aload_2
    //   177: getfield 617	com/tencent/mm/network/u:hhh	Ljava/net/HttpURLConnection;
    //   180: invokevirtual 622	java/net/HttpURLConnection:disconnect	()V
    //   183: ldc2_w 576
    //   186: ldc_w 578
    //   189: invokestatic 247	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   192: aconst_null
    //   193: areturn
    //   194: aload_2
    //   195: astore 7
    //   197: aload_3
    //   198: astore 6
    //   200: aload_0
    //   201: astore 5
    //   203: aload_0
    //   204: invokevirtual 613	java/io/ByteArrayOutputStream:close	()V
    //   207: aload_2
    //   208: astore 7
    //   210: aload_3
    //   211: astore 6
    //   213: aload_0
    //   214: astore 5
    //   216: aload_3
    //   217: invokevirtual 567	java/io/InputStream:close	()V
    //   220: aload_2
    //   221: astore 7
    //   223: aload_3
    //   224: astore 6
    //   226: aload_0
    //   227: astore 5
    //   229: aload_2
    //   230: getfield 617	com/tencent/mm/network/u:hhh	Ljava/net/HttpURLConnection;
    //   233: invokevirtual 622	java/net/HttpURLConnection:disconnect	()V
    //   236: aload_2
    //   237: astore 7
    //   239: aload_3
    //   240: astore 6
    //   242: aload_0
    //   243: astore 5
    //   245: aload_0
    //   246: invokevirtual 626	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   249: astore 4
    //   251: aload_0
    //   252: invokevirtual 613	java/io/ByteArrayOutputStream:close	()V
    //   255: aload_3
    //   256: ifnull +7 -> 263
    //   259: aload_3
    //   260: invokevirtual 567	java/io/InputStream:close	()V
    //   263: aload_2
    //   264: getfield 617	com/tencent/mm/network/u:hhh	Ljava/net/HttpURLConnection;
    //   267: invokevirtual 622	java/net/HttpURLConnection:disconnect	()V
    //   270: ldc2_w 576
    //   273: ldc_w 578
    //   276: invokestatic 247	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   279: aload 4
    //   281: areturn
    //   282: astore_0
    //   283: ldc -94
    //   285: aload_0
    //   286: ldc 113
    //   288: iconst_0
    //   289: anewarray 4	java/lang/Object
    //   292: invokestatic 571	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   295: goto -40 -> 255
    //   298: astore_0
    //   299: ldc -94
    //   301: aload_0
    //   302: ldc 113
    //   304: iconst_0
    //   305: anewarray 4	java/lang/Object
    //   308: invokestatic 571	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   311: goto -48 -> 263
    //   314: aload_3
    //   315: ifnull +7 -> 322
    //   318: aload_3
    //   319: invokevirtual 567	java/io/InputStream:close	()V
    //   322: aload_2
    //   323: getfield 617	com/tencent/mm/network/u:hhh	Ljava/net/HttpURLConnection;
    //   326: invokevirtual 622	java/net/HttpURLConnection:disconnect	()V
    //   329: goto -146 -> 183
    //   332: astore_0
    //   333: ldc -94
    //   335: aload_0
    //   336: ldc 113
    //   338: iconst_0
    //   339: anewarray 4	java/lang/Object
    //   342: invokestatic 571	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   345: goto -23 -> 322
    //   348: astore_0
    //   349: ldc -94
    //   351: aload_0
    //   352: ldc 113
    //   354: iconst_0
    //   355: anewarray 4	java/lang/Object
    //   358: invokestatic 571	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   361: goto -197 -> 164
    //   364: astore_0
    //   365: ldc -94
    //   367: aload_0
    //   368: ldc 113
    //   370: iconst_0
    //   371: anewarray 4	java/lang/Object
    //   374: invokestatic 571	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   377: goto -205 -> 172
    //   380: astore_0
    //   381: aconst_null
    //   382: astore 7
    //   384: aconst_null
    //   385: astore_3
    //   386: aconst_null
    //   387: astore_2
    //   388: aload_2
    //   389: ifnull +7 -> 396
    //   392: aload_2
    //   393: invokevirtual 613	java/io/ByteArrayOutputStream:close	()V
    //   396: aload_3
    //   397: ifnull +7 -> 404
    //   400: aload_3
    //   401: invokevirtual 567	java/io/InputStream:close	()V
    //   404: aload 7
    //   406: ifnull +11 -> 417
    //   409: aload 7
    //   411: getfield 617	com/tencent/mm/network/u:hhh	Ljava/net/HttpURLConnection;
    //   414: invokevirtual 622	java/net/HttpURLConnection:disconnect	()V
    //   417: aload_0
    //   418: athrow
    //   419: astore_2
    //   420: ldc -94
    //   422: aload_2
    //   423: ldc 113
    //   425: iconst_0
    //   426: anewarray 4	java/lang/Object
    //   429: invokestatic 571	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   432: goto -36 -> 396
    //   435: astore_2
    //   436: ldc -94
    //   438: aload_2
    //   439: ldc 113
    //   441: iconst_0
    //   442: anewarray 4	java/lang/Object
    //   445: invokestatic 571	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   448: goto -44 -> 404
    //   451: astore_0
    //   452: aconst_null
    //   453: astore_3
    //   454: aconst_null
    //   455: astore 4
    //   457: aload_2
    //   458: astore 7
    //   460: aload 4
    //   462: astore_2
    //   463: goto -75 -> 388
    //   466: astore_0
    //   467: aconst_null
    //   468: astore 4
    //   470: aload_2
    //   471: astore 7
    //   473: aload 4
    //   475: astore_2
    //   476: goto -88 -> 388
    //   479: astore_0
    //   480: aload 6
    //   482: astore_3
    //   483: aload 5
    //   485: astore_2
    //   486: goto -98 -> 388
    //   489: astore 4
    //   491: aconst_null
    //   492: astore_2
    //   493: aconst_null
    //   494: astore_3
    //   495: aconst_null
    //   496: astore_0
    //   497: goto -363 -> 134
    //   500: astore 4
    //   502: aconst_null
    //   503: astore_3
    //   504: aconst_null
    //   505: astore_0
    //   506: goto -372 -> 134
    //   509: astore 4
    //   511: aconst_null
    //   512: astore_0
    //   513: goto -379 -> 134
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	516	0	paramString	String
    //   106	20	1	i	int
    //   30	363	2	localu	com.tencent.mm.network.u
    //   419	4	2	localIOException1	java.io.IOException
    //   435	23	2	localIOException2	java.io.IOException
    //   462	31	2	localObject1	Object
    //   56	448	3	localObject2	Object
    //   89	34	4	arrayOfByte1	byte[]
    //   132	14	4	localException1	Exception
    //   249	225	4	arrayOfByte2	byte[]
    //   489	1	4	localException2	Exception
    //   500	1	4	localException3	Exception
    //   509	1	4	localException4	Exception
    //   82	402	5	str	String
    //   79	402	6	localObject3	Object
    //   76	396	7	localObject4	Object
    // Exception table:
    //   from	to	target	type
    //   84	91	132	java/lang/Exception
    //   100	107	132	java/lang/Exception
    //   121	129	132	java/lang/Exception
    //   203	207	132	java/lang/Exception
    //   216	220	132	java/lang/Exception
    //   229	236	132	java/lang/Exception
    //   245	251	132	java/lang/Exception
    //   251	255	282	java/io/IOException
    //   259	263	298	java/io/IOException
    //   318	322	332	java/io/IOException
    //   160	164	348	java/io/IOException
    //   168	172	364	java/io/IOException
    //   25	31	380	finally
    //   392	396	419	java/io/IOException
    //   400	404	435	java/io/IOException
    //   31	57	451	finally
    //   57	75	466	finally
    //   84	91	479	finally
    //   100	107	479	finally
    //   121	129	479	finally
    //   143	156	479	finally
    //   203	207	479	finally
    //   216	220	479	finally
    //   229	236	479	finally
    //   245	251	479	finally
    //   25	31	489	java/lang/Exception
    //   31	57	500	java/lang/Exception
    //   57	75	509	java/lang/Exception
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(10957266878464L, 81638);
    w.d("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", "onSceneEnd errType = %d, errCode = %d ,errMsg = %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    if (paramk == null)
    {
      w.e("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", "scene is null.");
      GMTrace.o(10957266878464L, 81638);
      return;
    }
    if ((paramk instanceof n))
    {
      Object localObject = (n)paramk;
      if ((paramInt1 != 0) || (paramInt2 != 0))
      {
        w.e("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", "NetSceneGetAppMsgInfo onSceneEnd, errType(%d) errCode(%d) errMsg(%s).", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
        bW(((n)localObject).esG, this.kyT);
        GMTrace.o(10957266878464L, 81638);
        return;
      }
      if ((((n)localObject).fUa != null) && (((n)localObject).fUa.gtD.gtK != null)) {}
      for (paramString = (bjs)((n)localObject).fUa.gtD.gtK;; paramString = null)
      {
        paramk = paramString.uUF;
        if (1 != ((n)localObject).kzV) {
          break;
        }
        bW(((n)localObject).esG, this.kyS);
        GMTrace.o(10957266878464L, 81638);
        return;
      }
      localObject = ((n)localObject).esG;
      String str = (String)this.kzc.get(localObject);
      bW((String)localObject, this.kyU);
      if ((this.kyO) && (this.kyP != null)) {}
      for (paramString = this.kyQ; (str == null) || (str.length() == 0); paramString = bA(this.fKQ))
      {
        w.e("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", "mDeviceInfo error");
        bW((String)localObject, this.kyT);
        GMTrace.o(10957266878464L, 81638);
        return;
      }
      if (!this.kyM)
      {
        w.i("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", "onItemClick stop scan...");
        Java2CExDevice.stopScanWCLanDevice();
        this.kyM = true;
      }
      if ((!this.kze.containsKey(localObject)) || (!((Boolean)this.kze.get(localObject)).booleanValue()))
      {
        w.i("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", "connectWCLanDevice mDeviceInfo: " + str);
        if (Java2CExDevice.connectWCLanDevice(str.getBytes(), true) != 0)
        {
          bW((String)localObject, this.kyT);
          w.e("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", "connectWCLanDevice error!");
        }
      }
      if (this.kyN)
      {
        paramInt1 = Java2CExDevice.useWCLanDeviceService(str.getBytes(), paramk.getBytes());
        if (paramInt1 != 0)
        {
          this.kzo.put(Integer.valueOf(paramInt1), localObject);
          this.kzd.put(localObject, Integer.valueOf(paramInt1));
          w.i("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", "get useWCLanDeviceService mCallBackCmdId: " + paramInt1);
          GMTrace.o(10957266878464L, 81638);
          return;
        }
        bW((String)localObject, this.kyT);
        w.e("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", "useWCLanDeviceService error!");
        GMTrace.o(10957266878464L, 81638);
        return;
      }
      if ((paramString == null) || (paramString.length() == 0))
      {
        w.e("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", "file path is error");
        bW((String)localObject, this.kyT);
        GMTrace.o(10957266878464L, 81638);
        return;
      }
      paramInt1 = Java2CExDevice.sendFileToWCLanDevice(str.getBytes(), paramk.getBytes(), paramString.getBytes());
      if (paramInt1 != 0)
      {
        this.kzo.put(Integer.valueOf(paramInt1), localObject);
        this.kzd.put(localObject, Integer.valueOf(paramInt1));
        w.d("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", "get sendFileToWCLanDevice mCallBackCmdId =" + paramInt1);
        GMTrace.o(10957266878464L, 81638);
        return;
      }
      bW((String)localObject, this.kyT);
      w.e("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", "sendFileToWCLanDevice error!");
    }
    GMTrace.o(10957266878464L, 81638);
  }
  
  public final boolean a(ahr paramahr, long paramLong)
  {
    GMTrace.i(10956864225280L, 81635);
    int j = -1;
    Object localObject4 = null;
    Object localObject5 = null;
    Object localObject6 = null;
    String str = bA(paramLong);
    Object localObject3 = localObject6;
    Object localObject2 = localObject5;
    Object localObject1 = localObject4;
    int i = j;
    if (str != null)
    {
      localObject3 = localObject6;
      localObject2 = localObject5;
      localObject1 = localObject4;
      i = j;
      if (str.length() > 0)
      {
        localObject1 = new File(str);
        localObject2 = ((File)localObject1).getName();
        i = (int)((File)localObject1).length();
        localObject3 = ((String)localObject2).substring(((String)localObject2).lastIndexOf(".") + 1, ((String)localObject2).length());
        localObject1 = com.tencent.mm.a.g.h((File)localObject1);
        w.i("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", "filePath %s", new Object[] { str });
        w.i("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", "fileSize %s", new Object[] { Integer.valueOf(i) });
        w.i("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", "fileMd5 %s", new Object[] { localObject1 });
      }
    }
    at.AR();
    localObject4 = com.tencent.mm.y.c.yM().cM(paramLong);
    if (((ce)localObject4).field_msgId == 0L)
    {
      w.d("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", "msgInfo or msgInfo.getMsgId() = 0");
      GMTrace.o(10956864225280L, 81635);
      return false;
    }
    switch (((ce)localObject4).field_type)
    {
    }
    for (;;)
    {
      GMTrace.o(10956864225280L, 81635);
      return true;
      localObject3 = f.a.eS(((ce)localObject4).field_content);
      if (localObject3 == null)
      {
        w.e("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", "get content is null");
        GMTrace.o(10956864225280L, 81635);
        return false;
      }
      if (((f.a)localObject3).type == 3)
      {
        localObject1 = new ahu();
        ((ahu)localObject1).eBt = ((f.a)localObject3).title;
        ((ahu)localObject1).uxo = ((f.a)localObject3).description;
        ((ahu)localObject1).lPM = ((f.a)localObject3).url;
        ((ahu)localObject1).uxp = ((f.a)localObject3).giu;
        ((ahu)localObject1).udc = ((f.a)localObject3).giM;
        ((ahu)localObject1).uxq = ((f.a)localObject3).giN;
        ((ahu)localObject1).lRT = ((f.a)localObject3).appName;
        ((ahu)localObject1).uxr = ((f.a)localObject3).giD;
        ((ahu)localObject1).uxs = ((f.a)localObject3).giE;
        ((ahu)localObject1).uxt = ((f.a)localObject3).giK;
        paramahr.uxf = ((ahu)localObject1);
        paramahr.uxe = 1;
      }
      else if (((f.a)localObject3).type == 6)
      {
        localObject2 = new ahq();
        ((ahq)localObject2).uhC = ((f.a)localObject3).giw;
        ((ahq)localObject2).lPi = ((f.a)localObject3).title;
        ((ahq)localObject2).jhV = i;
        ((ahq)localObject2).ugy = ((String)localObject1);
        paramahr.uxi = ((ahq)localObject2);
        paramahr.uxe = 4;
      }
      else if (((f.a)localObject3).type == 5)
      {
        localObject1 = new ahv();
        ((ahv)localObject1).lPM = ((f.a)localObject3).url;
        ((ahv)localObject1).eBt = ((f.a)localObject3).title;
        ((ahv)localObject1).uxo = ((f.a)localObject3).description;
        ((ahv)localObject1).lRT = ((f.a)localObject3).appName;
        paramahr.uxj = ((ahv)localObject1);
        paramahr.uxe = 5;
      }
      else if (((f.a)localObject3).type == 2)
      {
        localObject3 = new ahs();
        ((ahs)localObject3).uhC = "jpg";
        ((ahs)localObject3).lPi = ((String)localObject2);
        ((ahs)localObject3).jhV = i;
        ((ahs)localObject3).ugy = ((String)localObject1);
        paramahr.uxh = ((ahs)localObject3);
        paramahr.uxe = 3;
        continue;
        localObject4 = new ahs();
        ((ahs)localObject4).uhC = ((String)localObject3);
        ((ahs)localObject4).lPi = ((String)localObject2);
        ((ahs)localObject4).jhV = i;
        ((ahs)localObject4).ugy = ((String)localObject1);
        paramahr.uxh = ((ahs)localObject4);
        paramahr.uxe = 3;
        continue;
        at.AR();
        localObject1 = com.tencent.mm.y.c.yM().Co(((ce)localObject4).field_content);
        localObject2 = new aht();
        ((aht)localObject2).tWy = ((float)((au.b)localObject1).mwH);
        ((aht)localObject2).tWz = ((float)((au.b)localObject1).mwI);
        ((aht)localObject2).uxm = ((au.b)localObject1).eMn;
        ((aht)localObject2).lSG = ((au.b)localObject1).label;
        ((aht)localObject2).uxn = ((au.b)localObject1).mzo;
        paramahr.uxg = ((aht)localObject2);
        paramahr.uxe = 2;
        continue;
        localObject4 = new ahw();
        ((ahw)localObject4).uhC = ((String)localObject3);
        ((ahw)localObject4).jhV = i;
        ((ahw)localObject4).ugy = ((String)localObject1);
        ((ahw)localObject4).lPi = ((String)localObject2);
        paramahr.uxk = ((ahw)localObject4);
        paramahr.uxe = 6;
      }
    }
  }
  
  public final void aS(String paramString, int paramInt)
  {
    GMTrace.i(16061835509760L, 119670);
    eb localeb = new eb();
    localeb.eFO.esG = paramString;
    if (paramInt >= 100) {}
    for (localeb.eFO.eFQ = this.kyS;; localeb.eFO.eFQ = this.kyU)
    {
      localeb.eFO.progress = paramInt;
      a.vgX.m(localeb);
      GMTrace.o(16061835509760L, 119670);
      return;
    }
  }
  
  public final biz atG()
  {
    GMTrace.i(10956730007552L, 81634);
    Object localObject = new hq();
    ((hq)localObject).eKU.eEM = this.kyP;
    a.vgX.m((com.tencent.mm.sdk.b.b)localObject);
    localObject = ((hq)localObject).eKV.eKW;
    GMTrace.o(10956730007552L, 81634);
    return (biz)localObject;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\exdevice\model\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */