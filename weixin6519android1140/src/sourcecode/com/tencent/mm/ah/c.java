package com.tencent.mm.ah;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bu.g;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.x;
import com.tencent.mm.y.at;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class c
  extends com.tencent.mm.y.af
{
  public c()
  {
    GMTrace.i(4499783548928L, 33526);
    GMTrace.o(4499783548928L, 33526);
  }
  
  public final boolean fq(int paramInt)
  {
    GMTrace.i(4499917766656L, 33527);
    if ((paramInt != 0) && (paramInt < 620757033))
    {
      GMTrace.o(4499917766656L, 33527);
      return true;
    }
    GMTrace.o(4499917766656L, 33527);
    return false;
  }
  
  public final String getTag()
  {
    GMTrace.i(4500186202112L, 33529);
    GMTrace.o(4500186202112L, 33529);
    return "MicroMsg.DataTransfer.BlackListConvDataTransfer";
  }
  
  public final void transfer(int paramInt)
  {
    GMTrace.i(4500051984384L, 33528);
    w.d("MicroMsg.DataTransfer.BlackListConvDataTransfer", "the previous version is %d", new Object[] { Integer.valueOf(paramInt) });
    if ((paramInt != 0) && (paramInt < 620757033))
    {
      Object localObject1 = new LinkedList();
      at.AR();
      Object localObject2 = com.tencent.mm.y.c.yK().c("@black.android", "", null);
      Object localObject3;
      if (localObject2 != null)
      {
        ((Cursor)localObject2).moveToFirst();
        while (!((Cursor)localObject2).isAfterLast())
        {
          localObject3 = new x();
          ((x)localObject3).b((Cursor)localObject2);
          ((List)localObject1).add(((com.tencent.mm.g.b.af)localObject3).field_username);
          ((Cursor)localObject2).moveToNext();
        }
        ((Cursor)localObject2).close();
      }
      if (((List)localObject1).size() > 0)
      {
        localObject2 = new StringBuilder();
        ((StringBuilder)localObject2).append("Update rconversation");
        ((StringBuilder)localObject2).append(" set parentRef = '@blacklist").append("' where 1 != 1 ");
        localObject1 = ((List)localObject1).iterator();
        while (((Iterator)localObject1).hasNext())
        {
          localObject3 = (String)((Iterator)localObject1).next();
          ((StringBuilder)localObject2).append(" or username = '").append((String)localObject3).append("'");
        }
        localObject1 = ((StringBuilder)localObject2).toString();
        w.d("MicroMsg.DataTransfer.BlackListConvDataTransfer", "update sql: %s", new Object[] { localObject1 });
        at.AR();
        com.tencent.mm.y.c.yH().eZ("rconversation", (String)localObject1);
      }
    }
    GMTrace.o(4500051984384L, 33528);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ah\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */