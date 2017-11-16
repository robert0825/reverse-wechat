package com.tencent.mm.plugin.game.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.protocal.c.azh;
import com.tencent.mm.protocal.c.es;
import java.util.LinkedList;

public final class ak
  extends azh
{
  public boolean lQL;
  public z lQM;
  public String lQN;
  public d lQO;
  public v lQP;
  public e lQQ;
  public ce lQR;
  
  public ak()
  {
    GMTrace.i(16561796546560L, 123395);
    GMTrace.o(16561796546560L, 123395);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(16561930764288L, 123396);
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
      paramVarArgs.ah(2, this.lQL);
      if (this.lQM != null)
      {
        paramVarArgs.fm(3, this.lQM.aYq());
        this.lQM.a(paramVarArgs);
      }
      if (this.lQN != null) {
        paramVarArgs.e(4, this.lQN);
      }
      if (this.lQO != null)
      {
        paramVarArgs.fm(5, this.lQO.aYq());
        this.lQO.a(paramVarArgs);
      }
      if (this.lQP != null)
      {
        paramVarArgs.fm(6, this.lQP.aYq());
        this.lQP.a(paramVarArgs);
      }
      if (this.lQQ != null)
      {
        paramVarArgs.fm(7, this.lQQ.aYq());
        this.lQQ.a(paramVarArgs);
      }
      if (this.lQR != null)
      {
        paramVarArgs.fm(8, this.lQR.aYq());
        this.lQR.a(paramVarArgs);
      }
      GMTrace.o(16561930764288L, 123396);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uND != null) {
        paramInt = b.a.a.a.fj(1, this.uND.aYq()) + 0;
      }
      i = paramInt + (b.a.a.b.b.a.cK(2) + 1);
      paramInt = i;
      if (this.lQM != null) {
        paramInt = i + b.a.a.a.fj(3, this.lQM.aYq());
      }
      i = paramInt;
      if (this.lQN != null) {
        i = paramInt + b.a.a.b.b.a.f(4, this.lQN);
      }
      paramInt = i;
      if (this.lQO != null) {
        paramInt = i + b.a.a.a.fj(5, this.lQO.aYq());
      }
      i = paramInt;
      if (this.lQP != null) {
        i = paramInt + b.a.a.a.fj(6, this.lQP.aYq());
      }
      paramInt = i;
      if (this.lQQ != null) {
        paramInt = i + b.a.a.a.fj(7, this.lQQ.aYq());
      }
      i = paramInt;
      if (this.lQR != null) {
        i = paramInt + b.a.a.a.fj(8, this.lQR.aYq());
      }
      GMTrace.o(16561930764288L, 123396);
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
      GMTrace.o(16561930764288L, 123396);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      ak localak = (ak)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(16561930764288L, 123396);
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
          localak.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(16561930764288L, 123396);
        return 0;
      case 2: 
        localak.lQL = ((b.a.a.a.a)localObject1).csU();
        GMTrace.o(16561930764288L, 123396);
        return 0;
      case 3: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new z();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((z)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localak.lQM = ((z)localObject1);
          paramInt += 1;
        }
        GMTrace.o(16561930764288L, 123396);
        return 0;
      case 4: 
        localak.lQN = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(16561930764288L, 123396);
        return 0;
      case 5: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new d();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((d)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localak.lQO = ((d)localObject1);
          paramInt += 1;
        }
        GMTrace.o(16561930764288L, 123396);
        return 0;
      case 6: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new v();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((v)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localak.lQP = ((v)localObject1);
          paramInt += 1;
        }
        GMTrace.o(16561930764288L, 123396);
        return 0;
      case 7: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new e();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((e)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localak.lQQ = ((e)localObject1);
          paramInt += 1;
        }
        GMTrace.o(16561930764288L, 123396);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new ce();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((ce)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
        localak.lQR = ((ce)localObject1);
        paramInt += 1;
      }
      GMTrace.o(16561930764288L, 123396);
      return 0;
    }
    GMTrace.o(16561930764288L, 123396);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\c\ak.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */