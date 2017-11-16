package com.tencent.mm.pluginsdk.model.app;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.ad.k.b;
import com.tencent.mm.g.b.n;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.x.a;
import com.tencent.mm.protocal.c.arh;
import com.tencent.mm.protocal.c.we;
import com.tencent.mm.protocal.c.wf;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class ac
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private static final String[] tou;
  final String appId;
  private com.tencent.mm.ad.b fUa;
  private com.tencent.mm.ad.e fUd;
  private final int gUu;
  
  static
  {
    GMTrace.i(795105820672L, 5924);
    tou = new String[] { "wxf109da3e26cf89f1", "wxc56bba830743541e", "wx41dd4f6ef137bd0b" };
    GMTrace.o(795105820672L, 5924);
  }
  
  public ac(String paramString)
  {
    GMTrace.i(794434732032L, 5919);
    this.appId = paramString;
    this.gUu = 3;
    paramString = new b.a();
    paramString.gtF = new we();
    paramString.gtG = new wf();
    paramString.uri = "/cgi-bin/micromsg-bin/getappinfo";
    paramString.gtE = 231;
    paramString.gtH = 0;
    paramString.gtI = 0;
    this.fUa = paramString.DA();
    GMTrace.o(794434732032L, 5919);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(794568949760L, 5920);
    this.fUd = parame1;
    if ((this.appId == null) || (this.appId.length() == 0))
    {
      w.e("MicroMsg.NetSceneGetAppInfo", "doScene fail, appId is null");
      GMTrace.o(794568949760L, 5920);
      return -1;
    }
    parame1 = (we)this.fUa.gtC.gtK;
    parame1.lPg = this.appId;
    parame1.uii = this.gUu;
    int i = a(parame, this.fUa, this);
    GMTrace.o(794568949760L, 5920);
    return i;
  }
  
  protected final int a(q paramq)
  {
    GMTrace.i(794971602944L, 5923);
    int i = k.b.gum;
    GMTrace.o(794971602944L, 5923);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(794703167488L, 5921);
    w.d("MicroMsg.NetSceneGetAppInfo", "errType = " + paramInt2 + ", errCode = " + paramInt3);
    if ((paramInt2 == 4) && (paramInt3 == 64525))
    {
      w.e("MicroMsg.NetSceneGetAppInfo", "errType = " + paramInt2 + ", errCode = " + paramInt3 + ", appinfo does not exist");
      a.aWy();
      paramq = i.bJA();
      paramq.field_appId = this.appId;
      a.aWy().a(paramq);
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(794703167488L, 5921);
      return;
    }
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      w.e("MicroMsg.NetSceneGetAppInfo", "errType = " + paramInt2 + ", errCode = " + paramInt3);
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(794703167488L, 5921);
      return;
    }
    Object localObject1 = (wf)((com.tencent.mm.ad.b)paramq).gtD.gtK;
    paramArrayOfByte = ((wf)localObject1).uoB.tPa;
    Object localObject2 = ((wf)localObject1).uoB;
    if (localObject2 == null)
    {
      w.e("MicroMsg.NetSceneGetAppInfo", "convertToAppInfo : openAppInfo is null");
      paramq = null;
    }
    while (paramq == null)
    {
      w.e("MicroMsg.NetSceneGetAppInfo", "onGYNetEnd : info is null");
      this.fUd.a(3, -1, paramString, this);
      GMTrace.o(794703167488L, 5921);
      return;
      paramq = new f();
      paramq.field_appId = ((arh)localObject2).lPg;
      paramq.field_appName = ((arh)localObject2).lRT;
      paramq.field_appDiscription = ((arh)localObject2).uHt;
      paramq.field_appIconUrl = ((arh)localObject2).tOY;
      paramq.field_appStoreUrl = ((arh)localObject2).lPC;
      paramq.field_appVersion = ((arh)localObject2).tVE;
      paramq.field_appWatermarkUrl = ((arh)localObject2).uHu;
      paramq.field_packageName = ((arh)localObject2).tPa;
      paramq.field_signature = p.OB(((arh)localObject2).tVD);
      paramq.field_appName_en = ((arh)localObject2).uHv;
      paramq.field_appName_tw = ((arh)localObject2).uHx;
      paramq.field_appDiscription_en = ((arh)localObject2).uHw;
      paramq.field_appDiscription_tw = ((arh)localObject2).uHy;
      paramq.field_appInfoFlag = ((arh)localObject2).lPo;
      w.d("MicroMsg.NetSceneGetAppInfo", "appid = %s, appInfoFlag = %s", new Object[] { paramq.field_appId, Integer.valueOf(paramq.field_appInfoFlag) });
    }
    paramq.field_appType = ((wf)localObject1).tRV;
    localObject2 = ((wf)localObject1).uoB;
    localObject1 = ((arh)localObject2).tPa;
    localObject2 = ((arh)localObject2).tVD;
    if ((localObject1 == null) || (((String)localObject1).length() == 0) || (localObject2 == null) || (((String)localObject2).length() == 0)) {}
    for (paramInt1 = 1;; paramInt1 = 0)
    {
      if ((paramInt1 != 0) || (paramq.bJs()))
      {
        w.e("MicroMsg.NetSceneGetAppInfo", "no android app, packageName = " + paramArrayOfByte);
        com.tencent.mm.pluginsdk.ui.tools.b.PD(this.appId);
      }
      if (paramq.field_appId != null) {
        break;
      }
      w.e("MicroMsg.NetSceneGetAppInfo", "onGYNetEnd : info.appId is null");
      this.fUd.a(3, -1, paramString, this);
      GMTrace.o(794703167488L, 5921);
      return;
    }
    if (!paramq.field_appId.equals(this.appId))
    {
      w.e("MicroMsg.NetSceneGetAppInfo", "onGYNetEnd : appId is different");
      this.fUd.a(3, -1, paramString, this);
      GMTrace.o(794703167488L, 5921);
      return;
    }
    paramArrayOfByte = a.aWy();
    localObject1 = paramArrayOfByte.Ox(this.appId);
    if ((localObject1 == null) || (((f)localObject1).field_appId == null) || (((f)localObject1).field_appId.length() == 0))
    {
      if (paramInt1 != 0)
      {
        paramInt1 = 3;
        paramq.field_status = paramInt1;
        paramq.field_modifyTime = System.currentTimeMillis();
        if (paramq.field_appId != null) {
          paramInt1 = 0;
        }
      }
      for (;;)
      {
        if (paramInt1 < tou.length)
        {
          if (paramq.field_appId.equals(tou[paramInt1])) {
            paramq.field_status = -1;
          }
        }
        else
        {
          if (paramArrayOfByte.l(paramq)) {
            break label817;
          }
          w.e("MicroMsg.NetSceneGetAppInfo", "onGYNetEnd : insert fail");
          this.fUd.a(3, -1, paramString, this);
          GMTrace.o(794703167488L, 5921);
          return;
          paramInt1 = 4;
          break;
        }
        paramInt1 += 1;
      }
      label817:
      a.aWw().cA(this.appId, 1);
      a.aWw().cA(this.appId, 2);
      a.aWw().cA(this.appId, 3);
      a.aWw().cA(this.appId, 4);
      a.aWw().cA(this.appId, 5);
    }
    label966:
    label1064:
    label1071:
    label1297:
    label1529:
    for (;;)
    {
      if (bg.nm(paramq.field_openId))
      {
        w.d("MicroMsg.NetSceneGetAppInfo", "onGYNetEnd, openId is null, trigger getAppSetting, appId = " + paramq.field_appId);
        a.aWA().LD(paramq.field_appId);
      }
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(794703167488L, 5921);
      return;
      if (paramInt1 != 0)
      {
        paramInt1 = 3;
        paramq.field_status = paramInt1;
        if (paramq.field_appId != null)
        {
          paramInt1 = 0;
          if (paramInt1 < tou.length)
          {
            if (!paramq.field_appId.equals(tou[paramInt1])) {
              break label1064;
            }
            paramq.field_status = -1;
          }
        }
        if (localObject1 != null) {
          break label1071;
        }
        w.e("MicroMsg.NetSceneGetAppInfo", "merge failed, some appinfo is null");
      }
      for (;;)
      {
        if (paramArrayOfByte.a(paramq, new String[0])) {
          break label1297;
        }
        w.e("MicroMsg.NetSceneGetAppInfo", "onGYNetEnd : update fail");
        this.fUd.a(3, -1, paramString, this);
        GMTrace.o(794703167488L, 5921);
        return;
        paramInt1 = ((f)localObject1).field_status;
        break;
        paramInt1 += 1;
        break label966;
        if (((f)localObject1).bJt())
        {
          if (!bg.nm(((f)localObject1).field_appIconUrl)) {
            paramq.field_appIconUrl = ((f)localObject1).field_appIconUrl;
          }
          if (!bg.nm(((f)localObject1).field_appName)) {
            paramq.field_appName = ((f)localObject1).field_appName;
          }
          if (!bg.nm(((f)localObject1).field_appName_en)) {
            paramq.field_appName_en = ((f)localObject1).field_appName_en;
          }
          if (!bg.nm(((f)localObject1).field_appName_tw)) {
            paramq.field_appName_tw = ((f)localObject1).field_appName_tw;
          }
          if (!bg.nm(((f)localObject1).field_appName_hk)) {
            paramq.field_appName_hk = ((f)localObject1).field_appName_hk;
          }
        }
        if ((bg.nm(paramq.field_appId)) || (bg.nm(((f)localObject1).field_appId)))
        {
          w.e("MicroMsg.NetSceneGetAppInfo", "merge failed, some appid is null");
        }
        else if (!paramq.field_appId.equalsIgnoreCase(((f)localObject1).field_appId))
        {
          w.e("MicroMsg.NetSceneGetAppInfo", "merge failed, appis is different");
        }
        else
        {
          paramq.field_openId = ((f)localObject1).field_openId;
          paramq.field_authFlag = ((f)localObject1).field_authFlag;
          paramq.bV(((n)localObject1).fdJ);
          paramq.bW(((n)localObject1).fdK);
          paramq.bX(((n)localObject1).fdL);
        }
      }
      if ((localObject1 == null) || (((f)localObject1).field_appIconUrl == null) || (((f)localObject1).field_appIconUrl.length() == 0)) {
        paramInt1 = 1;
      }
      for (;;)
      {
        if (paramInt1 == 0) {
          break label1529;
        }
        a.aWw().cA(this.appId, 1);
        a.aWw().cA(this.appId, 2);
        a.aWw().cA(this.appId, 3);
        a.aWw().cA(this.appId, 4);
        a.aWw().cA(this.appId, 5);
        break;
        if (!bg.nm(paramq.fed))
        {
          if (bg.nm(((n)localObject1).fed))
          {
            paramInt1 = 1;
            continue;
          }
          if (!((n)localObject1).fed.equals(((n)localObject1).fed))
          {
            paramInt1 = 1;
            continue;
          }
        }
        if (!bg.nm(paramq.fee))
        {
          if (bg.nm(((n)localObject1).fee))
          {
            paramInt1 = 1;
            continue;
          }
          if (!((n)localObject1).fee.equals(((n)localObject1).fee))
          {
            paramInt1 = 1;
            continue;
          }
        }
        if ((paramq.field_appIconUrl == null) || (paramq.field_appIconUrl.length() == 0)) {
          paramInt1 = 0;
        } else if (!((f)localObject1).field_appIconUrl.equals(paramq.field_appIconUrl)) {
          paramInt1 = 1;
        } else {
          paramInt1 = 0;
        }
      }
    }
  }
  
  public final int getType()
  {
    GMTrace.i(794837385216L, 5922);
    GMTrace.o(794837385216L, 5922);
    return 231;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\model\app\ac.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */