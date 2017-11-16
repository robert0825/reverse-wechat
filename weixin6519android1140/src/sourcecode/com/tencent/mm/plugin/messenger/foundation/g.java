package com.tencent.mm.plugin.messenger.foundation;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.af;
import com.tencent.mm.kernel.e;
import com.tencent.mm.platformtools.n;
import com.tencent.mm.plugin.messenger.foundation.a.p;
import com.tencent.mm.plugin.messenger.foundation.a.r;
import com.tencent.mm.plugin.messenger.foundation.a.s;
import com.tencent.mm.protocal.c.apk;
import com.tencent.mm.protocal.c.nk;
import com.tencent.mm.protocal.c.py;
import com.tencent.mm.protocal.c.pz;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.RegionCodeDecoder;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.x;
import com.tencent.mm.y.as;
import com.tencent.mm.y.bk;

public final class g
  implements p
{
  public g()
  {
    GMTrace.i(13236686553088L, 98621);
    GMTrace.o(13236686553088L, 98621);
  }
  
  public final void a(nk paramnk, byte[] paramArrayOfByte, boolean paramBoolean, r paramr)
  {
    GMTrace.i(13236820770816L, 98622);
    switch (paramnk.uei)
    {
    default: 
      GMTrace.o(13236820770816L, 98622);
      return;
    }
    paramr = (apk)new apk().aD(paramArrayOfByte);
    int i = paramr.uFa;
    com.tencent.mm.kernel.h.xy().xh().get(2, null);
    t localt = com.tencent.mm.kernel.h.xy().xh();
    w.i("MicroMsg.UserInfoSyncExtension", "processModUserInfo bitFlag:%d status:%d PluginFlag:%d PluginSwitch:%d", new Object[] { Integer.valueOf(paramr.uFa), Integer.valueOf(paramr.jhA), Integer.valueOf(paramr.tOv), Integer.valueOf(paramr.uFh) });
    paramArrayOfByte = n.a(paramr.ufy);
    Object localObject = n.a(paramr.uxT);
    String str1 = n.a(paramr.uFb);
    String str2 = n.a(paramr.uFc);
    i = paramr.tOs;
    paramnk = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yK().TE(paramArrayOfByte);
    if ((paramnk == null) || (paramnk.field_username == null) || (!paramnk.field_username.equals(paramArrayOfByte))) {
      paramnk = new x(paramArrayOfByte);
    }
    for (;;)
    {
      paramnk.ci(paramr.gCC);
      paramnk.cl((String)localObject);
      paramnk.cE(RegionCodeDecoder.ai(paramr.gCG, paramr.gCy, paramr.gCz));
      paramnk.jdMethod_do(paramr.gCx);
      paramnk.cy(paramr.gCA);
      paramnk.dj(paramr.uAz);
      paramnk.cC(paramr.uAx);
      paramnk.co(paramr.uAy);
      paramnk.dp(i);
      ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yK().Q(paramnk);
      localt.set(2, paramArrayOfByte);
      localt.set(4, localObject);
      localt.set(5, str1);
      localt.set(6, str2);
      localt.set(9, Integer.valueOf(i));
      localObject = new StringBuilder("doCmd : status ");
      i = paramr.jhA;
      paramArrayOfByte = "code=" + Integer.toHexString(i) + ", status = " + i;
      paramnk = paramArrayOfByte;
      if ((i & 0x1) != 0) {
        paramnk = paramArrayOfByte + ", open";
      }
      paramArrayOfByte = paramnk;
      if ((i & 0x2) != 0) {
        paramArrayOfByte = paramnk + ", email-verified";
      }
      paramnk = paramArrayOfByte;
      if ((i & 0x4) != 0) {
        paramnk = paramArrayOfByte + ", mobile-verified";
      }
      paramArrayOfByte = paramnk;
      if ((i & 0x8) != 0) {
        paramArrayOfByte = paramnk + ", hide-qq-search";
      }
      paramnk = paramArrayOfByte;
      if ((i & 0x10) != 0) {
        paramnk = paramArrayOfByte + ", hide-qq-promote";
      }
      paramArrayOfByte = paramnk;
      if ((i & 0x20) != 0) {
        paramArrayOfByte = paramnk + ", need-verify";
      }
      paramnk = paramArrayOfByte;
      if ((i & 0x40) != 0) {
        paramnk = paramArrayOfByte + ", has-qq-msg";
      }
      paramArrayOfByte = paramnk;
      if ((i & 0x80) != 0) {
        paramArrayOfByte = paramnk + ", no-qq-promote";
      }
      paramnk = paramArrayOfByte;
      if ((i & 0x100) != 0) {
        paramnk = paramArrayOfByte + ", no-mobile-promote";
      }
      paramArrayOfByte = paramnk;
      if ((i & 0x200) != 0) {
        paramArrayOfByte = paramnk + ", hide-mobile_search";
      }
      paramnk = paramArrayOfByte;
      if ((i & 0x1000) != 0) {
        paramnk = paramArrayOfByte + ", open-float-bottle";
      }
      paramArrayOfByte = paramnk;
      if ((i & 0x20000) != 0) {
        paramArrayOfByte = paramnk + ", bind but not upload";
      }
      w.d("MicroMsg.UserInfoSyncExtension", paramArrayOfByte);
      localt.set(7, Integer.valueOf(paramr.jhA));
      if (paramr.gCB != 0)
      {
        paramnk = new bk();
        paramnk.fjj = 1;
        paramnk.fja = paramr.gCx;
        paramnk.signature = paramr.gCA;
        paramnk.countryCode = paramr.gCG;
        paramnk.goV = paramr.gCy;
        paramnk.goU = paramr.gCz;
        paramnk.fjo = paramr.uAx;
        w.d("MicroMsg.UserInfoSyncExtension", " getPersonalCard weibo url : " + paramnk.fjo + " nickName :" + paramr.uAy);
        bk.a(paramnk);
      }
      paramArrayOfByte = new StringBuilder("userinfo Plugstate: ");
      i = paramr.tOv;
      paramnk = "code=" + Integer.toHexString(i) + ", pluginFlag = " + i;
      if ((i & 0x1) != 0)
      {
        paramnk = paramnk + ", QQMAIL_UNINSTALL";
        label1027:
        if ((i & 0x2) == 0) {
          break label1956;
        }
        paramnk = paramnk + ", PM_UNINSTALL";
        label1055:
        if ((i & 0x4) == 0) {
          break label1980;
        }
        paramnk = paramnk + ", FM_UNINSTALL";
        label1083:
        if ((i & 0x8) == 0) {
          break label2004;
        }
        paramnk = paramnk + ", WEIBO_UNINSTALL";
        label1112:
        if ((i & 0x10) == 0) {
          break label2028;
        }
        paramnk = paramnk + ", MEDIANOTE_UNINSTALL";
        label1141:
        if ((i & 0x20) == 0) {
          break label2052;
        }
        paramnk = paramnk + ", QMSG_UNINSTALL";
        label1170:
        if ((i & 0x40) == 0) {
          break label2076;
        }
        paramnk = paramnk + ", BOTTLE_UNINSTALL";
        label1199:
        if ((i & 0x80) == 0) {
          break label2100;
        }
        paramnk = paramnk + ", QSYNC_UNISTALL";
        label1229:
        if ((i & 0x100) == 0) {
          break label2124;
        }
        paramnk = paramnk + ", SHAKE_UNISTALL";
        label1259:
        if ((i & 0x200) == 0) {
          break label2148;
        }
        paramnk = paramnk + ", LBS_UNISTALL";
        label1289:
        if ((i & 0x400) == 0) {
          break label2172;
        }
        paramnk = paramnk + ", BOTTLE_CHART_INSTALL";
        label1319:
        if ((i & 0x1000) == 0) {
          break label2196;
        }
        paramnk = paramnk + ",CHECKQQF_UNINSTALL";
        label1349:
        if ((i & 0x8000) == 0) {
          break label2220;
        }
        paramnk = paramnk + ",MM_FEEDSAPP_UNINSTALL";
        label1379:
        w.i("MicroMsg.UserInfoSyncExtension", paramnk);
        localt.set(34, Integer.valueOf(paramr.tOv));
        if (1 != paramr.uEK.ufU) {
          break label2244;
        }
      }
      label1956:
      label1980:
      label2004:
      label2028:
      label2052:
      label2076:
      label2100:
      label2124:
      label2148:
      label2172:
      label2196:
      label2220:
      label2244:
      for (paramBoolean = true;; paramBoolean = false)
      {
        localt.set(8200, Boolean.valueOf(bg.a(Boolean.valueOf(paramBoolean), false)));
        localt.set(8201, Integer.valueOf(bg.a(Integer.valueOf(paramr.uEK.ufV.ufY), 22)));
        localt.set(8208, Integer.valueOf(bg.a(Integer.valueOf(paramr.uEK.ufV.ufZ), 8)));
        localt.set(66049, Integer.valueOf(paramr.uAv));
        localt.set(66050, paramr.uAw);
        localt.set(40, Integer.valueOf(paramr.uFh));
        as.gnb.M("last_login_use_voice", paramr.uFh);
        localt.set(41, Integer.valueOf(paramr.uAz));
        localt.set(43, paramr.uAy);
        w.d("MicroMsg.UserInfoSyncExtension", "doCmd PluginSwitch:" + paramr.uFh + " WeiboFlag:" + paramr.uAz);
        localt.set(868518889, Integer.valueOf(paramr.uEW));
        w.d("MicroMsg.UserInfoSyncExtension", "doCmd USERINFO_TXNEWSCATEGORY:" + paramr.uEW);
        localt.set(42, paramr.gCC);
        w.d("MicroMsg.UserInfoSyncExtension", "userid:" + paramr.uiO + " username:" + paramr.uiP);
        localt.set(65825, paramr.uiO);
        localt.set(65826, paramr.uiP);
        w.d("MicroMsg.UserInfoSyncExtension", "getiAlbumFlag " + paramr.gCD);
        w.d("MicroMsg.UserInfoSyncExtension", "getiAlbumStyle " + paramr.gCE);
        w.d("MicroMsg.UserInfoSyncExtension", "getPcAlbumBGImgID " + paramr.gCF);
        paramnk = bg.nl((String)com.tencent.mm.kernel.h.xy().xh().get(65830, null));
        if ((paramnk == null) || (paramnk.length() == 0))
        {
          paramnk = paramr.uFk;
          if ((paramnk != null) && (paramnk.length() > 0)) {
            com.tencent.mm.kernel.h.xy().xh().set(65830, paramnk);
          }
        }
        s.a(1, paramr);
        break;
        paramnk = paramnk + ", QQMAIL_INSTALL";
        break label1027;
        paramnk = paramnk + ", PM_INSTALL";
        break label1055;
        paramnk = paramnk + ", FM_INSTALL";
        break label1083;
        paramnk = paramnk + ", WEIBO_INSTALL";
        break label1112;
        paramnk = paramnk + ", MEDIANOTE_INSTALL";
        break label1141;
        paramnk = paramnk + ", QMSG_INSTALL";
        break label1170;
        paramnk = paramnk + ", BOTTLE_INSTALL";
        break label1199;
        paramnk = paramnk + ", QSYNC_INSTALL";
        break label1229;
        paramnk = paramnk + ", SHAKE_INSTALL";
        break label1259;
        paramnk = paramnk + ", LBS_INSTALL";
        break label1289;
        paramnk = paramnk + ", BOTTLE_CHART_INSTALL";
        break label1319;
        paramnk = paramnk + ",CHECKQQF_INSTALL";
        break label1349;
        paramnk = paramnk + ",MM_FEEDSAPP_INSTALL";
        break label1379;
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\messenger\foundation\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */