package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class bta
  extends com.tencent.mm.bm.a
{
  public int tST;
  public int uEf;
  public long vbw;
  
  public bta()
  {
    GMTrace.i(3674881392640L, 27380);
    GMTrace.o(3674881392640L, 27380);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3675015610368L, 27381);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.tST);
      paramVarArgs.fk(2, this.uEf);
      paramVarArgs.T(3, this.vbw);
      GMTrace.o(3675015610368L, 27381);
      return 0;
    }
    if (paramInt == 1)
    {
      paramInt = b.a.a.a.fh(1, this.tST);
      int i = b.a.a.a.fh(2, this.uEf);
      int j = b.a.a.a.S(3, this.vbw);
      GMTrace.o(3675015610368L, 27381);
      return paramInt + 0 + i + j;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3675015610368L, 27381);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      bta localbta = (bta)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(3675015610368L, 27381);
        return -1;
      case 1: 
        localbta.tST = locala.yqV.nj();
        GMTrace.o(3675015610368L, 27381);
        return 0;
      case 2: 
        localbta.uEf = locala.yqV.nj();
        GMTrace.o(3675015610368L, 27381);
        return 0;
      }
      localbta.vbw = locala.yqV.nk();
      GMTrace.o(3675015610368L, 27381);
      return 0;
    }
    GMTrace.o(3675015610368L, 27381);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\bta.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */