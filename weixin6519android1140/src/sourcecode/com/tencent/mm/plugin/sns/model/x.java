package com.tencent.mm.plugin.sns.model;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.g.a.qa;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.storage.l;
import com.tencent.mm.plugin.sns.storage.m;
import com.tencent.mm.protocal.c.anu;
import com.tencent.mm.protocal.c.azp;
import com.tencent.mm.protocal.c.bem;
import com.tencent.mm.protocal.c.bfh;
import com.tencent.mm.protocal.c.bfy;
import com.tencent.mm.protocal.c.bgi;
import com.tencent.mm.protocal.c.bgj;
import com.tencent.mm.protocal.c.biz;
import com.tencent.mm.protocal.c.ca;
import com.tencent.mm.protocal.c.oa;
import com.tencent.mm.protocal.k.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

public final class x
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k, d
{
  private static Vector<String> pse;
  public int Ob;
  final int eDi;
  private com.tencent.mm.ad.b fUa;
  public com.tencent.mm.ad.e fUd;
  private boolean gSY;
  private long psC;
  private String psD;
  private long psU;
  private boolean psV;
  private boolean psW;
  public boolean psb;
  private long psc;
  long psd;
  public int psf;
  public int psg;
  
  static
  {
    GMTrace.i(8103529545728L, 60376);
    pse = new Vector();
    GMTrace.o(8103529545728L, 60376);
  }
  
  public x(long paramLong)
  {
    GMTrace.i(8101516279808L, 60361);
    this.gSY = false;
    this.psU = 0L;
    this.psc = 0L;
    this.psd = 0L;
    this.psC = 0L;
    this.psD = "";
    this.psV = false;
    this.psW = false;
    this.psf = 0;
    this.psg = 0;
    this.Ob = 0;
    long l2 = System.currentTimeMillis();
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new bgi();
    ((b.a)localObject).gtG = new bgj();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/mmsnstimeline";
    ((b.a)localObject).gtE = 211;
    ((b.a)localObject).gtH = 98;
    ((b.a)localObject).gtI = 1000000098;
    this.fUa = ((b.a)localObject).DA();
    int i;
    if (am.isWifi(ab.getContext())) {
      i = 1;
    }
    for (;;)
    {
      this.psc = paramLong;
      boolean bool;
      label169:
      bgi localbgi;
      int j;
      long l1;
      label230:
      int k;
      com.tencent.mm.plugin.sns.storage.k localk;
      if (paramLong == 0L)
      {
        bool = true;
        this.psb = bool;
        this.eDi = 2;
        localbgi = (bgi)this.fUa.gtC.gtK;
        localbgi.uRZ = i;
        localbgi.uQA = paramLong;
        j = ae.biT().bjC();
        localObject = ae.bjd();
        if (!this.psb) {
          break label595;
        }
        l1 = 0L;
        this.psd = ((com.tencent.mm.plugin.sns.storage.n)localObject).e(l1, j, true);
        localbgi.uRW = this.psd;
        k = c.a(this.psd, paramLong, "@__weixintimtline");
        localbgi.uRX = k;
        if (this.psb)
        {
          this.psC = ae.bjd().e(0L, 1, true);
          w.i("MicroMsg.NetSceneSnsTimeLine", "newerid " + this.psC);
          localbgi.uRY = this.psC;
          localk = ae.bjh().Iw("@__weixintimtline");
          if (localk != null) {
            break label601;
          }
          localObject = "";
          label344:
          this.psD = ((String)localObject);
          if (this.psD == null) {
            this.psD = "";
          }
          localbgi.uQz = this.psD;
          if ((localk != null) && (localk.field_adsession != null)) {
            break label611;
          }
        }
      }
      for (localbgi.uQg = new azp().be(new byte[0]);; localbgi.uQg = new azp().be(localk.field_adsession))
      {
        this.psU = paramLong;
        w.i("MicroMsg.NetSceneSnsTimeLine", " This req nextCount: " + j + " max:" + paramLong + " min:" + this.psd + " ReqTime:" + localbgi.uRX + " nettype: " + i);
        w.d("MicroMsg.NetSceneSnsTimeLine", "maxId: %s minId: %s lastReqTime: %s", new Object[] { i.dt(paramLong), i.dt(this.psd), Integer.valueOf(k) });
        w.d("MicroMsg.NetSceneSnsTimeLine", "NetSceneSnsTimeLine %s", new Object[] { Long.valueOf(System.currentTimeMillis() - l2) });
        GMTrace.o(8101516279808L, 60361);
        return;
        if (am.is3G(ab.getContext()))
        {
          i = 3;
          break;
        }
        if (am.is4G(ab.getContext()))
        {
          i = 4;
          break;
        }
        if (!am.is2G(ab.getContext())) {
          break label654;
        }
        i = 2;
        break;
        bool = false;
        break label169;
        label595:
        l1 = paramLong;
        break label230;
        label601:
        localObject = localk.field_md5;
        break label344;
        label611:
        w.d("MicroMsg.NetSceneSnsTimeLine", "request adsession %s", new Object[] { localk.field_adsession });
      }
      label654:
      i = 0;
    }
  }
  
  /* Error */
  public static boolean Hl(String paramString)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: ldc2_w 310
    //   6: ldc_w 312
    //   9: invokestatic 43	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   12: getstatic 50	com/tencent/mm/plugin/sns/model/x:pse	Ljava/util/Vector;
    //   15: aload_0
    //   16: invokevirtual 316	java/util/Vector:contains	(Ljava/lang/Object;)Z
    //   19: ifeq +19 -> 38
    //   22: iconst_0
    //   23: istore_1
    //   24: ldc2_w 310
    //   27: ldc_w 312
    //   30: invokestatic 53	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   33: ldc 2
    //   35: monitorexit
    //   36: iload_1
    //   37: ireturn
    //   38: getstatic 50	com/tencent/mm/plugin/sns/model/x:pse	Ljava/util/Vector;
    //   41: aload_0
    //   42: invokevirtual 319	java/util/Vector:add	(Ljava/lang/Object;)Z
    //   45: pop
    //   46: iconst_1
    //   47: istore_1
    //   48: ldc2_w 310
    //   51: ldc_w 312
    //   54: invokestatic 53	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   57: goto -24 -> 33
    //   60: astore_0
    //   61: ldc 2
    //   63: monitorexit
    //   64: aload_0
    //   65: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	66	0	paramString	String
    //   23	25	1	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   3	22	60	finally
    //   24	33	60	finally
    //   38	46	60	finally
    //   48	57	60	finally
  }
  
  public static boolean Hm(String paramString)
  {
    try
    {
      GMTrace.i(8101382062080L, 60360);
      pse.remove(paramString);
      GMTrace.o(8101382062080L, 60360);
      return true;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
  
  private void a(bgj parambgj, String paramString)
  {
    GMTrace.i(8101784715264L, 60363);
    ai.a("@__weixintimtline", this.eDi, parambgj.tTQ, paramString);
    this.psd = ((bfh)parambgj.tTQ.getLast()).tXT;
    if (this.psc == 0L) {
      this.psc = ((bfh)parambgj.tTQ.getFirst()).tXT;
    }
    for (;;)
    {
      c.c("@__weixintimtline", this.psc, this.psd, parambgj.uSa);
      try
      {
        parambgj = parambgj.tTQ.iterator();
        for (;;)
        {
          if (parambgj.hasNext())
          {
            paramString = (bfh)parambgj.next();
            if (paramString.uQX == 0)
            {
              Object localObject = ae.bjd().dU(paramString.tXT);
              if ((localObject != null) && (((m)localObject).blD() != null))
              {
                int i = ((m)localObject).field_type;
                if (i == 15)
                {
                  try
                  {
                    localObject = ((anu)((m)localObject).blD().uUc.ueW.get(0)).lPM;
                    g.ork.i(14388, new Object[] { Long.valueOf(paramString.tXT), Integer.valueOf(4), localObject, Integer.valueOf(0) });
                  }
                  catch (Exception paramString) {}
                  continue;
                  this.psc = c.dx(this.psc);
                  break;
                }
              }
            }
          }
        }
        GMTrace.o(8101784715264L, 60363);
        return;
      }
      catch (Exception parambgj)
      {
        GMTrace.o(8101784715264L, 60363);
      }
    }
  }
  
  private static boolean b(ca paramca)
  {
    GMTrace.i(8102053150720L, 60365);
    if (!am.isWifi(ab.getContext()))
    {
      GMTrace.o(8102053150720L, 60365);
      return false;
    }
    try
    {
      com.tencent.mm.modelsns.e.lz(com.tencent.mm.platformtools.n.b(paramca.tQn.uQe.uQM));
      ae.biY();
      b.bih();
      GMTrace.o(8102053150720L, 60365);
      return true;
    }
    catch (Exception paramca)
    {
      GMTrace.o(8102053150720L, 60365);
    }
    return false;
  }
  
  private void biz()
  {
    GMTrace.i(8101650497536L, 60362);
    Object localObject = ae.bjd();
    String str = com.tencent.mm.plugin.sns.storage.n.uZ(3);
    localObject = ((com.tencent.mm.plugin.sns.storage.n)localObject).fTZ.a(str, null, 2);
    int i = 0;
    while (((Cursor)localObject).moveToNext()) {
      i += 1;
    }
    ((Cursor)localObject).close();
    if ((i < 3) && (i > 0))
    {
      this.psW = true;
      GMTrace.o(8101650497536L, 60362);
      return;
    }
    if (i == 0) {
      this.psV = true;
    }
    GMTrace.o(8101650497536L, 60362);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(8102321586176L, 60367);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(8102321586176L, 60367);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(8101918932992L, 60364);
    w.i("MicroMsg.NetSceneSnsTimeLine", "netId : " + paramInt1 + " errType :" + paramInt2 + " errCode: " + paramInt3 + " errMsg :" + paramString);
    paramArrayOfByte = (bgj)((com.tencent.mm.ad.b)paramq).gtD.gtK;
    if ((paramq.AZ().tKs != 207) && (paramq.AZ().tKs != 0))
    {
      Hm("@__weixintimtline");
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(8101918932992L, 60364);
      return;
    }
    if (paramArrayOfByte.uQF != null)
    {
      w.d("MicroMsg.NetSceneSnsTimeLine", "serverConfig  " + paramArrayOfByte.uQF.uRS + " " + paramArrayOfByte.uQF.uRR);
      paramInt1 = paramArrayOfByte.uQF.uRS;
      com.tencent.mm.plugin.sns.c.a.poV = paramInt1;
      if (paramInt1 <= 0) {
        com.tencent.mm.plugin.sns.c.a.poV = Integer.MAX_VALUE;
      }
      com.tencent.mm.storage.v.vpA = paramArrayOfByte.uQF.uRR;
    }
    this.psf = paramArrayOfByte.uQD;
    this.psg = paramArrayOfByte.uQE;
    w.i("MicroMsg.NetSceneSnsTimeLine", "for same md5 count: " + paramArrayOfByte.uQD + " , objCount:  " + paramArrayOfByte.uEP + " cflag : " + paramArrayOfByte.uQE);
    this.Ob = paramArrayOfByte.uEP;
    String str1 = i.du(this.psc);
    if (!paramArrayOfByte.tTQ.isEmpty())
    {
      w.i("MicroMsg.NetSceneSnsTimeLine", "respone size " + paramArrayOfByte.tTQ.size() + " Max " + ((bfh)paramArrayOfByte.tTQ.getFirst()).tXT + " " + i.dt(((bfh)paramArrayOfByte.tTQ.getFirst()).tXT) + "  respone min  " + ((bfh)paramArrayOfByte.tTQ.getLast()).tXT + " " + i.dt(((bfh)paramArrayOfByte.tTQ.getLast()).tXT));
      if (this.psb) {
        break label573;
      }
      w.d("MicroMsg.NetSceneSnsTimeLine", "np resp list size " + paramArrayOfByte.tTQ.size());
      if (!paramArrayOfByte.tTQ.isEmpty()) {
        break label562;
      }
      ae.bjd().Ix(str1);
      this.psV = true;
      this.psd = this.psc;
    }
    for (;;)
    {
      Hm("@__weixintimtline");
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(8101918932992L, 60364);
      return;
      w.i("MicroMsg.NetSceneSnsTimeLine", " respone is Empty");
      break;
      label562:
      a(paramArrayOfByte, str1);
    }
    label573:
    this.Ob = paramArrayOfByte.uEP;
    if (this.psD.equals(paramArrayOfByte.uQz))
    {
      paramq = ae.bjd();
      if (this.psb) {}
      for (long l = 0L;; l = this.psU)
      {
        this.psd = paramq.e(l, this.psf, true);
        w.i("MicroMsg.NetSceneSnsTimeLine", "md5 is no change!! the new minid %s", new Object[] { Long.valueOf(this.psd) });
        biz();
        Hm("@__weixintimtline");
        this.fUd.a(paramInt2, paramInt3, paramString, this);
        GMTrace.o(8101918932992L, 60364);
        return;
      }
    }
    w.d("MicroMsg.NetSceneSnsTimeLine", "fp resp list size " + paramArrayOfByte.tTQ.size() + " adsize : " + paramArrayOfByte.uSb);
    ae.bjh().e("@__weixintimtline", paramArrayOfByte.uQz, com.tencent.mm.platformtools.n.a(paramArrayOfByte.uQg));
    paramInt1 = 0;
    Object localObject1;
    Object localObject3;
    for (;;)
    {
      if (paramInt1 < paramArrayOfByte.uSc.size())
      {
        localObject1 = (ca)paramArrayOfByte.uSc.get(paramInt1);
        String str2;
        if (this.gSY) {
          str2 = ae.zo() + "ad.proto";
        }
        try
        {
          localObject3 = ((ca)localObject1).toByteArray();
          com.tencent.mm.a.e.b(str2, (byte[])localObject3, localObject3.length);
          str2 = com.tencent.mm.platformtools.n.a(((ca)localObject1).tQo);
          localObject3 = com.tencent.mm.platformtools.n.a(((ca)localObject1).tQn.uQf);
          localObject1 = com.tencent.mm.platformtools.n.b(((ca)localObject1).tQn.uQe.uQM);
          w.i("MicroMsg.NetSceneSnsTimeLine", "skXml " + str2);
          w.i("MicroMsg.NetSceneSnsTimeLine", "adXml " + (String)localObject3);
          w.i("MicroMsg.NetSceneSnsTimeLine", "snsXml " + (String)localObject1 + "\r\n");
          paramInt1 += 1;
        }
        catch (Exception localException2)
        {
          for (;;)
          {
            w.e("MicroMsg.NetSceneSnsTimeLine", "save error " + localException2.getMessage());
          }
        }
      }
    }
    if ((this.gSY) && (paramArrayOfByte.uSc.size() == 0)) {}
    try
    {
      localObject1 = com.tencent.mm.a.e.d(ae.zo() + "ad.proto", 0, -1);
      localObject2 = new ca();
      ((ca)localObject2).aD((byte[])localObject1);
      paramArrayOfByte.uSc.add(localObject2);
      paramArrayOfByte.uSb = paramArrayOfByte.uSc.size();
      w.d("MicroMsg.NetSceneSnsTimeLine", "read from path " + paramArrayOfByte.uSb);
      if (paramArrayOfByte.uSc.size() > 0)
      {
        localObject1 = (ca)paramArrayOfByte.uSc.get(0);
        localObject2 = com.tencent.mm.platformtools.n.a(((ca)localObject1).tQo);
        localObject3 = com.tencent.mm.platformtools.n.a(((ca)localObject1).tQn.uQf);
        String str3 = com.tencent.mm.platformtools.n.b(((ca)localObject1).tQn.uQe.uQM);
        w.i("MicroMsg.NetSceneSnsTimeLine", "skXml " + (String)localObject2);
        w.i("MicroMsg.NetSceneSnsTimeLine", "adXml " + (String)localObject3);
        w.i("MicroMsg.NetSceneSnsTimeLine", "snsXml " + str3 + "\r\n");
        b((ca)localObject1);
      }
      a.e(paramArrayOfByte.uSc, paramArrayOfByte.tTQ);
      a.ah(paramArrayOfByte.uSc);
      if (paramArrayOfByte.uSb == 0)
      {
        w.i("MicroMsg.NetSceneSnsTimeLine", "recv %d recommend", new Object[] { Integer.valueOf(paramArrayOfByte.uSd) });
        a.d(paramArrayOfByte.uSe, paramArrayOfByte.tTQ);
        a.ag(paramArrayOfByte.uSe);
      }
      localObject1 = new LinkedList();
      localObject2 = paramArrayOfByte.tTQ.iterator();
      while (((Iterator)localObject2).hasNext()) {
        ((LinkedList)localObject1).add(Long.valueOf(((bfh)((Iterator)localObject2).next()).tXT));
      }
    }
    catch (Exception localException1)
    {
      for (;;)
      {
        w.e("MicroMsg.NetSceneSnsTimeLine", "read error " + localException1.getMessage());
      }
      Object localObject2 = new qa();
      ((qa)localObject2).eUI.eUJ = localException1;
      com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject2);
      if (paramq.AZ().tKs == 207)
      {
        if (paramArrayOfByte.tTQ.isEmpty())
        {
          ae.bjd().bmp();
          this.psd = this.psc;
        }
        for (;;)
        {
          this.psV = true;
          Hm("@__weixintimtline");
          this.fUd.a(paramInt2, paramInt3, paramString, this);
          GMTrace.o(8101918932992L, 60364);
          return;
          ae.bjd().Iy(i.du(((bfh)paramArrayOfByte.tTQ.getFirst()).tXT));
          ae.bjd().Ix(i.du(((bfh)paramArrayOfByte.tTQ.getLast()).tXT));
          a(paramArrayOfByte, str1);
          a.ai(paramArrayOfByte.tTQ);
        }
      }
      if (!paramArrayOfByte.tTQ.isEmpty()) {
        break label1633;
      }
    }
    ae.bjd().bmp();
    this.psd = this.psc;
    this.psV = true;
    for (;;)
    {
      Hm("@__weixintimtline");
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(8101918932992L, 60364);
      return;
      label1633:
      a(paramArrayOfByte, str1);
      a.ai(paramArrayOfByte.tTQ);
    }
  }
  
  public final boolean bik()
  {
    GMTrace.i(8102590021632L, 60369);
    boolean bool = this.psb;
    GMTrace.o(8102590021632L, 60369);
    return bool;
  }
  
  public final boolean bil()
  {
    GMTrace.i(8102724239360L, 60370);
    boolean bool = this.psV;
    GMTrace.o(8102724239360L, 60370);
    return bool;
  }
  
  public final boolean bim()
  {
    GMTrace.i(8102858457088L, 60371);
    boolean bool = this.psW;
    GMTrace.o(8102858457088L, 60371);
    return bool;
  }
  
  public final boolean bin()
  {
    GMTrace.i(8102992674816L, 60372);
    GMTrace.o(8102992674816L, 60372);
    return false;
  }
  
  public final long bio()
  {
    GMTrace.i(8103126892544L, 60373);
    long l = this.psd;
    GMTrace.o(8103126892544L, 60373);
    return l;
  }
  
  public final boolean bip()
  {
    GMTrace.i(8103261110272L, 60374);
    GMTrace.o(8103261110272L, 60374);
    return false;
  }
  
  public final long biq()
  {
    GMTrace.i(8103395328000L, 60375);
    GMTrace.o(8103395328000L, 60375);
    return 0L;
  }
  
  public final int getType()
  {
    GMTrace.i(8102187368448L, 60366);
    GMTrace.o(8102187368448L, 60366);
    return 211;
  }
  
  public final String getUserName()
  {
    GMTrace.i(8102455803904L, 60368);
    GMTrace.o(8102455803904L, 60368);
    return "@__weixintimtline";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\model\x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */