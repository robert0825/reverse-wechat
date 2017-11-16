package com.tencent.mm.plugin.aa.a.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.wallet_core.model.h;
import com.tencent.mm.protocal.c.g;
import com.tencent.mm.sdk.platformtools.w;
import java.net.URLEncoder;
import java.util.LinkedList;
import java.util.List;

public final class f
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  public String chatroomName;
  private com.tencent.mm.ad.e fUd;
  private b gUL;
  private com.tencent.mm.protocal.c.f hpj;
  public g hpk;
  
  public f(long paramLong1, String paramString1, int paramInt1, int paramInt2, long paramLong2, String paramString2)
  {
    GMTrace.i(5598087217152L, 41709);
    b.a locala = new b.a();
    locala.gtF = new com.tencent.mm.protocal.c.f();
    locala.gtG = new g();
    locala.gtE = 1624;
    locala.uri = "/cgi-bin/mmpay-bin/newaalaunchbymoney";
    locala.gtH = 0;
    locala.gtI = 0;
    this.gUL = locala.DA();
    this.hpj = ((com.tencent.mm.protocal.c.f)this.gUL.gtC.gtK);
    this.chatroomName = paramString2;
    try
    {
      this.hpj.tMc = paramInt1;
      this.hpj.tMd = paramLong1;
      this.hpj.title = URLEncoder.encode(paramString1, "UTF-8");
      this.hpj.tMe = new LinkedList();
      this.hpj.scene = paramInt2;
      this.hpj.tMa = paramString2;
      this.hpj.tMf = h.byp();
      w.d("MicroMsg.NetSceneAALaunchByMoney", "location %s", new Object[] { this.hpj.tMf });
      this.hpj.tMg = paramLong2;
      w.i("MicroMsg.NetSceneAALaunchByMoney", "NetSceneAALaunchByMoney, total_num: %s, per_amount: %s, title: %s, payer_list: %s, scene: %s, groupid: %s, timestamp", new Object[] { Integer.valueOf(this.hpj.tMc), Long.valueOf(this.hpj.tMd), this.hpj.title, this.hpj.tMe, Integer.valueOf(this.hpj.scene), this.hpj.tMa, Long.valueOf(this.hpj.tMg) });
      GMTrace.o(5598087217152L, 41709);
      return;
    }
    catch (Exception paramString1)
    {
      for (;;)
      {
        w.e("MicroMsg.NetSceneAALaunchByMoney", "build NetSceneAALaunchByMoney request error: %s", new Object[] { paramString1.getMessage() });
      }
    }
  }
  
  public f(long paramLong1, String paramString1, List<String> paramList, int paramInt, long paramLong2, String paramString2)
  {
    GMTrace.i(5597952999424L, 41708);
    b.a locala = new b.a();
    locala.gtF = new com.tencent.mm.protocal.c.f();
    locala.gtG = new g();
    locala.gtE = 1624;
    locala.uri = "/cgi-bin/mmpay-bin/newaalaunchbymoney";
    locala.gtH = 0;
    locala.gtI = 0;
    this.chatroomName = paramString2;
    this.gUL = locala.DA();
    this.hpj = ((com.tencent.mm.protocal.c.f)this.gUL.gtC.gtK);
    this.gUL.gtT = true;
    if (paramList != null) {}
    try
    {
      if (paramList.size() > 0)
      {
        this.hpj.tMc = paramList.size();
        this.hpj.tMd = paramLong1;
        this.hpj.title = URLEncoder.encode(paramString1, "UTF-8");
        this.hpj.tMe = new LinkedList();
        this.hpj.tMe.addAll(paramList);
        this.hpj.scene = paramInt;
        this.hpj.tMa = paramString2;
        this.hpj.tMf = h.byp();
        this.hpj.tMg = paramLong2;
        w.d("MicroMsg.NetSceneAALaunchByMoney", "location %s", new Object[] { this.hpj.tMf });
      }
      w.i("MicroMsg.NetSceneAALaunchByMoney", "NetSceneAALaunchByMoney, total_num: %s, per_amount: %s, title: %s, payer_list: %s, scene: %s, groupid: %s, timestamp: %s", new Object[] { Integer.valueOf(this.hpj.tMc), Long.valueOf(this.hpj.tMd), this.hpj.title, this.hpj.tMe, Integer.valueOf(this.hpj.scene), this.hpj.tMa, Long.valueOf(this.hpj.tMg) });
      GMTrace.o(5597952999424L, 41708);
      return;
    }
    catch (Exception paramString1)
    {
      for (;;)
      {
        w.e("MicroMsg.NetSceneAALaunchByMoney", "build NetSceneAALaunchByMoney request error: %s", new Object[] { paramString1.getMessage() });
      }
    }
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(5598355652608L, 41711);
    w.i("MicroMsg.NetSceneAALaunchByMoney", "doScene");
    this.fUd = parame1;
    int i = a(parame, this.gUL, this);
    GMTrace.o(5598355652608L, 41711);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(5598489870336L, 41712);
    w.i("MicroMsg.NetSceneAALaunchByMoney", "onGYNetEnd, errType: %s, errCode: %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    this.hpk = ((g)((b)paramq).gtD.gtK);
    paramInt1 = this.hpk.jWs;
    paramq = this.hpk.jWt;
    if (this.hpk.tMb == null) {}
    for (boolean bool = true;; bool = false)
    {
      w.i("MicroMsg.NetSceneAALaunchByMoney", "retcode: %s, retmsg: %s, msgxml==null: %s, billNo: %s", new Object[] { Integer.valueOf(paramInt1), paramq, Boolean.valueOf(bool), this.hpk.tLZ });
      w.d("MicroMsg.NetSceneAALaunchByMoney", "msgxml: %s", new Object[] { this.hpk.tMb });
      if (this.fUd != null) {
        this.fUd.a(paramInt2, paramInt3, paramString, this);
      }
      GMTrace.o(5598489870336L, 41712);
      return;
    }
  }
  
  public final int getType()
  {
    GMTrace.i(5598221434880L, 41710);
    GMTrace.o(5598221434880L, 41710);
    return 1624;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\aa\a\a\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */