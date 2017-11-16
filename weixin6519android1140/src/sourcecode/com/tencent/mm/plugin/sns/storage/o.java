package com.tencent.mm.plugin.sns.storage;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.de;
import com.tencent.mm.plugin.sns.model.ae;
import com.tencent.mm.sdk.e.c.a;
import com.tencent.mm.sdk.platformtools.w;
import java.lang.reflect.Field;
import java.util.Map;

public final class o
  extends de
{
  protected static c.a fTp;
  public int pMe;
  
  static
  {
    GMTrace.i(8182449569792L, 60964);
    c.a locala = new c.a();
    locala.gZM = new Field[5];
    locala.columns = new String[6];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "logtime";
    locala.vmt.put("logtime", "LONG");
    localStringBuilder.append(" logtime LONG");
    localStringBuilder.append(", ");
    locala.columns[1] = "offset";
    locala.vmt.put("offset", "INTEGER default '0' ");
    localStringBuilder.append(" offset INTEGER default '0' ");
    localStringBuilder.append(", ");
    locala.columns[2] = "logsize";
    locala.vmt.put("logsize", "INTEGER");
    localStringBuilder.append(" logsize INTEGER");
    localStringBuilder.append(", ");
    locala.columns[3] = "errorcount";
    locala.vmt.put("errorcount", "INTEGER");
    localStringBuilder.append(" errorcount INTEGER");
    localStringBuilder.append(", ");
    locala.columns[4] = "value";
    locala.vmt.put("value", "BLOB");
    localStringBuilder.append(" value BLOB");
    locala.columns[5] = "rowid";
    locala.vmu = localStringBuilder.toString();
    fTp = locala;
    GMTrace.o(8182449569792L, 60964);
  }
  
  public o()
  {
    GMTrace.i(8182046916608L, 60961);
    GMTrace.o(8182046916608L, 60961);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(8182315352064L, 60963);
    try
    {
      super.b(paramCursor);
      this.pMe = ((int)this.vmr);
      GMTrace.o(8182315352064L, 60963);
      return;
    }
    catch (Exception paramCursor)
    {
      String str = paramCursor.getMessage();
      w.e("MicroMsg.SnsKvReport", "error " + str);
      if ((str != null) && (str.contains("Unable to convert"))) {
        ae.bji().blL();
      }
      try
      {
        throw paramCursor;
      }
      catch (Exception paramCursor)
      {
        w.printErrStackTrace("MicroMsg.SnsKvReport", paramCursor, "", new Object[0]);
        GMTrace.o(8182315352064L, 60963);
      }
    }
  }
  
  protected final c.a uw()
  {
    GMTrace.i(8182181134336L, 60962);
    c.a locala = fTp;
    GMTrace.o(8182181134336L, 60962);
    return locala;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\storage\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */