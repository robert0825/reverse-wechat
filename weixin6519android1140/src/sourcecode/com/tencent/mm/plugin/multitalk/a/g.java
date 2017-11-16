package com.tencent.mm.plugin.multitalk.a;

import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.mq;
import com.tencent.mm.pluginsdk.p.f;
import com.tencent.mm.pluginsdk.p.g;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.y.at;
import com.tencent.mm.y.r;
import com.tencent.mm.y.s;
import com.tencent.pb.common.b.a.a.av;
import com.tencent.pb.common.b.a.a.bb;
import com.tencent.pb.talkroom.sdk.MultiTalkGroup;
import com.tencent.wecall.talkroom.model.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class g
  implements p.g
{
  private List<p.f> gEV;
  private ae handler;
  private LinkedList<String> nmM;
  private LinkedList<String> nmN;
  private LinkedList<String> nmO;
  
  public g()
  {
    GMTrace.i(4757884239872L, 35449);
    this.gEV = new ArrayList();
    this.nmM = null;
    this.nmN = new LinkedList();
    this.nmO = new LinkedList();
    this.handler = new ae(Looper.getMainLooper());
    GMTrace.o(4757884239872L, 35449);
  }
  
  private static boolean b(String paramString, a.bb parambb)
  {
    int i = 0;
    GMTrace.i(4761910771712L, 35479);
    if (parambb == null)
    {
      GMTrace.o(4761910771712L, 35479);
      return false;
    }
    com.tencent.mm.as.b localb = new com.tencent.mm.as.b();
    localb.field_wxGroupId = paramString;
    localb.field_groupId = parambb.groupId;
    localb.field_roomId = parambb.qGO;
    localb.field_roomKey = parambb.qGP;
    localb.field_routeId = parambb.xLh;
    localb.field_inviteUserName = parambb.xOj;
    parambb = parambb.xMu;
    if (parambb.length > 0) {
      i = parambb.length;
    }
    localb.field_memberCount = i;
    localb.field_createTime = System.currentTimeMillis();
    if (o.aRN().De(paramString) == null)
    {
      bool = o.aRN().a(localb);
      GMTrace.o(4761910771712L, 35479);
      return bool;
    }
    boolean bool = o.aRN().b(localb);
    GMTrace.o(4761910771712L, 35479);
    return bool;
  }
  
  static boolean c(String paramString, a.bb parambb)
  {
    GMTrace.i(4762044989440L, 35480);
    if (parambb == null)
    {
      GMTrace.o(4762044989440L, 35480);
      return false;
    }
    a.av[] arrayOfav = parambb.xMu;
    LinkedList localLinkedList1 = new LinkedList();
    int j = arrayOfav.length;
    int i = 0;
    while (i < j)
    {
      localLinkedList1.add(arrayOfav[i].xMH);
      i += 1;
    }
    at.AR();
    String str = (String)com.tencent.mm.y.c.xh().get(2, null);
    if (str == null)
    {
      w.i("MicroMsg.MultiTalkRoomListMsg", "myUserName is null , go save delete all logic.");
      b(paramString, parambb);
      GMTrace.o(4762044989440L, 35480);
      return true;
    }
    Object localObject1 = o.aRO().Df(paramString);
    LinkedList localLinkedList2 = new LinkedList();
    parambb = null;
    Object localObject2 = ((List)localObject1).iterator();
    if (((Iterator)localObject2).hasNext())
    {
      localObject1 = (com.tencent.mm.plugin.multitalk.b.b)((Iterator)localObject2).next();
      localLinkedList2.add(((com.tencent.mm.plugin.multitalk.b.b)localObject1).field_userName);
      if (!((com.tencent.mm.plugin.multitalk.b.b)localObject1).field_userName.equals(str)) {
        break label799;
      }
      parambb = (a.bb)localObject1;
    }
    label799:
    for (;;)
    {
      break;
      if ((parambb != null) && (localLinkedList1.contains(str)))
      {
        j = arrayOfav.length;
        bool1 = true;
        i = 0;
        for (;;)
        {
          bool2 = bool1;
          if (i >= j) {
            break;
          }
          localObject1 = arrayOfav[i];
          bool2 = bool1;
          if (((a.av)localObject1).xMH != null)
          {
            bool2 = bool1;
            if (((a.av)localObject1).xMH.equals(str))
            {
              bool2 = bool1;
              if (((a.av)localObject1).status != parambb.field_status)
              {
                localObject2 = new com.tencent.mm.plugin.multitalk.b.b();
                ((com.tencent.mm.plugin.multitalk.b.b)localObject2).field_wxGroupId = paramString;
                ((com.tencent.mm.plugin.multitalk.b.b)localObject2).field_inviteUserName = ((a.av)localObject1).xNN;
                ((com.tencent.mm.plugin.multitalk.b.b)localObject2).field_memberUuid = ((a.av)localObject1).tLG;
                ((com.tencent.mm.plugin.multitalk.b.b)localObject2).field_userName = ((a.av)localObject1).xMH;
                ((com.tencent.mm.plugin.multitalk.b.b)localObject2).field_status = ((a.av)localObject1).status;
                if (!o.aRO().a((com.tencent.mm.plugin.multitalk.b.b)localObject2))
                {
                  w.e("MicroMsg.MultiTalkRoomListMsg", "updateMultiTalkMembers update myself failure! wxGroupId = %s,userName = %s,field_memberUuid = %d,multiTalkMember.field_inviteUserName = %s", new Object[] { paramString, ((a.av)localObject1).xMH, Long.valueOf(((com.tencent.mm.plugin.multitalk.b.b)localObject2).field_memberUuid), ((com.tencent.mm.plugin.multitalk.b.b)localObject2).field_inviteUserName });
                  bool1 = false;
                }
                w.i("MicroMsg.MultiTalkRoomListMsg", "updateMultiTalkMembers update myself success! wxGroupId = %s,userName = %s,field_memberUuid = %d,multiTalkMember.field_inviteUserName = %s", new Object[] { paramString, ((a.av)localObject1).xMH, Long.valueOf(((com.tencent.mm.plugin.multitalk.b.b)localObject2).field_memberUuid), ((com.tencent.mm.plugin.multitalk.b.b)localObject2).field_inviteUserName });
                bool2 = bool1;
              }
            }
          }
          i += 1;
          bool1 = bool2;
        }
      }
      boolean bool2 = true;
      j = arrayOfav.length;
      boolean bool1 = bool2;
      i = 0;
      while (i < j)
      {
        parambb = arrayOfav[i];
        bool2 = bool1;
        if (!localLinkedList2.contains(parambb.xMH))
        {
          localObject1 = new com.tencent.mm.plugin.multitalk.b.b();
          ((com.tencent.mm.plugin.multitalk.b.b)localObject1).field_wxGroupId = paramString;
          ((com.tencent.mm.plugin.multitalk.b.b)localObject1).field_inviteUserName = parambb.xNN;
          ((com.tencent.mm.plugin.multitalk.b.b)localObject1).field_memberUuid = parambb.tLG;
          ((com.tencent.mm.plugin.multitalk.b.b)localObject1).field_userName = parambb.xMH;
          ((com.tencent.mm.plugin.multitalk.b.b)localObject1).field_status = parambb.status;
          if (!o.aRO().a((com.tencent.mm.plugin.multitalk.b.b)localObject1))
          {
            w.e("MicroMsg.MultiTalkRoomListMsg", "updateMultiTalkMembers save multiTalkMember failure! wxGroupId = %s,userName = %s,field_memberUuid = %d,multiTalkMember.field_inviteUserName = %s", new Object[] { paramString, parambb.xMH, Long.valueOf(((com.tencent.mm.plugin.multitalk.b.b)localObject1).field_memberUuid), ((com.tencent.mm.plugin.multitalk.b.b)localObject1).field_inviteUserName });
            bool1 = false;
          }
          w.i("MicroMsg.MultiTalkRoomListMsg", "updateMultiTalkMembers save multiTalkMember success! wxGroupId = %s,userName = %s,field_memberUuid = %d,multiTalkMember.field_inviteUserName = %s", new Object[] { paramString, parambb.xMH, Long.valueOf(((com.tencent.mm.plugin.multitalk.b.b)localObject1).field_memberUuid), ((com.tencent.mm.plugin.multitalk.b.b)localObject1).field_inviteUserName });
          bool2 = bool1;
        }
        i += 1;
        bool1 = bool2;
      }
      parambb = localLinkedList2.iterator();
      while (parambb.hasNext())
      {
        localObject1 = (String)parambb.next();
        bool2 = bool1;
        if (!localLinkedList1.contains(localObject1))
        {
          if (o.aRO().bA(paramString, (String)localObject1))
          {
            w.i("MicroMsg.MultiTalkRoomListMsg", "updateMultiTalkMembers delete success for wxGroupId = " + paramString + ", username = " + (String)localObject1);
          }
          else
          {
            bool2 = false;
            w.e("MicroMsg.MultiTalkRoomListMsg", "updateMultiTalkMembers delete fail for wxGroupId = " + paramString + ", username = " + (String)localObject1);
          }
        }
        else {
          bool1 = bool2;
        }
      }
      GMTrace.o(4762044989440L, 35480);
      return bool1;
    }
  }
  
  public final void CR(final String paramString)
  {
    GMTrace.i(4758286893056L, 35452);
    if ((s.eb(paramString)) && (CT(paramString)))
    {
      w.i("MicroMsg.MultiTalkRoomListMsg", "isKicked! now clean banner and check if i am in multitalk.");
      at.AR();
      com.tencent.mm.y.c.xh().get(2, null);
      if ((o.aRR().nmp != null) && (o.aRR().nmp.xOz.equals(paramString)))
      {
        w.i("MicroMsg.MultiTalkRoomListMsg", "yes i am now in multitalk so i exit now!");
        o.aRR().c(false, false, false);
      }
      this.handler.postDelayed(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(4770366488576L, 35542);
          g.this.Da(paramString);
          mq localmq = new mq();
          localmq.eRK.type = 2;
          com.tencent.mm.sdk.b.a.vgX.m(localmq);
          GMTrace.o(4770366488576L, 35542);
        }
      }, 2000L);
    }
    GMTrace.o(4758286893056L, 35452);
  }
  
  public final boolean CS(String paramString)
  {
    GMTrace.i(4758421110784L, 35453);
    com.tencent.mm.as.b localb = o.aRN().De(paramString);
    if ((localb != null) && (localb.field_wxGroupId != null) && (localb.field_wxGroupId.equals(paramString)))
    {
      if (System.currentTimeMillis() - localb.field_createTime > 21600000L)
      {
        w.i("MicroMsg.MultiTalkRoomListMsg", "wxGroupId:" + paramString + ",is out of time 6 hours..");
        Da(paramString);
        GMTrace.o(4758421110784L, 35453);
        return false;
      }
      GMTrace.o(4758421110784L, 35453);
      return true;
    }
    GMTrace.o(4758421110784L, 35453);
    return false;
  }
  
  public final boolean CT(String paramString)
  {
    GMTrace.i(4758555328512L, 35454);
    if (this.nmM == null) {
      aRG();
    }
    if ((this.nmM != null) && (this.nmM.contains(paramString)))
    {
      GMTrace.o(4758555328512L, 35454);
      return true;
    }
    GMTrace.o(4758555328512L, 35454);
    return false;
  }
  
  public final List<String> CU(String paramString)
  {
    GMTrace.i(4758689546240L, 35455);
    Object localObject = o.aRO().Df(paramString);
    paramString = new LinkedList();
    localObject = ((List)localObject).iterator();
    while (((Iterator)localObject).hasNext()) {
      paramString.add(((com.tencent.mm.plugin.multitalk.b.b)((Iterator)localObject).next()).field_userName);
    }
    GMTrace.o(4758689546240L, 35455);
    return paramString;
  }
  
  public final boolean CV(String paramString)
  {
    GMTrace.i(4759629070336L, 35462);
    Object localObject1 = com.tencent.mm.plugin.voip.model.d.btH();
    if (localObject1 != null)
    {
      Object localObject2 = ((com.tencent.mm.plugin.voip.ui.g)localObject1).intent;
      if (localObject2 != null)
      {
        localObject2 = ((Intent)localObject2).getStringExtra("enterMainUiWxGroupId");
        localObject1 = ((com.tencent.mm.plugin.voip.ui.g)localObject1).qNB;
        if ((!com.tencent.pb.common.c.h.yp((String)localObject2)) && (paramString.equals(localObject2)) && (localObject1 != null) && (((com.tencent.mm.plugin.voip.ui.h)localObject1).getVisibility() == 0) && (((com.tencent.mm.plugin.voip.ui.h)localObject1).isShown()))
        {
          GMTrace.o(4759629070336L, 35462);
          return true;
        }
      }
    }
    GMTrace.o(4759629070336L, 35462);
    return false;
  }
  
  public final boolean CW(String paramString)
  {
    GMTrace.i(4760300158976L, 35467);
    paramString = o.aRN().De(paramString);
    if (paramString != null)
    {
      boolean bool = com.tencent.wecall.talkroom.model.a.crb().b(paramString.field_groupId, paramString.field_roomId, paramString.field_roomKey, 1);
      GMTrace.o(4760300158976L, 35467);
      return bool;
    }
    GMTrace.o(4760300158976L, 35467);
    return false;
  }
  
  public final void CX(String paramString)
  {
    GMTrace.i(4760434376704L, 35468);
    if (this.nmN == null)
    {
      this.nmN = new LinkedList();
      if (!this.nmN.contains(paramString))
      {
        this.nmN.add(paramString);
        GMTrace.o(4760434376704L, 35468);
      }
    }
    else if (!this.nmN.contains(paramString))
    {
      this.nmN.add(paramString);
    }
    GMTrace.o(4760434376704L, 35468);
  }
  
  public final boolean CY(String paramString)
  {
    GMTrace.i(4760568594432L, 35469);
    paramString = o.aRN().De(paramString);
    if (paramString != null)
    {
      boolean bool = o.aRQ().nlX.CY(paramString.field_groupId);
      GMTrace.o(4760568594432L, 35469);
      return bool;
    }
    GMTrace.o(4760568594432L, 35469);
    return false;
  }
  
  public final boolean CZ(String paramString)
  {
    GMTrace.i(4760702812160L, 35470);
    paramString = o.aRN().De(paramString);
    if (paramString != null)
    {
      boolean bool = o.aRQ().nlX.a(paramString.field_groupId, paramString.field_roomId, paramString.field_roomKey, paramString.field_routeId);
      GMTrace.o(4760702812160L, 35470);
      return bool;
    }
    GMTrace.o(4760702812160L, 35470);
    return false;
  }
  
  public final void Da(String paramString)
  {
    GMTrace.i(4760971247616L, 35472);
    if (com.tencent.pb.common.c.h.isNullOrEmpty(paramString))
    {
      w.e("MicroMsg.MultiTalkRoomListMsg", "cleanBanner failure ! wxGroupId is null or empty!");
      GMTrace.o(4760971247616L, 35472);
      return;
    }
    w.i("MicroMsg.MultiTalkRoomListMsg", "cleanBanner  wxGroupId = %s", new Object[] { paramString });
    hB(paramString);
    o.aRO().hB(paramString);
    Dd(paramString);
    GMTrace.o(4760971247616L, 35472);
  }
  
  public final void Db(String paramString)
  {
    GMTrace.i(4761239683072L, 35474);
    if (this.nmN == null)
    {
      this.nmN = new LinkedList();
      GMTrace.o(4761239683072L, 35474);
      return;
    }
    this.nmN.remove(paramString);
    GMTrace.o(4761239683072L, 35474);
  }
  
  public final boolean Dc(String paramString)
  {
    GMTrace.i(4761373900800L, 35475);
    if (this.nmN == null)
    {
      GMTrace.o(4761373900800L, 35475);
      return false;
    }
    boolean bool = this.nmN.contains(paramString);
    GMTrace.o(4761373900800L, 35475);
    return bool;
  }
  
  final void Dd(final String paramString)
  {
    GMTrace.i(4761508118528L, 35476);
    Iterator localIterator = this.gEV.iterator();
    while (localIterator.hasNext())
    {
      final p.f localf = (p.f)localIterator.next();
      this.handler.post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(4739362193408L, 35311);
          localf.Ob(paramString);
          GMTrace.o(4739362193408L, 35311);
        }
      });
    }
    GMTrace.o(4761508118528L, 35476);
  }
  
  public final com.tencent.mm.as.b De(String paramString)
  {
    GMTrace.i(15358400397312L, 114429);
    paramString = o.aRN().De(paramString);
    GMTrace.o(15358400397312L, 114429);
    return paramString;
  }
  
  public final void a(p.f paramf)
  {
    try
    {
      GMTrace.i(4758018457600L, 35450);
      this.gEV.add(paramf);
      GMTrace.o(4758018457600L, 35450);
      return;
    }
    finally
    {
      paramf = finally;
      throw paramf;
    }
  }
  
  public final void a(String paramString, a.bb parambb)
  {
    GMTrace.i(4761105465344L, 35473);
    w.i("MicroMsg.MultiTalkRoomListMsg", "showBanner  wxGroupId = %s", new Object[] { paramString });
    if (parambb != null)
    {
      a.av[] arrayOfav = parambb.xMu;
      if ((arrayOfav != null) && (arrayOfav.length > 0))
      {
        o.aRO().hB(paramString);
        int j = arrayOfav.length;
        int i = 0;
        while (i < j)
        {
          a.av localav = arrayOfav[i];
          com.tencent.mm.plugin.multitalk.b.b localb = new com.tencent.mm.plugin.multitalk.b.b();
          localb.field_wxGroupId = paramString;
          localb.field_inviteUserName = localav.xNN;
          localb.field_memberUuid = localav.tLG;
          localb.field_userName = localav.xMH;
          localb.field_status = localav.status;
          if (!o.aRO().a(localb)) {
            w.e("MicroMsg.MultiTalkRoomListMsg", "save multiTalkMember failure! wxGroupId = %s,userName = %s,field_memberUuid = %d,multiTalkMember.field_inviteUserName = %s", new Object[] { paramString, localav.xMH, Long.valueOf(localb.field_memberUuid), localb.field_inviteUserName });
          }
          w.i("MicroMsg.MultiTalkRoomListMsg", "save multiTalkMember success! wxGroupId = %s,userName = %s,field_memberUuid = %d,multiTalkMember.field_inviteUserName = %s", new Object[] { paramString, localav.xMH, Long.valueOf(localb.field_memberUuid), localb.field_inviteUserName });
          i += 1;
        }
      }
    }
    if (b(paramString, parambb))
    {
      w.i("MicroMsg.MultiTalkRoomListMsg", "addwxGroupIdInMap:" + paramString);
      if (this.nmM == null) {
        break label305;
      }
      if (!this.nmM.contains(paramString)) {
        this.nmM.add(paramString);
      }
    }
    for (;;)
    {
      Dd(paramString);
      GMTrace.o(4761105465344L, 35473);
      return;
      label305:
      aRG();
      if (this.nmM != null) {
        this.nmM.add(paramString);
      }
    }
  }
  
  public final boolean aR(Context paramContext)
  {
    GMTrace.i(4760165941248L, 35466);
    boolean bool = com.tencent.mm.p.a.aR(paramContext);
    GMTrace.o(4760165941248L, 35466);
    return bool;
  }
  
  public final LinkedList<String> aRD()
  {
    GMTrace.i(4757750022144L, 35448);
    if (this.nmO == null) {
      this.nmO = new LinkedList();
    }
    LinkedList localLinkedList = this.nmO;
    GMTrace.o(4757750022144L, 35448);
    return localLinkedList;
  }
  
  public final boolean aRE()
  {
    GMTrace.i(4759494852608L, 35461);
    if ((o.aRR().aRq()) && ((o.aRR().nmo == com.tencent.mm.plugin.multitalk.ui.widget.e.noG) || (o.aRR().nmo == com.tencent.mm.plugin.multitalk.ui.widget.e.noF)))
    {
      GMTrace.o(4759494852608L, 35461);
      return true;
    }
    GMTrace.o(4759494852608L, 35461);
    return false;
  }
  
  public final boolean aRF()
  {
    GMTrace.i(4759763288064L, 35463);
    if ((com.tencent.mm.plugin.voip.b.d.bvN()) || (o.aRR().aRs()) || (o.aRR().aRq()) || (o.aRR().aRr()))
    {
      GMTrace.o(4759763288064L, 35463);
      return true;
    }
    GMTrace.o(4759763288064L, 35463);
    return false;
  }
  
  public final void aRG()
  {
    GMTrace.i(4761776553984L, 35478);
    Object localObject = o.aRN().aRV();
    w.i("MicroMsg.MultiTalkRoomListMsg", "setMultitalkingwxGroupIdMap reset!");
    this.nmM = new LinkedList();
    localObject = ((LinkedList)localObject).iterator();
    while (((Iterator)localObject).hasNext())
    {
      com.tencent.mm.as.b localb = (com.tencent.mm.as.b)((Iterator)localObject).next();
      this.nmM.add(localb.field_wxGroupId);
    }
    localObject = new mq();
    ((mq)localObject).eRK.type = 1;
    com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject);
    GMTrace.o(4761776553984L, 35478);
  }
  
  public final boolean aRq()
  {
    GMTrace.i(4759092199424L, 35458);
    boolean bool = o.aRR().aRq();
    GMTrace.o(4759092199424L, 35458);
    return bool;
  }
  
  public final boolean aRs()
  {
    GMTrace.i(4759226417152L, 35459);
    boolean bool = o.aRR().aRs();
    GMTrace.o(4759226417152L, 35459);
    return bool;
  }
  
  public final void b(p.f paramf)
  {
    try
    {
      GMTrace.i(4758152675328L, 35451);
      this.gEV.remove(paramf);
      GMTrace.o(4758152675328L, 35451);
      return;
    }
    finally
    {
      paramf = finally;
      throw paramf;
    }
  }
  
  public final boolean cX(String paramString1, String paramString2)
  {
    GMTrace.i(4758823763968L, 35456);
    if (o.aRO().da(paramString1, paramString2) != null)
    {
      GMTrace.o(4758823763968L, 35456);
      return true;
    }
    GMTrace.o(4758823763968L, 35456);
    return false;
  }
  
  public final String cY(String paramString1, String paramString2)
  {
    GMTrace.i(4759897505792L, 35464);
    paramString1 = o.aRO().da(paramString1, paramString2);
    if (paramString1 != null)
    {
      paramString1 = paramString1.field_inviteUserName;
      GMTrace.o(4759897505792L, 35464);
      return paramString1;
    }
    GMTrace.o(4759897505792L, 35464);
    return null;
  }
  
  public final int cZ(String paramString1, String paramString2)
  {
    GMTrace.i(4760837029888L, 35471);
    paramString1 = o.aRO().da(paramString1, paramString2);
    if (paramString1 != null)
    {
      int i = paramString1.field_status;
      GMTrace.o(4760837029888L, 35471);
      return i;
    }
    GMTrace.o(4760837029888L, 35471);
    return 30;
  }
  
  public final String fs(String paramString)
  {
    GMTrace.i(4760031723520L, 35465);
    paramString = r.fs(paramString);
    GMTrace.o(4760031723520L, 35465);
    return paramString;
  }
  
  public final boolean hB(String paramString)
  {
    GMTrace.i(4758957981696L, 35457);
    if (this.nmM != null)
    {
      w.i("MicroMsg.MultiTalkRoomListMsg", "removewxGroupIdInMap:" + paramString);
      this.nmM.remove(paramString);
    }
    for (;;)
    {
      boolean bool = o.aRN().hB(paramString);
      GMTrace.o(4758957981696L, 35457);
      return bool;
      aRG();
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\multitalk\a\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */