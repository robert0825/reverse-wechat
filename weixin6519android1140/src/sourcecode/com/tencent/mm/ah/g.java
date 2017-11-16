package com.tencent.mm.ah;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bc.f;
import com.tencent.mm.bc.l;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.as;
import com.tencent.mm.storage.au.a;
import com.tencent.mm.storage.au.d;
import com.tencent.mm.y.af;
import com.tencent.mm.y.at;
import com.tencent.mm.y.bc;
import java.util.LinkedList;

public final class g
  extends af
{
  public g()
  {
    GMTrace.i(4501394161664L, 33538);
    GMTrace.o(4501394161664L, 33538);
  }
  
  public final boolean fq(int paramInt)
  {
    GMTrace.i(4501528379392L, 33539);
    if ((paramInt != 0) && (paramInt < 604307701))
    {
      GMTrace.o(4501528379392L, 33539);
      return true;
    }
    GMTrace.o(4501528379392L, 33539);
    return false;
  }
  
  public final String getTag()
  {
    GMTrace.i(4501796814848L, 33541);
    GMTrace.o(4501796814848L, 33541);
    return "MicroMsg.FMessageDataTransfer";
  }
  
  public final void transfer(int paramInt)
  {
    GMTrace.i(4501662597120L, 33540);
    if ((paramInt != 0) && (paramInt < 604307701))
    {
      at.AR();
      Object localObject1 = com.tencent.mm.y.c.yM().bs("fmessage", 20);
      if (localObject1 == null)
      {
        w.e("MicroMsg.FMessageDataTransfer", "transfer fail, msglist is empty");
        GMTrace.o(4501662597120L, 33540);
        return;
      }
      l.ML();
      w.d("MicroMsg.FMessageDataTransfer", "transfer, msgList count = " + localObject1.length);
      int i = localObject1.length;
      paramInt = 0;
      if (paramInt < i)
      {
        Object localObject2 = localObject1[paramInt];
        if ((localObject2 == null) || (((ce)localObject2).field_msgId == 0L)) {
          w.e("MicroMsg.FMessageDataTransfer", "transfer fail, msg is null, skip this msg");
        }
        Object localObject3;
        for (;;)
        {
          paramInt += 1;
          break;
          w.d("MicroMsg.FMessageDataTransfer", "transfer msg type = " + ((ce)localObject2).field_type);
          localObject3 = ((ce)localObject2).field_content;
          if ((localObject3 == null) || (((String)localObject3).length() == 0)) {
            w.e("MicroMsg.FMessageDataTransfer", "transfer fail, content is null, skip this msg, id = " + ((ce)localObject2).field_msgId);
          } else {
            switch (((ce)localObject2).field_type)
            {
            case 38: 
            case 39: 
            default: 
              w.i("MicroMsg.FMessageDataTransfer", "no need to transfer, msgtype = " + ((ce)localObject2).field_type);
              break;
            case 40: 
              w.d("MicroMsg.FMessageDataTransfer", "processFMessage, msg content = " + ((ce)localObject2).field_content);
              localObject3 = au.a.Uh(((ce)localObject2).field_content);
              localf = new f();
              localf.field_createTime = ((ce)localObject2).field_createTime;
              localf.field_isSend = 0;
              localf.field_msgContent = ((ce)localObject2).field_content;
              localf.field_svrId = ((ce)localObject2).field_msgSvrId;
              localf.field_talker = ((au.a)localObject3).rAP;
              localf.field_type = 0;
              l.MK().a(localf);
              break;
            case 37: 
              w.d("MicroMsg.FMessageDataTransfer", "processVerifyMsg, msg content = " + ((ce)localObject2).field_content);
              localObject3 = au.d.Uk(((ce)localObject2).field_content);
              if ((com.tencent.mm.platformtools.t.nm(((au.d)localObject3).rAP)) || ((((au.d)localObject3).scene != 18) && (!bc.fv(((au.d)localObject3).scene)))) {
                break label463;
              }
              w.i("MicroMsg.FMessageDataTransfer", "processVerifyMsg, skip lbs & shake, scene = " + ((au.d)localObject3).scene);
            }
          }
        }
        label463:
        f localf = new f();
        localf.field_createTime = ((ce)localObject2).field_createTime;
        localf.field_isSend = 0;
        localf.field_msgContent = ((ce)localObject2).field_content;
        localf.field_svrId = ((ce)localObject2).field_msgSvrId;
        localf.field_talker = ((au.d)localObject3).rAP;
        switch (((au.d)localObject3).eHJ)
        {
        case 3: 
        case 4: 
        default: 
          localf.field_type = 1;
        }
        for (;;)
        {
          l.MK().a(localf);
          break;
          localf.field_type = 1;
          continue;
          localf.field_type = 2;
          continue;
          localf.field_type = 3;
        }
      }
      at.AR();
      com.tencent.mm.y.c.xh().set(143618, Integer.valueOf(0));
      l.ML().My();
      w.d("MicroMsg.FMessageDataTransfer", "transfer, try to delete fmessage contact & conversation");
      at.AR();
      com.tencent.mm.y.c.yK().TK("fmessage");
      localObject1 = new LinkedList();
      ((LinkedList)localObject1).add("fmessage");
      at.AR();
      com.tencent.mm.y.c.yP().aw((LinkedList)localObject1);
    }
    GMTrace.o(4501662597120L, 33540);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ah\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */