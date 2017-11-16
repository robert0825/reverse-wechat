package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class xd
  extends azh
{
  public int result;
  public aie uoU;
  public String uoV;
  public ahz uoW;
  
  public xd()
  {
    GMTrace.i(3886676967424L, 28958);
    GMTrace.o(3886676967424L, 28958);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3886811185152L, 28959);
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
      if (this.uoU != null)
      {
        paramVarArgs.fm(2, this.uoU.aYq());
        this.uoU.a(paramVarArgs);
      }
      if (this.uoV != null) {
        paramVarArgs.e(3, this.uoV);
      }
      if (this.uoW != null)
      {
        paramVarArgs.fm(4, this.uoW.aYq());
        this.uoW.a(paramVarArgs);
      }
      paramVarArgs.fk(5, this.result);
      GMTrace.o(3886811185152L, 28959);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = 0;
      if (this.uND != null) {
        i = b.a.a.a.fj(1, this.uND.aYq()) + 0;
      }
      paramInt = i;
      if (this.uoU != null) {
        paramInt = i + b.a.a.a.fj(2, this.uoU.aYq());
      }
      i = paramInt;
      if (this.uoV != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.uoV);
      }
      paramInt = i;
      if (this.uoW != null) {
        paramInt = i + b.a.a.a.fj(4, this.uoW.aYq());
      }
      i = b.a.a.a.fh(5, this.result);
      GMTrace.o(3886811185152L, 28959);
      return paramInt + i;
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
      GMTrace.o(3886811185152L, 28959);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      xd localxd = (xd)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3886811185152L, 28959);
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
          localxd.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3886811185152L, 28959);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new aie();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((aie)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localxd.uoU = ((aie)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3886811185152L, 28959);
        return 0;
      case 3: 
        localxd.uoV = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3886811185152L, 28959);
        return 0;
      case 4: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new ahz();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((ahz)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localxd.uoW = ((ahz)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3886811185152L, 28959);
        return 0;
      }
      localxd.result = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(3886811185152L, 28959);
      return 0;
    }
    GMTrace.o(3886811185152L, 28959);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\xd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */