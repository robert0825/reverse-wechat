package com.tencent.mm.plugin.chatroom.d;

import android.os.HandlerThread;
import android.util.Pair;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.h;
import com.tencent.mm.ac.n;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.bu.g;
import com.tencent.mm.i.a.a.a;
import com.tencent.mm.protocal.c.lf;
import com.tencent.mm.protocal.c.lg;
import com.tencent.mm.protocal.c.yz;
import com.tencent.mm.protocal.c.za;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.x;
import com.tencent.mm.y.ae;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class i
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private final String chatroomName;
  private final com.tencent.mm.ad.b fUa;
  private com.tencent.mm.ad.e fUd;
  
  public i(String paramString, int paramInt)
  {
    GMTrace.i(9065333784576L, 67542);
    this.fUd = null;
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new yz();
    ((b.a)localObject).gtG = new za();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/getchatroommemberdetail";
    ((b.a)localObject).gtE = 551;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    this.chatroomName = paramString;
    at.AR();
    int j = c.yT().gD(paramString).bSo();
    ((yz)this.fUa.gtC.gtK).upU = paramString;
    localObject = (yz)this.fUa.gtC.gtK;
    if (j < paramInt) {}
    for (int i = paramInt;; i = j)
    {
      ((yz)localObject).tTC = i;
      w.i("MicroMsg.NetSceneGetChatroomMemberDetail", "summerChatRoom chatroomName:%s, oldVer:%d, localVer:%d, stack[%s]", new Object[] { paramString, Integer.valueOf(paramInt), Integer.valueOf(j), bg.bQW() });
      GMTrace.o(9065333784576L, 67542);
      return;
    }
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(9065468002304L, 67543);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(9065468002304L, 67543);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, com.tencent.mm.network.q paramq, final byte[] paramArrayOfByte)
  {
    GMTrace.i(9065736437760L, 67545);
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      w.e("MicroMsg.NetSceneGetChatroomMemberDetail", "onGYNetEnd errType:%d, errCode:%d, errMsg:%s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(9065736437760L, 67545);
      return;
    }
    w.i("MicroMsg.NetSceneGetChatroomMemberDetail", "onGYNetEnd errType:%d, errCode:%d, errMsg:%s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    paramq = (za)this.fUa.gtD.gtK;
    at.AR();
    paramArrayOfByte = c.yT().gD(this.chatroomName);
    long l1 = paramArrayOfByte.bSo();
    long l2 = 0xFFFFFFFF & paramq.jgZ;
    int i = paramq.jgZ;
    if (paramq.upV == null) {}
    for (paramInt1 = 0;; paramInt1 = paramq.upV.jNj)
    {
      w.i("MicroMsg.NetSceneGetChatroomMemberDetail", "summerChatRoom svrVer:%d, modCnt:%d， localVer:%d", new Object[] { Integer.valueOf(i), Integer.valueOf(paramInt1), Long.valueOf(l1) });
      if (l1 < l2) {
        break;
      }
      w.e("MicroMsg.NetSceneGetChatroomMemberDetail", "summerChatRoom localVer[%d] serverVer[%d] is new and return", new Object[] { Long.valueOf(l1), Long.valueOf(l2) });
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(9065736437760L, 67545);
      return;
    }
    paramInt1 = paramq.jgZ;
    if (paramArrayOfByte.b(paramArrayOfByte.vpr)) {
      paramArrayOfByte.bSn();
    }
    paramArrayOfByte.vpr.eNO = paramInt1;
    try
    {
      paramArrayOfByte.field_roomdata = paramArrayOfByte.vpr.toByteArray();
      com.tencent.mm.storage.q.bSq();
      if (paramq.upV == null)
      {
        paramq = null;
        if (paramq != null) {
          break label523;
        }
        paramInt1 = -1;
        w.i("MicroMsg.NetSceneGetChatroomMemberDetail", "summerChatRoom memInfoList size[%d]", new Object[] { Integer.valueOf(paramInt1) });
        String str = com.tencent.mm.y.q.zE();
        if (paramArrayOfByte.b(paramArrayOfByte.vpr)) {
          paramArrayOfByte.bSn();
        }
        localObject1 = paramq.iterator();
        while (((Iterator)localObject1).hasNext())
        {
          localObject2 = (lg)((Iterator)localObject1).next();
          if (paramArrayOfByte.gya.containsKey(((lg)localObject2).jhi))
          {
            localObject3 = (com.tencent.mm.i.a.a.b)paramArrayOfByte.gya.get(((lg)localObject2).jhi);
            ((com.tencent.mm.i.a.a.b)localObject3).fMz = ((lg)localObject2).ubU;
            ((com.tencent.mm.i.a.a.b)localObject3).fMA = ((lg)localObject2).ubX;
            ((com.tencent.mm.i.a.a.b)localObject3).fMB = ((lg)localObject2).ubY;
          }
        }
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.e("MicroMsg.ChatRoomMember", "exception:%s", new Object[] { bg.f(localException) });
        continue;
        paramq = paramq.upV.ubR;
        continue;
        label523:
        paramInt1 = paramq.size();
      }
      paramArrayOfByte.vpr.fMv.clear();
      final Object localObject1 = paramArrayOfByte.gya.keySet().iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (String)((Iterator)localObject1).next();
        paramArrayOfByte.vpr.fMv.add(paramArrayOfByte.gya.get(localObject2));
      }
      paramArrayOfByte.a(localException, paramArrayOfByte.vpr, false);
      at.AR();
      c.yT().a(paramArrayOfByte);
      at.AR();
      paramArrayOfByte = c.yK();
      final com.tencent.mm.ac.i locali = n.Di();
      localObject1 = new LinkedList();
      final Object localObject2 = new LinkedList();
      Object localObject3 = paramq.iterator();
      while (((Iterator)localObject3).hasNext())
      {
        lg locallg = (lg)((Iterator)localObject3).next();
        if ((!bg.nm(locallg.ubW)) && (!bg.nm(locallg.jhi)))
        {
          paramq = locali.ig(locallg.jhi);
          if (paramq != null) {
            break label846;
          }
          paramq = new h();
          paramq.username = locallg.jhi;
          label761:
          paramq.gsU = locallg.ubV;
          paramq.gsT = locallg.ubW;
          paramq.fiZ = 3;
          if (bg.nm(locallg.ubV)) {
            break label863;
          }
        }
        label846:
        label863:
        for (boolean bool = true;; bool = false)
        {
          paramq.bi(bool);
          ((LinkedList)localObject2).add(paramq);
          paramq = paramArrayOfByte.TE(locallg.jhi);
          if (paramq != null) {
            break label869;
          }
          w.e("MicroMsg.NetSceneGetChatroomMemberDetail", "NetSceneGetChatroomMemberDetail memberlist username is null");
          break;
          paramq.Dp().equals(locallg.ubW);
          break label761;
        }
        label869:
        if (paramq.uY())
        {
          paramq.cl(locallg.jio);
          ((LinkedList)localObject1).add(new Pair(locallg.jhi, paramq));
        }
      }
      w.d("MicroMsg.NetSceneGetChatroomMemberDetail", "summerChatRoom update newImgFlagList size:%d, updateList size:%d", new Object[] { Integer.valueOf(((LinkedList)localObject2).size()), Integer.valueOf(((LinkedList)localObject1).size()) });
      if (!((LinkedList)localObject2).isEmpty()) {
        new aj(at.xB().ngv.getLooper(), new aj.a()
        {
          public final boolean pM()
          {
            GMTrace.i(9060501946368L, 67506);
            if (localObject2.size() < 25) {}
            for (int i = localObject2.size();; i = 25)
            {
              w.d("MicroMsg.NetSceneGetChatroomMemberDetail", "summerChatRoom update img list size:%d, loopCount:%d", new Object[] { Integer.valueOf(localObject2.size()), Integer.valueOf(i) });
              if (i != 0) {
                break;
              }
              w.i("MicroMsg.NetSceneGetChatroomMemberDetail", "summerChatRoom update img done loopCount is 0");
              GMTrace.o(9060501946368L, 67506);
              return false;
            }
            if (localObject2.isEmpty())
            {
              w.i("MicroMsg.NetSceneGetChatroomMemberDetail", "summerChatRoom update img done newImgFlagList is empty");
              GMTrace.o(9060501946368L, 67506);
              return false;
            }
            long l1 = System.currentTimeMillis();
            at.AR();
            long l2 = c.yH().cE(Thread.currentThread().getId());
            int j = 0;
            while (j < i)
            {
              h localh = (h)localObject2.poll();
              if (localh == null) {
                break;
              }
              locali.a(localh);
              j += 1;
            }
            at.AR();
            c.yH().aL(l2);
            w.d("MicroMsg.NetSceneGetChatroomMemberDetail", "summerChatRoom update img loopCount:%d, take time:%d(ms)", new Object[] { Integer.valueOf(i), Long.valueOf(System.currentTimeMillis() - l1) });
            if (localObject2.isEmpty())
            {
              w.i("MicroMsg.NetSceneGetChatroomMemberDetail", "summerChatRoom update img done newImgFlagList is empty");
              GMTrace.o(9060501946368L, 67506);
              return false;
            }
            GMTrace.o(9060501946368L, 67506);
            return true;
          }
        }, true).z(100L, 100L);
      }
      if (!((LinkedList)localObject1).isEmpty()) {
        new aj(at.xB().ngv.getLooper(), new aj.a()
        {
          public final boolean pM()
          {
            GMTrace.i(9064662695936L, 67537);
            if (localObject1.size() < 25) {}
            for (int i = localObject1.size();; i = 25)
            {
              w.d("MicroMsg.NetSceneGetChatroomMemberDetail", "summerChatRoom update ctg list size:%d, loopCount:%d", new Object[] { Integer.valueOf(localObject1.size()), Integer.valueOf(i) });
              if (i != 0) {
                break;
              }
              w.i("MicroMsg.NetSceneGetChatroomMemberDetail", "summerChatRoom update ctg done loopCount is 0");
              GMTrace.o(9064662695936L, 67537);
              return false;
            }
            long l1 = System.currentTimeMillis();
            at.AR();
            long l2 = c.yH().cE(Thread.currentThread().getId());
            int j = 0;
            while (j < i)
            {
              Pair localPair = (Pair)localObject1.poll();
              paramArrayOfByte.a((String)localPair.first, (x)localPair.second);
              j += 1;
            }
            at.AR();
            c.yH().aL(l2);
            w.d("MicroMsg.NetSceneGetChatroomMemberDetail", "summerChatRoom update ctg loopCount:%d, take time:%d(ms)", new Object[] { Integer.valueOf(i), Long.valueOf(System.currentTimeMillis() - l1) });
            if (localObject1.isEmpty())
            {
              w.i("MicroMsg.NetSceneGetChatroomMemberDetail", "summerChatRoom update ctg done updateList is empty");
              GMTrace.o(9064662695936L, 67537);
              return false;
            }
            GMTrace.o(9064662695936L, 67537);
            return true;
          }
        }, true).z(100L, 100L);
      }
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(9065736437760L, 67545);
    }
  }
  
  public final int getType()
  {
    GMTrace.i(9065602220032L, 67544);
    GMTrace.o(9065602220032L, 67544);
    return 551;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\chatroom\d\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */