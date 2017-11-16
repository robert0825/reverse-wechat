package com.tencent.mm.ui.chatting;

import android.content.Context;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.af.x;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.modelvideo.o;
import com.tencent.mm.modelvideo.r;
import com.tencent.mm.opensdk.modelmsg.WXEmojiObject;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.plugin.biz.a.a;
import com.tencent.mm.pluginsdk.model.app.an;
import com.tencent.mm.pluginsdk.model.app.b;
import com.tencent.mm.pluginsdk.model.app.g;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.aw;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.aj;
import com.tencent.mm.storage.au;
import com.tencent.mm.storage.au.a;
import com.tencent.mm.storage.emotion.EmojiInfo;
import com.tencent.mm.x.f.a;
import com.tencent.mm.x.k;
import com.tencent.mm.y.at;
import com.tencent.mm.y.bc;
import com.tencent.mm.y.q;
import com.tencent.mm.y.u;
import com.tencent.mm.y.u.b;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public final class aa
{
  public static void a(Context paramContext, String paramString, au paramau)
  {
    GMTrace.i(2509468860416L, 18697);
    if (!a(paramContext, paramString, paramau, "emoji"))
    {
      GMTrace.o(2509468860416L, 18697);
      return;
    }
    String str = aj.Uf(paramau.field_content).eDW;
    if ((str == null) || (str.endsWith("-1"))) {}
    for (paramau = paramau.field_imgPath;; paramau = str)
    {
      if (paramau == null)
      {
        w.w("MicroMsg.ChattingEditModeLogic", "showAcceptEmojiConnector: filePath is null");
        GMTrace.o(2509468860416L, 18697);
        return;
      }
      ((com.tencent.mm.plugin.emoji.b.c)com.tencent.mm.kernel.h.j(com.tencent.mm.plugin.emoji.b.c.class)).getEmojiMgr().m(paramContext, paramString, paramau);
      GMTrace.o(2509468860416L, 18697);
      return;
    }
  }
  
  public static void a(Context paramContext, String paramString, au paramau, boolean paramBoolean)
  {
    GMTrace.i(2509871513600L, 18700);
    if (!a(paramContext, paramString, paramau, "text"))
    {
      GMTrace.o(2509871513600L, 18700);
      return;
    }
    String str = q(paramau.field_content, paramau.field_isSend, paramBoolean);
    paramContext = str;
    if (paramau.bTS())
    {
      paramContext = q(paramau.field_transContent, paramau.field_isSend, paramBoolean);
      paramContext = str + "\n\n" + paramContext;
    }
    if ((paramContext == null) || (paramContext.equals("")))
    {
      w.e("MicroMsg.ChattingEditModeLogic", "Transfer text erro: content null");
      GMTrace.o(2509871513600L, 18700);
      return;
    }
    com.tencent.mm.plugin.messenger.a.d.aOe().A(paramString, paramContext, com.tencent.mm.y.s.go(paramString));
    GMTrace.o(2509871513600L, 18700);
  }
  
  public static void a(Context paramContext, String paramString1, String paramString2, int paramInt, boolean paramBoolean)
  {
    GMTrace.i(2510274166784L, 18703);
    try
    {
      au localau = new au();
      localau.setContent(paramString2);
      localau.dC(paramInt);
      paramInt = paramString2.indexOf("<msg>");
      String str = paramString2;
      if (paramInt > 0)
      {
        str = paramString2;
        if (paramInt < paramString2.length()) {
          str = paramString2.substring(paramInt).trim();
        }
      }
      paramString2 = bh.q(str, "msg");
      if ((paramString2 != null) && (paramString2.size() > 0)) {
        localau.dd(aw.ah(paramString2));
      }
      b(paramContext, paramString1, localau, paramBoolean);
      GMTrace.o(2510274166784L, 18703);
      return;
    }
    catch (Exception paramContext)
    {
      w.printErrStackTrace("MicroMsg.ChattingEditModeLogic", paramContext, "", new Object[0]);
      w.e("MicroMsg.ChattingEditModeLogic", "retransmit sigle app msg error : %s", new Object[] { paramContext.getLocalizedMessage() });
      GMTrace.o(2510274166784L, 18703);
    }
  }
  
  static boolean a(Context paramContext, String paramString1, au paramau, String paramString2)
  {
    GMTrace.i(2509334642688L, 18696);
    if (paramContext == null)
    {
      w.w("MicroMsg.ChattingEditModeLogic", "send %s fail, context is null", new Object[] { paramString2 });
      GMTrace.o(2509334642688L, 18696);
      return false;
    }
    if (bg.nm(paramString1))
    {
      w.w("MicroMsg.ChattingEditModeLogic", "send %s fail, username is null", new Object[] { paramString2 });
      GMTrace.o(2509334642688L, 18696);
      return false;
    }
    if (paramau == null)
    {
      w.w("MicroMsg.ChattingEditModeLogic", "send %s fail, msg is null", new Object[] { paramString2 });
      GMTrace.o(2509334642688L, 18696);
      return false;
    }
    GMTrace.o(2509334642688L, 18696);
    return true;
  }
  
  public static boolean a(List<au> paramList, dx paramdx)
  {
    boolean bool = true;
    GMTrace.i(14965947760640L, 111505);
    if ((paramList == null) || (paramList.isEmpty()))
    {
      w.w("MicroMsg.ChattingEditModeLogic", "check contain invalid send to friend msg error, select item empty");
      GMTrace.o(14965947760640L, 111505);
      return false;
    }
    if ((paramList.size() == 1) && (paramdx != null) && (paramdx.ccI()))
    {
      paramList = (au)paramList.get(0);
      if ((as(paramList)) || (paramList.bTu()) || (ah(paramList)) || (aj(paramList)) || (ak(paramList)) || (paramList.field_type == -1879048186) || (paramList.field_type == 318767153) || (ar(paramList)) || (al(paramList)) || (at(paramList)) || (aq(paramList)) || (am(paramList)))
      {
        GMTrace.o(14965947760640L, 111505);
        return false;
      }
      GMTrace.o(14965947760640L, 111505);
      return true;
    }
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      au localau = (au)paramList.next();
      if ((paramdx != null) && (paramdx.ccI()))
      {
        if ((!localau.bTu()) && (!ah(localau)) && (!aj(localau)) && (!ak(localau)) && (localau.field_type != -1879048186) && (!ar(localau)) && (!al(localau)) && ((!an(localau)) || ((paramdx != null) && (paramdx.ccI()))) && ((!ao(localau)) || ((paramdx != null) && (paramdx.ccI()))) && (localau.field_type != 318767153) && (!as(localau)) && (!at(localau)) && (!aq(localau)) && (!am(localau))) {
          break label399;
        }
        paramList.remove();
        bool = false;
      }
      else
      {
        if ((!an(localau)) && (!ao(localau))) {
          break label399;
        }
        paramList.remove();
        bool = false;
      }
    }
    label399:
    for (;;)
    {
      break;
      GMTrace.o(14965947760640L, 111505);
      return bool;
    }
  }
  
  public static boolean ah(au paramau)
  {
    GMTrace.i(2506918723584L, 18678);
    if (paramau == null)
    {
      w.w("MicroMsg.ChattingEditModeLogic", "check is store emoji error, msg is null");
      GMTrace.o(2506918723584L, 18678);
      return true;
    }
    if (paramau.bTJ())
    {
      aj localaj = new aj(paramau.field_content);
      paramau = f.a.C(paramau.field_content, paramau.field_reserved);
      if (paramau != null) {
        break label225;
      }
      paramau = new f.a();
      paramau.gix = localaj.eDW;
    }
    label225:
    for (;;)
    {
      for (paramau = ((com.tencent.mm.plugin.emoji.b.c)com.tencent.mm.kernel.h.j(com.tencent.mm.plugin.emoji.b.c.class)).getEmojiMgr().vP(paramau.gix); (paramau != null) && ((paramau.field_catalog == EmojiInfo.vCu) || ((!bg.nm(paramau.field_groupId)) && (((com.tencent.mm.plugin.emoji.b.c)com.tencent.mm.kernel.h.j(com.tencent.mm.plugin.emoji.b.c.class)).getEmojiMgr().vS(paramau.field_groupId)))); paramau = ((com.tencent.mm.plugin.emoji.b.c)com.tencent.mm.kernel.h.j(com.tencent.mm.plugin.emoji.b.c.class)).getEmojiMgr().vP(paramau.field_imgPath))
      {
        GMTrace.o(2506918723584L, 18678);
        return false;
      }
      if ((paramau != null) && (paramau.bUR()))
      {
        GMTrace.o(2506918723584L, 18678);
        return true;
      }
      GMTrace.o(2506918723584L, 18678);
      return false;
    }
  }
  
  public static boolean ai(au paramau)
  {
    GMTrace.i(2507052941312L, 18679);
    if (paramau.bTJ())
    {
      aj localaj = new aj(paramau.field_content);
      paramau = f.a.C(paramau.field_content, paramau.field_reserved);
      if (paramau != null) {
        break label107;
      }
      paramau = new f.a();
      paramau.gix = localaj.eDW;
    }
    label107:
    for (;;)
    {
      if (((com.tencent.mm.plugin.emoji.b.c)com.tencent.mm.kernel.h.j(com.tencent.mm.plugin.emoji.b.c.class)).getEmojiMgr().vP(paramau.gix) == null)
      {
        GMTrace.o(2507052941312L, 18679);
        return false;
      }
      GMTrace.o(2507052941312L, 18679);
      return true;
    }
  }
  
  public static boolean aj(au paramau)
  {
    GMTrace.i(2507187159040L, 18680);
    if (paramau == null)
    {
      w.w("MicroMsg.ChattingEditModeLogic", "check is game msg error, msg is null");
      GMTrace.o(2507187159040L, 18680);
      return true;
    }
    if (paramau.field_isSend == 0) {}
    for (paramau = bc.gQ(paramau.field_content);; paramau = paramau.field_content)
    {
      paramau = f.a.eS(paramau);
      if (paramau != null) {
        break;
      }
      w.w("MicroMsg.ChattingEditModeLogic", "parse app message content fail");
      GMTrace.o(2507187159040L, 18680);
      return false;
    }
    paramau = g.aP(paramau.appId, false);
    if ((paramau != null) && (paramau.bJs()))
    {
      GMTrace.o(2507187159040L, 18680);
      return true;
    }
    GMTrace.o(2507187159040L, 18680);
    return false;
  }
  
  public static boolean ak(au paramau)
  {
    GMTrace.i(2507321376768L, 18681);
    if (paramau.field_type == 419430449)
    {
      GMTrace.o(2507321376768L, 18681);
      return true;
    }
    GMTrace.o(2507321376768L, 18681);
    return false;
  }
  
  public static boolean al(au paramau)
  {
    GMTrace.i(2507455594496L, 18682);
    if ((paramau.field_type == 436207665) || (paramau.field_type == 469762097))
    {
      GMTrace.o(2507455594496L, 18682);
      return true;
    }
    GMTrace.o(2507455594496L, 18682);
    return false;
  }
  
  public static boolean am(au paramau)
  {
    GMTrace.i(14305328103424L, 106583);
    if (paramau == null)
    {
      w.w("MicroMsg.ChattingEditModeLogic", "isAppbrandForbidForwardMsg, check msg error, msg is null");
      GMTrace.o(14305328103424L, 106583);
      return true;
    }
    if (paramau.field_isSend == 0) {}
    for (paramau = bc.gQ(paramau.field_content);; paramau = paramau.field_content)
    {
      paramau = f.a.eS(paramau);
      if (paramau != null) {
        break;
      }
      w.w("MicroMsg.ChattingEditModeLogic", "isAppbrandForbidForwardMsg, parse app message content fail");
      GMTrace.o(14305328103424L, 106583);
      return false;
    }
    if ((paramau.type == 33) && (paramau.gkT == 3))
    {
      GMTrace.o(14305328103424L, 106583);
      return true;
    }
    GMTrace.o(14305328103424L, 106583);
    return false;
  }
  
  private static boolean an(au paramau)
  {
    GMTrace.i(20356668588032L, 151669);
    if (paramau != null)
    {
      paramau = f.a.eS(paramau.field_content);
      if ((paramau != null) && (paramau.type == 19))
      {
        if ((paramau.giV != null) && (paramau.giV.contains("<recordxml>")))
        {
          GMTrace.o(20356668588032L, 151669);
          return true;
        }
        GMTrace.o(20356668588032L, 151669);
        return false;
      }
    }
    GMTrace.o(20356668588032L, 151669);
    return false;
  }
  
  private static boolean ao(au paramau)
  {
    GMTrace.i(20356802805760L, 151670);
    if (paramau != null)
    {
      paramau = f.a.eS(paramau.field_content);
      if ((paramau != null) && (paramau.type == 24))
      {
        GMTrace.o(20356802805760L, 151670);
        return true;
      }
    }
    GMTrace.o(20356802805760L, 151670);
    return false;
  }
  
  public static boolean ap(au paramau)
  {
    GMTrace.i(2507858247680L, 18685);
    if (paramau != null)
    {
      paramau = f.a.eS(paramau.field_content);
      if (paramau == null)
      {
        GMTrace.o(2507858247680L, 18685);
        return false;
      }
      if ((paramau.type == 6) || (paramau.type == 5) || (paramau.type == 19))
      {
        GMTrace.o(2507858247680L, 18685);
        return true;
      }
    }
    GMTrace.o(2507858247680L, 18685);
    return false;
  }
  
  public static boolean aq(au paramau)
  {
    GMTrace.i(2507992465408L, 18686);
    if ((paramau == null) || ((!paramau.bTs()) && (!paramau.bTt())))
    {
      GMTrace.o(2507992465408L, 18686);
      return false;
    }
    paramau = ((a)com.tencent.mm.kernel.h.h(a.class)).tA(paramau.field_content);
    if (paramau == null)
    {
      w.w("MicroMsg.ChattingEditModeLogic", "isBizMsgForbidForward reader is null");
      GMTrace.o(2507992465408L, 18686);
      return false;
    }
    if (paramau.gls == 1)
    {
      GMTrace.o(2507992465408L, 18686);
      return true;
    }
    GMTrace.o(2507992465408L, 18686);
    return false;
  }
  
  static boolean ar(au paramau)
  {
    GMTrace.i(2508126683136L, 18687);
    if (paramau != null)
    {
      paramau = f.a.eS(paramau.field_content);
      if ((paramau != null) && (paramau.type == 16))
      {
        GMTrace.o(2508126683136L, 18687);
        return true;
      }
      if ((paramau != null) && (paramau.type == 34))
      {
        GMTrace.o(2508126683136L, 18687);
        return true;
      }
    }
    GMTrace.o(2508126683136L, 18687);
    return false;
  }
  
  static boolean as(au paramau)
  {
    GMTrace.i(2508260900864L, 18688);
    if (!paramau.bTD())
    {
      GMTrace.o(2508260900864L, 18688);
      return false;
    }
    at.AR();
    paramau = com.tencent.mm.y.c.yM().Cn(paramau.field_content);
    if ((paramau == null) || (bg.nm(paramau.rAP)))
    {
      GMTrace.o(2508260900864L, 18688);
      return true;
    }
    if (com.tencent.mm.y.s.fD(paramau.rAP))
    {
      GMTrace.o(2508260900864L, 18688);
      return false;
    }
    GMTrace.o(2508260900864L, 18688);
    return true;
  }
  
  private static boolean at(au paramau)
  {
    GMTrace.i(2508395118592L, 18689);
    if ((paramau != null) && (paramau.aCp()))
    {
      paramau = f.a.eS(paramau.field_content);
      if ((paramau != null) && (paramau.type == 6) && ((paramau.giz != 0) || (paramau.giv > 26214400)))
      {
        GMTrace.o(2508395118592L, 18689);
        return true;
      }
    }
    GMTrace.o(2508395118592L, 18689);
    return false;
  }
  
  public static boolean au(au paramau)
  {
    GMTrace.i(16267322851328L, 121201);
    if ((paramau != null) && (paramau.aCp()))
    {
      paramau = f.a.eS(paramau.field_content);
      if ((paramau != null) && (paramau.type == 6))
      {
        GMTrace.o(16267322851328L, 121201);
        return true;
      }
    }
    GMTrace.o(16267322851328L, 121201);
    return false;
  }
  
  public static void b(Context paramContext, String paramString, au paramau)
  {
    GMTrace.i(2509603078144L, 18698);
    if (!a(paramContext, paramString, paramau, "image"))
    {
      GMTrace.o(2509603078144L, 18698);
      return;
    }
    Object localObject = null;
    if (paramau.field_msgId > 0L) {
      localObject = com.tencent.mm.ao.n.IZ().aq(paramau.field_msgId);
    }
    if (((localObject == null) || (((com.tencent.mm.ao.d)localObject).gGR <= 0L)) && (paramau.field_msgSvrId > 0L)) {}
    for (paramau = com.tencent.mm.ao.n.IZ().ap(paramau.field_msgSvrId);; paramau = (au)localObject)
    {
      if (paramau == null)
      {
        GMTrace.o(2509603078144L, 18698);
        return;
      }
      int j = 0;
      int i = j;
      if (paramau.II())
      {
        i = j;
        if (!com.tencent.mm.ao.e.a(paramau).gGS.startsWith("SERVERID://")) {
          i = 1;
        }
      }
      localObject = com.tencent.mm.ao.n.IZ().l(com.tencent.mm.ao.e.c(paramau), "", "");
      String str = com.tencent.mm.ao.n.IZ().l(paramau.gGU, "th_", "");
      if (!bg.nm((String)localObject)) {
        com.tencent.mm.plugin.messenger.a.d.aOe().a(paramContext, paramString, (String)localObject, i, paramau.gHc, str);
      }
      GMTrace.o(2509603078144L, 18698);
      return;
    }
  }
  
  public static void b(Context paramContext, String paramString, au paramau, boolean paramBoolean)
  {
    GMTrace.i(2510005731328L, 18701);
    if (!a(paramContext, paramString, paramau, "appmsg"))
    {
      GMTrace.o(2510005731328L, 18701);
      return;
    }
    if (paramContext == null)
    {
      w.w("MicroMsg.ChattingEditModeLogic", "getReaderAppMsgContent: context is null");
      GMTrace.o(2510005731328L, 18701);
      return;
    }
    if (paramau == null)
    {
      w.w("MicroMsg.ChattingEditModeLogic", "getReaderAppMsgContent: msg is null");
      GMTrace.o(2510005731328L, 18701);
      return;
    }
    at.AR();
    if (!com.tencent.mm.y.c.isSDCardAvailable())
    {
      GMTrace.o(2510005731328L, 18701);
      return;
    }
    paramContext = com.tencent.mm.ao.n.IZ().b(paramau.field_imgPath, false, false);
    if ((!com.tencent.mm.platformtools.t.nm(paramContext)) && (!paramContext.endsWith("hd")) && (FileOp.aZ(paramContext + "hd"))) {
      paramContext = paramContext + "hd";
    }
    for (;;)
    {
      Object localObject1;
      Object localObject2;
      try
      {
        localObject1 = ((a)com.tencent.mm.kernel.h.h(a.class)).tA(paramau.field_content);
        localObject2 = ((k)localObject1).glr;
        if ((localObject2 == null) || (((List)localObject2).size() <= 0))
        {
          localObject2 = null;
          localObject1 = localObject2;
          if (paramau != null) {
            if ((!paramau.aCp()) && (!paramau.bTs()))
            {
              localObject1 = localObject2;
              if (!paramau.bTt()) {}
            }
            else
            {
              localObject1 = u.gy(paramau.field_msgSvrId);
              localObject2 = u.Av().p((String)localObject1, true);
              ((u.b)localObject2).o("prePublishId", "msg_" + paramau.field_msgSvrId);
              ((u.b)localObject2).o("preUsername", ah.a(paramau, paramBoolean, false));
              ((u.b)localObject2).o("preChatName", paramau.field_talker);
              ((u.b)localObject2).o("preMsgIndex", Integer.valueOf(0));
              ((u.b)localObject2).o("sendAppMsgScene", Integer.valueOf(1));
              ((com.tencent.mm.plugin.sns.b.i)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.sns.b.i.class)).a("adExtStr", (u.b)localObject2, paramau);
            }
          }
          com.tencent.mm.plugin.messenger.a.d.aOe().a(paramString, bg.readFromFile(paramContext), bg.Sx(paramau.field_content), (String)localObject1);
          GMTrace.o(2510005731328L, 18701);
          return;
        }
      }
      catch (Exception paramContext)
      {
        w.printErrStackTrace("MicroMsg.ChattingEditModeLogic", paramContext, "", new Object[0]);
        w.e("MicroMsg.ChattingEditModeLogic", "send app msg error : %s", new Object[] { paramContext.getLocalizedMessage() });
        GMTrace.o(2510005731328L, 18701);
        return;
      }
      paramau = ((List)localObject2).iterator();
      while (paramau.hasNext())
      {
        Object localObject3 = (com.tencent.mm.x.l)paramau.next();
        localObject2 = new f.a();
        if (com.tencent.mm.x.h.eU(((com.tencent.mm.x.l)localObject3).glC))
        {
          ac.b(paramString, ac.a(paramString, (com.tencent.mm.x.l)localObject3), ((com.tencent.mm.x.l)localObject3).glH);
        }
        else
        {
          ((f.a)localObject2).title = ((com.tencent.mm.x.l)localObject3).title;
          ((f.a)localObject2).description = ((com.tencent.mm.x.l)localObject3).glz;
          ((f.a)localObject2).action = "view";
          ((f.a)localObject2).type = 5;
          ((f.a)localObject2).url = ((com.tencent.mm.x.l)localObject3).url;
          ((f.a)localObject2).eTo = ((k)localObject1).eTo;
          ((f.a)localObject2).eTp = ((k)localObject1).eTp;
          ((f.a)localObject2).fwt = ((k)localObject1).fwt;
          ((f.a)localObject2).thumburl = ((com.tencent.mm.x.l)localObject3).glx;
          if ((bg.nm(((f.a)localObject2).thumburl)) && (!bg.nm(((f.a)localObject2).eTo)))
          {
            localObject3 = com.tencent.mm.ac.n.Di().ig(((f.a)localObject2).eTo);
            if (localObject3 != null) {
              ((f.a)localObject2).thumburl = ((com.tencent.mm.ac.h)localObject3).Do();
            }
          }
          localObject2 = f.a.a((f.a)localObject2, null, null);
          com.tencent.mm.plugin.messenger.a.d.aOe().a(paramString, bg.readFromFile(paramContext), bg.Sx((String)localObject2), null);
        }
      }
      GMTrace.o(2510005731328L, 18701);
      return;
    }
  }
  
  public static void b(EmojiInfo paramEmojiInfo, String paramString)
  {
    GMTrace.i(2510408384512L, 18704);
    WXMediaMessage localWXMediaMessage = new WXMediaMessage();
    Object localObject = new StringBuilder();
    at.AR();
    localObject = com.tencent.mm.y.c.zb() + paramEmojiInfo.GS();
    if (com.tencent.mm.a.e.aY((String)localObject + "_thumb") > 0)
    {
      int i = com.tencent.mm.a.e.aY((String)localObject + "_thumb");
      localWXMediaMessage.thumbData = com.tencent.mm.a.e.c((String)localObject + "_thumb", 0, i);
    }
    for (;;)
    {
      localWXMediaMessage.mediaObject = new WXEmojiObject((String)localObject);
      com.tencent.mm.pluginsdk.model.app.l.a(localWXMediaMessage, paramEmojiInfo.field_app_id, null, paramString, 1, paramEmojiInfo.GS());
      GMTrace.o(2510408384512L, 18704);
      return;
      try
      {
        FileInputStream localFileInputStream = new FileInputStream((String)localObject);
        localWXMediaMessage.setThumbImage(BackwardSupportUtil.b.a(localFileInputStream, 1.0F));
        localFileInputStream.close();
      }
      catch (Exception localException)
      {
        w.printErrStackTrace("MicroMsg.ChattingEditModeLogic", localException, "", new Object[0]);
        w.e("MicroMsg.ChattingEditModeLogic", "sendAppMsgEmoji Fail cause there is no thumb");
      }
    }
  }
  
  public static void c(Context paramContext, String paramString, au paramau)
  {
    GMTrace.i(2509737295872L, 18699);
    if ((!a(paramContext, paramString, paramau, "video")) || (paramau == null))
    {
      GMTrace.o(2509737295872L, 18699);
      return;
    }
    if ((paramau != null) && (paramau.bTH()) && (com.tencent.mm.modelvideo.t.my(paramau.field_imgPath)))
    {
      GMTrace.o(2509737295872L, 18699);
      return;
    }
    paramContext = com.tencent.mm.modelvideo.t.mw(paramau.field_imgPath);
    String str1 = paramau.field_imgPath;
    int i = paramContext.hcz;
    int j = paramContext.hcv;
    paramContext = paramContext.Nt();
    int k = paramau.field_type;
    w.d("MicroMsg.ChattingEditModeLogic", "copy video fileName %s userName %s export %d videoLength %d", new Object[] { str1, paramString, Integer.valueOf(i), Integer.valueOf(j) });
    paramau = com.tencent.mm.modelvideo.s.mj(q.zE());
    o.Nh();
    String str2 = com.tencent.mm.modelvideo.s.mk(str1);
    String str3 = com.tencent.mm.modelvideo.s.mk(paramau);
    str1 = com.tencent.mm.modelvideo.s.ml(str1);
    String str4 = com.tencent.mm.modelvideo.s.ml(paramau);
    w.d("MicroMsg.ChattingEditModeLogic", "copy video: srcFullPath[%s] destFullPath[%s] srcThumbPath[%s] destThumbPath[%s]", new Object[] { str2, str3, str1, str4 });
    com.tencent.mm.sdk.platformtools.j.r(str2, str3, false);
    com.tencent.mm.sdk.platformtools.j.r(str1, str4, false);
    com.tencent.mm.modelvideo.t.a(paramau, j, paramString, null, i, paramContext, k);
    com.tencent.mm.modelvideo.t.mr(paramau);
    GMTrace.o(2509737295872L, 18699);
  }
  
  public static void c(Context paramContext, String paramString, au paramau, boolean paramBoolean)
  {
    GMTrace.i(2510139949056L, 18702);
    if (!a(paramContext, paramString, paramau, "location"))
    {
      GMTrace.o(2510139949056L, 18702);
      return;
    }
    paramContext = q(paramau.field_content, paramau.field_isSend, paramBoolean);
    com.tencent.mm.plugin.messenger.a.d.aOe().A(paramString, paramContext, 48);
    GMTrace.o(2510139949056L, 18702);
  }
  
  public static boolean cC(List<au> paramList)
  {
    GMTrace.i(2507589812224L, 18683);
    if ((paramList == null) || (paramList.isEmpty()))
    {
      w.w("MicroMsg.ChattingEditModeLogic", "check contain invalid send to brand msg error, selected item empty");
      GMTrace.o(2507589812224L, 18683);
      return true;
    }
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      au localau = (au)paramList.next();
      if ((localau.bTu()) || (ah(localau)) || (localau.bTD()) || (aj(localau)) || (ak(localau)) || (localau.field_type == -1879048186) || (ar(localau)) || (al(localau)) || (aq(localau)) || (am(localau)) || (au(localau)))
      {
        GMTrace.o(2507589812224L, 18683);
        return true;
      }
    }
    GMTrace.o(2507589812224L, 18683);
    return false;
  }
  
  public static int cD(List<au> paramList)
  {
    GMTrace.i(2508529336320L, 18690);
    if (paramList == null)
    {
      w.w("MicroMsg.ChattingEditModeLogic", "get invalid send to friend msg num error, select item empty");
      GMTrace.o(2508529336320L, 18690);
      return 0;
    }
    paramList = paramList.iterator();
    int i = 0;
    if (paramList.hasNext())
    {
      au localau = (au)paramList.next();
      if ((!localau.bTu()) && (!ah(localau)) && (!localau.bTE()) && (!aj(localau)) && (!ak(localau)) && (!al(localau))) {
        break label120;
      }
      i += 1;
    }
    label120:
    for (;;)
    {
      break;
      GMTrace.o(2508529336320L, 18690);
      return i;
    }
  }
  
  public static boolean cE(List<au> paramList)
  {
    GMTrace.i(2508663554048L, 18691);
    if (paramList == null)
    {
      w.w("MicroMsg.ChattingEditModeLogic", "check contain undownload file, select item empty");
      GMTrace.o(2508663554048L, 18691);
      return false;
    }
    Iterator localIterator = paramList.iterator();
    label414:
    label415:
    for (;;)
    {
      au localau;
      if (localIterator.hasNext())
      {
        localau = (au)localIterator.next();
        if ((localau.bTC()) || (localau.bTK()))
        {
          paramList = null;
          if (localau.field_msgId > 0L) {
            paramList = com.tencent.mm.ao.n.IZ().aq(localau.field_msgId);
          }
          if (((paramList != null) && (paramList.gGR > 0L)) || (localau.field_msgSvrId <= 0L)) {
            break label414;
          }
          paramList = com.tencent.mm.ao.n.IZ().ap(localau.field_msgSvrId);
        }
      }
      for (;;)
      {
        if ((paramList == null) || ((paramList.offset >= paramList.gsL) && (paramList.gsL != 0))) {
          break label415;
        }
        GMTrace.o(2508663554048L, 18691);
        return true;
        if (localau.bTG())
        {
          paramList = o.Nh().mh(localau.field_imgPath);
          if ((paramList == null) || (paramList.status == 199) || (paramList.status == 199)) {
            break;
          }
          GMTrace.o(2508663554048L, 18691);
          return true;
        }
        if (localau.bTJ())
        {
          if (ai(localau)) {
            break;
          }
          GMTrace.o(2508663554048L, 18691);
          return true;
        }
        if (localau.aCp())
        {
          paramList = f.a.C(localau.field_content, localau.field_content);
          if (paramList == null)
          {
            GMTrace.o(2508663554048L, 18691);
            return true;
          }
          switch (paramList.type)
          {
          default: 
            break;
          case 6: 
            paramList = an.afP().Op(paramList.eAE);
            if (paramList == null)
            {
              GMTrace.o(2508663554048L, 18691);
              return true;
            }
            if (new File(paramList.field_fileFullPath).exists()) {
              break;
            }
            GMTrace.o(2508663554048L, 18691);
            return true;
          }
        }
        if (!localau.bTH()) {
          break;
        }
        paramList = com.tencent.mm.modelvideo.t.mw(localau.field_imgPath);
        if ((paramList == null) || (paramList.status == 199) || (paramList.status == 199)) {
          break;
        }
        GMTrace.o(2508663554048L, 18691);
        return true;
        GMTrace.o(2508663554048L, 18691);
        return false;
      }
    }
  }
  
  public static boolean cF(List<au> paramList)
  {
    GMTrace.i(2508797771776L, 18692);
    if ((paramList == null) || (paramList.isEmpty()))
    {
      GMTrace.o(2508797771776L, 18692);
      return false;
    }
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      au localau = (au)paramList.next();
      if ((localau.bTG()) && (com.tencent.mm.pluginsdk.model.j.Ol(localau.field_imgPath)))
      {
        GMTrace.o(2508797771776L, 18692);
        return true;
      }
    }
    GMTrace.o(2508797771776L, 18692);
    return false;
  }
  
  public static boolean cG(List<au> paramList)
  {
    GMTrace.i(2508931989504L, 18693);
    if ((paramList == null) || (paramList.isEmpty()))
    {
      GMTrace.o(2508931989504L, 18693);
      return false;
    }
    paramList = paramList.iterator();
    while (paramList.hasNext()) {
      if (((au)paramList.next()).bTH())
      {
        GMTrace.o(2508931989504L, 18693);
        return true;
      }
    }
    GMTrace.o(2508931989504L, 18693);
    return false;
  }
  
  public static List<String> ccb()
  {
    GMTrace.i(2509200424960L, 18695);
    Object localObject1 = x.FG().fP(25);
    Object localObject2 = x.FG();
    Object localObject3 = new ArrayList();
    Object localObject4 = new StringBuilder();
    com.tencent.mm.af.e.a((StringBuilder)localObject4);
    com.tencent.mm.af.e.c((StringBuilder)localObject4);
    com.tencent.mm.af.e.d((StringBuilder)localObject4);
    com.tencent.mm.af.e.a((StringBuilder)localObject4, true);
    ((StringBuilder)localObject4).append(" order by ");
    ((StringBuilder)localObject4).append(com.tencent.mm.af.e.Fj());
    localObject4 = ((StringBuilder)localObject4).toString();
    w.i("MicroMsg.BizInfoStorage", "getEnterpriseBizChatLst sql %s", new Object[] { localObject4 });
    localObject2 = ((com.tencent.mm.af.e)localObject2).rawQuery((String)localObject4, new String[0]);
    if (localObject2 != null)
    {
      if (((Cursor)localObject2).moveToFirst()) {
        do
        {
          ((ArrayList)localObject3).add(((Cursor)localObject2).getString(0));
        } while (((Cursor)localObject2).moveToNext());
      }
      ((Cursor)localObject2).close();
    }
    localObject2 = new HashMap();
    localObject3 = ((List)localObject3).iterator();
    String str;
    while (((Iterator)localObject3).hasNext())
    {
      localObject4 = (String)((Iterator)localObject3).next();
      str = com.tencent.mm.af.f.iK((String)localObject4).EN();
      if (!bg.nm(str)) {
        ((HashMap)localObject2).put(str, localObject4);
      }
    }
    localObject3 = new LinkedList();
    localObject4 = new LinkedList();
    localObject1 = ((List)localObject1).iterator();
    while (((Iterator)localObject1).hasNext())
    {
      str = (String)((Iterator)localObject1).next();
      if (com.tencent.mm.af.f.iN(str))
      {
        if (com.tencent.mm.af.f.iR(str))
        {
          str = com.tencent.mm.af.f.iK(str).field_enterpriseFather;
          if ((!((List)localObject4).contains(str)) && (com.tencent.mm.af.f.iP(str)))
          {
            ((List)localObject4).add(str);
            str = (String)((HashMap)localObject2).get(str);
            if (!bg.nm(str)) {
              ((List)localObject4).add(str);
            }
          }
        }
      }
      else {
        ((List)localObject3).add(str);
      }
    }
    localObject1 = ((HashMap)localObject2).values().iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (String)((Iterator)localObject1).next();
      if ((!bg.nm((String)localObject2)) && (!((List)localObject4).contains(localObject2))) {
        ((List)localObject4).add(localObject2);
      }
    }
    ((List)localObject3).addAll((Collection)localObject4);
    w.d("MicroMsg.ChattingEditModeLogic", "get selected accept list, size %d", new Object[] { Integer.valueOf(((List)localObject3).size()) });
    GMTrace.o(2509200424960L, 18695);
    return (List<String>)localObject3;
  }
  
  public static List<String> ccc()
  {
    GMTrace.i(14663421001728L, 109251);
    Object localObject = x.FG().fP(25);
    LinkedList localLinkedList = new LinkedList();
    localObject = ((List)localObject).iterator();
    while (((Iterator)localObject).hasNext())
    {
      String str = (String)((Iterator)localObject).next();
      if (!com.tencent.mm.af.f.iN(str)) {
        localLinkedList.add(str);
      }
    }
    w.d("MicroMsg.ChattingEditModeLogic", "get selected accept list without enterprise, size %d", new Object[] { Integer.valueOf(localLinkedList.size()) });
    GMTrace.o(14663421001728L, 109251);
    return localLinkedList;
  }
  
  public static String q(String paramString, int paramInt, boolean paramBoolean)
  {
    GMTrace.i(2509066207232L, 18694);
    String str = paramString;
    if (paramBoolean)
    {
      str = paramString;
      if (paramString != null)
      {
        str = paramString;
        if (paramInt == 0) {
          str = bc.gQ(paramString);
        }
      }
    }
    GMTrace.o(2509066207232L, 18694);
    return str;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\chatting\aa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */