package com.tencent.mm.protocal.a.a;

import com.tencent.gmtrace.GMTrace;

public final class a
  extends com.tencent.mm.bm.a
{
  public int count;
  public int tLd;
  public int value;
  
  public a()
  {
    GMTrace.i(13100321341440L, 97605);
    GMTrace.o(13100321341440L, 97605);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(13100455559168L, 97606);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.tLd);
      paramVarArgs.fk(2, this.value);
      paramVarArgs.fk(3, this.count);
      GMTrace.o(13100455559168L, 97606);
      return 0;
    }
    if (paramInt == 1)
    {
      paramInt = b.a.a.a.fh(1, this.tLd);
      int i = b.a.a.a.fh(2, this.value);
      int j = b.a.a.a.fh(3, this.count);
      GMTrace.o(13100455559168L, 97606);
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
      GMTrace.o(13100455559168L, 97606);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      a locala1 = (a)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(13100455559168L, 97606);
        return -1;
      case 1: 
        locala1.tLd = locala.yqV.nj();
        GMTrace.o(13100455559168L, 97606);
        return 0;
      case 2: 
        locala1.value = locala.yqV.nj();
        GMTrace.o(13100455559168L, 97606);
        return 0;
      }
      locala1.count = locala.yqV.nj();
      GMTrace.o(13100455559168L, 97606);
      return 0;
    }
    GMTrace.o(13100455559168L, 97606);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\a\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */