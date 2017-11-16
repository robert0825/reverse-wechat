package com.tencent.mm.plugin.ipcall.a.e;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.report.service.g;

public final class f
  extends a
{
  public int mmi;
  public int mmj;
  public int mmk;
  public int mml;
  public int mmm;
  public String mmn;
  public int mmo;
  public int mmp;
  
  public f()
  {
    GMTrace.i(15068087451648L, 112266);
    this.mmi = 0;
    this.mmj = 0;
    this.mmk = 0;
    this.mml = 0;
    this.mmm = 55537;
    this.mmn = "";
    this.mmo = 0;
    this.mmp = 0;
    GMTrace.o(15068087451648L, 112266);
  }
  
  protected final void aIS()
  {
    GMTrace.i(15068490104832L, 112269);
    g.ork.i(14182, new Object[] { Integer.valueOf(this.mmi), Integer.valueOf(this.mmj), Integer.valueOf(this.mmk), Integer.valueOf(this.mml), Integer.valueOf(this.mmm), this.mmn, Integer.valueOf(this.mmo), Integer.valueOf(this.mmp) });
    GMTrace.o(15068490104832L, 112269);
  }
  
  public final void reset()
  {
    GMTrace.i(15068355887104L, 112268);
    this.mmi = 0;
    this.mmj = 0;
    this.mmk = 0;
    this.mml = 0;
    this.mmm = 55537;
    this.mmn = "";
    this.mmo = 0;
    this.mmp = 0;
    GMTrace.o(15068355887104L, 112268);
  }
  
  public final void start()
  {
    GMTrace.i(15068221669376L, 112267);
    super.start();
    GMTrace.o(15068221669376L, 112267);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\ipcall\a\e\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */