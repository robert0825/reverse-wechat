package com.tencent.mm.pluginsdk.model.app;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.x.a.a;
import com.tencent.mm.plugin.x.a.a.a;
import com.tencent.mm.protocal.c.adx;
import com.tencent.mm.protocal.c.ady;
import com.tencent.mm.protocal.c.aw;
import com.tencent.mm.protocal.c.axa;
import com.tencent.mm.protocal.c.azq;
import com.tencent.mm.protocal.c.bvm;
import com.tencent.mm.sdk.platformtools.bg;
import java.util.Iterator;
import java.util.LinkedList;

public final class ag
  extends w
{
  private int lLR;
  LinkedList<f> tow;
  private LinkedList<f> tox;
  private LinkedList<String> toy;
  
  public ag(String paramString, LinkedList<String> paramLinkedList)
  {
    GMTrace.i(809198682112L, 6029);
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.NetSceneGetSuggestionAppList", "offset: 0" + ", limit = 20, lang = " + paramString + "installedApp list size: " + paramLinkedList.size());
    Object localObject = paramLinkedList.iterator();
    while (((Iterator)localObject).hasNext()) {
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.NetSceneGetSuggestionAppList", "install id:[%s]", new Object[] { (String)((Iterator)localObject).next() });
    }
    this.lLR = 3;
    localObject = new b.a();
    ((b.a)localObject).gtF = new adx();
    ((b.a)localObject).gtG = new ady();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/getsuggestionapplist";
    ((b.a)localObject).gtE = 409;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.kzP = ((b.a)localObject).DA();
    localObject = (adx)this.kzP.gtC.gtK;
    ((adx)localObject).lPw = 3;
    ((adx)localObject).lRx = 0;
    ((adx)localObject).lRy = 20;
    ((adx)localObject).lQJ = paramString;
    paramString = au(paramLinkedList);
    ((adx)localObject).utK = paramString.size();
    ((adx)localObject).lRf = paramString;
    this.tow = new LinkedList();
    this.tox = new LinkedList();
    this.toy = new LinkedList();
    this.toy.addAll(paramLinkedList);
    GMTrace.o(809198682112L, 6029);
  }
  
  private static void a(f paramf, aw paramaw)
  {
    GMTrace.i(810138206208L, 6036);
    paramf.bX(paramaw.tOX);
    paramf.ca(paramaw.lPS);
    paramf.bY(paramaw.tOZ);
    paramf.field_appName = paramaw.lRT;
    paramf.field_appIconUrl = paramaw.tOY;
    paramf.cb(paramaw.tPb);
    paramf.feb = paramaw.tPd;
    paramf.fdh = true;
    a(paramf, paramaw.tPc);
    GMTrace.o(810138206208L, 6036);
  }
  
  private static void a(f paramf, axa paramaxa)
  {
    GMTrace.i(809869770752L, 6034);
    paramf.bX(paramaxa.tOX);
    paramf.field_appIconUrl = paramaxa.tOY;
    paramf.bW(paramaxa.uLK);
    paramf.field_appName = paramaxa.lRT;
    paramf.bY(paramaxa.tOZ);
    paramf.field_appType = paramaxa.tRV;
    paramf.ca(paramaxa.lPS);
    paramf.field_packageName = paramaxa.tPa;
    paramf.cb(paramaxa.tPb);
    if (!bg.nm(paramaxa.tPb))
    {
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.NetSceneGetSuggestionAppList", "google play download url is : %s, download flag is %d", new Object[] { paramaxa.tPb, Integer.valueOf(paramaxa.uLU) });
      paramf.dg(paramaxa.uLU);
    }
    paramf.cc(paramaxa.uLR);
    paramf.cd(paramaxa.uLS);
    a(paramf, paramaxa.tPc);
    if ((!bg.nm(paramf.field_appType)) && ((paramf.field_appType.startsWith("1")) || (paramf.field_appType.startsWith("6"))))
    {
      if (!paramf.field_appType.endsWith(",")) {
        paramf.field_appType += ",";
      }
      paramf.field_appType = ("," + paramf.field_appType);
    }
    GMTrace.o(809869770752L, 6034);
  }
  
  private static void a(f paramf, bvm parambvm)
  {
    GMTrace.i(810003988480L, 6035);
    com.tencent.mm.sdk.platformtools.w.v("MicroMsg.NetSceneGetSuggestionAppList", "dealYYBDownloadInfos, appId = %s", new Object[] { paramf.field_appId });
    if (parambvm != null)
    {
      paramf.dg(parambvm.vdK);
      paramf.cg(parambvm.tVH);
      paramf.ch(parambvm.lTh);
      paramf.ce(parambvm.vdL);
      paramf.cf(parambvm.lTj);
      paramf.fdZ = parambvm.lTk;
      paramf.fdh = true;
      paramf.dh(parambvm.lTl);
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.NetSceneGetSuggestionAppList", "get yyb download infos:[%d],[%s],[%s],[%s],[%s],[%s],[%d]", new Object[] { Integer.valueOf(parambvm.vdK), parambvm.tVH, parambvm.lTh, parambvm.vdL, parambvm.lTj, parambvm.lTk, Integer.valueOf(parambvm.lTl) });
    }
    GMTrace.o(810003988480L, 6035);
  }
  
  private void a(i parami, LinkedList<aw> paramLinkedList)
  {
    GMTrace.i(809467117568L, 6031);
    if ((paramLinkedList != null) && (paramLinkedList.size() > 0))
    {
      Iterator localIterator = paramLinkedList.iterator();
      if (localIterator.hasNext())
      {
        aw localaw = (aw)localIterator.next();
        paramLinkedList = g.aP(localaw.lPg, true);
        if (paramLinkedList != null)
        {
          a(paramLinkedList, localaw);
          parami.a(paramLinkedList, new String[0]);
        }
        for (;;)
        {
          this.tox.add(paramLinkedList);
          break;
          paramLinkedList = new f();
          paramLinkedList.field_appId = localaw.lPg;
          a(paramLinkedList, localaw);
          parami.l(paramLinkedList);
        }
      }
    }
    GMTrace.o(809467117568L, 6031);
  }
  
  private static LinkedList<azq> au(LinkedList<String> paramLinkedList)
  {
    GMTrace.i(809735553024L, 6033);
    LinkedList localLinkedList = new LinkedList();
    if (paramLinkedList == null)
    {
      GMTrace.o(809735553024L, 6033);
      return localLinkedList;
    }
    paramLinkedList = paramLinkedList.iterator();
    while (paramLinkedList.hasNext())
    {
      String str = (String)paramLinkedList.next();
      if (!bg.nm(str)) {
        localLinkedList.add(com.tencent.mm.platformtools.n.ni(str));
      }
    }
    GMTrace.o(809735553024L, 6033);
    return localLinkedList;
  }
  
  private void b(i parami, LinkedList<axa> paramLinkedList)
  {
    GMTrace.i(809601335296L, 6032);
    if ((paramLinkedList != null) && (paramLinkedList.size() > 0))
    {
      Iterator localIterator = paramLinkedList.iterator();
      while (localIterator.hasNext())
      {
        axa localaxa = (axa)localIterator.next();
        if (bg.nm(localaxa.lPg))
        {
          com.tencent.mm.sdk.platformtools.w.e("MicroMsg.NetSceneGetSuggestionAppList", "error appinfo, the appid is null");
        }
        else
        {
          boolean bool1 = true;
          boolean bool3 = false;
          paramLinkedList = g.aP(localaxa.lPg, true);
          if (paramLinkedList != null)
          {
            a(paramLinkedList, localaxa);
            if (this.lLR == 3)
            {
              paramLinkedList.field_status = 5;
              if ((bg.nm(paramLinkedList.fdT)) || (bg.nm(paramLinkedList.fdS))) {
                if (paramLinkedList.fdT != null)
                {
                  bool1 = true;
                  label137:
                  if (paramLinkedList.fdS == null) {
                    break label261;
                  }
                  bool2 = true;
                  label147:
                  com.tencent.mm.sdk.platformtools.w.e("MicroMsg.NetSceneGetSuggestionAppList", "wrong suggestion params1, has IntroUrl %s, has IconUrl %s", new Object[] { Boolean.valueOf(bool1), Boolean.valueOf(bool2) });
                  bool1 = false;
                  bool2 = false;
                }
              }
            }
            for (;;)
            {
              com.tencent.mm.sdk.platformtools.w.i("MicroMsg.NetSceneGetSuggestionAppList", "update appinfo: AppID = %s, ret = %s, needAddToList = %s", new Object[] { localaxa.lPg, Boolean.valueOf(bool2), Boolean.valueOf(bool1) });
              label214:
              if ((!bool1) || (this.toy.contains(localaxa.lPg)) || (this.tow.contains(paramLinkedList))) {
                break label427;
              }
              this.tow.add(paramLinkedList);
              break;
              bool1 = false;
              break label137;
              label261:
              bool2 = false;
              break label147;
              bool2 = parami.a(paramLinkedList, new String[0]);
              bool1 = true;
            }
          }
          paramLinkedList = new f();
          paramLinkedList.field_appId = localaxa.lPg;
          a(paramLinkedList, localaxa);
          if (this.lLR == 3)
          {
            paramLinkedList.field_status = 5;
            if ((bg.nm(paramLinkedList.fdT)) || (bg.nm(paramLinkedList.fdS))) {
              if (paramLinkedList.fdT != null)
              {
                bool1 = true;
                label348:
                if (paramLinkedList.fdS == null) {
                  break label434;
                }
                bool2 = true;
                label358:
                com.tencent.mm.sdk.platformtools.w.e("MicroMsg.NetSceneGetSuggestionAppList", "wrong suggestion params2, has IntroUrl %s, has IconUrl %s", new Object[] { Boolean.valueOf(bool1), Boolean.valueOf(bool2) });
                bool1 = false;
              }
            }
          }
          for (boolean bool2 = bool3;; bool2 = parami.l(paramLinkedList))
          {
            com.tencent.mm.sdk.platformtools.w.i("MicroMsg.NetSceneGetSuggestionAppList", "insert appinfo: AppID = %s, ret = %s, needAddToList = %s", new Object[] { localaxa.lPg, Boolean.valueOf(bool2), Boolean.valueOf(bool1) });
            break label214;
            label427:
            break;
            bool1 = false;
            break label348;
            label434:
            bool2 = false;
            break label358;
          }
        }
      }
    }
    GMTrace.o(809601335296L, 6032);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(809332899840L, 6030);
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.NetSceneGetSuggestionAppList", "errType = " + paramInt2 + ", errCode = " + paramInt3);
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.NetSceneGetSuggestionAppList", "errType = " + paramInt2 + ", errCode = " + paramInt3);
      GMTrace.o(809332899840L, 6030);
      return;
    }
    paramString = (ady)this.kzP.gtD.gtK;
    if (paramString == null)
    {
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.NetSceneGetSuggestionAppList", "resp == null");
      GMTrace.o(809332899840L, 6030);
      return;
    }
    com.tencent.mm.sdk.platformtools.w.v("MicroMsg.NetSceneGetSuggestionAppList", "suggestion app count = %s, appType = %s, ", new Object[] { Integer.valueOf(paramString.utL), Integer.valueOf(this.lLR) });
    paramq = a.a.aWD().aWB();
    b(paramq, paramString.utM);
    a(paramq, paramString.lSl);
    GMTrace.o(809332899840L, 6030);
  }
  
  public final byte[] aFZ()
  {
    GMTrace.i(810272423936L, 6037);
    try
    {
      byte[] arrayOfByte = ((b.b)this.kzP.DC()).Ba();
      GMTrace.o(810272423936L, 6037);
      return arrayOfByte;
    }
    catch (Exception localException)
    {
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.NetSceneGetSuggestionAppList", localException.getMessage());
      com.tencent.mm.sdk.platformtools.w.printErrStackTrace("MicroMsg.NetSceneGetSuggestionAppList", localException, "", new Object[0]);
      GMTrace.o(810272423936L, 6037);
    }
    return null;
  }
  
  public final void au(byte[] paramArrayOfByte)
  {
    GMTrace.i(810406641664L, 6038);
    if (paramArrayOfByte == null)
    {
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.NetSceneGetSuggestionAppList", "buf is null");
      GMTrace.o(810406641664L, 6038);
      return;
    }
    b.c localc = this.kzP.gtD;
    try
    {
      localc.y(paramArrayOfByte);
      GMTrace.o(810406641664L, 6038);
      return;
    }
    catch (Exception paramArrayOfByte)
    {
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.NetSceneGetSuggestionAppList", paramArrayOfByte.getMessage());
      com.tencent.mm.sdk.platformtools.w.printErrStackTrace("MicroMsg.NetSceneGetSuggestionAppList", paramArrayOfByte, "", new Object[0]);
      GMTrace.o(810406641664L, 6038);
    }
  }
  
  public final int getType()
  {
    GMTrace.i(810540859392L, 6039);
    GMTrace.o(810540859392L, 6039);
    return 4;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\model\app\ag.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */