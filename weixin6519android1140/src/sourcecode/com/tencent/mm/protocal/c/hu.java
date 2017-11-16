package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class hu
  extends ayx
{
  public int tMZ;
  public String tNa;
  public String tVK;
  public amd tWO;
  public azx tWP;
  
  public hu()
  {
    GMTrace.i(3756619988992L, 27989);
    GMTrace.o(3756619988992L, 27989);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3756754206720L, 27990);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      if (this.tVK != null) {
        paramVarArgs.e(2, this.tVK);
      }
      if (this.tWO != null)
      {
        paramVarArgs.fm(3, this.tWO.aYq());
        this.tWO.a(paramVarArgs);
      }
      if (this.tWP != null)
      {
        paramVarArgs.fm(4, this.tWP.aYq());
        this.tWP.a(paramVarArgs);
      }
      paramVarArgs.fk(5, this.tMZ);
      if (this.tNa != null) {
        paramVarArgs.e(6, this.tNa);
      }
      GMTrace.o(3756754206720L, 27990);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = 0;
      if (this.uNh != null) {
        i = b.a.a.a.fj(1, this.uNh.aYq()) + 0;
      }
      paramInt = i;
      if (this.tVK != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.tVK);
      }
      i = paramInt;
      if (this.tWO != null) {
        i = paramInt + b.a.a.a.fj(3, this.tWO.aYq());
      }
      paramInt = i;
      if (this.tWP != null) {
        paramInt = i + b.a.a.a.fj(4, this.tWP.aYq());
      }
      i = paramInt + b.a.a.a.fh(5, this.tMZ);
      paramInt = i;
      if (this.tNa != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.tNa);
      }
      GMTrace.o(3756754206720L, 27990);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3756754206720L, 27990);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      hu localhu = (hu)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3756754206720L, 27990);
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
          localhu.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3756754206720L, 27990);
        return 0;
      case 2: 
        localhu.tVK = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3756754206720L, 27990);
        return 0;
      case 3: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new amd();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((amd)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localhu.tWO = ((amd)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3756754206720L, 27990);
        return 0;
      case 4: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azx();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azx)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localhu.tWP = ((azx)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3756754206720L, 27990);
        return 0;
      case 5: 
        localhu.tMZ = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3756754206720L, 27990);
        return 0;
      }
      localhu.tNa = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(3756754206720L, 27990);
      return 0;
    }
    GMTrace.o(3756754206720L, 27990);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\hu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */