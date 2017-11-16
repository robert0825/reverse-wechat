package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class qz
  extends com.tencent.mm.bm.a
{
  public String lPM;
  public int ufa;
  public String ugB;
  
  public qz()
  {
    GMTrace.i(3814736265216L, 28422);
    GMTrace.o(3814736265216L, 28422);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3814870482944L, 28423);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.lPM != null) {
        paramVarArgs.e(1, this.lPM);
      }
      if (this.ugB != null) {
        paramVarArgs.e(2, this.ugB);
      }
      paramVarArgs.fk(3, this.ufa);
      GMTrace.o(3814870482944L, 28423);
      return 0;
    }
    if (paramInt == 1) {
      if (this.lPM == null) {
        break label354;
      }
    }
    label354:
    for (paramInt = b.a.a.b.b.a.f(1, this.lPM) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.ugB != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.ugB);
      }
      paramInt = b.a.a.a.fh(3, this.ufa);
      GMTrace.o(3814870482944L, 28423);
      return i + paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(3814870482944L, 28423);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        qz localqz = (qz)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3814870482944L, 28423);
          return -1;
        case 1: 
          localqz.lPM = locala.yqV.readString();
          GMTrace.o(3814870482944L, 28423);
          return 0;
        case 2: 
          localqz.ugB = locala.yqV.readString();
          GMTrace.o(3814870482944L, 28423);
          return 0;
        }
        localqz.ufa = locala.yqV.nj();
        GMTrace.o(3814870482944L, 28423);
        return 0;
      }
      GMTrace.o(3814870482944L, 28423);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\qz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */