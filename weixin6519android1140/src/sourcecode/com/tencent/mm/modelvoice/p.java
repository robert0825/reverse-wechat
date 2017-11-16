package com.tencent.mm.modelvoice;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;

public final class p
{
  public String clientId;
  public int eQl;
  public String eQu;
  public long eSf;
  public String euR;
  int fwu;
  String fwv;
  int gLK;
  public int gsL;
  public int hbc;
  public String hcn;
  public int hcp;
  public long hcs;
  public long hct;
  public int hcw;
  int hcx;
  String hdk;
  int hdr;
  public int hes;
  long het;
  public int status;
  
  public p()
  {
    GMTrace.i(539152613376L, 4017);
    this.eQl = -1;
    this.hdr = 0;
    this.euR = "";
    this.eQu = "";
    this.clientId = "";
    this.eSf = 0L;
    this.hbc = 0;
    this.hcp = 0;
    this.gsL = 0;
    this.status = 0;
    this.hcs = 0L;
    this.hct = 0L;
    this.hes = 0;
    this.hcw = 0;
    this.hcn = "";
    this.hcx = 0;
    this.hdk = "";
    this.fwv = "";
    this.fwu = 0;
    this.gLK = 0;
    this.het = 0L;
    GMTrace.o(539152613376L, 4017);
  }
  
  public final boolean NN()
  {
    GMTrace.i(538615742464L, 4013);
    if ((this.status == 5) || (this.status == 6))
    {
      GMTrace.o(538615742464L, 4013);
      return true;
    }
    GMTrace.o(538615742464L, 4013);
    return false;
  }
  
  public final boolean NO()
  {
    GMTrace.i(538749960192L, 4014);
    if (((this.status > 1) && (this.status <= 3)) || (this.status == 8))
    {
      GMTrace.o(538749960192L, 4014);
      return true;
    }
    GMTrace.o(538749960192L, 4014);
    return false;
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(539018395648L, 4016);
    this.euR = paramCursor.getString(0);
    this.eQu = paramCursor.getString(1);
    this.eSf = paramCursor.getLong(2);
    this.hbc = paramCursor.getInt(3);
    this.hcp = paramCursor.getInt(4);
    this.gsL = paramCursor.getInt(5);
    this.status = paramCursor.getInt(6);
    this.hcs = paramCursor.getLong(7);
    this.hct = paramCursor.getLong(8);
    this.clientId = paramCursor.getString(9);
    this.hes = paramCursor.getInt(10);
    this.hcw = paramCursor.getInt(11);
    this.hcn = paramCursor.getString(12);
    this.hcx = paramCursor.getInt(13);
    this.hdk = paramCursor.getString(14);
    this.fwv = paramCursor.getString(15);
    this.fwu = paramCursor.getInt(16);
    this.gLK = paramCursor.getInt(17);
    this.het = paramCursor.getLong(18);
    GMTrace.o(539018395648L, 4016);
  }
  
  public final ContentValues qL()
  {
    GMTrace.i(538884177920L, 4015);
    ContentValues localContentValues = new ContentValues();
    if ((this.eQl & 0x1) != 0) {
      localContentValues.put("FileName", this.euR);
    }
    if ((this.eQl & 0x2) != 0) {
      localContentValues.put("User", this.eQu);
    }
    if ((this.eQl & 0x4) != 0) {
      localContentValues.put("MsgId", Long.valueOf(this.eSf));
    }
    if ((this.eQl & 0x8) != 0) {
      localContentValues.put("NetOffset", Integer.valueOf(this.hbc));
    }
    if ((this.eQl & 0x10) != 0) {
      localContentValues.put("FileNowSize", Integer.valueOf(this.hcp));
    }
    if ((this.eQl & 0x20) != 0) {
      localContentValues.put("TotalLen", Integer.valueOf(this.gsL));
    }
    if ((this.eQl & 0x40) != 0) {
      localContentValues.put("Status", Integer.valueOf(this.status));
    }
    if ((this.eQl & 0x80) != 0) {
      localContentValues.put("CreateTime", Long.valueOf(this.hcs));
    }
    if ((this.eQl & 0x100) != 0) {
      localContentValues.put("LastModifyTime", Long.valueOf(this.hct));
    }
    if ((this.eQl & 0x200) != 0) {
      localContentValues.put("ClientId", this.clientId);
    }
    if ((this.eQl & 0x400) != 0) {
      localContentValues.put("VoiceLength", Integer.valueOf(this.hes));
    }
    if ((this.eQl & 0x800) != 0) {
      localContentValues.put("MsgLocalId", Integer.valueOf(this.hcw));
    }
    if ((this.eQl & 0x1000) != 0) {
      localContentValues.put("Human", this.hcn);
    }
    if ((this.eQl & 0x2000) != 0) {
      localContentValues.put("reserved1", Integer.valueOf(this.hcx));
    }
    if ((this.eQl & 0x4000) != 0) {
      localContentValues.put("reserved2", this.hdk);
    }
    if ((this.eQl & 0x8000) != 0) {
      localContentValues.put("MsgSource", this.fwv);
    }
    if ((this.eQl & 0x10000) != 0) {
      localContentValues.put("MsgFlag", Integer.valueOf(this.fwu));
    }
    if ((this.eQl & 0x20000) != 0) {
      localContentValues.put("MsgSeq", Integer.valueOf(this.gLK));
    }
    if ((this.eQl & 0x40000) != 0) {
      localContentValues.put("MasterBufId", Long.valueOf(this.het));
    }
    GMTrace.o(538884177920L, 4015);
    return localContentValues;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\modelvoice\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */