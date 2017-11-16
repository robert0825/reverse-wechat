package com.tencent.mm.plugin.chatroom.f;

import com.tencent.gmtrace.GMTrace;

public final class a
{
  public static int bO(int paramInt1, int paramInt2)
  {
    GMTrace.i(9168547217408L, 68311);
    switch (paramInt1)
    {
    default: 
      throw new IllegalArgumentException("Invalid Month");
    case 0: 
    case 2: 
    case 4: 
    case 6: 
    case 7: 
    case 9: 
    case 11: 
      GMTrace.o(9168547217408L, 68311);
      return 31;
    case 3: 
    case 5: 
    case 8: 
    case 10: 
      GMTrace.o(9168547217408L, 68311);
      return 30;
    }
    if (((paramInt2 % 4 == 0) && (paramInt2 % 100 != 0)) || (paramInt2 % 400 == 0))
    {
      GMTrace.o(9168547217408L, 68311);
      return 29;
    }
    GMTrace.o(9168547217408L, 68311);
    return 28;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\chatroom\f\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */