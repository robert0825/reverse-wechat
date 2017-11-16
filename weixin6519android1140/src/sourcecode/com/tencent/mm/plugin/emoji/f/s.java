package com.tencent.mm.plugin.emoji.f;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.protocal.c.bmc;
import com.tencent.mm.protocal.c.bmd;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.emotion.EmojiGroupInfo;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class s
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private final b fUa;
  private com.tencent.mm.ad.e fUd;
  private int gFW;
  private List<String> klX;
  
  public s(List<String> paramList, int paramInt)
  {
    GMTrace.i(11296300859392L, 84164);
    this.klX = new ArrayList();
    b.a locala = new b.a();
    locala.gtF = new bmc();
    locala.gtG = new bmd();
    locala.uri = "/cgi-bin/micromsg-bin/mmuploadmypanellist";
    locala.gtE = 717;
    locala.gtH = 0;
    locala.gtI = 0;
    this.fUa = locala.DA();
    this.klX = paramList;
    this.gFW = paramInt;
    GMTrace.o(11296300859392L, 84164);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(11296703512576L, 84167);
    this.fUd = parame1;
    bmc localbmc = (bmc)this.fUa.gtC.gtK;
    localbmc.tMX = this.gFW;
    if (this.klX != null)
    {
      Iterator localIterator = this.klX.iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        parame1 = str;
        if (!bg.nm(str))
        {
          parame1 = str;
          if (str.equals(String.valueOf(EmojiGroupInfo.vCl))) {
            parame1 = "com.tencent.xin.emoticon.tusiji";
          }
        }
        localbmc.uWa.add(parame1);
        w.d("MicroMsg.emoji.NetSceneUploadMyPanelList", "product id is:%s", new Object[] { parame1 });
      }
      w.i("MicroMsg.emoji.NetSceneUploadMyPanelList", "opcode is:%d mProductIdList size:%s", new Object[] { Integer.valueOf(this.gFW), Integer.valueOf(this.klX.size()) });
    }
    int i = a(parame, this.fUa, this);
    GMTrace.o(11296703512576L, 84167);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(11296435077120L, 84165);
    w.i("MicroMsg.emoji.NetSceneUploadMyPanelList", "errType:%d, errCode:%d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      at.AR();
      c.xh().a(w.a.vpZ, Long.valueOf(System.currentTimeMillis()));
      at.AR();
      c.xh().a(w.a.vqc, Boolean.valueOf(true));
      g.ork.a(165L, 0L, 1L, false);
    }
    for (;;)
    {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(11296435077120L, 84165);
      return;
      at.AR();
      c.xh().a(w.a.vpZ, Long.valueOf(System.currentTimeMillis() - 86400000L + 3600000L));
      g.ork.a(165L, 1L, 1L, false);
    }
  }
  
  public final int getType()
  {
    GMTrace.i(11296569294848L, 84166);
    GMTrace.o(11296569294848L, 84166);
    return 717;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\emoji\f\s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */