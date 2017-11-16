package com.tencent.mm.storage.emotion;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bu.f;
import com.tencent.mm.bu.f.a;
import com.tencent.mm.sdk.e.c.a;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.i;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class n
  extends i<m>
  implements f.a
{
  public static final String[] fTX;
  private e fTZ;
  
  static
  {
    GMTrace.i(1562831224832L, 11644);
    fTX = new String[] { i.a(m.fTp, "EmotionRewardTipInfo") };
    GMTrace.o(1562831224832L, 11644);
  }
  
  public n(e parame)
  {
    this(parame, m.fTp, "EmotionRewardTipInfo");
    GMTrace.i(1562025918464L, 11638);
    GMTrace.o(1562025918464L, 11638);
  }
  
  private n(e parame, c.a parama, String paramString)
  {
    super(parame, parama, paramString, null);
    GMTrace.i(1562160136192L, 11639);
    this.fTZ = parame;
    GMTrace.o(1562160136192L, 11639);
  }
  
  public final int a(f paramf)
  {
    GMTrace.i(1562294353920L, 11640);
    if (paramf != null) {
      this.fTZ = paramf;
    }
    GMTrace.o(1562294353920L, 11640);
    return 0;
  }
  
  public final boolean a(m paramm)
  {
    GMTrace.i(1562697007104L, 11643);
    if (paramm == null)
    {
      w.w("MicroMsg.emoji.EmotionRewardTipStorage", "save failed info is null");
      GMTrace.o(1562697007104L, 11643);
      return false;
    }
    long l = this.fTZ.replace("EmotionRewardTipInfo", "prodcutID", paramm.qL());
    if (l > 0L) {
      w.i("MicroMsg.emoji.EmotionRewardTipStorage", "save success");
    }
    while (l > 0L)
    {
      GMTrace.o(1562697007104L, 11643);
      return true;
      w.i("MicroMsg.emoji.EmotionRewardTipStorage", "save failed");
    }
    GMTrace.o(1562697007104L, 11643);
    return false;
  }
  
  /* Error */
  public final m bVd()
  {
    // Byte code:
    //   0: ldc2_w 94
    //   3: sipush 11641
    //   6: invokestatic 21	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: aload_0
    //   10: getfield 55	com/tencent/mm/storage/emotion/n:fTZ	Lcom/tencent/mm/sdk/e/e;
    //   13: ldc 97
    //   15: iconst_0
    //   16: anewarray 23	java/lang/String
    //   19: iconst_2
    //   20: invokeinterface 100 4 0
    //   25: astore_2
    //   26: aload_2
    //   27: ifnull +52 -> 79
    //   30: aload_2
    //   31: astore_1
    //   32: aload_2
    //   33: invokeinterface 106 1 0
    //   38: ifeq +41 -> 79
    //   41: aload_2
    //   42: astore_1
    //   43: new 25	com/tencent/mm/storage/emotion/m
    //   46: dup
    //   47: invokespecial 108	com/tencent/mm/storage/emotion/m:<init>	()V
    //   50: astore_3
    //   51: aload_2
    //   52: astore_1
    //   53: aload_3
    //   54: aload_2
    //   55: invokevirtual 112	com/tencent/mm/storage/emotion/m:b	(Landroid/database/Cursor;)V
    //   58: aload_2
    //   59: ifnull +9 -> 68
    //   62: aload_2
    //   63: invokeinterface 115 1 0
    //   68: ldc2_w 94
    //   71: sipush 11641
    //   74: invokestatic 40	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   77: aload_3
    //   78: areturn
    //   79: aload_2
    //   80: ifnull +9 -> 89
    //   83: aload_2
    //   84: invokeinterface 115 1 0
    //   89: ldc2_w 94
    //   92: sipush 11641
    //   95: invokestatic 40	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   98: aconst_null
    //   99: areturn
    //   100: astore_3
    //   101: aconst_null
    //   102: astore_2
    //   103: aload_2
    //   104: astore_1
    //   105: ldc 63
    //   107: ldc 117
    //   109: iconst_1
    //   110: anewarray 119	java/lang/Object
    //   113: dup
    //   114: iconst_0
    //   115: aload_3
    //   116: invokestatic 125	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   119: aastore
    //   120: invokestatic 129	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   123: aload_2
    //   124: ifnull -35 -> 89
    //   127: aload_2
    //   128: invokeinterface 115 1 0
    //   133: goto -44 -> 89
    //   136: astore_2
    //   137: aconst_null
    //   138: astore_1
    //   139: aload_1
    //   140: ifnull +9 -> 149
    //   143: aload_1
    //   144: invokeinterface 115 1 0
    //   149: aload_2
    //   150: athrow
    //   151: astore_2
    //   152: goto -13 -> 139
    //   155: astore_3
    //   156: goto -53 -> 103
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	159	0	this	n
    //   31	113	1	localCursor1	android.database.Cursor
    //   25	103	2	localCursor2	android.database.Cursor
    //   136	14	2	localObject1	Object
    //   151	1	2	localObject2	Object
    //   50	28	3	localm	m
    //   100	16	3	localException1	Exception
    //   155	1	3	localException2	Exception
    // Exception table:
    //   from	to	target	type
    //   9	26	100	java/lang/Exception
    //   9	26	136	finally
    //   32	41	151	finally
    //   43	51	151	finally
    //   53	58	151	finally
    //   105	123	151	finally
    //   32	41	155	java/lang/Exception
    //   43	51	155	java/lang/Exception
    //   53	58	155	java/lang/Exception
  }
  
  public final boolean cO(String paramString, int paramInt)
  {
    GMTrace.i(1562562789376L, 11642);
    if (bg.nm(paramString))
    {
      w.w("MicroMsg.emoji.EmotionRewardTipStorage", "product id is null.");
      GMTrace.o(1562562789376L, 11642);
      return false;
    }
    paramString = "UPDATE EmotionRewardTipInfo SET flag=" + paramInt + ",setFlagTime=" + System.currentTimeMillis() + " WHERE prodcutID='" + paramString + "'";
    boolean bool = this.fTZ.eZ("EmotionRewardTipInfo", paramString);
    w.i("MicroMsg.emoji.EmotionRewardTipStorage", "updateFlag result:%b", new Object[] { Boolean.valueOf(bool) });
    GMTrace.o(1562562789376L, 11642);
    return bool;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\storage\emotion\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */