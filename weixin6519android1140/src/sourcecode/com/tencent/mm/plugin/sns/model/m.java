package com.tencent.mm.plugin.sns.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.protocal.c.azp;
import com.tencent.mm.protocal.c.beu;
import com.tencent.mm.protocal.c.bev;
import com.tencent.mm.protocal.c.bfh;
import com.tencent.mm.protocal.c.biz;
import com.tencent.mm.protocal.c.oa;
import com.tencent.mm.protocal.k.e;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

public final class m
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private static Vector<String> pse;
  private String desc;
  final int eDi;
  private com.tencent.mm.ad.b fUa;
  public com.tencent.mm.ad.e fUd;
  private boolean jAg;
  private ArrayList<com.tencent.mm.plugin.sns.storage.m> jBb;
  private boolean psb;
  private long psc;
  private long psd;
  public int psf;
  public int psg;
  
  static
  {
    GMTrace.i(8152519016448L, 60741);
    pse = new Vector();
    GMTrace.o(8152519016448L, 60741);
  }
  
  public m(String paramString)
  {
    GMTrace.i(8151847927808L, 60736);
    this.psc = 0L;
    this.psd = 0L;
    this.jAg = false;
    this.jBb = new ArrayList();
    this.psf = 0;
    this.psg = 0;
    this.desc = "";
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new beu();
    ((b.a)localObject).gtG = new bev();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/mmsnsclassifytimeline";
    ((b.a)localObject).gtE = 601;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    this.psc = 0L;
    if (0L == 0L) {}
    for (boolean bool = true;; bool = false)
    {
      this.psb = bool;
      this.eDi = 2;
      localObject = (beu)this.fUa.gtC.gtK;
      ((beu)localObject).uQz = "";
      ((beu)localObject).uQA = 0L;
      ((beu)localObject).uQB = paramString;
      ((beu)localObject).uQC = 1;
      w.d("MicroMsg.NetSceneSnsClassifyTimeLine", "maxid %s classifyid %s classifyType %d", new Object[] { i.dt(0L), paramString, Integer.valueOf(0) });
      GMTrace.o(8151847927808L, 60736);
      return;
    }
  }
  
  /* Error */
  public static boolean Hl(String paramString)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: ldc2_w 164
    //   6: ldc -90
    //   8: invokestatic 39	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   11: getstatic 46	com/tencent/mm/plugin/sns/model/m:pse	Ljava/util/Vector;
    //   14: aload_0
    //   15: invokevirtual 170	java/util/Vector:contains	(Ljava/lang/Object;)Z
    //   18: ifeq +18 -> 36
    //   21: iconst_0
    //   22: istore_1
    //   23: ldc2_w 164
    //   26: ldc -90
    //   28: invokestatic 49	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   31: ldc 2
    //   33: monitorexit
    //   34: iload_1
    //   35: ireturn
    //   36: getstatic 46	com/tencent/mm/plugin/sns/model/m:pse	Ljava/util/Vector;
    //   39: aload_0
    //   40: invokevirtual 173	java/util/Vector:add	(Ljava/lang/Object;)Z
    //   43: pop
    //   44: iconst_1
    //   45: istore_1
    //   46: ldc2_w 164
    //   49: ldc -90
    //   51: invokestatic 49	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   54: goto -23 -> 31
    //   57: astore_0
    //   58: ldc 2
    //   60: monitorexit
    //   61: aload_0
    //   62: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	63	0	paramString	String
    //   22	24	1	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   3	21	57	finally
    //   23	31	57	finally
    //   36	44	57	finally
    //   46	54	57	finally
  }
  
  public static boolean Hm(String paramString)
  {
    try
    {
      GMTrace.i(8151713710080L, 60735);
      pse.remove(paramString);
      GMTrace.o(8151713710080L, 60735);
      return true;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
  
  private com.tencent.mm.plugin.sns.storage.m b(bfh parambfh)
  {
    GMTrace.i(8151982145536L, 60737);
    com.tencent.mm.plugin.sns.storage.m localm = new com.tencent.mm.plugin.sns.storage.m();
    Object localObject = new String(parambfh.uQM.uNP.toByteArray());
    w.d("MicroMsg.NetSceneSnsClassifyTimeLine", "from server %d ", new Object[] { Long.valueOf(parambfh.tXT) });
    if (!localm.Iq((String)localObject))
    {
      GMTrace.o(8151982145536L, 60737);
      return null;
    }
    parambfh.uQM.be(new byte[0]);
    localm.field_userName = parambfh.tRz;
    localm.gl(parambfh.nFd);
    localm.field_likeFlag = parambfh.uQN;
    localm.dQ(parambfh.tXT);
    localm.dS(parambfh.tXT);
    localm.uV(this.eDi);
    try
    {
      localm.aE(parambfh.toByteArray());
      localObject = localm.blD();
      ((biz)localObject).jhi = parambfh.tRz;
      localm.field_pravited = ((biz)localObject).uCQ;
      w.d("MicroMsg.NetSceneSnsClassifyTimeLine", "ext flag " + parambfh.uEI);
      localm.blV();
      localm.c((biz)localObject);
      localm.field_type = ((biz)localObject).uUc.ueV;
      localm.field_subType = ((biz)localObject).uUc.ueX;
      GMTrace.o(8151982145536L, 60737);
      return localm;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.NetSceneSnsClassifyTimeLine", localException, "", new Object[0]);
      }
    }
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(8152384798720L, 60740);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(8152384798720L, 60740);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(8152116363264L, 60738);
    w.d("MicroMsg.NetSceneSnsClassifyTimeLine", "netId : " + paramInt1 + " errType :" + paramInt2 + " errCode: " + paramInt3 + " errMsg :" + paramString);
    paramArrayOfByte = (bev)((com.tencent.mm.ad.b)paramq).gtD.gtK;
    if ((paramq.AZ().tKs != 207) && (paramq.AZ().tKs != 0) && (paramq.AZ().tKs != 212))
    {
      Hm("@__classify_timeline");
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(8152116363264L, 60738);
      return;
    }
    if (paramq.AZ().tKs == 212) {}
    for (boolean bool = true;; bool = false)
    {
      this.jAg = bool;
      this.psf = paramArrayOfByte.uQD;
      this.desc = paramArrayOfByte.tRP;
      i.du(this.psc);
      w.d("MicroMsg.NetSceneSnsClassifyTimeLine", "resp objCount %d desc %s", new Object[] { Integer.valueOf(paramArrayOfByte.uEP), this.desc });
      paramq = paramArrayOfByte.tTQ.iterator();
      while (paramq.hasNext())
      {
        paramArrayOfByte = b((bfh)paramq.next());
        if (paramArrayOfByte != null) {
          this.jBb.add(paramArrayOfByte);
        }
      }
    }
    Hm("@__classify_timeline");
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(8152116363264L, 60738);
  }
  
  public final int getType()
  {
    GMTrace.i(8152250580992L, 60739);
    GMTrace.o(8152250580992L, 60739);
    return 601;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\model\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */