package com.tencent.mm.plugin.exdevice.e;

import com.tencent.gmtrace.GMTrace;

public final class c
  extends com.tencent.mm.bm.a
{
  public String kBj;
  
  public c()
  {
    GMTrace.i(11109335564288L, 82771);
    GMTrace.o(11109335564288L, 82771);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(11109469782016L, 82772);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.kBj != null) {
        paramVarArgs.e(1, this.kBj);
      }
      GMTrace.o(11109469782016L, 82772);
      return 0;
    }
    if (paramInt == 1) {
      if (this.kBj == null) {
        break label234;
      }
    }
    label234:
    for (paramInt = b.a.a.b.b.a.f(1, this.kBj) + 0;; paramInt = 0)
    {
      GMTrace.o(11109469782016L, 82772);
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(11109469782016L, 82772);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        c localc = (c)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(11109469782016L, 82772);
          return -1;
        }
        localc.kBj = locala.yqV.readString();
        GMTrace.o(11109469782016L, 82772);
        return 0;
      }
      GMTrace.o(11109469782016L, 82772);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\exdevice\e\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */