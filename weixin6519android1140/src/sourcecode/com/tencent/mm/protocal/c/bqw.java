package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bm.b;

public final class bqw
  extends com.tencent.mm.bm.a
{
  public b vaH;
  public b vaI;
  
  public bqw()
  {
    GMTrace.i(3620120559616L, 26972);
    GMTrace.o(3620120559616L, 26972);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3620254777344L, 26973);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.vaH != null) {
        paramVarArgs.b(1, this.vaH);
      }
      if (this.vaI != null) {
        paramVarArgs.b(2, this.vaI);
      }
      GMTrace.o(3620254777344L, 26973);
      return 0;
    }
    if (paramInt == 1) {
      if (this.vaH == null) {
        break label300;
      }
    }
    label300:
    for (paramInt = b.a.a.a.a(1, this.vaH) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.vaI != null) {
        i = paramInt + b.a.a.a.a(2, this.vaI);
      }
      GMTrace.o(3620254777344L, 26973);
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(3620254777344L, 26973);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        bqw localbqw = (bqw)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3620254777344L, 26973);
          return -1;
        case 1: 
          localbqw.vaH = locala.csV();
          GMTrace.o(3620254777344L, 26973);
          return 0;
        }
        localbqw.vaI = locala.csV();
        GMTrace.o(3620254777344L, 26973);
        return 0;
      }
      GMTrace.o(3620254777344L, 26973);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\bqw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */