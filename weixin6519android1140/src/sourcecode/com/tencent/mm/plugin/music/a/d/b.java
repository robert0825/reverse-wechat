package com.tencent.mm.plugin.music.a.d;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.at.a;
import com.tencent.mm.at.c;
import com.tencent.mm.network.q;
import com.tencent.mm.platformtools.n;
import com.tencent.mm.protocal.c.acw;
import com.tencent.mm.protocal.c.acx;
import com.tencent.mm.sdk.platformtools.w;

public final class b
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  public a eNq;
  private com.tencent.mm.ad.e fUd;
  private com.tencent.mm.ad.b gMj;
  public acx nrt;
  public boolean nru;
  
  public b(a parama, boolean paramBoolean)
  {
    GMTrace.i(4848346988544L, 36123);
    this.eNq = parama;
    this.nru = paramBoolean;
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new acw();
    ((b.a)localObject).gtG = new acx();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/getqqmusiclyric";
    ((b.a)localObject).gtE = 520;
    this.gMj = ((b.a)localObject).DA();
    localObject = (acw)this.gMj.gtC.gtK;
    ((acw)localObject).usQ = parama.field_songId;
    if (parama.field_songWebUrl != null) {
      ((acw)localObject).usR = n.H(parama.field_songWebUrl.getBytes());
    }
    if (c.JZ())
    {
      i = 0;
      ((acw)localObject).usS = i;
      if (!c.JY()) {
        break label217;
      }
    }
    label217:
    for (int i = 1;; i = 0)
    {
      ((acw)localObject).usT = i;
      w.i("MicroMsg.Music.NetSceneGetQQMusicLyric", "songId=%d, url=%s IsOutsideGFW=%d ShakeMusicGlobalSwitch=%d", new Object[] { Integer.valueOf(parama.field_songId), parama.field_songWebUrl, Integer.valueOf(((acw)localObject).usS), Integer.valueOf(((acw)localObject).usT) });
      GMTrace.o(4848346988544L, 36123);
      return;
      i = 1;
      break;
    }
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(4848749641728L, 36126);
    this.fUd = parame1;
    int i = a(parame, this.gMj, this);
    GMTrace.o(4848749641728L, 36126);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(4848481206272L, 36124);
    w.i("MicroMsg.Music.NetSceneGetQQMusicLyric", "netId %d | errType %d | errCode %d | errMsg %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(4848481206272L, 36124);
      return;
    }
    this.nrt = ((acx)this.gMj.gtD.gtK);
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(4848481206272L, 36124);
  }
  
  public final int getType()
  {
    GMTrace.i(4848615424000L, 36125);
    GMTrace.o(4848615424000L, 36125);
    return 520;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\music\a\d\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */