package com.tencent.mm.plugin.mmsight.model.b;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.media.MediaExtractor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.mmsight.model.a.j;
import com.tencent.mm.plugin.mmsight.segment.MP4MuxerJNI;
import com.tencent.mm.plugin.sight.base.SightVideoJNI;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.nio.Buffer;
import java.nio.ByteBuffer;

public final class b
  extends com.tencent.mm.plugin.mmsight.api.a
{
  private String filePath;
  private int inputHeight;
  private int inputWidth;
  private int irV;
  private int ljb;
  private MediaExtractor mVN;
  private int nap;
  private int ncA;
  public Point ncB;
  public Bitmap ncE;
  private byte[] ncF;
  public byte[] ncG;
  public e ncI;
  public c ncs;
  private String ncu;
  private int ncv;
  public int ncw;
  private long ncx;
  private long ncy;
  private int ncz;
  private int outputHeight;
  private int outputWidth;
  private int videoFps;
  
  public b(String paramString1, String paramString2, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(20195607314432L, 150469);
    this.ljb = -1;
    this.ncx = -1L;
    this.ncy = -1L;
    this.ncz = -1;
    this.ncB = null;
    this.ncF = null;
    this.ncG = null;
    if ((bg.nm(paramString1)) || (bg.nm(paramString2)) || (paramInt1 <= 0) || (paramInt2 <= 0))
    {
      w.e("MicroMsg.MMSightFFMpegX264Remuxer", "create MMSightFFMpegMediaCodecRemuxer error, filePath: %s, outputFilePath: %s, outputWidth: %s, outputHeight: %s, outputFps: %s", new Object[] { paramString1, paramString2, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt4) });
      GMTrace.o(20195607314432L, 150469);
      return;
    }
    this.filePath = paramString1;
    this.ncu = paramString2;
    this.outputWidth = paramInt1;
    this.outputHeight = paramInt2;
    this.ncv = paramInt3;
    this.ncz = paramInt4;
    this.ncw = SightVideoJNI.getMp4Rotate(paramString1);
    com.tencent.mm.plugin.sight.base.a locala = com.tencent.mm.plugin.sight.base.d.GB(paramString1);
    if (locala != null)
    {
      this.inputWidth = locala.width;
      this.inputHeight = locala.height;
      this.ljb = locala.ljb;
      this.videoFps = locala.ncj;
    }
    this.ncx = 0L;
    this.ncy = this.ljb;
    w.i("MicroMsg.MMSightFFMpegX264Remuxer", "create MMSightFFMpegX264Remuxer, filePath: %s, outputFilePath: %s, inputWidth: %s, inputHeight: %s, videoRotate: %s, outputWidth: %s, outputHeight: %s", new Object[] { paramString1, paramString2, Integer.valueOf(this.inputWidth), Integer.valueOf(this.inputHeight), Integer.valueOf(this.ncw), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    GMTrace.o(20195607314432L, 150469);
  }
  
  public b(String paramString1, String paramString2, int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong1, long paramLong2)
  {
    GMTrace.i(20195741532160L, 150470);
    this.ljb = -1;
    this.ncx = -1L;
    this.ncy = -1L;
    this.ncz = -1;
    this.ncB = null;
    this.ncF = null;
    this.ncG = null;
    if ((bg.nm(paramString1)) || (bg.nm(paramString2)) || (paramInt1 <= 0) || (paramInt2 <= 0))
    {
      w.e("MicroMsg.MMSightFFMpegX264Remuxer", "create MMSightFFMpegMediaCodecRemuxer error, filePath: %s, outputFilePath: %s, outputWidth: %s, outputHeight: %s, outputFps: %s", new Object[] { paramString1, paramString2, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt4) });
      GMTrace.o(20195741532160L, 150470);
      return;
    }
    this.filePath = paramString1;
    this.ncu = paramString2;
    this.outputWidth = paramInt1;
    this.outputHeight = paramInt2;
    this.ncv = paramInt3;
    this.ncz = paramInt4;
    this.ncw = SightVideoJNI.getMp4Rotate(paramString1);
    com.tencent.mm.plugin.sight.base.a locala = com.tencent.mm.plugin.sight.base.d.GB(paramString1);
    if (locala != null)
    {
      this.inputWidth = locala.width;
      this.inputHeight = locala.height;
      this.videoFps = locala.ncj;
    }
    this.ncx = paramLong1;
    this.ncy = paramLong2;
    w.i("MicroMsg.MMSightFFMpegX264Remuxer", "create MMSightFFMpegX264Remuxer, filePath: %s, outputFilePath: %s, inputWidth: %s, inputHeight: %s, videoRotate: %s, outputWidth: %s, outputHeight: %s, startTimeMs: %s, endTimeMs: %s", new Object[] { paramString1, paramString2, Integer.valueOf(this.inputWidth), Integer.valueOf(this.inputHeight), Integer.valueOf(this.ncw), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Long.valueOf(paramLong1), Long.valueOf(paramLong2) });
    GMTrace.o(20195741532160L, 150470);
  }
  
  public final void A(Bitmap paramBitmap)
  {
    GMTrace.i(20195875749888L, 150471);
    if (paramBitmap != null) {
      this.ncE = paramBitmap;
    }
    GMTrace.o(20195875749888L, 150471);
  }
  
  /* Error */
  public final int aOO()
  {
    // Byte code:
    //   0: ldc2_w 167
    //   3: ldc -87
    //   5: invokestatic 52	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   8: aload_0
    //   9: getfield 54	com/tencent/mm/plugin/mmsight/model/b/b:ljb	I
    //   12: i2f
    //   13: ldc -86
    //   15: fdiv
    //   16: invokestatic 176	java/lang/Math:round	(F)I
    //   19: istore_2
    //   20: iload_2
    //   21: istore_1
    //   22: aload_0
    //   23: getfield 58	com/tencent/mm/plugin/mmsight/model/b/b:ncx	J
    //   26: lconst_0
    //   27: lcmp
    //   28: iflt +33 -> 61
    //   31: iload_2
    //   32: istore_1
    //   33: aload_0
    //   34: getfield 60	com/tencent/mm/plugin/mmsight/model/b/b:ncy	J
    //   37: lconst_0
    //   38: lcmp
    //   39: iflt +22 -> 61
    //   42: aload_0
    //   43: getfield 60	com/tencent/mm/plugin/mmsight/model/b/b:ncy	J
    //   46: aload_0
    //   47: getfield 58	com/tencent/mm/plugin/mmsight/model/b/b:ncx	J
    //   50: lsub
    //   51: l2f
    //   52: ldc -86
    //   54: fdiv
    //   55: invokestatic 176	java/lang/Math:round	(F)I
    //   58: iconst_1
    //   59: iadd
    //   60: istore_1
    //   61: aload_0
    //   62: iload_1
    //   63: invokestatic 182	com/tencent/mm/plugin/mmsight/segment/MP4MuxerJNI:initDataBuf	(I)I
    //   66: putfield 184	com/tencent/mm/plugin/mmsight/model/b/b:nap	I
    //   69: aload_0
    //   70: new 186	com/tencent/mm/plugin/mmsight/model/b/c
    //   73: dup
    //   74: invokespecial 187	com/tencent/mm/plugin/mmsight/model/b/c:<init>	()V
    //   77: putfield 189	com/tencent/mm/plugin/mmsight/model/b/b:ncs	Lcom/tencent/mm/plugin/mmsight/model/b/c;
    //   80: aload_0
    //   81: getfield 54	com/tencent/mm/plugin/mmsight/model/b/b:ljb	I
    //   84: ifle +64 -> 148
    //   87: aload_0
    //   88: getfield 189	com/tencent/mm/plugin/mmsight/model/b/b:ncs	Lcom/tencent/mm/plugin/mmsight/model/b/c;
    //   91: aload_0
    //   92: getfield 97	com/tencent/mm/plugin/mmsight/model/b/b:filePath	Ljava/lang/String;
    //   95: lconst_0
    //   96: aload_0
    //   97: getfield 54	com/tencent/mm/plugin/mmsight/model/b/b:ljb	I
    //   100: i2l
    //   101: aload_0
    //   102: getfield 137	com/tencent/mm/plugin/mmsight/model/b/b:videoFps	I
    //   105: invokevirtual 193	com/tencent/mm/plugin/mmsight/model/b/c:b	(Ljava/lang/String;JJI)I
    //   108: istore_1
    //   109: ldc 76
    //   111: ldc -61
    //   113: iconst_1
    //   114: anewarray 80	java/lang/Object
    //   117: dup
    //   118: iconst_0
    //   119: iload_1
    //   120: invokestatic 86	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   123: aastore
    //   124: invokestatic 141	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   127: iload_1
    //   128: ifge +123 -> 251
    //   131: aload_0
    //   132: getfield 184	com/tencent/mm/plugin/mmsight/model/b/b:nap	I
    //   135: invokestatic 199	com/tencent/mm/plugin/mmsight/segment/MP4MuxerJNI:releaseDataBuf	(I)V
    //   138: ldc2_w 167
    //   141: ldc -87
    //   143: invokestatic 95	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   146: iconst_m1
    //   147: ireturn
    //   148: aload_0
    //   149: getfield 58	com/tencent/mm/plugin/mmsight/model/b/b:ncx	J
    //   152: lconst_0
    //   153: lcmp
    //   154: iflt +39 -> 193
    //   157: aload_0
    //   158: getfield 60	com/tencent/mm/plugin/mmsight/model/b/b:ncy	J
    //   161: lconst_0
    //   162: lcmp
    //   163: iflt +30 -> 193
    //   166: aload_0
    //   167: getfield 189	com/tencent/mm/plugin/mmsight/model/b/b:ncs	Lcom/tencent/mm/plugin/mmsight/model/b/c;
    //   170: aload_0
    //   171: getfield 97	com/tencent/mm/plugin/mmsight/model/b/b:filePath	Ljava/lang/String;
    //   174: aload_0
    //   175: getfield 58	com/tencent/mm/plugin/mmsight/model/b/b:ncx	J
    //   178: aload_0
    //   179: getfield 60	com/tencent/mm/plugin/mmsight/model/b/b:ncy	J
    //   182: aload_0
    //   183: getfield 137	com/tencent/mm/plugin/mmsight/model/b/b:videoFps	I
    //   186: invokevirtual 193	com/tencent/mm/plugin/mmsight/model/b/c:b	(Ljava/lang/String;JJI)I
    //   189: istore_1
    //   190: goto -81 -> 109
    //   193: ldc 76
    //   195: ldc -55
    //   197: iconst_3
    //   198: anewarray 80	java/lang/Object
    //   201: dup
    //   202: iconst_0
    //   203: aload_0
    //   204: getfield 54	com/tencent/mm/plugin/mmsight/model/b/b:ljb	I
    //   207: invokestatic 86	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   210: aastore
    //   211: dup
    //   212: iconst_1
    //   213: aload_0
    //   214: getfield 58	com/tencent/mm/plugin/mmsight/model/b/b:ncx	J
    //   217: invokestatic 153	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   220: aastore
    //   221: dup
    //   222: iconst_2
    //   223: aload_0
    //   224: getfield 60	com/tencent/mm/plugin/mmsight/model/b/b:ncy	J
    //   227: invokestatic 153	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   230: aastore
    //   231: invokestatic 92	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   234: aload_0
    //   235: getfield 184	com/tencent/mm/plugin/mmsight/model/b/b:nap	I
    //   238: invokestatic 199	com/tencent/mm/plugin/mmsight/segment/MP4MuxerJNI:releaseDataBuf	(I)V
    //   241: ldc2_w 167
    //   244: ldc -87
    //   246: invokestatic 95	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   249: iconst_m1
    //   250: ireturn
    //   251: aload_0
    //   252: getfield 62	com/tencent/mm/plugin/mmsight/model/b/b:ncz	I
    //   255: ifle +38 -> 293
    //   258: aload_0
    //   259: getfield 62	com/tencent/mm/plugin/mmsight/model/b/b:ncz	I
    //   262: aload_0
    //   263: getfield 137	com/tencent/mm/plugin/mmsight/model/b/b:videoFps	I
    //   266: if_icmpge +27 -> 293
    //   269: aload_0
    //   270: getfield 189	com/tencent/mm/plugin/mmsight/model/b/b:ncs	Lcom/tencent/mm/plugin/mmsight/model/b/c;
    //   273: aload_0
    //   274: getfield 137	com/tencent/mm/plugin/mmsight/model/b/b:videoFps	I
    //   277: i2f
    //   278: aload_0
    //   279: getfield 62	com/tencent/mm/plugin/mmsight/model/b/b:ncz	I
    //   282: i2f
    //   283: fdiv
    //   284: f2d
    //   285: invokestatic 205	java/lang/Math:ceil	(D)D
    //   288: d2i
    //   289: i2d
    //   290: putfield 209	com/tencent/mm/plugin/mmsight/model/b/c:ncQ	D
    //   293: aload_0
    //   294: getfield 62	com/tencent/mm/plugin/mmsight/model/b/b:ncz	I
    //   297: ifle +613 -> 910
    //   300: aload_0
    //   301: getfield 62	com/tencent/mm/plugin/mmsight/model/b/b:ncz	I
    //   304: aload_0
    //   305: getfield 137	com/tencent/mm/plugin/mmsight/model/b/b:videoFps	I
    //   308: invokestatic 213	java/lang/Math:min	(II)I
    //   311: istore_1
    //   312: aload_0
    //   313: getfield 189	com/tencent/mm/plugin/mmsight/model/b/b:ncs	Lcom/tencent/mm/plugin/mmsight/model/b/c;
    //   316: new 6	com/tencent/mm/plugin/mmsight/model/b/b$1
    //   319: dup
    //   320: aload_0
    //   321: invokespecial 216	com/tencent/mm/plugin/mmsight/model/b/b$1:<init>	(Lcom/tencent/mm/plugin/mmsight/model/b/b;)V
    //   324: putfield 220	com/tencent/mm/plugin/mmsight/model/b/c:ncK	Lcom/tencent/mm/plugin/mmsight/model/b/c$a;
    //   327: aload_0
    //   328: new 222	com/tencent/mm/plugin/mmsight/model/b/e
    //   331: dup
    //   332: aload_0
    //   333: getfield 126	com/tencent/mm/plugin/mmsight/model/b/b:inputWidth	I
    //   336: aload_0
    //   337: getfield 131	com/tencent/mm/plugin/mmsight/model/b/b:inputHeight	I
    //   340: aload_0
    //   341: getfield 101	com/tencent/mm/plugin/mmsight/model/b/b:outputWidth	I
    //   344: aload_0
    //   345: getfield 103	com/tencent/mm/plugin/mmsight/model/b/b:outputHeight	I
    //   348: aload_0
    //   349: getfield 105	com/tencent/mm/plugin/mmsight/model/b/b:ncv	I
    //   352: iload_1
    //   353: getstatic 227	com/tencent/mm/plugin/sight/base/b:oRD	I
    //   356: invokespecial 230	com/tencent/mm/plugin/mmsight/model/b/e:<init>	(IIIIIII)V
    //   359: putfield 232	com/tencent/mm/plugin/mmsight/model/b/b:ncI	Lcom/tencent/mm/plugin/mmsight/model/b/e;
    //   362: aload_0
    //   363: getfield 232	com/tencent/mm/plugin/mmsight/model/b/b:ncI	Lcom/tencent/mm/plugin/mmsight/model/b/e;
    //   366: astore 5
    //   368: aload 5
    //   370: iconst_0
    //   371: putfield 235	com/tencent/mm/plugin/mmsight/model/b/e:frameCount	I
    //   374: aload 5
    //   376: getfield 238	com/tencent/mm/plugin/mmsight/model/b/e:mAB	I
    //   379: aload 5
    //   381: getfield 241	com/tencent/mm/plugin/mmsight/model/b/e:lhd	I
    //   384: aload 5
    //   386: getfield 242	com/tencent/mm/plugin/mmsight/model/b/e:ncj	I
    //   389: i2f
    //   390: aload 5
    //   392: getfield 245	com/tencent/mm/plugin/mmsight/model/b/e:bitrate	I
    //   395: aload 5
    //   397: getfield 248	com/tencent/mm/plugin/mmsight/model/b/e:gBn	I
    //   400: bipush 8
    //   402: aload 5
    //   404: getfield 251	com/tencent/mm/plugin/mmsight/model/b/e:gBm	I
    //   407: ldc -4
    //   409: invokestatic 256	com/tencent/mm/plugin/mmsight/segment/MP4MuxerJNI:initH264Encoder	(IIFIIIIF)I
    //   412: pop
    //   413: aload 5
    //   415: new 258	com/tencent/mm/plugin/mmsight/model/b/e$a
    //   418: dup
    //   419: aload 5
    //   421: invokespecial 261	com/tencent/mm/plugin/mmsight/model/b/e$a:<init>	(Lcom/tencent/mm/plugin/mmsight/model/b/e;)V
    //   424: putfield 265	com/tencent/mm/plugin/mmsight/model/b/e:ncV	Lcom/tencent/mm/plugin/mmsight/model/b/e$a;
    //   427: aload 5
    //   429: aload 5
    //   431: getfield 265	com/tencent/mm/plugin/mmsight/model/b/e:ncV	Lcom/tencent/mm/plugin/mmsight/model/b/e$a;
    //   434: ldc_w 267
    //   437: invokestatic 272	com/tencent/mm/sdk/f/e:b	(Ljava/lang/Runnable;Ljava/lang/String;)Ljava/lang/Thread;
    //   440: putfield 276	com/tencent/mm/plugin/mmsight/model/b/e:ncW	Ljava/lang/Thread;
    //   443: aload 5
    //   445: getfield 276	com/tencent/mm/plugin/mmsight/model/b/e:ncW	Ljava/lang/Thread;
    //   448: invokevirtual 281	java/lang/Thread:start	()V
    //   451: aload 5
    //   453: iconst_0
    //   454: putfield 285	com/tencent/mm/plugin/mmsight/model/b/e:isStart	Z
    //   457: ldc_w 287
    //   460: ldc_w 289
    //   463: invokestatic 292	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   466: aload_0
    //   467: getfield 189	com/tencent/mm/plugin/mmsight/model/b/b:ncs	Lcom/tencent/mm/plugin/mmsight/model/b/c;
    //   470: invokevirtual 295	com/tencent/mm/plugin/mmsight/model/b/c:aPS	()V
    //   473: aload_0
    //   474: getfield 232	com/tencent/mm/plugin/mmsight/model/b/b:ncI	Lcom/tencent/mm/plugin/mmsight/model/b/e;
    //   477: astore 5
    //   479: aload 5
    //   481: getfield 265	com/tencent/mm/plugin/mmsight/model/b/e:ncV	Lcom/tencent/mm/plugin/mmsight/model/b/e$a;
    //   484: ifnull +37 -> 521
    //   487: aload 5
    //   489: getfield 276	com/tencent/mm/plugin/mmsight/model/b/e:ncW	Ljava/lang/Thread;
    //   492: ifnull +29 -> 521
    //   495: aload 5
    //   497: getfield 265	com/tencent/mm/plugin/mmsight/model/b/e:ncV	Lcom/tencent/mm/plugin/mmsight/model/b/e$a;
    //   500: iconst_1
    //   501: putfield 298	com/tencent/mm/plugin/mmsight/model/b/e$a:ncX	Z
    //   504: aload 5
    //   506: getfield 276	com/tencent/mm/plugin/mmsight/model/b/e:ncW	Ljava/lang/Thread;
    //   509: invokevirtual 301	java/lang/Thread:join	()V
    //   512: aload 5
    //   514: getfield 265	com/tencent/mm/plugin/mmsight/model/b/e:ncV	Lcom/tencent/mm/plugin/mmsight/model/b/e$a;
    //   517: invokestatic 305	com/tencent/mm/sdk/f/e:remove	(Ljava/lang/Runnable;)Z
    //   520: pop
    //   521: aload_0
    //   522: new 307	android/media/MediaExtractor
    //   525: dup
    //   526: invokespecial 308	android/media/MediaExtractor:<init>	()V
    //   529: putfield 310	com/tencent/mm/plugin/mmsight/model/b/b:mVN	Landroid/media/MediaExtractor;
    //   532: aload_0
    //   533: getfield 310	com/tencent/mm/plugin/mmsight/model/b/b:mVN	Landroid/media/MediaExtractor;
    //   536: aload_0
    //   537: getfield 97	com/tencent/mm/plugin/mmsight/model/b/b:filePath	Ljava/lang/String;
    //   540: invokevirtual 314	android/media/MediaExtractor:setDataSource	(Ljava/lang/String;)V
    //   543: aconst_null
    //   544: astore 5
    //   546: iconst_0
    //   547: istore_1
    //   548: iload_1
    //   549: aload_0
    //   550: getfield 310	com/tencent/mm/plugin/mmsight/model/b/b:mVN	Landroid/media/MediaExtractor;
    //   553: invokevirtual 317	android/media/MediaExtractor:getTrackCount	()I
    //   556: if_icmpge +523 -> 1079
    //   559: aload_0
    //   560: getfield 310	com/tencent/mm/plugin/mmsight/model/b/b:mVN	Landroid/media/MediaExtractor;
    //   563: iload_1
    //   564: invokevirtual 321	android/media/MediaExtractor:getTrackFormat	(I)Landroid/media/MediaFormat;
    //   567: astore 7
    //   569: aload 7
    //   571: ldc_w 323
    //   574: invokevirtual 329	android/media/MediaFormat:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   577: astore 5
    //   579: aload 5
    //   581: ldc_w 331
    //   584: invokevirtual 336	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   587: ifeq +508 -> 1095
    //   590: aload 5
    //   592: astore 6
    //   594: aload 7
    //   596: astore 5
    //   598: iload_1
    //   599: iflt +145 -> 744
    //   602: aload 5
    //   604: ifnull +140 -> 744
    //   607: aload 6
    //   609: invokestatic 74	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
    //   612: ifne +132 -> 744
    //   615: aload_0
    //   616: aload 5
    //   618: ldc_w 338
    //   621: invokevirtual 341	android/media/MediaFormat:getInteger	(Ljava/lang/String;)I
    //   624: putfield 343	com/tencent/mm/plugin/mmsight/model/b/b:irV	I
    //   627: aload_0
    //   628: aload 5
    //   630: ldc_w 345
    //   633: invokevirtual 341	android/media/MediaFormat:getInteger	(Ljava/lang/String;)I
    //   636: putfield 347	com/tencent/mm/plugin/mmsight/model/b/b:ncA	I
    //   639: aload_0
    //   640: getfield 310	com/tencent/mm/plugin/mmsight/model/b/b:mVN	Landroid/media/MediaExtractor;
    //   643: iload_1
    //   644: invokevirtual 350	android/media/MediaExtractor:selectTrack	(I)V
    //   647: aload_0
    //   648: getfield 58	com/tencent/mm/plugin/mmsight/model/b/b:ncx	J
    //   651: lconst_0
    //   652: lcmp
    //   653: ifle +19 -> 672
    //   656: aload_0
    //   657: getfield 310	com/tencent/mm/plugin/mmsight/model/b/b:mVN	Landroid/media/MediaExtractor;
    //   660: aload_0
    //   661: getfield 58	com/tencent/mm/plugin/mmsight/model/b/b:ncx	J
    //   664: ldc2_w 351
    //   667: lmul
    //   668: iconst_0
    //   669: invokevirtual 355	android/media/MediaExtractor:seekTo	(JI)V
    //   672: aload 5
    //   674: ldc_w 357
    //   677: invokevirtual 341	android/media/MediaFormat:getInteger	(Ljava/lang/String;)I
    //   680: invokestatic 363	java/nio/ByteBuffer:allocateDirect	(I)Ljava/nio/ByteBuffer;
    //   683: astore 5
    //   685: aload 5
    //   687: invokevirtual 367	java/nio/ByteBuffer:clear	()Ljava/nio/Buffer;
    //   690: pop
    //   691: aload_0
    //   692: getfield 310	com/tencent/mm/plugin/mmsight/model/b/b:mVN	Landroid/media/MediaExtractor;
    //   695: aload 5
    //   697: iconst_0
    //   698: invokevirtual 371	android/media/MediaExtractor:readSampleData	(Ljava/nio/ByteBuffer;I)I
    //   701: istore_2
    //   702: ldc 76
    //   704: ldc_w 373
    //   707: iconst_1
    //   708: anewarray 80	java/lang/Object
    //   711: dup
    //   712: iconst_0
    //   713: iload_2
    //   714: invokestatic 86	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   717: aastore
    //   718: invokestatic 376	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   721: iload_2
    //   722: ifgt +285 -> 1007
    //   725: ldc 76
    //   727: ldc_w 378
    //   730: iconst_1
    //   731: anewarray 80	java/lang/Object
    //   734: dup
    //   735: iconst_0
    //   736: iload_2
    //   737: invokestatic 86	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   740: aastore
    //   741: invokestatic 141	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   744: aload_0
    //   745: getfield 99	com/tencent/mm/plugin/mmsight/model/b/b:ncu	Ljava/lang/String;
    //   748: astore 6
    //   750: aload 6
    //   752: astore 5
    //   754: aload_0
    //   755: getfield 113	com/tencent/mm/plugin/mmsight/model/b/b:ncw	I
    //   758: ifle +26 -> 784
    //   761: new 380	java/lang/StringBuilder
    //   764: dup
    //   765: invokespecial 381	java/lang/StringBuilder:<init>	()V
    //   768: aload 6
    //   770: invokevirtual 385	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   773: ldc_w 387
    //   776: invokevirtual 385	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   779: invokevirtual 391	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   782: astore 5
    //   784: aload_0
    //   785: getfield 54	com/tencent/mm/plugin/mmsight/model/b/b:ljb	I
    //   788: i2l
    //   789: lstore_3
    //   790: lload_3
    //   791: lconst_0
    //   792: lcmp
    //   793: ifgt +283 -> 1076
    //   796: aload_0
    //   797: getfield 60	com/tencent/mm/plugin/mmsight/model/b/b:ncy	J
    //   800: aload_0
    //   801: getfield 58	com/tencent/mm/plugin/mmsight/model/b/b:ncx	J
    //   804: lsub
    //   805: lstore_3
    //   806: aload_0
    //   807: getfield 347	com/tencent/mm/plugin/mmsight/model/b/b:ncA	I
    //   810: sipush 1024
    //   813: iconst_2
    //   814: aload_0
    //   815: getfield 343	com/tencent/mm/plugin/mmsight/model/b/b:irV	I
    //   818: aload 5
    //   820: aload_0
    //   821: getfield 232	com/tencent/mm/plugin/mmsight/model/b/b:ncI	Lcom/tencent/mm/plugin/mmsight/model/b/e;
    //   824: getfield 235	com/tencent/mm/plugin/mmsight/model/b/e:frameCount	I
    //   827: i2f
    //   828: ldc -86
    //   830: fmul
    //   831: lload_3
    //   832: l2f
    //   833: fdiv
    //   834: lload_3
    //   835: l2i
    //   836: aconst_null
    //   837: iconst_0
    //   838: invokestatic 395	com/tencent/mm/plugin/mmsight/segment/MP4MuxerJNI:muxingForX264	(IIIILjava/lang/String;FI[BI)I
    //   841: istore_1
    //   842: ldc 76
    //   844: ldc_w 397
    //   847: iconst_1
    //   848: anewarray 80	java/lang/Object
    //   851: dup
    //   852: iconst_0
    //   853: iload_1
    //   854: invokestatic 86	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   857: aastore
    //   858: invokestatic 141	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   861: aload_0
    //   862: getfield 113	com/tencent/mm/plugin/mmsight/model/b/b:ncw	I
    //   865: ifle +22 -> 887
    //   868: aload 5
    //   870: aload_0
    //   871: getfield 99	com/tencent/mm/plugin/mmsight/model/b/b:ncu	Ljava/lang/String;
    //   874: aload_0
    //   875: getfield 113	com/tencent/mm/plugin/mmsight/model/b/b:ncw	I
    //   878: invokestatic 401	com/tencent/mm/plugin/sight/base/SightVideoJNI:tagRotateVideo	(Ljava/lang/String;Ljava/lang/String;I)V
    //   881: aload 5
    //   883: invokestatic 406	com/tencent/mm/modelsfs/FileOp:deleteFile	(Ljava/lang/String;)Z
    //   886: pop
    //   887: aload_0
    //   888: getfield 184	com/tencent/mm/plugin/mmsight/model/b/b:nap	I
    //   891: invokestatic 199	com/tencent/mm/plugin/mmsight/segment/MP4MuxerJNI:releaseDataBuf	(I)V
    //   894: getstatic 412	com/tencent/mm/plugin/mmsight/model/a/j:naP	Lcom/tencent/mm/plugin/mmsight/model/a/j;
    //   897: invokevirtual 415	com/tencent/mm/plugin/mmsight/model/a/j:ye	()V
    //   900: ldc2_w 167
    //   903: ldc -87
    //   905: invokestatic 95	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   908: iload_1
    //   909: ireturn
    //   910: aload_0
    //   911: getfield 137	com/tencent/mm/plugin/mmsight/model/b/b:videoFps	I
    //   914: istore_1
    //   915: goto -603 -> 312
    //   918: astore 5
    //   920: ldc_w 287
    //   923: aload 5
    //   925: ldc_w 417
    //   928: iconst_1
    //   929: anewarray 80	java/lang/Object
    //   932: dup
    //   933: iconst_0
    //   934: aload 5
    //   936: invokevirtual 420	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   939: aastore
    //   940: invokestatic 424	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   943: goto -422 -> 521
    //   946: astore 5
    //   948: ldc 76
    //   950: aload 5
    //   952: ldc_w 426
    //   955: iconst_1
    //   956: anewarray 80	java/lang/Object
    //   959: dup
    //   960: iconst_0
    //   961: aload 5
    //   963: invokevirtual 420	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   966: aastore
    //   967: invokestatic 424	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   970: ldc2_w 167
    //   973: ldc -87
    //   975: invokestatic 95	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   978: iconst_m1
    //   979: ireturn
    //   980: astore 5
    //   982: ldc 76
    //   984: aload 5
    //   986: ldc_w 428
    //   989: iconst_1
    //   990: anewarray 80	java/lang/Object
    //   993: dup
    //   994: iconst_0
    //   995: aload 5
    //   997: invokevirtual 429	java/io/IOException:getMessage	()Ljava/lang/String;
    //   1000: aastore
    //   1001: invokestatic 424	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1004: goto -260 -> 744
    //   1007: aload_0
    //   1008: getfield 310	com/tencent/mm/plugin/mmsight/model/b/b:mVN	Landroid/media/MediaExtractor;
    //   1011: invokevirtual 433	android/media/MediaExtractor:getSampleTime	()J
    //   1014: aload_0
    //   1015: getfield 60	com/tencent/mm/plugin/mmsight/model/b/b:ncy	J
    //   1018: ldc2_w 351
    //   1021: lmul
    //   1022: lcmp
    //   1023: ifge -279 -> 744
    //   1026: aload_0
    //   1027: getfield 310	com/tencent/mm/plugin/mmsight/model/b/b:mVN	Landroid/media/MediaExtractor;
    //   1030: invokevirtual 436	android/media/MediaExtractor:getSampleTrackIndex	()I
    //   1033: iload_1
    //   1034: if_icmpeq +14 -> 1048
    //   1037: ldc 76
    //   1039: ldc_w 438
    //   1042: invokestatic 440	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   1045: goto -301 -> 744
    //   1048: aload 5
    //   1050: iconst_0
    //   1051: invokevirtual 444	java/nio/ByteBuffer:position	(I)Ljava/nio/Buffer;
    //   1054: pop
    //   1055: aload_0
    //   1056: getfield 184	com/tencent/mm/plugin/mmsight/model/b/b:nap	I
    //   1059: aload 5
    //   1061: iload_2
    //   1062: invokestatic 448	com/tencent/mm/plugin/mmsight/segment/MP4MuxerJNI:writeAACData	(ILjava/nio/ByteBuffer;I)V
    //   1065: aload_0
    //   1066: getfield 310	com/tencent/mm/plugin/mmsight/model/b/b:mVN	Landroid/media/MediaExtractor;
    //   1069: invokevirtual 452	android/media/MediaExtractor:advance	()Z
    //   1072: pop
    //   1073: goto -388 -> 685
    //   1076: goto -270 -> 806
    //   1079: iconst_m1
    //   1080: istore_1
    //   1081: aconst_null
    //   1082: astore 7
    //   1084: aload 5
    //   1086: astore 6
    //   1088: aload 7
    //   1090: astore 5
    //   1092: goto -494 -> 598
    //   1095: iload_1
    //   1096: iconst_1
    //   1097: iadd
    //   1098: istore_1
    //   1099: goto -551 -> 548
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1102	0	this	b
    //   21	1078	1	i	int
    //   19	1043	2	j	int
    //   789	46	3	l	long
    //   366	516	5	localObject1	Object
    //   918	17	5	localException1	Exception
    //   946	16	5	localException2	Exception
    //   980	105	5	localIOException	java.io.IOException
    //   1090	1	5	localObject2	Object
    //   592	495	6	localObject3	Object
    //   567	522	7	localMediaFormat	android.media.MediaFormat
    // Exception table:
    //   from	to	target	type
    //   504	521	918	java/lang/Exception
    //   466	504	946	java/lang/Exception
    //   521	532	946	java/lang/Exception
    //   532	543	946	java/lang/Exception
    //   548	590	946	java/lang/Exception
    //   607	672	946	java/lang/Exception
    //   672	685	946	java/lang/Exception
    //   685	721	946	java/lang/Exception
    //   725	744	946	java/lang/Exception
    //   744	750	946	java/lang/Exception
    //   754	784	946	java/lang/Exception
    //   784	790	946	java/lang/Exception
    //   796	806	946	java/lang/Exception
    //   806	887	946	java/lang/Exception
    //   887	900	946	java/lang/Exception
    //   920	943	946	java/lang/Exception
    //   982	1004	946	java/lang/Exception
    //   1007	1045	946	java/lang/Exception
    //   1048	1073	946	java/lang/Exception
    //   532	543	980	java/io/IOException
  }
  
  public final int getType()
  {
    GMTrace.i(20196144185344L, 150473);
    GMTrace.o(20196144185344L, 150473);
    return 3;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\mmsight\model\b\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */