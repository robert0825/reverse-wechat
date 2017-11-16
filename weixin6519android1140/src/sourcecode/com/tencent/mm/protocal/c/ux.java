package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class ux
  extends ayx
{
  public String lQJ;
  public String unf;
  public LinkedList<String> ung;
  
  public ux()
  {
    GMTrace.i(3838761238528L, 28601);
    this.ung = new LinkedList();
    GMTrace.o(3838761238528L, 28601);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3838895456256L, 28602);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      if (this.unf != null) {
        paramVarArgs.e(2, this.unf);
      }
      paramVarArgs.d(3, 1, this.ung);
      if (this.lQJ != null) {
        paramVarArgs.e(4, this.lQJ);
      }
      GMTrace.o(3838895456256L, 28602);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uNh != null) {
        paramInt = b.a.a.a.fj(1, this.uNh.aYq()) + 0;
      }
      i = paramInt;
      if (this.unf != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.unf);
      }
      i += b.a.a.a.c(3, 1, this.ung);
      paramInt = i;
      if (this.lQJ != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.lQJ);
      }
      GMTrace.o(3838895456256L, 28602);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.ung.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3838895456256L, 28602);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      ux localux = (ux)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3838895456256L, 28602);
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
          localux.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3838895456256L, 28602);
        return 0;
      case 2: 
        localux.unf = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3838895456256L, 28602);
        return 0;
      case 3: 
        localux.ung.add(((b.a.a.a.a)localObject1).yqV.readString());
        GMTrace.o(3838895456256L, 28602);
        return 0;
      }
      localux.lQJ = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(3838895456256L, 28602);
      return 0;
    }
    GMTrace.o(3838895456256L, 28602);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\ux.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */