package com.tencent.mm.plugin.wallet_core.model;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.dq;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class x
  extends dq
{
  public static c.a fTp;
  
  static
  {
    GMTrace.i(6890335502336L, 51337);
    c.a locala = new c.a();
    locala.gZM = new Field[6];
    locala.columns = new String[7];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "mNativeUrl";
    locala.vmt.put("mNativeUrl", "TEXT PRIMARY KEY ");
    localStringBuilder.append(" mNativeUrl TEXT PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.vms = "mNativeUrl";
    locala.columns[1] = "hbType";
    locala.vmt.put("hbType", "INTEGER");
    localStringBuilder.append(" hbType INTEGER");
    localStringBuilder.append(", ");
    locala.columns[2] = "receiveAmount";
    locala.vmt.put("receiveAmount", "LONG");
    localStringBuilder.append(" receiveAmount LONG");
    localStringBuilder.append(", ");
    locala.columns[3] = "receiveTime";
    locala.vmt.put("receiveTime", "LONG");
    localStringBuilder.append(" receiveTime LONG");
    localStringBuilder.append(", ");
    locala.columns[4] = "receiveStatus";
    locala.vmt.put("receiveStatus", "INTEGER");
    localStringBuilder.append(" receiveStatus INTEGER");
    localStringBuilder.append(", ");
    locala.columns[5] = "hbStatus";
    locala.vmt.put("hbStatus", "INTEGER");
    localStringBuilder.append(" hbStatus INTEGER");
    locala.columns[6] = "rowid";
    locala.vmu = localStringBuilder.toString();
    fTp = locala;
    GMTrace.o(6890335502336L, 51337);
  }
  
  public x()
  {
    GMTrace.i(6889932849152L, 51334);
    GMTrace.o(6889932849152L, 51334);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(6890201284608L, 51336);
    super.b(paramCursor);
    GMTrace.o(6890201284608L, 51336);
  }
  
  protected final c.a uw()
  {
    GMTrace.i(6890067066880L, 51335);
    c.a locala = fTp;
    GMTrace.o(6890067066880L, 51335);
    return locala;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\wallet_core\model\x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */