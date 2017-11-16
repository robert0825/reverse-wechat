package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class va
  extends ayx
{
  public String gCG;
  public String lQJ;
  public LinkedList<String> ung;
  public LinkedList<String> unn;
  public int uno;
  
  public va()
  {
    GMTrace.i(3683068674048L, 27441);
    this.unn = new LinkedList();
    this.ung = new LinkedList();
    GMTrace.o(3683068674048L, 27441);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3683202891776L, 27442);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      paramVarArgs.d(2, 1, this.unn);
      paramVarArgs.d(3, 1, this.ung);
      if (this.lQJ != null) {
        paramVarArgs.e(4, this.lQJ);
      }
      if (this.gCG != null) {
        paramVarArgs.e(5, this.gCG);
      }
      paramVarArgs.fk(6, this.uno);
      GMTrace.o(3683202891776L, 27442);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uNh != null) {
        paramInt = b.a.a.a.fj(1, this.uNh.aYq()) + 0;
      }
      i = paramInt + b.a.a.a.c(2, 1, this.unn) + b.a.a.a.c(3, 1, this.ung);
      paramInt = i;
      if (this.lQJ != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.lQJ);
      }
      i = paramInt;
      if (this.gCG != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.gCG);
      }
      paramInt = b.a.a.a.fh(6, this.uno);
      GMTrace.o(3683202891776L, 27442);
      return i + paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.unn.clear();
      this.ung.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3683202891776L, 27442);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      va localva = (va)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3683202891776L, 27442);
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
          localva.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3683202891776L, 27442);
        return 0;
      case 2: 
        localva.unn.add(((b.a.a.a.a)localObject1).yqV.readString());
        GMTrace.o(3683202891776L, 27442);
        return 0;
      case 3: 
        localva.ung.add(((b.a.a.a.a)localObject1).yqV.readString());
        GMTrace.o(3683202891776L, 27442);
        return 0;
      case 4: 
        localva.lQJ = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3683202891776L, 27442);
        return 0;
      case 5: 
        localva.gCG = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3683202891776L, 27442);
        return 0;
      }
      localva.uno = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(3683202891776L, 27442);
      return 0;
    }
    GMTrace.o(3683202891776L, 27442);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\va.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */