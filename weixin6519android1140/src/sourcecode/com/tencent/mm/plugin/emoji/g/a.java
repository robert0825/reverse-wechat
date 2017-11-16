package com.tencent.mm.plugin.emoji.g;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.d.a;
import com.tencent.mm.compatible.d.p;
import com.tencent.mm.platformtools.n;
import com.tencent.mm.plugin.emoji.e.l;
import com.tencent.mm.plugin.emoji.model.h;
import com.tencent.mm.plugin.emoji.sync.BKGLoaderManager;
import com.tencent.mm.protocal.c.bu;
import com.tencent.mm.protocal.c.qp;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.emotion.EmojiInfo;
import com.tencent.mm.storage.emotion.d;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.y.at;
import com.tencent.mm.y.bt.a;
import com.tencent.mm.y.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class a
  implements bt.a
{
  public a()
  {
    GMTrace.i(11302609092608L, 84211);
    GMTrace.o(11302609092608L, 84211);
  }
  
  public final void a(d.a parama)
  {
    GMTrace.i(11302743310336L, 84212);
    parama = parama.gtM;
    if (parama.lQc == 10002)
    {
      parama = n.a(parama.tPY);
      if (bg.nm(parama))
      {
        w.w("MicroMsg.emoji.EmojiBackupSysCmdMsgListener", "msg content is null");
        GMTrace.o(11302743310336L, 84212);
        return;
      }
      Object localObject2 = bh.q(parama, "sysmsg");
      if ((localObject2 != null) && (((Map)localObject2).size() > 0))
      {
        Object localObject3 = (String)((Map)localObject2).get(".sysmsg.$type");
        Object localObject1 = bg.bs(com.tencent.mm.bm.b.aX(p.ta().getBytes()).zL(16).tJp);
        int i;
        int j;
        if ((!bg.nm((String)localObject3)) && (((String)localObject3).equalsIgnoreCase("EmojiBackup")))
        {
          i = Integer.valueOf((String)((Map)localObject2).get(".sysmsg.EmojiBackup.OpCode")).intValue();
          localObject2 = (String)((Map)localObject2).get(".sysmsg.EmojiBackup.DeviceID");
          w.i("MicroMsg.emoji.EmojiBackupSysCmdMsgListener", "client devicesID:%s server devicesID:%s", new Object[] { localObject1, localObject2 });
          if ((!bg.nm((String)localObject2)) && (((String)localObject2).equalsIgnoreCase((String)localObject1)))
          {
            w.i("MicroMsg.emoji.EmojiBackupSysCmdMsgListener", "same devices operate ignore.");
            GMTrace.o(11302743310336L, 84212);
            return;
          }
          parama = b.wm(parama);
          if (i == 1)
          {
            if ((parama == null) || (parama.size() <= 0))
            {
              w.i("MicroMsg.emoji.EmojiBackupSysCmdMsgListener", "xml syn list is null.");
              GMTrace.o(11302743310336L, 84212);
              return;
            }
            w.i("MicroMsg.emoji.EmojiBackupSysCmdMsgListener", "try to sync emoji from newxml. buckupList:%d", new Object[] { Integer.valueOf(parama.size()) });
            localObject1 = new ArrayList();
            j = parama.size();
            i = 0;
            if (i < j)
            {
              localObject2 = (qp)parama.get(i);
              if (localObject2 != null)
              {
                localObject3 = h.arl().kjy.UK(((qp)localObject2).ugy);
                if ((localObject3 != null) && (((EmojiInfo)localObject3).bUN()) && (((EmojiInfo)localObject3).field_catalog == EmojiInfo.vCu)) {
                  break label413;
                }
                ((ArrayList)localObject1).add(new com.tencent.mm.plugin.emoji.sync.a.a(((qp)localObject2).ugy, ((qp)localObject2).lPM, ((qp)localObject2).nFH, ((qp)localObject2).ugz, ((qp)localObject2).ugA, ((qp)localObject2).ugB, ((qp)localObject2).tRS, ((qp)localObject2).ugE));
              }
              for (;;)
              {
                i += 1;
                break;
                label413:
                w.i("MicroMsg.emoji.EmojiBackupSysCmdMsgListener", "md5:%s not need to download", new Object[] { ((qp)localObject2).ugy });
              }
            }
            if (((ArrayList)localObject1).size() > 0)
            {
              h.ari().v((ArrayList)localObject1);
              h.ari().kmc.arG();
            }
          }
          for (;;)
          {
            at.AR();
            c.xh().a(w.a.vqg, Boolean.valueOf(true));
            GMTrace.o(11302743310336L, 84212);
            return;
            if (i == 2)
            {
              if ((parama == null) || (parama.size() <= 0))
              {
                w.i("MicroMsg.emoji.EmojiBackupSysCmdMsgListener", "xml syn list is null.");
                GMTrace.o(11302743310336L, 84212);
                return;
              }
              localObject1 = new ArrayList();
              if ((parama != null) && (parama.size() > 0))
              {
                parama = parama.iterator();
                while (parama.hasNext())
                {
                  localObject2 = (qp)parama.next();
                  if (localObject2 != null) {
                    ((ArrayList)localObject1).add(((qp)localObject2).ugy);
                  }
                }
              }
              h.arl().kjy.cv((List)localObject1);
              at.AR();
              c.xh().a(w.a.vpY, Boolean.valueOf(false));
            }
            else if (i == 3)
            {
              w.i("MicroMsg.emoji.EmojiBackupSysCmdMsgListener", "set batch emoji download time to 0. ");
              at.AR();
              c.xh().a(w.a.vqj, Long.valueOf(0L));
            }
          }
        }
        if ((!bg.nm((String)localObject3)) && (((String)localObject3).equalsIgnoreCase("EmotionBackup")))
        {
          i = Integer.valueOf((String)((Map)localObject2).get(".sysmsg.EmotionBackup.OpCode")).intValue();
          localObject2 = (String)((Map)localObject2).get(".sysmsg.EmotionBackup.DeviceID");
          if ((!bg.nm((String)localObject2)) && (((String)localObject2).equalsIgnoreCase((String)localObject1)))
          {
            w.i("MicroMsg.emoji.EmojiBackupSysCmdMsgListener", "same devices operate ignore.");
            GMTrace.o(11302743310336L, 84212);
            return;
          }
          parama = b.wn(parama);
          if ((parama == null) || (parama.size() <= 0))
          {
            w.i("MicroMsg.emoji.EmojiBackupSysCmdMsgListener", "xml syn list is null.");
            GMTrace.o(11302743310336L, 84212);
            return;
          }
          if (i == 1)
          {
            w.i("MicroMsg.emoji.EmojiBackupSysCmdMsgListener", "try to sync emoji from newxml. add buckupList:%d", new Object[] { Integer.valueOf(parama.size()) });
            localObject1 = new ArrayList();
            j = parama.size();
            i = 0;
            while (i < j)
            {
              ((ArrayList)localObject1).add(new com.tencent.mm.plugin.emoji.sync.a.b((String)parama.get(i)));
              i += 1;
            }
            h.ari().w((ArrayList)localObject1);
            h.ari().kmc.arG();
            GMTrace.o(11302743310336L, 84212);
            return;
          }
          if (i == 2)
          {
            w.i("MicroMsg.emoji.EmojiBackupSysCmdMsgListener", "try to sync emoji from newxml. delete buckupList:%d", new Object[] { Integer.valueOf(parama.size()) });
            h.arl().kjz.af(parama);
          }
          GMTrace.o(11302743310336L, 84212);
          return;
        }
        w.e("MicroMsg.emoji.EmojiBackupSysCmdMsgListener", "not emoji message type :" + (String)localObject3);
      }
      GMTrace.o(11302743310336L, 84212);
      return;
    }
    w.i("MicroMsg.emoji.EmojiBackupSysCmdMsgListener", "not new xml type:%d ", new Object[] { Integer.valueOf(parama.lQc) });
    GMTrace.o(11302743310336L, 84212);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\emoji\g\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */