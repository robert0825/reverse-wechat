package com.tencent.mm.plugin.hp.c;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build.VERSION;
import android.util.Base64;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.loader.stub.BaseBuildInfo;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.bjb;
import com.tencent.mm.protocal.c.mo;
import com.tencent.mm.protocal.c.mp;
import com.tencent.mm.protocal.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.LinkedList;
import java.util.List;

public final class a
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private final com.tencent.mm.ad.b fUa;
  private com.tencent.mm.ad.e fUd;
  private String mht;
  private String mhu;
  private LinkedList<bjb> mhv;
  private boolean mhw;
  private com.tencent.mm.plugin.hp.d.b yvQ;
  
  public a()
  {
    this("", "", null, false);
    GMTrace.i(18996908785664L, 141538);
    GMTrace.o(18996908785664L, 141538);
  }
  
  public a(String paramString1, String paramString2, List<bjb> paramList)
  {
    this(paramString1, paramString2, paramList, true);
    GMTrace.i(15365111283712L, 114479);
    GMTrace.o(15365111283712L, 114479);
  }
  
  private a(String paramString1, String paramString2, List<bjb> paramList, boolean paramBoolean)
  {
    GMTrace.i(18997043003392L, 141539);
    this.mhv = new LinkedList();
    this.mhw = true;
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new mo();
    ((b.a)localObject).gtG = new mp();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/checktinkerupdate";
    ((b.a)localObject).gtE = 922;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    if (!paramBoolean)
    {
      localObject = "tinker_id_" + BaseBuildInfo.baseRevision();
      long l1;
      if (BaseBuildInfo.PATCH_REV == null)
      {
        paramString1 = "";
        paramList = new LinkedList();
        l1 = 0L;
      }
      try
      {
        long l2 = com.tencent.mm.kernel.a.wM() & 0xFFFFFFFF;
        l1 = l2;
        w.i("MicroMsg.Tinker.NetSceneCheckTinkerUpdate", "uin is %s", new Object[] { bg.SJ(String.valueOf(l2)) });
        l1 = l2;
      }
      catch (Exception paramString2)
      {
        for (;;)
        {
          w.printErrStackTrace("MicroMsg.Tinker.NetSceneCheckTinkerUpdate", paramString2, "tinker patch manager get uin failed.", new Object[0]);
          continue;
          int i = 2;
          continue;
          i = 2;
        }
      }
      paramList.add(cB("code-version", com.tencent.mm.sdk.platformtools.e.CLIENT_VERSION));
      paramList.add(cB("code-reversion", com.tencent.mm.sdk.platformtools.e.REV));
      if (am.isWifi(ab.getContext()))
      {
        i = 3;
        paramList.add(cB("network", String.valueOf(i)));
        paramList.add(cB("sdk", String.valueOf(Build.VERSION.SDK_INT)));
        paramList.add(cB("os-name", d.tJy));
        paramList.add(cB("device-brand", d.tJv));
        paramList.add(cB("device-name", d.tJA));
        paramList.add(cB("uin", String.valueOf(l1)));
        if (!am.isWifi(ab.getContext())) {
          break label431;
        }
        i = 3;
        paramList.add(cB("network", String.valueOf(i)));
        paramString2 = paramString1;
      }
    }
    for (;;)
    {
      this.mht = ((String)localObject);
      this.mhu = paramString2;
      this.mhv.addAll(paramList);
      this.mhw = paramBoolean;
      GMTrace.o(18997043003392L, 141539);
      return;
      paramString1 = "tinker_id_" + BaseBuildInfo.PATCH_REV;
      break;
      label431:
      localObject = paramString1;
    }
  }
  
  private static bjb cB(String paramString1, String paramString2)
  {
    GMTrace.i(18997177221120L, 141540);
    bjb localbjb = new bjb();
    localbjb.amf = paramString1;
    localbjb.value = paramString2;
    GMTrace.o(18997177221120L, 141540);
    return localbjb;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(15365379719168L, 114481);
    w.d("MicroMsg.Tinker.NetSceneCheckTinkerUpdate", "doScene");
    this.fUd = parame1;
    parame1 = (mo)this.fUa.gtC.gtK;
    parame1.udp = this.mht;
    parame1.udq = this.mhu;
    parame1.udr = this.mhv;
    String str = ab.getContext().getSharedPreferences("tinker_patch_share_config", 4).getString("tinker_node", "");
    if (!bg.nm(str)) {}
    try
    {
      mp localmp = new mp();
      localmp.aD(Base64.decode(str.getBytes(), 0));
      if (localmp.uds != null)
      {
        this.yvQ = new com.tencent.mm.plugin.hp.d.b(localmp.uds);
        if ((bg.nm(this.yvQ.mhK)) || (this.yvQ.mhK.equalsIgnoreCase(this.mhu))) {
          break label241;
        }
        parame1.udq = this.yvQ.mhK;
        w.i("MicroMsg.Tinker.NetSceneCheckTinkerUpdate", "Use last response patchId %s instead of current patchId %s", new Object[] { this.yvQ.mhK, this.mhu });
        com.tencent.mm.plugin.report.service.g.ork.a(614L, 71L, 1L, false);
      }
      for (;;)
      {
        int i = a(parame, this.fUa, this);
        GMTrace.o(15365379719168L, 114481);
        return i;
        label241:
        w.i("MicroMsg.Tinker.NetSceneCheckTinkerUpdate", "same patch id");
      }
    }
    catch (Exception parame1)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.Tinker.NetSceneCheckTinkerUpdate", parame1, "parse tinker update Response failed.", new Object[0]);
        com.tencent.mm.plugin.report.service.g.ork.a(614L, 73L, 1L, false);
      }
    }
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(15365513936896L, 114482);
    w.i("MicroMsg.Tinker.NetSceneCheckTinkerUpdate", "errType:%d errCode:%d errMsg:%s ", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramArrayOfByte = (mp)((com.tencent.mm.ad.b)paramq).gtD.gtK;
      paramq = paramArrayOfByte.uds;
      if (paramq != null) {
        if (!this.mhw) {}
      }
    }
    for (;;)
    {
      try
      {
        com.tencent.mm.plugin.hp.tinker.g.bU(ab.getContext(), new String(Base64.encode(paramArrayOfByte.toByteArray(), 0)));
        com.tencent.mm.plugin.hp.tinker.g.aq(ab.getContext(), 0);
        w.d("MicroMsg.Tinker.NetSceneCheckTinkerUpdate", "node is no empty. try to process");
        paramq = new com.tencent.mm.plugin.hp.d.b(paramq);
        w.d("MicroMsg.Tinker.NetSceneCheckTinkerUpdate", "node is no empty. new TinkerSyncResponse finish");
        new com.tencent.mm.plugin.hp.b.e(paramq).WH();
        w.d("MicroMsg.Tinker.NetSceneCheckTinkerUpdate", "node is no empty. end process");
        com.tencent.mm.plugin.hp.b.a.cn(4, 0);
        this.fUd.a(paramInt2, paramInt3, paramString, this);
        GMTrace.o(15365513936896L, 114482);
        return;
      }
      catch (Exception paramArrayOfByte)
      {
        w.printErrStackTrace("MicroMsg.Tinker.NetSceneCheckTinkerUpdate", paramArrayOfByte, "save node failed.", new Object[0]);
        com.tencent.mm.plugin.report.service.g.ork.a(614L, 72L, 1L, false);
        continue;
      }
      w.i("MicroMsg.Tinker.NetSceneCheckTinkerUpdate", "check from setting about ui. ");
      continue;
      if (paramString.equalsIgnoreCase("no baseid matched"))
      {
        com.tencent.mm.plugin.hp.b.a.cn(1, 0);
        label249:
        if (this.yvQ == null) {
          break label414;
        }
        if (BaseBuildInfo.PATCH_REV != null) {
          break label416;
        }
      }
      label414:
      label416:
      for (paramq = "";; paramq = "tinker_id_" + BaseBuildInfo.PATCH_REV)
      {
        if ((bg.nm(this.yvQ.mhK)) || (this.yvQ.mhK.equalsIgnoreCase(paramq))) {
          break label437;
        }
        paramInt1 = ab.getContext().getSharedPreferences("tinker_patch_share_config", 4).getInt("tinker_node_retry_time", 0);
        if (paramInt1 < 4) {
          break label439;
        }
        com.tencent.mm.plugin.hp.tinker.g.bU(ab.getContext(), "");
        com.tencent.mm.plugin.hp.tinker.g.aq(ab.getContext(), 0);
        w.i("MicroMsg.Tinker.NetSceneCheckTinkerUpdate", "retry time over %d time, then clear node and count", new Object[] { Integer.valueOf(paramInt1) });
        com.tencent.mm.plugin.report.service.g.ork.a(614L, 74L, 1L, false);
        break;
        if (paramString.equalsIgnoreCase("no update for this patch"))
        {
          com.tencent.mm.plugin.hp.b.a.cn(2, 0);
          break label249;
        }
        if (paramString.equalsIgnoreCase("no sutable patch available"))
        {
          com.tencent.mm.plugin.hp.b.a.cn(3, 0);
          break label249;
        }
        com.tencent.mm.plugin.hp.b.a.cn(5, 0);
        break label249;
        break;
      }
      label437:
      continue;
      label439:
      new com.tencent.mm.plugin.hp.b.e(this.yvQ).WH();
      com.tencent.mm.plugin.report.service.g.ork.a(614L, 70L, 1L, false);
      paramInt1 += 1;
      com.tencent.mm.plugin.hp.tinker.g.aq(ab.getContext(), paramInt1);
      w.d("MicroMsg.Tinker.NetSceneCheckTinkerUpdate", "add retry time %d", new Object[] { Integer.valueOf(paramInt1) });
      continue;
      w.d("MicroMsg.Tinker.NetSceneCheckTinkerUpdate", "check tinker update failed.");
      com.tencent.mm.plugin.hp.b.a.cn(5, paramInt2);
    }
  }
  
  public final int getType()
  {
    GMTrace.i(15365245501440L, 114480);
    GMTrace.o(15365245501440L, 114480);
    return 922;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\hp\c\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */