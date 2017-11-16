package com.tencent.mm.sdk.platformtools;

import android.os.SystemClock;
import com.tencent.gmtrace.GMTrace;
import java.util.ArrayList;

public final class be
{
  private boolean ivH;
  private String mTag;
  private String vlf;
  ArrayList<Long> vlg;
  ArrayList<String> vlh;
  
  public be(String paramString1, String paramString2)
  {
    GMTrace.i(13934350303232L, 103819);
    this.mTag = paramString1;
    this.vlf = paramString2;
    this.ivH = false;
    if (!this.ivH)
    {
      if (this.vlg != null) {
        break label77;
      }
      this.vlg = new ArrayList();
      this.vlh = new ArrayList();
    }
    for (;;)
    {
      addSplit(null);
      GMTrace.o(13934350303232L, 103819);
      return;
      label77:
      this.vlg.clear();
      this.vlh.clear();
    }
  }
  
  public final void addSplit(String paramString)
  {
    GMTrace.i(13934484520960L, 103820);
    if (this.ivH)
    {
      GMTrace.o(13934484520960L, 103820);
      return;
    }
    long l = SystemClock.elapsedRealtime();
    this.vlg.add(Long.valueOf(l));
    this.vlh.add(paramString);
    GMTrace.o(13934484520960L, 103820);
  }
  
  public final void dumpToLog()
  {
    GMTrace.i(13934618738688L, 103821);
    if (this.ivH)
    {
      GMTrace.o(13934618738688L, 103821);
      return;
    }
    w.d(this.mTag, this.vlf + ": begin");
    long l2 = ((Long)this.vlg.get(0)).longValue();
    int i = 1;
    long l1 = l2;
    while (i < this.vlg.size())
    {
      l1 = ((Long)this.vlg.get(i)).longValue();
      String str = (String)this.vlh.get(i);
      long l3 = ((Long)this.vlg.get(i - 1)).longValue();
      w.d(this.mTag, this.vlf + ":      " + (l1 - l3) + " ms, " + str);
      i += 1;
    }
    w.d(this.mTag, this.vlf + ": end, " + (l1 - l2) + " ms");
    GMTrace.o(13934618738688L, 103821);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\sdk\platformtools\be.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */