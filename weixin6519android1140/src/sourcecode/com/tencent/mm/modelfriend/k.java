package com.tencent.mm.modelfriend;

import android.content.ContentValues;
import com.tencent.gmtrace.GMTrace;

public final class k
{
  int eQl;
  public int fja;
  int fjj;
  String fjk;
  String fjl;
  String signature;
  String username;
  
  public k()
  {
    GMTrace.i(4425829580800L, 32975);
    this.eQl = -1;
    this.username = "";
    this.fja = 0;
    this.fjj = 0;
    this.fjk = "";
    this.fjl = "";
    this.signature = "";
    GMTrace.o(4425829580800L, 32975);
  }
  
  public final String getUsername()
  {
    GMTrace.i(4426098016256L, 32977);
    if (this.username == null)
    {
      GMTrace.o(4426098016256L, 32977);
      return "";
    }
    String str = this.username;
    GMTrace.o(4426098016256L, 32977);
    return str;
  }
  
  public final ContentValues qL()
  {
    GMTrace.i(4425963798528L, 32976);
    ContentValues localContentValues = new ContentValues();
    if ((this.eQl & 0x1) != 0) {
      localContentValues.put("username", getUsername());
    }
    if ((this.eQl & 0x2) != 0) {
      localContentValues.put("sex", Integer.valueOf(this.fja));
    }
    if ((this.eQl & 0x4) != 0) {
      localContentValues.put("personalcard", Integer.valueOf(this.fjj));
    }
    if ((this.eQl & 0x8) != 0)
    {
      if (this.fjk == null)
      {
        str = "";
        localContentValues.put("province", str);
      }
    }
    else
    {
      if ((this.eQl & 0x10) != 0)
      {
        if (this.fjl != null) {
          break label178;
        }
        str = "";
        label126:
        localContentValues.put("city", str);
      }
      if ((this.eQl & 0x20) != 0) {
        if (this.signature != null) {
          break label186;
        }
      }
    }
    label178:
    label186:
    for (String str = "";; str = this.signature)
    {
      localContentValues.put("signature", str);
      GMTrace.o(4425963798528L, 32976);
      return localContentValues;
      str = this.fjk;
      break;
      str = this.fjl;
      break label126;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\modelfriend\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */