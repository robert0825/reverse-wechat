package com.tencent.mm.storage.emotion;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bu.f;
import com.tencent.mm.bu.f.a;
import com.tencent.mm.sdk.e.c.a;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.i;

public final class t
  extends i<s>
  implements f.a
{
  public static final String[] fTX;
  private static final String[] vCR;
  public e fTZ;
  
  static
  {
    GMTrace.i(1561891700736L, 11637);
    fTX = new String[] { i.a(s.fTp, "SmileyPanelConfigInfo") };
    vCR = new String[] { "position", "key" };
    GMTrace.o(1561891700736L, 11637);
  }
  
  public t(e parame)
  {
    this(parame, s.fTp, "SmileyPanelConfigInfo");
    GMTrace.i(1561354829824L, 11633);
    GMTrace.o(1561354829824L, 11633);
  }
  
  private t(e parame, c.a parama, String paramString)
  {
    super(parame, parama, paramString, null);
    GMTrace.i(1561489047552L, 11634);
    this.fTZ = parame;
    GMTrace.o(1561489047552L, 11634);
  }
  
  public final int a(f paramf)
  {
    GMTrace.i(1561623265280L, 11635);
    if (paramf != null) {
      this.fTZ = paramf;
    }
    GMTrace.o(1561623265280L, 11635);
    return 0;
  }
  
  /* Error */
  public final java.util.ArrayList<s> aqC()
  {
    // Byte code:
    //   0: ldc2_w 70
    //   3: sipush 11636
    //   6: invokestatic 22	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: new 73	java/util/ArrayList
    //   12: dup
    //   13: invokespecial 75	java/util/ArrayList:<init>	()V
    //   16: astore 5
    //   18: aload_0
    //   19: getfield 62	com/tencent/mm/storage/emotion/t:fTZ	Lcom/tencent/mm/sdk/e/e;
    //   22: ldc 32
    //   24: getstatic 44	com/tencent/mm/storage/emotion/t:vCR	[Ljava/lang/String;
    //   27: aconst_null
    //   28: aconst_null
    //   29: aconst_null
    //   30: aconst_null
    //   31: aconst_null
    //   32: iconst_2
    //   33: invokeinterface 80 9 0
    //   38: astore_3
    //   39: aload_3
    //   40: ifnull +56 -> 96
    //   43: aload_3
    //   44: astore_2
    //   45: aload_3
    //   46: invokeinterface 86 1 0
    //   51: ifeq +45 -> 96
    //   54: aload_3
    //   55: astore_2
    //   56: new 26	com/tencent/mm/storage/emotion/s
    //   59: dup
    //   60: invokespecial 87	com/tencent/mm/storage/emotion/s:<init>	()V
    //   63: astore 4
    //   65: aload_3
    //   66: astore_2
    //   67: aload 4
    //   69: aload_3
    //   70: invokevirtual 91	com/tencent/mm/storage/emotion/s:b	(Landroid/database/Cursor;)V
    //   73: aload_3
    //   74: astore_2
    //   75: aload 5
    //   77: aload 4
    //   79: invokevirtual 95	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   82: pop
    //   83: aload_3
    //   84: astore_2
    //   85: aload_3
    //   86: invokeinterface 98 1 0
    //   91: istore_1
    //   92: iload_1
    //   93: ifne -39 -> 54
    //   96: aload_3
    //   97: ifnull +9 -> 106
    //   100: aload_3
    //   101: invokeinterface 101 1 0
    //   106: ldc2_w 70
    //   109: sipush 11636
    //   112: invokestatic 47	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   115: aload 5
    //   117: areturn
    //   118: astore 4
    //   120: aconst_null
    //   121: astore_3
    //   122: aload_3
    //   123: astore_2
    //   124: ldc 103
    //   126: aload 4
    //   128: invokestatic 109	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   131: invokestatic 115	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   134: aload_3
    //   135: ifnull -29 -> 106
    //   138: aload_3
    //   139: invokeinterface 101 1 0
    //   144: goto -38 -> 106
    //   147: astore_3
    //   148: aconst_null
    //   149: astore_2
    //   150: aload_2
    //   151: ifnull +9 -> 160
    //   154: aload_2
    //   155: invokeinterface 101 1 0
    //   160: aload_3
    //   161: athrow
    //   162: astore_3
    //   163: goto -13 -> 150
    //   166: astore 4
    //   168: goto -46 -> 122
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	171	0	this	t
    //   91	2	1	bool	boolean
    //   44	111	2	localCursor1	android.database.Cursor
    //   38	101	3	localCursor2	android.database.Cursor
    //   147	14	3	localObject1	Object
    //   162	1	3	localObject2	Object
    //   63	15	4	locals	s
    //   118	9	4	localException1	Exception
    //   166	1	4	localException2	Exception
    //   16	100	5	localArrayList	java.util.ArrayList
    // Exception table:
    //   from	to	target	type
    //   18	39	118	java/lang/Exception
    //   18	39	147	finally
    //   45	54	162	finally
    //   56	65	162	finally
    //   67	73	162	finally
    //   75	83	162	finally
    //   85	92	162	finally
    //   124	134	162	finally
    //   45	54	166	java/lang/Exception
    //   56	65	166	java/lang/Exception
    //   67	73	166	java/lang/Exception
    //   75	83	166	java/lang/Exception
    //   85	92	166	java/lang/Exception
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\storage\emotion\t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */