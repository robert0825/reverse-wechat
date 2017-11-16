package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class bdx
  extends com.tencent.mm.bm.a
{
  public String jWz;
  public String mJO;
  public String mJP;
  
  public bdx()
  {
    GMTrace.i(19144279851008L, 142636);
    GMTrace.o(19144279851008L, 142636);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(19144414068736L, 142637);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.mJO != null) {
        paramVarArgs.e(1, this.mJO);
      }
      if (this.mJP != null) {
        paramVarArgs.e(2, this.mJP);
      }
      if (this.jWz != null) {
        paramVarArgs.e(3, this.jWz);
      }
      GMTrace.o(19144414068736L, 142637);
      return 0;
    }
    if (paramInt == 1) {
      if (this.mJO == null) {
        break label361;
      }
    }
    label361:
    for (int i = b.a.a.b.b.a.f(1, this.mJO) + 0;; i = 0)
    {
      paramInt = i;
      if (this.mJP != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.mJP);
      }
      i = paramInt;
      if (this.jWz != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.jWz);
      }
      GMTrace.o(19144414068736L, 142637);
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(19144414068736L, 142637);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        bdx localbdx = (bdx)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(19144414068736L, 142637);
          return -1;
        case 1: 
          localbdx.mJO = locala.yqV.readString();
          GMTrace.o(19144414068736L, 142637);
          return 0;
        case 2: 
          localbdx.mJP = locala.yqV.readString();
          GMTrace.o(19144414068736L, 142637);
          return 0;
        }
        localbdx.jWz = locala.yqV.readString();
        GMTrace.o(19144414068736L, 142637);
        return 0;
      }
      GMTrace.o(19144414068736L, 142637);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\bdx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */