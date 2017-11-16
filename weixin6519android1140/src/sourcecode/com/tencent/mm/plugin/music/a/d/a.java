package com.tencent.mm.plugin.music.a.d;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.mg;
import com.tencent.mm.protocal.c.mh;
import com.tencent.mm.sdk.platformtools.w;

public final class a
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private com.tencent.mm.ad.e fUd;
  private b gMj;
  public mg nrs;
  
  public a(int paramInt, com.tencent.mm.at.a parama)
  {
    GMTrace.i(14521955516416L, 108197);
    b.a locala = new b.a();
    locala.gtE = 940;
    locala.uri = "/cgi-bin/micromsg-bin/checkmusic";
    locala.gtF = new mg();
    locala.gtG = new mh();
    this.gMj = locala.DA();
    this.nrs = ((mg)this.gMj.gtC.gtK);
    this.nrs.tOG = paramInt;
    this.nrs.lQa = parama.field_appId;
    this.nrs.ucZ = parama.field_songAlbumUrl;
    this.nrs.uda = parama.field_songHAlbumUrl;
    this.nrs.udc = parama.field_songWifiUrl;
    this.nrs.udd = parama.field_songWapLinkUrl;
    this.nrs.udb = parama.field_songWebUrl;
    this.nrs.eBt = parama.field_songName;
    this.nrs.ucY = parama.field_musicId;
    GMTrace.o(14521955516416L, 108197);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(14522223951872L, 108199);
    this.fUd = parame1;
    int i = a(parame, this.gMj, this);
    GMTrace.o(14522223951872L, 108199);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(14522358169600L, 108200);
    w.i("MicroMsg.Music.NetSceneCheckMusic", "netId %d | errType %d | errCode %d | errMsg %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(14522358169600L, 108200);
  }
  
  public final int getType()
  {
    GMTrace.i(14522089734144L, 108198);
    GMTrace.o(14522089734144L, 108198);
    return 940;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\music\a\d\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */