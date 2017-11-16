package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class bih
  extends com.tencent.mm.bm.a
{
  public int jib;
  public int uTL;
  public String uTM;
  
  public bih()
  {
    GMTrace.i(3654614515712L, 27229);
    GMTrace.o(3654614515712L, 27229);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3654748733440L, 27230);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(2, this.jib);
      paramVarArgs.fk(3, this.uTL);
      if (this.uTM != null) {
        paramVarArgs.e(4, this.uTM);
      }
      GMTrace.o(3654748733440L, 27230);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.a.fh(2, this.jib) + 0 + b.a.a.a.fh(3, this.uTL);
      paramInt = i;
      if (this.uTM != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.uTM);
      }
      GMTrace.o(3654748733440L, 27230);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3654748733440L, 27230);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      bih localbih = (bih)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(3654748733440L, 27230);
        return -1;
      case 2: 
        localbih.jib = locala.yqV.nj();
        GMTrace.o(3654748733440L, 27230);
        return 0;
      case 3: 
        localbih.uTL = locala.yqV.nj();
        GMTrace.o(3654748733440L, 27230);
        return 0;
      }
      localbih.uTM = locala.yqV.readString();
      GMTrace.o(3654748733440L, 27230);
      return 0;
    }
    GMTrace.o(3654748733440L, 27230);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\bih.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */