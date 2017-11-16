package com.tencent.mm.plugin.sns.model;

import android.os.Looper;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.sns.storage.a;
import com.tencent.mm.plugin.sns.storage.a.b.a;
import com.tencent.mm.plugin.sns.storage.j;
import com.tencent.mm.plugin.sns.storage.m;
import com.tencent.mm.protocal.c.azp;
import com.tencent.mm.protocal.c.bei;
import com.tencent.mm.protocal.c.bel;
import com.tencent.mm.protocal.c.bep;
import com.tencent.mm.protocal.c.bew;
import com.tencent.mm.protocal.c.bfg;
import com.tencent.mm.protocal.c.bfh;
import com.tencent.mm.protocal.c.bfk;
import com.tencent.mm.protocal.c.bfl;
import com.tencent.mm.protocal.c.bfm;
import com.tencent.mm.protocal.c.bfn;
import com.tencent.mm.protocal.c.bfo;
import com.tencent.mm.protocal.c.bfu;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import java.util.Iterator;
import java.util.LinkedList;

public final class q
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private com.tencent.mm.ad.b fUa;
  public com.tencent.mm.ad.e fUd;
  private com.tencent.mm.sdk.platformtools.ae handler;
  public int ppo;
  private long psn;
  private bew pso;
  private Object psp;
  private int psq;
  public int type;
  
  public q(long paramLong, int paramInt)
  {
    this(paramLong, paramInt, null, null);
    GMTrace.i(8044876398592L, 59939);
    GMTrace.o(8044876398592L, 59939);
  }
  
  public q(long paramLong, int paramInt1, int paramInt2, String paramString)
  {
    GMTrace.i(8045279051776L, 59942);
    this.type = -1;
    this.psn = 0L;
    this.ppo = -1;
    this.psq = 0;
    this.handler = new com.tencent.mm.sdk.platformtools.ae(Looper.getMainLooper());
    this.pso = null;
    this.type = 9;
    this.psn = paramLong;
    w.i("MicroMsg.NetSceneSnsObjectOp", "snsId : " + paramLong + "  op : " + this.type);
    Object localObject1 = new b.a();
    ((b.a)localObject1).gtF = new bfn();
    ((b.a)localObject1).gtG = new bfo();
    ((b.a)localObject1).uri = "/cgi-bin/micromsg-bin/mmsnsobjectop";
    ((b.a)localObject1).gtE = 218;
    ((b.a)localObject1).gtH = 104;
    ((b.a)localObject1).gtI = 1000000104;
    this.fUa = ((b.a)localObject1).DA();
    localObject1 = (bfn)this.fUa.gtC.gtK;
    Object localObject2 = ae.bjd().dU(paramLong);
    if (localObject2 != null) {
      this.ppo = ((m)localObject2).pMe;
    }
    localObject2 = v(paramLong, this.type);
    bfm localbfm = new bfm();
    localbfm.tOG = paramInt1;
    localbfm.uRj = paramInt2;
    localbfm.uRk = com.tencent.mm.platformtools.n.ni(paramString);
    try
    {
      paramString = localbfm.toByteArray();
      ((bfk)localObject2).uHZ = new azp().be(paramString);
      paramString = new LinkedList();
      paramString.add(localObject2);
      ((bfn)localObject1).uRm = paramString;
      ((bfn)localObject1).uRl = paramString.size();
      GMTrace.o(8045279051776L, 59942);
      return;
    }
    catch (Exception paramString)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.NetSceneSnsObjectOp", paramString, "", new Object[0]);
      }
    }
  }
  
  public q(long paramLong, int paramInt, bew parambew)
  {
    this(paramLong, paramInt, parambew, null);
    GMTrace.i(8045010616320L, 59940);
    GMTrace.o(8045010616320L, 59940);
  }
  
  private q(long paramLong, int paramInt, bew parambew, Object paramObject)
  {
    GMTrace.i(8045144834048L, 59941);
    this.type = -1;
    this.psn = 0L;
    this.ppo = -1;
    this.psq = 0;
    this.handler = new com.tencent.mm.sdk.platformtools.ae(Looper.getMainLooper());
    this.pso = parambew;
    this.type = paramInt;
    this.psn = paramLong;
    this.psp = paramObject;
    w.i("MicroMsg.NetSceneSnsObjectOp", "snsId : " + paramLong + "  op : " + paramInt);
    if (parambew != null) {
      w.i("MicroMsg.NetSceneSnsObjectOp", parambew.uQm + " " + parambew.uQp);
    }
    parambew = new b.a();
    parambew.gtF = new bfn();
    parambew.gtG = new bfo();
    parambew.uri = "/cgi-bin/micromsg-bin/mmsnsobjectop";
    parambew.gtE = 218;
    parambew.gtH = 104;
    parambew.gtI = 1000000104;
    this.fUa = parambew.DA();
    parambew = (bfn)this.fUa.gtC.gtK;
    Object localObject = ae.bjd().dU(paramLong);
    if (localObject != null) {
      this.ppo = ((m)localObject).pMe;
    }
    paramObject = a(paramLong, paramInt, this.pso, paramObject);
    localObject = new LinkedList();
    ((LinkedList)localObject).add(paramObject);
    parambew.uRm = ((LinkedList)localObject);
    parambew.uRl = ((LinkedList)localObject).size();
    GMTrace.o(8045144834048L, 59941);
  }
  
  public q(long paramLong, int paramInt, Object paramObject)
  {
    this(paramLong, paramInt, null, paramObject);
    GMTrace.i(20067697819648L, 149516);
    GMTrace.o(20067697819648L, 149516);
  }
  
  private static bfk a(long paramLong, int paramInt, bew parambew, Object paramObject)
  {
    GMTrace.i(8045413269504L, 59943);
    bfk localbfk = v(paramLong, paramInt);
    Object localObject2 = new StringBuilder("getSnsObjectOp ").append(paramInt).append(" ");
    Object localObject1;
    if (paramObject == null)
    {
      localObject1 = "";
      w.i("MicroMsg.NetSceneSnsObjectOp", (String)localObject1);
      localObject2 = "";
      if ((paramInt != 8) && (paramInt != 10) && (paramInt != 7) && (paramInt != 8) && (paramInt != 6)) {
        break label1061;
      }
      localObject1 = ae.bjg().dN(paramLong);
      if (localObject1 == null) {
        break label1055;
      }
      localObject1 = ((com.tencent.mm.plugin.sns.storage.e)localObject1).blF();
      label116:
      if ((localObject1 == null) || (!((m)localObject1).uX(32))) {
        break label1052;
      }
      localObject2 = ((m)localObject1).blB();
      if (localObject2 != null) {
        break label218;
      }
      localObject2 = "";
      label147:
      w.i("MicroMsg.NetSceneSnsObjectOp", "aduxinfo " + (String)localObject2);
    }
    for (;;)
    {
      if (paramInt == 6)
      {
        if ((parambew == null) || ((parambew.uQm == 0) && (parambew.uQp == 0L)))
        {
          GMTrace.o(8045413269504L, 59943);
          return localbfk;
          localObject1 = paramObject.toString();
          break;
          label218:
          localObject2 = ((a)localObject2).pyc;
          break label147;
        }
        paramObject = new bep();
        ((bep)paramObject).uQi = parambew.uQp;
        ((bep)paramObject).uQa = com.tencent.mm.platformtools.n.ni(bg.aq((String)localObject2, ""));
      }
      for (;;)
      {
        try
        {
          parambew = ((bep)paramObject).toByteArray();
          localbfk.uHZ = new azp().be(parambew);
          GMTrace.o(8045413269504L, 59943);
          return localbfk;
        }
        catch (Exception parambew)
        {
          w.printErrStackTrace("MicroMsg.NetSceneSnsObjectOp", parambew, "", new Object[0]);
          continue;
        }
        if (paramInt != 7) {
          break;
        }
        parambew = new bei();
        parambew.uQa = com.tencent.mm.platformtools.n.ni(bg.aq((String)localObject2, ""));
        try
        {
          parambew = parambew.toByteArray();
          localbfk.uHZ = new azp().be(parambew);
        }
        catch (Exception parambew)
        {
          w.printErrStackTrace("MicroMsg.NetSceneSnsObjectOp", parambew, "", new Object[0]);
        }
      }
      if (paramInt == 8) {
        if ((paramObject != null) && ((paramObject instanceof a.b.a)))
        {
          paramInt = 1;
          label400:
          if (paramInt == 0) {
            break label1046;
          }
          parambew = (a.b.a)paramObject;
          localObject2 = bg.aq((String)localObject2, "");
        }
      }
      label538:
      label647:
      label1046:
      for (parambew = (String)localObject2 + new StringBuilder("&").append(parambew.ppa).append("|").append(parambew.pCF).toString();; parambew = (bew)localObject2)
      {
        localObject2 = new bel();
        ((bel)localObject2).uQa = com.tencent.mm.platformtools.n.ni(bg.aq(parambew, ""));
        if (localObject1 != null)
        {
          ((bel)localObject2).tQP = ((m)localObject1).bml();
          parambew = ((m)localObject1).blE();
          localObject1 = ae.bjd().Ir(parambew);
          if (localObject1 != null)
          {
            parambew = com.tencent.mm.plugin.sns.a.b.f.a(((m)localObject1).blD());
            ((bel)localObject2).uQc = com.tencent.mm.platformtools.n.ni(bg.aq(parambew, ""));
          }
        }
        else
        {
          if ((paramInt == 0) || (((a.b.a)paramObject).pCE != a.b.a.pCA)) {
            break label647;
          }
          ((bel)localObject2).uQd = a.b.a.pCA;
        }
        for (;;)
        {
          try
          {
            parambew = ((bel)localObject2).toByteArray();
            localbfk.uHZ = new azp().be(parambew);
          }
          catch (Exception parambew)
          {
            w.printErrStackTrace("MicroMsg.NetSceneSnsObjectOp", parambew, "", new Object[0]);
          }
          break;
          paramInt = 0;
          break label400;
          w.v("SnsAdExtUtil", "getSnsStatExtBySnsId snsInfo null, snsId %s", new Object[] { parambew });
          parambew = "";
          break label538;
          ae.bjg().delete(paramLong);
          ae.bji().dP(paramLong);
          if (paramInt != 0) {
            ((bel)localObject2).uQd = ((a.b.a)paramObject).pCE;
          }
        }
        if (paramInt == 4)
        {
          if ((parambew == null) || ((parambew.uQm == 0) && (parambew.uQp == 0L)))
          {
            GMTrace.o(8045413269504L, 59943);
            return localbfk;
          }
          paramObject = new bfl();
          ((bfl)paramObject).uQm = parambew.uQm;
          try
          {
            parambew = ((bfl)paramObject).toByteArray();
            localbfk.uHZ = new azp().be(parambew);
          }
          catch (Exception parambew)
          {
            w.printErrStackTrace("MicroMsg.NetSceneSnsObjectOp", parambew, "", new Object[0]);
          }
          break;
        }
        if (paramInt == 10)
        {
          parambew = new bfu();
          if ((paramObject instanceof com.tencent.mm.bm.b))
          {
            paramObject = (com.tencent.mm.bm.b)paramObject;
            parambew.uRE = com.tencent.mm.platformtools.n.H(((com.tencent.mm.bm.b)paramObject).tJp);
            w.i("MicroMsg.NetSceneSnsObjectOp", "NetSceneSnsObjectOpticket " + ((com.tencent.mm.bm.b)paramObject).tJp.length);
          }
          for (;;)
          {
            try
            {
              parambew = parambew.toByteArray();
              localbfk.uHZ = new azp().be(parambew);
              w.i("MicroMsg.NetSceneSnsObjectOp", "opFree " + parambew.length);
            }
            catch (Exception parambew)
            {
              w.e("MicroMsg.NetSceneSnsObjectOp", "error ticket " + parambew.getMessage());
              w.printErrStackTrace("MicroMsg.NetSceneSnsObjectOp", parambew, "", new Object[0]);
            }
            break;
            w.e("MicroMsg.NetSceneSnsObjectOp", "error ticket");
          }
        }
        if (paramInt != 12) {
          break;
        }
        if ((paramObject instanceof bfg))
        {
          parambew = (bfg)paramObject;
          try
          {
            localbfk.uHZ = com.tencent.mm.platformtools.n.H(parambew.toByteArray());
            w.i("MicroMsg.NetSceneSnsObjectOp", "snsMetionBlockOp, switch:%d " + parambew.uQL);
          }
          catch (Exception parambew)
          {
            w.e("MicroMsg.NetSceneSnsObjectOp", "error snsMetionBlockOp " + parambew.getMessage());
          }
          break;
        }
        w.e("MicroMsg.NetSceneSnsObjectOp", "error snsMetionBlockOp");
        break;
      }
      label1052:
      continue;
      label1055:
      localObject1 = null;
      break label116;
      label1061:
      localObject1 = null;
    }
  }
  
  private static bfk v(long paramLong, int paramInt)
  {
    GMTrace.i(8045547487232L, 59944);
    bfk localbfk = new bfk();
    localbfk.uHZ = new azp();
    localbfk.tXT = paramLong;
    localbfk.lQF = paramInt;
    GMTrace.o(8045547487232L, 59944);
    return localbfk;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(8045681704960L, 59945);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(8045681704960L, 59945);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, com.tencent.mm.network.q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(8045950140416L, 59947);
    w.i("MicroMsg.NetSceneSnsObjectOp", "netId : " + paramInt1 + " errType :" + paramInt2 + " errCode: " + paramInt3 + " errMsg :" + paramString);
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      if ((paramInt2 == 4) && (this.type == 1)) {
        switch (this.type)
        {
        }
      }
      for (;;)
      {
        this.fUd.a(paramInt2, paramInt3, paramString, this);
        GMTrace.o(8045950140416L, 59947);
        return;
        ae.bjc().dH(this.psn);
        continue;
        ae.bjc().dJ(this.psn);
      }
    }
    switch (this.type)
    {
    case 10: 
    default: 
    case 1: 
    case 2: 
    case 3: 
    case 5: 
    case 4: 
      do
      {
        for (;;)
        {
          ae.bjc().biE();
          this.fUd.a(paramInt2, paramInt3, paramString, this);
          GMTrace.o(8045950140416L, 59947);
          return;
          ae.bjc().dH(this.psn);
          ae.bjd().delete(this.psn);
          continue;
          paramq = ae.bjd().dU(this.psn);
          if (paramq != null)
          {
            paramq.field_pravited = 1;
            paramq.blS();
            ae.bjd().b(this.psn, paramq);
            continue;
            paramq = ae.bjd().dU(this.psn);
            if (paramq != null)
            {
              paramq.field_pravited = 0;
              paramq.field_localPrivate = 0;
              paramq.blV();
              ae.bjd().b(this.psn, paramq);
              continue;
              ae.bjc().dJ(this.psn);
            }
          }
        }
        paramArrayOfByte = ae.bjd().dU(this.psn);
      } while (paramArrayOfByte == null);
    }
    for (;;)
    {
      bfh localbfh;
      Iterator localIterator;
      try
      {
        localbfh = (bfh)new bfh().aD(paramArrayOfByte.field_attrBuf);
        localIterator = localbfh.uQT.iterator();
        if (!localIterator.hasNext()) {
          break label1309;
        }
        paramq = (bew)localIterator.next();
        if ((this.pso == null) || (paramq.uQm != this.pso.uQm)) {
          continue;
        }
        if (paramq != null) {
          localbfh.uQT.remove(paramq);
        }
        paramArrayOfByte.aE(localbfh.toByteArray());
        ae.bjd().z(paramArrayOfByte);
        ae.bji().e(paramArrayOfByte.field_snsId, this.pso.uQm, this.pso.jib);
      }
      catch (Exception paramq)
      {
        w.printErrStackTrace("MicroMsg.NetSceneSnsObjectOp", paramq, "", new Object[0]);
      }
      break;
      paramArrayOfByte = ae.bjg().dN(this.psn);
      if (paramArrayOfByte == null) {
        break;
      }
      for (;;)
      {
        try
        {
          localbfh = (bfh)new bfh().aD(paramArrayOfByte.field_attrBuf);
          localIterator = localbfh.uQT.iterator();
          if (!localIterator.hasNext()) {
            break label1303;
          }
          paramq = (bew)localIterator.next();
          if ((this.pso == null) || (paramq.uQp != this.pso.uQp)) {
            continue;
          }
          if (paramq != null) {
            localbfh.uQT.remove(paramq);
          }
          paramArrayOfByte.aE(localbfh.toByteArray());
          ae.bjg().a(paramArrayOfByte);
          ae.bji().e(paramArrayOfByte.field_snsId, this.pso.uQp, this.pso.jib);
        }
        catch (Exception paramq)
        {
          w.printErrStackTrace("MicroMsg.NetSceneSnsObjectOp", paramq, "", new Object[0]);
        }
        break;
        ae.bjc().dJ(this.psn);
        break;
        if ((this.psp != null) && ((this.psp instanceof a.b.a)) && (((a.b.a)this.psp).pCE == a.b.a.pCA)) {
          break;
        }
        ae.bjg().delete(this.psn);
        ae.bji().dP(this.psn);
        break;
        paramq = ae.bjd().dU(this.psn);
        if (paramq == null) {
          break;
        }
        paramq.uY(2);
        ae.bjd().b(this.psn, paramq);
        break;
        w.i("MicroMsg.NetSceneSnsObjectOp", "scene end switch " + this.psq);
        label909:
        int i;
        int j;
        if (this.psq == 0)
        {
          h.xz();
          h.xy().xh().a(w.a.vty, Boolean.valueOf(true));
          h.xz();
          paramInt1 = ((Integer)h.xy().xh().get(w.a.vtA, Integer.valueOf(0))).intValue();
          h.xz();
          h.xy().xh().a(w.a.vtA, Integer.valueOf(paramInt1 + 1));
          h.xz();
          i = ((Integer)h.xy().xh().get(w.a.vtB, Integer.valueOf(0))).intValue();
          if (this.psq != 0) {
            break label1124;
          }
          i += 1;
          j = i * 2 + 198;
          paramInt1 = j;
          if (j >= 216) {
            paramInt1 = 216;
          }
          if (paramInt1 >= 200) {
            com.tencent.mm.plugin.sns.lucky.a.b.nU(paramInt1);
          }
          w.i("MicroMsg.NetSceneSnsObjectOp", "opcount open " + paramInt1 + " " + i);
          paramInt1 = i;
        }
        for (;;)
        {
          h.xz();
          h.xy().xh().a(w.a.vtB, Integer.valueOf(paramInt1));
          break;
          if (this.psq != 1) {
            break label909;
          }
          h.xz();
          h.xy().xh().a(w.a.vty, Boolean.valueOf(false));
          break label909;
          label1124:
          paramInt1 = i;
          if (this.psq == 1)
          {
            i += 1;
            j = i * 2 + 198 + 1;
            paramInt1 = j;
            if (j >= 217) {
              paramInt1 = 217;
            }
            if (paramInt1 >= 201) {
              com.tencent.mm.plugin.sns.lucky.a.b.nU(paramInt1);
            }
            w.i("MicroMsg.NetSceneSnsObjectOp", "opcount close " + paramInt1 + " " + i);
            paramInt1 = i;
          }
        }
        if ((this.psp == null) || (!(this.psp instanceof bfg))) {
          break;
        }
        if (((bfg)this.psp).uQL == 1) {}
        for (boolean bool = true;; bool = false)
        {
          ae.bji().l(this.psn, bool);
          w.i("MicroMsg.NetSceneSnsObjectOp", "remind  update [snsId:%d] ->isSilence: %b", new Object[] { Long.valueOf(this.psn), Boolean.valueOf(bool) });
          break;
        }
        label1303:
        paramq = null;
      }
      label1309:
      paramq = null;
    }
  }
  
  public final int getType()
  {
    GMTrace.i(8045815922688L, 59946);
    GMTrace.o(8045815922688L, 59946);
    return 218;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\model\q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */