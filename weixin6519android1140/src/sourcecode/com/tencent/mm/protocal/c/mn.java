package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class mn
  extends azh
{
  public String eTJ;
  public String eTK;
  
  public mn()
  {
    GMTrace.i(3812588781568L, 28406);
    GMTrace.o(3812588781568L, 28406);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3812722999296L, 28407);
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
      if (this.eTJ != null) {
        paramVarArgs.e(2, this.eTJ);
      }
      if (this.eTK != null) {
        paramVarArgs.e(3, this.eTK);
      }
      GMTrace.o(3812722999296L, 28407);
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
      if (this.eTJ != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.eTJ);
      }
      i = paramInt;
      if (this.eTK != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.eTK);
      }
      GMTrace.o(3812722999296L, 28407);
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
      GMTrace.o(3812722999296L, 28407);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      mn localmn = (mn)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3812722999296L, 28407);
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
          localmn.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3812722999296L, 28407);
        return 0;
      case 2: 
        localmn.eTJ = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3812722999296L, 28407);
        return 0;
      }
      localmn.eTK = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(3812722999296L, 28407);
      return 0;
    }
    GMTrace.o(3812722999296L, 28407);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\mn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */