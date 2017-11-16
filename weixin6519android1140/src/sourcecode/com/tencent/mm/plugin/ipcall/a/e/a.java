package com.tencent.mm.plugin.ipcall.a.e;

import com.tencent.gmtrace.GMTrace;

public class a
{
  public boolean isStart;
  
  public a()
  {
    GMTrace.i(11601646190592L, 86439);
    this.isStart = false;
    GMTrace.o(11601646190592L, 86439);
  }
  
  protected void aIS()
  {
    GMTrace.i(11602048843776L, 86442);
    GMTrace.o(11602048843776L, 86442);
  }
  
  public final void finish()
  {
    GMTrace.i(11602183061504L, 86443);
    if (this.isStart)
    {
      aIS();
      this.isStart = false;
    }
    GMTrace.o(11602183061504L, 86443);
  }
  
  public void reset()
  {
    GMTrace.i(11601914626048L, 86441);
    GMTrace.o(11601914626048L, 86441);
  }
  
  public void start()
  {
    GMTrace.i(11601780408320L, 86440);
    reset();
    this.isStart = true;
    GMTrace.o(11601780408320L, 86440);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\ipcall\a\e\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */