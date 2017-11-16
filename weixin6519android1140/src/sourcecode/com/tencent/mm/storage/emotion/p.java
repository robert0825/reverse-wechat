package com.tencent.mm.storage.emotion;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bu.f;
import com.tencent.mm.bu.f.a;
import com.tencent.mm.protocal.c.aac;
import com.tencent.mm.protocal.c.acl;
import com.tencent.mm.protocal.c.bef;
import com.tencent.mm.protocal.c.zu;
import com.tencent.mm.sdk.e.c.a;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.i;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.io.IOException;

public final class p
  extends i<o>
  implements f.a
{
  public static final String[] fTX;
  private e fTZ;
  
  static
  {
    GMTrace.i(1550751629312L, 11554);
    fTX = new String[] { i.a(o.fTp, "GetEmotionListCache") };
    GMTrace.o(1550751629312L, 11554);
  }
  
  public p(e parame)
  {
    this(parame, o.fTp, "GetEmotionListCache");
    GMTrace.i(1549409452032L, 11544);
    GMTrace.o(1549409452032L, 11544);
  }
  
  private p(e parame, c.a parama, String paramString)
  {
    super(parame, parama, paramString, null);
    GMTrace.i(1549543669760L, 11545);
    this.fTZ = parame;
    GMTrace.o(1549543669760L, 11545);
  }
  
  private boolean UR(String paramString)
  {
    GMTrace.i(1549812105216L, 11547);
    if (this.fTZ.delete("GetEmotionListCache", "reqType=?", new String[] { paramString }) > 0)
    {
      GMTrace.o(1549812105216L, 11547);
      return true;
    }
    GMTrace.o(1549812105216L, 11547);
    return false;
  }
  
  public final aac AF(int paramInt)
  {
    Object localObject3 = null;
    GMTrace.i(1550080540672L, 11549);
    Cursor localCursor = this.fTZ.a("GetEmotionListCache", null, "reqType=?", new String[] { String.valueOf(paramInt) }, null, null, null, 2);
    Object localObject1 = localObject3;
    o localo;
    if (localCursor != null)
    {
      localObject1 = localObject3;
      if (localCursor.moveToFirst()) {
        localo = new o(localCursor);
      }
    }
    try
    {
      localObject1 = new aac();
      ((aac)localObject1).aD(localo.field_cache);
      w.d("MicroMsg.emoji.Storage", "succed get cache: %d", new Object[] { Integer.valueOf(paramInt) });
      if (localCursor != null) {
        localCursor.close();
      }
      GMTrace.o(1550080540672L, 11549);
      return (aac)localObject1;
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        w.e("MicroMsg.emoji.Storage", "exception:%s", new Object[] { bg.f(localIOException) });
        Object localObject2 = localObject3;
      }
    }
  }
  
  public final acl US(String paramString)
  {
    Object localObject2 = null;
    GMTrace.i(1550348976128L, 11551);
    Cursor localCursor = this.fTZ.a("GetEmotionListCache", null, "reqType=?", new String[] { paramString }, null, null, null, 2);
    Object localObject1 = localObject2;
    o localo;
    if (localCursor != null)
    {
      localObject1 = localObject2;
      if (localCursor.moveToFirst()) {
        localo = new o(localCursor);
      }
    }
    try
    {
      localObject1 = new acl();
      ((acl)localObject1).aD(localo.field_cache);
      w.d("MicroMsg.emoji.Storage", "succed get designerID cache: %s", new Object[] { paramString });
      if (localCursor != null) {
        localCursor.close();
      }
      GMTrace.o(1550348976128L, 11551);
      return (acl)localObject1;
    }
    catch (IOException paramString)
    {
      for (;;)
      {
        w.e("MicroMsg.emoji.Storage", "exception:%s", new Object[] { bg.f(paramString) });
        localObject1 = localObject2;
      }
    }
  }
  
  /* Error */
  public final zu UT(String paramString)
  {
    // Byte code:
    //   0: ldc2_w 145
    //   3: ldc -109
    //   5: invokestatic 21	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   8: aload_1
    //   9: invokestatic 150	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
    //   12: ifeq +20 -> 32
    //   15: ldc 103
    //   17: ldc -104
    //   19: invokestatic 156	com/tencent/mm/sdk/platformtools/w:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   22: ldc2_w 145
    //   25: ldc -109
    //   27: invokestatic 40	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   30: aconst_null
    //   31: areturn
    //   32: aload_0
    //   33: getfield 55	com/tencent/mm/storage/emotion/p:fTZ	Lcom/tencent/mm/sdk/e/e;
    //   36: ldc 31
    //   38: aconst_null
    //   39: ldc 61
    //   41: iconst_1
    //   42: anewarray 23	java/lang/String
    //   45: dup
    //   46: iconst_0
    //   47: aload_1
    //   48: aastore
    //   49: aconst_null
    //   50: aconst_null
    //   51: aconst_null
    //   52: invokeinterface 160 8 0
    //   57: astore_1
    //   58: aload_1
    //   59: ifnull +140 -> 199
    //   62: aload_1
    //   63: astore_2
    //   64: aload_1
    //   65: invokeinterface 86 1 0
    //   70: ifeq +129 -> 199
    //   73: aload_1
    //   74: astore_2
    //   75: new 25	com/tencent/mm/storage/emotion/o
    //   78: dup
    //   79: aload_1
    //   80: invokespecial 89	com/tencent/mm/storage/emotion/o:<init>	(Landroid/database/Cursor;)V
    //   83: astore 4
    //   85: aload_1
    //   86: astore_2
    //   87: new 162	com/tencent/mm/protocal/c/zu
    //   90: dup
    //   91: invokespecial 163	com/tencent/mm/protocal/c/zu:<init>	()V
    //   94: astore_3
    //   95: aload_1
    //   96: astore_2
    //   97: aload_3
    //   98: aload 4
    //   100: getfield 97	com/tencent/mm/storage/emotion/o:field_cache	[B
    //   103: invokevirtual 164	com/tencent/mm/protocal/c/zu:aD	([B)Lcom/tencent/mm/bm/a;
    //   106: pop
    //   107: aload_3
    //   108: astore_2
    //   109: aload_2
    //   110: astore_3
    //   111: aload_1
    //   112: ifnull +11 -> 123
    //   115: aload_1
    //   116: invokeinterface 121 1 0
    //   121: aload_2
    //   122: astore_3
    //   123: ldc2_w 145
    //   126: ldc -109
    //   128: invokestatic 40	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   131: aload_3
    //   132: areturn
    //   133: astore_3
    //   134: aconst_null
    //   135: astore_1
    //   136: aload_1
    //   137: astore_2
    //   138: ldc 103
    //   140: ldc 123
    //   142: iconst_1
    //   143: anewarray 107	java/lang/Object
    //   146: dup
    //   147: iconst_0
    //   148: aload_3
    //   149: invokestatic 129	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   152: aastore
    //   153: invokestatic 132	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   156: aload_1
    //   157: ifnull +37 -> 194
    //   160: aload_1
    //   161: invokeinterface 121 1 0
    //   166: aconst_null
    //   167: astore_3
    //   168: goto -45 -> 123
    //   171: astore_1
    //   172: aconst_null
    //   173: astore_2
    //   174: aload_2
    //   175: ifnull +9 -> 184
    //   178: aload_2
    //   179: invokeinterface 121 1 0
    //   184: aload_1
    //   185: athrow
    //   186: astore_1
    //   187: goto -13 -> 174
    //   190: astore_3
    //   191: goto -55 -> 136
    //   194: aconst_null
    //   195: astore_3
    //   196: goto -73 -> 123
    //   199: aconst_null
    //   200: astore_2
    //   201: goto -92 -> 109
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	204	0	this	p
    //   0	204	1	paramString	String
    //   63	138	2	localObject1	Object
    //   94	38	3	localObject2	Object
    //   133	16	3	localIOException1	IOException
    //   167	1	3	localObject3	Object
    //   190	1	3	localIOException2	IOException
    //   195	1	3	localObject4	Object
    //   83	16	4	localo	o
    // Exception table:
    //   from	to	target	type
    //   32	58	133	java/io/IOException
    //   32	58	171	finally
    //   64	73	186	finally
    //   75	85	186	finally
    //   87	95	186	finally
    //   97	107	186	finally
    //   138	156	186	finally
    //   64	73	190	java/io/IOException
    //   75	85	190	java/io/IOException
    //   87	95	190	java/io/IOException
    //   97	107	190	java/io/IOException
  }
  
  public final int a(f paramf)
  {
    GMTrace.i(1549677887488L, 11546);
    if (paramf != null) {
      this.fTZ = paramf;
    }
    GMTrace.o(1549677887488L, 11546);
    return 0;
  }
  
  public final boolean a(int paramInt, aac paramaac)
  {
    GMTrace.i(1549946322944L, 11548);
    if (paramaac == null)
    {
      GMTrace.o(1549946322944L, 11548);
      return false;
    }
    try
    {
      this.fTZ.delete("GetEmotionListCache", "reqType=?", new String[] { String.valueOf(paramInt) });
      paramaac = new o(String.valueOf(paramInt), paramaac.toByteArray());
      w.d("MicroMsg.emoji.Storage", "insert cache: %d", new Object[] { Integer.valueOf(paramInt) });
      boolean bool = b(paramaac);
      GMTrace.o(1549946322944L, 11548);
      return bool;
    }
    catch (Exception paramaac)
    {
      w.e("MicroMsg.emoji.Storage", "exception:%s", new Object[] { bg.f(paramaac) });
      GMTrace.o(1549946322944L, 11548);
    }
    return false;
  }
  
  public final boolean a(String paramString, acl paramacl)
  {
    GMTrace.i(1550214758400L, 11550);
    if (paramacl == null)
    {
      GMTrace.o(1550214758400L, 11550);
      return false;
    }
    try
    {
      UR(paramString);
      boolean bool = b(new o(paramString, paramacl.toByteArray()));
      GMTrace.o(1550214758400L, 11550);
      return bool;
    }
    catch (Exception paramString)
    {
      w.e("MicroMsg.emoji.Storage", "exception:%s", new Object[] { bg.f(paramString) });
      GMTrace.o(1550214758400L, 11550);
    }
    return false;
  }
  
  public final boolean a(String paramString, zu paramzu)
  {
    GMTrace.i(18616535744512L, 138704);
    if (paramzu == null)
    {
      GMTrace.o(18616535744512L, 138704);
      return false;
    }
    try
    {
      UR(paramString);
      boolean bool = b(new o(paramString, paramzu.toByteArray()));
      GMTrace.o(18616535744512L, 138704);
      return bool;
    }
    catch (Exception paramString)
    {
      w.e("MicroMsg.emoji.Storage", "exception:%s", new Object[] { bg.f(paramString) });
      GMTrace.o(18616535744512L, 138704);
    }
    return false;
  }
  
  /* Error */
  public final bef aqE()
  {
    // Byte code:
    //   0: ldc2_w 199
    //   3: sipush 11552
    //   6: invokestatic 21	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: aload_0
    //   10: getfield 55	com/tencent/mm/storage/emotion/p:fTZ	Lcom/tencent/mm/sdk/e/e;
    //   13: ldc 31
    //   15: aconst_null
    //   16: ldc 61
    //   18: iconst_1
    //   19: anewarray 23	java/lang/String
    //   22: dup
    //   23: iconst_0
    //   24: ldc -54
    //   26: aastore
    //   27: aconst_null
    //   28: aconst_null
    //   29: aconst_null
    //   30: invokeinterface 160 8 0
    //   35: astore_1
    //   36: aload_1
    //   37: ifnull +141 -> 178
    //   40: aload_1
    //   41: astore_2
    //   42: aload_1
    //   43: invokeinterface 86 1 0
    //   48: ifeq +130 -> 178
    //   51: aload_1
    //   52: astore_2
    //   53: new 25	com/tencent/mm/storage/emotion/o
    //   56: dup
    //   57: aload_1
    //   58: invokespecial 89	com/tencent/mm/storage/emotion/o:<init>	(Landroid/database/Cursor;)V
    //   61: astore 4
    //   63: aload_1
    //   64: astore_2
    //   65: new 204	com/tencent/mm/protocal/c/bef
    //   68: dup
    //   69: invokespecial 205	com/tencent/mm/protocal/c/bef:<init>	()V
    //   72: astore_3
    //   73: aload_1
    //   74: astore_2
    //   75: aload_3
    //   76: aload 4
    //   78: getfield 97	com/tencent/mm/storage/emotion/o:field_cache	[B
    //   81: invokevirtual 206	com/tencent/mm/protocal/c/bef:aD	([B)Lcom/tencent/mm/bm/a;
    //   84: pop
    //   85: aload_3
    //   86: astore_2
    //   87: aload_2
    //   88: astore_3
    //   89: aload_1
    //   90: ifnull +11 -> 101
    //   93: aload_1
    //   94: invokeinterface 121 1 0
    //   99: aload_2
    //   100: astore_3
    //   101: ldc2_w 199
    //   104: sipush 11552
    //   107: invokestatic 40	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   110: aload_3
    //   111: areturn
    //   112: astore_3
    //   113: aconst_null
    //   114: astore_1
    //   115: aload_1
    //   116: astore_2
    //   117: ldc 103
    //   119: ldc 123
    //   121: iconst_1
    //   122: anewarray 107	java/lang/Object
    //   125: dup
    //   126: iconst_0
    //   127: aload_3
    //   128: invokestatic 129	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   131: aastore
    //   132: invokestatic 132	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   135: aload_1
    //   136: ifnull +37 -> 173
    //   139: aload_1
    //   140: invokeinterface 121 1 0
    //   145: aconst_null
    //   146: astore_3
    //   147: goto -46 -> 101
    //   150: astore_1
    //   151: aconst_null
    //   152: astore_2
    //   153: aload_2
    //   154: ifnull +9 -> 163
    //   157: aload_2
    //   158: invokeinterface 121 1 0
    //   163: aload_1
    //   164: athrow
    //   165: astore_1
    //   166: goto -13 -> 153
    //   169: astore_3
    //   170: goto -55 -> 115
    //   173: aconst_null
    //   174: astore_3
    //   175: goto -74 -> 101
    //   178: aconst_null
    //   179: astore_2
    //   180: goto -93 -> 87
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	183	0	this	p
    //   35	105	1	localCursor	Cursor
    //   150	14	1	localObject1	Object
    //   165	1	1	localObject2	Object
    //   41	139	2	localObject3	Object
    //   72	39	3	localObject4	Object
    //   112	16	3	localException1	Exception
    //   146	1	3	localObject5	Object
    //   169	1	3	localException2	Exception
    //   174	1	3	localObject6	Object
    //   61	16	4	localo	o
    // Exception table:
    //   from	to	target	type
    //   9	36	112	java/lang/Exception
    //   9	36	150	finally
    //   42	51	165	finally
    //   53	63	165	finally
    //   65	73	165	finally
    //   75	85	165	finally
    //   117	135	165	finally
    //   42	51	169	java/lang/Exception
    //   53	63	169	java/lang/Exception
    //   65	73	169	java/lang/Exception
    //   75	85	169	java/lang/Exception
  }
  
  public final boolean b(bef parambef)
  {
    GMTrace.i(1550617411584L, 11553);
    if (parambef == null)
    {
      GMTrace.o(1550617411584L, 11553);
      return false;
    }
    try
    {
      UR("Smiley_panel_req_type");
      boolean bool = b(new o("Smiley_panel_req_type", parambef.toByteArray()));
      GMTrace.o(1550617411584L, 11553);
      return bool;
    }
    catch (Exception parambef)
    {
      w.e("MicroMsg.emoji.Storage", "exception:%s", new Object[] { bg.f(parambef) });
      GMTrace.o(1550617411584L, 11553);
    }
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\storage\emotion\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */