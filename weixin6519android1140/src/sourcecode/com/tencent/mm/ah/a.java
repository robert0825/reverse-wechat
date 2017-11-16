package com.tencent.mm.ah;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.af.d;
import com.tencent.mm.af.d.b;
import com.tencent.mm.af.e;
import com.tencent.mm.af.x;
import com.tencent.mm.bu.g;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.af;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class a
  extends af
{
  public a()
  {
    GMTrace.i(4497636065280L, 33510);
    GMTrace.o(4497636065280L, 33510);
  }
  
  public final boolean fq(int paramInt)
  {
    GMTrace.i(4497770283008L, 33511);
    if ((paramInt != 0) && (paramInt < 604372991))
    {
      GMTrace.o(4497770283008L, 33511);
      return true;
    }
    GMTrace.o(4497770283008L, 33511);
    return false;
  }
  
  public final String getTag()
  {
    GMTrace.i(4497904500736L, 33512);
    GMTrace.o(4497904500736L, 33512);
    return "MicroMsg.App.BizInfoDataTransfer";
  }
  
  public final void transfer(int paramInt)
  {
    GMTrace.i(4498038718464L, 33513);
    w.d("MicroMsg.App.BizInfoDataTransfer", "the previous version is %d", new Object[] { Integer.valueOf(paramInt) });
    if ((paramInt != 0) && (paramInt < 604372991))
    {
      at.AR();
      Object localObject2 = c.yH();
      Object localObject3 = new StringBuilder();
      ((StringBuilder)localObject3).append("select BizInfo.username").append(", BizInfo.extInfo");
      ((StringBuilder)localObject3).append(" from rcontact , BizInfo");
      ((StringBuilder)localObject3).append(" where rcontact.username").append(" = BizInfo.username");
      ((StringBuilder)localObject3).append(" and (rcontact.type").append(" & 1 ) != 0 ");
      ((StringBuilder)localObject3).append(" and ( rcontact.verifyFlag").append(" & 8 ) != 0 ");
      String str = ((StringBuilder)localObject3).toString();
      Object localObject1 = new ArrayList();
      w.d("MicroMsg.App.BizInfoDataTransfer", "sql %s", new Object[] { str });
      localObject2 = ((g)localObject2).a(((StringBuilder)localObject3).toString(), null, 2);
      if (localObject2 != null)
      {
        while (((Cursor)localObject2).moveToNext())
        {
          localObject3 = new d();
          ((d)localObject3).b((Cursor)localObject2);
          if (((d)localObject3).bq(false).Fd() == 1) {
            ((List)localObject1).add(((d)localObject3).field_username);
          }
        }
        ((Cursor)localObject2).close();
      }
      if (((List)localObject1).size() > 0)
      {
        localObject2 = new StringBuilder();
        ((StringBuilder)localObject2).append("Update BizInfo set type").append(" = 1 where 1 !=1 ");
        localObject1 = ((List)localObject1).iterator();
        while (((Iterator)localObject1).hasNext())
        {
          localObject3 = (String)((Iterator)localObject1).next();
          ((StringBuilder)localObject2).append(" or username = '").append((String)localObject3).append("'");
        }
        localObject1 = ((StringBuilder)localObject2).toString();
        w.d("MicroMsg.App.BizInfoDataTransfer", "update sql %s", new Object[] { localObject1 });
        x.FG().eZ("BizInfo", (String)localObject1);
      }
    }
    GMTrace.o(4498038718464L, 33513);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ah\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */