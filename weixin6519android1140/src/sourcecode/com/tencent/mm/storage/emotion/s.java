package com.tencent.mm.storage.emotion;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.da;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class s
  extends da
{
  protected static c.a fTp;
  
  static
  {
    GMTrace.i(1564173402112L, 11654);
    c.a locala = new c.a();
    locala.gZM = new Field[2];
    locala.columns = new String[3];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "key";
    locala.vmt.put("key", "TEXT PRIMARY KEY ");
    localStringBuilder.append(" key TEXT PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.vms = "key";
    locala.columns[1] = "position";
    locala.vmt.put("position", "INTEGER");
    localStringBuilder.append(" position INTEGER");
    locala.columns[2] = "rowid";
    locala.vmu = localStringBuilder.toString();
    fTp = locala;
    GMTrace.o(1564173402112L, 11654);
  }
  
  public s()
  {
    GMTrace.i(1563770748928L, 11651);
    GMTrace.o(1563770748928L, 11651);
  }
  
  public s(int paramInt, String paramString)
  {
    GMTrace.i(1563904966656L, 11652);
    this.field_position = paramInt;
    this.field_key = paramString;
    GMTrace.o(1563904966656L, 11652);
  }
  
  public final String toString()
  {
    GMTrace.i(1564039184384L, 11653);
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("index:").append(this.field_position);
    ((StringBuilder)localObject).append("key  :").append(this.field_key);
    localObject = ((StringBuilder)localObject).toString();
    GMTrace.o(1564039184384L, 11653);
    return (String)localObject;
  }
  
  protected final c.a uw()
  {
    GMTrace.i(1563636531200L, 11650);
    GMTrace.o(1563636531200L, 11650);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\storage\emotion\s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */