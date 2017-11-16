package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bj
  extends ayx
{
  public int jNj;
  public LinkedList<any> tPE;
  public azq tPF;
  public int tPG;
  public String tPH;
  
  public bj()
  {
    GMTrace.i(3620925865984L, 26978);
    this.tPE = new LinkedList();
    GMTrace.o(3620925865984L, 26978);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3621060083712L, 26979);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.tPF == null) {
        throw new b("Not all required fields were included: ChatRoomName");
      }
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      paramVarArgs.fk(2, this.jNj);
      paramVarArgs.d(3, 8, this.tPE);
      if (this.tPF != null)
      {
        paramVarArgs.fm(4, this.tPF.aYq());
        this.tPF.a(paramVarArgs);
      }
      paramVarArgs.fk(5, this.tPG);
      if (this.tPH != null) {
        paramVarArgs.e(6, this.tPH);
      }
      GMTrace.o(3621060083712L, 26979);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uNh != null) {
        paramInt = b.a.a.a.fj(1, this.uNh.aYq()) + 0;
      }
      i = paramInt + b.a.a.a.fh(2, this.jNj) + b.a.a.a.c(3, 8, this.tPE);
      paramInt = i;
      if (this.tPF != null) {
        paramInt = i + b.a.a.a.fj(4, this.tPF.aYq());
      }
      i = paramInt + b.a.a.a.fh(5, this.tPG);
      paramInt = i;
      if (this.tPH != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.tPH);
      }
      GMTrace.o(3621060083712L, 26979);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.tPE.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.tPF == null) {
        throw new b("Not all required fields were included: ChatRoomName");
      }
      GMTrace.o(3621060083712L, 26979);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bj localbj = (bj)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3621060083712L, 26979);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new er();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((er)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localbj.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3621060083712L, 26979);
        return 0;
      case 2: 
        localbj.jNj = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3621060083712L, 26979);
        return 0;
      case 3: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new any();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((any)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localbj.tPE.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3621060083712L, 26979);
        return 0;
      case 4: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azq();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azq)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localbj.tPF = ((azq)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3621060083712L, 26979);
        return 0;
      case 5: 
        localbj.tPG = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3621060083712L, 26979);
        return 0;
      }
      localbj.tPH = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(3621060083712L, 26979);
      return 0;
    }
    GMTrace.o(3621060083712L, 26979);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\bj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */