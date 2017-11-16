package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class abn
  extends ayx
{
  public int lQF;
  public int tOG;
  public String ugH;
  public int usf;
  public LinkedList<aoi> usg;
  public int ush;
  public LinkedList<ami> usi;
  
  public abn()
  {
    GMTrace.i(3963717943296L, 29532);
    this.usg = new LinkedList();
    this.usi = new LinkedList();
    GMTrace.o(3963717943296L, 29532);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3963852161024L, 29533);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      paramVarArgs.fk(2, this.lQF);
      if (this.ugH != null) {
        paramVarArgs.e(3, this.ugH);
      }
      paramVarArgs.fk(4, this.usf);
      paramVarArgs.d(5, 8, this.usg);
      paramVarArgs.fk(6, this.ush);
      paramVarArgs.d(7, 8, this.usi);
      paramVarArgs.fk(8, this.tOG);
      GMTrace.o(3963852161024L, 29533);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uNh != null) {
        paramInt = b.a.a.a.fj(1, this.uNh.aYq()) + 0;
      }
      i = paramInt + b.a.a.a.fh(2, this.lQF);
      paramInt = i;
      if (this.ugH != null) {
        paramInt = i + b.a.a.b.b.a.f(3, this.ugH);
      }
      i = b.a.a.a.fh(4, this.usf);
      int j = b.a.a.a.c(5, 8, this.usg);
      int k = b.a.a.a.fh(6, this.ush);
      int m = b.a.a.a.c(7, 8, this.usi);
      int n = b.a.a.a.fh(8, this.tOG);
      GMTrace.o(3963852161024L, 29533);
      return paramInt + i + j + k + m + n;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.usg.clear();
      this.usi.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3963852161024L, 29533);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      abn localabn = (abn)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3963852161024L, 29533);
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
          localabn.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3963852161024L, 29533);
        return 0;
      case 2: 
        localabn.lQF = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3963852161024L, 29533);
        return 0;
      case 3: 
        localabn.ugH = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3963852161024L, 29533);
        return 0;
      case 4: 
        localabn.usf = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3963852161024L, 29533);
        return 0;
      case 5: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new aoi();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((aoi)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localabn.usg.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3963852161024L, 29533);
        return 0;
      case 6: 
        localabn.ush = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3963852161024L, 29533);
        return 0;
      case 7: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new ami();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((ami)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localabn.usi.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3963852161024L, 29533);
        return 0;
      }
      localabn.tOG = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(3963852161024L, 29533);
      return 0;
    }
    GMTrace.o(3963852161024L, 29533);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\abn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */