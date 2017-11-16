package com.tencent.mm.plugin.favorite.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.g.a.tm;
import com.tencent.mm.g.a.tm.a;
import com.tencent.mm.plugin.favorite.h;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.protocal.c.bq;
import com.tencent.mm.protocal.c.br;
import com.tencent.mm.protocal.c.tt;
import com.tencent.mm.protocal.c.tw;
import com.tencent.mm.protocal.c.uf;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.o;
import com.tencent.mm.y.u;
import com.tencent.mm.y.u.b;

public final class aa
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private final com.tencent.mm.ad.b fUa;
  private com.tencent.mm.ad.e fUd;
  public j lcg;
  
  public aa(j paramj)
  {
    GMTrace.i(6264075583488L, 46671);
    this.fUd = null;
    b.a locala = new b.a();
    locala.gtF = new bq();
    locala.gtG = new br();
    locala.uri = "/cgi-bin/micromsg-bin/addfavitem";
    locala.gtE = 401;
    locala.gtH = 193;
    locala.gtI = 1000000193;
    this.fUa = locala.DA();
    this.lcg = paramj;
    GMTrace.o(6264075583488L, 46671);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(6264209801216L, 46672);
    bq localbq = (bq)this.fUa.gtC.gtK;
    localbq.tPP = o.h(this.lcg.field_xml, System.currentTimeMillis());
    localbq.jib = this.lcg.field_type;
    localbq.tPQ = this.lcg.field_sourceType;
    this.lcg.field_xml = j.b(this.lcg);
    h.axB().a(this.lcg, new String[] { "localId" });
    localbq.tPS = this.lcg.field_xml;
    localbq.tPR = this.lcg.field_sourceId;
    this.lcg.xG("MicroMsg.NetSceneAddFav");
    this.fUd = parame1;
    w.i("MicroMsg.NetSceneAddFav", "ADD FavItem, sourceId:%s localId:%d favId:%d", new Object[] { this.lcg.field_sourceId, Long.valueOf(this.lcg.field_localId), Integer.valueOf(this.lcg.field_id) });
    int i = a(parame, this.fUa, this);
    GMTrace.o(6264209801216L, 46672);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, com.tencent.mm.network.q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(6264344018944L, 46673);
    w.i("MicroMsg.NetSceneAddFav", "netId : " + paramInt1 + " errType :" + paramInt2 + " errCode: " + paramInt3 + " errMsg :" + paramString);
    if (((paramInt2 == 0) && (paramInt3 == 0)) || (paramInt3 == 65136))
    {
      paramq = (br)((com.tencent.mm.ad.b)paramq).gtD.gtK;
      w.i("MicroMsg.NetSceneAddFav", "fav id %d, local id %d, itemStatus %d, update seq %d", new Object[] { Integer.valueOf(paramq.tPL), Long.valueOf(this.lcg.field_localId), Integer.valueOf(this.lcg.field_itemStatus), Integer.valueOf(paramq.tPO) });
      this.lcg.field_id = paramq.tPL;
      this.lcg.field_localSeq = paramq.tPO;
      if (this.lcg.field_itemStatus == 12)
      {
        w.v("MicroMsg.NetSceneAddFav", "onGYNetEnd wait server upload sent");
        this.lcg.field_itemStatus = 13;
      }
      if (this.lcg.field_itemStatus == 9)
      {
        w.v("MicroMsg.NetSceneAddFav", "onGYNetEnd item done");
        this.lcg.field_itemStatus = 10;
        h.axw().cd(this.lcg.field_localId);
        g.ork.i(10659, new Object[] { Integer.valueOf(0), Integer.valueOf(this.lcg.field_type), Integer.valueOf(0), Long.valueOf(x.k(this.lcg)), Long.valueOf(x.ck(this.lcg.field_localId)) });
      }
      paramArrayOfByte = h.axB().cg(paramq.tPL);
      if (paramArrayOfByte != null)
      {
        this.lcg.field_updateSeq = paramArrayOfByte.field_updateSeq;
        h.axB().d(paramArrayOfByte);
        w.i("MicroMsg.NetSceneAddFav", "onGYNetEnd aleady exist, delete old info, favId:%d", new Object[] { Integer.valueOf(paramArrayOfByte.field_id) });
      }
      paramArrayOfByte = u.Av().gx(this.lcg.field_sessionId);
      if ((!bg.nm(this.lcg.field_sessionId)) && (this.lcg.field_type == 5) && (paramArrayOfByte != null))
      {
        tm localtm = new tm();
        localtm.eZa.eZb = paramArrayOfByte.getString("prePublishId", "");
        if ((this.lcg.field_favProto != null) && (this.lcg.field_favProto.ulz != null)) {
          localtm.eZa.url = this.lcg.field_favProto.ulz.gVf;
        }
        if ((bg.nm(localtm.eZa.url)) && (this.lcg.field_favProto != null) && (this.lcg.field_favProto.ukJ != null) && (this.lcg.field_favProto.ukJ.umf != null)) {
          localtm.eZa.url = this.lcg.field_favProto.ukJ.umf;
        }
        if (bg.nm(localtm.eZa.url)) {
          localtm.eZa.url = paramArrayOfByte.getString("url", "");
        }
        localtm.eZa.eZd = paramArrayOfByte.getString("preUsername", "");
        localtm.eZa.eZe = paramArrayOfByte.getString("preChatName", "");
        localtm.eZa.eZf = paramArrayOfByte.getInt("preMsgIndex", 0);
        localtm.eZa.eZj = paramArrayOfByte.getInt("sendAppMsgScene", 0);
        localtm.eZa.eZk = paramArrayOfByte.getInt("getA8KeyScene", 0);
        localtm.eZa.eZl = paramArrayOfByte.getString("referUrl", null);
        localtm.eZa.eZm = paramArrayOfByte.getString("adExtStr", null);
        localtm.eZa.eZg = "";
        localtm.eZa.eZh = "";
        localtm.eZa.eZi = 0;
        localtm.eZa.eZc = ("fav_" + com.tencent.mm.y.q.zE() + "_" + this.lcg.field_id);
        a.vgX.m(localtm);
      }
      this.lcg.field_sessionId = null;
      h.axB().a(this.lcg, new String[] { "localId" });
      x.cn(paramq.tPT);
    }
    if ((paramInt2 == 4) && (paramInt3 == 65135))
    {
      w.w("MicroMsg.NetSceneAddFav", "fav fail, full size");
      if (!this.lcg.axM()) {
        break label911;
      }
      h.axB().s(16, this.lcg.field_localId);
    }
    for (;;)
    {
      x.x(this.lcg);
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(6264344018944L, 46673);
      return;
      label911:
      h.axB().s(6, this.lcg.field_localId);
    }
  }
  
  public final int getType()
  {
    GMTrace.i(6264478236672L, 46674);
    GMTrace.o(6264478236672L, 46674);
    return 401;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\favorite\b\aa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */