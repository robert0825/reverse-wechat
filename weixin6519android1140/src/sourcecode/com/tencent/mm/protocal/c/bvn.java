package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bvn
  extends ayx
{
  public String kBh;
  public int lPm;
  public String tSw;
  public String vdM;
  
  public bvn()
  {
    GMTrace.i(3663607103488L, 27296);
    GMTrace.o(3663607103488L, 27296);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3663741321216L, 27297);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      if (this.kBh != null) {
        paramVarArgs.e(2, this.kBh);
      }
      if (this.tSw != null) {
        paramVarArgs.e(3, this.tSw);
      }
      if (this.vdM != null) {
        paramVarArgs.e(4, this.vdM);
      }
      paramVarArgs.fk(5, this.lPm);
      GMTrace.o(3663741321216L, 27297);
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
      if (this.kBh != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.kBh);
      }
      i = paramInt;
      if (this.tSw != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.tSw);
      }
      paramInt = i;
      if (this.vdM != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.vdM);
      }
      i = b.a.a.a.fh(5, this.lPm);
      GMTrace.o(3663741321216L, 27297);
      return paramInt + i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3663741321216L, 27297);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bvn localbvn = (bvn)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3663741321216L, 27297);
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
          localbvn.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3663741321216L, 27297);
        return 0;
      case 2: 
        localbvn.kBh = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3663741321216L, 27297);
        return 0;
      case 3: 
        localbvn.tSw = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3663741321216L, 27297);
        return 0;
      case 4: 
        localbvn.vdM = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3663741321216L, 27297);
        return 0;
      }
      localbvn.lPm = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(3663741321216L, 27297);
      return 0;
    }
    GMTrace.o(3663741321216L, 27297);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\bvn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */