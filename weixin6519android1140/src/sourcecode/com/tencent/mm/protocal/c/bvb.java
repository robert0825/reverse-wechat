package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class bvb
  extends com.tencent.mm.bm.a
{
  public String gvO;
  public String nDw;
  public String title;
  public String username;
  
  public bvb()
  {
    GMTrace.i(3884261048320L, 28940);
    GMTrace.o(3884261048320L, 28940);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3884395266048L, 28941);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.username != null) {
        paramVarArgs.e(1, this.username);
      }
      if (this.title != null) {
        paramVarArgs.e(2, this.title);
      }
      if (this.gvO != null) {
        paramVarArgs.e(3, this.gvO);
      }
      if (this.nDw != null) {
        paramVarArgs.e(4, this.nDw);
      }
      GMTrace.o(3884395266048L, 28941);
      return 0;
    }
    if (paramInt == 1) {
      if (this.username == null) {
        break label434;
      }
    }
    label434:
    for (int i = b.a.a.b.b.a.f(1, this.username) + 0;; i = 0)
    {
      paramInt = i;
      if (this.title != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.title);
      }
      i = paramInt;
      if (this.gvO != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.gvO);
      }
      paramInt = i;
      if (this.nDw != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.nDw);
      }
      GMTrace.o(3884395266048L, 28941);
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(3884395266048L, 28941);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        bvb localbvb = (bvb)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3884395266048L, 28941);
          return -1;
        case 1: 
          localbvb.username = locala.yqV.readString();
          GMTrace.o(3884395266048L, 28941);
          return 0;
        case 2: 
          localbvb.title = locala.yqV.readString();
          GMTrace.o(3884395266048L, 28941);
          return 0;
        case 3: 
          localbvb.gvO = locala.yqV.readString();
          GMTrace.o(3884395266048L, 28941);
          return 0;
        }
        localbvb.nDw = locala.yqV.readString();
        GMTrace.o(3884395266048L, 28941);
        return 0;
      }
      GMTrace.o(3884395266048L, 28941);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\bvb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */