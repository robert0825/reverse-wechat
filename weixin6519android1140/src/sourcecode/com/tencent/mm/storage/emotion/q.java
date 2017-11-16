package com.tencent.mm.storage.emotion;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.cz;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class q
  extends cz
{
  protected static c.a fTp;
  
  static
  {
    GMTrace.i(1564844490752L, 11659);
    c.a locala = new c.a();
    locala.gZM = new Field[10];
    locala.columns = new String[11];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "key";
    locala.vmt.put("key", "TEXT PRIMARY KEY ");
    localStringBuilder.append(" key TEXT PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.vms = "key";
    locala.columns[1] = "cnValue";
    locala.vmt.put("cnValue", "TEXT");
    localStringBuilder.append(" cnValue TEXT");
    localStringBuilder.append(", ");
    locala.columns[2] = "qqValue";
    locala.vmt.put("qqValue", "TEXT");
    localStringBuilder.append(" qqValue TEXT");
    localStringBuilder.append(", ");
    locala.columns[3] = "twValue";
    locala.vmt.put("twValue", "TEXT");
    localStringBuilder.append(" twValue TEXT");
    localStringBuilder.append(", ");
    locala.columns[4] = "enValue";
    locala.vmt.put("enValue", "TEXT");
    localStringBuilder.append(" enValue TEXT");
    localStringBuilder.append(", ");
    locala.columns[5] = "thValue";
    locala.vmt.put("thValue", "TEXT");
    localStringBuilder.append(" thValue TEXT");
    localStringBuilder.append(", ");
    locala.columns[6] = "fileName";
    locala.vmt.put("fileName", "TEXT");
    localStringBuilder.append(" fileName TEXT");
    localStringBuilder.append(", ");
    locala.columns[7] = "eggIndex";
    locala.vmt.put("eggIndex", "INTEGER default '-1' ");
    localStringBuilder.append(" eggIndex INTEGER default '-1' ");
    localStringBuilder.append(", ");
    locala.columns[8] = "position";
    locala.vmt.put("position", "INTEGER default '-1' ");
    localStringBuilder.append(" position INTEGER default '-1' ");
    localStringBuilder.append(", ");
    locala.columns[9] = "flag";
    locala.vmt.put("flag", "INTEGER");
    localStringBuilder.append(" flag INTEGER");
    locala.columns[10] = "rowid";
    locala.vmu = localStringBuilder.toString();
    fTp = locala;
    GMTrace.o(1564844490752L, 11659);
  }
  
  public q()
  {
    GMTrace.i(1564441837568L, 11656);
    GMTrace.o(1564441837568L, 11656);
  }
  
  public q(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, int paramInt)
  {
    GMTrace.i(1564576055296L, 11657);
    this.field_key = paramString1;
    this.field_cnValue = paramString3;
    this.field_qqValue = paramString2;
    this.field_enValue = paramString5;
    this.field_thValue = paramString6;
    this.field_twValue = paramString4;
    this.field_position = paramInt;
    GMTrace.o(1564576055296L, 11657);
  }
  
  public final String toString()
  {
    GMTrace.i(1564710273024L, 11658);
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("key:").append(this.field_key).append("/n");
    ((StringBuilder)localObject).append("cn:").append(this.field_cnValue).append("/n");
    ((StringBuilder)localObject).append("qq:").append(this.field_qqValue).append("/n");
    ((StringBuilder)localObject).append("en:").append(this.field_enValue).append("/n");
    ((StringBuilder)localObject).append("th:").append(this.field_thValue).append("/n");
    ((StringBuilder)localObject).append("tw:").append(this.field_twValue).append("/n");
    ((StringBuilder)localObject).append("position:").append(this.field_position).append("/n");
    ((StringBuilder)localObject).append("file Name:").append(this.field_fileName).append("/n");
    ((StringBuilder)localObject).append("egg index:").append(this.field_eggIndex).append("/n");
    localObject = ((StringBuilder)localObject).toString();
    GMTrace.o(1564710273024L, 11658);
    return (String)localObject;
  }
  
  protected final c.a uw()
  {
    GMTrace.i(1564307619840L, 11655);
    GMTrace.o(1564307619840L, 11655);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\storage\emotion\q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */