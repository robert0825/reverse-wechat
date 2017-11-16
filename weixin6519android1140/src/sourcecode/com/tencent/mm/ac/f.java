package com.tencent.mm.ac;

import android.content.ContentValues;
import com.tencent.gmtrace.GMTrace;

public final class f
{
  int eQl;
  int gsI;
  int gsJ;
  String gsK;
  int gsL;
  int gsM;
  int gsN;
  String gsO;
  String gsP;
  int gsQ;
  int gsR;
  String username;
  
  public f()
  {
    GMTrace.i(380507258880L, 2835);
    this.eQl = -1;
    reset();
    GMTrace.o(380507258880L, 2835);
  }
  
  public final String Dm()
  {
    GMTrace.i(380909912064L, 2838);
    if (this.gsK == null)
    {
      GMTrace.o(380909912064L, 2838);
      return "";
    }
    String str = this.gsK;
    GMTrace.o(380909912064L, 2838);
    return str;
  }
  
  public final ContentValues qL()
  {
    GMTrace.i(380775694336L, 2837);
    ContentValues localContentValues = new ContentValues();
    if ((this.eQl & 0x1) != 0)
    {
      if (this.username == null)
      {
        str = "";
        localContentValues.put("username", str);
      }
    }
    else
    {
      if ((this.eQl & 0x2) != 0) {
        localContentValues.put("imgwidth", Integer.valueOf(this.gsI));
      }
      if ((this.eQl & 0x4) != 0) {
        localContentValues.put("imgheigth", Integer.valueOf(this.gsJ));
      }
      if ((this.eQl & 0x8) != 0) {
        localContentValues.put("imgformat", Dm());
      }
      if ((this.eQl & 0x10) != 0) {
        localContentValues.put("totallen", Integer.valueOf(this.gsL));
      }
      if ((this.eQl & 0x20) != 0) {
        localContentValues.put("startpos", Integer.valueOf(this.gsM));
      }
      if ((this.eQl & 0x40) != 0) {
        localContentValues.put("headimgtype", Integer.valueOf(this.gsN));
      }
      if ((this.eQl & 0x80) != 0)
      {
        if (this.gsO != null) {
          break label299;
        }
        str = "";
        label197:
        localContentValues.put("reserved1", str);
      }
      if ((this.eQl & 0x100) != 0) {
        if (this.gsP != null) {
          break label307;
        }
      }
    }
    label299:
    label307:
    for (String str = "";; str = this.gsP)
    {
      localContentValues.put("reserved2", str);
      if ((this.eQl & 0x200) != 0) {
        localContentValues.put("reserved3", Integer.valueOf(this.gsQ));
      }
      if ((this.eQl & 0x400) != 0) {
        localContentValues.put("reserved4", Integer.valueOf(this.gsR));
      }
      GMTrace.o(380775694336L, 2837);
      return localContentValues;
      str = this.username;
      break;
      str = this.gsO;
      break label197;
    }
  }
  
  public final void reset()
  {
    GMTrace.i(380641476608L, 2836);
    this.username = "";
    this.gsI = 0;
    this.gsJ = 0;
    this.gsK = "";
    this.gsL = 0;
    this.gsM = 0;
    this.gsN = 0;
    this.gsO = "";
    this.gsP = "";
    this.gsQ = 0;
    this.gsR = 0;
    GMTrace.o(380641476608L, 2836);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ac\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */