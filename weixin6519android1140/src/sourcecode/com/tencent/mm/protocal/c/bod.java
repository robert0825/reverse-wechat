package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bod
  extends azh
{
  public int uXR;
  public int uXX;
  public bpm uXY;
  public int uXZ;
  public int uYa;
  public int uYb;
  public int uYc;
  public int uhU;
  public long uhV;
  
  public bod()
  {
    GMTrace.i(3933384736768L, 29306);
    GMTrace.o(3933384736768L, 29306);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3933518954496L, 29307);
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
      paramVarArgs.fk(2, this.uhU);
      paramVarArgs.T(3, this.uhV);
      paramVarArgs.fk(4, this.uXX);
      if (this.uXY != null)
      {
        paramVarArgs.fm(5, this.uXY.aYq());
        this.uXY.a(paramVarArgs);
      }
      paramVarArgs.fk(6, this.uXR);
      paramVarArgs.fk(7, this.uXZ);
      paramVarArgs.fk(8, this.uYa);
      paramVarArgs.fk(9, this.uYb);
      paramVarArgs.fk(10, this.uYc);
      GMTrace.o(3933518954496L, 29307);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uND != null) {
        paramInt = b.a.a.a.fj(1, this.uND.aYq()) + 0;
      }
      i = paramInt + b.a.a.a.fh(2, this.uhU) + b.a.a.a.S(3, this.uhV) + b.a.a.a.fh(4, this.uXX);
      paramInt = i;
      if (this.uXY != null) {
        paramInt = i + b.a.a.a.fj(5, this.uXY.aYq());
      }
      i = b.a.a.a.fh(6, this.uXR);
      int j = b.a.a.a.fh(7, this.uXZ);
      int k = b.a.a.a.fh(8, this.uYa);
      int m = b.a.a.a.fh(9, this.uYb);
      int n = b.a.a.a.fh(10, this.uYc);
      GMTrace.o(3933518954496L, 29307);
      return paramInt + i + j + k + m + n;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = azh.a(paramVarArgs); paramInt > 0; paramInt = azh.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      GMTrace.o(3933518954496L, 29307);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bod localbod = (bod)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3933518954496L, 29307);
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
          localbod.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3933518954496L, 29307);
        return 0;
      case 2: 
        localbod.uhU = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3933518954496L, 29307);
        return 0;
      case 3: 
        localbod.uhV = ((b.a.a.a.a)localObject1).yqV.nk();
        GMTrace.o(3933518954496L, 29307);
        return 0;
      case 4: 
        localbod.uXX = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3933518954496L, 29307);
        return 0;
      case 5: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bpm();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bpm)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localbod.uXY = ((bpm)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3933518954496L, 29307);
        return 0;
      case 6: 
        localbod.uXR = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3933518954496L, 29307);
        return 0;
      case 7: 
        localbod.uXZ = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3933518954496L, 29307);
        return 0;
      case 8: 
        localbod.uYa = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3933518954496L, 29307);
        return 0;
      case 9: 
        localbod.uYb = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3933518954496L, 29307);
        return 0;
      }
      localbod.uYc = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(3933518954496L, 29307);
      return 0;
    }
    GMTrace.o(3933518954496L, 29307);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\bod.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */