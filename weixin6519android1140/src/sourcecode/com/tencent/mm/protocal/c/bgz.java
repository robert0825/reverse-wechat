package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bgz
  extends com.tencent.mm.bm.a
{
  public int uSP;
  public int uSQ;
  public int uSR;
  public int uSt;
  public boe uSu;
  
  public bgz()
  {
    GMTrace.i(4043980144640L, 30130);
    GMTrace.o(4043980144640L, 30130);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(4044114362368L, 30131);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uSu == null) {
        throw new b("Not all required fields were included: Addr");
      }
      if (this.uSu != null)
      {
        paramVarArgs.fm(1, this.uSu.aYq());
        this.uSu.a(paramVarArgs);
      }
      paramVarArgs.fk(2, this.uSt);
      paramVarArgs.fk(3, this.uSP);
      paramVarArgs.fk(4, this.uSQ);
      paramVarArgs.fk(5, this.uSR);
      GMTrace.o(4044114362368L, 30131);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uSu != null) {
        paramInt = b.a.a.a.fj(1, this.uSu.aYq()) + 0;
      }
      i = b.a.a.a.fh(2, this.uSt);
      int j = b.a.a.a.fh(3, this.uSP);
      int k = b.a.a.a.fh(4, this.uSQ);
      int m = b.a.a.a.fh(5, this.uSR);
      GMTrace.o(4044114362368L, 30131);
      return paramInt + i + j + k + m;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.uSu == null) {
        throw new b("Not all required fields were included: Addr");
      }
      GMTrace.o(4044114362368L, 30131);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bgz localbgz = (bgz)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(4044114362368L, 30131);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new boe();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((boe)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localbgz.uSu = ((boe)localObject1);
          paramInt += 1;
        }
        GMTrace.o(4044114362368L, 30131);
        return 0;
      case 2: 
        localbgz.uSt = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(4044114362368L, 30131);
        return 0;
      case 3: 
        localbgz.uSP = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(4044114362368L, 30131);
        return 0;
      case 4: 
        localbgz.uSQ = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(4044114362368L, 30131);
        return 0;
      }
      localbgz.uSR = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(4044114362368L, 30131);
      return 0;
    }
    GMTrace.o(4044114362368L, 30131);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\bgz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */