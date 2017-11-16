package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class btg
  extends com.tencent.mm.bm.a
{
  public int jhc;
  public int jib;
  
  public btg()
  {
    GMTrace.i(3689511124992L, 27489);
    GMTrace.o(3689511124992L, 27489);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3689645342720L, 27490);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.jib);
      paramVarArgs.fk(2, this.jhc);
      GMTrace.o(3689645342720L, 27490);
      return 0;
    }
    if (paramInt == 1)
    {
      paramInt = b.a.a.a.fh(1, this.jib);
      int i = b.a.a.a.fh(2, this.jhc);
      GMTrace.o(3689645342720L, 27490);
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
      GMTrace.o(3689645342720L, 27490);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      btg localbtg = (btg)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(3689645342720L, 27490);
        return -1;
      case 1: 
        localbtg.jib = locala.yqV.nj();
        GMTrace.o(3689645342720L, 27490);
        return 0;
      }
      localbtg.jhc = locala.yqV.nj();
      GMTrace.o(3689645342720L, 27490);
      return 0;
    }
    GMTrace.o(3689645342720L, 27490);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\btg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */