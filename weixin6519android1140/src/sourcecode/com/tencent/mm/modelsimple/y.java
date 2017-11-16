package com.tencent.mm.modelsimple;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.ao.d;
import com.tencent.mm.ao.f;
import com.tencent.mm.ao.n;
import com.tencent.mm.g.a.nu;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.modelvoice.m;
import com.tencent.mm.modelvoice.p;
import com.tencent.mm.modelvoice.u;
import com.tencent.mm.pluginsdk.model.app.an;
import com.tencent.mm.protocal.c.azm;
import com.tencent.mm.protocal.c.azn;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.aj;
import com.tencent.mm.storage.au;
import com.tencent.mm.storage.t;
import com.tencent.mm.x.g;
import com.tencent.mm.y.at;
import com.tencent.mm.y.o;

public final class y
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private final long eDr;
  private com.tencent.mm.ad.e fUd;
  private final com.tencent.mm.ad.b gMj;
  private final String gVb;
  
  public y(au paramau, String paramString)
  {
    GMTrace.i(1352646262784L, 10078);
    at.AR();
    Object localObject = com.tencent.mm.y.c.xh().get(290818, Integer.valueOf(0));
    if (localObject != null) {}
    for (int i = bg.getInt(localObject.toString(), 0);; i = 0)
    {
      this.eDr = paramau.field_msgId;
      this.gVb = paramString;
      localObject = null;
      int k = 0;
      int m = (int)(paramau.field_createTime / 1000L);
      long l = paramau.field_msgSvrId;
      String str1 = com.tencent.mm.y.q.zE();
      String str2 = paramau.field_talker;
      int j = k;
      paramString = (String)localObject;
      if (paramau.fwz != 1) {}
      switch (paramau.field_type)
      {
      default: 
        paramString = (String)localObject;
        j = k;
      case 1: 
      case 42: 
      case 48: 
      case 34: 
      case 43: 
      case 62: 
      case 3: 
      case 47: 
        for (;;)
        {
          paramau = new b.a();
          paramau.gtF = new azm();
          paramau.gtG = new azn();
          paramau.uri = "/cgi-bin/micromsg-bin/revokemsg";
          paramau.gtE = 594;
          paramau.gtH = 0;
          paramau.gtI = 0;
          this.gMj = paramau.DA();
          paramau = (azm)this.gMj.gtC.gtK;
          paramau.tQN = paramString;
          paramau.uNH = j;
          paramau.uNI = 0;
          paramau.uNK = l;
          paramau.nFd = m;
          paramau.lSY = str1;
          paramau.lSX = str2;
          paramau.uNJ = i;
          w.i("MicroMsg.NetSceneRevokeMsg", "[oneliang][NetSceneRevokeMsg]:clientMsgId:%s,newClientMsgId:%d,svrMsgId:%d,createTime:%d,fromUserName:%s,toUserName:%s,indexOfRequest:%d", new Object[] { paramau.tQN, Integer.valueOf(paramau.uNH), Integer.valueOf(paramau.uNI), Integer.valueOf(paramau.nFd), paramau.lSY, paramau.lSX, Integer.valueOf(paramau.uNJ) });
          GMTrace.o(1352646262784L, 10078);
          return;
          j = o.h(com.tencent.mm.y.q.zE(), paramau.field_createTime).hashCode();
          w.i("MicroMsg.NetSceneRevokeMsg", "[oneliang][doSendRevokeMsg] type:text,newClientMsgId:%d", new Object[] { Integer.valueOf(j) });
          paramString = (String)localObject;
          continue;
          paramau = m.NK().mV(paramau.field_imgPath);
          j = k;
          paramString = (String)localObject;
          if (paramau != null)
          {
            paramString = paramau.clientId;
            w.i("MicroMsg.NetSceneRevokeMsg", "[oneliang][doSendRevokeMsg] type:voice,clientMsgId:%s", new Object[] { paramString });
            j = k;
            continue;
            paramString = paramau.field_imgPath;
            w.i("MicroMsg.NetSceneRevokeMsg", "[oneliang][doSendRevokeMsg] type:video,clientMsgId:%s", new Object[] { paramString });
            j = k;
            continue;
            localObject = n.IZ().aq(paramau.field_msgId);
            paramString = paramau.fwC;
            w.i("MicroMsg.NetSceneRevokeMsg", "[oneliang][doSendRevokeMsg] type:img,talker:%s,hdId:%s,localId:%s,clientMsgId:%s", new Object[] { paramau.field_talker, Integer.valueOf(((d)localObject).gHb), Long.valueOf(((d)localObject).gGR), paramString });
            j = k;
            continue;
            paramString = String.valueOf(aj.Uf(paramau.field_content).time);
            w.i("MicroMsg.NetSceneRevokeMsg", "[oneliang][doSendRevokeMsg] type:emoji,clientMsgId:%s", new Object[] { paramString });
            j = k;
          }
        }
      }
      paramString = an.afP().eq(paramau.field_msgId);
      if (paramString != null) {}
      for (paramau = paramString.field_clientAppDataId;; paramau = paramau.field_talker + paramau.field_msgId + "T" + paramau.field_createTime)
      {
        w.i("MicroMsg.NetSceneRevokeMsg", "[oneliang][doSendRevokeMsg] type:app msg/emoji/img,clientMsgId:%s", new Object[] { paramau });
        j = k;
        paramString = paramau;
        break;
      }
    }
  }
  
  public final azn LH()
  {
    GMTrace.i(1353183133696L, 10082);
    azn localazn = (azn)this.gMj.gtD.gtK;
    GMTrace.o(1353183133696L, 10082);
    return localazn;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(1352914698240L, 10080);
    this.fUd = parame1;
    int i = a(parame, this.gMj, this);
    GMTrace.o(1352914698240L, 10080);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, com.tencent.mm.network.q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(1353048915968L, 10081);
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      at.AR();
      paramq = com.tencent.mm.y.c.yM().cM(this.eDr);
      if (paramq.field_msgId != this.eDr) {
        break label336;
      }
      paramArrayOfByte = LH();
      w.i("MicroMsg.NetSceneRevokeMsg", "[oneliang][doSceneEnd.revokeMsg] msgId:%s,msgSvrId:%s,responseSysWording:%s", new Object[] { Long.valueOf(paramq.field_msgId), Long.valueOf(paramq.field_msgSvrId), paramArrayOfByte.uNM });
      paramq.setContent(this.gVb);
      int i = paramq.field_type;
      paramq.setType(10000);
      paramq.dC(0);
      paramq.dM(paramq.fwu | 0x4);
      paramArrayOfByte = new nu();
      paramArrayOfByte.eSN.eDr = this.eDr;
      a.vgX.m(paramArrayOfByte);
      at.AR();
      com.tencent.mm.y.c.yM().a(paramq.field_msgId, paramq);
      paramInt1 = 0;
      at.AR();
      paramArrayOfByte = com.tencent.mm.y.c.xh().get(290818, Integer.valueOf(0));
      if (paramArrayOfByte != null) {
        paramInt1 = bg.getInt(paramArrayOfByte.toString(), 0);
      }
      at.AR();
      com.tencent.mm.y.c.xh().set(290818, Integer.valueOf(paramInt1 + 1));
      paramq.setType(i);
      if (!paramq.aCp()) {
        break label309;
      }
      paramArrayOfByte = com.tencent.mm.modelstat.b.gWv;
      paramInt1 = g.g(paramq);
      if (paramArrayOfByte.Mg()) {
        paramArrayOfByte.a(paramq, com.tencent.mm.modelstat.b.b.gWJ, paramInt1);
      }
    }
    for (;;)
    {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(1353048915968L, 10081);
      return;
      label309:
      paramArrayOfByte = com.tencent.mm.modelstat.b.gWv;
      if (paramArrayOfByte.Mg())
      {
        paramArrayOfByte.a(paramq, com.tencent.mm.modelstat.b.b.gWJ, 0);
        continue;
        label336:
        w.e("MicroMsg.NetSceneRevokeMsg", "cannot find the msg:%d after revoke.", new Object[] { Long.valueOf(this.eDr) });
      }
    }
  }
  
  public final int getType()
  {
    GMTrace.i(1352780480512L, 10079);
    GMTrace.o(1352780480512L, 10079);
    return 594;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\modelsimple\y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */