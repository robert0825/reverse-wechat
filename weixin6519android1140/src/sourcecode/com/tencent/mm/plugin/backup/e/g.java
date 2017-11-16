package com.tencent.mm.plugin.backup.e;

import android.graphics.Bitmap.CompressFormat;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.ly;
import com.tencent.mm.g.a.ly.b;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.platformtools.n;
import com.tencent.mm.plugin.backup.h.u;
import com.tencent.mm.pluginsdk.model.app.i;
import com.tencent.mm.protocal.c.azq;
import com.tencent.mm.protocal.c.ek;
import com.tencent.mm.sdk.platformtools.aw;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.j;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.aj;
import com.tencent.mm.storage.au;
import com.tencent.mm.x.f.a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class g
  implements e
{
  public g()
  {
    GMTrace.i(14817234518016L, 110397);
    GMTrace.o(14817234518016L, 110397);
  }
  
  private static int b(ek paramek, boolean paramBoolean1, au paramau, String paramString, LinkedList<u> paramLinkedList, HashMap<Long, a.c> paramHashMap, boolean paramBoolean2, long paramLong)
  {
    GMTrace.i(14817502953472L, 110399);
    int j;
    String str;
    int i;
    if (bg.nm(paramau.field_content))
    {
      j = 0;
      str = paramau.field_content;
      localObject1 = str;
      if (paramau.field_isSend != 1)
      {
        localObject1 = str;
        if (com.tencent.mm.plugin.backup.g.d.eb(paramau.field_talker))
        {
          i = paramau.field_content.indexOf(':');
          localObject1 = str;
          if (i != -1) {
            localObject1 = paramau.field_content.substring(i + 1);
          }
        }
      }
      localObject1 = bg.Sx((String)localObject1);
      if (localObject1 == null) {
        break label1210;
      }
    }
    label1210:
    for (Object localObject1 = f.a.eS((String)localObject1);; localObject1 = null)
    {
      if (localObject1 == null)
      {
        w.e("MicroMsg.MMBakItemAppMsg", "content is null");
        GMTrace.o(14817502953472L, 110399);
        return 0;
        j = paramau.field_content.getBytes().length;
        break;
      }
      w.d("MicroMsg.MMBakItemAppMsg", "content type " + ((f.a)localObject1).type);
      str = com.tencent.mm.plugin.backup.g.a.afG().afH().IZ().x(paramau.field_imgPath, true);
      if (com.tencent.mm.a.e.aZ(str))
      {
        j += b.a(new b.a(str, paramek, paramLinkedList, 6, paramBoolean1, "_thumb", paramBoolean2));
        i = j;
        switch (((f.a)localObject1).type)
        {
        default: 
          i = j;
        }
      }
      for (;;)
      {
        GMTrace.o(14817502953472L, 110399);
        return i;
        if (((f.a)localObject1).type != 2) {
          break;
        }
        GMTrace.o(14817502953472L, 110399);
        return -1;
        i = j;
        if (!bg.nm(((f.a)localObject1).eAE))
        {
          paramString = com.tencent.mm.plugin.backup.g.a.afG().afH().afP().Op(((f.a)localObject1).eAE);
          if ((paramString == null) || (!paramString.aDI()))
          {
            i = j;
            if (paramau.field_isSend == 1)
            {
              i = j;
              if (paramString != null)
              {
                i = j;
                if (!paramString.field_isUpload) {}
              }
            }
          }
          else
          {
            paramau = paramString.field_fileFullPath;
            i = j;
            if (com.tencent.mm.a.e.aZ(paramau))
            {
              w.d("MicroMsg.MMBakItemAppMsg", "image " + paramau);
              i = j + b.a(new b.a(paramau, paramek, paramLinkedList, 8, paramBoolean1, paramBoolean2, null));
              continue;
              com.tencent.mm.pluginsdk.model.app.b localb = com.tencent.mm.plugin.backup.g.a.afG().afH().afP().Op(((f.a)localObject1).eAE);
              if ((localb == null) || (!localb.aDI()))
              {
                i = j;
                if (paramau.field_isSend == 1)
                {
                  i = j;
                  if (localb != null)
                  {
                    i = j;
                    if (!localb.field_isUpload) {}
                  }
                }
              }
              else
              {
                w.d("MicroMsg.MMBakItemAppMsg", "full path " + localb.field_fileFullPath);
                i = j;
                if (com.tencent.mm.a.e.aZ(localb.field_fileFullPath)) {
                  if (paramBoolean1)
                  {
                    i = j + b.a(new b.a(localb.field_fileFullPath, paramek, paramLinkedList, 7, paramBoolean1, paramBoolean2, null));
                  }
                  else
                  {
                    if ((com.tencent.mm.plugin.backup.a.e.ael() == 1) && (((f.a)localObject1).giv / 1024 >= paramLong) && (((f.a)localObject1).filemd5 != null))
                    {
                      Object localObject2;
                      if (paramau.field_isSend == 1)
                      {
                        localObject2 = paramau.field_talker;
                        str = paramString;
                        paramString = (String)localObject2;
                      }
                      for (;;)
                      {
                        localObject2 = new u();
                        j += b.a(new b.a(localb.field_fileFullPath, paramek, paramLinkedList, 7, paramBoolean1, true, (u)localObject2));
                        i = j;
                        if (paramHashMap == null) {
                          break;
                        }
                        paramek = new a.c();
                        paramek.iZF = ((u)localObject2);
                        paramek.eDW = ((f.a)localObject1).filemd5;
                        paramek.iZH = (str + "_" + paramString + "_" + paramau.field_msgSvrId + "_backup");
                        paramek.iZG = paramau.field_msgSvrId;
                        paramHashMap.put(Long.valueOf(paramau.field_msgSvrId), paramek);
                        i = j;
                        break;
                        str = paramau.field_talker;
                      }
                    }
                    i = j + b.a(new b.a(localb.field_fileFullPath, paramek, paramLinkedList, 7, paramBoolean1, paramBoolean2, null));
                    continue;
                    paramString = com.tencent.mm.plugin.backup.g.a.afG().afH().afP().Op(((f.a)localObject1).eAE);
                    if ((paramString == null) || (!paramString.aDI()))
                    {
                      i = j;
                      if (paramau.field_isSend == 1)
                      {
                        i = j;
                        if (paramString != null)
                        {
                          i = j;
                          if (!paramString.field_isUpload) {}
                        }
                      }
                    }
                    else
                    {
                      w.d("MicroMsg.MMBakItemAppMsg", "full path " + paramString.field_fileFullPath);
                      i = j;
                      if (com.tencent.mm.a.e.aZ(paramString.field_fileFullPath))
                      {
                        i = j + b.a(new b.a(paramString.field_fileFullPath, paramek, paramLinkedList, 7, paramBoolean1, paramBoolean2, null));
                        continue;
                        paramString = new ly();
                        paramString.eQC.ePi = ((f.a)localObject1).giV;
                        paramString.eQC.eCL = paramau.field_msgId;
                        com.tencent.mm.sdk.b.a.vgX.m(paramString);
                        w.i("MicroMsg.MMBakItemAppMsg", "pathList:%s", new Object[] { paramString.eQD.eQE });
                        paramau = paramString.eQD.eQE.split(":");
                        i = j;
                        j = 0;
                        if (j < paramau.length)
                        {
                          if (com.tencent.mm.a.e.aZ(paramau[j]))
                          {
                            w.i("MicroMsg.MMBakItemAppMsg", "record file exit:%s, index:%d", new Object[] { paramau[j], Integer.valueOf(j) });
                            i += b.a(new b.a(paramau[j], paramek, paramLinkedList, 7, paramBoolean1, "_fav." + j, paramBoolean2));
                          }
                          for (;;)
                          {
                            j += 1;
                            break;
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
  }
  
  public final int a(ek paramek, boolean paramBoolean1, au paramau, String paramString, LinkedList<u> paramLinkedList, HashMap<Long, a.c> paramHashMap, boolean paramBoolean2, long paramLong)
  {
    GMTrace.i(14817368735744L, 110398);
    switch (paramau.field_type)
    {
    default: 
      i = b(paramek, paramBoolean1, paramau, paramString, paramLinkedList, paramHashMap, paramBoolean2, paramLong);
      GMTrace.o(14817368735744L, 110398);
      return i;
    case 285212721: 
    case 486539313: 
      if (bg.nm(paramau.field_content)) {}
      for (i = 0; paramBoolean1; i = paramau.field_content.getBytes().length)
      {
        GMTrace.o(14817368735744L, 110398);
        return i;
      }
      paramau = a.tn(paramau.field_content);
      if (bg.nm(paramau))
      {
        GMTrace.o(14817368735744L, 110398);
        return 0;
      }
      paramString = new azq();
      paramString.Rq(bg.aq(paramau, ""));
      paramek.tPY = paramString;
      GMTrace.o(14817368735744L, 110398);
      return i;
    }
    if (bg.nm(paramau.field_content)) {}
    for (int i = 0; paramau.field_content == null; i = paramau.field_content.getBytes().length)
    {
      GMTrace.o(14817368735744L, 110398);
      return -1;
    }
    paramHashMap = aj.Uf(paramau.field_content).vAJ.trim();
    paramString = paramHashMap;
    if (!com.tencent.mm.plugin.backup.a.h.tg(paramHashMap))
    {
      paramHashMap = paramau.field_content;
      paramString = paramHashMap;
      if (!com.tencent.mm.plugin.backup.a.h.tg(paramHashMap))
      {
        w.e("MicroMsg.MMBakItemAppMsg", "get xml error " + paramHashMap);
        GMTrace.o(14817368735744L, 110398);
        return 0;
      }
    }
    int j = i;
    if (!bg.nm(paramString))
    {
      paramHashMap = new azq();
      paramHashMap.Rq(bg.aq(paramString, ""));
      paramek.tPY = paramHashMap;
      paramString = f.a.eS(paramString);
      paramHashMap = com.tencent.mm.plugin.backup.g.a.afG().afH().zb();
      paramau = com.tencent.mm.plugin.backup.g.a.afG().afH().IZ().x(paramau.field_imgPath, true);
      paramString = paramHashMap + paramString.gix;
      if (com.tencent.mm.a.e.aY(paramau) <= 0)
      {
        GMTrace.o(14817368735744L, 110398);
        return -1;
      }
      j = b.a(new b.a(paramau, paramek, paramLinkedList, 6, paramBoolean1, "_thumb", paramBoolean2));
      paramau = aj.Uf(n.a(paramek.tPY));
      j = i + j + b.a(new b.a(paramString, paramek, paramLinkedList, paramBoolean1, paramBoolean2, com.tencent.mm.plugin.backup.g.a.afG().afH().afO().UK(paramau.eDW)));
    }
    GMTrace.o(14817368735744L, 110398);
    return j;
  }
  
  public final int a(String paramString, ek paramek, au paramau)
  {
    GMTrace.i(14817637171200L, 110400);
    Object localObject3 = paramek.tPW.uNR;
    Object localObject2 = paramek.tPY.uNR;
    if (localObject2 == null)
    {
      GMTrace.o(14817637171200L, 110400);
      return 0;
    }
    paramau.setContent((String)localObject2);
    Object localObject1 = localObject2;
    int i;
    if (paramau.field_isSend != 1)
    {
      localObject1 = localObject2;
      if (com.tencent.mm.plugin.backup.g.d.eb((String)localObject3))
      {
        i = com.tencent.mm.plugin.backup.g.d.gO(paramek.tPY.uNR);
        localObject1 = localObject2;
        if (i != -1) {
          localObject1 = (paramek.tPY.uNR + " ").substring(i + 2).trim();
        }
      }
    }
    Object localObject4 = bg.Sx((String)localObject1);
    localObject3 = f.a.eS((String)localObject4);
    if (localObject3 == null)
    {
      w.e("MicroMsg.MMBakItemAppMsg", "parse app message failed, insert failed");
      GMTrace.o(14817637171200L, 110400);
      return 0;
    }
    if (((f.a)localObject3).type == 2000)
    {
      paramau.setType(419430449);
      com.tencent.mm.plugin.backup.g.d.i(paramau);
      GMTrace.o(14817637171200L, 110400);
      return 0;
    }
    if ((((f.a)localObject3).type == 19) || (((f.a)localObject3).type == 24))
    {
      paramau.setType(com.tencent.mm.pluginsdk.model.app.l.d((f.a)localObject3));
      com.tencent.mm.plugin.backup.g.d.i(paramau);
      paramString = new ly();
      paramString.eQC.ePi = ((f.a)localObject3).giV;
      paramString.eQC.eCL = paramau.field_msgId;
      com.tencent.mm.sdk.b.a.vgX.m(paramString);
      w.i("MicroMsg.MMBakItemAppMsg", "pathList:%s", new Object[] { paramString.eQD.eQE });
      paramString = paramString.eQD.eQE.split(":");
      i = 0;
      while (i < paramString.length)
      {
        paramau = com.tencent.mm.plugin.backup.a.h.a(paramek, 7, "." + i);
        if (!bg.nm(paramau))
        {
          w.i("MicroMsg.MMBakItemAppMsg", "record media exit:%s, index:%d", new Object[] { paramau, Integer.valueOf(i) });
          j.r(com.tencent.mm.plugin.backup.a.h.th(paramau), paramString[i], false);
        }
        i += 1;
      }
      GMTrace.o(14817637171200L, 110400);
      return 0;
    }
    localObject1 = new com.tencent.mm.pluginsdk.model.app.f();
    ((com.tencent.mm.pluginsdk.model.app.f)localObject1).field_appId = ((f.a)localObject3).appId;
    localObject2 = com.tencent.mm.plugin.backup.g.a.afG().afH();
    if (((com.tencent.mm.plugin.backup.g.c)localObject2).uin == 0) {
      throw new com.tencent.mm.y.b();
    }
    if ((((com.tencent.mm.plugin.backup.g.c)localObject2).jcG.b((com.tencent.mm.sdk.e.c)localObject1, new String[0])) && (((com.tencent.mm.pluginsdk.model.app.f)localObject1).field_appVersion < ((f.a)localObject3).eVc)) {
      com.tencent.mm.plugin.backup.g.a.afG().afI().c(1, ((f.a)localObject3).appId);
    }
    paramau.setType(com.tencent.mm.pluginsdk.model.app.l.d((f.a)localObject3));
    localObject1 = com.tencent.mm.plugin.backup.a.h.b(paramek, 6);
    if ((localObject1 != null) && (paramau.field_msgId == 0L)) {
      if (((f.a)localObject3).type != 2) {
        break label740;
      }
    }
    com.tencent.mm.x.f localf;
    com.tencent.mm.plugin.backup.g.c localc;
    label740:
    for (boolean bool = true;; bool = false)
    {
      localObject1 = com.tencent.mm.plugin.backup.g.a.afG().afH().IZ().a((byte[])localObject1, bool, Bitmap.CompressFormat.PNG);
      w.d("MicroMsg.MMBakItemAppMsg", com.tencent.mm.compatible.util.g.tC() + " thumbData MsgInfo path:" + (String)localObject1);
      if (!bg.nm((String)localObject1))
      {
        paramau.dc((String)localObject1);
        w.d("MicroMsg.MMBakItemAppMsg", "new thumbnail saved, path:" + (String)localObject1);
      }
      localObject2 = com.tencent.mm.plugin.backup.a.h.a(paramek, 8);
      i = com.tencent.mm.plugin.backup.a.h.c(paramek, 8);
      localObject1 = localObject2;
      if (bg.nm((String)localObject2))
      {
        localObject1 = com.tencent.mm.plugin.backup.a.h.a(paramek, 7);
        i = com.tencent.mm.plugin.backup.a.h.c(paramek, 7);
      }
      localObject2 = com.tencent.mm.plugin.backup.a.h.th((String)localObject1);
      com.tencent.mm.plugin.backup.g.d.i(paramau);
      localf = new com.tencent.mm.x.f();
      ((f.a)localObject3).a(localf);
      localf.field_msgId = paramau.field_msgId;
      localc = com.tencent.mm.plugin.backup.g.a.afG().afH();
      if (localc.uin != 0) {
        break;
      }
      throw new com.tencent.mm.y.b();
    }
    localc.jcF.b(localf);
    long l;
    if (!bg.nm((String)localObject1))
    {
      localObject1 = com.tencent.mm.plugin.backup.g.a.afG().afH().yM();
      if (paramString.equals(paramek.tPW.uNR)) {}
      for (paramString = paramek.tPX.uNR;; paramString = paramek.tPW.uNR)
      {
        localObject1 = ((com.tencent.mm.plugin.messenger.foundation.a.a.c)localObject1).B(paramString, paramek.tQd);
        paramek = com.tencent.mm.plugin.backup.g.a.afG().afH().afP().Op(((f.a)localObject3).eAE);
        paramString = paramek;
        if (paramek != null) {
          break label1138;
        }
        w.i("MicroMsg.MMBakItemAppMsg", "recover AppAttachInfo is null.");
        l = ((ce)localObject1).field_msgId;
        localObject4 = f.a.eS((String)localObject4);
        if (localObject4 != null)
        {
          paramString = com.tencent.mm.pluginsdk.model.app.l.ad(com.tencent.mm.compatible.util.e.fRX, ((f.a)localObject4).title, ((f.a)localObject4).giw);
          int j = ((f.a)localObject4).sdkVer;
          paramek = ((f.a)localObject4).appId;
          localObject1 = ((f.a)localObject4).eAE;
          int k = ((f.a)localObject4).giv;
          localObject4 = new com.tencent.mm.pluginsdk.model.app.b();
          ((com.tencent.mm.pluginsdk.model.app.b)localObject4).field_fileFullPath = paramString;
          ((com.tencent.mm.pluginsdk.model.app.b)localObject4).field_appId = paramek;
          ((com.tencent.mm.pluginsdk.model.app.b)localObject4).field_sdkVer = j;
          ((com.tencent.mm.pluginsdk.model.app.b)localObject4).field_mediaSvrId = ((String)localObject1);
          ((com.tencent.mm.pluginsdk.model.app.b)localObject4).field_totalLen = k;
          ((com.tencent.mm.pluginsdk.model.app.b)localObject4).field_status = 101L;
          ((com.tencent.mm.pluginsdk.model.app.b)localObject4).field_isUpload = false;
          ((com.tencent.mm.pluginsdk.model.app.b)localObject4).field_createTime = bg.Pv();
          ((com.tencent.mm.pluginsdk.model.app.b)localObject4).field_lastModifyTime = bg.Pu();
          ((com.tencent.mm.pluginsdk.model.app.b)localObject4).field_msgInfoId = l;
          ((com.tencent.mm.pluginsdk.model.app.b)localObject4).field_netTimes = 0L;
          com.tencent.mm.plugin.backup.g.a.afG().afH().afP().b((com.tencent.mm.sdk.e.c)localObject4);
          w.e("MicroMsg.TempStorageLogic", "initDownloadAttach insert error, msgLocalId[%d]", new Object[] { Long.valueOf(l) });
        }
        paramek = com.tencent.mm.plugin.backup.g.a.afG().afH().afP().Op(((f.a)localObject3).eAE);
        if (paramek != null) {
          break;
        }
        w.e("MicroMsg.MMBakItemAppMsg", "getAppAttachInfoStg().getByMediaId is null! attachid[%s]", new Object[] { ((f.a)localObject3).eAE });
        GMTrace.o(14817637171200L, 110400);
        return 0;
      }
      paramString = paramek;
      if (((f.a)localObject3).giv != 0)
      {
        paramString = paramek;
        if (i != 0)
        {
          if (i >= ((f.a)localObject3).giv) {
            break label1207;
          }
          if (paramau.field_isSend != 1) {
            break label1195;
          }
          paramek.field_status = 105L;
          paramString = paramek;
        }
      }
    }
    for (;;)
    {
      label1138:
      l = i;
      paramString.field_offset = l;
      paramString.field_totalLen = l;
      j.r((String)localObject2, paramString.field_fileFullPath, false);
      com.tencent.mm.plugin.backup.g.a.afG().afH().afP().c(paramString, new String[0]);
      GMTrace.o(14817637171200L, 110400);
      return 0;
      label1195:
      paramek.field_status = 102L;
      paramString = paramek;
      continue;
      label1207:
      paramek.field_status = 199L;
      paramString = paramek;
    }
  }
  
  private static final class a
  {
    public static String iZZ;
    public static String jaa;
    public static String jab;
    
    static
    {
      GMTrace.i(14813476421632L, 110369);
      jab = "]]>";
      iZZ = "<msg>";
      jaa = "</msg>";
      GMTrace.o(14813476421632L, 110369);
    }
    
    public static String tn(String paramString)
    {
      GMTrace.i(14813342203904L, 110368);
      com.tencent.mm.x.k localk = ((com.tencent.mm.plugin.biz.a.a)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.biz.a.a.class)).tA(paramString);
      a locala = new a(paramString);
      if (!locala.jad)
      {
        w.e("MicroMsg.AppmsgConvert", "buffer error");
        GMTrace.o(14813342203904L, 110368);
        return "";
      }
      b localb = new b();
      Object localObject1 = localk.glr;
      Object localObject3 = new HashMap();
      localb.to("msg");
      ((Map)localObject3).put("appid", (String)locala.jac.get(".msg.appmsg.$appid"));
      ((Map)localObject3).put("sdkver", (String)locala.jac.get(".msg.appmsg.$sdkver"));
      localb.f("appmsg", (Map)localObject3);
      paramString = (String)localObject1;
      if (localObject1 == null) {
        paramString = new LinkedList();
      }
      Object localObject2;
      String str1;
      int i;
      if (paramString.size() == 0)
      {
        localObject2 = "";
        localObject1 = "";
        str1 = "";
        localb.br("title", (String)localObject2);
        localb.br("des", (String)locala.jac.get(".msg.appmsg.des"));
        localb.br("action", (String)locala.jac.get(".msg.appmsg.action"));
        localb.aC("type", locala.getInt(".msg.appmsg.type"));
        localb.aC("showtype", locala.getInt(".msg.appmsg.showtype"));
        localb.br("content", (String)locala.jac.get(".msg.appmsg.content"));
        localb.br("url", (String)localObject1);
        localb.br("lowurl", (String)locala.jac.get(".msg.appmsg.lowurl"));
        localb.to("appattach");
        localb.aC("totallen", locala.getInt(".msg.appmsg.appattach.totallen"));
        localb.br("attachid", (String)locala.jac.get(".msg.appmsg.appattach.attachid"));
        localb.br("fileext", (String)locala.jac.get(".msg.appmsg.appattach.fileext"));
        localb.tp("appattach");
        localb.to("mmreader");
        ((Map)localObject3).put("type", localk.type);
        ((Map)localObject3).put("convMsgCount", paramString.size());
        localb.f("category", (Map)localObject3);
        localb.br("name", localk.eTp);
        localb.to("topnew");
        localb.br("cover", (String)locala.jac.get(".msg.appmsg.mmreader.category.topnew.cover"));
        localb.br("width", (String)locala.jac.get(".msg.appmsg.mmreader.category.topnew.width"));
        localb.br("height", (String)locala.jac.get(".msg.appmsg.mmreader.category.topnew.height"));
        localb.br("digest", str1);
        localb.tp("topnew");
        i = 0;
        label563:
        if (i >= paramString.size()) {
          break label990;
        }
        localb.to("item");
        if (paramString.get(i) != null)
        {
          localObject1 = ((com.tencent.mm.x.l)paramString.get(i)).title;
          localObject2 = ((com.tencent.mm.x.l)paramString.get(i)).url;
          str1 = ((com.tencent.mm.x.l)paramString.get(i)).glv;
          localObject3 = ((com.tencent.mm.x.l)paramString.get(i)).glw;
          String str2 = ((com.tencent.mm.x.l)paramString.get(i)).time;
          String str3 = ((com.tencent.mm.x.l)paramString.get(i)).glx;
          String str4 = ((com.tencent.mm.x.l)paramString.get(i)).gly;
          String str5 = ((com.tencent.mm.x.l)paramString.get(i)).glz;
          localb.br("title", (String)localObject1);
          localb.br("url", (String)localObject2);
          localb.br("shorturl", str1);
          localb.br("longurl", (String)localObject3);
          localb.br("pub_time", str2);
          localb.br("cover", str3);
          localb.br("tweetid", str4);
          localb.br("digest", str5);
          localObject2 = new StringBuilder(".msg.appmsg.mmreader.category.item");
          if (i != 0) {
            break label982;
          }
        }
      }
      label982:
      for (localObject1 = "";; localObject1 = String.valueOf(i))
      {
        localObject1 = (String)localObject1;
        localb.br("fileid", (String)locala.jac.get((String)localObject1 + ".fileid"));
        localb.to("source");
        localb.to("source");
        localb.br("name", localk.eTp);
        localb.tp("source");
        localb.tp("source");
        localb.tp("item");
        i += 1;
        break label563;
        localObject2 = ((com.tencent.mm.x.l)paramString.get(0)).title;
        localObject1 = ((com.tencent.mm.x.l)paramString.get(0)).url;
        str1 = ((com.tencent.mm.x.l)paramString.get(0)).glx;
        str1 = ((com.tencent.mm.x.l)paramString.get(0)).glz;
        break;
      }
      label990:
      localb.tp("category");
      localb.to("publisher");
      localb.br("convName", localk.eTo);
      localb.br("nickname", localk.eTp);
      localb.tp("publisher");
      localb.tp("mmreader");
      localb.tp("appmsg");
      localb.br("fromusername", localk.eTo);
      localb.aC("scene", locala.getInt(".msg.scene"));
      localb.to("appinfo");
      localb.br("version", (String)locala.jac.get(".msg.appinfo.appname"));
      localb.br("appname", (String)locala.jac.get(".msg.appinfo.version"));
      localb.tp("appinfo");
      localb.br("commenturl", localk.fwt);
      localb.tp("msg");
      w.d("MicroMsg.AppmsgConvert", "xml " + localb.jae.toString());
      paramString = localb.jae.toString();
      GMTrace.o(14813342203904L, 110368);
      return paramString;
    }
    
    static final class a
    {
      Map<String, String> jac;
      boolean jad;
      
      public a(String paramString)
      {
        GMTrace.i(14812268462080L, 110360);
        this.jac = null;
        this.jad = true;
        this.jac = aw.Se(paramString);
        if (this.jac == null)
        {
          this.jad = false;
          this.jac = new HashMap();
        }
        GMTrace.o(14812268462080L, 110360);
      }
      
      final int getInt(String paramString)
      {
        GMTrace.i(14812402679808L, 110361);
        if (!this.jac.containsKey(paramString))
        {
          GMTrace.o(14812402679808L, 110361);
          return 0;
        }
        int i = bg.getInt((String)this.jac.get(paramString), 0);
        GMTrace.o(14812402679808L, 110361);
        return i;
      }
    }
    
    static final class b
    {
      StringBuffer jae;
      
      b()
      {
        GMTrace.i(14817771388928L, 110401);
        this.jae = new StringBuffer();
        GMTrace.o(14817771388928L, 110401);
      }
      
      public final void aC(String paramString, int paramInt)
      {
        GMTrace.i(14818308259840L, 110405);
        to(paramString);
        this.jae.append(paramInt);
        tp(paramString);
        GMTrace.o(14818308259840L, 110405);
      }
      
      public final void br(String paramString1, String paramString2)
      {
        GMTrace.i(14818174042112L, 110404);
        to(paramString1);
        if (!bg.nm(paramString2))
        {
          if (!paramString2.contains(g.a.jab)) {
            break label76;
          }
          this.jae.append("<![CDATA[" + bg.Sw(paramString2) + "]]>");
        }
        for (;;)
        {
          tp(paramString1);
          GMTrace.o(14818174042112L, 110404);
          return;
          label76:
          this.jae.append("<![CDATA[" + paramString2 + "]]>");
        }
      }
      
      public final void f(String paramString, Map<String, String> paramMap)
      {
        GMTrace.i(14818442477568L, 110406);
        this.jae.append("<" + paramString);
        paramString = paramMap.keySet().iterator();
        while (paramString.hasNext())
        {
          String str1 = (String)paramString.next();
          String str2 = (String)paramMap.get(str1);
          this.jae.append(" " + str1 + " =  \"" + str2 + "\" ");
        }
        this.jae.append(">");
        paramMap.clear();
        GMTrace.o(14818442477568L, 110406);
      }
      
      public final void to(String paramString)
      {
        GMTrace.i(14817905606656L, 110402);
        this.jae.append("<" + paramString + ">");
        GMTrace.o(14817905606656L, 110402);
      }
      
      public final void tp(String paramString)
      {
        GMTrace.i(14818039824384L, 110403);
        this.jae.append("</" + paramString + ">");
        GMTrace.o(14818039824384L, 110403);
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\backup\e\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */