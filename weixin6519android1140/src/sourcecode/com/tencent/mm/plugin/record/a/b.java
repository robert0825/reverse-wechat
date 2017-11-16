package com.tencent.mm.plugin.record.a;

import com.tencent.gmtrace.GMTrace;

public final class b
{
  public String field_cdnKey;
  public String field_cdnUrl;
  public String field_dataId;
  public int field_dataType;
  public int field_extFlag;
  public long field_favLocalId;
  public long field_modifyTime;
  public int field_offset;
  public String field_path;
  public int field_status;
  public int field_totalLen;
  public int field_type;
  
  public b()
  {
    GMTrace.i(7494717931520L, 55840);
    GMTrace.o(7494717931520L, 55840);
  }
  
  public final boolean isFinished()
  {
    GMTrace.i(7494852149248L, 55841);
    if (this.field_status == 3)
    {
      GMTrace.o(7494852149248L, 55841);
      return true;
    }
    GMTrace.o(7494852149248L, 55841);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\record\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */