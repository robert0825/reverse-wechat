package com.tencent.mm.plugin.emoji.f;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.emoji.c.a;
import com.tencent.mm.plugin.emoji.e.l;
import com.tencent.mm.plugin.emoji.model.h;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.protocal.c.ex;
import com.tencent.mm.protocal.c.ey;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.emotion.EmojiInfo;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public final class d
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private final b fUa;
  private com.tencent.mm.ad.e fUd;
  private ArrayList<String> klm;
  
  public d(ArrayList<String> paramArrayList)
  {
    GMTrace.i(11287845142528L, 84101);
    b.a locala = new b.a();
    locala.gtF = new ex();
    locala.gtG = new ey();
    locala.uri = "/cgi-bin/micromsg-bin/mmbatchemojibackup";
    locala.gtE = 696;
    locala.gtH = 0;
    locala.gtI = 0;
    this.fUa = locala.DA();
    this.klm = paramArrayList;
    GMTrace.o(11287845142528L, 84101);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(11288247795712L, 84104);
    this.fUd = parame1;
    ((ex)this.fUa.gtC.gtK).tSJ = new LinkedList(this.klm);
    if ((this.klm == null) || (this.klm.size() <= 0))
    {
      w.i("MicroMsg.emoji.NetSceneBatchEmojiBackup", "need no backup custom emoji, list is null.");
      at.AR();
      c.xh().set(348162, Boolean.valueOf(false));
      GMTrace.o(11288247795712L, 84104);
      return -1;
    }
    int i = a(parame, this.fUa, this);
    GMTrace.o(11288247795712L, 84104);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(11287979360256L, 84102);
    w.i("MicroMsg.emoji.NetSceneBatchEmojiBackup", "netId:%d, errType:%d, errCode:%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if (paramInt3 == 65102)
    {
      w.w("MicroMsg.emoji.NetSceneBatchEmojiBackup", "[cpan] batch backup emoji failed. over size.");
      at.AR();
      c.xh().a(w.a.vpY, Boolean.valueOf(true));
      g.ork.a(164L, 4L, 1L, false);
    }
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      at.AR();
      c.xh().a(w.a.vpY, Boolean.valueOf(false));
      paramq = h.arl().kjy;
      paramArrayOfByte = this.klm;
      if ((paramArrayOfByte == null) || (paramArrayOfByte.size() <= 0))
      {
        w.i("MicroMsg.emoji.EmojiInfoStorage", "[cpan] LocalCustomEmoji failed. list is null");
        g.ork.a(164L, 2L, 1L, false);
      }
    }
    for (;;)
    {
      paramq = (ey)this.fUa.gtD.gtK;
      if ((paramq.tSL != null) && (paramq.tSL.size() > 0))
      {
        w.i("MicroMsg.emoji.NetSceneBatchEmojiBackup", "[cpan] there are some emoji need to upload.");
        h.arl().kjy.ax(paramq.tSL);
        at.AR();
        c.xh().set(348165, Boolean.valueOf(true));
        a.dN(true);
      }
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(11287979360256L, 84102);
      return;
      w.i("MicroMsg.emoji.EmojiInfoStorage", "[cpan] LocalCustomEmoji list size :%d.", new Object[] { Integer.valueOf(paramArrayOfByte.size()) });
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("UPDATE");
      localStringBuilder.append(" EmojiInfo ");
      localStringBuilder.append(" SET ");
      localStringBuilder.append("source");
      localStringBuilder.append("=");
      localStringBuilder.append(EmojiInfo.vCG);
      localStringBuilder.append(" where ");
      localStringBuilder.append("md5");
      localStringBuilder.append(" IN (");
      paramInt1 = 0;
      while (paramInt1 < paramArrayOfByte.size())
      {
        localStringBuilder.append("'" + (String)paramArrayOfByte.get(paramInt1) + "'");
        if (paramInt1 < paramArrayOfByte.size() - 1) {
          localStringBuilder.append(",");
        }
        paramInt1 += 1;
      }
      localStringBuilder.append(")");
      w.d("MicroMsg.emoji.EmojiInfoStorage", localStringBuilder.toString());
      paramq.fTZ.eZ("EmojiInfo", localStringBuilder.toString());
      break;
      g.ork.a(164L, 3L, 1L, false);
    }
  }
  
  public final int getType()
  {
    GMTrace.i(11288113577984L, 84103);
    GMTrace.o(11288113577984L, 84103);
    return 696;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\emoji\f\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */