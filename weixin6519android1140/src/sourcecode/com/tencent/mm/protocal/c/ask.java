package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class ask
  extends com.tencent.mm.bm.a
{
  public String eSd;
  public String jxH;
  public String tZF;
  public int uIp;
  public String uIq;
  public String uIr;
  
  public ask()
  {
    GMTrace.i(3620657430528L, 26976);
    GMTrace.o(3620657430528L, 26976);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3620791648256L, 26977);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.eSd != null) {
        paramVarArgs.e(1, this.eSd);
      }
      paramVarArgs.fk(2, this.uIp);
      if (this.uIq != null) {
        paramVarArgs.e(3, this.uIq);
      }
      if (this.uIr != null) {
        paramVarArgs.e(4, this.uIr);
      }
      if (this.tZF != null) {
        paramVarArgs.e(5, this.tZF);
      }
      if (this.jxH != null) {
        paramVarArgs.e(6, this.jxH);
      }
      GMTrace.o(3620791648256L, 26977);
      return 0;
    }
    if (paramInt == 1) {
      if (this.eSd == null) {
        break label550;
      }
    }
    label550:
    for (paramInt = b.a.a.b.b.a.f(1, this.eSd) + 0;; paramInt = 0)
    {
      int i = paramInt + b.a.a.a.fh(2, this.uIp);
      paramInt = i;
      if (this.uIq != null) {
        paramInt = i + b.a.a.b.b.a.f(3, this.uIq);
      }
      i = paramInt;
      if (this.uIr != null) {
        i = paramInt + b.a.a.b.b.a.f(4, this.uIr);
      }
      paramInt = i;
      if (this.tZF != null) {
        paramInt = i + b.a.a.b.b.a.f(5, this.tZF);
      }
      i = paramInt;
      if (this.jxH != null) {
        i = paramInt + b.a.a.b.b.a.f(6, this.jxH);
      }
      GMTrace.o(3620791648256L, 26977);
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(3620791648256L, 26977);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        ask localask = (ask)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3620791648256L, 26977);
          return -1;
        case 1: 
          localask.eSd = locala.yqV.readString();
          GMTrace.o(3620791648256L, 26977);
          return 0;
        case 2: 
          localask.uIp = locala.yqV.nj();
          GMTrace.o(3620791648256L, 26977);
          return 0;
        case 3: 
          localask.uIq = locala.yqV.readString();
          GMTrace.o(3620791648256L, 26977);
          return 0;
        case 4: 
          localask.uIr = locala.yqV.readString();
          GMTrace.o(3620791648256L, 26977);
          return 0;
        case 5: 
          localask.tZF = locala.yqV.readString();
          GMTrace.o(3620791648256L, 26977);
          return 0;
        }
        localask.jxH = locala.yqV.readString();
        GMTrace.o(3620791648256L, 26977);
        return 0;
      }
      GMTrace.o(3620791648256L, 26977);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\ask.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */