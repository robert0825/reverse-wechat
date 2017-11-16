package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bm.b;

public final class bqv
  extends com.tencent.mm.bm.a
{
  public b vaB;
  public b vaG;
  
  public bqv()
  {
    GMTrace.i(3995795980288L, 29771);
    GMTrace.o(3995795980288L, 29771);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3995930198016L, 29772);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.vaB != null) {
        paramVarArgs.b(1, this.vaB);
      }
      if (this.vaG != null) {
        paramVarArgs.b(2, this.vaG);
      }
      GMTrace.o(3995930198016L, 29772);
      return 0;
    }
    if (paramInt == 1) {
      if (this.vaB == null) {
        break label300;
      }
    }
    label300:
    for (paramInt = b.a.a.a.a(1, this.vaB) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.vaG != null) {
        i = paramInt + b.a.a.a.a(2, this.vaG);
      }
      GMTrace.o(3995930198016L, 29772);
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(3995930198016L, 29772);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        bqv localbqv = (bqv)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3995930198016L, 29772);
          return -1;
        case 1: 
          localbqv.vaB = locala.csV();
          GMTrace.o(3995930198016L, 29772);
          return 0;
        }
        localbqv.vaG = locala.csV();
        GMTrace.o(3995930198016L, 29772);
        return 0;
      }
      GMTrace.o(3995930198016L, 29772);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\bqv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */