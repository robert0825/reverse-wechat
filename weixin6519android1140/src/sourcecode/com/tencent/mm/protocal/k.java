package com.tencent.mm.protocal;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bm.b;
import com.tencent.mm.pointers.PByteArray;
import com.tencent.mm.protocal.c.azq;
import com.tencent.mm.protocal.c.er;
import com.tencent.mm.protocal.c.es;
import com.tencent.mm.sdk.platformtools.w;

public final class k
{
  public static er a(d paramd)
  {
    GMTrace.i(13591826661376L, 101267);
    er localer = new er();
    localer.tTC = paramd.tKj;
    localer.tOG = paramd.tKm;
    localer.kAW = paramd.tKi;
    localer.tTB = b.aX(paramd.tKl.getBytes());
    if (localer.tTB.tJp.length >= 16) {
      localer.tTB = localer.tTB.zL(16);
    }
    localer.tTD = b.aX(paramd.tKk.getBytes());
    if (localer.tTD.tJp.length >= 132) {
      localer.tTD = localer.tTD.zL(132);
    }
    localer.tTA = b.aX(paramd.aGR);
    if (localer.tTA.tJp.length >= 36) {
      localer.tTA = localer.tTA.zL(36);
    }
    GMTrace.o(13591826661376L, 101267);
    return localer;
  }
  
  public static void a(e parame, es parames)
  {
    GMTrace.i(13591960879104L, 101268);
    if (parames.tTE != null)
    {
      parame.tKu = parames.tTE.uNR;
      GMTrace.o(13591960879104L, 101268);
      return;
    }
    parame.tKu = "";
    w.e("MicroMsg.MMBase", "ErrMsg is Null!!!!!!");
    GMTrace.o(13591960879104L, 101268);
  }
  
  public static abstract interface a
  {
    public abstract boolean a(PByteArray paramPByteArray, int paramInt1, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, int paramInt2);
  }
  
  public static abstract interface b
  {
    public abstract byte[] Ba();
    
    public abstract int Bb();
    
    public abstract boolean bOl();
  }
  
  public static abstract interface c
  {
    public abstract boolean bOl();
    
    public abstract int y(byte[] paramArrayOfByte);
  }
  
  public static class d
  {
    public byte[] aGR;
    public int tKi;
    public int tKj;
    public String tKk;
    public String tKl;
    public int tKm;
    public boolean tKn;
    public k.a tKo;
    public byte[] tKp;
    public ac tKq;
    public long tKr;
    
    public d()
    {
      GMTrace.i(13568070123520L, 101090);
      this.tKn = true;
      this.tKr = 0L;
      this.tKi = 0;
      this.tKj = 0;
      this.aGR = new byte[0];
      this.tKk = "";
      this.tKl = "";
      this.tKm = 0;
      this.tKq = new ac("", "", 0);
      GMTrace.o(13568070123520L, 101090);
    }
    
    public boolean Ei()
    {
      GMTrace.i(13568606994432L, 101094);
      boolean bool = this.tKn;
      GMTrace.o(13568606994432L, 101094);
      return bool;
    }
    
    public boolean bOl()
    {
      GMTrace.i(13568472776704L, 101093);
      GMTrace.o(13568472776704L, 101093);
      return false;
    }
    
    public void dp(int paramInt)
    {
      GMTrace.i(13568204341248L, 101091);
      this.tKi = paramInt;
      GMTrace.o(13568204341248L, 101091);
    }
    
    public int getCmdId()
    {
      GMTrace.i(13568338558976L, 101092);
      GMTrace.o(13568338558976L, 101092);
      return 0;
    }
  }
  
  public static class e
  {
    public long tKr;
    public int tKs;
    public int tKt;
    public String tKu;
    
    public e()
    {
      GMTrace.i(13590216048640L, 101255);
      this.tKr = 0L;
      this.tKs = -99;
      this.tKt = 255;
      this.tKu = "";
      GMTrace.o(13590216048640L, 101255);
    }
    
    public boolean bOl()
    {
      GMTrace.i(13590484484096L, 101257);
      GMTrace.o(13590484484096L, 101257);
      return false;
    }
    
    public int getCmdId()
    {
      GMTrace.i(13590350266368L, 101256);
      GMTrace.o(13590350266368L, 101256);
      return 0;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */