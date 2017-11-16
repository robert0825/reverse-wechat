package com.tencent.mm.plugin.game.c;

import com.tencent.gmtrace.GMTrace;

public final class ch
  extends com.tencent.mm.bm.a
{
  public String lPD;
  public String lPE;
  public String lPF;
  public int lSW;
  
  public ch()
  {
    GMTrace.i(12650960388096L, 94257);
    GMTrace.o(12650960388096L, 94257);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(12651094605824L, 94258);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.lPD != null) {
        paramVarArgs.e(1, this.lPD);
      }
      if (this.lPE != null) {
        paramVarArgs.e(2, this.lPE);
      }
      paramVarArgs.fk(3, this.lSW);
      if (this.lPF != null) {
        paramVarArgs.e(4, this.lPF);
      }
      GMTrace.o(12651094605824L, 94258);
      return 0;
    }
    if (paramInt == 1) {
      if (this.lPD == null) {
        break label408;
      }
    }
    label408:
    for (paramInt = b.a.a.b.b.a.f(1, this.lPD) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.lPE != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.lPE);
      }
      i += b.a.a.a.fh(3, this.lSW);
      paramInt = i;
      if (this.lPF != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.lPF);
      }
      GMTrace.o(12651094605824L, 94258);
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(12651094605824L, 94258);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        ch localch = (ch)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(12651094605824L, 94258);
          return -1;
        case 1: 
          localch.lPD = locala.yqV.readString();
          GMTrace.o(12651094605824L, 94258);
          return 0;
        case 2: 
          localch.lPE = locala.yqV.readString();
          GMTrace.o(12651094605824L, 94258);
          return 0;
        case 3: 
          localch.lSW = locala.yqV.nj();
          GMTrace.o(12651094605824L, 94258);
          return 0;
        }
        localch.lPF = locala.yqV.readString();
        GMTrace.o(12651094605824L, 94258);
        return 0;
      }
      GMTrace.o(12651094605824L, 94258);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\c\ch.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */