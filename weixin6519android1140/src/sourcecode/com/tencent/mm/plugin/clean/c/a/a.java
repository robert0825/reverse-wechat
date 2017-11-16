package com.tencent.mm.plugin.clean.c.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public abstract class a
  implements Runnable
{
  private long iyA;
  private a jTx;
  c jTy;
  
  public a(a parama)
  {
    GMTrace.i(7048846639104L, 52518);
    this.iyA = 0L;
    this.jTx = parama;
    GMTrace.o(7048846639104L, 52518);
  }
  
  public String MY()
  {
    GMTrace.i(15051310235648L, 112141);
    String str = this.iyA;
    GMTrace.o(15051310235648L, 112141);
    return str;
  }
  
  public abstract void execute();
  
  public void run()
  {
    GMTrace.i(7048980856832L, 52519);
    try
    {
      this.iyA = bg.Pw();
      execute();
      this.iyA = bg.aI(this.iyA);
      if (this.jTy != null) {
        this.jTy.f(Long.valueOf(Thread.currentThread().getId()));
      }
      if (this.jTx != null)
      {
        this.jTx.a(this);
        GMTrace.o(7048980856832L, 52519);
        return;
      }
    }
    catch (Exception localException)
    {
      w.printErrStackTrace("MicroMsg.AbstractTask", localException, "", new Object[0]);
      if (this.jTy != null) {
        this.jTy.f(Long.valueOf(Thread.currentThread().getId()));
      }
      if (this.jTx != null)
      {
        this.jTx.a(this);
        GMTrace.o(7048980856832L, 52519);
        return;
      }
    }
    finally
    {
      if (this.jTy != null) {
        this.jTy.f(Long.valueOf(Thread.currentThread().getId()));
      }
      if (this.jTx != null) {
        this.jTx.a(this);
      }
    }
    GMTrace.o(7048980856832L, 52519);
  }
  
  public static abstract interface a
  {
    public abstract void a(a parama);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\clean\c\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */