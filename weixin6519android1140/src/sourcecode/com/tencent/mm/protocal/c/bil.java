package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class bil
  extends com.tencent.mm.bm.a
{
  public int uTN;
  public String uTO;
  public String uTP;
  
  public bil()
  {
    GMTrace.i(3952712089600L, 29450);
    GMTrace.o(3952712089600L, 29450);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3952846307328L, 29451);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.uTN);
      if (this.uTO != null) {
        paramVarArgs.e(2, this.uTO);
      }
      if (this.uTP != null) {
        paramVarArgs.e(3, this.uTP);
      }
      GMTrace.o(3952846307328L, 29451);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.a.fh(1, this.uTN) + 0;
      paramInt = i;
      if (this.uTO != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.uTO);
      }
      i = paramInt;
      if (this.uTP != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.uTP);
      }
      GMTrace.o(3952846307328L, 29451);
      return i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3952846307328L, 29451);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      bil localbil = (bil)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(3952846307328L, 29451);
        return -1;
      case 1: 
        localbil.uTN = locala.yqV.nj();
        GMTrace.o(3952846307328L, 29451);
        return 0;
      case 2: 
        localbil.uTO = locala.yqV.readString();
        GMTrace.o(3952846307328L, 29451);
        return 0;
      }
      localbil.uTP = locala.yqV.readString();
      GMTrace.o(3952846307328L, 29451);
      return 0;
    }
    GMTrace.o(3952846307328L, 29451);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\bil.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */