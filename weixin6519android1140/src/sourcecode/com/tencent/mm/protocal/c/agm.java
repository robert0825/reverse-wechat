package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class agm
  extends com.tencent.mm.bm.a
{
  public String jhi;
  public String jio;
  public int tST;
  public String tUq;
  public String uoe;
  public String uwd;
  public String uwe;
  
  public agm()
  {
    GMTrace.i(3800509186048L, 28316);
    GMTrace.o(3800509186048L, 28316);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3800643403776L, 28317);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.tUq != null) {
        paramVarArgs.e(1, this.tUq);
      }
      if (this.jhi != null) {
        paramVarArgs.e(2, this.jhi);
      }
      if (this.uwd != null) {
        paramVarArgs.e(3, this.uwd);
      }
      if (this.uwe != null) {
        paramVarArgs.e(4, this.uwe);
      }
      paramVarArgs.fk(5, this.tST);
      if (this.jio != null) {
        paramVarArgs.e(6, this.jio);
      }
      if (this.uoe != null) {
        paramVarArgs.e(7, this.uoe);
      }
      GMTrace.o(3800643403776L, 28317);
      return 0;
    }
    if (paramInt == 1) {
      if (this.tUq == null) {
        break label614;
      }
    }
    label614:
    for (int i = b.a.a.b.b.a.f(1, this.tUq) + 0;; i = 0)
    {
      paramInt = i;
      if (this.jhi != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.jhi);
      }
      i = paramInt;
      if (this.uwd != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.uwd);
      }
      paramInt = i;
      if (this.uwe != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.uwe);
      }
      i = paramInt + b.a.a.a.fh(5, this.tST);
      paramInt = i;
      if (this.jio != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.jio);
      }
      i = paramInt;
      if (this.uoe != null) {
        i = paramInt + b.a.a.b.b.a.f(7, this.uoe);
      }
      GMTrace.o(3800643403776L, 28317);
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(3800643403776L, 28317);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        agm localagm = (agm)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3800643403776L, 28317);
          return -1;
        case 1: 
          localagm.tUq = locala.yqV.readString();
          GMTrace.o(3800643403776L, 28317);
          return 0;
        case 2: 
          localagm.jhi = locala.yqV.readString();
          GMTrace.o(3800643403776L, 28317);
          return 0;
        case 3: 
          localagm.uwd = locala.yqV.readString();
          GMTrace.o(3800643403776L, 28317);
          return 0;
        case 4: 
          localagm.uwe = locala.yqV.readString();
          GMTrace.o(3800643403776L, 28317);
          return 0;
        case 5: 
          localagm.tST = locala.yqV.nj();
          GMTrace.o(3800643403776L, 28317);
          return 0;
        case 6: 
          localagm.jio = locala.yqV.readString();
          GMTrace.o(3800643403776L, 28317);
          return 0;
        }
        localagm.uoe = locala.yqV.readString();
        GMTrace.o(3800643403776L, 28317);
        return 0;
      }
      GMTrace.o(3800643403776L, 28317);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\agm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */