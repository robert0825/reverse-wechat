package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class bot
  extends com.tencent.mm.bm.a
{
  public int jib;
  public String uYN;
  
  public bot()
  {
    GMTrace.i(3813125652480L, 28410);
    GMTrace.o(3813125652480L, 28410);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3813259870208L, 28411);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.jib);
      if (this.uYN != null) {
        paramVarArgs.e(2, this.uYN);
      }
      GMTrace.o(3813259870208L, 28411);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.a.fh(1, this.jib) + 0;
      paramInt = i;
      if (this.uYN != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.uYN);
      }
      GMTrace.o(3813259870208L, 28411);
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
      GMTrace.o(3813259870208L, 28411);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      bot localbot = (bot)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(3813259870208L, 28411);
        return -1;
      case 1: 
        localbot.jib = locala.yqV.nj();
        GMTrace.o(3813259870208L, 28411);
        return 0;
      }
      localbot.uYN = locala.yqV.readString();
      GMTrace.o(3813259870208L, 28411);
      return 0;
    }
    GMTrace.o(3813259870208L, 28411);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\bot.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */