package com.tencent.mm.modelvideo;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.i;
import java.util.LinkedList;
import java.util.List;

public final class l
  extends i<j>
{
  public static final String[] fTX;
  public e fTZ;
  
  static
  {
    GMTrace.i(345744867328L, 2576);
    fTX = new String[] { i.a(j.fTp, "SightDraftInfo") };
    GMTrace.o(345744867328L, 2576);
  }
  
  public l(e parame)
  {
    super(parame, j.fTp, "SightDraftInfo", null);
    GMTrace.i(344805343232L, 2569);
    this.fTZ = parame;
    GMTrace.o(344805343232L, 2569);
  }
  
  public final List<j> Ne()
  {
    GMTrace.i(345073778688L, 2571);
    LinkedList localLinkedList = new LinkedList();
    Object localObject = "SELECT * FROM SightDraftInfo WHERE fileStatus = ?  ORDER BY localId DESC " + new StringBuilder(" LIMIT 5").toString();
    localObject = this.fTZ.a((String)localObject, new String[] { "7" }, 2);
    if (localObject == null)
    {
      GMTrace.o(345073778688L, 2571);
      return localLinkedList;
    }
    while (((Cursor)localObject).moveToNext())
    {
      j localj = new j();
      localj.b((Cursor)localObject);
      localLinkedList.add(localj);
    }
    ((Cursor)localObject).close();
    GMTrace.o(345073778688L, 2571);
    return localLinkedList;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\modelvideo\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */