package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bic
  extends azh
{
  public boolean uTH;
  public boolean uTI;
  
  public bic()
  {
    GMTrace.i(3972039442432L, 29594);
    GMTrace.o(3972039442432L, 29594);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3972173660160L, 29595);
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
      paramVarArgs.ah(2, this.uTH);
      paramVarArgs.ah(3, this.uTI);
      GMTrace.o(3972173660160L, 29595);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uND != null) {
        paramInt = b.a.a.a.fj(1, this.uND.aYq()) + 0;
      }
      i = b.a.a.b.b.a.cK(2);
      int j = b.a.a.b.b.a.cK(3);
      GMTrace.o(3972173660160L, 29595);
      return paramInt + (i + 1) + (j + 1);
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
      GMTrace.o(3972173660160L, 29595);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bic localbic = (bic)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3972173660160L, 29595);
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
          localbic.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3972173660160L, 29595);
        return 0;
      case 2: 
        localbic.uTH = ((b.a.a.a.a)localObject1).csU();
        GMTrace.o(3972173660160L, 29595);
        return 0;
      }
      localbic.uTI = ((b.a.a.a.a)localObject1).csU();
      GMTrace.o(3972173660160L, 29595);
      return 0;
    }
    GMTrace.o(3972173660160L, 29595);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\bic.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */