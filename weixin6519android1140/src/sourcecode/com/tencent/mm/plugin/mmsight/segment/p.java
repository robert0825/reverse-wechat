package com.tencent.mm.plugin.mmsight.segment;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.modelcontrol.VideoTransPara;
import com.tencent.mm.plugin.mmsight.model.CaptureMMProxy;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.w.a;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

@TargetApi(18)
public final class p
  extends a
{
  private int nap;
  private a.a nfF;
  private a.a nfG;
  
  public p()
  {
    GMTrace.i(7431501381632L, 55369);
    GMTrace.o(7431501381632L, 55369);
  }
  
  /* Error */
  private int a(MediaExtractor paramMediaExtractor, int paramInt1, int paramInt2, String paramString)
  {
    // Byte code:
    //   0: ldc2_w 34
    //   3: ldc 36
    //   5: invokestatic 25	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   8: ldc 38
    //   10: ldc 40
    //   12: invokestatic 45	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   15: aconst_null
    //   16: astore 17
    //   18: new 47	com/tencent/mm/plugin/mmsight/segment/h
    //   21: dup
    //   22: invokespecial 48	com/tencent/mm/plugin/mmsight/segment/h:<init>	()V
    //   25: astore 16
    //   27: aload 16
    //   29: aload_0
    //   30: getfield 52	com/tencent/mm/plugin/mmsight/segment/a:ndl	J
    //   33: putfield 55	com/tencent/mm/plugin/mmsight/segment/h:ncM	J
    //   36: aload 16
    //   38: aload_0
    //   39: getfield 58	com/tencent/mm/plugin/mmsight/segment/a:ndm	J
    //   42: putfield 61	com/tencent/mm/plugin/mmsight/segment/h:ncN	J
    //   45: aload_0
    //   46: getfield 65	com/tencent/mm/plugin/mmsight/segment/a:ndp	Lcom/tencent/mm/modelcontrol/VideoTransPara;
    //   49: astore 17
    //   51: ldc 67
    //   53: ldc 69
    //   55: iconst_1
    //   56: anewarray 71	java/lang/Object
    //   59: dup
    //   60: iconst_0
    //   61: aload 17
    //   63: aastore
    //   64: invokestatic 74	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   67: aload 16
    //   69: aload 17
    //   71: putfield 77	com/tencent/mm/plugin/mmsight/segment/h:ndN	Lcom/tencent/mm/modelcontrol/VideoTransPara;
    //   74: aload_0
    //   75: getfield 80	com/tencent/mm/plugin/mmsight/segment/a:ndq	I
    //   78: bipush 90
    //   80: if_icmpeq +13 -> 93
    //   83: aload_0
    //   84: getfield 80	com/tencent/mm/plugin/mmsight/segment/a:ndq	I
    //   87: sipush 270
    //   90: if_icmpne +286 -> 376
    //   93: aload 16
    //   95: aload 17
    //   97: getfield 85	com/tencent/mm/modelcontrol/VideoTransPara:height	I
    //   100: aload 17
    //   102: getfield 88	com/tencent/mm/modelcontrol/VideoTransPara:width	I
    //   105: invokevirtual 92	com/tencent/mm/plugin/mmsight/segment/h:cu	(II)V
    //   108: aload 16
    //   110: aload 4
    //   112: putfield 96	com/tencent/mm/plugin/mmsight/segment/h:ncL	Ljava/lang/String;
    //   115: aload_0
    //   116: getfield 80	com/tencent/mm/plugin/mmsight/segment/a:ndq	I
    //   119: istore 7
    //   121: ldc 67
    //   123: ldc 98
    //   125: iconst_1
    //   126: anewarray 71	java/lang/Object
    //   129: dup
    //   130: iconst_0
    //   131: iload 7
    //   133: invokestatic 104	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   136: aastore
    //   137: invokestatic 74	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   140: aload 16
    //   142: iload 7
    //   144: putfield 107	com/tencent/mm/plugin/mmsight/segment/h:eSp	I
    //   147: ldc 38
    //   149: ldc 109
    //   151: invokestatic 45	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   154: ldc 38
    //   156: ldc 111
    //   158: invokestatic 45	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   161: aload_1
    //   162: aload_0
    //   163: getfield 113	com/tencent/mm/plugin/mmsight/segment/p:nfF	Lcom/tencent/mm/plugin/mmsight/segment/a$a;
    //   166: getfield 118	com/tencent/mm/plugin/mmsight/segment/a$a:index	I
    //   169: invokevirtual 124	android/media/MediaExtractor:selectTrack	(I)V
    //   172: aload_1
    //   173: aload_0
    //   174: getfield 52	com/tencent/mm/plugin/mmsight/segment/a:ndl	J
    //   177: ldc2_w 125
    //   180: lmul
    //   181: iconst_0
    //   182: invokevirtual 129	android/media/MediaExtractor:seekTo	(JI)V
    //   185: aload_0
    //   186: getfield 65	com/tencent/mm/plugin/mmsight/segment/a:ndp	Lcom/tencent/mm/modelcontrol/VideoTransPara;
    //   189: astore 4
    //   191: aload 4
    //   193: getfield 132	com/tencent/mm/modelcontrol/VideoTransPara:duration	I
    //   196: ifle +235 -> 431
    //   199: aload 4
    //   201: getfield 132	com/tencent/mm/modelcontrol/VideoTransPara:duration	I
    //   204: istore 7
    //   206: aload_0
    //   207: iload 7
    //   209: invokestatic 138	com/tencent/mm/plugin/mmsight/segment/MP4MuxerJNI:initDataBuf	(I)I
    //   212: putfield 140	com/tencent/mm/plugin/mmsight/segment/p:nap	I
    //   215: invokestatic 146	com/tencent/mm/sdk/platformtools/bg:Pw	()J
    //   218: lstore 11
    //   220: aload_0
    //   221: getfield 113	com/tencent/mm/plugin/mmsight/segment/p:nfF	Lcom/tencent/mm/plugin/mmsight/segment/a$a;
    //   224: getfield 118	com/tencent/mm/plugin/mmsight/segment/a$a:index	I
    //   227: istore 7
    //   229: aload 16
    //   231: aload_1
    //   232: putfield 150	com/tencent/mm/plugin/mmsight/segment/h:nee	Landroid/media/MediaExtractor;
    //   235: aload 16
    //   237: iload 7
    //   239: putfield 153	com/tencent/mm/plugin/mmsight/segment/h:nef	I
    //   242: aload 16
    //   244: aload_0
    //   245: getfield 113	com/tencent/mm/plugin/mmsight/segment/p:nfF	Lcom/tencent/mm/plugin/mmsight/segment/a$a;
    //   248: getfield 157	com/tencent/mm/plugin/mmsight/segment/a$a:ncd	Landroid/media/MediaFormat;
    //   251: invokevirtual 161	com/tencent/mm/plugin/mmsight/segment/h:c	(Landroid/media/MediaFormat;)I
    //   254: istore 7
    //   256: iload 7
    //   258: ifge +180 -> 438
    //   261: aload_0
    //   262: getfield 140	com/tencent/mm/plugin/mmsight/segment/p:nap	I
    //   265: invokestatic 164	com/tencent/mm/plugin/mmsight/segment/MP4MuxerJNI:releaseDataBuf	(I)V
    //   268: aload_1
    //   269: invokevirtual 167	android/media/MediaExtractor:release	()V
    //   272: getstatic 173	com/tencent/mm/plugin/mmsight/model/a/j:naP	Lcom/tencent/mm/plugin/mmsight/model/a/j;
    //   275: invokevirtual 176	com/tencent/mm/plugin/mmsight/model/a/j:ye	()V
    //   278: new 178	com/tencent/mm/plugin/mmsight/segment/l
    //   281: dup
    //   282: ldc -76
    //   284: invokespecial 183	com/tencent/mm/plugin/mmsight/segment/l:<init>	(Ljava/lang/String;)V
    //   287: athrow
    //   288: astore 4
    //   290: ldc 38
    //   292: ldc -71
    //   294: iconst_1
    //   295: anewarray 71	java/lang/Object
    //   298: dup
    //   299: iconst_0
    //   300: aload 4
    //   302: invokevirtual 189	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   305: aastore
    //   306: invokestatic 192	com/tencent/mm/sdk/platformtools/w:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   309: new 194	java/lang/RuntimeException
    //   312: dup
    //   313: aload 4
    //   315: invokespecial 197	java/lang/RuntimeException:<init>	(Ljava/lang/Throwable;)V
    //   318: athrow
    //   319: astore 4
    //   321: aload_0
    //   322: getfield 140	com/tencent/mm/plugin/mmsight/segment/p:nap	I
    //   325: invokestatic 164	com/tencent/mm/plugin/mmsight/segment/MP4MuxerJNI:releaseDataBuf	(I)V
    //   328: aload_1
    //   329: invokevirtual 167	android/media/MediaExtractor:release	()V
    //   332: getstatic 173	com/tencent/mm/plugin/mmsight/model/a/j:naP	Lcom/tencent/mm/plugin/mmsight/model/a/j;
    //   335: invokevirtual 176	com/tencent/mm/plugin/mmsight/model/a/j:ye	()V
    //   338: aload 4
    //   340: athrow
    //   341: astore_1
    //   342: ldc 38
    //   344: aload_1
    //   345: ldc -57
    //   347: iconst_1
    //   348: anewarray 71	java/lang/Object
    //   351: dup
    //   352: iconst_0
    //   353: aload_1
    //   354: invokevirtual 189	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   357: aastore
    //   358: invokestatic 203	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   361: aload 16
    //   363: invokevirtual 204	com/tencent/mm/plugin/mmsight/segment/h:release	()V
    //   366: ldc2_w 34
    //   369: ldc 36
    //   371: invokestatic 28	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   374: iconst_m1
    //   375: ireturn
    //   376: aload 16
    //   378: aload 17
    //   380: getfield 88	com/tencent/mm/modelcontrol/VideoTransPara:width	I
    //   383: aload 17
    //   385: getfield 85	com/tencent/mm/modelcontrol/VideoTransPara:height	I
    //   388: invokevirtual 92	com/tencent/mm/plugin/mmsight/segment/h:cu	(II)V
    //   391: goto -283 -> 108
    //   394: astore_1
    //   395: aload 16
    //   397: astore 4
    //   399: ldc 38
    //   401: aload_1
    //   402: ldc -50
    //   404: iconst_0
    //   405: anewarray 71	java/lang/Object
    //   408: invokestatic 203	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   411: aload 4
    //   413: ifnull +8 -> 421
    //   416: aload 4
    //   418: invokevirtual 204	com/tencent/mm/plugin/mmsight/segment/h:release	()V
    //   421: ldc2_w 34
    //   424: ldc 36
    //   426: invokestatic 28	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   429: iconst_m1
    //   430: ireturn
    //   431: bipush 10
    //   433: istore 7
    //   435: goto -229 -> 206
    //   438: aload 16
    //   440: getfield 96	com/tencent/mm/plugin/mmsight/segment/h:ncL	Ljava/lang/String;
    //   443: invokestatic 210	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
    //   446: ifne +141 -> 587
    //   449: aload 16
    //   451: getfield 96	com/tencent/mm/plugin/mmsight/segment/h:ncL	Ljava/lang/String;
    //   454: invokestatic 216	com/tencent/mm/plugin/sight/base/SightVideoJNI:getSimpleMp4Info	(Ljava/lang/String;)Ljava/lang/String;
    //   457: astore 17
    //   459: ldc 67
    //   461: ldc -38
    //   463: iconst_1
    //   464: anewarray 71	java/lang/Object
    //   467: dup
    //   468: iconst_0
    //   469: aload 17
    //   471: aastore
    //   472: invokestatic 74	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   475: aload 17
    //   477: invokestatic 210	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
    //   480: istore 15
    //   482: iload 15
    //   484: ifne +103 -> 587
    //   487: new 220	org/json/JSONObject
    //   490: dup
    //   491: aload 17
    //   493: invokespecial 221	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   496: ldc -33
    //   498: invokevirtual 227	org/json/JSONObject:getDouble	(Ljava/lang/String;)D
    //   501: d2i
    //   502: istore 7
    //   504: aload 16
    //   506: getfield 77	com/tencent/mm/plugin/mmsight/segment/h:ndN	Lcom/tencent/mm/modelcontrol/VideoTransPara;
    //   509: ifnull +662 -> 1171
    //   512: aload 16
    //   514: getfield 77	com/tencent/mm/plugin/mmsight/segment/h:ndN	Lcom/tencent/mm/modelcontrol/VideoTransPara;
    //   517: getfield 230	com/tencent/mm/modelcontrol/VideoTransPara:fps	I
    //   520: ifle +651 -> 1171
    //   523: aload 16
    //   525: getfield 77	com/tencent/mm/plugin/mmsight/segment/h:ndN	Lcom/tencent/mm/modelcontrol/VideoTransPara;
    //   528: getfield 230	com/tencent/mm/modelcontrol/VideoTransPara:fps	I
    //   531: i2d
    //   532: dstore 5
    //   534: aload 16
    //   536: iload 7
    //   538: i2d
    //   539: dload 5
    //   541: ddiv
    //   542: invokestatic 236	java/lang/Math:ceil	(D)D
    //   545: d2i
    //   546: putfield 239	com/tencent/mm/plugin/mmsight/segment/h:ncP	I
    //   549: ldc 67
    //   551: ldc -15
    //   553: iconst_3
    //   554: anewarray 71	java/lang/Object
    //   557: dup
    //   558: iconst_0
    //   559: aload 16
    //   561: getfield 239	com/tencent/mm/plugin/mmsight/segment/h:ncP	I
    //   564: invokestatic 104	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   567: aastore
    //   568: dup
    //   569: iconst_1
    //   570: iload 7
    //   572: invokestatic 104	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   575: aastore
    //   576: dup
    //   577: iconst_2
    //   578: dload 5
    //   580: invokestatic 246	java/lang/Double:valueOf	(D)Ljava/lang/Double;
    //   583: aastore
    //   584: invokestatic 74	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   587: aload 16
    //   589: getfield 250	com/tencent/mm/plugin/mmsight/segment/h:neg	Lcom/tencent/mm/plugin/mmsight/segment/e;
    //   592: aload 16
    //   594: getfield 239	com/tencent/mm/plugin/mmsight/segment/h:ncP	I
    //   597: invokeinterface 255 2 0
    //   602: aload 16
    //   604: getfield 250	com/tencent/mm/plugin/mmsight/segment/h:neg	Lcom/tencent/mm/plugin/mmsight/segment/e;
    //   607: new 257	com/tencent/mm/plugin/mmsight/segment/h$1
    //   610: dup
    //   611: aload 16
    //   613: invokespecial 260	com/tencent/mm/plugin/mmsight/segment/h$1:<init>	(Lcom/tencent/mm/plugin/mmsight/segment/h;)V
    //   616: invokeinterface 264 2 0
    //   621: lload 11
    //   623: invokestatic 268	com/tencent/mm/sdk/platformtools/bg:aI	(J)J
    //   626: lstore 11
    //   628: aload_1
    //   629: aload_0
    //   630: getfield 113	com/tencent/mm/plugin/mmsight/segment/p:nfF	Lcom/tencent/mm/plugin/mmsight/segment/a$a;
    //   633: getfield 118	com/tencent/mm/plugin/mmsight/segment/a$a:index	I
    //   636: invokevirtual 271	android/media/MediaExtractor:unselectTrack	(I)V
    //   639: iconst_0
    //   640: istore 15
    //   642: aload_0
    //   643: getfield 273	com/tencent/mm/plugin/mmsight/segment/p:nfG	Lcom/tencent/mm/plugin/mmsight/segment/a$a;
    //   646: ifnull +48 -> 694
    //   649: invokestatic 146	com/tencent/mm/sdk/platformtools/bg:Pw	()J
    //   652: lstore 13
    //   654: aload_0
    //   655: aload_1
    //   656: iload_2
    //   657: iload_3
    //   658: invokespecial 276	com/tencent/mm/plugin/mmsight/segment/p:a	(Landroid/media/MediaExtractor;II)Z
    //   661: istore 15
    //   663: ldc 38
    //   665: ldc_w 278
    //   668: iconst_2
    //   669: anewarray 71	java/lang/Object
    //   672: dup
    //   673: iconst_0
    //   674: lload 13
    //   676: invokestatic 268	com/tencent/mm/sdk/platformtools/bg:aI	(J)J
    //   679: invokestatic 283	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   682: aastore
    //   683: dup
    //   684: iconst_1
    //   685: iload 15
    //   687: invokestatic 288	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   690: aastore
    //   691: invokestatic 74	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   694: invokestatic 146	com/tencent/mm/sdk/platformtools/bg:Pw	()J
    //   697: lstore 13
    //   699: aload_0
    //   700: invokevirtual 291	com/tencent/mm/plugin/mmsight/segment/p:aPU	()Ljava/lang/String;
    //   703: astore 17
    //   705: ldc 38
    //   707: ldc_w 293
    //   710: iconst_1
    //   711: anewarray 71	java/lang/Object
    //   714: dup
    //   715: iconst_0
    //   716: lload 11
    //   718: invokestatic 283	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   721: aastore
    //   722: invokestatic 74	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   725: ldc 38
    //   727: ldc_w 295
    //   730: iconst_1
    //   731: anewarray 71	java/lang/Object
    //   734: dup
    //   735: iconst_0
    //   736: aload 17
    //   738: aastore
    //   739: invokestatic 74	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   742: invokestatic 299	com/tencent/mm/plugin/mmsight/segment/h:aQh	()I
    //   745: lload 11
    //   747: invokestatic 305	com/tencent/mm/plugin/mmsight/segment/m:A	(IJ)V
    //   750: iconst_1
    //   751: istore_3
    //   752: iconst_1
    //   753: istore 8
    //   755: aload 4
    //   757: getfield 308	com/tencent/mm/modelcontrol/VideoTransPara:audioSampleRate	I
    //   760: istore 7
    //   762: aload 4
    //   764: getfield 311	com/tencent/mm/modelcontrol/VideoTransPara:gBk	I
    //   767: istore 9
    //   769: iload 7
    //   771: istore_2
    //   772: iload 15
    //   774: ifne +405 -> 1179
    //   777: iload 7
    //   779: istore_2
    //   780: iload 8
    //   782: istore_3
    //   783: aload_0
    //   784: getfield 273	com/tencent/mm/plugin/mmsight/segment/p:nfG	Lcom/tencent/mm/plugin/mmsight/segment/a$a;
    //   787: getfield 157	com/tencent/mm/plugin/mmsight/segment/a$a:ncd	Landroid/media/MediaFormat;
    //   790: ldc_w 313
    //   793: invokevirtual 319	android/media/MediaFormat:getInteger	(Ljava/lang/String;)I
    //   796: istore 8
    //   798: iload 7
    //   800: istore_2
    //   801: iload 8
    //   803: istore_3
    //   804: aload_0
    //   805: getfield 273	com/tencent/mm/plugin/mmsight/segment/p:nfG	Lcom/tencent/mm/plugin/mmsight/segment/a$a;
    //   808: getfield 157	com/tencent/mm/plugin/mmsight/segment/a$a:ncd	Landroid/media/MediaFormat;
    //   811: ldc_w 321
    //   814: invokevirtual 319	android/media/MediaFormat:getInteger	(Ljava/lang/String;)I
    //   817: istore 7
    //   819: iload 7
    //   821: istore_2
    //   822: iload 8
    //   824: istore_3
    //   825: aload_0
    //   826: getfield 273	com/tencent/mm/plugin/mmsight/segment/p:nfG	Lcom/tencent/mm/plugin/mmsight/segment/a$a;
    //   829: getfield 157	com/tencent/mm/plugin/mmsight/segment/a$a:ncd	Landroid/media/MediaFormat;
    //   832: ldc_w 323
    //   835: invokevirtual 319	android/media/MediaFormat:getInteger	(Ljava/lang/String;)I
    //   838: istore 10
    //   840: iload 10
    //   842: istore_2
    //   843: ldc 38
    //   845: ldc_w 325
    //   848: iconst_3
    //   849: anewarray 71	java/lang/Object
    //   852: dup
    //   853: iconst_0
    //   854: iload 8
    //   856: invokestatic 104	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   859: aastore
    //   860: dup
    //   861: iconst_1
    //   862: iload 7
    //   864: invokestatic 104	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   867: aastore
    //   868: dup
    //   869: iconst_2
    //   870: iload_2
    //   871: invokestatic 104	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   874: aastore
    //   875: invokestatic 328	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   878: iload 7
    //   880: sipush 1024
    //   883: iconst_2
    //   884: iload 8
    //   886: aload 17
    //   888: aload 4
    //   890: getfield 230	com/tencent/mm/modelcontrol/VideoTransPara:fps	I
    //   893: i2f
    //   894: aload_0
    //   895: getfield 58	com/tencent/mm/plugin/mmsight/segment/a:ndm	J
    //   898: aload_0
    //   899: getfield 52	com/tencent/mm/plugin/mmsight/segment/a:ndl	J
    //   902: lsub
    //   903: l2i
    //   904: aconst_null
    //   905: iconst_0
    //   906: invokestatic 332	com/tencent/mm/plugin/mmsight/segment/MP4MuxerJNI:muxingForX264	(IIIILjava/lang/String;FI[BI)I
    //   909: istore_2
    //   910: iload_2
    //   911: ifge +85 -> 996
    //   914: ldc 38
    //   916: ldc_w 334
    //   919: iconst_1
    //   920: anewarray 71	java/lang/Object
    //   923: dup
    //   924: iconst_0
    //   925: iload_2
    //   926: invokestatic 104	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   929: aastore
    //   930: invokestatic 328	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   933: new 178	com/tencent/mm/plugin/mmsight/segment/l
    //   936: dup
    //   937: ldc_w 336
    //   940: invokespecial 183	com/tencent/mm/plugin/mmsight/segment/l:<init>	(Ljava/lang/String;)V
    //   943: athrow
    //   944: astore 17
    //   946: ldc 67
    //   948: aload 17
    //   950: ldc_w 338
    //   953: iconst_1
    //   954: anewarray 71	java/lang/Object
    //   957: dup
    //   958: iconst_0
    //   959: aload 17
    //   961: invokevirtual 189	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   964: aastore
    //   965: invokestatic 203	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   968: goto -381 -> 587
    //   971: astore 18
    //   973: ldc 38
    //   975: ldc_w 340
    //   978: iconst_1
    //   979: anewarray 71	java/lang/Object
    //   982: dup
    //   983: iconst_0
    //   984: aload 18
    //   986: invokevirtual 189	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   989: aastore
    //   990: invokestatic 328	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   993: goto +186 -> 1179
    //   996: aload_0
    //   997: getfield 80	com/tencent/mm/plugin/mmsight/segment/a:ndq	I
    //   1000: ifle +114 -> 1114
    //   1003: aload_0
    //   1004: invokevirtual 291	com/tencent/mm/plugin/mmsight/segment/p:aPU	()Ljava/lang/String;
    //   1007: aload_0
    //   1008: getfield 343	com/tencent/mm/plugin/mmsight/segment/a:ndg	Ljava/lang/String;
    //   1011: aload_0
    //   1012: getfield 80	com/tencent/mm/plugin/mmsight/segment/a:ndq	I
    //   1015: invokestatic 347	com/tencent/mm/plugin/sight/base/SightVideoJNI:tagRotateVideo	(Ljava/lang/String;Ljava/lang/String;I)V
    //   1018: ldc 38
    //   1020: ldc_w 349
    //   1023: iconst_1
    //   1024: anewarray 71	java/lang/Object
    //   1027: dup
    //   1028: iconst_0
    //   1029: lload 13
    //   1031: invokestatic 268	com/tencent/mm/sdk/platformtools/bg:aI	(J)J
    //   1034: invokestatic 283	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   1037: aastore
    //   1038: invokestatic 74	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1041: invokestatic 146	com/tencent/mm/sdk/platformtools/bg:Pw	()J
    //   1044: lstore 11
    //   1046: aload_0
    //   1047: getfield 343	com/tencent/mm/plugin/mmsight/segment/a:ndg	Ljava/lang/String;
    //   1050: invokestatic 355	com/tencent/mm/plugin/mmsight/model/CaptureMMProxy:getInstance	()Lcom/tencent/mm/plugin/mmsight/model/CaptureMMProxy;
    //   1053: invokevirtual 359	com/tencent/mm/plugin/mmsight/model/CaptureMMProxy:getWeixinMeta	()[B
    //   1056: invokestatic 363	com/tencent/mm/plugin/sight/base/SightVideoJNI:tagMP4Dscp	(Ljava/lang/String;[B)V
    //   1059: ldc 38
    //   1061: ldc_w 365
    //   1064: iconst_1
    //   1065: anewarray 71	java/lang/Object
    //   1068: dup
    //   1069: iconst_0
    //   1070: lload 11
    //   1072: invokestatic 268	com/tencent/mm/sdk/platformtools/bg:aI	(J)J
    //   1075: invokestatic 283	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   1078: aastore
    //   1079: invokestatic 74	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1082: aload_0
    //   1083: getfield 140	com/tencent/mm/plugin/mmsight/segment/p:nap	I
    //   1086: invokestatic 164	com/tencent/mm/plugin/mmsight/segment/MP4MuxerJNI:releaseDataBuf	(I)V
    //   1089: aload_1
    //   1090: invokevirtual 167	android/media/MediaExtractor:release	()V
    //   1093: getstatic 173	com/tencent/mm/plugin/mmsight/model/a/j:naP	Lcom/tencent/mm/plugin/mmsight/model/a/j;
    //   1096: invokevirtual 176	com/tencent/mm/plugin/mmsight/model/a/j:ye	()V
    //   1099: aload 16
    //   1101: invokevirtual 204	com/tencent/mm/plugin/mmsight/segment/h:release	()V
    //   1104: ldc2_w 34
    //   1107: ldc 36
    //   1109: invokestatic 28	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   1112: iconst_0
    //   1113: ireturn
    //   1114: aload_0
    //   1115: invokevirtual 291	com/tencent/mm/plugin/mmsight/segment/p:aPU	()Ljava/lang/String;
    //   1118: aload_0
    //   1119: getfield 343	com/tencent/mm/plugin/mmsight/segment/a:ndg	Ljava/lang/String;
    //   1122: invokestatic 371	com/tencent/mm/modelsfs/FileOp:al	(Ljava/lang/String;Ljava/lang/String;)Z
    //   1125: pop
    //   1126: goto -108 -> 1018
    //   1129: astore_1
    //   1130: aload 16
    //   1132: invokevirtual 204	com/tencent/mm/plugin/mmsight/segment/h:release	()V
    //   1135: aload_1
    //   1136: athrow
    //   1137: astore_1
    //   1138: goto -34 -> 1104
    //   1141: astore_1
    //   1142: goto -776 -> 366
    //   1145: astore 4
    //   1147: goto -12 -> 1135
    //   1150: astore_1
    //   1151: goto -813 -> 338
    //   1154: astore_1
    //   1155: goto -56 -> 1099
    //   1158: astore 4
    //   1160: goto -882 -> 278
    //   1163: astore_1
    //   1164: aload 17
    //   1166: astore 4
    //   1168: goto -769 -> 399
    //   1171: ldc2_w 372
    //   1174: dstore 5
    //   1176: goto -642 -> 534
    //   1179: iload 9
    //   1181: istore 8
    //   1183: iload_2
    //   1184: istore 7
    //   1186: iload 8
    //   1188: istore_2
    //   1189: iload_3
    //   1190: istore 8
    //   1192: goto -349 -> 843
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1195	0	this	p
    //   0	1195	1	paramMediaExtractor	MediaExtractor
    //   0	1195	2	paramInt1	int
    //   0	1195	3	paramInt2	int
    //   0	1195	4	paramString	String
    //   532	643	5	d	double
    //   119	1066	7	i	int
    //   753	438	8	j	int
    //   767	413	9	k	int
    //   838	3	10	m	int
    //   218	853	11	l1	long
    //   652	378	13	l2	long
    //   480	293	15	bool	boolean
    //   25	1106	16	localh	h
    //   16	871	17	localObject	Object
    //   944	221	17	localException1	Exception
    //   971	14	18	localException2	Exception
    // Exception table:
    //   from	to	target	type
    //   185	206	288	java/lang/Exception
    //   206	256	288	java/lang/Exception
    //   278	288	288	java/lang/Exception
    //   438	482	288	java/lang/Exception
    //   587	639	288	java/lang/Exception
    //   642	694	288	java/lang/Exception
    //   694	750	288	java/lang/Exception
    //   755	769	288	java/lang/Exception
    //   843	910	288	java/lang/Exception
    //   914	944	288	java/lang/Exception
    //   946	968	288	java/lang/Exception
    //   973	993	288	java/lang/Exception
    //   996	1018	288	java/lang/Exception
    //   1018	1082	288	java/lang/Exception
    //   1114	1126	288	java/lang/Exception
    //   185	206	319	finally
    //   206	256	319	finally
    //   261	278	319	finally
    //   278	288	319	finally
    //   290	319	319	finally
    //   438	482	319	finally
    //   487	534	319	finally
    //   534	587	319	finally
    //   587	639	319	finally
    //   642	694	319	finally
    //   694	750	319	finally
    //   755	769	319	finally
    //   783	798	319	finally
    //   804	819	319	finally
    //   825	840	319	finally
    //   843	910	319	finally
    //   914	944	319	finally
    //   946	968	319	finally
    //   973	993	319	finally
    //   996	1018	319	finally
    //   1018	1082	319	finally
    //   1114	1126	319	finally
    //   154	185	341	java/lang/Exception
    //   338	341	341	java/lang/Exception
    //   27	93	394	java/lang/Exception
    //   93	108	394	java/lang/Exception
    //   108	147	394	java/lang/Exception
    //   376	391	394	java/lang/Exception
    //   487	534	944	java/lang/Exception
    //   534	587	944	java/lang/Exception
    //   783	798	971	java/lang/Exception
    //   804	819	971	java/lang/Exception
    //   825	840	971	java/lang/Exception
    //   154	185	1129	finally
    //   321	338	1129	finally
    //   338	341	1129	finally
    //   342	361	1129	finally
    //   1082	1099	1129	finally
    //   1099	1104	1137	java/lang/Exception
    //   361	366	1141	java/lang/Exception
    //   1130	1135	1145	java/lang/Exception
    //   321	338	1150	java/lang/Exception
    //   1082	1099	1154	java/lang/Exception
    //   261	278	1158	java/lang/Exception
    //   18	27	1163	java/lang/Exception
  }
  
  private boolean a(MediaExtractor paramMediaExtractor, int paramInt1, int paramInt2)
  {
    GMTrace.i(7432172470272L, 55374);
    if (this.nfG == null)
    {
      GMTrace.o(7432172470272L, 55374);
      return false;
    }
    paramMediaExtractor.selectTrack(this.nfG.index);
    paramMediaExtractor.seekTo(this.ndl * 1000L, 0);
    ByteBuffer localByteBuffer = ByteBuffer.allocateDirect(paramInt1);
    try
    {
      this.nfG.ncd.getInteger("channel-count");
      w.i("VideoClipperAPI18", "audio channel count");
      if (CaptureMMProxy.getInstance().getInt(w.a.vvD, 0) != 1) {
        break label457;
      }
      paramMediaExtractor = new g(paramMediaExtractor, this.nfG.ncd, this.ndl, this.ndm, this.ndp);
      paramMediaExtractor.ndO = true;
    }
    catch (Exception localException1)
    {
      try
      {
        paramMediaExtractor.ndJ = MediaCodec.createDecoderByType(paramMediaExtractor.mVJ);
        paramMediaExtractor.ndJ.configure(paramMediaExtractor.ndL, null, null, 0);
        paramMediaExtractor.ndJ.start();
        paramMediaExtractor.ndL = paramMediaExtractor.ndJ.getOutputFormat();
      }
      catch (Exception localException1)
      {
        try
        {
          for (;;)
          {
            paramMediaExtractor.ndM = new MediaFormat();
            paramMediaExtractor.ndM.setString("mime", "audio/mp4a-latm");
            paramMediaExtractor.ndM.setInteger("aac-profile", 2);
            paramMediaExtractor.ndM.setInteger("sample-rate", paramMediaExtractor.ndN.audioSampleRate);
            paramMediaExtractor.ndM.setInteger("channel-count", 1);
            paramMediaExtractor.ndM.setInteger("bitrate", paramMediaExtractor.ndN.gBk);
            paramMediaExtractor.ndM.setInteger("max-input-size", 16384);
            paramMediaExtractor.ndK = MediaCodec.createEncoderByType(paramMediaExtractor.mVJ);
            paramMediaExtractor.ndK.configure(paramMediaExtractor.ndM, null, null, 1);
            paramMediaExtractor.ndJ.start();
            w.i("MicroMsg.MediaCodecAACTranscoder", "init finish, canEncodeDecodeBothExist: %s", new Object[] { Boolean.valueOf(paramMediaExtractor.ndO) });
            paramMediaExtractor.aQe();
            GMTrace.o(7432172470272L, 55374);
            return true;
            localException3 = localException3;
            w.e("VideoClipperAPI18", "get channel count error: %s", new Object[] { Integer.valueOf(1) });
            continue;
            localException1 = localException1;
            w.printErrStackTrace("MicroMsg.MediaCodecAACTranscoder", localException1, "init decoder error: %s", new Object[] { localException1.getMessage() });
          }
        }
        catch (Exception localException2)
        {
          for (;;)
          {
            w.e("MicroMsg.MediaCodecAACTranscoder", "init encoder error: %s", new Object[] { localException2.getMessage() });
            paramMediaExtractor.ndO = false;
            paramMediaExtractor.ndP = new ArrayList();
            paramMediaExtractor.ndK.release();
            paramMediaExtractor.ndK = null;
          }
        }
      }
    }
    localException2.position(0);
    MP4MuxerJNI.writeAACData(paramInt2, localException2, paramInt1);
    paramMediaExtractor.advance();
    label457:
    localException2.clear();
    paramInt1 = paramMediaExtractor.readSampleData(localException2, 0);
    w.d("VideoClipperAPI18", "sampleSize: %d", new Object[] { Integer.valueOf(paramInt1) });
    if (paramInt1 <= 0) {
      w.i("VideoClipperAPI18", "VideoClipperAPI18.muxAudio size = %d. Saw eos.", new Object[] { Integer.valueOf(paramInt1) });
    }
    for (;;)
    {
      GMTrace.o(7432172470272L, 55374);
      return false;
      if (paramMediaExtractor.getSampleTime() < this.ndm * 1000L)
      {
        if (paramMediaExtractor.getSampleTrackIndex() == this.nfG.index) {
          break;
        }
        w.e("VideoClipperAPI18", "track index not match! break");
      }
    }
  }
  
  /* Error */
  public final int CL(String paramString)
  {
    // Byte code:
    //   0: ldc2_w 516
    //   3: ldc_w 518
    //   6: invokestatic 25	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: new 520	android/media/MediaMetadataRetriever
    //   12: dup
    //   13: invokespecial 521	android/media/MediaMetadataRetriever:<init>	()V
    //   16: astore_3
    //   17: aload_3
    //   18: aload_1
    //   19: invokevirtual 524	android/media/MediaMetadataRetriever:setDataSource	(Ljava/lang/String;)V
    //   22: bipush 17
    //   24: invokestatic 530	com/tencent/mm/compatible/util/d:et	(I)Z
    //   27: ifeq +115 -> 142
    //   30: aload_3
    //   31: bipush 24
    //   33: invokevirtual 534	android/media/MediaMetadataRetriever:extractMetadata	(I)Ljava/lang/String;
    //   36: astore_1
    //   37: ldc 38
    //   39: new 536	java/lang/StringBuilder
    //   42: dup
    //   43: ldc_w 538
    //   46: invokespecial 539	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   49: aload_1
    //   50: invokevirtual 543	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   53: invokevirtual 546	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   56: invokestatic 548	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   59: aload_3
    //   60: bipush 19
    //   62: invokevirtual 534	android/media/MediaMetadataRetriever:extractMetadata	(I)Ljava/lang/String;
    //   65: astore 4
    //   67: aload_3
    //   68: bipush 18
    //   70: invokevirtual 534	android/media/MediaMetadataRetriever:extractMetadata	(I)Ljava/lang/String;
    //   73: astore 5
    //   75: ldc 38
    //   77: new 536	java/lang/StringBuilder
    //   80: dup
    //   81: ldc_w 550
    //   84: invokespecial 539	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   87: aload 4
    //   89: invokevirtual 543	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   92: invokevirtual 546	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   95: invokestatic 548	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   98: ldc 38
    //   100: new 536	java/lang/StringBuilder
    //   103: dup
    //   104: ldc_w 552
    //   107: invokespecial 539	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   110: aload 5
    //   112: invokevirtual 543	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   115: invokevirtual 546	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   118: invokestatic 548	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   121: aload_1
    //   122: iconst_0
    //   123: invokestatic 555	com/tencent/mm/sdk/platformtools/bg:getInt	(Ljava/lang/String;I)I
    //   126: istore_2
    //   127: aload_3
    //   128: invokevirtual 556	android/media/MediaMetadataRetriever:release	()V
    //   131: ldc2_w 516
    //   134: ldc_w 518
    //   137: invokestatic 28	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   140: iload_2
    //   141: ireturn
    //   142: new 536	java/lang/StringBuilder
    //   145: dup
    //   146: invokespecial 557	java/lang/StringBuilder:<init>	()V
    //   149: aload_1
    //   150: invokestatic 560	com/tencent/mm/plugin/sight/base/SightVideoJNI:getMp4Rotate	(Ljava/lang/String;)I
    //   153: invokevirtual 563	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   156: invokevirtual 546	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   159: astore_1
    //   160: goto -123 -> 37
    //   163: astore_1
    //   164: aconst_null
    //   165: astore_3
    //   166: aload_3
    //   167: ifnull +7 -> 174
    //   170: aload_3
    //   171: invokevirtual 556	android/media/MediaMetadataRetriever:release	()V
    //   174: aload_1
    //   175: athrow
    //   176: astore_1
    //   177: goto -11 -> 166
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	180	0	this	p
    //   0	180	1	paramString	String
    //   126	15	2	i	int
    //   16	155	3	localMediaMetadataRetriever	android.media.MediaMetadataRetriever
    //   65	23	4	str1	String
    //   73	38	5	str2	String
    // Exception table:
    //   from	to	target	type
    //   9	17	163	finally
    //   17	37	176	finally
    //   37	127	176	finally
    //   142	160	176	finally
  }
  
  protected final int a(MediaExtractor paramMediaExtractor, List<a.a> paramList1, List<a.a> paramList2)
  {
    GMTrace.i(7431904034816L, 55372);
    this.nfF = ((a.a)paramList2.get(0));
    if ((paramList1 != null) && (paramList1.size() != 0)) {
      this.nfG = ((a.a)paramList1.get(0));
    }
    if (this.ndn <= 0) {}
    for (int i = 1048576; a(paramMediaExtractor, i, this.nap, this.ndh) == -1; i = this.ndn)
    {
      w.e("VideoClipperAPI18", "transcodeAndMux error");
      release();
      GMTrace.o(7431904034816L, 55372);
      return -1;
    }
    GMTrace.o(7431904034816L, 55372);
    return 0;
  }
  
  public final void a(String paramString1, String paramString2, VideoTransPara paramVideoTransPara)
  {
    GMTrace.i(7431635599360L, 55370);
    super.a(paramString1, paramString2, paramVideoTransPara);
    GMTrace.o(7431635599360L, 55370);
  }
  
  public final int p(long paramLong1, long paramLong2)
  {
    GMTrace.i(7431769817088L, 55371);
    m.qR(h.aQh());
    int i = super.p(paramLong1, paramLong2);
    if (i == -1) {
      m.qS(h.aQh());
    }
    GMTrace.o(7431769817088L, 55371);
    return i;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\mmsight\segment\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */