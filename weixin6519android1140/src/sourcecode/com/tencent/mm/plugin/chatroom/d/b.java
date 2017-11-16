package com.tencent.mm.plugin.chatroom.d;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.a;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.protocal.c.dm;
import com.tencent.mm.protocal.c.dn;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.LinkedList;

public final class b
  extends a<dn>
{
  public b(String paramString1, String paramString2, String paramString3, LinkedList<String> paramLinkedList)
  {
    GMTrace.i(9061173035008L, 67511);
    w.d("MicroMsg.CgiApproveAddChatRoomMember", "inviterusername%s,roomname:%s,ticket:%s,username:%s", new Object[] { paramString1, paramString2, bg.SJ(paramString3), paramLinkedList });
    dm localdm = new dm();
    localdm.gPe = paramString1;
    localdm.tRM = paramString2;
    localdm.eEU = paramString3;
    localdm.tRN = paramLinkedList;
    paramString1 = new b.a();
    paramString1.gtF = localdm;
    paramString1.gtG = new dn();
    paramString1.uri = "/cgi-bin/micromsg-bin/approveaddchatroommember";
    paramString1.gtE = 774;
    this.fUa = paramString1.DA();
    GMTrace.o(9061173035008L, 67511);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\chatroom\d\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */