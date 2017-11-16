package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class apw
  extends com.tencent.mm.bm.a
{
  public String path;
  public int tWS;
  public String uFL;
  public String uFM;
  public String username;
  
  public apw()
  {
    GMTrace.i(3796751089664L, 28288);
    GMTrace.o(3796751089664L, 28288);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3796885307392L, 28289);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.username != null) {
        paramVarArgs.e(1, this.username);
      }
      if (this.uFL != null) {
        paramVarArgs.e(2, this.uFL);
      }
      if (this.uFM != null) {
        paramVarArgs.e(3, this.uFM);
      }
      if (this.path != null) {
        paramVarArgs.e(4, this.path);
      }
      paramVarArgs.fk(5, this.tWS);
      GMTrace.o(3796885307392L, 28289);
      return 0;
    }
    if (paramInt == 1) {
      if (this.username == null) {
        break label482;
      }
    }
    label482:
    for (int i = b.a.a.b.b.a.f(1, this.username) + 0;; i = 0)
    {
      paramInt = i;
      if (this.uFL != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.uFL);
      }
      i = paramInt;
      if (this.uFM != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.uFM);
      }
      paramInt = i;
      if (this.path != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.path);
      }
      i = b.a.a.a.fh(5, this.tWS);
      GMTrace.o(3796885307392L, 28289);
      return paramInt + i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(3796885307392L, 28289);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        apw localapw = (apw)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3796885307392L, 28289);
          return -1;
        case 1: 
          localapw.username = locala.yqV.readString();
          GMTrace.o(3796885307392L, 28289);
          return 0;
        case 2: 
          localapw.uFL = locala.yqV.readString();
          GMTrace.o(3796885307392L, 28289);
          return 0;
        case 3: 
          localapw.uFM = locala.yqV.readString();
          GMTrace.o(3796885307392L, 28289);
          return 0;
        case 4: 
          localapw.path = locala.yqV.readString();
          GMTrace.o(3796885307392L, 28289);
          return 0;
        }
        localapw.tWS = locala.yqV.nj();
        GMTrace.o(3796885307392L, 28289);
        return 0;
      }
      GMTrace.o(3796885307392L, 28289);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\apw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */