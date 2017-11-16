package com.tencent.mm.plugin.order.model;

import com.tencent.gmtrace.GMTrace;

public final class k
  extends com.tencent.mm.bm.a
{
  public String nFH;
  public String nFI;
  
  public k()
  {
    GMTrace.i(6625389707264L, 49363);
    GMTrace.o(6625389707264L, 49363);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(6625523924992L, 49364);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.nFH != null) {
        paramVarArgs.e(1, this.nFH);
      }
      if (this.nFI != null) {
        paramVarArgs.e(2, this.nFI);
      }
      GMTrace.o(6625523924992L, 49364);
      return 0;
    }
    if (paramInt == 1) {
      if (this.nFH == null) {
        break label298;
      }
    }
    label298:
    for (paramInt = b.a.a.b.b.a.f(1, this.nFH) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.nFI != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.nFI);
      }
      GMTrace.o(6625523924992L, 49364);
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(6625523924992L, 49364);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        k localk = (k)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(6625523924992L, 49364);
          return -1;
        case 1: 
          localk.nFH = locala.yqV.readString();
          GMTrace.o(6625523924992L, 49364);
          return 0;
        }
        localk.nFI = locala.yqV.readString();
        GMTrace.o(6625523924992L, 49364);
        return 0;
      }
      GMTrace.o(6625523924992L, 49364);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\order\model\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */