package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bmj
  extends azh
{
  public int tPV;
  public String tQN;
  public long tQd;
  public String tYF;
  public int uCA;
  public int uWg;
  
  public bmj()
  {
    GMTrace.i(3680115884032L, 27419);
    GMTrace.o(3680115884032L, 27419);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3680250101760L, 27420);
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
      if (this.tQN != null) {
        paramVarArgs.e(2, this.tQN);
      }
      paramVarArgs.fk(3, this.tPV);
      paramVarArgs.fk(4, this.uCA);
      paramVarArgs.fk(5, this.uWg);
      paramVarArgs.T(6, this.tQd);
      if (this.tYF != null) {
        paramVarArgs.e(7, this.tYF);
      }
      GMTrace.o(3680250101760L, 27420);
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
      if (this.tQN != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.tQN);
      }
      i = i + b.a.a.a.fh(3, this.tPV) + b.a.a.a.fh(4, this.uCA) + b.a.a.a.fh(5, this.uWg) + b.a.a.a.S(6, this.tQd);
      paramInt = i;
      if (this.tYF != null) {
        paramInt = i + b.a.a.b.b.a.f(7, this.tYF);
      }
      GMTrace.o(3680250101760L, 27420);
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
      GMTrace.o(3680250101760L, 27420);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bmj localbmj = (bmj)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3680250101760L, 27420);
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
          localbmj.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3680250101760L, 27420);
        return 0;
      case 2: 
        localbmj.tQN = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3680250101760L, 27420);
        return 0;
      case 3: 
        localbmj.tPV = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3680250101760L, 27420);
        return 0;
      case 4: 
        localbmj.uCA = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3680250101760L, 27420);
        return 0;
      case 5: 
        localbmj.uWg = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3680250101760L, 27420);
        return 0;
      case 6: 
        localbmj.tQd = ((b.a.a.a.a)localObject1).yqV.nk();
        GMTrace.o(3680250101760L, 27420);
        return 0;
      }
      localbmj.tYF = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(3680250101760L, 27420);
      return 0;
    }
    GMTrace.o(3680250101760L, 27420);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\bmj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */