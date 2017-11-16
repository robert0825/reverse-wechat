package com.tencent.mm.plugin.notification.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;

public final class b
{
  int currentIndex;
  public ArrayList<Long> nyu;
  
  public b()
  {
    GMTrace.i(10741713207296L, 80032);
    this.currentIndex = 0;
    this.nyu = new ArrayList();
    this.currentIndex = 0;
    GMTrace.o(10741713207296L, 80032);
  }
  
  public final long aUM()
  {
    GMTrace.i(10741981642752L, 80034);
    long l2 = -1L;
    long l1 = l2;
    if (this.nyu.size() > 0)
    {
      l1 = l2;
      if (this.currentIndex < this.nyu.size()) {
        l1 = ((Long)this.nyu.get(this.currentIndex)).longValue();
      }
    }
    w.d("MicroMsg.FailMsglist", "getNextSendMsgId:%d, currentIndex:%d, msgIdList.size:%d", new Object[] { Long.valueOf(l1), Integer.valueOf(this.currentIndex), Integer.valueOf(this.nyu.size()) });
    this.currentIndex += 1;
    GMTrace.o(10741981642752L, 80034);
    return l1;
  }
  
  public final void clear()
  {
    GMTrace.i(10742250078208L, 80036);
    this.nyu.clear();
    this.currentIndex = 0;
    GMTrace.o(10742250078208L, 80036);
  }
  
  public final void da(long paramLong)
  {
    GMTrace.i(10741847425024L, 80033);
    w.d("MicroMsg.FailMsglist", "addMsgId:%d, currentIndex:%d, size:%d", new Object[] { Long.valueOf(paramLong), Integer.valueOf(this.currentIndex), Integer.valueOf(this.nyu.size()) });
    this.nyu.add(Long.valueOf(paramLong));
    GMTrace.o(10741847425024L, 80033);
  }
  
  public final boolean db(long paramLong)
  {
    GMTrace.i(10742115860480L, 80035);
    boolean bool = this.nyu.contains(Long.valueOf(paramLong));
    GMTrace.o(10742115860480L, 80035);
    return bool;
  }
  
  public final long get(int paramInt)
  {
    GMTrace.i(10742384295936L, 80037);
    long l = ((Long)this.nyu.get(paramInt)).longValue();
    GMTrace.o(10742384295936L, 80037);
    return l;
  }
  
  public final void remove(long paramLong)
  {
    GMTrace.i(10742518513664L, 80038);
    this.nyu.remove(Long.valueOf(paramLong));
    GMTrace.o(10742518513664L, 80038);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\notification\c\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */