package com.tencent.mm.plugin.backup.h;

import com.tencent.gmtrace.GMTrace;

public final class s
  extends com.tencent.mm.bm.a
{
  public long jhT;
  public long jhU;
  public long jhw;
  
  public s()
  {
    GMTrace.i(14838172483584L, 110553);
    GMTrace.o(14838172483584L, 110553);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(14838306701312L, 110554);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.T(1, this.jhw);
      paramVarArgs.T(2, this.jhT);
      paramVarArgs.T(3, this.jhU);
      GMTrace.o(14838306701312L, 110554);
      return 0;
    }
    if (paramInt == 1)
    {
      paramInt = b.a.a.a.S(1, this.jhw);
      int i = b.a.a.a.S(2, this.jhT);
      int j = b.a.a.a.S(3, this.jhU);
      GMTrace.o(14838306701312L, 110554);
      return paramInt + 0 + i + j;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(14838306701312L, 110554);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      s locals = (s)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(14838306701312L, 110554);
        return -1;
      case 1: 
        locals.jhw = locala.yqV.nk();
        GMTrace.o(14838306701312L, 110554);
        return 0;
      case 2: 
        locals.jhT = locala.yqV.nk();
        GMTrace.o(14838306701312L, 110554);
        return 0;
      }
      locals.jhU = locala.yqV.nk();
      GMTrace.o(14838306701312L, 110554);
      return 0;
    }
    GMTrace.o(14838306701312L, 110554);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\backup\h\s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */