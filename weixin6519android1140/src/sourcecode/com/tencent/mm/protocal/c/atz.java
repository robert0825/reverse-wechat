package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class atz
  extends com.tencent.mm.bm.a
{
  public String qYy;
  public String uJs;
  public String uJt;
  public int uJu;
  public String uga;
  
  public atz()
  {
    GMTrace.i(19139179577344L, 142598);
    GMTrace.o(19139179577344L, 142598);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(19139313795072L, 142599);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uJs != null) {
        paramVarArgs.e(1, this.uJs);
      }
      if (this.uJt != null) {
        paramVarArgs.e(2, this.uJt);
      }
      if (this.qYy != null) {
        paramVarArgs.e(3, this.qYy);
      }
      if (this.uga != null) {
        paramVarArgs.e(4, this.uga);
      }
      paramVarArgs.fk(5, this.uJu);
      GMTrace.o(19139313795072L, 142599);
      return 0;
    }
    if (paramInt == 1) {
      if (this.uJs == null) {
        break label471;
      }
    }
    label471:
    for (int i = b.a.a.b.b.a.f(1, this.uJs) + 0;; i = 0)
    {
      paramInt = i;
      if (this.uJt != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.uJt);
      }
      i = paramInt;
      if (this.qYy != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.qYy);
      }
      paramInt = i;
      if (this.uga != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.uga);
      }
      i = b.a.a.a.fh(5, this.uJu);
      GMTrace.o(19139313795072L, 142599);
      return paramInt + i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(19139313795072L, 142599);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        atz localatz = (atz)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(19139313795072L, 142599);
          return -1;
        case 1: 
          localatz.uJs = locala.yqV.readString();
          GMTrace.o(19139313795072L, 142599);
          return 0;
        case 2: 
          localatz.uJt = locala.yqV.readString();
          GMTrace.o(19139313795072L, 142599);
          return 0;
        case 3: 
          localatz.qYy = locala.yqV.readString();
          GMTrace.o(19139313795072L, 142599);
          return 0;
        case 4: 
          localatz.uga = locala.yqV.readString();
          GMTrace.o(19139313795072L, 142599);
          return 0;
        }
        localatz.uJu = locala.yqV.nj();
        GMTrace.o(19139313795072L, 142599);
        return 0;
      }
      GMTrace.o(19139313795072L, 142599);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\atz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */