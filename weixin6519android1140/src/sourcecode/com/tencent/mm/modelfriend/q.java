package com.tencent.mm.modelfriend;

import android.content.ContentValues;
import com.tencent.gmtrace.GMTrace;

public final class q
{
  int eQl;
  public int gDr;
  private int gDs;
  private int goJ;
  private String goL;
  private String goM;
  public int gww;
  public String username;
  
  public q()
  {
    GMTrace.i(4443009449984L, 33103);
    this.eQl = -1;
    this.username = "";
    this.gDr = 0;
    this.gww = 0;
    this.goJ = 0;
    this.gDs = 0;
    this.goL = "";
    this.goM = "";
    GMTrace.o(4443009449984L, 33103);
  }
  
  public final String getUsername()
  {
    GMTrace.i(4443277885440L, 33105);
    if (this.username == null)
    {
      GMTrace.o(4443277885440L, 33105);
      return "";
    }
    String str = this.username;
    GMTrace.o(4443277885440L, 33105);
    return str;
  }
  
  public final ContentValues qL()
  {
    GMTrace.i(4443143667712L, 33104);
    ContentValues localContentValues = new ContentValues();
    if ((this.eQl & 0x1) != 0) {
      localContentValues.put("username", getUsername());
    }
    if ((this.eQl & 0x2) != 0) {
      localContentValues.put("friendtype", Integer.valueOf(this.gDr));
    }
    if ((this.eQl & 0x4) != 0) {
      localContentValues.put("updatetime", Integer.valueOf(this.gww));
    }
    if ((this.eQl & 0x8) != 0) {
      localContentValues.put("reserved1", Integer.valueOf(this.goJ));
    }
    if ((this.eQl & 0x10) != 0) {
      localContentValues.put("reserved2", Integer.valueOf(this.gDs));
    }
    if ((this.eQl & 0x20) != 0)
    {
      if (this.goL == null)
      {
        str = "";
        localContentValues.put("reserved3", str);
      }
    }
    else if ((this.eQl & 0x40) != 0) {
      if (this.goM != null) {
        break label197;
      }
    }
    label197:
    for (String str = "";; str = this.goM)
    {
      localContentValues.put("reserved4", str);
      GMTrace.o(4443143667712L, 33104);
      return localContentValues;
      str = this.goL;
      break;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\modelfriend\q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */