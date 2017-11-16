package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class blh
  extends azh
{
  public String tPP;
  public int tRC;
  public int tRD;
  public String uEE;
  
  public blh()
  {
    GMTrace.i(3677163094016L, 27397);
    GMTrace.o(3677163094016L, 27397);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3677297311744L, 27398);
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
      if (this.tPP != null) {
        paramVarArgs.e(4, this.tPP);
      }
      if (this.uEE != null) {
        paramVarArgs.e(5, this.uEE);
      }
      GMTrace.o(3677297311744L, 27398);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uND != null) {
        paramInt = b.a.a.a.fj(1, this.uND.aYq()) + 0;
      }
      i = paramInt + b.a.a.a.fh(2, this.tRD) + b.a.a.a.fh(3, this.tRC);
      paramInt = i;
      if (this.tPP != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.tPP);
      }
      i = paramInt;
      if (this.uEE != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.uEE);
      }
      GMTrace.o(3677297311744L, 27398);
      return i;
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
      GMTrace.o(3677297311744L, 27398);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      blh localblh = (blh)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3677297311744L, 27398);
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
          localblh.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3677297311744L, 27398);
        return 0;
      case 2: 
        localblh.tRD = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3677297311744L, 27398);
        return 0;
      case 3: 
        localblh.tRC = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3677297311744L, 27398);
        return 0;
      case 4: 
        localblh.tPP = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3677297311744L, 27398);
        return 0;
      }
      localblh.uEE = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(3677297311744L, 27398);
      return 0;
    }
    GMTrace.o(3677297311744L, 27398);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\blh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */