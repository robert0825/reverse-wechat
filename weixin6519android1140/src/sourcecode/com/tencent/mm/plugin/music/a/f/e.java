package com.tencent.mm.plugin.music.a.f;

import android.annotation.TargetApi;
import android.media.AudioTrack;
import android.media.MediaCodec;
import android.media.MediaExtractor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;

@TargetApi(16)
public final class e
  extends b
{
  public int channels;
  public long duration;
  public int glO;
  public AudioTrack hdT;
  public String mVJ;
  public MediaExtractor mVN;
  private boolean mZM;
  public MediaCodec nrF;
  public String nrG;
  public boolean nrH;
  private Runnable nrI;
  public long presentationTimeUs;
  public int sampleRate;
  
  public e()
  {
    GMTrace.i(4858547535872L, 36199);
    this.mZM = true;
    this.mVJ = null;
    this.sampleRate = 0;
    this.channels = 0;
    this.presentationTimeUs = 0L;
    this.duration = 0L;
    this.nrH = false;
    this.glO = 0;
    this.nrI = new Runnable()
    {
      /* Error */
      public final void run()
      {
        // Byte code:
        //   0: ldc2_w 34
        //   3: ldc 36
        //   5: invokestatic 26	com/tencent/gmtrace/GMTrace:i	(JI)V
        //   8: ldc 38
        //   10: ldc 40
        //   12: invokestatic 45	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
        //   15: bipush -19
        //   17: invokestatic 51	android/os/Process:setThreadPriority	(I)V
        //   20: aload_0
        //   21: getfield 14	com/tencent/mm/plugin/music/a/f/e$1:nrJ	Lcom/tencent/mm/plugin/music/a/f/e;
        //   24: getfield 55	com/tencent/mm/plugin/music/a/f/e:nrG	Ljava/lang/String;
        //   27: invokestatic 61	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
        //   30: ifeq +27 -> 57
        //   33: ldc 38
        //   35: ldc 63
        //   37: invokestatic 66	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
        //   40: aload_0
        //   41: getfield 14	com/tencent/mm/plugin/music/a/f/e$1:nrJ	Lcom/tencent/mm/plugin/music/a/f/e;
        //   44: iconst_0
        //   45: invokevirtual 70	com/tencent/mm/plugin/music/a/f/e:gp	(Z)V
        //   48: ldc2_w 34
        //   51: ldc 36
        //   53: invokestatic 29	com/tencent/gmtrace/GMTrace:o	(JI)V
        //   56: return
        //   57: aload_0
        //   58: getfield 14	com/tencent/mm/plugin/music/a/f/e$1:nrJ	Lcom/tencent/mm/plugin/music/a/f/e;
        //   61: new 72	android/media/MediaExtractor
        //   64: dup
        //   65: invokespecial 73	android/media/MediaExtractor:<init>	()V
        //   68: putfield 77	com/tencent/mm/plugin/music/a/f/e:mVN	Landroid/media/MediaExtractor;
        //   71: aload_0
        //   72: getfield 14	com/tencent/mm/plugin/music/a/f/e$1:nrJ	Lcom/tencent/mm/plugin/music/a/f/e;
        //   75: getfield 77	com/tencent/mm/plugin/music/a/f/e:mVN	Landroid/media/MediaExtractor;
        //   78: aload_0
        //   79: getfield 14	com/tencent/mm/plugin/music/a/f/e$1:nrJ	Lcom/tencent/mm/plugin/music/a/f/e;
        //   82: getfield 55	com/tencent/mm/plugin/music/a/f/e:nrG	Ljava/lang/String;
        //   85: invokevirtual 81	android/media/MediaExtractor:setDataSource	(Ljava/lang/String;)V
        //   88: aconst_null
        //   89: astore 13
        //   91: aconst_null
        //   92: astore 12
        //   94: aload 13
        //   96: astore 11
        //   98: aload_0
        //   99: getfield 14	com/tencent/mm/plugin/music/a/f/e$1:nrJ	Lcom/tencent/mm/plugin/music/a/f/e;
        //   102: getfield 77	com/tencent/mm/plugin/music/a/f/e:mVN	Landroid/media/MediaExtractor;
        //   105: invokevirtual 85	android/media/MediaExtractor:getTrackCount	()I
        //   108: istore_2
        //   109: aload 13
        //   111: astore 11
        //   113: ldc 38
        //   115: ldc 87
        //   117: iconst_1
        //   118: anewarray 4	java/lang/Object
        //   121: dup
        //   122: iconst_0
        //   123: iload_2
        //   124: invokestatic 93	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
        //   127: aastore
        //   128: invokestatic 96	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
        //   131: iconst_0
        //   132: istore_1
        //   133: aload 12
        //   135: astore 10
        //   137: iload_1
        //   138: iload_2
        //   139: if_icmpge +74 -> 213
        //   142: aload 13
        //   144: astore 11
        //   146: aload_0
        //   147: getfield 14	com/tencent/mm/plugin/music/a/f/e$1:nrJ	Lcom/tencent/mm/plugin/music/a/f/e;
        //   150: getfield 77	com/tencent/mm/plugin/music/a/f/e:mVN	Landroid/media/MediaExtractor;
        //   153: iload_1
        //   154: invokevirtual 100	android/media/MediaExtractor:getTrackFormat	(I)Landroid/media/MediaFormat;
        //   157: astore 10
        //   159: aload 13
        //   161: astore 11
        //   163: aload_0
        //   164: getfield 14	com/tencent/mm/plugin/music/a/f/e$1:nrJ	Lcom/tencent/mm/plugin/music/a/f/e;
        //   167: aload 10
        //   169: ldc 102
        //   171: invokevirtual 108	android/media/MediaFormat:getString	(Ljava/lang/String;)Ljava/lang/String;
        //   174: putfield 111	com/tencent/mm/plugin/music/a/f/e:mVJ	Ljava/lang/String;
        //   177: aload 13
        //   179: astore 11
        //   181: aload_0
        //   182: getfield 14	com/tencent/mm/plugin/music/a/f/e$1:nrJ	Lcom/tencent/mm/plugin/music/a/f/e;
        //   185: getfield 111	com/tencent/mm/plugin/music/a/f/e:mVJ	Ljava/lang/String;
        //   188: invokestatic 61	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
        //   191: ifne +126 -> 317
        //   194: aload 13
        //   196: astore 11
        //   198: aload_0
        //   199: getfield 14	com/tencent/mm/plugin/music/a/f/e$1:nrJ	Lcom/tencent/mm/plugin/music/a/f/e;
        //   202: getfield 111	com/tencent/mm/plugin/music/a/f/e:mVJ	Ljava/lang/String;
        //   205: ldc 113
        //   207: invokevirtual 118	java/lang/String:startsWith	(Ljava/lang/String;)Z
        //   210: ifeq +107 -> 317
        //   213: aload 10
        //   215: ifnonnull +109 -> 324
        //   218: aload 10
        //   220: astore 11
        //   222: ldc 38
        //   224: ldc 120
        //   226: invokestatic 66	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
        //   229: aload 10
        //   231: astore 11
        //   233: aload_0
        //   234: getfield 14	com/tencent/mm/plugin/music/a/f/e$1:nrJ	Lcom/tencent/mm/plugin/music/a/f/e;
        //   237: sipush 703
        //   240: putfield 124	com/tencent/mm/plugin/music/a/f/e:glO	I
        //   243: aload 10
        //   245: astore 11
        //   247: aload_0
        //   248: getfield 14	com/tencent/mm/plugin/music/a/f/e$1:nrJ	Lcom/tencent/mm/plugin/music/a/f/e;
        //   251: iconst_1
        //   252: invokevirtual 70	com/tencent/mm/plugin/music/a/f/e:gp	(Z)V
        //   255: aload 10
        //   257: astore 11
        //   259: aload_0
        //   260: getfield 14	com/tencent/mm/plugin/music/a/f/e$1:nrJ	Lcom/tencent/mm/plugin/music/a/f/e;
        //   263: invokevirtual 127	com/tencent/mm/plugin/music/a/f/e:aTj	()V
        //   266: ldc2_w 34
        //   269: ldc 36
        //   271: invokestatic 29	com/tencent/gmtrace/GMTrace:o	(JI)V
        //   274: return
        //   275: astore 10
        //   277: ldc 38
        //   279: aload 10
        //   281: ldc -127
        //   283: iconst_0
        //   284: anewarray 4	java/lang/Object
        //   287: invokestatic 133	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
        //   290: aload_0
        //   291: getfield 14	com/tencent/mm/plugin/music/a/f/e$1:nrJ	Lcom/tencent/mm/plugin/music/a/f/e;
        //   294: sipush 702
        //   297: putfield 124	com/tencent/mm/plugin/music/a/f/e:glO	I
        //   300: aload_0
        //   301: getfield 14	com/tencent/mm/plugin/music/a/f/e$1:nrJ	Lcom/tencent/mm/plugin/music/a/f/e;
        //   304: iconst_1
        //   305: invokevirtual 70	com/tencent/mm/plugin/music/a/f/e:gp	(Z)V
        //   308: ldc2_w 34
        //   311: ldc 36
        //   313: invokestatic 29	com/tencent/gmtrace/GMTrace:o	(JI)V
        //   316: return
        //   317: iload_1
        //   318: iconst_1
        //   319: iadd
        //   320: istore_1
        //   321: goto -188 -> 133
        //   324: aload 10
        //   326: astore 11
        //   328: ldc 38
        //   330: ldc -121
        //   332: iconst_1
        //   333: anewarray 4	java/lang/Object
        //   336: dup
        //   337: iconst_0
        //   338: aload 10
        //   340: aastore
        //   341: invokestatic 137	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
        //   344: aload 10
        //   346: astore 11
        //   348: aload_0
        //   349: getfield 14	com/tencent/mm/plugin/music/a/f/e$1:nrJ	Lcom/tencent/mm/plugin/music/a/f/e;
        //   352: aload 10
        //   354: ldc -117
        //   356: invokevirtual 143	android/media/MediaFormat:getInteger	(Ljava/lang/String;)I
        //   359: putfield 146	com/tencent/mm/plugin/music/a/f/e:sampleRate	I
        //   362: aload 10
        //   364: astore 11
        //   366: aload_0
        //   367: getfield 14	com/tencent/mm/plugin/music/a/f/e$1:nrJ	Lcom/tencent/mm/plugin/music/a/f/e;
        //   370: aload 10
        //   372: ldc -108
        //   374: invokevirtual 143	android/media/MediaFormat:getInteger	(Ljava/lang/String;)I
        //   377: putfield 151	com/tencent/mm/plugin/music/a/f/e:channels	I
        //   380: aload 10
        //   382: astore 11
        //   384: aload_0
        //   385: getfield 14	com/tencent/mm/plugin/music/a/f/e$1:nrJ	Lcom/tencent/mm/plugin/music/a/f/e;
        //   388: aload 10
        //   390: ldc -103
        //   392: invokevirtual 157	android/media/MediaFormat:getLong	(Ljava/lang/String;)J
        //   395: putfield 161	com/tencent/mm/plugin/music/a/f/e:duration	J
        //   398: aload_0
        //   399: getfield 14	com/tencent/mm/plugin/music/a/f/e$1:nrJ	Lcom/tencent/mm/plugin/music/a/f/e;
        //   402: aload_0
        //   403: getfield 14	com/tencent/mm/plugin/music/a/f/e$1:nrJ	Lcom/tencent/mm/plugin/music/a/f/e;
        //   406: getfield 111	com/tencent/mm/plugin/music/a/f/e:mVJ	Ljava/lang/String;
        //   409: invokestatic 167	android/media/MediaCodec:createDecoderByType	(Ljava/lang/String;)Landroid/media/MediaCodec;
        //   412: putfield 171	com/tencent/mm/plugin/music/a/f/e:nrF	Landroid/media/MediaCodec;
        //   415: aload_0
        //   416: getfield 14	com/tencent/mm/plugin/music/a/f/e$1:nrJ	Lcom/tencent/mm/plugin/music/a/f/e;
        //   419: getfield 171	com/tencent/mm/plugin/music/a/f/e:nrF	Landroid/media/MediaCodec;
        //   422: aload 10
        //   424: aconst_null
        //   425: aconst_null
        //   426: iconst_0
        //   427: invokevirtual 175	android/media/MediaCodec:configure	(Landroid/media/MediaFormat;Landroid/view/Surface;Landroid/media/MediaCrypto;I)V
        //   430: aload_0
        //   431: getfield 14	com/tencent/mm/plugin/music/a/f/e$1:nrJ	Lcom/tencent/mm/plugin/music/a/f/e;
        //   434: getfield 171	com/tencent/mm/plugin/music/a/f/e:nrF	Landroid/media/MediaCodec;
        //   437: invokevirtual 178	android/media/MediaCodec:start	()V
        //   440: aload_0
        //   441: getfield 14	com/tencent/mm/plugin/music/a/f/e$1:nrJ	Lcom/tencent/mm/plugin/music/a/f/e;
        //   444: getfield 171	com/tencent/mm/plugin/music/a/f/e:nrF	Landroid/media/MediaCodec;
        //   447: invokevirtual 182	android/media/MediaCodec:getInputBuffers	()[Ljava/nio/ByteBuffer;
        //   450: astore 12
        //   452: aload_0
        //   453: getfield 14	com/tencent/mm/plugin/music/a/f/e$1:nrJ	Lcom/tencent/mm/plugin/music/a/f/e;
        //   456: getfield 171	com/tencent/mm/plugin/music/a/f/e:nrF	Landroid/media/MediaCodec;
        //   459: invokevirtual 185	android/media/MediaCodec:getOutputBuffers	()[Ljava/nio/ByteBuffer;
        //   462: astore 11
        //   464: ldc 38
        //   466: ldc -69
        //   468: iconst_5
        //   469: anewarray 4	java/lang/Object
        //   472: dup
        //   473: iconst_0
        //   474: aload 10
        //   476: aastore
        //   477: dup
        //   478: iconst_1
        //   479: aload_0
        //   480: getfield 14	com/tencent/mm/plugin/music/a/f/e$1:nrJ	Lcom/tencent/mm/plugin/music/a/f/e;
        //   483: getfield 111	com/tencent/mm/plugin/music/a/f/e:mVJ	Ljava/lang/String;
        //   486: aastore
        //   487: dup
        //   488: iconst_2
        //   489: aload_0
        //   490: getfield 14	com/tencent/mm/plugin/music/a/f/e$1:nrJ	Lcom/tencent/mm/plugin/music/a/f/e;
        //   493: getfield 146	com/tencent/mm/plugin/music/a/f/e:sampleRate	I
        //   496: invokestatic 93	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
        //   499: aastore
        //   500: dup
        //   501: iconst_3
        //   502: aload_0
        //   503: getfield 14	com/tencent/mm/plugin/music/a/f/e$1:nrJ	Lcom/tencent/mm/plugin/music/a/f/e;
        //   506: getfield 151	com/tencent/mm/plugin/music/a/f/e:channels	I
        //   509: invokestatic 93	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
        //   512: aastore
        //   513: dup
        //   514: iconst_4
        //   515: aload_0
        //   516: getfield 14	com/tencent/mm/plugin/music/a/f/e$1:nrJ	Lcom/tencent/mm/plugin/music/a/f/e;
        //   519: getfield 161	com/tencent/mm/plugin/music/a/f/e:duration	J
        //   522: invokestatic 192	java/lang/Long:valueOf	(J)Ljava/lang/Long;
        //   525: aastore
        //   526: invokestatic 137	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
        //   529: aload_0
        //   530: getfield 14	com/tencent/mm/plugin/music/a/f/e$1:nrJ	Lcom/tencent/mm/plugin/music/a/f/e;
        //   533: getfield 77	com/tencent/mm/plugin/music/a/f/e:mVN	Landroid/media/MediaExtractor;
        //   536: iconst_0
        //   537: invokevirtual 195	android/media/MediaExtractor:selectTrack	(I)V
        //   540: new 197	android/media/MediaCodec$BufferInfo
        //   543: dup
        //   544: invokespecial 198	android/media/MediaCodec$BufferInfo:<init>	()V
        //   547: astore 13
        //   549: iconst_0
        //   550: istore_2
        //   551: iconst_0
        //   552: istore_3
        //   553: aload_0
        //   554: getfield 14	com/tencent/mm/plugin/music/a/f/e$1:nrJ	Lcom/tencent/mm/plugin/music/a/f/e;
        //   557: getfield 202	com/tencent/mm/plugin/music/a/f/e:nrz	Lcom/tencent/mm/plugin/music/a/f/j;
        //   560: iconst_3
        //   561: putfield 207	com/tencent/mm/plugin/music/a/f/j:nsg	I
        //   564: aload_0
        //   565: getfield 14	com/tencent/mm/plugin/music/a/f/e$1:nrJ	Lcom/tencent/mm/plugin/music/a/f/e;
        //   568: invokevirtual 210	com/tencent/mm/plugin/music/a/f/e:onStart	()V
        //   571: aload 11
        //   573: astore 10
        //   575: iconst_0
        //   576: istore_1
        //   577: iload_2
        //   578: ifne +833 -> 1411
        //   581: iload_3
        //   582: bipush 50
        //   584: if_icmpge +827 -> 1411
        //   587: aload_0
        //   588: getfield 14	com/tencent/mm/plugin/music/a/f/e$1:nrJ	Lcom/tencent/mm/plugin/music/a/f/e;
        //   591: invokevirtual 213	com/tencent/mm/plugin/music/a/f/e:aTn	()V
        //   594: aload_0
        //   595: getfield 14	com/tencent/mm/plugin/music/a/f/e$1:nrJ	Lcom/tencent/mm/plugin/music/a/f/e;
        //   598: invokevirtual 217	com/tencent/mm/plugin/music/a/f/e:aTg	()Z
        //   601: ifeq +810 -> 1411
        //   604: iload_3
        //   605: iconst_1
        //   606: iadd
        //   607: istore 4
        //   609: iload_1
        //   610: ifne +1196 -> 1806
        //   613: aload_0
        //   614: getfield 14	com/tencent/mm/plugin/music/a/f/e$1:nrJ	Lcom/tencent/mm/plugin/music/a/f/e;
        //   617: getfield 171	com/tencent/mm/plugin/music/a/f/e:nrF	Landroid/media/MediaCodec;
        //   620: ldc2_w 218
        //   623: invokevirtual 223	android/media/MediaCodec:dequeueInputBuffer	(J)I
        //   626: istore 6
        //   628: iload 6
        //   630: iflt +539 -> 1169
        //   633: aload 12
        //   635: iload 6
        //   637: aaload
        //   638: astore 11
        //   640: aload_0
        //   641: getfield 14	com/tencent/mm/plugin/music/a/f/e$1:nrJ	Lcom/tencent/mm/plugin/music/a/f/e;
        //   644: getfield 77	com/tencent/mm/plugin/music/a/f/e:mVN	Landroid/media/MediaExtractor;
        //   647: aload 11
        //   649: iconst_0
        //   650: invokevirtual 227	android/media/MediaExtractor:readSampleData	(Ljava/nio/ByteBuffer;I)I
        //   653: istore 5
        //   655: iload 5
        //   657: ifge +441 -> 1098
        //   660: ldc 38
        //   662: ldc -27
        //   664: invokestatic 66	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
        //   667: iconst_1
        //   668: istore_3
        //   669: iconst_0
        //   670: istore_1
        //   671: aload_0
        //   672: getfield 14	com/tencent/mm/plugin/music/a/f/e$1:nrJ	Lcom/tencent/mm/plugin/music/a/f/e;
        //   675: getfield 171	com/tencent/mm/plugin/music/a/f/e:nrF	Landroid/media/MediaCodec;
        //   678: astore 11
        //   680: aload_0
        //   681: getfield 14	com/tencent/mm/plugin/music/a/f/e$1:nrJ	Lcom/tencent/mm/plugin/music/a/f/e;
        //   684: getfield 232	com/tencent/mm/plugin/music/a/f/e:presentationTimeUs	J
        //   687: lstore 7
        //   689: iload_3
        //   690: ifeq +1110 -> 1800
        //   693: iconst_4
        //   694: istore 5
        //   696: aload 11
        //   698: iload 6
        //   700: iconst_0
        //   701: iload_1
        //   702: lload 7
        //   704: iload 5
        //   706: invokevirtual 236	android/media/MediaCodec:queueInputBuffer	(IIIJI)V
        //   709: iload_3
        //   710: istore_1
        //   711: iload_3
        //   712: ifne +16 -> 728
        //   715: aload_0
        //   716: getfield 14	com/tencent/mm/plugin/music/a/f/e$1:nrJ	Lcom/tencent/mm/plugin/music/a/f/e;
        //   719: getfield 77	com/tencent/mm/plugin/music/a/f/e:mVN	Landroid/media/MediaExtractor;
        //   722: invokevirtual 239	android/media/MediaExtractor:advance	()Z
        //   725: pop
        //   726: iload_3
        //   727: istore_1
        //   728: aload_0
        //   729: getfield 14	com/tencent/mm/plugin/music/a/f/e$1:nrJ	Lcom/tencent/mm/plugin/music/a/f/e;
        //   732: getfield 171	com/tencent/mm/plugin/music/a/f/e:nrF	Landroid/media/MediaCodec;
        //   735: aload 13
        //   737: ldc2_w 218
        //   740: invokevirtual 243	android/media/MediaCodec:dequeueOutputBuffer	(Landroid/media/MediaCodec$BufferInfo;J)I
        //   743: istore 5
        //   745: iload 5
        //   747: iflt +519 -> 1266
        //   750: aload 13
        //   752: getfield 246	android/media/MediaCodec$BufferInfo:size	I
        //   755: ifle +1039 -> 1794
        //   758: iconst_0
        //   759: istore_3
        //   760: aload 10
        //   762: iload 5
        //   764: aaload
        //   765: astore 14
        //   767: aload 13
        //   769: getfield 246	android/media/MediaCodec$BufferInfo:size	I
        //   772: newarray <illegal type>
        //   774: astore 11
        //   776: aload 14
        //   778: aload 11
        //   780: invokevirtual 252	java/nio/ByteBuffer:get	([B)Ljava/nio/ByteBuffer;
        //   783: pop
        //   784: aload 14
        //   786: invokevirtual 256	java/nio/ByteBuffer:clear	()Ljava/nio/Buffer;
        //   789: pop
        //   790: aload 11
        //   792: arraylength
        //   793: ifle +437 -> 1230
        //   796: aload_0
        //   797: getfield 14	com/tencent/mm/plugin/music/a/f/e$1:nrJ	Lcom/tencent/mm/plugin/music/a/f/e;
        //   800: getfield 260	com/tencent/mm/plugin/music/a/f/e:hdT	Landroid/media/AudioTrack;
        //   803: ifnonnull +402 -> 1205
        //   806: aload_0
        //   807: getfield 14	com/tencent/mm/plugin/music/a/f/e$1:nrJ	Lcom/tencent/mm/plugin/music/a/f/e;
        //   810: astore 14
        //   812: ldc 38
        //   814: ldc_w 262
        //   817: invokestatic 45	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
        //   820: aload 14
        //   822: getfield 151	com/tencent/mm/plugin/music/a/f/e:channels	I
        //   825: iconst_1
        //   826: if_icmpne +983 -> 1809
        //   829: iconst_4
        //   830: istore 4
        //   832: aload 14
        //   834: getfield 146	com/tencent/mm/plugin/music/a/f/e:sampleRate	I
        //   837: iload 4
        //   839: iconst_2
        //   840: invokestatic 268	android/media/AudioTrack:getMinBufferSize	(III)I
        //   843: istore 6
        //   845: aload 14
        //   847: new 270	com/tencent/mm/compatible/b/c
        //   850: dup
        //   851: iconst_3
        //   852: aload 14
        //   854: getfield 146	com/tencent/mm/plugin/music/a/f/e:sampleRate	I
        //   857: iload 4
        //   859: iconst_2
        //   860: iload 6
        //   862: invokespecial 273	com/tencent/mm/compatible/b/c:<init>	(IIIII)V
        //   865: putfield 260	com/tencent/mm/plugin/music/a/f/e:hdT	Landroid/media/AudioTrack;
        //   868: aload 14
        //   870: getfield 260	com/tencent/mm/plugin/music/a/f/e:hdT	Landroid/media/AudioTrack;
        //   873: ifnull +15 -> 888
        //   876: aload 14
        //   878: getfield 260	com/tencent/mm/plugin/music/a/f/e:hdT	Landroid/media/AudioTrack;
        //   881: invokevirtual 276	android/media/AudioTrack:getState	()I
        //   884: iconst_1
        //   885: if_icmpeq +931 -> 1816
        //   888: ldc 38
        //   890: ldc_w 278
        //   893: invokestatic 66	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
        //   896: iconst_0
        //   897: istore 4
        //   899: iload 4
        //   901: ifne +294 -> 1195
        //   904: ldc 38
        //   906: ldc_w 278
        //   909: invokestatic 66	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
        //   912: aload_0
        //   913: getfield 14	com/tencent/mm/plugin/music/a/f/e$1:nrJ	Lcom/tencent/mm/plugin/music/a/f/e;
        //   916: sipush 707
        //   919: putfield 124	com/tencent/mm/plugin/music/a/f/e:glO	I
        //   922: aload_0
        //   923: getfield 14	com/tencent/mm/plugin/music/a/f/e$1:nrJ	Lcom/tencent/mm/plugin/music/a/f/e;
        //   926: iconst_1
        //   927: invokevirtual 70	com/tencent/mm/plugin/music/a/f/e:gp	(Z)V
        //   930: aload_0
        //   931: getfield 14	com/tencent/mm/plugin/music/a/f/e$1:nrJ	Lcom/tencent/mm/plugin/music/a/f/e;
        //   934: invokevirtual 127	com/tencent/mm/plugin/music/a/f/e:aTj	()V
        //   937: aload_0
        //   938: getfield 14	com/tencent/mm/plugin/music/a/f/e$1:nrJ	Lcom/tencent/mm/plugin/music/a/f/e;
        //   941: invokevirtual 281	com/tencent/mm/plugin/music/a/f/e:aTk	()V
        //   944: aload_0
        //   945: getfield 14	com/tencent/mm/plugin/music/a/f/e$1:nrJ	Lcom/tencent/mm/plugin/music/a/f/e;
        //   948: invokevirtual 284	com/tencent/mm/plugin/music/a/f/e:aTl	()V
        //   951: aload_0
        //   952: getfield 14	com/tencent/mm/plugin/music/a/f/e$1:nrJ	Lcom/tencent/mm/plugin/music/a/f/e;
        //   955: aconst_null
        //   956: putfield 55	com/tencent/mm/plugin/music/a/f/e:nrG	Ljava/lang/String;
        //   959: aload_0
        //   960: getfield 14	com/tencent/mm/plugin/music/a/f/e$1:nrJ	Lcom/tencent/mm/plugin/music/a/f/e;
        //   963: aconst_null
        //   964: putfield 111	com/tencent/mm/plugin/music/a/f/e:mVJ	Ljava/lang/String;
        //   967: aload_0
        //   968: getfield 14	com/tencent/mm/plugin/music/a/f/e$1:nrJ	Lcom/tencent/mm/plugin/music/a/f/e;
        //   971: iconst_0
        //   972: putfield 146	com/tencent/mm/plugin/music/a/f/e:sampleRate	I
        //   975: aload_0
        //   976: getfield 14	com/tencent/mm/plugin/music/a/f/e$1:nrJ	Lcom/tencent/mm/plugin/music/a/f/e;
        //   979: iconst_0
        //   980: putfield 151	com/tencent/mm/plugin/music/a/f/e:channels	I
        //   983: aload_0
        //   984: getfield 14	com/tencent/mm/plugin/music/a/f/e$1:nrJ	Lcom/tencent/mm/plugin/music/a/f/e;
        //   987: lconst_0
        //   988: putfield 232	com/tencent/mm/plugin/music/a/f/e:presentationTimeUs	J
        //   991: aload_0
        //   992: getfield 14	com/tencent/mm/plugin/music/a/f/e$1:nrJ	Lcom/tencent/mm/plugin/music/a/f/e;
        //   995: lconst_0
        //   996: putfield 161	com/tencent/mm/plugin/music/a/f/e:duration	J
        //   999: ldc2_w 34
        //   1002: ldc 36
        //   1004: invokestatic 29	com/tencent/gmtrace/GMTrace:o	(JI)V
        //   1007: return
        //   1008: astore 10
        //   1010: ldc 38
        //   1012: aload 10
        //   1014: ldc_w 286
        //   1017: iconst_0
        //   1018: anewarray 4	java/lang/Object
        //   1021: invokestatic 133	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
        //   1024: aload_0
        //   1025: getfield 14	com/tencent/mm/plugin/music/a/f/e$1:nrJ	Lcom/tencent/mm/plugin/music/a/f/e;
        //   1028: sipush 705
        //   1031: putfield 124	com/tencent/mm/plugin/music/a/f/e:glO	I
        //   1034: aload 11
        //   1036: astore 10
        //   1038: goto -640 -> 398
        //   1041: astore 10
        //   1043: ldc 38
        //   1045: aload 10
        //   1047: ldc_w 287
        //   1050: iconst_0
        //   1051: anewarray 4	java/lang/Object
        //   1054: invokestatic 133	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
        //   1057: aload_0
        //   1058: getfield 14	com/tencent/mm/plugin/music/a/f/e$1:nrJ	Lcom/tencent/mm/plugin/music/a/f/e;
        //   1061: sipush 704
        //   1064: putfield 124	com/tencent/mm/plugin/music/a/f/e:glO	I
        //   1067: aload_0
        //   1068: getfield 14	com/tencent/mm/plugin/music/a/f/e$1:nrJ	Lcom/tencent/mm/plugin/music/a/f/e;
        //   1071: iconst_1
        //   1072: invokevirtual 70	com/tencent/mm/plugin/music/a/f/e:gp	(Z)V
        //   1075: aload_0
        //   1076: getfield 14	com/tencent/mm/plugin/music/a/f/e$1:nrJ	Lcom/tencent/mm/plugin/music/a/f/e;
        //   1079: invokevirtual 127	com/tencent/mm/plugin/music/a/f/e:aTj	()V
        //   1082: aload_0
        //   1083: getfield 14	com/tencent/mm/plugin/music/a/f/e$1:nrJ	Lcom/tencent/mm/plugin/music/a/f/e;
        //   1086: invokevirtual 281	com/tencent/mm/plugin/music/a/f/e:aTk	()V
        //   1089: ldc2_w 34
        //   1092: ldc 36
        //   1094: invokestatic 29	com/tencent/gmtrace/GMTrace:o	(JI)V
        //   1097: return
        //   1098: aload_0
        //   1099: getfield 14	com/tencent/mm/plugin/music/a/f/e$1:nrJ	Lcom/tencent/mm/plugin/music/a/f/e;
        //   1102: aload_0
        //   1103: getfield 14	com/tencent/mm/plugin/music/a/f/e$1:nrJ	Lcom/tencent/mm/plugin/music/a/f/e;
        //   1106: getfield 77	com/tencent/mm/plugin/music/a/f/e:mVN	Landroid/media/MediaExtractor;
        //   1109: invokevirtual 291	android/media/MediaExtractor:getSampleTime	()J
        //   1112: putfield 232	com/tencent/mm/plugin/music/a/f/e:presentationTimeUs	J
        //   1115: aload_0
        //   1116: getfield 14	com/tencent/mm/plugin/music/a/f/e$1:nrJ	Lcom/tencent/mm/plugin/music/a/f/e;
        //   1119: getfield 161	com/tencent/mm/plugin/music/a/f/e:duration	J
        //   1122: lconst_0
        //   1123: lcmp
        //   1124: ifne +21 -> 1145
        //   1127: iconst_0
        //   1128: istore_3
        //   1129: aload_0
        //   1130: getfield 14	com/tencent/mm/plugin/music/a/f/e$1:nrJ	Lcom/tencent/mm/plugin/music/a/f/e;
        //   1133: iload_3
        //   1134: invokevirtual 294	com/tencent/mm/plugin/music/a/f/e:rz	(I)V
        //   1137: iload_1
        //   1138: istore_3
        //   1139: iload 5
        //   1141: istore_1
        //   1142: goto -471 -> 671
        //   1145: ldc2_w 295
        //   1148: aload_0
        //   1149: getfield 14	com/tencent/mm/plugin/music/a/f/e$1:nrJ	Lcom/tencent/mm/plugin/music/a/f/e;
        //   1152: getfield 232	com/tencent/mm/plugin/music/a/f/e:presentationTimeUs	J
        //   1155: lmul
        //   1156: aload_0
        //   1157: getfield 14	com/tencent/mm/plugin/music/a/f/e$1:nrJ	Lcom/tencent/mm/plugin/music/a/f/e;
        //   1160: getfield 161	com/tencent/mm/plugin/music/a/f/e:duration	J
        //   1163: ldiv
        //   1164: l2i
        //   1165: istore_3
        //   1166: goto -37 -> 1129
        //   1169: ldc 38
        //   1171: new 298	java/lang/StringBuilder
        //   1174: dup
        //   1175: ldc_w 300
        //   1178: invokespecial 302	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
        //   1181: iload 6
        //   1183: invokevirtual 306	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
        //   1186: invokevirtual 310	java/lang/StringBuilder:toString	()Ljava/lang/String;
        //   1189: invokestatic 66	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
        //   1192: goto +614 -> 1806
        //   1195: aload_0
        //   1196: getfield 14	com/tencent/mm/plugin/music/a/f/e$1:nrJ	Lcom/tencent/mm/plugin/music/a/f/e;
        //   1199: getfield 260	com/tencent/mm/plugin/music/a/f/e:hdT	Landroid/media/AudioTrack;
        //   1202: invokevirtual 313	android/media/AudioTrack:play	()V
        //   1205: aload_0
        //   1206: getfield 14	com/tencent/mm/plugin/music/a/f/e$1:nrJ	Lcom/tencent/mm/plugin/music/a/f/e;
        //   1209: getfield 260	com/tencent/mm/plugin/music/a/f/e:hdT	Landroid/media/AudioTrack;
        //   1212: aload 11
        //   1214: iconst_0
        //   1215: aload 11
        //   1217: arraylength
        //   1218: invokevirtual 317	android/media/AudioTrack:write	([BII)I
        //   1221: pop
        //   1222: aload_0
        //   1223: getfield 14	com/tencent/mm/plugin/music/a/f/e$1:nrJ	Lcom/tencent/mm/plugin/music/a/f/e;
        //   1226: iconst_1
        //   1227: putfield 321	com/tencent/mm/plugin/music/a/f/e:nrH	Z
        //   1230: aload_0
        //   1231: getfield 14	com/tencent/mm/plugin/music/a/f/e$1:nrJ	Lcom/tencent/mm/plugin/music/a/f/e;
        //   1234: getfield 171	com/tencent/mm/plugin/music/a/f/e:nrF	Landroid/media/MediaCodec;
        //   1237: iload 5
        //   1239: iconst_0
        //   1240: invokevirtual 325	android/media/MediaCodec:releaseOutputBuffer	(IZ)V
        //   1243: aload 13
        //   1245: getfield 328	android/media/MediaCodec$BufferInfo:flags	I
        //   1248: iconst_4
        //   1249: iand
        //   1250: ifeq +541 -> 1791
        //   1253: ldc 38
        //   1255: ldc_w 330
        //   1258: invokestatic 66	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
        //   1261: iconst_1
        //   1262: istore_2
        //   1263: goto +559 -> 1822
        //   1266: iload 5
        //   1268: bipush -3
        //   1270: if_icmpne +29 -> 1299
        //   1273: aload_0
        //   1274: getfield 14	com/tencent/mm/plugin/music/a/f/e$1:nrJ	Lcom/tencent/mm/plugin/music/a/f/e;
        //   1277: getfield 171	com/tencent/mm/plugin/music/a/f/e:nrF	Landroid/media/MediaCodec;
        //   1280: invokevirtual 185	android/media/MediaCodec:getOutputBuffers	()[Ljava/nio/ByteBuffer;
        //   1283: astore 10
        //   1285: ldc 38
        //   1287: ldc_w 332
        //   1290: invokestatic 45	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
        //   1293: iload 4
        //   1295: istore_3
        //   1296: goto -719 -> 577
        //   1299: iload 5
        //   1301: bipush -2
        //   1303: if_icmpne +79 -> 1382
        //   1306: aload_0
        //   1307: getfield 14	com/tencent/mm/plugin/music/a/f/e$1:nrJ	Lcom/tencent/mm/plugin/music/a/f/e;
        //   1310: getfield 171	com/tencent/mm/plugin/music/a/f/e:nrF	Landroid/media/MediaCodec;
        //   1313: invokevirtual 336	android/media/MediaCodec:getOutputFormat	()Landroid/media/MediaFormat;
        //   1316: astore 11
        //   1318: ldc 38
        //   1320: new 298	java/lang/StringBuilder
        //   1323: dup
        //   1324: ldc_w 338
        //   1327: invokespecial 302	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
        //   1330: aload 11
        //   1332: invokevirtual 341	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   1335: invokevirtual 310	java/lang/StringBuilder:toString	()Ljava/lang/String;
        //   1338: invokestatic 45	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
        //   1341: aload_0
        //   1342: getfield 14	com/tencent/mm/plugin/music/a/f/e$1:nrJ	Lcom/tencent/mm/plugin/music/a/f/e;
        //   1345: aload 11
        //   1347: ldc -117
        //   1349: invokevirtual 143	android/media/MediaFormat:getInteger	(Ljava/lang/String;)I
        //   1352: putfield 146	com/tencent/mm/plugin/music/a/f/e:sampleRate	I
        //   1355: aload_0
        //   1356: getfield 14	com/tencent/mm/plugin/music/a/f/e$1:nrJ	Lcom/tencent/mm/plugin/music/a/f/e;
        //   1359: aload 11
        //   1361: ldc -108
        //   1363: invokevirtual 143	android/media/MediaFormat:getInteger	(Ljava/lang/String;)I
        //   1366: putfield 151	com/tencent/mm/plugin/music/a/f/e:channels	I
        //   1369: aload_0
        //   1370: getfield 14	com/tencent/mm/plugin/music/a/f/e$1:nrJ	Lcom/tencent/mm/plugin/music/a/f/e;
        //   1373: invokevirtual 284	com/tencent/mm/plugin/music/a/f/e:aTl	()V
        //   1376: iload 4
        //   1378: istore_3
        //   1379: goto -802 -> 577
        //   1382: ldc 38
        //   1384: new 298	java/lang/StringBuilder
        //   1387: dup
        //   1388: ldc_w 343
        //   1391: invokespecial 302	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
        //   1394: iload 5
        //   1396: invokevirtual 306	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
        //   1399: invokevirtual 310	java/lang/StringBuilder:toString	()Ljava/lang/String;
        //   1402: invokestatic 45	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
        //   1405: iload 4
        //   1407: istore_3
        //   1408: goto -831 -> 577
        //   1411: aload_0
        //   1412: getfield 14	com/tencent/mm/plugin/music/a/f/e$1:nrJ	Lcom/tencent/mm/plugin/music/a/f/e;
        //   1415: getfield 161	com/tencent/mm/plugin/music/a/f/e:duration	J
        //   1418: ldc2_w 218
        //   1421: ldiv
        //   1422: aload_0
        //   1423: getfield 14	com/tencent/mm/plugin/music/a/f/e$1:nrJ	Lcom/tencent/mm/plugin/music/a/f/e;
        //   1426: getfield 232	com/tencent/mm/plugin/music/a/f/e:presentationTimeUs	J
        //   1429: ldc2_w 218
        //   1432: ldiv
        //   1433: lsub
        //   1434: ldc2_w 344
        //   1437: lcmp
        //   1438: ifge +135 -> 1573
        //   1441: iconst_1
        //   1442: istore 9
        //   1444: iload_3
        //   1445: bipush 50
        //   1447: if_icmplt +132 -> 1579
        //   1450: ldc 38
        //   1452: ldc_w 347
        //   1455: iconst_1
        //   1456: anewarray 4	java/lang/Object
        //   1459: dup
        //   1460: iconst_0
        //   1461: iload_3
        //   1462: invokestatic 93	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
        //   1465: aastore
        //   1466: invokestatic 96	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
        //   1469: aload_0
        //   1470: getfield 14	com/tencent/mm/plugin/music/a/f/e$1:nrJ	Lcom/tencent/mm/plugin/music/a/f/e;
        //   1473: sipush 706
        //   1476: putfield 124	com/tencent/mm/plugin/music/a/f/e:glO	I
        //   1479: aload_0
        //   1480: getfield 14	com/tencent/mm/plugin/music/a/f/e$1:nrJ	Lcom/tencent/mm/plugin/music/a/f/e;
        //   1483: iconst_1
        //   1484: invokevirtual 70	com/tencent/mm/plugin/music/a/f/e:gp	(Z)V
        //   1487: aload_0
        //   1488: getfield 14	com/tencent/mm/plugin/music/a/f/e$1:nrJ	Lcom/tencent/mm/plugin/music/a/f/e;
        //   1491: invokevirtual 127	com/tencent/mm/plugin/music/a/f/e:aTj	()V
        //   1494: aload_0
        //   1495: getfield 14	com/tencent/mm/plugin/music/a/f/e$1:nrJ	Lcom/tencent/mm/plugin/music/a/f/e;
        //   1498: invokevirtual 281	com/tencent/mm/plugin/music/a/f/e:aTk	()V
        //   1501: aload_0
        //   1502: getfield 14	com/tencent/mm/plugin/music/a/f/e$1:nrJ	Lcom/tencent/mm/plugin/music/a/f/e;
        //   1505: invokevirtual 284	com/tencent/mm/plugin/music/a/f/e:aTl	()V
        //   1508: aload_0
        //   1509: getfield 14	com/tencent/mm/plugin/music/a/f/e$1:nrJ	Lcom/tencent/mm/plugin/music/a/f/e;
        //   1512: aconst_null
        //   1513: putfield 55	com/tencent/mm/plugin/music/a/f/e:nrG	Ljava/lang/String;
        //   1516: aload_0
        //   1517: getfield 14	com/tencent/mm/plugin/music/a/f/e$1:nrJ	Lcom/tencent/mm/plugin/music/a/f/e;
        //   1520: aconst_null
        //   1521: putfield 111	com/tencent/mm/plugin/music/a/f/e:mVJ	Ljava/lang/String;
        //   1524: aload_0
        //   1525: getfield 14	com/tencent/mm/plugin/music/a/f/e$1:nrJ	Lcom/tencent/mm/plugin/music/a/f/e;
        //   1528: iconst_0
        //   1529: putfield 146	com/tencent/mm/plugin/music/a/f/e:sampleRate	I
        //   1532: aload_0
        //   1533: getfield 14	com/tencent/mm/plugin/music/a/f/e$1:nrJ	Lcom/tencent/mm/plugin/music/a/f/e;
        //   1536: iconst_0
        //   1537: putfield 151	com/tencent/mm/plugin/music/a/f/e:channels	I
        //   1540: aload_0
        //   1541: getfield 14	com/tencent/mm/plugin/music/a/f/e$1:nrJ	Lcom/tencent/mm/plugin/music/a/f/e;
        //   1544: lconst_0
        //   1545: putfield 232	com/tencent/mm/plugin/music/a/f/e:presentationTimeUs	J
        //   1548: aload_0
        //   1549: getfield 14	com/tencent/mm/plugin/music/a/f/e$1:nrJ	Lcom/tencent/mm/plugin/music/a/f/e;
        //   1552: lconst_0
        //   1553: putfield 161	com/tencent/mm/plugin/music/a/f/e:duration	J
        //   1556: ldc 38
        //   1558: ldc_w 349
        //   1561: invokestatic 45	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
        //   1564: ldc2_w 34
        //   1567: ldc 36
        //   1569: invokestatic 29	com/tencent/gmtrace/GMTrace:o	(JI)V
        //   1572: return
        //   1573: iconst_0
        //   1574: istore 9
        //   1576: goto -132 -> 1444
        //   1579: ldc 38
        //   1581: ldc_w 351
        //   1584: iconst_1
        //   1585: anewarray 4	java/lang/Object
        //   1588: dup
        //   1589: iconst_0
        //   1590: iload 9
        //   1592: invokestatic 356	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
        //   1595: aastore
        //   1596: invokestatic 137	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
        //   1599: aload_0
        //   1600: getfield 14	com/tencent/mm/plugin/music/a/f/e$1:nrJ	Lcom/tencent/mm/plugin/music/a/f/e;
        //   1603: iload 9
        //   1605: invokevirtual 359	com/tencent/mm/plugin/music/a/f/e:gq	(Z)V
        //   1608: goto -121 -> 1487
        //   1611: astore 10
        //   1613: ldc 38
        //   1615: aload 10
        //   1617: ldc_w 361
        //   1620: iconst_0
        //   1621: anewarray 4	java/lang/Object
        //   1624: invokestatic 133	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
        //   1627: aload_0
        //   1628: getfield 14	com/tencent/mm/plugin/music/a/f/e$1:nrJ	Lcom/tencent/mm/plugin/music/a/f/e;
        //   1631: sipush 706
        //   1634: putfield 124	com/tencent/mm/plugin/music/a/f/e:glO	I
        //   1637: aload_0
        //   1638: getfield 14	com/tencent/mm/plugin/music/a/f/e$1:nrJ	Lcom/tencent/mm/plugin/music/a/f/e;
        //   1641: iconst_1
        //   1642: invokevirtual 70	com/tencent/mm/plugin/music/a/f/e:gp	(Z)V
        //   1645: aload_0
        //   1646: getfield 14	com/tencent/mm/plugin/music/a/f/e$1:nrJ	Lcom/tencent/mm/plugin/music/a/f/e;
        //   1649: invokevirtual 127	com/tencent/mm/plugin/music/a/f/e:aTj	()V
        //   1652: aload_0
        //   1653: getfield 14	com/tencent/mm/plugin/music/a/f/e$1:nrJ	Lcom/tencent/mm/plugin/music/a/f/e;
        //   1656: invokevirtual 281	com/tencent/mm/plugin/music/a/f/e:aTk	()V
        //   1659: aload_0
        //   1660: getfield 14	com/tencent/mm/plugin/music/a/f/e$1:nrJ	Lcom/tencent/mm/plugin/music/a/f/e;
        //   1663: invokevirtual 284	com/tencent/mm/plugin/music/a/f/e:aTl	()V
        //   1666: aload_0
        //   1667: getfield 14	com/tencent/mm/plugin/music/a/f/e$1:nrJ	Lcom/tencent/mm/plugin/music/a/f/e;
        //   1670: aconst_null
        //   1671: putfield 55	com/tencent/mm/plugin/music/a/f/e:nrG	Ljava/lang/String;
        //   1674: aload_0
        //   1675: getfield 14	com/tencent/mm/plugin/music/a/f/e$1:nrJ	Lcom/tencent/mm/plugin/music/a/f/e;
        //   1678: aconst_null
        //   1679: putfield 111	com/tencent/mm/plugin/music/a/f/e:mVJ	Ljava/lang/String;
        //   1682: aload_0
        //   1683: getfield 14	com/tencent/mm/plugin/music/a/f/e$1:nrJ	Lcom/tencent/mm/plugin/music/a/f/e;
        //   1686: iconst_0
        //   1687: putfield 146	com/tencent/mm/plugin/music/a/f/e:sampleRate	I
        //   1690: aload_0
        //   1691: getfield 14	com/tencent/mm/plugin/music/a/f/e$1:nrJ	Lcom/tencent/mm/plugin/music/a/f/e;
        //   1694: iconst_0
        //   1695: putfield 151	com/tencent/mm/plugin/music/a/f/e:channels	I
        //   1698: aload_0
        //   1699: getfield 14	com/tencent/mm/plugin/music/a/f/e$1:nrJ	Lcom/tencent/mm/plugin/music/a/f/e;
        //   1702: lconst_0
        //   1703: putfield 232	com/tencent/mm/plugin/music/a/f/e:presentationTimeUs	J
        //   1706: aload_0
        //   1707: getfield 14	com/tencent/mm/plugin/music/a/f/e$1:nrJ	Lcom/tencent/mm/plugin/music/a/f/e;
        //   1710: lconst_0
        //   1711: putfield 161	com/tencent/mm/plugin/music/a/f/e:duration	J
        //   1714: goto -158 -> 1556
        //   1717: astore 10
        //   1719: aload_0
        //   1720: getfield 14	com/tencent/mm/plugin/music/a/f/e$1:nrJ	Lcom/tencent/mm/plugin/music/a/f/e;
        //   1723: invokevirtual 127	com/tencent/mm/plugin/music/a/f/e:aTj	()V
        //   1726: aload_0
        //   1727: getfield 14	com/tencent/mm/plugin/music/a/f/e$1:nrJ	Lcom/tencent/mm/plugin/music/a/f/e;
        //   1730: invokevirtual 281	com/tencent/mm/plugin/music/a/f/e:aTk	()V
        //   1733: aload_0
        //   1734: getfield 14	com/tencent/mm/plugin/music/a/f/e$1:nrJ	Lcom/tencent/mm/plugin/music/a/f/e;
        //   1737: invokevirtual 284	com/tencent/mm/plugin/music/a/f/e:aTl	()V
        //   1740: aload_0
        //   1741: getfield 14	com/tencent/mm/plugin/music/a/f/e$1:nrJ	Lcom/tencent/mm/plugin/music/a/f/e;
        //   1744: aconst_null
        //   1745: putfield 55	com/tencent/mm/plugin/music/a/f/e:nrG	Ljava/lang/String;
        //   1748: aload_0
        //   1749: getfield 14	com/tencent/mm/plugin/music/a/f/e$1:nrJ	Lcom/tencent/mm/plugin/music/a/f/e;
        //   1752: aconst_null
        //   1753: putfield 111	com/tencent/mm/plugin/music/a/f/e:mVJ	Ljava/lang/String;
        //   1756: aload_0
        //   1757: getfield 14	com/tencent/mm/plugin/music/a/f/e$1:nrJ	Lcom/tencent/mm/plugin/music/a/f/e;
        //   1760: iconst_0
        //   1761: putfield 146	com/tencent/mm/plugin/music/a/f/e:sampleRate	I
        //   1764: aload_0
        //   1765: getfield 14	com/tencent/mm/plugin/music/a/f/e$1:nrJ	Lcom/tencent/mm/plugin/music/a/f/e;
        //   1768: iconst_0
        //   1769: putfield 151	com/tencent/mm/plugin/music/a/f/e:channels	I
        //   1772: aload_0
        //   1773: getfield 14	com/tencent/mm/plugin/music/a/f/e$1:nrJ	Lcom/tencent/mm/plugin/music/a/f/e;
        //   1776: lconst_0
        //   1777: putfield 232	com/tencent/mm/plugin/music/a/f/e:presentationTimeUs	J
        //   1780: aload_0
        //   1781: getfield 14	com/tencent/mm/plugin/music/a/f/e$1:nrJ	Lcom/tencent/mm/plugin/music/a/f/e;
        //   1784: lconst_0
        //   1785: putfield 161	com/tencent/mm/plugin/music/a/f/e:duration	J
        //   1788: aload 10
        //   1790: athrow
        //   1791: goto +31 -> 1822
        //   1794: iload 4
        //   1796: istore_3
        //   1797: goto -1037 -> 760
        //   1800: iconst_0
        //   1801: istore 5
        //   1803: goto -1107 -> 696
        //   1806: goto -1078 -> 728
        //   1809: bipush 12
        //   1811: istore 4
        //   1813: goto -981 -> 832
        //   1816: iconst_1
        //   1817: istore 4
        //   1819: goto -920 -> 899
        //   1822: goto -1245 -> 577
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	1825	0	this	1
        //   132	1010	1	i	int
        //   108	1155	2	j	int
        //   552	1245	3	k	int
        //   607	1211	4	m	int
        //   653	1149	5	n	int
        //   626	556	6	i1	int
        //   687	16	7	l	long
        //   1442	162	9	bool	boolean
        //   135	121	10	localObject1	Object
        //   275	200	10	localException1	Exception
        //   573	188	10	localObject2	Object
        //   1008	5	10	localException2	Exception
        //   1036	1	10	localObject3	Object
        //   1041	5	10	localException3	Exception
        //   1283	1	10	arrayOfByteBuffer1	java.nio.ByteBuffer[]
        //   1611	5	10	localException4	Exception
        //   1717	72	10	localObject4	Object
        //   96	1264	11	localObject5	Object
        //   92	542	12	arrayOfByteBuffer2	java.nio.ByteBuffer[]
        //   89	1155	13	localBufferInfo	android.media.MediaCodec.BufferInfo
        //   765	112	14	locale	e
        // Exception table:
        //   from	to	target	type
        //   71	88	275	java/lang/Exception
        //   98	109	1008	java/lang/Exception
        //   113	131	1008	java/lang/Exception
        //   146	159	1008	java/lang/Exception
        //   163	177	1008	java/lang/Exception
        //   181	194	1008	java/lang/Exception
        //   198	213	1008	java/lang/Exception
        //   222	229	1008	java/lang/Exception
        //   233	243	1008	java/lang/Exception
        //   247	255	1008	java/lang/Exception
        //   259	266	1008	java/lang/Exception
        //   328	344	1008	java/lang/Exception
        //   348	362	1008	java/lang/Exception
        //   366	380	1008	java/lang/Exception
        //   384	398	1008	java/lang/Exception
        //   398	440	1041	java/lang/Exception
        //   587	604	1611	java/lang/Exception
        //   613	628	1611	java/lang/Exception
        //   640	655	1611	java/lang/Exception
        //   660	667	1611	java/lang/Exception
        //   671	689	1611	java/lang/Exception
        //   696	709	1611	java/lang/Exception
        //   715	726	1611	java/lang/Exception
        //   728	745	1611	java/lang/Exception
        //   750	758	1611	java/lang/Exception
        //   767	829	1611	java/lang/Exception
        //   832	888	1611	java/lang/Exception
        //   888	896	1611	java/lang/Exception
        //   904	930	1611	java/lang/Exception
        //   1098	1127	1611	java/lang/Exception
        //   1129	1137	1611	java/lang/Exception
        //   1145	1166	1611	java/lang/Exception
        //   1169	1192	1611	java/lang/Exception
        //   1195	1205	1611	java/lang/Exception
        //   1205	1230	1611	java/lang/Exception
        //   1230	1261	1611	java/lang/Exception
        //   1273	1293	1611	java/lang/Exception
        //   1306	1376	1611	java/lang/Exception
        //   1382	1405	1611	java/lang/Exception
        //   1411	1441	1611	java/lang/Exception
        //   1450	1487	1611	java/lang/Exception
        //   1579	1608	1611	java/lang/Exception
        //   587	604	1717	finally
        //   613	628	1717	finally
        //   640	655	1717	finally
        //   660	667	1717	finally
        //   671	689	1717	finally
        //   696	709	1717	finally
        //   715	726	1717	finally
        //   728	745	1717	finally
        //   750	758	1717	finally
        //   767	829	1717	finally
        //   832	888	1717	finally
        //   888	896	1717	finally
        //   904	930	1717	finally
        //   1098	1127	1717	finally
        //   1129	1137	1717	finally
        //   1145	1166	1717	finally
        //   1169	1192	1717	finally
        //   1195	1205	1717	finally
        //   1205	1230	1717	finally
        //   1230	1261	1717	finally
        //   1273	1293	1717	finally
        //   1306	1376	1717	finally
        //   1382	1405	1717	finally
        //   1411	1441	1717	finally
        //   1450	1487	1717	finally
        //   1579	1608	1717	finally
        //   1613	1645	1717	finally
      }
    };
    GMTrace.o(4858547535872L, 36199);
  }
  
  private void aTm()
  {
    try
    {
      GMTrace.i(4859218624512L, 36204);
      w.i("MicroMsg.Music.MMPlayer", "sync notify");
      try
      {
        notify();
        GMTrace.o(4859218624512L, 36204);
      }
      catch (Exception localException)
      {
        for (;;)
        {
          w.printErrStackTrace("MicroMsg.Music.MMPlayer", localException, "syncNotify", new Object[0]);
          GMTrace.o(4859218624512L, 36204);
        }
      }
      return;
    }
    finally {}
  }
  
  public final void DM(String paramString)
  {
    GMTrace.i(4858681753600L, 36200);
    this.nrG = paramString;
    GMTrace.o(4858681753600L, 36200);
  }
  
  public final boolean aTg()
  {
    GMTrace.i(4860023930880L, 36210);
    if (!this.mZM)
    {
      GMTrace.o(4860023930880L, 36210);
      return true;
    }
    GMTrace.o(4860023930880L, 36210);
    return false;
  }
  
  public final int aTh()
  {
    GMTrace.i(4858815971328L, 36201);
    int i = (int)(this.presentationTimeUs / 1000L);
    GMTrace.o(4858815971328L, 36201);
    return i;
  }
  
  public final String aTi()
  {
    GMTrace.i(18371319955456L, 136877);
    String str = this.mVJ;
    GMTrace.o(18371319955456L, 136877);
    return str;
  }
  
  public final void aTj()
  {
    GMTrace.i(16025462505472L, 119399);
    try
    {
      if (this.mVN != null)
      {
        this.mVN.release();
        this.mVN = null;
      }
      GMTrace.o(16025462505472L, 119399);
      return;
    }
    catch (Exception localException)
    {
      w.printErrStackTrace("MicroMsg.Music.MMPlayer", localException, "releaseMediaExtractor", new Object[0]);
      GMTrace.o(16025462505472L, 119399);
    }
  }
  
  public final void aTk()
  {
    GMTrace.i(16025596723200L, 119400);
    try
    {
      if (this.nrF != null)
      {
        this.nrF.stop();
        this.nrF.release();
        this.nrF = null;
      }
      GMTrace.o(16025596723200L, 119400);
      return;
    }
    catch (Exception localException)
    {
      w.printErrStackTrace("MicroMsg.Music.MMPlayer", localException, "releaseMediaCodec", new Object[0]);
      GMTrace.o(16025596723200L, 119400);
    }
  }
  
  public final void aTl()
  {
    GMTrace.i(16025730940928L, 119401);
    try
    {
      if (this.hdT != null)
      {
        this.hdT.flush();
        this.hdT.release();
        this.hdT = null;
      }
      GMTrace.o(16025730940928L, 119401);
      return;
    }
    catch (Exception localException)
    {
      w.printErrStackTrace("MicroMsg.Music.MMPlayer", localException, "releaseAudioTrack", new Object[0]);
      GMTrace.o(16025730940928L, 119401);
    }
  }
  
  public final void aTn()
  {
    try
    {
      GMTrace.i(4859755495424L, 36208);
      while (aTg())
      {
        boolean bool = this.nrz.aTp();
        if (!bool) {
          break;
        }
        try
        {
          w.i("MicroMsg.Music.MMPlayer", "wait play");
          wait();
        }
        catch (InterruptedException localInterruptedException)
        {
          w.printErrStackTrace("MicroMsg.Music.MMPlayer", localInterruptedException, "waitPlay", new Object[0]);
        }
      }
      GMTrace.o(4859755495424L, 36208);
    }
    finally {}
  }
  
  public final int getDuration()
  {
    GMTrace.i(4858950189056L, 36202);
    int i = (int)(this.duration / 1000L);
    GMTrace.o(4858950189056L, 36202);
    return i;
  }
  
  protected final void gp(boolean paramBoolean)
  {
    GMTrace.i(4860158148608L, 36211);
    this.nrH = false;
    this.nrz.nsg = 4;
    this.mZM = true;
    super.gp(paramBoolean);
    GMTrace.o(4860158148608L, 36211);
  }
  
  protected final void gq(boolean paramBoolean)
  {
    GMTrace.i(4860292366336L, 36212);
    this.nrz.nsg = 4;
    this.mZM = true;
    super.gq(paramBoolean);
    GMTrace.o(4860292366336L, 36212);
  }
  
  public final boolean isPlaying()
  {
    GMTrace.i(4859889713152L, 36209);
    boolean bool = this.nrz.isPlaying();
    GMTrace.o(4859889713152L, 36209);
    return bool;
  }
  
  public final void pause()
  {
    GMTrace.i(4859487059968L, 36206);
    w.i("MicroMsg.Music.MMPlayer", "pause");
    if (!aTg())
    {
      GMTrace.o(4859487059968L, 36206);
      return;
    }
    this.nrz.nsg = 2;
    GMTrace.o(4859487059968L, 36206);
  }
  
  public final void play()
  {
    GMTrace.i(4859084406784L, 36203);
    w.i("MicroMsg.Music.MMPlayer", "play");
    if (!aTg())
    {
      this.mZM = false;
      com.tencent.mm.sdk.f.e.post(this.nrI, "music_player");
      GMTrace.o(4859084406784L, 36203);
      return;
    }
    if ((aTg()) && (this.nrz.aTp()))
    {
      this.nrz.nsg = 3;
      aTm();
    }
    GMTrace.o(4859084406784L, 36203);
  }
  
  public final void seek(long paramLong)
  {
    GMTrace.i(4859621277696L, 36207);
    this.mVN.seekTo(1000L * paramLong, 2);
    GMTrace.o(4859621277696L, 36207);
  }
  
  public final void stop()
  {
    GMTrace.i(4859352842240L, 36205);
    w.i("MicroMsg.Music.MMPlayer", "stop");
    this.mZM = true;
    if (this.nrz.aTp()) {
      aTm();
    }
    GMTrace.o(4859352842240L, 36205);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\music\a\f\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */