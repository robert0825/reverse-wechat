package com.tencent.mm.pluginsdk.model.app;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.p;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.i;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.List;

public final class o
  extends i<p>
{
  public static final String[] fTX;
  public e fTZ;
  
  static
  {
    GMTrace.i(802219360256L, 5977);
    fTX = new String[] { i.a(n.fTp, "AppSort") };
    GMTrace.o(802219360256L, 5977);
  }
  
  public o(e parame)
  {
    super(parame, n.fTp, "AppSort", null);
    GMTrace.i(801816707072L, 5974);
    this.fTZ = parame;
    parame.eZ("AppSort", "CREATE INDEX IF NOT EXISTS flagIdIndex ON AppSort ( flag )");
    parame.eZ("AppSort", "CREATE INDEX IF NOT EXISTS flagIdIndex ON AppSort ( sortId )");
    GMTrace.o(801816707072L, 5974);
  }
  
  public final boolean a(n paramn)
  {
    GMTrace.i(802085142528L, 5976);
    boolean bool = super.b(paramn);
    GMTrace.o(802085142528L, 5976);
    return bool;
  }
  
  public final List<String> eu(long paramLong)
  {
    GMTrace.i(801950924800L, 5975);
    ArrayList localArrayList = new ArrayList();
    Object localObject = new StringBuilder(256);
    ((StringBuilder)localObject).append("select * from AppSort");
    ((StringBuilder)localObject).append(" where ");
    ((StringBuilder)localObject).append("flag = ").append(paramLong);
    ((StringBuilder)localObject).append(" order by sortId desc ");
    localObject = rawQuery(((StringBuilder)localObject).toString(), new String[0]);
    if (localObject == null)
    {
      w.e("MicroMsg.AppSortStorage", "getAppListByFlag : cursor is null");
      GMTrace.o(801950924800L, 5975);
      return null;
    }
    w.d("MicroMsg.AppSortStorage", "getAppListByFlag count = %d", new Object[] { Integer.valueOf(((Cursor)localObject).getCount()) });
    int i = ((Cursor)localObject).getColumnIndex("appId");
    while (((Cursor)localObject).moveToNext()) {
      localArrayList.add(((Cursor)localObject).getString(i));
    }
    ((Cursor)localObject).close();
    GMTrace.o(801950924800L, 5975);
    return localArrayList;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\model\app\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */