package com.tencent.mm.plugin.emoji.f;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.protocal.c.ec;
import com.tencent.mm.protocal.c.ed;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.y.at;
import java.util.LinkedList;
import java.util.List;

public final class c
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  public final b fUa;
  private com.tencent.mm.ad.e fUd;
  public int gFW;
  private List<String> kll;
  
  public c(int paramInt, List<String> paramList)
  {
    GMTrace.i(11292274327552L, 84134);
    b.a locala = new b.a();
    locala.gtF = new ec();
    locala.gtG = new ed();
    locala.uri = "/cgi-bin/micromsg-bin/mmbackupemojioperate";
    locala.gtE = 698;
    locala.gtH = 0;
    locala.gtI = 0;
    this.fUa = locala.DA();
    this.gFW = paramInt;
    this.kll = paramList;
    GMTrace.o(11292274327552L, 84134);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(11292676980736L, 84137);
    this.fUd = parame1;
    parame1 = (ec)this.fUa.gtC.gtK;
    parame1.tSK = this.gFW;
    parame1.tSJ = new LinkedList(this.kll);
    if ((parame1.tSJ != null) && (parame1.tSJ.size() > 0))
    {
      w.i("MicroMsg.emoji.NetSceneBackupEmojiOperate", "do scene delte md5 list size:%s", new Object[] { Integer.valueOf(parame1.tSJ.size()) });
      i = 0;
    }
    while (i < parame1.tSJ.size())
    {
      w.i("MicroMsg.emoji.NetSceneBackupEmojiOperate", "do scene delte md5:%s", new Object[] { parame1.tSJ.get(i) });
      i += 1;
      continue;
      w.i("MicroMsg.emoji.NetSceneBackupEmojiOperate", "empty md5 list.");
    }
    int i = a(parame, this.fUa, this);
    GMTrace.o(11292676980736L, 84137);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(11292408545280L, 84135);
    w.i("MicroMsg.emoji.NetSceneBackupEmojiOperate", "errType:%d, errCode:%d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if (paramInt3 == 65102)
    {
      w.w("MicroMsg.emoji.NetSceneBackupEmojiOperate", "[cpan] batch backup emoji failed. over size.");
      at.AR();
      com.tencent.mm.y.c.xh().a(w.a.vpY, Boolean.valueOf(true));
      g.ork.a(164L, 7L, 1L, false);
    }
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      at.AR();
      com.tencent.mm.y.c.xh().a(w.a.vpY, Boolean.valueOf(false));
      if (this.gFW == 1) {
        g.ork.a(164L, 5L, 1L, false);
      }
    }
    for (;;)
    {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(11292408545280L, 84135);
      return;
      g.ork.a(164L, 8L, 1L, false);
      continue;
      if (this.gFW == 1) {
        g.ork.a(164L, 6L, 1L, false);
      } else {
        g.ork.a(164L, 9L, 1L, false);
      }
    }
  }
  
  public final int getType()
  {
    GMTrace.i(11292542763008L, 84136);
    GMTrace.o(11292542763008L, 84136);
    return 698;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\emoji\f\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */