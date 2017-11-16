package com.tencent.mm.modelfriend;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.t;
import com.tencent.mm.sdk.platformtools.w;

public final class b
{
  String aDn;
  private String eDW;
  public int eQl;
  String fTy;
  String fjd;
  public String gCA;
  int gCB;
  public String gCC;
  int gCD;
  int gCE;
  String gCF;
  public String gCG;
  String gCH;
  int gCI;
  String gCJ;
  long gCK;
  int gCL;
  String gCM;
  String gCN;
  String gCO;
  long gCP;
  String gCm;
  long gCn;
  String gCo;
  String gCp;
  String gCq;
  String gCr;
  String gCs;
  public int gCt;
  public byte[] gCu;
  public int gCv;
  public String gCw;
  public int gCx;
  public String gCy;
  public String gCz;
  public String gsO;
  public int gsR;
  private int id;
  public int status;
  public int type;
  public String username;
  
  public b()
  {
    GMTrace.i(4422876790784L, 32953);
    this.eQl = -1;
    this.id = 0;
    this.eDW = "";
    this.gCm = "";
    this.gCn = 0L;
    this.fTy = "";
    this.gCo = "";
    this.gCp = "";
    this.username = "";
    this.aDn = "";
    this.gCq = "";
    this.gCr = "";
    this.type = 0;
    this.gCs = "";
    this.fjd = "";
    this.status = 0;
    this.gsO = "";
    this.gsR = 0;
    this.gCt = 0;
    this.gCw = "";
    this.gCx = 0;
    this.gCy = "";
    this.gCz = "";
    this.gCA = "";
    this.gCB = 0;
    this.gCC = "";
    this.gCD = 0;
    this.gCE = 0;
    this.gCF = "";
    this.gCG = "";
    this.gCH = "";
    this.gCI = -1;
    this.gCJ = "";
    this.gCK = -1L;
    this.gCL = -1;
    this.gCM = "";
    this.gCN = "";
    this.gCO = "";
    this.gCP = 0L;
    GMTrace.o(4422876790784L, 32953);
  }
  
  private byte[] GR()
  {
    GMTrace.i(4423279443968L, 32956);
    try
    {
      Object localObject = new t();
      ((t)localObject).bPC();
      ((t)localObject).RL(this.gCw);
      ((t)localObject).Ak(this.gCx);
      ((t)localObject).RL(this.gCy);
      ((t)localObject).RL(this.gCz);
      ((t)localObject).RL(this.gCA);
      ((t)localObject).Ak(this.gCB);
      ((t)localObject).RL(this.gCC);
      ((t)localObject).Ak(this.gCD);
      ((t)localObject).Ak(this.gCE);
      ((t)localObject).RL(this.gCF);
      ((t)localObject).RL(this.gCG);
      ((t)localObject).RL(this.gCH);
      ((t)localObject).Ak(this.gCI);
      ((t)localObject).RL(this.gCJ);
      ((t)localObject).eH(this.gCK);
      ((t)localObject).Ak(this.gCL);
      ((t)localObject).RL(this.gCM);
      ((t)localObject).RL(this.gCN);
      ((t)localObject).RL(this.gCO);
      ((t)localObject).eH(this.gCP);
      localObject = ((t)localObject).bPD();
      GMTrace.o(4423279443968L, 32956);
      return (byte[])localObject;
    }
    catch (Exception localException)
    {
      w.printErrStackTrace("MicroMsg.AddrUpload", localException, "", new Object[0]);
      GMTrace.o(4423279443968L, 32956);
    }
    return null;
  }
  
  public static int jH(String paramString)
  {
    GMTrace.i(4423413661696L, 32957);
    long l1 = 0L;
    try
    {
      long l2 = Long.parseLong(paramString.substring(0, 8), 16);
      l1 = l2;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        int i;
        w.printErrStackTrace("MicroMsg.AddrUpload", localException, "md5: %s", new Object[] { paramString });
      }
    }
    i = (int)l1;
    GMTrace.o(4423413661696L, 32957);
    return i;
  }
  
  public final String GS()
  {
    GMTrace.i(4423682097152L, 32959);
    if (this.eDW == null)
    {
      GMTrace.o(4423682097152L, 32959);
      return "";
    }
    String str = this.eDW;
    GMTrace.o(4423682097152L, 32959);
    return str;
  }
  
  public final String GT()
  {
    GMTrace.i(4423816314880L, 32960);
    if (this.gCm == null)
    {
      GMTrace.o(4423816314880L, 32960);
      return "";
    }
    String str = this.gCm;
    GMTrace.o(4423816314880L, 32960);
    return str;
  }
  
  public final String GU()
  {
    GMTrace.i(4423950532608L, 32961);
    if (this.fTy == null)
    {
      GMTrace.o(4423950532608L, 32961);
      return "";
    }
    String str = this.fTy;
    GMTrace.o(4423950532608L, 32961);
    return str;
  }
  
  public final String GV()
  {
    GMTrace.i(4424084750336L, 32962);
    if (this.gCo == null)
    {
      GMTrace.o(4424084750336L, 32962);
      return "";
    }
    String str = this.gCo;
    GMTrace.o(4424084750336L, 32962);
    return str;
  }
  
  public final String GW()
  {
    GMTrace.i(4424218968064L, 32963);
    if (this.gCp == null)
    {
      GMTrace.o(4424218968064L, 32963);
      return "";
    }
    String str = this.gCp;
    GMTrace.o(4424218968064L, 32963);
    return str;
  }
  
  public final String GX()
  {
    GMTrace.i(4424487403520L, 32965);
    if (this.aDn == null)
    {
      GMTrace.o(4424487403520L, 32965);
      return "";
    }
    String str = this.aDn;
    GMTrace.o(4424487403520L, 32965);
    return str;
  }
  
  public final String GY()
  {
    GMTrace.i(4424621621248L, 32966);
    if (this.gCq == null)
    {
      GMTrace.o(4424621621248L, 32966);
      return "";
    }
    String str = this.gCq;
    GMTrace.o(4424621621248L, 32966);
    return str;
  }
  
  public final String GZ()
  {
    GMTrace.i(4424755838976L, 32967);
    if (this.gCr == null)
    {
      GMTrace.o(4424755838976L, 32967);
      return "";
    }
    String str = this.gCr;
    GMTrace.o(4424755838976L, 32967);
    return str;
  }
  
  public final String Ha()
  {
    GMTrace.i(4424890056704L, 32968);
    if (this.gCs == null)
    {
      GMTrace.o(4424890056704L, 32968);
      return "";
    }
    String str = this.gCs;
    GMTrace.o(4424890056704L, 32968);
    return str;
  }
  
  public final String Hb()
  {
    GMTrace.i(4425024274432L, 32969);
    if (this.fjd == null)
    {
      GMTrace.o(4425024274432L, 32969);
      return "";
    }
    String str = this.fjd;
    GMTrace.o(4425024274432L, 32969);
    return str;
  }
  
  public final void Hc()
  {
    GMTrace.i(4425158492160L, 32970);
    this.gCt |= 0x1;
    GMTrace.o(4425158492160L, 32970);
  }
  
  public final boolean Hd()
  {
    GMTrace.i(4425292709888L, 32971);
    if ((this.gCt & 0x1) == 0)
    {
      GMTrace.o(4425292709888L, 32971);
      return true;
    }
    GMTrace.o(4425292709888L, 32971);
    return false;
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(4423011008512L, 32954);
    jI(paramCursor.getString(1));
    this.gCm = paramCursor.getString(2);
    this.gCn = paramCursor.getLong(3);
    this.fTy = paramCursor.getString(4);
    this.gCo = paramCursor.getString(5);
    this.gCp = paramCursor.getString(6);
    this.username = paramCursor.getString(7);
    this.aDn = paramCursor.getString(8);
    this.gCq = paramCursor.getString(9);
    this.gCr = paramCursor.getString(10);
    this.type = paramCursor.getInt(11);
    this.gCs = paramCursor.getString(12);
    this.fjd = paramCursor.getString(13);
    int i = paramCursor.getInt(14);
    byte[] arrayOfByte;
    if (i == 65536)
    {
      this.status = 0;
      this.gCt = paramCursor.getInt(17);
      this.gsO = paramCursor.getString(15);
      this.gsR = paramCursor.getInt(18);
      this.gCu = paramCursor.getBlob(19);
      if (!bg.bq(this.gCu)) {
        arrayOfByte = this.gCu;
      }
    }
    for (;;)
    {
      try
      {
        localt = new t();
        i = localt.bl(arrayOfByte);
        if (i == 0) {
          continue;
        }
        w.e("MicroMsg.AddrUpload", "parse LVBuffer error:" + i);
      }
      catch (Exception localException)
      {
        t localt;
        w.printErrStackTrace("MicroMsg.AddrUpload", localException, "", new Object[0]);
        continue;
      }
      this.gCv = paramCursor.getInt(20);
      GMTrace.o(4423011008512L, 32954);
      return;
      this.status = i;
      break;
      this.gCw = localt.getString();
      this.gCx = localt.getInt();
      this.gCy = localt.getString();
      this.gCz = localt.getString();
      this.gCA = localt.getString();
      this.gCB = localt.getInt();
      this.gCC = localt.getString();
      this.gCD = localt.getInt();
      this.gCE = localt.getInt();
      this.gCF = localt.getString();
      this.gCG = localt.getString();
      this.gCH = localt.getString();
      this.gCI = localt.getInt();
      this.gCJ = localt.getString();
      this.gCK = localt.getLong();
      this.gCL = localt.getInt();
      this.gCM = localt.getString();
      this.gCN = localt.getString();
      this.gCO = localt.getString();
      this.gCP = localt.getLong();
    }
  }
  
  public final void fZ(int paramInt)
  {
    GMTrace.i(19597935771648L, 146016);
    this.eQl = 128;
    GMTrace.o(19597935771648L, 146016);
  }
  
  public final String getUsername()
  {
    GMTrace.i(4424353185792L, 32964);
    if (this.username == null)
    {
      GMTrace.o(4424353185792L, 32964);
      return "";
    }
    String str = this.username;
    GMTrace.o(4424353185792L, 32964);
    return str;
  }
  
  public final void jI(String paramString)
  {
    GMTrace.i(4423547879424L, 32958);
    this.eDW = paramString;
    this.id = jH(paramString);
    GMTrace.o(4423547879424L, 32958);
  }
  
  public final ContentValues qL()
  {
    GMTrace.i(4423145226240L, 32955);
    ContentValues localContentValues = new ContentValues();
    if ((this.eQl & 0x1) != 0) {
      localContentValues.put("id", Integer.valueOf(this.id));
    }
    if ((this.eQl & 0x2) != 0) {
      localContentValues.put("md5", GS());
    }
    if ((this.eQl & 0x4) != 0) {
      localContentValues.put("peopleid", GT());
    }
    if ((this.eQl & 0x8) != 0) {
      localContentValues.put("uploadtime", Long.valueOf(this.gCn));
    }
    if ((this.eQl & 0x10) != 0) {
      localContentValues.put("realname", GU());
    }
    if ((this.eQl & 0x20) != 0) {
      localContentValues.put("realnamepyinitial", GV());
    }
    if ((this.eQl & 0x40) != 0) {
      localContentValues.put("realnamequanpin", GW());
    }
    if ((this.eQl & 0x80) != 0) {
      localContentValues.put("username", getUsername());
    }
    if ((this.eQl & 0x100) != 0) {
      localContentValues.put("nickname", GX());
    }
    if ((this.eQl & 0x200) != 0) {
      localContentValues.put("nicknamepyinitial", GY());
    }
    if ((this.eQl & 0x400) != 0) {
      localContentValues.put("nicknamequanpin", GZ());
    }
    if ((this.eQl & 0x800) != 0) {
      localContentValues.put("type", Integer.valueOf(this.type));
    }
    if ((this.eQl & 0x1000) != 0) {
      localContentValues.put("moblie", Ha());
    }
    if ((this.eQl & 0x2000) != 0) {
      localContentValues.put("email", Hb());
    }
    int i;
    if ((this.eQl & 0x4000) != 0)
    {
      i = this.status;
      if (i != 0) {
        break label495;
      }
      localContentValues.put("status", Integer.valueOf(65536));
    }
    for (;;)
    {
      if ((this.eQl & 0x8000) != 0) {
        localContentValues.put("reserved1", this.gsO);
      }
      if ((this.eQl & 0x20000) != 0) {
        localContentValues.put("reserved3", Integer.valueOf(this.gCt));
      }
      if ((this.eQl & 0x40000) != 0) {
        localContentValues.put("reserved4", Integer.valueOf(this.gsR));
      }
      if ((this.eQl & 0x80000) != 0)
      {
        this.gCu = GR();
        localContentValues.put("lvbuf", this.gCu);
      }
      if ((this.eQl & 0x100000) != 0) {
        localContentValues.put("showhead", Integer.valueOf(this.gCv));
      }
      GMTrace.o(4423145226240L, 32955);
      return localContentValues;
      label495:
      localContentValues.put("status", Integer.valueOf(i));
    }
  }
  
  public final int ux()
  {
    GMTrace.i(4425426927616L, 32972);
    int i = 32;
    int j;
    if (!bg.nm(GV()))
    {
      i = GV().charAt(0);
      if ((i < 97) || (i > 122)) {
        break label82;
      }
      j = (char)(i - 32);
    }
    for (;;)
    {
      GMTrace.o(4425426927616L, 32972);
      return j;
      if (bg.nm(GW())) {
        break;
      }
      i = GW().charAt(0);
      break;
      label82:
      if (i >= 65)
      {
        j = i;
        if (i <= 90) {}
      }
      else
      {
        j = 123;
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\modelfriend\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */