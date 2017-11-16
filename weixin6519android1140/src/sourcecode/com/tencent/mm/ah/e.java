package com.tencent.mm.ah;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bu.g;
import com.tencent.mm.g.b.aj;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.pointers.PString;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ae;
import com.tencent.mm.storage.as;
import com.tencent.mm.storage.as.b;
import com.tencent.mm.storage.au;
import com.tencent.mm.y.af;
import com.tencent.mm.y.at;
import com.tencent.mm.y.s;

public final class e
  extends af
{
  public e()
  {
    GMTrace.i(4498172936192L, 33514);
    GMTrace.o(4498172936192L, 33514);
  }
  
  public final boolean fq(int paramInt)
  {
    GMTrace.i(4498307153920L, 33515);
    if ((paramInt != 0) && (paramInt < 604372991))
    {
      GMTrace.o(4498307153920L, 33515);
      return true;
    }
    GMTrace.o(4498307153920L, 33515);
    return false;
  }
  
  public final String getTag()
  {
    GMTrace.i(4498575589376L, 33517);
    GMTrace.o(4498575589376L, 33517);
    return "MicroMsg.ConversationDataTransfer";
  }
  
  public final void transfer(int paramInt)
  {
    GMTrace.i(4498441371648L, 33516);
    w.d("MicroMsg.ConversationDataTransfer", "the previous version is %d", new Object[] { Integer.valueOf(paramInt) });
    Object localObject1;
    Object localObject2;
    Object localObject3;
    Object localObject4;
    if ((paramInt != 0) && (paramInt < 604372991))
    {
      at.AR();
      localObject1 = com.tencent.mm.y.c.yH();
      localObject2 = new StringBuilder();
      ((StringBuilder)localObject2).append("select rconversation.username").append(" from rconversation, rcontact").append(", bizinfo where rconversation").append(".username = rcontact").append(".username and rconversation").append(".username = bizinfo").append(".username and ( rcontact").append(".verifyFlag & 8").append(" ) != 0 ");
      localObject2 = ((StringBuilder)localObject2).toString();
      w.d("MicroMsg.ConversationDataTransfer", "select sql %s", new Object[] { localObject2 });
      localObject2 = ((g)localObject1).a((String)localObject2, null, 2);
      if ((localObject2 != null) && (((Cursor)localObject2).moveToFirst()))
      {
        localObject3 = new StringBuilder();
        ((StringBuilder)localObject3).append("Update rconversation set parentRef").append(" = 'officialaccounts' where 1 !=1 ");
        do
        {
          localObject4 = ((Cursor)localObject2).getString(0);
          if (!s.gk((String)localObject4)) {
            ((StringBuilder)localObject3).append(" or username = '").append((String)localObject4).append("'");
          }
        } while (((Cursor)localObject2).moveToNext());
        ((Cursor)localObject2).close();
        localObject3 = ((StringBuilder)localObject3).toString();
        w.d("MicroMsg.ConversationDataTransfer", "changed[%B] exec sql[%s]", new Object[] { Boolean.valueOf(true), localObject3 });
        ((g)localObject1).eZ("rconversation", (String)localObject3);
        at.AR();
        localObject1 = com.tencent.mm.y.c.yP().TO("officialaccounts");
        if (localObject1 != null) {
          break label587;
        }
        localObject1 = new ae("officialaccounts");
        ((ae)localObject1).bSW();
        at.AR();
        com.tencent.mm.y.c.yP().d((ae)localObject1);
      }
    }
    label587:
    for (;;)
    {
      at.AR();
      localObject3 = com.tencent.mm.y.c.yP().bTg();
      if (bg.nm((String)localObject3))
      {
        w.w("MicroMsg.ConversationDataTransfer", "last convBiz is null");
        GMTrace.o(4498441371648L, 33516);
        return;
      }
      at.AR();
      localObject3 = com.tencent.mm.y.c.yM().Ca((String)localObject3);
      if ((localObject3 == null) || (((ce)localObject3).field_msgId == 0L))
      {
        w.w("MicroMsg.ConversationDataTransfer", "last biz msg is error");
        GMTrace.o(4498441371648L, 33516);
        return;
      }
      ((ae)localObject1).ab((au)localObject3);
      ((ae)localObject1).setContent(((ce)localObject3).field_talker + ":" + ((ce)localObject3).field_content);
      ((ae)localObject1).cN(Integer.toString(((ce)localObject3).field_type));
      at.AR();
      localObject4 = com.tencent.mm.y.c.yP().pC();
      if (localObject4 != null)
      {
        PString localPString1 = new PString();
        PString localPString2 = new PString();
        PInt localPInt = new PInt();
        ((au)localObject3).db("officialaccounts");
        ((au)localObject3).setContent(((aj)localObject1).field_content);
        ((as.b)localObject4).a((au)localObject3, localPString1, localPString2, localPInt, false);
        ((ae)localObject1).cO(localPString1.value);
        ((ae)localObject1).cP(localPString2.value);
        ((ae)localObject1).dD(localPInt.value);
      }
      at.AR();
      com.tencent.mm.y.c.yP().a((ae)localObject1, ((aj)localObject1).field_username);
      if ((localObject2 != null) && (!((Cursor)localObject2).isClosed())) {
        ((Cursor)localObject2).close();
      }
      GMTrace.o(4498441371648L, 33516);
      return;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ah\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */