package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class cm
  extends com.tencent.mm.bm.a
{
  public int tQx;
  public int tQy;
  
  public cm()
  {
    GMTrace.i(3822252457984L, 28478);
    GMTrace.o(3822252457984L, 28478);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3822386675712L, 28479);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.tQx);
      paramVarArgs.fk(2, this.tQy);
      GMTrace.o(3822386675712L, 28479);
      return 0;
    }
    if (paramInt == 1)
    {
      paramInt = b.a.a.a.fh(1, this.tQx);
      int i = b.a.a.a.fh(2, this.tQy);
      GMTrace.o(3822386675712L, 28479);
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
      GMTrace.o(3822386675712L, 28479);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      cm localcm = (cm)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(3822386675712L, 28479);
        return -1;
      case 1: 
        localcm.tQx = locala.yqV.nj();
        GMTrace.o(3822386675712L, 28479);
        return 0;
      }
      localcm.tQy = locala.yqV.nj();
      GMTrace.o(3822386675712L, 28479);
      return 0;
    }
    GMTrace.o(3822386675712L, 28479);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\cm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */