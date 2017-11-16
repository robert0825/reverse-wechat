package com.tencent.mm.ui.chatting;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.g.a.cf;
import com.tencent.mm.g.a.mn;
import com.tencent.mm.g.a.mn.b;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.modelvideo.o;
import com.tencent.mm.modelvideo.r;
import com.tencent.mm.modelvideo.t;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.ar;
import com.tencent.mm.sdk.platformtools.ar.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.aj;
import com.tencent.mm.storage.au;
import com.tencent.mm.ui.transmit.MsgRetransmitUI;
import com.tencent.mm.x.f.a;
import com.tencent.mm.x.k;
import com.tencent.mm.y.at;
import com.tencent.mm.y.bc;
import com.tencent.mm.y.m;
import com.tencent.mm.y.u;
import com.tencent.mm.y.u.b;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class ab
{
  public static a wuA;
  
  static
  {
    GMTrace.i(2512555868160L, 18720);
    wuA = new a();
    GMTrace.o(2512555868160L, 18720);
  }
  
  public static void a(final Context paramContext, List<au> paramList, final boolean paramBoolean, final String paramString, final dx paramdx)
  {
    GMTrace.i(2511213690880L, 18710);
    ccd();
    if (paramContext == null)
    {
      w.w("MicroMsg.ChattingEditModeRetransmitMsg", "do retransmit fail, context is null");
      GMTrace.o(2511213690880L, 18710);
      return;
    }
    if ((paramList == null) || (paramList.isEmpty()))
    {
      w.w("MicroMsg.ChattingEditModeRetransmitMsg", "do retransmit fail, select item empty");
      GMTrace.o(2511213690880L, 18710);
      return;
    }
    if (!aa.a(paramList, paramdx))
    {
      com.tencent.mm.ui.base.h.a(paramContext, paramContext.getString(R.l.dDk), "", paramContext.getString(R.l.cUs), paramContext.getString(R.l.cSk), new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(2178622160896L, 16232);
          paramAnonymousDialogInterface = this.wuB;
          if ((paramAnonymousDialogInterface == null) || (paramAnonymousDialogInterface.isEmpty())) {
            w.w("MicroMsg.ChattingEditModeLogic", "check contain only invalid send to friend msg error, select item empty");
          }
          label34:
          for (paramAnonymousInt = 1;; paramAnonymousInt = 0)
          {
            if (paramAnonymousInt == 0) {
              break label195;
            }
            w.w("MicroMsg.ChattingEditModeRetransmitMsg", "only contain invalid msg, exit long click mode");
            if (paramdx != null) {
              paramdx.b(dx.a.wFS);
            }
            GMTrace.o(2178622160896L, 16232);
            return;
            paramAnonymousDialogInterface = paramAnonymousDialogInterface.iterator();
            if (!paramAnonymousDialogInterface.hasNext()) {
              break label34;
            }
            au localau = (au)paramAnonymousDialogInterface.next();
            if (aa.am(localau)) {
              break label34;
            }
            if ((localau.bTu()) || (aa.ah(localau)) || (aa.aj(localau)) || (aa.as(localau)) || (aa.ak(localau)) || (localau.field_type == -1879048186) || (aa.ar(localau)) || (aa.al(localau)) || (aa.aq(localau)) || (aa.am(localau)) || (localau.field_type == 318767153)) {
              break;
            }
          }
          label195:
          ab.b(paramContext, this.wuB, paramBoolean, paramString, paramdx);
          GMTrace.o(2178622160896L, 16232);
        }
      }, null);
      GMTrace.o(2511213690880L, 18710);
      return;
    }
    label144:
    int i;
    Iterator localIterator;
    if ((paramList == null) || (paramList.isEmpty()))
    {
      w.w("MicroMsg.ChattingEditModeLogic", "check contain invalid send to friend msg error, select item empty");
      break label228;
      i = 1;
      if (i == 0) {
        break label550;
      }
      w.i("MicroMsg.ChattingEditModeRetransmitMsg", "slected msg is all expired or clean!!!");
      if ((paramdx == null) || ((!paramdx.ccI()) && (paramList.size() != 1))) {
        break label559;
      }
      com.tencent.mm.ui.base.h.a(paramContext, paramContext.getString(R.l.dsf), paramContext.getString(R.l.cUG), new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(2399678758912L, 17879);
          GMTrace.o(2399678758912L, 17879);
        }
      });
      GMTrace.o(2511213690880L, 18710);
    }
    else
    {
      localIterator = paramList.iterator();
    }
    label228:
    label367:
    label544:
    label548:
    for (;;)
    {
      if (!localIterator.hasNext()) {
        break label144;
      }
      au localau = (au)localIterator.next();
      Object localObject3 = null;
      if (localau.bTO()) {
        break;
      }
      Object localObject1;
      Object localObject2;
      if (localau.bTC())
      {
        localObject1 = null;
        if (localau.field_msgId > 0L) {
          localObject1 = com.tencent.mm.ao.n.IZ().aq(localau.field_msgId);
        }
        if (localObject1 != null)
        {
          localObject2 = localObject1;
          if (((com.tencent.mm.ao.d)localObject1).gGR > 0L) {}
        }
        else
        {
          localObject2 = localObject1;
          if (localau.field_msgSvrId > 0L) {
            localObject2 = com.tencent.mm.ao.n.IZ().ap(localau.field_msgSvrId);
          }
        }
        localObject1 = localObject3;
        if (localObject2 != null) {
          localObject1 = com.tencent.mm.ao.n.IZ().l(com.tencent.mm.ao.e.c((com.tencent.mm.ao.d)localObject2), "", "");
        }
        if ((localau.bTC()) || (localau.bTG()) || (localau.bTH()) || (aa.au(localau))) {
          if ((System.currentTimeMillis() - localau.field_createTime <= 259200000L) || ((!bg.nm((String)localObject1)) && (com.tencent.mm.a.e.aZ((String)localObject1)))) {
            break label544;
          }
        }
      }
      for (i = 1;; i = 0)
      {
        if (i != 0) {
          break label548;
        }
        i = 0;
        break;
        if ((localau.bTH()) || (localau.bTG()))
        {
          o.Nh();
          localObject1 = com.tencent.mm.modelvideo.s.mk(localau.field_imgPath);
          break label367;
        }
        if (localau.aCp())
        {
          localObject2 = f.a.eS(localau.field_content);
          localObject1 = localObject3;
          if (localObject2 == null) {
            break label367;
          }
          localObject2 = com.tencent.mm.pluginsdk.model.app.l.OA(((f.a)localObject2).eAE);
          localObject1 = localObject3;
          if (localObject2 == null) {
            break label367;
          }
          localObject1 = ((com.tencent.mm.pluginsdk.model.app.b)localObject2).field_fileFullPath;
          break label367;
        }
        localObject1 = localau.field_imgPath;
        break label367;
      }
    }
    label550:
    b(paramContext, paramList, paramBoolean, paramString, paramdx);
    label559:
    GMTrace.o(2511213690880L, 18710);
  }
  
  public static void b(Context paramContext, List<au> paramList, boolean paramBoolean, String paramString, dx paramdx)
  {
    GMTrace.i(2511347908608L, 18711);
    if (aa.cF(paramList))
    {
      com.tencent.mm.ui.base.h.a(paramContext, paramContext.getString(R.l.dlQ), "", paramContext.getString(R.l.cPO), new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(2218887479296L, 16532);
          if (this.wuC != null)
          {
            paramAnonymousDialogInterface = this.wuC;
            dx.a locala = dx.a.wFS;
            paramAnonymousDialogInterface.ccH();
          }
          GMTrace.o(2218887479296L, 16532);
        }
      });
      GMTrace.o(2511347908608L, 18711);
      return;
    }
    wuA.wuG = new LinkedList(paramList);
    wuA.wqK = paramBoolean;
    wuA.wuz = paramdx;
    wuA.eRB = paramString;
    Intent localIntent = new Intent(paramContext, MsgRetransmitUI.class);
    au localau;
    Object localObject1;
    int i;
    if (paramList.size() == 1)
    {
      localau = (au)paramList.get(0);
      if ((localau.aCp()) || (localau.bTs()) || (localau.bTt()))
      {
        paramList = u.gy(localau.field_msgSvrId);
        localObject1 = u.Av().p(paramList, true);
        ((u.b)localObject1).o("prePublishId", "msg_" + localau.field_msgSvrId);
        ((u.b)localObject1).o("preUsername", ah.a(localau, paramBoolean, false));
        ((u.b)localObject1).o("preChatName", localau.field_talker);
        ((u.b)localObject1).o("preMsgIndex", Integer.valueOf(0));
        ((u.b)localObject1).o("sendAppMsgScene", Integer.valueOf(1));
        ((u.b)localObject1).o("moreRetrAction", Boolean.valueOf(true));
        if (paramBoolean)
        {
          ((u.b)localObject1).o("fromScene", Integer.valueOf(2));
          ((com.tencent.mm.plugin.sns.b.i)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.sns.b.i.class)).a("adExtStr", (u.b)localObject1, localau);
          localIntent.putExtra("reportSessionId", paramList);
        }
      }
      else
      {
        paramList = localau.field_content;
        j = 12;
        if (!localau.bTE()) {
          break label512;
        }
        i = 9;
        label352:
        if (!localau.bTs()) {
          break label1037;
        }
      }
    }
    label399:
    label512:
    label886:
    label893:
    label1037:
    for (int j = 1;; j = 2)
    {
      if ((paramdx != null) && (!paramdx.ccI()))
      {
        localIntent.putExtra("Retr_Msg_Type", 13);
        localIntent.putExtra("Retr_Multi_Msg_List_from", paramString);
        localIntent.putExtra("Retr_Msg_Id", localau.field_msgId);
        localIntent.putExtra("Retr_Msg_content", paramList);
        localIntent.putExtra("Edit_Mode_Sigle_Msg", true);
        i = j;
      }
      for (;;)
      {
        localIntent.putExtra("Retr_MsgFromScene", i);
        localIntent.putExtra("Retr_show_success_tips", true);
        paramContext.startActivity(localIntent);
        paramContext = wuA.wuG;
        at.xB().A(new ac.1(paramContext));
        GMTrace.o(2511347908608L, 18711);
        return;
        ((u.b)localObject1).o("fromScene", Integer.valueOf(1));
        break;
        if (localau.bTI())
        {
          i = 5;
          localIntent.putExtra("Retr_File_Name", localau.field_imgPath);
          break label352;
        }
        if (localau.bTD())
        {
          i = 8;
          break label352;
        }
        if (localau.bTF())
        {
          i = 4;
          j = i;
          if (!paramBoolean) {
            break label886;
          }
          j = i;
          if (localau.field_isSend != 0) {
            break label886;
          }
          paramList = bc.gQ(paramList);
          break label352;
        }
        if (localau.bTC())
        {
          localObject1 = null;
          if (localau.field_msgId > 0L) {
            localObject1 = com.tencent.mm.ao.n.IZ().aq(localau.field_msgId);
          }
          Object localObject2;
          if (localObject1 != null)
          {
            localObject2 = localObject1;
            if (((com.tencent.mm.ao.d)localObject1).gGR > 0L) {}
          }
          else
          {
            localObject2 = localObject1;
            if (localau.field_msgSvrId > 0L) {
              localObject2 = com.tencent.mm.ao.n.IZ().ap(localau.field_msgSvrId);
            }
          }
          localIntent.putExtra("Retr_File_Name", com.tencent.mm.ao.n.IZ().l(com.tencent.mm.ao.e.c((com.tencent.mm.ao.d)localObject2), "", ""));
          i = 0;
          break label352;
        }
        if (localau.bTH())
        {
          localObject1 = t.mw(localau.field_imgPath);
          if (localObject1 != null) {
            localIntent.putExtra("Retr_length", ((r)localObject1).hcv);
          }
          i = 11;
          localIntent.putExtra("Retr_File_Name", localau.field_imgPath);
          break label352;
        }
        if (localau.bTG())
        {
          localObject1 = t.mw(localau.field_imgPath);
          if (localObject1 != null) {
            localIntent.putExtra("Retr_length", ((r)localObject1).hcv);
          }
          i = 1;
          localIntent.putExtra("Retr_File_Name", localau.field_imgPath);
          break label352;
        }
        if (localau.aCp())
        {
          localObject1 = f.a.eS(paramList);
          if ((localObject1 == null) || (19 != ((f.a)localObject1).type)) {
            break label893;
          }
          i = 10;
        }
        for (;;)
        {
          if (!localau.bTs())
          {
            j = i;
            if (!localau.bTt()) {}
          }
          else
          {
            localIntent.putExtra("is_group_chat", paramBoolean);
            j = i;
          }
          i = j;
          break;
          if ((localObject1 != null) && (24 == ((f.a)localObject1).type)) {
            i = 10;
          } else if ((localObject1 != null) && (16 == ((f.a)localObject1).type)) {
            i = 14;
          } else {
            i = 2;
          }
        }
        localIntent.putExtra("Retr_Msg_Type", i);
        break label399;
        if (((paramdx != null) && (paramdx.ccI())) || ((com.tencent.mm.y.s.fD(paramString)) && (!com.tencent.mm.af.f.dL(paramString))) || (com.tencent.mm.y.s.gn(paramString)))
        {
          localIntent.putExtra("Retr_Msg_Type", 12);
          i = 2;
        }
        else
        {
          localIntent.putExtra("Retr_Msg_Type", 13);
          localIntent.putExtra("Retr_Multi_Msg_List_from", paramString);
          i = 2;
        }
      }
    }
  }
  
  public static void ccd()
  {
    GMTrace.i(2512018997248L, 18716);
    wuA.wuG = null;
    wuA.wqK = false;
    wuA.wuz = null;
    wuA.eRB = null;
    wuA.eQY = null;
    wuA.wuH = null;
    GMTrace.o(2512018997248L, 18716);
  }
  
  public static void d(Context paramContext, String paramString, au paramau, boolean paramBoolean)
  {
    GMTrace.i(16018885836800L, 119350);
    w.i("MicroMsg.ChattingEditModeRetransmitMsg", "retransmitSingleMsg %s", new Object[] { Long.valueOf(paramau.field_msgId) });
    if ((aa.ak(paramau)) || (aa.al(paramau)))
    {
      GMTrace.o(16018885836800L, 119350);
      return;
    }
    if ((com.tencent.mm.af.f.dL(paramString)) && (!paramau.bTC()) && (!paramau.bTF()) && (!paramau.bTu()))
    {
      w.i("MicroMsg.ChattingEditModeRetransmitMsg", "not bizChatSupport msg:type:%d", new Object[] { Integer.valueOf(paramau.field_type) });
      GMTrace.o(16018885836800L, 119350);
      return;
    }
    if (paramau.bTC())
    {
      aa.b(paramContext, paramString, paramau);
      GMTrace.o(16018885836800L, 119350);
      return;
    }
    if (paramau.bTG())
    {
      aa.c(paramContext, paramString, paramau);
      GMTrace.o(16018885836800L, 119350);
      return;
    }
    Object localObject1;
    int i;
    if (paramau.bTH())
    {
      aa.c(paramContext, paramString, paramau);
      paramBoolean = com.tencent.mm.y.s.eb(paramString);
      if (paramBoolean)
      {
        paramContext = a.c.wqA;
        localObject1 = a.d.wqD;
        if (!paramBoolean) {
          break label228;
        }
      }
      label228:
      for (i = m.fk(paramString);; i = 0)
      {
        a.a(paramContext, (a.d)localObject1, paramau, i);
        GMTrace.o(16018885836800L, 119350);
        return;
        paramContext = a.c.wqz;
        break;
      }
    }
    if (paramau.bTF())
    {
      aa.a(paramContext, paramString, paramau, paramBoolean);
      GMTrace.o(16018885836800L, 119350);
      return;
    }
    Object localObject2;
    if ((paramau.bTx()) || (paramau.aCp()))
    {
      boolean bool = com.tencent.mm.y.s.eb(paramString);
      if (bool)
      {
        localObject1 = a.c.wqA;
        localObject2 = a.d.wqD;
        if (!bool) {
          break label424;
        }
        i = m.fk(paramString);
        label304:
        a.a((a.c)localObject1, (a.d)localObject2, paramau, i);
        if (!paramau.bTJ()) {
          break label523;
        }
        if (!aa.a(paramContext, paramString, paramau, "appEmoji")) {
          break label513;
        }
        localObject1 = aj.Uf(paramau.field_content);
        paramContext = f.a.C(paramau.field_content, paramau.field_reserved);
        if (paramContext != null) {
          break label1291;
        }
        paramContext = new f.a();
        paramContext.gix = ((aj)localObject1).eDW;
      }
    }
    label424:
    label513:
    label523:
    label1291:
    for (;;)
    {
      if ((bg.nm(paramContext.gix)) || (paramContext.gix.equalsIgnoreCase("-1")))
      {
        w.e("MicroMsg.ChattingEditModeLogic", "emoji md5 is null. ignore resend");
        GMTrace.o(16018885836800L, 119350);
        return;
        localObject1 = a.c.wqz;
        break;
        i = 0;
        break label304;
      }
      w.d("MicroMsg.ChattingEditModeLogic", "jacks send App Emoji: %s, %s", new Object[] { paramString, paramContext.gix });
      paramContext = ((com.tencent.mm.plugin.emoji.b.c)com.tencent.mm.kernel.h.j(com.tencent.mm.plugin.emoji.b.c.class)).getEmojiMgr().vP(paramContext.gix);
      if (paramContext != null)
      {
        aa.b(paramContext, paramString);
        GMTrace.o(16018885836800L, 119350);
        return;
      }
      w.i("MicroMsg.ChattingEditModeLogic", "emoji is null. content:%s", new Object[] { localObject1 });
      GMTrace.o(16018885836800L, 119350);
      return;
      f.a locala;
      if ((paramau.bTs()) || (paramau.bTt()))
      {
        for (;;)
        {
          Object localObject3;
          try
          {
            localObject1 = ((com.tencent.mm.plugin.biz.a.a)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.biz.a.a.class)).tA(paramau.field_content);
            localObject2 = ((k)localObject1).glr;
            if (localObject2 == null) {
              break;
            }
            localObject2 = ((List)localObject2).iterator();
            if (!((Iterator)localObject2).hasNext()) {
              break;
            }
            localObject3 = (com.tencent.mm.x.l)((Iterator)localObject2).next();
            locala = new f.a();
            if (com.tencent.mm.x.h.eU(((com.tencent.mm.x.l)localObject3).glC))
            {
              ac.b(paramString, ac.a(paramString, (com.tencent.mm.x.l)localObject3), ((com.tencent.mm.x.l)localObject3).glH);
              continue;
            }
            locala.title = ((com.tencent.mm.x.l)localObject3).title;
          }
          catch (Exception paramContext)
          {
            w.printErrStackTrace("MicroMsg.ChattingEditModeLogic", paramContext, "", new Object[0]);
            w.e("MicroMsg.ChattingEditModeLogic", "[oneliang]retransmit multi app msg error : %s", new Object[] { paramContext.getLocalizedMessage() });
            GMTrace.o(16018885836800L, 119350);
            return;
          }
          locala.description = ((com.tencent.mm.x.l)localObject3).glz;
          locala.action = "view";
          locala.type = 5;
          locala.url = ((com.tencent.mm.x.l)localObject3).url;
          locala.eTo = ((k)localObject1).eTo;
          locala.eTp = ((k)localObject1).eTp;
          locala.fwt = ((k)localObject1).fwt;
          locala.thumburl = ((com.tencent.mm.x.l)localObject3).glx;
          if (bg.nm(locala.thumburl))
          {
            localObject3 = com.tencent.mm.ac.n.Di().ig(paramau.field_talker);
            if (localObject3 != null) {
              locala.thumburl = ((com.tencent.mm.ac.h)localObject3).Do();
            }
          }
          aa.a(paramContext, paramString, f.a.a(locala, null, null), paramau.field_isSend, paramBoolean);
        }
        GMTrace.o(16018885836800L, 119350);
        return;
      }
      if (paramau.field_isSend == 0) {}
      for (localObject1 = bc.gQ(paramau.field_content);; localObject1 = paramau.field_content)
      {
        locala = f.a.eS((String)localObject1);
        if (locala != null) {
          break;
        }
        w.e("MicroMsg.ChattingEditModeRetransmitMsg", "parse app message content fail");
        GMTrace.o(16018885836800L, 119350);
        return;
      }
      localObject1 = com.tencent.mm.pluginsdk.model.app.g.aP(locala.appId, false);
      if ((localObject1 != null) && (((com.tencent.mm.pluginsdk.model.app.f)localObject1).bJs()))
      {
        w.w("MicroMsg.ChattingEditModeRetransmitMsg", "do not forward game msg");
        GMTrace.o(16018885836800L, 119350);
        return;
      }
      if (locala.type == 19)
      {
        paramContext = new mn();
        paramContext.eRu.type = 4;
        paramContext.eRu.eRz = paramau;
        paramContext.eRu.toUser = paramString;
        com.tencent.mm.sdk.b.a.vgX.m(paramContext);
        GMTrace.o(16018885836800L, 119350);
        return;
      }
      if ((locala.type == 5) && (!bg.nm(locala.url))) {
        localObject1 = "";
      }
      try
      {
        localObject2 = URLEncoder.encode(locala.url, "UTF-8");
        localObject1 = localObject2;
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException)
      {
        for (;;)
        {
          long l;
          w.printErrStackTrace("MicroMsg.ChattingEditModeRetransmitMsg", localUnsupportedEncodingException, "", new Object[0]);
        }
      }
      l = bg.Pu();
      w.d("MicroMsg.ChattingEditModeRetransmitMsg", "report(%s), url : %s, clickTimestamp : %d, scene : %d, actionType : %d, flag : %d", new Object[] { Integer.valueOf(13378), locala.url, Long.valueOf(l), Integer.valueOf(2), Integer.valueOf(1), Integer.valueOf(1) });
      com.tencent.mm.plugin.report.service.g.ork.i(13378, new Object[] { localObject1, Long.valueOf(l), Integer.valueOf(2), Integer.valueOf(1), Integer.valueOf(1) });
      aa.b(paramContext, paramString, paramau, paramBoolean);
      GMTrace.o(16018885836800L, 119350);
      return;
      if (paramau.bTD())
      {
        if (aa.a(paramContext, paramString, paramau, "friendcard"))
        {
          paramContext = aa.q(paramau.field_content, paramau.field_isSend, paramBoolean);
          com.tencent.mm.plugin.messenger.a.d.aOe().A(paramString, paramContext, 42);
        }
        GMTrace.o(16018885836800L, 119350);
        return;
      }
      if ((paramau.bTI()) || (paramau.bTJ()))
      {
        if (!aa.ah(paramau))
        {
          aa.a(paramContext, paramString, paramau);
          GMTrace.o(16018885836800L, 119350);
        }
      }
      else if (paramau.bTE()) {
        aa.c(paramContext, paramString, paramau, paramBoolean);
      }
      GMTrace.o(16018885836800L, 119350);
      return;
    }
  }
  
  public static mn fr(Context paramContext)
  {
    GMTrace.i(2511750561792L, 18714);
    mn localmn = new mn();
    localmn.eRu.type = 6;
    localmn.eRu.eRA = wuA.wuG;
    localmn.eRu.eRB = wuA.eRB;
    localmn.eRu.context = paramContext;
    com.tencent.mm.sdk.b.a.vgX.m(localmn);
    wuA.eQY = localmn.eRv.eQY;
    wuA.wuH = localmn.eRv.eRD;
    GMTrace.o(2511750561792L, 18714);
    return localmn;
  }
  
  public static void k(Context paramContext, String paramString, boolean paramBoolean)
  {
    GMTrace.i(2511482126336L, 18712);
    Object localObject = new mn();
    ((mn)localObject).eRu.type = 5;
    ((mn)localObject).eRu.eRA = wuA.wuG;
    ((mn)localObject).eRu.toUser = paramString;
    ((mn)localObject).eRu.eRB = wuA.eRB;
    ((mn)localObject).eRu.context = paramContext;
    ((mn)localObject).eRu.eQY = wuA.eQY;
    ((mn)localObject).eRu.eRD = wuA.wuH;
    com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject);
    long l;
    f.a locala;
    if (wuA.wuG != null)
    {
      com.tencent.mm.plugin.report.service.g.ork.i(10811, new Object[] { Integer.valueOf(8), Integer.valueOf(wuA.wuG.size()), Integer.valueOf(wuA.wuG.size() - aa.cD(wuA.wuG)) });
      localObject = wuA.wuG.iterator();
      while (((Iterator)localObject).hasNext())
      {
        paramContext = (au)((Iterator)localObject).next();
        l = bg.Pu();
        locala = f.a.eS(bg.Sx(paramContext.field_content));
        if ((locala != null) && (locala.type == 5) && (!bg.nm(locala.url))) {
          if (!paramContext.bTs()) {
            break label447;
          }
        }
      }
    }
    label447:
    for (int i = 1;; i = 2)
    {
      paramContext = "";
      try
      {
        paramString = URLEncoder.encode(locala.url, "UTF-8");
        paramContext = paramString;
      }
      catch (UnsupportedEncodingException paramString)
      {
        for (;;)
        {
          w.printErrStackTrace("MicroMsg.ChattingEditModeRetransmitMsg", paramString, "", new Object[0]);
        }
      }
      w.d("MicroMsg.ChattingEditModeRetransmitMsg", "report(%s), url : %s, clickTimestamp : %d, scene : %d, actionType : %d, flag : %d", new Object[] { Integer.valueOf(13378), locala.url, Long.valueOf(l), Integer.valueOf(i), Integer.valueOf(1), Integer.valueOf(1) });
      com.tencent.mm.plugin.report.service.g.ork.i(13378, new Object[] { paramContext, Long.valueOf(l), Integer.valueOf(i), Integer.valueOf(1), Integer.valueOf(1) });
      break;
      if ((paramBoolean) && (wuA.wuz != null)) {
        wuA.wuz.b(dx.a.wFS);
      }
      GMTrace.o(2511482126336L, 18712);
      return;
    }
  }
  
  public static void l(Context paramContext, final String paramString, final boolean paramBoolean)
  {
    GMTrace.i(2511884779520L, 18715);
    if (paramContext == null)
    {
      w.w("MicroMsg.ChattingEditModeRetransmitMsg", "do try retransmit fail, context is null");
      GMTrace.o(2511884779520L, 18715);
      return;
    }
    if (bg.nm(paramString))
    {
      w.w("MicroMsg.ChattingEditModeRetransmitMsg", "do try retransmit fail, username is empty");
      GMTrace.o(2511884779520L, 18715);
      return;
    }
    if ((wuA.wuG == null) || (wuA.wuG.isEmpty()))
    {
      w.w("MicroMsg.ChattingEditModeRetransmitMsg", "do try retransmit fail, select items empty");
      GMTrace.o(2511884779520L, 18715);
      return;
    }
    w.v("MicroMsg.ChattingEditModeRetransmitMsg", "post to do job, send to %s", new Object[] { paramString });
    da.wzX.c(new ar.a()
    {
      public final boolean Dj()
      {
        GMTrace.i(2181977604096L, 16257);
        if (ab.wuA.wuG == null)
        {
          GMTrace.o(2181977604096L, 16257);
          return false;
        }
        Iterator localIterator = ab.wuA.wuG.iterator();
        while (localIterator.hasNext())
        {
          au localau = (au)localIterator.next();
          ab.d(this.val$context, paramString, localau, ab.wuA.wqK);
        }
        GMTrace.o(2181977604096L, 16257);
        return true;
      }
      
      public final boolean Dk()
      {
        GMTrace.i(2182111821824L, 16258);
        if (ab.wuA.wuG != null) {
          com.tencent.mm.plugin.report.service.g.ork.i(10811, new Object[] { Integer.valueOf(5), Integer.valueOf(ab.wuA.wuG.size()), Integer.valueOf(ab.wuA.wuG.size() - aa.cD(ab.wuA.wuG)) });
        }
        if (paramBoolean)
        {
          if (this.etm != null)
          {
            w.v("MicroMsg.ChattingEditModeRetransmitMsg", "call back is not null, do call back");
            this.etm.run();
          }
          if (ab.wuA.wuz != null) {
            ab.wuA.wuz.b(dx.a.wFS);
          }
          ab.ccd();
        }
        GMTrace.o(2182111821824L, 16258);
        return true;
      }
    });
    GMTrace.o(2511884779520L, 18715);
  }
  
  public static void lW(boolean paramBoolean)
  {
    GMTrace.i(2511616344064L, 18713);
    if ((paramBoolean) && (wuA.wuz != null)) {
      wuA.wuz.b(dx.a.wFS);
    }
    GMTrace.o(2511616344064L, 18713);
  }
  
  private static final class a
  {
    cf eQY;
    String eRB;
    boolean wqK;
    List<au> wuG;
    com.tencent.mm.protocal.b.a.d wuH;
    dx wuz;
    
    public a()
    {
      GMTrace.i(2494168039424L, 18583);
      GMTrace.o(2494168039424L, 18583);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\chatting\ab.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */