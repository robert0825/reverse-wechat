package com.tencent.mm.pluginsdk.model;

import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.d.a;
import com.tencent.mm.plugin.normsg.a.d;
import com.tencent.mm.protocal.c.azp;
import com.tencent.mm.protocal.c.bnk;
import com.tencent.mm.protocal.c.bnl;
import com.tencent.mm.protocal.c.bnm;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.g;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import junit.framework.Assert;

public final class n
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  public int eHJ;
  public final b fUa;
  private com.tencent.mm.ad.e fUd;
  public String gGe;
  public List<String> tmZ;
  public String tna;
  private List<String> tnb;
  
  private n(int paramInt1, String paramString1, String paramString2, int paramInt2)
  {
    GMTrace.i(764369960960L, 5695);
    this.tmZ = null;
    this.eHJ = 0;
    this.tnb = null;
    Assert.assertTrue("This NetSceneVerifyUser init MUST use opcode == MM_VERIFYUSER_VERIFYOK", true);
    this.tmZ = new LinkedList();
    this.tmZ.add(paramString1);
    this.eHJ = 3;
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new bnl();
    ((b.a)localObject).gtG = new bnm();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/verifyuser";
    ((b.a)localObject).gtE = 137;
    ((b.a)localObject).gtH = 44;
    ((b.a)localObject).gtI = 1000000044;
    this.fUa = ((b.a)localObject).DA();
    localObject = (bnl)this.fUa.gtC.gtK;
    ((bnl)localObject).tSK = 3;
    ((bnl)localObject).utG = "";
    LinkedList localLinkedList = new LinkedList();
    bnk localbnk = new bnk();
    localbnk.oqQ = paramString1;
    localbnk.uXo = paramString2;
    localbnk.uoe = a.Re().zu().Th(paramString1);
    localbnk.uNG = null;
    localLinkedList.add(localbnk);
    ((bnl)localObject).uXv = localLinkedList;
    ((bnl)localObject).uXu = localLinkedList.size();
    paramString1 = new LinkedList();
    paramString1.add(Integer.valueOf(paramInt2));
    ((bnl)localObject).uXx = paramString1;
    ((bnl)localObject).uXw = paramString1.size();
    ((bnl)localObject).uAI = new azp().be(d.nxJ.aUq());
    w.i("MicroMsg.NetSceneVerifyUser.dkverify", "dkverify scene:%d user:%d ticket:%s anti:%s", new Object[] { Integer.valueOf(((bnl)localObject).uXv.size()), Integer.valueOf(((bnl)localObject).uXx.size()), paramString2, localbnk.uoe });
    GMTrace.o(764369960960L, 5695);
  }
  
  public n(int paramInt, List<String> paramList, List<Integer> paramList1, String paramString1, String paramString2)
  {
    this(paramInt, paramList, paramList1, null, paramString1, paramString2, null, null, "");
    GMTrace.i(764906831872L, 5699);
    GMTrace.o(764906831872L, 5699);
  }
  
  public n(int paramInt, List<String> paramList1, List<Integer> paramList, List<String> paramList2, String paramString1, String paramString2, Map<String, Integer> paramMap, String paramString3, String paramString4)
  {
    GMTrace.i(764504178688L, 5696);
    this.tmZ = null;
    this.eHJ = 0;
    this.tnb = null;
    boolean bool;
    Object localObject;
    if (paramInt != 3)
    {
      bool = true;
      Assert.assertTrue("This NetSceneVerifyUser init NEVER use opcode == MM_VERIFYUSER_VERIFYOK", bool);
      this.eHJ = paramInt;
      this.tmZ = paramList1;
      if (paramList2 != null)
      {
        localObject = paramList2;
        if (paramList2.size() != 0) {}
      }
      else
      {
        localObject = new LinkedList();
      }
      paramList2 = new b.a();
      paramList2.gtF = new bnl();
      paramList2.gtG = new bnm();
      paramList2.uri = "/cgi-bin/micromsg-bin/verifyuser";
      paramList2.gtE = 137;
      paramList2.gtH = 44;
      paramList2.gtI = 1000000044;
      this.fUa = paramList2.DA();
      if ((localObject != null) && (((List)localObject).size() > 0))
      {
        if (paramInt != 1) {
          break label313;
        }
        bool = true;
        label175:
        Assert.assertTrue("only when opcode == 1 , antispamticket not null", bool);
        if (((List)localObject).size() == paramList1.size()) {
          break label319;
        }
        w.e("MicroMsg.NetSceneVerifyUser.dkverify", "dkverify Error lstAntispamTicket:%d lstVerifyUser:%d", new Object[] { Integer.valueOf(((List)localObject).size()), Integer.valueOf(paramList1.size()) });
      }
    }
    for (;;)
    {
      if (paramInt != 2) {
        break label377;
      }
      Assert.assertTrue("only when opcode == 2, antispamticket should null", ((List)localObject).isEmpty());
      int i = 0;
      while (i < paramList1.size())
      {
        ((List)localObject).add(bg.aq(a.Re().zu().Th((String)paramList1.get(i)), ""));
        i += 1;
      }
      bool = false;
      break;
      label313:
      bool = false;
      break label175;
      label319:
      i = 0;
      while (i < ((List)localObject).size())
      {
        a.Re().zu().t((String)paramList1.get(i), 2147483633, (String)((List)localObject).get(i));
        i += 1;
      }
    }
    label377:
    bnl localbnl = (bnl)this.fUa.gtC.gtK;
    localbnl.tSK = paramInt;
    localbnl.utG = paramString1;
    this.tna = paramString1;
    paramString1 = new LinkedList();
    paramInt = 0;
    if (paramInt < paramList1.size())
    {
      bnk localbnk = new bnk();
      localbnk.oqQ = ((String)paramList1.get(paramInt));
      if (paramString2 == null) {}
      for (paramList2 = "";; paramList2 = paramString2)
      {
        localbnk.uXo = paramList2;
        paramList2 = a.Re().zu();
        String str = localbnk.oqQ;
        ((Integer)paramList.get(paramInt)).intValue();
        localbnk.uoe = bg.aq(paramList2.Th(str), "");
        if ((TextUtils.isEmpty(localbnk.uoe)) && (localObject != null) && (((List)localObject).size() > paramInt)) {
          localbnk.uoe = ((String)((List)localObject).get(paramInt));
        }
        localbnk.uNG = paramString3;
        if ((paramMap != null) && (paramMap.containsKey(localbnk.oqQ))) {
          localbnk.uXp = ((Integer)paramMap.get(localbnk.oqQ)).intValue();
        }
        localbnk.uXt = paramString4;
        w.i("MicroMsg.NetSceneVerifyUser.dkverify", "dkverify op:%s idx:%s user:%s anti:%s chatroom:%s, reportInfo:%s", new Object[] { Integer.valueOf(this.eHJ), Integer.valueOf(paramInt), localbnk.oqQ, localbnk.uoe, paramString3, paramString4 });
        paramString1.add(localbnk);
        paramInt += 1;
        break;
      }
    }
    localbnl.uXv = paramString1;
    localbnl.uXu = paramString1.size();
    paramList1 = new LinkedList();
    paramList1.addAll(paramList);
    localbnl.uXx = paramList1;
    localbnl.uXw = paramList1.size();
    localbnl.uAI = new azp().be(d.nxJ.aUq());
    w.i("MicroMsg.NetSceneVerifyUser.dkverify", "dkverify op:%d scene:%d user:%d antitickets:%s chatroom:%s stack:%s", new Object[] { Integer.valueOf(this.eHJ), Integer.valueOf(localbnl.uXv.size()), Integer.valueOf(localbnl.uXx.size()), bg.c((List)localObject, ","), paramString3, bg.bQW() });
    GMTrace.o(764504178688L, 5696);
  }
  
  public n(String paramString1, String paramString2, int paramInt)
  {
    this(3, paramString1, paramString2, paramInt);
    GMTrace.i(764772614144L, 5698);
    GMTrace.o(764772614144L, 5698);
  }
  
  public n(List<String> paramList, List<Integer> paramList1, String paramString1, String paramString2, Map<String, Integer> paramMap, String paramString3)
  {
    this(2, paramList, paramList1, null, paramString1, paramString2, paramMap, paramString3, "");
    GMTrace.i(764638396416L, 5697);
    GMTrace.o(764638396416L, 5697);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(765309485056L, 5702);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(765309485056L, 5702);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(765577920512L, 5704);
    if ((paramInt2 != 0) || (paramInt3 != 0)) {
      w.e("MicroMsg.NetSceneVerifyUser.dkverify", "errType:%d, errCode:%d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    }
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(765577920512L, 5704);
  }
  
  public final String bJk()
  {
    GMTrace.i(765175267328L, 5701);
    if ((this.fUa != null) && (this.fUa.gtD != null))
    {
      String str = ((bnm)this.fUa.gtD.gtK).jhi;
      GMTrace.o(765175267328L, 5701);
      return str;
    }
    GMTrace.o(765175267328L, 5701);
    return "";
  }
  
  public final void eC(String paramString1, String paramString2)
  {
    GMTrace.i(765041049600L, 5700);
    Iterator localIterator = ((bnl)this.fUa.gtC.gtK).uXv.iterator();
    while (localIterator.hasNext())
    {
      bnk localbnk = (bnk)localIterator.next();
      localbnk.uXq = paramString1;
      localbnk.uXr = paramString2;
    }
    GMTrace.o(765041049600L, 5700);
  }
  
  public final int getType()
  {
    GMTrace.i(765443702784L, 5703);
    GMTrace.o(765443702784L, 5703);
    return 30;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\model\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */