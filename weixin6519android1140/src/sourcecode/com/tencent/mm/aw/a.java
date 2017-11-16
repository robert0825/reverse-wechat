package com.tencent.mm.aw;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;

public final class a
{
  int eQl;
  public int gPK;
  private String gsO;
  private String gsP;
  private int gsQ;
  private int gsR;
  private String path;
  public String username;
  
  public a()
  {
    GMTrace.i(12939260067840L, 96405);
    this.eQl = -1;
    this.username = "";
    this.gPK = 0;
    this.path = "";
    this.gsO = "";
    this.gsP = "";
    this.gsQ = 0;
    this.gsR = 0;
    GMTrace.o(12939260067840L, 96405);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(12939394285568L, 96406);
    this.username = paramCursor.getString(0);
    this.gPK = paramCursor.getInt(1);
    this.path = paramCursor.getString(2);
    this.gsO = paramCursor.getString(3);
    this.gsP = paramCursor.getString(4);
    this.gsQ = paramCursor.getInt(5);
    this.gsR = paramCursor.getInt(6);
    GMTrace.o(12939394285568L, 96406);
  }
  
  public final String getUsername()
  {
    GMTrace.i(12939662721024L, 96408);
    if (this.username == null)
    {
      GMTrace.o(12939662721024L, 96408);
      return "";
    }
    String str = this.username;
    GMTrace.o(12939662721024L, 96408);
    return str;
  }
  
  public final ContentValues qL()
  {
    GMTrace.i(12939528503296L, 96407);
    ContentValues localContentValues = new ContentValues();
    if ((this.eQl & 0x1) != 0) {
      localContentValues.put("username", getUsername());
    }
    if ((this.eQl & 0x2) != 0) {
      localContentValues.put("bgflag", Integer.valueOf(this.gPK));
    }
    if ((this.eQl & 0x4) != 0)
    {
      if (this.path == null)
      {
        str = "";
        localContentValues.put("path", str);
      }
    }
    else
    {
      if ((this.eQl & 0x8) != 0)
      {
        if (this.gsO != null) {
          break label201;
        }
        str = "";
        label103:
        localContentValues.put("reserved1", str);
      }
      if ((this.eQl & 0x10) != 0) {
        if (this.gsP != null) {
          break label209;
        }
      }
    }
    label201:
    label209:
    for (String str = "";; str = this.gsP)
    {
      localContentValues.put("reserved2", str);
      if ((this.eQl & 0x20) != 0) {
        localContentValues.put("reserved3", Integer.valueOf(this.gsQ));
      }
      if ((this.eQl & 0x40) != 0) {
        localContentValues.put("reserved4", Integer.valueOf(this.gsR));
      }
      GMTrace.o(12939528503296L, 96407);
      return localContentValues;
      str = this.path;
      break;
      str = this.gsO;
      break label103;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\aw\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */