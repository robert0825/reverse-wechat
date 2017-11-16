package com.tencent.mm.modelfriend;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;

public final class ab
{
  int eQl;
  int gDN;
  int gDO;
  int gDP;
  int gDQ;
  int gDR;
  int gDS;
  String gDT;
  String gDU;
  
  public ab()
  {
    GMTrace.i(4444620062720L, 33115);
    this.eQl = -1;
    this.gDN = 0;
    this.gDO = 0;
    this.gDP = 0;
    this.gDQ = 0;
    this.gDR = 0;
    this.gDS = 0;
    this.gDT = "";
    this.gDU = "";
    GMTrace.o(4444620062720L, 33115);
  }
  
  public final ContentValues HS()
  {
    GMTrace.i(4444888498176L, 33117);
    ContentValues localContentValues = new ContentValues();
    if ((this.eQl & 0x1) != 0) {
      localContentValues.put("grouopid", Integer.valueOf(this.gDN));
    }
    if ((this.eQl & 0x2) != 0) {
      localContentValues.put("membernum", Integer.valueOf(this.gDO));
    }
    if ((this.eQl & 0x4) != 0) {
      localContentValues.put("weixinnum", Integer.valueOf(this.gDP));
    }
    if ((this.eQl & 0x8) != 0) {
      localContentValues.put("insert_time", Integer.valueOf(this.gDQ));
    }
    if ((this.eQl & 0x10) != 0) {
      localContentValues.put("lastupdate_time", Integer.valueOf(this.gDR));
    }
    if ((this.eQl & 0x20) != 0) {
      localContentValues.put("needupdate", Integer.valueOf(this.gDS));
    }
    if ((this.eQl & 0x40) != 0) {
      localContentValues.put("updatekey", HT());
    }
    if ((this.eQl & 0x80) != 0) {
      localContentValues.put("groupname", HU());
    }
    GMTrace.o(4444888498176L, 33117);
    return localContentValues;
  }
  
  public final String HT()
  {
    GMTrace.i(4445022715904L, 33118);
    if (this.gDT == null)
    {
      GMTrace.o(4445022715904L, 33118);
      return "";
    }
    String str = this.gDT;
    GMTrace.o(4445022715904L, 33118);
    return str;
  }
  
  public final String HU()
  {
    GMTrace.i(4445156933632L, 33119);
    if (this.gDU == null)
    {
      GMTrace.o(4445156933632L, 33119);
      return "";
    }
    String str = this.gDU;
    GMTrace.o(4445156933632L, 33119);
    return str;
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(4444754280448L, 33116);
    this.gDN = paramCursor.getInt(0);
    this.gDO = paramCursor.getInt(1);
    this.gDP = paramCursor.getInt(2);
    this.gDQ = paramCursor.getInt(3);
    this.gDR = paramCursor.getInt(4);
    this.gDS = paramCursor.getInt(5);
    this.gDT = paramCursor.getString(6);
    this.gDU = paramCursor.getString(7);
    GMTrace.o(4444754280448L, 33116);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\modelfriend\ab.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */