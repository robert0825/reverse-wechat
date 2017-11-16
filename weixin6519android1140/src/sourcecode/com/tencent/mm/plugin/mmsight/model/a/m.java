package com.tencent.mm.plugin.mmsight.model.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;

public final class m
  implements e
{
  private int audioSampleRate;
  private int bitrate;
  private int ljb;
  private int nap;
  private String nbG;
  private float nbx;
  
  public m(int paramInt1, String paramString, float paramFloat, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(7349897003008L, 54761);
    this.nap = paramInt1;
    this.nbG = paramString;
    this.nbx = paramFloat;
    this.bitrate = paramInt2;
    this.ljb = paramInt3;
    this.audioSampleRate = paramInt4;
    w.d("MicroMsg.MMSightMP4Muxer", "create MMSightMP4Muxer, bufId: %s, recordPath: %s, fps: %s, bitrate: %s, videoDuration: %s, audioSampleRate%s", new Object[] { Integer.valueOf(paramInt1), paramString, Float.valueOf(paramFloat), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(paramInt4) });
    GMTrace.o(7349897003008L, 54761);
  }
  
  /* Error */
  public final boolean aPF()
  {
    // Byte code:
    //   0: ldc2_w 71
    //   3: ldc 73
    //   5: invokestatic 29	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   8: invokestatic 79	com/tencent/mm/sdk/platformtools/bg:Pw	()J
    //   11: lstore_2
    //   12: aload_0
    //   13: getfield 33	com/tencent/mm/plugin/mmsight/model/a/m:nbG	Ljava/lang/String;
    //   16: invokestatic 85	com/tencent/mm/plugin/sight/base/d:Gz	(Ljava/lang/String;)Ljava/lang/String;
    //   19: astore 5
    //   21: aload 5
    //   23: invokestatic 91	com/tencent/mm/modelsfs/FileOp:aZ	(Ljava/lang/String;)Z
    //   26: istore 4
    //   28: iload 4
    //   30: ifne +6 -> 36
    //   33: aconst_null
    //   34: astore 5
    //   36: ldc 43
    //   38: ldc 93
    //   40: iconst_2
    //   41: anewarray 4	java/lang/Object
    //   44: dup
    //   45: iconst_0
    //   46: aload_0
    //   47: getfield 31	com/tencent/mm/plugin/mmsight/model/a/m:nap	I
    //   50: invokestatic 51	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   53: aastore
    //   54: dup
    //   55: iconst_1
    //   56: aload 5
    //   58: aastore
    //   59: invokestatic 95	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   62: aload_0
    //   63: getfield 31	com/tencent/mm/plugin/mmsight/model/a/m:nap	I
    //   66: aload 5
    //   68: aload_0
    //   69: getfield 41	com/tencent/mm/plugin/mmsight/model/a/m:audioSampleRate	I
    //   72: sipush 1024
    //   75: iconst_2
    //   76: iconst_1
    //   77: lconst_0
    //   78: aload_0
    //   79: getfield 33	com/tencent/mm/plugin/mmsight/model/a/m:nbG	Ljava/lang/String;
    //   82: aload_0
    //   83: getfield 35	com/tencent/mm/plugin/mmsight/model/a/m:nbx	F
    //   86: sipush 1000
    //   89: aload_0
    //   90: getfield 39	com/tencent/mm/plugin/mmsight/model/a/m:ljb	I
    //   93: invokestatic 101	java/lang/Math:max	(II)I
    //   96: aload_0
    //   97: getfield 37	com/tencent/mm/plugin/mmsight/model/a/m:bitrate	I
    //   100: getstatic 106	com/tencent/mm/plugin/sight/base/b:oRB	I
    //   103: bipush 8
    //   105: iconst_2
    //   106: ldc 107
    //   108: aconst_null
    //   109: iconst_0
    //   110: iconst_0
    //   111: invokestatic 113	com/tencent/mm/plugin/sight/base/SightVideoJNI:muxing	(ILjava/lang/String;IIIIJLjava/lang/String;FIIIIIF[BIZ)I
    //   114: istore_1
    //   115: ldc 43
    //   117: ldc 115
    //   119: iconst_2
    //   120: anewarray 4	java/lang/Object
    //   123: dup
    //   124: iconst_0
    //   125: iload_1
    //   126: invokestatic 51	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   129: aastore
    //   130: dup
    //   131: iconst_1
    //   132: lload_2
    //   133: invokestatic 119	com/tencent/mm/sdk/platformtools/bg:aI	(J)J
    //   136: invokestatic 124	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   139: aastore
    //   140: invokestatic 95	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   143: aload 5
    //   145: invokestatic 127	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
    //   148: ifne +9 -> 157
    //   151: aload 5
    //   153: invokestatic 130	com/tencent/mm/modelsfs/FileOp:deleteFile	(Ljava/lang/String;)Z
    //   156: pop
    //   157: iload_1
    //   158: iflt +21 -> 179
    //   161: ldc2_w 71
    //   164: ldc 73
    //   166: invokestatic 65	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   169: iconst_1
    //   170: ireturn
    //   171: astore 5
    //   173: aconst_null
    //   174: astore 5
    //   176: goto -140 -> 36
    //   179: ldc2_w 71
    //   182: ldc 73
    //   184: invokestatic 65	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   187: iconst_0
    //   188: ireturn
    //   189: astore 5
    //   191: goto -34 -> 157
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	194	0	this	m
    //   114	44	1	i	int
    //   11	122	2	l	long
    //   26	3	4	bool	boolean
    //   19	133	5	str	String
    //   171	1	5	localException1	Exception
    //   174	1	5	localObject	Object
    //   189	1	5	localException2	Exception
    // Exception table:
    //   from	to	target	type
    //   21	28	171	java/lang/Exception
    //   151	157	189	java/lang/Exception
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\mmsight\model\a\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */