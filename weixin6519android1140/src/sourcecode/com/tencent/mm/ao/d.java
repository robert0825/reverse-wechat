package com.tencent.mm.ao;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;

public final class d
{
  int cfz;
  public int eQl;
  public long eSf;
  int fwA;
  public long gGR;
  public String gGS;
  String gGT;
  public String gGU;
  public int gGV;
  int gGW;
  private String gGX;
  int gGY;
  public long gGZ;
  int gHa;
  public int gHb;
  public String gHc;
  int gHd;
  private boolean gHe;
  private boolean gHf;
  private boolean gHg;
  private boolean gHh;
  private boolean gHi;
  private boolean gHj;
  private boolean gHk;
  private boolean gHl;
  private boolean gHm;
  private boolean gHn;
  private boolean gHo;
  private boolean gHp;
  boolean gHq;
  private boolean gHr;
  boolean gHs;
  private boolean gHt;
  private boolean gHu;
  private boolean gHv;
  private boolean gHw;
  public int gsL;
  public int offset;
  public int status;
  
  public d()
  {
    GMTrace.i(3531268423680L, 26310);
    this.eQl = -2;
    this.gGS = "";
    this.gGT = "";
    this.gGU = "";
    this.gGX = "";
    this.gHb = 0;
    this.fwA = 0;
    this.gHc = "";
    this.gHd = 1;
    GMTrace.o(3531268423680L, 26310);
  }
  
  public final void D(long paramLong)
  {
    GMTrace.i(3532610600960L, 26320);
    if (this.eSf != paramLong) {
      this.gHf = true;
    }
    this.eSf = paramLong;
    GMTrace.o(3532610600960L, 26320);
  }
  
  public final long IE()
  {
    GMTrace.i(3531939512320L, 26315);
    long l = this.gGZ;
    GMTrace.o(3531939512320L, 26315);
    return l;
  }
  
  public final long IF()
  {
    GMTrace.i(3532207947776L, 26317);
    long l = this.gGR;
    GMTrace.o(3532207947776L, 26317);
    return l;
  }
  
  public final String IG()
  {
    GMTrace.i(3533013254144L, 26323);
    String str = this.gGS;
    GMTrace.o(3533013254144L, 26323);
    return str;
  }
  
  public final boolean IH()
  {
    GMTrace.i(3533818560512L, 26329);
    if ((this.gsL != 0) && (this.gsL == this.offset))
    {
      GMTrace.o(3533818560512L, 26329);
      return true;
    }
    GMTrace.o(3533818560512L, 26329);
    return false;
  }
  
  public final boolean II()
  {
    GMTrace.i(3533952778240L, 26330);
    if (this.gHb > 0)
    {
      GMTrace.o(3533952778240L, 26330);
      return true;
    }
    GMTrace.o(3533952778240L, 26330);
    return false;
  }
  
  public final void IJ()
  {
    GMTrace.i(3534758084608L, 26336);
    this.gHe = false;
    this.gHf = false;
    this.gHg = false;
    this.gHh = false;
    this.gHi = false;
    this.gHj = false;
    this.gHk = false;
    this.gHl = false;
    this.gHm = false;
    this.gHn = false;
    this.gHo = false;
    this.gHp = false;
    this.gHq = false;
    this.gHr = false;
    this.gHs = false;
    this.gHt = false;
    this.gHu = false;
    this.gHv = false;
    this.gHw = false;
    GMTrace.o(3534758084608L, 26336);
  }
  
  public final void an(long paramLong)
  {
    GMTrace.i(3532073730048L, 26316);
    this.gGZ = paramLong;
    this.gHm = true;
    GMTrace.o(3532073730048L, 26316);
  }
  
  public final void ao(long paramLong)
  {
    GMTrace.i(3532342165504L, 26318);
    this.gGR = paramLong;
    this.gHe = true;
    GMTrace.o(3532342165504L, 26318);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(3534221213696L, 26332);
    this.gGR = paramCursor.getInt(0);
    this.eSf = paramCursor.getLong(1);
    this.offset = paramCursor.getInt(2);
    this.gsL = paramCursor.getInt(3);
    this.gGS = paramCursor.getString(4);
    this.gGU = paramCursor.getString(5);
    this.gGY = paramCursor.getInt(6);
    this.gGZ = paramCursor.getInt(7);
    this.status = paramCursor.getInt(8);
    this.gHa = paramCursor.getInt(9);
    this.gHb = paramCursor.getInt(10);
    this.cfz = paramCursor.getInt(11);
    this.gHc = paramCursor.getString(12);
    this.fwA = paramCursor.getInt(14);
    this.gHd = paramCursor.getInt(15);
    this.gGX = paramCursor.getString(16);
    this.gGV = paramCursor.getInt(17);
    this.gGT = paramCursor.getString(18);
    this.gGW = paramCursor.getInt(19);
    GMTrace.o(3534221213696L, 26332);
  }
  
  public final void dB(int paramInt)
  {
    GMTrace.i(3531536859136L, 26312);
    this.status = paramInt;
    this.gHn = true;
    GMTrace.o(3531536859136L, 26312);
  }
  
  public final void gk(int paramInt)
  {
    GMTrace.i(3531671076864L, 26313);
    this.gHa = paramInt;
    this.gHo = true;
    GMTrace.o(3531671076864L, 26313);
  }
  
  public final void gl(int paramInt)
  {
    GMTrace.i(3531805294592L, 26314);
    this.gGY = paramInt;
    this.gHl = true;
    GMTrace.o(3531805294592L, 26314);
  }
  
  public final void gm(int paramInt)
  {
    GMTrace.i(3532879036416L, 26322);
    this.gsL = paramInt;
    this.gHh = true;
    GMTrace.o(3532879036416L, 26322);
  }
  
  public final void gn(int paramInt)
  {
    GMTrace.i(3533550125056L, 26327);
    this.gHb = paramInt;
    this.gHp = true;
    GMTrace.o(3533550125056L, 26327);
  }
  
  public final void go(int paramInt)
  {
    GMTrace.i(3533684342784L, 26328);
    this.gGW = paramInt;
    this.gHw = true;
    GMTrace.o(3533684342784L, 26328);
  }
  
  public final void gp(int paramInt)
  {
    GMTrace.i(3534355431424L, 26333);
    if (this.gHd != paramInt) {
      this.gHt = true;
    }
    this.gHd = paramInt;
    GMTrace.o(3534355431424L, 26333);
  }
  
  public final void gq(int paramInt)
  {
    GMTrace.i(3534489649152L, 26334);
    this.gGV = paramInt;
    this.gHv = true;
    GMTrace.o(3534489649152L, 26334);
  }
  
  public final void jY(String paramString)
  {
    GMTrace.i(3531402641408L, 26311);
    this.gGX = paramString;
    this.gHu = true;
    GMTrace.o(3531402641408L, 26311);
  }
  
  public final void jZ(String paramString)
  {
    GMTrace.i(3533147471872L, 26324);
    this.gGS = paramString;
    this.gHi = true;
    GMTrace.o(3533147471872L, 26324);
  }
  
  public final void ka(String paramString)
  {
    GMTrace.i(3533281689600L, 26325);
    this.gGT = paramString;
    this.gHj = true;
    GMTrace.o(3533281689600L, 26325);
  }
  
  public final void kb(String paramString)
  {
    GMTrace.i(3533415907328L, 26326);
    this.gGU = paramString;
    this.gHk = true;
    GMTrace.o(3533415907328L, 26326);
  }
  
  public final void kc(String paramString)
  {
    GMTrace.i(3534086995968L, 26331);
    if (((this.gHc == null) && (paramString != null)) || ((this.gHc != null) && (!this.gHc.equals(paramString)))) {
      this.gHr = true;
    }
    this.gHc = paramString;
    GMTrace.o(3534086995968L, 26331);
  }
  
  public final ContentValues qL()
  {
    GMTrace.i(3534623866880L, 26335);
    ContentValues localContentValues = new ContentValues();
    if (this.gHe) {
      localContentValues.put("id", Long.valueOf(this.gGR));
    }
    if (this.gHf) {
      localContentValues.put("msgSvrId", Long.valueOf(this.eSf));
    }
    if (this.gHg) {
      localContentValues.put("offset", Integer.valueOf(this.offset));
    }
    if (this.gHh) {
      localContentValues.put("totalLen", Integer.valueOf(this.gsL));
    }
    if (this.gHi) {
      localContentValues.put("bigImgPath", this.gGS);
    }
    if (this.gHj) {
      localContentValues.put("midImgPath", this.gGT);
    }
    if (this.gHk) {
      localContentValues.put("thumbImgPath", this.gGU);
    }
    if (this.gHl) {
      localContentValues.put("createtime", Integer.valueOf(this.gGY));
    }
    if (this.gHm) {
      localContentValues.put("msglocalid", Long.valueOf(this.gGZ));
    }
    if (this.gHn) {
      localContentValues.put("status", Integer.valueOf(this.status));
    }
    if (this.gHo) {
      localContentValues.put("nettimes", Integer.valueOf(this.gHa));
    }
    if (this.gHp) {
      localContentValues.put("reserved1", Integer.valueOf(this.gHb));
    }
    if (this.gHq) {
      localContentValues.put("reserved2", Integer.valueOf(this.cfz));
    }
    if (this.gHr) {
      localContentValues.put("reserved3", this.gHc);
    }
    if (this.gHs) {
      localContentValues.put("hashdthumb", Integer.valueOf(this.fwA));
    }
    if (this.gHt) {
      if (this.offset >= this.gsL) {
        break label421;
      }
    }
    label421:
    for (int i = 0;; i = 1)
    {
      localContentValues.put("iscomplete", Integer.valueOf(i));
      if (this.gHu) {
        localContentValues.put("origImgMD5", this.gGX);
      }
      if (this.gHv) {
        localContentValues.put("compressType", Integer.valueOf(this.gGV));
      }
      if (this.gHw) {
        localContentValues.put("forwardType", Integer.valueOf(this.gGW));
      }
      GMTrace.o(3534623866880L, 26335);
      return localContentValues;
    }
  }
  
  public final long qY()
  {
    GMTrace.i(3532476383232L, 26319);
    long l = this.eSf;
    GMTrace.o(3532476383232L, 26319);
    return l;
  }
  
  public final void setOffset(int paramInt)
  {
    int i = 0;
    GMTrace.i(3532744818688L, 26321);
    if (this.offset != paramInt) {
      this.gHg = true;
    }
    this.offset = paramInt;
    w.e("MicroMsg.Imgfo", "set offset : %d  id:%d total:%d", new Object[] { Integer.valueOf(paramInt), Long.valueOf(this.gGZ), Integer.valueOf(this.gsL) });
    if (paramInt < this.gsL) {}
    for (paramInt = i;; paramInt = 1)
    {
      gp(paramInt);
      GMTrace.o(3532744818688L, 26321);
      return;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ao\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */