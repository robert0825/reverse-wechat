package com.tencent.mm.plugin.game.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.protocal.c.azh;
import com.tencent.mm.protocal.c.es;
import java.util.LinkedList;

public final class u
  extends azh
{
  public int kBk;
  public String lQk;
  
  public u()
  {
    GMTrace.i(12646665420800L, 94225);
    GMTrace.o(12646665420800L, 94225);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(12646799638528L, 94226);
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
      if (this.lQk != null) {
        paramVarArgs.e(2, this.lQk);
      }
      paramVarArgs.fk(3, this.kBk);
      GMTrace.o(12646799638528L, 94226);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uND != null) {
        paramInt = b.a.a.a.fj(1, this.uND.aYq()) + 0;
      }
      i = paramInt;
      if (this.lQk != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.lQk);
      }
      paramInt = b.a.a.a.fh(3, this.kBk);
      GMTrace.o(12646799638528L, 94226);
      return i + paramInt;
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
      GMTrace.o(12646799638528L, 94226);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      u localu = (u)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(12646799638528L, 94226);
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
          localu.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(12646799638528L, 94226);
        return 0;
      case 2: 
        localu.lQk = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(12646799638528L, 94226);
        return 0;
      }
      localu.kBk = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(12646799638528L, 94226);
      return 0;
    }
    GMTrace.o(12646799638528L, 94226);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\game\c\u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */