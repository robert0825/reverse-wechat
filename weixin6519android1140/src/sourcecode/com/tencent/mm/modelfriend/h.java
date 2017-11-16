package com.tencent.mm.modelfriend;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;

public final class h
{
  String aDn;
  int eQl;
  int fja;
  public long fjc;
  private String fjd;
  int fjj;
  String fjk;
  String fjl;
  String fsF;
  String gCQ;
  int gCR;
  String gCq;
  String gCr;
  String signature;
  public int status;
  private int type;
  String username;
  
  public h()
  {
    GMTrace.i(4446096457728L, 33126);
    this.eQl = -1;
    this.fjc = 0L;
    this.gCQ = "";
    this.gCR = 0;
    this.status = 0;
    this.username = "";
    this.aDn = "";
    this.gCq = "";
    this.gCr = "";
    this.fja = 0;
    this.fjj = 0;
    this.fjk = "";
    this.fjl = "";
    this.signature = "";
    this.fsF = "";
    this.type = 0;
    this.fjd = "";
    GMTrace.o(4446096457728L, 33126);
  }
  
  public final String GX()
  {
    GMTrace.i(4446767546368L, 33131);
    if (this.aDn == null)
    {
      GMTrace.o(4446767546368L, 33131);
      return "";
    }
    String str = this.aDn;
    GMTrace.o(4446767546368L, 33131);
    return str;
  }
  
  public final String Hg()
  {
    GMTrace.i(4446499110912L, 33129);
    if (this.gCQ == null)
    {
      GMTrace.o(4446499110912L, 33129);
      return "";
    }
    String str = this.gCQ;
    GMTrace.o(4446499110912L, 33129);
    return str;
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(4446230675456L, 33127);
    this.fjc = paramCursor.getLong(0);
    this.gCQ = paramCursor.getString(1);
    this.gCR = paramCursor.getInt(2);
    this.status = paramCursor.getInt(3);
    this.username = paramCursor.getString(4);
    this.aDn = paramCursor.getString(5);
    this.gCq = paramCursor.getString(6);
    this.gCr = paramCursor.getString(7);
    this.fja = paramCursor.getInt(8);
    this.fjj = paramCursor.getInt(9);
    this.fjk = paramCursor.getString(10);
    this.fjl = paramCursor.getString(11);
    this.signature = paramCursor.getString(12);
    this.fsF = paramCursor.getString(13);
    this.type = paramCursor.getInt(14);
    this.fjd = paramCursor.getString(15);
    GMTrace.o(4446230675456L, 33127);
  }
  
  public final String getUsername()
  {
    GMTrace.i(4446633328640L, 33130);
    if (this.username == null)
    {
      GMTrace.o(4446633328640L, 33130);
      return "";
    }
    String str = this.username;
    GMTrace.o(4446633328640L, 33130);
    return str;
  }
  
  public final ContentValues qL()
  {
    GMTrace.i(4446364893184L, 33128);
    ContentValues localContentValues = new ContentValues();
    if ((this.eQl & 0x1) != 0) {
      localContentValues.put("fbid", Long.valueOf(this.fjc));
    }
    if ((this.eQl & 0x2) != 0) {
      localContentValues.put("fbname", Hg());
    }
    if ((this.eQl & 0x4) != 0) {
      localContentValues.put("fbimgkey", Integer.valueOf(this.gCR));
    }
    if ((this.eQl & 0x8) != 0) {
      localContentValues.put("status", Integer.valueOf(this.status));
    }
    if ((this.eQl & 0x10) != 0) {
      localContentValues.put("username", getUsername());
    }
    if ((this.eQl & 0x20) != 0) {
      localContentValues.put("nickname", GX());
    }
    if ((this.eQl & 0x40) != 0)
    {
      if (this.gCq == null)
      {
        str = "";
        localContentValues.put("nicknamepyinitial", str);
      }
    }
    else
    {
      if ((this.eQl & 0x80) != 0)
      {
        if (this.gCr != null) {
          break label426;
        }
        str = "";
        label190:
        localContentValues.put("nicknamequanpin", str);
      }
      if ((this.eQl & 0x100) != 0) {
        localContentValues.put("sex", Integer.valueOf(this.fja));
      }
      if ((this.eQl & 0x200) != 0) {
        localContentValues.put("personalcard", Integer.valueOf(this.fjj));
      }
      if ((this.eQl & 0x400) != 0)
      {
        if (this.fjk != null) {
          break label434;
        }
        str = "";
        label266:
        localContentValues.put("province", str);
      }
      if ((this.eQl & 0x800) != 0)
      {
        if (this.fjl != null) {
          break label442;
        }
        str = "";
        label294:
        localContentValues.put("city", str);
      }
      if ((this.eQl & 0x1000) != 0)
      {
        if (this.signature != null) {
          break label450;
        }
        str = "";
        label322:
        localContentValues.put("signature", str);
      }
      if ((this.eQl & 0x2000) != 0)
      {
        if (this.fsF != null) {
          break label458;
        }
        str = "";
        label350:
        localContentValues.put("alias", str);
      }
      if ((this.eQl & 0x4000) != 0) {
        localContentValues.put("type", Integer.valueOf(this.type));
      }
      if ((this.eQl & 0x8000) != 0) {
        if (this.fjd != null) {
          break label466;
        }
      }
    }
    label426:
    label434:
    label442:
    label450:
    label458:
    label466:
    for (String str = "";; str = this.fjd)
    {
      localContentValues.put("email", str);
      GMTrace.o(4446364893184L, 33128);
      return localContentValues;
      str = this.gCq;
      break;
      str = this.gCr;
      break label190;
      str = this.fjk;
      break label266;
      str = this.fjl;
      break label294;
      str = this.signature;
      break label322;
      str = this.fsF;
      break label350;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\modelfriend\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */