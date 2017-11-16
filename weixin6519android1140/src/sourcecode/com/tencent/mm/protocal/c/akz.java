package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class akz
  extends com.tencent.mm.bm.a
{
  public int uAb;
  public String uAc;
  public int und;
  
  public akz()
  {
    GMTrace.i(15661061373952L, 116684);
    GMTrace.o(15661061373952L, 116684);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15661195591680L, 116685);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.uAb);
      if (this.uAc != null) {
        paramVarArgs.e(2, this.uAc);
      }
      paramVarArgs.fk(3, this.und);
      GMTrace.o(15661195591680L, 116685);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.a.fh(1, this.uAb) + 0;
      paramInt = i;
      if (this.uAc != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.uAc);
      }
      i = b.a.a.a.fh(3, this.und);
      GMTrace.o(15661195591680L, 116685);
      return paramInt + i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(15661195591680L, 116685);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      akz localakz = (akz)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(15661195591680L, 116685);
        return -1;
      case 1: 
        localakz.uAb = locala.yqV.nj();
        GMTrace.o(15661195591680L, 116685);
        return 0;
      case 2: 
        localakz.uAc = locala.yqV.readString();
        GMTrace.o(15661195591680L, 116685);
        return 0;
      }
      localakz.und = locala.yqV.nj();
      GMTrace.o(15661195591680L, 116685);
      return 0;
    }
    GMTrace.o(15661195591680L, 116685);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\akz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */