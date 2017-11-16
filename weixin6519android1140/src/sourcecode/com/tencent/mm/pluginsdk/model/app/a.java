package com.tencent.mm.pluginsdk.model.app;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.k.e;
import com.tencent.mm.k.g;
import com.tencent.mm.pluginsdk.p.u;
import com.tencent.mm.pluginsdk.p.x;
import com.tencent.mm.protocal.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.f;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.au;
import com.tencent.mm.storage.t;
import com.tencent.mm.y.at;
import com.tencent.mm.y.bc;
import com.tencent.mm.y.c;
import java.util.Map;

public final class a
{
  public String desc;
  public String eDW;
  public int eLi;
  public long gXo;
  public int size;
  public long tnC;
  public String url;
  
  public a(String paramString)
  {
    GMTrace.i(787455410176L, 5867);
    Map localMap = bh.q(paramString, "msg");
    this.desc = ((String)localMap.get(".msg.appmsg.des"));
    this.eLi = bg.getInt((String)localMap.get(".msg.alphainfo.clientVersion"), 0);
    this.url = ((String)localMap.get(".msg.alphainfo.url"));
    this.size = bg.getInt((String)localMap.get(".msg.alphainfo.size"), 0);
    this.eDW = ((String)localMap.get(".msg.alphainfo.md5"));
    this.tnC = bg.getLong((String)localMap.get(".msg.alphainfo.maxAge"), 0L);
    this.gXo = bg.getLong((String)localMap.get(".msg.alphainfo.expireTime"), 0L);
    w.i("MicroMsg.AlphaUpdateInfo", "updateInfo, content:%s, clientVersion:%d, url:%s, size:%d, md5:%s, desc:%s, maxAge:%d, expireTime:%d", new Object[] { paramString, Integer.valueOf(this.eLi), this.url, Integer.valueOf(this.size), this.eDW, this.desc, Long.valueOf(this.tnC), Long.valueOf(this.gXo) });
    GMTrace.o(787455410176L, 5867);
  }
  
  private boolean bBM()
  {
    GMTrace.i(787723845632L, 5869);
    at.AR();
    long l = ((Long)c.xh().get(352274, Long.valueOf(System.currentTimeMillis()))).longValue();
    if ((System.currentTimeMillis() - l > this.tnC) || (System.currentTimeMillis() > this.gXo)) {}
    for (boolean bool = true;; bool = false)
    {
      w.i("MicroMsg.AlphaUpdateInfo", "isExpired: %b", new Object[] { Boolean.valueOf(bool) });
      GMTrace.o(787723845632L, 5869);
      return bool;
    }
  }
  
  public static a bJo()
  {
    GMTrace.i(787321192448L, 5866);
    at.AR();
    Object localObject = (String)c.xh().get(352273, "");
    if (!bg.nm((String)localObject))
    {
      localObject = new a((String)localObject);
      if ((!((a)localObject).isValid()) || (((a)localObject).bBM()))
      {
        bJp();
        GMTrace.o(787321192448L, 5866);
        return null;
      }
    }
    else
    {
      GMTrace.o(787321192448L, 5866);
      return null;
    }
    GMTrace.o(787321192448L, 5866);
    return (a)localObject;
  }
  
  public static void bJp()
  {
    GMTrace.i(787858063360L, 5870);
    at.AR();
    c.xh().set(352273, null);
    at.AR();
    c.xh().set(352274, null);
    GMTrace.o(787858063360L, 5870);
  }
  
  private boolean isValid()
  {
    GMTrace.i(787589627904L, 5868);
    if ((this.eLi > d.tJC) && (!bg.nm(this.url)) && (!bg.nm(this.eDW)) && (!bg.nm(this.desc))) {}
    for (boolean bool = true;; bool = false)
    {
      w.i("MicroMsg.AlphaUpdateInfo", "isValid %b", new Object[] { Boolean.valueOf(bool) });
      GMTrace.o(787589627904L, 5868);
      return bool;
    }
  }
  
  public final void bJq()
  {
    GMTrace.i(787992281088L, 5871);
    au localau = new au();
    localau.E(bc.k("weixin", bg.Pu()));
    localau.setType(1);
    localau.setContent(this.desc);
    w.d("MicroMsg.AlphaUpdateInfo", localau.field_content);
    localau.dC(0);
    localau.db("weixin");
    localau.dB(3);
    bc.i(localau);
    w.i("MicroMsg.AlphaUpdateInfo", "insertUpdateTextMsg");
    bJp();
    GMTrace.o(787992281088L, 5871);
  }
  
  public final void bJr()
  {
    GMTrace.i(788126498816L, 5872);
    w.i("MicroMsg.AlphaUpdateInfo", "downloadInSilence.");
    if ((!isValid()) || (bBM()))
    {
      GMTrace.o(788126498816L, 5872);
      return;
    }
    int i;
    if (bg.Sy(g.ut().getValue("SilentDownloadApkAtWiFi")) != 0) {
      i = 0;
    }
    while (i == 0)
    {
      bJq();
      GMTrace.o(788126498816L, 5872);
      return;
      at.AR();
      if ((((Integer)c.xh().get(7, Integer.valueOf(0))).intValue() & 0x1000000) == 0)
      {
        i = 1;
        label105:
        if ((!am.isWifi(ab.getContext())) || (i == 0)) {
          break label146;
        }
      }
      label146:
      for (i = 1;; i = 0)
      {
        if ((f.eqX & 0x1) == 0) {
          break label151;
        }
        w.d("MicroMsg.AlphaUpdateInfo", "channel pack, not silence download.");
        i = 0;
        break;
        i = 0;
        break label105;
      }
      label151:
      w.d("MicroMsg.AlphaUpdateInfo", "not channel pack.");
    }
    w.i("MicroMsg.AlphaUpdateInfo", "go to download, %s, %d, %s, %s", new Object[] { this.eDW, Integer.valueOf(this.size), this.desc, this.url });
    p.x.bIV().d(this.eDW, this.size, this.desc.replaceFirst("(\n)*<a.*</a>(\n)*", "\n"), this.url);
    GMTrace.o(788126498816L, 5872);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\model\app\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */