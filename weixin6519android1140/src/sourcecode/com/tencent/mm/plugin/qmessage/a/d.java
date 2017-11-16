package com.tencent.mm.plugin.qmessage.a;

import android.content.ContentValues;
import com.tencent.gmtrace.GMTrace;

public final class d
{
  public int eQl;
  String extInfo;
  long gDV;
  int gDs;
  int goJ;
  int gsQ;
  int gsR;
  public int nRm;
  public long nRn;
  public long nRo;
  String nRp;
  String nRq;
  String nRr;
  String nRs;
  public String username;
  
  public d()
  {
    GMTrace.i(8937290072064L, 66588);
    this.eQl = -1;
    this.username = "";
    this.gDV = 0L;
    this.extInfo = "";
    this.nRm = 0;
    this.nRn = 0L;
    this.nRo = 0L;
    this.goJ = 0;
    this.gDs = 0;
    this.gsQ = 0;
    this.gsR = 0;
    this.nRp = "";
    this.nRq = "";
    this.nRr = "";
    this.nRs = "";
    GMTrace.o(8937290072064L, 66588);
  }
  
  public final String aYi()
  {
    GMTrace.i(8937692725248L, 66591);
    if (this.extInfo == null)
    {
      GMTrace.o(8937692725248L, 66591);
      return "";
    }
    String str = this.extInfo;
    GMTrace.o(8937692725248L, 66591);
    return str;
  }
  
  public final String getUsername()
  {
    GMTrace.i(8937558507520L, 66590);
    if (this.username == null)
    {
      GMTrace.o(8937558507520L, 66590);
      return "";
    }
    String str = this.username;
    GMTrace.o(8937558507520L, 66590);
    return str;
  }
  
  public final ContentValues qL()
  {
    GMTrace.i(8937424289792L, 66589);
    ContentValues localContentValues = new ContentValues();
    if ((this.eQl & 0x1) != 0) {
      localContentValues.put("username", getUsername());
    }
    if ((this.eQl & 0x2) != 0) {
      localContentValues.put("qq", Long.valueOf(this.gDV));
    }
    if ((this.eQl & 0x4) != 0) {
      localContentValues.put("extinfo", aYi());
    }
    if ((this.eQl & 0x8) != 0) {
      localContentValues.put("needupdate", Integer.valueOf(this.nRm));
    }
    if ((this.eQl & 0x10) != 0) {
      localContentValues.put("extupdateseq", Long.valueOf(this.nRn));
    }
    if ((this.eQl & 0x20) != 0) {
      localContentValues.put("imgupdateseq", Long.valueOf(this.nRo));
    }
    if ((this.eQl & 0x40) != 0) {
      localContentValues.put("reserved1", Integer.valueOf(this.goJ));
    }
    if ((this.eQl & 0x80) != 0) {
      localContentValues.put("reserved2", Integer.valueOf(this.gDs));
    }
    if ((this.eQl & 0x100) != 0) {
      localContentValues.put("reserved3", Integer.valueOf(this.gsQ));
    }
    if ((this.eQl & 0x200) != 0) {
      localContentValues.put("reserved4", Integer.valueOf(this.gsR));
    }
    if ((this.eQl & 0x400) != 0)
    {
      if (this.nRp == null)
      {
        str = "";
        localContentValues.put("reserved5", str);
      }
    }
    else
    {
      if ((this.eQl & 0x800) != 0)
      {
        if (this.nRq != null) {
          break label370;
        }
        str = "";
        label289:
        localContentValues.put("reserved6", str);
      }
      if ((this.eQl & 0x1000) != 0)
      {
        if (this.nRr != null) {
          break label378;
        }
        str = "";
        label317:
        localContentValues.put("reserved7", str);
      }
      if ((this.eQl & 0x2000) != 0) {
        if (this.nRs != null) {
          break label386;
        }
      }
    }
    label370:
    label378:
    label386:
    for (String str = "";; str = this.nRs)
    {
      localContentValues.put("reserved8", str);
      GMTrace.o(8937424289792L, 66589);
      return localContentValues;
      str = this.nRp;
      break;
      str = this.nRq;
      break label289;
      str = this.nRr;
      break label317;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\qmessage\a\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */