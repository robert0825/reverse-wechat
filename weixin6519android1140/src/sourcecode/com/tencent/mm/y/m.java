package com.tencent.mm.y;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.f;
import com.tencent.mm.ac.i;
import com.tencent.mm.g.a.ap;
import com.tencent.mm.g.a.aq;
import com.tencent.mm.g.a.aq.a;
import com.tencent.mm.g.a.js;
import com.tencent.mm.g.b.af;
import com.tencent.mm.kernel.e;
import com.tencent.mm.plugin.chatroom.c.a;
import com.tencent.mm.plugin.messenger.foundation.a.a.d;
import com.tencent.mm.plugin.messenger.foundation.a.a.e.a;
import com.tencent.mm.protocal.c.anz;
import com.tencent.mm.protocal.c.aop;
import com.tencent.mm.protocal.c.bk;
import com.tencent.mm.protocal.c.lf;
import com.tencent.mm.protocal.c.lg;
import com.tencent.mm.protocal.c.ot;
import com.tencent.mm.protocal.c.pc;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.RegionCodeDecoder;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import junit.framework.Assert;

public final class m
{
  public static f<String, String> gms;
  
  static
  {
    GMTrace.i(17485214515200L, 130275);
    gms = new f(100);
    GMTrace.o(17485214515200L, 130275);
  }
  
  public static String D(String paramString1, String paramString2)
  {
    GMTrace.i(17484006555648L, 130266);
    paramString1 = paramString2 + "#" + paramString1;
    if (gms.bE(paramString1))
    {
      paramString1 = (String)gms.get(paramString1);
      GMTrace.o(17484006555648L, 130266);
      return paramString1;
    }
    GMTrace.o(17484006555648L, 130266);
    return "";
  }
  
  public static String E(String paramString1, String paramString2)
  {
    GMTrace.i(17484543426560L, 130270);
    paramString2 = ((com.tencent.mm.plugin.chatroom.b.b)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.chatroom.b.b.class)).yT().gC(paramString2);
    if (paramString2 == null)
    {
      GMTrace.o(17484543426560L, 130270);
      return null;
    }
    paramString1 = paramString2.fs(paramString1);
    GMTrace.o(17484543426560L, 130270);
    return paramString1;
  }
  
  public static x a(x paramx, anz paramanz)
  {
    GMTrace.i(667598979072L, 4974);
    paramx.setUsername(com.tencent.mm.platformtools.n.a(paramanz.ufE));
    paramx.cl(com.tencent.mm.platformtools.n.a(paramanz.ufE));
    paramx.cm(com.tencent.mm.platformtools.n.a(paramanz.ufE));
    paramx.cn(com.tencent.mm.platformtools.n.a(paramanz.ufp));
    paramx.jdMethod_do(paramanz.gCx);
    paramx.cj(com.tencent.mm.platformtools.n.a(paramanz.uDR));
    paramx.cq(com.tencent.mm.platformtools.n.a(paramanz.uDS));
    paramx.cp(com.tencent.mm.platformtools.n.a(paramanz.ufp));
    paramx.dr(paramanz.ueL);
    paramx.dt(paramanz.gCB);
    paramx.cE(RegionCodeDecoder.ai(paramanz.gCG, paramanz.gCy, paramanz.gCz));
    paramx.cy(paramanz.gCA);
    GMTrace.o(667598979072L, 4974);
    return paramx;
  }
  
  public static void a(String paramString, com.tencent.mm.storage.q paramq, boolean paramBoolean)
  {
    GMTrace.i(665585713152L, 4959);
    paramq.kK(paramBoolean);
    ((com.tencent.mm.plugin.chatroom.b.b)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.chatroom.b.b.class)).yT().c(paramq, new String[0]);
    paramq = q.zE();
    aop localaop = new aop();
    localaop.ufz = paramString;
    localaop.jhi = paramq;
    localaop.uEm = 1;
    if (paramBoolean) {}
    for (int i = 1;; i = 2)
    {
      localaop.oqH = i;
      ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yJ().b(new e.a(49, localaop));
      GMTrace.o(665585713152L, 4959);
      return;
    }
  }
  
  public static void a(String paramString1, String paramString2, String paramString3, long paramLong, int paramInt)
  {
    GMTrace.i(17484946079744L, 130273);
    ae localae = ((com.tencent.mm.plugin.chatroom.b.b)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.chatroom.b.b.class)).yT();
    paramString1 = localae.gC(paramString1);
    if (paramString1 == null)
    {
      GMTrace.o(17484946079744L, 130273);
      return;
    }
    paramString1.field_chatroomVersion = paramInt;
    paramString1.field_chatroomnoticePublishTime = paramLong;
    paramString1.field_chatroomnoticeEditor = paramString3;
    paramString1.field_chatroomnotice = paramString2;
    localae.a(paramString1);
    GMTrace.o(17484946079744L, 130273);
  }
  
  public static boolean a(com.tencent.mm.storage.q paramq)
  {
    GMTrace.i(666391019520L, 4965);
    if (paramq == null)
    {
      w.e("MicroMsg.ChatroomMembersLogic", "updateChatroomMember error! member is null");
      GMTrace.o(666391019520L, 4965);
      return false;
    }
    boolean bool = ((com.tencent.mm.plugin.chatroom.b.b)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.chatroom.b.b.class)).yT().a(paramq);
    String str;
    ar localar;
    x localx;
    if (bool)
    {
      str = paramq.field_chatroomname;
      paramq = paramq.field_roomowner;
      w.d("MicroMsg.ChatroomMembersLogic", "update contact chatroom type to %d", new Object[] { Integer.valueOf(1) });
      localar = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yK();
      localx = localar.TE(str);
      if (((int)localx.fTq != 0) && (!bg.nm(paramq)) && (!bg.nm(q.zE())))
      {
        if (!paramq.equals(q.zE())) {
          break label170;
        }
        localx.eF(1);
      }
    }
    for (;;)
    {
      localar.a(str, localx);
      GMTrace.o(666391019520L, 4965);
      return bool;
      label170:
      localx.eF(0);
    }
  }
  
  public static boolean a(String paramString, bk parambk)
  {
    GMTrace.i(666659454976L, 4967);
    if ((!paramString.toLowerCase().endsWith("@chatroom")) || (parambk.jNj == 0))
    {
      w.e("MicroMsg.ChatroomMembersLogic", "AddChatroomMember: room:[" + paramString + "] listCnt:" + parambk.jNj);
      GMTrace.o(666659454976L, 4967);
      return false;
    }
    ArrayList localArrayList = new ArrayList();
    ar localar = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yK();
    int i = 0;
    while (i < parambk.jNj)
    {
      Object localObject = com.tencent.mm.platformtools.n.a(((anz)parambk.tPE.get(i)).ufE);
      if (((anz)parambk.tPE.get(i)).uDQ == 0)
      {
        if (bg.nm((String)localObject)) {
          w.e("MicroMsg.ChatroomMembersLogic", "this member name is null! chatRoomName : %s", new Object[] { paramString });
        }
      }
      else
      {
        i += 1;
        continue;
      }
      localObject = localar.TE((String)localObject);
      if ((int)((com.tencent.mm.l.a)localObject).fTq != 0)
      {
        ((x)localObject).uz();
        localar.a(((af)localObject).field_username, (x)localObject);
      }
      for (;;)
      {
        localArrayList.add(((af)localObject).field_username);
        break;
        localObject = a((x)localObject, (anz)parambk.tPE.get(i));
        localar.R((x)localObject);
      }
    }
    if (!localArrayList.isEmpty())
    {
      boolean bool = a(paramString, localArrayList, null);
      GMTrace.o(666659454976L, 4967);
      return bool;
    }
    GMTrace.o(666659454976L, 4967);
    return false;
  }
  
  public static boolean a(String paramString, lf paramlf)
  {
    GMTrace.i(17483872337920L, 130265);
    if (paramlf == null)
    {
      w.e("MicroMsg.ChatroomMembersLogic", "[updateChatroomInviteer] memberData is null!");
      GMTrace.o(17483872337920L, 130265);
      return false;
    }
    if (bg.nm(paramString))
    {
      w.e("MicroMsg.ChatroomMembersLogic", "[updateChatroomInviteer] username is null!");
      GMTrace.o(17483872337920L, 130265);
      return false;
    }
    if (s.eb(paramString))
    {
      w.e("MicroMsg.ChatroomMembersLogic", "[updateChatroomInviteer] username is not personal! :%s", new Object[] { paramString });
      GMTrace.o(17483872337920L, 130265);
      return false;
    }
    String str = com.tencent.mm.platformtools.n.a(paramlf.ubT);
    if (bg.nm(str))
    {
      w.e("MicroMsg.ChatroomMembersLogic", "[updateChatroomInviteer] chatroomId is null!");
      GMTrace.o(17483872337920L, 130265);
      return false;
    }
    w.i("MicroMsg.ChatroomMembersLogic", "[updateChatroomInviteer] chatroomId:%s size:%s", new Object[] { str, Integer.valueOf(paramlf.ubR.size()) });
    paramString = ((com.tencent.mm.plugin.chatroom.b.b)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.chatroom.b.b.class)).yT().gC(str);
    if ((paramString != null) && (paramlf.ubR.size() > 0) && (paramString.FT().contains(((lg)paramlf.ubR.get(0)).jhi)))
    {
      str = ((lg)paramlf.ubR.get(0)).jhi;
      com.tencent.mm.i.a.a.b localb = paramString.Tk(str);
      if (localb != null)
      {
        w.i("MicroMsg.ChatroomMembersLogic", "oldMember contains:%s displayName:%s", new Object[] { str, localb.fMz });
        localb.fMB = ((lg)paramlf.ubR.get(0)).ubY;
        a(paramString);
      }
      for (;;)
      {
        GMTrace.o(17483872337920L, 130265);
        return true;
        w.e("MicroMsg.ChatroomMembersLogic", "talker:%s oldMemberData is null!", new Object[] { str });
      }
    }
    if ((paramString != null) && (paramlf.ubR.size() > 0))
    {
      paramString = new aq();
      paramString.eBN.username = ((lg)paramlf.ubR.get(0)).jhi;
      paramString.eBN.eBO = ((lg)paramlf.ubR.get(0)).ubY;
      gms.put(str + "#" + paramString.eBN.username, paramString.eBN.eBO);
      com.tencent.mm.sdk.b.a.vgX.m(paramString);
      GMTrace.o(17483872337920L, 130265);
      return false;
    }
    if (paramlf.ubR.size() <= 0) {
      w.e("MicroMsg.ChatroomMembersLogic", "[updateChatroomInviteer] memberData.ChatRoomMember.size() <= 0");
    }
    if (paramString != null) {
      w.e("MicroMsg.ChatroomMembersLogic", "[updateChatroomInviteer] oldMember is null!");
    }
    GMTrace.o(17483872337920L, 130265);
    return false;
  }
  
  public static boolean a(String paramString, ot paramot)
  {
    GMTrace.i(666525237248L, 4966);
    if ((!paramString.toLowerCase().endsWith("@chatroom")) || (paramot.jNj == 0))
    {
      w.e("MicroMsg.ChatroomMembersLogic", "DelChatroomMember: room:[" + paramString + "] listCnt:" + paramot.jNj);
      GMTrace.o(666525237248L, 4966);
      return false;
    }
    ae localae = ((com.tencent.mm.plugin.chatroom.b.b)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.chatroom.b.b.class)).yT();
    paramString = localae.gC(paramString);
    List localList = com.tencent.mm.storage.q.Tm(paramString.field_memberlist);
    w.d("MicroMsg.ChatroomMembersLogic", "DelChatroomMember before " + localList.size());
    paramot = paramot.tPE.iterator();
    while (paramot.hasNext()) {
      localList.remove(com.tencent.mm.platformtools.n.a(((pc)paramot.next()).ufE));
    }
    w.d("MicroMsg.ChatroomMembersLogic", "DelChatroomMember after " + localList.size());
    paramString.ce(localList).field_displayname = t(localList);
    boolean bool = localae.a(paramString);
    w.d("MicroMsg.ChatroomMembersLogic", "delChatroomMember " + bool);
    GMTrace.o(666525237248L, 4966);
    return bool;
  }
  
  public static boolean a(String paramString1, String paramString2, lf paramlf, String paramString3, com.tencent.mm.i.a.a.a parama, com.tencent.mm.sdk.b.b paramb)
  {
    GMTrace.i(17483738120192L, 130264);
    if (((!paramString1.toLowerCase().endsWith("@chatroom")) && (!paramString1.toLowerCase().endsWith("@groupcard")) && (!paramString1.toLowerCase().endsWith("@talkroom"))) || (paramlf.jNj == 0))
    {
      w.e("MicroMsg.ChatroomMembersLogic", "SyncAddChatroomMember: room:[" + paramString1 + "] listCnt:" + paramlf.jNj);
      GMTrace.o(17483738120192L, 130264);
      return false;
    }
    ar localar = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yK();
    com.tencent.mm.storage.q localq = ((com.tencent.mm.plugin.chatroom.b.b)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.chatroom.b.b.class)).yT().gC(paramString1);
    if (localq != null) {
      parama.eNO = localq.bSo();
    }
    ArrayList localArrayList = new ArrayList();
    w.i("MicroMsg.ChatroomMembersLogic", "SyncAddChatroomMember: room:[" + paramString1 + "] memCnt:" + paramlf.jNj);
    long l = System.currentTimeMillis();
    boolean bool1 = false;
    int i = 0;
    Object localObject;
    while (i < paramlf.jNj)
    {
      lg locallg = (lg)paramlf.ubR.get(i);
      x localx = localar.TE(locallg.jhi);
      if (localx == null)
      {
        w.e("MicroMsg.ChatroomMembersLogic", "SyncAddChatroomMember memberlist username is null");
        i += 1;
      }
      else
      {
        com.tencent.mm.i.a.a.b localb = new com.tencent.mm.i.a.a.b();
        localb.userName = locallg.jhi;
        localb.fMB = locallg.ubY;
        if (paramlf.ubS == 0)
        {
          localb.fMz = locallg.ubU;
          localb.fMA = locallg.ubX;
          if (!bg.nm(locallg.ubW))
          {
            com.tencent.mm.ac.h localh = com.tencent.mm.ac.n.Di().ig(locallg.jhi);
            localObject = localh;
            if (localh == null)
            {
              localObject = new com.tencent.mm.ac.h();
              ((com.tencent.mm.ac.h)localObject).username = locallg.jhi;
            }
            ((com.tencent.mm.ac.h)localObject).gsU = locallg.ubV;
            ((com.tencent.mm.ac.h)localObject).gsT = locallg.ubW;
            ((com.tencent.mm.ac.h)localObject).fiZ = 3;
            if (bg.nm(locallg.ubV)) {
              break label562;
            }
          }
        }
        label562:
        for (boolean bool2 = true;; bool2 = false)
        {
          ((com.tencent.mm.ac.h)localObject).bi(bool2);
          com.tencent.mm.ac.n.Di().a((com.tencent.mm.ac.h)localObject);
          if (localq != null)
          {
            localObject = localq.Tk(locallg.jhi);
            if (localObject != null)
            {
              localb.fMz = ((com.tencent.mm.i.a.a.b)localObject).fMz;
              localb.fMA = ((com.tencent.mm.i.a.a.b)localObject).fMA;
              localb.fMB = ((com.tencent.mm.i.a.a.b)localObject).fMB;
            }
          }
          parama.fMv.add(localb);
          if ((int)localx.fTq == 0)
          {
            localx.setUsername(locallg.jhi);
            if (locallg.jio != null) {
              localx.cl(locallg.jio);
            }
            localx.uz();
            localar.R(localx);
            bool1 = true;
          }
          localArrayList.add(localx.field_username);
          break;
        }
      }
    }
    w.i("MicroMsg.ChatroomMembersLogic", "summertt SyncAddChatroomMember listUsernames size: " + localArrayList.size() + " event: " + paramb + " publish: " + bool1 + " take[" + (System.currentTimeMillis() - l) + "]ms");
    if (bool1)
    {
      com.tencent.mm.sdk.b.a.vgX.m(paramb);
      localObject = ((com.tencent.mm.plugin.chatroom.b.b)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.chatroom.b.b.class)).yT().gC(paramString1);
      paramb = (com.tencent.mm.sdk.b.b)localObject;
      if (localObject == null) {
        paramb = new com.tencent.mm.storage.q();
      }
      l = System.currentTimeMillis();
      paramb.field_chatroomname = paramString1;
      paramb.field_roomowner = paramString2;
      paramString2 = paramb.ce(localArrayList);
      paramString2.field_displayname = t(localArrayList);
      if (paramlf.ubS == 0) {
        break label902;
      }
    }
    label902:
    for (bool1 = true;; bool1 = false)
    {
      paramString2.a(paramString3, parama, bool1);
      bool1 = a(paramb);
      w.i("MicroMsg.ChatroomMembersLogic", "syncAddChatroomMember replaceChatroomMember ret : %s , during : %s", new Object[] { Boolean.valueOf(bool1), Long.valueOf(System.currentTimeMillis() - l) });
      if (paramb.bSp())
      {
        w.i("MicroMsg.ChatroomMembersLogic", "syncAddChatroomMember OldVer:%d", new Object[] { Integer.valueOf(paramb.bSo()) });
        paramString2 = new ap();
        paramString2.eBM.username = paramString1;
        com.tencent.mm.sdk.b.a.vgX.m(paramString2);
      }
      GMTrace.o(17483738120192L, 130264);
      return bool1;
      if (localq != null)
      {
        com.tencent.mm.storage.q.bSq();
        break;
      }
      w.i("MicroMsg.ChatroomMembersLogic", "ChatroomId:%s is Need Update All InviteerInfo ", new Object[] { paramString1 });
      ((js)paramb).eNN.eNO = 0;
      com.tencent.mm.sdk.b.a.vgX.m(paramb);
      break;
    }
  }
  
  public static boolean a(String paramString1, ArrayList<String> paramArrayList, String paramString2)
  {
    int i = 0;
    int k = 0;
    GMTrace.i(666793672704L, 4968);
    ae localae = ((com.tencent.mm.plugin.chatroom.b.b)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.chatroom.b.b.class)).yT();
    com.tencent.mm.storage.q localq = localae.gD(paramString1);
    if (paramString1.endsWith("@chatroom")) {}
    LinkedList localLinkedList;
    int j;
    for (paramString1 = fi(paramString1);; paramString1 = new LinkedList())
    {
      localLinkedList = new LinkedList();
      if (paramString1 == null) {
        break label214;
      }
      i = 0;
      for (;;)
      {
        j = k;
        if (i >= paramString1.size()) {
          break;
        }
        localLinkedList.add(paramString1.get(i));
        i += 1;
      }
    }
    while (j < paramArrayList.size())
    {
      if (!paramString1.contains(paramArrayList.get(j))) {
        localLinkedList.add(paramArrayList.get(j));
      }
      j += 1;
    }
    if (!bg.nm(paramString2)) {
      localq.field_roomowner = paramString2;
    }
    localq.ce(localLinkedList).field_displayname = t(localLinkedList);
    boolean bool = localae.a(localq);
    GMTrace.o(666793672704L, 4968);
    return bool;
    label214:
    while (i < paramArrayList.size())
    {
      localLinkedList.add(paramArrayList.get(i));
      i += 1;
    }
    if (!bg.nm(paramString2)) {
      localq.field_roomowner = paramString2;
    }
    localq.ce(localLinkedList).field_displayname = t(localLinkedList);
    localq.field_roomowner = paramString2;
    bool = localae.a(localq);
    w.d("MicroMsg.ChatroomMembersLogic", "insertMembersByChatRoomName " + bool);
    GMTrace.o(666793672704L, 4968);
    return bool;
  }
  
  public static boolean a(String paramString, Map<String, String> paramMap)
  {
    GMTrace.i(665317277696L, 4957);
    paramString = ((com.tencent.mm.plugin.chatroom.b.b)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.chatroom.b.b.class)).yT().gC(paramString);
    if (paramString == null)
    {
      GMTrace.o(665317277696L, 4957);
      return false;
    }
    Iterator localIterator = paramString.FT().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      paramMap.put(str, paramString.fs(str));
    }
    GMTrace.o(665317277696L, 4957);
    return true;
  }
  
  public static String b(List<String> paramList, int paramInt)
  {
    GMTrace.i(665854148608L, 4961);
    if ((paramList == null) || (paramList.size() == 0))
    {
      GMTrace.o(665854148608L, 4961);
      return "";
    }
    Object localObject1 = "";
    int i = 0;
    Object localObject2 = localObject1;
    if (i < paramList.size())
    {
      localObject2 = (String)paramList.get(i);
      if (((String)localObject2).length() <= 0) {
        break label220;
      }
      localObject2 = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yK().TE((String)localObject2);
      localObject2 = (String)localObject1 + ((x)localObject2).vk();
      if ((i == paramInt - 1) && (i < paramList.size())) {
        localObject2 = (String)localObject2 + "...";
      }
    }
    else
    {
      GMTrace.o(665854148608L, 4961);
      return (String)localObject2;
    }
    localObject1 = localObject2;
    if (i < paramList.size() - 1) {
      localObject1 = (String)localObject2 + ab.getContext().getString(c.a.deV);
    }
    label220:
    for (;;)
    {
      i += 1;
      break;
    }
  }
  
  public static boolean fa(String paramString)
  {
    GMTrace.i(17483603902464L, 130263);
    paramString = ((com.tencent.mm.plugin.chatroom.b.b)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.chatroom.b.b.class)).yT().gC(paramString);
    if (paramString == null)
    {
      GMTrace.o(17483603902464L, 130263);
      return false;
    }
    boolean bool = paramString.bSt();
    GMTrace.o(17483603902464L, 130263);
    return bool;
  }
  
  public static boolean fb(String paramString)
  {
    GMTrace.i(665451495424L, 4958);
    paramString = ((com.tencent.mm.plugin.chatroom.b.b)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.chatroom.b.b.class)).yT().gE(paramString);
    String str = q.zE();
    if ((!bg.nm(paramString)) && (!bg.nm(str)) && (paramString.equals(str)))
    {
      GMTrace.o(665451495424L, 4958);
      return true;
    }
    GMTrace.o(665451495424L, 4958);
    return false;
  }
  
  public static boolean fc(String paramString)
  {
    GMTrace.i(665988366336L, 4962);
    String str = (String)com.tencent.mm.kernel.h.xy().xh().get(2, null);
    paramString = fi(paramString);
    if (paramString == null)
    {
      w.d("MicroMsg.ChatroomMembersLogic", "getmembsersbychatroomname is null ");
      GMTrace.o(665988366336L, 4962);
      return false;
    }
    if ((paramString.size() == 0) || (!paramString.contains(str)))
    {
      w.d("MicroMsg.ChatroomMembersLogic", "getmembsersbychatroomname is list is zero or no contains user  " + paramString.size() + " ");
      GMTrace.o(665988366336L, 4962);
      return false;
    }
    GMTrace.o(665988366336L, 4962);
    return true;
  }
  
  public static boolean fd(String paramString)
  {
    GMTrace.i(666122584064L, 4963);
    if ((paramString == null) || (!paramString.toLowerCase().endsWith("@chatroom")))
    {
      GMTrace.o(666122584064L, 4963);
      return false;
    }
    if (!((com.tencent.mm.plugin.chatroom.b.b)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.chatroom.b.b.class)).yT().gH(paramString))
    {
      w.d("MicroMsg.ChatroomMembersLogic", "state is die");
      GMTrace.o(666122584064L, 4963);
      return true;
    }
    paramString = ((com.tencent.mm.plugin.chatroom.b.b)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.chatroom.b.b.class)).yT().gG(paramString);
    if ((paramString == null) || (paramString.size() == 0))
    {
      GMTrace.o(666122584064L, 4963);
      return true;
    }
    GMTrace.o(666122584064L, 4963);
    return false;
  }
  
  public static boolean fe(String paramString)
  {
    GMTrace.i(666256801792L, 4964);
    if ((paramString == null) || (!paramString.toLowerCase().endsWith("@chatroom")))
    {
      GMTrace.o(666256801792L, 4964);
      return false;
    }
    w.d("MicroMsg.ChatroomMembersLogic", "updateFailState chatRoomName %s", new Object[] { paramString });
    ae localae = ((com.tencent.mm.plugin.chatroom.b.b)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.chatroom.b.b.class)).yT();
    paramString = localae.gC(paramString);
    if (paramString == null)
    {
      GMTrace.o(666256801792L, 4964);
      return false;
    }
    paramString.field_roomflag = 1;
    boolean bool = localae.a(paramString);
    GMTrace.o(666256801792L, 4964);
    return bool;
  }
  
  public static boolean ff(String paramString)
  {
    GMTrace.i(17484140773376L, 130267);
    if (!paramString.toLowerCase().endsWith("@groupcard"))
    {
      w.e("MicroMsg.ChatroomMembersLogic", "deleteWholeGroupcard: room:[" + paramString + "]");
      GMTrace.o(17484140773376L, 130267);
      return false;
    }
    ar localar = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yK();
    if (localar.TG(paramString)) {
      localar.TK(paramString);
    }
    for (;;)
    {
      boolean bool = fh(paramString);
      GMTrace.o(17484140773376L, 130267);
      return bool;
      w.e("MicroMsg.ChatroomMembersLogic", "deleteWholeGroupcard RoomName not exist:[" + paramString + "]");
    }
  }
  
  public static boolean fg(String paramString)
  {
    GMTrace.i(17484274991104L, 130268);
    if (!paramString.toLowerCase().endsWith("@chatroom"))
    {
      w.e("MicroMsg.ChatroomMembersLogic", "deleteWholeChatroom: room:[" + paramString + "]");
      GMTrace.o(17484274991104L, 130268);
      return false;
    }
    ar localar = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yK();
    if (localar.TG(paramString)) {
      localar.TK(paramString);
    }
    for (;;)
    {
      boolean bool = fh(paramString);
      GMTrace.o(17484274991104L, 130268);
      return bool;
      w.e("MicroMsg.ChatroomMembersLogic", "deleteWholeChatroom RoomName not exist:[" + paramString + "]");
    }
  }
  
  private static boolean fh(String paramString)
  {
    GMTrace.i(666927890432L, 4969);
    boolean bool = ((com.tencent.mm.plugin.chatroom.b.b)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.chatroom.b.b.class)).yT().gI(paramString);
    GMTrace.o(666927890432L, 4969);
    return bool;
  }
  
  public static List<String> fi(String paramString)
  {
    GMTrace.i(667062108160L, 4970);
    if (paramString == null)
    {
      w.e("MicroMsg.ChatroomMembersLogic", "chatroomName is null");
      GMTrace.o(667062108160L, 4970);
      return null;
    }
    if (!paramString.toLowerCase().endsWith("@chatroom"))
    {
      w.e("MicroMsg.ChatroomMembersLogic", "getMembersByChatRoomName: this is not room:[" + paramString + "]");
      GMTrace.o(667062108160L, 4970);
      return null;
    }
    paramString = ((com.tencent.mm.plugin.chatroom.b.b)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.chatroom.b.b.class)).yT().gG(paramString);
    GMTrace.o(667062108160L, 4970);
    return paramString;
  }
  
  public static List<String> fj(String paramString)
  {
    GMTrace.i(667196325888L, 4971);
    if (!paramString.toLowerCase().endsWith("@chatroom"))
    {
      w.e("MicroMsg.ChatroomMembersLogic", "getMembersByChatRoomName: room:[" + paramString + "]");
      GMTrace.o(667196325888L, 4971);
      return null;
    }
    paramString = ((com.tencent.mm.plugin.chatroom.b.b)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.chatroom.b.b.class)).yT().gG(paramString);
    GMTrace.o(667196325888L, 4971);
    return paramString;
  }
  
  public static int fk(String paramString)
  {
    GMTrace.i(667330543616L, 4972);
    List localList = fi(paramString);
    if (localList == null)
    {
      w.e("MicroMsg.ChatroomMembersLogic", "getMembersByChatRoomName: get room:[" + paramString + "] members count fail");
      GMTrace.o(667330543616L, 4972);
      return 0;
    }
    int i = localList.size();
    GMTrace.o(667330543616L, 4972);
    return i;
  }
  
  public static List<String> fl(String paramString)
  {
    int i = 0;
    GMTrace.i(667464761344L, 4973);
    if (!paramString.toLowerCase().endsWith("@chatroom"))
    {
      w.e("MicroMsg.ChatroomMembersLogic", "getOtherMembersByChatRoomName: room:[" + paramString + "]");
      GMTrace.o(667464761344L, 4973);
      return null;
    }
    paramString = fi(paramString);
    if ((paramString == null) || (paramString.size() <= 0))
    {
      GMTrace.o(667464761344L, 4973);
      return null;
    }
    String str = (String)com.tencent.mm.kernel.h.xy().xh().get(2, null);
    boolean bool;
    if ((str != null) && (str.length() > 0))
    {
      bool = true;
      Assert.assertTrue(bool);
    }
    for (;;)
    {
      if (i < paramString.size())
      {
        if (((String)paramString.get(i)).equals(str)) {
          paramString.remove(i);
        }
      }
      else
      {
        if (paramString.size() > 0) {
          break label191;
        }
        GMTrace.o(667464761344L, 4973);
        return null;
        bool = false;
        break;
      }
      i += 1;
    }
    label191:
    GMTrace.o(667464761344L, 4973);
    return paramString;
  }
  
  public static String fm(String paramString)
  {
    GMTrace.i(667733196800L, 4975);
    paramString = ((com.tencent.mm.plugin.chatroom.b.b)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.chatroom.b.b.class)).yT().gC(paramString);
    if (paramString == null)
    {
      GMTrace.o(667733196800L, 4975);
      return null;
    }
    paramString = paramString.field_chatroomnotice;
    GMTrace.o(667733196800L, 4975);
    return paramString;
  }
  
  public static String fn(String paramString)
  {
    GMTrace.i(17484677644288L, 130271);
    paramString = ((com.tencent.mm.plugin.chatroom.b.b)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.chatroom.b.b.class)).yT().gC(paramString);
    if (paramString == null)
    {
      GMTrace.o(17484677644288L, 130271);
      return null;
    }
    paramString = paramString.field_chatroomnoticeEditor;
    GMTrace.o(17484677644288L, 130271);
    return paramString;
  }
  
  public static long fo(String paramString)
  {
    GMTrace.i(17484811862016L, 130272);
    paramString = ((com.tencent.mm.plugin.chatroom.b.b)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.chatroom.b.b.class)).yT().gC(paramString);
    if (paramString == null)
    {
      GMTrace.o(17484811862016L, 130272);
      return -1L;
    }
    long l = paramString.field_chatroomnoticePublishTime;
    GMTrace.o(17484811862016L, 130272);
    return l;
  }
  
  public static String t(List<String> paramList)
  {
    GMTrace.i(665719930880L, 4960);
    paramList = b(paramList, -1);
    GMTrace.o(665719930880L, 4960);
    return paramList;
  }
  
  public static boolean u(String paramString, int paramInt)
  {
    GMTrace.i(667867414528L, 4976);
    paramString = ((com.tencent.mm.plugin.chatroom.b.b)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.chatroom.b.b.class)).yT().gC(paramString);
    if (paramString == null)
    {
      GMTrace.o(667867414528L, 4976);
      return false;
    }
    if (paramString.field_chatroomVersion < paramInt)
    {
      GMTrace.o(667867414528L, 4976);
      return true;
    }
    GMTrace.o(667867414528L, 4976);
    return false;
  }
  
  public static void v(String paramString, int paramInt)
  {
    GMTrace.i(17485080297472L, 130274);
    ae localae = ((com.tencent.mm.plugin.chatroom.b.b)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.chatroom.b.b.class)).yT();
    com.tencent.mm.storage.q localq = localae.gC(paramString);
    if (localq == null)
    {
      GMTrace.o(17485080297472L, 130274);
      return;
    }
    com.tencent.mm.i.a.a.a locala = localq.bSu();
    locala.type = paramInt;
    localq.a(paramString, locala, false);
    localae.a(localq);
    GMTrace.o(17485080297472L, 130274);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\y\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */