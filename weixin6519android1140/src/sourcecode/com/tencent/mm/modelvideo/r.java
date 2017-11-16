package com.tencent.mm.modelvideo;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.protocal.c.anf;
import com.tencent.mm.protocal.c.bhr;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Map;

public final class r
{
  String clientId;
  public int eMO;
  public int eQl;
  public String eQu;
  public long eSf;
  public String eTZ;
  public String eTv;
  public String euR;
  public int gAU;
  public int gsL;
  public long haN;
  public String hac;
  public int hbc;
  public int hcA;
  public String hcB;
  public int hcC;
  public String hcD;
  public bhr hcE;
  public anf hcF;
  public String hcn;
  public int hcp;
  int hcq;
  public int hcr;
  public long hcs;
  public long hct;
  public long hcu;
  public int hcv;
  public int hcw;
  public int hcx;
  private int hcy;
  public int hcz;
  public int status;
  public int videoFormat;
  
  public r()
  {
    GMTrace.i(360643035136L, 2687);
    this.eQl = -1;
    this.euR = "";
    this.clientId = "";
    this.eSf = 0L;
    this.hbc = 0;
    this.hcp = 0;
    this.gsL = 0;
    this.hcq = 0;
    this.hcr = 0;
    this.status = 0;
    this.hcs = 0L;
    this.hct = 0L;
    this.hcu = 0L;
    this.hcv = 0;
    this.hcw = 0;
    this.hcx = 0;
    this.hcy = 0;
    this.eQu = "";
    this.hcn = "";
    this.hcz = 0;
    this.hcA = 0;
    this.hac = "";
    this.hcB = "";
    this.hcC = 0;
    this.haN = 0L;
    this.hcD = "";
    this.eTZ = "";
    this.hcE = new bhr();
    this.eTv = "";
    this.gAU = 0;
    this.hcF = new anf();
    this.eMO = 0;
    this.videoFormat = 0;
    GMTrace.o(360643035136L, 2687);
  }
  
  private byte[] Np()
  {
    GMTrace.i(361179906048L, 2691);
    Object localObject = new byte[0];
    try
    {
      byte[] arrayOfByte = this.hcE.toByteArray();
      localObject = arrayOfByte;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.VideoInfo", localException, "", new Object[0]);
      }
    }
    GMTrace.o(361179906048L, 2691);
    return (byte[])localObject;
  }
  
  private byte[] Nx()
  {
    GMTrace.i(362522083328L, 2701);
    Object localObject = new byte[0];
    try
    {
      byte[] arrayOfByte = this.hcF.toByteArray();
      localObject = arrayOfByte;
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
    GMTrace.o(362522083328L, 2701);
    return (byte[])localObject;
  }
  
  public static String mg(String paramString)
  {
    GMTrace.i(360777252864L, 2688);
    try
    {
      paramString = bh.q(paramString, "msg");
      if (paramString != null)
      {
        paramString = (String)paramString.get(".msg.videomsg.$cdnvideourl");
        GMTrace.o(360777252864L, 2688);
        return paramString;
      }
    }
    catch (Exception paramString)
    {
      GMTrace.o(360777252864L, 2688);
    }
    return "";
  }
  
  public final String Nq()
  {
    GMTrace.i(361716776960L, 2695);
    if (this.eQu == null)
    {
      GMTrace.o(361716776960L, 2695);
      return "";
    }
    String str = this.eQu;
    GMTrace.o(361716776960L, 2695);
    return str;
  }
  
  public final String Nr()
  {
    GMTrace.i(361850994688L, 2696);
    if (this.hcn == null)
    {
      GMTrace.o(361850994688L, 2696);
      return "";
    }
    String str = this.hcn;
    GMTrace.o(361850994688L, 2696);
    return str;
  }
  
  public final String Ns()
  {
    GMTrace.i(361985212416L, 2697);
    if (this.hac == null)
    {
      GMTrace.o(361985212416L, 2697);
      return "";
    }
    String str = this.hac;
    GMTrace.o(361985212416L, 2697);
    return str;
  }
  
  public final String Nt()
  {
    GMTrace.i(362119430144L, 2698);
    if (this.hcB == null)
    {
      GMTrace.o(362119430144L, 2698);
      return "";
    }
    String str = this.hcB;
    GMTrace.o(362119430144L, 2698);
    return str;
  }
  
  public final boolean Nu()
  {
    GMTrace.i(16268799246336L, 121212);
    if ((this.status == 140) || (this.status == 141) || (this.status == 142))
    {
      GMTrace.o(16268799246336L, 121212);
      return true;
    }
    GMTrace.o(16268799246336L, 121212);
    return false;
  }
  
  public final boolean Nv()
  {
    GMTrace.i(362253647872L, 2699);
    if ((this.status == 121) || (this.status == 122) || (this.status == 120) || (this.status == 123))
    {
      GMTrace.o(362253647872L, 2699);
      return true;
    }
    GMTrace.o(362253647872L, 2699);
    return false;
  }
  
  public final boolean Nw()
  {
    GMTrace.i(362387865600L, 2700);
    if ((this.status == 199) || (this.status == 199))
    {
      GMTrace.o(362387865600L, 2700);
      return true;
    }
    GMTrace.o(362387865600L, 2700);
    return false;
  }
  
  public final void aA(long paramLong)
  {
    GMTrace.i(18680557600768L, 139181);
    this.hct = paramLong;
    GMTrace.o(18680557600768L, 139181);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(360911470592L, 2689);
    this.euR = paramCursor.getString(0);
    this.clientId = paramCursor.getString(1);
    this.eSf = paramCursor.getLong(2);
    this.hbc = paramCursor.getInt(3);
    this.hcp = paramCursor.getInt(4);
    this.gsL = paramCursor.getInt(5);
    this.hcq = paramCursor.getInt(6);
    this.hcr = paramCursor.getInt(7);
    this.status = paramCursor.getInt(8);
    this.hcs = paramCursor.getLong(9);
    this.hct = paramCursor.getLong(10);
    this.hcu = paramCursor.getLong(11);
    this.hcv = paramCursor.getInt(12);
    this.hcw = paramCursor.getInt(13);
    this.hcx = paramCursor.getInt(14);
    this.hcy = paramCursor.getInt(15);
    this.eQu = paramCursor.getString(16);
    this.hcn = paramCursor.getString(17);
    this.hcz = paramCursor.getInt(18);
    this.hcA = paramCursor.getInt(19);
    this.hac = paramCursor.getString(20);
    this.hcB = paramCursor.getString(21);
    this.hcC = paramCursor.getInt(22);
    this.haN = paramCursor.getLong(23);
    this.hcD = paramCursor.getString(24);
    this.eTZ = paramCursor.getString(25);
    byte[] arrayOfByte = paramCursor.getBlob(26);
    this.hcE = new bhr();
    try
    {
      this.hcE.aD(arrayOfByte);
      this.eTv = paramCursor.getString(27);
      this.gAU = paramCursor.getInt(28);
      arrayOfByte = paramCursor.getBlob(29);
      this.hcF = new anf();
    }
    catch (Exception localException1)
    {
      try
      {
        this.hcF.aD(arrayOfByte);
        this.eMO = paramCursor.getInt(30);
        this.videoFormat = paramCursor.getInt(31);
        GMTrace.o(360911470592L, 2689);
        return;
        localException1 = localException1;
        w.printErrStackTrace("MicroMsg.VideoInfo", localException1, "", new Object[0]);
      }
      catch (Exception localException2)
      {
        for (;;) {}
      }
    }
  }
  
  public final void dB(int paramInt)
  {
    GMTrace.i(20204734119936L, 150537);
    this.status = 105;
    GMTrace.o(20204734119936L, 150537);
  }
  
  public final void fZ(int paramInt)
  {
    GMTrace.i(14907160395776L, 111067);
    this.eQl = 1280;
    GMTrace.o(14907160395776L, 111067);
  }
  
  public final String getFileName()
  {
    GMTrace.i(361448341504L, 2693);
    if (this.euR == null)
    {
      GMTrace.o(361448341504L, 2693);
      return "";
    }
    String str = this.euR;
    GMTrace.o(361448341504L, 2693);
    return str;
  }
  
  public final int getStatus()
  {
    GMTrace.i(15300955209728L, 114001);
    int i = this.status;
    GMTrace.o(15300955209728L, 114001);
    return i;
  }
  
  public final ContentValues qL()
  {
    GMTrace.i(361045688320L, 2690);
    ContentValues localContentValues = new ContentValues();
    if ((this.eQl & 0x1) != 0) {
      localContentValues.put("filename", getFileName());
    }
    if ((this.eQl & 0x2) != 0) {
      if (this.clientId != null) {
        break label788;
      }
    }
    label788:
    for (String str = "";; str = this.clientId)
    {
      localContentValues.put("clientid", str);
      if ((this.eQl & 0x4) != 0) {
        localContentValues.put("msgsvrid", Long.valueOf(this.eSf));
      }
      if ((this.eQl & 0x8) != 0) {
        localContentValues.put("netoffset", Integer.valueOf(this.hbc));
      }
      if ((this.eQl & 0x10) != 0) {
        localContentValues.put("filenowsize", Integer.valueOf(this.hcp));
      }
      if ((this.eQl & 0x20) != 0) {
        localContentValues.put("totallen", Integer.valueOf(this.gsL));
      }
      if ((this.eQl & 0x40) != 0) {
        localContentValues.put("thumbnetoffset", Integer.valueOf(this.hcq));
      }
      if ((this.eQl & 0x80) != 0) {
        localContentValues.put("thumblen", Integer.valueOf(this.hcr));
      }
      if ((this.eQl & 0x100) != 0) {
        localContentValues.put("status", Integer.valueOf(this.status));
      }
      if ((this.eQl & 0x200) != 0) {
        localContentValues.put("createtime", Long.valueOf(this.hcs));
      }
      if ((this.eQl & 0x400) != 0) {
        localContentValues.put("lastmodifytime", Long.valueOf(this.hct));
      }
      if ((this.eQl & 0x800) != 0) {
        localContentValues.put("downloadtime", Long.valueOf(this.hcu));
      }
      if ((this.eQl & 0x1000) != 0) {
        localContentValues.put("videolength", Integer.valueOf(this.hcv));
      }
      if ((this.eQl & 0x2000) != 0) {
        localContentValues.put("msglocalid", Integer.valueOf(this.hcw));
      }
      if ((this.eQl & 0x4000) != 0) {
        localContentValues.put("nettimes", Integer.valueOf(this.hcx));
      }
      if ((this.eQl & 0x8000) != 0) {
        localContentValues.put("cameratype", Integer.valueOf(this.hcy));
      }
      if ((this.eQl & 0x10000) != 0) {
        localContentValues.put("user", Nq());
      }
      if ((this.eQl & 0x20000) != 0) {
        localContentValues.put("human", Nr());
      }
      if ((this.eQl & 0x40000) != 0) {
        localContentValues.put("reserved1", Integer.valueOf(this.hcz));
      }
      if ((this.eQl & 0x80000) != 0) {
        localContentValues.put("reserved2", Integer.valueOf(this.hcA));
      }
      if ((this.eQl & 0x100000) != 0) {
        localContentValues.put("reserved3", Ns());
      }
      if ((this.eQl & 0x200000) != 0) {
        localContentValues.put("reserved4", Nt());
      }
      if ((this.eQl & 0x400000) != 0) {
        localContentValues.put("videofuncflag", Integer.valueOf(this.hcC));
      }
      if ((this.eQl & 0x800000) != 0) {
        localContentValues.put("masssendid", Long.valueOf(this.haN));
      }
      if ((this.eQl & 0x1000000) != 0) {
        localContentValues.put("masssendlist", this.hcD);
      }
      if ((this.eQl & 0x2000000) != 0) {
        localContentValues.put("videomd5", this.eTZ);
      }
      if ((this.eQl & 0x4000000) != 0) {
        localContentValues.put("streamvideo", Np());
      }
      if ((this.eQl & 0x8000000) != 0) {
        localContentValues.put("statextstr", this.eTv);
      }
      if ((this.eQl & 0x10000000) != 0) {
        localContentValues.put("downloadscene", Integer.valueOf(this.gAU));
      }
      if ((this.eQl & 0x20000000) != 0) {
        localContentValues.put("mmsightextinfo", Nx());
      }
      if ((this.eQl & 0x1) != 0) {
        localContentValues.put("preloadsize", Integer.valueOf(this.eMO));
      }
      if ((this.eQl & 0x2) != 0) {
        localContentValues.put("videoformat", Integer.valueOf(this.videoFormat));
      }
      GMTrace.o(361045688320L, 2690);
      return localContentValues;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\modelvideo\r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */