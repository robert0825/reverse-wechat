package com.tencent.mm.plugin.ipcall.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class f
{
  private static Map<Integer, List<Integer>> miJ;
  public int miI;
  
  static
  {
    GMTrace.i(11609296601088L, 86496);
    miJ = new HashMap();
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(Integer.valueOf(3));
    localArrayList.add(Integer.valueOf(2));
    localArrayList.add(Integer.valueOf(8));
    localArrayList.add(Integer.valueOf(12));
    miJ.put(Integer.valueOf(1), localArrayList);
    localArrayList = new ArrayList();
    localArrayList.add(Integer.valueOf(12));
    localArrayList.add(Integer.valueOf(8));
    miJ.put(Integer.valueOf(2), localArrayList);
    localArrayList = new ArrayList();
    localArrayList.add(Integer.valueOf(4));
    localArrayList.add(Integer.valueOf(5));
    localArrayList.add(Integer.valueOf(8));
    localArrayList.add(Integer.valueOf(12));
    miJ.put(Integer.valueOf(3), localArrayList);
    localArrayList = new ArrayList();
    localArrayList.add(Integer.valueOf(5));
    localArrayList.add(Integer.valueOf(8));
    localArrayList.add(Integer.valueOf(12));
    miJ.put(Integer.valueOf(4), localArrayList);
    localArrayList = new ArrayList();
    localArrayList.add(Integer.valueOf(9));
    localArrayList.add(Integer.valueOf(10));
    localArrayList.add(Integer.valueOf(11));
    miJ.put(Integer.valueOf(5), localArrayList);
    GMTrace.o(11609296601088L, 86496);
  }
  
  public f()
  {
    GMTrace.i(11608357076992L, 86489);
    this.miI = -1;
    GMTrace.o(11608357076992L, 86489);
  }
  
  public static String stateToString(int paramInt)
  {
    GMTrace.i(11609162383360L, 86495);
    switch (paramInt)
    {
    case 0: 
    case 6: 
    case 7: 
    default: 
      GMTrace.o(11609162383360L, 86495);
      return String.valueOf(paramInt);
    case -1: 
      GMTrace.o(11609162383360L, 86495);
      return "RESET_STATE";
    case 1: 
      GMTrace.o(11609162383360L, 86495);
      return "START_INVITE";
    case 2: 
      GMTrace.o(11609162383360L, 86495);
      return "INVITE_FAILED";
    case 3: 
      GMTrace.o(11609162383360L, 86495);
      return "INVITE_SUCCESS";
    case 4: 
      GMTrace.o(11609162383360L, 86495);
      return "RING_ING";
    case 5: 
      GMTrace.o(11609162383360L, 86495);
      return "USER_ACCEPT";
    case 10: 
      GMTrace.o(11609162383360L, 86495);
      return "OTHER_SIDE_USER_SHUTDOWN";
    case 8: 
      GMTrace.o(11609162383360L, 86495);
      return "USER_CANCEL";
    case 9: 
      GMTrace.o(11609162383360L, 86495);
      return "USER_SELF_SHUTDOWN";
    case 11: 
      GMTrace.o(11609162383360L, 86495);
      return "USER_SELF_SHUTDOWN_BY_ERR";
    }
    GMTrace.o(11609162383360L, 86495);
    return "CANCEL_BY_ERR";
  }
  
  public final boolean aIi()
  {
    GMTrace.i(11608625512448L, 86491);
    if ((this.miI == 1) || (this.miI == 3) || (this.miI == 4) || (this.miI == 5))
    {
      GMTrace.o(11608625512448L, 86491);
      return true;
    }
    GMTrace.o(11608625512448L, 86491);
    return false;
  }
  
  public final boolean aIj()
  {
    GMTrace.i(11608759730176L, 86492);
    if ((this.miI == 4) || (this.miI == 5))
    {
      GMTrace.o(11608759730176L, 86492);
      return true;
    }
    GMTrace.o(11608759730176L, 86492);
    return false;
  }
  
  public final boolean aIk()
  {
    GMTrace.i(11608893947904L, 86493);
    if (this.miI == 5)
    {
      GMTrace.o(11608893947904L, 86493);
      return true;
    }
    GMTrace.o(11608893947904L, 86493);
    return false;
  }
  
  public final boolean aIl()
  {
    GMTrace.i(11609028165632L, 86494);
    if (this.miI == 5)
    {
      GMTrace.o(11609028165632L, 86494);
      return true;
    }
    GMTrace.o(11609028165632L, 86494);
    return false;
  }
  
  public final boolean pl(int paramInt)
  {
    GMTrace.i(11608491294720L, 86490);
    int i;
    if (this.miI == -1) {
      i = 1;
    }
    while (i != 0)
    {
      w.i("MicroMsg.IPCallStateIndicator", "updateState, origin: %s, new: %s", new Object[] { stateToString(this.miI), stateToString(paramInt) });
      this.miI = paramInt;
      GMTrace.o(11608491294720L, 86490);
      return true;
      if ((miJ.containsKey(Integer.valueOf(this.miI))) && (((List)miJ.get(Integer.valueOf(this.miI))).contains(Integer.valueOf(paramInt)))) {
        i = 1;
      } else {
        i = 0;
      }
    }
    w.i("MicroMsg.IPCallStateIndicator", "transform state error, origin state: %s, new state: %s", new Object[] { stateToString(i.aIs().miI), stateToString(paramInt) });
    GMTrace.o(11608491294720L, 86490);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\ipcall\a\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */