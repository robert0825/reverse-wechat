package com.tencent.mm.plugin.record.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.protocal.c.tt;
import com.tencent.mm.protocal.c.ud;

public final class c
{
  public long field_edittime;
  public tt field_favProto;
  public int field_flag;
  public String field_fromUser;
  public int field_id;
  public int field_itemStatus;
  public long field_localId;
  public int field_localSeq;
  public String field_realChatName;
  public long field_sourceCreateTime;
  public String field_sourceId;
  public int field_sourceType;
  public ud field_tagProto;
  public String field_toUser;
  public int field_type;
  public int field_updateSeq;
  public long field_updateTime;
  
  public c()
  {
    GMTrace.i(7512837324800L, 55975);
    GMTrace.o(7512837324800L, 55975);
  }
  
  public final boolean axJ()
  {
    GMTrace.i(7512971542528L, 55976);
    if ((this.field_itemStatus == 1) || (this.field_itemStatus == 4) || (this.field_itemStatus == 9) || (this.field_itemStatus == 12) || (this.field_itemStatus == 13) || (this.field_itemStatus == 15) || (this.field_itemStatus == 17))
    {
      GMTrace.o(7512971542528L, 55976);
      return true;
    }
    GMTrace.o(7512971542528L, 55976);
    return false;
  }
  
  public final boolean axK()
  {
    GMTrace.i(7513105760256L, 55977);
    if ((this.field_itemStatus == 3) || (this.field_itemStatus == 6) || (this.field_itemStatus == 11) || (this.field_itemStatus == 14) || (this.field_itemStatus == 16) || (this.field_itemStatus == 18))
    {
      GMTrace.o(7513105760256L, 55977);
      return true;
    }
    GMTrace.o(7513105760256L, 55977);
    return false;
  }
  
  public final boolean axL()
  {
    GMTrace.i(7513374195712L, 55979);
    if (this.field_itemStatus == 8)
    {
      GMTrace.o(7513374195712L, 55979);
      return true;
    }
    GMTrace.o(7513374195712L, 55979);
    return false;
  }
  
  public final boolean isDone()
  {
    GMTrace.i(7513508413440L, 55980);
    if (this.field_itemStatus == 10)
    {
      GMTrace.o(7513508413440L, 55980);
      return true;
    }
    GMTrace.o(7513508413440L, 55980);
    return false;
  }
  
  public final boolean isDownloading()
  {
    GMTrace.i(7513239977984L, 55978);
    if (this.field_itemStatus == 7)
    {
      GMTrace.o(7513239977984L, 55978);
      return true;
    }
    GMTrace.o(7513239977984L, 55978);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\record\a\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */