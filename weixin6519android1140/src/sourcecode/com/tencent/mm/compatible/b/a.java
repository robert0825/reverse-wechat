package com.tencent.mm.compatible.b;

import com.tencent.gmtrace.GMTrace;
import java.util.concurrent.locks.Lock;

public final class a
{
  public int fMD;
  public int fME;
  public byte[] fMF;
  public int fMG;
  public int fMH;
  public boolean fMI;
  public Lock fMJ;
  
  public a()
  {
    GMTrace.i(13822546935808L, 102986);
    this.fMD = 0;
    this.fME = 0;
    this.fMF = null;
    this.fMG = 0;
    this.fMH = 0;
    this.fMI = false;
    this.fMJ = null;
    GMTrace.o(13822546935808L, 102986);
  }
  
  public final int sb()
  {
    GMTrace.i(13822681153536L, 102987);
    if (this.fMI) {
      this.fMJ.lock();
    }
    if (this.fMG == this.fMH)
    {
      GMTrace.o(13822681153536L, 102987);
      return 0;
    }
    if (this.fMG < this.fMH) {
      this.fME = (this.fMH - this.fMG);
    }
    for (;;)
    {
      if (this.fMI) {
        this.fMJ.unlock();
      }
      int i = this.fME;
      GMTrace.o(13822681153536L, 102987);
      return i;
      if (this.fMG > this.fMH) {
        this.fME = (this.fMH + this.fMD - this.fMG);
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\compatible\b\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */