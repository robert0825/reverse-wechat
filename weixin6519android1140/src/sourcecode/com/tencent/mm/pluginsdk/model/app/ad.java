package com.tencent.mm.pluginsdk.model.app;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.x.a;
import com.tencent.mm.protocal.c.gu;
import com.tencent.mm.protocal.c.wc;
import com.tencent.mm.protocal.c.wd;
import com.tencent.mm.sdk.platformtools.bg;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class ad
  extends w
{
  private static final String[] tou;
  
  static
  {
    GMTrace.i(805306368000L, 6000);
    tou = new String[] { "wxf109da3e26cf89f1", "wxc56bba830743541e", "wx41dd4f6ef137bd0b" };
    GMTrace.o(805306368000L, 6000);
  }
  
  public ad(List<String> paramList)
  {
    GMTrace.i(804501061632L, 5994);
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new wc();
    ((b.a)localObject).gtG = new wd();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/getappinfolist";
    ((b.a)localObject).gtE = 451;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.kzP = ((b.a)localObject).DA();
    localObject = (wc)this.kzP.gtC.gtK;
    LinkedList localLinkedList = new LinkedList();
    if (paramList != null)
    {
      String[] arrayOfString = new String[paramList.size()];
      paramList.toArray(arrayOfString);
      int j = arrayOfString.length;
      while (i < j)
      {
        paramList = arrayOfString[i];
        if (!bg.nm(paramList)) {
          localLinkedList.add(com.tencent.mm.platformtools.n.ni(paramList));
        }
        i += 1;
      }
    }
    ((wc)localObject).uoz = localLinkedList;
    ((wc)localObject).jhc = localLinkedList.size();
    GMTrace.o(804501061632L, 5994);
  }
  
  private static void a(f paramf, gu paramgu)
  {
    int k = 0;
    GMTrace.i(804903714816L, 5997);
    if (paramf == null)
    {
      paramf = new f();
      paramf.field_appId = paramgu.lQa;
    }
    for (int i = 1;; i = 0)
    {
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.NetSceneGetAppInfoList", "appid:[%s], appinfoflag:[%d] AppSupportContentType:%d", new Object[] { paramgu.lQa, Integer.valueOf(paramgu.lPo), Long.valueOf(paramgu.tVJ) });
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.NetSceneGetAppInfoList", "appId=%s, appName=%s, status=%s, appInfoFlag=%s", new Object[] { paramf.field_appId, paramf.field_appName, Integer.valueOf(paramf.field_status), Integer.valueOf(paramf.field_appInfoFlag) });
      if ((!paramf.bJt()) || (bg.nm(paramf.field_appName))) {
        paramf.field_appName = paramgu.lPi;
      }
      if ((!paramf.bJt()) || (bg.nm(paramf.field_appName_en))) {
        paramf.field_appName_en = paramgu.tVv;
      }
      if ((!paramf.bJt()) || (bg.nm(paramf.field_appName_tw))) {
        paramf.field_appName_tw = paramgu.tVx;
      }
      paramf.field_appDiscription = paramgu.tRP;
      paramf.field_appDiscription_en = paramgu.tVw;
      paramf.field_appDiscription_tw = paramgu.tVy;
      paramf.field_appWatermarkUrl = paramgu.tVC;
      paramf.field_packageName = paramgu.tPa;
      paramf.field_signature = p.OB(paramgu.tVD);
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.NetSceneGetAppInfoList", "get signature, server sig : %s, gen sig: %s ", new Object[] { paramgu.tVD, paramf.field_signature });
      paramf.field_appType = paramgu.tRV;
      if ((!bg.nm(paramf.field_appType)) && ((paramf.field_appType.startsWith("1")) || (paramf.field_appType.startsWith("6")))) {
        paramf.field_appType = ("," + paramf.field_appType);
      }
      paramf.field_appInfoFlag = paramgu.lPo;
      paramf.field_appVersion = paramgu.tVE;
      paramf.bW(paramgu.tRX);
      paramf.field_appWatermarkUrl = paramgu.tVC;
      if ((!bg.nm(paramgu.tVH)) && (!bg.nm(paramgu.tVI)))
      {
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.NetSceneGetAppInfoList", "get app download url and download md5 : [%s], [%s], [%s]", new Object[] { paramf.field_appName, paramgu.tVH, paramgu.tVI });
        paramf.bX(paramgu.tVH);
        paramf.ca(paramgu.tVI);
      }
      paramf.cb(paramgu.tPb);
      paramf.field_svrAppSupportContentType = paramgu.tVJ;
      if (paramgu.tVF > paramf.fdM)
      {
        paramf.fdN = 1;
        paramf.fdh = true;
      }
      paramf.fdM = paramgu.tVF;
      paramf.fdh = true;
      Object localObject = paramgu.tPa;
      String str = paramgu.tPa;
      int j;
      if ((localObject == null) || (((String)localObject).length() == 0) || (str == null) || (str.length() == 0))
      {
        j = 1;
        if (j != 0) {
          com.tencent.mm.sdk.platformtools.w.e("MicroMsg.NetSceneGetAppInfoList", "no android app, packageName = " + paramgu.tPa + "appid: " + paramf.field_appId);
        }
        if (paramf.bJs()) {
          com.tencent.mm.pluginsdk.ui.tools.b.PD(paramf.field_appId);
        }
        localObject = a.aWy();
        if (i == 0) {
          break label765;
        }
        if (j == 0) {
          break label688;
        }
        i = 3;
        label598:
        paramf.field_status = i;
        paramf.field_modifyTime = System.currentTimeMillis();
        paramf.field_appIconUrl = paramgu.tVA;
        if (paramf.field_appId != null) {
          i = k;
        }
      }
      for (;;)
      {
        if (i < tou.length)
        {
          if (paramf.field_appId.equals(tou[i])) {
            paramf.field_status = -1;
          }
        }
        else
        {
          if (((i)localObject).l(paramf)) {
            break label700;
          }
          com.tencent.mm.sdk.platformtools.w.e("MicroMsg.NetSceneGetAppInfoList", "onGYNetEnd : insert fail");
          GMTrace.o(804903714816L, 5997);
          return;
          j = 0;
          break;
          label688:
          i = 4;
          break label598;
        }
        i += 1;
      }
      label700:
      a.aWw().cA(paramf.field_appId, 1);
      a.aWw().cA(paramf.field_appId, 2);
      a.aWw().cA(paramf.field_appId, 3);
      a.aWw().cA(paramf.field_appId, 4);
      a.aWw().cA(paramf.field_appId, 5);
      GMTrace.o(804903714816L, 5997);
      return;
      label765:
      if (j != 0)
      {
        i = 3;
        paramf.field_status = i;
        if (paramf.field_appId != null)
        {
          i = 0;
          label785:
          if (i < tou.length)
          {
            if (!paramf.field_appId.equals(tou[i])) {
              break label995;
            }
            paramf.field_status = -1;
          }
        }
        if ((paramf != null) && (paramf.field_appIconUrl != null) && (paramf.field_appIconUrl.length() != 0)) {
          break label1002;
        }
        i = 1;
      }
      for (;;)
      {
        if (i != 0)
        {
          com.tencent.mm.sdk.platformtools.w.i("MicroMsg.NetSceneGetAppInfoList", "oldIcon = %s, newIcon = %s", new Object[] { paramf.field_appIconUrl, paramgu.tVA });
          paramf.field_appIconUrl = paramgu.tVA;
          a.aWw().cA(paramf.field_appId, 1);
          a.aWw().cA(paramf.field_appId, 2);
          a.aWw().cA(paramf.field_appId, 3);
          a.aWw().cA(paramf.field_appId, 4);
          a.aWw().cA(paramf.field_appId, 5);
        }
        boolean bool = ((i)localObject).a(paramf, new String[0]);
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.NetSceneGetAppInfoList", "update appinfo " + bool + ", appid = " + paramgu.lQa);
        GMTrace.o(804903714816L, 5997);
        return;
        i = paramf.field_status;
        break;
        label995:
        i += 1;
        break label785;
        label1002:
        if ((paramgu == null) || (paramgu.tVG == null) || (paramgu.tVG.length() == 0)) {
          i = 0;
        } else if (!paramf.field_appIconUrl.equals(paramgu.tVA)) {
          i = 1;
        } else {
          i = 0;
        }
      }
    }
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(804769497088L, 5996);
    com.tencent.mm.sdk.platformtools.w.d("MicroMsg.NetSceneGetAppInfoList", "errType = " + paramInt2 + ", errCode = " + paramInt3);
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.NetSceneGetAppInfoList", "errType = " + paramInt2 + ", errCode = " + paramInt3);
      GMTrace.o(804769497088L, 5996);
      return;
    }
    paramString = ((wd)this.kzP.gtD.gtK).uoA;
    if ((paramString != null) && (!paramString.isEmpty()))
    {
      paramString = paramString.iterator();
      while (paramString.hasNext())
      {
        paramq = (gu)paramString.next();
        if (paramq != null) {
          a(g.aP(paramq.lQa, false), paramq);
        }
      }
    }
    GMTrace.o(804769497088L, 5996);
  }
  
  public final byte[] aFZ()
  {
    GMTrace.i(805037932544L, 5998);
    try
    {
      byte[] arrayOfByte = ((b.b)this.kzP.DC()).Ba();
      GMTrace.o(805037932544L, 5998);
      return arrayOfByte;
    }
    catch (Exception localException)
    {
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.NetSceneGetAppInfoList", "toProtBuf failed: " + localException.getMessage());
      GMTrace.o(805037932544L, 5998);
    }
    return null;
  }
  
  public final void au(byte[] paramArrayOfByte)
  {
    GMTrace.i(805172150272L, 5999);
    if (paramArrayOfByte == null)
    {
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.NetSceneGetAppInfoList", "buf is null");
      GMTrace.o(805172150272L, 5999);
      return;
    }
    try
    {
      this.kzP.gtD.y(paramArrayOfByte);
      GMTrace.o(805172150272L, 5999);
      return;
    }
    catch (Exception paramArrayOfByte)
    {
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.NetSceneGetAppInfoList", "parse error: " + paramArrayOfByte.getMessage());
      com.tencent.mm.sdk.platformtools.w.printErrStackTrace("MicroMsg.NetSceneGetAppInfoList", paramArrayOfByte, "", new Object[0]);
      GMTrace.o(805172150272L, 5999);
    }
  }
  
  public final int getType()
  {
    GMTrace.i(804635279360L, 5995);
    GMTrace.o(804635279360L, 5995);
    return 7;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\model\app\ad.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */