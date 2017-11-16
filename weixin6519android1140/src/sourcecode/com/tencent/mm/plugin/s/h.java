package com.tencent.mm.plugin.s;

import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.util.Pair;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.util.List;

public abstract class h
{
  private volatile Object lock;
  protected g mVD;
  protected ae mVE;
  private boolean mVF;
  public b mVG;
  protected long mVH;
  MediaFormat mVI;
  private String mVJ;
  long mVK;
  int mVL;
  private MediaCodec.BufferInfo mVM;
  MediaExtractor mVN;
  private f mVO;
  protected MediaCodec mVP;
  private int mVQ;
  private ByteBuffer[] mVR;
  private int mVS;
  private ByteBuffer[] mVT;
  private boolean mVU;
  private boolean mVV;
  protected String path;
  protected int state;
  
  public h(g paramg, ae paramae)
  {
    GMTrace.i(12901142233088L, 96121);
    this.mVF = false;
    this.mVG = null;
    this.mVH = 0L;
    this.mVM = new MediaCodec.BufferInfo();
    this.lock = new Object();
    this.mVU = false;
    this.mVV = false;
    this.mVD = paramg;
    this.mVE = paramae;
    this.state = 0;
    this.mVQ = -1;
    this.mVS = -1;
    GMTrace.o(12901142233088L, 96121);
  }
  
  private void aOD()
  {
    GMTrace.i(12901410668544L, 96123);
    if (this.mVG != null) {
      this.mVH = (this.mVG.aOw() * 1000L);
    }
    GMTrace.o(12901410668544L, 96123);
  }
  
  private boolean n(long paramLong1, long paramLong2)
  {
    GMTrace.i(20976754491392L, 156289);
    w.d("MicroMsg.TrackDataSource", "%s drain output buffer time[%d %d] index %d", new Object[] { aiJ(), Long.valueOf(paramLong1), Long.valueOf(paramLong2), Integer.valueOf(this.mVS) });
    if (this.mVS < 0)
    {
      synchronized (this.lock)
      {
        this.mVS = this.mVP.dequeueOutputBuffer(this.mVM, 0L);
        if (this.mVS < 0) {
          break label307;
        }
        if ((this.mVM.flags & 0x4) != 0)
        {
          w.i("MicroMsg.TrackDataSource", "%s process end of stream", new Object[] { aiJ() });
          setState(9);
          this.mVS = -1;
          GMTrace.o(20976754491392L, 156289);
          return false;
        }
      }
      ??? = this.mVT[this.mVS];
      if (??? != null)
      {
        ((ByteBuffer)???).position(this.mVM.offset);
        ((ByteBuffer)???).limit(this.mVM.offset + this.mVM.size);
      }
    }
    int i;
    if (this.state == 1) {
      i = 1;
    }
    for (;;)
    {
      if (i != 0) {
        setState(2);
      }
      w.d("MicroMsg.TrackDataSource", "%s process output buffer index %d ", new Object[] { aiJ(), Integer.valueOf(this.mVS) });
      synchronized (this.lock)
      {
        if (a(paramLong1, paramLong2, this.mVP, this.mVT[this.mVS], this.mVS, this.mVM))
        {
          this.mVS = -1;
          GMTrace.o(20976754491392L, 156289);
          return true;
          label307:
          if (this.mVS == -2)
          {
            this.mVI = this.mVP.getOutputFormat();
            b(this.mVP);
            GMTrace.o(20976754491392L, 156289);
            return true;
          }
          if (this.mVS == -3)
          {
            this.mVT = this.mVP.getOutputBuffers();
            GMTrace.o(20976754491392L, 156289);
            return true;
          }
          w.d("MicroMsg.TrackDataSource", "%s drain output buffer error outputIndex[%d]", new Object[] { aiJ(), Integer.valueOf(this.mVS) });
          GMTrace.o(20976754491392L, 156289);
          return false;
          i = 0;
          continue;
        }
        GMTrace.o(20976754491392L, 156289);
        return false;
      }
    }
  }
  
  protected void a(MediaFormat paramMediaFormat, String paramString, int paramInt)
  {
    GMTrace.i(12902752845824L, 96133);
    w.i("MicroMsg.TrackDataSource", "%s found media format mime[%s] track[%d]", new Object[] { aiJ(), paramString, Integer.valueOf(paramInt) });
    this.mVL = paramInt;
    this.mVJ = paramString;
    this.mVK = (paramMediaFormat.getLong("durationUs") / 1000L);
    this.mVI = paramMediaFormat;
    GMTrace.o(12902752845824L, 96133);
  }
  
  abstract boolean a(long paramLong1, long paramLong2, MediaCodec paramMediaCodec, ByteBuffer paramByteBuffer, int paramInt, MediaCodec.BufferInfo paramBufferInfo);
  
  abstract boolean a(MediaCodec paramMediaCodec);
  
  public final void aOE()
  {
    GMTrace.i(12901544886272L, 96124);
    w.i("MicroMsg.TrackDataSource", "%s flush codec", new Object[] { aiJ() });
    this.mVS = -1;
    this.mVQ = -1;
    try
    {
      if (this.mVP != null) {
        this.mVP.flush();
      }
      GMTrace.o(12901544886272L, 96124);
      return;
    }
    catch (Exception localException)
    {
      GMTrace.o(12901544886272L, 96124);
    }
  }
  
  protected final boolean aOF()
  {
    GMTrace.i(17459176275968L, 130081);
    try
    {
      w.i("MicroMsg.TrackDataSource", "%s start to prepare decoder mime[%s]", new Object[] { aiJ(), this.mVJ });
      this.mVP = MediaCodec.createDecoderByType(this.mVJ);
      a(this.mVP);
      this.mVP.start();
      this.mVR = this.mVP.getInputBuffers();
      this.mVT = this.mVP.getOutputBuffers();
      GMTrace.o(17459176275968L, 130081);
      return true;
    }
    catch (Exception localException)
    {
      w.printErrStackTrace("MicroMsg.TrackDataSource", localException, "%s prepare decoder init decoder error ", new Object[] { aiJ() });
      this.mVD.CF(aOv());
      GMTrace.o(17459176275968L, 130081);
    }
    return false;
  }
  
  /* Error */
  public final boolean aOG()
  {
    // Byte code:
    //   0: ldc2_w 257
    //   3: ldc_w 259
    //   6: invokestatic 54	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: ldc 104
    //   11: ldc_w 261
    //   14: iconst_2
    //   15: anewarray 4	java/lang/Object
    //   18: dup
    //   19: iconst_0
    //   20: aload_0
    //   21: invokevirtual 110	com/tencent/mm/plugin/s/h:aiJ	()Ljava/lang/String;
    //   24: aastore
    //   25: dup
    //   26: iconst_1
    //   27: aload_0
    //   28: getfield 263	com/tencent/mm/plugin/s/h:path	Ljava/lang/String;
    //   31: aastore
    //   32: invokestatic 142	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   35: invokestatic 268	com/tencent/mm/sdk/platformtools/bg:Pw	()J
    //   38: lstore 5
    //   40: lconst_0
    //   41: lstore_3
    //   42: ldc 104
    //   44: ldc_w 270
    //   47: iconst_1
    //   48: anewarray 4	java/lang/Object
    //   51: dup
    //   52: iconst_0
    //   53: aload_0
    //   54: invokevirtual 110	com/tencent/mm/plugin/s/h:aiJ	()Ljava/lang/String;
    //   57: aastore
    //   58: invokestatic 142	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   61: aload_0
    //   62: new 272	android/media/MediaExtractor
    //   65: dup
    //   66: invokespecial 273	android/media/MediaExtractor:<init>	()V
    //   69: putfield 275	com/tencent/mm/plugin/s/h:mVN	Landroid/media/MediaExtractor;
    //   72: aload_0
    //   73: getfield 275	com/tencent/mm/plugin/s/h:mVN	Landroid/media/MediaExtractor;
    //   76: aload_0
    //   77: getfield 263	com/tencent/mm/plugin/s/h:path	Ljava/lang/String;
    //   80: invokevirtual 278	android/media/MediaExtractor:setDataSource	(Ljava/lang/String;)V
    //   83: aload_0
    //   84: getfield 275	com/tencent/mm/plugin/s/h:mVN	Landroid/media/MediaExtractor;
    //   87: invokevirtual 282	android/media/MediaExtractor:getTrackCount	()I
    //   90: istore_2
    //   91: aload_0
    //   92: iconst_m1
    //   93: putfield 193	com/tencent/mm/plugin/s/h:mVL	I
    //   96: iconst_0
    //   97: istore_1
    //   98: iload_1
    //   99: iload_2
    //   100: if_icmpge +49 -> 149
    //   103: aload_0
    //   104: getfield 275	com/tencent/mm/plugin/s/h:mVN	Landroid/media/MediaExtractor;
    //   107: iload_1
    //   108: invokevirtual 286	android/media/MediaExtractor:getTrackFormat	(I)Landroid/media/MediaFormat;
    //   111: astore 9
    //   113: aload 9
    //   115: ldc_w 288
    //   118: invokevirtual 292	android/media/MediaFormat:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   121: astore 10
    //   123: aload 10
    //   125: ifnull +88 -> 213
    //   128: aload 10
    //   130: aload_0
    //   131: invokevirtual 247	com/tencent/mm/plugin/s/h:aOv	()Ljava/lang/String;
    //   134: invokevirtual 298	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   137: ifeq +76 -> 213
    //   140: aload_0
    //   141: aload 9
    //   143: aload 10
    //   145: iload_1
    //   146: invokevirtual 300	com/tencent/mm/plugin/s/h:a	(Landroid/media/MediaFormat;Ljava/lang/String;I)V
    //   149: aload_0
    //   150: getfield 193	com/tencent/mm/plugin/s/h:mVL	I
    //   153: ifge +67 -> 220
    //   156: ldc 104
    //   158: ldc_w 302
    //   161: iconst_3
    //   162: anewarray 4	java/lang/Object
    //   165: dup
    //   166: iconst_0
    //   167: aload_0
    //   168: invokevirtual 110	com/tencent/mm/plugin/s/h:aiJ	()Ljava/lang/String;
    //   171: aastore
    //   172: dup
    //   173: iconst_1
    //   174: iload_2
    //   175: invokestatic 121	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   178: aastore
    //   179: dup
    //   180: iconst_2
    //   181: aload_0
    //   182: getfield 193	com/tencent/mm/plugin/s/h:mVL	I
    //   185: invokestatic 121	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   188: aastore
    //   189: invokestatic 305	com/tencent/mm/sdk/platformtools/w:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   192: aload_0
    //   193: getfield 73	com/tencent/mm/plugin/s/h:mVD	Lcom/tencent/mm/plugin/s/g;
    //   196: ldc_w 307
    //   199: invokevirtual 310	com/tencent/mm/plugin/s/g:CE	(Ljava/lang/String;)V
    //   202: ldc2_w 257
    //   205: ldc_w 259
    //   208: invokestatic 84	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   211: iconst_0
    //   212: ireturn
    //   213: iload_1
    //   214: iconst_1
    //   215: iadd
    //   216: istore_1
    //   217: goto -119 -> 98
    //   220: aload_0
    //   221: getfield 275	com/tencent/mm/plugin/s/h:mVN	Landroid/media/MediaExtractor;
    //   224: aload_0
    //   225: getfield 193	com/tencent/mm/plugin/s/h:mVL	I
    //   228: invokevirtual 313	android/media/MediaExtractor:selectTrack	(I)V
    //   231: aload_0
    //   232: aconst_null
    //   233: putfield 315	com/tencent/mm/plugin/s/h:mVO	Lcom/tencent/mm/plugin/s/f;
    //   236: invokestatic 268	com/tencent/mm/sdk/platformtools/bg:Pw	()J
    //   239: lstore 7
    //   241: ldc 104
    //   243: ldc_w 317
    //   246: iconst_3
    //   247: anewarray 4	java/lang/Object
    //   250: dup
    //   251: iconst_0
    //   252: aload_0
    //   253: invokevirtual 110	com/tencent/mm/plugin/s/h:aiJ	()Ljava/lang/String;
    //   256: aastore
    //   257: dup
    //   258: iconst_1
    //   259: aload_0
    //   260: getfield 195	com/tencent/mm/plugin/s/h:mVJ	Ljava/lang/String;
    //   263: aastore
    //   264: dup
    //   265: iconst_2
    //   266: aload_0
    //   267: getfield 77	com/tencent/mm/plugin/s/h:state	I
    //   270: invokestatic 121	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   273: aastore
    //   274: invokestatic 142	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   277: aload_0
    //   278: getfield 77	com/tencent/mm/plugin/s/h:state	I
    //   281: invokestatic 323	com/tencent/mm/plugin/s/d:qu	(I)Z
    //   284: ifne +68 -> 352
    //   287: aload_0
    //   288: getfield 67	com/tencent/mm/plugin/s/h:lock	Ljava/lang/Object;
    //   291: astore 9
    //   293: aload 9
    //   295: monitorenter
    //   296: aload_0
    //   297: aload_0
    //   298: getfield 195	com/tencent/mm/plugin/s/h:mVJ	Ljava/lang/String;
    //   301: invokestatic 228	android/media/MediaCodec:createDecoderByType	(Ljava/lang/String;)Landroid/media/MediaCodec;
    //   304: putfield 129	com/tencent/mm/plugin/s/h:mVP	Landroid/media/MediaCodec;
    //   307: aload_0
    //   308: aload_0
    //   309: getfield 129	com/tencent/mm/plugin/s/h:mVP	Landroid/media/MediaCodec;
    //   312: invokevirtual 230	com/tencent/mm/plugin/s/h:a	(Landroid/media/MediaCodec;)Z
    //   315: pop
    //   316: aload_0
    //   317: getfield 129	com/tencent/mm/plugin/s/h:mVP	Landroid/media/MediaCodec;
    //   320: invokevirtual 233	android/media/MediaCodec:start	()V
    //   323: aload_0
    //   324: aload_0
    //   325: getfield 129	com/tencent/mm/plugin/s/h:mVP	Landroid/media/MediaCodec;
    //   328: invokevirtual 236	android/media/MediaCodec:getInputBuffers	()[Ljava/nio/ByteBuffer;
    //   331: putfield 238	com/tencent/mm/plugin/s/h:mVR	[Ljava/nio/ByteBuffer;
    //   334: aload_0
    //   335: aload_0
    //   336: getfield 129	com/tencent/mm/plugin/s/h:mVP	Landroid/media/MediaCodec;
    //   339: invokevirtual 183	android/media/MediaCodec:getOutputBuffers	()[Ljava/nio/ByteBuffer;
    //   342: putfield 148	com/tencent/mm/plugin/s/h:mVT	[Ljava/nio/ByteBuffer;
    //   345: aload 9
    //   347: monitorexit
    //   348: invokestatic 268	com/tencent/mm/sdk/platformtools/bg:Pw	()J
    //   351: lstore_3
    //   352: aload_0
    //   353: iconst_1
    //   354: invokevirtual 146	com/tencent/mm/plugin/s/h:setState	(I)V
    //   357: ldc 104
    //   359: ldc_w 325
    //   362: iconst_4
    //   363: anewarray 4	java/lang/Object
    //   366: dup
    //   367: iconst_0
    //   368: aload_0
    //   369: invokevirtual 110	com/tencent/mm/plugin/s/h:aiJ	()Ljava/lang/String;
    //   372: aastore
    //   373: dup
    //   374: iconst_1
    //   375: lload 5
    //   377: invokestatic 329	com/tencent/mm/sdk/platformtools/bg:aI	(J)J
    //   380: invokestatic 116	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   383: aastore
    //   384: dup
    //   385: iconst_2
    //   386: lload 7
    //   388: lload 5
    //   390: lsub
    //   391: invokestatic 116	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   394: aastore
    //   395: dup
    //   396: iconst_3
    //   397: lload_3
    //   398: lload 5
    //   400: lsub
    //   401: invokestatic 116	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   404: aastore
    //   405: invokestatic 142	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   408: ldc2_w 257
    //   411: ldc_w 259
    //   414: invokestatic 84	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   417: iconst_1
    //   418: ireturn
    //   419: astore 9
    //   421: ldc 104
    //   423: aload 9
    //   425: ldc_w 331
    //   428: iconst_1
    //   429: anewarray 4	java/lang/Object
    //   432: dup
    //   433: iconst_0
    //   434: aload_0
    //   435: invokevirtual 110	com/tencent/mm/plugin/s/h:aiJ	()Ljava/lang/String;
    //   438: aastore
    //   439: invokestatic 244	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   442: aload_0
    //   443: getfield 73	com/tencent/mm/plugin/s/h:mVD	Lcom/tencent/mm/plugin/s/g;
    //   446: aload 9
    //   448: invokevirtual 334	java/lang/Exception:toString	()Ljava/lang/String;
    //   451: invokevirtual 310	com/tencent/mm/plugin/s/g:CE	(Ljava/lang/String;)V
    //   454: ldc2_w 257
    //   457: ldc_w 259
    //   460: invokestatic 84	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   463: iconst_0
    //   464: ireturn
    //   465: astore 9
    //   467: ldc 104
    //   469: ldc_w 336
    //   472: iconst_2
    //   473: anewarray 4	java/lang/Object
    //   476: dup
    //   477: iconst_0
    //   478: aload_0
    //   479: invokevirtual 110	com/tencent/mm/plugin/s/h:aiJ	()Ljava/lang/String;
    //   482: aastore
    //   483: dup
    //   484: iconst_1
    //   485: aload 9
    //   487: invokevirtual 337	java/lang/Throwable:toString	()Ljava/lang/String;
    //   490: aastore
    //   491: invokestatic 340	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   494: aload_0
    //   495: getfield 73	com/tencent/mm/plugin/s/h:mVD	Lcom/tencent/mm/plugin/s/g;
    //   498: aload 9
    //   500: invokevirtual 337	java/lang/Throwable:toString	()Ljava/lang/String;
    //   503: invokevirtual 310	com/tencent/mm/plugin/s/g:CE	(Ljava/lang/String;)V
    //   506: ldc2_w 257
    //   509: ldc_w 259
    //   512: invokestatic 84	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   515: iconst_0
    //   516: ireturn
    //   517: astore 10
    //   519: aload 9
    //   521: monitorexit
    //   522: aload 10
    //   524: athrow
    //   525: astore 9
    //   527: ldc 104
    //   529: ldc_w 342
    //   532: iconst_2
    //   533: anewarray 4	java/lang/Object
    //   536: dup
    //   537: iconst_0
    //   538: aload_0
    //   539: invokevirtual 110	com/tencent/mm/plugin/s/h:aiJ	()Ljava/lang/String;
    //   542: aastore
    //   543: dup
    //   544: iconst_1
    //   545: aload 9
    //   547: invokevirtual 334	java/lang/Exception:toString	()Ljava/lang/String;
    //   550: aastore
    //   551: invokestatic 340	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   554: aload_0
    //   555: getfield 73	com/tencent/mm/plugin/s/h:mVD	Lcom/tencent/mm/plugin/s/g;
    //   558: aload_0
    //   559: invokevirtual 247	com/tencent/mm/plugin/s/h:aOv	()Ljava/lang/String;
    //   562: invokevirtual 253	com/tencent/mm/plugin/s/g:CF	(Ljava/lang/String;)V
    //   565: ldc2_w 257
    //   568: ldc_w 259
    //   571: invokestatic 84	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   574: iconst_0
    //   575: ireturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	576	0	this	h
    //   97	120	1	i	int
    //   90	85	2	j	int
    //   41	357	3	l1	long
    //   38	361	5	l2	long
    //   239	148	7	l3	long
    //   419	28	9	localException1	Exception
    //   465	55	9	localThrowable	Throwable
    //   525	21	9	localException2	Exception
    //   121	23	10	str	String
    //   517	6	10	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   42	96	419	java/lang/Exception
    //   103	123	419	java/lang/Exception
    //   128	149	419	java/lang/Exception
    //   149	202	419	java/lang/Exception
    //   220	241	419	java/lang/Exception
    //   42	96	465	java/lang/Throwable
    //   103	123	465	java/lang/Throwable
    //   128	149	465	java/lang/Throwable
    //   149	202	465	java/lang/Throwable
    //   220	241	465	java/lang/Throwable
    //   296	348	517	finally
    //   519	522	517	finally
    //   241	277	525	java/lang/Exception
    //   277	296	525	java/lang/Exception
    //   348	352	525	java/lang/Exception
    //   522	525	525	java/lang/Exception
  }
  
  abstract String aOv();
  
  public final String aiJ()
  {
    GMTrace.i(12903826587648L, 96141);
    String str = aOv() + "_" + this.mVD.aiJ();
    GMTrace.o(12903826587648L, 96141);
    return str;
  }
  
  protected void b(MediaCodec paramMediaCodec)
  {
    GMTrace.i(12903289716736L, 96137);
    GMTrace.o(12903289716736L, 96137);
  }
  
  /* Error */
  protected final int m(long paramLong1, long paramLong2)
  {
    // Byte code:
    //   0: ldc2_w 362
    //   3: ldc_w 364
    //   6: invokestatic 54	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: ldc 104
    //   11: ldc_w 366
    //   14: iconst_4
    //   15: anewarray 4	java/lang/Object
    //   18: dup
    //   19: iconst_0
    //   20: aload_0
    //   21: invokevirtual 110	com/tencent/mm/plugin/s/h:aiJ	()Ljava/lang/String;
    //   24: aastore
    //   25: dup
    //   26: iconst_1
    //   27: lload_1
    //   28: invokestatic 116	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   31: aastore
    //   32: dup
    //   33: iconst_2
    //   34: lload_3
    //   35: invokestatic 116	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   38: aastore
    //   39: dup
    //   40: iconst_3
    //   41: aload_0
    //   42: getfield 77	com/tencent/mm/plugin/s/h:state	I
    //   45: invokestatic 121	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   48: aastore
    //   49: invokestatic 127	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   52: aload_0
    //   53: getfield 129	com/tencent/mm/plugin/s/h:mVP	Landroid/media/MediaCodec;
    //   56: ifnull +111 -> 167
    //   59: aload_0
    //   60: lload_1
    //   61: lload_3
    //   62: invokespecial 368	com/tencent/mm/plugin/s/h:n	(JJ)Z
    //   65: ifeq +17 -> 82
    //   68: aload_0
    //   69: getfield 77	com/tencent/mm/plugin/s/h:state	I
    //   72: invokestatic 323	com/tencent/mm/plugin/s/d:qu	(I)Z
    //   75: istore 9
    //   77: iload 9
    //   79: ifeq -20 -> 59
    //   82: ldc 104
    //   84: ldc_w 370
    //   87: iconst_4
    //   88: anewarray 4	java/lang/Object
    //   91: dup
    //   92: iconst_0
    //   93: aload_0
    //   94: invokevirtual 110	com/tencent/mm/plugin/s/h:aiJ	()Ljava/lang/String;
    //   97: aastore
    //   98: dup
    //   99: iconst_1
    //   100: aload_0
    //   101: getfield 79	com/tencent/mm/plugin/s/h:mVQ	I
    //   104: invokestatic 121	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   107: aastore
    //   108: dup
    //   109: iconst_2
    //   110: aload_0
    //   111: getfield 77	com/tencent/mm/plugin/s/h:state	I
    //   114: invokestatic 121	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   117: aastore
    //   118: dup
    //   119: iconst_3
    //   120: aload_0
    //   121: getfield 56	com/tencent/mm/plugin/s/h:mVF	Z
    //   124: invokestatic 375	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   127: aastore
    //   128: invokestatic 127	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   131: aload_0
    //   132: getfield 77	com/tencent/mm/plugin/s/h:state	I
    //   135: invokestatic 323	com/tencent/mm/plugin/s/d:qu	(I)Z
    //   138: ifne +10 -> 148
    //   141: aload_0
    //   142: getfield 56	com/tencent/mm/plugin/s/h:mVF	Z
    //   145: ifeq +235 -> 380
    //   148: ldc 104
    //   150: ldc_w 377
    //   153: iconst_1
    //   154: anewarray 4	java/lang/Object
    //   157: dup
    //   158: iconst_0
    //   159: aload_0
    //   160: invokevirtual 110	com/tencent/mm/plugin/s/h:aiJ	()Ljava/lang/String;
    //   163: aastore
    //   164: invokestatic 142	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   167: ldc 104
    //   169: ldc_w 379
    //   172: iconst_2
    //   173: anewarray 4	java/lang/Object
    //   176: dup
    //   177: iconst_0
    //   178: aload_0
    //   179: invokevirtual 110	com/tencent/mm/plugin/s/h:aiJ	()Ljava/lang/String;
    //   182: aastore
    //   183: dup
    //   184: iconst_1
    //   185: aload_0
    //   186: getfield 77	com/tencent/mm/plugin/s/h:state	I
    //   189: invokestatic 121	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   192: aastore
    //   193: invokestatic 127	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   196: aload_0
    //   197: getfield 77	com/tencent/mm/plugin/s/h:state	I
    //   200: istore 5
    //   202: ldc2_w 362
    //   205: ldc_w 364
    //   208: invokestatic 84	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   211: iload 5
    //   213: ireturn
    //   214: astore 10
    //   216: aload_0
    //   217: getfield 69	com/tencent/mm/plugin/s/h:mVU	Z
    //   220: ifeq +131 -> 351
    //   223: ldc 104
    //   225: ldc_w 381
    //   228: iconst_2
    //   229: anewarray 4	java/lang/Object
    //   232: dup
    //   233: iconst_0
    //   234: aload_0
    //   235: invokevirtual 110	com/tencent/mm/plugin/s/h:aiJ	()Ljava/lang/String;
    //   238: aastore
    //   239: dup
    //   240: iconst_1
    //   241: aload 10
    //   243: invokevirtual 334	java/lang/Exception:toString	()Ljava/lang/String;
    //   246: aastore
    //   247: invokestatic 340	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   250: aload_0
    //   251: getfield 77	com/tencent/mm/plugin/s/h:state	I
    //   254: invokestatic 323	com/tencent/mm/plugin/s/d:qu	(I)Z
    //   257: ifne +7 -> 264
    //   260: aload_0
    //   261: invokevirtual 383	com/tencent/mm/plugin/s/h:aOE	()V
    //   264: aload_0
    //   265: getfield 73	com/tencent/mm/plugin/s/h:mVD	Lcom/tencent/mm/plugin/s/g;
    //   268: astore 10
    //   270: aload_0
    //   271: invokevirtual 247	com/tencent/mm/plugin/s/h:aOv	()Ljava/lang/String;
    //   274: astore 11
    //   276: aload 10
    //   278: getfield 386	com/tencent/mm/plugin/s/g:mVC	Z
    //   281: ifne -199 -> 82
    //   284: aload 10
    //   286: getfield 389	com/tencent/mm/plugin/s/g:mVx	Z
    //   289: ifeq -207 -> 82
    //   292: getstatic 395	com/tencent/mm/plugin/report/service/g:ork	Lcom/tencent/mm/plugin/report/service/g;
    //   295: ldc2_w 396
    //   298: ldc2_w 398
    //   301: lconst_1
    //   302: iconst_0
    //   303: invokevirtual 402	com/tencent/mm/plugin/report/service/g:a	(JJJZ)V
    //   306: getstatic 395	com/tencent/mm/plugin/report/service/g:ork	Lcom/tencent/mm/plugin/report/service/g;
    //   309: sipush 13836
    //   312: iconst_3
    //   313: anewarray 4	java/lang/Object
    //   316: dup
    //   317: iconst_0
    //   318: sipush 506
    //   321: invokestatic 121	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   324: aastore
    //   325: dup
    //   326: iconst_1
    //   327: invokestatic 405	com/tencent/mm/sdk/platformtools/bg:Pu	()J
    //   330: invokestatic 116	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   333: aastore
    //   334: dup
    //   335: iconst_2
    //   336: aload 11
    //   338: aastore
    //   339: invokevirtual 408	com/tencent/mm/plugin/report/service/g:i	(I[Ljava/lang/Object;)V
    //   342: aload 10
    //   344: iconst_1
    //   345: putfield 386	com/tencent/mm/plugin/s/g:mVC	Z
    //   348: goto -266 -> 82
    //   351: aload_0
    //   352: iconst_1
    //   353: putfield 69	com/tencent/mm/plugin/s/h:mVU	Z
    //   356: ldc 104
    //   358: aload 10
    //   360: ldc_w 410
    //   363: iconst_1
    //   364: anewarray 4	java/lang/Object
    //   367: dup
    //   368: iconst_0
    //   369: aload_0
    //   370: invokevirtual 110	com/tencent/mm/plugin/s/h:aiJ	()Ljava/lang/String;
    //   373: aastore
    //   374: invokestatic 244	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   377: goto -127 -> 250
    //   380: aload_0
    //   381: getfield 79	com/tencent/mm/plugin/s/h:mVQ	I
    //   384: ifge +181 -> 565
    //   387: aload_0
    //   388: aload_0
    //   389: getfield 129	com/tencent/mm/plugin/s/h:mVP	Landroid/media/MediaCodec;
    //   392: lconst_0
    //   393: invokevirtual 414	android/media/MediaCodec:dequeueInputBuffer	(J)I
    //   396: putfield 79	com/tencent/mm/plugin/s/h:mVQ	I
    //   399: aload_0
    //   400: getfield 79	com/tencent/mm/plugin/s/h:mVQ	I
    //   403: ifge +162 -> 565
    //   406: ldc 104
    //   408: ldc_w 416
    //   411: iconst_1
    //   412: anewarray 4	java/lang/Object
    //   415: dup
    //   416: iconst_0
    //   417: aload_0
    //   418: invokevirtual 110	com/tencent/mm/plugin/s/h:aiJ	()Ljava/lang/String;
    //   421: aastore
    //   422: invokestatic 127	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   425: goto -258 -> 167
    //   428: astore 10
    //   430: aload_0
    //   431: getfield 71	com/tencent/mm/plugin/s/h:mVV	Z
    //   434: ifeq +965 -> 1399
    //   437: ldc 104
    //   439: ldc_w 418
    //   442: iconst_2
    //   443: anewarray 4	java/lang/Object
    //   446: dup
    //   447: iconst_0
    //   448: aload_0
    //   449: invokevirtual 110	com/tencent/mm/plugin/s/h:aiJ	()Ljava/lang/String;
    //   452: aastore
    //   453: dup
    //   454: iconst_1
    //   455: aload 10
    //   457: invokevirtual 334	java/lang/Exception:toString	()Ljava/lang/String;
    //   460: aastore
    //   461: invokestatic 340	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   464: aload_0
    //   465: getfield 77	com/tencent/mm/plugin/s/h:state	I
    //   468: invokestatic 323	com/tencent/mm/plugin/s/d:qu	(I)Z
    //   471: ifne +7 -> 478
    //   474: aload_0
    //   475: invokevirtual 383	com/tencent/mm/plugin/s/h:aOE	()V
    //   478: aload_0
    //   479: getfield 73	com/tencent/mm/plugin/s/h:mVD	Lcom/tencent/mm/plugin/s/g;
    //   482: astore 10
    //   484: aload_0
    //   485: invokevirtual 247	com/tencent/mm/plugin/s/h:aOv	()Ljava/lang/String;
    //   488: astore 11
    //   490: aload 10
    //   492: getfield 421	com/tencent/mm/plugin/s/g:mVB	Z
    //   495: ifne -328 -> 167
    //   498: aload 10
    //   500: getfield 389	com/tencent/mm/plugin/s/g:mVx	Z
    //   503: ifeq -336 -> 167
    //   506: getstatic 395	com/tencent/mm/plugin/report/service/g:ork	Lcom/tencent/mm/plugin/report/service/g;
    //   509: ldc2_w 396
    //   512: ldc2_w 422
    //   515: lconst_1
    //   516: iconst_0
    //   517: invokevirtual 402	com/tencent/mm/plugin/report/service/g:a	(JJJZ)V
    //   520: getstatic 395	com/tencent/mm/plugin/report/service/g:ork	Lcom/tencent/mm/plugin/report/service/g;
    //   523: sipush 13836
    //   526: iconst_3
    //   527: anewarray 4	java/lang/Object
    //   530: dup
    //   531: iconst_0
    //   532: sipush 505
    //   535: invokestatic 121	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   538: aastore
    //   539: dup
    //   540: iconst_1
    //   541: invokestatic 405	com/tencent/mm/sdk/platformtools/bg:Pu	()J
    //   544: invokestatic 116	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   547: aastore
    //   548: dup
    //   549: iconst_2
    //   550: aload 11
    //   552: aastore
    //   553: invokevirtual 408	com/tencent/mm/plugin/report/service/g:i	(I[Ljava/lang/Object;)V
    //   556: aload 10
    //   558: iconst_1
    //   559: putfield 421	com/tencent/mm/plugin/s/g:mVB	Z
    //   562: goto -395 -> 167
    //   565: aload_0
    //   566: getfield 238	com/tencent/mm/plugin/s/h:mVR	[Ljava/nio/ByteBuffer;
    //   569: aload_0
    //   570: getfield 79	com/tencent/mm/plugin/s/h:mVQ	I
    //   573: aaload
    //   574: astore 10
    //   576: aload_0
    //   577: getfield 315	com/tencent/mm/plugin/s/h:mVO	Lcom/tencent/mm/plugin/s/f;
    //   580: ifnull +216 -> 796
    //   583: aload_0
    //   584: getfield 315	com/tencent/mm/plugin/s/h:mVO	Lcom/tencent/mm/plugin/s/f;
    //   587: aload 10
    //   589: invokevirtual 428	com/tencent/mm/plugin/s/f:n	(Ljava/nio/ByteBuffer;)I
    //   592: istore 5
    //   594: aload_0
    //   595: getfield 315	com/tencent/mm/plugin/s/h:mVO	Lcom/tencent/mm/plugin/s/f;
    //   598: getfield 432	com/tencent/mm/plugin/s/f:mVm	Lcom/tencent/mm/plugin/a/g;
    //   601: getfield 437	com/tencent/mm/plugin/a/g:hns	J
    //   604: lstore_1
    //   605: aload_0
    //   606: getfield 315	com/tencent/mm/plugin/s/h:mVO	Lcom/tencent/mm/plugin/s/f;
    //   609: getfield 432	com/tencent/mm/plugin/s/f:mVm	Lcom/tencent/mm/plugin/a/g;
    //   612: getfield 440	com/tencent/mm/plugin/a/g:hnt	I
    //   615: istore 6
    //   617: ldc 104
    //   619: ldc_w 442
    //   622: iconst_5
    //   623: anewarray 4	java/lang/Object
    //   626: dup
    //   627: iconst_0
    //   628: aload_0
    //   629: invokevirtual 110	com/tencent/mm/plugin/s/h:aiJ	()Ljava/lang/String;
    //   632: aastore
    //   633: dup
    //   634: iconst_1
    //   635: aload_0
    //   636: getfield 79	com/tencent/mm/plugin/s/h:mVQ	I
    //   639: invokestatic 121	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   642: aastore
    //   643: dup
    //   644: iconst_2
    //   645: iload 5
    //   647: invokestatic 121	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   650: aastore
    //   651: dup
    //   652: iconst_3
    //   653: lload_1
    //   654: invokestatic 116	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   657: aastore
    //   658: dup
    //   659: iconst_4
    //   660: iload 6
    //   662: invokestatic 121	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   665: aastore
    //   666: invokestatic 127	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   669: iload 5
    //   671: ifgt +26 -> 697
    //   674: aload_0
    //   675: getfield 129	com/tencent/mm/plugin/s/h:mVP	Landroid/media/MediaCodec;
    //   678: aload_0
    //   679: getfield 79	com/tencent/mm/plugin/s/h:mVQ	I
    //   682: iconst_0
    //   683: iconst_0
    //   684: lconst_0
    //   685: iconst_4
    //   686: invokevirtual 446	android/media/MediaCodec:queueInputBuffer	(IIIJI)V
    //   689: aload_0
    //   690: iconst_1
    //   691: putfield 56	com/tencent/mm/plugin/s/h:mVF	Z
    //   694: goto -527 -> 167
    //   697: aload_0
    //   698: getfield 129	com/tencent/mm/plugin/s/h:mVP	Landroid/media/MediaCodec;
    //   701: aload_0
    //   702: getfield 79	com/tencent/mm/plugin/s/h:mVQ	I
    //   705: iconst_0
    //   706: iload 5
    //   708: lload_1
    //   709: iconst_0
    //   710: invokevirtual 446	android/media/MediaCodec:queueInputBuffer	(IIIJI)V
    //   713: aload_0
    //   714: iconst_m1
    //   715: putfield 79	com/tencent/mm/plugin/s/h:mVQ	I
    //   718: aload_0
    //   719: getfield 315	com/tencent/mm/plugin/s/h:mVO	Lcom/tencent/mm/plugin/s/f;
    //   722: astore 10
    //   724: aload 10
    //   726: aload 10
    //   728: getfield 449	com/tencent/mm/plugin/s/f:mVn	I
    //   731: iconst_1
    //   732: iadd
    //   733: putfield 449	com/tencent/mm/plugin/s/f:mVn	I
    //   736: aload 10
    //   738: getfield 449	com/tencent/mm/plugin/s/f:mVn	I
    //   741: aload 10
    //   743: getfield 452	com/tencent/mm/plugin/s/f:mVo	I
    //   746: if_icmpge -579 -> 167
    //   749: aload 10
    //   751: aload 10
    //   753: getfield 456	com/tencent/mm/plugin/s/f:hnq	Ljava/util/List;
    //   756: aload 10
    //   758: getfield 449	com/tencent/mm/plugin/s/f:mVn	I
    //   761: invokeinterface 462 2 0
    //   766: checkcast 434	com/tencent/mm/plugin/a/g
    //   769: putfield 432	com/tencent/mm/plugin/s/f:mVm	Lcom/tencent/mm/plugin/a/g;
    //   772: ldc_w 464
    //   775: ldc_w 466
    //   778: iconst_1
    //   779: anewarray 4	java/lang/Object
    //   782: dup
    //   783: iconst_0
    //   784: aload 10
    //   786: getfield 432	com/tencent/mm/plugin/s/f:mVm	Lcom/tencent/mm/plugin/a/g;
    //   789: aastore
    //   790: invokestatic 127	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   793: goto -626 -> 167
    //   796: aload_0
    //   797: getfield 73	com/tencent/mm/plugin/s/h:mVD	Lcom/tencent/mm/plugin/s/g;
    //   800: getfield 469	com/tencent/mm/plugin/s/g:mVA	Z
    //   803: ifeq +41 -> 844
    //   806: aload_0
    //   807: getfield 129	com/tencent/mm/plugin/s/h:mVP	Landroid/media/MediaCodec;
    //   810: aload_0
    //   811: getfield 79	com/tencent/mm/plugin/s/h:mVQ	I
    //   814: iconst_0
    //   815: iconst_0
    //   816: aload_0
    //   817: getfield 205	com/tencent/mm/plugin/s/h:mVK	J
    //   820: ldc2_w 96
    //   823: lmul
    //   824: iconst_4
    //   825: invokevirtual 446	android/media/MediaCodec:queueInputBuffer	(IIIJI)V
    //   828: aload_0
    //   829: iconst_1
    //   830: putfield 56	com/tencent/mm/plugin/s/h:mVF	Z
    //   833: aload_0
    //   834: getfield 73	com/tencent/mm/plugin/s/h:mVD	Lcom/tencent/mm/plugin/s/g;
    //   837: iconst_0
    //   838: putfield 469	com/tencent/mm/plugin/s/g:mVA	Z
    //   841: goto -674 -> 167
    //   844: aload_0
    //   845: getfield 275	com/tencent/mm/plugin/s/h:mVN	Landroid/media/MediaExtractor;
    //   848: aload 10
    //   850: iconst_0
    //   851: invokevirtual 473	android/media/MediaExtractor:readSampleData	(Ljava/nio/ByteBuffer;I)I
    //   854: istore 5
    //   856: aload_0
    //   857: getfield 275	com/tencent/mm/plugin/s/h:mVN	Landroid/media/MediaExtractor;
    //   860: invokevirtual 476	android/media/MediaExtractor:getSampleTime	()J
    //   863: lstore_1
    //   864: aload_0
    //   865: getfield 275	com/tencent/mm/plugin/s/h:mVN	Landroid/media/MediaExtractor;
    //   868: invokevirtual 479	android/media/MediaExtractor:getSampleFlags	()I
    //   871: istore 6
    //   873: ldc 104
    //   875: ldc_w 442
    //   878: iconst_5
    //   879: anewarray 4	java/lang/Object
    //   882: dup
    //   883: iconst_0
    //   884: aload_0
    //   885: invokevirtual 110	com/tencent/mm/plugin/s/h:aiJ	()Ljava/lang/String;
    //   888: aastore
    //   889: dup
    //   890: iconst_1
    //   891: aload_0
    //   892: getfield 79	com/tencent/mm/plugin/s/h:mVQ	I
    //   895: invokestatic 121	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   898: aastore
    //   899: dup
    //   900: iconst_2
    //   901: iload 5
    //   903: invokestatic 121	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   906: aastore
    //   907: dup
    //   908: iconst_3
    //   909: lload_1
    //   910: invokestatic 116	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   913: aastore
    //   914: dup
    //   915: iconst_4
    //   916: iload 6
    //   918: invokestatic 121	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   921: aastore
    //   922: invokestatic 127	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   925: aload_0
    //   926: iload 6
    //   928: lload_1
    //   929: invokevirtual 483	com/tencent/mm/plugin/s/h:z	(IJ)Z
    //   932: pop
    //   933: iload 5
    //   935: ifgt +33 -> 968
    //   938: aload_0
    //   939: getfield 129	com/tencent/mm/plugin/s/h:mVP	Landroid/media/MediaCodec;
    //   942: aload_0
    //   943: getfield 79	com/tencent/mm/plugin/s/h:mVQ	I
    //   946: iconst_0
    //   947: iconst_0
    //   948: aload_0
    //   949: getfield 205	com/tencent/mm/plugin/s/h:mVK	J
    //   952: ldc2_w 96
    //   955: lmul
    //   956: iconst_4
    //   957: invokevirtual 446	android/media/MediaCodec:queueInputBuffer	(IIIJI)V
    //   960: aload_0
    //   961: iconst_1
    //   962: putfield 56	com/tencent/mm/plugin/s/h:mVF	Z
    //   965: goto -798 -> 167
    //   968: aload_0
    //   969: getfield 129	com/tencent/mm/plugin/s/h:mVP	Landroid/media/MediaCodec;
    //   972: aload_0
    //   973: getfield 79	com/tencent/mm/plugin/s/h:mVQ	I
    //   976: iconst_0
    //   977: iload 5
    //   979: lload_1
    //   980: iconst_0
    //   981: invokevirtual 446	android/media/MediaCodec:queueInputBuffer	(IIIJI)V
    //   984: aload_0
    //   985: iconst_m1
    //   986: putfield 79	com/tencent/mm/plugin/s/h:mVQ	I
    //   989: aload_0
    //   990: getfield 275	com/tencent/mm/plugin/s/h:mVN	Landroid/media/MediaExtractor;
    //   993: invokevirtual 486	android/media/MediaExtractor:advance	()Z
    //   996: pop
    //   997: aload_0
    //   998: getfield 275	com/tencent/mm/plugin/s/h:mVN	Landroid/media/MediaExtractor;
    //   1001: invokevirtual 476	android/media/MediaExtractor:getSampleTime	()J
    //   1004: lstore_3
    //   1005: aload_0
    //   1006: getfield 73	com/tencent/mm/plugin/s/h:mVD	Lcom/tencent/mm/plugin/s/g;
    //   1009: getfield 489	com/tencent/mm/plugin/s/g:mVz	Z
    //   1012: ifne +162 -> 1174
    //   1015: aload_0
    //   1016: lload_1
    //   1017: lload_3
    //   1018: invokevirtual 491	com/tencent/mm/plugin/s/h:o	(JJ)Z
    //   1021: ifeq +117 -> 1138
    //   1024: ldc 104
    //   1026: ldc_w 493
    //   1029: iconst_4
    //   1030: anewarray 4	java/lang/Object
    //   1033: dup
    //   1034: iconst_0
    //   1035: aload_0
    //   1036: invokevirtual 110	com/tencent/mm/plugin/s/h:aiJ	()Ljava/lang/String;
    //   1039: aastore
    //   1040: dup
    //   1041: iconst_1
    //   1042: aload_0
    //   1043: getfield 73	com/tencent/mm/plugin/s/h:mVD	Lcom/tencent/mm/plugin/s/g;
    //   1046: getfield 489	com/tencent/mm/plugin/s/g:mVz	Z
    //   1049: invokestatic 375	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   1052: aastore
    //   1053: dup
    //   1054: iconst_2
    //   1055: lload_3
    //   1056: invokestatic 116	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   1059: aastore
    //   1060: dup
    //   1061: iconst_3
    //   1062: aload_0
    //   1063: getfield 60	com/tencent/mm/plugin/s/h:mVH	J
    //   1066: invokestatic 116	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   1069: aastore
    //   1070: invokestatic 305	com/tencent/mm/sdk/platformtools/w:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1073: aload_0
    //   1074: getfield 275	com/tencent/mm/plugin/s/h:mVN	Landroid/media/MediaExtractor;
    //   1077: invokevirtual 476	android/media/MediaExtractor:getSampleTime	()J
    //   1080: lstore 7
    //   1082: lload 7
    //   1084: lload_1
    //   1085: lsub
    //   1086: invokestatic 498	java/lang/Math:abs	(J)J
    //   1089: ldc2_w 499
    //   1092: lcmp
    //   1093: iflt +45 -> 1138
    //   1096: ldc 104
    //   1098: ldc_w 502
    //   1101: iconst_3
    //   1102: anewarray 4	java/lang/Object
    //   1105: dup
    //   1106: iconst_0
    //   1107: aload_0
    //   1108: invokevirtual 110	com/tencent/mm/plugin/s/h:aiJ	()Ljava/lang/String;
    //   1111: aastore
    //   1112: dup
    //   1113: iconst_1
    //   1114: lload 7
    //   1116: invokestatic 116	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   1119: aastore
    //   1120: dup
    //   1121: iconst_2
    //   1122: lload_1
    //   1123: invokestatic 116	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   1126: aastore
    //   1127: invokestatic 305	com/tencent/mm/sdk/platformtools/w:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1130: aload_0
    //   1131: getfield 73	com/tencent/mm/plugin/s/h:mVD	Lcom/tencent/mm/plugin/s/g;
    //   1134: iconst_1
    //   1135: putfield 469	com/tencent/mm/plugin/s/g:mVA	Z
    //   1138: ldc 104
    //   1140: ldc_w 504
    //   1143: iconst_3
    //   1144: anewarray 4	java/lang/Object
    //   1147: dup
    //   1148: iconst_0
    //   1149: aload_0
    //   1150: invokevirtual 110	com/tencent/mm/plugin/s/h:aiJ	()Ljava/lang/String;
    //   1153: aastore
    //   1154: dup
    //   1155: iconst_1
    //   1156: lload_1
    //   1157: invokestatic 116	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   1160: aastore
    //   1161: dup
    //   1162: iconst_2
    //   1163: lload_3
    //   1164: invokestatic 116	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   1167: aastore
    //   1168: invokestatic 127	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1171: goto -1004 -> 167
    //   1174: aload_0
    //   1175: getfield 60	com/tencent/mm/plugin/s/h:mVH	J
    //   1178: lconst_0
    //   1179: lcmp
    //   1180: ifne +127 -> 1307
    //   1183: aload_0
    //   1184: lload_1
    //   1185: lload_3
    //   1186: invokevirtual 491	com/tencent/mm/plugin/s/h:o	(JJ)Z
    //   1189: ifeq -51 -> 1138
    //   1192: ldc 104
    //   1194: ldc_w 506
    //   1197: iconst_3
    //   1198: anewarray 4	java/lang/Object
    //   1201: dup
    //   1202: iconst_0
    //   1203: aload_0
    //   1204: invokevirtual 110	com/tencent/mm/plugin/s/h:aiJ	()Ljava/lang/String;
    //   1207: aastore
    //   1208: dup
    //   1209: iconst_1
    //   1210: lload_3
    //   1211: invokestatic 116	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   1214: aastore
    //   1215: dup
    //   1216: iconst_2
    //   1217: aload_0
    //   1218: getfield 60	com/tencent/mm/plugin/s/h:mVH	J
    //   1221: invokestatic 116	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   1224: aastore
    //   1225: invokestatic 305	com/tencent/mm/sdk/platformtools/w:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1228: aload_0
    //   1229: getfield 275	com/tencent/mm/plugin/s/h:mVN	Landroid/media/MediaExtractor;
    //   1232: invokevirtual 476	android/media/MediaExtractor:getSampleTime	()J
    //   1235: lstore 7
    //   1237: lload 7
    //   1239: lload_1
    //   1240: lsub
    //   1241: invokestatic 498	java/lang/Math:abs	(J)J
    //   1244: ldc2_w 507
    //   1247: lcmp
    //   1248: iflt +52 -> 1300
    //   1251: ldc 104
    //   1253: ldc_w 502
    //   1256: iconst_3
    //   1257: anewarray 4	java/lang/Object
    //   1260: dup
    //   1261: iconst_0
    //   1262: aload_0
    //   1263: invokevirtual 110	com/tencent/mm/plugin/s/h:aiJ	()Ljava/lang/String;
    //   1266: aastore
    //   1267: dup
    //   1268: iconst_1
    //   1269: lload 7
    //   1271: invokestatic 116	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   1274: aastore
    //   1275: dup
    //   1276: iconst_2
    //   1277: lload_1
    //   1278: invokestatic 116	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   1281: aastore
    //   1282: invokestatic 305	com/tencent/mm/sdk/platformtools/w:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1285: aload_0
    //   1286: getfield 75	com/tencent/mm/plugin/s/h:mVE	Lcom/tencent/mm/sdk/platformtools/ae;
    //   1289: iconst_5
    //   1290: bipush -2
    //   1292: bipush -2
    //   1294: invokevirtual 514	com/tencent/mm/sdk/platformtools/ae:obtainMessage	(III)Landroid/os/Message;
    //   1297: invokevirtual 519	android/os/Message:sendToTarget	()V
    //   1300: aload_0
    //   1301: invokespecial 521	com/tencent/mm/plugin/s/h:aOD	()V
    //   1304: goto -166 -> 1138
    //   1307: lload_3
    //   1308: lconst_0
    //   1309: lcmp
    //   1310: iflt +20 -> 1330
    //   1313: lload_3
    //   1314: ldc2_w 96
    //   1317: ldiv
    //   1318: ldc2_w 522
    //   1321: ladd
    //   1322: aload_0
    //   1323: getfield 60	com/tencent/mm/plugin/s/h:mVH	J
    //   1326: lcmp
    //   1327: ifle -189 -> 1138
    //   1330: ldc 104
    //   1332: ldc_w 506
    //   1335: iconst_3
    //   1336: anewarray 4	java/lang/Object
    //   1339: dup
    //   1340: iconst_0
    //   1341: aload_0
    //   1342: invokevirtual 110	com/tencent/mm/plugin/s/h:aiJ	()Ljava/lang/String;
    //   1345: aastore
    //   1346: dup
    //   1347: iconst_1
    //   1348: lload_3
    //   1349: invokestatic 116	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   1352: aastore
    //   1353: dup
    //   1354: iconst_2
    //   1355: aload_0
    //   1356: getfield 60	com/tencent/mm/plugin/s/h:mVH	J
    //   1359: invokestatic 116	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   1362: aastore
    //   1363: invokestatic 305	com/tencent/mm/sdk/platformtools/w:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1366: aload_0
    //   1367: lload_1
    //   1368: ldc2_w 524
    //   1371: invokevirtual 491	com/tencent/mm/plugin/s/h:o	(JJ)Z
    //   1374: ifeq +18 -> 1392
    //   1377: aload_0
    //   1378: getfield 75	com/tencent/mm/plugin/s/h:mVE	Lcom/tencent/mm/sdk/platformtools/ae;
    //   1381: iconst_5
    //   1382: bipush -3
    //   1384: bipush -3
    //   1386: invokevirtual 514	com/tencent/mm/sdk/platformtools/ae:obtainMessage	(III)Landroid/os/Message;
    //   1389: invokevirtual 519	android/os/Message:sendToTarget	()V
    //   1392: aload_0
    //   1393: invokespecial 521	com/tencent/mm/plugin/s/h:aOD	()V
    //   1396: goto -258 -> 1138
    //   1399: aload_0
    //   1400: iconst_1
    //   1401: putfield 71	com/tencent/mm/plugin/s/h:mVV	Z
    //   1404: ldc 104
    //   1406: aload 10
    //   1408: ldc_w 527
    //   1411: iconst_1
    //   1412: anewarray 4	java/lang/Object
    //   1415: dup
    //   1416: iconst_0
    //   1417: aload_0
    //   1418: invokevirtual 110	com/tencent/mm/plugin/s/h:aiJ	()Ljava/lang/String;
    //   1421: aastore
    //   1422: invokestatic 244	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1425: goto -961 -> 464
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1428	0	this	h
    //   0	1428	1	paramLong1	long
    //   0	1428	3	paramLong2	long
    //   200	778	5	i	int
    //   615	312	6	j	int
    //   1080	190	7	l	long
    //   75	3	9	bool	boolean
    //   214	28	10	localException1	Exception
    //   268	91	10	localg	g
    //   428	28	10	localException2	Exception
    //   482	925	10	localObject	Object
    //   274	277	11	str	String
    // Exception table:
    //   from	to	target	type
    //   59	77	214	java/lang/Exception
    //   82	148	428	java/lang/Exception
    //   148	167	428	java/lang/Exception
    //   380	425	428	java/lang/Exception
    //   565	669	428	java/lang/Exception
    //   674	694	428	java/lang/Exception
    //   697	793	428	java/lang/Exception
    //   796	841	428	java/lang/Exception
    //   844	933	428	java/lang/Exception
    //   938	965	428	java/lang/Exception
    //   968	1138	428	java/lang/Exception
    //   1138	1171	428	java/lang/Exception
    //   1174	1300	428	java/lang/Exception
    //   1300	1304	428	java/lang/Exception
    //   1313	1330	428	java/lang/Exception
    //   1330	1392	428	java/lang/Exception
    //   1392	1396	428	java/lang/Exception
  }
  
  protected final boolean o(long paramLong1, long paramLong2)
  {
    GMTrace.i(12902484410368L, 96131);
    long l1 = bg.Pw();
    try
    {
      if ((paramLong1 / 1000L + 1000L < this.mVK) && (paramLong2 == -1L))
      {
        this.mVD.mVy = true;
        this.mVF = false;
        this.mVN.release();
        this.mVN = new MediaExtractor();
        this.mVN.setDataSource(this.path);
        this.mVN.selectTrack(this.mVL);
        this.mVN.seekTo(paramLong1, 2);
        long l2 = this.mVN.getSampleTime();
        w.w("MicroMsg.TrackDataSource", "%s it don't play end. currTime[%d] afterSeek[%d] nextSampleTime[%d] onlineCacheMs[%d] cost[%d]", new Object[] { aiJ(), Long.valueOf(paramLong1), Long.valueOf(l2), Long.valueOf(paramLong2), Long.valueOf(this.mVH), Long.valueOf(bg.aI(l1)) });
        GMTrace.o(12902484410368L, 96131);
        return true;
      }
    }
    catch (Exception localException)
    {
      w.e("MicroMsg.TrackDataSource", "%s reset extractor error %s", new Object[] { aiJ(), localException.toString() });
      GMTrace.o(12902484410368L, 96131);
    }
    return false;
  }
  
  protected void onPause()
  {
    GMTrace.i(12903558152192L, 96139);
    GMTrace.o(12903558152192L, 96139);
  }
  
  protected void onStart()
  {
    GMTrace.i(12903423934464L, 96138);
    GMTrace.o(12903423934464L, 96138);
  }
  
  public final void pause()
  {
    GMTrace.i(12901947539456L, 96127);
    w.i("MicroMsg.TrackDataSource", "%s start to pause", new Object[] { aiJ() });
    setState(4);
    onPause();
    GMTrace.o(12901947539456L, 96127);
  }
  
  public final long qy(int paramInt)
  {
    GMTrace.i(12902081757184L, 96128);
    w.i("MicroMsg.TrackDataSource", "%s start to seek to ms[%d] isFeedEnd[%b]", new Object[] { aiJ(), Integer.valueOf(paramInt), Boolean.valueOf(this.mVF) });
    aOE();
    this.mVF = false;
    long l;
    if (this.mVO != null) {
      for (;;)
      {
        try
        {
          f localf = this.mVO;
          l = paramInt * 1000;
          int i = 0;
          if (i < localf.hnr.size())
          {
            Pair localPair = (Pair)localf.hnr.get(i);
            if (l >= ((Long)localPair.second).longValue())
            {
              if (l == ((Long)localPair.second).longValue())
              {
                localf.mVn = ((Integer)localPair.first).intValue();
                localf.mVm = ((com.tencent.mm.plugin.a.g)localf.hnq.get(localf.mVn));
                if (this.mVO.mVm.hns < 0L) {
                  o(paramInt * 1000L, -1L);
                }
                if (this.mVO.mVm.hns < 0L)
                {
                  o(0L, -1L);
                  this.mVD.aOC();
                }
                l = this.mVO.mVm.hns;
                w.i("MicroMsg.TrackDataSource", "%s finish to seek extractor [%d]", new Object[] { aiJ(), Long.valueOf(l) });
                l /= 1000L;
                GMTrace.o(12902081757184L, 96128);
                return l;
              }
              i += 1;
              continue;
            }
          }
          if ((i == 0) || (i == localf.hnr.size() - 1))
          {
            localf.mVn = ((Integer)((Pair)localf.hnr.get(i)).first).intValue();
            localf.mVm = ((com.tencent.mm.plugin.a.g)localf.hnq.get(localf.mVn));
            continue;
          }
          localException1.mVn = ((Integer)((Pair)localException1.hnr.get(i - 1)).first).intValue();
        }
        catch (Exception localException1)
        {
          w.printErrStackTrace("MicroMsg.TrackDataSource", localException1, "%s extractor seek exception %s", new Object[] { aiJ(), localException1.toString() });
          GMTrace.o(12902081757184L, 96128);
          return 0L;
        }
        localException1.mVm = ((com.tencent.mm.plugin.a.g)localException1.hnq.get(localException1.mVn));
      }
    }
    try
    {
      this.mVN.seekTo(paramInt * 1000, 0);
      if (this.mVN.getSampleTime() < 0L) {
        o(paramInt * 1000L, -1L);
      }
      if (this.mVN.getSampleTime() < 0L)
      {
        o(0L, -1L);
        this.mVD.aOC();
      }
      l = this.mVN.getSampleTime();
      w.i("MicroMsg.TrackDataSource", "%s finish to seek extractor [%d, %d]", new Object[] { aiJ(), Long.valueOf(l), Long.valueOf(this.mVN.getCachedDuration()) });
      l /= 1000L;
      GMTrace.o(12902081757184L, 96128);
      return l;
    }
    catch (Exception localException2)
    {
      w.printErrStackTrace("MicroMsg.TrackDataSource", localException2, "%s extractor seek exception %s", new Object[] { aiJ(), localException2.toString() });
      GMTrace.o(12902081757184L, 96128);
    }
    return 0L;
  }
  
  public void release()
  {
    GMTrace.i(12901679104000L, 96125);
    w.i("MicroMsg.TrackDataSource", "%s release", new Object[] { aiJ() });
    if (this.mVN != null)
    {
      this.mVN.release();
      this.mVN = null;
    }
    if (this.mVP != null)
    {
      this.mVP.release();
      this.mVP = null;
    }
    f localf;
    if (this.mVO != null)
    {
      localf = this.mVO;
      if (localf.mVl == null) {}
    }
    try
    {
      localf.mVl.close();
      localf.hnq.clear();
      localf.hnq = null;
      localf.hnr.clear();
      localf.hnr = null;
      localf.mVm = null;
      w.i("MicroMsg.TrackDataSource", "%s finish release", new Object[] { aiJ() });
      GMTrace.o(12901679104000L, 96125);
      return;
    }
    catch (IOException localIOException)
    {
      for (;;) {}
    }
  }
  
  /* Error */
  protected final void releaseDecoder()
  {
    // Byte code:
    //   0: ldc2_w 621
    //   3: ldc_w 623
    //   6: invokestatic 54	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: aload_0
    //   10: getfield 129	com/tencent/mm/plugin/s/h:mVP	Landroid/media/MediaCodec;
    //   13: ifnull +126 -> 139
    //   16: ldc 104
    //   18: ldc_w 625
    //   21: iconst_1
    //   22: anewarray 4	java/lang/Object
    //   25: dup
    //   26: iconst_0
    //   27: aload_0
    //   28: invokevirtual 110	com/tencent/mm/plugin/s/h:aiJ	()Ljava/lang/String;
    //   31: aastore
    //   32: invokestatic 142	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   35: aload_0
    //   36: invokevirtual 383	com/tencent/mm/plugin/s/h:aOE	()V
    //   39: aload_0
    //   40: aconst_null
    //   41: putfield 148	com/tencent/mm/plugin/s/h:mVT	[Ljava/nio/ByteBuffer;
    //   44: aload_0
    //   45: aconst_null
    //   46: putfield 238	com/tencent/mm/plugin/s/h:mVR	[Ljava/nio/ByteBuffer;
    //   49: invokestatic 268	com/tencent/mm/sdk/platformtools/bg:Pw	()J
    //   52: lstore_1
    //   53: aload_0
    //   54: getfield 67	com/tencent/mm/plugin/s/h:lock	Ljava/lang/Object;
    //   57: astore_3
    //   58: aload_3
    //   59: monitorenter
    //   60: ldc 104
    //   62: ldc_w 627
    //   65: iconst_2
    //   66: anewarray 4	java/lang/Object
    //   69: dup
    //   70: iconst_0
    //   71: aload_0
    //   72: invokevirtual 110	com/tencent/mm/plugin/s/h:aiJ	()Ljava/lang/String;
    //   75: aastore
    //   76: dup
    //   77: iconst_1
    //   78: lload_1
    //   79: invokestatic 329	com/tencent/mm/sdk/platformtools/bg:aI	(J)J
    //   82: invokestatic 116	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   85: aastore
    //   86: invokestatic 142	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   89: aload_0
    //   90: getfield 129	com/tencent/mm/plugin/s/h:mVP	Landroid/media/MediaCodec;
    //   93: invokevirtual 630	android/media/MediaCodec:stop	()V
    //   96: aload_0
    //   97: getfield 129	com/tencent/mm/plugin/s/h:mVP	Landroid/media/MediaCodec;
    //   100: invokevirtual 605	android/media/MediaCodec:release	()V
    //   103: aload_0
    //   104: aconst_null
    //   105: putfield 129	com/tencent/mm/plugin/s/h:mVP	Landroid/media/MediaCodec;
    //   108: aload_3
    //   109: monitorexit
    //   110: ldc 104
    //   112: ldc_w 632
    //   115: iconst_2
    //   116: anewarray 4	java/lang/Object
    //   119: dup
    //   120: iconst_0
    //   121: aload_0
    //   122: invokevirtual 110	com/tencent/mm/plugin/s/h:aiJ	()Ljava/lang/String;
    //   125: aastore
    //   126: dup
    //   127: iconst_1
    //   128: lload_1
    //   129: invokestatic 329	com/tencent/mm/sdk/platformtools/bg:aI	(J)J
    //   132: invokestatic 116	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   135: aastore
    //   136: invokestatic 142	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   139: ldc2_w 621
    //   142: ldc_w 623
    //   145: invokestatic 84	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   148: return
    //   149: astore 4
    //   151: aload_0
    //   152: aconst_null
    //   153: putfield 129	com/tencent/mm/plugin/s/h:mVP	Landroid/media/MediaCodec;
    //   156: aload 4
    //   158: athrow
    //   159: astore 4
    //   161: aload_3
    //   162: monitorexit
    //   163: aload 4
    //   165: athrow
    //   166: astore 4
    //   168: aload_0
    //   169: getfield 129	com/tencent/mm/plugin/s/h:mVP	Landroid/media/MediaCodec;
    //   172: invokevirtual 605	android/media/MediaCodec:release	()V
    //   175: aload_0
    //   176: aconst_null
    //   177: putfield 129	com/tencent/mm/plugin/s/h:mVP	Landroid/media/MediaCodec;
    //   180: goto -72 -> 108
    //   183: astore 4
    //   185: aload_0
    //   186: aconst_null
    //   187: putfield 129	com/tencent/mm/plugin/s/h:mVP	Landroid/media/MediaCodec;
    //   190: aload 4
    //   192: athrow
    //   193: astore 4
    //   195: aload_0
    //   196: getfield 129	com/tencent/mm/plugin/s/h:mVP	Landroid/media/MediaCodec;
    //   199: invokevirtual 605	android/media/MediaCodec:release	()V
    //   202: aload_0
    //   203: aconst_null
    //   204: putfield 129	com/tencent/mm/plugin/s/h:mVP	Landroid/media/MediaCodec;
    //   207: aload 4
    //   209: athrow
    //   210: astore 4
    //   212: aload_0
    //   213: aconst_null
    //   214: putfield 129	com/tencent/mm/plugin/s/h:mVP	Landroid/media/MediaCodec;
    //   217: aload 4
    //   219: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	220	0	this	h
    //   52	77	1	l	long
    //   57	105	3	localObject1	Object
    //   149	8	4	localObject2	Object
    //   159	5	4	localObject3	Object
    //   166	1	4	localException	Exception
    //   183	8	4	localObject4	Object
    //   193	15	4	localObject5	Object
    //   210	8	4	localObject6	Object
    // Exception table:
    //   from	to	target	type
    //   96	103	149	finally
    //   60	89	159	finally
    //   103	108	159	finally
    //   108	110	159	finally
    //   151	159	159	finally
    //   161	163	159	finally
    //   175	180	159	finally
    //   185	193	159	finally
    //   202	210	159	finally
    //   212	220	159	finally
    //   89	96	166	java/lang/Exception
    //   168	175	183	finally
    //   89	96	193	finally
    //   195	202	210	finally
  }
  
  public final void setPath(String paramString)
  {
    GMTrace.i(12901276450816L, 96122);
    this.path = paramString;
    GMTrace.o(12901276450816L, 96122);
  }
  
  protected final void setState(int paramInt)
  {
    GMTrace.i(12903692369920L, 96140);
    w.i("MicroMsg.TrackDataSource", "%s set state old %d new %d", new Object[] { aiJ(), Integer.valueOf(this.state), Integer.valueOf(paramInt) });
    this.state = paramInt;
    GMTrace.o(12903692369920L, 96140);
  }
  
  public final void start()
  {
    GMTrace.i(12901813321728L, 96126);
    w.i("MicroMsg.TrackDataSource", "%s start to play", new Object[] { aiJ() });
    setState(3);
    onStart();
    GMTrace.o(12901813321728L, 96126);
  }
  
  protected boolean z(int paramInt, long paramLong)
  {
    GMTrace.i(12902618628096L, 96132);
    GMTrace.o(12902618628096L, 96132);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\s\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */