package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class alv
  extends com.tencent.mm.bm.a
{
  public String tUw;
  public String tUx;
  public String tUy;
  
  public alv()
  {
    GMTrace.i(13336007671808L, 99361);
    GMTrace.o(13336007671808L, 99361);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(13336141889536L, 99362);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.tUx != null) {
        paramVarArgs.e(1, this.tUx);
      }
      if (this.tUw != null) {
        paramVarArgs.e(2, this.tUw);
      }
      if (this.tUy != null) {
        paramVarArgs.e(3, this.tUy);
      }
      GMTrace.o(13336141889536L, 99362);
      return 0;
    }
    if (paramInt == 1) {
      if (this.tUx == null) {
        break label361;
      }
    }
    label361:
    for (int i = b.a.a.b.b.a.f(1, this.tUx) + 0;; i = 0)
    {
      paramInt = i;
      if (this.tUw != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.tUw);
      }
      i = paramInt;
      if (this.tUy != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.tUy);
      }
      GMTrace.o(13336141889536L, 99362);
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(13336141889536L, 99362);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        alv localalv = (alv)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(13336141889536L, 99362);
          return -1;
        case 1: 
          localalv.tUx = locala.yqV.readString();
          GMTrace.o(13336141889536L, 99362);
          return 0;
        case 2: 
          localalv.tUw = locala.yqV.readString();
          GMTrace.o(13336141889536L, 99362);
          return 0;
        }
        localalv.tUy = locala.yqV.readString();
        GMTrace.o(13336141889536L, 99362);
        return 0;
      }
      GMTrace.o(13336141889536L, 99362);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\alv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */