package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class aea
  extends azh
{
  public int jib;
  public String tWx;
  public String utR;
  
  public aea()
  {
    GMTrace.i(3677431529472L, 27399);
    GMTrace.o(3677431529472L, 27399);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3677565747200L, 27400);
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
      paramVarArgs.fk(2, this.jib);
      if (this.tWx != null) {
        paramVarArgs.e(3, this.tWx);
      }
      if (this.utR != null) {
        paramVarArgs.e(4, this.utR);
      }
      GMTrace.o(3677565747200L, 27400);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uND != null) {
        paramInt = b.a.a.a.fj(1, this.uND.aYq()) + 0;
      }
      i = paramInt + b.a.a.a.fh(2, this.jib);
      paramInt = i;
      if (this.tWx != null) {
        paramInt = i + b.a.a.b.b.a.f(3, this.tWx);
      }
      i = paramInt;
      if (this.utR != null) {
        i = paramInt + b.a.a.b.b.a.f(4, this.utR);
      }
      GMTrace.o(3677565747200L, 27400);
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
      GMTrace.o(3677565747200L, 27400);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      aea localaea = (aea)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3677565747200L, 27400);
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
          localaea.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3677565747200L, 27400);
        return 0;
      case 2: 
        localaea.jib = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3677565747200L, 27400);
        return 0;
      case 3: 
        localaea.tWx = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3677565747200L, 27400);
        return 0;
      }
      localaea.utR = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(3677565747200L, 27400);
      return 0;
    }
    GMTrace.o(3677565747200L, 27400);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\aea.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */