package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class arq
  extends com.tencent.mm.bm.a
{
  public String desc;
  public String nIw;
  public String title;
  public String uga;
  
  public arq()
  {
    GMTrace.i(19137300529152L, 142584);
    GMTrace.o(19137300529152L, 142584);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(19137434746880L, 142585);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.title != null) {
        paramVarArgs.e(1, this.title);
      }
      if (this.desc != null) {
        paramVarArgs.e(2, this.desc);
      }
      if (this.uga != null) {
        paramVarArgs.e(3, this.uga);
      }
      if (this.nIw != null) {
        paramVarArgs.e(4, this.nIw);
      }
      GMTrace.o(19137434746880L, 142585);
      return 0;
    }
    if (paramInt == 1) {
      if (this.title == null) {
        break label424;
      }
    }
    label424:
    for (int i = b.a.a.b.b.a.f(1, this.title) + 0;; i = 0)
    {
      paramInt = i;
      if (this.desc != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.desc);
      }
      i = paramInt;
      if (this.uga != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.uga);
      }
      paramInt = i;
      if (this.nIw != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.nIw);
      }
      GMTrace.o(19137434746880L, 142585);
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(19137434746880L, 142585);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        arq localarq = (arq)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(19137434746880L, 142585);
          return -1;
        case 1: 
          localarq.title = locala.yqV.readString();
          GMTrace.o(19137434746880L, 142585);
          return 0;
        case 2: 
          localarq.desc = locala.yqV.readString();
          GMTrace.o(19137434746880L, 142585);
          return 0;
        case 3: 
          localarq.uga = locala.yqV.readString();
          GMTrace.o(19137434746880L, 142585);
          return 0;
        }
        localarq.nIw = locala.yqV.readString();
        GMTrace.o(19137434746880L, 142585);
        return 0;
      }
      GMTrace.o(19137434746880L, 142585);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\arq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */