package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;

public final class qq
  extends com.tencent.mm.bm.a
{
  public int ugF;
  public String ugG;
  
  public qq()
  {
    GMTrace.i(3857820155904L, 28743);
    GMTrace.o(3857820155904L, 28743);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3857954373632L, 28744);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.ugG == null) {
        throw new b("Not all required fields were included: TagDesc");
      }
      paramVarArgs.fk(1, this.ugF);
      if (this.ugG != null) {
        paramVarArgs.e(2, this.ugG);
      }
      GMTrace.o(3857954373632L, 28744);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.a.fh(1, this.ugF) + 0;
      paramInt = i;
      if (this.ugG != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.ugG);
      }
      GMTrace.o(3857954373632L, 28744);
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
      if (this.ugG == null) {
        throw new b("Not all required fields were included: TagDesc");
      }
      GMTrace.o(3857954373632L, 28744);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      qq localqq = (qq)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(3857954373632L, 28744);
        return -1;
      case 1: 
        localqq.ugF = locala.yqV.nj();
        GMTrace.o(3857954373632L, 28744);
        return 0;
      }
      localqq.ugG = locala.yqV.readString();
      GMTrace.o(3857954373632L, 28744);
      return 0;
    }
    GMTrace.o(3857954373632L, 28744);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\qq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */