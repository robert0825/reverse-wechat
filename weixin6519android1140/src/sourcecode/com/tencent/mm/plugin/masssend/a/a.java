package com.tencent.mm.plugin.masssend.a;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;

public final class a
{
  int eQl;
  public int eqU;
  public String filename;
  String gVP;
  String goL;
  String goM;
  int hcq;
  public long hcs;
  long hct;
  String mSZ;
  public String mTa;
  public int mTb;
  public int mTc;
  int mTd;
  int mTe;
  public int mTf;
  public int mTg;
  public int msgType;
  int status;
  
  public a()
  {
    GMTrace.i(11212951650304L, 83543);
    this.eQl = -1;
    this.gVP = "";
    this.status = 0;
    this.hcs = 0L;
    this.hct = 0L;
    this.filename = "";
    this.mSZ = "";
    this.mTa = "";
    this.mTb = 0;
    this.msgType = 0;
    this.mTc = 0;
    this.mTd = 0;
    this.eqU = 0;
    this.hcq = 0;
    this.mTe = 0;
    this.mTf = 0;
    this.mTg = 0;
    this.goL = "";
    this.goM = "";
    GMTrace.o(11212951650304L, 83543);
  }
  
  public final String aNt()
  {
    GMTrace.i(11213220085760L, 83545);
    if (this.gVP == null)
    {
      GMTrace.o(11213220085760L, 83545);
      return "";
    }
    String str = this.gVP;
    GMTrace.o(11213220085760L, 83545);
    return str;
  }
  
  public final String aNu()
  {
    GMTrace.i(11213354303488L, 83546);
    if (this.filename == null)
    {
      GMTrace.o(11213354303488L, 83546);
      return "";
    }
    String str = this.filename;
    GMTrace.o(11213354303488L, 83546);
    return str;
  }
  
  public final String aNv()
  {
    GMTrace.i(11213488521216L, 83547);
    if (this.mSZ == null)
    {
      GMTrace.o(11213488521216L, 83547);
      return "";
    }
    String str = this.mSZ;
    GMTrace.o(11213488521216L, 83547);
    return str;
  }
  
  public final String aNw()
  {
    GMTrace.i(11213622738944L, 83548);
    if (this.mTa == null)
    {
      GMTrace.o(11213622738944L, 83548);
      return "";
    }
    String str = this.mTa;
    GMTrace.o(11213622738944L, 83548);
    return str;
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(11213085868032L, 83544);
    this.gVP = paramCursor.getString(0);
    this.status = paramCursor.getInt(1);
    this.hcs = paramCursor.getLong(2);
    this.hct = paramCursor.getLong(3);
    this.filename = paramCursor.getString(4);
    this.mSZ = paramCursor.getString(5);
    this.mTa = paramCursor.getString(6);
    this.mTb = paramCursor.getInt(7);
    this.msgType = paramCursor.getInt(8);
    this.mTc = paramCursor.getInt(9);
    this.mTd = paramCursor.getInt(10);
    this.eqU = paramCursor.getInt(11);
    this.hcq = paramCursor.getInt(12);
    this.mTe = paramCursor.getInt(13);
    this.mTf = paramCursor.getInt(14);
    this.mTg = paramCursor.getInt(15);
    this.goL = paramCursor.getString(16);
    this.goM = paramCursor.getString(17);
    GMTrace.o(11213085868032L, 83544);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\masssend\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */