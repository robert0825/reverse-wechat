package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class nb
  extends com.tencent.mm.bm.a
{
  public int oHp;
  public long udV;
  
  public nb()
  {
    GMTrace.i(19905831239680L, 148310);
    GMTrace.o(19905831239680L, 148310);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(19905965457408L, 148311);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.T(1, this.udV);
      paramVarArgs.fk(2, this.oHp);
      GMTrace.o(19905965457408L, 148311);
      return 0;
    }
    if (paramInt == 1)
    {
      paramInt = b.a.a.a.S(1, this.udV);
      int i = b.a.a.a.fh(2, this.oHp);
      GMTrace.o(19905965457408L, 148311);
      return paramInt + 0 + i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(19905965457408L, 148311);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      nb localnb = (nb)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(19905965457408L, 148311);
        return -1;
      case 1: 
        localnb.udV = locala.yqV.nk();
        GMTrace.o(19905965457408L, 148311);
        return 0;
      }
      localnb.oHp = locala.yqV.nj();
      GMTrace.o(19905965457408L, 148311);
      return 0;
    }
    GMTrace.o(19905965457408L, 148311);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\nb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */