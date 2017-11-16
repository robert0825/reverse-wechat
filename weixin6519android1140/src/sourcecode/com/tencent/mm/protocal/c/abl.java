package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class abl
  extends ayx
{
  public int Height;
  public int Width;
  public String kBh;
  public float tYy;
  public float tYz;
  public int usd;
  public int use;
  
  public abl()
  {
    GMTrace.i(3810172862464L, 28388);
    GMTrace.o(3810172862464L, 28388);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3810307080192L, 28389);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      paramVarArgs.n(2, this.tYy);
      paramVarArgs.n(3, this.tYz);
      paramVarArgs.fk(4, this.Width);
      paramVarArgs.fk(5, this.Height);
      if (this.kBh != null) {
        paramVarArgs.e(6, this.kBh);
      }
      paramVarArgs.fk(7, this.usd);
      paramVarArgs.fk(8, this.use);
      GMTrace.o(3810307080192L, 28389);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uNh != null) {
        paramInt = b.a.a.a.fj(1, this.uNh.aYq()) + 0;
      }
      i = paramInt + (b.a.a.b.b.a.cK(2) + 4) + (b.a.a.b.b.a.cK(3) + 4) + b.a.a.a.fh(4, this.Width) + b.a.a.a.fh(5, this.Height);
      paramInt = i;
      if (this.kBh != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.kBh);
      }
      i = b.a.a.a.fh(7, this.usd);
      int j = b.a.a.a.fh(8, this.use);
      GMTrace.o(3810307080192L, 28389);
      return paramInt + i + j;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3810307080192L, 28389);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      abl localabl = (abl)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3810307080192L, 28389);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new er();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((er)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localabl.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3810307080192L, 28389);
        return 0;
      case 2: 
        localabl.tYy = ((b.a.a.a.a)localObject1).yqV.readFloat();
        GMTrace.o(3810307080192L, 28389);
        return 0;
      case 3: 
        localabl.tYz = ((b.a.a.a.a)localObject1).yqV.readFloat();
        GMTrace.o(3810307080192L, 28389);
        return 0;
      case 4: 
        localabl.Width = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3810307080192L, 28389);
        return 0;
      case 5: 
        localabl.Height = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3810307080192L, 28389);
        return 0;
      case 6: 
        localabl.kBh = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3810307080192L, 28389);
        return 0;
      case 7: 
        localabl.usd = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3810307080192L, 28389);
        return 0;
      }
      localabl.use = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(3810307080192L, 28389);
      return 0;
    }
    GMTrace.o(3810307080192L, 28389);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\abl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */