package com.tencent.mm.plugin.mmsight.model.a;

import android.graphics.Point;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.e.b.c.a;
import com.tencent.mm.plugin.mmsight.model.f;

public abstract interface d
{
  public abstract void CJ(String paramString);
  
  public abstract void CK(String paramString);
  
  public abstract void G(int paramInt1, int paramInt2, int paramInt3);
  
  public abstract String GS();
  
  public abstract void a(a parama);
  
  public abstract String aDc();
  
  public abstract boolean aOU();
  
  public abstract int aPA();
  
  public abstract boolean aPB();
  
  public abstract void aPC();
  
  public abstract c.a aPD();
  
  public abstract void aPE();
  
  public abstract String aPt();
  
  public abstract float aPu();
  
  public abstract long aPv();
  
  public abstract f aPw();
  
  public abstract c aPx();
  
  public abstract int aPy();
  
  public abstract Point aPz();
  
  public abstract int b(int paramInt1, boolean paramBoolean, int paramInt2);
  
  public abstract void cancel();
  
  public abstract String getFileName();
  
  public abstract String getFilePath();
  
  public abstract void k(int paramInt1, int paramInt2, int paramInt3, int paramInt4);
  
  public abstract void pause();
  
  public abstract boolean qJ(int paramInt);
  
  public abstract void reset();
  
  public abstract void setFilePath(String paramString);
  
  public abstract void x(Runnable paramRunnable);
  
  public static abstract interface a
  {
    public abstract void Rv();
  }
  
  public static abstract interface b {}
  
  public static enum c
  {
    static
    {
      GMTrace.i(18678678552576L, 139167);
      nad = new c("WaitStart", 0);
      nae = new c("Start", 1);
      naf = new c("PrepareStop", 2);
      nag = new c("WaitStop", 3);
      nah = new c("Stop", 4);
      nai = new c("WaitSend", 5);
      naj = new c("Sent", 6);
      nak = new c("Error", 7);
      nam = new c("Initialized", 8);
      nan = new c("Pause", 9);
      nao = new c[] { nad, nae, naf, nag, nah, nai, naj, nak, nam, nan };
      GMTrace.o(18678678552576L, 139167);
    }
    
    private c()
    {
      GMTrace.i(18678544334848L, 139166);
      GMTrace.o(18678544334848L, 139166);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\mmsight\model\a\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */