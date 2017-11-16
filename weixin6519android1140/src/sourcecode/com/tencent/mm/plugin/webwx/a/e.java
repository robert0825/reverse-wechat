package com.tencent.mm.plugin.webwx.a;

import android.content.Context;
import android.content.Intent;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.d;
import com.tencent.mm.ad.d.a;
import com.tencent.mm.ad.d.b;
import com.tencent.mm.af.a.i;
import com.tencent.mm.af.x;
import com.tencent.mm.g.a.qp;
import com.tencent.mm.g.a.qp.a;
import com.tencent.mm.g.b.aj;
import com.tencent.mm.modelsimple.ah;
import com.tencent.mm.modelsimple.q;
import com.tencent.mm.plugin.webwx.ui.WebWXLogoutUI;
import com.tencent.mm.plugin.webwx.ui.WebWXPopupUnlockUI;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.protocal.c.bu;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ae;
import com.tencent.mm.storage.as;
import com.tencent.mm.storage.au;
import com.tencent.mm.storage.t;
import com.tencent.mm.y.at;
import com.tencent.mm.y.s;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class e
  implements d
{
  public e()
  {
    GMTrace.i(7657926688768L, 57056);
    GMTrace.o(7657926688768L, 57056);
  }
  
  public final d.b b(d.a parama)
  {
    GMTrace.i(7658060906496L, 57057);
    parama = parama.gtM;
    Object localObject1;
    Object localObject2;
    int i;
    if ((parama != null) && (parama.lQc == 51))
    {
      w.d("MicroMsg.StatusNotifyMsgExtension", "msgType %d %d", new Object[] { Integer.valueOf(parama.lQc), Integer.valueOf(51) });
      localObject1 = com.tencent.mm.platformtools.n.a(parama.tPX);
      if (!bg.nm((String)localObject1))
      {
        localObject2 = com.tencent.mm.platformtools.n.a(parama.tPY).trim();
        parama = bh.q((String)localObject2, "msg");
        if (parama != null)
        {
          i = bg.getInt((String)parama.get(".msg.op.$id"), 0);
          w.d("MicroMsg.StatusNotifyMsgExtension", "handleStatusNotifyMsg, %d", new Object[] { Integer.valueOf(i) });
          if ((i != 1) && (i != 2) && (i != 5)) {
            break label340;
          }
          w.i("MicroMsg.StatusNotifyMsgExtension", "summerbadcr mark conversation readed. userName = " + (String)localObject1);
          com.tencent.mm.plugin.webwx.a.hnH.cancelNotification((String)localObject1);
          if (!s.fH((String)localObject1)) {
            break label213;
          }
          at.AR();
          com.tencent.mm.y.c.xh().set(143618, Integer.valueOf(0));
          com.tencent.mm.bc.l.ML().My();
        }
      }
    }
    for (;;)
    {
      GMTrace.o(7658060906496L, 57057);
      return null;
      label213:
      w.i("MicroMsg.StatusNotifyMsgExtension", "summerbadcr STATUSNOTIFY clearChatRoomMsgSeq");
      at.AR();
      com.tencent.mm.y.c.yP().TQ((String)localObject1);
      if (s.eb((String)localObject1))
      {
        at.AR();
        parama = com.tencent.mm.y.c.yP().TO((String)localObject1);
        if ((parama != null) && (parama.field_unReadCount > 0) && (parama.field_UnDeliverCount > 0))
        {
          w.i("MicroMsg.StatusNotifyMsgExtension", "summerbadcr STATUSNOTIFY clearChatRoomMsgSeq chatroom[%s], UnDeliver[%d], Unread[%d]", new Object[] { localObject1, Integer.valueOf(parama.field_UnDeliverCount), Integer.valueOf(parama.field_unReadCount) });
          com.tencent.mm.plugin.webwx.a.hnI.bK((String)localObject1);
          parama.dz(0);
          at.AR();
          com.tencent.mm.y.c.yP().a(parama, (String)localObject1);
          continue;
          label340:
          if (i == 3)
          {
            at.AR();
            localObject1 = com.tencent.mm.y.c.yP().bTd();
            localObject2 = new StringBuilder();
            i = 0;
            if (i < ((List)localObject1).size())
            {
              if (i > 0) {}
              for (parama = ",";; parama = "")
              {
                ((StringBuilder)localObject2).append(parama);
                ((StringBuilder)localObject2).append((String)((List)localObject1).get(i));
                i += 1;
                break;
              }
            }
            parama = new ah(((StringBuilder)localObject2).toString(), 4);
            at.wS().a(parama, 0);
          }
          else if (i == 6)
          {
            w.v("MicroMsg.StatusNotifyMsgExtension", "lyh statusNotify, %d, %s", new Object[] { Integer.valueOf(i), localObject2 });
          }
          else if (i == 7)
          {
            w.v("MicroMsg.StatusNotifyMsgExtension", "lyh statusNotify, %d, %s", new Object[] { Integer.valueOf(i), localObject2 });
            at.AR();
            w.d("MicroMsg.StatusNotifyMsgExtension", "onlineversion: %d,%d", new Object[] { Integer.valueOf(com.tencent.mm.y.c.yG()), Integer.valueOf(q.Lq()) });
            localObject1 = bg.nl((String)parama.get(".msg.op.name")).trim();
            parama = bg.nl((String)parama.get(".msg.op.arg")).trim();
            if ("WeixinStatus".equals(localObject1))
            {
              at.AR();
              if ((com.tencent.mm.y.c.yG() == q.Lq()) && (q.gUs != null) && (q.gUs.trim().length() > 0))
              {
                parama = new Intent(ab.getContext(), WebWXLogoutUI.class);
                parama.setFlags(603979776);
                parama.addFlags(268435456);
                parama.putExtra("intent.key.online_version", q.Lq());
                ab.getContext().startActivity(parama);
              }
            }
            else if ("MomentsUnreadMsgStatus".equals(localObject1))
            {
              localObject2 = new qp();
              ((qp)localObject2).eVx.eHz = 7;
              ((qp)localObject2).eVx.eVy = ((String)localObject1);
              ((qp)localObject2).eVx.eVz = bg.getInt(parama, 0);
              w.i("MicroMsg.StatusNotifyMsgExtension", "sns enter function, %d, %s, %d", new Object[] { Integer.valueOf(((qp)localObject2).eVx.eHz), ((qp)localObject2).eVx.eVy, Long.valueOf(((qp)localObject2).eVx.eVz) });
              com.tencent.mm.sdk.b.a.vgX.m((b)localObject2);
            }
            else if ("EnterpriseChatStatus".equals(localObject1))
            {
              x.FR();
              i.e(i, (String)localObject1, parama);
            }
          }
          else if (i == 8)
          {
            w.v("MicroMsg.StatusNotifyMsgExtension", "lyh statusNotify, %d, %s", new Object[] { Integer.valueOf(i), localObject2 });
            localObject1 = bg.nl((String)parama.get(".msg.op.name")).trim();
            parama = bg.nl((String)parama.get(".msg.op.arg")).trim();
            if ("EnterpriseChatStatus".equals(localObject1))
            {
              x.FR();
              i.e(i, (String)localObject1, parama);
            }
            else
            {
              parama = new qp();
              parama.eVx.eHz = 8;
              com.tencent.mm.sdk.b.a.vgX.m(parama);
            }
          }
          else if (i == 9)
          {
            w.v("MicroMsg.StatusNotifyMsgExtension", "lyh statusNotify, %d, %s", new Object[] { Integer.valueOf(i), localObject2 });
            localObject1 = bg.nl((String)parama.get(".msg.op.name")).trim();
            parama = bg.nl((String)parama.get(".msg.op.arg")).trim();
            if ("MomentsTimelineStatus".equals(localObject1))
            {
              parama = parama.split(",");
              if (parama.length == 2)
              {
                localObject2 = new qp();
                ((qp)localObject2).eVx.eHz = 9;
                ((qp)localObject2).eVx.eVy = ((String)localObject1);
                ((qp)localObject2).eVx.eVz = bg.getInt(parama[1], 0);
                ((qp)localObject2).eVx.eVA = parama[0];
                com.tencent.mm.sdk.b.a.vgX.m((b)localObject2);
              }
            }
            else if ("EnterpriseChatStatus".equals(localObject1))
            {
              x.FR();
              i.e(i, (String)localObject1, parama);
            }
          }
          else if (i == 12)
          {
            w.d("MicroMsg.StatusNotifyMsgExtension", "williamjin extdevice unlock " + (String)localObject2, new Object[] { Integer.valueOf(i) });
            try
            {
              if (parama.get(".msg.op.arg") == null) {
                break label1266;
              }
              parama = new JSONObject((String)parama.get(".msg.op.arg")).get("deviceName").toString();
              if (!q.Lp()) {
                continue;
              }
              localObject1 = new Intent(ab.getContext(), WebWXPopupUnlockUI.class);
              ((Intent)localObject1).setFlags(872415232);
              ((Intent)localObject1).putExtra("deviceName", parama);
              ab.getContext().startActivity((Intent)localObject1);
            }
            catch (JSONException parama)
            {
              w.e("MicroMsg.StatusNotifyMsgExtension", "[williamjin] " + parama.getMessage());
            }
            continue;
            label1266:
            w.d("MicroMsg.StatusNotifyMsgExtension", "[williamjin] can not find the tag  .msg.op.arg");
          }
          else
          {
            w.e("MicroMsg.StatusNotifyMsgExtension", "unknow opCode, %d", new Object[] { Integer.valueOf(i) });
          }
        }
      }
    }
  }
  
  public final void h(au paramau)
  {
    GMTrace.i(7658195124224L, 57058);
    GMTrace.o(7658195124224L, 57058);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\webwx\a\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */