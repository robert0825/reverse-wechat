package com.tencent.mm.plugin.game.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.game.c.co;
import com.tencent.mm.plugin.game.c.l;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public class aa
{
  public aa()
  {
    GMTrace.i(12597139079168L, 93856);
    GMTrace.o(12597139079168L, 93856);
  }
  
  public static c a(com.tencent.mm.plugin.game.c.c paramc)
  {
    GMTrace.i(12597273296896L, 93857);
    if (paramc == null)
    {
      w.e("MicroMsg.GamePBData", "Invalid pb object");
      GMTrace.o(12597273296896L, 93857);
      return null;
    }
    if (bg.nm(paramc.lPg))
    {
      w.e("MicroMsg.GamePBData", "No AppID field, abort");
      GMTrace.o(12597273296896L, 93857);
      return null;
    }
    w.i("MicroMsg.GamePBData", "Parsing AppID: %s", new Object[] { paramc.lPg });
    c localc = new c();
    localc.field_appId = paramc.lPg;
    localc.field_appName = paramc.lPi;
    localc.field_appIconUrl = paramc.lPh;
    localc.field_appType = ",1,";
    localc.field_packageName = paramc.lPl;
    localc.field_appVersion = paramc.jia;
    localc.field_appInfoFlag = paramc.lPo;
    if (paramc.lPn != null)
    {
      localc.bX(paramc.lPn.lPR);
      localc.ca(paramc.lPn.lPS);
      localc.dg(paramc.lPn.lPV);
      localc.cb(paramc.lPn.lPT);
      localc.lLP = paramc.lPn.lPX;
      localc.lLQ = paramc.lPn.lPW;
      localc.eJD = paramc.lPn.lPY;
    }
    if ((paramc.lPn != null) && (paramc.lPn.lPU != null))
    {
      localc.cg(paramc.lPn.lPU.lPR);
      localc.ch(paramc.lPn.lPU.lTh);
      localc.ce(paramc.lPn.lPU.lTi);
      localc.cf(paramc.lPn.lPU.lTj);
      localc.dh(paramc.lPn.lPU.lTl);
    }
    localc.lLw = paramc.lPj;
    localc.lLv = paramc.lPk;
    localc.status = paramc.jhA;
    localc.lLy = paramc.lPd;
    localc.versionCode = paramc.lPm;
    localc.eBv = paramc.lPf;
    localc.lLA = paramc.lPp;
    localc.lLI = paramc.lPu;
    if ((paramc.lPn != null) && (paramc.lPn.lPU != null))
    {
      localc.lLB = paramc.lPn.lPU.lTk;
      localc.lLC = paramc.lPn.lPU.lTm;
      localc.lLD = paramc.lPn.lPU.lTn;
    }
    localc.lLR = paramc.lPw;
    localc.lLS = paramc.lPx;
    GMTrace.o(12597273296896L, 93857);
    return localc;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\model\aa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */