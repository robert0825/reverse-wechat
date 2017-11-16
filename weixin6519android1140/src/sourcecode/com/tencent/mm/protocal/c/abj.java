package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class abj
  extends ayx
{
  public int tOG;
  public int tSK;
  public alk ufs;
  public String unf;
  public azp urP;
  public int urQ;
  public int urR;
  public LinkedList<atr> urS;
  public int urT;
  
  public abj()
  {
    GMTrace.i(3800777621504L, 28318);
    this.urS = new LinkedList();
    GMTrace.o(3800777621504L, 28318);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3800911839232L, 28319);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.ufs == null) {
        throw new b("Not all required fields were included: Loc");
      }
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      paramVarArgs.fk(2, this.tSK);
      paramVarArgs.fk(3, this.tOG);
      if (this.urP != null)
      {
        paramVarArgs.fm(4, this.urP.aYq());
        this.urP.a(paramVarArgs);
      }
      if (this.ufs != null)
      {
        paramVarArgs.fm(5, this.ufs.aYq());
        this.ufs.a(paramVarArgs);
      }
      if (this.unf != null) {
        paramVarArgs.e(6, this.unf);
      }
      paramVarArgs.fk(7, this.urQ);
      paramVarArgs.fk(8, this.urR);
      paramVarArgs.d(11, 8, this.urS);
      paramVarArgs.fk(12, this.urT);
      GMTrace.o(3800911839232L, 28319);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uNh != null) {
        paramInt = b.a.a.a.fj(1, this.uNh.aYq()) + 0;
      }
      i = paramInt + b.a.a.a.fh(2, this.tSK) + b.a.a.a.fh(3, this.tOG);
      paramInt = i;
      if (this.urP != null) {
        paramInt = i + b.a.a.a.fj(4, this.urP.aYq());
      }
      i = paramInt;
      if (this.ufs != null) {
        i = paramInt + b.a.a.a.fj(5, this.ufs.aYq());
      }
      paramInt = i;
      if (this.unf != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.unf);
      }
      i = b.a.a.a.fh(7, this.urQ);
      int j = b.a.a.a.fh(8, this.urR);
      int k = b.a.a.a.c(11, 8, this.urS);
      int m = b.a.a.a.fh(12, this.urT);
      GMTrace.o(3800911839232L, 28319);
      return paramInt + i + j + k + m;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.urS.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.ufs == null) {
        throw new b("Not all required fields were included: Loc");
      }
      GMTrace.o(3800911839232L, 28319);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      abj localabj = (abj)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      case 9: 
      case 10: 
      default: 
        GMTrace.o(3800911839232L, 28319);
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
          localabj.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3800911839232L, 28319);
        return 0;
      case 2: 
        localabj.tSK = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3800911839232L, 28319);
        return 0;
      case 3: 
        localabj.tOG = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3800911839232L, 28319);
        return 0;
      case 4: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azp();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localabj.urP = ((azp)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3800911839232L, 28319);
        return 0;
      case 5: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new alk();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((alk)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localabj.ufs = ((alk)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3800911839232L, 28319);
        return 0;
      case 6: 
        localabj.unf = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3800911839232L, 28319);
        return 0;
      case 7: 
        localabj.urQ = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3800911839232L, 28319);
        return 0;
      case 8: 
        localabj.urR = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3800911839232L, 28319);
        return 0;
      case 11: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new atr();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((atr)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localabj.urS.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3800911839232L, 28319);
        return 0;
      }
      localabj.urT = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(3800911839232L, 28319);
      return 0;
    }
    GMTrace.o(3800911839232L, 28319);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\abj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */