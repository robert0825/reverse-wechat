package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class k
  extends com.tencent.mm.bm.a
{
  public long eYB;
  public int state;
  public String tLZ;
  public String tMa;
  public String tMj;
  public int tMk;
  public String tMl;
  public String tMm;
  public String title;
  
  public k()
  {
    GMTrace.i(3831647698944L, 28548);
    GMTrace.o(3831647698944L, 28548);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3831781916672L, 28549);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.tLZ != null) {
        paramVarArgs.e(1, this.tLZ);
      }
      if (this.title != null) {
        paramVarArgs.e(2, this.title);
      }
      paramVarArgs.T(3, this.eYB);
      if (this.tMj != null) {
        paramVarArgs.e(5, this.tMj);
      }
      paramVarArgs.fk(10, this.state);
      paramVarArgs.fk(11, this.tMk);
      if (this.tMl != null) {
        paramVarArgs.e(12, this.tMl);
      }
      if (this.tMa != null) {
        paramVarArgs.e(13, this.tMa);
      }
      if (this.tMm != null) {
        paramVarArgs.e(14, this.tMm);
      }
      GMTrace.o(3831781916672L, 28549);
      return 0;
    }
    if (paramInt == 1) {
      if (this.tLZ == null) {
        break label734;
      }
    }
    label734:
    for (paramInt = b.a.a.b.b.a.f(1, this.tLZ) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.title != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.title);
      }
      i += b.a.a.a.S(3, this.eYB);
      paramInt = i;
      if (this.tMj != null) {
        paramInt = i + b.a.a.b.b.a.f(5, this.tMj);
      }
      i = paramInt + b.a.a.a.fh(10, this.state) + b.a.a.a.fh(11, this.tMk);
      paramInt = i;
      if (this.tMl != null) {
        paramInt = i + b.a.a.b.b.a.f(12, this.tMl);
      }
      i = paramInt;
      if (this.tMa != null) {
        i = paramInt + b.a.a.b.b.a.f(13, this.tMa);
      }
      paramInt = i;
      if (this.tMm != null) {
        paramInt = i + b.a.a.b.b.a.f(14, this.tMm);
      }
      GMTrace.o(3831781916672L, 28549);
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(3831781916672L, 28549);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        k localk = (k)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        case 4: 
        case 6: 
        case 7: 
        case 8: 
        case 9: 
        default: 
          GMTrace.o(3831781916672L, 28549);
          return -1;
        case 1: 
          localk.tLZ = locala.yqV.readString();
          GMTrace.o(3831781916672L, 28549);
          return 0;
        case 2: 
          localk.title = locala.yqV.readString();
          GMTrace.o(3831781916672L, 28549);
          return 0;
        case 3: 
          localk.eYB = locala.yqV.nk();
          GMTrace.o(3831781916672L, 28549);
          return 0;
        case 5: 
          localk.tMj = locala.yqV.readString();
          GMTrace.o(3831781916672L, 28549);
          return 0;
        case 10: 
          localk.state = locala.yqV.nj();
          GMTrace.o(3831781916672L, 28549);
          return 0;
        case 11: 
          localk.tMk = locala.yqV.nj();
          GMTrace.o(3831781916672L, 28549);
          return 0;
        case 12: 
          localk.tMl = locala.yqV.readString();
          GMTrace.o(3831781916672L, 28549);
          return 0;
        case 13: 
          localk.tMa = locala.yqV.readString();
          GMTrace.o(3831781916672L, 28549);
          return 0;
        }
        localk.tMm = locala.yqV.readString();
        GMTrace.o(3831781916672L, 28549);
        return 0;
      }
      GMTrace.o(3831781916672L, 28549);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */