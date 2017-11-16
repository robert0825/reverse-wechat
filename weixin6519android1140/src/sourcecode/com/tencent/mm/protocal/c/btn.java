package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class btn
  extends azh
{
  public String tWC;
  public int tWu;
  public int uPv;
  public int vbd;
  
  public btn()
  {
    GMTrace.i(3667902070784L, 27328);
    GMTrace.o(3667902070784L, 27328);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3668036288512L, 27329);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.tWC == null) {
        throw new b("Not all required fields were included: Json");
      }
      if (this.uND != null)
      {
        paramVarArgs.fm(1, this.uND.aYq());
        this.uND.a(paramVarArgs);
      }
      paramVarArgs.fk(2, this.vbd);
      paramVarArgs.fk(3, this.tWu);
      if (this.tWC != null) {
        paramVarArgs.e(4, this.tWC);
      }
      paramVarArgs.fk(5, this.uPv);
      GMTrace.o(3668036288512L, 27329);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uND != null) {
        paramInt = b.a.a.a.fj(1, this.uND.aYq()) + 0;
      }
      i = paramInt + b.a.a.a.fh(2, this.vbd) + b.a.a.a.fh(3, this.tWu);
      paramInt = i;
      if (this.tWC != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.tWC);
      }
      i = b.a.a.a.fh(5, this.uPv);
      GMTrace.o(3668036288512L, 27329);
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
      if (this.tWC == null) {
        throw new b("Not all required fields were included: Json");
      }
      GMTrace.o(3668036288512L, 27329);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      btn localbtn = (btn)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3668036288512L, 27329);
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
          localbtn.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3668036288512L, 27329);
        return 0;
      case 2: 
        localbtn.vbd = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3668036288512L, 27329);
        return 0;
      case 3: 
        localbtn.tWu = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3668036288512L, 27329);
        return 0;
      case 4: 
        localbtn.tWC = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3668036288512L, 27329);
        return 0;
      }
      localbtn.uPv = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(3668036288512L, 27329);
      return 0;
    }
    GMTrace.o(3668036288512L, 27329);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\btn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */