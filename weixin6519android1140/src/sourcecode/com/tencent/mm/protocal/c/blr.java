package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class blr
  extends azh
{
  public int tRC;
  public int tRD;
  public String uVC;
  public String ubV;
  public String ubW;
  
  public blr()
  {
    GMTrace.i(4047469805568L, 30156);
    GMTrace.o(4047469805568L, 30156);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(4047604023296L, 30157);
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
      paramVarArgs.fk(2, this.tRC);
      paramVarArgs.fk(3, this.tRD);
      if (this.uVC != null) {
        paramVarArgs.e(4, this.uVC);
      }
      if (this.ubV != null) {
        paramVarArgs.e(5, this.ubV);
      }
      if (this.ubW != null) {
        paramVarArgs.e(6, this.ubW);
      }
      GMTrace.o(4047604023296L, 30157);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uND != null) {
        paramInt = b.a.a.a.fj(1, this.uND.aYq()) + 0;
      }
      i = paramInt + b.a.a.a.fh(2, this.tRC) + b.a.a.a.fh(3, this.tRD);
      paramInt = i;
      if (this.uVC != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.uVC);
      }
      i = paramInt;
      if (this.ubV != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.ubV);
      }
      paramInt = i;
      if (this.ubW != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.ubW);
      }
      GMTrace.o(4047604023296L, 30157);
      return paramInt;
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
      GMTrace.o(4047604023296L, 30157);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      blr localblr = (blr)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(4047604023296L, 30157);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new es();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((es)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localblr.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(4047604023296L, 30157);
        return 0;
      case 2: 
        localblr.tRC = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(4047604023296L, 30157);
        return 0;
      case 3: 
        localblr.tRD = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(4047604023296L, 30157);
        return 0;
      case 4: 
        localblr.uVC = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(4047604023296L, 30157);
        return 0;
      case 5: 
        localblr.ubV = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(4047604023296L, 30157);
        return 0;
      }
      localblr.ubW = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(4047604023296L, 30157);
      return 0;
    }
    GMTrace.o(4047604023296L, 30157);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\blr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */