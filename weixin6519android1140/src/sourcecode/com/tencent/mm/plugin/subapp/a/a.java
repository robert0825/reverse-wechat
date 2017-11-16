package com.tencent.mm.plugin.subapp.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.aet;
import com.tencent.mm.protocal.c.aeu;
import com.tencent.mm.protocal.c.azp;
import com.tencent.mm.protocal.c.bmy;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.y.ak.a;
import com.tencent.mm.y.ak.c;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import java.util.LinkedList;

public final class a
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  public final com.tencent.mm.ad.b fUa;
  private com.tencent.mm.ad.e fUd;
  private aj gsj;
  public int qrX;
  
  public a()
  {
    GMTrace.i(5759819579392L, 42914);
    this.qrX = 0;
    this.gsj = new aj(new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(5760624885760L, 42920);
        if (a.this.qrX < 0)
        {
          GMTrace.o(5760624885760L, 42920);
          return false;
        }
        aeu localaeu = (aeu)a.this.fUa.gtD.gtK;
        try
        {
          Object localObject1 = (bmy)localaeu.uuI.get(a.this.qrX);
          if ((localObject1 != null) && (((bmy)localObject1).uXc != null) && (((bmy)localObject1).uXb != null))
          {
            w.d("MicroMsg.NetSceneGetVUserInfo", "onGYNetEnd ver:" + localaeu.jia + " idx:" + a.this.qrX + " id:" + Integer.toHexString(((bmy)localObject1).etB) + " size:" + ((bmy)localObject1).uXb.uNN + " hdsize:" + ((bmy)localObject1).uXc.uNN);
            a.a(((bmy)localObject1).etB, true, ((bmy)localObject1).uXc.uNP.toByteArray());
            a.a(((bmy)localObject1).etB, false, ((bmy)localObject1).uXb.uNP.toByteArray());
          }
          localObject1 = a.this;
          ((a)localObject1).qrX -= 1;
          GMTrace.o(5760624885760L, 42920);
          return true;
        }
        catch (Exception localException)
        {
          for (;;)
          {
            w.e("MicroMsg.NetSceneGetVUserInfo", "get item :" + a.this.qrX + " not Found");
            Object localObject2 = null;
          }
        }
      }
    }, true);
    at.AR();
    int j = bg.e((Integer)c.xh().get(66052, null));
    if (ak.a.gmZ.ft(j))
    {
      at.AR();
      i = bg.e((Integer)c.xh().get(66053, null));
    }
    Object localObject = new StringBuilder("init: allfileid:").append(Integer.toBinaryString(j)).append(" inver:");
    at.AR();
    w.d("MicroMsg.NetSceneGetVUserInfo", bg.e((Integer)c.xh().get(66053, null)) + " reqver:" + i);
    localObject = new b.a();
    ((b.a)localObject).gtF = new aet();
    ((b.a)localObject).gtG = new aeu();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/getvuserinfo";
    ((b.a)localObject).gtE = 167;
    ((b.a)localObject).gtH = 60;
    ((b.a)localObject).gtI = 1000000060;
    this.fUa = ((b.a)localObject).DA();
    ((aet)this.fUa.gtC.gtK).jia = i;
    GMTrace.o(5759819579392L, 42914);
  }
  
  /* Error */
  public static boolean a(int paramInt, boolean paramBoolean, byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: ldc2_w 176
    //   3: ldc -78
    //   5: invokestatic 29	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   8: new 180	java/io/FileOutputStream
    //   11: dup
    //   12: getstatic 74	com/tencent/mm/y/ak$a:gmZ	Lcom/tencent/mm/y/ak$c;
    //   15: iload_0
    //   16: iload_1
    //   17: invokeinterface 184 3 0
    //   22: invokespecial 185	java/io/FileOutputStream:<init>	(Ljava/lang/String;)V
    //   25: astore 4
    //   27: aload 4
    //   29: astore_3
    //   30: aload 4
    //   32: aload_2
    //   33: invokevirtual 189	java/io/FileOutputStream:write	([B)V
    //   36: aload 4
    //   38: astore_3
    //   39: aload 4
    //   41: invokevirtual 192	java/io/FileOutputStream:close	()V
    //   44: aload 4
    //   46: invokevirtual 192	java/io/FileOutputStream:close	()V
    //   49: ldc2_w 176
    //   52: ldc -78
    //   54: invokestatic 170	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   57: iconst_1
    //   58: ireturn
    //   59: astore 5
    //   61: aconst_null
    //   62: astore_2
    //   63: aload_2
    //   64: astore_3
    //   65: ldc 100
    //   67: aload 5
    //   69: ldc -62
    //   71: iconst_0
    //   72: anewarray 196	java/lang/Object
    //   75: invokestatic 200	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   78: aload_2
    //   79: ifnull +7 -> 86
    //   82: aload_2
    //   83: invokevirtual 192	java/io/FileOutputStream:close	()V
    //   86: ldc2_w 176
    //   89: ldc -78
    //   91: invokestatic 170	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   94: iconst_0
    //   95: ireturn
    //   96: astore_2
    //   97: aconst_null
    //   98: astore_3
    //   99: aload_3
    //   100: ifnull +7 -> 107
    //   103: aload_3
    //   104: invokevirtual 192	java/io/FileOutputStream:close	()V
    //   107: aload_2
    //   108: athrow
    //   109: astore_2
    //   110: goto -61 -> 49
    //   113: astore_2
    //   114: goto -28 -> 86
    //   117: astore_3
    //   118: goto -11 -> 107
    //   121: astore_2
    //   122: goto -23 -> 99
    //   125: astore 5
    //   127: aload 4
    //   129: astore_2
    //   130: goto -67 -> 63
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	133	0	paramInt	int
    //   0	133	1	paramBoolean	boolean
    //   0	133	2	paramArrayOfByte	byte[]
    //   29	75	3	localObject	Object
    //   117	1	3	localException1	Exception
    //   25	103	4	localFileOutputStream	java.io.FileOutputStream
    //   59	9	5	localException2	Exception
    //   125	1	5	localException3	Exception
    // Exception table:
    //   from	to	target	type
    //   8	27	59	java/lang/Exception
    //   8	27	96	finally
    //   44	49	109	java/lang/Exception
    //   82	86	113	java/lang/Exception
    //   103	107	117	java/lang/Exception
    //   30	36	121	finally
    //   39	44	121	finally
    //   65	78	121	finally
    //   30	36	125	java/lang/Exception
    //   39	44	125	java/lang/Exception
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(5759953797120L, 42915);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(5759953797120L, 42915);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(5760222232576L, 42917);
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      w.e("MicroMsg.NetSceneGetVUserInfo", "errType:" + paramInt2 + " errCode:" + paramInt3);
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(5760222232576L, 42917);
      return;
    }
    paramq = (aeu)((com.tencent.mm.ad.b)paramq).gtD.gtK;
    paramArrayOfByte = new StringBuilder("onGYNetEnd new version:").append(paramq.jia).append(" old version:");
    at.AR();
    w.d("MicroMsg.NetSceneGetVUserInfo", bg.e((Integer)c.xh().get(66053, null)) + " Count:" + paramq.uuI.size());
    at.AR();
    c.xh().set(66053, Integer.valueOf(paramq.jia));
    if (paramq.uuI.size() <= 0)
    {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(5760222232576L, 42917);
      return;
    }
    int i = 0;
    paramInt1 = 0;
    while (paramInt1 < paramq.uuI.size())
    {
      i |= ((bmy)paramq.uuI.get(paramInt1)).etB;
      paramInt1 += 1;
    }
    at.AR();
    c.xh().set(66052, Integer.valueOf(i));
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    this.qrX = (paramq.uuI.size() - 1);
    this.gsj.z(50L, 50L);
    GMTrace.o(5760222232576L, 42917);
  }
  
  public final int getType()
  {
    GMTrace.i(5760088014848L, 42916);
    GMTrace.o(5760088014848L, 42916);
    return 167;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\subapp\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */