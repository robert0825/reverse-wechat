package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class ki
  extends com.tencent.mm.bm.a
{
  public String eTJ;
  public String jBn;
  public int jxM;
  public int ubf;
  public String ubg;
  
  public ki()
  {
    GMTrace.i(3900904046592L, 29064);
    GMTrace.o(3900904046592L, 29064);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3901038264320L, 29065);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.eTJ != null) {
        paramVarArgs.e(1, this.eTJ);
      }
      if (this.jBn != null) {
        paramVarArgs.e(2, this.jBn);
      }
      paramVarArgs.fk(3, this.jxM);
      paramVarArgs.fk(4, this.ubf);
      if (this.ubg != null) {
        paramVarArgs.e(5, this.ubg);
      }
      GMTrace.o(3901038264320L, 29065);
      return 0;
    }
    if (paramInt == 1) {
      if (this.eTJ == null) {
        break label466;
      }
    }
    label466:
    for (paramInt = b.a.a.b.b.a.f(1, this.eTJ) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.jBn != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.jBn);
      }
      i = i + b.a.a.a.fh(3, this.jxM) + b.a.a.a.fh(4, this.ubf);
      paramInt = i;
      if (this.ubg != null) {
        paramInt = i + b.a.a.b.b.a.f(5, this.ubg);
      }
      GMTrace.o(3901038264320L, 29065);
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(3901038264320L, 29065);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        ki localki = (ki)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3901038264320L, 29065);
          return -1;
        case 1: 
          localki.eTJ = locala.yqV.readString();
          GMTrace.o(3901038264320L, 29065);
          return 0;
        case 2: 
          localki.jBn = locala.yqV.readString();
          GMTrace.o(3901038264320L, 29065);
          return 0;
        case 3: 
          localki.jxM = locala.yqV.nj();
          GMTrace.o(3901038264320L, 29065);
          return 0;
        case 4: 
          localki.ubf = locala.yqV.nj();
          GMTrace.o(3901038264320L, 29065);
          return 0;
        }
        localki.ubg = locala.yqV.readString();
        GMTrace.o(3901038264320L, 29065);
        return 0;
      }
      GMTrace.o(3901038264320L, 29065);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\ki.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */