package com.tencent.mm.plugin.backup.e;

import android.util.Pair;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.af;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.plugin.backup.h.u;
import com.tencent.mm.plugin.messenger.foundation.a.a.f;
import com.tencent.mm.pluginsdk.model.app.l;
import com.tencent.mm.pointers.PLong;
import com.tencent.mm.protocal.c.azp;
import com.tencent.mm.protocal.c.azq;
import com.tencent.mm.protocal.c.ek;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.au;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.x;
import com.tencent.mm.y.b;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public final class a
{
  public static final class a
  {
    public static ek a(au paramau, boolean paramBoolean1, String paramString, PLong paramPLong, LinkedList<u> paramLinkedList, HashMap<Long, a.c> paramHashMap, boolean paramBoolean2, boolean paramBoolean3, long paramLong)
    {
      GMTrace.i(14820455743488L, 110421);
      if (paramau.field_msgSvrId == 0L)
      {
        w.e("MicroMsg.BackupMsgLogic.BackupPackMsgLogic", "msg svr Id == 0" + paramau.field_talker + " " + paramau.field_type);
        GMTrace.o(14820455743488L, 110421);
        return null;
      }
      ek localek = new ek();
      localek.tQd = paramau.field_msgSvrId;
      localek.tQb = "";
      Object localObject1;
      Object localObject2;
      if (paramau.field_isSend == 1)
      {
        localObject1 = paramau.field_talker;
        i = 2;
        localObject2 = paramString;
      }
      for (;;)
      {
        localek.tSZ = i;
        localek.tTe = new azp();
        localek.tTf = 0;
        localek.tTg = 0;
        localek.tQb = "";
        localek.tPW = new azq().Rq((String)localObject2);
        localek.tPX = new azq().Rq((String)localObject1);
        localek.jib = l.yQ(paramau.field_type);
        localek.tTa = ((int)(paramau.field_createTime / 1000L));
        localek.tTh = ((int)paramau.field_msgSeq);
        localek.tTi = paramau.field_createTime;
        localek.tTj = paramau.field_flag;
        localObject1 = new azq();
        ((azq)localObject1).Rq(bg.aq(paramau.field_content, ""));
        localek.tPY = ((azq)localObject1);
        localObject1 = h.afg().kx(l.yQ(paramau.field_type));
        if (localObject1 != null) {
          break;
        }
        w.d("MicroMsg.BackupMsgLogic.BackupPackMsgLogic", "unknow type ");
        GMTrace.o(14820455743488L, 110421);
        return null;
        localObject1 = paramau.field_talker;
        Object localObject3;
        if (paramBoolean2)
        {
          i = 3;
          localObject2 = paramString;
          localObject3 = localObject1;
          localObject1 = localObject2;
          localObject2 = localObject3;
        }
        else
        {
          i = 4;
          localObject2 = paramString;
          localObject3 = localObject1;
          localObject1 = localObject2;
          localObject2 = localObject3;
        }
      }
      int i = ((e)localObject1).a(localek, paramBoolean1, paramau, paramString, paramLinkedList, paramHashMap, paramBoolean3, paramLong);
      if (i < 0)
      {
        GMTrace.o(14820455743488L, 110421);
        return null;
      }
      paramPLong.value += i;
      paramPLong.value += 60L;
      GMTrace.o(14820455743488L, 110421);
      return localek;
    }
  }
  
  public static final class b
  {
    public static au a(ek paramek, HashMap<String, Integer> paramHashMap, HashSet<String> paramHashSet, HashMap<String, Pair<Long, Long>> paramHashMap1)
    {
      GMTrace.i(18458561478656L, 137527);
      String str3 = (String)com.tencent.mm.plugin.backup.g.a.afG().afH().xh().get(2, null);
      com.tencent.mm.plugin.messenger.foundation.a.a.c localc = com.tencent.mm.plugin.backup.g.a.afG().afH().yM();
      String str1 = paramek.tPW.uNR;
      String str2 = paramek.tPX.uNR;
      w.i("MicroMsg.BackupMsgLogic.BackupRecoverMsgLogic", "recoverMsg, type:%d, from:%s, to:%s", new Object[] { Integer.valueOf(paramek.jib), str1, str2 });
      Object localObject = com.tencent.mm.plugin.backup.g.a.afG().afH();
      if (((com.tencent.mm.plugin.backup.g.c)localObject).uin == 0) {
        throw new b();
      }
      localObject = ((com.tencent.mm.plugin.backup.g.c)localObject).jcz;
      ar localar = com.tencent.mm.plugin.backup.g.a.afG().afH().yK();
      int i;
      if ((((f)localObject).has(str1)) || (str3.equals(str1)))
      {
        i = 1;
        if (i == 0) {
          break label240;
        }
        localObject = str2;
        label163:
        if (paramek.tTi == 0L) {
          break label247;
        }
      }
      label240:
      label247:
      for (long l = paramek.tTi;; l = paramek.tTa * 1000L)
      {
        paramHashMap1 = (Pair)paramHashMap1.get(localObject);
        if ((paramHashMap1 == null) || ((l >= ((Long)paramHashMap1.first).longValue()) && (l <= ((Long)paramHashMap1.second).longValue()))) {
          break label261;
        }
        GMTrace.o(18458561478656L, 137527);
        return null;
        i = 0;
        break;
        localObject = str1;
        break label163;
      }
      label261:
      if (paramHashSet != null) {
        paramHashSet.add(localObject);
      }
      paramHashSet = com.tencent.mm.plugin.backup.a.h.aet();
      if ((paramHashSet.contains(str1)) || (paramHashSet.contains(str2)))
      {
        w.w("MicroMsg.BackupMsgLogic.BackupRecoverMsgLogic", "hit the blockList: " + str1 + " " + str2);
        GMTrace.o(18458561478656L, 137527);
        return null;
      }
      if ((bg.nm(str1)) || (bg.nm(str2)))
      {
        w.w("MicroMsg.BackupMsgLogic.BackupRecoverMsgLogic", "form or to convName is null");
        GMTrace.o(18458561478656L, 137527);
        return null;
      }
      if ((paramek.tQd == 0L) && (paramek.tPV != 0)) {
        paramek.tQd = paramek.tPV;
      }
      if (paramek.tQd != 0L)
      {
        if (str3.equals(str1)) {}
        for (paramHashSet = str2;; paramHashSet = str1)
        {
          paramHashSet = localc.B(paramHashSet, paramek.tQd);
          if (paramHashSet.field_msgId == 0L) {
            break;
          }
          w.i("MicroMsg.BackupMsgLogic.BackupRecoverMsgLogic", "msg exist");
          GMTrace.o(18458561478656L, 137527);
          return null;
        }
      }
      w.w("MicroMsg.BackupMsgLogic.BackupRecoverMsgLogic", "drop the item server id < 0");
      GMTrace.o(18458561478656L, 137527);
      return null;
      if (paramek.tQd != 0L) {
        paramHashSet.D(paramek.tQd);
      }
      paramHashSet.G(paramek.tTh);
      if (paramek.tTi != 0L) {
        paramHashSet.E(paramek.tTi);
      }
      for (;;)
      {
        paramHashSet.dL(paramek.tTj);
        paramHashSet.setType(paramek.jib);
        if (i == 0) {
          break label705;
        }
        paramHashMap1 = localar.TE(str2);
        if ((paramHashMap1 == null) || (bg.nm(paramHashMap1.field_username)) || (!paramHashMap1.bSA())) {
          break;
        }
        w.w("MicroMsg.BackupMsgLogic.BackupRecoverMsgLogic", "hit the blockList: " + str2);
        GMTrace.o(18458561478656L, 137527);
        return null;
        paramHashSet.E(paramek.tTa * 1000L);
      }
      paramHashSet.dC(1);
      paramHashSet.db(str2);
      paramHashSet.dB(paramek.tSZ);
      if (i != 0) {}
      for (;;)
      {
        paramHashMap.put(str2, Integer.valueOf(bg.a((Integer)paramHashMap.get(str1), 0)));
        paramHashMap = h.afg().kx(paramek.jib);
        if (paramHashMap != null) {
          break label827;
        }
        w.i("MicroMsg.BackupMsgLogic.BackupRecoverMsgLogic", "unknow type ");
        GMTrace.o(18458561478656L, 137527);
        return null;
        label705:
        paramHashMap1 = localar.TE(str1);
        if ((paramHashMap1 != null) && (!bg.nm(paramHashMap1.field_username)) && (paramHashMap1.bSA()))
        {
          w.w("MicroMsg.BackupMsgLogic.BackupRecoverMsgLogic", "hit the blockList: " + str1);
          GMTrace.o(18458561478656L, 137527);
          return null;
        }
        paramHashSet.dC(0);
        paramHashSet.db(str1);
        paramHashSet.dB(4);
        if (paramek.tSZ != 3) {
          break;
        }
        paramHashMap.put(str1, Integer.valueOf(bg.a((Integer)paramHashMap.get(str1), 0) + 1));
        break;
        str2 = str1;
      }
      label827:
      paramHashMap.a(str3, paramek, paramHashSet);
      GMTrace.o(18458561478656L, 137527);
      return paramHashSet;
    }
  }
  
  public static final class c
  {
    public String eDW;
    public u iZF;
    public long iZG;
    public String iZH;
    
    public c()
    {
      GMTrace.i(14814281728000L, 110375);
      GMTrace.o(14814281728000L, 110375);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\backup\e\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */