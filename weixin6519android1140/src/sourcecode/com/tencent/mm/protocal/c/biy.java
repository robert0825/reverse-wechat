package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class biy
  extends azh
{
  public int tRC;
  public int tRD;
  public int uJl;
  public int uTX;
  public LinkedList<azq> uTY;
  public int upl;
  public int upm;
  
  public biy()
  {
    GMTrace.i(4032705855488L, 30046);
    this.uTY = new LinkedList();
    GMTrace.o(4032705855488L, 30046);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(4032840073216L, 30047);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.uND != null)
      {
        paramVarArgs.fm(1, this.uND.aYq());
        this.uND.a(paramVarArgs);
      }
      paramVarArgs.fk(2, this.tRD);
      paramVarArgs.fk(3, this.tRC);
      paramVarArgs.fk(4, this.upl);
      paramVarArgs.fk(5, this.upm);
      paramVarArgs.fk(6, this.uTX);
      paramVarArgs.d(7, 8, this.uTY);
      paramVarArgs.fk(8, this.uJl);
      GMTrace.o(4032840073216L, 30047);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uND != null) {
        paramInt = b.a.a.a.fj(1, this.uND.aYq()) + 0;
      }
      i = b.a.a.a.fh(2, this.tRD);
      int j = b.a.a.a.fh(3, this.tRC);
      int k = b.a.a.a.fh(4, this.upl);
      int m = b.a.a.a.fh(5, this.upm);
      int n = b.a.a.a.fh(6, this.uTX);
      int i1 = b.a.a.a.c(7, 8, this.uTY);
      int i2 = b.a.a.a.fh(8, this.uJl);
      GMTrace.o(4032840073216L, 30047);
      return paramInt + i + j + k + m + n + i1 + i2;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.uTY.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = azh.a(paramVarArgs); paramInt > 0; paramInt = azh.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      GMTrace.o(4032840073216L, 30047);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      biy localbiy = (biy)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(4032840073216L, 30047);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new es();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((es)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localbiy.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(4032840073216L, 30047);
        return 0;
      case 2: 
        localbiy.tRD = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(4032840073216L, 30047);
        return 0;
      case 3: 
        localbiy.tRC = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(4032840073216L, 30047);
        return 0;
      case 4: 
        localbiy.upl = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(4032840073216L, 30047);
        return 0;
      case 5: 
        localbiy.upm = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(4032840073216L, 30047);
        return 0;
      case 6: 
        localbiy.uTX = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(4032840073216L, 30047);
        return 0;
      case 7: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azq();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azq)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localbiy.uTY.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(4032840073216L, 30047);
        return 0;
      }
      localbiy.uJl = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(4032840073216L, 30047);
      return 0;
    }
    GMTrace.o(4032840073216L, 30047);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\biy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */