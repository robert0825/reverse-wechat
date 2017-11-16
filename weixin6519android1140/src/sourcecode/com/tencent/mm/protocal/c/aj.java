package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class aj
  extends ayx
{
  public int eTL;
  public String tNH;
  public String tNI;
  public int tNJ;
  public LinkedList<jn> tNM;
  
  public aj()
  {
    GMTrace.i(3753667198976L, 27967);
    this.tNM = new LinkedList();
    GMTrace.o(3753667198976L, 27967);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3753801416704L, 27968);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      paramVarArgs.d(2, 8, this.tNM);
      paramVarArgs.fk(3, this.eTL);
      if (this.tNH != null) {
        paramVarArgs.e(4, this.tNH);
      }
      if (this.tNI != null) {
        paramVarArgs.e(5, this.tNI);
      }
      paramVarArgs.fk(6, this.tNJ);
      GMTrace.o(3753801416704L, 27968);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uNh != null) {
        paramInt = b.a.a.a.fj(1, this.uNh.aYq()) + 0;
      }
      i = paramInt + b.a.a.a.c(2, 8, this.tNM) + b.a.a.a.fh(3, this.eTL);
      paramInt = i;
      if (this.tNH != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.tNH);
      }
      i = paramInt;
      if (this.tNI != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.tNI);
      }
      paramInt = b.a.a.a.fh(6, this.tNJ);
      GMTrace.o(3753801416704L, 27968);
      return i + paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.tNM.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3753801416704L, 27968);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      aj localaj = (aj)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3753801416704L, 27968);
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
          localaj.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3753801416704L, 27968);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new jn();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((jn)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localaj.tNM.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3753801416704L, 27968);
        return 0;
      case 3: 
        localaj.eTL = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3753801416704L, 27968);
        return 0;
      case 4: 
        localaj.tNH = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3753801416704L, 27968);
        return 0;
      case 5: 
        localaj.tNI = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3753801416704L, 27968);
        return 0;
      }
      localaj.tNJ = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(3753801416704L, 27968);
      return 0;
    }
    GMTrace.o(3753801416704L, 27968);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\aj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */